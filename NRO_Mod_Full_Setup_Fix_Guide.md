# NRO-Mod — Hướng dẫn đầy đủ từ setup đến mod, build, debug và fix lỗi

Tài liệu này ghi lại **toàn bộ quy trình thực tế đã làm với project NRO-Mod**:

- cài Java 8 trên Linux Mint
- cài IntelliJ IDEA bằng Terminal
- tạo project mod
- kiểm tra JAR J2ME
- decompile `DragonBoy250.jar`
- cấu hình IntelliJ
- thêm MicroEmulator/J2ME API
- fix lỗi IntelliJ không nhận `javax.microedition.*`
- chạy game bằng MicroEmulator
- fix lỗi `getWidth/getHeight`
- fix `res\info`
- trace lỗi socket bị đóng
- xác định `NullPointerException` trong `bt.c()`
- patch bytecode bằng ASM
- tổ chức `decompiled / modsrc / patchwork / dist`
- sửa code mod
- compile
- update `.class` vào JAR
- chạy lại game bằng một lệnh

> Project hiện tại:
>
> ```text
> ~/Projects/NRO-Mod
> ```

---

# 1. Mục tiêu của project

File gốc:

```text
DragonBoy250.jar
```

là một client **J2ME đã compile thành bytecode**, không phải source code gốc.

JAR này còn bị obfuscate nên phần lớn class có tên như:

```text
a.class
aa.class
ab.class
br.class
bt.class
dg.class
...
```

Mục tiêu là:

```text
DragonBoy250.jar
        ↓
decompile bằng CFR
        ↓
đọc code trong decompiled/
        ↓
tìm class/chức năng cần sửa
        ↓
copy class cần mod sang modsrc/
        ↓
sửa code
        ↓
javac
        ↓
.class mới
        ↓
ghi đè vào JAR mod
        ↓
MicroEmulator
        ↓
test
```

Không cần compile lại toàn bộ 155 source file.

---

# 2. Cài Java 8 trên Linux Mint

Cài:

```bash
sudo apt update
sudo apt install openjdk-8-jdk -y
```

Kiểm tra:

```bash
java -version
javac -version
```

Kết quả thực tế đã dùng:

```text
openjdk version "1.8.0_492"
OpenJDK Runtime Environment (build 1.8.0_492-...)
OpenJDK 64-Bit Server VM (...)
javac 1.8.0_492
```

Nếu có nhiều phiên bản Java:

```bash
sudo update-alternatives --config java
sudo update-alternatives --config javac
```

Đường dẫn JDK thường dùng trong IntelliJ:

```text
/usr/lib/jvm/java-8-openjdk-amd64
```

---

# 3. Kiểm tra file game

```bash
ls -lh ~/Downloads/DragonBoy250.jar
```

Ví dụ:

```text
-rw-rw-r-- 1 thanhle thanhle 1.4M ... DragonBoy250.jar
```

---

# 4. Kiểm tra Manifest J2ME

Chạy:

```bash
unzip -p ~/Downloads/DragonBoy250.jar META-INF/MANIFEST.MF
```

Kết quả:

```text
Manifest-Version: 1.0
MIDlet-Vendor: Team
MIDlet-Version: 2.5.0
MIDlet-1: DragonBoy,/icon.png,main.GameMidlet
MicroEdition-Configuration: CLDC-1.1
MIDlet-Name: DragonBoy
MicroEdition-Profile: MIDP-2.0
```

Thông tin quan trọng:

```text
MIDlet chính: main.GameMidlet
MIDP:         2.0
CLDC:         1.1
Version:      2.5.0
```

---

# 5. Tạo cấu trúc project

```bash
mkdir -p ~/Projects/NRO-Mod/{original,decompiled,tools,resources}
cp ~/Downloads/DragonBoy250.jar ~/Projects/NRO-Mod/original/

mkdir -p ~/Projects/NRO-Mod/libs
mkdir -p ~/Projects/NRO-Mod/modsrc
mkdir -p ~/Projects/NRO-Mod/build/classes
mkdir -p ~/Projects/NRO-Mod/dist
mkdir -p ~/Projects/NRO-Mod/patchwork
```

Cấu trúc nên giữ:

```text
NRO-Mod/
├── decompiled/       # code CFR để đọc
├── modsrc/           # code thực sự sửa và compile
├── original/
│   └── DragonBoy250.jar
├── libs/
│   └── microemulator.jar
├── build/
│   └── classes/
├── dist/
├── patchwork/
├── resources/
└── tools/
```

---

# 6. Cài `tree` để xem cấu trúc thư mục

```bash
sudo apt install tree -y
```

