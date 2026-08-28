# NRO-Mod — bản đồ source DragonBoy 2.5.0

Tài liệu này mô tả **trạng thái hiện tại của project**, luồng chạy của client và vai trò của 155 class trong `decompiled/`. Mục tiêu là giúp đọc đúng code gốc trước khi bắt đầu viết mod.

> Phạm vi đã đọc: 155 file Java, khoảng 52.462 dòng source CFR; manifest, resource và bytecode trong `original/DragonBoy250.jar`; các file hiện có trong `modsrc/`, `patchwork/`, `build/` và `dist/`.
>
> Tên như `GameScr`, `Char`, `Mob`, `Service` trong tài liệu là **tên dễ hiểu do suy ra từ hành vi**, không phải tên class thật trong JAR. Class thật vẫn là `p`, `af`, `aa`, `bt`, v.v.

## 1. Kết luận quan trọng nhất

- Đọc và tìm chức năng trong `decompiled/`.
- Chỉ copy class thật sự cần sửa sang `modsrc/`, rồi sửa bản copy.
- Không compile toàn bộ `decompiled/`: CFR đã làm hỏng nhiều method lớn.
- Với method nhỏ, source rõ ràng: có thể sửa Java rồi compile.
- Với packet dispatcher, state machine lớn hoặc source có `GOTO`, `void var...`, `null`: phải đối chiếu `javap`; nếu cần thì patch bytecode trong `patchwork/`.
- Luôn tạo JAR mod từ `original/DragonBoy250.jar`; không ghi đè JAR gốc.

Hai class cần thận trọng nhất là:

- `ac`: controller nhận packet. Hai method trung tâm không decompile được.
- `p`: gameplay screen. Input/update/action switch rất lớn và có nhiều đoạn CFR lỗi.

## 2. Cấu trúc project

| Thư mục/file | Vai trò | Có nên sửa trực tiếp? |
|---|---|---|
| `original/DragonBoy250.jar` | JAR chuẩn để đối chiếu và làm nền khi build | **Không** |
| `decompiled/` | Source CFR để đọc, tìm class và hiểu hành vi | **Không** |
| `decompiled/summary.txt` | Danh sách method CFR thừa nhận decompile thất bại | Chỉ đọc |
| `modsrc/` | Source của các class đang mod | **Có** |
| `patchwork/` | Tool và `.class` dùng khi phải sửa bytecode | **Có, nhưng phải kiểm tra bytecode** |
| `libs/` | Thư viện J2ME/MicroEmulator dùng khi compile | Không |
| `build/classes/` | Class sinh ra sau khi compile | Không sửa tay |
| `dist/` | Các JAR đã ghép để chạy thử | Không coi là source chuẩn |
| `tools/cfr.jar` | Decompiler CFR 0.152 | Không |
| `tools/asm*.jar` | ASM dùng cho bytecode patch | Không |

Project hiện chưa có build script tái lập toàn bộ quy trình và cũng không phải Git worktree. Vì vậy nên ghi lại mỗi thay đổi, class nào được thay và JAR nào chứa nó.

## 3. Kiến trúc tổng thể

```text
META-INF/MANIFEST.MF
        |
        v
main.GameMidlet.startApp()
        |
        +--> main.a          Canvas chính + game loop + điều phối UI
        |       |
        |       +--> main.a.E : bb screen hiện tại
        |       +--> az       menu overlay
        |       +--> g        panel inventory/skill/quest/clan/shop...
        |       +--> n/ae/eo  dialog, popup và chat/info overlay
        |
        +--> em -> bs -> ev/x -> cw/ab -> p
             splash server  login  create/select gameplay

UI hoặc gameplay
        |
        v
bt (Service tạo packet) -> br (Session) -> dw -> socket server
                                                |
                                                v
game state/UI <- ac + aj <- s (receiver/decrypt) <- socket server

p (GameScr)
  +--> af (Char), aa (Mob), do (Npc), ce (ItemMap)
  +--> bv (TileMap), bw (Waypoint), cz (BgItem)
  +--> item/skill/effect templates và cache resource
```

Ba trục chính cần nhớ:

1. `main.a` điều phối vòng lặp, input, screen và thứ tự vẽ overlay.
2. `p` giữ thế giới gameplay; `g` giữ phần lớn màn panel/chức năng người chơi.
3. `bt -> br -> s -> ac/aj` là đường đi của protocol.

## 4. Luồng khởi động

Manifest xác nhận client là J2ME MIDP 2.0 / CLDC 1.1, version `2.5.0`, entrypoint `main.GameMidlet`.

### 4.1 `GameMidlet.startApp()`

Trình tự khởi tạo thực tế:

1. Tạo `main.a`, là Canvas chính.
2. Khởi động thread chạy `dg.run()`.
3. Gắn singleton `ac.a()` làm listener cho cả session chính `br.a()` và session phụ `br.b()`.
4. Đặt session phụ không phải primary.
5. Nạp/reset splash `em`.
6. Gán splash làm screen hiện tại `main.a.E`.
7. Đưa Canvas lên `Display`.

Endpoint mặc định trong `GameMidlet` là `112.213.94.23:14445`, build/protocol là `248`. Đây chỉ là fallback: `bs` sẽ sớm ghi đè host/port theo server list và RMS.

`pauseApp()` và `destroyApp()` gần như rỗng. Hàm thoát riêng của `GameMidlet` dừng cờ vòng lặp, gọi GC và `notifyDestroyed()`.

### 4.2 Splash và server

- `em` hiển thị `/gamelogo.png` qua loader có prefix zoom `/x1`, `/x2`, ...
- Khoảng frame 30: đọc setting âm thanh/server chat, gọi `bs.f()` để đọc server list.
- Khoảng frame 150: chuyển sang `bs`.
- `bs` đọc `NRlink3` từ RMS; nếu không có thì parse danh sách server built-in.
- `svselect` chọn server gần nhất; `serverPriority` là fallback.
- Khi server được chọn, `bs` ghi lại `GameMidlet.a/b`, ngôn ngữ và mở primary session.

Server list built-in có hai bản tương ứng hostname và IPv4: 11 vũ trụ Việt Nam, võ đài liên vũ trụ, `Universe 1` và `Naga`. Mỗi entry có dạng:

```text
displayName:host:port:flag1:flag2:flag3
```

Cuối chuỗi có language code và priority index. Server cũng có thể thay danh sách này qua response `-29/sub2`, sau đó client cache lại vào `NRlink3`.

Luồng màn hình thông thường:

```text
em Splash
  -> bs ServerList
  -> ev chọn Việt Nam/Global và loại server
  -> x Login
  -> cw CreateChar nếu chưa có nhân vật
  -> ab SelectChar nếu server trả danh sách nhân vật
  -> p GameScr sau khi map được load
```

