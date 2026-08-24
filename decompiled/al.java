/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class al
extends af {
    private static ck a;
    private static ck b;
    private int c = 0;
    private int d;
    private boolean e;
    private ea f;
    private af g;
    private int h;
    private int i;
    private af[] j;
    private long[] k;
    private int l;
    private int[] m;
    private int[] n;
    private int[] df;
    private int[] dg;
    private int[][] dh;
    private byte di;
    private int dj;
    private int dk;

    public final void c(int n2) {
        this.f = new ea(105, this.B, this.C + 20, 2, 1, -1);
        ei.a(this.f);
        if (n2 == af.e().J) {
            this.g = af.e();
            return;
        }
        this.g = p.b(n2);
    }

    public final void a(int[] nArray) {
        if (this.di == 0) {
            if (this.c == 11) {
                this.e = true;
                ea ea2 = new ea(19, this.B, this.C + 20, 2, 1, -1);
                ei.a(ea2);
            }
            if (this.c >= nArray.length - 1) {
                this.di = (byte)2;
                return;
            }
        }
        if (this.di == 1 && this.c == nArray.length - 1) {
            this.di = (byte)3;
            this.C -= 15;
            return;
        }
        ++this.c;
        if (this.c > nArray.length - 1) {
            this.c = 0;
        }
        this.dj = nArray[this.c];
    }

    public al() {
        int[] nArray = new int[30];
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 2;
        nArray[5] = 2;
        nArray[6] = 3;
        nArray[7] = 3;
        nArray[8] = 4;
        nArray[9] = 4;
        nArray[10] = 5;
        nArray[11] = 5;
        nArray[12] = 5;
        nArray[13] = 5;
        nArray[14] = 5;
        nArray[15] = 5;
        nArray[16] = 5;
        nArray[17] = 5;
        nArray[18] = 5;
        nArray[19] = 5;
        nArray[20] = 5;
        nArray[21] = 5;
        nArray[22] = 5;
        nArray[23] = 5;
        nArray[24] = 5;
        nArray[25] = 5;
        nArray[26] = 5;
        nArray[27] = 5;
        nArray[28] = 5;
        nArray[29] = 5;
        this.m = nArray;
        int[] nArray2 = new int[15];
        nArray2[2] = 6;
        nArray2[3] = 6;
        nArray2[4] = 7;
        nArray2[5] = 7;
        nArray2[6] = 8;
        nArray2[7] = 8;
        nArray2[8] = 9;
        nArray2[9] = 9;
        nArray2[10] = 9;
        nArray2[11] = 9;
        nArray2[12] = 9;
        nArray2[13] = 10;
        nArray2[14] = 10;
        this.n = nArray2;
        int[] nArray3 = new int[26];
        nArray3[2] = 1;
        nArray3[3] = 1;
        nArray3[4] = 2;
        nArray3[5] = 2;
        nArray3[6] = 3;
        nArray3[7] = 3;
        nArray3[8] = 4;
        nArray3[9] = 4;
        nArray3[10] = 5;
        nArray3[11] = 5;
        nArray3[12] = 6;
        nArray3[13] = 6;
        nArray3[14] = 7;
        nArray3[15] = 7;
        nArray3[16] = 8;
        nArray3[17] = 8;
        nArray3[18] = 9;
        nArray3[19] = 9;
        nArray3[20] = 10;
        nArray3[21] = 10;
        nArray3[22] = 11;
        nArray3[23] = 11;
        nArray3[24] = 12;
        nArray3[25] = 12;
        this.df = nArray3;
        this.dg = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
        this.dh = new int[][]{this.m, this.n, this.df, this.dg};
        this.di = (byte)-1;
        a = null;
        a = new ck();
        String string = "/x" + en.b + "/effectdata/" + 102 + "/data";
        try {
            a.b(string);
            al.a.a = l.c("/effectdata/102/img.png");
        }
        catch (Exception exception) {}
        b = null;
        b = new ck();
        string = "/x" + en.b + "/effectdata/" + 103 + "/data";
        try {
            b.b(string);
            al.b.a = l.c("/effectdata/103/img.png");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(byte by2, short s2, short s3, af[] afArray, long[] lArray) {
        this.di = by2;
        this.h = s2;
        this.i = s3;
        this.d = this.I;
        this.I = this.h > this.B ? 1 : -1;
        this.j = afArray;
        this.k = lArray;
    }

    public final void a() {
        if (this.g != null) {
            if (this.f.e >= 30) {
                this.f.f += (this.B - this.f.f) / 4;
                this.f.g += (this.C - this.f.g) / 4;
                this.g.B = this.f.f;
                this.g.C = this.f.g;
                this.g.ck = true;
            } else {
                this.f.k = this.f.f > this.g.B ? 1 : 0;
                this.f.f += (this.g.B - this.f.f) / 3;
                this.f.g += (this.g.C - this.f.g) / 3;
            }
        }
        if (this.di != -1) {
            ea ea2;
            if (this.di == 0 && this.e && main.a.w % 2 == 0) {
                this.l += this.h > this.B ? 30 : -30;
                ea2 = new ea(103, this.B + this.l, this.C + 20, 2, 1, -1);
                new ea(103, this.B + this.l, this.C + 20, 2, 1, -1).k = this.h > this.B ? 0 : 1;
                ei.a(ea2);
                if (this.I == 1 && this.B + this.l >= this.h || this.I == -1 && this.B + this.l <= this.h) {
                    this.e = false;
                    this.di = (byte)-1;
                    this.l = 0;
                    this.c = 0;
                    this.I = this.d;
                    int n2 = 0;
                    while (n2 < this.j.length) {
                        this.j[n2].a(this.k[n2], 0L, false, false);
                        ++n2;
                    }
                }
            }
            if (this.di == 3) {
                this.h = this.j[this.dk].B;
                this.i = this.j[this.dk].C;
                this.B += (this.h - this.B) / 3;
                this.C += (this.i - this.C) / 3;
                if (main.a.w % 5 == 0) {
                    ea2 = new ea(19, this.B, this.C, 2, 1, -1);
                    ei.a(ea2);
                }
                if (ds.g(this.B - this.h) <= 20 && ds.g(this.C - this.i) <= 20) {
                    this.B = this.h;
                    this.C = this.i;
                    this.j[this.dk].a(this.k[this.dk], 0L, false, false);
                    ++this.dk;
                    if (this.dk == this.j.length) {
                        this.di = (byte)-1;
                        this.dk = 0;
                    }
                }
            }
            return;
        }
        super.a();
    }

    public final void a(en en2) {
        if (this.di != -1) {
            this.c(en2);
            en2.a(0, main.a.ae);
            this.a(this.dh[this.di]);
            if (this.di == 0 || this.di == 1) {
                a.a(en2, this.dj, this.B, this.C + this.bS, this.I == 1 ? 0 : 1, 2);
            } else {
                b.a(en2, this.dj, this.B, this.C + this.bS, this.I == 1 ? 0 : 1, 2);
            }
            en2.a(0, -main.a.ae);
            return;
        }
        super.a(en2);
    }
}

