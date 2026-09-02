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
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * Makes the J2ME client advertise the same pre-login profile as Teamobi's
 * official DragonBoy 2.5.0 PC build.
 *
 * <p>This is a protocol compatibility patch, not an authentication bypass.
 * Credentials and server responses are left untouched.</p>
 */
public final class PatchPcCompatibility {
    private static final String JAVA_INFO_RESOURCE = "res/info";
    private static final String PC_INFO_RESOURCE = "res/info-pc";
    private static final String PLATFORM_PROPERTY = "microedition.platform";
    private static final String PC_PLATFORM = "Pc platform xxx";

    private PatchPcCompatibility() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchPcCompatibility <input bt.class|ac.class> <output class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if ("bt".equals(classNode.name)) {
            patchSetType(findMethod(classNode, "c", "()V"), classNode.name);
            patchLogin(findMethod(
                    classNode,
                    "a",
                    "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V"));
        } else if ("ac".equals(classNode.name)) {
            patchSetType(findMethod(classNode, "a", "(Z)V"), classNode.name);
        } else {
            throw new IllegalArgumentException(
                    "Expected bt.class or ac.class, got " + classNode.name);
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Path parent = output.toAbsolutePath().getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        Files.write(output, writer.toByteArray());
        System.out.println("Applied official PC compatibility profile to " + classNode.name);
    }

    private static void patchSetType(MethodNode method, String className) {
        LdcInsnNode setTypeLog = null;
        LdcInsnNode platform = null;
        LdcInsnNode resource = null;
        FieldInsnNode qwerty = null;
        FieldInsnNode touch = null;

        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof LdcInsnNode) {
                Object value = ((LdcInsnNode) instruction).cst;
                if ("setType".equals(value)) {
                    setTypeLog = (LdcInsnNode) instruction;
                } else if (PLATFORM_PROPERTY.equals(value)) {
                    platform = (LdcInsnNode) instruction;
                } else if (JAVA_INFO_RESOURCE.equals(value)) {
                    resource = (LdcInsnNode) instruction;
                }
            } else if (instruction instanceof FieldInsnNode
                    && instruction.getOpcode() == Opcodes.GETSTATIC) {
                FieldInsnNode field = (FieldInsnNode) instruction;
                if ("cd".equals(field.owner)
                        && "g".equals(field.name)
                        && "Z".equals(field.desc)) {
                    qwerty = field;
                } else if ("main/a".equals(field.owner)
                        && "e".equals(field.name)
                        && "Z".equals(field.desc)) {
                    touch = field;
                }
            }
        }

        if (setTypeLog == null || platform == null || resource == null
                || qwerty == null || touch == null) {
            throw new IllegalStateException(
                    "Unexpected setType shape in " + className);
        }

        // Set the shared client type after the optional RMS load, immediately
        // before this method constructs the packet.
        InsnList forceClientType = new InsnList();
        forceClientType.add(new InsnNode(Opcodes.ICONST_4));
        forceClientType.add(new FieldInsnNode(
                Opcodes.PUTSTATIC, "l", "c", "I"));
        method.instructions.insertBefore(setTypeLog, forceClientType);

        // The constant itself now supplies the platform string. Removing
        // System.getProperty leaves it on the stack for String.valueOf.
        platform.cst = PC_PLATFORM;
        AbstractInsnNode getProperty = nextMeaningful(platform);
        if (!(getProperty instanceof MethodInsnNode)
                || getProperty.getOpcode() != Opcodes.INVOKESTATIC
                || !"java/lang/System".equals(((MethodInsnNode) getProperty).owner)
                || !"getProperty".equals(((MethodInsnNode) getProperty).name)) {
            throw new IllegalStateException(
                    "Missing platform property lookup in " + className);
        }
        method.instructions.remove(getProperty);

        resource.cst = PC_INFO_RESOURCE;
        method.instructions.set(qwerty, new InsnNode(Opcodes.ICONST_1));
        method.instructions.set(touch, new InsnNode(Opcodes.ICONST_1));
    }

    private static void patchLogin(MethodNode method) {
        FieldInsnNode language = null;
        for (AbstractInsnNode instruction = method.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof FieldInsnNode
                    && instruction.getOpcode() == Opcodes.GETSTATIC) {
                FieldInsnNode field = (FieldInsnNode) instruction;
                if ("aw".equals(field.owner)
                        && "fB".equals(field.name)
                        && "B".equals(field.desc)) {
                    language = field;
                    break;
                }
            }
        }
        if (language == null) {
            throw new IllegalStateException("Missing Java language byte in bt login");
        }

        AbstractInsnNode streamCall = previousMeaningful(language);
        AbstractInsnNode messageLoad = previousMeaningful(streamCall);
        AbstractInsnNode writeByte = nextMeaningful(language);
        if (!(streamCall instanceof MethodInsnNode)
                || !"y".equals(((MethodInsnNode) streamCall).owner)
                || !"d".equals(((MethodInsnNode) streamCall).name)
                || !(messageLoad instanceof VarInsnNode)
                || messageLoad.getOpcode() != Opcodes.ALOAD
                || !(writeByte instanceof MethodInsnNode)
                || !"java/io/DataOutputStream".equals(
                        ((MethodInsnNode) writeByte).owner)
                || !"writeByte".equals(((MethodInsnNode) writeByte).name)) {
            throw new IllegalStateException("Unexpected Java language write in bt login");
        }

        method.instructions.remove(messageLoad);
        method.instructions.remove(streamCall);
        method.instructions.remove(language);
        method.instructions.remove(writeByte);
    }

    private static AbstractInsnNode nextMeaningful(AbstractInsnNode instruction) {
        AbstractInsnNode current = instruction == null ? null : instruction.getNext();
        while (current != null && current.getOpcode() < 0) {
            current = current.getNext();
        }
        return current;
    }

    private static AbstractInsnNode previousMeaningful(AbstractInsnNode instruction) {
        AbstractInsnNode current = instruction == null ? null : instruction.getPrevious();
        while (current != null && current.getOpcode() < 0) {
            current = current.getPrevious();
        }
        return current;
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
