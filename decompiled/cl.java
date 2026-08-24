/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cl
extends aa
implements bq {
    private static Image ad = l.b("/mainImage/shadowBig.png");
    public int a;
    public int b;
    private int ae;
    private int af;
    private boolean ag = true;
    private int ah;
    private int ai;
    private af[] aj;
    private long[] ak;
    private byte al;
    private int am;
    private int an = -1;
    private int ao = -1;
    private int ap = -1;
    private int[][] aq;

    static {
        l.b("/mainImage/myTexture2dmobHP.png");
    }

    public final void a(short s2) {
        this.d = true;
        this.e = s2;
    }

    public final void a() {
        this.d = false;
    }

    public cl(int n2, short s2, short s3, int n3, long l2, long l3) {
        byte[] byArray = new byte[]{-1, 1};
        int[][] nArrayArray = new int[17][];
        int[] nArray = new int[8];
        nArray[4] = 1;
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[4] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[5] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[6] = nArray7;
        int[] nArray8 = new int[8];
        nArray8[4] = 1;
        nArray8[5] = 1;
        nArray8[6] = 1;
        nArray8[7] = 1;
        nArrayArray[7] = nArray8;
        int[] nArray9 = new int[8];
        nArray9[4] = 1;
        nArray9[5] = 1;
        nArray9[6] = 1;
        nArray9[7] = 1;
        nArrayArray[8] = nArray9;
        int[] nArray10 = new int[8];
        nArray10[4] = 1;
        nArray10[5] = 1;
        nArray10[6] = 1;
        nArray10[7] = 1;
        nArrayArray[9] = nArray10;
        int[] nArray11 = new int[8];
        nArray11[4] = 1;
        nArray11[5] = 1;
        nArray11[6] = 1;
        nArray11[7] = 1;
        nArrayArray[10] = nArray11;
        int[] nArray12 = new int[8];
        nArray12[4] = 1;
        nArray12[5] = 1;
        nArray12[6] = 1;
        nArray12[7] = 1;
        nArrayArray[11] = nArray12;
        int[] nArray13 = new int[8];
        nArray13[4] = 1;
        nArray13[5] = 1;
        nArray13[6] = 1;
        nArray13[7] = 1;
        nArrayArray[12] = nArray13;
        int[] nArray14 = new int[8];
        nArray14[4] = 1;
        nArray14[5] = 1;
        nArray14[6] = 1;
        nArray14[7] = 1;
        nArrayArray[13] = nArray14;
        int[] nArray15 = new int[8];
        nArray15[4] = 1;
        nArray15[5] = 1;
        nArray15[6] = 1;
        nArray15[7] = 1;
        nArrayArray[14] = nArray15;
        int[] nArray16 = new int[8];
        nArray16[4] = 1;
        nArray16[5] = 1;
        nArray16[6] = 1;
        nArray16[7] = 1;
        nArrayArray[15] = nArray16;
        int[] nArray17 = new int[8];
        nArray17[4] = 1;
        nArray17[5] = 1;
        nArray17[6] = 1;
        nArray17[7] = 1;
        nArrayArray[16] = nArray17;
        this.aq = nArrayArray;
        this.y = n2;
        this.m = this.t = s2 + 20;
        short s4 = s3;
        this.u = s4;
        this.n = s4;
        this.a = this.m;
        this.b = this.n;
        this.l = l3;
        this.k = l2;
        this.C = n3;
        this.U = 100;
        this.A();
        if (aa.c[this.C].f == null) {
            bt.a().h(this.C);
        }
        this.p = 2;
        this.aq = null;
    }

    public final void a(int[] nArray) {
        ++this.ah;
        if (this.ah > nArray.length - 1) {
            this.ah = 0;
        }
        this.ai = nArray[this.ah];
    }

    public final void b() {
    }

    public final void c() {
        if (this.aq == null && aa.c[this.C].f != null) {
            this.B();
        }
        if (this.aq == null) {
            return;
        }
        if (!this.i()) {
            return;
        }
        cl cl2 = this;
        int n2 = 0;
        cl2.ae = cl2.m;
        if (bv.a(cl2.m, cl2.n, 2)) {
            cl2.af = cl2.n;
        } else {
            cl2.af = cl2.n;
            while (n2 < 30) {
                ++n2;
                cl2.af += 24;
                if (!bv.a(cl2.ae, cl2.af, 2)) continue;
                if (cl2.af % 24 == 0) break;
                cl2.af -= cl2.af % 24;
                break;
            }
        }
        switch (this.p) {
            case 2: {
                cl2 = this;
                cl2.a(cl2.aq[0]);
                if (cl2.m != cl2.a || cl2.n != cl2.b) {
                    cl2.m += (cl2.a - cl2.m) / 4;
                    cl2.n += (cl2.b - cl2.n) / 4;
                }
                return;
            }
            case 3: {
                this.f();
                return;
            }
            case 5: {
                this.x = 0;
                this.g();
                return;
            }
            case 6: {
                this.x = 0;
                ++this.q;
                this.n += this.q;
                if (this.n < this.u) break;
                this.n = this.u;
                this.q = 0;
                this.p = 5;
                return;
            }
            case 7: {
                super.c();
                return;
            }
            case 0: 
            case 1: {
                cl2 = this;
                ++cl2.ah;
                if (cl2.ah > cl2.aq[13].length - 1) {
                    cl2.ah = cl2.aq[13].length - 1;
                }
                cl2.ai = cl2.aq[13][cl2.ah];
                if (cl2.m == cl2.a && cl2.n == cl2.b) break;
                cl2.m += (cl2.a - cl2.m) / 4;
                cl2.n += (cl2.b - cl2.n) / 4;
            }
        }
    }

    public final void a(af af2) {
        this.D = af2;
        this.q = 0;
        this.r = 0;
        this.p = 3;
        this.ah = 0;
        int n2 = af2.B;
        int n3 = af2.C;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.s = 0;
            return;
        }
        this.s = 1;
    }

    public final void C() {
        this.p = 4;
    }

    public final void a(af[] afArray, long[] lArray, byte by2, byte by3) {
        this.aj = afArray;
        this.ak = lArray;
        this.al = by2;
        this.o = by3;
        this.p = 3;
        if (this.m != this.a || this.n != this.b) {
            this.m += (this.a - this.m) / 4;
            this.n += (this.b - this.n) / 4;
        }
    }

    public final void f() {
        if (this.ah == this.aq[this.al + 1].length - 1) {
            this.p = 2;
        }
        this.a(this.aq[this.al + 1]);
        if (this.ah == this.aq[15][this.al - 1]) {
            int n2 = 0;
            while (n2 < this.aj.length) {
                this.aj[n2].a(this.ak[n2], 0L, false, false);
                at.a(this.aq[16][this.al - 1], this.aj[n2].B, this.aj[n2].C, 1);
                ++n2;
            }
        }
    }

    public final void g() {
        int n2;
        this.a(this.aq[1]);
        int n3 = n2 = aa.c[this.C].b;
        if (ds.g(this.m - this.a) < n2) {
            n3 = ds.g(this.m - this.a);
        }
        this.m += this.m < this.a ? n3 : -n3;
        this.n = this.b;
        if (this.m < this.a) {
            this.o = 1;
        } else if (this.m > this.a) {
            this.o = -1;
        }
        if (ds.g(this.m - this.a) <= 1) {
            this.m = this.a;
            this.p = 2;
        }
    }

    public final boolean h() {
        if (this.m < p.j) {
            return false;
        }
        if (this.m > p.j + p.d) {
            return false;
        }
        if (this.n < p.k) {
            return false;
        }
        if (this.n > p.k + p.e + 30) {
            return false;
        }
        return this.p != 0;
    }

    public final boolean i() {
        return this.p != 0;
    }

    public final boolean j() {
        return this.I || this.H > 0;
    }

    public final void a(en en2) {
        int n2;
        if (aa.c[this.C].f == null) {
            return;
        }
        if (this.Y) {
            return;
        }
        if (this.M) {
            if (!this.d) {
                aa.c[this.C].f.a(en2, this.ai, this.N, this.O, this.o == 1 ? 0 : 1, 2);
                return;
            }
            bl.b(en2, this.e, this.N, this.O, this.o == 1 ? 0 : 2, 33);
            return;
        }
        if (this.ag) {
            en en3 = en2;
            cl cl2 = this;
            n2 = bv.i;
            if ((bv.l < 114 || bv.l > 120) && bv.l != 127 && bv.l != 128) {
                if (bv.a(cl2.ae + n2 / 2, cl2.af + 1, 4)) {
                    en3.e(cl2.ae / n2 * n2, (cl2.af - 30) / n2 * n2, n2, 100);
                } else if (bv.a((cl2.ae - n2 / 2) / n2, (cl2.af + 1) / n2) == 0) {
                    en3.e(cl2.ae / n2 * n2, (cl2.af - 30) / n2 * n2, 100, 100);
                } else if (bv.a((cl2.ae + n2 / 2) / n2, (cl2.af + 1) / n2) == 0) {
                    en3.e(cl2.ae / n2 * n2, (cl2.af - 30) / n2 * n2, n2, 100);
                } else if (bv.a(cl2.ae - n2 / 2, cl2.af + 1, 8)) {
                    en3.e(cl2.ae / 24 * n2, (cl2.af - 30) / n2 * n2, n2, 100);
                }
            }
            en3.a(ad, cl2.ae, cl2.af - 5, 3);
            en3.e(p.j, p.k - main.a.ae, p.d, p.e + 2 * main.a.ae);
        }
        en2.a(0, main.a.ae);
        if (!this.d) {
            if (this.ap == -1) {
                this.ap = this.n;
            }
            if (bv.a(this.m + 33, this.n, 4)) {
                this.ao = bv.f(this.m + 33) - 33;
                this.an = bv.f(this.m + 33);
                if (this.m > this.ao && this.m < this.an && this.an != -1) {
                    this.m = this.ao;
                }
            }
            if (this.n < this.ap && this.ap != -1) {
                this.ap = this.n;
                this.m += 33;
            }
            if (this.n > this.ap) {
                this.ap = this.n;
                this.m -= 33;
            }
            aa.c[this.C].f.a(en2, this.ai, this.m, this.n, this.o == 1 ? 0 : 1, 2);
        } else {
            bl.b(en2, this.e, this.m, this.n - 9, this.o == 1 ? 0 : 2, 33);
        }
        en2.a(0, -main.a.ae);
        if (this.k > 0L) {
            int n3;
            int n4 = en.a(this.X);
            int n5 = en.b(this.X);
            n2 = n4;
            int n6 = this.m - n4;
            int n7 = this.n - this.w - 5;
            int n8 = n3 = (n4 << 1) * this.V / 100;
            if (this.W >= this.V) {
                int n9;
                if (main.a.w % 6 > 3) {
                    int n10 = this.am;
                    n9 = n10;
                    this.am = n10 + 1;
                } else {
                    n9 = this.am;
                }
                n8 = n4 * (this.W -= n9) / 100;
                if (this.W <= 0) {
                    this.W = 0;
                }
                if (this.W < this.V) {
                    this.W = this.V;
                }
                if (this.am >= 3) {
                    this.am = 3;
                }
            }
            if (n3 > n4) {
                if ((n3 -= n4) <= 0) {
                    n3 = 0;
                }
            } else {
                n2 = n3;
                n3 = 0;
            }
            en2.a(p.aJ, n6, n7, 20);
            en2.a(p.aJ, n6 + n4, n7, 20);
            en2.a(0xFFFFFF);
            en2.d(n6, n7, n8, 2);
            en2.a(this.X, 0, 0, n2, n5, 0, n6, n7, 20);
            en2.a(this.X, 0, 0, n3, n5, 0, n6 + n4, n7, 20);
        }
    }

    public final void k() {
        this.k = 0L;
        this.k = 0L;
        this.p = 1;
        this.q = -3;
        this.r = -this.o;
        this.s = 0;
    }

    public final void a(aa aa2) {
        this.D = null;
        this.q = 0;
        this.r = 0;
        this.p = 3;
        this.ah = 0;
        int n2 = aa2.m;
        int n3 = aa2.n;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.s = 0;
            return;
        }
        this.s = 1;
    }

    public final int l() {
        return this.m;
    }

    public final int m() {
        return this.n;
    }

    public final int n() {
        return this.w;
    }

    public final int o() {
        return this.v;
    }

    public final void p() {
        if (this.p == 5) {
            this.p = 2;
            this.s = 0;
            this.r = 0;
            this.q = 0;
        }
    }

    public final boolean q() {
        return this.p == 0 || this.p == 1;
    }

    public final void r() {
        if (this.j != 0) {
            this.j = 0;
        }
    }

    public final void s() {
    }

    public final void t() {
    }

    public final void a(short s2, short s3) {
        if (s3 != -1) {
            if (ds.a(this.m, this.n, this.a, this.b) > 100) {
                this.m = s2;
                this.n = s3;
                this.p = 2;
                return;
            }
            this.a = s2;
            this.b = s3;
            this.p = 5;
            return;
        }
        this.a = s2;
        this.p = 5;
    }

    public final void B() {
        try {
            this.aq = (int[][])ac.d.get(String.valueOf(this.C));
            this.v = aa.c[this.C].f.f;
            this.w = aa.c[this.C].f.g;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void D() {
        this.p = 0;
    }
}

