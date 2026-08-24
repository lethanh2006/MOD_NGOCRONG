/**
 * Mod toc do chay cua nhan vat chinh.
 *
 * af.O la bien toc do chay ngang (mac dinh cua game la 4).
 * Khong sua truc tiep af.java vi class nay bi CFR decompile loi nang.
 */
public final class CharacterSpeedMod {
    public static final int NORMAL_SPEED = 8;
    public static final int DEFAULT_FAST_SPEED = 12;

    private static final int MIN_SPEED = NORMAL_SPEED;
    private static final int MAX_SPEED = 16;

    private static boolean enabled = true;
    private static int runSpeed = DEFAULT_FAST_SPEED;
    private static int serverSpeed = NORMAL_SPEED;
    private static int lastAppliedSpeed = Integer.MIN_VALUE;

    private CharacterSpeedMod() {
    }

    /**
     * Goi moi game tick. Chi tac dong khi screen hien tai la GameScr (p).
     */
    public static void update() {
        if (!(main.a.E instanceof p)) {
            return;
        }

        af player = af.e();
        if (player.O != lastAppliedSpeed) {
            // Lan dau vao game hoac server vua cap nhat lai toc do.
            serverSpeed = player.O;
        }

        int targetSpeed = serverSpeed;
        if (enabled && serverSpeed > 0 && runSpeed > serverSpeed) {
            targetSpeed = runSpeed;
        }

        if (player.O != targetSpeed) {
            player.O = targetSpeed;
        }
        lastAppliedSpeed = targetSpeed;
    }

    public static void setEnabled(boolean value) {
        enabled = value;
        update();
    }

    public static void toggle() {
        setEnabled(!enabled);
    }

    public static boolean isEnabled() {
        return enabled;
    }

    /**
     * Gioi han 4..8 de tranh buoc di qua lon lam xuyen vat can/map.
     * Goi setRunSpeed(6) neu server keo vi tri lai khi de toc do 8.
     */
    public static void setRunSpeed(int value) {
        if (value < MIN_SPEED) {
            value = MIN_SPEED;
        } else if (value > MAX_SPEED) {
            value = MAX_SPEED;
        }

        runSpeed = value;
        update();
    }

    public static int getRunSpeed() {
        return runSpeed;
    }

    public static int getServerSpeed() {
        return serverSpeed;
    }
}
