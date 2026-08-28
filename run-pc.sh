#!/bin/sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

# Giữ NRlink3 để không làm mất danh sách mới do server gửi về. Nếu máy chủ đã
# chọn đang bảo trì và client bị auto-connect lặp, chạy:
#   NRO_RESET_SERVER=1 ./run-pc.sh
# Lệnh này chỉ quên server đang chọn; tài khoản và danh sách server vẫn được giữ.
if [ "${NRO_RESET_SERVER:-0}" = "1" ]; then
    RMS_DIR="$HOME/.microemulator/suite-DragonBoy"
    if [ -f "$RMS_DIR/vjsvselect.rs" ]; then
        rm -f "$RMS_DIR/vjsvselect.rs"
        echo "[run] Reset selected server"
    fi
fi

if [ "${NRO_AUTO_LOGIN:-0}" = "1" ]; then
    exec java -Dnro.autologin=true -jar "$PROJECT_DIR/libs/microemulator.jar" \
        --resizableDevice 480 320 \
        "$PROJECT_DIR/dist/DragonBoy250-Mod.jar"
fi

exec java -jar "$PROJECT_DIR/libs/microemulator.jar" \
    --resizableDevice 480 320 \
    "$PROJECT_DIR/dist/DragonBoy250-Mod.jar"