Server có thể mở thêm `aq` (radar), `ar` (đập bóng/capsule), `au` (di chuyển bằng tàu), `bi` (thông tin cá nhân) và `er` (form động).

## 5. Game loop, scale, input và thứ tự vẽ

### 5.1 Canvas và zoom

`dg` là Canvas/Runnable nền:

- Bật fullscreen.
- Chọn `en.b` từ 1 đến 4 theo diện tích màn hình vật lý.
- `m()`/`n()` trả kích thước logic đã chia zoom.
- Pointer vật lý cũng được chia `en.b` trước khi đưa vào game.
- Bản gốc cố ý làm `getWidth()`/`getHeight()` cảnh báo rồi trả `-1`, buộc code dùng kích thước logic. `modsrc/dg.java` hiện đã thay hành vi này bằng `super.getWidth()/getHeight()`.

Vòng lặp gọi update, `repaint()`, `serviceRepaints()` và cố giữ khoảng 27 ms/frame, tương đương gần 37 FPS.

### 5.2 Screen

`bb` là base screen:

- `b()` mở screen và gán `main.a.E = this`.
- `c()` update.
- `d()` xử lý input/softkey.
- `a(en)` paint.
- `cm`, `cn`, `co` lần lượt là command trái, giữa, phải.

`main.a` giữ:

- `E`: screen hiện tại.
- `F`: menu `az`.
- `G`: panel chính `g`.
- `H`: panel thứ hai trên màn hình rộng.
- `K`: dialog modal.
- `L`: message dialog.
- `M`: painter UI/softkey.

### 5.3 Thứ tự update

Trong một frame, overlay được update trước screen theo thứ tự gần đúng:

1. Popup/info đặc biệt `ae.n`, `ae.m`.
2. Dialog `K`.
3. Menu `F`.
4. Panel `G` và `H`.
5. Screen hiện tại `E.c()` và input `E.d()` nếu điều kiện cho phép.
6. Toast, info bubble và effect phụ.

Code overlay thường tự consume/reset input. Khi thêm auto action hoặc HUD, không nên giả định screen luôn là nơi đầu tiên nhận input.

### 5.4 Thứ tự paint

Các lớp được vẽ gần đúng như sau:

1. Screen hiện tại.
2. Panel `G/H` và chat field.
3. Debug/toast.
4. Dialog hoặc menu.
5. Info/chat bubble quanh nhân vật.
6. Effect và prompt.
7. Loading overlay.
8. Badge 18+, marquee và debug cuối.

HUD mod muốn nằm trên gameplay nhưng dưới dialog phải được chèn đúng tầng, không chỉ thêm vào cuối `paint()`.

### 5.5 Bàn phím và touch

Mảng phím chuẩn hóa có 15 phần tử:

| Index | Ý nghĩa |
|---:|---|
| 0..9 | Phím số tương ứng; 2/4/6/8 là hướng, 5 là fire/select |
| 10 | `*` |
| 11 | `#` |
| 12 | Softkey trái |
| 13 | Softkey phải |
| 14 | Action nội bộ do `p` tự bật; không map trực tiếp từ raw key |

`main.a.i` là one-shot/pressed, `main.a.j` là held; còn một mảng private làm release latch. Touch lưu tọa độ hiện tại, điểm nhấn đầu, trạng thái kéo và nhả. Kéo từ khoảng 10 px trở lên được coi là drag.

`main.b` là analog ảo. Nó tính góc chạm và bật các hướng 2/4/6/8, kể cả hướng chéo.

## 6. Chức năng hiện có theo nhóm

### 6.1 Server, tài khoản và nhân vật

- Danh sách server built-in và remote; chọn Việt Nam/Global, server chuẩn/Super.
- Nhớ server bằng RMS.
- Login account thật hoặc account ảo do server cấp.
- Remember account/password.
- Register account cơ bản.
- Tạo nhân vật: tên, hành tinh/phái, tóc; preview trên map 39/40/41.
- Danh sách/chọn nhân vật.
- Form thông tin cá nhân/KYC và form động do server gửi.
- Form nạp thẻ legacy hiện chủ yếu redirect website.

Account/password được lưu dưới dạng String trong RMS, không có lớp mã hóa riêng. `x.java` còn log cả `user` và `pass` ra console khi login. Nếu tạo bản phát hành thật, đây là hai điểm nên loại bỏ trước.

### 6.2 Gameplay trong `p`

`p` là `GameScr`, giữ camera, map và các vector có tên còn sót lại trong bytecode/source:

| Vector | Nội dung |
|---|---|
| `A` | `vClan` |
| `B` | `vFriend` |
| `C` | `vEnemies` |
| `D` | `vCharInMap` |
| `E` | `vItemMap` |
| `F` | `vMob` |
| `G` | `vNpc` |
| `H` | `vFlag` |

Chức năng chính:

- Di chuyển, camera, collision, waypoint/chuyển map.
- Focus Mob/Char/Npc/ItemMap.
- Chọn skill, đánh mob/người chơi, cooldown và projectile.
- Nhặt vật phẩm, popup NPC, chat bubble.
- HP/MP, tiền, sức mạnh/tiềm năng, skill shortcut và HUD.
- Pet/đệ tử, mount, aura, PK flag.
- Teleport/phi thuyền, background/weather/effect.

### 6.3 Panel `g`

`g.java` là class UI lớn nhất sau gameplay/character và chứa rất nhiều mode/tab:

- Hành trang, trang bị, rương đồ.
- Dùng/tháo/vứt/mua/bán vật phẩm.
- Chỉ số, cộng tiềm năng, skill và nâng skill.
- Nhiệm vụ, task order và achievement.
- Bản đồ.
- Shop, trade, combine, ký gửi.
- Clan: tìm/tạo/xin vào/mời/rời, thành viên, role, tin nhắn, donate.
- Friend, enemy, chat riêng, world chat.
- Radar, thông báo, account và setting.

Trên màn hình đủ rộng, client có thể tạo `main.a.H = new g()` để mở hai panel cạnh nhau, ví dụ inventory với trade/shop.

### 6.4 World và entity

- `af`: model nhân vật chung; `af.e()` là nhân vật chính, `af.f()` là pet/đệ tử.
- `aa`: mob thường.
- `do`: NPC; `k`: cây đậu thần.
- `ce`: item rơi trên map.
- `bw`: cổng/waypoint.
- `cc`, `an`, `d`, `cl`: mob/boss có state machine riêng.
- `al`: Mabu/nhân vật đặc biệt có animation nhiều mục tiêu.
- `bv`: tile map, terrain, collision, ground query và background item.

### 6.5 Item và skill

Item:

- `dd`: ItemTemplate.
- `h`: Item instance.
- `dn`: ItemOptionTemplate.
- `ee`: ItemOption.
- `dp`: registry template.

