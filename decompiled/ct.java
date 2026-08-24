/*
 * Decompiled with CFR 0.152.
 */
final class ct
implements Runnable {
    private cf a;

    ct(cf cf2) {
        this.a = cf2;
    }

    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException interruptedException) {}
        cf cf2 = this.a;
        if (cf2.a.e) {
            try {
                cf2 = this.a;
                br.a(cf2.a).a();
            }
            catch (Exception exception) {}
            br.n = true;
            cf2 = this.a;
            this.a.a.e = false;
            cf2 = this.a;
            this.a.a.d = false;
            cf cf3 = this.a;
            cf2 = cf3;
            cf2 = this.a;
            cf3.a.b.b(cf2.a.c);
        }
    }
}

