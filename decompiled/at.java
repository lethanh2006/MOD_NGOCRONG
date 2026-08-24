/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class at
extends dc {
    private cp a;
    private int b;
    private int c;
    private int d;
    private af e;
    private aa f;
    private short g = 0;
    private long h = 0L;
    private int i;

    public static void a(int n2, int n3, int n4, int n5) {
        at at2 = new at();
        new at().a = p.y[n2 - 1];
        at2.c = n3;
        at2.d = n4;
        at2.g = (short)n5;
        dc.x.addElement(at2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        at at2 = new at();
        new at().a = p.y[n2 - 1];
        at2.c = n3;
        at2.d = n4;
        at2.g = 1;
        at2.i = n6;
        dc.x.addElement(at2);
    }

    public static void a(int n2, aa aa2, int n3) {
        at at2 = new at();
        new at().a = p.y[n2 - 1];
        at2.f = aa2;
        at2.g = 1;
        dc.x.addElement(at2);
    }

    public static void a(int n2, af af2, int n3) {
        at at2 = new at();
        new at().a = p.y[n2 - 1];
        at2.e = af2;
        at2.g = (short)n3;
        dc.x.addElement(at2);
    }

    public final void a(en en2) {
        if (en.b == 1) {
            ++p.aN;
        }
        if (p.aN < 11) {
            int n2;
            int n3;
            if (this.e != null) {
                this.c = this.e.B;
                this.d = this.e.C + main.a.ae;
            }
            if (this.f != null) {
                this.c = this.f.m;
                this.d = this.f.n + main.a.ae;
            }
            if (main.a.d(n3 = this.c + this.a.a[this.b].a, n2 = this.d + this.a.a[this.b].b)) {
                bl.b(en2, this.a.a[this.b].c, n3, n2, this.i, 3);
            }
        }
    }

    public final void a() {
        if (0L != 0L) {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.b = 0;
            }
            if (System.currentTimeMillis() > 0L) {
                dc.x.removeElement(this);
            }
        } else {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.g = (short)(this.g - 1);
                if (this.g <= 0) {
                    dc.x.removeElement(this);
                } else {
                    this.b = 0;
                }
            }
        }
        if (main.a.w % 11 == 0 && this.e != null && this.e != af.e() && !p.D.contains(this.e)) {
            dc.x.removeElement(this);
        }
    }
}

