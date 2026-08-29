/*
 * Decompiled with CFR 0.152.
 */
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
        this.a.e = true;
        this.a.d = true;
        try {
            int n2 = this.c;
            String string = this.b;
            cf cf2 = this;
            br.a(cf2.a, new ay(string, n2));
            br.a(cf2.a, br.a(cf2.a).b());
            cf2.a.a = br.a(cf2.a).c();
            cf2.a.g = new Thread(br.b(cf2.a));
            cf2.a.g.start();
            cf2.a.f = new Thread(new s(cf2.a));
            cf2.a.f.start();
            cf2.a.l = System.currentTimeMillis();
            br.a(cf2.a, new y((byte)-27));
            ds.c("=======================> gui message cmd = -27 to server");
            cf2.a.e = false;
            this.a.b.a(this.a.c);
            return;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            if (this.a.y != this.d) {
                return;
            }
            ConnectionStabilityMod.recordFailure(this.a);
            if (this.a.b != null) {
                this.a.e();
            }
            return;
        }
    }
}