Skill:

- `da`: class/phái (`NClass`).
- `et`: SkillTemplate.
- `bf`: Skill instance/cooldown.
- `o`: registry skill.
- `ci`, `f`, `cv`, `by`: dữ liệu vẽ skill/arrow/dart.

Inventory không có một class riêng. Nó nằm trong nhiều mảng `h[]` của `af`, còn `g` chịu trách nhiệm hiển thị và gửi action.

### 6.6 Graphics, resource và effect

- `en`: wrapper `Graphics`, chịu trách nhiệm scale/clip/translate/drawRegion.
- `di`: bitmap font, wrap và căn chữ.
- `bl`: SmallImage cache theo ID.
- `as`: cache ảnh theo tên, có RMS và request server khi thiếu.
- `bn`: giải mã ảnh XOR 7-byte rồi fallback load ảnh thường.
- `df`/`eg`: sprite sheet/frame image.
- `ck`: EffectData; `cs`/`z`: frame và vùng ảnh.
- `dc`, `at`, `ax`, `ah`, `ea`, `ch`, `dh`, `ei`: các tầng effect/projectile.
- `ed`: rain/snow/fog/fire/water/background effect.

Resource trong JAR hiện gồm:

- 479 entry dưới `x1/`.
- `x1/mainImage` 144, `x1/bg` 93, `x1/mapBackGround` 64.
- `x1/effectdata` 52, `x1/e` 45, `x1/radar` 24.
- 6 file map offline cho map 39/40/41.
- 4 bitmap font ở `myfont/`.
- Root có `icon.png`, `info`, `info.txt` và các class.

## 7. Network và protocol

### 7.1 Các lớp

| Class | Vai trò |
|---|---|
| `y` | Message/packet, command signed byte và stream payload |
| `db` | Interface gửi/kết nối của session |
| `bd` | Callback connected/failed/disconnected/received |
| `ay` | Wrapper `SocketConnection` |
| `br` | Session; có primary và secondary singleton |
| `cf` | Worker mở socket và gửi handshake đầu |
| `ct` | Watchdog kết nối khoảng 20 giây |
| `dw` | Sender thread và hàng đợi |
| `s` | Receiver thread, framing và giải mã |
| `bt` | Service tạo outbound packet |
| `ac` | Controller packet chính |
| `aj` | Dispatcher bổ sung cho các command mới/effect/form |

### 7.2 Hai session

- `br.a()` là primary session.
- `br.b()` là secondary session cho resource/data lớn.
- Cả hai dùng cùng listener `ac`.
- `bt` có một field session mutable và đôi lúc đổi tạm sang secondary rồi đổi lại primary. Field này không được đồng bộ; gọi đồng thời từ nhiều thread có thể gửi nhầm session.

### 7.3 Bắt tay và XOR

1. `cf` mở socket và stream.
2. Khởi động `dw` và `s`.
3. Gửi command `-27` trực tiếp, chưa mã hóa.
4. Server trả key: length byte, key bytes, secondary host, port và flag.
5. Key được biến đổi tích lũy: `key[i + 1] ^= key[i]`.
6. Sau đó command, length và payload đều XOR theo một cursor liên tục; send và receive có cursor riêng.

Primary session dùng endpoint phụ server trả về để mở secondary session phục vụ data/resource khi điều kiện response cho phép.

Handshake phải được gửi trực tiếp vì sender queue chỉ drain sau khi session đã có key.

`br` XOR trực tiếp lên byte array của `y` khi gửi, nên object Message bị mutate sau lần send. Không enqueue lại cùng một `y`; hãy tạo message mới hoặc copy payload.

### 7.4 Framing

Frame thường dùng:

```text
1 byte command
2 byte payload length, big-endian
N byte payload
```

Sau handshake, từng byte command/length/payload đều đi qua XOR stream.

Riêng inbound command `-32`, `-66`, `11`, `-67`, `-74`, `-87`, `66`, `12` dùng length 3 byte. Receiver đọc ba byte thấp-vừa-cao rồi tính gần tương đương `len = (b3 << 16) | (b2 << 8) | b1`, sau bước decrypt/chuyển signed byte. Đây là các response ảnh/resource/template lớn. Không được đổi chúng về 2 byte khi sửa receiver.

`s` đọc xong payload rồi gọi `ac.a(message)` ngay trên receiver thread. Hệ quả:

- Controller đang mutate game state ngoài game-loop thread.
- Logger nặng, sleep, file I/O hoặc auto action blocking trong receiver có thể làm nghẽn socket.
- Logger không được đọc `message.c()` vì sẽ làm dịch cursor trước controller.
- Muốn dump raw payload, copy byte array trước khi parser đọc.

Khi EOF/lỗi xảy ra, receiver phân biệt failure rất sớm với disconnect sau khi phiên đã sống khoảng 500 ms rồi đóng session. Watchdog chủ yếu bảo vệ giai đoạn connect/handshake; nó không thay thế timeout cho mọi packet về sau.

### 7.5 Command đã xác định chắc chắn

Command là **signed byte** từ `-128` đến `127`. Cùng một ID có thể có payload khác nhau theo chiều hoặc subcommand.

#### System/auth/config

| ID | Chức năng/payload chính |
|---:|---|
| `-27` | Handshake key, gửi raw đầu phiên |
| `-29` | Envelope auth/config: sub 0 login, sub 1 register, sub 2 client type/capabilities |
| `-28` | Version/data envelope: create char, map/skill/item version và data |
| `-30` | Player/init envelope; sub 0 load nhân vật sau login, skill/stats/inventory/equipment |
| `-101` | Xin/cấp account ảo (`userAo`) |
| `-102` | Fallback login2 sang account/password RMS |
| `-120`, `-121` | Ping/latency streams |

Payload set-type (`-29/sub2`) gồm client type, zoom, kích thước logic, keyboard/touch, platform và version `2.5.0`, kèm optional info blob.

Login `-29/sub0` ghi user, password, version, login mode và language. Register `sub1` ghi user/password, có thể kèm account ảo và marker `"a"`; tham số version trong signature register hiện không được serialize.

#### Gameplay/entity

| ID | Chức năng/payload chính |
|---:|---|
| `-7` | Di chuyển; tile flag, x và y khi cần |
| `11` | Request template theo short ID; response có thể là packet lớn |
| `34` | Chọn skill |
| `-66` | Request skill/template lớn |
| `54` | Attack danh sách mob |
| `-60` | Attack danh sách player |
| `-4`, `67` | Attack hỗn hợp mob + player |
| `-59` | PvP action với player ID |
| `44` | Chat; inbound có player ID + text |
| `32`, `33` | NPC/menu interaction |
| `-34` | Magic tree/action |
| `-45` | Skill/action đặc biệt |

