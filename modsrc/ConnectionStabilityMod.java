import main.a;

/** Stops an unreachable selected server from trapping the client in a retry loop. */
public final class ConnectionStabilityMod {
    private static final int MAX_CONSECUTIVE_FAILURES = 3;

    private static int failedServer = -1;
    private static int consecutiveFailures;
    private static boolean stopRequested;
    private static boolean handshakeObserved;

    private ConnectionStabilityMod() {
    }

    /** Called by connector/watchdog threads after a failed primary connection. */
    public static synchronized void recordFailure(br session) {
        if (session == null || !session.c) {
            return;
        }

        int selectedServer = bs.n;
        if (selectedServer != failedServer) {
            failedServer = selectedServer;
            consecutiveFailures = 0;
        }
        ++consecutiveFailures;
        handshakeObserved = false;

        System.out.println(
                "Server connection failed ("
                        + consecutiveFailures
                        + "/"
                        + MAX_CONSECUTIVE_FAILURES
                        + ")");
        if (consecutiveFailures >= MAX_CONSECUTIVE_FAILURES) {
            stopRequested = true;
        }
    }

    /** Runs on the game thread so all UI changes remain thread-safe. */
    public static void update() {
        br primary = br.a();
        if (primary.d() && primary.j) {
            markHandshakeSuccess();
        }

        int serverToStop;
        synchronized (ConnectionStabilityMod.class) {
            if (!stopRequested) {
                return;
            }
            stopRequested = false;
            serverToStop = failedServer;
        }

        // The player selected another row while a failure notification was
        // waiting for the game thread. Do not stop the new connection.
        if (serverToStop != bs.n) {
            reset();
            return;
        }

        bs.v = false;
        bs.t = 0;
        primary.e();
        a.h();

        String serverName = "máy chủ đã chọn";
        if (bs.a != null && serverToStop >= 0 && serverToStop < bs.a.length) {
            serverName = bs.a[serverToStop];
        }
        a.a(
                serverName
                        + " không phản hồi sau "
                        + MAX_CONSECUTIVE_FAILURES
                        + " lần thử. Hãy chọn máy chủ khác hoặc thử lại sau.",
                8884,
                null);
        System.out.println("Stopped automatic retry for unreachable server: " + serverName);
    }

    private static synchronized void markHandshakeSuccess() {
        if (handshakeObserved && failedServer == bs.n) {
            return;
        }
        handshakeObserved = true;
        failedServer = bs.n;
        consecutiveFailures = 0;
        stopRequested = false;
    }

    private static synchronized void reset() {
        failedServer = bs.n;
        consecutiveFailures = 0;
        stopRequested = false;
        handshakeObserved = false;
    }
}
