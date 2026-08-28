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
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Adds complete keyboard support to ev (the server selection screen).
 *
 * <p>The original touch layout changes the selected index for arrow keys but
 * never moves the visible server list. It also lets {@code bb.d()} consume the
 * fire key before the selected server can be activated. This patch keeps the
 * focused row visible in both layouts, highlights it, activates that exact row,
 * and maps the classic 2/8/5 navigation keys on this screen.</p>
 */
public final class PatchServerSelection {
    private static final String CLASS_NAME = "ev";
    private static final String ACTIVATE_METHOD = "nro$activateKeyboardSelection";
    private static final String SYNC_METHOD = "nro$syncKeyboardSelection";

    private PatchServerSelection() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchServerSelection <input ev.class> <output ev.class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if (!CLASS_NAME.equals(classNode.name)) {
            throw new IllegalArgumentException("Input class is not ev.class");
        }

        requireMissingMethod(classNode, "a", "(I)V");
        requireMissingMethod(classNode, ACTIVATE_METHOD, "()Z");
        requireMissingMethod(classNode, SYNC_METHOD, "()V");

        MethodNode inputMethod = createNumericKeyMethod();
        MethodNode activateMethod = createActivateMethod();
        MethodNode syncMethod = createSyncMethod();
        classNode.methods.add(inputMethod);
        classNode.methods.add(activateMethod);
        classNode.methods.add(syncMethod);

