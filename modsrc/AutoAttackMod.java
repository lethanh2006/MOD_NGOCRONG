/**
 * Bat/tat tu dong danh quai bang lenh chat "ts".
 *
 * GameScr (p) da co san vong lap auto train, duoc dieu khien boi
 * p.bj (dang auto) va p.bk (server cho phep auto). Mod chi mo tam quyen
 * auto trong luc update GameScr de tai su dung dung logic chon mob, skill,
 * cooldown va packet cua client goc.
 */
public final class AutoAttackMod {
    private static final String COMMAND = "ts";

    private static boolean enabled;
    private static boolean autoPermissionOverridden;
    private static boolean savedAutoPermission;

    private AutoAttackMod() {
    }

    /**
     * Xu ly lenh chat cuc bo. Tra ve true neu tin nhan da bi mod xu ly va
     * khong duoc gui len server.
     */
    public static boolean handleChat(String message) {
        if (message == null || !COMMAND.equalsIgnoreCase(message.trim())) {
            return false;
        }

        setEnabled(!enabled);
        return true;
    }

    public static void setEnabled(boolean value) {
        enabled = value;
        p.bj = value;

        String status = value ? "Auto danh quai: BAT" : "Auto danh quai: TAT";
        System.out.println("[AutoAttackMod] " + status);
        if (p.aD != null) {
            p.aD.a(status, 0);
        }
    }

    public static boolean isEnabled() {
        return enabled;
    }

    /**
     * Goi ngay truoc game tick. p.bk duoc mo tam thoi de nhanh auto train
     * san co trong p.c() chay ke ca khi server khong bat menu auto.
     */
    public static void beforeGameTick() {
        autoPermissionOverridden = false;
        if (!enabled || !(main.a.E instanceof p)) {
            return;
        }

        savedAutoPermission = p.bk;
        p.bk = true;
        p.bj = true;
        autoPermissionOverridden = true;
    }

    /** Khoi phuc co quyen auto goc sau khi GameScr update xong. */
    public static void afterGameTick() {
        if (autoPermissionOverridden) {
            p.bk = savedAutoPermission;
            autoPermissionOverridden = false;
        }
    }
}