Dùng:

```bash
tree ~/Projects/NRO-Mod
```

---

# 7. Tải CFR và decompile JAR

Tải CFR:

```bash
cd ~/Projects/NRO-Mod/tools

wget https://www.benf.org/other/cfr/cfr-0.152.jar \
  -O cfr.jar
```

Decompile:

```bash
cd ~/Projects/NRO-Mod

java -jar tools/cfr.jar \
  original/DragonBoy250.jar \
  --outputdir decompiled
```

Kiểm tra:

```bash
find decompiled -type f | head -40
```

Đếm source:

```bash
find decompiled -name '*.java' | wc -l
```

Kết quả thực tế:

```text
155
```

Tìm `GameMidlet`:

```bash
find decompiled -iname '*GameMidlet*' -o -path '*/main/*'
```

Kết quả:

```text
decompiled/main/a.java
decompiled/main/GameMidlet.java
decompiled/main/b.java
```

---

# 8. Kiểm tra `GameMidlet.java`

```bash
sed -n '1,200p' \
  ~/Projects/NRO-Mod/decompiled/main/GameMidlet.java
```

Đoạn quan trọng:

```java
package main;

import javax.microedition.midlet.MIDlet;

public class GameMidlet extends MIDlet {
    public static String a = "112.213.94.23";
    public static int b = 14445;
    ...
}
```

CFR báo:

```text
Could not load the following classes:
javax.microedition.midlet.MIDlet
```

Đây không phải lỗi decompile.

Chỉ là CFR chưa có J2ME API khi decompile.

---

# 9. Cài IntelliJ IDEA bằng Terminal

## 9.1 Tải IntelliJ

```bash
cd ~/Downloads

curl -L \
  "https://download.jetbrains.com/product?code=IIU&latest&distribution=linux" \
  -o idea.tar.gz
```

---

## 9.2 Nếu mất mạng giữa chừng

Không cần tải lại từ đầu.

Resume bằng:

```bash
cd ~/Downloads

curl -L -C - \
  "https://download.jetbrains.com/product?code=IIU&latest&distribution=linux" \
  -o idea.tar.gz
```

---

## 9.3 Giải nén IntelliJ

```bash
sudo tar -xzf ~/Downloads/idea.tar.gz -C /opt/
```

Kiểm tra:

```bash
ls -d /opt/idea-*
```

Mở:

```bash
/opt/idea-*/bin/idea
```

---

# 10. Tạo icon IntelliJ trên Linux Mint

```bash
IDEA_DIR=$(find /opt -maxdepth 1 -type d -name 'idea-*' | head -n 1)

mkdir -p ~/.local/share/applications

cat > ~/.local/share/applications/intellij-idea.desktop <<EOF
[Desktop Entry]
Version=1.0
Type=Application
Name=IntelliJ IDEA
Comment=Java IDE
Exec=$IDEA_DIR/bin/idea
Icon=$IDEA_DIR/bin/idea.svg
Terminal=false
Categories=Development;IDE;
StartupNotify=true
EOF

chmod +x ~/.local/share/applications/intellij-idea.desktop

update-desktop-database ~/.local/share/applications
```

Test:

```bash
gtk-launch intellij-idea
```

---

# 11. Tạo lệnh `idea`

```bash
IDEA_DIR=$(find /opt -maxdepth 1 -type d -name 'idea-*' | head -n 1)

sudo ln -sf \
  "$IDEA_DIR/bin/idea" \
  /usr/local/bin/idea
```

Sau này mở project:

```bash
idea ~/Projects/NRO-Mod
```

---

# 12. Mở project trong IntelliJ

Trong IntelliJ:

```text
Open
```

chọn:

```text
/home/thanhle/Projects/NRO-Mod
```

Nếu hỏi Trust:

```text
Trust Project
```

---

# 13. Set Java 8 cho project

Vào:

```text
File
→ Project Structure
→ Project
```

Đặt:

```text
SDK:
1.8 / Java 8

Language level:
8
```

Nếu chưa có JDK:

```text
Add SDK
→ JDK
```

chọn:

```text
/usr/lib/jvm/java-8-openjdk-amd64
```

---

# 14. Kiểm tra những API J2ME game đang dùng

```bash
grep -Rho 'import javax\.microedition[^;]*;' \
  ~/Projects/NRO-Mod/decompiled \
  | sort -u
```

Kết quả:

```text
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;
```

Client chỉ dùng API J2ME cơ bản.

---

# 15. Tải MicroEmulator

