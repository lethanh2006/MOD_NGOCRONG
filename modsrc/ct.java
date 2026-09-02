/** Stops a socket that connected at TCP level but never completed the game handshake. */
final class ct implements Runnable {
    // VT15 has been observed taking more than 12 seconds to return -27 while
    // still accepting the same setType packet afterwards. Ten seconds caused
    // the client itself to kill a valid connection.
    private static final long HANDSHAKE_TIMEOUT_MS = 30000L;

    private final cf a;

    ct(cf connector) {
        this.a = connector;
    }

    public final void run() {
        try {
            Thread.sleep(HANDSHAKE_TIMEOUT_MS);
        } catch (InterruptedException ignored) {
            return;
        }

        br session = this.a.a;
        bd handler;
        boolean primary;
        synchronized (session) {
            if (session.y != this.a.d || !session.d || session.j) {
                return;
            }

            ConnectionStabilityMod.recordFailure(
                    session, this.a.d, "handshake timeout after 30s");
            // The generation check and close are atomic with readHandshake(),
            // so a key arriving on the boundary cannot be closed as stale.
            handler = session.b;
            primary = session.c;
            session.e();
        }
        if (handler != null) {
            handler.b(primary);
        }
    }
}