#### Trade, social, clan

| ID | Chức năng/payload chính |
|---:|---|
| `-86` | Trade: mời/chấp nhận/item/quantity/lock |
| `-81` | Combine danh sách item slot |
| `-80`, `-99` | Friend/social action |
| `-118` | Thách đấu player |
| `-125` | Form/captcha answers; inbound tạo form động |
| `-85` | Captcha character |
| `-46`..`-57` | Nhóm action clan: search/join/leave/invite/role/message/donate |
| `-100` | Ký gửi: đăng/mua/xóa/phân trang |

#### Resource/cache

| ID | Chức năng/payload chính |
|---:|---|
| `-87` | Request/update bộ data cache |
| `-74` | Request resource theo action |
| `-32` | Request image theo short ID |
| `66` | Request image theo tên |
| `-63` | Request bag image |
| `-111` | Gửi danh sách image source/version |
| `-110` | Trao đổi dynamic server-data với RMS |
| `-113`, `-114` | Đồng bộ state/data phụ |
| `-33` | Map offline |
| `-38`, `-39` | Load/finish load map |

`ac.a(y)` gọi `aj.a(y)` trước, sau đó mới dispatch core command. Cuối cùng message được đóng. Không nên thêm một switch thứ hai mà bỏ qua thứ tự này.

### 7.6 Điểm sửa theo mục tiêu

| Muốn mod | Nên đọc/sửa trước | Tránh |
|---|---|---|
| Đổi server/IP | `bs`, RMS `NRlink3`/`svselect` | Chỉ sửa `GameMidlet.a`, vì sẽ bị ghi đè |
| Log request semantic | Wrapper method trong `bt` | Copy nguyên `ac.java` |
| Log raw outbound | `br.b(y)` trước XOR | Reuse cùng `y` sau khi payload bị mutate |
| Log raw inbound | `s.run()` sau decrypt, trước `ac` | Đọc stream payload bằng `y.c()` |
| Login | `x`, `bt` command `-29/-101` | Sửa giant switch `ac` bằng source CFR |
| Resource | `bt`, secondary `br.b()`, `ac.f()` | Làm mất rule length 3 byte |

## 8. RMS, cache và version data

`eu` là wrapper J2ME `RecordStore`. Tên physical store được prefix bằng `vj`; ví dụ key `acc` trở thành store `vjacc`. Dữ liệu luôn nằm ở record số 1.

### 8.1 Key cấu hình

| Key | Nội dung |
|---|---|
| `svselect` | Server đang chọn |
| `NRlink3` | Danh sách server đã serialize |
| `NRlink_extra` | Link/preview nhân vật theo server |
| `acc`, `pass`, `check` | Account, password, remember flag |
| `userAo{server}` | Account ảo theo server |
| `clienttype`, `lastZoomlevel` | Client type và zoom |
| `serverchat`, `analog`, `lowGraphic` | Setting UI/gameplay |
| `isPlaySound`, `isPaintAura`, `isPaintAura2` | Âm thanh/aura |
| `ImageSource` | Version/danh sách ảnh nguồn |

### 8.2 Key data/template

| Nhóm | Key chính |
|---|---|
| Core data | `NR_dart`, `NR_arrow`, `NR_effect`, `NR_image`, `NR_part`, `NR_skill`, `NRdataVersion` |
| Map | `NRmap`, `NRmapVersion` |
| Skill table | `NRskill`, `NRskillVersion` |
| Item | `NRitem0`, `NRitem1`, `NRitem100`, `NRitem101` |
| Server-data động | Key là chuỗi decimal của integer server gửi |
| Image by name | `${zoom}ImgByName_${name}` |

Version negotiation nằm trong `-28/sub4`. Server gửi version data/map/skill/item; client so với bản trong RMS, request phần lệch rồi cache lại.

Loader quan trọng:

- `ac` đọc map name -> `bv.w`.
- NPC template -> `do.dg` (`ap[]`).
- Mob template -> `aa.c` (`dy[]`).
- Skill -> `da[]`, `et[]`, `bf[]`.
- Item -> `dn`, `dd`, `ee`.
- `p` đọc `NR_part` -> `av/w`, `NR_effect` -> `cp/eq`, `NR_arrow` -> `cv`, `NR_dart` -> `by`, `NR_skill` -> `ci/f`.

## 9. Bản đồ toàn bộ 155 class

Mức tin cậy:

- **C**: xác nhận trực tiếp từ quan hệ gọi, literal, loader hoặc bytecode.
- **M**: hành vi rõ nhưng tên alias có thể khác tên source gốc.
- **L**: DTO/marker ít được tham chiếu vì dispatcher decompile hỏng; không nên đặt tên mạnh.

### 9.1 Core, screen và UI