```bash
mkdir -p ~/Projects/NRO-Mod/libs
cd ~/Projects/NRO-Mod/libs

wget \
  https://repo1.maven.org/maven2/org/microemu/microemulator/2.0.4/microemulator-2.0.4.jar \
  -O microemulator.jar
```

Kiểm tra J2ME API:

```bash
jar tf ~/Projects/NRO-Mod/libs/microemulator.jar \
  | grep 'javax/microedition' \
  | head -30
```

Kiểm tra riêng MIDlet:

```bash
jar tf ~/Projects/NRO-Mod/libs/microemulator.jar \
  | grep '^javax/microedition/midlet/MIDlet.class$'
```

Kết quả:

```text
javax/microedition/midlet/MIDlet.class
```

---

# 16. Test MicroEmulator library bằng `javac`

Tạo test:

```bash
cat > /tmp/TestJ2ME.java <<'EOF'
import javax.microedition.midlet.MIDlet;

public abstract class TestJ2ME extends MIDlet {
}
EOF
```

Compile:

```bash
javac \
  -cp ~/Projects/NRO-Mod/libs/microemulator.jar \
  /tmp/TestJ2ME.java
```

Nếu không báo error:

```text
microemulator.jar OK
Java 8 OK
J2ME API OK
```

---

# 17. Add `microemulator.jar` vào IntelliJ

Vào:

```text
File
→ Project Structure
→ Modules
→ NRO-Mod
→ Dependencies
```

Bấm:

```text
+
→ JARs or Directories
```

chọn:

```text
/home/thanhle/Projects/NRO-Mod/libs/microemulator.jar
```

Nếu IntelliJ hỏi loại:

```text
Classes
```

Scope:

```text
Compile
```

---

# 18. Lỗi IntelliJ vẫn đỏ `javax.microedition.*`

Đã gặp trường hợp:

```java
import javax.microedition.midlet.MIDlet;
```

vẫn đỏ dù:

```bash
javac -cp microemulator.jar ...
```

compile được.

Kiểm tra project:

```bash
grep -R "microemulator" \
  ~/Projects/NRO-Mod/.idea \
  ~/Projects/NRO-Mod/*.iml \
  2>/dev/null
```

Lúc đó file `.iml` có:

```xml
<root url="file://$MODULE_DIR$/libs/microemulator.jar" />
```

Sai ở chỗ IntelliJ đang coi JAR như file thường.

Phải là:

```xml
<root url="jar://$MODULE_DIR$/libs/microemulator.jar!/" />
```

---

# 19. Fix `.iml` và library XML

Backup:

```bash
cd ~/Projects/NRO-Mod

cp NRO-Mod.iml NRO-Mod.iml.backup

cp .idea/libraries/microemulator.xml \
   .idea/libraries/microemulator.xml.backup
```

Sửa `.iml`:

```bash
sed -i \
's#file://\$MODULE_DIR\$/libs/microemulator.jar#jar://\$MODULE_DIR\$/libs/microemulator.jar!/#g' \
~/Projects/NRO-Mod/NRO-Mod.iml
```

Sửa library XML:

```bash
sed -i \
's#file://\$PROJECT_DIR\$/libs/microemulator.jar#jar://\$PROJECT_DIR\$/libs/microemulator.jar!/#g' \
~/Projects/NRO-Mod/.idea/libraries/microemulator.xml
```

Sau đó trong IntelliJ:

```text
File
→ Invalidate Caches...
→ Invalidate and Restart
```

Sau fix:

```java
import javax.microedition.midlet.MIDlet;
```

hết đỏ.

---

# 20. Không compile toàn bộ `decompiled/`

Sau khi J2ME hết lỗi, vẫn thấy:

```text
Cannot resolve symbol 'br'
Cannot resolve symbol 'ac'
Cannot resolve symbol 'em'
Cannot resolve symbol 'dg'
```

Nguyên nhân:

`GameMidlet.java` có:

```java
package main;
```

nhưng nhiều class như:

```text
br.java
ac.java
em.java
dg.java
```

nằm ở default package.

Source decompile của CFR không thể compile nguyên project một cách sạch sẽ.

Vì vậy đổi workflow:

```text
decompiled/
→ chỉ đọc

modsrc/
→ code thực sự compile
```

Trong IntelliJ:

```text
decompiled
→ Unmark as Sources Root

modsrc
→ Mark Directory as
→ Sources Root
```

---

# 21. Add JAR game gốc làm dependency

Vào:

```text
File
→ Project Structure
→ Modules
→ Dependencies
```

Add:

```text
/home/thanhle/Projects/NRO-Mod/original/DragonBoy250.jar
```

Scope:

```text
Compile
```

Dependencies nên có:

