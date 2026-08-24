/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ar
extends bb
implements b {
    public static ar a;
    private eb[] f;
    byte b = 0;
    private byte g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    int c;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w = 0;
    private int x = 0;
    private int y;
    private int z;
    private int[] A;
    private int[] B;
    private int[] C;
    private int[] D;
    private short[] E;
    private long F;
    private long G;
    private boolean H;
    private boolean I;
    private boolean J;
    private short K;
    private static int L;
    private static int[] M;
    private static df N;
    private static df O;
    private static Image P;
    private static Image Q;
    public static boolean d;
    public static boolean e;
    private byte[] R = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
    private byte[] S;

    static {
        d = false;
        e = false;
    }

    public ar() {
        byte[] byArray = new byte[12];
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 2;
        byArray[8] = 2;
        byArray[9] = 3;
        byArray[10] = 3;
        byArray[11] = 3;
        this.S = byArray;
        int[] nArray = new int[3];
        M = nArray;
        nArray[0] = 16;
        L = main.a.B - 41;
        ar.M[1] = main.a.A - 40;
        ar.M[2] = (M[0] + M[1]) / 2;
        Image image = l.b("/e/e_1.png");
        N = new df(image, 30, 30);
        image = l.b("/e/e_0.png");
        O = new df(image, 68, 65);
        image = l.b("/e/e_2.png");
        new df(image, 66, 70);
        Q = l.b("/e/nut2.png");
        P = l.b("/e/nut3.png");
        this.s = 230;
        this.q = main.a.C - this.s / 2;
        this.t = 40;
        this.r = -this.t;
    }

    public static ar a() {
        if (a == null) {
            a = new ar();
        }
        return a;
    }

    public final void a(short[] sArray, byte by2, int n2, short s2) {
        if (sArray == null || sArray.length <= 0) {
            return;
        }
        this.n = af.e().C - 10;
        Object object = this;
        this.h = main.a.D / 3 + 10;
        if (((ar)object).h > 50) {
            ((ar)object).h = 50;
        }
        ((ar)object).i = 360;
        p.j = p.n / 2;
        ((ar)object).j = p.k + main.a.D / 3 + 30;
        ((ar)object).m = 175;
        ((ar)object).k = 0;
        ((ar)object).l = 360 / ((ar)object).m;
        ((ar)object).A = new int[((ar)object).m];
        ((ar)object).B = new int[((ar)object).m];
        ((ar)object).C = new int[((ar)object).m];
        ((ar)object).D = new int[((ar)object).m];
        ar ar2 = object;
        if (!main.a.a) {
            int n3 = 0;
            while (n3 < ar2.B.length) {
                ar2.B[n3] = ds.g(ar2.h * ds.a(ar2.k) / 1024);
                ar2.A[n3] = ds.g(ar2.h * ds.b(ar2.k) / 1024);
                if (ar2.k < 90) {
                    ar2.C[n3] = ar2.i + ar2.A[n3];
                    ar2.D[n3] = ar2.j - ar2.B[n3];
                } else if (ar2.k >= 90 && ar2.k < 180) {
                    ar2.C[n3] = ar2.i - ar2.A[n3];
                    ar2.D[n3] = ar2.j - ar2.B[n3];
                } else if (ar2.k >= 180 && ar2.k < 270) {
                    ar2.C[n3] = ar2.i - ar2.A[n3];
                    ar2.D[n3] = ar2.j + ar2.B[n3];
                } else {
                    ar2.C[n3] = ar2.i + ar2.A[n3];
                    ar2.D[n3] = ar2.j + ar2.B[n3];
                }
                ar2.k += ar2.l;
                ++n3;
            }
        }
        this.f = new eb[sArray.length];
        int n4 = 0;
        while (n4 < this.f.length) {
            this.f[n4] = new eb();
            this.f[n4].i = sArray[n4];
            this.f[n4].e = n4 * 25;
            this.f[n4].d = -999;
            this.f[n4].g = ds.b(2, 5);
            this.f[n4].h = ds.b(-1, 2);
            object = this.f[n4];
            this.f[n4].m = new af();
            ((eb)object).m.J = ds.b(-999, -800);
            ((eb)object).m.bU = -1;
            ((eb)object).m.bW = -1;
            ((eb)object).m.bV = -1;
            ((eb)object).m.bX = -1;
            ((eb)object).m.ag = "";
            ((eb)object).m.V = 20L;
            ((eb)object).m.U = 20L;
            ++n4;
        }
        this.I = false;
        this.H = false;
        this.J = false;
        this.F = main.a.b + (long)ds.b(1000, 2000);
        this.b = 0;
        this.o = -1;
        this.c = -1;
        this.g = by2;
        this.u = n2;
        this.v = 0;
        af.e().b(470, 408, 1);
        af.e().I = -1;
        af.e().H = 1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.r = -this.t;
        this.K = s2;
        this.p = 0;
        this.h();
        this.b();
        bu.a();
    }

    public final void a(int n2, Object object) {
    }

    public final void c() {
        try {
            int n2;
            this.v = this.u * this.g();
            this.h();
            p.j().c();
            if (this.F - main.a.b > 0L) {
                int n3 = 0;
                while (n3 < this.f.length) {
                    this.f[n3].e += 2;
                    if (this.f[n3].e >= this.m) {
                        this.f[n3].e = 0;
                    }
                    this.f[n3].a = this.C[this.f[n3].e];
                    this.f[n3].b = this.D[this.f[n3].e];
                    ++n3;
                }
                return;
            }
            if (this.b == 0) {
                this.b = 1;
            }
            if (this.b == 1) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].d != -999 && !this.f[n2].k) {
                        if (this.f[n2].b < this.f[n2].d) {
                            if (this.f[n2].f < 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b = this.f[n2].b + this.f[n2].f > this.f[n2].d ? this.f[n2].d : (this.f[n2].b += this.f[n2].f);
                            ++this.f[n2].f;
                        } else {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                        }
                        if (this.f[n2].b == this.f[n2].d) {
                            ea ea2 = new ea(19, this.f[n2].a - 5, this.f[n2].b + 25, 2, 1, -1);
                            ei.a(ea2);
                            bu.a();
                            this.f[n2].k = true;
                            if (!this.I) {
                                this.I = true;
                            }
                        }
                    }
                    ++n2;
                }
            }
            if (this.b == 2) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (!this.f[n2].k) {
                        if (this.f[n2].b > -10) {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                            this.f[n2].a += this.f[n2].g * this.f[n2].h;
                            this.f[n2].g -= 3;
                        }
                        if (this.f[n2].b == -10) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                ++this.w;
                if (this.w > this.R.length - 1) {
                    this.w = this.R.length - 1;
                    this.H = true;
                    bu.a();
                    if (!this.J && this.G - main.a.b < 0L) {
                        bt.a().c((byte)2, (byte)(this.f() + this.g()));
                        this.J = true;
                    }
                }
                af.e().as = this.R[this.w];
                ++this.x;
                if (this.x > 5) {
                    this.x = 0;
                }
                this.y = this.S[this.x];
            }
            if (this.b == 3) {
                if (this.x <= 5) {
                    this.x = 5;
                }
                ++this.x;
                if (this.x > this.S.length - 1) {
                    this.x = this.S.length - 1;
                    this.b = (byte)4;
                    this.H = false;
                    n2 = 0;
                    int n4 = 0;
                    while (n4 < this.f.length) {
                        if (this.f[n4].k && !this.f[n4].l) {
                            this.f[n4].i = this.E[n2];
                            this.f[n4].l = true;
                            ++n2;
                        }
                        ++n4;
                    }
                }
                this.y = this.S[this.x];
            }
            if (this.b == 4) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        this.f[n2].c = af.e().B;
                    }
                    ++n2;
                }
                this.b = (byte)5;
            }
            if (this.b == 5) {
                ++this.z;
                if (this.r < main.a.D / 3) {
                    this.r = this.r + this.z > main.a.D / 3 ? main.a.D / 3 : (this.r += this.z);
                }
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        if (this.f[n2].a < this.f[n2].c) {
                            if (this.f[n2].g < 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].a = this.f[n2].a + this.f[n2].g > this.f[n2].c ? this.f[n2].c : (this.f[n2].a += this.f[n2].g);
                            ++this.f[n2].g;
                        } else {
                            if (this.f[n2].g > 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].a += this.f[n2].g;
                            --this.f[n2].g;
                        }
                        if (this.f[n2].a == this.f[n2].c) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd--null: " + exception.toString());
        }
    }

    public final void d() {
        if (bp.b) {
            return;
        }
        if (main.a.e && !cq.b().b && !main.a.F.a) {
            int n2;
            ar ar2 = this;
            if (ar2.b == 1 && main.a.l) {
                n2 = 0;
                while (n2 < ar2.f.length) {
                    if (main.a.a(ar2.f[n2].a - 20 - p.j, ar2.f[n2].b - 10 - p.k, 30, 30) && main.a.l && main.a.m) {
                        ar2.b(n2);
                    }
                    ++n2;
                }
            }
            if (main.a.l) {
                n2 = 0;
                while (n2 < M.length) {
                    if (main.a.a(M[n2], L, 36, 36) && main.a.l && main.a.m) {
                        if (d && n2 != 2) break;
                        ar2.c(n2);
                    }
                    ++n2;
                }
            }
        }
        if (d && !main.a.i[0]) {
            main.a.g();
            main.a.f();
        }
        if (main.a.i[0]) {
            this.c(2);
        }
        int n3 = 1;
        while (n3 < 8) {
            if (main.a.i[n3]) {
                main.a.i[n3] = false;
                this.b(n3 - 1);
            }
            ++n3;
        }
        if (main.a.i[12]) {
            main.a.i[12] = false;
            this.c(0);
        }
        if (main.a.i[13]) {
            main.a.i[13] = false;
            this.c(1);
        }
        main.a.f();
    }

    private void b(int n2) {
        long l2;
        if (this.f[n2].k) {
            return;
        }
        bu.a();
        long l3 = l2 = this.g == 0 ? af.e().at : (long)af.e().Y();
        if (this.f() >= this.p && l2 < (long)(this.v + this.u)) {
            String string = String.valueOf(aw.j) + " " + (this.g == 0 ? aw.bD : aw.bE);
            p.aD.a(string, 0);
            return;
        }
        this.o = n2;
        this.f[this.o].d = this.n + ds.b(-3, 3);
    }

    private void c(int n2) {
        this.c = n2;
        if (this.c == 2) {
            if (d = !d) {
                Object object = this;
                object = new Thread(new dj((ar)object));
                ((Thread)object).start();
                return;
            }
            e = true;
            return;
        }
        if (n2 == 0) {
            if (this.b < 2) {
                if (this.f() + this.g() > 0) {
                    this.b = (byte)2;
                    bu.a();
                    af.e().a(p.u[13], 0);
                    this.G = main.a.b + (long)ds.b(2000, 3000);
                    return;
                }
            } else if (this.r == main.a.D / 3) {
                bt.a().c(this.g, (byte)0);
                return;
            }
        } else {
            if (d) {
                this.e();
            }
            p.j().bb = false;
            p.j().b();
        }
    }

    public final void a(en en2) {
        try {
            int n2;
            p.j().a(en2);
            en2.a(-p.j, -p.k);
            en2.a(0, main.a.ae);
            int n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j && this.f[n3].b > this.f[n3].d - 20) {
                    en2.a(bv.x, this.f[n3].a, this.f[n3].d + 7, 3);
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j) {
                    bl.b(en2, this.f[n3].i, this.f[n3].a, this.f[n3].b, 0, 3);
                }
                ++n3;
            }
            if (this.H) {
                if (N != null) {
                    n3 = af.e().B - ar.N.a - 28;
                    n2 = 0;
                    while (n2 < main.a.A / ar.N.a + 1) {
                        N.a(this.y, n3 - n2 * (ar.N.a - 1), af.e().C - ar.N.b / 2 - 12 + 2, 0, 0, en2);
                        ++n2;
                    }
                }
                if (O != null) {
                    n3 = af.e().B - ar.O.a - 10;
                    O.a(this.y, n3 - 5, af.e().C - ar.O.b / 2 - 12, 0, 0, en2);
                }
            }
            p.c(en2);
            n2 = main.a.A - 240;
            en2.a(13524492);
            en2.d(n2, 0, 240, 15);
            en2.a(g.w, n2 + 11, 8, 3);
            en2.a(g.y, n2 + 90, 7, 3);
            di.n.a(en2, String.valueOf(af.e().o), n2 + 24, 2, 0, di.o);
            di.n.a(en2, String.valueOf(af.e().p), n2 + 100, 2, 0, di.o);
            en2.a(g.z, n2 + 150, 8, 3);
            di.n.a(en2, String.valueOf(af.e().q), n2 + 160, 2, 0, di.o);
            en2.a(g.x, n2 + 200, 8, 3);
            di.n.a(en2, String.valueOf(this.p), n2 + 210, 2, 0, di.o);
            if (this.b < 4) {
                n2 = main.a.A - 140;
                en2.a(11837316);
                en2.d(n2, 15, 140, 15);
                if (this.g == 0) {
                    en2.a(g.w, n2 + 21, 23, 3);
                } else {
                    en2.a(g.z, n2 + 21, 22, 3);
                    en2.a(g.y, n2 + 18, 22, 3);
                }
                di.p.a(en2, "-" + this.v, n2 + 30, 17, 0, di.o);
                en2.a(g.x, n2 + 80, 22, 3);
                di.p.a(en2, "-" + this.f(), n2 + 90, 17, 0, di.o);
            }
            en2.a(p.au, M[0], L, 0);
            if (this.c == 0) {
                en2.a(p.av, M[0], L, 0);
            }
            if (this.b < 3) {
                bl.b(en2, 540, M[0] + 14, L + 14, 0, cj.f);
            } else {
                en2.a(Q, M[0] + 14 - 10, L + 14 - 10, 0);
            }
            en2.a(p.au, M[1], L, 0);
            if (this.c == 1) {
                en2.a(p.av, M[1], L, 0);
            }
            en2.a(P, M[1] + 14 - 10, L + 14 - 10, 0);
            if (this.b > 3) {
                cx.c(this.q, this.r, this.s, this.t, en2);
                n3 = main.a.C - this.E.length * 30 / 2;
                n2 = 0;
                while (n2 < this.E.length) {
                    bl.b(en2, this.E[n2], n3 + 5 + n2 * 30, this.r + 10, 0, 0);
                    ++n2;
                }
            }
            if (d) {
                en2.a(p.av, (M[0] + M[1]) / 2, L, 0);
            } else {
                en2.a(p.au, (M[0] + M[1]) / 2, L, 0);
            }
            bl.b(en2, 4387, (M[0] + M[1]) / 2 + 14, L + 14, 0, cj.f);
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint--null: " + exception.toString());
            return;
        }
    }

    public final void a(short[] sArray) {
        this.b = (byte)3;
        this.E = sArray;
    }

    public final void b() {
        p.a = true;
        p.j().bb = true;
        super.b();
    }

    private byte f() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if (by2 > this.p) {
            by2 = (byte)this.p;
        }
        return by2;
    }

    private byte g() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if ((by2 = (byte)(by2 - this.f())) <= 0) {
            by2 = 0;
        }
        return by2;
    }

    private void h() {
        int n2 = 0;
        while (n2 < af.e().aF.length) {
            if (af.e().aF[n2] != null && af.e().aF[n2].b.a == this.K) {
                this.p = af.e().aF[n2].h;
                return;
            }
            ++n2;
        }
    }

    public final void e() {
        d = false;
        this.c = -1;
        e = false;
    }

    static void a(ar ar2, int n2) {
        ar2.b(n2);
    }

    static void a(ar ar2) {
        if (ar2.b < 2) {
            if (ar2.f() + ar2.g() > 0) {
                ar2.b = (byte)2;
                bu.a();
                af.e().a(p.u[13], 0);
                ar2.G = main.a.b + (long)ds.b(2000, 3000);
                return;
            }
        } else if (ar2.r == main.a.D / 3) {
            bt.a().c(ar2.g, (byte)0);
        }
    }
}

