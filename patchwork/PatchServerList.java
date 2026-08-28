import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/** Ensures the newly opened Universe 15 is present even with an older NRlink3 cache. */
public final class PatchServerList {
    private static final String CLASS_NAME = "bs";
    private static final String ENSURE_METHOD = "nro$ensureUniverse15";
    private static final String SERVER_NAME = "Vũ trụ 15";
    private static final String SERVER_HOST = "27.0.14.69";
    private static final int SERVER_PORT = 14445;

    private PatchServerList() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchServerList <input bs.class> <output bs.class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if (!CLASS_NAME.equals(classNode.name)) {
            throw new IllegalArgumentException("Input class is not bs.class");
        }
        requireMissingMethod(classNode, ENSURE_METHOD, "()V");

        classNode.methods.add(createEnsureMethod());
        patchStringParser(findMethod(classNode, "a", "(Ljava/lang/String;)V"));
        patchCachedListLoader(findMethod(classNode, "f", "()V"));

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.write(output, writer.toByteArray());
        System.out.println("Patched Universe 15 server fallback: " + output);
    }

    private static MethodNode createEnsureMethod() {
        MethodNode method = new MethodNode(
                Opcodes.ACC_PRIVATE | Opcodes.ACC_STATIC,
                ENSURE_METHOD,
                "()V",
                null,
                null);
        InsnList code = method.instructions;
        LabelNode done = new LabelNode();
        LabelNode loopBody = new LabelNode();
        LabelNode loopCheck = new LabelNode();
        LabelNode append = new LabelNode();

        requireArray(code, "a", "[Ljava/lang/String;", done);
        requireArray(code, "x", "[Ljava/lang/String;", done);
        requireArray(code, "y", "[S", done);
        requireArray(code, "d", "[B", done);
        requireArray(code, "h", "[B", done);
        requireArray(code, "i", "[B", done);

        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                CLASS_NAME,
                "a",
                "[Ljava/lang/String;"));
        code.add(new InsnNode(Opcodes.ARRAYLENGTH));
        code.add(new VarInsnNode(Opcodes.ISTORE, 0));

        requireMatchingLength(code, "x", "[Ljava/lang/String;", done);
        requireMatchingLength(code, "y", "[S", done);
        requireMatchingLength(code, "d", "[B", done);
        requireMatchingLength(code, "h", "[B", done);
        requireMatchingLength(code, "i", "[B", done);

        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ISTORE, 7));
        code.add(new JumpInsnNode(Opcodes.GOTO, loopCheck));

        code.add(loopBody);
        code.add(new LdcInsnNode(SERVER_NAME));
        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                CLASS_NAME,
                "a",
                "[Ljava/lang/String;"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 7));
        code.add(new InsnNode(Opcodes.AALOAD));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/lang/String",
                "equals",
                "(Ljava/lang/Object;)Z",
                false));
        code.add(new JumpInsnNode(Opcodes.IFNE, done));
        code.add(new org.objectweb.asm.tree.IincInsnNode(7, 1));

        code.add(loopCheck);
        code.add(new VarInsnNode(Opcodes.ILOAD, 7));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLT, loopBody));
        code.add(new JumpInsnNode(Opcodes.GOTO, append));

        code.add(append);
        allocateReferenceArray(code, 1, "java/lang/String");
        allocateReferenceArray(code, 2, "java/lang/String");
        allocatePrimitiveArray(code, 3, Opcodes.T_SHORT);
        allocatePrimitiveArray(code, 4, Opcodes.T_BYTE);
        allocatePrimitiveArray(code, 5, Opcodes.T_BYTE);
        allocatePrimitiveArray(code, 6, Opcodes.T_BYTE);

        copyArray(code, "a", "[Ljava/lang/String;", 1);
        copyArray(code, "x", "[Ljava/lang/String;", 2);
        copyArray(code, "y", "[S", 3);
        copyArray(code, "d", "[B", 4);
        copyArray(code, "h", "[B", 5);
        copyArray(code, "i", "[B", 6);

        code.add(new VarInsnNode(Opcodes.ALOAD, 1));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new LdcInsnNode(SERVER_NAME));
        code.add(new InsnNode(Opcodes.AASTORE));

        code.add(new VarInsnNode(Opcodes.ALOAD, 2));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new LdcInsnNode(SERVER_HOST));
        code.add(new InsnNode(Opcodes.AASTORE));

        code.add(new VarInsnNode(Opcodes.ALOAD, 3));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new IntInsnNode(Opcodes.SIPUSH, SERVER_PORT));
        code.add(new InsnNode(Opcodes.SASTORE));

        setZeroByte(code, 4);
        setZeroByte(code, 5);
        setZeroByte(code, 6);

        code.add(new VarInsnNode(Opcodes.ALOAD, 1));
        code.add(new FieldInsnNode(
                Opcodes.PUTSTATIC,
                CLASS_NAME,
                "a",
                "[Ljava/lang/String;"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 2));
        code.add(new FieldInsnNode(
                Opcodes.PUTSTATIC,
                CLASS_NAME,
                "x",
                "[Ljava/lang/String;"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 3));
        code.add(new FieldInsnNode(Opcodes.PUTSTATIC, CLASS_NAME, "y", "[S"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 4));
        code.add(new FieldInsnNode(Opcodes.PUTSTATIC, CLASS_NAME, "d", "[B"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 5));
        code.add(new FieldInsnNode(Opcodes.PUTSTATIC, CLASS_NAME, "h", "[B"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 6));
        code.add(new FieldInsnNode(Opcodes.PUTSTATIC, CLASS_NAME, "i", "[B"));

        code.add(done);
        code.add(new InsnNode(Opcodes.RETURN));
        return method;
    }

    private static void patchStringParser(MethodNode method) {
        int patchedCalls = 0;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
                instruction != null;
                instruction = instruction.getNext()) {
            if (!(instruction instanceof MethodInsnNode)) {
                continue;
            }
            MethodInsnNode call = (MethodInsnNode)instruction;
            if (call.getOpcode() != Opcodes.INVOKESTATIC
                    || !CLASS_NAME.equals(call.owner)
                    || !"p".equals(call.name)
                    || !"()V".equals(call.desc)) {
                continue;
            }
            method.instructions.insertBefore(call, ensureCall());
            ++patchedCalls;
        }
        if (patchedCalls != 1) {
            throw new IllegalStateException(
                    "Expected one bs.p() call in bs.a(String), found " + patchedCalls);
        }
    }

    private static void patchCachedListLoader(MethodNode method) {
        int patchedCalls = 0;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
                instruction != null;
                instruction = instruction.getNext()) {
            if (!(instruction instanceof MethodInsnNode)) {
                continue;
            }
            MethodInsnNode call = (MethodInsnNode)instruction;
            if (call.getOpcode() != Opcodes.INVOKESTATIC
                    || !"em".equals(call.owner)
                    || !"e".equals(call.name)
                    || !"()V".equals(call.desc)) {
                continue;
            }
            method.instructions.insertBefore(call, ensureCall());
            ++patchedCalls;
        }
        if (patchedCalls != 1) {
            throw new IllegalStateException(
                    "Expected one em.e() call in bs.f(), found " + patchedCalls);
        }
    }

    private static InsnList ensureCall() {
        InsnList call = new InsnList();
        call.add(new MethodInsnNode(
                Opcodes.INVOKESTATIC,
                CLASS_NAME,
                ENSURE_METHOD,
                "()V",
                false));
        return call;
    }

    private static void requireArray(
            InsnList code,
            String field,
            String descriptor,
            LabelNode done) {
        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                CLASS_NAME,
                field,
                descriptor));
        code.add(new JumpInsnNode(Opcodes.IFNULL, done));
    }

    private static void requireMatchingLength(
            InsnList code,
            String field,
            String descriptor,
            LabelNode done) {
        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                CLASS_NAME,
                field,
                descriptor));
        code.add(new InsnNode(Opcodes.ARRAYLENGTH));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPNE, done));
    }

    private static void allocateReferenceArray(
            InsnList code,
            int local,
            String type) {
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new TypeInsnNode(Opcodes.ANEWARRAY, type));
        code.add(new VarInsnNode(Opcodes.ASTORE, local));
    }

    private static void allocatePrimitiveArray(
            InsnList code,
            int local,
            int type) {
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new IntInsnNode(Opcodes.NEWARRAY, type));
        code.add(new VarInsnNode(Opcodes.ASTORE, local));
    }

    private static void copyArray(
            InsnList code,
            String field,
            String descriptor,
            int destinationLocal) {
        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                CLASS_NAME,
                field,
                descriptor));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ALOAD, destinationLocal));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new MethodInsnNode(
                Opcodes.INVOKESTATIC,
                "java/lang/System",
                "arraycopy",
                "(Ljava/lang/Object;ILjava/lang/Object;II)V",
                false));
    }

    private static void setZeroByte(InsnList code, int arrayLocal) {
        code.add(new VarInsnNode(Opcodes.ALOAD, arrayLocal));
        code.add(new VarInsnNode(Opcodes.ILOAD, 0));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new InsnNode(Opcodes.BASTORE));
    }

    private static MethodNode findMethod(
            ClassNode classNode,
            String name,
            String descriptor) {
        for (MethodNode method : classNode.methods) {
            if (name.equals(method.name) && descriptor.equals(method.desc)) {
                return method;
            }
        }
        throw new IllegalStateException(
                "Missing method " + name + descriptor + " in " + classNode.name);
    }

    private static void requireMissingMethod(
            ClassNode classNode,
            String name,
            String descriptor) {
        for (MethodNode method : classNode.methods) {
            if (name.equals(method.name) && descriptor.equals(method.desc)) {
                throw new IllegalStateException(
                        "Method already exists: " + name + descriptor);
            }
        }
    }
}