```text
Java 8
DragonBoy250.jar
microemulator.jar
```

---

# 22. Chạy game gốc bằng MicroEmulator

```bash
cd ~/Projects/NRO-Mod

java -jar \
  libs/microemulator.jar \
  original/DragonBoy250.jar
```

MicroEmulator mở:

```text
Launcher
DragonBoy
```

Chọn:

```text
DragonBoy
→ Start
```

---

# 23. Lỗi game spam `getWidth/getHeight`

Terminal spam:

```text
DONT USE getHeight, PLEASE USE getHeightz()
dg.getHeight(null:-1)

DONT USE getWidth, PLEASE USE getWidthz()
dg.getWidth(null:-1)
```

Tìm code:

```bash
grep -Rni "DONT USE getWidth" decompiled
grep -Rni "DONT USE getHeight" decompiled
```

Kết quả:

```text
decompiled/dg.java
```

Code:

```java
public int getHeight() {
    System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
    return -1;
}

public int getWidth() {
    System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
    return -1;
}
```

MicroEmulator gọi trực tiếp `Canvas.getWidth/getHeight`.

Client trả `-1`, gây vấn đề.

---

# 24. Fix `dg.getWidth/getHeight`

Copy sang `modsrc`:

```bash
cd ~/Projects/NRO-Mod

cp decompiled/dg.java modsrc/dg.java
```

Sửa:

```java
public int getHeight() {
    return super.getHeight();
}

public int getWidth() {
    return super.getWidth();
}
```

Compile:

```bash
rm -rf build/classes/*
```

```bash
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  modsrc/dg.java
```

Tạo JAR:

```bash
cp original/DragonBoy250.jar \
  dist/DragonBoy250-Mod.jar
```

Update:

```bash
cd build/classes

jar uf \
  ../../dist/DragonBoy250-Mod.jar \
  dg.class
```

Chạy:

```bash
cd ~/Projects/NRO-Mod

java -jar \
  libs/microemulator.jar \
  dist/DragonBoy250-Mod.jar
```

Kết quả:

- game render UI được
- spam `getWidth/getHeight` biến mất

---

# 25. Lỗi `Resource not found [res\info]`

Terminal báo:

```text
Resource not found [res\info]
```

Tìm:

```bash
grep -Rni 'getResourceAsStream' decompiled
```

Kết quả:

```text
decompiled/ac.java
decompiled/bt.java
...
```

Hai dòng quan trọng:

```java
bt3.getClass().getResourceAsStream("res\\info");
```

và:

```java
this.getClass().getResourceAsStream("res\\info");
```

Kiểm tra JAR:

```bash
jar tf original/DragonBoy250.jar | grep -i 'info'
```

Kết quả:

```text
info
info.txt
```

Tức JAR có:

```text
info
```

ở root nhưng client tìm:

```text
res\info
```

---

# 26. Kiểm tra file `info`

```bash
unzip -p \
  original/DragonBoy250.jar \
  info \
  | xxd \
  | head -40
```

Kết quả bắt đầu:

```text
52 61 72 21 1a 07 ...
Rar!...
```

Nó là binary/RAR-like data.

---

# 27. Tạo alias resource để test

Tạo bản test:

```bash
cd ~/Projects/NRO-Mod

cp dist/DragonBoy250-Mod.jar \
   dist/DragonBoy250-Mod-infofix.jar
```

Dùng Python thêm alias:

```bash
python3 - <<'PY'
import zipfile

jar = "/home/thanhle/Projects/NRO-Mod/dist/DragonBoy250-Mod-infofix.jar"

with zipfile.ZipFile(jar, "a", compression=zipfile.ZIP_DEFLATED) as z:
    data = z.read("info")
    names = set(z.namelist())

    if r"res\info" not in names:
        z.writestr(r"res\info", data)

    if "res/info" not in names:
        z.writestr("res/info", data)

print("Đã thêm resource.")
PY
```

Sau đó lỗi:

```text
Resource not found [res\info]
```

không còn.

Nhưng game vẫn lỗi kết nối.

---

# 28. Lỗi popup `[500]` và `[2]`

Đã gặp:

```text
Có lỗi xảy ra. Xin hãy thử lại sau.[500]
```

và:

```text
Máy chủ tắt hoặc mất sóng [2]
```

Ban đầu tưởng server đóng connection.

Nhưng sau khi trace bằng `tcpdump` thì phát hiện:

```text
máy client gửi FIN trước
server vẫn còn gửi packet sau đó
```

Ví dụ:

```text
Out ... Flags [F.]
In  ... Flags [P.] length 119
```

=> Client tự đóng socket trước.

