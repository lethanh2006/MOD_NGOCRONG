#!/bin/sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)
BUILD_CLASSES="$PROJECT_DIR/build/classes"
BASE_JAR="$PROJECT_DIR/dist/DragonBoy250-Debug4.jar"
OUTPUT_JAR="$PROJECT_DIR/dist/DragonBoy250-Mod.jar"

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

mkdir -p "$PROJECT_DIR/build"
PATCH_WORK=$(mktemp -d "$PROJECT_DIR/build/mod-patch.XXXXXX")
PATCH_TOOLS="$PATCH_WORK/tools"
PATCH_INPUT="$PATCH_WORK/input"
OUTPUT_TMP="$PATCH_WORK/DragonBoy250-Mod.jar"

cleanup() {
    rm -rf "$PATCH_WORK"
}
trap cleanup EXIT HUP INT TERM

rm -rf "$BUILD_CLASSES"
mkdir -p "$BUILD_CLASSES" "$PATCH_TOOLS" "$PATCH_INPUT"

echo "[1/6] Compile modsrc"
javac \
    -source 8 \
    -target 8 \
    -cp "$BASE_JAR:$PROJECT_DIR/libs/microemulator.jar" \
    -d "$BUILD_CLASSES" \
    "$PROJECT_DIR"/modsrc/*.java

echo "[2/6] Compile bytecode patchers"
javac \
    -source 8 \
    -target 8 \
    -cp "$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    -d "$PATCH_TOOLS" \
    "$PROJECT_DIR/patchwork/PatchAuthDiagnostics.java" \
    "$PROJECT_DIR/patchwork/PatchAutoBean.java" \
    "$PROJECT_DIR/patchwork/PatchResourceWarnings.java" \
    "$PROJECT_DIR/patchwork/PatchSensitiveLogs.java" \
    "$PROJECT_DIR/patchwork/PatchServerList.java" \
    "$PROJECT_DIR/patchwork/PatchServerSelection.java"

echo "[3/6] Patch p.c() auto-bean call"
(
    cd "$PATCH_INPUT"
    jar xf "$BASE_JAR" ac.class af.class bv.class p.class bs.class bt.class ev.class x.class
)
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAutoBean \
    "$PATCH_INPUT/p.class" \
    "$BUILD_CLASSES/p.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAuthDiagnostics \
    "$PATCH_INPUT/ac.class" \
    "$BUILD_CLASSES/ac.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchResourceWarnings \
    "$PATCH_INPUT/af.class" \
    "$BUILD_CLASSES/af.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchResourceWarnings \
    "$PATCH_INPUT/bv.class" \
    "$BUILD_CLASSES/bv.class"

echo "[4/6] Patch server list and selection"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchServerList \
    "$PATCH_INPUT/bs.class" \
    "$BUILD_CLASSES/bs.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchServerSelection \
    "$PATCH_INPUT/ev.class" \
    "$BUILD_CLASSES/ev.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchSensitiveLogs \
    "$PATCH_INPUT/bt.class" \
    "$BUILD_CLASSES/bt.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchSensitiveLogs \
    "$PATCH_INPUT/x.class" \
    "$BUILD_CLASSES/x.class"

echo "[5/6] Build DragonBoy250-Mod.jar"
cp "$BASE_JAR" "$OUTPUT_TMP"
jar uf "$OUTPUT_TMP" -C "$BUILD_CLASSES" .

echo "[6/6] Verify required classes"
JAR_ENTRIES="$PATCH_WORK/jar-entries.txt"
jar tf "$OUTPUT_TMP" > "$JAR_ENTRIES"
for REQUIRED_CLASS in AuthDiagnostics AutoAttackMod AutoBeanMod AutoLoginMod CharacterSpeedMod ac af ay br bs bt bv cf cq ct dg ev p x; do
    if ! grep -qx "$REQUIRED_CLASS.class" "$JAR_ENTRIES"; then
        echo "Missing required class: $REQUIRED_CLASS.class" >&2
        exit 1
    fi
    echo "$REQUIRED_CLASS.class"
done

if ! javap -classpath "$OUTPUT_TMP" -p bs \
        | grep -q 'nro\$ensureUniverse15'; then
    echo "Missing Universe 15 patch marker in bs.class" >&2
    exit 1
fi

mv "$OUTPUT_TMP" "$OUTPUT_JAR"
echo "Built: $OUTPUT_JAR"
