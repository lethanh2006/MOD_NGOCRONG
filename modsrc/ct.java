/** Stops a socket that connected at TCP level but never completed the game handshake. */
final class ct implements Runnable {
    private static final long HANDSHAKE_TIMEOUT_MS = 10000L;

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
        if (session.y != this.a.d) {
            return;
        }
        if (!session.e && (!session.d || session.j)) {
            return;
        }

        // Use the normal close path so streams, worker threads and queued packets
        // from this failed handshake are all discarded before reconnecting.
        session.e();
        if (session.b != null) {
            session.b.b(session.c);
        }
    }
}