| Class | Tên dễ hiểu | Vai trò | Tin cậy |
|---|---|---|:---:|
| `main.GameMidlet` | MIDlet entry | Khởi tạo Canvas, session, controller và splash | C |
| `main.a` | GameCanvas | Global state, loop dispatch, input, paint/z-order, screen hiện tại | C |
| `main.b` | Analog | Joystick ảo, đổi góc chạm thành phím hướng | C |
| `dg` | BaseCanvas | Canvas/Runnable, fullscreen, zoom, frame pacing | C |
| `bb` | mScreen | Base class cho screen và 3 softkey command | C |
| `em` | SplashScr | Logo, trì hoãn boot, load config/server | C |
| `bs` | ServerListScreen | Parse/cache/chọn/kết nối server | C |
| `ev` | ServerScr | Chọn vùng và loại server | C |
| `x` | LoginScr | Login/register/remember/account ảo | C |
| `cw` | CreateCharScr | Tạo nhân vật và preview map 39/40/41 | C |
| `ab` | SelectCharScr | Danh sách nhân vật và vào game | C |
| `am` | ServerCharPreview | Preview nhân vật/map trước khi Play/chọn server | M |
| `a` | CardScreen legacy | Serial/code và redirect trang nạp thẻ | M |
| `aq` | RadarScr | Danh sách radar, sở hữu, progress/detail | C |
| `ar` | CrackBallScr | Minigame đập bóng/capsule, chọn/mua/reveal | M |
| `au` | TransportScr | Tàu/phi thuyền di chuyển, cho phép skip | M |
| `bi` | PersonalInfoScr | Form thông tin cá nhân/KYC | C |
| `er` | DynamicFormScr | Form nhiều field do server định nghĩa | C |
| `az` | Menu | Menu ngang, animation, drag/inertia, chạy `de` | C |
| `g` | Panel | Inventory/equip/skill/task/map/shop/trade/clan/social/settings | C |
| `de` | Command | Label, action ID, payload, callback và hitbox | C |
| `b` | IActionListener | Callback `a(int, Object)` | C |
| `bx` | IChatable | Callback chat `a(String,String)` và `D()` | C |
| `n` | Dialog | Base dialog/modal | C |
| `bc` | MessageDlg | Message dialog, wrap text, command, auto-close | C |
| `j` | InputDlg | Dialog chứa một `cd` | C |
| `cd` | TField | Text/numeric/password, multitap/qwerty/TextBox | C |
| `m` | TextBoxListener | Nhận text từ MIDP TextBox và trả về Canvas | C |
| `cq` | ChatTextField | Ô chat, send/close, throttle | C |
| `cx` | UI painter | Vẽ panel frame, button và softkey | C |
| `bp` | InfoDlg/toast | Thông báo/loading ở phía trên màn hình | C |
| `bo` | PopUp | Popup tương tác trong world và frame popup | C |
| `ae` | ChatPopup | Thoại NPC/server nhiều dòng, command tiếp tục và detail | C |
| `ej` | Info | Queue, wrap và vẽ từng `InfoItem`/speech bubble | C |
| `eo` | InfoMe | Định vị/animate chat-info bubble quanh nhân vật | C |
| `r` | InfoItem | Text + Char + duration/status/timestamp cho `ej`/`eo` | C |
| `ag` | Marquee | Chữ chạy trong vùng clip | C |
| `dv` | Scroll | Scroll list/grid, touch, inertia, selection | C |
| `bh` | VerticalScroll | Helper scroll dọc đơn giản | M |
| `ca` | ScrollResult | Kết quả press/drag/selected của scroll | C |
| `dz` | TimedPrompt | Prompt có countdown và hai command | C |
| `bu` | Game settings | Toggle aura, sound, low graphic, analog/server chat | C |
| `c` | IAP catalog | SKU, số ngọc và giá VND | C |
| `dr` | ClanIcon chooser | Lưới chọn icon/ảnh clan cho Panel | C |
| `aw` | mResources | Chuỗi giao diện Việt/Anh và khởi tạo theo language | C |
| `bz` | Indonesian resources | Ghi đè/khởi tạo bộ chuỗi Indonesia | C |

### 9.2 Network và persistence

| Class | Tên dễ hiểu | Vai trò | Tin cậy |
|---|---|---|:---:|
| `y` | Message | Signed command byte, input/output payload stream | C |
| `db` | ISession | Interface connect/send/disconnect | C |
| `bd` | IMessageHandler | Callback network | C |
| `ay` | SocketWrapper | Mở/đóng `SocketConnection` | C |
| `br` | Session | Primary/secondary session, XOR, queue và state | C |
| `cf` | Connector | Worker mở stream, start sender/receiver, gửi `-27` | C |
| `ct` | ConnectWatchdog | Timeout kết nối | C |
| `dw` | Sender | Hàng đợi outbound và thread gửi | C |
| `s` | MessageCollector | Receiver, decrypt và frame length | C |
| `bt` | Service | API outbound packet của toàn client | C |
| `ac` | Controller | Inbound dispatcher chính, loader template và update state | C |
| `aj` | ExtraController + particle | Dispatcher command mới; đồng thời bị gộp với model particle | C |
| `eu` | Rms | RecordStore wrapper, prefix `vj` | C |

### 9.3 World, entity và social model

| Class | Tên dễ hiểu | Vai trò | Tin cậy |
|---|---|---|:---:|
| `p` | GameScr | Gameplay/world screen, camera, HUD, input, entity lists | C |
| `bq` | IMapObject | Interface tọa độ/kích thước/trạng thái map object | C |
| `af` | Char | Player/pet model, movement/combat/stats/item/skill/render | C |
| `al` | Mabu/SpecialChar | Char đặc biệt với animation/effect nhiều mục tiêu | C |
| `aa` | Mob | Mob AI/state/HP/collision/attack/render | C |
| `an` | BachTuoc | Special mob template ID 71 | C |
| `cc` | BigBoss | Special mob template ID 70 | C |
| `d` | BigBoss2 | Special mob template ID 72 | C |
| `cl` | NewBoss | Boss dùng frame/state do server cấp | C |
| `do` | Npc | NPC dựa trên Char, popup/menu và animation | C |
| `k` | MagicTree | Cây đậu thần, level/cooldown/grow/collect | C |
| `ap` | NpcTemplate | ID, tên, head/body/leg và menu strings | C |
| `dy` | MobTemplate | Loại/speed/range/HP/name/EffectData/dart | C |
| `ce` | ItemMap | Item rơi, owner, tọa độ, aura và nhặt | C |
| `bv` | TileMap | Tile 24 px, terrain, collision, map state và paint | C |
| `bw` | Waypoint | Cổng/vùng chuyển map và auto-walk | C |
| `cz` | BgItem | Vật trang trí map, layer, footprint và image cache | C |
| `dl` | MapTemplate | Width/height/tile/type arrays và current items | C |
| `cn` | Teleport | Entity/effect phi thuyền, teleport và hố dịch chuyển | C |
| `dk` | PetFollow | Pet nhỏ/companion đi theo nhân vật | C |
| `es` | MobCaptcha | Mob captcha và animation riêng | C |
| `v` | FocusHint | Điều phối focus/click hint cho popup/mob/item/NPC | M |
| `bg` | PlayerData | DTO nhân vật ở SelectChar: id/parts/name/power | C |
| `q` | TopInfo | DTO leaderboard/ranking/player info | C |
| `e` | ClanMember | Thành viên, role, power, donate và thời gian | C |
| `eh` | ClanInfo | Clan id/icon/name/slogan/member/leader/level | C |
| `ak` | ClanImage | Cache/registry ảnh icon clan | C |
| `cb` | ClanMessage | Tin/request clan, paint và danh sách tối đa 20 | C |
| `ep` | PKFlag | Ánh xạ loại cờ PK sang image ID | C |
| `cg` | BattleInfo | State chiến trường/phụ bản, đội/điểm/time | C |
| `ef` | RadarInfo | DTO radar: rank/progress/icon/name/info/options/Char/Mob | C |
| `ao` | Achievement | Info, tiền thưởng, trạng thái hoàn thành/đã nhận | C |
| `ai` | Task + utility | Instance task; static parse byte/string/date/format | C |
| `ba` | GameInfo/news row | Tiêu đề/nội dung/RMS seen-id/read flag | C |
| `cr` | TaskOrder | Task ID, count/max, tên, mô tả, kill ID và map ID | C |

### 9.4 Item, skill và dữ liệu vẽ combat

