/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class h {
    public ee[] a;
    public dd b;
    public el c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public short u = (short)-1;
    public byte v = (byte)-1;
    public int w;
    public boolean x;
    public boolean y = false;
    public String z = "";
    public int A;
    public byte B;
    public boolean C;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public String H = "";

    public h() {
        int[] nArray = new int[18];
        nArray[4] = 600841;
        nArray[5] = 600841;
        nArray[6] = 667658;
        nArray[7] = 667658;
        nArray[8] = 3346944;
        nArray[9] = 0x331100;
        nArray[10] = 4199680;
        nArray[11] = 5052928;
        nArray[12] = 0x320033;
        nArray[13] = 0x3C0033;
        nArray[14] = 4587571;
        nArray[15] = 5046280;
        nArray[16] = 0x66000A;
        nArray[17] = 0x334400;
        int[][] nArrayArray = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {45824, 39168, 32768, 26112, 19712, 13056}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {16711705, 15007767, 13369364, 11730962, 0x99000F, 0x80000D}};
        int[] nArray2 = new int[]{2, 1, 1, 1, 1, 1};
    }

    public final void a() {
        this.A = main.a.G.a(this);
    }

    public final boolean a(int n2) {
        n2 = 0;
        while (n2 < this.a.length) {
            ee ee2 = this.a[n2];
            if (ee2 != null && ee2.c.a == 87) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final boolean b() {
        return this.b.b >= 0 && this.b.b < 6 || this.b.b == 32 || this.b.b == 35 || this.b.b == 11 || this.b.b == 23;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.D = n2;
        this.E = n3;
        this.F = n4;
        this.G = n5;
    }
}

