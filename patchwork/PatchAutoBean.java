import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Patch duy nhat call p.H() trong p.c() (nhanh auto train):
 *
 *     if (!AutoBeanMod.isEnabled()) {
 *         H();
 *     }
 *
 * Khi buffdau dang bat, AutoBeanMod quyet dinh nguong HP tuyet doi va kich hoat p.H()
 * qua phim 10. Khi buffdau tat, hanh vi auto dau 20% goc duoc giu nguyen.
 */
public final class PatchAutoBean {
    private PatchAutoBean() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchAutoBean <input p.class> <output p.class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if (!"p".equals(classNode.name)) {
            throw new IllegalArgumentException("Input class is not p.class");
        }

        int patchedCalls = 0;
        for (MethodNode method : classNode.methods) {
            if (!"c".equals(method.name) || !"()V".equals(method.desc)) {
                continue;
            }

            for (AbstractInsnNode instruction = method.instructions.getFirst();
                    instruction != null;
                    instruction = instruction.getNext()) {
                if (!(instruction instanceof MethodInsnNode)) {
                    continue;
                }

                MethodInsnNode call = (MethodInsnNode)instruction;
                if (call.getOpcode() != Opcodes.INVOKESPECIAL
                        || !"p".equals(call.owner)
                        || !"H".equals(call.name)
                        || !"()V".equals(call.desc)) {
                    continue;
                }

                AbstractInsnNode receiver = previousCodeInstruction(call);
                if (!(receiver instanceof VarInsnNode)
                        || receiver.getOpcode() != Opcodes.ALOAD
                        || ((VarInsnNode)receiver).var != 1) {
                    throw new IllegalStateException(
                            "Unexpected bytecode before p.H() in p.c()");
                }

                LabelNode skipOriginalAutoBean = new LabelNode();
                InsnList guard = new InsnList();
                guard.add(new MethodInsnNode(
                        Opcodes.INVOKESTATIC,
                        "AutoBeanMod",
                        "isEnabled",
                        "()Z",
                        false));
                guard.add(new JumpInsnNode(
                        Opcodes.IFNE,
                        skipOriginalAutoBean));

                method.instructions.insertBefore(receiver, guard);
                method.instructions.insert(call, skipOriginalAutoBean);
                ++patchedCalls;
            }
        }

        if (patchedCalls != 1) {
            throw new IllegalStateException(
                    "Expected exactly one p.H() call in p.c(), found " + patchedCalls);
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.write(output, writer.toByteArray());
        System.out.println("Patched auto bean guard: " + output);
    }

    private static AbstractInsnNode previousCodeInstruction(
            AbstractInsnNode instruction) {
        AbstractInsnNode previous = instruction.getPrevious();
        while (previous != null
                && (previous.getType() == AbstractInsnNode.LABEL
                || previous.getType() == AbstractInsnNode.LINE
                || previous.getType() == AbstractInsnNode.FRAME)) {
            previous = previous.getPrevious();
        }
        return previous;
    }
}
