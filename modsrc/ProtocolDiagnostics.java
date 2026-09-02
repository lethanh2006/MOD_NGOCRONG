/** Small pre-login trace that never prints packet payloads or credentials. */
public final class ProtocolDiagnostics {
    private static final long STARTED_AT = System.currentTimeMillis();

    private ProtocolDiagnostics() {
    }

    public static void queued(br session, y message, int generation) {
        String packet = describe(message);
        if (packet != null) {
            log(session, generation, "QUEUE " + packet);
        }
    }

    public static void sent(br session, y message, int generation) {
        String packet = describe(message);
        if (packet != null) {
            log(session, generation, "SEND " + packet);
        }
    }

    public static void handshakeSent(br session, int generation) {
        log(session, generation, "SEND HANDSHAKE cmd=-27");
    }

    public static void handshakeReceived(
            br session, int generation, boolean secondaryRequested) {
        log(
                session,
                generation,
                "RECV HANDSHAKE cmd=-27 secondary=" + secondaryRequested);
    }

    public static void received(
            br session, byte command, byte[] payload, int generation) {
        if (command == (byte)-26) {
            log(session, generation, "RECV SERVER_STATUS cmd=-26");
            return;
        }
        if (command == (byte)-29 && payload != null && payload.length > 0) {
            log(session, generation, "RECV SERVICE cmd=-29 sub=" + payload[0]);
        }
    }

    public static void connectionFailed(
            br session, int generation, Exception exception) {
        String reason = exception == null
                ? "unknown"
                : exception.getClass().getSimpleName();
        log(session, generation, "CONNECT failed: " + reason);
    }

    public static void readerStopped(
            br session, int generation, Exception exception) {
        String reason = exception == null
                ? "unknown"
                : exception.getClass().getSimpleName();
        log(session, generation, "READER stopped: " + reason);
    }

    private static String describe(y message) {
        if (message == null || message.a != (byte)-29) {
            return null;
        }
        try {
            byte[] payload = message.a();
            if (payload == null || payload.length == 0) {
                return "SERVICE cmd=-29 sub=?";
            }
            int subcommand = payload[0];
            if (subcommand == 0) {
                return "LOGIN cmd=-29 sub=0";
            }
            if (subcommand == 2) {
                return "SET_TYPE cmd=-29 sub=2";
            }
            return null;
        } catch (Exception ignored) {
            return "SERVICE cmd=-29 sub=?";
        }
    }

    private static void log(br session, int generation, String message) {
        long elapsed = System.currentTimeMillis() - STARTED_AT;
        System.out.println(
                "PROTO +"
                        + elapsed
                        + "ms ["
                        + (session != null && session.c ? "primary" : "secondary")
                        + " gen="
                        + generation
                        + "] "
                        + message);
    }
}
