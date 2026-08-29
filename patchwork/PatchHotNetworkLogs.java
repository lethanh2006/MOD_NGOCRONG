import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

/** Removes two string-building logs that run for every received packet. */
public final class PatchHotNetworkLogs {
    private PatchHotNetworkLogs() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchHotNetworkLogs <input ac.class> <output ac.class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);
        if (!"ac".equals(classNode.name)) {
            throw new IllegalArgumentException("Input class is not ac.class");
        }

        MethodNode dispatcher = findMethod(classNode, "a", "(Ly;)V");
        LdcInsnNode stdoutMarker = findMarker(dispatcher, "Receive message cmd ");
        LdcInsnNode noOpMarker = findMarker(dispatcher, "cmd= ");

        removeStdoutLog(dispatcher, stdoutMarker);
        removeNoOpDebugLog(dispatcher, noOpMarker);

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Path parent = output.toAbsolutePath().getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        Files.write(output, writer.toByteArray());
        System.out.println("Removed per-packet receive logs from ac.class");
    }

    private static void removeStdoutLog(MethodNode method, LdcInsnNode marker) {
        AbstractInsnNode start = marker;
        while (start != null) {
            if (start instanceof FieldInsnNode) {
                FieldInsnNode field = (FieldInsnNode) start;
                if (start.getOpcode() == Opcodes.GETSTATIC
                        && "java/lang/System".equals(field.owner)
                        && "out".equals(field.name)) {
                    break;
                }
            }
            start = start.getPrevious();
        }

        MethodInsnNode end = null;
        for (AbstractInsnNode instruction = marker;
             instruction != null;
             instruction = instruction.getNext()) {
            if (!(instruction instanceof MethodInsnNode)) {
                continue;
            }
            MethodInsnNode call = (MethodInsnNode) instruction;
            if (call.getOpcode() == Opcodes.INVOKEVIRTUAL
                    && "java/io/PrintStream".equals(call.owner)
                    && "println".equals(call.name)
                    && "(Ljava/lang/String;)V".equals(call.desc)) {
                end = call;
                break;
            }
        }
        removeRange(method, start, end, "stdout receive log");
    }

    private static void removeNoOpDebugLog(MethodNode method, LdcInsnNode marker) {
        AbstractInsnNode start = marker;
        while (start != null) {
            if (start instanceof TypeInsnNode) {
                TypeInsnNode type = (TypeInsnNode) start;
                if (start.getOpcode() == Opcodes.NEW
                        && "java/lang/StringBuffer".equals(type.desc)) {
                    break;
                }
            }
            start = start.getPrevious();
        }

        MethodInsnNode end = null;
        for (AbstractInsnNode instruction = marker;
             instruction != null;
             instruction = instruction.getNext()) {
            if (!(instruction instanceof MethodInsnNode)) {
                continue;
            }
            MethodInsnNode call = (MethodInsnNode) instruction;
            if (call.getOpcode() == Opcodes.INVOKESTATIC
                    && "ds".equals(call.owner)
                    && "c".equals(call.name)
                    && "(Ljava/lang/String;)V".equals(call.desc)) {
                end = call;
                break;
            }
        }
        removeRange(method, start, end, "no-op receive debug log");
    }

    private static void removeRange(
            MethodNode method,
            AbstractInsnNode start,
            AbstractInsnNode end,
            String description) {
        if (start == null || end == null) {
            throw new IllegalStateException("Could not isolate " + description);
        }
        AbstractInsnNode after = end.getNext();
        for (AbstractInsnNode instruction = start;
             instruction != after; ) {
            AbstractInsnNode next = instruction.getNext();
            method.instructions.remove(instruction);
            instruction = next;
        }
    }

    private static LdcInsnNode findMarker(MethodNode method, String value) {
        LdcInsnNode result = null;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof LdcInsnNode
                    && value.equals(((LdcInsnNode) instruction).cst)) {
                if (result != null) {
                    throw new IllegalStateException("Duplicate log marker: " + value);
                }
                result = (LdcInsnNode) instruction;
            }
        }
        if (result == null) {
            throw new IllegalStateException("Missing log marker: " + value);
        }
        return result;
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