---

# 29. Kiểm tra server bằng `nc`

Ví dụ server:

```text
112.213.94.223:14445
```

Test:

```bash
nc -vz \
  112.213.94.223 \
  14445
```

Kết quả:

```text
Connection ... succeeded!
```

=> port server mở.

---

# 30. Kiểm tra hostname

```bash
getent ahostsv4 dragon7.teamobi.com
```

Kết quả:

```text
112.213.94.223
```

IP đúng với server list.

---

# 31. Server list trong `bs.java`

Tìm:

```bash
grep -RniE \
  '112\.213\.94\.(23|223)|14445' \
  decompiled
```

Thấy:

```text
Vũ trụ 1:112.213.94.23:14445
...
Vũ trụ 7:112.213.94.223:14445
...
```

---

# 32. Handshake `-27`

Trong `cf.java`, khi connect:

```java
br.a(cf2.a, new y(-27));
```

Client gửi packet:

```text
-27
```

Trong `s.java`, nếu nhận command:

```text
-27
```

thì gọi hàm lấy key.

Đoạn:

```java
this.a.k = new byte[n2];
...
this.a.j = true;

GameMidlet.c = y2.c().readUTF();
GameMidlet.d = y2.c().readInt();
GameMidlet.g = y2.c().readByte() != 0;

System.out.println(
    "====> getKey " +
    this.a.j +
    " co nect 2 is " +
    GameMidlet.g
);
```

Log:

```text
====> getKey true co nect 2 is false
```

=> handshake đã thành công.

---

# 33. Trace ai đóng socket

Copy `br.java`:

```bash
cp decompiled/br.java modsrc/br.java
```

CFR có lỗi:

```text
long cannot be dereferenced
```

vì `br` có field:

```java
long l;
```

và code lại gọi class `l.d()`.

---

# 34. Fix compile `br.java` bằng `TimeUtil`

Tạo:

```bash
cat > modsrc/TimeUtil.java <<'EOF'
final class TimeUtil {
    private TimeUtil() {
    }

    static long d() {
        return l.d();
    }
}
EOF
```

Thay:

```bash
sed -i \
  's/l\.d()/TimeUtil.d()/g' \
  modsrc/br.java
```

Xóa code CFR rác:

```bash
sed -i \
'/^[[:space:]]*object = iOException;[[:space:]]*$/d' \
modsrc/br.java
```

---

# 35. Chèn trace vào `br.f()`

```bash
python3 - <<'PY'
from pathlib import Path

p = Path("/home/thanhle/Projects/NRO-Mod/modsrc/br.java")
s = p.read_text()

marker = '    private void f() {\n'

trace = '''        System.out.println("========== BR.F() CLOSE CONNECTION ==========");
        System.out.println(
            "c=" + this.c +
            " d=" + this.d +
            " e=" + this.e +
            " j=" + this.j
        );
        new Exception("TRACE: WHO CLOSED BR CONNECTION").printStackTrace();
'''

if "TRACE: WHO CLOSED BR CONNECTION" not in s:
    s = s.replace(marker, marker + trace, 1)

p.write_text(s)
PY
```

Compile:

```bash
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  modsrc/TimeUtil.java \
  modsrc/br.java
```

---

# 36. Kết quả trace socket

Stack trace cho thấy lần đóng lỗi:

```text
at br.f(...)
at br.e(...)
at cf.run(...)
```

=> exception xảy ra trong `cf.run()`.

---

# 37. Patch `cf.java` để in exception thật

Copy:

```bash
cp decompiled/cf.java modsrc/cf.java
```

Thêm:

```java
catch (Exception exception) {
    System.out.println("========== CF.RUN EXCEPTION ==========");
    exception.printStackTrace();
    ...
}
```

CFR compile lỗi:

```text
possible lossy conversion from int to byte
new y(-27)
```

Fix:

```bash
sed -i \
  's/new y(-27)/new y((byte)-27)/g' \
  modsrc/cf.java
```

Compile:

```bash
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  modsrc/cf.java
```

---

# 38. Root cause thật: `NullPointerException` trong `bt.c()`

Sau khi chạy bản debug:

```text
========== CF.RUN EXCEPTION ==========

java.lang.NullPointerException
    at org.microemu.app.util.MIDletResourceInputStream.read(...)
    at bt.c(...)
    at ac.a(...)
    at cf.run(...)
```

=> socket bị đóng vì `bt.c()` crash.

---

# 39. CFR decompile `bt.c()` thành code rất bất thường

Source:

