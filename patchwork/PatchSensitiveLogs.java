import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/** Removes username/password values from the legacy login/register debug logs. */
public final class PatchSensitiveLogs {
    private static final String LOGIN_DESC =
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V";
    private static final String REGISTER_DESC =
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";

    public static void main(String[] args) throws Exception {
        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);

        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if ("bt".equals(classNode.name)) {
            patchServiceLogs(classNode);
        } else if ("x".equals(classNode.name)) {
            patchLoginScreenLogs(classNode);
        } else {
            throw new IllegalArgumentException("Unsupported class: " + classNode.name);
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.write(output, writer.toByteArray());
        System.out.println("Patched sensitive authentication logs");
    }

    private static void patchServiceLogs(ClassNode classNode) {
        boolean loginPatched = false;
        boolean registerPatched = false;
        for (MethodNode method : classNode.methods) {
            if (!"a".equals(method.name)) {
                continue;
            }
            if (LOGIN_DESC.equals(method.desc)) {
                redactFirstLog(method, "Login request");
                loginPatched = true;
            } else if (REGISTER_DESC.equals(method.desc)) {
                redactFirstLog(method, "Register request");
                registerPatched = true;
            }
        }
        if (!loginPatched || !registerPatched) {
            throw new IllegalStateException("Could not locate login/register methods in bt.class");
        }
    }

    private static void patchLoginScreenLogs(ClassNode classNode) {
        MethodNode login = null;
        for (MethodNode method : classNode.methods) {
            if ("a".equals(method.name) && "()V".equals(method.desc)) {
                login = method;
                break;
            }
        }
        if (login == null) {
            throw new IllegalStateException("Could not locate x.a() login method");
        }

        List<AbstractInsnNode> markers = new ArrayList<AbstractInsnNode>();
        List<String> replacements = new ArrayList<String>();
        for (AbstractInsnNode instruction = login.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof LdcInsnNode) {
                Object value = ((LdcInsnNode) instruction).cst;
                if ("user ao= ".equals(value)) {
                    markers.add(instruction);
                    replacements.add("Stored-account lookup");
                } else if ("user = ".equals(value)) {
                    markers.add(instruction);
                    replacements.add("Stored credentials loaded");
                }
            }
        }
        if (markers.size() != 2) {
            throw new IllegalStateException(
                    "Expected two sensitive logs in x.a(), found " + markers.size());
        }
        for (int index = markers.size() - 1; index >= 0; index--) {
            redactExpressionLog(login, markers.get(index), replacements.get(index));
        }
    }

    private static void redactExpressionLog(MethodNode method,
                                            AbstractInsnNode marker,
                                            String safeMessage) {
        AbstractInsnNode expressionStart = marker;
        while (expressionStart != null) {
            if (expressionStart instanceof TypeInsnNode
                    && expressionStart.getOpcode() == Opcodes.NEW
                    && "java/lang/StringBuffer".equals(((TypeInsnNode) expressionStart).desc)) {
                break;
            }
            expressionStart = expressionStart.getPrevious();
        }

        MethodInsnNode logCall = null;
        for (AbstractInsnNode instruction = marker;
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof MethodInsnNode) {
                MethodInsnNode call = (MethodInsnNode) instruction;
                if (call.getOpcode() == Opcodes.INVOKESTATIC
                        && "ds".equals(call.owner)
                        && "c".equals(call.name)
                        && "(Ljava/lang/String;)V".equals(call.desc)) {
                    logCall = call;
                    break;
                }
            }
        }

        if (expressionStart == null || logCall == null) {
            throw new IllegalStateException("Could not isolate sensitive login-screen log");
        }

        for (AbstractInsnNode instruction = expressionStart;
             instruction != logCall; ) {
            AbstractInsnNode next = instruction.getNext();
            if (instruction.getOpcode() >= 0) {
                method.instructions.remove(instruction);
            }
            instruction = next;
        }
        method.instructions.insertBefore(logCall, new LdcInsnNode(safeMessage));
    }

    private static void redactFirstLog(MethodNode method, String safeMessage) {
        MethodInsnNode logCall = null;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof MethodInsnNode) {
                MethodInsnNode call = (MethodInsnNode) instruction;
                if (call.getOpcode() == Opcodes.INVOKESTATIC
                        && "ds".equals(call.owner)
                        && "c".equals(call.name)
                        && "(Ljava/lang/String;)V".equals(call.desc)) {
                    logCall = call;
                    break;
                }
            }
        }

        if (logCall == null) {
            throw new IllegalStateException("Could not locate authentication log in " + method.desc);
        }

        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != logCall; ) {
            AbstractInsnNode next = instruction.getNext();
            if (instruction.getOpcode() >= 0) {
                method.instructions.remove(instruction);
            }
            instruction = next;
        }
        method.instructions.insertBefore(logCall, new LdcInsnNode(safeMessage));
    }
}
