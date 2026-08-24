/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dr
implements b {
    int a;
    private int p;
    int b;
    private int q;
    de c;
    de d;
    private int r = 24;
    public int e = 0;
    private int s = 50;
    public static dv f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public String m;
    private el t = new el("vItems");
    int n;
    int o;

    public final void a(boolean bl2) {
        af.e();
        this.k = true;
        this.l = false;
        dr dr2 = this;
        if (dr2.l) {
            dr2.b = 170;
            dr2.q = 118;
            dr2.a = main.a.A / 2 - dr2.b / 2;
            dr2.p = main.a.B / 2 - dr2.q / 2;
        } else {
            dr2.b = 170;
            dr2.q = 170;
            dr2.a = main.a.A / 2 - dr2.b / 2;
            dr2.p = main.a.B / 2 - dr2.q / 2;
            if (main.a.B < 240) {
                dr2.p -= 10;
            }
        }
        dr2.h = dr2.a;
        dr2.g = 0;
        dr2.e = ak.f.size();
        if (main.a.e) {
            dr2.c.j = dr2.a;
            dr2.c.k = dr2.p + dr2.q + 5;
            dr2.d.j = dr2.a + dr2.b - 68;
            dr2.d.k = dr2.p + dr2.q + 5;
        }
        f = new dv();
        f.a(dr2.e, dr2.r, dr2.a, dr2.p + dr2.s, dr2.b, dr2.q - dr2.s, true, 1);
    }

    private void a() {
        this.g = this.a + this.b;
    }

    public dr() {
        this.c = new de(aw.bw, this, 1, null);
        this.d = new de(aw.bj, this, 2, null);
    }

    public final void a(en en2) {
        en2.a(-this.h, 0);
        bo.a(en2, this.a, this.p - 17, this.b, this.q + 17, -1, true);
        di.f.a(en2, aw.dz, this.a + this.b / 2, this.p - 7, 2);
        if (this.o >= 0 && this.o <= ak.f.size() - 1) {
            ak ak2 = (ak)ak.f.elementAt(this.o);
            if (ak2.c != null) {
                af.e().a(en2, ak2.c, main.a.A / 2, this.p + 45, 1, false);
            }
        }
        af.e().a(en2, main.a.A / 2, this.p + 45, 1, af.e().as, false);
        en2.e(this.a, this.p + this.s, this.b, this.q - this.s - 10);
        if (f != null) {
            en2.a(0, -dr.f.d);
        }
        int n2 = 0;
        while (n2 < this.e) {
            int n3 = this.a + 10;
            int n4 = this.p + n2 * this.r + this.s;
            if (n4 + this.r - (f != null ? dr.f.d : 0) >= this.p + this.s && n4 - (f != null ? dr.f.d : 0) <= this.p + this.s + this.q) {
                ak ak3 = (ak)ak.f.elementAt(n2);
                di di2 = di.o;
                if (n2 == this.o) {
                    di2 = di.q;
                }
                if (ak3.b != null) {
                    di2.a(en2, ak3.b, n3 + 20, n4, 0);
                }
                if (ak3.d > 0) {
                    di2.a(en2, String.valueOf(ak3.d) + " " + aw.bD, n3 + this.b - 20, n4, 1);
                } else if (ak3.e > 0) {
                    di2.a(en2, String.valueOf(ak3.e) + " " + aw.bE, n3 + this.b - 20, n4, 1);
                }
                if (ak3.c != null) {
                    bl.b(en2, ak3.c[0], n3, n4, 0, 0);
                }
            }
            ++n2;
        }
        en2.a(0, -en2.b());
        en2.e(0, 0, main.a.A, main.a.B);
        cx.a(en2, this.c, null, this.d);
    }

    public final void a(int n2, Object object) {
        if (n2 == 2) {
            this.a();
        }
        if (n2 == 1 && !this.l && this.o >= 0) {
            this.a();
            if (af.e().ai == null) {
                bt.a().a((byte)2, ((ak)ak.f.elementAt((int)this.o)).a, this.m);
                return;
            }
            bt.a().a((byte)4, ((ak)ak.f.elementAt((int)this.o)).a, "");
        }
    }
}

