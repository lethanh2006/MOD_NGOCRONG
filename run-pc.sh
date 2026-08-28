#!/bin/sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

# Reset server selection mỗi lần chạy để tránh auto-connect vào server lỗi
RMS_DIR="$HOME/.microemulator/suite-DragonBoy"
if [ -f "$RMS_DIR/vjsvselect.rs" ]; then
    rm -f "$RMS_DIR/vjsvselect.rs"
    echo "[run] Reset server selection cache"
fi

exec java -jar "$PROJECT_DIR/libs/microemulator.jar" \
    --resizableDevice 480 320 \
    "$PROJECT_DIR/dist/DragonBoy250-Mod.jar"
