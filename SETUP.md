# NRO-Mod — Hướng dẫn setup từ đầu cho người mới

Tài liệu này dành cho người **chưa có gì**, vừa pull code về lần đầu.

---

## Yêu cầu hệ điều hành

- **Linux** (Ubuntu / Linux Mint / Debian hoặc tương tự)
- Có kết nối internet để cài Java

---

## Bước 1 — Clone repo

```bash
git clone <URL_REPO> ~/Projects/NRO-Mod
cd ~/Projects/NRO-Mod
```

> Sau khi clone, thư mục đã có sẵn toàn bộ:
> - `original/DragonBoy250.jar` — JAR gốc (không bao giờ sửa)
> - `decompiled/` — source CFR để đọc
> - `modsrc/` — source mod để sửa
> - `patchwork/` — bytecode patcher
> - `libs/microemulator.jar` — J2ME emulator
> - `tools/cfr.jar`, `asm.jar`, `asm-tree.jar` — công cụ build
> - `original/DragonBoy250.jar` — base duy nhất; build sẽ tự áp toàn bộ patch cần thiết
> - `buildmod.sh` — script build 1 lệnh
> - `run-pc.sh` — script chạy game

**Không cần tải thêm gì khác**, chỉ cần cài Java 8.

---

## Bước 2 — Cài Java 8

```bash
sudo apt update
sudo apt install openjdk-8-jdk -y
```

Kiểm tra:

```bash
java -version
javac -version
```

Kết quả cần thấy:

```
openjdk version "1.8.0_xxx"
javac 1.8.0_xxx
```

### Nếu máy đã có nhiều phiên bản Java

Chọn Java 8 làm mặc định:

```bash
sudo update-alternatives --config java
sudo update-alternatives --config javac
```

Gõ số tương ứng với `java-8-openjdk` rồi Enter.

---

## Bước 3 — Cấp quyền thực thi cho script

```bash
cd ~/Projects/NRO-Mod
chmod +x buildmod.sh run-pc.sh
```

---

## Bước 4 — Build bản mod lần đầu

```bash
cd ~/Projects/NRO-Mod
./buildmod.sh
```

Nếu thành công sẽ thấy:

```
[1/6] Compile modsrc
[2/6] Compile bytecode patchers
[3/6] Patch client compatibility and diagnostics
[4/6] Patch server list and selection
[5/6] Build DragonBoy250-Mod.jar
[6/6] Verify required classes
AutoAttackMod.class
AutoBeanMod.class
CharacterSpeedMod.class
bs.class
cq.class
dg.class
ev.class
p.class
Built: .../dist/DragonBoy250-Mod.jar
```

---

## Bước 5 — Chạy game

```bash
cd ~/Projects/NRO-Mod
./run-pc.sh
```

Cửa sổ MicroEmulator mở ra → bấm **Start** → game chạy.

### Lệnh gộp (build + chạy ngay):

```bash
cd ~/Projects/NRO-Mod && ./buildmod.sh && ./run-pc.sh
```

---

## Kiểm tra nhanh sau khi chạy

| Dấu hiệu | Nghĩa |
|---|---|
| Game load màn hình chọn server | ✅ Bình thường |
| Terminal in `>>connect: <IP>:<PORT>` | ✅ Đang kết nối |
| Terminal in `====> getKey true` | ✅ Handshake thành công |
| Màn hình login hiện ra | ✅ Vào được |

---

## Cấu trúc thư mục quan trọng

```
NRO-Mod/
├── original/DragonBoy250.jar   ← JAR gốc — KHÔNG SỬA
├── decompiled/                 ← Source CFR — CHỈ ĐỌC
├── modsrc/                     ← Code mod — SỬA Ở ĐÂY
│   ├── br.java
│   ├── cf.java
│   ├── cq.java
│   ├── dg.java
│   ├── AutoAttackMod.java
│   ├── AutoBeanMod.java
│   ├── CharacterSpeedMod.java
│   ├── ConnectionStabilityMod.java
│   └── TimeUtil.java
├── patchwork/                  ← Bytecode patch (ASM)
│   ├── PatchAutoBean.java
│   ├── PatchClientInfo.java
│   ├── PatchHotNetworkLogs.java
│   ├── PatchServerList.java
│   └── PatchServerSelection.java
├── libs/microemulator.jar      ← J2ME emulator
├── tools/                      ← CFR, ASM
├── dist/
│   └── DragonBoy250-Mod.jar    ← Output sau build
├── build/classes/              ← Class sinh ra sau compile
├── buildmod.sh                 ← Build script
└── run-pc.sh                   ← Chạy game
```