        MethodNode updateKeyMethod = findMethod(classNode, "d", "()V");
        patchUpdateKeyMethod(updateKeyMethod);

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.write(output, writer.toByteArray());
        System.out.println("Patched server selection keyboard support: " + output);
    }

    /** Maps the phone-style 2/8/5 keys before main.a ignores them on UI screens. */
    private static MethodNode createNumericKeyMethod() {
        MethodNode method = new MethodNode(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL,
                "a",
                "(I)V",
                null,
                null);
        InsnList code = method.instructions;
        LabelNode checkDown = new LabelNode();
        LabelNode checkSelect = new LabelNode();
        LabelNode done = new LabelNode();

        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new IntInsnNode(Opcodes.BIPUSH, 50));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPNE, checkDown));
        setPressed(code, 2);
        code.add(new JumpInsnNode(Opcodes.GOTO, done));

        code.add(checkDown);
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new IntInsnNode(Opcodes.BIPUSH, 56));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPNE, checkSelect));
        setPressed(code, 8);
        code.add(new JumpInsnNode(Opcodes.GOTO, done));

        code.add(checkSelect);
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new IntInsnNode(Opcodes.BIPUSH, 53));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPNE, done));
        setPressed(code, 5);

        code.add(done);
        code.add(new InsnNode(Opcodes.RETURN));
        return method;
    }

    private static void setPressed(InsnList code, int keyIndex) {
        code.add(new FieldInsnNode(
                Opcodes.GETSTATIC,
                "main/a",
                "i",
                "[Z"));
        pushSmallInt(code, keyIndex);
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.BASTORE));
    }

    /** Activates the focused row before bb.d() consumes the fire key. */
    private static MethodNode createActivateMethod() {
        MethodNode method = new MethodNode(
                Opcodes.ACC_PRIVATE,
                ACTIVATE_METHOD,
                "()Z",
                null,
                null);
        InsnList code = method.instructions;
        LabelNode notHandled = new LabelNode();
        LabelNode selectedIndexIsNonNegative = new LabelNode();
        LabelNode selectedIndexIsInRange = new LabelNode();

        code.add(new FieldInsnNode(Opcodes.GETSTATIC, "main/a", "i", "[Z"));
        code.add(new InsnNode(Opcodes.ICONST_5));
        code.add(new InsnNode(Opcodes.BALOAD));
        code.add(new JumpInsnNode(Opcodes.IFEQ, notHandled));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "size",
                "()I",
                false));
        code.add(new JumpInsnNode(Opcodes.IFLE, notHandled));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new JumpInsnNode(Opcodes.IFGE, selectedIndexIsNonNegative));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, CLASS_NAME, "c", "I"));

        code.add(selectedIndexIsNonNegative);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "size",
                "()I",
                false));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLT, selectedIndexIsInRange));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "size",
                "()I",
                false));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, CLASS_NAME, "c", "I"));

        code.add(selectedIndexIsInRange);
        code.add(new FieldInsnNode(Opcodes.GETSTATIC, "main/a", "i", "[Z"));
        code.add(new InsnNode(Opcodes.ICONST_5));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new InsnNode(Opcodes.BASTORE));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "elementAt",
                "(I)Ljava/lang/Object;",
                false));
        code.add(new TypeInsnNode(Opcodes.CHECKCAST, "de"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "de",
                "a",
                "()V",
                false));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.IRETURN));

        code.add(notHandled);
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new InsnNode(Opcodes.IRETURN));
        return method;
    }

    /** Keeps the selected row highlighted and inside the scroll viewport. */
    private static MethodNode createSyncMethod() {
        MethodNode method = new MethodNode(
                Opcodes.ACC_PRIVATE,
                SYNC_METHOD,
                "()V",
                null,
                null);
        InsnList code = method.instructions;
        LabelNode done = new LabelNode();
        LabelNode selectedIndexIsNonNegative = new LabelNode();
        LabelNode selectedIndexIsInRange = new LabelNode();
        LabelNode loopCheck = new LabelNode();
        LabelNode loopBody = new LabelNode();
        LabelNode notSelected = new LabelNode();
        LabelNode storeHighlight = new LabelNode();
        LabelNode advancedScroll = new LabelNode();
        LabelNode checkLegacyBottom = new LabelNode();
        LabelNode applyLegacyDelta = new LabelNode();
        LabelNode legacyMoveLoopCheck = new LabelNode();
        LabelNode legacyMoveLoopBody = new LabelNode();
        LabelNode checkBottom = new LabelNode();
        LabelNode clampLowerBound = new LabelNode();
        LabelNode clampUpperBound = new LabelNode();

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "size",
                "()I",
                false));
        code.add(new VarInsnNode(Opcodes.ISTORE, 1));
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new JumpInsnNode(Opcodes.IFLE, done));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "i", "I"));
        code.add(new JumpInsnNode(Opcodes.IFLE, done));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new JumpInsnNode(Opcodes.IFGE, selectedIndexIsNonNegative));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, CLASS_NAME, "c", "I"));

        code.add(selectedIndexIsNonNegative);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLT, selectedIndexIsInRange));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, CLASS_NAME, "c", "I"));

        code.add(selectedIndexIsInRange);
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ISTORE, 2));
        code.add(new JumpInsnNode(Opcodes.GOTO, loopCheck));

        code.add(loopBody);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 2));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "elementAt",
                "(I)Ljava/lang/Object;",
                false));
        code.add(new TypeInsnNode(Opcodes.CHECKCAST, "de"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 2));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPNE, notSelected));
        code.add(new InsnNode(Opcodes.ICONST_1));
        code.add(new JumpInsnNode(Opcodes.GOTO, storeHighlight));
        code.add(notSelected);
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(storeHighlight);
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "de", "n", "Z"));
        code.add(new org.objectweb.asm.tree.IincInsnNode(2, 1));

        code.add(loopCheck);
        code.add(new VarInsnNode(Opcodes.ILOAD, 2));
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLT, loopBody));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "a", "Z"));
        code.add(new JumpInsnNode(Opcodes.IFNE, advancedScroll));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "elementAt",
                "(I)Ljava/lang/Object;",
                false));
        code.add(new TypeInsnNode(Opcodes.CHECKCAST, "de"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "de", "k", "I"));
        code.add(new VarInsnNode(Opcodes.ISTORE, 4));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ISTORE, 3));

        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new JumpInsnNode(Opcodes.IFGE, checkLegacyBottom));
        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new InsnNode(Opcodes.INEG));
        code.add(new VarInsnNode(Opcodes.ISTORE, 3));
        code.add(new JumpInsnNode(Opcodes.GOTO, applyLegacyDelta));

        code.add(checkLegacyBottom);
        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "g", "I"));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new FieldInsnNode(Opcodes.GETSTATIC, "main/a", "B", "I"));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLE, done));
        code.add(new FieldInsnNode(Opcodes.GETSTATIC, "main/a", "B", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "g", "I"));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new VarInsnNode(Opcodes.ISTORE, 3));

        code.add(applyLegacyDelta);
        code.add(new VarInsnNode(Opcodes.ILOAD, 3));
        code.add(new JumpInsnNode(Opcodes.IFEQ, done));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new VarInsnNode(Opcodes.ISTORE, 2));
        code.add(new JumpInsnNode(Opcodes.GOTO, legacyMoveLoopCheck));

        code.add(legacyMoveLoopBody);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "d", "Lel;"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 2));
        code.add(new MethodInsnNode(
                Opcodes.INVOKEVIRTUAL,
                "java/util/Vector",
                "elementAt",
                "(I)Ljava/lang/Object;",
                false));
        code.add(new TypeInsnNode(Opcodes.CHECKCAST, "de"));
        code.add(new InsnNode(Opcodes.DUP));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "de", "k", "I"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 3));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "de", "k", "I"));
        code.add(new org.objectweb.asm.tree.IincInsnNode(2, 1));

        code.add(legacyMoveLoopCheck);
        code.add(new VarInsnNode(Opcodes.ILOAD, 2));
        code.add(new VarInsnNode(Opcodes.ILOAD, 1));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLT, legacyMoveLoopBody));
        code.add(new JumpInsnNode(Opcodes.GOTO, done));

        code.add(advancedScroll);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new JumpInsnNode(Opcodes.IFNULL, done));

        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "F", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "B", "I"));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "c", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "i", "I"));
        code.add(new InsnNode(Opcodes.IDIV));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "g", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "h", "I"));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new InsnNode(Opcodes.IMUL));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new VarInsnNode(Opcodes.ISTORE, 3));

        code.add(new VarInsnNode(Opcodes.ILOAD, 3));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "g", "I"));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new VarInsnNode(Opcodes.ISTORE, 4));

        code.add(new VarInsnNode(Opcodes.ILOAD, 3));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "a", "I"));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPGE, checkBottom));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 3));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "bh", "a", "I"));
        code.add(new JumpInsnNode(Opcodes.GOTO, clampLowerBound));

        code.add(checkBottom);
        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "a", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "D", "I"));
        code.add(new InsnNode(Opcodes.IADD));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLE, clampLowerBound));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new VarInsnNode(Opcodes.ILOAD, 4));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "D", "I"));
        code.add(new InsnNode(Opcodes.ISUB));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "bh", "a", "I"));

        code.add(clampLowerBound);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "a", "I"));
        code.add(new JumpInsnNode(Opcodes.IFGE, clampUpperBound));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new InsnNode(Opcodes.ICONST_0));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "bh", "a", "I"));

        code.add(clampUpperBound);
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "a", "I"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "c", "I"));
        code.add(new JumpInsnNode(Opcodes.IF_ICMPLE, done));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new VarInsnNode(Opcodes.ALOAD, 0));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, CLASS_NAME, "o", "Lbh;"));
        code.add(new FieldInsnNode(Opcodes.GETFIELD, "bh", "c", "I"));
        code.add(new FieldInsnNode(Opcodes.PUTFIELD, "bh", "a", "I"));

        code.add(done);
        code.add(new InsnNode(Opcodes.RETURN));
        return method;
    }

    private static void patchUpdateKeyMethod(MethodNode method) {
        AbstractInsnNode first = method.instructions.getFirst();
        LabelNode continueOriginal = new LabelNode();
        InsnList activation = new InsnList();
        activation.add(new VarInsnNode(Opcodes.ALOAD, 0));
        activation.add(new MethodInsnNode(
                Opcodes.INVOKESPECIAL,
                CLASS_NAME,
                ACTIVATE_METHOD,
                "()Z",
                false));
        activation.add(new JumpInsnNode(Opcodes.IFEQ, continueOriginal));
        activation.add(new InsnNode(Opcodes.RETURN));
        activation.add(continueOriginal);
        method.instructions.insertBefore(first, activation);

        int returns = 0;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
                instruction != null;
                instruction = instruction.getNext()) {
            if (instruction.getOpcode() != Opcodes.RETURN) {
                continue;
            }
            InsnList sync = new InsnList();
            sync.add(new VarInsnNode(Opcodes.ALOAD, 0));
            sync.add(new MethodInsnNode(
                    Opcodes.INVOKESPECIAL,
                    CLASS_NAME,
                    SYNC_METHOD,
                    "()V",
                    false));
            method.instructions.insertBefore(instruction, sync);
            ++returns;
        }

        if (returns != 2) {
            throw new IllegalStateException(
                    "Expected patched ev.d() to contain two returns, found " + returns);
        }
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

    private static void pushSmallInt(InsnList code, int value) {
        if (value >= 0 && value <= 5) {
            code.add(new InsnNode(Opcodes.ICONST_0 + value));
        } else {
            code.add(new IntInsnNode(Opcodes.BIPUSH, value));
        }
    }
}