| Class | Tên dễ hiểu | Vai trò | Tin cậy |
|---|---|---|:---:|
| `h` | Item | Item instance, options/template/qty/price/state | C |
| `dd` | ItemTemplate | ID/type/gender/name/description/require/icon/part | C |
| `ee` | ItemOption | Param + option template, format mô tả | C |
| `dn` | ItemOptionTemplate | ID, format tên và type | C |
| `dp` | ItemTemplates | Registry ItemTemplate theo short ID | C |
| `ec` | Item state record | Record ngắn hạn parse cùng Char; source mất phần lớn field | L |
| `dt` | Empty marker | Marker liên quan `ec`, không còn hành vi rõ | L |
| `bf` | Skill | Skill instance, level/cooldown/mana/damage/info | C |
| `et` | SkillTemplate | ID/name/type/icon/description và level skills | C |
| `da` | NClass | Class/phái và danh sách SkillTemplate | C |
| `o` | Skills registry | Hashtable skill theo short ID | C |
| `ci` | SkillPaint | Animation ground/fly khi skill trúng mục tiêu | C |
| `f` | SkillInfoPaint | Frame/status/effect/offset/arrow data | C |
| `cv` | ArrowPaint | Sprite IDs theo hướng | C |
| `dq` | Arrow | Projectile từ Char tới Mob/Char focus | C |
| `by` | DartInfo | Head/tail/border/offset/speed/update data | C |
| `bj` | PlayerDart | Homing dart và trail của player | C |
| `ah` | MonsterDart | Projectile/damage của mob/server | C |
| `dx` | Dart trail point | Tọa độ/frame của trail | C |
| `cu` | Effect binding | Gắn frame effect vào Mob/Char | C |

### 9.5 Graphics, effect, resource và utility

| Class | Tên dễ hiểu | Vai trò | Tin cậy |
|---|---|---|:---:|
| `en` | mGraphics | Wrapper Graphics và logical zoom | C |
| `di` | mFont | Bitmap font, width/wrap/alignment/colors | C |
| `cj` | StaticObj | Anchor/layout constants MIDP | C |
| `l` | mSystem | Image/platform/time/dimension helper | M |
| `ds` | Res/Util | Math/trig/random/string/number/log helpers | C |
| `el` | MyVector | Named synchronized Vector wrapper | C |
| `t` | MyHashTable | Synchronized Hashtable wrapper | C |
| `i` | ClanObject | DTO clan ID/code gồm hai số nguyên | C |
| `be` | Position | Record x/y/anchor/state dùng cho particle/radar | C |
| `dm` | MovePoint | Điểm đích và trạng thái trong queue di chuyển | C |
| `co` | ActionPayload | Ba integer truyền qua command callback | M |
| `cm` | Rect/effect record | Metadata vùng/frame nhiều integer + flag | L |
| `ek` | Empty template marker | Entry loader còn class nhưng field đã bị tối ưu mất | L |
| `bl` | SmallImage | Load/cache/request/vẽ sprite theo ID | C |
| `eg` | SpriteFrame | Image + frame dimensions và drawRegion | M |
| `df` | FrameImage | Sprite sheet và cắt/vẽ frame | C |
| `as` | ImgByName | Cache RAM/RMS, retry request và purge ảnh cũ | C |
| `bm` | Image cache record | Image, last-use, retry và frame count | C |
| `bn` | Encrypted image loader | XOR-decode resource rồi fallback ảnh thường | C |
| `u` | ImageSource registry | Version/list image source và RMS `ImageSource` | C |
| `ad` | FireWorkEff + resource | Mở InputStream; instance tạo cụm particle pháo hoa | C |
| `av` | Part | Các `w[]` cho head/body/leg/bag animation | C |
| `w` | PartImage | SmallImage ID và offset x/y | C |
| `dc` | Effect2 | Base effect và các vector/layer effect | C |
| `at` | ServerEffect | Effect gắn Char/Mob hoặc tọa độ map | C |
| `ax` | EffectPanel | Effect frame loop tại tọa độ | C |
| `cp` | EffectCharPaint | Mảng frame `eq[]` | C |
| `eq` | EffectInfoPaint | Image ID và offset frame | C |
| `ck` | EffectData | Parse sprite/frame/animation và paint | C |
| `cs` | Effect frame data | Offset arrays và image index từng frame | C |
| `z` | ImageInfo | Slice x/y/w/h trong EffectData | M |
| `ea` | Dynamic effect | Effect instance/layer/loop và tải effectdata | C |
| `ei` | Effect manager | Vector `ea`, update/paint/remove theo layer | C |
| `ch` | EffectEnd | Combat effect nâng cao/multi-point | C |
| `bk` | Effect particle | Particle/frame state dùng bởi `ch` | M |
| `dh` | Effect layers | 4 vector low/mid/mid2/high cho `ch` | C |
| `ed` | BackgroundEffect | Mưa/tuyết/sương/lửa/nước/background particle | C |
| `du` | FireWork manager | Quản lý đường bay/particle pháo hoa trong world | C |
| `cy` | ItemTime | Icon, phút/giây, text mode và cooldown/progress bar | C |
| `eb` | BallInfo | Tọa độ/vận tốc/state quả bóng của `ar` | C |
| `dj` | CrackBall auto worker | Thread tự chạy chu kỳ minigame `ar` | C |

> Bảng trên liệt kê đúng 155 file Java thật. Ba class trong package `main` được viết theo tên đầy đủ để tránh nhầm `main.a` với class mặc định `a`.

## 10. Những phần decompile không đáng tin

### 10.1 Method CFR báo hỏng trực tiếp

`decompiled/summary.txt` liệt kê:

| Class | Method bị lỗi |
|---|---|
| `ac` | `a(y)`, `h(y)` |
| `af` | `a()` |
| `ed` | `e()` |
| `g` | `u()`, `E(en)`, `B()` |
| `main.a` | `b(int)` |
| `p` | `d()`, `a(boolean)`, `a(int,Object)` |
| `s` | `run()` |

Trong `ac`, hai method còn bị CFR thay bằng `throw new IllegalStateException("Decompilation failed")`. Copy `ac.java` sang `modsrc` rồi compile sẽ làm mất controller thật trong bytecode.

### 10.2 Dấu hiệu source CFR không compile hoặc đổi semantics

- `void var...` trong `ah`, `aj`, `bk`, `g`, `p`.
- `** GOTO lbl...` trong `g`, `p`, `s`, `ed`, `af`.
- Pattern `new X(); new X().field = ...`: bytecode thường dùng `DUP` trên cùng object, còn CFR in ra hai object khác nhau.
- `inputStream.read(null)` và `(null).length`.
- Tham số constructor được đọc nhưng không gán.
- Condition vô nghĩa như `if (0L != 0L)`.
- Một class bị gộp nhiều trách nhiệm: `ai` vừa là Task vừa có static utility; `aj` vừa là particle vừa là packet dispatcher.

Không nên “sửa cho hợp lý” chỉ bằng mắt. Trước hết xem bytecode của đúng method.

