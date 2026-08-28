#!/bin/sh
# runmod.sh — Build mod và chạy game trong 1 lệnh
# Dùng: ./runmod.sh

set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)

if [ -z "$PROJECT_DIR" ] || [ "$PROJECT_DIR" = "/" ]; then
    echo "Invalid project directory" >&2
    exit 1
fi

"$PROJECT_DIR/buildmod.sh"
exec "$PROJECT_DIR/run-pc.sh"