---

## Các tính năng mod hiện có

### Chat lệnh trong game

| Lệnh (gõ vào chat) | Chức năng |
|---|---|
| `ts` | Bật/tắt auto đánh quái |
| `buffdau 10` | Tự dùng đậu khi HP ≤ 10 |
| `buffdau 0` | Tắt auto đậu |

### Tính năng mặc định bật

| Tính năng | Ghi chú |
|---|---|
| Tốc độ nhân vật tăng | Mặc định speed 6 (gốc là 4) |
| Fix getWidth/getHeight | Game hiển thị đúng trên PC |

---

## Workflow hằng ngày khi sửa mod

```
1. Sửa file trong modsrc/
2. Lưu (Ctrl+S)
3. ./buildmod.sh && ./run-pc.sh
4. Test trong game
5. Chưa đúng → quay lại bước 1
```

---

## Xử lý lỗi thường gặp

### `javac: command not found`

```bash
sudo apt install openjdk-8-jdk -y
```

### `Error: Unable to access jarfile libs/microemulator.jar`

```bash
ls libs/
```

Nếu thiếu → repo chưa clone đủ:

```bash
git pull
```

### `./buildmod.sh: Permission denied`

```bash
chmod +x buildmod.sh run-pc.sh
```

### `[1/6] Compile modsrc` — lỗi compile

Đọc thông báo lỗi, sửa đúng file trong `modsrc/`.  
Không sửa file trong `decompiled/`.

### Game báo "Máy chủ tắt hoặc mất sóng [2]"

Máy chủ đã chọn có thể đang bảo trì. Chạy lệnh sau để chỉ quên máy chủ đang
chọn, không xóa tài khoản hay danh sách máy chủ:

```bash
NRO_RESET_SERVER=1 ./run-pc.sh
```

Mod tự dừng vòng kết nối sau ba lỗi liên tiếp và mở danh sách máy chủ; lệnh
trên hữu ích khi muốn quên lựa chọn đã lưu ngay từ lúc khởi động.

Sau khi build bằng `./buildmod.sh`, VT15 xuất hiện ngay cả khi cache danh sách
chưa kịp được máy chủ cập nhật.

### Terminal in `Socket connect failed to <IP>:<PORT>`

IP đó không kết nối được. Thoát game, chọn server khác.

---

## Ghi chú quan trọng

> ⚠️ **KHÔNG** dùng `jar uf original/DragonBoy250.jar` — giữ JAR gốc nguyên vẹn
>
> ⚠️ **KHÔNG** compile cả thư mục `decompiled/` — chỉ compile file trong `modsrc/`
>
> ✅ JAR output luôn là `dist/DragonBoy250-Mod.jar`
>
> ✅ Base JAR dùng để build là `original/DragonBoy250.jar`; script tự vá cả session chính và session tải dữ liệu

---

## Thêm tính năng mới

1. Tạo file mới trong `modsrc/MyFeature.java`
2. Thêm lệnh gọi trong class phù hợp (thường là `modsrc/dg.java` trong game loop)
3. Build lại: `./buildmod.sh`

Tham khảo tài liệu chi tiết hơn:
- `README.md` — bản đồ toàn bộ 155 class
- `NRO_Mod_Full_Setup_Fix_Guide.md` — lịch sử từng bước fix
- `UPDATE.md` — changelog các thay đổi

---

*Setup xong. Chỉ cần `./buildmod.sh && ./run-pc.sh` mỗi lần muốn chạy.*
