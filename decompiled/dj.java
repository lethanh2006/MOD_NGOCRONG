/*
 * Decompiled with CFR 0.152.
 */
import main.a;

final class dj
implements Runnable {
    private int a;
    private boolean b;
    private ar c;

    dj(ar ar2) {
        this.c = ar2;
        this.a = 0;
        this.b = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            while (ar.d) {
                block8: {
                    if (main.a.E != ar.a) {
                        return;
                    }
                    this.c.c = 2;
                    while (true) {
                        if (this.a >= 7 || this.c.b == 5) {
                            if (this.a == 7) {
                                Thread.sleep(800L);
                                ar.a(ar.a());
                                Thread.sleep(4000L);
                                if (!ar.e) break;
                                this.c.e();
                                Thread.yield();
                                return;
                            }
                            break block8;
                        }
                        ar.a(this.c, this.a);
                        ++this.a;
                        Thread.sleep(300L);
                    }
                    if (this.c.b == 5) {
                        ar.a(ar.a());
                        this.a = 0;
                    }
                    Thread.sleep(1000L);
                }
                if (this.c.b != 5 || this.a != 0 || this.b) continue;
                this.b = true;
                ar.a(ar.a());
            }
            return;
        }
        catch (Exception exception) {}
    }
}

