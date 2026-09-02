import java.io.DataInputStream;
import java.io.DataOutputStream;

final class cf
implements Runnable {
    private final String b;
    private int c;
    final int d;
    final br a;

    cf(br br2, String string, int n2, int generation) {
        this.a = br2;
        this.b = string;
        this.c = n2;
        this.d = generation;
    }

    public final void run() {
        new Thread(new ct(this)).start();
        ay socket = null;
        try {
            socket = new ay(this.b, this.c);
            DataOutputStream output = socket.b();
            DataInputStream input = socket.c();

            synchronized (this.a) {
                if (this.a.y != this.d || !this.a.d) {
                    socket.a();
                    return;
                }

                br.a(this.a, socket);
                br.a(this.a, output);
                this.a.a = input;

                dw sender = new dw(this.a, this.d);
                br.a(this.a, sender);
                this.a.g = new Thread(sender);
                this.a.f = new Thread(new s(this.a, input, this.d));
                this.a.g.start();
                this.a.f.start();
                this.a.l = System.currentTimeMillis();
                br.a(this.a, new y((byte)-27), this.d);
                ProtocolDiagnostics.handshakeSent(this.a, this.d);
                this.a.e = false;

                if (this.a.b != null && this.a.y == this.d) {
                    this.a.b.a(this.a.c);
                }
            }
            return;
        }
        catch (Exception exception) {
            if (socket != null && br.a(this.a) != socket) {
                try {
                    socket.a();
                } catch (Exception ignored) {
                }
            }
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            synchronized (this.a) {
                if (this.a.y != this.d) {
                    return;
                }
                ProtocolDiagnostics.connectionFailed(this.a, this.d, exception);
                ConnectionStabilityMod.recordFailure(
                        this.a, this.d, "TCP connect failed");
                if (this.a.b != null) {
                    this.a.e();
                }
            }
            return;
        }
    }
}
