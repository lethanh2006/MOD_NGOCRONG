import java.util.Vector;

/** A sender queue owned by exactly one connection generation. */
final class dw implements Runnable {
    private final Vector a = new Vector();
    private final br b;
    private final int c;

    dw(br session, int generation) {
        this.b = session;
        this.c = generation;
    }

    public final void a(y message) {
        if (message == null || this.b.y != this.c) {
            return;
        }
        this.a.addElement(message);
    }

    public final void run() {
        while (this.isCurrent()) {
            try {
                if (this.b.j) {
                    while (this.isCurrent()) {
                        y message;
                        synchronized (this.a) {
                            if (this.a.size() == 0) {
                                break;
                            }
                            message = (y)this.a.elementAt(0);
                            this.a.removeElementAt(0);
                        }
                        ProtocolDiagnostics.sent(this.b, message, this.c);
                        br.a(this.b, message, this.c);
                    }
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException ignored) {
                    return;
                }
            } catch (Exception exception) {
                if (this.isCurrent()) {
                    System.out.println(
                            "Sender stopped [gen="
                                    + this.c
                                    + "]: "
                                    + exception.getClass().getSimpleName());
                }
                return;
            }
        }
    }

    private boolean isCurrent() {
        return this.b.y == this.c && this.b.d;
    }

    static Vector a(dw sender) {
        return sender.a;
    }
}