```java
InputStream inputStream =
    this.getClass().getResourceAsStream("res\\info");

if (inputStream != null) {
    inputStream.read(null);
    y2.d().writeShort((null).length);
    ((OutputStream)y2.d()).write(null);
}
```

Cần xác minh bằng bytecode.

---

# 40. Xem bytecode thật của `bt.class`

```bash
cd ~/Projects/NRO-Mod

javap \
  -classpath original/DragonBoy250.jar \
  -c -p bt \
  > /tmp/bt-bytecode.txt
```

Tìm:

```bash
grep -n \
  -A120 \
  -B30 \
  'res\\info' \
  /tmp/bt-bytecode.txt
```

Bytecode thật cũng có:

```text
aconst_null
invokevirtual InputStream.read:([B)I

aconst_null
arraylength

aconst_null
OutputStream.write:([B)V
```

=> bytecode gốc thật sự không chạy đúng trên JVM/MicroEmulator hiện tại.

---

# 41. Patch `bt.class` bằng ASM

Tải ASM:

```bash
cd ~/Projects/NRO-Mod/tools

wget \
  https://repo1.maven.org/maven2/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar \
  -O asm.jar

wget \
  https://repo1.maven.org/maven2/org/ow2/asm/asm-tree/9.7.1/asm-tree-9.7.1.jar \
  -O asm-tree.jar
```

---

# 42. Extract `bt.class`

```bash
cd ~/Projects/NRO-Mod

mkdir -p patchwork
cd patchwork

jar xf \
  ../dist/DragonBoy250-Debug2.jar \
  bt.class
```

---

# 43. Logic patch `bt.c()`

Mục tiêu biến:

```java
inputStream.read(null);
writeShort((null).length);
write(null);
```

thành:

```java
byte[] data = new byte[inputStream.available()];

inputStream.read(data);

y2.d().writeShort(data.length);

y2.d().write(data);
```

Và đổi:

```text
res\info
```

thành:

```text
res/info
```

---

# 44. Kiểm tra bytecode patched

Sau patch:

```bash
mkdir -p verify

cp \
  bt-patched.class \
  verify/bt.class

javap \
  -c \
  -p \
  verify/bt.class \
  > /tmp/bt-patched.txt
```

Kiểm tra:

```bash
grep -n \
  -A80 \
  -B10 \
  'res/info' \
  /tmp/bt-patched.txt
```

Bytecode patched đã có:

```text
res/info

aload_2
invokevirtual InputStream.available:()I

newarray byte

astore_3

aload_2
aload_3

invokevirtual InputStream.read:([B)I

aload_3
arraylength

aload_3
OutputStream.write:([B)V
```

Không còn `aconst_null` trong đoạn đọc resource.

---

# 45. Tạo JAR Debug4

```bash
cd ~/Projects/NRO-Mod

cp \
  dist/DragonBoy250-Debug2.jar \
  dist/DragonBoy250-Debug4.jar

cp \
  patchwork/bt-patched.class \
  patchwork/bt.class

cd patchwork

jar uf \
  ../dist/DragonBoy250-Debug4.jar \
  bt.class
```

Kiểm tra:

```bash
cd ~/Projects/NRO-Mod

javap \
  -classpath dist/DragonBoy250-Debug4.jar \
  -c -p bt \
  > /tmp/bt-debug4.txt

grep -n \
  -A45 \
  -B5 \
  'res/info' \
  /tmp/bt-debug4.txt
```

---

# 46. Bản base mod hiện tại

Sau toàn bộ fix, nên coi:

```text
dist/DragonBoy250-Debug4.jar
```

là **base phát triển**.

Mỗi lần build mod:

```text
Debug4.jar
   ↓ copy
DragonBoy250-Mod.jar
   ↓
update class mới
```

Không dùng lại:

```text
original/DragonBoy250.jar
```

làm base runtime vì nó chưa chứa các compatibility fix.

---

# 47. Cấu trúc mod cuối cùng

```text
NRO-Mod/
├── decompiled/
│   └── source CFR để đọc
│
├── modsrc/
│   ├── bf.java
│   ├── cf.java
│   ├── CharacterSpeedMod.java
│   ├── dg.java
│   └── TimeUtil.java
│
├── original/
│   └── DragonBoy250.jar
│
├── libs/
│   └── microemulator.jar
│
├── build/
│   └── classes/
│
├── dist/
│   ├── DragonBoy250-Debug4.jar
│   └── DragonBoy250-Mod.jar
│
├── patchwork/
│   ├── bt.class
│   ├── bt-patched.class
│   └── ...
│
├── resources/
└── tools/
```

---

# 48. Quy tắc khi viết mod

## Đọc code gốc

Đọc ở:

