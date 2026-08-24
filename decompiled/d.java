/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class d
extends aa
implements bq {
    private static Image ad = l.b("/mainImage/shadowBig.png");
    private static ck ae;
    public int a;
    public int b;
    private int af;
    private int ag;
    private boolean ah;
    private int ai;
    private boolean aj = true;
    private int ak;
    private int al;
    private boolean am;
    private int an;
    private int ao;
    private af[] ap;
    private long[] aq;
    private byte ar;
    private int[] as;
    private int[] at;
    private int[] au;
    private int[] av;
    private int[] aw;
    private boolean ax;

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

    public d(int n2, short s2, short s3, int n3, long l2, long l3) {
        int[] nArray = new int[12];
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.as = nArray;
        int[] nArray2 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        int[] nArray3 = new int[]{1, 1, 2, 2, 3, 3, 2};
        int[] nArray4 = new int[12];
        nArray4[3] = 7;
        nArray4[4] = 7;
        nArray4[5] = 7;
        nArray4[6] = 8;
        nArray4[7] = 8;
        nArray4[8] = 8;
        nArray4[9] = 9;
        nArray4[10] = 9;
        nArray4[11] = 9;
        this.at = nArray4;
        int[] nArray5 = new int[12];
        nArray5[3] = 10;
        nArray5[4] = 10;
        nArray5[5] = 10;
        nArray5[6] = 11;
        nArray5[7] = 11;
        nArray5[8] = 11;
        nArray5[9] = 12;
        nArray5[10] = 12;
        nArray5[11] = 12;
        this.au = nArray5;
        int[] nArray6 = new int[24];
        nArray6[2] = 1;
        nArray6[3] = 1;
        nArray6[4] = 4;
        nArray6[5] = 4;
        nArray6[6] = 6;
        nArray6[7] = 6;
        nArray6[8] = 8;
        nArray6[9] = 8;
        nArray6[10] = 25;
        nArray6[11] = 25;
        nArray6[12] = 26;
        nArray6[13] = 26;
        nArray6[14] = 28;
        nArray6[15] = 28;
        nArray6[16] = 30;
        nArray6[17] = 30;
        nArray6[18] = 32;
        nArray6[19] = 32;
        nArray6[20] = 2;
        nArray6[21] = 2;
        nArray6[22] = 1;
        nArray6[23] = 1;
        this.av = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        this.aw = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        byte[] byArray = new byte[]{-1, 1};
        this.y = n2;
        this.a = this.m = s2 + 20;
        short s4 = s3;
        this.n = s4;
        this.b = s4;
        this.u = s3;
        this.k = l2;
        this.l = l3;
        this.C = 72;
        this.U = 100;
        this.A();
        d d2 = this;
        ae = null;
        ae = new ck();
        String string = "/x" + en.b + "/effectdata/" + 109 + "/data";
        try {
            ae.b(string);
            d.ae.a = l.c("/effectdata/109/img.png");
        }
        catch (Exception exception) {
            bt.a().h(d2.C);
        }
        d2.v = d.ae.f;
        d2.w = d.ae.g;
        this.p = 2;
    }

    public final void a(int[] nArray) {
        ++this.ak;
        if (this.ak > nArray.length - 1) {
            this.ak = 0;
        }
        this.al = nArray[this.ak];
    }

    public final void b() {
    }

    public final void c() {
        if (!this.i()) {
            return;
        }
        d d2 = this;
        byte by2 = bv.i;
        d2.af = d2.m;
        d2.ai = 0;
        if (d2.ag > 0 && !bv.a(d2.af, d2.ag, 2)) {
            if (bv.a(d2.af / by2, d2.ag / by2) == 0) {
                d2.ah = true;
            } else if (bv.a(d2.af / by2, d2.ag / by2) != 0 && !bv.a(d2.af, d2.ag, 2)) {
                d2.af = d2.m;
                d2.ag = d2.n;
                d2.ah = false;
            }
            while (d2.ah && d2.ai < 10) {
                ++d2.ai;
                d2.ag += 24;
                if (!bv.a(d2.af, d2.ag, 2)) continue;
                if (d2.ag % 24 == 0) break;
                d2.ag -= d2.ag % 24;
                break;
            }
        }
        switch (this.p) {
            case 2: {
                d2 = this;
                d2.a(d2.as);
                if (d2.m != d2.a || d2.n != d2.b) {
                    d2.m += (d2.a - d2.m) / 4;
                    d2.n += (d2.b - d2.n) / 4;
                }
                return;
            }
            case 4: {
                this.x = 0;
                d2 = this;
                if (d2.am) {
                    d2.m = d2.a;
                    d2.an += 2;
                    d2.n += d2.an;
                    d2.a(d2.aw);
                    if (d2.n > d2.u) {
                        d2.n = d2.u;
                        d2.am = false;
                        d2.an = 0;
                        d2.p = 2;
                        p.bu = 10;
                        d2.ax = true;
                    }
                }
                return;
            }
            case 3: {
                this.f();
                return;
            }
            case 5: {
                this.x = 0;
                d d3 = this;
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
                return;
            }
            case 0: 
            case 1: {
                d2 = this;
                d2.a(d2.as);
                if (main.a.w % 5 == 0) {
                    d d4 = d2;
                    d4 = d2;
                    d d5 = d2;
                    d4 = d5;
                    d4 = d2;
                    d d6 = d2;
                    d4 = d6;
                    d4 = d2;
                    at.a(167, ds.b(d2.m - 50 / 2, d2.m + 50 / 2), ds.b(d5.n - 50 + 40 / 2, d6.n - 50 + 40), 1);
                }
                if (d2.m == d2.a && d2.n == d2.b) break;
                d2.m += (d2.a - d2.m) / 4;
                d2.n += (d2.b - d2.n) / 4;
            }
        }
    }

    public final void d() {
    }

    public final void a(af af2) {
        this.D = af2;
        this.q = 0;
        this.r = 0;
        this.p = 3;
        this.ak = 0;
        this.o = af2.B > this.m ? 1 : -1;
        int n2 = af2.B;
        int n3 = af2.C;
        if (ds.g(n2 - this.m) < this.v << 1 && ds.g(n3 - this.n) < this.w << 1) {
            this.m = this.m < n2 ? n2 - this.v : n2 + this.v;
            this.s = 0;
            return;
        }
        this.s = 1;
    }

    final boolean e() {
        return this.C >= 58 && this.C <= 65 || this.C == 67 || this.C == 68;
    }

    public final void a(af[] afArray, long[] lArray, byte by2) {
        this.p = 3;
        this.ap = afArray;
        this.aq = lArray;
        this.ar = by2;
        this.ak = 0;
    }

    public final void f() {
        int n2;
        if (this.ar == 0) {
            if (this.ak == this.at.length - 1) {
                this.p = 2;
            }
            this.o = this.m < this.ap[0].B ? 1 : -1;
            this.a(this.at);
            this.m += (this.ap[0].B - this.m) / 4;
            this.n += (this.ap[0].C - this.n) / 4;
            this.a = this.m;
            if (this.ak == 8) {
                n2 = 0;
                while (n2 < this.ap.length) {
                    this.ap[n2].a(this.aq[n2], 0L, false, false);
                    at.a(102, this.ap[n2].B, this.ap[n2].C, 1);
                    ++n2;
                }
            }
        }
        if (this.ar == 1) {
            if (this.ak == this.au.length - 1) {
                this.p = 2;
            }
            this.o = this.m < this.ap[0].B ? 1 : -1;
            this.a(this.au);
            if (this.ak == 8) {
                n2 = 0;
                while (n2 < this.ap.length) {
                    ah.a(this.m + (this.o == 1 ? 45 : -45), this.n - 25, true, this.aq[n2], 0L, this.ap[n2], 24);
                    ++n2;
                }
            }
        }
        if (this.ar == 2) {
            if (this.ak == this.av.length - 1) {
                this.p = 2;
            }
            this.o = this.m < this.ap[0].B ? 1 : -1;
            this.a(this.av);
            this.m += (this.ap[0].B - this.m) / 4;
            this.a = this.m;
            this.b = this.n;
            if (this.ak == 12) {
                n2 = 0;
                while (n2 < this.ap.length) {
                    this.ap[n2].a(this.aq[n2], 0L, false, false);
                    at.a(102, this.ap[n2].B, this.ap[n2].C, 1);
                    ++n2;
                }
            }
        }
    }

    public final void g() {
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

    public final void a(en object) {
        if (ae == null) {
            return;
        }
        if (this.Y) {
            return;
        }
        if (this.M) {
            if (!this.d) {
                ae.a((en)object, this.al, this.N, this.O, this.o == 1 ? 0 : 1, 2);
                return;
            }
            bl.b((en)object, this.e, this.N, this.O, this.o == 1 ? 0 : 2, 33);
            return;
        }
        if (this.aj && this.p != 0) {
            en en2 = object;
            d d2 = this;
            en2.a(ad, d2.af, d2.u, 3);
            en2.e(p.j, p.k - main.a.ae, p.d, p.e + 2 * main.a.ae);
        }
        ((en)object).a(0, main.a.ae);
        if (!this.d) {
            ae.a((en)object, this.al, this.m, this.n, this.o == 1 ? 0 : 1, 2);
        } else {
            bl.b((en)object, this.e, this.m, this.n - 9, this.o == 1 ? 0 : 2, 33);
        }
        ((en)object).a(0, -main.a.ae);
        int n2 = en.a(this.X);
        int n3 = en.b(this.X);
        int n4 = n2;
        int n5 = this.m - n2;
        int n6 = this.n - this.w - 5;
        int n7 = (n2 << 1) * this.V / 100;
        if (n7 > n2) {
            if ((n7 -= n2) <= 0) {
                n7 = 0;
            }
        } else {
            n4 = n7;
            n7 = 0;
        }
        ((en)object).a(p.aJ, n5, n6, 20);
        ((en)object).a(p.aJ, n5 + n2, n6, 20);
        ((en)object).a(this.X, 0, 0, n4, n3, 0, n5, n6, 20);
        ((en)object).a(this.X, 0, 0, n7, n3, 0, n5 + n2, n6, 20);
        if (this.ax) {
            ++this.ao;
            object = new ea(this.ar == 2 ? 19 : 22, this.m + this.ao * 50, this.n + 25, 2, 1, -1);
            ei.a((ea)object);
            object = new ea(this.ar == 2 ? 19 : 22, this.m - this.ao * 50, this.n + 25, 2, 1, -1);
            ei.a((ea)object);
            if (this.ao == 50) {
                this.ao = 0;
                this.ax = false;
            }
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
        this.ak = 0;
        this.o = aa2.m > this.m ? 1 : -1;
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
        return this.n - 50;
    }

    public final int n() {
        return 40;
    }

    public final int o() {
        return 50;
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
}

