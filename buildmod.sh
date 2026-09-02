#!/bin/sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)
BUILD_CLASSES="$PROJECT_DIR/build/classes"
BASE_JAR="$PROJECT_DIR/original/DragonBoy250.jar"
OUTPUT_JAR="$PROJECT_DIR/dist/DragonBoy250-Mod.jar"
JAVA_OUTPUT_JAR="$PROJECT_DIR/dist/DragonBoy250-Mod-Java.jar"

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

mkdir -p "$PROJECT_DIR/build"
PATCH_WORK=$(mktemp -d "$PROJECT_DIR/build/mod-patch.XXXXXX")
PATCH_TOOLS="$PATCH_WORK/tools"
PATCH_INPUT="$PATCH_WORK/input"
PATCH_FIXED="$PATCH_WORK/fixed"
OUTPUT_TMP="$PATCH_WORK/DragonBoy250-Mod.jar"
JAVA_OUTPUT_TMP="$PATCH_WORK/DragonBoy250-Mod-Java.jar"

cleanup() {
    rm -rf "$PATCH_WORK"
}
trap cleanup EXIT HUP INT TERM

rm -rf "$BUILD_CLASSES"
mkdir -p "$BUILD_CLASSES" "$PATCH_TOOLS" "$PATCH_INPUT" "$PATCH_FIXED"

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
    "$PROJECT_DIR/patchwork/PatchClientInfo.java" \
    "$PROJECT_DIR/patchwork/PatchHotNetworkLogs.java" \
    "$PROJECT_DIR/patchwork/PatchPcCompatibility.java" \
    "$PROJECT_DIR/patchwork/PatchResourceWarnings.java" \
    "$PROJECT_DIR/patchwork/PatchSensitiveLogs.java" \
    "$PROJECT_DIR/patchwork/PatchServerList.java" \
    "$PROJECT_DIR/patchwork/PatchServerSelection.java"

echo "[3/6] Patch client compatibility and diagnostics"
(
    cd "$PATCH_INPUT"
    jar xf "$BASE_JAR" ac.class af.class bv.class p.class bs.class bt.class ev.class x.class info info.txt
)
mkdir -p "$PATCH_INPUT/res"
cp "$PATCH_INPUT/info" "$PATCH_INPUT/res/info"
cp "$PATCH_INPUT/info.txt" "$PATCH_INPUT/res/info-pc"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchClientInfo \
    "$PATCH_INPUT/ac.class" \
    "$PATCH_FIXED/ac.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchClientInfo \
    "$PATCH_INPUT/bt.class" \
    "$PATCH_FIXED/bt.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchPcCompatibility \
    "$PATCH_FIXED/ac.class" \
    "$PATCH_FIXED/ac-pc.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchPcCompatibility \
    "$PATCH_FIXED/bt.class" \
    "$PATCH_FIXED/bt-pc.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAutoBean \
    "$PATCH_INPUT/p.class" \
    "$BUILD_CLASSES/p.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAuthDiagnostics \
    "$PATCH_FIXED/ac-pc.class" \
    "$PATCH_FIXED/ac-diagnostics.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchHotNetworkLogs \
    "$PATCH_FIXED/ac-diagnostics.class" \
    "$BUILD_CLASSES/ac.class"
mkdir -p "$PATCH_FIXED/java"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchAuthDiagnostics \
    "$PATCH_FIXED/ac.class" \
    "$PATCH_FIXED/ac-java-diagnostics.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchHotNetworkLogs \
    "$PATCH_FIXED/ac-java-diagnostics.class" \
    "$PATCH_FIXED/java/ac.class"
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
    "$PATCH_FIXED/bt-pc.class" \
    "$BUILD_CLASSES/bt.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchSensitiveLogs \
    "$PATCH_FIXED/bt.class" \
    "$PATCH_FIXED/java/bt.class"
java \
    -cp "$PATCH_TOOLS:$PROJECT_DIR/tools/asm.jar:$PROJECT_DIR/tools/asm-tree.jar" \
    PatchSensitiveLogs \
    "$PATCH_INPUT/x.class" \
    "$BUILD_CLASSES/x.class"

