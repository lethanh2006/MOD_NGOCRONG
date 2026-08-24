/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bj {
    private af b;
    private by c;
    private el d = new el("vDARTS");
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = 0;
    private int m = 0;
    private boolean n = false;
    private boolean o = true;
    public ci a;

    public bj(af object, int n2, ci ci2, int n3, int n4) {
        this.a = ci2;
        this.b = object;
        this.c = p.w[n2];
        this.h = this.c.i;
        this.i = n3;
        this.j = n4;
        object = ((af)object).aQ == null ? ((af)object).aU : ((af)object).aQ;
        n2 = ds.a(object.l() - n3, object.m() - n4);
        object = this;
        this.e = n2;
        ((bj)object).f = ((bj)object).h * ds.b(n2) >> 10;
        ((bj)object).g = ((bj)object).h * ds.a(n2) >> 10;
    }

    public final void a() {
        if (!this.o) {
            return;
        }
        if (this.b.aQ == null && this.b.aU == null) {
            this.b();
            return;
        }
        bq bq2 = this.b.aQ == null ? this.b.aU : this.b.aQ;
        int n2 = 0;
        while (n2 < this.c.h) {
            if (this.c.c.length > 0) {
                this.d.addElement(new dx(this.i, this.j));
            }
            int n3 = this.b.l() > bq2.l() ? 10 : -10;
            this.l = bq2.l() + n3 - this.i;
            this.m = bq2.m() - bq2.n() / 2 - this.j;
            ++this.k;
            if (ds.g(this.l) < 20 && ds.g(this.m) < 20) {
                if (this.b.aU != null && this.b.aU.aq) {
                    this.b.aU.a(this.b.aU.ac, 0L, this.b.aU.ae, this.b.aU.ad);
                }
                this.b();
                return;
            }
            n3 = ds.a(this.l, this.m);
            if (Math.abs(n3 - this.e) < 90 || this.l * this.l + this.m * this.m > 4096) {
                this.e = Math.abs(n3 - this.e) < 15 ? n3 : (n3 - this.e >= 0 && n3 - this.e < 180 || n3 - this.e < -180 ? ds.c(this.e + 15) : ds.c(this.e - 15));
            }
            if (this.h < 8192) {
                this.h += 1024;
            }
            this.f = this.h * ds.b(this.e) >> 10;
            this.g = this.h * ds.a(this.e) >> 10;
            this.l += this.f;
            n3 = this.l >> 10;
            this.i += n3;
            this.l &= 0x3FF;
            this.m += this.g;
            n3 = this.m >> 10;
            this.j += n3;
            this.m &= 0x3FF;
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.size()) {
            dx dx2 = (dx)this.d.elementAt(n2);
            ++dx2.a;
            if (dx2.a >= this.c.c.length) {
                this.d.removeElementAt(n2);
            }
            ++n2;
        }
    }

    private void b() {
        ds.c("END ME!");
        if (!this.b.ch && this.i >= p.j && this.i <= p.j + main.a.A) {
            bu.a();
        }
        this.b.E();
        if (this.b.ch) {
            this.b.ch = false;
            if (this.b.bJ && this.b.aq && this.b.H != 14 && this.b.H != 5) {
                this.b.bJ = false;
            }
            if (this.b.K == 2) {
                int n2 = this.b.aq ? af.e().aC.b : this.b.aP;
                if (n2 < 77 || n2 > 83) {
                    p.j().b(this.i, this.j);
                }
            } else {
                p.j().b(this.i, this.j);
            }
        }
        this.b.cd = null;
        this.b.ce = false;
        this.b.cf = null;
        this.b.cg = null;
        this.b.C();
    }

    public final void a(en en2) {
        dx dx2;
        if (!this.o) {
            return;
        }
        int n2 = ah.a(360 - this.e);
        byte by2 = ah.c[n2];
        n2 = ah.b[n2];
        int n3 = this.d.size() / 2;
        while (n3 < this.d.size()) {
            dx dx3 = (dx)this.d.elementAt(n3);
            bl.b(en2, this.c.d[dx3.a], dx3.b, dx3.c, 0, 3);
            ++n3;
        }
        n3 = main.a.w % this.c.b.length;
        bl.b(en2, this.c.b[n3][by2], this.i, this.j, n2, 3);
        int n4 = 0;
        while (n4 < this.d.size()) {
            dx2 = (dx)this.d.elementAt(n4);
            bl.b(en2, this.c.c[dx2.a], dx2.b, dx2.c, 0, 3);
            ++n4;
        }
        bl.b(en2, this.c.a[n3][by2], this.i, this.j, n2, 3);
        n4 = 0;
        while (n4 < this.d.size()) {
            dx2 = (dx)this.d.elementAt(n4);
            if (ds.g(ah.a.nextInt(100)) < this.c.g) {
                bl.b(en2, main.a.w % 2 == 0 ? this.c.e[dx2.a] : this.c.f[dx2.a], dx2.b, dx2.c, 0, 3);
            }
            ++n4;
        }
        en2.a(0xFF0000);
    }
}