### 10.3 Lỗi/quirk có thật trong bytecode gốc

Các điểm dưới đây đã được kiểm tra bằng `javap`, không chỉ là lỗi trình bày của CFR:

1. `ac.d(y)` tạo danh sách SelectChar rồi gọi method trên `null` thay vì instance `ab`; nhánh này có thể NPE.
2. Một số action case trong `main.a.a(int,Object)` đọc/gọi field trên `null`; đây là latent crash.
3. `bt.c()` và nhánh duplicate trong `ac.a(boolean)` thật sự dùng `aconst_null` cho info blob.
4. `eu.a(String)` so `RecordStore.listRecordStores()` (array) với String, nên gần như không xóa store được.
5. `eu.a()` dùng reference comparison và so tên physical có prefix `vj` với key không prefix; danh sách “giữ lại” không làm đúng như tên gợi ý.
6. `eu.d()` trả signed byte; giá trị 255 thành `-1`, trùng sentinel “không có”.
7. Một số method `bt` thật sự bỏ tham số hoặc hard-code subcommand; đừng đặt wrapper name chỉ dựa trên signature.
8. Constructor `cr` làm rơi `mapId`, constructor `dd` làm rơi một byte và constructor 4 tham số `dm` bỏ một tham số; compile nguyên source sẽ không nhất thiết giữ semantics bytecode.
9. Một nhánh helper kích thước trong `l` trả width ở chỗ đáng lẽ là height; phải kiểm tra bytecode/caller trước khi sửa.

Các branch hỏng có thể là code chết, code dành cho server khác hoặc artifact từ obfuscator. Không nên tự động sửa tất cả vì “trông sai”: sửa có thể đổi protocol/hành vi mà server hiện tại đang dựa vào.

### 10.4 Quirk server list

- Parser dùng dấu `:` nên không hỗ trợ IPv6 literal.
- Port parse bằng `short`; port lớn hơn 32767 sẽ lỗi.
- Server count/priority và một số setting dùng signed byte, nên nên giữ dưới 128.
- Sửa server cần cập nhật cả hostname/IP list và RMS; không chỉ endpoint fallback.

## 11. Các mod/patch đang có trong workspace

### 11.1 `modsrc/`

| File | Khác bản decompiled |
|---|---|
| `modsrc/br.java` | Dùng `TimeUtil.d()` thay `l.d()`; thêm stack trace khi đóng kết nối; bỏ assignment CFR thừa trong catch |
| `modsrc/cf.java` | Ép `-27` về `byte`; log exception của connector |
| `modsrc/cq.java` | Chặn lệnh chat cục bộ `ts` và `buffdau` ở cả hai đường submit; chat thường vẫn đi qua callback gốc |
| `modsrc/dg.java` | `getWidth/getHeight` trả kích thước Canvas thật; gọi các hook tốc độ, auto đậu và auto đánh mỗi game tick |
| `modsrc/TimeUtil.java` | Wrapper package-default gọi `l.d()` |
| `modsrc/CharacterSpeedMod.java` | Tăng `af.e().O` của nhân vật chính từ mức server cấp (thường là 4) lên mặc định 6 khi đang ở `p` GameScr |
| `modsrc/AutoAttackMod.java` | Bật/tắt auto đánh quái bằng chat `ts`; tái sử dụng nhánh auto train có sẵn trong `p.c()` |
| `modsrc/AutoBeanMod.java` | Đặt ngưỡng HP bằng `buffdau N`; tự dùng đậu thần từ hành trang khi HP còn không quá N điểm |

`CharacterSpeedMod` mặc định bật ở tốc độ 6, nhanh khoảng 1,5 lần so với tốc độ gốc thường là 4. Có thể gọi `setRunSpeed(8)` để thử mức 2 lần, `setEnabled(false)` để trả về tốc độ server đã cấp, hoặc `toggle()` để đảo trạng thái. Mod không thay delay 27 ms của game loop nên UI, mob và animation không bị tăng tốc theo. Server có thể cập nhật lại `af.O`, vì vậy hook kiểm tra và áp mod trước mỗi game tick.

Trong GameScr, chat đúng `ts` (không phân biệt hoa/thường và khoảng trắng đầu/cuối) để bật auto đánh quái; chat `ts` lần nữa để tắt. Lệnh được xử lý cục bộ và không gửi packet chat 44 lên server. Mod mở tạm cờ `p.bk` trong lúc update rồi khôi phục ngay, còn việc tìm mob, chọn skill, kiểm tra mana/cooldown và gửi packet đánh vẫn do nhánh auto train gốc trong `p.c()` thực hiện. Nhánh gốc này có dịch tọa độ client tới mob trước khi gửi vị trí, nên cần test thêm phản ứng kéo vị trí của từng server/map.

Chat `buffdau 10` để bật tự dùng đậu khi HP hiện tại còn tối đa 10 điểm; dùng `buffdau 0` để tắt ngưỡng tùy chỉnh. `AutoBeanMod` kiểm tra `af.U` rồi kích hoạt phím dùng đậu nội bộ, nhờ đó thao tác vẫn đi qua `p.H()` và dùng chung guard, cooldown 10 giây, thông báo cùng hiệu ứng gốc. `p.H()` gọi `af.M()`, method nhận diện đậu bằng item type `dd.b == 6` rồi gửi packet dùng item `-43` theo template ID, nên không cần hard-code ID của từng cấp đậu.

Toàn bộ `modsrc/*.java` hiện compile thành công với Java 8 + JAR gốc + MicroEmulator. Sau khi build, `build/classes/` phải có `dg.class`, `CharacterSpeedMod.class`, `cq.class`, `AutoAttackMod.class` và `AutoBeanMod.class`; đóng gói thiếu class mod mới sẽ gây `NoClassDefFoundError`.

### 11.2 `patchwork/`

`PatchAutoBean.java` bọc duy nhất call `p.H()` trong nhánh auto train của `p.c()` bằng điều kiện `!AutoBeanMod.isEnabled()`. Khi `buffdau` bật, ngưỡng tùy chỉnh không bị auto train gốc ăn đậu sớm ở 20% HP/KI và không gửi hai packet trong một tick. Các call `p.H()` từ phím dùng đậu vẫn giữ nguyên; `buffdau 0` cũng giữ hành vi 20% gốc. `buildmod.sh` tự compile và áp patch này lên `p.class` lấy từ `DragonBoy250-Debug4.jar`.

`PatchServerSelection.java` vá `ev.class` để danh sách server dịch theo focus bàn phím, tô sáng đúng mục và xử lý Enter/5 trước khi `bb.d()` xóa phím chọn. Patch cũng map 2/8/5 trên màn hình này; các phím mũi tên và Enter vẫn dùng được như bình thường.

