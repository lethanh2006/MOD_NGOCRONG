import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

import java.nio.file.*;
import java.util.*;

public class PatchBt {
    public static void main(String[] args) throws Exception {
        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);

        byte[] bytes = Files.readAllBytes(input);

        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;

        for (MethodNode mn : cn.methods) {
            // bt.c()
            if (!mn.name.equals("c") || !mn.desc.equals("()V")) {
                continue;
            }

            boolean foundInfo = false;
            int nullCount = 0;

            for (AbstractInsnNode insn = mn.instructions.getFirst();
                 insn != null; ) {

                AbstractInsnNode next = insn.getNext();

                if (insn instanceof LdcInsnNode) {
                    Object cst = ((LdcInsnNode) insn).cst;

                    if ("res\\info".equals(cst) || "res/info".equals(cst)) {
                        ((LdcInsnNode) insn).cst = "res/info";
                        foundInfo = true;

                        System.out.println("Found resource path in bt.c()");
                    }
                }

                if (foundInfo &&
                    insn.getOpcode() == Opcodes.ASTORE &&
                    ((VarInsnNode) insn).var == 2) {

                    /*
                     * Sau:
                     * InputStream inputStream = ...
                     *
                     * thêm:
                     * byte[] data = new byte[inputStream.available()];
                     */
                    InsnList add = new InsnList();

                    add.add(new VarInsnNode(Opcodes.ALOAD, 2));

                    add.add(new MethodInsnNode(
                            Opcodes.INVOKEVIRTUAL,
                            "java/io/InputStream",
                            "available",
                            "()I",
                            false
                    ));

                    add.add(new IntInsnNode(
                            Opcodes.NEWARRAY,
                            Opcodes.T_BYTE
                    ));

                    add.add(new VarInsnNode(
                            Opcodes.ASTORE,
                            3
                    ));

                    mn.instructions.insert(insn, add);

                    System.out.println("Inserted byte[] allocation");
                }

                /*
                 * Trong đoạn resource có 4 ACONST_NULL:
                 *
                 * read(null)
                 * null.length
                 * write(null)
                 * null.length
                 *
                 * đổi cả 4 thành data (local #3).
                 */
                if (foundInfo &&
                    nullCount < 4 &&
                    insn.getOpcode() == Opcodes.ACONST_NULL) {

                    mn.instructions.set(
                            insn,
                            new VarInsnNode(Opcodes.ALOAD, 3)
                    );

                    nullCount++;

                    System.out.println(
                            "Replaced null #" + nullCount
                    );

                    if (nullCount == 4) {
                        patched = true;
                        foundInfo = false;
                    }
                }

                insn = next;
            }
        }

        if (!patched) {
            throw new RuntimeException(
                    "Không tìm thấy đoạn bt.c() cần patch"
            );
        }

        ClassWriter cw =
                new ClassWriter(ClassWriter.COMPUTE_MAXS);

        cn.accept(cw);

        Files.write(output, cw.toByteArray());

        System.out.println("Patched successfully: " + output);
    }
}
