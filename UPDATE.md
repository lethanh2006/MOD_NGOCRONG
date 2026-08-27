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
│   ├── AutoBeanMod.java
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
│   └── PatchAutoBean.java      # Chặn ngưỡng ăn đậu 20% của auto train gốc
├── dist/
│   ├── DragonBoy250-Debug4.jar # JAR base đã fix để chạy MicroEmulator
│   └── DragonBoy250-Mod.jar    # JAR mod được build để chạy
├── tools/
├── buildmod.sh                 # Build Java mod + patch p.class + đóng gói JAR
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

> Lưu ý: riêng tính năng `buffdau` còn cần patch `p.class`. Vì vậy để tạo JAR chạy được đầy đủ, dùng `./buildmod.sh`; chỉ chạy `javac modsrc/*.java` là chưa đủ.

Kiểm tra các class vừa tạo:

```bash
find build/classes -type f
```

Ví dụ:

```text
build/classes/AutoAttackMod.class
build/classes/AutoBeanMod.class
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
AutoBeanMod.class        → thêm class mới vào JAR
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

Sau khi sửa code, build đầy đủ rồi chạy game bằng:

```bash
cd ~/Projects/NRO-Mod && \
./buildmod.sh && \
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
patch p.c() bằng PatchAutoBean
   ↓
copy JAR base
   ↓
ghi đè class mod mới
   ↓
mở MicroEmulator
```

Nếu compile hoặc patch bị lỗi, script dừng và không tạo JAR mới từ kết quả lỗi.

---

# 9. Script `buildmod.sh`

Project đã có sẵn `buildmod.sh`. Script thực hiện đủ năm bước: compile `modsrc`, compile patcher ASM, patch `p.class`, đóng gói từ `DragonBoy250-Debug4.jar` và kiểm tra các class bắt buộc.

Cấp quyền chạy một lần:

```bash
chmod +x buildmod.sh
```

Sau đó build bằng:

```bash
./buildmod.sh
```

Script chỉ build, không tự mở game. Lệnh chạy nằm ở mục 7.

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

Build rồi chạy:

```bash
cd ~/Projects/NRO-Mod
./buildmod.sh
java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```

Hoặc dùng lệnh đầy đủ ở mục 8.

### Bước 4 — test trong game

Kiểm tra xem chức năng vừa sửa đã hoạt động đúng chưa.

Nếu chưa đúng:

```text
Sửa modsrc
→ Ctrl + S
→ ./buildmod.sh
→ chạy DragonBoy250-Mod.jar
→ test lại
```

---

# 11. Nếu chỉ muốn compile mà chưa chạy game

Có thể chỉ build JAR mà chưa mở game:

```bash
cd ~/Projects/NRO-Mod
./buildmod.sh
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

# 16. Sử dụng các lệnh mod trong chat

## 16.1 Auto đánh quái bằng `ts`

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

## 16.2 Tự dùng đậu thần bằng `buffdau`

Đặt ngưỡng HP theo số điểm máu còn lại:

```text
buffdau 10
```

Khi HP hiện tại còn tối đa 10 điểm, mod tự tìm đậu thần trong hành trang và gửi lệnh sử dụng. Có thể đổi `10` thành một ngưỡng HP nguyên không âm khác.

Tắt ngưỡng tùy chỉnh bằng:

```text
buffdau 0
```

Chi tiết kỹ thuật:

- Dùng `af.U` làm HP hiện tại và so sánh trực tiếp với ngưỡng trong lệnh.
- Bỏ qua khi nhân vật chết, đang ở trạng thái không thể dùng đậu hoặc HP đã đầy.
- Kích hoạt phím dùng đậu nội bộ để đi qua `p.H()`, dùng chung guard, cooldown 10 giây và hiệu ứng của game gốc.
- `p.H()` gọi `af.M()`: logic gốc tìm item có type `dd.b == 6` và gửi packet dùng item `-43`; không hard-code template ID đậu.
- Patch ASM chỉ bỏ qua call auto-đậu 20% nằm trong `p.c()` khi `buffdau` đang bật, tránh ăn sớm và tránh hai packet cùng tick. Khi `buffdau 0`, hành vi 20% gốc được giữ nguyên.
- Nếu hết đậu, mod báo một lần và tự nhận biết khi hành trang có đậu trở lại.
- `buffdau` là lệnh cục bộ, không được gửi lên server.

Các file tham gia:

```text
modsrc/cq.java          # bắt và chặn lệnh buffdau
modsrc/AutoBeanMod.java # parse ngưỡng, kiểm tra HP và dùng đậu
modsrc/dg.java          # gọi AutoBeanMod.update() mỗi game tick
patchwork/PatchAutoBean.java # bọc call auto-đậu gốc trong p.c()
```

---

# 17. Git sau khi mod chạy ổn

Khi một thay đổi chạy ổn:

```bash
git status
git add modsrc patchwork buildmod.sh README.md UPDATE.md
git commit -m "Add configurable auto bean command"
git push
```

Nên commit từng chức năng nhỏ để dễ rollback.

---

# Tóm tắt nhanh

Sau mỗi lần sửa code:

```text
1. Sửa file trong modsrc/
2. Lưu file
3. Chạy buildmod.sh
4. Script compile modsrc và patch p.class
5. Script tạo DragonBoy250-Mod.jar từ Debug4.jar
6. Chạy MicroEmulator
7. Test
```

Lệnh tiện nhất:

```bash
./buildmod.sh
```

Hoặc dùng một lệnh:

```bash
cd ~/Projects/NRO-Mod && ./buildmod.sh && java -jar libs/microemulator.jar dist/DragonBoy250-Mod.jar
```
