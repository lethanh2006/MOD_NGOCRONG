# UPDATE.md — Quy trình sửa mod, build lại và chạy NRO Mod

Tài liệu này mô tả quy trình làm việc hiện tại của project `NRO-Mod`, từ lúc sửa code trong `modsrc/` đến lúc compile, cập nhật `.class` vào JAR mod và chạy bằng MicroEmulator.

---

## 1. Cấu trúc project

Project hiện tại được tổ chức như sau:

```text
NRO-Mod/
├── decompiled/                 # Source decompile từ JAR gốc, chỉ dùng để đọc/tham khảo
├── modsrc/                     # Nơi viết và sửa code mod
│   ├── AutoAttackMod.java
│   ├── cf.java
│   ├── CharacterSpeedMod.java
│   ├── cq.java
│   ├── dg.java
│   └── TimeUtil.java
├── original/
│   └── DragonBoy250.jar        # JAR game gốc, KHÔNG chỉnh trực tiếp
├── libs/
│   └── microemulator.jar       # MicroEmulator + J2ME API
├── build/
│   └── classes/                # Class được tạo ra sau khi compile
├── patchwork/                  # Dùng khi cần patch bytecode trực tiếp
├── dist/
│   ├── DragonBoy250-Debug4.jar # JAR base đã fix để chạy MicroEmulator
│   └── DragonBoy250-Mod.jar    # JAR mod được build để chạy
├── tools/
└── README.md
```

### Quy tắc quan trọng

- `decompiled/`: chỉ để **đọc và phân tích code gốc**.
- `modsrc/`: nơi **thực sự sửa code mod**.
- `original/DragonBoy250.jar`: luôn giữ nguyên để làm bản chuẩn.
- `build/classes/`: kết quả compile.
- `dist/DragonBoy250-Mod.jar`: file mod cuối cùng để chạy.
- `patchwork/`: chỉ dùng khi source CFR không compile được và phải sửa bytecode.

---

# 2. Khi muốn sửa một chức năng

Ví dụ đang muốn chỉnh tốc độ nhân vật.

File mod hiện tại:

```text
modsrc/CharacterSpeedMod.java
```

Mở file và sửa biến tốc độ, ví dụ:

```java
private static int targetSpeed = 8;
```

Sau đó lưu file.

Nếu đang dùng VS Code:

```text
Ctrl + S
```

Nếu đang dùng IntelliJ:

```text
Ctrl + S
```

---

# 3. Khi muốn mod một class mới từ code gốc

Không sửa trực tiếp trong `decompiled/`.

Ví dụ muốn mod `br.java`.

Copy nó sang `modsrc/`:

```bash
cd ~/Projects/NRO-Mod
cp decompiled/br.java modsrc/br.java
```

Sau đó chỉ sửa:

```text
modsrc/br.java
```

`decompiled/br.java` vẫn được giữ nguyên để đối chiếu với code gốc.

---

# 4. Compile toàn bộ code mod

Đứng tại thư mục project:

```bash
cd ~/Projects/NRO-Mod
```

Xóa class cũ:

```bash
rm -rf build/classes
mkdir -p build/classes
```

Compile tất cả file `.java` trong `modsrc/`:

```bash
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  $(find modsrc -name '*.java')
```

Nếu compile thành công, Terminal thường không in lỗi.

Kiểm tra các class vừa tạo:

```bash
find build/classes -type f
```

Ví dụ:

```text
build/classes/AutoAttackMod.class
build/classes/cf.class
build/classes/CharacterSpeedMod.class
build/classes/cq.class
build/classes/dg.class
build/classes/TimeUtil.class
```

---

# 5. Tạo lại JAR mod

Project hiện đang dùng:

```text
dist/DragonBoy250-Debug4.jar
```

làm JAR base vì bản này đã chứa các fix cần thiết để chạy trên MicroEmulator.

Copy base thành bản mod:

```bash
cp dist/DragonBoy250-Debug4.jar dist/DragonBoy250-Mod.jar
```

Sau đó đưa toàn bộ class vừa compile vào JAR:

```bash
jar uf dist/DragonBoy250-Mod.jar -C build/classes .
```

Lệnh trên sẽ ghi đè những `.class` đã tồn tại và thêm những class mod mới.

Ví dụ:

