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
PATCH_WORK=$(mktemp -d "$PROJECT_DIR/build/auto-bean-patch.XXXXXX")
PATCH_TOOLS="$PATCH_WORK/tools"
PATCH_INPUT="$PATCH_WORK/input"
OUTPUT_TMP="$PATCH_WORK/DragonBoy250-Mod.jar"

cleanup() {
    rm -rf "$PATCH_WORK"
}
trap cleanup EXIT HUP INT TERM

rm -rf "$BUILD_CLASSES"
mkdir -p "$BUILD_CLASSES" "$PATCH_TOOLS" "$PATCH_INPUT"

echo "[1/5] Compile modsrc"
javac \
    -source 8 \
    -target 8 \
    -cp "$PROJECT_DIR/original/DragonBoy250.jar:$PROJECT_DIR/libs/microemulator.jar" \
    -d "$BUILD_CLASSES" \
    "$PROJECT_DIR"/modsrc/*.java

echo "[2/5] Compile auto-bean bytecode patcher"
javac \
    -source 8 \
    -target 8 \
    -cp "$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    -d "$PATCH_TOOLS" \
    "$PROJECT_DIR/patchwork/PatchAutoBean.java"

echo "[3/5] Patch p.c() auto-bean call"
(
    cd "$PATCH_INPUT"
    jar xf "$BASE_JAR" p.class
)
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAutoBean \
    "$PATCH_INPUT/p.class" \
    "$BUILD_CLASSES/p.class"

echo "[4/5] Build DragonBoy250-Mod.jar"
cp "$BASE_JAR" "$OUTPUT_TMP"
jar uf "$OUTPUT_TMP" -C "$BUILD_CLASSES" .

echo "[5/5] Verify required classes"
JAR_ENTRIES="$PATCH_WORK/jar-entries.txt"
jar tf "$OUTPUT_TMP" > "$JAR_ENTRIES"
for REQUIRED_CLASS in AutoAttackMod AutoBeanMod CharacterSpeedMod cq dg p; do
    if ! grep -qx "$REQUIRED_CLASS.class" "$JAR_ENTRIES"; then
        echo "Missing required class: $REQUIRED_CLASS.class" >&2
        exit 1
    fi
    echo "$REQUIRED_CLASS.class"
done

mv "$OUTPUT_TMP" "$OUTPUT_JAR"
echo "Built: $OUTPUT_JAR"
