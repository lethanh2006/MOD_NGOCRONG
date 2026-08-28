import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Fixes two harmless but noisy missing-resource lookups in the Java client. */
public final class PatchResourceWarnings {
    private static final String WRONG_PLANET_IMAGE =
            "/mainImage/myTexture2dat-trai-dat.png";
    private static final String PLANET_IMAGE =
            "/mainImage/myTexture2dmat-trai-dat.png";

    private PatchResourceWarnings() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: PatchResourceWarnings <input class> <output class>");
        }

        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        ClassNode classNode = new ClassNode();
        new ClassReader(Files.readAllBytes(input)).accept(classNode, 0);

        if ("af".equals(classNode.name)) {
            patchPlanetImageTypo(classNode);
        } else if ("bv".equals(classNode.name)) {
            patchOptionalLight(classNode);
        } else {
            throw new IllegalArgumentException("Unsupported class: " + classNode.name);
        }

        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(writer);
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.write(output, writer.toByteArray());
        System.out.println("Patched resource warning in " + classNode.name + ".class");
    }

    private static void patchPlanetImageTypo(ClassNode classNode) {
        int replacements = 0;
        for (MethodNode method : classNode.methods) {
            for (AbstractInsnNode instruction = method.instructions.getFirst();
                 instruction != null;
                 instruction = instruction.getNext()) {
                if (instruction instanceof LdcInsnNode
                        && WRONG_PLANET_IMAGE.equals(((LdcInsnNode) instruction).cst)) {
                    ((LdcInsnNode) instruction).cst = PLANET_IMAGE;
                    replacements++;
                }
            }
        }
        if (replacements != 1) {
            throw new IllegalStateException(
                    "Expected one planet-image typo, found " + replacements);
        }
    }

    private static void patchOptionalLight(ClassNode classNode) {
        MethodNode initializer = null;
        for (MethodNode method : classNode.methods) {
            if ("<clinit>".equals(method.name) && "()V".equals(method.desc)) {
                initializer = method;
                break;
            }
        }
        if (initializer == null) {
            throw new IllegalStateException("Could not locate bv.<clinit>()");
        }

        LdcInsnNode resource = null;
        for (AbstractInsnNode instruction = initializer.instructions.getFirst();
             instruction != null;
             instruction = instruction.getNext()) {
            if (instruction instanceof LdcInsnNode
                    && "/bg/light.png".equals(((LdcInsnNode) instruction).cst)) {
                resource = (LdcInsnNode) instruction;
                break;
            }
        }
        if (resource == null) {
            throw new IllegalStateException("Could not locate optional light resource");
        }

        AbstractInsnNode load = nextOpcode(resource);
        AbstractInsnNode store = nextOpcode(load);
        if (!(load instanceof MethodInsnNode)
                || load.getOpcode() != Opcodes.INVOKESTATIC
                || !"l".equals(((MethodInsnNode) load).owner)
                || !"b".equals(((MethodInsnNode) load).name)
                || !(store instanceof FieldInsnNode)
                || store.getOpcode() != Opcodes.PUTSTATIC
                || !"bv".equals(((FieldInsnNode) store).owner)
                || !"A".equals(((FieldInsnNode) store).name)) {
            throw new IllegalStateException("Unexpected optional light bytecode shape");
        }

        LabelNode noLight = new LabelNode();
        LabelNode done = new LabelNode();

        InsnList guard = new InsnList();
        guard.add(new FieldInsnNode(Opcodes.GETSTATIC, "en", "b", "I"));
        guard.add(new InsnNode(Opcodes.ICONST_1));
        guard.add(new JumpInsnNode(Opcodes.IF_ICMPLE, noLight));
        initializer.instructions.insertBefore(resource, guard);

        InsnList fallback = new InsnList();
        fallback.add(new JumpInsnNode(Opcodes.GOTO, done));
        fallback.add(noLight);
        fallback.add(new InsnNode(Opcodes.ACONST_NULL));
        fallback.add(new FieldInsnNode(
                Opcodes.PUTSTATIC,
                "bv",
                "A",
                "Ljavax/microedition/lcdui/Image;"));
        fallback.add(done);
        initializer.instructions.insert(store, fallback);
    }

    private static AbstractInsnNode nextOpcode(AbstractInsnNode instruction) {
        AbstractInsnNode current = instruction.getNext();
        while (current != null && current.getOpcode() < 0) {
            current = current.getNext();
        }
        return current;
    }
}
