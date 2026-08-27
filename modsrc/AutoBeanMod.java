/**
 * Tu dong dung dau than khi HP xuong duoi nguong da cau hinh.
 *
 * Vi du chat "buffdau 10" de dung dau khi HP con toi da 10 diem.
 * Chat "buffdau 0" de tat.
 */
public final class AutoBeanMod {
    private static final String COMMAND = "buffdau";
    /*
     * Chi gioi han tan suat xep phim. Cooldown dung dau that su 10 giay
     * van do p.H() cua game goc quan ly.
     */
    private static final long REQUEST_RETRY_MS = 1000L;

    private static long hpThreshold;
    private static long nextRequestTime;
    private static boolean noBeanMessageShown;

    private AutoBeanMod() {
    }

    /**
     * Tra ve true neu day la lenh buffdau, ke ca khi tham so khong hop le,
     * de lenh mod khong bi gui len kenh chat cua server.
     */
    public static boolean handleChat(String message) {
        if (message == null) {
            return false;
        }

        String text = message.trim();
        if (text.length() < COMMAND.length()
                || !text.regionMatches(true, 0, COMMAND, 0, COMMAND.length())) {
            return false;
        }
        if (text.length() > COMMAND.length()
                && text.charAt(COMMAND.length()) > ' ') {
            return false;
        }

        String value = text.substring(COMMAND.length()).trim();
        long threshold;
        try {
            threshold = Long.parseLong(value);
        }
        catch (Exception exception) {
            showMessage("Cu phap: buffdau <HP>, vi du: buffdau 10");
            return true;
        }

        if (threshold < 0L) {
            showMessage("Nguong HP khong duoc am");
            return true;
        }

        setHpThreshold(threshold);
        return true;
    }

    public static void setHpThreshold(long threshold) {
        boolean wasEnabled = isEnabled();
        hpThreshold = threshold;

        if (threshold == 0L) {
            nextRequestTime = 0L;
            noBeanMessageShown = false;
            showMessage("Auto dau than: TAT");
        } else {
            if (!wasEnabled) {
                nextRequestTime = 0L;
                noBeanMessageShown = false;
            }
            showMessage("Auto dau than khi HP <= " + threshold + ": BAT");
        }
    }

    public static long getHpThreshold() {
        return hpThreshold;
    }

    public static boolean isEnabled() {
        return hpThreshold > 0L;
    }

    /** Goi moi game tick tu dg.run(). */
    public static void update() {
        if (!isEnabled() || !(main.a.E instanceof p)) {
            return;
        }

        af player = af.e();
        if (player == null
                || player.U <= 0L
                || player.V <= 0L
                || player.U >= player.V
                || player.H == 14
                || player.H == 5
                || player.cR
                || player.cO
                || player.cI > 0) {
            return;
        }

        if (player.U > hpThreshold) {
            return;
        }

        long now = TimeUtil.d();
        if (now < nextRequestTime) {
            return;
        }

        if (!hasBean(player)) {
            if (!noBeanMessageShown) {
                noBeanMessageShown = true;
                showMessage("Khong con dau than trong hanh trang");
            }
            return;
        }

        noBeanMessageShown = false;
        nextRequestTime = now + REQUEST_RETRY_MS;

        // Phim 10 goi p.H(): dung chung guard, cooldown 10 giay, thong bao
        // va hieu ung cua thao tac an dau thu cong. p.H() se goi af.M(), la
        // helper tim item type dd.b == 6 va gui packet use-item -43.
        main.a.i[10] = true;
        System.out.println("[AutoBeanMod] Da xep lenh dung dau than");
    }

    private static boolean hasBean(af player) {
        if (player.aF == null) {
            return false;
        }
        int index = 0;
        while (index < player.aF.length) {
            h item = player.aF[index];
            if (item != null && item.b != null && item.b.b == 6) {
                return true;
            }
            ++index;
        }
        return false;
    }

    private static void showMessage(String message) {
        System.out.println("[AutoBeanMod] " + message);
        if (p.aD != null) {
            p.aD.a(message, 0);
        }
    }
}