```text
decompiled/
```

Ví dụ:

```text
decompiled/br.java
decompiled/dg.java
decompiled/af.java
```

---

## Muốn sửa class

Không sửa trực tiếp `decompiled`.

Copy:

```bash
cp decompiled/br.java modsrc/br.java
```

Sau đó chỉ sửa:

```text
modsrc/br.java
```

---

## Nếu CFR decompile không compile được

Đối chiếu bytecode:

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

Nếu source không thể sửa bằng Java:

```text
patchwork/
```

và patch bytecode.

---

# 49. Ví dụ mod tốc độ nhân vật

File:

```text
modsrc/CharacterSpeedMod.java
```

Ví dụ có biến:

```java
private static int targetSpeed = 8;
```

Muốn nhanh hơn:

```java
private static int targetSpeed = 12;
```

Lưu:

```text
Ctrl + S
```

Sau đó build lại.

---

# 50. Compile toàn bộ code mod

```bash
cd ~/Projects/NRO-Mod

rm -rf build/classes
mkdir -p build/classes
```

Compile:

```bash
javac \
  -source 8 \
  -target 8 \
  -cp "original/DragonBoy250.jar:libs/microemulator.jar" \
  -d build/classes \
  $(find modsrc -name '*.java')
```

Nếu không có error:

```text
compile thành công
```

Kiểm tra:

```bash
find build/classes -type f
```

---

# 51. Tạo lại JAR mod

Dùng Debug4 làm base:

```bash
cd ~/Projects/NRO-Mod

cp \
  dist/DragonBoy250-Debug4.jar \
  dist/DragonBoy250-Mod.jar
```

Update tất cả class:

```bash
jar uf \
  dist/DragonBoy250-Mod.jar \
  -C build/classes .
```

---

# 52. Kiểm tra class mod có trong JAR

Ví dụ:

```bash
jar tf \
  dist/DragonBoy250-Mod.jar \
  | grep CharacterSpeedMod
```

Kết quả phải có:

```text
CharacterSpeedMod.class
```

Kiểm tra nhiều class:

```bash
jar tf \
  dist/DragonBoy250-Mod.jar \
  | grep -E \
  'CharacterSpeedMod|dg.class|bf.class|cf.class|TimeUtil'
```

---

# 53. Chạy bản mod

```bash
cd ~/Projects/NRO-Mod
./run-pc.sh
```

Sau đó:

```text
DragonBoy
→ Start
```

---

# 54. Một lệnh duy nhất: build + update + run

Sau mỗi lần sửa code:

```bash
cd ~/Projects/NRO-Mod && ./buildmod.sh && ./run-pc.sh
```

Không thay lệnh này bằng chuỗi `javac + cp Debug4 + jar uf`: chuỗi cũ không chạy các patcher ASM cho `p.class`, `bs.class` và `ev.class`.

---

# 55. Tạo `runmod.sh`

Tạo:

```bash
cd ~/Projects/NRO-Mod

cat > runmod.sh <<'EOF'
#!/bin/sh
set -eu

PROJECT_DIR=$(cd "$(dirname "$0")" && pwd)
"$PROJECT_DIR/buildmod.sh"
exec "$PROJECT_DIR/run-pc.sh"
EOF
```

Cấp quyền:

```bash
chmod +x runmod.sh
```

Sau này chỉ cần:

```bash
./runmod.sh
```

---

# 56. Workflow hằng ngày

Ví dụ chỉnh tốc độ:

```text
1. Mở modsrc/CharacterSpeedMod.java
2. sửa targetSpeed
3. Ctrl + S
4. ./runmod.sh
5. test game
6. chưa đúng → sửa tiếp → ./runmod.sh
```

---

# 57. Khi compile lỗi

Nếu gặp:

```text
cannot find symbol
incompatible types
long cannot be dereferenced
possible lossy conversion
```

Không sửa file trong:

```text
decompiled/
```

Sửa bản trong:

```text
modsrc/
```

Nếu code CFR vô lý:

```bash
javap \
  -classpath original/DragonBoy250.jar \
  -c -p TenClass
```

---

# 58. Khi tạo class mod mới

Ví dụ class gốc gọi:

```java
CharacterSpeedMod.update();
```

thì JAR cuối cùng bắt buộc chứa:

```text
CharacterSpeedMod.class
```

Nếu không:

```text
java.lang.NoClassDefFoundError
```

Kiểm tra:

```bash
jar tf \
  dist/DragonBoy250-Mod.jar \
  | grep CharacterSpeedMod
```

---

# 59. Không update vào JAR gốc

Không làm:

