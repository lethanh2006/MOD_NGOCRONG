/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class aq
extends bb {
    private static aq h;
    private static boolean i;
    private static df j;
    private static df k;
    public static df a;
    private static Image l;
    private static Image m;
    private static Image n;
    private static Image o;
    private static Image p;
    private static Image q;
    private static Image r;
    private static Image s;
    private static Image t;
    private static Image u;
    private static Image v;
    private static Image w;
    private static Image x;
    private static Image y;
    private static Image[] z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    public static int b;
    public static int c;
    public static int d;
    private static int G;
    public static int e;
    private static int H;
    private static int[] I;
    private static int[] J;
    private static int[][] K;
    private static int[][] L;
    private static int[] M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R = 0;
    public static el f;
    public static el g;
    private static int S;
    private ef T;
    private int U = 0;
    private int V = 0;
    private int W;
    private int X;
    private int Y;

    static {
        I = new int[0];
        J = new int[0];
        int[] nArray = new int[5];
        nArray[0] = -2;
        nArray[1] = -1;
        nArray[3] = 1;
        nArray[4] = 2;
        M = nArray;
    }

    public static aq a() {
        if (h == null) {
            h = new aq();
        }
        return h;
    }

    public aq() {
        i = true;
        Image image = l.b("/radar/17.png");
        Image image2 = l.b("/radar/3.png");
        Image image3 = l.b("/radar/23.png");
        j = new df(image, 28, 28);
        k = new df(image2, 30, 30);
        a = new df(image3, 11, 11);
        l = l.b("/radar/0.png");
        n = l.b("/radar/1.png");
        o = l.b("/radar/2.png");
        m = l.b("/radar/17.png");
        p = l.b("/radar/4.png");
        q = l.b("/radar/5.png");
        r = l.b("/radar/6.png");
        z = new Image[7];
        int n2 = 0;
        while (n2 < 7) {
            aq.z[n2] = l.b("/radar/" + (n2 + 7) + ".png");
            ++n2;
        }
        s = l.b("/radar/14.png");
        t = l.b("/radar/15.png");
        u = l.b("/radar/16.png");
        m = l.b("/radar/18.png");
        w = l.b("/radar/19.png");
        x = l.b("/radar/20.png");
        y = l.b("/radar/21.png");
        v = l.b("/radar/22.png");
        C = 200;
        D = 219;
        A = main.a.C - (C + 40) / 2;
        B = main.a.D - D / 2;
        b = A + C - 81;
        c = B + 29;
        d = 120;
        e = 80;
        K = new int[][]{{A + 34, B + D - 42}, {A + C / 2 - p.getWidth() / 2, B + D / 2 + 33}, {A + C - 41, B + D - 42}};
        L = new int[][]{{A + 25, B + D - 82}, {A + 57, B + D - 62}, {A + C / 2 - 14, B + D - 102}, {A + C - 57 - 28, B + D - 62}, {A + C - 25 - 28, B + D - 82}};
        this.O = new int[2];
        this.N = 0;
        E = A + 73;
        F = B + D / 2 + 5;
        H = B + D - 22;
        I = new int[]{A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80};
        J = new int[3];
        this.X = c + 10 + 70;
        this.Y = 0;
        f = new el("");
        g = new el("");
        this.P = 1;
        this.Q = 2;
    }

    public final void a(el el2, int n2, int n3) {
        f = el2;
        int n4 = n2;
        n2 = n3;
        n2 = n4;
        S = n4;
        this.P = 1;
        this.R = 2;
        this.f();
        i = true;
        aq.e();
        if (i) {
            this.Q = el2.size() / 5 + (el2.size() % 5 > 0 ? 1 : 0);
            return;
        }
        this.Q = g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
    }

    public static void a(int n2, int n3) {
        S = n2;
    }

    public static void e() {
        g = new el("");
        int n2 = 0;
        while (n2 < f.size()) {
            ef ef2 = (ef)f.elementAt(n2);
            if (ef2 != null && ef2.k == 1) {
                g.addElement(ef2);
            }
            ++n2;
        }
    }

    private void f() {
        el el2 = g;
        if (i) {
            el2 = f;
        }
        int n2 = (this.P - 1) * 5;
        int n3 = n2 + 5;
        int n4 = n2;
        while (n4 < n3) {
            if (n4 >= el2.size()) {
                aq.M[n4 - n2] = -1;
            } else {
                ef ef2 = (ef)el2.elementAt(n4);
                if (ef2 != null) {
                    aq.M[n4 - n2] = ef2.e;
                }
            }
            ++n4;
        }
        bu.a();
    }

    public final void c() {
        try {
            if (e < 80 && (e += 4) > 80) {
                e = 80;
            }
            this.T = ef.a(g, M[this.R]);
            if (i) {
                this.T = ef.a(f, M[this.R]);
            }
            p.j().c();
            if (main.a.w % 10 < 6) {
                if (main.a.w % 2 == 0) {
                    --this.N;
                }
            } else {
                this.N = 0;
            }
            if (this.T != null) {
                int n2 = this.T.b * 100 / this.T.c;
                this.Y = n2 * w.getHeight() / 100;
                n2 = S * 100 / f.size();
                this.W = n2 * y.getWidth() / 100;
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd-radaScr-null: " + exception.toString());
        }
    }

    public final void d() {
        if (bp.b) {
            return;
        }
        if (main.a.e && !cq.b().b && !main.a.F.a) {
            aq aq2 = this;
            if (main.a.l) {
                int n2 = 0;
                while (n2 < 5) {
                    if (main.a.a(L[n2][0], L[n2][1], 30, 30) && main.a.l && main.a.m && n2 != aq2.R) {
                        int n3 = n2;
                        aq aq3 = aq2;
                        aq2.R = n3;
                        aq3.f();
                    }
                    ++n2;
                }
                if (main.a.a(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
                    if (main.a.k) {
                        aq2.O[0] = 1;
                    }
                    if (main.a.l && main.a.m) {
                        aq2.c(0);
                        aq2.O[0] = 0;
                    }
                }
                if (main.a.a(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
                    if (main.a.k) {
                        aq2.O[1] = 1;
                    }
                    if (main.a.l && main.a.m) {
                        aq2.c(1);
                        aq2.O[1] = 0;
                    }
                }
                n2 = 0;
                while (n2 < I.length) {
                    if (main.a.a(I[n2] - 5, H - 5, 20, 20)) {
                        if (main.a.k) {
                            aq.J[n2] = 1;
                        }
                        if (main.a.l && main.a.m) {
                            aq2.b(n2);
                            aq.J[n2] = 0;
                        }
                    }
                    ++n2;
                }
            } else {
                aq.J[0] = 0;
                aq.J[1] = 0;
                aq.J[2] = 0;
                aq2.O[0] = 0;
                aq2.O[1] = 0;
            }
            if (main.a.a(b, 0, d, c + e)) {
                if (main.a.n) {
                    if (aq2.V == 0) {
                        aq2.V = main.a.q;
                    }
                    aq2.U = aq2.V - main.a.q;
                    if (aq2.U != 0) {
                        G += aq2.U;
                        aq2.V = main.a.q;
                    }
                    if (G < 0) {
                        G = 0;
                    }
                    if (G > aq2.T.r.h) {
                        G = aq2.T.r.h;
                    }
                } else {
                    aq2.V = 0;
                    aq2.V = 0;
                }
            }
        }
        if (main.a.i[8]) {
            main.a.i[8] = false;
            this.d(1);
        }
        if (main.a.i[2]) {
            main.a.i[2] = false;
            this.d(-1);
        }
        if (main.a.i[4]) {
            main.a.i[4] = false;
            this.e(1);
        }
        if (main.a.i[6]) {
            main.a.i[6] = false;
            this.e(0);
        }
        if (main.a.i[12]) {
            main.a.i[12] = false;
            this.b(0);
        }
        if (main.a.i[5]) {
            main.a.i[5] = false;
            this.b(1);
        }
        if (main.a.i[13]) {
            this.b(2);
        }
        main.a.f();
    }

    private void b(int n2) {
        if (n2 == 0) {
            aq aq2 = this;
            i = !i;
            aq2.P = 1;
            aq2.R = 0;
            aq2.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
            aq2.f();
            e = 0;
        } else if (n2 == 1) {
            if (this.T != null) {
                bt.a().b(1, this.T.e);
            }
        } else if (n2 == 2) {
            p.j().b();
        }
        bu.a();
    }

    private void c(int n2) {
        this.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
        int n3 = this.P;
        if (n2 == 0) {
            if (this.P == 1) {
                return;
            }
            if (--n3 <= 0) {
                n3 = 1;
            }
        } else {
            if (this.P == this.Q) {
                return;
            }
            if (++n3 > this.Q) {
                n3 = this.Q;
            }
        }
        if (n3 != this.P) {
            this.P = n3;
            this.f();
        }
    }

    private void d(int n2) {
        if ((G += n2 * 12) < 0) {
            G = 0;
        }
        if (G > this.T.r.h) {
            G = this.T.r.h;
        }
    }

    private void e(int n2) {
        int n3 = this.R;
        int n4 = this.P;
        n3 = n2 == 0 ? ++n3 : --n3;
        if (n3 >= M.length) {
            if (this.P < this.Q) {
                n3 = 0;
                ++n4;
            } else {
                n3 = M.length - 1;
            }
        }
        if (n3 < 0) {
            if (this.P > 1) {
                n3 = M.length - 1;
                --n4;
            } else {
                n3 = 0;
            }
        }
        if (n3 != this.R) {
            this.R = n3;
            G = 0;
            e = 0;
        }
        if (n4 != this.P) {
            this.P = n4;
            this.f();
        }
    }

    public final void a(en en2) {
        try {
            int n2;
            int n3;
            p.j().a(en2);
            en2.a(-p.j, -p.k);
            en2.a(0, main.a.ae);
            p.c(en2);
            en2.a(l, A, B, 0);
            en2.a(x, A + C / 2 - l.a(x) / 2, B - l.b(x) / 2 - 2, 0);
            en2.e(A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, this.W, l.b(x));
            en2.a(y, A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, 0);
            p.c(en2);
            en2.a(u, I[0], H + J[0], 0);
            en2.a(r, I[1], H + J[1], 0);
            en2.a(t, I[2], H + J[2], 0);
            if (i) {
                en2.a(s, 0, 0, 17, 17, 0, I[1], H + J[1], 0);
            } else {
                en2.a(s, 0, 0, 17, 17, 1, I[1], H + J[1], 0);
            }
            if (this.T != null) {
                en2.e(A + 30, B + 13, C - 60, D / 2);
                n3 = F;
                n2 = E;
                en en3 = en2;
                ef ef2 = this.T;
                ++ef2.p;
                if (ef2.p > ef2.o.length - 1) {
                    ef2.p = 0;
                }
                if (ef2.d == 0) {
                    if (aa.c[ef2.m.C] != null) {
                        if (aa.c[ef2.m.C].f != null) {
                            aa.c[ef2.m.C].f.a(en3, ef2.o[ef2.p], n2, n3, 0, 0);
                        } else if (ef2.q - main.a.b < 0L) {
                            ef2.q = main.a.b + 1500L;
                            ef2.m.v();
                        }
                    }
                } else if (ef2.l != null) {
                    ef2.l.a(en3, n2, n3, 1, ef2.o[ef2.p], true);
                }
                p.c(en2);
                di.d.a(en2, String.valueOf(this.T.j > 0 ? "Lv." + this.T.j + " " : "") + this.T.h, A + C / 2, B + 15, 2);
                di.s.a(en2, "no." + this.T.f, A + 30, c - 2, 0);
                en2.a(v, A + 36, c + 10, 0);
                en2.e(A + 36, this.X - this.Y, 7, this.Y);
                en2.a(w, A + 36, c + 10, 0);
                p.c(en2);
                en2.a(z[this.T.a], A + 39 - 5 + 14, c + 12, 0);
            }
            en2.e(b, c, d + 5, e + 8);
            if (this.T != null) {
                en2.a(m, b, c, 0);
            }
            p.c(en2);
            en2.e(b, c + 1, d, e + 5);
            if (this.T != null && this.T.r != null && this.T.r.d != null) {
                this.T.r.a(en2, G);
            }
            p.c(en2);
            if (!i && g.size() > 5 || i) {
                if (this.P > 1) {
                    en2.a(n, K[0][0], K[0][1] + this.O[0], 0);
                }
                if (this.P < this.Q) {
                    en2.a(o, K[2][0], K[2][1] + this.O[1], 0);
                }
            }
            int n4 = 0;
            while (n4 < M.length) {
                int n5 = 0;
                n2 = 0;
                n3 = 0;
                if (n4 == this.R) {
                    n5 = this.N;
                    n2 = -10;
                    n3 = 1;
                    en2.a(p, L[n4][0] + 10, L[n4][1] + this.N + 29 + -10, 0);
                }
                ef ef3 = ef.a(g, M[n4]);
                if (i) {
                    ef3 = ef.a(f, M[n4]);
                }
                if (ef3 != null) {
                    j.a(ef3.a, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    bl.b(en2, ef3.g, L[n4][0] + 14, L[n4][1] + 14 + n5 + n2, 0, cj.f);
                    ef3.a(en2, L[n4][0], L[n4][1] + n5 + n2);
                    if (ef3.j == 0) {
                        en2.a(q, L[n4][0], L[n4][1] + n5 + n2, 0);
                    }
                    if (n4 == this.R) {
                        j.a(7, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    }
                    if (ef3.k == 1) {
                        j.a(8, L[n4][0], L[n4][1] + n5 + n2, 0, 0, en2);
                    }
                } else {
                    k.a(n3, L[n4][0] - 1, L[n4][1] - 1 + n5 + n2, 0, 0, en2);
                }
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint-radaScr-null: " + exception.toString());
            return;
        }
    }

    public final void b() {
        p.a = true;
        super.b();
    }
}