```text
dg.class                 → ghi đè dg.class cũ
cf.class                 → ghi đè cf.class cũ
cq.class                 → ghi đè cq.class cũ
AutoAttackMod.class      → thêm class mới vào JAR
CharacterSpeedMod.class  → thêm class mới vào JAR
TimeUtil.class           → thêm class mới vào JAR
```

---

# 6. Kiểm tra class mod đã có trong JAR chưa

Ví dụ kiểm tra class chỉnh tốc độ:

```bash
jar tf dist/DragonBoy250-Mod.jar | grep CharacterSpeedMod
```

Kết quả mong muốn:

```text
CharacterSpeedMod.class
```

Kiểm tra một số class khác:

```bash
jar tf dist/DragonBoy250-Mod.jar \
  | grep -E 'CharacterSpeedMod|dg.class|bf.class|cf.class|TimeUtil'
```

---

# 7. Chạy bản mod

Chạy bằng MicroEmulator:

```bash
java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```

Sau khi MicroEmulator mở:

```text
DragonBoy
→ Start
```

---

# 8. Lệnh duy nhất dùng sau mỗi lần chỉnh code

Sau khi chỉnh tốc độ hoặc sửa bất kỳ file nào trong `modsrc/`, có thể chạy một lệnh duy nhất:

```bash
cd ~/Projects/NRO-Mod && \
rm -rf build/classes && \
mkdir -p build/classes && \
javac -source 8 -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  $(find modsrc -name '*.java') && \
cp dist/DragonBoy250-Debug4.jar dist/DragonBoy250-Mod.jar && \
jar uf dist/DragonBoy250-Mod.jar -C build/classes . && \
java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```

Quy trình của lệnh trên:

```text
Sửa code
   ↓
xóa build cũ
   ↓
compile modsrc
   ↓
copy JAR base
   ↓
ghi đè class mod mới
   ↓
mở MicroEmulator
```

Nếu compile bị lỗi, chuỗi lệnh sẽ dừng tại `javac` vì dùng `&&`.

---

# 9. Khuyên dùng script `runmod.sh`

Để không phải copy lệnh dài mỗi lần, tạo:

```bash
cd ~/Projects/NRO-Mod
nano runmod.sh
```

Nội dung:

```bash
#!/bin/bash

set -e

cd "$(dirname "$0")"

echo "======================================"
echo "  NRO MOD - BUILD & RUN"
echo "======================================"

echo
echo "[1/4] Cleaning..."
rm -rf build/classes
mkdir -p build/classes

echo
echo "[2/4] Compiling modsrc..."
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  $(find modsrc -name '*.java')

echo
echo "[3/4] Updating DragonBoy250-Mod.jar..."
cp dist/DragonBoy250-Debug4.jar \
   dist/DragonBoy250-Mod.jar

jar uf dist/DragonBoy250-Mod.jar \
  -C build/classes .

echo
echo "Compiled classes:"
find build/classes -type f

echo
echo "[4/4] Starting MicroEmulator..."
java -jar libs/microemulator.jar \
  dist/DragonBoy250-Mod.jar
```

Cấp quyền chạy:

```bash
chmod +x runmod.sh
```

Sau đó mỗi lần chỉnh code chỉ cần:

```bash
./runmod.sh
```

---

# 10. Workflow hằng ngày nên dùng

Ví dụ muốn đổi tốc độ.

### Bước 1 — sửa code

```text
modsrc/CharacterSpeedMod.java
```

Ví dụ:

```java
targetSpeed = 8;
```

đổi thành:

```java
targetSpeed = 12;
```

### Bước 2 — lưu file

```text
Ctrl + S
```

### Bước 3 — build và chạy

Nếu đã tạo `runmod.sh`:

```bash
cd ~/Projects/NRO-Mod
./runmod.sh
```

Hoặc dùng lệnh đầy đủ ở mục 8.

### Bước 4 — test trong game

Kiểm tra xem chức năng vừa sửa đã hoạt động đúng chưa.

Nếu chưa đúng:

```text
Sửa modsrc
→ Ctrl + S
→ ./runmod.sh
→ test lại
```

---

# 11. Nếu chỉ muốn compile mà chưa chạy game

Có thể dùng:

```bash
cd ~/Projects/NRO-Mod && \
rm -rf build/classes && \
mkdir -p build/classes && \
javac -source 8 -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  $(find modsrc -name '*.java') && \
cp dist/DragonBoy250-Debug4.jar dist/DragonBoy250-Mod.jar && \
jar uf dist/DragonBoy250-Mod.jar -C build/classes .
```

