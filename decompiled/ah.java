/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import main.a;

public final class ah
extends dc {
    private int d;
    private by e;
    public static Random a = new Random(System.currentTimeMillis());
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l = false;
    private long m;
    private long n;
    private af o;
    private el p = new el("vDarts");
    private int q = 0;
    private int r = 0;
    private static int[] s;
    public static final int[] b;
    public static final byte[] c;

    static {
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
        s = nArray;
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
        b = nArray2;
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
        c = byArray;
    }

    public static void a(int n2, int n3, boolean bl2, long l2, long l3, af af2, int n4) {
        dc.x.addElement(new ah(n2, n3, bl2, l2, l3, af2, n4));
    }

    /*
     * WARNING - void declaration
     */
    private ah(int n2, int n3, boolean bl2, long l2, long l3, af af2, int n4) {
        void var8_8;
        void var6_7;
        void var4_6;
        void var9_9;
        this.e = p.w[var9_9];
        this.i = n2;
        this.j = n3;
        this.m = var4_6;
        this.n = var6_7;
        this.o = var8_8;
        this.d = this.e.i;
        int n5 = ds.a(var8_8.B - n2, var8_8.C - n3);
        ah ah2 = this;
        this.f = n5;
        ah2.g = ah2.d * ds.b(n5) >> 10;
        ah2.h = ah2.d * ds.a(n5) >> 10;
        if (n2 >= p.j && n2 <= p.j + main.a.A) {
            bu.a();
        }
    }

    public final void a() {
        int n2 = 0;
        while (n2 < this.e.h) {
            if (this.e.c.length > 0) {
                this.p.addElement(new dx(this.i, this.j));
            }
            this.q = (this.o != null ? this.o.B : 0) - this.i;
            this.r = (this.o != null ? this.o.C : 0) - 10 - this.j;
            int n3 = 60;
            if (bv.l == 0) {
                n3 = 600;
            }
            ++this.k;
            if (this.o != null && (this.o.H == 5 || this.o.H == 14) || this.o == null) {
                this.i += ((this.o != null ? this.o.B : 0) - this.i) / 2;
                this.j += ((this.o != null ? this.o.C : 0) - this.j) / 2;
            }
            if (ds.g(this.q) < 16 && ds.g(this.r) < 16 || this.k > n3) {
                if (this.o != null && this.o.J >= 0 && this.n != -1L) {
                    if (this.n != -100L) {
                        this.o.a(this.m, this.n, false, true);
                    } else {
                        at.a(80, this.o, 1);
                    }
                }
                dc.x.removeElement(this);
                if (this.n != -100L) {
                    at.a(81, this.o, 1);
                    if (this.i >= p.j && this.i <= p.j + main.a.A) {
                        bu.a();
                    }
                }
            }
            if (Math.abs((n3 = ds.a(this.q, this.r)) - this.f) < 90 || this.q * this.q + this.r * this.r > 4096) {
                this.f = Math.abs(n3 - this.f) < 15 ? n3 : (n3 - this.f >= 0 && n3 - this.f < 180 || n3 - this.f < -180 ? ds.c(this.f + 15) : ds.c(this.f - 15));
            }
            if (this.d < 8192) {
                this.d += 1024;
            }
            this.g = this.d * ds.b(this.f) >> 10;
            this.h = this.d * ds.a(this.f) >> 10;
            this.q += this.g;
            n3 = this.q >> 10;
            this.i += n3;
            this.q &= 0x3FF;
            this.r += this.h;
            n3 = this.r >> 10;
            this.j += n3;
            this.r &= 0x3FF;
            ++n2;
        }
        n2 = 0;
        while (n2 < this.p.size()) {
            dx dx2 = (dx)this.p.elementAt(n2);
            ++dx2.a;
            if (dx2.a >= this.e.c.length) {
                this.p.removeElementAt(n2);
            }
            ++n2;
        }
    }

    public static int a(int n2) {
        int n3 = 0;
        while (n3 < s.length - 1) {
            if (n2 >= s[n3] && n2 <= s[n3 + 1]) {
                if (n3 >= 16) {
                    return 0;
                }
                return n3;
            }
            ++n3;
        }
        return 0;
    }

    public final void a(en en2) {
        dx dx2;
        int n2 = ah.a(360 - this.f);
        byte by2 = c[n2];
        n2 = b[n2];
        int n3 = this.p.size() / 2;
        while (n3 < this.p.size()) {
            dx dx3 = (dx)this.p.elementAt(n3);
            bl.b(en2, this.e.d[dx3.a], dx3.b, dx3.c, 0, 3);
            ++n3;
        }
        n3 = main.a.w % this.e.b.length;
        bl.b(en2, this.e.b[n3][by2], this.i, this.j, n2, 3);
        int n4 = 0;
        while (n4 < this.p.size()) {
            dx2 = (dx)this.p.elementAt(n4);
            bl.b(en2, this.e.c[dx2.a], dx2.b, dx2.c, 0, 3);
            ++n4;
        }
        bl.b(en2, this.e.a[n3][by2], this.i, this.j, n2, 3);
        n4 = 0;
        while (n4 < this.p.size()) {
            dx2 = (dx)this.p.elementAt(n4);
            if (ds.g(a.nextInt(100)) < this.e.g) {
                bl.b(en2, main.a.w % 2 == 0 ? this.e.e[dx2.a] : this.e.f[dx2.a], dx2.b, dx2.c, 0, 3);
            }
            ++n4;
        }
    }
}

