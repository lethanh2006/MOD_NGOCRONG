import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Adds a non-consuming server-status observer to ac.a(y). */
public final class PatchAuthDiagnostics {
    public static void main(String[] args) throws Exception {
        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);

        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        MethodNode dispatcher = null;
        for (MethodNode method : classNode.methods) {
            if ("a".equals(method.name) && "(Ly;)V".equals(method.desc)) {
                dispatcher = method;
                break;
            }
        }
        if (dispatcher == null) {
            throw new IllegalStateException("Could not locate ac.a(y)");
        }

        InsnList hook = new InsnList();
        hook.add(new VarInsnNode(Opcodes.ALOAD, 1));
        hook.add(new MethodInsnNode(
                Opcodes.INVOKESTATIC,
                "AuthDiagnostics",
                "inspect",
                "(Ly;)V",
                false));
        dispatcher.instructions.insert(hook);

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.write(output, writer.toByteArray());
        System.out.println("Patched authentication status diagnostics");
    }
}
