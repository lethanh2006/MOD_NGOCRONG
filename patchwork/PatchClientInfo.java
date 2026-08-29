import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Repairs the client-info resource payload on both the primary and secondary
 * sessions.
 *
 * <p>The official 2.5.0 bytecode passes {@code null} to
 * {@code InputStream.read(byte[])} and then evaluates {@code null.length}.
 * The primary copy is in {@code bt.c()}, while a duplicate used by the
 * secondary data session is in {@code ac.a(boolean)}. Both copies must be
 * patched or resource downloads can still lose their socket.</p>
 */
public final class PatchClientInfo {
    private static final String LEGACY_RESOURCE = "res\\info";
    private static final String PORTABLE_RESOURCE = "res/info";

    private PatchClientInfo() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchClientInfo <input bt.class|ac.class> <output class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        MethodNode target;
        if ("bt".equals(classNode.name)) {
            target = findMethod(classNode, "c", "()V");
        } else if ("ac".equals(classNode.name)) {
            target = findMethod(classNode, "a", "(Z)V");
        } else {
            throw new IllegalArgumentException(
                    "Expected bt.class or ac.class, got " + classNode.name);
        }

        patchResourcePayload(target, classNode.name);

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Path parent = output.toAbsolutePath().getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        Files.write(output, writer.toByteArray());
        System.out.println(
                "Patched client-info payload in " + classNode.name + ": " + output);
    }

    private static void patchResourcePayload(MethodNode method, String className) {
        LdcInsnNode resource = null;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (!(instruction instanceof LdcInsnNode)) {
                continue;
            }
            Object value = ((LdcInsnNode) instruction).cst;
            if (LEGACY_RESOURCE.equals(value) || PORTABLE_RESOURCE.equals(value)) {
                if (resource != null) {
                    throw new IllegalStateException(
                            "Multiple client-info resource blocks in " + className);
                }
                resource = (LdcInsnNode) instruction;
            }
        }
        if (resource == null) {
            throw new IllegalStateException(
                    "Missing client-info resource block in " + className);
        }
        resource.cst = PORTABLE_RESOURCE;

        VarInsnNode streamStore = null;
        JumpInsnNode nullCheck = null;
        for (AbstractInsnNode instruction = resource.getNext();
             instruction != null;
             instruction = instruction.getNext()) {
            if (streamStore == null
                    && instruction instanceof VarInsnNode
                    && instruction.getOpcode() == Opcodes.ASTORE) {
                streamStore = (VarInsnNode) instruction;
                continue;
            }
            if (streamStore != null
                    && instruction instanceof JumpInsnNode
                    && instruction.getOpcode() == Opcodes.IFNULL) {
                nullCheck = (JumpInsnNode) instruction;
                break;
            }
        }
        if (streamStore == null || nullCheck == null) {
            throw new IllegalStateException(
                    "Unexpected client-info null-check shape in " + className);
        }

        int dataLocal = method.maxLocals;
        method.maxLocals = dataLocal + 1;
        InsnList allocate = new InsnList();
        allocate.add(new VarInsnNode(Opcodes.ALOAD, streamStore.var));
        allocate.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/io/InputStream",
                "available",
                "()I",
                false));
        allocate.add(new IntInsnNode(Opcodes.NEWARRAY, Opcodes.T_BYTE));
        allocate.add(new VarInsnNode(Opcodes.ASTORE, dataLocal));

        // Insert on the non-null fall-through path, after IFNULL consumed the
        // duplicated stream reference. This keeps a missing resource optional.
        method.instructions.insert(nullCheck, allocate);

        int replacements = 0;
        for (AbstractInsnNode instruction = nullCheck.getNext();
             instruction != null && instruction != nullCheck.label; ) {
            AbstractInsnNode next = instruction.getNext();
            if (instruction.getOpcode() == Opcodes.ACONST_NULL) {
                method.instructions.set(
                        instruction,
                        new VarInsnNode(Opcodes.ALOAD, dataLocal));
                ++replacements;
            }
            instruction = next;
        }
        if (replacements != 4) {
            throw new IllegalStateException(
                    "Expected four null payload references in " + className
                            + ", found " + replacements);
        }
    }

    private static MethodNode findMethod(
            ClassNode classNode, String name, String descriptor) {
        for (MethodNode method : classNode.methods) {
            if (name.equals(method.name) && descriptor.equals(method.desc)) {
                return method;
            }
        }
        throw new IllegalStateException(
                "Missing method " + classNode.name + "." + name + descriptor);
    }
}
