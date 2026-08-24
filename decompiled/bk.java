/*
 * Decompiled with CFR 0.152.
 */
public final class bk {
    public byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public df p;
    public df q;
    private byte[] t;
    public byte[] r;
    public byte[] s;

    public bk() {
        byte[] byArray = new byte[24];
        byArray[0] = 12;
        byArray[1] = 11;
        byArray[2] = 10;
        byArray[3] = 9;
        byArray[4] = 8;
        byArray[5] = 7;
        byArray[6] = 6;
        byArray[7] = 5;
        byArray[8] = 4;
        byArray[9] = 3;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 23;
        byArray[14] = 22;
        byArray[15] = 21;
        byArray[16] = 20;
        byArray[17] = 19;
        byArray[18] = 18;
        byArray[19] = 17;
        byArray[20] = 16;
        byArray[21] = 15;
        byArray[22] = 14;
        byArray[23] = 13;
        this.t = byArray;
        byte[] byArray2 = new byte[24];
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 2;
        byArray2[8] = 2;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 2;
        byArray2[14] = 2;
        byArray2[15] = 1;
        byArray2[16] = 1;
        byArray2[17] = 2;
        byArray2[20] = 2;
        byArray2[21] = 1;
        byArray2[22] = 1;
        byArray2[23] = 2;
        this.r = byArray2;
        byte[] byArray3 = new byte[24];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 3;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArray3[10] = 5;
        byArray3[11] = 1;
        byArray3[17] = 7;
        byArray3[18] = 6;
        byArray3[19] = 6;
        byArray3[20] = 6;
        byArray3[21] = 6;
        byArray3[22] = 6;
        byArray3[23] = 2;
        this.s = byArray3;
    }

    public final void a() {
        ++this.i;
        this.b += this.e;
        this.c += this.f;
    }

    public final int a(int n2) {
        if (n2 <= 15 || n2 > 345) {
            n2 = 12;
        } else {
            if ((n2 = (n2 - 15) / 15 + 1) > 24) {
                n2 = 24;
            }
            n2 = this.t[n2];
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public final void a(en en2, df df2, int n2, boolean bl2) {
        void var4_7;
        if (df2 == null) {
            return;
        }
        n2 = df2.c / 3;
        if (n2 <= 0) {
            n2 = 1;
        }
        if (df2.c > 3) {
            int n3 = this.i / 3 % 2 == 0 ? 0 : 3;
        } else {
            int n4 = this.i % n2;
        }
        n2 = n2 * this.r[this.k] + var4_7;
        if (df2.c < 3) {
            n2 = this.i / 3 % df2.c;
        }
        df2.a(n2, this.b, this.c, this.s[this.k], 3, en2);
    }
}

