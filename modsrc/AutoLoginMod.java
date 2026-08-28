/** Optional one-shot login used by the PC launcher when NRO_AUTO_LOGIN=1. */
public final class AutoLoginMod {
    private static final boolean ENABLED =
            "1".equals(System.getenv("NRO_AUTO_LOGIN"))
                    || "true".equalsIgnoreCase(System.getProperty("nro.autologin"));
    private static boolean triggered;
    private static long readyAt;
    private static int lastGeneration = -1;

    private AutoLoginMod() {
    }

    public static void update() {
        br session = br.a();
        if (!ENABLED) {
            return;
        }
        if (session.y != lastGeneration) {
            lastGeneration = session.y;
            triggered = false;
            readyAt = 0L;
        }
        if (triggered || !session.d() || !session.j || !ac.c) {
            return;
        }

        long now = System.currentTimeMillis();
        if (readyAt == 0L) {
            readyAt = now + 1500L;
            return;
        }
        if (now < readyAt) {
            return;
        }

        String account = eu.c(eu.e);
        String password = eu.c(eu.f);
        if (account == null || account.length() == 0
                || password == null || password.length() == 0) {
            return;
        }

        triggered = true;
        bs.l();
    }
}