```bash
jar uf \
  original/DragonBoy250.jar \
  ...
```

Luôn giữ:

```text
original/DragonBoy250.jar
```

nguyên vẹn.

Chỉ update:

```text
dist/DragonBoy250-Mod.jar
```

---

# 60. Git workflow

Kiểm tra:

```bash
git status
```

Add:

```bash
git add \
  modsrc \
  README.md \
  UPDATE.md
```

Commit:

```bash
git commit \
  -m "Update mod"
```

Push:

```bash
git push
```

---

# 61. Bảng tổng hợp lỗi đã gặp

| Lỗi | Nguyên nhân | Cách fix |
|---|---|---|
| `javax.microedition.*` đỏ trong IntelliJ | IntelliJ khai báo JAR bằng `file://` | đổi thành `jar://...!/` + invalidate cache |
| `javac TestJ2ME` chạy được nhưng IntelliJ vẫn đỏ | lỗi config IDE, không phải library | kiểm tra `.iml` |
| game spam `DONT USE getWidth/getHeight` | `dg` override và trả `-1` | đổi sang `super.getWidth/getHeight()` |
| `Resource not found [res\info]` | JAR chỉ có `info` root | thêm alias resource + patch path |
| popup `[500]` / `[2]` | ban đầu tưởng server | tcpdump xác định client đóng socket trước |
| TCP server không phản hồi? | thực ra port vẫn mở | `nc -vz` xác nhận succeeded |
| handshake lỗi? | thực ra `-27` nhận key thành công | log `getKey true` |
| socket tự đóng | `cf.run()` catch exception | patch `cf.java` in stacktrace |
| `NullPointerException at bt.c()` | bytecode gọi `InputStream.read(null)` | patch `bt.class` bằng ASM |
| `long cannot be dereferenced` trong `br.java` | field `l` che class `l` | tạo `TimeUtil.d()` |
| `new y(-27)` compile lỗi | constructor nhận byte | `new y((byte)-27)` |
| `NoClassDefFoundError` class mod | quên add class mới vào JAR | `jar uf ... -C build/classes .` |

---

# 62. Lệnh debug hữu ích

## Tìm text trong source

```bash
grep -Rni "text" decompiled
```

---

## Tìm network

```bash
grep -RnlE \
  'SocketConnection|Connector\.open' \
  decompiled
```

---

## Tìm IO packet

```bash
grep -RnlE \
  'DataInputStream|DataOutputStream|readByte|writeByte' \
  decompiled
```

---

## Tìm Canvas

```bash
grep -RnlE \
  'extends Canvas|javax\.microedition\.lcdui\.Canvas' \
  decompiled
```

---

## Xem bytecode class

```bash
javap \
  -classpath original/DragonBoy250.jar \
  -c -p br
```

---

## Kiểm tra resource trong JAR

```bash
jar tf \
  original/DragonBoy250.jar \
  | grep 'info'
```

---

## Kiểm tra TCP

```bash
nc -vz \
  112.213.94.223 \
  14445
```

---

## Capture packet

```bash
sudo tcpdump \
  -i any \
  -nn \
  -tttt \
  'host 112.213.94.223 and tcp port 14445'
```

---

# 63. Quy tắc quan trọng nhất

```text
decompiled/
    ↓
chỉ đọc / phân tích

modsrc/
    ↓
sửa Java mod

patchwork/
    ↓
patch bytecode nếu CFR lỗi

build/classes/
    ↓
.class sau compile

dist/DragonBoy250-Debug4.jar
    ↓
base đã fix

dist/DragonBoy250-Mod.jar
    ↓
bản mod chạy thực tế

original/DragonBoy250.jar
    ↓
GIỮ NGUYÊN
```

---

# 64. Lệnh sử dụng nhiều nhất

Sau khi sửa code:

```bash
./buildmod.sh && ./run-pc.sh
```

Hoặc nếu đã tạo `runmod.sh` theo mục 55:

```bash
./runmod.sh
```

---

# 65. Kết luận

Workflow hiện tại nên giữ cố định:

```text
Đọc code gốc
    ↓
decompiled/

Copy class cần sửa
    ↓
modsrc/

Sửa logic
    ↓
javac

.class mới
    ↓
build/classes/

Copy Debug4 làm base
    ↓
DragonBoy250-Mod.jar

Update class
    ↓
jar uf

Chạy
    ↓
MicroEmulator

Test
    ↓
sửa tiếp
```

Với class CFR decompile lỗi nặng:

```text
javap
↓
đọc bytecode thật
↓
patchwork
↓
ASM
↓
.class patched
```

Không cố compile lại toàn bộ client nếu không cần.
