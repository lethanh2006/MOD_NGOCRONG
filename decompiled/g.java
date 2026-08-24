/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
implements b,
bx {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int aD;
    private int aE;
    private int aF;
    public int f;
    public int g;
    private int aG;
    private int aH;
    private int aI;
    private int[] aJ;
    private int aK;
    public int h;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    public static Image i;
    private static Image aQ;
    public dr j;
    public el k = new el("");
    private int aR;
    public int l;
    private boolean aS;
    public boolean m;
    private boolean aT;
    public String n;
    public cq o;
    public static String p;
    public static short q;
    public static Image r;
    public static Image s;
    public static Image t;
    public static Image u;
    public static Image v;
    public static Image w;
    public static Image x;
    public static Image y;
    public static Image z;
    private static Image aU;
    private static Image aV;
    private de aW = new de(aw.bw, 0);
    public int A;
    public int B;
    public int C;
    private int[] aX;
    private String[][] aY;
    private int[] aZ;
    public String[][] D;
    public String[] E;
    public String[] F;
    public static String[] G;
    public static String[] H;
    private static String[] ba;
    private static String[] bb;
    public static int I;
    public String[][] J;
    public int[] K;
    public int[] L;
    private static String[][] bc;
    private static String[][] bd;
    private static String[][] be;
    private static String[][] bf;
    private static String[][] bg;
    private static String[][] bh;
    public String[][][] M;
    private static byte bi;
    private static byte bj;
    private static byte bk;
    private static byte bl;
    private static byte bm;
    private static byte bn;
    private static byte bo;
    public int N;
    public int O;
    private int[] bp;
    private static int[] bq;
    private static int[] br;
    private static int[] bs;
    private static int[] bt;
    private static int[] bu;
    private static int[] bv;
    private static int[] bw;
    private static int[] bx;
    private static int[] by;
    private static int[][] bz;
    private static int[][] bA;
    private static int[][] bB;
    private h bC;
    private eh bD;
    private cb bE;
    private e bF;
    public eh[] P;
    public el Q;
    public el R;
    private el bG;
    public el S;
    public el T;
    public el U;
    public el V;
    public el W;
    public el X;
    public el Y;
    public el Z;
    public de aa;
    public static int ab;
    private int bH;
    public af ac;
    private boolean bI;
    private int bJ;
    public static boolean ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public ae ai;
    private int bK;
    private int[] bL;
    private int bM;
    public boolean aj;
    public int ak;
    private int bN;
    private int bO;
    private boolean bP;
    public boolean al;
    public boolean am;
    public boolean an;
    private int bQ;
    private int bR;
    private int[] bS;
    private boolean bT;
    private boolean bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private boolean bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private boolean ce;
    private int cf;
    private String[][] cg;
    private String ch;
    public String ao;
    private dv ci;
    private int cj;
    private int ck;
    private boolean cl;
    private String[] cm;
    private int cn;
    private static long[] co;
    private int[] cp;
    public String[] ap;
    public String[] aq;
    private int cq;
    private h cr;
    public static String ar;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    public static boolean as;
    private boolean cD;
    private int cE;
    public static el at;
    private static String[] cF;
    public boolean au;
    private int cG;
    private af cH;
    private boolean cI;
    private boolean cJ;
    private boolean cK;
    private int cL;
    public byte av;
    public int aw;
    public int ax;
    public int ay;
    private int cM;
    private int cN;
    private int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int[] cS;
    private int[] cT;
    private int[] cU;
    private int[] cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private boolean db;
    private boolean dc;
    private boolean dd;
    public boolean az;
    public short aA;
    private short de;
    public short aB;
    private short[] df;
    public String[][] aC;
    private static int[] dg;
    private static int dh;
    private static int[][] di;
    private Image dj;
    private Image dk;
    private Image dl;
    private Image dm;
    private byte dn;
    private boolean do;

    static {
        aQ = l.b("/img/map" + bv.r + ".png");
        i = l.b("/mainImage/myTexture2dbantay.png");
        l.b("/mainImage/myTexture2dbtX.png");
        w = l.b("/mainImage/myTexture2dimgMoney.png");
        y = l.b("/mainImage/myTexture2dimgDiamond.png");
        z = l.b("/mainImage/luongkhoa.png");
        aU = l.b("/mainImage/myTexture2dup.png");
        aV = l.b("/mainImage/myTexture2ddown.png");
        r = l.b("/mainImage/star.png");
        s = l.b("/mainImage/starE.png");
        t = l.b("/mainImage/star8.png");
        l.b("/mainImage/star9.png");
        u = l.b("/mainImage/starCH.png");
        v = l.b("/mainImage/new.png");
        x = l.b("/mainImage/ticket12.png");
        G = new String[]{aw.bS, aw.bR, aw.aG, aw.bQ, aw.aq, aw.bU, aw.T};
        H = new String[]{main.a.aj ? aw.fC : aw.fD, aw.bV, aw.H, en.b > 1 ? aw.bZ : aw.bY};
        ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.fT};
        bb = new String[]{aw.n};
        I = 0;
        bc = new String[][]{aw.ce, aw.cf};
        bd = new String[][]{aw.cg, aw.cf};
        be = new String[][]{aw.ck};
        bf = new String[][]{aw.ch};
        bg = new String[][]{aw.cf, aw.ci, aw.cj};
        bh = aw.aP;
        bi = 0;
        bj = 1;
        bk = (byte)3;
        bl = (byte)4;
        bm = (byte)5;
        bn = (byte)6;
        bo = (byte)7;
        int[] nArray = new int[16];
        nArray[0] = 21;
        nArray[2] = 1;
        nArray[3] = 2;
        nArray[4] = 24;
        nArray[5] = 3;
        nArray[6] = 4;
        nArray[7] = 5;
        nArray[8] = 6;
        nArray[9] = 27;
        nArray[10] = 28;
        nArray[11] = 29;
        nArray[12] = 30;
        nArray[13] = 42;
        nArray[14] = 47;
        nArray[15] = 46;
        bq = nArray;
        br = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
        bs = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
        bt = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
        bu = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
        bv = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
        bw = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
        bx = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
        by = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
        bz = new int[][]{bq, bt, bw};
        bA = new int[][]{br, bu, bx};
        bB = new int[][]{bs, bv, by};
        ab = 240;
        ad = false;
        co = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
        int[] nArray2 = new int[]{2327248, 8982199, 0xFF0606};
        int[] nArray3 = new int[]{4583423, 0xFF1CFF, 0xFF0C0C};
        ar = "";
        as = true;
        at = new el("");
        dg = new int[]{2, 1, 1};
        dh = 1;
        di = new int[][]{{0xFFFFFF, 0xE4E4E5, 13487823, 0xB2B2B3, 0x939494, 0x787878}, {61952, 58624, 52224, 45824, 39168, 32768}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {37119, 33509, 28108, 24499, 21145, 17536}, {0xFFFC00, 15063040, 0xC0CC00, 11776256, 0x999000, 8290304}, {0xFF0000, 0xE50000, 0xCC0000, 0xB30000, 0x990000, 0x800000}};
    }

    public g() {
        String[][][] stringArrayArray = new String[27][][];
        stringArrayArray[2] = bc;
        stringArrayArray[3] = be;
        stringArrayArray[4] = bf;
        stringArrayArray[7] = new String[][]{{""}};
        stringArrayArray[8] = new String[][]{{""}};
        stringArrayArray[9] = new String[][]{{""}};
        stringArrayArray[10] = new String[][]{{""}};
        stringArrayArray[11] = new String[][]{{""}};
        stringArrayArray[12] = bd;
        stringArrayArray[13] = bg;
        stringArrayArray[14] = new String[][]{{""}};
        stringArrayArray[15] = new String[][]{{""}};
        stringArrayArray[16] = new String[][]{{""}};
        stringArrayArray[17] = new String[][]{{""}};
        stringArrayArray[18] = new String[][]{{""}};
        stringArrayArray[19] = new String[][]{{""}};
        stringArrayArray[20] = new String[][]{{""}};
        stringArrayArray[21] = bh;
        stringArrayArray[22] = new String[][]{{""}};
        stringArrayArray[23] = new String[][]{{""}};
        stringArrayArray[24] = new String[][]{{""}};
        stringArrayArray[25] = new String[][]{{""}};
        stringArrayArray[26] = new String[][]{{""}};
        this.M = stringArrayArray;
        this.bG = new el("");
        this.S = new el("");
        this.T = new el("");
        this.U = new el("");
        this.V = new el("");
        this.W = new el("");
        this.X = new el("");
        this.Y = new el("");
        this.Z = new el("");
        this.bH = 0;
        this.bJ = -1;
        this.bM = 0;
        this.aj = false;
        this.bS = new int[3];
        this.bY = 0;
        this.bZ = false;
        this.ca = main.a.t + this.aL;
        this.cb = main.a.u + this.aM;
        this.cc = -1;
        this.cd = -1;
        this.cf = -1;
        this.cg = new String[][]{aw.dk, aw.dj};
        this.ch = "";
        this.ao = "";
        this.cm = new String[]{aw.t, aw.s, aw.r, aw.v, aw.gl, aw.gm};
        this.cn = 0;
        this.cp = new int[]{43520, 14743570, 0xD80000};
        this.cq = 0;
        this.cr = null;
        this.cu = 140;
        this.cv = -1;
        this.cx = 0;
        this.cy = 0;
        this.av = (byte)-1;
        this.dc = true;
        this.dd = false;
        this.az = true;
        this.dn = 0;
        this.do = false;
        this.a();
        this.aa = new de("", this, 1003, null);
        this.aa.g = l.b("/mainImage/myTexture2dbtX.png");
        this.aa.q = true;
        this.bC = null;
    }

    public final void a() {
        this.ca = main.a.t + this.aL;
        this.cb = main.a.u + this.aM;
        this.aX = new int[this.M.length];
        int n2 = 0;
        while (n2 < this.aX.length) {
            this.aX[n2] = -1;
            ++n2;
        }
    }

    private static int G() {
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (bv.l == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int H() {
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (bv.l == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int I() {
        if (af.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (p.ad[af.e().aD.a] == bz[bv.r][n2]) {
                return bA[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int J() {
        if (af.e().aD == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[bv.r].length) {
            if (p.ad[af.e().aD.a] == bz[bv.r][n2]) {
                return bB[bv.r][n2];
            }
            ++n2;
        }
        return -1;
    }

    private void c(int n2) {
        this.bJ = -1;
        this.d = ab;
        this.e = main.a.B;
        this.b = 0;
        this.c = 0;
        this.aD = 24;
        this.bH = n2;
        if (n2 == 0) {
            this.ae = 2;
            this.af = 80;
            this.ag = this.d - 4;
            this.ah = this.e - 96;
            this.h = this.ag;
            this.aK = 0;
            this.b = 0;
        } else if (n2 == 1) {
            this.ag = this.d - 4;
            this.ae = main.a.A - this.ag;
            this.af = 80;
            this.ah = this.e - 96;
            this.b = this.ae - 2;
            this.h = -(main.a.A + this.d);
            this.aK = main.a.A - this.d;
        }
        this.aE = this.d / 5 - 1;
        this.B = 0;
        this.aY = this.M[this.A];
        if (this.aY.length < 5) {
            this.aE += 5;
        }
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.bp = new int[this.aY.length];
        this.aJ = new int[this.aY.length];
        n2 = 0;
        while (n2 < this.aY.length) {
            this.bp[n2] = main.a.e ? -1 : 0;
            ++n2;
        }
        if (this.aX[this.A] != -1) {
            this.B = this.aX[this.A];
        }
        if (this.B < 0) {
            this.B = 0;
        }
        if (this.B > this.aY.length - 1) {
            this.B = this.aY.length - 1;
        }
        this.ci = null;
    }

    public final void b() {
        this.A = 14;
        this.c(0);
        g g2 = this;
        this.aD = 24;
        g2.O = g2.E.length;
        g2.aI = g2.O * g2.aD - g2.ah;
        g2.f = 0;
        g2.g = 0;
        g2.ak = main.a.e ? -1 : 0;
        this.aK = 0;
        this.h = 0;
    }

    private void K() {
        p.j();
        if (p.f()) {
            return;
        }
        if (!as) {
            return;
        }
        if (v.a(2, 0)) {
            v.f = true;
            p.aD.a(aw.cq, 0);
        }
        if (v.a(3, 0)) {
            v.h = true;
        }
        this.A = 4;
        this.aY = this.M[this.A];
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.aK = 0;
        this.h = 0;
        g g2 = this;
        if (as) {
            if (bv.s != bv.r) {
                ds.c("LOAD TAM HINH");
                if (en.b == 1) {
                    bl.b = null;
                    p.bt = false;
                    System.gc();
                }
                aQ = l.a("/img/map" + bv.r + ".png");
                bv.s = bv.r;
            }
            g2.aL = g.G() - g2.ag / 2;
            g2.aM = g.H() + g2.af - (g2.af + g2.ah / 2);
            g2.bX = g2.aL;
            g2.bY = g2.aM;
            g2.aN = 250 - g2.ag;
            g2.aO = 220 - g2.ah;
            if (g2.aN < 0) {
                g2.aN = 0;
            }
            if (g2.aO < 0) {
                g2.aO = 0;
            }
            int n2 = 0;
            while (n2 < bz[bv.r].length) {
                if (bv.l == bz[bv.r][n2]) {
                    g2.cB = bA[bv.r][n2] + g2.ae;
                    g2.cC = bB[bv.r][n2] + g2.af + 5;
                    break;
                }
                ++n2;
            }
            g2.cz = g.G() + g2.ae;
            g2.cA = g.H() + g2.af;
            g.I();
            g.J();
        }
    }

    public final void c() {
        this.O = af.e().aE.length;
        this.c(0);
        this.A = 9;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void d() {
        this.A = 17;
        this.c(1);
        this.e();
        this.bJ = 2;
        this.B = 0;
    }

    public final void e() {
        this.aD = 24;
        this.O = af.e().aJ[4].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void f() {
        this.A = 7;
        this.c(1);
        this.b(true);
        this.B = 0;
    }

    public final void a(r r2) {
        this.bG.insertElementAt(r2, 0);
        if (this.bG.size() > 20) {
            this.bG.removeElementAt(this.bG.size() - 1);
        }
    }

    public final void g() {
        this.aD = 24;
        this.O = this.S.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void h() {
        this.A = 18;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        g g2 = this;
        this.O = g2.Y.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
    }

    public final void a(af af2) {
        this.A = 10;
        this.c(0);
        this.g();
        this.ac = af2;
    }

    public final void i() {
        this.A = 11;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.k();
    }

    public final void j() {
        this.A = 16;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        g g2 = this;
        this.O = g2.X.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
    }

    public final void a(byte by2) {
        this.A = 15;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        g g2 = this;
        this.O = g2.W.size();
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        if (g2.ak > g2.O - 1) {
            g2.ak = g2.O - 1;
        }
        g2.aK = 0;
        g2.h = 0;
        this.bI = by2 != 0;
    }

    public final void k() {
        this.O = this.T.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        if (this.ak > this.O - 1) {
            this.ak = this.O - 1;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void l() {
        this.A = 8;
        this.c(0);
        g g2 = this;
        this.aD = 24;
        g2.x();
        g2.ak = main.a.e ? -1 : 0;
        this.B = 0;
    }

    public final void a(int n2) {
        this.A = 1;
        this.c(0);
        this.y();
        this.B = 0;
        this.bJ = n2;
    }

    public final void m() {
        this.A = 2;
        bc = main.a.A > 2 * ab ? new String[][]{aw.ce} : new String[][]{aw.ce, aw.cf};
        this.M[2] = bc;
        this.c(0);
        if (this.B == 0) {
            this.T();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.a.A > 2 * ab) {
            main.a.H = new g();
            main.a.H.M[7] = new String[][]{{""}};
            main.a.H.f();
            main.a.H.s();
        }
    }

    public final void n() {
        this.A = 12;
        bd = main.a.A > 2 * ab ? new String[][]{aw.cg} : new String[][]{aw.cg, aw.cf};
        this.M[this.A] = bd;
        this.c(0);
        if (this.B == 0) {
            this.o();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.a.A > 2 * ab) {
            main.a.H = new g();
            main.a.H.M[7] = new String[][]{{""}};
            main.a.H.f();
            main.a.H.s();
        }
        this.av = (byte)-1;
        this.az = true;
    }

    public final void o() {
        this.O = this.k.size() + 1;
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void L() {
        this.A = 22;
        this.c(0);
        g g2 = this;
        this.O = bb.length;
        g2.aD = 24;
        g2.ak = main.a.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void p() {
        this.A = 21;
        bh = main.a.H != null ? aw.aQ : aw.aP;
        this.M[21] = bh;
        this.cm = af.e().K == 1 ? new String[]{aw.t, aw.s, aw.r, aw.v, aw.gl, aw.gm} : new String[]{aw.t, aw.s, aw.r, aw.v, aw.gl};
        this.c(2);
        if (this.B == 0) {
            this.U();
        }
        if (this.B == 1) {
            this.P();
        }
        if (this.B == 2) {
            this.b(true);
        }
    }

    public final void q() {
        this.A = 0;
        this.c(0);
        if (this.B == 1) {
            this.b(true);
        }
        if (this.B == 2) {
            this.R();
        }
        if (this.B == 3) {
            if (this.D.length == 4) {
                this.Q();
            } else {
                this.w();
            }
        }
        if (this.B == 4) {
            this.Q();
        }
    }

    public final void r() {
        this.A = 3;
        this.c(0);
        this.S();
        this.aK = 0;
        this.h = 0;
    }

    private void b(h h2) {
        String string;
        block37: {
            int n2;
            int n3;
            this.ai = new ae();
            string = "";
            if (h2.b.c != af.e().K) {
                if (h2.b.c == 0) {
                    string = String.valueOf(string) + "\n|7|1|" + aw.cr;
                } else if (h2.b.c == 1) {
                    string = String.valueOf(string) + "\n|7|1|" + aw.cs;
                } else if (h2.b.c == 2) {
                    string = String.valueOf(string) + "\n|7|1|" + aw.ct;
                }
            }
            String string2 = "";
            if (h2.a != null) {
                n3 = 0;
                while (n3 < h2.a.length) {
                    if (h2.a[n3].c.a == 72) {
                        string2 = " [+" + h2.a[n3].a + "]";
                    }
                    ++n3;
                }
            }
            n3 = 0;
            if (h2.a != null) {
                n2 = 0;
                while (n2 < h2.a.length) {
                    if (h2.a[n2].c.a == 41) {
                        n3 = 1;
                        if (h2.a[n2].a == 1) {
                            string = String.valueOf(string) + "|0|1|" + h2.b.d + string2;
                        }
                        if (h2.a[n2].a == 2) {
                            string = String.valueOf(string) + "|2|1|" + h2.b.d + string2;
                        }
                        if (h2.a[n2].a == 3) {
                            string = String.valueOf(string) + "|8|1|" + h2.b.d + string2;
                        }
                        if (h2.a[n2].a == 4) {
                            string = String.valueOf(string) + "|7|1|" + h2.b.d + string2;
                        }
                    }
                    ++n2;
                }
            }
            if (n3 == 0) {
                string = String.valueOf(string) + "|0|1|" + h2.b.d + string2;
            }
            if (h2.a == null) break block37;
            n2 = 0;
            while (n2 < h2.a.length) {
                block40: {
                    block39: {
                        Object object;
                        block38: {
                            boolean bl2 = h2.a[n2].c.b.startsWith("$");
                            if (!bl2) break block38;
                            object = h2.a[n2];
                            object = ai.a(((ee)object).c.b, "$", "");
                            if (h2.a[n2].a == 1) {
                                string = String.valueOf(string) + "\n|1|1|" + (String)object;
                            }
                            if (h2.a[n2].a == 0) {
                                string = String.valueOf(string) + "\n|0|1|" + (String)object;
                            }
                            break block39;
                        }
                        object = h2.a[n2].a();
                        if (((String)object).equals("")) break block39;
                        if (h2.a[n2].c.a == 72) break block40;
                        if (h2.a[n2].c.a == 102) {
                            this.ai.o = (byte)h2.a[n2].a;
                        } else if (h2.a[n2].c.a == 107) {
                            this.ai.p = (byte)h2.a[n2].a;
                        } else {
                            string = h2.a[n2].c.c > 0 ? String.valueOf(string) + "\n|" + h2.a[n2].c.c + "|1|" + (String)object : String.valueOf(string) + "\n|1|1|" + (String)object;
                        }
                    }
                    if (h2.a[n2].c.a == 228 && h2.a[n2].a > 7) {
                        int n4 = 0;
                        while (n4 < h2.a[n2].a - 7) {
                            this.ai.r[n4 + 7] = true;
                            ++n4;
                        }
                    }
                }
                ++n2;
            }
        }
        if (this.bC.b.i > 1) {
            String string3 = String.valueOf(aw.cu) + ": " + this.bC.b.i;
            if ((long)this.bC.b.i > af.e().y) {
                string = String.valueOf(string) + "\n|3|1|" + string3;
                string = String.valueOf(string) + "\n|3|1|" + aw.cv + ": " + af.e().y;
            } else {
                string = String.valueOf(string) + "\n|6|1|" + string3;
            }
        } else {
            string = String.valueOf(string) + "\n|6|1|";
        }
        this.bC.A = this.a(this.bC);
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|6|" + h2.b.e;
        if (!h2.z.equals("")) {
            if (!h2.b.e.equals("")) {
                string = String.valueOf(string) + "\n--";
            }
            string = String.valueOf(string) + "\n|2|" + h2.z;
        }
        if (this.ai.p > 0) {
            string = String.valueOf(string) + "\n\n";
        }
        this.a(this.ai, string);
        this.bK = h2.b.f;
        this.bL = null;
        this.cH = null;
    }

    private void a(ae ae2, String string) {
        ae2.u = false;
        ae2.a = 180;
        ae2.e = 3 + this.b - (this.b == 0 ? 0 : ds.g(ae2.a - this.d) + 8);
        ae2.d = di.p.a(string, ae2.a - 10);
        ae2.b = 10000000;
        ae2.i = null;
        ae2.c = 7;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > main.a.B - 80) {
            ae2.g = main.a.B - 80;
            ae2.h = ae2.d.length * 12 - ae2.g + 17;
            if (ae2.h < 0) {
                ae2.h = 0;
            }
            ae.v = 0;
            ae2.u = true;
        }
        ae2.f = main.a.F.d - ae2.g;
        while (ae2.f < 10) {
            ++ae2.f;
            ++main.a.F.d;
        }
        ae2.t = 10;
    }

    private void a(cb cb2) {
        this.ai = new ae();
        String string = "|0|" + cb2.d;
        string = String.valueOf(string) + "\n|1|" + e.a(cb2.h);
        int n2 = 0;
        while (n2 < this.R.size()) {
            e e2 = (e)this.R.elementAt(n2);
            if (cb2.c == e2.a) {
                string = String.valueOf(string) + "\n|5|" + aw.cS + ": " + e2.l;
                string = String.valueOf(string) + "\n|5|" + aw.cT + ": " + e2.k;
                string = String.valueOf(string) + "\n|4|" + aw.cV + ": " + e2.i + aw.cY;
                string = String.valueOf(string) + "\n|4|" + aw.cW + ": " + e2.j + aw.cY;
                this.bL = new int[]{e2.b, e2.d, e2.e};
                break;
            }
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        n2 = 0;
        while (n2 < cb2.f.length) {
            string = String.valueOf(string) + "\n" + cb2.f[n2];
            ++n2;
        }
        if (cb2.b == 1) {
            string = String.valueOf(string) + "\n|6|" + aw.cZ + " " + cb2.i + "/" + cb2.j;
        }
        this.a(this.ai, string);
        this.cH = null;
    }

    private void a(e e2) {
        String string = "|0|1|" + e2.f;
        String string2 = "\n|2|1|";
        if (e2.g == 0) {
            string2 = "\n|7|1|";
        }
        if (e2.g == 1) {
            string2 = "\n|1|1|";
        }
        if (e2.g == 2) {
            string2 = "\n|0|1|";
        }
        string = String.valueOf(string) + string2 + e.a(e2.g);
        string = String.valueOf(string) + "\n|2|1|" + aw.da + ": " + e2.h;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + aw.cS + ": " + e2.l;
        string = String.valueOf(string) + "\n|5|" + aw.cT + ": " + e2.k;
        string = String.valueOf(string) + "\n|4|" + aw.cV + ": " + e2.i + aw.cY;
        string = String.valueOf(string) + "\n|4|" + aw.cW + ": " + e2.j + aw.cY;
        string = String.valueOf(string) + "\n|6|" + aw.db + ": " + e2.m;
        this.ai = new ae();
        this.a(this.ai, string);
        this.bL = new int[]{e2.b, e2.d, e2.e};
        this.bC = null;
        this.cH = null;
    }

    private void a(eh eh2) {
        try {
            String string = "|0|" + eh2.c;
            String[] stringArray = di.r.a(eh2.d, this.ag - 60);
            int n2 = 0;
            while (n2 < stringArray.length) {
                string = String.valueOf(string) + "\n|2|" + stringArray[n2];
                ++n2;
            }
            string = String.valueOf(string) + "\n--";
            string = String.valueOf(string) + "\n|7|" + aw.dc + ": " + eh2.i;
            string = String.valueOf(string) + "\n|1|" + aw.de + ": " + eh2.f;
            string = String.valueOf(string) + "\n|4|" + aw.df + ": " + eh2.g + "/" + eh2.h;
            string = String.valueOf(string) + "\n|4|" + aw.do + ": " + eh2.j;
            string = String.valueOf(string) + "\n|4|" + aw.dp + ": " + ai.a(eh2.e);
            this.ai = new ae();
            this.a(this.ai, string);
            this.bK = ak.a((short)((short)eh2.b)).c[0];
            this.bC = null;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void a(et et2, bf bf2, bf bf3) {
        String string = "|0|" + et2.b;
        int n2 = 0;
        while (n2 < et2.g.length) {
            string = String.valueOf(string) + "\n|4|" + et2.g[n2];
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        if (bf2 != null) {
            string = String.valueOf(string) + "\n|2|" + aw.fd + ": " + bf2.c;
            string = String.valueOf(string) + "\n|5|" + ai.a(et2.i, "#", String.valueOf(bf2.k));
            string = String.valueOf(string) + "\n|5|" + aw.fe + bf2.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|5|" + aw.ff + ": " + bf2.a() + "s";
            string = String.valueOf(string) + "\n--";
            if (bf2.c == et2.c) {
                string = String.valueOf(string) + "\n|0|" + aw.fg;
            } else {
                if (!bf2.a.c()) {
                    string = String.valueOf(string) + "\n|1|" + aw.fh + ds.a(bf3.d) + " " + aw.fi;
                }
                string = String.valueOf(string) + "\n|4|" + ai.a(et2.i, "#", String.valueOf(bf3.k));
            }
        } else {
            string = String.valueOf(string) + "\n|2|" + aw.fj;
            string = String.valueOf(string) + "\n|1|" + aw.fk + ds.a(bf3.d) + " " + aw.fi;
            string = String.valueOf(string) + "\n|4|" + ai.a(et2.i, "#", String.valueOf(bf3.k));
            string = String.valueOf(string) + "\n|4|" + aw.fe + bf3.i + (et2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|4|" + aw.ff + ": " + bf3.a() + "s";
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.ai = new ae();
        this.a(this.ai, string);
        this.bK = 0;
    }

    public final void s() {
        if (main.a.e) {
            this.aa.j = 156;
            this.aa.k = 3;
        } else {
            this.aa.j = main.a.A - 19;
            this.aa.k = main.a.B - 19;
        }
        this.aa.f = false;
        ae.m = null;
        bp.c();
        this.bM = 20;
        this.a = true;
        this.cD = false;
        bu.a();
        if (this.F()) {
            af.e().W();
        }
    }

    public final void t() {
        if (this.o != null && this.o.b) {
            if (this.o.d != null && (main.a.i[12] || bb.a(this.o.d)) && this.o.d != null) {
                this.o.d.a();
            }
            if (this.o.e != null && (main.a.i[13] || bb.a(this.o.e)) && this.o.e != null) {
                this.o.e.a();
            }
            if (this.o.f != null && (main.a.i[5] || bb.a(this.o.f)) && this.o.f != null) {
                this.o.f.a();
            }
            if (this.o.b && main.a.ag != 0) {
                this.o.a(main.a.ag);
                main.a.ag = 0;
            }
            main.a.g();
            main.a.f();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void u() {
        block146: {
            block148: {
                block147: {
                    block143: {
                        block145: {
                            block144: {
                                if (this.o != null && this.o.b) {
                                    return;
                                }
                                if (!main.a.G.az) {
                                    return;
                                }
                                if (bp.a) {
                                    return;
                                }
                                if (this.j == null || !this.j.k) break block143;
                                var1_1 = this.j;
                                if (var1_1.c != null && (main.a.i[12] || bb.a(var1_1.c))) {
                                    var1_1.c.a();
                                }
                                if (var1_1.d != null && (main.a.i[13] || bb.a(var1_1.d))) {
                                    var1_1.d.a();
                                }
                                if (var1_1.l) break block144;
                                if (dr.f == null) break block145;
                                if (main.a.e) {
                                    dr.f.a();
                                    var1_1.n = dr.f.n;
                                }
                                if (main.a.i[2]) {
                                    main.a.i[2] = false;
                                    --var1_1.n;
                                    if (var1_1.n < 0) {
                                        var1_1.n = var1_1.e - 1;
                                    }
                                    dr.f.a(var1_1.n * dr.f.o);
                                }
                                if (main.a.i[8]) {
                                    main.a.i[8] = false;
                                    ++var1_1.n;
                                    if (var1_1.n > var1_1.e - 1) {
                                        var1_1.n = 0;
                                    }
                                    dr.f.a(var1_1.n * dr.f.o);
                                }
                                if (var1_1.n != -1) {
                                    var1_1.o = var1_1.n;
                                }
                            }
                            main.a.g();
                            main.a.f();
                        }
                        return;
                    }
                    if (this.cD) {
                        return;
                    }
                    if (!this.a) {
                        return;
                    }
                    if (this.aa.c()) {
                        this.aa.a();
                        return;
                    }
                    if (main.a.i[13]) {
                        if (this.A == 4) {
                            this.q();
                            this.aK = 0;
                            this.h = 0;
                        } else {
                            this.A();
                            return;
                        }
                    }
                    if (main.a.i[12] || main.a.i[5]) {
                        if (this.aW.e > 0) {
                            this.a(this.aW.e, this.aW.o);
                        } else {
                            this.bV = 2;
                        }
                    }
                    if (this.equals(main.a.G) && main.a.H == null && main.a.m && !main.a.b(this.b, 0, this.d, this.e) && !this.bT) {
                        this.A();
                        return;
                    }
                    if (this.bP) break block146;
                    var1_2 = this;
                    if (var1_2.ci != null && var1_2.ci.m || var1_2.bT) break block146;
                    var2_4 = var1_2.B;
                    var4_11 = var1_2;
                    if (var4_11.dn <= 0) ** GOTO lbl-1000
                    if (var4_11.aY.length <= 1) break block147;
                    if (var4_11.ak != 0) ** GOTO lbl-1000
                    v0 = true;
                    break block148;
                }
                if (var4_11.ak >= 0) {
                    v0 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = false;
                }
            }
            if (!v0) {
                if (main.a.i[6]) {
                    if (var1_2.aw()) {
                        if (var1_2.ak >= 0) {
                            var1_2.ax();
                        } else {
                            ++var1_2.B;
                            if (var1_2.B >= var1_2.aY.length) {
                                if (main.a.H != null) {
                                    var1_2.B = var1_2.aY.length - 1;
                                    main.a.W = true;
                                } else {
                                    var1_2.B = 0;
                                }
                            }
                            var1_2.ak = var1_2.bp[var1_2.B];
                            var1_2.aX[var1_2.A] = var1_2.B;
                        }
                    } else {
                        ++var1_2.B;
                        if (var1_2.B >= var1_2.aY.length) {
                            if (main.a.H != null) {
                                var1_2.B = var1_2.aY.length - 1;
                                main.a.W = true;
                            } else {
                                var1_2.B = 0;
                            }
                        }
                        var1_2.ak = var1_2.bp[var1_2.B];
                        var1_2.aX[var1_2.A] = var1_2.B;
                    }
                }
                if (main.a.i[4]) {
                    --var1_2.B;
                    if (var1_2.B < 0) {
                        var1_2.B = var1_2.aY.length - 1;
                    }
                    if (main.a.W) {
                        main.a.W = false;
                    }
                    var1_2.ak = var1_2.bp[var1_2.B];
                    var1_2.aX[var1_2.A] = var1_2.B;
                }
            }
            var1_2.cf = -1;
            var3_13 = 0;
            while (var3_13 < var1_2.aY.length) {
                if (main.a.b(var1_2.C + var3_13 * var1_2.aE, 52, var1_2.aE - 1, 25)) {
                    var1_2.cf = var3_13;
                    if (main.a.m) {
                        var1_2.B = var3_13;
                        var1_2.aX[var1_2.A] = var3_13;
                        main.a.m = false;
                        var1_2.ak = var1_2.bp[var1_2.B];
                        if (var2_4 != var1_2.B || var1_2.bW != 0) break;
                        var1_2.f = 0;
                        var1_2.ak = main.a.e != false ? -1 : 0;
                        break;
                    }
                }
                ++var3_13;
            }
            if (var2_4 != var1_2.B) {
                var1_2.dn = 0;
                bu.a();
                switch (var1_2.A) {
                    case 21: {
                        if (var1_2.B == 0) {
                            var1_2.U();
                        }
                        if (var1_2.B == 1) {
                            var1_2.P();
                        }
                        if (var1_2.B != 2) break;
                        var1_2.b(true);
                        break;
                    }
                    case 0: {
                        if (var1_2.B == 0) {
                            var4_11 = var1_2;
                            var1_2.aP = 0;
                        }
                        if (var1_2.B == 1) {
                            var1_2.b(true);
                        }
                        if (var1_2.B == 2) {
                            var1_2.R();
                        }
                        if (var1_2.B == 3) {
                            if (var1_2.D.length > 4) {
                                var1_2.w();
                            } else {
                                var1_2.Q();
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.Q();
                        break;
                    }
                    case 2: {
                        if (var1_2.B == 0) {
                            var1_2.T();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.b(true);
                        break;
                    }
                    case 3: {
                        var1_2.S();
                        break;
                    }
                    case 1: {
                        var1_2.y();
                        break;
                    }
                    case 25: {
                        var1_2.av();
                        break;
                    }
                    case 12: {
                        if (var1_2.B == 0) {
                            var1_2.o();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.b(true);
                        break;
                    }
                    case 13: {
                        if (var1_2.B == 0) {
                            if (var1_2.equals(main.a.G)) {
                                var1_2.b(true);
                            } else if (var1_2.equals(main.a.H)) {
                                var1_2.a(false);
                            }
                        }
                        if (var1_2.B == 1) {
                            var1_2.a(true);
                        }
                        if (var1_2.B != 2) break;
                        var1_2.a(false);
                    }
                }
                var1_2.ak = var1_2.bp[var1_2.B];
            }
        }
        switch (this.A) {
            case 23: 
            case 24: {
                this.O();
                break;
            }
            case 21: {
                if (this.B == 0) {
                    this.O();
                }
                if (this.B == 1) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B != 2) break;
                this.O();
                break;
            }
            case 0: {
                if (this.B == 0) {
                    var1_2 = this;
                    if (main.a.j[2]) {
                        var1_2.aP -= 5;
                    }
                    if (main.a.j[8]) {
                        var1_2.aP += 5;
                    }
                    if (var1_2.aP < 0) {
                        var1_2.aP = 0;
                    }
                    if ((var2_4 = var1_2.cw * 12 - (var1_2.ah - 60)) < 0) {
                        var2_4 = 0;
                    }
                    if (var1_2.aP > var2_4) {
                        var1_2.aP = var2_4;
                    }
                    if (var1_2.ci != null) {
                        if (!main.a.e) {
                            var1_2.ci.d = var1_2.aP;
                        }
                        var1_2.ci.a();
                    }
                    var3_13 = var1_2.ae + var1_2.ag / 2 - 35;
                    var4_12 = main.a.B > 300 ? 20 : 15;
                    var2_4 = var1_2.af + var1_2.ah - var4_12 - 15;
                    var4_12 = main.a.p;
                    var5_14 = main.a.q;
                    var1_2.cd = -1;
                    if (g.as) {
                        p.j();
                        if (!(p.e() || var4_12 < var3_13 || var4_12 > var3_13 + 70 || var5_14 < var2_4 || var5_14 > var2_4 + 30 || var1_2.ci != null && var1_2.ci.m)) {
                            var1_2.cd = 1;
                            if (main.a.m) {
                                bu.a();
                                var1_2.bV = 2;
                                main.a.l();
                            }
                        }
                    }
                    main.a.f();
                    return;
                }
                if (this.B == 1) {
                    this.ay();
                }
                if (this.B == 2) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B == 3) {
                    if (this.D.length == 4) {
                        var2_5 = this;
                        var2_5.O();
                    } else {
                        var1_2 = this;
                        var1_2.O();
                        var2_6 = var1_2;
                        if (var2_6.aZ != null) {
                            if (main.a.i[4]) {
                                var2_6.bE = var2_6.X();
                                --var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.aZ.length - 1;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.bE.k.length - 1;
                                }
                            } else if (main.a.i[6]) {
                                var2_6.bE = var2_6.X();
                                ++var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN > var2_6.aZ.length - 1) {
                                    var2_6.bN = 0;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN > var2_6.bE.k.length - 1) {
                                    var2_6.bN = 0;
                                }
                            }
                        }
                    }
                }
                if (this.B != 4) break;
                ** GOTO lbl384
            }
            case 2: {
                this.ay();
                break;
            }
            case 3: 
            case 26: {
                this.O();
                break;
            }
            case 14: {
                this.O();
                break;
            }
            case 1: 
            case 17: 
            case 25: {
                if (this.B < this.aY.length - (main.a.H != null ? 0 : 1) && this.A != 17) {
                    this.O();
                    break;
                }
                if (this.bJ == 0) {
                    this.ay();
                    break;
                }
                this.O();
                break;
            }
            case 4: {
                var1_2 = this;
                if (main.a.j[2]) {
                    var1_2.cC -= 5;
                    var1_2.aM = var1_2.cC - (var1_2.af + var1_2.ah / 2);
                    if (var1_2.cC < var1_2.af) {
                        var1_2.cC = var1_2.af;
                    }
                }
                if (main.a.j[8]) {
                    var1_2.cC += 5;
                    var1_2.aM = var1_2.cC - (var1_2.af + var1_2.ah / 2);
                    if (var1_2.cC > var1_2.af + 200) {
                        var1_2.cC = var1_2.af + 200;
                    }
                }
                if (main.a.j[4]) {
                    var1_2.cB -= 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB < 16) {
                        var1_2.cB = 16;
                    }
                }
                if (main.a.j[6]) {
                    var1_2.cB += 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB > 250) {
                        var1_2.cB = 250;
                    }
                }
                if (main.a.k) {
                    var1_2.bT = true;
                    if (!var1_2.bZ) {
                        var1_2.bX = var1_2.aL;
                        var1_2.bY = var1_2.aM;
                        var1_2.bZ = true;
                    }
                    var1_2.aL = var1_2.bX + (main.a.t - main.a.p);
                    var1_2.aM = var1_2.bY + (main.a.u - main.a.q);
                }
                if (main.a.m) {
                    var1_2.bZ = false;
                    main.a.t = main.a.p;
                    main.a.u = main.a.q;
                    var1_2.ca = main.a.t + var1_2.aL;
                    var1_2.cb = main.a.u + var1_2.aM;
                }
                if (main.a.l) {
                    var1_2.bT = false;
                }
                if (var1_2.aL < 0) {
                    var1_2.aL = 0;
                }
                if (var1_2.aL > var1_2.aN) {
                    var1_2.aL = var1_2.aN;
                }
                if (var1_2.aM < 0) {
                    var1_2.aM = 0;
                }
                if (var1_2.aM > var1_2.aO) {
                    var1_2.aM = var1_2.aO;
                }
                main.a.f();
                return;
            }
            case 7: {
                this.ay();
                break;
            }
            case 8: {
                this.O();
                break;
            }
            case 9: {
                this.O();
                break;
            }
            case 10: {
                this.O();
                break;
            }
            case 11: 
            case 16: {
                this.O();
                break;
            }
            case 15: {
                this.O();
                break;
            }
            case 12: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    var1_2.O();
                    var1_2.cc = -1;
                    if (var1_2.ak == var1_2.k.size() && main.a.l) {
                        main.a.l = false;
                        var1_2.cc = 1;
                    }
                }
                if (var1_2.B != 1) break;
                var1_2.O();
                break;
            }
            case 13: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    if (var1_2.equals(main.a.G)) {
                        var1_2.ay();
                    }
                    if (var1_2.equals(main.a.H)) {
                        var2_7 = var1_2;
                        var2_7.O();
                    }
                }
                if (var1_2.B != 1 && var1_2.B != 2) break;
                var2_8 = var1_2;
                var2_8.O();
                break;
            }
            case 18: {
                this.O();
                break;
            }
            case 19: {
                var2_9 = this;
                var2_9.O();
                break;
            }
lbl384:
            // 2 sources

            case 20: {
                var2_10 = this;
                var2_10.O();
            }
        }
        main.a.g();
        var1_3 = 0;
        while (var1_3 < main.a.i.length) {
            main.a.i[var1_3] = false;
            ++var1_3;
        }
    }

    public final void a(boolean bl2) {
        this.O = bl2 ? this.U.size() + 3 : this.V.size() + 3;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void b(af af2) {
        this.A = 13;
        this.M[this.A] = bg;
        this.aT = false;
        this.aS = false;
        this.m = false;
        this.U.removeAllElements();
        this.V.removeAllElements();
        this.aR = 0;
        this.l = 0;
        if (main.a.A > 2 * ab) {
            main.a.H = new g();
            new g().A = 13;
            main.a.H.M[this.A] = new String[][]{aw.cj};
            main.a.H.c(1);
            main.a.H.a(false);
            main.a.G.M[this.A] = new String[][]{aw.cf, aw.ci};
            main.a.H.s();
            main.a.H.ac = af2;
        }
        if (this.equals(main.a.G)) {
            this.c(0);
        }
        if (this.B == 0) {
            this.b(true);
        }
        if (this.B == 1) {
            this.a(true);
        }
        if (this.B == 2) {
            this.a(false);
        }
        this.ac = af2;
    }

    private void a(en en2, boolean bl2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        el el2 = bl2 ? this.U : this.V;
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 36;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                if (n2 == this.O - 1) {
                    if (bl2) {
                        en2.a(15196114);
                        en2.b(n7, n4, this.ag, n6);
                        if (!this.aS) {
                            if (!this.m) {
                                di.o.a(en2, String.valueOf(aw.dU) + aw.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            } else {
                                di.o.a(en2, String.valueOf(aw.dU) + aw.dO, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            }
                        } else if (this.m) {
                            en2.a(15196114);
                            en2.b(n7, n4, this.ag, n6);
                            en2.a(n2 == this.ak ? p.az : p.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                            (n2 == this.ak ? di.g : di.f).a(en2, aw.dT, this.ae + this.ag - 22, n4 + 7, 2);
                            di.o.a(en2, String.valueOf(aw.dU) + aw.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                        } else {
                            di.o.a(en2, String.valueOf(aw.dU) + aw.dM, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                        }
                    }
                } else if (n2 == this.O - 2) {
                    if (bl2) {
                        en2.a(15196114);
                        en2.b(n7, n4, this.ag, n6);
                        if (!this.aT) {
                            if (!this.aS) {
                                en2.a(n2 == this.ak ? p.az : p.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                                (n2 == this.ak ? di.g : di.f).a(en2, aw.dW, this.ae + this.ag - 22, n4 + 7, 2);
                                di.o.a(en2, String.valueOf(aw.dV) + aw.dM, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            } else {
                                en2.a(n2 == this.ak ? p.az : p.ay, this.ae + this.ag - 5, n4 + 2, cj.b);
                                (n2 == this.ak ? di.g : di.f).a(en2, aw.bv, this.ae + this.ag - 22, n4 + 7, 2);
                                di.o.a(en2, String.valueOf(aw.dV) + aw.dO, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            }
                        }
                    } else if (!this.m) {
                        di.f.a(en2, aw.dN, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    } else {
                        di.f.a(en2, aw.dP, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    }
                } else if (n2 == this.O - 3) {
                    int n10;
                    en en3;
                    int n11;
                    en en4;
                    if (this.aS) {
                        en4 = en2;
                        n11 = 13748667;
                    } else {
                        en4 = en2;
                        n11 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    en4.a(n11);
                    en2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        en3 = en2;
                        n10 = 13748667;
                    } else {
                        en3 = en2;
                        n10 = n2 == this.ak ? 7300181 : 9993045;
                    }
                    en3.a(n10);
                    en2.b(n7, n8, 34, n9);
                    en2.a(w, n7 + 17, n8 + n9 / 2, 3);
                    di.m.a(en2, String.valueOf(ai.a((long)(bl2 ? this.aR : this.l))) + " " + aw.bD, n3 + 5, n4 + 11, 0);
                    di.r.a(en2, aw.dX, n3 + 5, n4, 0);
                } else {
                    int n12;
                    int n13;
                    en en5;
                    int n14;
                    en en6;
                    if (el2.size() == 0) {
                        return;
                    }
                    if (this.aS) {
                        en6 = en2;
                        n14 = 13748667;
                    } else {
                        en6 = en2;
                        n14 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    en6.a(n14);
                    en2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        en5 = en2;
                        n13 = 13748667;
                    } else {
                        en5 = en2;
                        n13 = n2 == this.ak ? 9541120 : 9993045;
                    }
                    en5.a(n13);
                    h h2 = (h)el2.elementAt(n2);
                    if (h2 != null) {
                        n6 = 0;
                        while (n6 < h2.a.length) {
                            byte by2;
                            if (h2.a[n6].c.a == 72 && h2.a[n6].a > 0 && (n12 = g.f(by2 = g.g(h2.a[n6].a))) != -1) {
                                int n15;
                                en en7;
                                if (this.aS) {
                                    en7 = en2;
                                    n15 = 13748667;
                                } else {
                                    en7 = en2;
                                    n15 = g.f(by2);
                                }
                                en7.a(n15);
                            }
                            ++n6;
                        }
                    }
                    en2.b(n7, n8, 34, n9);
                    if (h2 != null) {
                        Object object = "";
                        di di2 = di.m;
                        if (h2.a != null) {
                            n12 = 0;
                            while (n12 < h2.a.length) {
                                if (h2.a[n12].c.a == 72) {
                                    object = " [+" + h2.a[n12].a + "]";
                                }
                                if (h2.a[n12].c.a == 41) {
                                    if (h2.a[n12].a == 1) {
                                        di2 = g.h(0);
                                    } else if (h2.a[n12].a == 2) {
                                        di2 = g.h(2);
                                    } else if (h2.a[n12].a == 3) {
                                        di2 = g.h(8);
                                    } else if (h2.a[n12].a == 4) {
                                        di2 = g.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.b.d) + (String)object, n3 + 5, n4 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.a.length > 0 && h2.a[0] != null) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = di.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = di.p;
                            }
                            if (h2.a.length > 1) {
                                int n16 = 1;
                                while (n16 < h2.a.length) {
                                    if (h2.a[n16] != null && h2.a[n16].c.a != 102 && h2.a[n16].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n16].a();
                                    }
                                    ++n16;
                                }
                            }
                            ((di)object).a(en2, string, n3 + 5, n4 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n7 + 17, n8 + n9 / 2, 0, 3);
                        if (h2.a != null) {
                            int n17 = 0;
                            while (n17 < h2.a.length) {
                                this.a(en2, h2.a[n17].c.a, n7, n8, n9);
                                ++n17;
                            }
                            n17 = 0;
                            while (n17 < h2.a.length) {
                                g.a(en2, h2.a[n17].c.a, h2.a[n17].a, n7, n8, 34, n9);
                                ++n17;
                            }
                        }
                        if (h2.h > 1) {
                            di.n.a(en2, "" + h2.h, n7 + 34, n8 + n9 - di.n.a(), 1);
                        }
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void M() {
        this.bP = false;
        if (this.A == 0 && this.D.length == 5 && this.B == 3) {
            this.bP = false;
            if (this.ak == 0) {
                this.aZ = new int[this.cg.length];
                int n2 = 0;
                while (n2 < this.aZ.length) {
                    this.aZ[n2] = n2;
                    ++n2;
                }
                if (!this.an) {
                    this.bP = true;
                    return;
                }
            } else if (this.ak != 1) {
                if (this.al) {
                    return;
                }
                if (this.ak > 0) {
                    this.aZ = new int[1];
                    int n3 = 0;
                    while (n3 < this.aZ.length) {
                        this.aZ[n3] = n3;
                        ++n3;
                    }
                    this.bP = true;
                }
            }
        }
    }

    private void N() {
        try {
            if (this.A == 0 && this.B == 3 && this.D.length == 5) {
                if (this.ak == -1) {
                    return;
                }
                int n2 = 0;
                if (this.ak == 0) {
                    n2 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
                    this.bN = (main.a.p - n2) / this.aE;
                } else {
                    this.bE = this.X();
                    if (this.bE != null && this.bE.k != null) {
                        n2 = this.ae + this.ag - 2 - this.bE.k.length * 40;
                        this.bN = (main.a.p - n2) / 40;
                    }
                }
                if (main.a.p < n2) {
                    this.bN = -1;
                    return;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void O() {
        int n2;
        if (this.O <= 0) {
            return;
        }
        int n3 = 0;
        if (main.a.i[2]) {
            n3 = 1;
            --this.ak;
            if (this.A == 24) {
                this.ak -= 2;
                if (this.ak < 0) {
                    this.ak = 0;
                }
            } else if (this.ak < 0) {
                if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.a();
                    if (this.L[this.B] <= 0) {
                        bt.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                        return;
                    }
                    bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                    return;
                }
                this.ak = this.O - 1;
                if (this.bP) {
                    this.ak = -1;
                }
                if (this.dn > 0) {
                    this.ak = -1;
                }
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        } else if (main.a.i[8]) {
            n3 = 1;
            ++this.ak;
            if (this.A == 24) {
                this.ak += 2;
                if (this.ak > this.O - 1) {
                    this.ak = this.O - 1;
                }
            } else if (this.ak > this.O - 1) {
                if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    bp.a();
                    if (this.L[this.B] >= this.K[this.B] - 1) {
                        bt.a().a((byte)4, -1, (byte)this.B, 0, -1);
                        return;
                    }
                    bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                    return;
                }
                this.ak = 0;
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        }
        if (n3 != 0) {
            this.f = this.ak * this.aD - this.ah / 2;
            if (this.f > this.aI) {
                this.f = this.aI;
            }
            if (this.f < 0) {
                this.f = 0;
            }
            this.g = this.f;
        }
        if (main.a.k) {
            this.ce = false;
            if (!this.bT && main.a.b(this.ae, this.af, this.ag, this.ah)) {
                n3 = 0;
                while (n3 < this.bS.length) {
                    this.bS[0] = main.a.q;
                    ++n3;
                }
                this.bR = main.a.q;
                this.bT = true;
                this.bU = this.bW != 0;
                this.bW = 0;
            } else if (this.bT) {
                ++this.bQ;
                if (this.bQ > 5 && this.bR == main.a.q && !this.bU) {
                    this.bR = -1000;
                    this.ak = (this.f + main.a.q - this.af) / this.aD;
                    if (this.ak >= this.O) {
                        this.ak = -1;
                    }
                    this.N();
                }
                if ((n3 = main.a.q - this.bS[0]) != 0 && this.ak != -1) {
                    this.ak = -1;
                    this.bN = -1;
                }
                n2 = this.bS.length - 1;
                while (n2 > 0) {
                    this.bS[n2] = this.bS[n2 - 1];
                    --n2;
                }
                this.bS[0] = main.a.q;
                this.f -= n3;
                if (this.f < 0) {
                    this.f = 0;
                }
                if (this.f > this.aI) {
                    this.f = this.aI;
                }
                if (this.g < 0 || this.g > this.aI) {
                    n3 /= 2;
                }
                this.g -= n3;
            }
        }
        if (main.a.m && this.bT) {
            this.ce = true;
            n3 = main.a.q - this.bS[0];
            main.a.m = false;
            if (ds.g(n3) < 20 && ds.g(main.a.q - this.bR) < 20 && !this.bU) {
                this.bW = 0;
                this.f = this.g;
                this.bR = -1000;
                this.ak = (this.f + main.a.q - this.af) / this.aD;
                if (this.ak >= this.O) {
                    this.ak = -1;
                }
                this.N();
                this.bQ = 0;
                this.bV = 10;
                bu.a();
            } else if (this.ak != -1 && this.bQ > 5) {
                this.bQ = 0;
                this.bV = 1;
            } else if (this.ak == -1 && !this.bU) {
                if (this.g < 0) {
                    this.f = 0;
                } else if (this.g > this.aI) {
                    this.f = this.aI;
                } else {
                    n2 = main.a.q - this.bS[0] + (this.bS[0] - this.bS[1]) + (this.bS[1] - this.bS[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.bW = -n2 * 100;
                }
            }
            if ((this.aw() || this.A == 13) && main.a.q < this.af + 21) {
                this.ak = 0;
                this.ax();
            }
            this.bT = false;
            this.bQ = 0;
            main.a.m = false;
        }
    }

    private void P() {
        this.O = this.cm.length;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    private void Q() {
        bu.a();
        bu.f();
        this.O = G.length;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void v() {
        if (this.al) {
            this.O = this.P == null ? 2 : this.P.length + 2;
            this.ch = aw.dq;
        } else if (this.an) {
            this.ao = "";
            this.O = (this.Q == null ? this.R.size() : this.Q.size()) + 2;
            this.ch = String.valueOf(aw.df) + " " + (this.bD != null ? this.bD.c : af.e().ai.c);
        } else if (this.am) {
            this.O = cb.l.size() + 2;
            this.ch = aw.ae;
            this.ao = "";
        }
        this.cg = af.e().ai == null ? new String[][]{aw.dk, aw.dj} : (!this.an ? (this.R.size() > 1 ? new String[][]{aw.dh, aw.dn, aw.dg} : new String[][]{aw.dg}) : (af.e().aj > 0 ? new String[][]{aw.af, aw.di} : (this.R.size() > 1 ? new String[][]{aw.af, aw.di, aw.dl, aw.dm} : new String[][]{aw.af, aw.dl, aw.dm})));
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void w() {
        p.aW = false;
        this.aD = 24;
        if (this.bp != null && this.bp[3] == 0) {
            this.bp[3] = -1;
        }
        this.O = 2;
        if (af.e().ai != null) {
            this.am = true;
            this.an = false;
            this.al = false;
        } else {
            this.am = false;
            this.an = false;
            this.al = true;
        }
        if (af.e().ai != null) {
            this.O = cb.l.size() + 2;
        }
        this.v();
        this.bN = -1;
        if (this.o == null) {
            this.o = new cq();
            this.o.a.b = main.a.B - 35 - cq.b().a.d;
            this.o.a();
            this.o.c = main.a.G;
        }
        if (af.e().ai == null) {
            this.ao = aw.dK;
            bt.a().a("");
        }
        this.ak = this.bp[this.B];
        if (main.a.e) {
            this.ak = -1;
        }
    }

    public final void x() {
        this.O = this.bG.size() + 1;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void y() {
        this.aD = 24;
        this.O = this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2 ? this.i(af.e().aH.length + af.e().aF.length) : af.e().aJ[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void R() {
        this.aD = 30;
        this.O = af.e().ax.b.length + 6;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void S() {
        this.aD = 24;
        this.O = p.j().S.length;
        this.aI = this.O * this.aD - this.ah;
        this.f = 0;
        this.g = 0;
        this.ak = main.a.e ? -1 : 0;
    }

    private void T() {
        this.O = this.i(af.e().aG.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void U() {
        this.aD = 30;
        h[] hArray = af.f().aH;
        bf[] bfArray = af.f().aI;
        this.O = hArray.length + bfArray.length;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void b(boolean bl2) {
        this.O = this.i(af.e().aH.length + af.e().aF.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        if (bl2) {
            this.ak = main.a.e ? -1 : 0;
        }
    }

    private void V() {
        if (this.bM > 0) {
            --this.bM;
        }
        if (this.ce && this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            if (this.g < -50) {
                bp.a();
                this.ce = false;
                if (this.L[this.B] <= 0) {
                    bt.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                } else {
                    bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                }
            } else if (this.g > this.aI + 50) {
                this.ce = false;
                bp.a();
                if (this.L[this.B] >= this.K[this.B] - 1) {
                    bt.a().a((byte)4, -1, (byte)this.B, 0, -1);
                } else {
                    bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                }
            }
        }
        if (this.h != this.aK && !this.bT) {
            this.cj = this.aK - this.h << 2;
            this.ck += this.cj;
            this.h += this.ck >> 3;
            this.ck &= 0xF;
        }
        if (Math.abs(this.aK - this.h) < 10) {
            this.h = this.aK;
        }
        if (this.cD) {
            this.cD = false;
            this.aK = this.ag;
        }
        if (this.aK >= this.ag - 10 && this.h >= this.ag - 10 && this.bH == 0) {
            this.a = false;
            this.Z();
            if (this.cI) {
                this.cI = false;
                if (af.e().U > 0L && af.e().H != 14) {
                    bp.a();
                    if (this.A == 3) {
                        bt.a().f(this.ak);
                    } else if (this.A == 14) {
                        bt.a().v(this.ak);
                    }
                }
            }
            if (this.cl) {
                this.cl = false;
                int n2 = this.S.size() - this.Z.size();
                if (af.e().aU != null) {
                    af.e().aU.M = this.ak - n2 < 0 ? this.ak : (int)Short.parseShort((String)this.Z.elementAt(this.ak - n2));
                }
                de de2 = (de)this.S.elementAt(this.ak);
                de2.a();
            }
            this.S.removeAllElements();
            this.Z.removeAllElements();
            this.ac = null;
        }
        if (this.bW != 0 && !this.bT) {
            this.f += this.bW / 100;
            if (this.f < 0) {
                this.f = 0;
            } else if (this.f > this.aI) {
                this.f = this.aI;
            } else {
                this.g = this.f;
            }
            this.bW = this.bW * 9 / 10;
            if (this.bW < 100 && this.bW > -100) {
                this.bW = 0;
            }
        }
        if (this.g != this.f && !this.bT) {
            this.aH = this.f - this.g << 2;
            this.aG += this.aH;
            this.g += this.aG >> 4;
            this.aG &= 0xF;
        }
        this.aJ[this.B] = this.g;
    }

    private void b(en en2) {
        int n2;
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.af + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.d(n7, n8, n9, n10);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.d(n4, n5, 24, n6);
            q q2 = (q)this.W.elementAt(n2);
            if (q2.b != -1) {
                bl.b(en2, q2.b, n4, n5, 0, 0);
            } else {
                av av2 = p.x[q2.a];
                bl.b(en2, av2.a[af.bC[0][0][0]].a, n4 + av2.a[af.bC[0][0][0]].b, n5 + n10 - 1, 0, 36);
            }
            en2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (q2.g != af.e().J) {
                di.h.a(en2, q2.e, n7 + 5, n8, 0);
            } else {
                di.a.a(en2, q2.e, n7 + 5, n8, 0);
            }
            di.q.a(en2, q2.f, n7 + n9 - 5, n8 + 11, 1);
            di.m.a(en2, String.valueOf(aw.bL) + ": " + q2.h, n7 + 5, n8 + 11, 0);
            ++n2;
        }
        this.f(en2);
    }

    public final void a(en en2) {
        block144: {
            Object object;
            Object object2;
            int n2;
            Object object3;
            Object object4;
            en en3;
            block143: {
                block149: {
                    g g2;
                    en en4;
                    block150: {
                        block148: {
                            block147: {
                                block146: {
                                    block145: {
                                        Object object5;
                                        int n3;
                                        en2.a(-en2.a(), -en2.b());
                                        en2.a(-this.h, 0);
                                        en2.a(this.b, 0);
                                        if (main.a.G.av == -1) break block143;
                                        if (!this.equals(main.a.G)) break block144;
                                        en4 = en2;
                                        g2 = this;
                                        p.j();
                                        p.b(en4);
                                        en en5 = en4;
                                        g g3 = g2;
                                        en5.a(-p.j, -p.k);
                                        if (g3.cX < 3) {
                                            n3 = 0;
                                            while (n3 < p.G.size()) {
                                                object5 = (do)p.G.elementAt(n3);
                                                if (((do)object5).df.a == g3.aw) {
                                                    ((do)object5).a(en5);
                                                    if (((af)object5).z != null) {
                                                        ((af)object5).z.a(en5, ((af)object5).B, ((af)object5).C - ((af)object5).al - main.a.ae, ((af)object5).I);
                                                    }
                                                }
                                                ++n3;
                                            }
                                        }
                                        main.a.a(en5);
                                        if (main.a.w % 4 == 0) {
                                            en5.a(ce.f, g3.ax - 5, g3.ay + 15, 33);
                                            en5.a(ce.f, g3.ax + 5, g3.ay + 15, 33);
                                            en5.a(ce.f, g3.ax, g3.ay + 15, 33);
                                        }
                                        n3 = 0;
                                        while (n3 < dc.w.size()) {
                                            object5 = (dc)dc.w.elementAt(n3);
                                            ((dc)object5).a(en5);
                                            ++n3;
                                        }
                                        if (main.a.w % 4 == 0) {
                                            en4.a(ce.f, g2.ax, g2.ay + 15, 33);
                                        }
                                        if (g2.cX != 0) break block145;
                                        int n4 = 0;
                                        while (n4 < g2.cT.length) {
                                            bl.b(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                                            if (g2.dd) {
                                                bl.b(en4, g2.de, g2.cU[n4], g2.cV[n4], 0, 3);
                                            }
                                            ++n4;
                                        }
                                        break block144;
                                    }
                                    if (g2.cX != 1) break block146;
                                    if (!g2.dd) {
                                        bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                    } else {
                                        int n5 = 0;
                                        while (n5 < g2.cT.length) {
                                            bl.b(en4, g2.aA, g2.cU[0], g2.cV[0], 0, 3);
                                            bl.b(en4, g2.de, g2.cU[1], g2.cV[1], 0, 3);
                                            ++n5;
                                        }
                                    }
                                    break block144;
                                }
                                if (g2.cX != 2) break block147;
                                if (!g2.dd) {
                                    bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                                } else {
                                    int n6 = 0;
                                    while (n6 < g2.cT.length) {
                                        bl.b(en4, g2.aA, g2.cU[n6], g2.cV[n6], 0, 3);
                                        ++n6;
                                    }
                                }
                                break block144;
                            }
                            if (g2.cX != 3) break block148;
                            if (!g2.dd) {
                                bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                            } else {
                                bl.b(en4, g2.aA, g2.ax, g2.ay, 0, 3);
                            }
                            break block144;
                        }
                        if (g2.cX != 4) break block149;
                        if (g2.dd) break block150;
                        if (g2.aB == -1) break block149;
                        bl.b(en4, g2.aB, g2.ax, g2.ay, 0, 3);
                        break block144;
                    }
                    int n7 = 0;
                    while (n7 < g2.df.length) {
                        bl.b(en4, g2.df[n7], g2.cU[n7], g2.cV[n7], 0, 3);
                        ++n7;
                    }
                }
                return;
            }
            cx.c(this.b, 0, this.d, this.e, en2);
            try {
                en3 = en2;
                object4 = this;
                en3.e(((g)object4).b + 1, 0, ((g)object4).d - 2, ((g)object4).af - 2);
                en3.a(9993045);
                en3.d(((g)object4).b, 0, ((g)object4).d - 2, 50);
                switch (((g)object4).A) {
                    case 13: {
                        if (((g)object4).B == 0 || ((g)object4).B == 1) {
                            if (object4.equals(main.a.G)) {
                                bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                                object3 = en3;
                                di.n.a((en)object3, aw.ep, 60, 4, 0, di.o);
                                di.n.a((en)object3, aw.dQ, 60, 16, 0, di.o);
                                di.n.a((en)object3, aw.dR, 60, 27, 0, di.o);
                                di.n.a((en)object3, aw.dS, 60, 38, 0, di.o);
                            }
                            if (object4.equals(main.a.H) && ((g)object4).ac != null) {
                                bl.b(en3, ((g)object4).ac.d(), ((g)object4).b + 25, 50, 0, 33);
                                super.a(en3, ((g)object4).ac);
                            }
                        }
                        if (((g)object4).B == 2 && ((g)object4).ac != null) {
                            bl.b(en3, ((g)object4).ac.d(), ((g)object4).b + 25, 50, 0, 33);
                            super.a(en3, ((g)object4).ac);
                        }
                        break;
                    }
                    case 12: {
                        if (((g)object4).B == 0) {
                            int n8 = 1410;
                            n2 = 0;
                            while (n2 < p.G.size()) {
                                object2 = (do)p.G.elementAt(n2);
                                if (((do)object2).df.a == ((g)object4).aw) {
                                    n8 = ((af)object2).aO;
                                }
                                ++n2;
                            }
                            bl.b(en3, n8, ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            if (((g)object3).aq != null) {
                                n8 = 0;
                                while (n8 < ((g)object3).aq.length) {
                                    di.s.a((en)object, ((g)object3).aq[n8], ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 5 + n8 * 14, 2);
                                    ++n8;
                                }
                            }
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.A(en3);
                        }
                        break;
                    }
                    case 11: 
                    case 16: 
                    case 23: 
                    case 24: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 15: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 9: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 21: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, af.f().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            di.n.a((en)object, String.valueOf(aw.da) + ": " + ai.a(af.f().y), ((g)object3).b + 60, 4, 0, di.o);
                            if (af.f().y > 0L) {
                                di.n.a((en)object, af.f().aq ? af.f().c() : af.f().bj, ((g)object3).b + 60, 16, 0, di.o);
                            }
                            if (af.f().X > 0L) {
                                di.n.a((en)object, String.valueOf(aw.eZ) + " :" + af.f().X, ((g)object3).b + 60, 27, 0, di.o);
                            }
                            if (af.f().cC > 0) {
                                di.n.a((en)object, aw.fb, ((g)object3).b + 60, 38, 0, di.o);
                                ((en)object).a(p.aG, ((g)object3).b + 100, 41, 0);
                                int n9 = af.f().bf * en.a(p.aF) / af.f().cC;
                                ((en)object).e(100, ((g)object3).b + 41, n9, 20);
                                ((en)object).a(p.aF, ((g)object3).b + 100, 41, 0);
                            }
                            ((en)object).e(0, 0, main.a.A, main.a.B);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, af.f().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            di.c.a((en)object, "HP: " + af.f().U + "/" + af.f().V, ((g)object3).b + 60, 4, 0, di.f);
                            di.c.a((en)object, "MP: " + af.f().T + "/" + af.f().W, ((g)object3).b + 60, 16, 0, di.f);
                            di.n.a((en)object, String.valueOf(aw.fc) + ": " + af.f().P + ", " + aw.fa + ": " + af.f().Y, ((g)object3).b + 60, 27, 0, di.o);
                            di.n.a((en)object, String.valueOf(aw.u) + ": " + ((g)object3).cm[af.f().A], ((g)object3).b + 60, 38, 0, di.o);
                        }
                        if (((g)object4).B == 2) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 0: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            ((g)object4).A(en3);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        if (((g)object4).B == 2) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            di.s.a((en)object, "Top " + af.e().w, ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 2, 2);
                            di.n.a((en)object, aw.eG, ((g)object3).b + 45 + (((g)object3).d - 50) / 2, 14, 2);
                            di.s.a((en)object, ai.a(af.e().aa), ((g)object3).b + (main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0) + 45 + (((g)object3).d - 50) / 2, 26, 2);
                            di.n.a((en)object, String.valueOf(aw.bM) + ": " + ai.a(af.e().ab), ((g)object3).b + (main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0) + 45 + (((g)object3).d - 50) / 2, 38, 2);
                        }
                        if (((g)object4).B == 3) {
                            if (((g)object4).D.length == 5) {
                                eh eh2;
                                object = en3;
                                object3 = object4;
                                if (af.e().ai == null) {
                                    bl.b((en)object, af.e().d(), 25, 50, 0, 33);
                                    di.c.a((en)object, aw.dr, (((g)object3).ag - 50) / 2 + 50, 20, 2);
                                } else if (!((g)object3).an) {
                                    eh2 = af.e().ai;
                                    if (eh2 != null) {
                                        bl.b((en)object, af.e().d(), 25, 50, 0, 33);
                                        di.c.a((en)object, eh2.c, 60, 4, 0, di.f);
                                        di.n.a((en)object, String.valueOf(aw.eH) + ": " + eh2.f, 60, 16, 0, di.o);
                                        di.n.a((en)object, String.valueOf(aw.cU) + ": " + eh2.k, 60, 27, 0, di.o);
                                        di.n.a((en)object, String.valueOf(aw.do) + ": " + eh2.j, 60, 38, 0, di.o);
                                        ag.a((en)object, eh2.d, 60, 38, ((g)object3).ag - 70, ((g)object3).aD, di.n);
                                    }
                                } else {
                                    eh2 = ((g)object3).bD != null ? ((g)object3).bD : af.e().ai;
                                    bl.b((en)object, af.e().d(), 25, 50, 0, 33);
                                    di.c.a((en)object, eh2.c, 60, 4, 0, di.f);
                                    di.n.a((en)object, String.valueOf(aw.df) + ": " + eh2.g + "/" + eh2.h, 60, 16, 0, di.o);
                                    di.n.a((en)object, String.valueOf(aw.dc) + ": " + eh2.i, 60, 27, 0, di.o);
                                    ag.a((en)object, eh2.d, 60, 38, ((g)object3).ag - 70, ((g)object3).aD, di.n);
                                }
                            } else {
                                bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                                g.z(en3);
                            }
                        }
                        if (((g)object4).B == 4) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            g.z(en3);
                        }
                        break;
                    }
                    case 25: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 2: {
                        if (((g)object4).B == 0) {
                            bl.b(en3, 526, ((g)object4).b + 25, 50, 0, 33);
                            object = en3;
                            object3 = object4;
                            String string = String.valueOf(aw.cw) + ": " + ((g)object3).N + "/" + af.e().aG.length + " " + aw.cx;
                            di.c.a((en)object, aw.cd, 60, 4, 0);
                            di.n.a((en)object, string, 60, 16, 0);
                        }
                        if (((g)object4).B == 1) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                            super.C(en3);
                        }
                        break;
                    }
                    case 3: {
                        bl.b(en3, 561, ((g)object4).b + 25, 50, 0, 33);
                        object3 = en3;
                        di.c.a((en)object3, String.valueOf(aw.cl) + " " + bv.n, 60, 4, 0, di.f);
                        di.n.a((en)object3, bv.k, 60, 16, 0, di.o);
                        di.c.a((en)object3, String.valueOf(bv.n), 25, 27, 2);
                        break;
                    }
                    case 26: {
                        bl.b(en3, 561, ((g)object4).b + 25, 50, 0, 33);
                        object = en3;
                        object3 = object4;
                        bl.b((en)object, af.e().d(), ((g)object3).b + 25, 50, 0, 33);
                        super.A((en)object);
                        break;
                    }
                    case 1: {
                        h h2;
                        if (((g)object4).B == ((g)object4).aY.length - 1 && main.a.H == null) {
                            bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        } else if (af.e().aT != null) {
                            bl.b(en3, af.e().aT.aO, ((g)object4).b + 25, 50, 0, 33);
                        }
                        object = en3;
                        object3 = object4;
                        if (((g)object3).B == ((g)object3).aY.length - 1 && main.a.H == null) {
                            super.A((en)object);
                            break;
                        }
                        if (((g)object3).ak < 0) {
                            if (((g)object3).bJ != 2) {
                                di.s.a((en)object, aw.er, ((g)object3).b + 60, 14, 0);
                                di.s.a((en)object, ar, ((g)object3).b + 60, 26, 0);
                                break;
                            }
                            di.s.a((en)object, aw.er, ((g)object3).b + 60, 5, 0);
                            di.s.a((en)object, ar, ((g)object3).b + 60, 17, 0);
                            di.s.a((en)object, String.valueOf(aw.fP) + " " + (((g)object3).L[((g)object3).B] + 1) + "/" + ((g)object3).K[((g)object3).B], ((g)object3).b + 60, 29, 0);
                            break;
                        }
                        if (((g)object3).B >= 0 && ((g)object3).B <= af.e().aJ.length - 1 && ((g)object3).ak >= 0 && ((g)object3).ak <= af.e().aJ[((g)object3).B].length - 1 && (h2 = af.e().aJ[((g)object3).B][((g)object3).ak]) != null) {
                            if (object3.equals(main.a.G) && ((g)object3).B <= 3 && ((g)object3).bJ == 2) {
                                di.c.a((en)object, String.valueOf(aw.fP) + " " + (((g)object3).L[((g)object3).B] + 1) + "/" + ((g)object3).K[((g)object3).B], ((g)object3).b + 55, 4, 0);
                            }
                            di.c.a((en)object, h2.b.d, ((g)object3).b + 55, 24, 0);
                            object4 = String.valueOf(aw.cu) + " " + ds.a((long)h2.b.i);
                            if ((long)h2.b.i > af.e().y) {
                                di.n.a((en)object, (String)object4, ((g)object3).b + 55, 35, 0);
                                break;
                            }
                            di.r.a((en)object, (String)object4, ((g)object3).b + 55, 35, 0);
                        }
                        break;
                    }
                    case 4: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.B(en3);
                        break;
                    }
                    case 7: 
                    case 17: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 8: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 10: {
                        if (((g)object4).ac != null) {
                            bl.b(en3, ((g)object4).ac.d(), ((g)object4).b + 25, 50, 0, 33);
                            super.a(en3, ((g)object4).ac);
                        }
                        break;
                    }
                    case 14: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.B(en3);
                        break;
                    }
                    case 18: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        ((g)object4).A(en3);
                        break;
                    }
                    case 19: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                        break;
                    }
                    case 20: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                        break;
                    }
                    case 22: {
                        bl.b(en3, af.e().d(), ((g)object4).b + 25, 50, 0, 33);
                        g.z(en3);
                    }
                }
            }
            catch (Exception exception) {}
            en3 = en2;
            object4 = this;
            if (((g)object4).A != 13 || ((g)object4).B != 2 && !object4.equals(main.a.H)) {
                en3.e(0, 0, main.a.A, main.a.B);
                en3.a(11837316);
                en3.d(((g)object4).b + 1, ((g)object4).e - 15, ((g)object4).d - 2, 14);
                en3.a(13524492);
                en3.d(((g)object4).b + 1, ((g)object4).e - 15, ((g)object4).d - 2, 1);
                en3.a(w, ((g)object4).b + 11, ((g)object4).e - 7, 3);
                en3.a(y, ((g)object4).b + 75, ((g)object4).e - 8, 3);
                di.n.a(en3, String.valueOf(af.e().o), ((g)object4).b + 24, ((g)object4).e - 13, 0, di.o);
                di.n.a(en3, String.valueOf(af.e().p), ((g)object4).b + 85, ((g)object4).e - 13, 0, di.o);
                en3.a(z, ((g)object4).b + 130, ((g)object4).e - 8, 3);
                di.n.a(en3, String.valueOf(af.e().q), ((g)object4).b + 140, ((g)object4).e - 13, 0, di.o);
            }
            this.y(en2);
            switch (this.A) {
                case 9: {
                    this.v(en2);
                    break;
                }
                case 21: {
                    if (this.B == 0) {
                        this.e(en2);
                    }
                    if (this.B == 1) {
                        this.d(en2);
                    }
                    if (this.B != 2) break;
                    this.x(en2);
                    break;
                }
                case 24: {
                    this.h(en2);
                    break;
                }
                case 23: {
                    this.i(en2);
                    break;
                }
                case 0: {
                    if (this.B == 0) {
                        this.E(en2);
                    }
                    if (this.B == 1) {
                        this.x(en2);
                    }
                    if (this.B == 2) {
                        this.j(en2);
                    }
                    if (this.B == 3) {
                        if (this.D.length == 4) {
                            this.g(en2);
                        } else {
                            this.u(en2);
                        }
                    }
                    if (this.B != 4) break;
                    this.g(en2);
                    break;
                }
                case 2: {
                    if (this.B == 0) {
                        this.o(en2);
                    }
                    if (this.B != 1) break;
                    this.x(en2);
                    break;
                }
                case 3: {
                    this.m(en2);
                    break;
                }
                case 26: {
                    this.l(en2);
                    break;
                }
                case 1: {
                    this.c(en2);
                    break;
                }
                case 25: {
                    this.n(en2);
                    break;
                }
                case 4: {
                    this.D(en2);
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    this.x(en2);
                    break;
                }
                case 17: {
                    this.c(en2);
                    break;
                }
                case 8: {
                    this.p(en2);
                    break;
                }
                case 10: {
                    this.t(en2);
                    break;
                }
                case 11: {
                    this.s(en2);
                    break;
                }
                case 16: {
                    this.r(en2);
                    break;
                }
                case 15: {
                    this.b(en2);
                    break;
                }
                case 12: {
                    if (this.B == 0) {
                        this.w(en2);
                    }
                    if (this.B != 1) break;
                    this.x(en2);
                    break;
                }
                case 13: {
                    if (this.B == 0) {
                        if (this.equals(main.a.G)) {
                            this.x(en2);
                        } else {
                            this.a(en2, false);
                        }
                    }
                    if (this.B == 1) {
                        this.a(en2, true);
                    }
                    if (this.B != 2) break;
                    this.a(en2, false);
                    break;
                }
                case 14: {
                    this.k(en2);
                    break;
                }
                case 18: {
                    this.q(en2);
                    break;
                }
                case 19: {
                    this.F(en2);
                    break;
                }
                case 20: {
                    this.G(en2);
                }
            }
            p.c(en2);
            en3 = en2;
            object4 = this;
            if (((g)object4).ai != null && ((g)object4).ai.d != null) {
                ((g)object4).ai.a(en3);
                int n10 = ((g)object4).ai.e + 13;
                n2 = ((g)object4).ai.f + 11;
                if (((g)object4).A == 15) {
                    n10 += 5;
                    n2 += 26;
                }
                if (((g)object4).A == 0 && ((g)object4).B == 3) {
                    if (((g)object4).al) {
                        n10 -= 5;
                    } else if (((g)object4).bL != null || ((g)object4).cH != null) {
                        n10 = ((g)object4).ai.e + 21;
                        n2 = ((g)object4).ai.f + 40;
                    }
                }
                if (((g)object4).bL != null) {
                    object2 = p.x[((g)object4).bL[0]];
                    object3 = p.x[((g)object4).bL[1]];
                    object = p.x[((g)object4).bL[2]];
                    bl.b(en3, ((av)object2).a[af.bC[0][0][0]].a, n10 + af.bC[0][0][1] + ((av)object2).a[af.bC[0][0][0]].b, n2 - af.bC[0][0][2] + ((av)object2).a[af.bC[0][0][0]].c, 0, 0);
                    bl.b(en3, ((av)object3).a[af.bC[0][1][0]].a, n10 + af.bC[0][1][1] + ((av)object3).a[af.bC[0][1][0]].b, n2 - af.bC[0][1][2] + ((av)object3).a[af.bC[0][1][0]].c, 0, 0);
                    bl.b(en3, ((av)object).a[af.bC[0][2][0]].a, n10 + af.bC[0][2][1] + ((av)object).a[af.bC[0][2][0]].b, n2 - af.bC[0][2][2] + ((av)object).a[af.bC[0][2][0]].c, 0, 0);
                } else if (((g)object4).cH != null) {
                    ((g)object4).cH.a(en3, n10 + 5, n2 + 25, 1, 0, true);
                } else if (((g)object4).bK != -1) {
                    bl.b(en3, ((g)object4).bK, ((g)object4).ai.e + 8, ((g)object4).ai.f + 2, 0, 20);
                }
                if (((g)object4).bC != null && ((g)object4).bC.b.b != 5) {
                    if (((g)object4).bC.A > 0) {
                        en3.a(aU, n10 - 7, n2 + 13, 3);
                        di.h.a(en3, String.valueOf(ds.g(((g)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    } else if (((g)object4).bC.A < 0 && ((g)object4).bC.A != -1) {
                        en3.a(aV, n10 - 7, n2 + 13, 3);
                        di.a.a(en3, String.valueOf(ds.g(((g)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    }
                }
            }
            if (this.h == this.aK && !main.a.F.a) {
                this.aa.a(en2);
            }
            if (this.j != null && this.j.k) {
                en3 = en2;
                object4 = this.j;
                ((dr)object4).a(en3);
            }
        }
    }

    private void c(en en2) {
        try {
            if (this.A == 1 && this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2) {
                this.x(en2);
                return;
            }
            en2.a(0xFF0000);
            en2.e(this.ae, this.af, this.ag, this.ah);
            if (this.bJ == 2 && this.equals(main.a.G)) {
                if (this.B <= 3 && main.a.e) {
                    if (this.g < -50) {
                        main.a.a(this.ae + this.ag / 2, this.af + 30, en2);
                    } else if (this.g < 0) {
                        di.o.a(en2, aw.fQ, this.ae + this.ag / 2, this.af + 15, 2);
                    } else if (this.aI >= 0) {
                        if (this.g > this.aI + 50) {
                            main.a.a(this.ae + this.ag / 2, this.af + this.ah - 30, en2);
                        } else if (this.g > this.aI) {
                            di.o.a(en2, aw.fR, this.ae + this.ag / 2, this.af + this.ah - 25, 2);
                        }
                    }
                }
                if (af.e().aJ[this.B].length == 0 && this.A != 17) {
                    di.o.a(en2, aw.fS, this.ae + this.ag / 2, this.af + this.ah / 2 - 10, 2);
                    return;
                }
            }
            en2.a(0, -this.g);
            h[] hArray = af.e().aJ[this.B];
            if (this.bJ == 2 && (this.B == 4 || this.A == 17) && (hArray = af.e().aJ[4]).length == 0) {
                di.o.a(en2, aw.fS, this.ae + this.ag / 2, this.af + this.ah / 2 - 10, 2);
                return;
            }
            int n2 = hArray.length;
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.ae + 26;
                int n5 = this.af + n3 * this.aD;
                int n6 = this.ag - 26;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.af + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                    en2.a(n3 == this.ak ? 16383818 : 15196114);
                    en2.b(n4, n5, n6, n7);
                    en2.a(n3 == this.ak ? 9541120 : 9993045);
                    en2.b(n8, n9, 24, n10);
                    h h2 = hArray[n3];
                    if (h2 != null) {
                        Object object = "";
                        di di2 = di.m;
                        if (h2.B != 0 && this.bJ == 2 && this.B <= 3 && !this.equals(main.a.H) && h2.b.d.length() < 20) {
                            di2 = di.h;
                        }
                        if (h2.a != null) {
                            int n11 = 0;
                            while (n11 < h2.a.length) {
                                if (h2.a[n11].c.a == 72) {
                                    object = " [+" + h2.a[n11].a + "]";
                                }
                                if (h2.a[n11].c.a == 41) {
                                    if (h2.a[n11].a == 1) {
                                        di2 = g.h(0);
                                    } else if (h2.a[n11].a == 2) {
                                        di2 = g.h(2);
                                    } else if (h2.a[n11].a == 3) {
                                        di2 = g.h(8);
                                    } else if (h2.a[n11].a == 4) {
                                        di2 = g.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.a != null && h2.a.length > 0) {
                            if (h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = di.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = di.p;
                            }
                            if (this.bJ == 2 && h2.a.length > 1 && h2.v != -1) {
                                string = String.valueOf(string);
                            }
                            if (this.bJ != 2 || this.bJ == 2 && h2.v <= 1) {
                                ((di)object).a(en2, string, n4 + 5, n5 + 11, 0);
                            }
                        }
                        if (h2.s > 0) {
                            bl.b(en2, h2.u, n4 + n6 - 7, n5 + 9, 0, 3);
                            di.b.a(en2, ds.a((long)h2.s), n4 + n6 - 15, n5 + 1, 1);
                        }
                        if (h2.n != 0 || h2.p != 0) {
                            if (this.bJ != 2 && h2.j == 0L) {
                                if (h2.n > 0 && h2.p > 0) {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di.d.a(en2, ds.a((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.p > 0) {
                                        en2.a(y, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        di.h.a(en2, ds.a((long)h2.p), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di.d.a(en2, ds.a((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.p > 0) {
                                        en2.a(y, n4 + n6 - 7, n5 + 7, 3);
                                        di.h.a(en2, ds.a((long)h2.p), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                }
                            }
                            if (this.bJ == 2 && this.B <= 3 && !this.equals(main.a.H)) {
                                if (h2.n > 0 && h2.p > 0) {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = af.e().at < (long)h2.n ? di.a : di.d;
                                        di2.a(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.p > 0) {
                                        en2.a(y, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        di2 = af.e().av < h2.p ? di.a : di.h;
                                        di2.a(en2, ds.b((long)h2.p), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (h2.n > 0) {
                                        en2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = af.e().at < (long)h2.n ? di.a : di.d;
                                        di2.a(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (h2.p > 0) {
                                        en2.a(y, n4 + n6 - 7, n5 + 7, 3);
                                        di2 = af.e().av < h2.p ? di.a : di.h;
                                        di2.a(en2, ds.b((long)h2.p), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    try {
                                        di2 = di.h;
                                        if (!af.e().ag.equals(h2.H)) {
                                            di2 = di.h;
                                        }
                                        di2.a(en2, h2.H, n4 + n6, n5 + 1 + di.a.a(), 1);
                                    }
                                    catch (Exception exception) {}
                                }
                            }
                        }
                        bl.b(en2, h2.b.f, n8 + 12, n9 + n10 / 2, 0, 3);
                        if (h2.h > 1) {
                            di.n.a(en2, "" + h2.h, n8 + 24, n9 + n10 - di.n.a(), 1);
                        }
                        if (h2.C && main.a.w % 10 > 5) {
                            en2.a(v, n8 + 12, n5 + 19, 3);
                        }
                    }
                    if (this.bJ == 2 && (this.equals(main.a.H) || this.B == 4) && h2.v != 0) {
                        if (h2.v == 1) {
                            di.r.a(en2, aw.fM, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.a(w, n4 + n6 - 7, n5 + 19, 3);
                                di.d.a(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 13, 1);
                            } else if (h2.p != -1) {
                                en2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                di.a.a(en2, ds.b((long)h2.p), n4 + n6 - 15, n5 + 11, 1);
                            }
                        } else if (h2.v == 2) {
                            di.b.a(en2, aw.fN, n4 + n6 - 5, n5 + 1, 1);
                            if (h2.n != -1) {
                                en2.a(w, n4 + n6 - 7, n5 + 17, 3);
                                di.d.a(en2, ds.b((long)h2.n), n4 + n6 - 15, n5 + 11, 1);
                            } else if (h2.p != -1) {
                                en2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                di.a.a(en2, ds.b((long)h2.p), n4 + n6 - 15, n5 + 11, 1);
                            }
                        }
                    }
                    this.cn = 7;
                }
                ++n3;
            }
            this.cn = 8;
            this.f(en2);
            this.cn = 9;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("tt >>:" + this.cn);
            return;
        }
    }

    private void d(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.cm.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                di.f.a(en2, this.cm[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void e(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        h[] hArray = af.f().aH;
        bf[] bfArray = af.f().aI;
        int n2 = 0;
        while (n2 < hArray.length + bfArray.length) {
            int n3 = n2 < hArray.length ? 1 : 0;
            int n4 = n2;
            int n5 = n2 - hArray.length;
            int n6 = this.ae + 36;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 36;
            int n9 = this.aD - 1;
            int n10 = this.ae;
            int n11 = this.af + n2 * this.aD;
            int n12 = this.aD - 1;
            if (n7 - this.g <= this.af + this.ah && n7 - this.g >= this.af - this.aD) {
                int n13;
                h h2;
                h h3 = h2 = n3 != 0 ? hArray[n4] : null;
                en2.a(n2 == this.ak ? 16383818 : (n3 != 0 ? 15196114 : 15723751));
                en2.b(n6, n7, n8, n9);
                en2.a(n2 == this.ak ? 9541120 : (n3 != 0 ? 9993045 : 11837316));
                if (h2 != null) {
                    n8 = 0;
                    while (n8 < h2.a.length) {
                        if (h2.a[n8].c.a == 72 && h2.a[n8].a > 0) {
                            byte by2 = g.g(h2.a[n8].a);
                            n9 = by2;
                            n13 = g.f(by2);
                            if (n13 != -1) {
                                en2.a(g.f(n9));
                            }
                        }
                        ++n8;
                    }
                }
                en2.b(n10, n11, 34, n12);
                if (h2 != null && h2.f && main.a.G.A == 12) {
                    en2.a(n2 == this.ak ? 7040779 : 6047789);
                    en2.b(n10, n11, 34, n12);
                }
                if (h2 != null) {
                    String string = "";
                    di di2 = di.m;
                    if (h2.a != null) {
                        n13 = 0;
                        while (n13 < h2.a.length) {
                            if (h2.a[n13].c.a == 72) {
                                string = " [+" + h2.a[n13].a + "]";
                            }
                            if (h2.a[n13].c.a == 41) {
                                if (h2.a[n13].a == 1) {
                                    di2 = g.h(0);
                                } else if (h2.a[n13].a == 2) {
                                    di2 = g.h(2);
                                } else if (h2.a[n13].a == 3) {
                                    di2 = g.h(8);
                                } else if (h2.a[n13].a == 4) {
                                    di2 = g.h(7);
                                }
                            }
                            ++n13;
                        }
                    }
                    di2.a(en2, String.valueOf(h2.b.d) + string, n6 + 5, n7 + 1, 0);
                    String string2 = "";
                    if (h2.a != null) {
                        if (h2.a.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                            string2 = String.valueOf(string2) + h2.a[0].a();
                        }
                        di di3 = di.q;
                        if (h2.A < 0 && h2.b.b != 5) {
                            di3 = di.p;
                        }
                        if (h2.a.length > 1) {
                            n5 = 1;
                            while (n5 < 2) {
                                if (h2.a[n5] != null && h2.a[n5].c.a != 102 && h2.a[n5].c.a != 107) {
                                    string2 = String.valueOf(string2) + "," + h2.a[n5].a();
                                }
                                ++n5;
                            }
                        }
                        di3.a(en2, string2, n6 + 5, n7 + 11, 0);
                    }
                    bl.b(en2, h2.b.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    if (h2.a != null) {
                        n3 = 0;
                        while (n3 < h2.a.length) {
                            this.a(en2, h2.a[n3].c.a, n10, n11, n12);
                            ++n3;
                        }
                        n3 = 0;
                        while (n3 < h2.a.length) {
                            g.a(en2, h2.a[n3].c.a, h2.a[n3].a, n10, n11, 34, n12);
                            ++n3;
                        }
                    }
                    if (h2.h > 1) {
                        di.n.a(en2, "" + h2.h, n10 + 34, n11 + n12 - di.n.a(), 1);
                    }
                } else if (n3 == 0) {
                    bf bf2 = bfArray[n5];
                    en2.a(p.au, n10 + 17, n11 + n12 / 2, 3);
                    if (bf2.a != null) {
                        di.q.a(en2, bf2.a.b, n6 + 5, n7 + 1, 0);
                        di.m.a(en2, String.valueOf(aw.do) + ": " + bf2.c, n6 + 5, n7 + 11, 0);
                        bl.b(en2, bf2.a.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    } else {
                        di.m.a(en2, bf2.l, n6 + 5, n7 + 5, 0);
                        bl.b(en2, p.y[98].a[0].c, n10 + 17, n11 + n12 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void f(en en2) {
        en2.a(-en2.a(), -en2.b());
        if (this.g > 24 && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
        }
        if (this.g < this.aI && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            en2.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 8, 0);
        }
    }

    private void g(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < G.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                di.f.a(en2, G[n2], this.ae + this.ag / 2, n4 + 6, 2);
                if (G[n2].equals(aw.bS)) {
                    n5 = 0;
                    while (n5 < at.size()) {
                        ba ba2 = (ba)at.elementAt(n5);
                        if (!ba2.d) {
                            if (main.a.w % 20 <= 10) break;
                            en2.a(v, n3 + 10, n4 + 10, 3);
                            break;
                        }
                        ++n5;
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void h(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < cF.length) {
            int n3 = this.af + n2 * 15;
            if (n3 - this.g <= this.af + this.ah && n3 - this.g >= this.af - this.aD) {
                di.f.a(en2, cF[n2], this.ae + 5, n3 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void i(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < at.size()) {
            ba ba2 = (ba)at.elementAt(n2);
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                di.f.a(en2, ba2.a, this.ae + this.ag / 2, n4 + 6, 2);
                if (!ba2.d && main.a.w % 20 > 10) {
                    en2.a(v, n3 + 10, n4 + 10, 3);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void j(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = af.e().ax.b.length;
        int n3 = 0;
        while (n3 < n2 + 6) {
            int n4 = this.ae + 30;
            int n5 = this.af + n3 * this.aD;
            int n6 = this.ag - 30;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.af + n3 * this.aD;
            if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                en2.a(n3 == this.ak ? 16383818 : 15196114);
                if (n3 == 5) {
                    en2.a(n3 == this.ak ? 16776068 : 16765060);
                }
                en2.d(n4, n5, n6, n7);
                en2.a(p.au, n8, n9, 0);
                if (n3 == 0) {
                    bl.b(en2, 567, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(aw.eX) + " " + aw.el + ": " + ai.a((long)af.e().cr);
                    di.b.a(en2, string, n4 + 5, n5 + 3, 0);
                    di.m.a(en2, String.valueOf(ai.a((long)(af.e().cr + 1000))) + " " + aw.fi + ": " + aw.eI + " " + af.e().cx, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 1) {
                    bl.b(en2, 569, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(aw.eY) + " " + aw.el + ": " + ai.a((long)af.e().cs);
                    di.b.a(en2, string, n4 + 5, n5 + 3, 0);
                    di.m.a(en2, String.valueOf(ai.a((long)(af.e().cs + 1000))) + " " + aw.fi + ": " + aw.eI + " " + af.e().cy, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 2) {
                    bl.b(en2, 568, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(aw.eZ) + " " + aw.el + ": " + ai.a((long)af.e().cq);
                    di.b.a(en2, string, n4 + 5, n5 + 3, 0);
                    di.m.a(en2, String.valueOf(ai.a((long)(af.e().cq * 100))) + " " + aw.fi + ": " + aw.eI + " " + af.e().cz, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 3) {
                    bl.b(en2, 721, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(aw.fa) + " " + aw.el + ": " + ai.a((long)af.e().ct);
                    di.b.a(en2, string, n4 + 5, n5 + 3, 0);
                    di.m.a(en2, String.valueOf(ai.a((long)(500000 + af.e().ct * 100000))) + " " + aw.fi + ": " + aw.eI + " " + af.e().cA, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 4) {
                    bl.b(en2, 719, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(aw.fc) + " " + aw.el + ": " + af.e().cu + "%";
                    int n10 = af.e().cu;
                    if (n10 > co.length - 1) {
                        n10 = co.length - 1;
                    }
                    long l2 = co[n10];
                    di.b.a(en2, string, n4 + 5, n5 + 3, 0);
                    long l3 = l2;
                    di.m.a(en2, String.valueOf(ds.b(l3)) + " " + aw.fi + ": " + aw.eI + " " + af.e().cB, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 5) {
                    if (p != null) {
                        bl.b(en2, q, n8 + 4, n9 + 4, 0, 0);
                        String[] stringArray = di.k.a(p, 120);
                        int n11 = 0;
                        while (n11 < stringArray.length) {
                            di.m.a(en2, stringArray[n11], n4 + 5, n5 + 3 + n11 * 12, 0);
                            ++n11;
                        }
                    } else {
                        di.m.a(en2, "", n4 + 5, n5 + 9, 0);
                    }
                }
                if (n3 >= 6) {
                    n7 = n3 - 6;
                    et et2 = af.e().ax.b[n7];
                    bl.b(en2, et2.f, n8 + 4, n9 + 4, 0, 0);
                    bf bf2 = af.e().a(et2);
                    if (bf2 != null) {
                        di.b.a(en2, et2.b, n4 + 5, n5 + 3, 0);
                        di.q.a(en2, String.valueOf(aw.do) + ": " + bf2.c, n4 + n6 - 5, n5 + 3, 1);
                        if (bf2.c == et2.c) {
                            di.m.a(en2, aw.fg, n4 + 5, n5 + 15, 0);
                        } else if (bf2.a.c()) {
                            String string;
                            String string2 = String.valueOf(aw.c) + ": ";
                            int n12 = di.m.a(string2) + n4 + 5;
                            int n13 = n5 + 15;
                            di.m.a(en2, string2, n4 + 5, n13, 0);
                            StringBuffer stringBuffer = new StringBuffer("(");
                            bf bf3 = bf2;
                            if (bf3.m / 10 >= 100) {
                                string = "MAX";
                            } else if (bf3.m % 10 == 0) {
                                string = String.valueOf(bf3.m / 10) + "%";
                            } else {
                                n7 = bf3.m % 10;
                                string = String.valueOf(bf3.m / 10) + "." + n7 % 10 + "%";
                            }
                            di.m.a(en2, stringBuffer.append(string).append(")").toString(), n4 + n6 - 5, n13, 1);
                            en2.a(7169134);
                            en2.d(n12, n13 += 4, 50, 5);
                            n4 = bf2.m * 50 / 1000;
                            en2.a(11992374);
                            en2.d(n12, n13, n4, 5);
                        } else {
                            bf bf4 = et2.h[bf2.c];
                            di.m.a(en2, String.valueOf(aw.do) + " " + (bf2.c + 1) + " " + aw.em + " " + ds.b(bf4.d) + " " + aw.fi, n4 + 5, n5 + 15, 0);
                        }
                    } else {
                        bf bf5 = et2.h[0];
                        String string = String.valueOf(aw.en) + " " + ds.b(bf5.d) + " " + aw.eF;
                        if (bf5.a.a == 24 || bf5.a.a == 25 || bf5.a.a == 26) {
                            string = String.valueOf(aw.en) + " " + ds.b(bf5.d) + " " + aw.go;
                        }
                        di.h.a(en2, et2.b, n4 + 5, n5 + 3, 0);
                        di.m.a(en2, string, n4 + 5, n5 + 15, 0);
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void k(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.E.length) {
            int n3 = this.af + n2 * this.aD;
            int n4 = this.aD - 1;
            if (n3 - this.g <= this.af + this.ah && n3 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(this.ae, n3, this.ag, n4);
                di.b.a(en2, this.E[n2], 5, n3 + 1, 0);
                di.o.a(en2, this.F[n2], 5, n3 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void l(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        String[] stringArray = c.b;
        String[] stringArray2 = c.c;
        int n2 = 0;
        while (n2 < stringArray2.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                di.o.a(en2, String.valueOf(stringArray[n2]), n7 + 5, n4 + 6, 0);
                di.o.a(en2, stringArray2[n2], n3 + n5 - 2, n4 + 6, 1);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void m(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int[] nArray = p.j().S;
        int[] nArray2 = p.j().T;
        int n2 = 0;
        while (n2 < nArray2.length) {
            int n3 = this.ae + 36;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                en2.a(this.cp[nArray2[n2]]);
                en2.b(n7, n8, 34, n9);
                if (nArray[n2] != -1) {
                    if (nArray2[n2] != 1) {
                        di.n.a(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    } else {
                        di.o.a(en2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    }
                    di.m.a(en2, String.valueOf(p.j().U[n2]) + "/" + p.j().V[n2], n3 + 5, n4 + 6, 0);
                }
                if (p.j().Y[n2] != null) {
                    di.o.a(en2, String.valueOf(p.j().Y[n2]) + "(Top " + p.j().W[n2] + ")", n3 + n5 - 2, n4 + 1, 1);
                    di.o.a(en2, String.valueOf(p.j().Z[n2]) + "(Top " + p.j().X[n2] + ")", n3 + n5 - 2, n4 + 11, 1);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void n(en en2) {
        int n2;
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.af + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n7, n8, n9, n10);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n4, n5, 24, n6);
            bl.b(en2, af.e().aL[this.B][n2], n4 + 12, n5 + n6 / 2, 0, 3);
            String[] stringArray = di.o.a(af.e().aK[this.B][n2], 140);
            n5 = 0;
            while (n5 < stringArray.length) {
                di.o.a(en2, stringArray[n5], n7 + 5, n8 + 1 + n5 * 11, 0);
                ++n5;
            }
            ++n2;
        }
        this.f(en2);
    }

    private void o(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        try {
            h[] hArray = af.e().aG;
            this.O = this.i(hArray.length);
            int n2 = hArray.length / 20 + (hArray.length % 20 > 0 ? 1 : 0);
            this.aF = this.ag / n2;
            int n3 = 0;
            while (n3 < this.O) {
                int n4 = this.ae + 36;
                int n5 = this.af + n3 * this.aD;
                int n6 = this.ag - 36;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.af + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                    if (n3 == 0) {
                        n6 = 0;
                        while (n6 < n2) {
                            n7 = n6 == this.bO && this.ak == 0 ? (main.a.w % 10 < 7 ? -1 : 0) : 0;
                            en2.a(n6 == this.bO ? 16383818 : 15723751);
                            en2.d(this.ae + n6 * this.aF, n5 + 9 + n7, this.aF - 1, 14);
                            di.o.a(en2, "" + n6, this.ae + n6 * this.aF + this.aF / 2, this.af + 11 + n7, 2);
                            ++n6;
                        }
                    } else {
                        int n11;
                        en2.a(n3 == this.ak ? 16383818 : 15196114);
                        en2.d(n4, n5, n6, n7);
                        en2.a(n3 == this.ak ? 9541120 : 9993045);
                        n6 = g.c(n3, this.bO);
                        h h2 = hArray[n6];
                        if (h2 != null) {
                            n6 = 0;
                            while (n6 < h2.a.length) {
                                byte by2;
                                if (h2.a[n6].c.a == 72 && h2.a[n6].a > 0 && (n11 = g.f(by2 = g.g(h2.a[n6].a))) != -1) {
                                    en2.a(g.f(by2));
                                }
                                ++n6;
                            }
                        }
                        en2.b(n8, n9, 34, n10);
                        if (h2 != null) {
                            Object object = "";
                            di di2 = di.m;
                            if (h2.a != null) {
                                n11 = 0;
                                while (n11 < h2.a.length) {
                                    if (h2.a[n11].c.a == 72) {
                                        object = " [+" + h2.a[n11].a() + "]";
                                    }
                                    if (h2.a[n11].c.a == 41) {
                                        if (h2.a[n11].a == 1) {
                                            di2 = g.h(0);
                                        } else if (h2.a[n11].a == 2) {
                                            di2 = g.h(2);
                                        } else if (h2.a[n11].a == 3) {
                                            di2 = g.h(8);
                                        } else if (h2.a[n11].a == 4) {
                                            di2 = g.h(7);
                                        }
                                    }
                                    ++n11;
                                }
                            }
                            di2.a(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                            String string = "";
                            if (h2.a != null) {
                                if (h2.a.length > 0 && h2.a[0] != null) {
                                    string = String.valueOf(string) + h2.a[0].a();
                                }
                                object = di.q;
                                if (h2.A < 0 && h2.b.b != 5) {
                                    object = di.p;
                                }
                                if (h2.a.length > 1) {
                                    int n12 = 1;
                                    while (n12 < h2.a.length) {
                                        if (h2.a[n12] != null && h2.a[n12].c.a != 102 && h2.a[n12].c.a != 107) {
                                            string = String.valueOf(string) + "," + h2.a[n12].a();
                                        }
                                        ++n12;
                                    }
                                }
                                ((di)object).a(en2, string, n4 + 5, n5 + 11, 0);
                            }
                            bl.b(en2, h2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                            if (h2.a != null) {
                                int n13 = 0;
                                while (n13 < h2.a.length) {
                                    this.a(en2, h2.a[n13].c.a, n8, n9, n10);
                                    ++n13;
                                }
                                n13 = 0;
                                while (n13 < h2.a.length) {
                                    g.a(en2, h2.a[n13].c.a, h2.a[n13].a, n8, n9, 34, n10);
                                    ++n13;
                                }
                            }
                            if (h2.h > 1) {
                                di.n.a(en2, "" + h2.h, n8 + 34, n9 + n10 - di.n.a(), 1);
                            }
                        }
                    }
                }
                ++n3;
            }
        }
        catch (Exception exception) {}
        this.f(en2);
    }

    private e W() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > (this.Q != null ? this.Q.size() : this.R.size()) + 1) {
            return null;
        }
        if (this.Q != null) {
            return (e)this.Q.elementAt(this.ak - 2);
        }
        return (e)this.R.elementAt(this.ak - 2);
    }

    private cb X() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > cb.l.size() + 1) {
            return null;
        }
        return (cb)cb.l.elementAt(this.ak - 2);
    }

    private eh Y() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > this.P.length + 1) {
            return null;
        }
        return this.P[this.ak - 2];
    }

    private void p(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.bG.size() == 0) {
            di.m.a(en2, aw.ag, this.ae + this.ag / 2, this.af + this.ah / 2 - di.k.a() / 2 + 24, 2);
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            if (n2 == 0) {
                en2.a(15196114);
                en2.b(n3, n7, this.ag, n9);
                en2.a(n2 == this.ak ? p.az : p.ay, this.ae + this.ag - 5, n7 + 2, cj.b);
                (n2 == this.ak ? di.g : di.f).a(en2, this.au ? aw.fw : aw.fx, this.ae + this.ag - 22, n7 + 7, 2);
                di.o.a(en2, this.au ? aw.fz : aw.fA, this.ae + 5, n7 + n9 / 2 - 4, 0);
            } else {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n6, n7, n8, n9);
                en2.a(n2 == this.ak ? 9541120 : 9993045);
                en2.b(n3, n4, 24, n5);
                r r2 = (r)this.bG.elementAt(n2 - 1);
                if (r2.c.bT != -1) {
                    bl.b(en2, r2.c.bT, n3, n4, 0, 0);
                } else {
                    av av2 = p.x[r2.c.bU];
                    bl.b(en2, av2.a[af.bC[0][0][0]].a, n3 + av2.a[af.bC[0][0][0]].b, n4 + av2.a[af.bC[0][0][0]].c, 0, 0);
                }
                en2.e(this.ae, this.af + this.g, this.ag, this.ah);
                di di2 = di.g;
                di2.a(en2, r2.c.ag, n6 + 5, n7, 0);
                if (!r2.d) {
                    di.q.a(en2, ds.a(r2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                } else {
                    di.p.a(en2, ds.a(r2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void q(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 26;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 26;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                en2.a(n2 == this.ak ? 9541120 : 9993045);
                en2.b(n7, n8, 24, n9);
                h h2 = (h)this.Y.elementAt(n2);
                if (h2 != null) {
                    di.m.a(en2, h2.b.d, n3 + 5, n4 + 1, 0);
                    String string = "";
                    if (h2.a != null && h2.a.length > 0) {
                        if (h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                            string = String.valueOf(string) + h2.a[0].a();
                        }
                        di di2 = di.q;
                        di2.a(en2, string, n3 + 5, n4 + 11, 0);
                        bl.b(en2, h2.b.f, n7 + 12, n8 + n9 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void r(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            di.m.a(en2, aw.fE, this.ae + this.ag / 2, this.af + this.ah / 2 - di.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n6, n7, n8, n9);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n3, n4, 24, n5);
            r r2 = (r)this.X.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.b(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                av av2 = p.x[r2.c.bU];
                bl.b(en2, av2.a[af.bC[0][0][0]].a, n3 + av2.a[af.bC[0][0][0]].b, n4 + 3 + av2.a[af.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (r2.e) {
                di.h.a(en2, r2.c.ag, n6 + 5, n7, 0);
                di.q.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            } else {
                di.o.a(en2, r2.c.ag, n6 + 5, n7, 0);
                di.o.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void s(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            di.m.a(en2, aw.bP, this.ae + this.ag / 2, this.af + this.ah / 2 - di.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            en2.a(n2 == this.ak ? 16383818 : 15196114);
            en2.b(n6, n7, n8, n9);
            en2.a(n2 == this.ak ? 9541120 : 9993045);
            en2.b(n3, n4, 24, n5);
            r r2 = (r)this.T.elementAt(n2);
            if (r2.c.bT != -1) {
                bl.b(en2, r2.c.bT, n3, n4, 0, 0);
            } else {
                av av2 = p.x[r2.c.bU];
                bl.b(en2, av2.a[af.bC[0][0][0]].a, n3 + av2.a[af.bC[0][0][0]].b, n4 + 3 + av2.a[af.bC[0][0][0]].c, 0, 0);
            }
            en2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (r2.e) {
                di.h.a(en2, r2.c.ag, n6 + 5, n7, 0);
                di.q.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            } else {
                di.o.a(en2, r2.c.ag, n6 + 5, n7, 0);
                di.o.a(en2, r2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void t(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.S.size()) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                de de2 = (de)this.S.elementAt(n2);
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.b(n3, n4, n5, n6);
                if (de2.p.equals("")) {
                    di.f.a(en2, de2.b, this.ae + this.ag / 2, n4 + 6, 2);
                } else {
                    di.f.a(en2, de2.b, this.ae + this.ag / 2, n4 + 1, 2);
                    di.f.a(en2, de2.p, this.ae + this.ag / 2, n4 + 11, 2);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void u(en en2) {
        try {
            int n2;
            en2.e(this.ae, this.af, this.ag, this.ah);
            en2.a(-this.h, -this.g);
            en2.a(0);
            int n3 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
            if (this.O == 2) {
                di.m.a(en2, this.ao, this.ae + this.ag / 2, this.af + 24 + this.ah / 2 - di.k.a() / 2, 2);
                if (this.am && this.R.size() == 1) {
                    n2 = 0;
                    while (n2 < aw.ds.length) {
                        di.f.a(en2, aw.ds[n2], this.ae + this.ag / 2, this.af + 24 + this.ah / 2 - aw.ds.length * 12 / 2 + n2 * 12, 2);
                        ++n2;
                    }
                }
            }
            if (this.am) {
                this.O = cb.l.size() + 2;
            }
            n2 = 0;
            while (n2 < this.O) {
                int n4 = this.ae;
                int n5 = this.af + n2 * this.aD;
                int n6 = this.aD - 1;
                int n7 = this.ae + 24;
                int n8 = this.af + n2 * this.aD;
                int n9 = this.ag - 24;
                int n10 = this.aD - 1;
                if (n8 - this.g <= this.af + this.ah && n8 - this.g >= this.af - this.aD) {
                    if (n2 == 0) {
                        n6 = 0;
                        while (n6 < this.cg.length) {
                            en2.a(n6 == this.bN && n2 == this.ak ? 16383818 : 15723751);
                            en2.b(n3 + n6 * this.aE, n8, this.aE - 1, 23);
                            int n11 = 0;
                            while (n11 < this.cg[n6].length) {
                                di.o.a(en2, this.cg[n6][n11], n3 + n6 * this.aE + this.aE / 2, this.af + n11 * 11, 2);
                                ++n11;
                            }
                            ++n6;
                        }
                    } else if (n2 == 1) {
                        en2.a(n2 == this.ak ? 16383818 : 15196114);
                        en2.b(this.ae, n8, this.ag, n10);
                        if (this.ch != null) {
                            di.f.a(en2, this.ch, this.ae + this.ag / 2, n8 + 6, 2);
                        }
                    } else if (this.al) {
                        if (this.P != null && this.P.length != 0) {
                            en2.a(n2 == this.ak ? 16383818 : 15196114);
                            en2.b(n7, n8, n9, n10);
                            en2.a(n2 == this.ak ? 9541120 : 9993045);
                            en2.b(n4, n5, 24, n6);
                            if (ak.a(this.P[n2 - 2].b)) {
                                if (ak.a((short)((short)this.P[n2 - 2].b)).c != null) {
                                    bl.a(en2, ak.a((short)((short)this.P[n2 - 2].b)).c[0], n4 + 12, n5 + n6 / 2, 0, cj.f);
                                }
                            } else {
                                ak ak2 = new ak();
                                new ak().a = this.P[n2 - 2].b;
                                if (!ak.a(ak2.a)) {
                                    ak.a(ak2);
                                }
                            }
                            String string = this.P[n2 - 2].c.length() > 17 ? String.valueOf(this.P[n2 - 2].c.substring(0, 17)) + "..." : this.P[n2 - 2].c;
                            di.g.a(en2, string, n7 + 5, n8, 0);
                            di.q.a(en2, this.P[n2 - 2].d, n7 + 5, n8 + 11, 0);
                            di.m.a(en2, String.valueOf(this.P[n2 - 2].g) + "/" + this.P[n2 - 2].h, n7 + n9 - 5, n8, 1);
                        }
                    } else if (this.an) {
                        e e2;
                        en2.a(n2 == this.ak ? 16383818 : 15196114);
                        en2.b(n7, n8, n9, n10);
                        en2.a(n2 == this.ak ? 9541120 : 9993045);
                        en2.b(n4, n5, 24, n6);
                        if ((e2 = this.Q != null ? (e)this.Q.elementAt((int)(n2 - 2)) : (e)this.R.elementAt((int)(n2 - 2))).c != -1) {
                            bl.b(en2, e2.c, n4, n5, 0, 0);
                        } else {
                            av av2 = p.x[e2.b];
                            bl.b(en2, av2.a[af.bC[0][0][0]].a, n4 + av2.a[af.bC[0][0][0]].b, n5 + 3 + av2.a[af.bC[0][0][0]].c, 0, 0);
                        }
                        en2.e(this.ae, this.af + this.g, this.ag, this.ah);
                        di di2 = di.f;
                        if (e2.g == 0) {
                            di2 = di.a;
                        } else if (e2.g == 1) {
                            di2 = di.h;
                        } else if (e2.g == 2) {
                            di2 = di.g;
                        }
                        di2.a(en2, e2.f, n7 + 5, n8, 0);
                        di.q.a(en2, String.valueOf(aw.da) + ": " + e2.h, n7 + 5, n8 + 11, 0);
                        bl.b(en2, 7223, n7 + n9 - 7, n8 + 12, 0, 3);
                        di.m.a(en2, "" + e2.l, n7 + n9 - 15, n8 + 6, 1);
                    } else if (this.am && cb.l.size() != 0) {
                        cb cb2 = (cb)cb.l.elementAt(n2 - 2);
                        en2.a(n2 == this.ak && cb2.k == null ? 16383818 : 15196114);
                        en2.b(n4, n5, n9 + 24, n10);
                        cb2.a(en2, n4, n5);
                        if (cb2.k != null) {
                            int n12 = this.ae + this.ag - 2 - cb2.k.length * 40;
                            n4 = 0;
                            while (n4 < cb2.k.length) {
                                if (n4 == this.bN && n2 == this.ak) {
                                    en2.a(p.az, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    di.g.a(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                } else {
                                    en2.a(p.ay, n12 + n4 * 40 + 20, n8 + n10 / 2, cj.f);
                                    di.f.a(en2, cb2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                }
                                ++n4;
                            }
                        }
                    }
                }
                ++n2;
            }
            this.f(en2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void v(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        en2.a(0);
        if (this.O == 0) {
            di.m.a(en2, aw.fr, this.ae + this.ag / 2, this.af + this.ah / 2 - di.k.a() / 2, 2);
            return;
        }
        if (af.e().aE == null) {
            return;
        }
        if (af.e().aE.length != this.O) {
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            ao ao2 = af.e().aE[n2];
            en2.a(n2 == this.ak && (!ao2.e && !ao2.d || ao2.e && ao2.d) ? 16383818 : 15196114);
            en2.b(n3, n4, n5, n6);
            if (ao2 != null) {
                if (!ao2.d) {
                    di.k.a(en2, ao2.a, n3 + 5, n4, 0);
                    di.r.a(en2, String.valueOf(ao2.c) + " " + aw.bF, n3 + n5 - 5, n4, 1);
                    di.p.a(en2, ao2.b, n3 + 5, n4 + 11, 0);
                } else if (ao2.d && !ao2.e) {
                    di.k.a(en2, ao2.a, n3 + 5, n4, 0);
                    di.q.a(en2, String.valueOf(aw.fs) + ao2.c + " " + aw.bF, n3 + 5, n4 + 11, 0);
                    if (n2 == this.ak) {
                        di.g.a(en2, aw.co, n3 + n5 - 20, n4 + 6, 2);
                        di.f.a(en2, aw.co, n3 + n5 - 20, n4 + 6, 2);
                    } else {
                        en2.a(p.ay, n3 + n5 - 20, n4 + n6 / 2, cj.f);
                        di.f.a(en2, aw.co, n3 + n5 - 20, n4 + 6, 2);
                    }
                } else if (ao2.d && ao2.e) {
                    di.r.a(en2, ao2.a, n3 + 5, n4, 0);
                    di.r.a(en2, ao2.b, n3 + 5, n4 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(en2);
    }

    private void w(en en2) {
        en2.a(0xFF0000);
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        if (this.k.size() == 0) {
            if (this.ap != null) {
                int n2 = 0;
                while (n2 < this.ap.length) {
                    di.f.a(en2, this.ap[n2], this.ae + this.ag / 2, this.af + this.ah / 2 - this.ap.length * 14 / 2 + n2 * 14 + 5, 2);
                    ++n2;
                }
            }
            return;
        }
        int n3 = 0;
        while (n3 < this.k.size() + 1) {
            int n4 = this.ae + 36;
            int n5 = this.af + n3 * this.aD;
            int n6 = this.ag - 36;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.af + n3 * this.aD;
            int n10 = this.aD - 1;
            if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                if (n3 == this.k.size()) {
                    if (this.k.size() > 0) {
                        if (!main.a.e && n3 == this.ak) {
                            en2.a(16383818);
                            en2.b(n8, n5, this.ag, n7 + 2);
                        }
                        if (n3 == this.ak && this.cc == 1 || !main.a.e && n3 == this.ak) {
                            en2.a(p.ax, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            di.g.a(en2, aw.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        } else {
                            en2.a(p.aw, this.ae + this.ag / 2, n5 + n7 / 2 + 1, cj.f);
                            di.f.a(en2, aw.cy, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        }
                    }
                } else {
                    int n11;
                    en2.a(n3 == this.ak ? 16383818 : 15196114);
                    en2.b(n4, n5, n6, n7);
                    en2.a(n3 == this.ak ? 9541120 : 9993045);
                    h h2 = (h)this.k.elementAt(n3);
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.a.length) {
                            byte by2;
                            if (h2.a[n7].c.a == 72 && h2.a[n7].a > 0 && (n11 = g.f(by2 = g.g(h2.a[n7].a))) != -1) {
                                en2.a(g.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.b(n8, n9, 34, n10);
                    if (h2 != null) {
                        Object object = "";
                        di di2 = di.m;
                        if (h2.a != null) {
                            n11 = 0;
                            while (n11 < h2.a.length) {
                                if (h2.a[n11].c.a == 72) {
                                    object = " [+" + h2.a[n11].a + "]";
                                }
                                if (h2.a[n11].c.a == 41) {
                                    if (h2.a[n11].a == 1) {
                                        di2 = g.h(0);
                                    } else if (h2.a[n11].a == 2) {
                                        di2 = g.h(2);
                                    } else if (h2.a[n11].a == 3) {
                                        di2 = g.h(8);
                                    } else if (h2.a[n11].a == 4) {
                                        di2 = g.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.a.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = di.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = di.p;
                            }
                            if (h2.a.length > 1) {
                                int n12 = 1;
                                while (n12 < h2.a.length) {
                                    if (h2.a[n12] != null && h2.a[n12].c.a != 102 && h2.a[n12].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n12].a();
                                    }
                                    ++n12;
                                }
                            }
                            ((di)object).a(en2, string, n4 + 5, n5 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                        if (h2.a != null) {
                            int n13 = 0;
                            while (n13 < h2.a.length) {
                                this.a(en2, h2.a[n13].c.a, n8, n9, n10);
                                ++n13;
                            }
                            n13 = 0;
                            while (n13 < h2.a.length) {
                                g.a(en2, h2.a[n13].c.a, h2.a[n13].a, n8, n9, 34, n10);
                                ++n13;
                            }
                        }
                        if (h2.h > 1) {
                            di.n.a(en2, "" + h2.h, n8 + 34, n9 + n10 - di.n.a(), 1);
                        }
                    }
                }
            }
            ++n3;
        }
        this.f(en2);
    }

    private void x(en en2) {
        int n2;
        int n3;
        en2.a(0xFF0000);
        h[] hArray = af.e().aH;
        h[] hArray2 = af.e().aF;
        this.O = this.i(hArray.length + hArray2.length);
        int n4 = (hArray.length + hArray2.length) / 20 + ((hArray.length + hArray2.length) % 20 > 0 ? 1 : 0);
        this.aF = this.ag / n4;
        int n5 = 0;
        while (n5 < n4) {
            n3 = n5 == this.bO && this.ak == 0 ? (main.a.w % 10 < 7 ? -1 : 0) : 0;
            en2.a(n5 == this.bO ? 16383818 : 15723751);
            en2.d(this.ae + n5 * this.aF, n3 + 89 - 10, this.aF - 1, 21);
            if (n5 == this.bO) {
                en2.a(13524492);
                n2 = this.ae + n5 * this.aF;
                int n6 = n3 + 89 - 10 + 21;
                en2.d(n2, n6 - 3, this.aF - 1, 3);
            }
            di.o.a(en2, "" + (n5 + 1), this.ae + n5 * this.aF + this.aF / 2, n3 + 91 - 10, 2);
            ++n5;
        }
        en2.e(this.ae, this.af + 21, this.ag, this.ah - 21);
        en2.a(0, -this.g);
        try {
            n5 = 1;
            while (n5 < this.O) {
                n3 = this.ae + 36;
                n2 = this.af + n5 * this.aD;
                int n7 = this.ag - 36;
                int n8 = this.aD - 1;
                int n9 = this.ae;
                int n10 = this.af + n5 * this.aD;
                int n11 = this.aD - 1;
                if (n2 - this.g <= this.af + this.ah && n2 - this.g >= this.af - this.aD) {
                    byte by2 = g.a(n5, this.bO, af.e().aH);
                    int n12 = g.c(n5, this.bO);
                    int n13 = g.b(n5, this.bO, af.e().aH);
                    en2.a(n5 == this.ak ? 16383818 : (by2 != 0 ? 15196114 : 15723751));
                    en2.b(n3, n2, n7, n8);
                    en2.a(n5 == this.ak ? 9541120 : (by2 != 0 ? 9993045 : 11837316));
                    h h2 = by2 != 0 ? hArray[n12] : hArray2[n13];
                    if (h2 != null) {
                        n7 = 0;
                        while (n7 < h2.a.length) {
                            if (h2.a[n7].c.a == 72 && h2.a[n7].a > 0 && (n12 = g.f(by2 = g.g(h2.a[n7].a))) != -1) {
                                en2.a(g.f(by2));
                            }
                            ++n7;
                        }
                    }
                    en2.b(n9, n10, 34, n11);
                    if (h2 != null && h2.f && main.a.G.A == 12) {
                        en2.a(n5 == this.ak ? 7040779 : 6047789);
                        en2.b(n9, n10, 34, n11);
                    }
                    if (h2 != null) {
                        Object object = "";
                        di di2 = di.m;
                        if (h2.a != null) {
                            n12 = 0;
                            while (n12 < h2.a.length) {
                                if (h2.a[n12].c.a == 72) {
                                    object = " [+" + h2.a[n12].a + "]";
                                }
                                if (h2.a[n12].c.a == 41) {
                                    if (h2.a[n12].a == 1) {
                                        di2 = g.h(0);
                                    } else if (h2.a[n12].a == 2) {
                                        di2 = g.h(2);
                                    } else if (h2.a[n12].a == 3) {
                                        di2 = g.h(8);
                                    } else if (h2.a[n12].a == 4) {
                                        di2 = g.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        di2.a(en2, String.valueOf(h2.b.d) + (String)object, n3 + 5, n2 + 1, 0);
                        String string = "";
                        if (h2.a != null) {
                            if (h2.a.length > 0 && h2.a[0] != null && h2.a[0].c.a != 102 && h2.a[0].c.a != 107) {
                                string = String.valueOf(string) + h2.a[0].a();
                            }
                            object = di.q;
                            if (h2.A < 0 && h2.b.b != 5) {
                                object = di.p;
                            }
                            if (h2.a.length > 1) {
                                int n14 = 1;
                                while (n14 < 2) {
                                    if (h2.a[n14] != null && h2.a[n14].c.a != 102 && h2.a[n14].c.a != 107) {
                                        string = String.valueOf(string) + "," + h2.a[n14].a();
                                    }
                                    ++n14;
                                }
                            }
                            ((di)object).a(en2, string, n3 + 5, n2 + 11, 0);
                        }
                        bl.b(en2, h2.b.f, n9 + 17, n10 + n11 / 2, 0, 3);
                        if (h2.a != null) {
                            int n15 = 0;
                            while (n15 < h2.a.length) {
                                this.a(en2, h2.a[n15].c.a, n9, n10, n11);
                                ++n15;
                            }
                            n15 = 0;
                            while (n15 < h2.a.length) {
                                g.a(en2, h2.a[n15].c.a, h2.a[n15].a, n9, n10, 34, n11);
                                ++n15;
                            }
                        }
                        if (h2.h > 1) {
                            di.n.a(en2, "" + h2.h, n9 + 34, n10 + n11 - di.n.a(), 1);
                        }
                    }
                }
                ++n5;
            }
        }
        catch (Exception exception) {}
        this.f(en2);
    }

    private void y(en en2) {
        if (this.A == 23 || this.A == 24) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.bS, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 20) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.aq, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 22) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.o, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 19) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.bU, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 18) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.bR, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 13 && this.equals(main.a.H)) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.cn, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 12 && main.a.H != null) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.cy, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 11) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.bN, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 16) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.bO, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 15) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, this.n, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 2 && main.a.H != null) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.cd, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 9) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.ft, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 3) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.aH, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 26) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.D, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 14) {
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            di.f.a(en2, aw.fy, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 4) {
            di.f.a(en2, aw.cm, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 7) {
            di.f.a(en2, aw.fu, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 17) {
            di.f.a(en2, aw.fF, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 8) {
            di.f.a(en2, aw.ae, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 10) {
            di.f.a(en2, aw.fv, this.C + this.aE / 2, 59, 2);
            en2.a(13524492);
            en2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.B == 3 && this.D.length != 4) {
            en2.a(-this.h, 0);
        }
        int n2 = 0;
        while (n2 < this.aY.length) {
            di di2;
            en2.a(n2 == this.B ? 6805896 : 0xFFF0B0);
            bo.a(en2, this.C + n2 * this.aE, 52, this.aE - 1, 25, n2 == this.B ? 1 : 0, true);
            if (n2 == this.cf) {
                en2.a(ce.f, this.C + n2 * this.aE + this.aE / 2, 62, 3);
            }
            di di3 = di2 = n2 == this.B ? di.m : di.o;
            if (!this.aY[n2][1].equals("")) {
                di2.a(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 53, 2);
                di2.a(en2, this.aY[n2][1], this.C + n2 * this.aE + this.aE / 2, 64, 2);
            } else {
                di2.a(en2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 59, 2);
            }
            if (this.A == 0 && this.aY.length == 5 && p.aW && main.a.w % 4 == 0) {
                en2.a(ce.f, this.C + 3 * this.aE + this.aE / 2, 77, 33);
            }
            ++n2;
        }
        en2.a(13524492);
        en2.d(1, 78, this.d - 2, 1);
    }

    private static void z(en en2) {
        di.c.a(en2, String.valueOf(aw.ao) + " " + "2.5.0", 60, 4, 0, di.f);
        di.n.a(en2, String.valueOf(aw.ap) + ": " + af.e().ag, 60, 16, 0, di.o);
        String string = main.a.I.a.d().equals("") ? aw.gk : main.a.I.a.d();
        di.n.a(en2, String.valueOf(aw.ar) + " " + bs.a[bs.n] + ": " + string, 60, 27, 0, di.o);
    }

    private void A(en en2) {
        this.a(en2, af.e());
    }

    private void a(en en2, af af2) {
        di.c.a(en2, String.valueOf(p.bX != 1 ? "" : "       ") + af2.ag, this.b + 60, 4, 0, di.f);
        if (p.bX == 1) {
            bl.b(en2, 5427, this.b + 55, 4, 0, 0);
        }
        if (af2.cC > 0) {
            di.n.a(en2, aw.fb, this.b + 60, 16, 0, di.o);
            en2.a(p.aG, this.b + 95, 19, 0);
            int n2 = af2.bf * en.a(p.aF) / af2.cC;
            en2.e(95, this.b + 19, n2, 20);
            en2.a(p.aF, this.b + 95, 19, 0);
        }
        en2.e(0, 0, main.a.A, main.a.B);
        if (af2.y > 0L) {
            di.n.a(en2, af2.aq ? af2.c() : af2.bj, this.b + 60, 27, 0, di.o);
        }
        di.n.a(en2, String.valueOf(aw.da) + ": " + ai.a(af2.y), this.b + 60, 38, 0, di.o);
    }

    public final int a(h h2) {
        if (h2 == null) {
            return -1;
        }
        if (h2.b()) {
            if (h2.a == null) {
                return -1;
            }
            ee ee2 = h2.a[0];
            if (ee2.c.a == 22) {
                ee2.c = p.j().K[6];
                ee2.a *= 1000;
            }
            if (ee2.c.a == 23) {
                ee2.c = p.j().K[7];
                ee2.a *= 1000;
            }
            h h3 = null;
            int n2 = 0;
            while (n2 < af.e().aH.length) {
                h h4 = af.e().aH[n2];
                if (ee2.c.a == 22) {
                    ee2.c = p.j().K[6];
                    ee2.a *= 1000;
                }
                if (ee2.c.a == 23) {
                    ee2.c = p.j().K[7];
                    ee2.a *= 1000;
                }
                if (h4 != null && h4.a != null && h4.b.b == h2.b.b) {
                    h3 = h4;
                    break;
                }
                ++n2;
            }
            if (h3 == null) {
                ds.c("5");
                return ee2.a;
            }
            n2 = h3 != null && h3.a != null ? ee2.a - h3.a[0].a : ee2.a;
            return n2;
        }
        return 0;
    }

    private static void B(en en2) {
        di.c.a(en2, aw.aL[bv.r], 60, 4, 0);
        String string = "";
        if (bv.l >= 135 && bv.l <= 138) {
            string = " " + aw.l + bv.n;
        }
        di.n.a(en2, String.valueOf(bv.k) + string, 60, 16, 0);
        di.c.a(en2, String.valueOf(aw.fq) + ": ", 60, 27, 0);
        if (p.w() >= 0 && p.w() <= bv.w.length - 1) {
            di.n.a(en2, bv.w[p.w()], 60, 38, 0);
            return;
        }
        di.n.a(en2, aw.eq, 60, 38, 0);
    }

    private void C(en en2) {
        di.n.a(en2, String.valueOf(aw.eX) + ": " + af.e().U + " / " + af.e().V, this.b + 60, 2, 0, di.o);
        di.n.a(en2, String.valueOf(aw.eY) + ": " + af.e().T + " / " + af.e().W, this.b + 60, 14, 0, di.o);
        di.n.a(en2, String.valueOf(aw.eZ) + ": " + af.e().X + ", " + aw.fc + ": " + af.e().P + "%", this.b + 60, 26, 0, di.o);
        di.n.a(en2, String.valueOf(aw.eW) + ": " + af.e().cv + "%, " + aw.eV + ": " + af.e().cw + "%", this.b + 60, 38, 0, di.o);
    }

    private void D(en en2) {
        int n2;
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(-this.aL, -this.aM);
        en2.a(aQ, this.ae, this.af, 0);
        int n3 = af.e().bU;
        av av2 = p.x[n3];
        bl.b(en2, av2.a[af.bC[0][0][0]].a, this.cz, this.cA + 5, 0, 3);
        int n4 = 2;
        if (this.cz <= 40) {
            n4 = 0;
        }
        if (this.cz >= 220) {
            n4 = 1;
        }
        di.d.a(en2, bv.k, this.cz, this.cA - 12, n4, di.o);
        int n5 = -1;
        if (p.w() != -1) {
            n2 = 0;
            while (n2 < bz[bv.r].length) {
                if (bz[bv.r][n2] == p.w()) {
                    n5 = n2;
                    break;
                }
                n5 = 4;
                ++n2;
            }
            if (main.a.w % 4 > 0) {
                en2.a(ce.f, this.ae + bA[bv.r][n5], this.af + bB[bv.r][n5], 3);
            }
        }
        if (!main.a.e) {
            en2.a(i, this.cB, this.cC, cj.b);
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n6 = bA[bv.r][n2] + this.ae;
                int n7 = bB[bv.r][n2] + this.af;
                if (ds.a(n6 - 15, n7 - 15, 30, 30, this.cB, this.cC)) {
                    n4 = 2;
                    if (n6 <= 20) {
                        n4 = 0;
                    }
                    if (n6 >= 220) {
                        n4 = 1;
                    }
                    di.d.a(en2, bv.w[bz[bv.r][n2]], n6, n7 - 12, n4, di.o);
                    break;
                }
                ++n2;
            }
        } else if (!this.bZ) {
            n2 = 0;
            while (n2 < bA[bv.r].length) {
                int n8 = bA[bv.r][n2] + this.ae;
                int n9 = bB[bv.r][n2] + this.af;
                if (ds.a(n8 - 15, n9 - 15, 30, 30, this.ca, this.cb)) {
                    n4 = 2;
                    if (n8 <= 30) {
                        n4 = 0;
                    }
                    if (n8 >= 220) {
                        n4 = 1;
                    }
                    en2.a(i, n8, n9, cj.b);
                    di.d.a(en2, bv.w[bz[bv.r][n2]], n8, n9 - 12, n4, di.o);
                    break;
                }
                ++n2;
            }
        }
        en2.a(-en2.a(), -en2.b());
        if (n5 != -1) {
            if (bA[bv.r][n5] + this.ae < this.aL) {
                en2.a(aa.R, 0, 0, 9, 6, 5, this.ae + 5, this.af + this.ah / 2 - 4, 0);
            }
            if (this.aL + this.ag < bA[bv.r][n5] + this.ae) {
                en2.a(aa.R, 0, 0, 9, 6, 6, this.ae + this.ag - 5, this.af + this.ah / 2 - 4, cj.b);
            }
            if (bB[bv.r][n5] < this.aM) {
                en2.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag / 2, this.af + 5, cj.a);
            }
            if (bB[bv.r][n5] > this.aM + this.ah) {
                en2.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag / 2, this.af + this.ah - 5, cj.c);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void E(en var1_1) {
        block39: {
            block30: {
                v0 = var2_2 = main.a.B > 300 ? 20 : 15;
                if (g.as) {
                    p.j();
                    if (!p.e()) {
                        p.j();
                        if (!p.f()) {
                            var1_1.a(this.cd == 1 ? p.ax : p.aw, this.ae + this.ag / 2, this.af + this.ah - var2_2, 3);
                            di.f.a(var1_1, aw.cm, this.ae + this.ag / 2, this.af + this.ah - (var2_2 + 5), 2);
                        }
                    }
                }
                this.cs = this.ae + 5;
                this.cy = this.ct = this.af + 14;
                var1_1.e(this.ae, this.af, this.ag, this.ah - 35);
                if (this.ci != null) {
                    if (this.ci.d > 0) {
                        var1_1.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
                    }
                    if (this.ci.d < this.ci.l) {
                        var1_1.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 45, 0);
                    }
                    var1_1.a(0, -this.ci.d);
                }
                this.cw = 0;
                var3_3 = 0;
                if (af.e().aD == null) break block30;
                var4_4 = 0;
                while (var4_4 < af.e().aD.d.length) {
                    di.o.a(var1_1, af.e().aD.d[var4_4], this.ae + this.ag / 2, this.cy - 5 + var4_4 * 12, 2);
                    ++this.cw;
                    ++var4_4;
                }
                this.cy += (af.e().aD.d.length - 1) * 12;
                var4_4 = 0;
                var6_6 = 0;
                while (var6_6 < af.e().aD.f.length) {
                    block38: {
                        block31: {
                            block35: {
                                block37: {
                                    block32: {
                                        block36: {
                                            block33: {
                                                block34: {
                                                    if (af.e().aD.f[var6_6] == null) break block31;
                                                    var4_4 = var6_6;
                                                    var5_8 = "- " + af.e().aD.f[var6_6];
                                                    if (af.e().aD.b[var6_6] == -1) break block32;
                                                    if (af.e().aD.a != var6_6) break block33;
                                                    if (af.e().aD.b[var6_6] != 1) {
                                                        var5_8 = String.valueOf(var5_8) + " (" + af.e().aD.h + "/" + af.e().aD.b[var6_6] + ")";
                                                    }
                                                    if (af.e().aD.h != af.e().aD.b[var6_6]) break block34;
                                                    v1 = di.k;
                                                    v2 = var1_1;
                                                    v3 = var5_8;
                                                    v4 = this.cs;
                                                    v5 = 5;
                                                    ** GOTO lbl94
                                                }
                                                var7_10 = di.o;
                                                if (var3_3 == 0) {
                                                    var3_3 = 1;
                                                    var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = di.q) == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                                } else {
                                                    var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                                }
                                                break block35;
                                            }
                                            if (af.e().aD.a <= var6_6) break block36;
                                            if (af.e().aD.b[var6_6] != 1) {
                                                var5_8 = String.valueOf(var5_8) + " (" + af.e().aD.b[var6_6] + "/" + af.e().aD.b[var6_6] + ")";
                                            }
                                            v1 = di.s;
                                            v2 = var1_1;
                                            v3 = var5_8;
                                            v4 = this.cs;
                                            v5 = 5;
                                            ** GOTO lbl94
                                        }
                                        if (af.e().aD.b[var6_6] != 1) {
                                            var5_8 = String.valueOf(var5_8) + " 0/" + af.e().aD.b[var6_6];
                                        }
                                        var7_10 = di.o;
                                        if (var3_3 == 0) {
                                            var3_3 = 1;
                                            var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = di.q) == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                        } else {
                                            var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                        }
                                        break block35;
                                    }
                                    if (af.e().aD.a <= var6_6) break block37;
                                    v1 = di.s;
                                    v2 = var1_1;
                                    v3 = var5_8;
                                    v4 = this.cs;
                                    v5 = 5;
                                    ** GOTO lbl94
                                }
                                var7_10 = di.o;
                                if (var3_3 == 0) {
                                    var3_3 = 1;
                                    var7_10.a(var1_1, var5_8, this.cs + 5 + ((var7_10 = di.q) == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                } else {
                                    v1 = var7_10;
                                    v2 = var1_1;
                                    v3 = "- ...";
                                    v4 = this.cs + 5;
                                    v5 = var7_10 == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0;
lbl94:
                                    // 4 sources

                                    v1.a(v2, v3, v4 + v5, this.cy += 12, 0);
                                }
                            }
                            ++this.cw;
                            break block38;
                        }
                        if (af.e().aD.a <= var6_6) {
                            var5_8 = "- " + af.e().aD.f[var4_4];
                            var7_10 = di.o;
                            if (var3_3 == 0) {
                                var3_3 = 1;
                                var7_10 = di.q;
                            }
                            var7_10.a(var1_1, var5_8, this.cs + 5 + (var7_10 == di.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                        }
                    }
                    ++var6_6;
                }
                this.cy += 5;
                var6_6 = 0;
                while (var6_6 < af.e().aD.e.length) {
                    di.m.a(var1_1, af.e().aD.e[var6_6], this.cs + 5, this.cy += 12, 0);
                    ++this.cw;
                    ++var6_6;
                }
                break block39;
            }
            var4_5 = p.w();
            var5_9 = p.x();
            if (var4_5 == -3 || var5_9 == -3) {
                var6_7 = aw.aW[3];
            } else if (af.e().aD == null && af.e().L == 9 && af.e().ax.a == 0) {
                var6_7 = aw.aZ;
            } else if (var5_9 >= 0 && var4_5 >= 0) {
                var6_7 = String.valueOf(aw.aW[0]) + do.dg[var5_9].b + aw.aW[1] + bv.w[var4_5] + aw.aW[2];
            } else {
                return;
            }
            var7_11 = di.s.a(var6_7, 150);
            var3_3 = 0;
            while (var3_3 < var7_11.length) {
                if (var3_3 == 0) {
                    this.cy = this.ct;
                    di.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy, 0);
                } else {
                    di.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy += 12, 0);
                }
                ++var3_3;
            }
        }
        if (this.ci == null) {
            this.ci = new dv();
            this.ci.a(this.cw, 12, this.ae, this.af, this.ag, this.ah - var2_2 - 40, true, 1);
        }
    }

    private void Z() {
        int n2 = 0;
        while (n2 < this.k.size()) {
            ((h)this.k.elementAt((int)n2)).f = false;
            ++n2;
        }
        this.k.removeAllElements();
    }

    public final void z() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || bv.l == 45) {
            af.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            bt.a().a((byte)3, -1, (byte)-1, -1);
        }
        bu.a();
        p.bt = true;
        bv.s = (byte)-1;
        aQ = null;
        System.gc();
        this.bP = false;
        this.cD = true;
        this.Z();
        v.a();
        main.a.H = null;
        main.a.l();
        main.a.f();
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        this.a = false;
        if ((af.e().U <= 0L || af.e().H == 14 || af.e().H == 5) && af.e().cH) {
            de de2;
            p.j().cn = de2 = new de(aw.aX[0], 11038, p.j());
            af.e().U = 0L;
        }
    }

    public final void A() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || bv.l == 45) {
            af.e().X();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            bt.a().a((byte)3, -1, (byte)-1, -1);
        }
        if (this.A == 15) {
            bt.a().w(-1);
        }
        bu.a();
        p.bt = true;
        bv.s = (byte)-1;
        if (aQ != null) {
            aQ = null;
        }
        System.gc();
        this.bP = false;
        if (this.A != 4) {
            if (this.A == 24) {
                this.ah();
            } else if (this.A == 23) {
                this.q();
            } else if (this.A == 3 || this.A == 14) {
                if (this.cI) {
                    this.cD = true;
                } else {
                    this.q();
                    this.aK = 0;
                    this.h = 0;
                }
            } else if (this.A == 18 || this.A == 19 || this.A == 20 || this.A == 21) {
                this.q();
                this.aK = 0;
                this.h = 0;
            } else if (this.A == 8 || this.A == 11 || this.A == 16) {
                this.at();
                this.aK = 0;
                this.h = 0;
            } else {
                this.cD = true;
            }
        } else {
            this.q();
            this.aK = 0;
            this.h = 0;
        }
        v.a();
        main.a.H = null;
        main.a.l();
        main.a.f();
        main.a.W = false;
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        if ((af.e().U <= 0L || af.e().H == 14 || af.e().H == 5) && af.e().cH) {
            de de2;
            p.j().cn = de2 = new de(aw.aX[0], 11038, p.j());
            af.e().U = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void B() {
        block193: {
            if (this.o != null && this.o.b) {
                this.o.c();
                return;
            }
            if (this.cJ) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cJ = false;
                    this.o.a.a("");
                    this.o.h = String.valueOf(aw.fI) + " ";
                    this.o.a.i = aw.ed;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(1);
                    this.o.a.b(10);
                    if (main.a.e) {
                        this.o.a.a();
                    }
                }
                return;
            }
            if (this.cK) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cK = false;
                    this.o.a.a("");
                    this.o.h = String.valueOf(aw.fJ) + "  ";
                    this.o.a.i = aw.ed;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(1);
                    this.o.a.b(10);
                    if (main.a.e) {
                        this.o.a.a();
                    }
                }
                return;
            }
            if (this.ci != null) {
                this.ci.b();
            }
            if (this.j != null && this.j.k) {
                var1_1 = this.j;
                if (dr.f != null) {
                    dr.f.b();
                }
                if (var1_1.h != var1_1.g) {
                    var1_1.i = var1_1.g - var1_1.h << 2;
                    var1_1.j += var1_1.i;
                    var1_1.h += var1_1.j >> 3;
                    var1_1.j &= 15;
                }
                if (Math.abs(var1_1.g - var1_1.h) < 10) {
                    var1_1.h = var1_1.g;
                }
                if (var1_1.h >= var1_1.a + var1_1.b - 10 && var1_1.g >= var1_1.a + var1_1.b - 10) {
                    var1_1.k = false;
                }
                return;
            }
            this.V();
            if (this.bV <= 0) break block193;
            --this.bV;
            if (this.bV != 0) break block193;
            this.bp[this.B] = this.ak;
            switch (this.A) {
                case 23: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cE = var1_2.ak;
                    ((ba)g.at.elementAt((int)var1_2.cE)).d = true;
                    eu.a(String.valueOf(((ba)g.at.elementAt((int)var1_2.cE)).c), 1);
                    var2_4 = var1_2;
                    var3_11 = ((ba)g.at.elementAt((int)var2_4.cE)).b;
                    g.cF = di.o.a((String)var3_11, var2_4.ag - 40);
                    var2_4.O = g.cF.length;
                    var2_4.aD = 16;
                    var2_4.ak = main.a.e != false ? -1 : 0;
                    var2_4.aI = var2_4.O * var2_4.aD - var2_4.ah;
                    if (var2_4.aI < 0) {
                        var2_4.aI = 0;
                    }
                    if (var2_4.g < 0) {
                        var2_4.f = 0;
                        var2_4.g = 0;
                    }
                    if (var2_4.g > var2_4.aI) {
                        var2_4.g = var2_4.f = var2_4.aI;
                    }
                    var2_4.A = 24;
                    var2_4.c(0);
                    break;
                }
                case 21: {
                    var1_2 = this;
                    if (var1_2.B == 0) {
                        if (var1_2.ak == -1 || var1_2.ak > af.f().aH.length - 1) break;
                        var2_5 = new el("");
                        var1_2.bC = var3_11 = af.f().aH[var1_2.ak];
                        if (var1_2.bC != null) {
                            var2_5.addElement(new de(aw.dZ, var1_2, 2006, var1_2.bC));
                            main.a.F.a(var2_5, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.af);
                            var1_2.b(var1_2.bC);
                        } else {
                            var1_2.ai = null;
                        }
                    }
                    if (var1_2.B == 1) {
                        var5_12 = var1_2;
                        if (var5_12.ak != -1) {
                            if (var5_12.ak == 5) {
                                main.a.a(aw.p, new de(aw.bn, 888351), new de(aw.bo, 2001));
                            } else {
                                bt.a().g((byte)var5_12.ak);
                                if (var5_12.ak < 4) {
                                    af.f().A = (byte)var5_12.ak;
                                }
                            }
                        }
                    }
                    if (var1_2.B != 2) break;
                    var1_2.ae();
                    break;
                }
                case 0: {
                    var1_2 = this;
                    try {
                        if (var1_2.B == 0) {
                            var1_2.K();
                        }
                        if (var1_2.B == 1) {
                            var1_2.ae();
                        }
                        if (var1_2.B != 2) ** GOTO lbl229
                        var3_11 = var1_2;
                        if (var3_11.ak < 0) ** GOTO lbl229
                        if (af.e().H != 14) ** GOTO lbl116
                        main.a.a(aw.ex);
                        ** GOTO lbl229
lbl116:
                        // 1 sources

                        if (var3_11.ak != 0 && var3_11.ak != 1 && var3_11.ak != 2 && var3_11.ak != 3 && var3_11.ak != 4 && var3_11.ak != 5) ** GOTO lbl211
                        var5_13 = af.e().aa;
                        var2_6 = af.e().cr;
                        var4_20 = af.e().cs;
                        var7_22 = af.e().cq;
                        var8_24 = af.e().ct;
                        af.e();
                        if (var3_11.ak != 0) ** GOTO lbl144
                        if (var5_13 >= (long)(af.e().cr + 1000)) ** GOTO lbl128
                        main.a.c(String.valueOf(aw.eK) + af.e().aa + aw.eL + (af.e().cr + 1000));
                        ** GOTO lbl229
lbl128:
                        // 1 sources

                        if (var5_13 <= (long)var2_6 || var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2)) ** GOTO lbl131
                        main.a.a(String.valueOf(aw.eM) + (var2_6 + 1000) + aw.eN + af.e().cx + aw.eO, new de(aw.eJ, (b)var3_11, 9000, null), new de(aw.bv, (b)var3_11, 4007, null));
                        ** GOTO lbl229
lbl131:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new el("");
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cx + aw.eX + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cx + aw.eX + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_25 = new el("");
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cx + aw.eX + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cx + aw.eX + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 100 * af.e().cx + aw.eX + "\n" + "-" + ds.b((long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)), (b)var3_11, 9007, null));
                            main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
lbl144:
                        // 4 sources

                        if (var3_11.ak != 1) ** GOTO lbl164
                        if (af.e().aa >= (long)(af.e().cs + 1000)) ** GOTO lbl148
                        main.a.a(String.valueOf(aw.eK) + af.e().aa + aw.eL + (af.e().cs + 1000));
                        ** GOTO lbl229
lbl148:
                        // 1 sources

                        if (var5_13 <= (long)var4_20 || var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2)) ** GOTO lbl151
                        main.a.a(String.valueOf(aw.eM) + (var4_20 + 1000) + aw.eN + af.e().cy + aw.eP, new de(aw.eJ, (b)var3_11, 9000, null), new de(aw.bv, (b)var3_11, 4007, null));
                        ** GOTO lbl229
lbl151:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var4_20 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new el("");
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cy + aw.eY + "\n" + "-" + ds.b((long)(var2_6 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cy + aw.eY + "\n" + "-" + ds.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)) {
                            var11_25 = new el("");
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cy + aw.eY + "\n" + "-" + ds.b((long)(var4_20 + 1000)), (b)var3_11, 9000, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cy + aw.eY + "\n" + "-" + ds.b((long)(10 * (2 * (var4_20 + 1000) + 180) / 2)), (b)var3_11, 9006, null));
                            var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 100 * af.e().cy + aw.eY + "\n" + "-" + ds.b((long)(100 * (2 * (var4_20 + 1000) + 1980) / 2)), (b)var3_11, 9007, null));
                            main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
lbl164:
                        // 4 sources

                        if (var3_11.ak != 2) ** GOTO lbl184
                        if (af.e().aa < (long)(af.e().cq * af.e().cD)) {
                            main.a.a(String.valueOf(aw.eK) + af.e().aa + aw.eL + var7_22 * 100);
                        } else if (var5_13 > (long)var7_22 && var5_13 < (long)(10 * (var7_22 * 2 + 9) / 2 * af.e().cD)) {
                            main.a.a(String.valueOf(aw.eM) + var7_22 * 100 + aw.eN + af.e().cz + aw.eQ, new de(aw.eJ, (b)var3_11, 9000, null), new de(aw.bv, (b)var3_11, 4007, null));
                        } else {
                            if (var5_13 >= (long)(10 * (var7_22 * 2 + 9) / 2 * af.e().cD) && var5_13 < (long)(100 * (var7_22 * 2 + 99) / 2 * af.e().cD)) {
                                var11_25 = new el("");
                                var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cz + "\n" + aw.eZ + "\n" + "-" + ds.b((long)(var7_22 * 100)), (b)var3_11, 9000, null));
                                var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cz + "\n" + aw.eZ + "\n" + "-" + ds.b((long)(10 * (var7_22 * 2 + 9) / 2 * af.e().cD)), (b)var3_11, 9006, null));
                                main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                super.d(var3_11.ak);
                            }
                            if (var5_13 >= (long)(100 * (var7_22 * 2 + 99) / 2 * af.e().cD)) {
                                var11_25 = new el("");
                                var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + af.e().cz + "\n" + aw.eZ + "\n" + "-" + ds.b((long)(var7_22 * 100)), (b)var3_11, 9000, null));
                                var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 10 * af.e().cz + "\n" + aw.eZ + "\n" + "-" + ds.b((long)(10 * (var7_22 * 2 + 9) / 2 * af.e().cD)), (b)var3_11, 9006, null));
                                var11_25.addElement(new de(String.valueOf(aw.eJ) + "\n" + 100 * af.e().cz + "\n" + aw.eZ + "\n" + "-" + ds.b((long)(100 * (var7_22 * 2 + 99) / 2 * af.e().cD)), (b)var3_11, 9007, null));
                                main.a.F.a(var11_25, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                super.d(var3_11.ak);
                            }
lbl184:
                            // 4 sources

                            if (var3_11.ak == 3) {
                                if (af.e().aa < (long)(50000 + af.e().ct * 1000)) {
                                    main.a.a(String.valueOf(aw.eK) + ai.a(af.e().aa) + aw.eL + ai.a((long)(50000 + af.e().ct * 1000)));
                                } else {
                                    var11_26 = 1L * (long)(2 * (var8_24 + 5)) / 2L * 100000L;
                                    var13_28 = 10L * (long)(2 * (var8_24 + 5) + 9) / 2L * 100000L;
                                    var15_30 = 100L * (long)(2 * (var8_24 + 5) + 99) / 2L * 100000L;
                                    aw.eM = aw.eJ;
                                    var2_7 = new el("");
                                    var2_7.addElement(new de(String.valueOf(aw.eM) + "\n" + "1 " + aw.fa + "\n" + ds.b(var11_26), (b)var3_11, 9000, null));
                                    var2_7.addElement(new de(String.valueOf(aw.eM) + "\n" + "10 " + aw.fa + "\n" + ds.b(var13_28), (b)var3_11, 9006, null));
                                    var2_7.addElement(new de(String.valueOf(aw.eM) + "\n" + "100 " + aw.fa + "\n" + ds.b(var15_30), (b)var3_11, 9007, null));
                                    main.a.F.a(var2_7, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                    super.d(var3_11.ak);
                                }
                            } else if (var3_11.ak == 4) {
                                var13_29 = af.e().cu;
                                if (var13_29 > g.co.length - 1) {
                                    var13_29 = g.co.length - 1;
                                }
                                if (af.e().aa < (var11_27 = g.co[var13_29])) {
                                    main.a.a(String.valueOf(aw.eK) + ds.b(af.e().aa) + aw.eL + ds.b(var11_27));
                                } else {
                                    main.a.a(String.valueOf(aw.eM) + ds.a(var11_27) + aw.eN + af.e().cB + aw.eR, new de(aw.eJ, (b)var3_11, 9000, null), new de(aw.bv, (b)var3_11, 4007, null));
                                }
                            } else if (var3_11.ak == 5) {
                                bt.a().a((byte)0);
                            }
                        }
                        ** GOTO lbl229
lbl211:
                        // 1 sources

                        var5_14 = var3_11.ak - 6;
                        var6_31 = af.e().ax.b[var5_14];
                        var2_8 = af.e().a((et)var6_31);
                        var4_21 = null;
                        var7_23 = new el("");
                        if (var2_8 != null) {
                            if (var2_8.c == var6_31.c) {
                                var7_23.addElement(new de(aw.cA, (b)var3_11, 9003, var2_8.a));
                                var7_23.addElement(new de(aw.bj, 2));
                            } else {
                                var4_21 = var6_31.h[var2_8.c];
                                var7_23.addElement(new de(aw.cy, (b)var3_11, 9002, var4_21));
                                var7_23.addElement(new de(aw.cA, (b)var3_11, 9003, var2_8.a));
                            }
                        } else {
                            var4_21 = var6_31.h[0];
                            var7_23.addElement(new de(aw.fl, (b)var3_11, 9004, var4_21));
                        }
                        main.a.F.a(var7_23, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                        super.a((et)var6_31, var2_8, var4_21);
lbl229:
                        // 15 sources

                        if (var1_2.B == 3) {
                            if (var1_2.D.length == 4) {
                                var1_2.ag();
                            } else {
                                var3_11 = var1_2;
                                var1_2.bL = null;
                                var3_11.cH = null;
                                if (var3_11.ak < 0) {
                                    var3_11.bN = -1;
                                } else {
                                    if (af.e().ai == null) {
                                        if (var3_11.ak == 0) {
                                            if (var3_11.bN == 0) {
                                                var6_31 = var3_11;
                                                var3_11.o.h = aw.dt;
                                                var6_31.o.a.i = aw.du;
                                                var6_31.o.g = "";
                                                var6_31.o.b = true;
                                                var6_31.o.a.e = true;
                                                var6_31.o.a.c(0);
                                                if (main.a.e) {
                                                    var6_31.o.a.a();
                                                }
                                            } else if (var3_11.bN == 1) {
                                                bp.a();
                                                var6_31 = var3_11;
                                                var3_11.o.h = aw.dw;
                                                var6_31.o.a.i = aw.dt;
                                                var6_31.o.g = "";
                                                var6_31.o.b = true;
                                                var6_31.o.a.c(0);
                                                if (main.a.e) {
                                                    var6_31.o.a.a();
                                                }
                                                bt.a().a((byte)1, -1, (String)null);
                                            }
                                        } else if (var3_11.ak != -1) {
                                            if (var3_11.ak == 1) {
                                                if (var3_11.al) {
                                                    bt.a().a("");
                                                } else if (var3_11.an && var3_11.bD != null) {
                                                    main.a.a(String.valueOf(aw.dy) + var3_11.bD.c, new de(aw.bn, (b)var3_11, 4000, var3_11.bD), new de(aw.bo, (b)var3_11, 4005, var3_11.bD));
                                                }
                                            } else if (var3_11.al) {
                                                var3_11.bD = super.Y();
                                                if (var3_11.bD != null) {
                                                    var5_15 = new el("");
                                                    var5_15.addElement(new de(aw.dA, (b)var3_11, 4000, var3_11.bD));
                                                    var5_15.addElement(new de(aw.dB, (b)var3_11, 4001, var3_11.bD));
                                                    main.a.F.a(var5_15, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    super.a(super.Y());
                                                }
                                            } else if (var3_11.an) {
                                                var3_11.bF = super.W();
                                                if (var3_11.bF != null) {
                                                    var5_16 = new el("");
                                                    var5_16.addElement(new de(aw.bj, (b)var3_11, 8000, var3_11.bD));
                                                    main.a.F.a(var5_16, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    main.a.F.a(var5_16, 0, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    super.a(var3_11.bF);
                                                }
                                            }
                                        }
                                    } else if (var3_11.ak == 0) {
                                        if (var3_11.am) {
                                            if (var3_11.bN == 0) {
                                                if (var3_11.R.size() > 1) {
                                                    var6_31 = var3_11;
                                                    var3_11.o.h = aw.dv;
                                                    var6_31.o.a.i = aw.bq;
                                                    var6_31.o.g = "";
                                                    var6_31.o.b = true;
                                                    var6_31.o.a.e = true;
                                                    var6_31.o.a.c(0);
                                                    if (main.a.e) {
                                                        var6_31.o.a.a();
                                                    }
                                                } else {
                                                    var3_11.Q = null;
                                                    var3_11.al = false;
                                                    var3_11.an = true;
                                                    var3_11.am = false;
                                                    var3_11.O = var3_11.R.size() + 2;
                                                    var3_11.v();
                                                }
                                            }
                                            if (var3_11.bN == 1) {
                                                bt.a().a(1, null, -1);
                                            }
                                            if (var3_11.bN == 2) {
                                                var3_11.Q = null;
                                                var3_11.al = false;
                                                var3_11.an = true;
                                                var3_11.am = false;
                                                var3_11.O = var3_11.R.size() + 2;
                                                var3_11.v();
                                                super.M();
                                            }
                                        } else if (var3_11.an) {
                                            if (var3_11.bN == 0) {
                                                var3_11.al = false;
                                                var3_11.an = false;
                                                var3_11.am = true;
                                                var3_11.O = cb.l.size() + 2;
                                                var3_11.v();
                                            }
                                            if (var3_11.bN == 1) {
                                                if (var3_11.R.size() > 1) {
                                                    bt.a().b();
                                                } else {
                                                    super.ai();
                                                }
                                            }
                                            if (var3_11.bN == 2) {
                                                if (var3_11.R.size() > 1) {
                                                    super.ai();
                                                } else {
                                                    bt.a().a((byte)3, -1, (String)null);
                                                }
                                            }
                                            if (var3_11.bN == 3) {
                                                bt.a().a((byte)3, -1, (String)null);
                                            }
                                        }
                                    } else if (var3_11.ak == 1) {
                                        if (var3_11.al) {
                                            bt.a().a("");
                                        }
                                    } else if (var3_11.al) {
                                        var3_11.bD = super.Y();
                                        if (var3_11.bD != null) {
                                            var5_17 = new el("");
                                            var5_17.addElement(new de(aw.dB, (b)var3_11, 4001, var3_11.bD));
                                            main.a.F.a(var5_17, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                            super.a(super.Y());
                                        }
                                    } else if (var3_11.an) {
                                        ds.c("TOI DAY 1");
                                        var3_11.bF = super.W();
                                        if (var3_11.bF != null) {
                                            var5_18 = new el("");
                                            ds.c("TOI DAY 2");
                                            if (var3_11.Q != null) {
                                                var5_18.addElement(new de(aw.bj, (b)var3_11, 8000, null));
                                                ds.c("TOI DAY 3");
                                            } else if (var3_11.R != null) {
                                                ds.c("TOI DAY 4");
                                                ds.c("my role= " + af.e().aj);
                                                if (af.e().J == var3_11.bF.a || af.e().aj == 2) {
                                                    var5_18.addElement(new de(aw.bj, (b)var3_11, 8000, var3_11.bF));
                                                }
                                                if (af.e().aj < 2 && af.e().J != var3_11.bF.a) {
                                                    if (var3_11.bF.g == 0 || var3_11.bF.g == 1) {
                                                        var5_18.addElement(new de(aw.bj, (b)var3_11, 8000, var3_11.bF));
                                                    }
                                                    if (var3_11.bF.g == 2) {
                                                        var5_18.addElement(new de(aw.dC, (b)var3_11, 5002, var3_11.bF));
                                                    }
                                                    if (af.e().aj == 0) {
                                                        var5_18.addElement(new de(aw.dD, (b)var3_11, 5001, var3_11.bF));
                                                        if (var3_11.bF.g == 1) {
                                                            var5_18.addElement(new de(aw.dE, (b)var3_11, 5003, var3_11.bF));
                                                        }
                                                    }
                                                }
                                                if (af.e().aj < var3_11.bF.g) {
                                                    var5_18.addElement(new de(aw.dF, (b)var3_11, 5004, var3_11.bF));
                                                }
                                            }
                                            main.a.F.a(var5_18, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                            super.a(var3_11.bF);
                                        }
                                    } else if (var3_11.am) {
                                        var3_11.bE = super.X();
                                        if (var3_11.bE != null) {
                                            if (var3_11.bE.b == 0) {
                                                var5_19 = new el("");
                                                var5_19.addElement(new de(aw.bj, (b)var3_11, 8000, var3_11.bE));
                                                main.a.F.a(var5_19, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                super.a(var3_11.bE);
                                            } else if (var3_11.bE.b == 1) {
                                                if (var3_11.bE.c != af.e().J && var3_11.bN != -1) {
                                                    bt.a().d(var3_11.bE.a);
                                                }
                                            } else if (var3_11.bE.b == 2 && var3_11.bE.k != null) {
                                                if (var3_11.bN == 0) {
                                                    bt.a().a(var3_11.bE.a, (byte)1);
                                                } else if (var3_11.bN == 1) {
                                                    bt.a().a(var3_11.bE.a, (byte)0);
                                                }
                                            }
                                        }
                                    }
                                    if (main.a.e) {
                                        var3_11.bN = -1;
                                        var3_11.ak = -1;
                                    }
                                }
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.ag();
                    }
                    catch (Exception v0) {
                        var2_9 = v0;
                        v0.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    this.ao();
                    break;
                }
                case 26: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    main.a.G.A();
                    break;
                }
                case 3: {
                    this.an();
                    break;
                }
                case 1: 
                case 17: {
                    var1_2 = this;
                    this.bC = null;
                    if (var1_2.ak < 0) break;
                    var2_10 = new el("");
                    if (var1_2.B < var1_2.aY.length - (main.a.H != null ? 0 : 1) && var1_2.A != 17) {
                        var1_2.bC = af.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC != null) {
                            if (var1_2.bC.y) {
                                if (var1_2.bC.s > 0) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.s), var1_2, 3005, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 4) {
                                var2_10.addElement(new de(aw.co, var1_2, 30001, var1_2.bC));
                                var2_10.addElement(new de(aw.bk, var1_2, 30002, var1_2.bC));
                                var2_10.addElement(new de(aw.cp, var1_2, 30003, var1_2.bC));
                            } else if (var1_2.bC.n == 0 && var1_2.bC.p == 0) {
                                if (var1_2.bC.j != 0L) {
                                    var2_10.addElement(new de(String.valueOf(aw.ev) + "\n" + ds.a(var1_2.bC.j) + " \n" + aw.fi, var1_2, 3004, var1_2.bC));
                                } else {
                                    var2_10.addElement(new de(String.valueOf(aw.co) + "\n" + aw.eo, var1_2, 3000, var1_2.bC));
                                }
                            } else if (var1_2.bJ == 8) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + aw.bD, var1_2, 30001, var1_2.bC));
                                }
                                if (var1_2.bC.p > 0) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.p) + "\n" + aw.bE, var1_2, 30002, var1_2.bC));
                                }
                            } else if (var1_2.bJ != 2) {
                                if (var1_2.bC.n > 0) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + aw.bD, var1_2, 3000, var1_2.bC));
                                }
                                if (var1_2.bC.p > 0) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.p) + "\n" + aw.bE, var1_2, 3001, var1_2.bC));
                                }
                            } else {
                                if (var1_2.bC.n != -1) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.n) + "\n" + aw.bD, var1_2, 10016, var1_2.bC));
                                }
                                if (var1_2.bC.p != -1) {
                                    var2_10.addElement(new de(String.valueOf(aw.ew) + "\n" + ds.b((long)var1_2.bC.p) + "\n" + aw.bE, var1_2, 10017, var1_2.bC));
                                }
                            }
                        }
                    } else if (var1_2.bJ == 0) {
                        if (var1_2.ak == 0) {
                            var1_2.a(af.e().aH.length + af.e().aF.length, false, false);
                        } else {
                            var1_2.bC = null;
                            if (!g.a(var1_2.ak, var1_2.bO, af.e().aH)) {
                                var3_11 = af.e().aF[g.b(var1_2.ak, var1_2.bO, af.e().aH)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            } else {
                                var3_11 = af.e().aH[g.c(var1_2.ak, var1_2.bO)];
                                if (var3_11 != null) {
                                    var1_2.bC = var3_11;
                                }
                            }
                            if (var1_2.bC != null) {
                                var2_10.addElement(new de(aw.eb, var1_2, 3002, var1_2.bC));
                            }
                        }
                    } else {
                        var1_2.bC = var1_2.A == 17 ? af.e().aJ[4][var1_2.ak] : af.e().aJ[var1_2.B][var1_2.ak];
                        if (var1_2.bC.v == 0) {
                            if (var1_2.bC.a(87)) {
                                var2_10.addElement(new de(aw.fH, var1_2, 10013, var1_2.bC));
                            } else {
                                var2_10.addElement(new de(aw.fG, var1_2, 10012, var1_2.bC));
                            }
                        } else if (var1_2.bC.v == 1) {
                            var2_10.addElement(new de(aw.fK, var1_2, 10014, var1_2.bC));
                            var2_10.addElement(new de(aw.fO, var1_2, 10018, var1_2.bC));
                        } else if (var1_2.bC.v == 2) {
                            var2_10.addElement(new de(aw.fL, var1_2, 10015, var1_2.bC));
                        }
                    }
                    if (var1_2.bC != null) {
                        af.e().a(var1_2.bC.D, var1_2.bC.E, var1_2.bC.F, var1_2.bC.G);
                        main.a.F.a(var2_10, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.af);
                        var1_2.b(var1_2.bC);
                        break;
                    }
                    var1_2.ai = null;
                    break;
                }
                case 25: {
                    break;
                }
                case 4: {
                    var1_2 = this;
                    if (g.aQ != null) {
                        g.aQ = null;
                    }
                    bv.s = (byte)-1;
                    System.gc();
                    bl.a();
                    var1_2.q();
                    var1_2.aK = 0;
                    var1_2.h = 0;
                    break;
                }
                case 14: {
                    var1_2 = this;
                    var1_2.an();
                    break;
                }
                case 7: {
                    if (this.equals(main.a.H) && main.a.G.A == 2) {
                        this.ao();
                        return;
                    }
                    this.ae();
                    break;
                }
                case 8: {
                    this.am();
                    break;
                }
                case 9: {
                    this.ad();
                    break;
                }
                case 10: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cl = true;
                    var1_2.A();
                    break;
                }
                case 11: {
                    this.ak();
                    break;
                }
                case 16: {
                    this.aj();
                    break;
                }
                case 15: {
                    this.aa();
                    break;
                }
                case 12: {
                    this.ac();
                    break;
                }
                case 13: {
                    this.ab();
                    break;
                }
                case 18: {
                    this.al();
                    break;
                }
                case 19: {
                    this.as();
                    break;
                }
                case 20: {
                    this.au();
                }
            }
        }
        var1_3 = 0;
        while (var1_3 < cb.l.size()) {
            ((cb)cb.l.elementAt(var1_3)).a();
            ++var1_3;
        }
        this.ap();
    }

    private void aa() {
        if (this.ak < -1) {
            return;
        }
        if (this.bI) {
            bt.a().a(this.n, (byte)this.ak);
            return;
        }
        Object object = new el("");
        ((el)object).addElement(new de(aw.aM[0], this, 9999, (q)this.W.elementAt(this.ak)));
        main.a.F.a((el)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        q q2 = (q)this.W.elementAt(this.ak);
        object = this;
        String string = "|0|1|" + q2.e;
        string = String.valueOf(string) + "\n|1|Top " + q2.h;
        string = String.valueOf(string) + "\n|1|" + q2.f;
        string = String.valueOf(string) + "\n|2|" + q2.i;
        ((g)object).ai = new ae();
        super.a(((g)object).ai, string);
        ((g)object).bL = new int[]{q2.a, q2.d, q2.c};
        ((g)object).bC = null;
        ((g)object).cH = null;
    }

    private void ab() {
        Object object;
        if (this.B == 0 && this.equals(main.a.G)) {
            this.ae();
            return;
        }
        if (this.B == 0 && this.equals(main.a.H) || this.B == 2) {
            this.bC = this.equals(main.a.H) ? (h)main.a.H.V.elementAt(this.ak) : (h)main.a.G.V.elementAt(this.ak);
            ds.c("toi day select= " + this.ak);
            object = new el("");
            ((el)object).addElement(new de(aw.bj, this, 8000, this.bC));
            if (this.bC != null) {
                main.a.F.a((el)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            if (this.ak == this.O - 3) {
                if (this.aS) {
                    return;
                }
                object = this;
                if (((g)object).o == null) {
                    ((g)object).o = new cq();
                    ((g)object).o.a.b = main.a.B - 35 - cq.b().a.d;
                    ((g)object).o.a();
                    ((g)object).o.c = main.a.G;
                }
                ((g)object).o.h = aw.ec;
                ((g)object).o.a.i = aw.ed;
                ((g)object).o.g = "";
                ((g)object).o.b = true;
                ((g)object).o.a.c(1);
                ((g)object).o.a.b(10);
                if (main.a.e) {
                    ((g)object).o.a.a();
                }
            } else if (this.ak == this.O - 2) {
                if (!this.aT) {
                    boolean bl2 = this.aS = !this.aS;
                    if (this.aS) {
                        bt.a().a((byte)5, -1, (byte)-1, -1);
                    } else {
                        this.A();
                        bp.a();
                        bt.a().a((byte)3, -1, (byte)-1, -1);
                    }
                } else {
                    this.aT = false;
                }
            } else if (this.ak == this.O - 1) {
                if (this.aS && !this.aT && this.m) {
                    main.a.a(aw.eu, new de(aw.bn, this, 7002, null), new de(aw.bo, this, 4005, null));
                }
            } else {
                if (this.aS) {
                    return;
                }
                this.bC = (h)main.a.G.U.elementAt(this.ak);
                object = new el("");
                ((el)object).addElement(new de(aw.bj, this, 8000, this.bC));
                if (this.bC != null) {
                    main.a.F.a((el)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                    this.b(this.bC);
                } else {
                    this.ai = null;
                }
            }
        }
        if (main.a.e) {
            this.ak = -1;
        }
    }

    private void ac() {
        if (this.B == 0) {
            if (this.ak == -1) {
                return;
            }
            if (this.k.size() == 0) {
                return;
            }
            if (this.ak == this.k.size()) {
                this.cc = -1;
                this.ak = main.a.e ? -1 : 0;
                bp.a();
                bt.a().a((byte)1, this.k);
                return;
            }
            if (this.ak > this.k.size() - 1) {
                return;
            }
            this.bC = (h)main.a.G.k.elementAt(this.ak);
            el el2 = new el("");
            el2.addElement(new de(aw.dY, this, 6001, this.bC));
            if (this.bC != null) {
                main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            this.ae();
        }
    }

    private void ad() {
        if (this.ak < 0) {
            return;
        }
        if (af.e().aE[this.ak].d && !af.e().aE[this.ak].e) {
            if (!main.a.e) {
                bt.a().b(this.ak);
                return;
            }
            if (main.a.p > this.ae + this.ag - 40) {
                bt.a().b(this.ak);
            }
        }
    }

    private void ae() {
        ds.c("fire inventory");
        if (af.e().H == 14) {
            main.a.a(aw.ex);
            return;
        }
        if (this.ak == -1) {
            return;
        }
        if (this.ak == 0) {
            this.a(af.e().aH.length + af.e().aF.length, false, false);
            return;
        }
        this.bC = null;
        el el2 = new el("");
        if (!g.a(this.ak, this.bO, af.e().aH)) {
            h h2 = af.e().aF[g.b(this.ak, this.bO, af.e().aH)];
            if (h2 != null) {
                this.bC = h2;
                if (main.a.G.A == 12) {
                    el2.addElement(new de(aw.ey, this, 6000, this.bC));
                } else if (main.a.G.A == 13) {
                    el2.addElement(new de(aw.ez, this, 7000, this.bC));
                } else if (h2.b()) {
                    el2.addElement(new de(aw.bm, this, 2000, this.bC));
                    if (af.e().bO) {
                        el2.addElement(new de(aw.ea, this, 2005, this.bC));
                    }
                } else {
                    el2.addElement(new de(aw.bm, this, 2001, this.bC));
                }
            }
        } else {
            h h3 = af.e().aH[g.c(this.ak, this.bO)];
            if (h3 != null) {
                this.bC = h3;
                el2.addElement(new de(aw.dY, this, 2002, this.bC));
            }
        }
        if (this.bC != null) {
            af.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (main.a.G.A != 12 && main.a.G.A != 13) {
                if (this.bH == 0) {
                    el2.addElement(new de(aw.dZ, this, 2003, this.bC));
                }
                if (this.bH == 1) {
                    el2.addElement(new de(aw.eb, this, 3002, this.bC));
                }
            }
            main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
            return;
        }
        this.ai = null;
    }

    private void af() {
        this.A();
        if (aq.f == null || aq.f.size() == 0) {
            bt.a().b(0, -1);
        }
        aq.a().b();
    }

    private void ag() {
        block36: {
            block35: {
                if (this.ak < 0) {
                    return;
                }
                if (bu.a && this.ak == G.length - 1) {
                    bt.a().w();
                    return;
                }
                if (af.e().bO) break block35;
                switch (this.ak) {
                    case 0: {
                        this.af();
                        return;
                    }
                    case 1: {
                        bt.a().j(54);
                        return;
                    }
                    case 2: {
                        this.ah();
                        return;
                    }
                    case 3: {
                        bt.a().b((byte)0, (byte)-1);
                        bp.a();
                        return;
                    }
                    case 4: {
                        if (af.e().H == 14) {
                            main.a.a(aw.ex);
                            return;
                        }
                        bt.a().h();
                        return;
                    }
                    case 5: {
                        main.a.h();
                        if (af.e().Y() < 5) {
                            main.a.a(aw.eA);
                            return;
                        }
                        if (this.o == null) {
                            this.o = new cq();
                            this.o.a.b = main.a.B - 35 - cq.b().a.d;
                            this.o.a();
                            this.o.c = main.a.G;
                        }
                        this.o.h = aw.eB;
                        this.o.a.i = aw.bq;
                        this.o.g = "";
                        this.o.b = true;
                        this.o.a.c(0);
                        if (main.a.e) {
                            this.o.a.a();
                            return;
                        }
                        break block36;
                    }
                    case 6: {
                        this.at();
                        return;
                    }
                    case 7: {
                        this.ar();
                        return;
                    }
                    case 8: {
                        x.g();
                        return;
                    }
                    case 9: {
                        if (main.a.I.n) {
                            bu.a();
                            bu.h();
                            return;
                        }
                        break block36;
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (this.ak) {
                case 0: {
                    this.af();
                    return;
                }
                case 1: {
                    bt.a().j(54);
                    return;
                }
                case 2: {
                    this.ah();
                    return;
                }
                case 3: {
                    g g2 = this;
                    bp.a();
                    bt.a().t();
                    g2.bM = 20;
                    return;
                }
                case 4: {
                    bt.a().b((byte)0, (byte)-1);
                    bp.a();
                    return;
                }
                case 5: {
                    if (af.e().H == 14) {
                        main.a.a(aw.ex);
                        return;
                    }
                    bt.a().h();
                    return;
                }
                case 6: {
                    main.a.h();
                    if (af.e().Y() < 5) {
                        main.a.a(aw.eA);
                        return;
                    }
                    if (this.o == null) {
                        this.o = new cq();
                        this.o.a.b = main.a.B - 35 - cq.b().a.d;
                        this.o.a();
                        this.o.c = main.a.G;
                    }
                    this.o.h = aw.eB;
                    this.o.a.i = aw.bq;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(0);
                    if (!main.a.e) break;
                    this.o.a.a();
                    return;
                }
                case 7: {
                    this.at();
                    return;
                }
                case 8: {
                    this.ar();
                    return;
                }
                case 9: {
                    x.g();
                    return;
                }
                case 10: {
                    if (!main.a.I.n) break;
                    bu.a();
                    bu.h();
                }
            }
        }
    }

    private void ah() {
        this.O = at.size();
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.A = 23;
        this.c(0);
    }

    private void ai() {
        this.o.h = aw.dx;
        this.o.a.i = aw.dx;
        this.o.g = "";
        this.o.b = true;
        this.o.a.e = true;
        this.o.a.c(0);
        if (main.a.e) {
            this.o.a.a();
        }
    }

    public final void C() {
        if (this.j == null) {
            this.j = new dr();
        }
        this.j.m = this.o.a.d();
        this.j.a(false);
        this.o.b = false;
    }

    private void b(r r2) {
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = r2.e ? String.valueOf(string) + "|4|1|" + aw.cN : String.valueOf(string) + "|3|1|" + aw.cO;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + aw.da + ": " + r2.a;
        this.ai = new ae();
        this.a(this.ai, string);
        this.cH = r2.c;
        this.bC = null;
    }

    private void aj() {
        if (this.ak < 0) {
            return;
        }
        if (this.X.size() == 0) {
            return;
        }
        el el2 = new el("");
        this.cG = this.ak;
        el2.addElement(new de(aw.br, this, 10000, (r)this.X.elementAt(this.cG)));
        el2.addElement(new de(aw.bk, this, 10001, (r)this.X.elementAt(this.cG)));
        main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        this.b((r)this.X.elementAt(this.ak));
    }

    private void ak() {
        if (this.ak < 0) {
            return;
        }
        if (this.T.size() == 0) {
            return;
        }
        el el2 = new el("");
        this.cG = this.ak;
        el2.addElement(new de(aw.bq, this, 8001, (r)this.T.elementAt(this.cG)));
        el2.addElement(new de(aw.bk, this, 8002, (r)this.T.elementAt(this.cG)));
        el2.addElement(new de(aw.gn, this, 8004, (r)this.T.elementAt(this.cG)));
        main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        this.b((r)this.T.elementAt(this.ak));
    }

    private void al() {
        if (this.ak < 0) {
            return;
        }
        el el2 = new el("");
        this.cG = this.ak;
        el2.addElement(new de(aw.bR, this, 10030, null));
        el2.addElement(new de(aw.bA, this, 10031, null));
        main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
    }

    private void am() {
        if (this.ak == 0) {
            this.au = !this.au;
            eu.a("viewchat", this.au ? 1 : 0);
            if (main.a.e) {
                this.ak = -1;
            }
            return;
        }
        if (this.ak < 0) {
            return;
        }
        if (this.bG.size() == 0) {
            return;
        }
        Object object = new el("");
        this.cG = this.ak - 1;
        ((el)object).addElement(new de(aw.bq, this, 8001, (r)this.bG.elementAt(this.cG)));
        ((el)object).addElement(new de(aw.cP, this, 8003, (r)this.bG.elementAt(this.cG)));
        main.a.F.a((el)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        r r2 = (r)this.bG.elementAt(this.ak - 1);
        object = this;
        String string = "|0|1|" + r2.c.ag;
        string = String.valueOf(string) + "\n";
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + ds.a(r2.a, "|", 0)[2];
        ((g)object).ai = new ae();
        super.a(((g)object).ai, string);
        ((g)object).cH = r2.c;
        ((g)object).bC = null;
    }

    private void d(int n2) {
        String string = "";
        int n3 = 0;
        if (this.ak == 0) {
            n3 = af.e().cr + 1000;
        }
        if (this.ak == 1) {
            n3 = af.e().cs + 1000;
        }
        if (this.ak == 2) {
            n3 = af.e().cq * af.e().cD;
        }
        if (this.ak == 3) {
            n3 = 500000 + af.e().ct * 100000;
        }
        string = String.valueOf(string) + "|5|2|" + aw.bm + " " + n3 + " " + aw.fi;
        if (n2 == 0) {
            string = String.valueOf(string) + "\n|5|2|" + aw.fm;
        }
        if (n2 == 1) {
            string = String.valueOf(string) + "\n|5|2|" + aw.fn;
        }
        if (n2 == 2) {
            string = String.valueOf(string) + "\n|5|2|" + aw.fo;
        }
        if (n2 == 3) {
            string = String.valueOf(string) + "\n|5|2|" + aw.fo;
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.bK = -1;
        this.ai = new ae();
        this.a(this.ai, string);
    }

    private void an() {
        if (this.ak == -1) {
            return;
        }
        ds.c("FIRE ZONE");
        this.cI = true;
        main.a.G.A();
    }

    public final void a(int n2, int n3) {
        this.ai.d[this.ai.d.length - 1] = String.valueOf(aw.cZ) + " " + n2 + "/" + n3;
    }

    private void ao() {
        if (this.ak < 0) {
            return;
        }
        this.bC = null;
        el el2 = new el("");
        if (this.B == 0 && !this.equals(main.a.H)) {
            if (this.ak == 0) {
                this.a(af.e().aG.length, false, true);
            } else {
                byte by2 = (byte)g.c(this.ak, this.bO);
                h h2 = af.e().aG[by2];
                if (h2 != null) {
                    if (this.aj) {
                        el2.addElement(new de(aw.dY, this, 1000, h2));
                        el2.addElement(new de(aw.bm, this, 2010, h2));
                    } else if (h2.b()) {
                        el2.addElement(new de(aw.dY, this, 1000, h2));
                    } else {
                        el2.addElement(new de(aw.dY, this, 1000, h2));
                    }
                    this.bC = h2;
                }
            }
        }
        if (this.B == 1 || this.equals(main.a.H)) {
            if (this.ak == 0) {
                this.a(af.e().aH.length + af.e().aF.length, true, false);
            } else {
                Object object = af.e().aH;
                boolean bl2 = g.a(this.ak, this.bO, object);
                if (!bl2) {
                    byte by3 = (byte)g.b(this.ak, this.bO, object);
                    h h3 = af.e().aF[by3];
                    if (h3 != null) {
                        el2.addElement(new de(aw.cC, this, 1001, h3));
                        if (h3.b()) {
                            el2.addElement(new de(aw.bm, this, 2000, h3));
                        } else {
                            el2.addElement(new de(aw.bm, this, 2001, h3));
                        }
                        this.bC = h3;
                    }
                } else {
                    object = af.e().aH[g.c(this.ak, this.bO)];
                    if (object != null) {
                        el2.addElement(new de(aw.cD, this, 1002, object));
                        this.bC = object;
                    }
                }
            }
        }
        if (this.bC != null) {
            af.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (this.aj) {
                el2.addElement(new de(aw.dZ, this, 2011, this.bC));
            }
            main.a.F.a(el2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
        } else {
            this.ai = null;
        }
        this.aI = this.O * this.aD - this.ah;
    }

    public final void a(byte by2, String string, byte by3, byte by4) {
        main.a.h();
        co co2 = new co();
        new co().c = by2;
        co2.a = by4;
        co2.b = by3;
        main.a.a(string, new de(aw.bn, this, 2004, co2), new de(aw.bo, this, 4005, null));
    }

    public final void a(byte by2, String string, short s2) {
        co co2 = new co();
        new co().c = by2;
        co2.a = s2;
        main.a.a(string, new de(aw.bn, this, 3003, co2), new de(aw.bo, this, 4005, null));
    }

    public final void a(int n2, Object object) {
        eh eh2;
        eh eh3;
        h h2;
        int n3;
        Object object2;
        if (n2 == 9999) {
            object2 = (q)object;
            bt.a().w(((q)object2).g);
        }
        if (n2 == 170391) {
            eu.a();
            if (en.b > 1) {
                eu.a("levelScreenKN", 1);
            } else {
                eu.a("levelScreenKN", 0);
            }
            GameMidlet.f.a();
        }
        if (n2 == 6001) {
            object2 = (h)object;
            ((h)object).f = false;
            main.a.G.k.removeElement(object2);
            if (main.a.G.B == 0) {
                main.a.G.o();
            }
        }
        if (n2 == 6000) {
            object2 = (h)object;
            n3 = 0;
            while (n3 < main.a.G.k.size()) {
                h2 = (h)main.a.G.k.elementAt(n3);
                if (h2.b.a == ((h)object2).b.a) {
                    main.a.a(aw.ej);
                    return;
                }
                ++n3;
            }
            ((h)object2).f = true;
            main.a.G.k.addElement(object2);
            if (main.a.G.B == 0) {
                main.a.G.o();
            }
        }
        if (n2 == 7000) {
            if (this.aS) {
                main.a.a(aw.ek);
                return;
            }
            object2 = (h)object;
            n3 = 0;
            while (n3 < main.a.G.U.size()) {
                h2 = (h)main.a.G.U.elementAt(n3);
                if (h2.g == ((h)object2).g) {
                    main.a.a(aw.ej);
                    return;
                }
                ++n3;
            }
            if (((h)object2).h > 1) {
                g g2 = this;
                if (g2.o == null) {
                    g2.o = new cq();
                    g2.o.a.b = main.a.B - 35 - cq.b().a.d;
                    g2.o.a();
                    g2.o.c = main.a.G;
                }
                g2.o.h = aw.eg;
                g2.o.a.i = aw.eh;
                g2.o.g = "";
                g2.o.b = true;
                g2.o.a.c(1);
                if (main.a.e) {
                    g2.o.a.a();
                }
                return;
            }
            ((h)object2).f = true;
            h h3 = new h();
            new h().b = ((h)object2).b;
            h3.a = ((h)object2).a;
            h3.g = ((h)object2).g;
            main.a.G.U.addElement(h3);
            bt.a().a((byte)2, -1, (byte)h3.g, h3.h);
        }
        if (n2 == 7001) {
            object2 = (h)object;
            ((h)object).f = false;
            main.a.G.U.removeElement(object2);
            if (main.a.G.B == 1) {
                main.a.G.a(true);
            }
            bt.a().a((byte)4, -1, (byte)((h)object2).g, -1);
        }
        if (n2 == 7002) {
            this.aT = true;
            main.a.h();
            bt.a().a((byte)7, -1, (byte)-1, -1);
            this.A();
        }
        if (n2 == 8003) {
            object2 = (r)object;
            bt.a().a((byte)1, ((r)object2).c.J);
        }
        if (n2 == 8002) {
            object2 = (r)object;
            bt.a().a((byte)2, ((r)object2).c.J);
        }
        if (n2 == 8004) {
            object2 = (r)object;
            bt.a().a(((r)object2).c.J);
        }
        if (n2 == 8001) {
            ds.c("chat player");
            object2 = (r)object;
            if (this.o == null) {
                this.o = new cq();
                this.o.a.b = main.a.B - 35 - cq.b().a.d;
                this.o.a();
                this.o.c = main.a.G;
            }
            this.o.h = aw.cQ;
            this.o.a.i = String.valueOf(aw.cR) + " " + ((r)object2).c.ag;
            this.o.g = "";
            this.o.b = true;
            this.o.a.e = true;
            this.o.a.c(0);
            if (main.a.e) {
                this.o.a.a();
            }
        }
        if (n2 == 1000) {
            bt.a().a((byte)0, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 1001) {
            byte by2 = (byte)g.b(this.ak, this.bO, af.e().aH);
            bt.a().a(bj, by2);
        }
        if (n2 == 1003) {
            this.A();
        }
        if (n2 == 1002) {
            bt.a().a(bk, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 2011) {
            bt.a().a((byte)1, (byte)2, (byte)g.c(this.ak, this.bO), (short)-1);
        }
        if (n2 == 2010) {
            bt.a().a((byte)0, (byte)2, (byte)g.c(this.ak, this.bO), (short)-1);
            h h4 = (h)object;
            if (h4 != null && (h4.b.a == 193 || h4.b.a == 194)) {
                main.a.G.A();
            }
        }
        if (n2 == 2000) {
            h[] hArray = af.e().aH;
            byte by3 = (byte)g.b(this.ak, this.bO, hArray);
            bt.a().a(bl, by3);
        }
        if (n2 == 2001) {
            ds.c("use item");
            h h5 = (h)object;
            boolean bl2 = g.a(this.ak, this.bO, af.e().aH);
            byte by4 = !bl2 ? (byte)g.b(this.ak, this.bO, af.e().aH) : (byte)g.c(this.ak, this.bO);
            bt.a().a((byte)0, (byte)(!bl2 ? 1 : 0), by4, (short)-1);
            if (h5.b.a == 193 || h5.b.a == 194) {
                main.a.G.A();
            }
        }
        if (n2 == 2002) {
            bt.a().a(bm, (byte)g.c(this.ak, this.bO));
        }
        if (n2 == 2003) {
            ds.c("remove item");
            boolean bl3 = g.a(this.ak, this.bO, af.e().aH);
            byte by5 = !bl3 ? (byte)g.b(this.ak, this.bO, af.e().aH) : (byte)g.c(this.ak, this.bO);
            bt.a().a((byte)1, (byte)(!bl3 ? 1 : 0), by5, (short)-1);
        }
        if (n2 == 2004) {
            main.a.h();
            co co2 = (co)object;
            byte by6 = (byte)co2.b;
            byte by7 = (byte)co2.a;
            bt.a().a((byte)(co2.c == 0 ? 3 : 2), by6, by7, (short)-1);
        }
        if (n2 == 2005) {
            byte by8 = (byte)g.b(this.ak, this.bO, af.e().aH);
            bt.a().a(bn, by8);
        }
        if (n2 == 2006) {
            af.f();
            byte by9 = (byte)this.ak;
            bt.a().a(bo, by9);
        }
        if (n2 == 30001) {
            ds.c("nhan do");
            bt.a().a((byte)0, this.ak, 0);
        }
        if (n2 == 30002) {
            ds.c("xoa do");
            bt.a().a((byte)1, this.ak, 0);
        }
        if (n2 == 30003) {
            ds.c("nhan tat");
            bt.a().a((byte)2, this.ak, 0);
        }
        if (n2 == 3000) {
            ds.c("mua do");
            h h6 = (h)object;
            bt.a().a((byte)0, (int)h6.b.a, 0);
        }
        if (n2 == 3001) {
            h h7 = (h)object;
            main.a.L.b();
            bt.a().a((byte)1, (int)h7.b.a, 0);
        }
        if (n2 == 3002) {
            main.a.h();
            boolean bl4 = g.a(this.ak, this.bO, af.e().aH);
            byte by10 = !bl4 ? (byte)g.b(this.ak, this.bO, af.e().aH) : (byte)g.c(this.ak, this.bO);
            bt.a().a((byte)0, (byte)(!bl4 ? 1 : 0), by10);
        }
        if (n2 == 3003) {
            main.a.h();
            co co3 = (co)object;
            bt.a().a((byte)1, (byte)co3.c, (short)co3.a);
        }
        if (n2 == 3004) {
            h h8 = (h)object;
            bt.a().a((byte)3, (int)h8.b.a, 0);
        }
        if (n2 == 3005) {
            ds.c("mua do");
            h h9 = (h)object;
            bt.a().a((byte)3, (int)h9.b.a, 0);
        }
        if (n2 == 4000 && (eh3 = (eh)object) != null) {
            main.a.h();
            bt.a().a(2, null, eh3.a);
        }
        if (n2 == 4001 && (eh2 = (eh)object) != null) {
            bp.a();
            this.ao = aw.aC;
            bt.a().e(eh2.a);
        }
        if (n2 == 4005) {
            main.a.h();
        }
        if (n2 == 4007) {
            main.a.h();
        }
        if (n2 == 4006) {
            cb cb2 = (cb)object;
            bt.a().d(cb2.a);
        }
        if (n2 == 5001) {
            e e2 = (e)object;
            bt.a().b(e2.a, (byte)0);
        }
        if (n2 == 5002) {
            e e3 = (e)object;
            bt.a().b(e3.a, (byte)1);
        }
        if (n2 == 5003) {
            e e4 = (e)object;
            bt.a().b(e4.a, (byte)2);
        }
        if (n2 == 5004) {
            e e5 = (e)object;
            bt.a().b(e5.a, (byte)-1);
        }
        if (n2 == 9000) {
            bt.a().a(this.ak, 1);
            main.a.h();
            bp.a();
        }
        if (n2 == 9006) {
            bt.a().a(this.ak, 10);
            main.a.h();
            bp.a();
        }
        if (n2 == 9007) {
            bt.a().a(this.ak, 100);
            main.a.h();
            bp.a();
        }
        if (n2 == 9002) {
            bf bf2 = (bf)object;
            if (bf2.a.c()) {
                main.a.a(aw.b);
            } else {
                main.a.a(String.valueOf(aw.eS) + bf2.d + aw.eT + bf2.l + aw.eU);
            }
        }
        if (n2 == 9003) {
            if (main.a.e) {
                p.j();
                p.a((et)object);
            } else {
                p.j();
                p.b((et)object);
            }
        }
        if (n2 == 9004) {
            bf bf3 = (bf)object;
            if (bf3.a.c()) {
                main.a.a(aw.a);
            } else {
                main.a.a(String.valueOf(aw.eS) + bf3.d + aw.eT + bf3.l + aw.eU);
            }
        }
        if (n2 == 10000) {
            r r2 = (r)object;
            bt.a().b((byte)1, r2.c.J);
            main.a.G.z();
        }
        if (n2 == 10001) {
            r r3 = (r)object;
            bt.a().b((byte)2, r3.c.J);
            bp.a();
        }
        if (n2 == 10012) {
            if (this.o == null) {
                this.o = new cq();
                this.o.a.b = main.a.B - 35 - cq.b().a.d;
                this.o.a();
                this.o.c = main.a.H == null ? main.a.G : main.a.H;
            }
            this.o.a.c(1);
            this.o.a.a("");
            if (this.bC.h == 1) {
                this.o.h = aw.fI;
                this.o.a.i = aw.ed;
            } else {
                this.o.h = String.valueOf(aw.eh) + " ";
                this.o.a.i = aw.eh;
            }
            this.o.a.b(10);
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (main.a.e) {
                this.o.a.a();
            }
        }
        if (n2 == 10013) {
            if (this.o == null) {
                this.o = new cq();
                this.o.a.b = main.a.B - 35 - cq.b().a.d;
                this.o.a();
                this.o.c = main.a.H == null ? main.a.G : main.a.H;
            }
            this.o.a.c(1);
            this.o.a.a("");
            if (this.bC.h == 1) {
                this.o.h = aw.fJ;
                this.o.a.i = aw.ed;
            } else {
                this.o.h = String.valueOf(aw.eh) + "  ";
                this.o.a.i = aw.eh;
            }
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (main.a.e) {
                this.o.a.a();
            }
        }
        if (n2 == 10014) {
            h h10 = (h)object;
            bt.a().a((byte)1, h10.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10015) {
            h h11 = (h)object;
            bt.a().a((byte)2, h11.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10016) {
            h h12 = (h)object;
            bt.a().a((byte)3, h12.d, (byte)0, h12.n, -1);
            bp.a();
        }
        if (n2 == 10017) {
            h h13 = (h)object;
            bt.a().a((byte)3, h13.d, (byte)1, h13.p, -1);
            bp.a();
        }
        if (n2 == 10018) {
            h h14 = (h)object;
            bt.a().a((byte)5, h14.d, (byte)-1, -1, -1);
            bp.a();
        }
        if (n2 == 10019) {
            br.a().e();
            eu.a(eu.e, "");
            eu.a(eu.f, "");
            main.a.I.b.a("");
            main.a.I.a.a("");
            main.a.I.n = false;
            main.a.ak.b();
            main.a.h();
            this.A();
        }
        if (n2 == 10020) {
            main.a.h();
        }
        if (n2 == 10030) {
            bt.a().b((byte)1, (byte)this.ak);
            main.a.G.z();
        }
        if (n2 == 10031) {
            br.a().e();
        }
        if (n2 == 11000) {
            bt.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, 1);
            main.a.h();
        }
        if (n2 == 11001) {
            bt.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, this.bC.i);
            main.a.h();
        }
        if (n2 == 11002) {
            this.o.b = false;
            main.a.h();
        }
    }

    public final void a(String object, String object2) {
        if (this.o.a.d() == null || this.o.a.d().equals("") || ((String)object).equals("") || object == null) {
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(aw.dt)) {
            bp.a();
            this.o.b = false;
            bt.a().a((String)object);
            return;
        }
        if (this.o.h.equals(aw.dv)) {
            bp.a();
            this.o.b = false;
            bt.a().a(0, (String)object, -1);
            return;
        }
        if (this.o.h.equals(aw.dw)) {
            if (this.o.a.d() == "") {
                p.aD.a(aw.dG, 0);
                return;
            }
            if (this.j == null) {
                this.j = new dr();
            }
            this.j.m = this.o.a.d();
            this.j.a(false);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(aw.dx)) {
            if (this.o.a.d() == "") {
                p.aD.a(aw.dH, 0);
                return;
            }
            bt.a().a((byte)4, af.e().ai.b, this.o.a.d());
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(aw.fY)) {
            try {
                int n2 = Integer.parseInt(this.o.a.d());
                this.o.b = false;
                this.o.a.c(0);
                this.A();
                if (this.o.a.d().length() != 6 || this.o.a.d().equals("")) {
                    main.a.a(aw.fZ);
                    return;
                }
                bt.a().x(n2);
                this.o.b = false;
                this.o.a.c(0);
                this.A();
                return;
            }
            catch (Exception exception) {
                main.a.a(aw.R);
                return;
            }
        }
        if (this.o.h.equals(aw.eB)) {
            if (this.o.a.d().equals("")) {
                return;
            }
            bt.a().e(this.o.a.d());
            this.o.b = false;
            this.A();
            return;
        }
        if (this.o.h.equals(aw.cQ)) {
            this.o.b = false;
            object2 = null;
            if (this.A == 8) {
                object2 = (r)this.bG.elementAt(this.cG);
            } else if (this.A == 11) {
                object2 = (r)this.T.elementAt(this.cG);
            }
            if (((r)object2).c.J == af.e().J) {
                return;
            }
            bt.a().a((String)object, ((r)object2).c.J);
            return;
        }
        if (this.o.h.equals(aw.eg)) {
            int n3;
            try {
                n3 = Integer.parseInt(this.o.a.d());
            }
            catch (Exception exception) {
                main.a.a(aw.ei);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            if (n3 <= 0 || n3 > this.bC.h) {
                main.a.a(aw.ei);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            this.bC.f = true;
            object = new h();
            new h().b = this.bC.b;
            ((h)object).h = n3;
            ((h)object).g = this.bC.g;
            ((h)object).a = this.bC.a;
            main.a.G.U.addElement(object);
            bt.a().a((byte)2, -1, (byte)((h)object).g, ((h)object).h);
            this.o.b = false;
            this.o.a.c(0);
            return;
        }
        if (this.o.h == aw.ec) {
            int n4;
            try {
                n4 = Integer.parseInt(this.o.a.d());
            }
            catch (Exception exception) {
                main.a.a(aw.ee);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            if ((long)n4 > af.e().at) {
                main.a.a(aw.ef);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            this.aR = n4;
            bt.a().a((byte)2, -1, (byte)-1, n4);
            this.o.b = false;
            this.o.a.c(0);
            return;
        }
        if (this.o.h.equals(aw.fI)) {
            try {
                bt.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.d()), 1);
            }
            catch (Exception exception) {
                main.a.a(aw.ee);
            }
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(aw.fI) + " ")) {
            try {
                bt.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.d()), this.bC.i);
            }
            catch (Exception exception) {
                main.a.a(aw.ee);
            }
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(aw.fJ)) {
            this.e(0);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(aw.fJ) + "  ")) {
            this.e(1);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(aw.eh) + " ")) {
            this.bC.i = Integer.parseInt(this.o.a.d());
            if (this.bC.i > this.bC.h) {
                main.a.a(aw.ei);
                return;
            }
            this.cJ = true;
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(aw.eh) + "  ")) {
            this.bC.i = Integer.parseInt(this.o.a.d());
            if (this.bC.i > this.bC.h) {
                main.a.a(aw.ei);
                return;
            }
            this.cK = true;
            this.o.b = false;
        }
    }

    public final void D() {
        this.o.a.c(0);
    }

    public final void b(int n2) {
        this.cX = n2;
        this.cM = 90;
        if (this.cX == 0) {
            this.cQ = 5;
            this.cO = 90;
            this.cN = 90;
            this.cW = 2;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h2 = (h)this.k.elementAt(n2);
                if (h2 != null) {
                    if (h2.b.b == 14) {
                        this.de = h2.b.f;
                    } else {
                        this.aA = h2.b.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 1) {
            this.cQ = 2;
            this.cO = 0;
            this.cN = 0;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h3 = (h)this.k.elementAt(n2);
                if (h3 != null) {
                    if (n2 == 0) {
                        this.aA = h3.b.f;
                    } else {
                        this.de = h3.b.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 2) {
            this.cQ = 7;
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h4 = (h)this.k.elementAt(n2);
                if (h4 != null) {
                    this.aA = h4.b.f;
                }
                ++n2;
            }
        } else if (this.cX == 3) {
            this.ax = main.a.C;
            this.ay = main.a.D;
            this.cQ = 1;
            this.cO = 1;
            this.cN = 1;
            this.cW = 4;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h5 = (h)this.k.elementAt(n2);
                if (h5 != null) {
                    this.aA = h5.b.f;
                }
                ++n2;
            }
        } else if (this.cX == 4) {
            this.cQ = this.k.size();
            this.df = new short[this.cQ];
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                h h6 = (h)this.k.elementAt(n2);
                if (h6 != null) {
                    this.df[n2] = h6.b.f;
                }
                ++n2;
            }
        }
        this.cR = 1;
        this.db = true;
        this.az = false;
        this.dc = false;
        this.cP = 360 / this.cQ;
        this.cS = new int[this.cQ];
        this.cT = new int[this.cQ];
        this.cU = new int[this.cQ];
        this.cV = new int[this.cQ];
        this.aq();
        this.dd = true;
        this.cY = 10;
        this.cZ = 30;
        this.da = 10;
        this.a(this.aw, aw.B);
    }

    private void ap() {
        --this.cY;
        if (this.cY < 0) {
            this.cY = 0;
        }
        --this.cZ;
        if (this.cZ < 0) {
            this.cZ = 0;
        }
        if (this.cY == 0) {
            if (!this.dc) {
                if (this.cW > 0) {
                    if (this.av != -1) {
                        if (this.cX == 3) {
                            if (main.a.w % 10 == 0) {
                                ea ea2 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                                ei.a(ea2);
                                --this.cW;
                            }
                        } else {
                            if (main.a.w % 2 == 0) {
                                if (this.db) {
                                    if (this.cR < 40) {
                                        this.cR += 2;
                                    }
                                } else if (this.cR > 10) {
                                    this.cR -= 2;
                                }
                            }
                            if (this.cZ == 0) {
                                if (this.db) {
                                    if (this.cM > 0) {
                                        this.cM -= 5;
                                    } else if (main.a.w % 10 == 0) {
                                        this.db = false;
                                        --this.cW;
                                        this.cZ = 5;
                                        this.da = 10;
                                    }
                                } else if (this.cM < 90) {
                                    this.cM += 5;
                                } else if (main.a.w % 10 == 0) {
                                    this.db = true;
                                    this.cZ = 10;
                                }
                            }
                            this.cN = this.cO;
                            this.cN -= this.cR;
                            if (this.cN >= 360) {
                                this.cN -= 360;
                            }
                            if (this.cN < 0) {
                                this.cN += 360;
                            }
                            this.cO = this.cN;
                            this.aq();
                        }
                    }
                } else if (main.a.w % 20 == 0) {
                    this.dc = true;
                }
                if (main.a.w % 20 == 0) {
                    if (this.cX != 3) {
                        ax.a(132, this.ax, this.ay, 2);
                    }
                    ax.a(114, this.ax, this.ay + 20, 2);
                    return;
                }
            } else if (this.dc) {
                if (this.av == 1) {
                    if (this.da == 10) {
                        ea ea3 = new ea(22, this.ax - 3, this.ay + 25, 4, 1, 1);
                        ei.a(ea3);
                    }
                    --this.da;
                    if (this.da < 0) {
                        this.da = 0;
                    }
                    if (this.cM < 300) {
                        this.cM = ds.g(this.cM + 10);
                        if (this.cM == 20) {
                            this.a(this.aw, aw.C);
                        }
                    } else if (main.a.w % 20 == 0) {
                        if (main.a.A > 2 * ab) {
                            main.a.H = new g();
                            main.a.H.M[7] = new String[][]{{""}};
                            main.a.H.f();
                            main.a.H.s();
                        }
                        this.av = (byte)-1;
                        this.az = true;
                        if (this.cX == 4) {
                            main.a.G.z();
                        }
                    }
                    this.aq();
                    return;
                }
                if (this.av == 0) {
                    if (this.da == 10) {
                        if (this.cX == 2) {
                            ea ea4 = new ea(20, this.ax - 3, this.ay + 15, 4, 2, 1);
                            ei.a(ea4);
                        } else {
                            ea ea5 = new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                            ei.a(ea5);
                        }
                        this.a(this.aw, aw.E);
                        this.dd = false;
                    }
                    if (!this.dd) {
                        --this.da;
                        if (this.da < -50) {
                            this.da = -50;
                            if (this.cX < 3 && main.a.A > 2 * ab) {
                                main.a.H = new g();
                                main.a.H.M[7] = new String[][]{{""}};
                                main.a.H.f();
                                main.a.H.s();
                            }
                            this.av = (byte)-1;
                            this.az = true;
                            if (this.cX == 4) {
                                main.a.G.z();
                            }
                        }
                    }
                }
            }
        }
    }

    private void aq() {
        int n2 = 0;
        while (n2 < this.cT.length) {
            if (this.cN >= 360) {
                this.cN -= 360;
            }
            if (this.cN < 0) {
                this.cN += 360;
            }
            this.cT[n2] = ds.g(this.cM * ds.a(this.cN) / 1024);
            this.cS[n2] = ds.g(this.cM * ds.b(this.cN) / 1024);
            if (this.cN < 90) {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 90 && this.cN < 180) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 180 && this.cN < 270) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            } else {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            }
            this.cN -= this.cP;
            ++n2;
        }
    }

    private void a(int n2, String string) {
        if (this.cX < 3) {
            int n3 = 0;
            while (n3 < p.G.size()) {
                do do_ = (do)p.G.elementAt(n3);
                if (do_.df.a == n2) {
                    do_.a(string);
                }
                ++n3;
            }
        }
    }

    private void ar() {
        this.A = 19;
        this.c(0);
        g g2 = this;
        bu.a();
        bu.g();
        g2.O = H.length;
        g2.aD = 24;
        g2.ak = main.a.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void F(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < H.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                di.f.a(en2, H[n2], this.ae + 25, n4 + 6, 0);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void as() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                bu.a().b();
                return;
            }
            case 1: {
                bu.a().e();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                bu.a().d();
                return;
            }
            case 4: {
                bu.a().c();
            }
        }
    }

    private void at() {
        this.A = 20;
        this.c(0);
        g g2 = this;
        if (l.c == 5) {
            ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae};
            if (p.bk) {
                ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.o};
            }
        } else {
            ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.fT};
            if (p.bk) {
                ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.fT, aw.o};
            }
            if ((l.c == 2 || l.c == 7) && aw.fB != 2) {
                ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.fT};
                if (p.bk) {
                    ba = new String[]{aw.fX, aw.bN, aw.bO, aw.ae, aw.fT, aw.o};
                }
            }
        }
        g2.O = ba.length;
        g2.aD = 24;
        g2.ak = main.a.e ? -1 : 0;
        g2.aI = g2.O * g2.aD - g2.ah;
        if (g2.aI < 0) {
            g2.aI = 0;
        }
        g2.g = g2.f = g2.aJ[g2.B];
        if (g2.g < 0) {
            g2.f = 0;
            g2.g = 0;
        }
        if (g2.g > g2.aI) {
            g2.g = g2.f = g2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void G(en en2) {
        en2.e(this.ae, this.af, this.ag, this.ah);
        en2.a(0, -this.g);
        int n2 = 0;
        while (n2 < ba.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                en2.a(n2 == this.ak ? 16383818 : 15196114);
                en2.d(n3, n4, n5, n6);
                di.f.a(en2, ba[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(en2);
    }

    private void au() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                main.a.h();
                if (this.o == null) {
                    this.o = new cq();
                    this.o.a.b = main.a.B - 35 - cq.b().a.d;
                    this.o.a();
                    this.o.c = main.a.G;
                }
                this.o.a.a("");
                this.o.h = aw.fY;
                this.o.a.i = aw.fY;
                this.o.g = "";
                this.o.b = true;
                this.o.a.e = true;
                this.o.a.c(1);
                if (!main.a.e) break;
                this.o.a.a();
                return;
            }
            case 1: {
                bt.a().a((byte)0, -1);
                bp.a();
                return;
            }
            case 2: {
                bt.a().b((byte)0, -1);
                bp.a();
                return;
            }
            case 3: {
                this.l();
                if (this.o != null) break;
                this.o = new cq();
                this.o.a.b = main.a.B - 35 - cq.b().a.d;
                this.o.a();
                this.o.c = main.a.G;
                return;
            }
            case 4: {
                if (aw.fB == 2) {
                    Object object = "http://dragonball.indonaga.com/coda/?username=" + main.a.I.a.d();
                    this.z();
                    try {
                        GameMidlet.f.platformRequest((String)object);
                        return;
                    }
                    catch (Exception exception) {
                        object = exception;
                        exception.toString();
                        return;
                    }
                }
                this.z();
                if (af.e().aD.c <= 10) {
                    main.a.a(aw.fU);
                    return;
                }
                a.a().b();
                return;
            }
            case 5: {
                this.L();
            }
        }
    }

    public final void E() {
        this.A = 25;
        this.c(0);
        this.av();
        this.B = 0;
    }

    private void av() {
        this.aD = 24;
        this.O = af.e().aK[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final boolean F() {
        return this.A == 1;
    }

    private void e(int n2) {
        try {
            this.bC.t = Integer.parseInt(this.o.a.d());
        }
        catch (Exception exception) {
            main.a.a(aw.ee);
            this.o.b = false;
            return;
        }
        de de2 = new de(aw.bn, this, n2 == 0 ? 11000 : 11001, null);
        de de3 = new de(aw.bo, this, 11002, null);
        main.a.a(aw.f, de2, de3);
    }

    private static int f(int n2) {
        switch (n2) {
            case 4: {
                return 1269146;
            }
            case 1: {
                return 2786816;
            }
            case 5: {
                return 13279744;
            }
            case 3: {
                return 12537346;
            }
            case 2: {
                return 7078041;
            }
            case 6: {
                return 0xB10000;
            }
        }
        return -1;
    }

    private static byte g(int n2) {
        if (n2 < 0) {
            return 0;
        }
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return 0;
            }
            case 9: {
                return 4;
            }
            case 10: {
                return 1;
            }
            case 11: {
                return 5;
            }
            case 12: {
                return 3;
            }
            case 13: {
                return 2;
            }
        }
        return 6;
    }

    private static di h(int n2) {
        di di2 = di.k;
        switch (n2) {
            case -1: {
                di2 = di.k;
                break;
            }
            case 0: {
                di2 = di.f;
                break;
            }
            case 1: {
                di2 = di.h;
                break;
            }
            case 2: {
                di2 = di.b;
                break;
            }
            case 3: {
                di2 = di.p;
                break;
            }
            case 4: {
                di2 = di.r;
                break;
            }
            case 5: {
                di2 = di.q;
                break;
            }
            case 7: {
                di2 = di.a;
                break;
            }
            case 8: {
                di2 = di.d;
            }
        }
        return di2;
    }

    private void a(en en2, int n2, int n3, int n4, int n5) {
        if (n2 == 34) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = l.b("/mainImage/o_0.png");
            }
            if (this.dk != null) {
                en2.a(this.dk, n3, n4 + n5 - this.dk.getHeight(), 0);
                return;
            }
            this.dk = l.b("/mainImage/o_1.png");
            return;
        }
        if (n2 == 35) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = l.b("/mainImage/o_0.png");
            }
            if (this.dl != null) {
                en2.a(this.dl, n3, n4 + n5 - this.dl.getHeight(), 0);
                return;
            }
            this.dl = l.b("/mainImage/o_2.png");
            return;
        }
        if (n2 == 36) {
            if (this.dj != null) {
                en2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = l.b("/mainImage/o_0.png");
            }
            if (this.dm != null) {
                en2.a(this.dm, n3, n4 + n5 - this.dm.getHeight(), 0);
                return;
            }
            this.dm = l.b("/mainImage/o_3.png");
        }
    }

    private static void a(en en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 == 102 && n3 > ae.s) {
            n2 = g.g(n3);
            int n8 = n4;
            int n9 = n5;
            en en3 = en2;
            n6 = n2;
            n5 = n3 -= ae.s;
            n4 = n7;
            n3 = 34;
            n2 = n9;
            int n10 = n8;
            try {
                int n11 = (n3 << 1) + (n4 << 1);
                n11 /= n5;
                dh = dg.length;
                if (n5 > 4) {
                    dh = 2;
                }
                int n12 = 0;
                while (n12 < n5) {
                    int n13 = 0;
                    while (n13 < dh) {
                        int n14;
                        int n15 = n14 = dg[n13] > 1 ? (dg[n13] >> 1) + 1 : 1;
                        int n16 = n4;
                        int n17 = n3;
                        int n18 = main.a.w - (n13 << 2);
                        int n19 = n11 * n12;
                        int n20 = n10 + ((n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1))) >= 0 && n19 < n17 ? n19 % n17 : (n17 <= n19 && n19 < n17 + n16 ? n17 - n15 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n17 - (n19 - n16) % n17 - n15 : 0)));
                        n15 = n14;
                        n16 = n4;
                        n17 = n3;
                        n18 = main.a.w - (n13 << 2);
                        n19 = n11 * n12;
                        n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1));
                        n14 = n2 + (n19 >= 0 && n19 < n17 ? 0 : (n17 <= n19 && n19 < n17 + n16 ? n19 % n17 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n16 - n15 : n16 - (n19 - (n17 << 1)) % n16 - n15)));
                        en3.a(di[n6][n13]);
                        en3.d(n20, n14, dg[n13], dg[n13]);
                        ++n13;
                    }
                    ++n12;
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static di b(int n2, int n3) {
        switch (n2) {
            case 0: {
                return di.c;
            }
            case 1: {
                return di.h;
            }
            case 3: {
                return di.F;
            }
            case 4: {
                return di.b;
            }
            case 5: {
                return di.d;
            }
            case 6: {
                return di.a;
            }
            case 7: {
                return di.f;
            }
        }
        return di.c;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(int n2, int n3, h[] hArray) {
        void var2_4;
        void var1_3;
        int n4 = n2 - 1 + var1_3 * 20;
        boolean bl2 = var1_3 == false ? n4 < ((void)var2_4).length : false;
        return bl2;
    }

    private static int c(int n2, int n3) {
        n2 = n2 - 1 + n3 * 20;
        return n2;
    }

    private static int b(int n2, int n3, h[] hArray) {
        n2 = n2 - 1 + n3 * 20;
        return n2 -= hArray.length;
    }

    private boolean aw() {
        return this.A == 0 && this.B == 1 || this.A == 7 && this.B == 0;
    }

    private void ax() {
        if (this.ak >= 0) {
            if (main.a.i[4]) {
                --this.bO;
                if (this.bO < 0) {
                    this.bO = 0;
                    if (main.a.W) {
                        main.a.W = false;
                        main.a.G.ak = 0;
                        return;
                    }
                }
            } else if (main.a.i[6]) {
                ++this.bO;
                if (this.bO > this.dn - 1) {
                    this.bO = this.dn - 1;
                    if (main.a.H != null) {
                        main.a.W = true;
                        main.a.H.ak = 0;
                    }
                }
            }
        }
    }

    private void ay() {
        this.O();
        if (this.ak == 0) {
            this.ax();
        }
    }

    private int i(int n2) {
        int n3 = 20;
        int n4 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        this.dn = (byte)n4;
        if (this.bO > n4 - 1) {
            this.bO = n4 - 1;
        }
        if (n2 % 20 > 0 && this.bO == n4 - 1) {
            n3 = n2 % 20;
        }
        return ++n3;
    }

    private void a(int n2, boolean bl2, boolean bl3) {
        n2 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        int n3 = this.ae;
        this.bO = (main.a.p - n3) / this.aF;
        if (this.bO > n2 - 1) {
            this.bO = n2 - 1;
        }
        if (main.a.p < n3) {
            this.bO = 0;
        }
        if (!bl3) {
            this.b(bl2);
            return;
        }
        this.T();
    }
}