`PatchServerList.java` vá `bs.class`: nếu danh sách động hoặc cache `NRlink3` chưa có `Vũ trụ 15`, client bổ sung `27.0.14.69:14445`. Entry do server trả về luôn được ưu tiên và không bị thêm trùng.

`PatchBt.java` làm ba việc trong `bt.c()`:

1. Đổi resource path `res\\info` thành `res/info`.
2. Tạo byte array theo `InputStream.available()`.
3. Thay bốn `ACONST_NULL` bằng array đó để read/write info blob.

Các JAR debug/infofix có thêm `res/info` và một số bản còn có entry tên `res\\info`. `original` chỉ có resource root `info`/`info.txt`. Do đó patch phải luôn được kiểm tra cùng đúng layout resource của JAR đích; đổi code mà không thêm đúng entry vẫn không chạy branch.

### 11.3 `dist/`

Các tên JAR hiện không đủ để suy ra chính xác nội dung. So với JAR gốc, snapshot hiện tại gần đúng như sau:

| JAR | Class khác/thêm đáng chú ý |
|---|---|
| `DragonBoy250-Speed.jar` | `dg`, `CharacterSpeedMod`; bản speed riêng, mặc định 6 |
| `DragonBoy250-Mod.jar` | Kế thừa các fix của Debug4; thêm/ghi đè `bs`, `cq`, `dg`, `ev`, `p`, `CharacterSpeedMod`, `AutoAttackMod`, `AutoBeanMod` |
| `DragonBoy250-Mod-infofix.jar` | `dg`, thêm resource info path |
| `DragonBoy250-Debug.jar` | `br`, `dg`, `TimeUtil` |
| `DragonBoy250-Debug2.jar` | `br`, `cf`, `dg`, `TimeUtil` |
| `DragonBoy250-Debug3.jar` | `br`, `cf`, `dg`, `bt`, `TimeUtil` |
| `DragonBoy250-Debug4.jar` | `br`, `cf`, `dg`, `bt`, `TimeUtil` |

Nên chọn một tên output chuẩn và tạo lại từ `original` mỗi lần để tránh class cũ sót trong JAR.

## 12. Quy trình viết mod an toàn

### Bước 1: tìm đúng chức năng

Ví dụ tìm chat, packet và caller:

```bash
rg -n 'chat|writeUTF|new y\(' decompiled
rg -n 'bt\.a\(\)' decompiled/p.java decompiled/g.java decompiled/x.java
```

### Bước 2: xem source và bytecode cùng lúc

```bash
sed -n '1,240p' decompiled/br.java
javap -classpath original/DragonBoy250.jar -c -p br
```

Với method lớn, thêm `-v` nếu cần constant pool/descriptor:

```bash
javap -classpath original/DragonBoy250.jar -c -p -v ac
```

### Bước 3: copy đúng một class

```bash
cp decompiled/br.java modsrc/br.java
```

Sau đó chỉ sửa `modsrc/br.java`.

### Bước 4: compile class mod

```bash
mkdir -p build/classes

javac \
  -source 8 \
  -target 8 \
  -cp 'original/DragonBoy250.jar:libs/microemulator.jar' \
  -d build/classes \
  modsrc/CharacterSpeedMod.java \
  modsrc/TimeUtil.java \
  modsrc/br.java \
  modsrc/cf.java \
  modsrc/dg.java
```

Không thêm `decompiled/` vào source path nếu không cần, vì `javac` có thể cố compile dependency CFR hỏng thay vì dùng `.class` trong JAR gốc.

### Bước 5: tạo JAR mod từ bản gốc

```bash
cp original/DragonBoy250.jar dist/DragonBoy250-Mod.jar

jar uf dist/DragonBoy250-Mod.jar \
  -C build/classes CharacterSpeedMod.class \
  -C build/classes TimeUtil.class \
  -C build/classes br.class \
  -C build/classes cf.class \
  -C build/classes dg.class
```

Với patch bytecode, đưa đúng `.class` patch vào JAR thay cho output `javac`.

### Bước 6: xác minh JAR

```bash
jar tf dist/DragonBoy250-Mod.jar | sort

javap \
  -classpath dist/DragonBoy250-Mod.jar \
  -c -p br
```

Nên kiểm tra thêm hash/diff class thay vì chỉ nhìn tên file JAR.

## 13. Gợi ý class bắt đầu theo loại mod

| Mục tiêu | Điểm bắt đầu ít rủi ro hơn |
|---|---|
| Thêm log outbound semantic | `bt`, hoặc wrapper nhỏ quanh method cụ thể |
| Log connect/disconnect | `br`, `cf` |
| Đổi text | `aw`/`bz`, nhưng lưu ý static initializer rất lớn |
| Chỉnh login UI | `x` |
| Chỉnh server list | `bs` + RMS |
| Chỉnh menu/command | `az`, `de`, screen cụ thể |
| Chỉnh HUD đơn giản | `p` paint, nhưng patch method nhỏ và kiểm tra z-order |
| Chỉnh setting | `bu` |
| Tăng tốc chạy nhân vật | `CharacterSpeedMod` + hook nhỏ trong `dg`; không copy `af`/`p` |
| Chỉnh image/resource cache | `as`, `bl`, `bn`, `u` |
| Auto action gameplay | Đọc `p` + `af` + caller `bt`; tách logic mod thành class mới nếu có thể |
| Sửa receive packet | Ưu tiên bytecode patch nhỏ; không compile lại nguyên `ac`/`s` |

Tính năng đầu tiên hợp lý là log một vài request `bt`, thêm một setting nhỏ, hoặc đổi server list. Auto combat/movement đụng đồng thời input, focus, cooldown, map state và socket thread nên nên làm sau khi đã có logger ổn định.

## 14. Checklist trước khi sửa một class

- [ ] Đã tìm tất cả caller bằng `rg`.
- [ ] Đã đọc class liên quan, không chỉ một method.
- [ ] Đã xem `decompiled/summary.txt`.
- [ ] Method không có `GOTO`, `void var`, `null` vô lý hoặc stub throw.
- [ ] Đã đối chiếu `javap` nếu method có switch/try/state machine.
- [ ] Đã copy sang `modsrc/`, không sửa `decompiled/`.
- [ ] Chỉ compile class mod, dependency lấy từ JAR gốc.
- [ ] JAR output được tạo lại từ `original`.
- [ ] Đã kiểm tra đúng class thực sự nằm trong JAR output.
- [ ] Logger không đọc mất payload và không block receiver thread.

---

Tài liệu này là bản đồ kỹ thuật của snapshot hiện tại, không phải tuyên bố rằng source CFR là source gốc có thể build lại toàn bộ. Khi một chi tiết trong Java decompiled mâu thuẫn với bytecode, lấy `original/DragonBoy250.jar` và `javap` làm nguồn sự thật.
