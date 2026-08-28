#!/bin/sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

# Xóa cache server list mỗi lần chạy để tránh auto-connect vào VT15 (offline)
# Game sẽ dùng built-in list (VT1-VT11). Server sẽ push lại VT15 sau khi login.
RMS_DIR="$HOME/.microemulator/suite-DragonBoy"
for RMS_KEY in vjsvselect vjNRlink3; do
    if [ -f "$RMS_DIR/$RMS_KEY.rs" ]; then
        rm -f "$RMS_DIR/$RMS_KEY.rs"
        echo "[run] Cleared $RMS_KEY"
    fi
done

exec java -jar "$PROJECT_DIR/libs/microemulator.jar" \
    --resizableDevice 480 320 \
    "$PROJECT_DIR/dist/DragonBoy250-Mod.jar"
