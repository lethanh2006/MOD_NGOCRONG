/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dz
implements b {
    public de a;
    private de b;
    private String[] c;
    private int d;
    private int e;
    private int f = 120;
    private int g;
    private int h;
    private long i;
    private long j;

    public final void a(String string, de de2, de de3) {
        this.c = new String[]{string};
        this.g = 29;
        this.a = de2;
        this.b = de3;
        this.a.g = this.b.g = p.bo;
        this.a.h = this.b.h = p.bp;
        this.a.l = en.a(de2.g);
        this.b.l = en.a(de2.g);
        this.a.m = en.b(de2.g);
        this.b.m = en.b(de2.g);
        this.i = System.currentTimeMillis();
        this.h = this.c[0].length() / 3;
        if (this.h < 15) {
            this.h = 15;
        }
        ag.a();
    }

    public final void a(en en2) {
        bo.a(en2, this.d, this.e, this.f, this.g + (!main.a.e ? 10 : 0), 0xFFFFFF, false);
        if (this.c != null) {
            ag.a(en2, this.c[0], this.d + 5, this.e + this.g / 2 - (main.a.e ? 4 : 6), this.f - 10, this.g, di.k);
            if (main.a.e) {
                this.a.a(en2);
                di.n.a(en2, String.valueOf(this.h), this.a.j + this.a.l / 2, this.a.k + this.a.m + 5, 2, di.o);
                return;
            }
            if (cd.g) {
                di.b.a(en2, String.valueOf(aw.cK) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
                return;
            }
            di.b.a(en2, String.valueOf(aw.cL) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
        }
    }

    public final void a() {
        if (this.c != null) {
            this.d = main.a.A - 5 - this.f;
            this.e = 45;
            if (main.a.A - 50 > 155 + this.f) {
                this.d = main.a.A - 55 - this.f;
                this.e = 5;
            }
            this.a.j = this.d - 35;
            this.a.k = this.e;
            this.j = System.currentTimeMillis();
            ds.c("curr - last= " + (this.j - this.i));
            if (this.j - this.i >= 1000L) {
                this.i = System.currentTimeMillis();
                --this.h;
            }
            if (this.h == 0) {
                p.j().bQ = null;
            }
        }
    }

    public final void a(int n2, Object object) {
    }
}

