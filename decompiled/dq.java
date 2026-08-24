/*
 * Decompiled with CFR 0.152.
 */
public final class dq {
    public int a = 0;
    public int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private af j;
    private cv k = null;
    private static byte[] l;
    private static int[] m;
    private static int[] n;

    static {
        byte[] byArray = new byte[25];
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 1;
        byArray[9] = 1;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 1;
        byArray[14] = 2;
        byArray[15] = 1;
        byArray[17] = 1;
        byArray[18] = 2;
        byArray[19] = 1;
        byArray[21] = 1;
        byArray[22] = 2;
        byArray[23] = 1;
        l = byArray;
        int[] nArray = new int[18];
        nArray[1] = 15;
        nArray[2] = 37;
        nArray[3] = 52;
        nArray[4] = 75;
        nArray[5] = 105;
        nArray[6] = 127;
        nArray[7] = 142;
        nArray[8] = 165;
        nArray[9] = 195;
        nArray[10] = 217;
        nArray[11] = 232;
        nArray[12] = 255;
        nArray[13] = 285;
        nArray[14] = 307;
        nArray[15] = 322;
        nArray[16] = 345;
        nArray[17] = 370;
        m = nArray;
        int[] nArray2 = new int[16];
        nArray2[3] = 7;
        nArray2[4] = 6;
        nArray2[5] = 6;
        nArray2[6] = 6;
        nArray2[7] = 2;
        nArray2[8] = 2;
        nArray2[9] = 3;
        nArray2[10] = 3;
        nArray2[11] = 4;
        nArray2[12] = 5;
        nArray2[13] = 5;
        nArray2[14] = 5;
        nArray2[15] = 1;
        n = nArray2;
    }

    public dq(af af2, cv cv2) {
        this.j = af2;
        this.k = cv2;
    }

    public final void a() {
        block24: {
            block23: {
                if (this.j.aQ == null && this.j.aU == null) break block23;
                if (this.j.aQ != null) {
                    this.d = this.j.aQ.m;
                    this.e = this.j.aQ.n - this.j.aQ.w / 4;
                } else if (this.j.aU != null) {
                    this.d = this.j.aU.B;
                    this.e = this.j.aU.C - this.j.aU.al / 4;
                }
                int n2 = this.d - this.b;
                int n3 = this.e - this.c;
                int n4 = 4;
                if (n2 + n3 < 60) {
                    n4 = 3;
                } else if (n2 + n3 < 30) {
                    n4 = 2;
                }
                if (this.b != this.d) {
                    if (n2 > 0 && n2 < 5) {
                        this.b = this.d;
                    } else if (n2 < 0 && n2 > -5) {
                        this.b = this.d;
                    } else {
                        this.f = this.d - this.b << 2;
                        this.h += this.f;
                        this.b += this.h >> n4;
                        this.h &= 0xF;
                    }
                }
                if (this.c != this.e) {
                    if (n3 > 0 && n3 < 5) {
                        this.c = this.e;
                    } else if (n3 < 0 && n3 > -5) {
                        this.c = this.e;
                    } else {
                        this.g = this.e - this.c << 2;
                        this.i += this.g;
                        this.c += this.i >> n4;
                        this.i &= 0xF;
                    }
                }
                n2 = 0;
                n3 = 0;
                n4 = 0;
                int n5 = 0;
                if (this.j.aQ != null) {
                    n2 = this.d - this.j.aQ.v / 4;
                    n4 = this.d + this.j.aQ.v / 4;
                    n3 = this.e - this.j.aQ.w / 4;
                    n5 = this.e + this.j.aQ.w / 4;
                } else if (this.j.aU != null) {
                    n2 = this.d - this.j.aU.ak / 4;
                    n4 = this.d + this.j.aU.ak / 4;
                    n3 = this.e - this.j.aU.al / 4;
                    n5 = this.e + this.j.aU.al / 4;
                }
                if (this.a > 0) {
                    --this.a;
                }
                if (this.a != 0 && (this.b < n2 || this.b > n4 || this.c < n3 || this.c > n5)) break block24;
            }
            this.b();
        }
    }

    private void b() {
        this.j.cc = null;
        this.i = 0;
        this.h = 0;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.j.E();
    }

    public final void a(en en2) {
        int n2;
        int n3;
        block2: {
            n3 = this.d - this.b;
            int n4 = this.e - this.c;
            n3 = ds.a(n3, -n4);
            n4 = 0;
            while (n4 < m.length - 1) {
                if (n3 >= m[n4] && n3 <= m[n4 + 1]) {
                    n2 = n4 >= 16 ? 0 : n4;
                    break block2;
                }
                ++n4;
            }
            n2 = 0;
        }
        n3 = n2;
        bl.b(en2, this.k.a[l[n3]], this.b, this.c, n[n3], 3);
    }
}