Sau đó chạy game sau bằng:

```bash
java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```

---

# 12. Khi compile bị lỗi

Nếu:

```bash
javac ...
```

báo lỗi thì **không tiếp tục update JAR**.

Ví dụ:

```text
error: cannot find symbol
error: incompatible types
error: long cannot be dereferenced
```

Đây thường là lỗi do CFR decompile không hoàn hảo.

Cách xử lý:

1. Không sửa file trong `decompiled/`.
2. Sửa bản copy trong `modsrc/`.
3. Nếu code decompile quá lỗi, xem bytecode gốc:

```bash
javap \
  -classpath original/DragonBoy250.jar \
  -c -p TenClass
```

Ví dụ:

```bash
javap \
  -classpath original/DragonBoy250.jar \
  -c -p bt
```

---

# 13. Khi source không thể compile

Một số class decompile có thể chứa code không hợp lệ, ví dụ:

```java
inputStream.read(null);
```

Trong trường hợp đó:

```text
decompiled/
   ↓
javap bytecode gốc
   ↓
patchwork/
   ↓
patch trực tiếp .class
   ↓
đưa .class patched vào JAR
```

Không nhất thiết phải compile lại toàn bộ game.

---

# 14. Lưu ý khi tạo class mod mới

Nếu một class gốc gọi class mod mới, ví dụ:

```java
CharacterSpeedMod.update();
```

thì trong JAR cuối cùng bắt buộc phải có:

```text
CharacterSpeedMod.class
```

Nếu thiếu sẽ gặp:

```text
java.lang.NoClassDefFoundError: CharacterSpeedMod
```

Do đó sau mỗi build nên kiểm tra:

```bash
jar tf dist/DragonBoy250-Mod.jar \
  | grep CharacterSpeedMod
```

---

# 15. Không ghi đè JAR gốc

Không bao giờ dùng:

```bash
jar uf original/DragonBoy250.jar ...
```

Luôn build vào:

```text
dist/DragonBoy250-Mod.jar
```

JAR gốc:

```text
original/DragonBoy250.jar
```

phải được giữ nguyên để:

- đối chiếu bytecode,
- khôi phục khi mod lỗi,
- làm dependency lúc compile,
- kiểm tra hành vi gốc.

---

# 16. Sử dụng auto đánh quái bằng chat `ts`

Khi đang ở màn hình chơi, mở chat và gửi:

```text
ts
```

- Lần đầu: bật tự động tìm và đánh quái.
- Lần tiếp theo: tắt tự động đánh quái.
- Có thể viết `TS` hoặc thêm khoảng trắng đầu/cuối.
- Đây là lệnh cục bộ của mod nên chữ `ts` không được gửi lên server.

Mod tái sử dụng nhánh auto train có sẵn trong `p.c()`: client tự tìm mob còn sống, chọn skill đang sẵn sàng và đánh theo cooldown. Khi test nên kiểm tra thêm các tình huống hết mana, mob chết/chuyển mục tiêu, đổi map, nhân vật chết và server kéo lại vị trí.

Các file tham gia:

```text
modsrc/cq.java             # bắt lệnh ở cả Enter và nút Gửi
modsrc/AutoAttackMod.java  # trạng thái bật/tắt và hook auto train
modsrc/dg.java             # gọi hook trước/sau mỗi game tick
```

---

# 17. Git sau khi mod chạy ổn

Khi một thay đổi chạy ổn:

```bash
git status
git add modsrc README.md UPDATE.md
git commit -m "Update character speed mod"
git push
```

Nên commit từng chức năng nhỏ để dễ rollback.

---

# Tóm tắt nhanh

Sau mỗi lần sửa code:

```text
1. Sửa file trong modsrc/
2. Lưu file
3. Compile modsrc/
4. Copy Debug4.jar → Mod.jar
5. Update .class vào Mod.jar
6. Chạy MicroEmulator
7. Test
```

Lệnh tiện nhất:

```bash
./runmod.sh
```

Hoặc dùng một lệnh:

```bash
cd ~/Projects/NRO-Mod && rm -rf build/classes && mkdir -p build/classes && javac -source 8 -target 8 -cp "original/DragonBoy250.jar:libs/microemulator.jar" -d build/classes $(find modsrc -name '*.java') && cp dist/DragonBoy250-Debug4.jar dist/DragonBoy250-Mod.jar && jar uf dist/DragonBoy250-Mod.jar -C build/classes . && java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```
