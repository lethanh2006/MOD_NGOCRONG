/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cb
implements b {
    public int a;
    public int b;
    public int c;
    public String d;
    public long e;
    public String[] f;
    public byte g;
    public byte h;
    private int m;
    public int i;
    public int j;
    public String[] k;
    public static el l = new el("v Message");

    public static void a(cb cb2, int n2, boolean bl2) {
        int n3 = 0;
        while (n3 < l.size()) {
            cb cb3 = (cb)l.elementAt(n3);
            if (cb3.a == cb2.a) {
                l.removeElement(cb3);
                if (!bl2) {
                    l.insertElementAt(cb2, n3);
                    return;
                }
                l.insertElementAt(cb2, 0);
                return;
            }
            if (cb3.j != 0 && cb3.i == cb3.j) {
                l.removeElement(cb3);
            }
            ++n3;
        }
        if (n2 == -1) {
            l.addElement(cb2);
        } else {
            l.insertElementAt(cb2, 0);
        }
        if (l.size() > 20) {
            l.removeElementAt(l.size() - 1);
        }
    }

    public final void a(en en2, int n2, int n3) {
        di di2 = di.f;
        if (this.h == 0) {
            di2 = di.a;
        } else if (this.h == 1) {
            di2 = di.h;
        } else if (this.h == 2) {
            di2 = di.g;
        }
        if (this.b == 0) {
            di2.a(en2, this.d, n2 + 3, n3 + 1, 0);
            if (this.g == 0) {
                di.o.a(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            } else {
                di.p.a(en2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            }
            di.o.a(en2, String.valueOf(ai.c(this.m)) + " " + aw.dJ, n2 + main.a.G.ag - 3, n3 + 1, 1);
        }
        if (this.b == 1) {
            di2.a(en2, String.valueOf(this.d) + " (" + this.i + "/" + this.j + ")", n2 + 3, n3 + 1, 0);
            di.q.a(en2, String.valueOf(aw.cX) + " " + ai.c(this.m) + " " + aw.dJ, n2 + 3, n3 + 11, 0);
        }
        if (this.b == 2) {
            di2.a(en2, this.d, n2 + 3, n3 + 1, 0);
            di.q.a(en2, aw.dA, n2 + 3, n3 + 11, 0);
        }
    }

    public final void a(int n2, Object object) {
    }

    public final void a() {
        if (this.e != 0L) {
            this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
        }
    }
}