echo "[5/6] Build DragonBoy250-Mod.jar"
cp "$BASE_JAR" "$OUTPUT_TMP"
jar uf "$OUTPUT_TMP" -C "$BUILD_CLASSES" .
jar uf "$OUTPUT_TMP" -C "$PATCH_INPUT" res/info
jar uf "$OUTPUT_TMP" -C "$PATCH_INPUT" res/info-pc
cp "$OUTPUT_TMP" "$JAVA_OUTPUT_TMP"
jar uf "$JAVA_OUTPUT_TMP" \
    -C "$PATCH_FIXED/java" ac.class \
    -C "$PATCH_FIXED/java" bt.class

echo "[6/6] Verify required classes"
JAR_ENTRIES="$PATCH_WORK/jar-entries.txt"
jar tf "$OUTPUT_TMP" > "$JAR_ENTRIES"
for REQUIRED_CLASS in AuthDiagnostics AutoAttackMod AutoBeanMod AutoLoginMod CharacterSpeedMod ConnectionStabilityMod ProtocolDiagnostics ac af ay br bs bt bv cf cq ct dg dw ev p s x; do
    if ! grep -qx "$REQUIRED_CLASS.class" "$JAR_ENTRIES"; then
        echo "Missing required class: $REQUIRED_CLASS.class" >&2
        exit 1
    fi
    echo "$REQUIRED_CLASS.class"
done

if javap -classpath "$OUTPUT_TMP" -c -p ac \
        | grep -Eq 'String (Receive message cmd |cmd= )'; then
    echo "Hot per-packet receive log is still present in ac.class" >&2
    exit 1
fi

if javap -classpath "$OUTPUT_TMP" -c -p br \
        | grep -Eq 'String (SEND MSG: |DO SEND MSG: )'; then
    echo "Hot per-packet send log is still present in br.class" >&2
    exit 1
fi

if ! grep -qx 'res/info' "$JAR_ENTRIES" \
        || ! grep -qx 'res/info-pc' "$JAR_ENTRIES"; then
    echo "Missing Java or PC client-info resource" >&2
    exit 1
fi

for PATCHED_CLASS in bt ac; do
    if ! javap -classpath "$OUTPUT_TMP" -c -p "$PATCHED_CLASS" \
            | grep -Eq '// String res/info-pc$'; then
        echo "Missing PC client-info profile in $PATCHED_CLASS.class" >&2
        exit 1
    fi
    if ! javap -classpath "$OUTPUT_TMP" -c -p "$PATCHED_CLASS" \
            | grep -q 'String Pc platform xxx'; then
        echo "Missing official PC platform profile in $PATCHED_CLASS.class" >&2
        exit 1
    fi
done

if javap -classpath "$OUTPUT_TMP" -c -p bt | grep -q 'Field aw.fB:B'; then
    echo "PC login still sends the Java language byte" >&2
    exit 1
fi

if ! javap -classpath "$JAVA_OUTPUT_TMP" -c -p bt \
        | grep -q 'Field aw.fB:B'; then
    echo "Java fallback login is missing its language byte" >&2
    exit 1
fi

for PATCHED_CLASS in bt ac; do
    if ! javap -classpath "$JAVA_OUTPUT_TMP" -c -p "$PATCHED_CLASS" \
            | grep -Eq '// String res/info$'; then
        echo "Missing Java fallback profile in $PATCHED_CLASS.class" >&2
        exit 1
    fi
done

PC_INFO_CHECK="$PATCH_WORK/info-pc.check"
unzip -p "$OUTPUT_TMP" res/info-pc > "$PC_INFO_CHECK"
if ! cmp -s "$PATCH_INPUT/info.txt" "$PC_INFO_CHECK"; then
    echo "PC info fingerprint does not match the official info_4 payload" >&2
    exit 1
fi

if ! javap -classpath "$OUTPUT_TMP" -p bs \
        | grep -q 'nro\$ensureUniverse15'; then
    echo "Missing Universe 15 patch marker in bs.class" >&2
    exit 1
fi

if ! javap -classpath "$OUTPUT_TMP" -p ev \
        | grep -q 'nro\$restoreSelectedServerFocus'; then
    echo "Missing persisted server focus patch marker in ev.class" >&2
    exit 1
fi

mv "$OUTPUT_TMP" "$OUTPUT_JAR"
mv "$JAVA_OUTPUT_TMP" "$JAVA_OUTPUT_JAR"
echo "Built PC profile: $OUTPUT_JAR"
echo "Built Java fallback: $JAVA_OUTPUT_JAR"
