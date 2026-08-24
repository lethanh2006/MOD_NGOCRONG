/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p
extends bb
implements bx {
    private boolean ct;
    private long cu;
    private long cv;
    public static boolean a = false;
    public static boolean b = false;
    public static p c;
    public static int d;
    public static int e;
    public static int f;
    private static int cw;
    private static int cx;
    public static int g;
    private static int cy;
    private static int cz;
    private static int cA;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static int cB;
    private static int cC;
    private static int cD;
    private static int cE;
    public static int l;
    public static int m;
    public static int n;
    private static int cF;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public de s;
    public static int t;
    public static ci[] u;
    public static cv[] v;
    public static by[] w;
    public static av[] x;
    public static cp[] y;
    public static int z;
    public static el A;
    public static el B;
    public static el C;
    public static el D;
    public static el E;
    private static el cG;
    public static el F;
    public static el G;
    public static el H;
    public static da[] I;
    private static int cH;
    public static int J;
    private static int cI;
    public dn[] K;
    public ek[] L;
    private static dv cJ;
    private static dv cK;
    public static int M;
    public static boolean N;
    private static boolean cL;
    private static boolean cM;
    private static boolean cN;
    private static boolean cO;
    private static boolean cP;
    private static boolean cQ;
    public static boolean O;
    public static boolean P;
    private static boolean cR;
    private static boolean cS;
    private static boolean cT;
    private static boolean cU;
    private static boolean cV;
    private static boolean cW;
    private static boolean cX;
    private static boolean cY;
    private static boolean cZ;
    private static boolean da;
    private static boolean db;
    private static boolean dc;
    private static boolean dd;
    private static boolean de;
    private static boolean df;
    private static boolean dg;
    private static boolean dh;
    private static boolean di;
    private static boolean dj;
    private static boolean dk;
    private static boolean dl;
    private static boolean dm;
    private static boolean dn;
    private static boolean do;
    private static boolean dp;
    private static boolean dq;
    private static boolean dr;
    private static boolean ds;
    private static boolean dt;
    private static boolean du;
    public static af Q;
    public static long[] R;
    private int dv = 0;
    public int[] S;
    public int[] T;
    public int[] U;
    public int[] V;
    public int[] W;
    public int[] X;
    public String[] Y;
    public String[] Z;
    public int aa = 0;
    public int ab = 0;
    private int dw = -1;
    private boolean dx;
    public static int[] ac;
    public static int[] ad;
    public static Image ae;
    public static Image af;
    public static Image ag;
    public static Image ah;
    public static Image ai;
    public static Image aj;
    public static Image ak;
    public static byte al;
    public static byte am;
    public static byte an;
    public static byte ao;
    public static byte ap;
    public static byte aq;
    public static byte ar;
    public static byte as;
    private static Image dy;
    private static Image dz;
    public static Image at;
    private static Image dA;
    private static Image dB;
    public static Image au;
    public static Image av;
    private static Image dC;
    private static Image dD;
    private static Image dE;
    private static Image dF;
    private static Image dG;
    private static Image dH;
    private static Image dI;
    private static Image dJ;
    private static Image dK;
    private static Image dL;
    public static Image aw;
    public static Image ax;
    public static Image ay;
    public static Image az;
    public static Image aA;
    public static Image aB;
    public static byte aC;
    public static eo aD;
    public static eo aE;
    private static Image dM;
    private static Image dN;
    private static Image dO;
    public static Image aF;
    private static Image dP;
    private static Image dQ;
    public static Image aG;
    public static Image aH;
    public static Image aI;
    public static Image aJ;
    public static Image aK;
    public aa aL;
    public k aM;
    private int dR;
    public static int aN;
    private static b dS;
    public static int aO;
    private static Image dT;
    private de dU;
    private de dV;
    private de dW;
    private de dX;
    public static bf[] aP;
    public static bf[] aQ;
    public de aR;
    private static int dY;
    public static long aS;
    public boolean aT;
    private boolean dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private boolean ef;
    public long aU;
    boolean aV;
    private boolean eg;
    private int eh;
    private int ei;
    private int ej;
    private int ek;
    public static boolean aW;
    private long el;
    private long em;
    public int aX;
    int aY;
    public boolean aZ;
    public boolean ba;
    private static Image en;
    public boolean bb = false;
    public boolean bc = false;
    private boolean eo = false;
    private int ep;
    private int eq;
    private int er;
    private int es;
    public boolean bd;
    private boolean et;
    public int be;
    public int bf;
    public int bg;
    public int bh;
    public int bi;
    private static int eu;
    public static boolean bj;
    public static boolean bk;
    public static boolean bl;
    private int ev;
    private int ew = 0;
    private int ex = -1;
    private bf ey;
    public String bm;
    private boolean ez;
    private int eA;
    private int eB = -1;
    private static long eC;
    private static long eD;
    private static long eE;
    private static long eF;
    private static int eG;
    private int eH = 0;
    public static int bn;
    public static Image bo;
    public static Image bp;
    public int[] bq;
    public static Image br;
    public String bs;
    private static int eI;
    public static boolean bt;
    public static int bu;
    private static int[] eJ;
    private static int[] eK;
    public static el bv;
    private int eL = 0;
    public static Image bw;
    private static int eM;
    private static int eN;
    private static int eO;
    private static int eP;
    private static int eQ;
    public static int bx;
    public static int by;
    private static int eR;
    private static int eS;
    private static int[] eT;
    private static int[] eU;
    private static int eV;
    private static int eW;
    public long bz;
    public long bA;
    public boolean bB;
    public long bC;
    public long bD;
    public boolean bE;
    private long eX;
    private long eY;
    private int eZ;
    public static String[] bF;
    public static int[] bG;
    public static int[] bH;
    private static int[] fa;
    private static int[] fb;
    private static int[] fc;
    public static int[] bI;
    public static int[] bJ;
    private static int[] fd;
    private static int[] fe;
    private static int[] ff;
    private static int[] fg;
    private static int[] fh;
    private static int[] fi;
    private static Image[] fj;
    private static int fk;
    private static int fl;
    private static long fm;
    private int fn;
    public static int bK;
    public static int bL;
    public static int bM;
    public static int bN;
    private static int fo;
    private static int fp;
    private static int fq;
    private static int fr;
    private de fs;
    public static boolean bO;
    public static boolean bP;
    public dz bQ;
    private static Vector ft;
    public boolean bR;
    private int[] fu;
    private int[] fv;
    private int[] fw;
    private int[] fx;
    private int[] fy;
    private int fz;
    private String fA;
    private int fB;
    private int fC;
    private int fD;
    private boolean fE;
    public byte bS;
    public boolean bT;
    public int bU;
    public static boolean bV;
    public static byte bW;
    public static byte bX;
    private String fF;
    private String[] fG;
    private static Image fH;
    public static cg bY;
    private static df fI;
    private static df fJ;
    private static Image fK;
    private static Image fL;
    private static Image fM;
    public static int bZ;
    public static int ca;
    public static long cb;
    public static String cc;
    public static int cd;
    public static boolean ce;
    public static byte cf;
    public static el cg;
    private static int fN;
    public static boolean ch;
    public static int ci;
    public static int cj;
    public static boolean ck;
    public static boolean cl;

    static {
        A = new el("vClan");
        new el("vPtMap");
        B = new el("vFriend");
        C = new el("vEnemies");
        D = new el("vCharInMap");
        E = new el("vItemMap");
        cG = new el("vMobAttack");
        new el("vSet");
        F = new el("vMob");
        G = new el("vNpc");
        H = new el("vFlag");
        cH = 0;
        J = -1;
        cI = 0;
        cJ = new dv();
        cK = new dv();
        new el("vItemUpGrade");
        N = false;
        cL = false;
        cM = false;
        cN = false;
        cO = false;
        cP = false;
        cQ = false;
        O = false;
        P = false;
        cR = false;
        cS = false;
        cT = false;
        cU = false;
        cV = false;
        cW = false;
        cX = false;
        cY = false;
        cZ = false;
        da = false;
        db = false;
        dc = false;
        dd = false;
        de = false;
        df = false;
        dg = false;
        dh = false;
        di = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        do = false;
        dp = false;
        dq = false;
        dr = false;
        ds = false;
        dt = false;
        du = false;
        ae = l.b("/mainImage/myTexture2dstat.png");
        af = l.b("/mainImage/myTexture2dlineColor20.png");
        ag = l.b("/mainImage/myTexture2dlineColor21.png");
        ah = l.b("/mainImage/myTexture2dlineColor22.png");
        ai = l.b("/mainImage/myTexture2dlineColor00.png");
        aj = l.b("/mainImage/myTexture2dlineColor01.png");
        ak = l.b("/mainImage/myTexture2dlineColor02.png");
        aC = 0;
        aD = new eo();
        aE = new eo();
        dS = new b();
        aO = 0;
        dT = l.b("/mainImage/i_pve_bar_0.png");
        l.b("/mainImage/i_pve_bar_1.png");
        fI = new df(l.b("/mainImage/i_pve_bar_0.png"), 6, 15);
        fJ = new df(l.b("/mainImage/i_pve_bar_1.png"), 38, 21);
        fK = l.b("/mainImage/i_vs.png");
        fL = l.b("/mainImage/i_charlife.png");
        fH = l.b("/mainImage/i_hp.png");
        fM = l.b("/mainImage/i_khung.png");
        aw = l.b("/mainImage/myTexture2dbtnl.png");
        ax = l.b("/mainImage/myTexture2dbtnlf.png");
        ay = l.b("/mainImage/myTexture2dbtnl2.png");
        az = l.b("/mainImage/myTexture2dbtnlf2.png");
        dM = l.b("/mainImage/myTexture2dpanel.png");
        dN = l.b("/mainImage/panel2.png");
        dO = l.b("/mainImage/myTexture2dHP.png");
        dP = l.b("/mainImage/SP.png");
        dQ = l.b("/mainImage/myTexture2dhpLost.png");
        aG = l.b("/mainImage/myTexture2dmpLost.png");
        aF = l.b("/mainImage/myTexture2dMP.png");
        au = l.b("/mainImage/myTexture2dskill.png");
        av = l.b("/mainImage/myTexture2dskill2.png");
        at = l.b("/mainImage/myTexture2dmenu.png");
        dA = l.b("/mainImage/myTexture2dfocus.png");
        aH = l.b("/mainImage/tm-do.png");
        aI = l.b("/mainImage/tm-vang.png");
        aJ = l.b("/mainImage/tm-xam.png");
        aK = l.b("/mainImage/tm-xanh.png");
        if (main.a.e) {
            l.b("/mainImage/myTexture2darrow.png");
            l.b("/mainImage/myTexture2darrow2.png");
            dy = l.b("/mainImage/myTexture2dchat.png");
            dz = l.b("/mainImage/myTexture2dchat2.png");
            dB = l.b("/mainImage/myTexture2dfocus2.png");
            dC = l.b("/mainImage/myTexture2dPea0.png");
            dD = l.b("/mainImage/myTexture2dPea1.png");
            aA = l.b("/mainImage/myTexture2danalog1.png");
            aB = l.b("/mainImage/myTexture2danalog2.png");
            dE = l.b("/mainImage/myTexture2dPea2.png");
            dF = l.b("/mainImage/myTexture2dPea3.png");
            dG = l.b("/mainImage/myTexture2dfirebtn0.png");
            dH = l.b("/mainImage/myTexture2dfirebtn1.png");
        }
        dI = l.b("/mainImage/myTexture2dPea_0.png");
        dJ = l.b("/mainImage/myTexture2dPea_1.png");
        dK = l.b("/mainImage/myTexture2dPea_2.png");
        dL = l.b("/mainImage/myTexture2dPea_3.png");
        aO = eu.d("analog") == 1 ? 1 : 0;
        dS = new b();
        byte[] byArray = eu.b("NRdataVersion");
        byte[] byArray2 = eu.b("NRmapVersion");
        byte[] byArray3 = eu.b("NRskillVersion");
        byte[] byArray4 = eu.b("NRitemVersion");
        if (byArray != null) {
            al = byArray[0];
        }
        if (byArray2 != null) {
            am = byArray2[0];
        }
        if (byArray3 != null) {
            an = byArray3[0];
        }
        if (byArray4 != null) {
            ao = byArray4[0];
        }
        aP = new bf[10];
        aQ = new bf[10];
        en = l.b("/bg/trans.png");
        eu = 0;
        bo = l.b("/mainImage/myTexture2dnut.png");
        bp = l.b("/mainImage/myTexture2dnutF.png");
        bt = true;
        eJ = new int[]{1, -1, 1, -1};
        eK = new int[]{1, -1, -1, 1};
        bv = new el("");
        bw = l.b("/mainImage/myTexture2darrow3.png");
        bG = new int[5];
        bH = new int[5];
        fb = new int[5];
        fc = new int[5];
        bI = new int[5];
        bF = new String[5];
        fa = new int[5];
        fd = new int[5];
        bJ = new int[8];
        int n2 = 0;
        while (n2 < 5) {
            p.bI[n2] = -1;
            ++n2;
        }
        bM = 140;
        bN = 160;
        bO = false;
        bP = false;
        ft = new Vector();
        bZ = 50;
        ca = 50;
        cd = 100;
        cg = new el("");
        fN = 1;
        ch = false;
    }

    public final void a() {
        block13: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(eu.b("NR_part")));
                    int n2 = ((DataInputStream)object).readShort();
                    x = new av[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        int n4 = ((DataInputStream)object).readByte();
                        p.x[n3] = new av(n4);
                        n4 = 0;
                        while (n4 < p.x[n3].a.length) {
                            p.x[n3].a[n4] = new w();
                            p.x[n3].a[n4].a = ((DataInputStream)object).readShort();
                            p.x[n3].a[n4].b = ((DataInputStream)object).readByte();
                            p.x[n3].a[n4].c = ((DataInputStream)object).readByte();
                            ++n4;
                        }
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    break block13;
                }
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
        bl.c();
    }

    public static void a(Image image, Image image2, Image image3, float f2, float f3, int n2, float f4, en en2) {
        n2 = en2.c();
        int n3 = en2.d();
        int n4 = en2.e();
        int n5 = en2.f();
        en2.e((int)f2, (int)f3, (int)f4, 13);
        int n6 = 0;
        while (n6 < 4) {
            en2.a(image2, f2 + (float)((n6 + 1) * 15), f3, 0);
            ++n6;
        }
        en2.a(image, f2, f3, 0);
        en2.a(image2, f2 + 100.0f - 30.0f, f3, 0);
        en2.a(image3, f2 + 100.0f - 15.0f, f3, 0);
        en2.e(n2, n3, n4, n5);
    }

    public static boolean e() {
        return bv.l >= 53 && bv.l <= 62;
    }

    public static boolean f() {
        return bv.l >= 63;
    }

    public final void b() {
        bs.c = false;
        if (ed.b()) {
            bu.a();
        }
        x.c = false;
        af.bI = false;
        if (!a) {
            bt.a().s();
        }
        if (bv.b()) {
            p p2 = this;
            if (cw.b) {
                cw.b = false;
                p2.co = null;
            }
        }
        p.aD.f = true;
        p.aE.f = true;
        b = true;
        this.dR = 0;
        a = false;
        super.b();
    }

    public static void g() {
        cn.a.removeAllElements();
        D.removeAllElements();
        E.removeAllElements();
        dc.x.removeAllElements();
        dc.A.removeAllElements();
        dc.z.removeAllElements();
        dc.B.removeAllElements();
        dc.w.removeAllElements();
        cG.removeAllElements();
        F.removeAllElements();
        G.removeAllElements();
        af.e().bF.removeAllElements();
    }

    public final void a(byte[] object) {
        ds.c("GET ONSCREENSKILL!");
        aQ = new bf[10];
        if (object == null) {
            ds.c("null");
            object = this;
            ds.c("LOAD DEFAULT ONSCREEN SKILL");
            int n2 = 0;
            while (n2 < aQ.length) {
                bf bf2;
                if (n2 >= af.e().aA.size()) break;
                p.aQ[n2] = bf2 = (bf)af.e().aA.elementAt(n2);
                ++n2;
            }
            p.y();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < af.e().aA.size()) {
                bf bf3 = (bf)af.e().aA.elementAt(n4);
                if (bf3.a.a == object[n3]) {
                    p.aQ[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void b(byte[] object) {
        ds.c("GET KEYSKILL!");
        aP = new bf[10];
        if (object == null) {
            object = this;
            ds.c("LOAD DEFAULT KEY SKILL");
            int n2 = 0;
            while (n2 < aP.length) {
                bf bf2;
                if (n2 >= af.e().aA.size()) break;
                p.aP[n2] = bf2 = (bf)af.e().aA.elementAt(n2);
                ++n2;
            }
            p.z();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < af.e().aA.size()) {
                bf bf3 = (bf)af.e().aA.elementAt(n4);
                if (bf3.a.a == object[n3]) {
                    p.aP[n3] = bf3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void c(byte[] byArray) {
        ds.c("GET CURRENTSKILL!");
        if (byArray == null || byArray.length == 0) {
            if (af.e().aA.size() > 0) {
                af.e().aC = (bf)af.e().aA.elementAt(0);
            }
        } else {
            int n2 = 0;
            while (n2 < af.e().aA.size()) {
                bf bf2 = (bf)af.e().aA.elementAt(n2);
                if (bf2.a.a == byArray[0]) {
                    af.e().aC = bf2;
                    break;
                }
                ++n2;
            }
        }
        if (af.e().aC != null) {
            bt.a().i(af.e().aC.a.a);
            af.e();
        }
    }

    protected static void a(et object) {
        ds.c("DO SET ONSCREEN SKILL");
        object = af.e().a((et)object);
        el el2 = new el("");
        int n2 = 0;
        while (n2 < (main.a.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object object2 = objectArray;
            objectArray[0] = object;
            object2[1] = String.valueOf(n2);
            object2 = new de(String.valueOf(aw.cB) + (n2 + 1), 11120, object2);
            bf bf2 = aQ[n2];
            if (bf2 != null) {
                object2.a = true;
            }
            el2.addElement(object2);
            ++n2;
        }
        main.a.F.a(el2);
    }

    protected static void b(et object) {
        ds.c("DO SET KEY SKILL");
        object = af.e().a((et)object);
        String[] stringArray = cd.g ? aw.aR : aw.aS;
        el el2 = new el("");
        int n2 = 0;
        while (n2 < (main.a.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            el2.addElement(new de(stringArray[n2], 11121, objectArray2));
            ++n2;
        }
        main.a.F.a(el2);
    }

    private static void y() {
        byte[] byArray = new byte[aQ.length];
        int n2 = 0;
        while (n2 < aQ.length) {
            byArray[n2] = aQ[n2] == null ? -1 : p.aQ[n2].a.a;
            ++n2;
        }
        bt.a().a(byArray);
    }

    private static void z() {
        byte[] byArray = new byte[aP.length];
        int n2 = 0;
        while (n2 < aP.length) {
            byArray[n2] = aP[n2] == null ? -1 : p.aP[n2].a.a;
            ++n2;
        }
        bt.a().a(byArray);
    }

    public static boolean h() {
        int n2 = af.e().aF.length - 1;
        while (n2 >= 0) {
            if (af.e().aF[n2] == null) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static void a(String[] stringArray, do do_) {
        el el2 = new el("");
        int n2 = 0;
        while (n2 < stringArray.length) {
            el2.addElement(new de(stringArray[n2], 11057, do_));
            ++n2;
        }
        main.a.F.a(el2);
    }

    private static void A() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(eu.b("NR_effect")));
                int n2 = ((DataInputStream)object).readShort();
                y = new cp[n2];
                int n3 = 0;
                while (n3 < n2) {
                    p.y[n3] = new cp();
                    ((DataInputStream)object).readShort();
                    p.y[n3].a = new eq[((DataInputStream)object).readByte()];
                    int n4 = 0;
                    while (n4 < p.y[n3].a.length) {
                        p.y[n3].a[n4] = new eq();
                        p.y[n3].a[n4].c = ((DataInputStream)object).readShort();
                        p.y[n3].a[n4].a = ((DataInputStream)object).readByte();
                        p.y[n3].a[n4].b = ((DataInputStream)object).readByte();
                        ++n4;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void B() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(eu.b("NR_arrow")));
                int n2 = ((DataInputStream)object).readShort();
                v = new cv[n2];
                int n3 = 0;
                while (n3 < n2) {
                    p.v[n3] = new cv();
                    ((DataInputStream)object).readShort();
                    p.v[n3].a[0] = ((DataInputStream)object).readShort();
                    p.v[n3].a[1] = ((DataInputStream)object).readShort();
                    p.v[n3].a[2] = ((DataInputStream)object).readShort();
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void C() {
        Object object = null;
        try {
            try {
                object = new DataInputStream(new ByteArrayInputStream(eu.b("NR_dart")));
                int n2 = ((DataInputStream)object).readShort();
                w = new by[n2];
                int n3 = 0;
                while (n3 < n2) {
                    int n4;
                    int n5;
                    p.w[n3] = new by();
                    ((DataInputStream)object).readShort();
                    p.w[n3].h = ((DataInputStream)object).readShort();
                    p.w[n3].i = ((DataInputStream)object).readShort() << 8;
                    p.w[n3].g = ((DataInputStream)object).readShort();
                    int n6 = ((DataInputStream)object).readShort();
                    p.w[n3].c = new short[n6];
                    int n7 = 0;
                    while (n7 < n6) {
                        p.w[n3].c[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    p.w[n3].d = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        p.w[n3].d[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    p.w[n3].e = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        p.w[n3].e[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    p.w[n3].f = new short[n6];
                    n7 = 0;
                    while (n7 < n6) {
                        p.w[n3].f[n7] = ((DataInputStream)object).readShort();
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    p.w[n3].a = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        p.w[n3].a[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            p.w[n3].a[n7][n4] = ((DataInputStream)object).readShort();
                            ++n4;
                        }
                        ++n7;
                    }
                    n6 = ((DataInputStream)object).readShort();
                    p.w[n3].b = new short[n6][];
                    n7 = 0;
                    while (n7 < n6) {
                        n5 = ((DataInputStream)object).readShort();
                        p.w[n3].b[n7] = new short[n5];
                        n4 = 0;
                        while (n4 < n5) {
                            p.w[n3].b[n7][n4] = ((DataInputStream)object).readShort();
                            ++n4;
                        }
                        ++n7;
                    }
                    ++n3;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
            throw throwable;
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    private static void E() {
        block16: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(eu.b("NR_skill")));
                    short s2 = ((DataInputStream)object).readShort();
                    int n2 = o.a.size();
                    u = new ci[n2];
                    n2 = 0;
                    while (n2 < s2) {
                        short s3 = ((DataInputStream)object).readShort();
                        if (s3 == 1111) {
                            s3 = (short)(s2 - 1);
                        }
                        p.u[s3] = new ci();
                        p.u[s3].a = s3;
                        p.u[s3].b = ((DataInputStream)object).readShort();
                        if (p.u[s3].b <= 0) {
                            p.u[s3].b = 80;
                        }
                        ((DataInputStream)object).readByte();
                        p.u[s3].c = new f[((DataInputStream)object).readByte()];
                        int n3 = 0;
                        while (n3 < p.u[s3].c.length) {
                            p.u[s3].c[n3] = new f();
                            p.u[s3].c[n3].a = ((DataInputStream)object).readByte();
                            p.u[s3].c[n3].b = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].c = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].d = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].e = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].f = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].g = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].h = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].i = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].j = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].k = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].l = ((DataInputStream)object).readShort();
                            p.u[s3].c[n3].m = ((DataInputStream)object).readShort();
                            ++n3;
                        }
                        p.u[s3].d = new f[((DataInputStream)object).readByte()];
                        n3 = 0;
                        while (n3 < p.u[s3].d.length) {
                            p.u[s3].d[n3] = new f();
                            p.u[s3].d[n3].a = ((DataInputStream)object).readByte();
                            p.u[s3].d[n3].b = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].c = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].d = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].e = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].f = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].g = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].h = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].i = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].j = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].k = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].l = ((DataInputStream)object).readShort();
                            p.u[s3].d[n3].m = ((DataInputStream)object).readShort();
                            ++n3;
                        }
                        ++n2;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    break block16;
                }
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
        ds.c("READ SKILL DONE");
    }

    public static void i() {
        try {
            ds.c("<readOk><vsData<" + ap + "==" + al);
            ds.c("<readOk><vsMap<" + aq + "==" + am);
            ds.c("<readOk><vsSkill<" + ar + "==" + an);
            ds.c("<readOk><vsItem<" + as + "==" + ao);
            if (ap == al && aq == am && ar == an && as == ao) {
                ds.c(String.valueOf(ap) + "," + aq + "," + ar + "," + as);
                p.j();
                p.C();
                p.j();
                p.A();
                p.j();
                p.B();
                p.j();
                p.E();
                bt.a().p();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public static p j() {
        if (c == null) {
            c = new p();
        }
        return c;
    }

    public static void k() {
        c = null;
    }

    public final void l() {
        if (fj == null) {
            fj = new Image[3];
            int n2 = 0;
            while (n2 < 3) {
                p.fj[n2] = l.b("/e/sp" + n2 + ".png");
                ++n2;
            }
        }
        fe = new int[2];
        ff = new int[2];
        fg = new int[2];
        fh = new int[2];
        fi = new int[2];
        p.fg[1] = -1;
        p.fg[0] = -1;
        p p2 = this;
        this.fn = 84;
        fm = 66L;
        fl = 59;
        fk = 61;
    }

    public p() {
        int[] nArray = new int[]{-1, -1};
        this.bR = false;
        this.fF = "";
        new de("", 11021);
        this.aR = new de("  ", 11000);
        this.s = new de("", 11001);
        this.aR.g = at;
        this.aR.l = en.a(this.aR.g) + 20;
        this.aR.f = false;
        this.s.g = dA;
        if (main.a.e) {
            this.aR.j = 0;
            this.aR.k = 50;
            this.s = null;
        } else {
            this.aR.j = 0;
            this.aR.k = e - 30;
            this.s.j = d - 32;
            this.s.k = e - 32;
        }
        this.co = this.s;
        bn = 1;
        if (main.a.e) {
            O = true;
        }
        this.dU = new de("\u0110\u1ed5i c\u1edd", main.a.a(), 100001, null);
        this.dV = new de("Logout", main.a.a(), 100002, null);
        this.dW = new de("chat world", main.a.a(), 100003, null);
        this.dX = new de("InfoLog", main.a.a(), 100004, null);
        this.dU.b();
        this.dV.b();
        this.dW.b();
        this.dX.b();
        this.dW.j = main.a.A - this.dW.l;
        this.dX.j = main.a.A - this.dX.l;
        this.dV.j = main.a.A - this.dV.l;
        this.dU.j = main.a.A - this.dU.l;
        this.dW.k = this.dW.m + di.s.a();
        this.dX.k = (this.dW.m << 1) + di.s.a();
        this.dV.k = this.dW.m * 3 + di.s.a();
        this.dU.k = (this.dW.m << 2) + di.s.a();
    }

    public static final void a(int n2, int n3) {
        boolean bl2;
        g g2;
        d = main.a.A;
        h = 39;
        e = main.a.B;
        cA = main.a.B / 6;
        if (cA < 48) {
            cA = 48;
        }
        f = d >> 1;
        cz = e >> 1;
        cy = e - 120;
        g = (e << 1) / 3;
        i = d / 6;
        cw = d / bv.i + 2;
        cx = e / bv.i + 2;
        if (d % 24 != 0) {
            ++cw;
        }
        n = (bv.a - 1) * bv.i - d;
        cF = (bv.b - 1) * bv.i - e;
        if (n2 == -1 && n3 == -1) {
            j = l = af.e().B - f + i * af.e().I;
            k = m = af.e().C - g - 1;
        } else {
            j = l = n2 - cy + i * af.e().I;
            k = m = n3 - g - 1;
        }
        if (j < 24) {
            l = 24;
            j = 24;
        }
        if (j > n) {
            j = l = n;
        }
        if (k < 0) {
            m = 0;
            k = 0;
        }
        if (k > cF) {
            k = m = cF;
        }
        if ((o = j / bv.i - 1) < 0) {
            o = 0;
        }
        p = k / bv.i;
        q = o + cw;
        r = p + cx;
        if (p < 0) {
            p = 0;
        }
        if (r > bv.b - 1) {
            r = bv.b - 1;
        }
        if ((bv.F = q - o << 2) > bv.a) {
            bv.F = bv.a;
        }
        if ((bv.G = r - p << 2) > bv.b) {
            bv.G = bv.b;
        }
        if ((bv.B = (af.e().B - 2 * d) / bv.i) < 0) {
            bv.B = 0;
        }
        if ((bv.C = bv.B + bv.F) > bv.a) {
            bv.C = bv.a;
        }
        if ((bv.D = (af.e().C - 2 * e) / bv.i) < 0) {
            bv.D = 0;
        }
        if ((bv.E = bv.D + bv.G) > bv.b) {
            bv.E = bv.b;
        }
        cq.b().c = c;
        cq.b().a.b = main.a.B - 35 - cq.b().a.d;
        cq.b().a();
        if (main.a.e) {
            eM = e - 88;
            eN = d - 40;
            eO = 2;
            if (main.a.A <= 240) {
                eN = d - 35;
                eO = 5;
            }
            eP = d - 55;
            eQ = eM + 35;
            eR = d - 37;
            eS = eM - 1;
            if (main.a.A >= 450) {
                eS -= 12;
                by -= 7;
                eP -= 10;
                eQ -= 5;
                eR -= 10;
            }
        }
        p.m();
        int n4 = eI = main.a.A > 200 ? 40 : 30;
        if (eu.d("viewchat") == -1) {
            g2 = main.a.G;
            bl2 = true;
        } else {
            g2 = main.a.G;
            bl2 = eu.d("viewchat") == 1;
        }
        g2.au = bl2;
    }

    public static void m() {
        bf[] bfArray = main.a.e ? aQ : aP;
        eT = new int[bfArray.length];
        eU = new int[bfArray.length];
        dY = 30;
        if (main.a.A <= 320) {
            eW = e - dY - 6;
            eV = f - bfArray.length * dY / 2 - 25;
        } else {
            dY = 40;
            eV = 10;
            eW = main.a.B - dY + 7;
        }
        int n2 = 0;
        while (n2 < eT.length) {
            p.eT[n2] = n2 * dY;
            p.eU[n2] = eW;
            if (eT.length > 5 && n2 >= eT.length / 2) {
                p.eT[n2] = (n2 - eT.length / 2) * dY;
                p.eU[n2] = eW - 32;
            }
            ++n2;
        }
        bx = bfArray.length * dY;
        by = eW;
        if (main.a.e) {
            eV = 17;
            eW = main.a.B - 40;
            if (p.dS.b && aO == 1) {
                bx = bfArray.length * dY;
                by = eW;
            } else {
                bx = main.a.A - 45;
                by = main.a.B - 45;
            }
            if (aO != 0) {
                eR = eP = main.a.A - 45;
                if (p.dS.d) {
                    eV = p.dS.a + 20;
                    dY = 35;
                    bx = eP - 45;
                } else if (p.dS.c) {
                    bx = eP - 45;
                }
                eQ = main.a.B - 45;
                eS = eQ - 45;
            }
            n2 = 0;
            while (n2 < eT.length) {
                p.eT[n2] = n2 * dY;
                p.eU[n2] = eW;
                if (eT.length > 5 && n2 >= eT.length / 2) {
                    p.eT[n2] = (n2 - eT.length / 2) * dY;
                    p.eU[n2] = eW - 32;
                }
                ++n2;
            }
        }
    }

    public final void a(String string, int n2, int n3) {
        i i2 = new i();
        new i().b = n3;
        i2.a = n2;
        this.a(string, new de(aw.bn, 12002, i2), new de(aw.bo, 12003, i2));
    }

    private void F() {
        this.aX = 0;
        main.a.g();
        if (af.e().aU.J < 0) {
            return;
        }
        if (af.e().J < 0) {
            return;
        }
        el el2 = main.a.G.S;
        if (el2.size() > 0) {
            return;
        }
        if (af.e().aD != null && af.e().aD.c > 1) {
            el2.addElement(new de(aw.cP, 11112, af.e().aU));
            el2.addElement(new de(aw.dL, 11113, af.e().aU));
        }
        if (af.e().ai != null && af.e().aj < 2 && af.e().aU.ah == -1) {
            el2.addElement(new de(aw.aM[4], 110391));
        }
        if (af.e().aU.H != 14 && af.e().aU.H != 5) {
            if (af.e().aD != null && af.e().aD.c >= 14) {
                el2.addElement(new de(aw.aM[0], 2003));
            }
        } else {
            af.e();
        }
        if (af.e().ai != null && af.e().ai.a == af.e().aU.ah && af.e().aU.H != 14 && af.e().aD != null && af.e().aD.c >= 14) {
            el2.addElement(new de(aw.aM[1], 2004));
        }
        int n2 = af.e().ax.b.length;
        int n3 = 0;
        while (n3 < n2) {
            et et2 = af.e().ax.b[n3];
            bf bf2 = af.e().a(et2);
            if (bf2 != null && et2.a() && bf2.c > 0) {
                el2.addElement(new de(et2.b, 12004, bf2));
            }
            ++n3;
        }
    }

    public static boolean a(aa bq2) {
        if (bq2 == null) {
            return false;
        }
        if (af.e().aN == 5) {
            return true;
        }
        if (af.e().I() && !bq2.J) {
            return false;
        }
        if (af.e().aR != null && bq2.equals(af.e().aR)) {
            return false;
        }
        bq2 = p.b(bq2.y);
        if (bq2 == null) {
            return true;
        }
        if (((af)bq2).aN == 5) {
            return true;
        }
        return af.e().c((af)bq2);
    }

    private boolean G() {
        if (af.e().aC != null && (af.e().aC.a.d != 1 && af.e().T < (long)af.e().aC.i || af.e().aC.a.d == 1 && af.e().T < af.e().W * (long)af.e().aC.i / 100L)) {
            aD.a(aw.bI, 0);
            this.aX = 0;
            return false;
        }
        if (af.e().aC == null || af.e().aC.a.c > 0 && af.e().aC.c == 0) {
            main.a.a(aw.aT);
            return false;
        }
        return true;
    }

    public final void n() {
        main.a.F.a = false;
        Object object = cq.b();
        ((cq)object).a.a("");
        ((cq)object).b = false;
        cq.b().f = null;
        this.dx = false;
        this.aa = 0;
        cI = 0;
        cH = 0;
        this.dw = -1;
        J = -1;
        this.ab = 0;
        this.aa = 0;
        if (af.e().U <= 0L || af.e().H == 14 || af.e().H == 5) {
            if (af.e().cH) {
                this.cn = this.fs = new de(aw.aX[0], 11038);
                af.e().U = 0L;
            }
            O = false;
        } else {
            O = true;
        }
        object = cK;
        cK.a = 0;
        ((dv)object).b = 0;
        ((dv)object).c = 0;
        ((dv)object).d = 0;
        ((dv)object).e = 0;
        ((dv)object).f = 0;
        ((dv)object).g = 0;
        ((dv)object).h = 0;
        ((dv)object).k = 0;
        ((dv)object).l = 0;
        ((dv)object).i = 0;
        ((dv)object).j = 0;
    }

    public final void a(int n2) {
        super.a(n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        block245: {
            block253: {
                block254: {
                    block252: {
                        block251: {
                            block247: {
                                block249: {
                                    block248: {
                                        block250: {
                                            block246: {
                                                block244: {
                                                    block243: {
                                                        block237: {
                                                            block242: {
                                                                block241: {
                                                                    block236: {
                                                                        block240: {
                                                                            block239: {
                                                                                block238: {
                                                                                    if (ac.b || af.e().s || af.e().db) {
                                                                                        return;
                                                                                    }
                                                                                    if (bp.b) {
                                                                                        return;
                                                                                    }
                                                                                    if (!main.a.e || cq.b().b || main.a.F.a || (var1_1 = this).N()) break block237;
                                                                                    bb.cs = -1;
                                                                                    if (!main.a.f) break block236;
                                                                                    if (!main.a.a(0, 0, 60, 50) || !main.a.l || !main.a.m) break block238;
                                                                                    if (af.e().an != null) {
                                                                                        af.e().an.a();
                                                                                    }
                                                                                    af.e().bP = null;
                                                                                    main.a.l();
                                                                                    var1_1.ez = true;
                                                                                    var1_1.eA = 5;
                                                                                    break block237;
                                                                                }
                                                                                if (bv.d() || !main.a.a(p.eN, p.eO, 34, 34)) break block239;
                                                                                bb.cs = 15;
                                                                                main.a.ai = false;
                                                                                var1_1.aT = false;
                                                                                cq.b().h = aw.bq;
                                                                                if (!main.a.l || !main.a.m) break block239;
                                                                                cq.b().a("");
                                                                                bu.a();
                                                                                af.e().bP = null;
                                                                                main.a.l();
                                                                                break block237;
                                                                            }
                                                                            if (af.e().an == null || !main.a.a(af.e().an.j - 17, af.e().an.k - 17, 34, 34)) break block240;
                                                                            bb.cs = 20;
                                                                            main.a.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (!main.a.l || !main.a.m) break block240;
                                                                            main.a.l();
                                                                            af.e().an.a();
                                                                            break block237;
                                                                        }
                                                                        var3_9 = var1_1;
                                                                        if (p.aO != 0 && af.e().H != 14) {
                                                                            if (main.a.a(p.eP, p.eQ, 40, 40)) {
                                                                                bb.cs = 5;
                                                                                if (main.a.m) {
                                                                                    main.a.i[5] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.ai = false;
                                                                                    main.a.l = false;
                                                                                }
                                                                            }
                                                                            p.dS.a();
                                                                            if (main.a.a(p.eR, p.eS, 34, 34)) {
                                                                                bb.cs = 13;
                                                                                main.a.ai = false;
                                                                                var3_9.aT = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    af.e().J();
                                                                                    main.a.m = false;
                                                                                    main.a.ai = false;
                                                                                    main.a.l = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if ((p.aO == 0 ? main.a.a(p.bx, p.by + 10, 40, 40) != false : main.a.a(p.bx, p.by + 10, 34, 34) != false) && af.e().H != 14 && var1_1.aL == null) {
                                                                            bb.cs = 10;
                                                                            main.a.ai = false;
                                                                            var1_1.aT = false;
                                                                            if (main.a.l && main.a.m) {
                                                                                main.a.i[10] = true;
                                                                                main.a.m = false;
                                                                                main.a.ai = false;
                                                                                main.a.l = false;
                                                                            }
                                                                        }
                                                                        if ((p.aO == 0 ? main.a.a(p.bx + 5, p.by - 6 - 40 + 10, 40, 40) != false : main.a.a(p.bx + 5, p.by - 6 - 34 + 10, 34, 34) != false) && af.e().H != 14 && var1_1.aL == null) {
                                                                            if (p.ch) {
                                                                                bb.cs = 14;
                                                                                main.a.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.ai = false;
                                                                                    main.a.l = false;
                                                                                    p.ch = false;
                                                                                    bt.a().a((byte)-1, (byte)-1, (byte)-1, (short)-1);
                                                                                }
                                                                            } else if (p.ck) {
                                                                                bb.cs = 14;
                                                                                main.a.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.ai = false;
                                                                                    main.a.l = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < af.e().aF.length) {
                                                                                        var7_20 = af.e().aF[var6_16];
                                                                                        if (var7_20 != null) {
                                                                                            ds.b("find " + var7_20.b.a);
                                                                                            if (var7_20.b.a == 194 && (p.ck = var7_20.h > 0)) {
                                                                                                bt.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            } else if (p.cl) {
                                                                                bb.cs = 14;
                                                                                main.a.ai = false;
                                                                                var1_1.aT = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.ai = false;
                                                                                    main.a.l = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < af.e().aF.length) {
                                                                                        var7_20 = af.e().aF[var6_16];
                                                                                        if (var7_20 != null && var7_20.b.a == 193 && (p.cl = var7_20.h > 0)) {
                                                                                            bt.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                            break;
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var1_1.aL == null) break block241;
                                                                    var1_1.K();
                                                                    break block242;
                                                                }
                                                                if (!p.O) break block242;
                                                                if (var1_1.J()) break block237;
                                                                var1_1.eB = -1;
                                                                var6_16 = 0;
                                                                if (p.aQ.length > 5 && (main.a.a(p.eV + p.eT[0] - p.dY / 2 + 12, p.eU[0] - p.dY / 2 + 12, 5 * p.dY, p.dY) || main.a.a(p.eV + p.eT[5] - p.dY / 2 + 12, p.eU[5] - p.dY / 2 + 12, 5 * p.dY, p.dY))) {
                                                                    var6_16 = 1;
                                                                }
                                                                if (var6_16 != 0 || main.a.a(p.eV + p.eT[0] - p.dY / 2 + 12, p.eU[0] - p.dY / 2 + 12, 5 * p.dY, p.dY) || !main.a.f && main.a.a(p.eV + p.eT[0] - p.dY / 2 + 12, p.eU[0] - p.dY / 2 + 12, p.dY, p.aQ.length * p.dY)) {
                                                                    main.a.ai = false;
                                                                    var1_1.aT = false;
                                                                    var7_21 = (main.a.t - (p.eV + p.eT[0] - p.dY / 2 + 12)) / p.dY;
                                                                    if (var6_16 != 0 && main.a.u < p.eU[0]) {
                                                                        var7_21 += 5;
                                                                    }
                                                                    var1_1.eB = var7_21;
                                                                    if (main.a.l && main.a.m) {
                                                                        main.a.m = false;
                                                                        main.a.ai = false;
                                                                        main.a.l = false;
                                                                        var1_1.ex = var7_21;
                                                                        if (var1_1.ex > p.aQ.length - 1) {
                                                                            var1_1.ex = p.aQ.length - 1;
                                                                        }
                                                                        if ((var2_23 = p.aQ[var1_1.ex]) != null) {
                                                                            super.a((bf)var2_23, true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (main.a.m) {
                                                                if (main.a.j[1] || main.a.j[2] || main.a.j[3] || main.a.j[4] || main.a.j[6]) {
                                                                    main.a.m = false;
                                                                }
                                                                main.a.j[1] = false;
                                                                main.a.j[2] = false;
                                                                main.a.j[3] = false;
                                                                main.a.j[4] = false;
                                                                main.a.j[6] = false;
                                                            }
                                                        }
                                                        var1_1 = this;
                                                        var6_17 = System.currentTimeMillis();
                                                        if (main.a.i[2] || main.a.i[4] || main.a.i[6] || main.a.i[1] || main.a.i[3]) {
                                                            var1_1.aX = 0;
                                                            p.bj = false;
                                                        }
                                                        if (main.a.i[5]) {
                                                            if (var1_1.aX == 0) {
                                                                if (var6_17 - var1_1.el < 800L && (af.e().aC != null && (af.e().aC.a.d != 1 && af.e().T < (long)af.e().aC.i || af.e().aC.a.d == 1 && af.e().T < af.e().W * (long)af.e().aC.i / 100L) ? false : af.e().aC != null && (af.e().aC.a.c <= 0 || af.e().aC.c != 0)) && (af.e().aQ != null || af.e().aU != null && af.e().c(af.e().aU))) {
                                                                    var1_1.aX = 10;
                                                                    main.a.i[5] = false;
                                                                }
                                                            } else {
                                                                var1_1.aX = 0;
                                                                main.a.i[6] = false;
                                                                main.a.i[4] = false;
                                                            }
                                                            var1_1.el = var6_17;
                                                        }
                                                        if (main.a.w % 5 != 0 || var1_1.aX <= 0 || af.e().bP != null) break block243;
                                                        if (af.e().aC != null && (af.e().aC.a.b() || af.e().aC.j)) break block244;
                                                        if ((af.e().aQ == null || af.e().aQ.p == 1 || af.e().aQ.p == 0 || af.e().aU != null) && (af.e().aU == null || !af.e().c(af.e().aU))) break block243;
                                                        if (af.e().aC.j) break block244;
                                                        super.a(false, true);
                                                    }
                                                    if (var1_1.aX > 1) {
                                                        --var1_1.aX;
                                                    }
                                                }
                                                if (ae.m != null) {
                                                    var1_1 = ae.m.j;
                                                    if ((main.a.i[5] || bb.a((de)var1_1)) && var1_1 != null) {
                                                        main.a.m = false;
                                                        main.a.i[5] = false;
                                                        bb.cs = -1;
                                                        if (var1_1 != null) {
                                                            var1_1.a();
                                                        }
                                                    }
                                                } else if (!cq.b().b) {
                                                    if ((main.a.i[12] || bb.a(main.a.E.cm)) && this.cm != null) {
                                                        main.a.m = false;
                                                        main.a.l = false;
                                                        main.a.i[12] = false;
                                                        bb.cs = -1;
                                                        if (this.cm != null) {
                                                            this.cm.a();
                                                        }
                                                    }
                                                    if ((main.a.i[13] || bb.a(main.a.E.co)) && this.co != null) {
                                                        main.a.m = false;
                                                        main.a.l = false;
                                                        main.a.i[13] = false;
                                                        bb.cs = -1;
                                                        if (this.co != null) {
                                                            this.co.a();
                                                        }
                                                    }
                                                    if ((main.a.i[5] || bb.a(main.a.E.cn)) && this.cn != null) {
                                                        main.a.m = false;
                                                        main.a.i[5] = false;
                                                        bb.cs = -1;
                                                        if (this.cn != null) {
                                                            this.cn.a();
                                                        }
                                                    }
                                                } else {
                                                    if (cq.b().d != null && (main.a.i[12] || bb.a(cq.b().d)) && cq.b().d != null) {
                                                        cq.b().d.a();
                                                    }
                                                    if (cq.b().e != null && (main.a.i[13] || bb.a(cq.b().e)) && cq.b().e != null) {
                                                        cq.b().e.a();
                                                    }
                                                    if (cq.b().f != null && (main.a.i[5] || bb.a(cq.b().f)) && cq.b().f != null) {
                                                        cq.b().f.a();
                                                    }
                                                }
                                                var1_1 = this;
                                                if (af.e().bP != null) {
                                                    var1_2 = 0;
                                                    while (var1_2 < main.a.i.length) {
                                                        if (main.a.i[var1_2]) {
                                                            af.e().bP = null;
                                                            break;
                                                        }
                                                        ++var1_2;
                                                    }
                                                }
                                                if (cq.b().b && main.a.ag != 0) {
                                                    cq.b().a(main.a.ag);
                                                    main.a.ag = 0;
                                                    return;
                                                }
                                                if (main.a.F.a || af.bH) {
                                                    return;
                                                }
                                                if (main.a.i[10]) {
                                                    main.a.i[10] = false;
                                                    this.H();
                                                    main.a.f();
                                                }
                                                if (main.a.i[11] && this.aL == null) {
                                                    if (this.bQ != null) {
                                                        this.bQ.a.a();
                                                    } else if (p.aE.b.b != null && p.aE.b.b.c != null) {
                                                        main.a.G.l();
                                                        main.a.G.s();
                                                    }
                                                    main.a.i[11] = false;
                                                    main.a.f();
                                                }
                                                if (main.a.ag != 0 && cd.g && main.a.ag == 32) {
                                                    this.H();
                                                    main.a.ag = 0;
                                                    main.a.f();
                                                }
                                                if (main.a.ag != 0 && this.aL == null && cd.g && main.a.ag == 121) {
                                                    if (this.bQ != null) {
                                                        this.bQ.a.a();
                                                        main.a.ag = 0;
                                                        main.a.f();
                                                    } else if (p.aE.b.b != null && p.aE.b.b.c != null) {
                                                        main.a.G.l();
                                                        main.a.G.s();
                                                        main.a.ag = 0;
                                                        main.a.f();
                                                    }
                                                }
                                                if (main.a.i[10] && this.aL == null) {
                                                    main.a.i[10] = false;
                                                    var1_3 = 10;
                                                    var1_4 = p.aE;
                                                    p.aE.g = 10;
                                                    main.a.f();
                                                }
                                                var1_5 = this;
                                                if (!p.dS.b() && p.aO != 1) {
                                                    af.e().ap = true;
                                                    if (main.a.ai) {
                                                        main.a.ai = false;
                                                        var1_5.aT = true;
                                                        var1_5.ee = 0;
                                                        var1_5.ea = var1_5.ec = main.a.p;
                                                        var1_5.eb = var1_5.ed = main.a.q;
                                                    }
                                                    if (var1_5.aT) {
                                                        var6_18 = main.a.p - var1_5.ea;
                                                        var7_22 = main.a.q - var1_5.eb;
                                                        if (!(var1_5.dZ || ds.g(main.a.p - var1_5.ec) <= 15 && ds.g(main.a.q - var1_5.ed) <= 15)) {
                                                            var1_5.dZ = true;
                                                        }
                                                        var1_5.ea = main.a.p;
                                                        var1_5.eb = main.a.q;
                                                        ++var1_5.ee;
                                                        if (var1_5.dZ) {
                                                            af.e().ap = false;
                                                            p.k -= var7_22;
                                                            if ((p.j -= var6_18) < 24 && (var2_24 = (24 - p.j) / 3) != 0) {
                                                                p.j += var6_18 - var6_18 / var2_24;
                                                            }
                                                            if (p.j < 24) {
                                                                p.j = 24;
                                                            }
                                                            if (p.j > p.n && (var2_25 = (p.j - p.n) / 3) != 0) {
                                                                p.j += var6_18 - var6_18 / var2_25;
                                                            }
                                                            if (p.j > p.n) {
                                                                p.j = p.n;
                                                            }
                                                            if (p.k < 0 && (var2_26 = (0 - p.k) / 3) != 0) {
                                                                p.k += var7_22 - var7_22 / var2_26;
                                                            }
                                                            if (p.k < 0) {
                                                                p.k = 0;
                                                            }
                                                            if (p.k > p.cF) {
                                                                p.k = p.cF;
                                                            }
                                                            p.l = p.j;
                                                            p.m = p.k;
                                                        }
                                                    }
                                                    if (var1_5.aT && main.a.m) {
                                                        var1_5.aT = false;
                                                        var1_5.dZ = false;
                                                        if (ds.g(main.a.p - var1_5.ec) > 15 || ds.g(main.a.q - var1_5.ed) > 15) {
                                                            main.a.m = false;
                                                        }
                                                    }
                                                }
                                                if (af.e().ci || (var1_5 = this).J()) break block245;
                                                if (var1_5.bQ == null || var1_5.bQ.a == null || !var1_5.bQ.a.c()) break block246;
                                                var1_5.bQ.a.a();
                                                break block245;
                                            }
                                            var2_23 = var1_5;
                                            if (var2_23.aL != null && main.a.a(var3_10 = (main.a.A - 5 * p.eI) / 2, var5_28 = main.a.B - 40, var4_27 = 5 * p.eI, var8_31 = p.eI) != false) break block245;
                                            var6_19 = System.currentTimeMillis();
                                            if (var1_5.aU != 0L) {
                                                var1_5.aU = 0L;
                                                main.a.ai = false;
                                                if (!var1_5.ef) {
                                                    var2_23 = var1_5;
                                                    var3_11 = main.a.p + var2_23.ej;
                                                    var4_27 = main.a.q + var2_23.ek;
                                                    if (!super.g(var3_11, var4_27) && !super.f(var3_11, var4_27)) {
                                                        super.h(var3_11, var4_27);
                                                    }
                                                    main.a.m = false;
                                                    var1_5.ct = true;
                                                    var1_5.cu = l.d();
                                                }
                                            }
                                            if (!var1_5.ct) break block247;
                                            var1_5.cv = l.d();
                                            if (var1_5.cv - var1_5.cu >= 300L || !main.a.m) break block247;
                                            var1_5.ct = false;
                                            var2_23 = var1_5;
                                            var3_12 = main.a.p + var2_23.ej;
                                            var4_27 = main.a.q + var2_23.ek;
                                            af.e();
                                            var8_32 = super.e(var3_12, var4_27);
                                            if (var8_32 == null) break block248;
                                            if (var8_32 instanceof aa && !p.a((aa)var8_32)) break block249;
                                            if (super.a(var8_32) || !var8_32.equals(af.e().aT) && var2_23.aL != null) break block247;
                                            if (!af.e().I() || af.e().aU == null || var8_32.equals(af.e().aU) || var8_32.equals(af.e().aU.aR) || !(var8_32 instanceof af)) break block250;
                                            var5_29 = (af)var8_32;
                                            if (var5_29.aN != 5 && !var5_29.I()) break block249;
                                        }
                                        if (bv.l == 51 && var8_32.equals(af.e().aT)) break block249;
                                        super.b(var8_32);
                                        break block247;
                                    }
                                    if (super.g(var3_12, var4_27) || super.f(var3_12, var4_27)) break block247;
                                }
                                super.h(var3_12, var4_27);
                            }
                            if (!main.a.m) break block245;
                            var2_23 = var1_5;
                            var3_13 = main.a.p + p.j;
                            var4_27 = main.a.q + p.k;
                            af.e();
                            var5_30 = super.e(var3_13, var4_27);
                            if (var5_30 == null) ** GOTO lbl380
                            if (!af.e().I() || af.e().aU == null || var5_30.equals(af.e().aU) || var5_30.equals(af.e().aU.aR) || !(var5_30 instanceof af)) break block251;
                            var8_33 = (af)var5_30;
                            if (var8_33.aN == 5 || var8_33.I()) break block251;
                            super.h(var3_13, var4_27);
                            ** GOTO lbl380
                        }
                        if (af.e().aQ != var5_30 && af.e().aV != var5_30) break block252;
                        super.b(var5_30);
                        v0 = true;
                        break block253;
                    }
                    if (bv.l != 51 || !var5_30.equals(af.e().aT)) break block254;
                    super.h(var3_13, var4_27);
                    ** GOTO lbl380
                }
                if (af.e().cf != null || af.e().cc != null || af.e().cd != null || af.e().D() != null) {
                    v0 = false;
                } else {
                    af.e().a(var5_30);
                    var5_30.p();
lbl380:
                    // 4 sources

                    v0 = false;
                }
            }
            var1_5.ef = v0;
            var1_5.aU = var6_19;
            var1_5.ej = p.j;
            var1_5.ek = p.k;
            main.a.m = false;
        }
        if (af.e().an != null && af.e().an.c()) {
            af.e().an.a();
        }
        if (af.e().cf != null) {
            return;
        }
        if (af.e().H == 1) {
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, false);
            } else if (main.a.j[2]) {
                if (!af.e().bJ) {
                    var1_6 = false;
                    if (af.e().B - af.e().bD != 0 || af.e().C - af.e().bE != 0) {
                        bt.a().g();
                    }
                    af.e().E = -10;
                    af.e().D = 0;
                    af.e().H = 3;
                    af.e().F = 0;
                }
            } else if (main.a.j[4]) {
                p.bj = false;
                af.e().ar = false;
                if (af.e().I == 1) {
                    af.e().I = -1;
                } else if (!af.e().bJ) {
                    if (af.e().B - af.e().bD != 0) {
                        bt.a().g();
                    }
                    af.e().H = 2;
                    af.e().D = -af.e().O;
                }
                af.e().cJ = false;
            } else if (main.a.j[6]) {
                p.bj = false;
                af.e().ar = false;
                if (af.e().I == -1) {
                    af.e().I = 1;
                } else if (!af.e().bJ) {
                    if (af.e().B - af.e().bD != 0) {
                        bt.a().g();
                    }
                    af.e().H = 2;
                    af.e().D = af.e().O;
                }
                af.e().cJ = false;
            }
        } else if (af.e().H == 2) {
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            } else if (main.a.j[2]) {
                if (af.e().B - af.e().bD != 0 || af.e().C - af.e().bE != 0) {
                    bt.a().g();
                }
                af.e().E = -10;
                af.e().H = 3;
                af.e().F = 0;
            } else if (main.a.j[4]) {
                p.bj = false;
                if (af.e().I == 1) {
                    af.e().I = -1;
                } else {
                    v1 = af.e();
                    v2 = -af.e().O;
                    af.e();
                    v1.D = v2;
                }
            } else if (main.a.j[6]) {
                p.bj = false;
                if (af.e().I == -1) {
                    af.e().I = 1;
                } else {
                    v3 = af.e();
                    v4 = af.e().O;
                    af.e();
                    v3.D = v4;
                }
            }
        } else if (af.e().H == 3) {
            p.bj = false;
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (main.a.j[4] || main.a.j[1] && this.aL == null) {
                if (af.e().I == 1) {
                    af.e().I = -1;
                } else {
                    af.e().D = -af.e().O;
                }
            } else if (main.a.j[6] || main.a.j[3] && this.aL == null) {
                if (af.e().I == -1) {
                    af.e().I = 1;
                } else {
                    af.e().D = af.e().O;
                }
            }
            if ((main.a.j[2] || (main.a.j[1] || main.a.j[3]) && this.aL == null) && af.e().ao && af.e().T > 0L && af.e().F < 8 && af.e().E > -4) {
                ++af.e().F;
                af.e().E = -7;
            }
        } else if (af.e().H == 4) {
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (main.a.j[2] && af.e().T > 0L && af.e().ao) {
                p.bj = false;
                if (!(af.e().B - af.e().bD == 0 && af.e().C - af.e().bE == 0 || ds.g(af.e().B - af.e().bD) <= 96 && ds.g(af.e().C - af.e().bE) <= 24)) {
                    bt.a().g();
                }
                af.e().E = -10;
                af.e().H = 3;
                af.e().F = 0;
            }
            if (main.a.j[4]) {
                p.bj = false;
                if (af.e().I == 1) {
                    af.e().I = -1;
                } else {
                    ++af.e().F;
                    af.e().D = -af.e().O;
                    if (af.e().F > 5 && af.e().E > 6) {
                        af.e().H = 10;
                        af.e().F = 0;
                        af.e().E = 0;
                    }
                }
            } else if (main.a.j[6]) {
                p.bj = false;
                if (af.e().I == -1) {
                    af.e().I = 1;
                } else {
                    ++af.e().F;
                    af.e().D = af.e().O;
                    if (af.e().F > 5 && af.e().E > 6) {
                        af.e().H = 10;
                        af.e().F = 0;
                        af.e().E = 0;
                    }
                }
            }
        } else if (af.e().H == 10) {
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (af.e().ao && af.e().T > 0L) {
                if (main.a.j[2]) {
                    p.bj = false;
                    if (!(af.e().B - af.e().bD == 0 && af.e().C - af.e().bE == 0 || ds.g(af.e().B - af.e().bD) <= 96 && ds.g(af.e().C - af.e().bE) <= 24)) {
                        bt.a().g();
                    }
                    af.e().E = -10;
                    af.e().H = 3;
                    af.e().F = 0;
                } else if (main.a.j[4]) {
                    p.bj = false;
                    if (af.e().I == 1) {
                        af.e().I = -1;
                    } else {
                        af.e().D = -(af.e().O + 1);
                    }
                } else if (main.a.j[6]) {
                    if (af.e().I == -1) {
                        af.e().I = 1;
                    } else {
                        af.e().D = af.e().O + 1;
                    }
                }
            }
        } else if (af.e().H == 7) {
            if (main.a.i[5]) {
                main.a.i[5] = false;
            }
            if (main.a.j[4]) {
                p.bj = false;
                if (af.e().I == 1) {
                    af.e().I = -1;
                } else {
                    af.e().D = -af.e().O + 2;
                }
            } else if (main.a.j[6]) {
                p.bj = false;
                if (af.e().I == -1) {
                    af.e().I = 1;
                } else {
                    af.e().D = af.e().O - 2;
                }
            }
        }
        if (main.a.i[8] && main.a.ag != 56) {
            main.a.i[8] = false;
            af.e().bQ = 0;
        }
        if (main.a.i[10]) {
            main.a.i[10] = false;
            this.H();
        }
        if (main.a.ag != 0) {
            if (this.aL == null) {
                if (cd.g) {
                    if (main.a.ag == 113) {
                        if (p.aP[0] != null) {
                            this.a(p.aP[0], true);
                        }
                    } else if (main.a.ag == 119) {
                        if (p.aP[1] != null) {
                            this.a(p.aP[1], true);
                        }
                    } else if (main.a.ag == 101) {
                        if (p.aP[2] != null) {
                            this.a(p.aP[2], true);
                        }
                    } else if (main.a.ag == 114) {
                        if (p.aP[3] != null) {
                            this.a(p.aP[3], true);
                        }
                    } else if (main.a.ag == 116) {
                        if (p.aP[4] != null) {
                            this.a(p.aP[4], true);
                        }
                    } else if (main.a.ag != 50 && main.a.ag != 53) {
                        cq.b().a(main.a.ag, this, "");
                    }
                } else if (!main.a.c) {
                    cq.b().a(main.a.ag, this, "");
                } else if (main.a.ag == 55) {
                    if (p.aP[0] != null) {
                        this.a(p.aP[0], true);
                    }
                } else if (main.a.ag == 56) {
                    if (p.aP[1] != null) {
                        this.a(p.aP[1], true);
                    }
                } else if (main.a.ag == 57) {
                    if (p.aP[2] != null) {
                        this.a(p.aP[2], true);
                    }
                } else if (main.a.ag == 49) {
                    if (p.aP[3] != null) {
                        this.a(p.aP[3], true);
                    }
                } else if (main.a.ag == 51) {
                    if (p.aP[4] != null) {
                        this.a(p.aP[4], true);
                    }
                } else if (main.a.ag == 48) {
                    cq.b().a("");
                }
            } else {
                var1_7 = this.bs.toCharArray();
                var2_23 = new el("");
                var3_14 = 0;
                while (var3_14 < var1_7.length) {
                    var2_23.addElement(String.valueOf(var1_7[var3_14]));
                    ++var3_14;
                }
                var2_23.removeElementAt(0);
                var3_15 = String.valueOf((char)main.a.ag);
                if (var3_15.equals("") || var3_15 == null || var3_15.equals("\n")) {
                    var3_15 = "-";
                }
                var2_23.insertElementAt(var3_15, var2_23.size());
                this.bs = "";
                var1_8 = 0;
                while (var1_8 < var2_23.size()) {
                    this.bs = String.valueOf(this.bs) + ((String)var2_23.elementAt(var1_8)).toUpperCase();
                    ++var1_8;
                }
                bt.a().a((char)main.a.ag);
            }
            main.a.ag = 0;
        }
        main.a.f();
    }

    private bq e(int n2, int n3) {
        bq bq2 = null;
        int n4 = 0;
        el[] elArray = new el[]{F, G, E, D};
        int n5 = 0;
        while (n5 < elArray.length) {
            int n6 = 0;
            while (n6 < elArray[n5].size()) {
                block10: {
                    int n7;
                    bq bq3;
                    block11: {
                        bq3 = (bq)elArray[n5].elementAt(n6);
                        if (bq3.q()) break block10;
                        if (!(bq3 instanceof aa)) break block11;
                        aa aa2 = (aa)bq3;
                        if (aa2.J && aa2.equals(af.e().aR)) break block10;
                    }
                    int n8 = bq3.l();
                    int n9 = bq3.m();
                    int n10 = bq3.o();
                    if (p.a(n2, n3, n8 - n10 / 2 - 30, n9 - (n7 = bq3.n()) - 30, n10 + 60, n7 + 60)) {
                        if (bq2 == null) {
                            bq2 = bq3;
                            n4 = ds.g(n2 - n8) + ds.g(n3 - n9);
                            if (n5 == 1) {
                                return bq2;
                            }
                        } else if ((n8 = ds.g(n2 - n8) + ds.g(n3 - n9)) < n4) {
                            bq2 = bq3;
                            n4 = n8;
                        }
                    }
                }
                ++n6;
            }
            ++n5;
        }
        return bq2;
    }

    private static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n2 >= n4 && n2 <= n4 + n6 && n3 >= n5 && n3 <= n5 + n7;
    }

    private boolean a(bq bq2) {
        int n2;
        if (bq2 == null) {
            return false;
        }
        int n3 = bq2.m();
        if (n3 < (n2 = af.e().C)) {
            while (n3 < n2) {
                if (!bv.a(af.e().B, n2 -= 5, 8192)) continue;
                this.aX = 0;
                af.e();
                af.e().bP = null;
                return true;
            }
        }
        return false;
    }

    private void b(bq bq2) {
        if (!bq2.equals(af.e().aT) && this.aL != null) {
            return;
        }
        if (this.a(bq2)) {
            return;
        }
        boolean bl2 = false;
        bq bq3 = bq2;
        p p2 = this;
        if (bq3 != null && p2.eL <= 0) {
            p2.eL = 10;
            int n2 = bq3.l();
            n2 = (n2 = ds.g(af.e().B - n2)) <= 80 ? 1 : (n2 > 80 && n2 <= 200 ? 2 : (n2 > 200 && n2 <= 400 ? 3 : 4));
            if (bq3.equals(af.e().aQ) || bq3.equals(af.e().aU) && af.e().c(af.e().aU)) {
                at.a(135, bq3.l(), bq3.m(), n2);
            } else if (bq3.equals(af.e().aT) || bq3.equals(af.e().aV) || bq3.equals(af.e().aU)) {
                at.a(136, bq3.l(), bq3.m(), n2);
            }
        }
        af.e();
        af.e().bP = null;
        af.e().E = 0;
        af.e().D = 0;
        bq2.p();
        this.aX = 10;
        this.a(false, true);
        this.eh = bq2.l();
        this.ei = bq2.m();
        this.eg = false;
        this.aV = true;
    }

    private boolean f(int n2, int n3) {
        int n4;
        int n5;
        if (this.equals(aE) && p.j().bQ != null) {
            return false;
        }
        if (p.aE.b.b != null && p.aE.b.b.c != null && p.a(n2 - j, n3 - k, n5 = ds.g(p.aE.d) + p.aE.b.g - 40, n4 = ds.g(p.aE.c) + p.aE.b.h, 200, p.aE.b.j)) {
            n2 = 10;
            eo eo2 = aE;
            aE.g = 10;
            return true;
        }
        return false;
    }

    private boolean g(int n2, int n3) {
        int n4 = 0;
        while (n4 < bo.a.size()) {
            bo bo2 = (bo)bo.a.elementAt(n4);
            if (p.a(n2, n3, bo2.d, bo2.e, bo2.f, bo2.g)) {
                if (bo2.e <= 24 && bv.f() && af.e().aN != 0) {
                    return false;
                }
                if (bo2.j) {
                    bo2.a(10);
                    return true;
                }
            }
            ++n4;
        }
        return false;
    }

    private void h(int n2, int n3) {
        if (dS.c()) {
            return;
        }
        af.e();
        if (n2 < bv.c && n2 > bv.c - 32) {
            af.e().bP = new dm(bv.c, n3);
            return;
        }
        if (n2 < 32 && n2 > 0) {
            af.e().bP = new dm(0, n3);
            return;
        }
        this.eh = n2;
        this.ei = n3;
        this.eg = false;
        af.e().bQ = 0;
        int n4 = n2 = af.e().ao && af.e().T > 0L ? 0 : 1000;
        if (this.ei > af.e().C && ds.g(this.eh - af.e().B) < 12) {
            return;
        }
        n3 = 0;
        while (n3 < n2 + 60) {
            if (this.ei + n3 >= bv.d - 24) break;
            if (bv.a(this.eh, this.ei + n3, 2)) {
                this.ei = bv.e(this.ei + n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        n3 = 0;
        while (n3 < n2 + 40) {
            if (bv.a(this.eh, this.ei - n3, 2)) {
                this.ei = bv.e(this.ei - n3);
                this.eg = true;
                break;
            }
            n3 += 24;
        }
        this.aV = true;
        af.e().bQ = 0;
        if (!this.eg && this.ei < af.e().C - 50) {
            af.e().bQ = 20;
        }
        this.aX = 0;
        if (af.e().cJ) {
            af.e().P();
        }
        af.e().bP = new dm(this.eh, this.ei);
        af.e().I = af.e().B - af.e().bP.a > 0 ? -1 : 1;
        af.e().ay = null;
        bj = false;
    }

    private void H() {
        if (af.e().cR) {
            return;
        }
        if (af.e().cO) {
            return;
        }
        if (af.e().cI > 0) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.em < 10000L) {
            return;
        }
        if (!af.e().M()) {
            aD.a(aw.aU, 0);
            return;
        }
        at.a(11, af.e(), 5);
        at.a(104, af.e(), 4);
        this.em = l2;
        bu.a();
    }

    public final void b(int n2, int n3) {
        if (!this.eo) {
            bu.a();
            ds.c("ACTIVE SUPER POWER");
            this.eo = true;
            this.ep = 0;
            this.es = 0;
            this.eq = n2 - j;
            this.er = n3 - k;
        }
    }

    public final void a(boolean bl2) {
        this.bd = true;
        this.ba = true;
        this.et = true;
        if (bl2) {
            ea ea2 = new ea(20, af.e().B, af.e().C - 77, 2, 8, 1);
            ei.a(ea2);
        }
    }

    public final void o() {
        this.bd = false;
        this.ba = true;
        this.et = false;
    }

    public final void p() {
        this.bb = true;
        this.be = en.a(0.4f, 0, main.a.af[main.a.af.length - 1]);
    }

    public final void c(int n2, int n3) {
        ds.c("VE RONG THAN O VI TRI x= " + n2 + " y=" + n3);
        this.p();
        ea ea2 = new ea(this.bc ? 25 : 17, n2, n3 - 77, 2, -1, 1);
        ei.a(ea2);
    }

    /*
     * Unable to fully structure code
     */
    private void a(boolean var1_1, boolean var2_9) {
        block46: {
            block48: {
                block50: {
                    block73: {
                        block75: {
                            block78: {
                                block77: {
                                    block76: {
                                        block74: {
                                            block67: {
                                                block70: {
                                                    block69: {
                                                        block71: {
                                                            block72: {
                                                                block68: {
                                                                    block59: {
                                                                        block65: {
                                                                            block66: {
                                                                                block64: {
                                                                                    block63: {
                                                                                        block62: {
                                                                                            block61: {
                                                                                                block60: {
                                                                                                    block58: {
                                                                                                        block57: {
                                                                                                            block56: {
                                                                                                                block55: {
                                                                                                                    block54: {
                                                                                                                        block53: {
                                                                                                                            block52: {
                                                                                                                                block51: {
                                                                                                                                    block49: {
                                                                                                                                        block47: {
                                                                                                                                            if (af.e().aU != null && af.e().aU.C >= af.e().C + 48 && bv.a(af.e().B, af.e().C, 2)) {
                                                                                                                                                this.aX = 0;
                                                                                                                                                af.e().bP = null;
                                                                                                                                                af.bH = false;
                                                                                                                                                af.e().bJ = false;
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            ds.c("do fire");
                                                                                                                                            ++p.eu;
                                                                                                                                            var1_2 = af.e().i();
                                                                                                                                            var3_10 = af.e().j();
                                                                                                                                            if (var2_9 == 0 && var1_2 != null && (af.e().aQ == null || af.e().aQ != null && af.e().aQ.C == 0)) {
                                                                                                                                                var1_2.g.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (var2_9 == 0 && var3_10 != null && (af.e().aQ == null || af.e().aQ != null && af.e().aQ.C == 0)) {
                                                                                                                                                var3_10.g.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (bv.l == 51 && af.e().aT != null) {
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (af.e().H == 14) break block46;
                                                                                                                                            af.e().E = 0;
                                                                                                                                            af.e().D = 0;
                                                                                                                                            if (!af.e().w() || !af.e().O()) break block47;
                                                                                                                                            if (this.G()) {
                                                                                                                                                af.e();
                                                                                                                                                af.e();
                                                                                                                                                af.A();
                                                                                                                                            }
                                                                                                                                            break block48;
                                                                                                                                        }
                                                                                                                                        var1_2 = this;
                                                                                                                                        if (!var1_2.a(af.e().aU)) break block49;
                                                                                                                                        v0 = false;
                                                                                                                                        break block50;
                                                                                                                                    }
                                                                                                                                    if (!super.a(af.e().aQ)) break block51;
                                                                                                                                    v0 = false;
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                if (!super.a(af.e().aT)) break block52;
                                                                                                                                v0 = false;
                                                                                                                                break block50;
                                                                                                                            }
                                                                                                                            if (!cq.b().b) break block53;
                                                                                                                            v0 = false;
                                                                                                                            break block50;
                                                                                                                        }
                                                                                                                        if (bp.b) break block54;
                                                                                                                        af.e();
                                                                                                                        if (!af.bH) break block55;
                                                                                                                    }
                                                                                                                    v0 = false;
                                                                                                                    break block50;
                                                                                                                }
                                                                                                                if (af.e().aC == null || af.e().aC.a.a != 6 || af.e().aV == null) break block56;
                                                                                                                super.I();
                                                                                                                v0 = false;
                                                                                                                break block50;
                                                                                                            }
                                                                                                            if (af.e().aC == null || af.e().aC.a.e != 2 || af.e().aT != null || af.e().aC.a.a == 6) break block57;
                                                                                                            v0 = super.G();
                                                                                                            break block50;
                                                                                                        }
                                                                                                        if (af.e().cf == null && (af.e().aQ != null || af.e().aT != null || af.e().aU != null || af.e().aV != null)) break block58;
                                                                                                        v0 = false;
                                                                                                        break block50;
                                                                                                    }
                                                                                                    if (af.e().aQ == null) break block59;
                                                                                                    if (af.e().aQ.u() && af.e().aQ.p == 4) {
                                                                                                        af.e().aQ = null;
                                                                                                        af.e().bP = null;
                                                                                                    }
                                                                                                    p.bj = true;
                                                                                                    if (p.a(af.e().aQ)) break block60;
                                                                                                    v0 = false;
                                                                                                    break block50;
                                                                                                }
                                                                                                if (var1_2.aL == null) break block61;
                                                                                                v0 = false;
                                                                                                break block50;
                                                                                            }
                                                                                            if (af.e().aC != null) break block62;
                                                                                            v0 = false;
                                                                                            break block50;
                                                                                        }
                                                                                        if (!af.e().w()) break block63;
                                                                                        v0 = false;
                                                                                        break block50;
                                                                                    }
                                                                                    var2_9 = -1;
                                                                                    var3_11 = ds.g(af.e().B - p.j) * en.b;
                                                                                    if (af.e().aU != null) {
                                                                                        var2_9 = ds.g(af.e().B - af.e().aU.B) * en.b;
                                                                                    } else if (af.e().aQ != null) {
                                                                                        var2_9 = ds.g(af.e().B - af.e().aQ.m) * en.b;
                                                                                    }
                                                                                    if ((af.e().aQ.p == 1 || af.e().aQ.p == 0 || af.e().aC.a.e == 4 || var2_9 == -1 || var2_9 > var3_11) && af.e().aC.a.e == 4) {
                                                                                        af.e().I = af.e().aQ.m < af.e().B ? -1 : 1;
                                                                                        super.a(af.e().aC, true);
                                                                                    }
                                                                                    if (super.G()) break block64;
                                                                                    v0 = false;
                                                                                    break block50;
                                                                                }
                                                                                af.e().I = af.e().B < af.e().aQ.l() ? 1 : -1;
                                                                                var1_3 = Math.abs(af.e().B - af.e().aQ.l());
                                                                                var3_11 = Math.abs(af.e().C - af.e().aQ.m());
                                                                                af.e().D = 0;
                                                                                if (var1_3 > af.e().aC.g || var3_11 > af.e().aC.h) break block65;
                                                                                if (af.e().aC.a.a == 20) ** GOTO lbl-1000
                                                                                if (var3_11 <= var1_3 || ds.g(af.e().C - af.e().aQ.m()) <= 30 || af.e().aQ.z().c != 4) break block66;
                                                                                af.e().bP = new dm(af.e().B + af.e().I, af.e().aQ.m());
                                                                                af.e().ay = new de(null, null, 8002, null);
                                                                                main.a.g();
                                                                                main.a.f();
                                                                                v0 = false;
                                                                                break block50;
                                                                            }
                                                                            var4_14 = 20;
                                                                            var2_9 = 0;
                                                                            if (af.e().aQ instanceof cc || af.e().aQ instanceof d) {
                                                                                var2_9 = 1;
                                                                            }
                                                                            if (af.e().aC.g > 100) {
                                                                                var4_14 = 60;
                                                                                if (var1_3 < 20) {
                                                                                    af.e().a(af.e().B, af.e().C, 10);
                                                                                }
                                                                            }
                                                                            ds.c("dt= " + var4_14);
                                                                            var3_11 = 0;
                                                                            if ((bv.b(af.e().B, af.e().C + 3) & 2) == 2) {
                                                                                v1 = var5_17 = af.e().B > af.e().aQ.l() ? 1 : -1;
                                                                                if ((bv.b(af.e().aQ.l() + var4_14 * var5_17, af.e().C + 3) & 2) != 2) {
                                                                                    var3_11 = 1;
                                                                                }
                                                                            }
                                                                            if (var1_3 <= var4_14 && var3_11 == 0) {
                                                                                if (af.e().B > af.e().aQ.l()) {
                                                                                    var5_17 = af.e().aQ.l() + var4_14 + (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = af.e().aQ.l();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 < var5_17) {
                                                                                        if (bv.b(var1_3, af.e().C + 3) == 8 || bv.b(var1_3, af.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 += 24;
                                                                                    }
                                                                                    af.e().B = var2_9 != 0 ? var1_3 - 24 : var5_17;
                                                                                    af.e().I = -1;
                                                                                } else {
                                                                                    var5_17 = af.e().aQ.l() - var4_14 - (var2_9 != 0 ? 30 : 0);
                                                                                    var1_3 = af.e().aQ.l();
                                                                                    var2_9 = 0;
                                                                                    while (var1_3 > var5_17) {
                                                                                        if (bv.b(var1_3, af.e().C + 3) == 8 || bv.b(var1_3, af.e().C + 3) == 4) {
                                                                                            var2_9 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var1_3 -= 24;
                                                                                    }
                                                                                    af.e().B = var2_9 != 0 ? var1_3 + 24 : var5_17;
                                                                                    af.e().I = 1;
                                                                                }
                                                                                bt.a().g();
                                                                            }
                                                                            main.a.g();
                                                                            main.a.f();
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        var4_15 = false;
                                                                        if (af.e().aQ instanceof cc || af.e().aQ instanceof d) {
                                                                            var4_15 = true;
                                                                        }
                                                                        var2_9 = (af.e().aC.g - (var4_15 != false ? 50 : 20)) * (af.e().B > af.e().aQ.l() ? 1 : -1);
                                                                        if (var1_3 <= af.e().aC.g) {
                                                                            var2_9 = 0;
                                                                        }
                                                                        af.e().bP = new dm(af.e().aQ.l() + var2_9, af.e().aQ.m());
                                                                        af.e().ay = new de(null, null, 8002, null);
                                                                        main.a.g();
                                                                        main.a.f();
                                                                        v0 = false;
                                                                        break block50;
                                                                    }
                                                                    if (af.e().aT == null) break block67;
                                                                    if (!af.e().aT.dh) break block68;
                                                                    v0 = false;
                                                                    break block50;
                                                                }
                                                                af.e().I = af.e().B < af.e().aT.B ? 1 : -1;
                                                                af.e().aT.I = af.e().B < af.e().aT.B ? -1 : 1;
                                                                var2_9 = Math.abs(af.e().B - af.e().aT.B);
                                                                var3_12 = Math.abs(af.e().C - af.e().aT.C);
                                                                if (var3_12 > 40) {
                                                                    af.e().C = af.e().aT.C - 40;
                                                                }
                                                                if (var2_9 >= 60) break block69;
                                                                main.a.g();
                                                                main.a.f();
                                                                if (var1_2.dv != 0) break block70;
                                                                if (af.e().aD == null || af.e().aD.c != 0) break block71;
                                                                if (af.e().aD.a >= 4 || af.e().aT.df.a != 4) break block72;
                                                                v0 = false;
                                                                break block50;
                                                            }
                                                            if (af.e().aD.a >= 3 || af.e().aT.df.a != 3) break block71;
                                                            v0 = false;
                                                            break block50;
                                                        }
                                                        var1_2.dv = 50;
                                                        bp.a();
                                                        bt.a().g();
                                                        bt.a().j(af.e().aT.df.a);
                                                        break block70;
                                                    }
                                                    var1_4 = (20 + ds.a.nextInt(20)) * (af.e().B > af.e().aT.B ? 1 : -1);
                                                    af.e().bP = new dm(af.e().aT.B + var1_4, af.e().C);
                                                    af.e().ay = new de(null, null, 8002, null);
                                                    main.a.g();
                                                    main.a.f();
                                                }
                                                v0 = false;
                                                break block50;
                                            }
                                            if (af.e().aU == null) break block73;
                                            if (var1_2.aL == null) break block74;
                                            v0 = false;
                                            break block50;
                                        }
                                        af.e().I = af.e().B < af.e().aU.B ? 1 : -1;
                                        var2_9 = Math.abs(af.e().B - af.e().aU.B);
                                        var3_13 = Math.abs(af.e().C - af.e().aU.C);
                                        if (!af.e().c(af.e().aU) && !af.e().y()) break block75;
                                        if (af.e().aC != null) break block76;
                                        v0 = false;
                                        break block50;
                                    }
                                    if (super.G()) break block77;
                                    v0 = false;
                                    break block50;
                                }
                                af.e().I = af.e().B < af.e().aU.B ? 1 : -1;
                                af.e().D = 0;
                                if (var2_9 > af.e().aC.g || var3_13 > af.e().aC.h) break block78;
                                if (af.e().aC.a.a != 20) {
                                    var1_5 = 20;
                                    if (af.e().aC.g > 60) {
                                        var1_5 = 60;
                                        if (var2_9 < 20) {
                                            af.e().a(af.e().B, af.e().C, 10);
                                        }
                                    }
                                    var3_13 = 0;
                                    if ((bv.b(af.e().B, af.e().C + 3) & 2) == 2) {
                                        v2 = var4_16 = af.e().B > af.e().aU.B ? 1 : -1;
                                        if ((bv.b(af.e().aU.B + var1_5 * var4_16, af.e().C + 3) & 2) != 2) {
                                            var3_13 = 1;
                                        }
                                    }
                                    if (var2_9 <= var1_5 && var3_13 == 0) {
                                        if (af.e().B > af.e().aU.B) {
                                            af.e().B = af.e().aU.B + var1_5;
                                            af.e().I = -1;
                                        } else {
                                            af.e().B = af.e().aU.B - var1_5;
                                            af.e().I = 1;
                                        }
                                        bt.a().g();
                                    }
                                    main.a.g();
                                    main.a.f();
                                }
                                ** GOTO lbl-1000
                            }
                            var1_6 = (af.e().aC.g - 20) * (af.e().B > af.e().aU.B ? 1 : -1);
                            if (var2_9 <= af.e().aC.g) {
                                var1_6 = 0;
                            }
                            af.e().bP = new dm(af.e().aU.B + var1_6, af.e().aU.C);
                            af.e().ay = new de(null, null, 8002, null);
                            main.a.g();
                            main.a.f();
                            v0 = false;
                            break block50;
                        }
                        if (var2_9 < 60 && var3_13 < 40) {
                            af.e();
                            super.F();
                            if (!main.a.e && af.e().aU.J >= 0 && bv.l != 51 && bv.l != 52 && var1_2.bQ == null) {
                                main.a.G.a(af.e().aU);
                                main.a.G.s();
                                bt.a().c(af.e().aU.J);
                                bt.a().y(af.e().aU.J);
                            }
                        } else {
                            var1_7 = (20 + ds.a.nextInt(20)) * (af.e().B > af.e().aU.B ? 1 : -1);
                            af.e().bP = new dm(af.e().aU.B + var1_7, af.e().aU.C);
                            af.e().ay = new de(null, null, 8002, null);
                            main.a.g();
                            main.a.f();
                        }
                        v0 = false;
                        break block50;
                    }
                    if (af.e().aV != null) {
                        super.I();
                        v0 = false;
                    } else lbl-1000:
                    // 4 sources

                    {
                        v0 = true;
                    }
                }
                if (v0) {
                    if (af.e().z() && af.e().O()) {
                        if (this.G()) {
                            af.e();
                            af.e().B();
                        } else {
                            af.e().C();
                        }
                    } else {
                        var1_8 = bv.a(af.e().B, af.e().C, 2);
                        af.e().a(p.u[af.e().aC.b], var1_8 != false ? 0 : 1);
                        if (var1_8) {
                            af.e().bQ = 20;
                        }
                        af.e();
                    }
                }
            }
            if (af.e().y()) {
                this.aX = 0;
            }
        }
    }

    private void I() {
        if (af.e().aV != null) {
            af.e().I = af.e().B < af.e().aV.a ? 1 : -1;
            int n2 = Math.abs(af.e().B - af.e().aV.a);
            int n3 = Math.abs(af.e().C - af.e().aV.b);
            if (n2 <= 40 && n3 < 40) {
                main.a.g();
                main.a.f();
                if (af.e().aV.e.a != 673) {
                    bt.a().l(af.e().aV.d);
                    return;
                }
                do do_ = new do(5, 0, -100, 100, 5, p.aD.a[af.e().K][2]);
                ds.c(af.e().aT != null ? "!null" : "null");
                String string = aw.aA;
                String[] stringArray = new String[]{aw.bn, aw.bo};
                ds.c(af.e().aT != null ? "!null" : "null");
                do_.dk = 673;
                p.j();
                p.a(stringArray, do_);
                ae.a(string, 100000, do_, 5820);
                return;
            }
            af.e().bP = new dm(af.e().aV.a, af.e().aV.b);
            af.e().ay = new de(null, null, 8002, null);
            main.a.g();
            main.a.f();
        }
    }

    private boolean J() {
        return af.e().ci || af.e().ch || af.e().cj || af.e().cG || this.eo || af.e().bk;
    }

    private void a(bf bf2, boolean bl2) {
        if (af.e().ce) {
            return;
        }
        if (this.J()) {
            return;
        }
        if (af.e().aD.c <= 1) {
            return;
        }
        af.e().aC = bf2;
        if (this.ey != bf2 && this.ey != null) {
            bt.a().i(bf2.a.a);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            p.j().aX = 0;
            return;
        }
        if (af.e().x()) {
            ds.c(">>>use skill spec: " + bf2.a.a);
            af.e().a(bf2.a.a);
            this.n();
            this.ey = bf2;
            this.ex = -1;
            p.j().aX = 0;
            return;
        }
        if (af.e().w()) {
            ds.c("use skill not focus");
            this.a(bf2);
            this.ey = bf2;
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            ds.c("only select skill");
            if (this.ey != bf2) {
                bt.a().i(bf2.a.a);
                this.n();
            }
            if (af.e().aU == null && af.e().y()) {
                ds.c("return o day");
                return;
            }
            if (af.e().O()) {
                this.a(true, true);
            }
            this.ey = bf2;
        }
    }

    private void b(bf bf2, boolean bl2) {
        if ((bv.l == 112 || bv.l == 113) && af.e().aN == 0) {
            return;
        }
        if (af.e().w()) {
            this.a(bf2);
            return;
        }
        this.ex = -1;
        if (bf2 != null) {
            bt.a().i(bf2.a.a);
            this.n();
            af.e().aC = bf2;
            this.a(bl2, true);
        }
    }

    private void a(bf bf2) {
        if ((bv.l == 112 || bv.l == 113) && af.e().aN == 0) {
            return;
        }
        if (this.G()) {
            this.ex = -1;
            if (bf2 != null) {
                bt.a().i(bf2.a.a);
                this.n();
                af.e().aC = bf2;
                af.e();
                af.A();
                af.e();
                this.aX = 0;
            }
        }
    }

    public static void q() {
        int n2 = 0;
        while (n2 < af.e().aA.size() - 1) {
            bf bf2 = (bf)af.e().aA.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < af.e().aA.size()) {
                bf bf3 = (bf)af.e().aA.elementAt(n3);
                if (bf3.a.a < bf2.a.a) {
                    bf bf4 = bf3;
                    bf3 = bf2;
                    bf2 = bf4;
                    af.e().aA.setElementAt(bf2, n2);
                    af.e().aA.setElementAt(bf3, n3);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private void K() {
        if (this.N()) {
            return;
        }
        int n2 = 0;
        while (n2 < this.bm.length()) {
            int n3;
            int n4;
            int n5;
            int n6;
            this.bq[n2] = -1;
            if (main.a.f && main.a.a(n6 = (main.a.A - this.bm.length() * eI) / 2, n5 = main.a.B - 40, n4 = this.bm.length() * eI, n3 = eI)) {
                if (n2 == (n6 = (main.a.p - n6) / eI)) {
                    this.bq[n2] = 1;
                }
                if (main.a.l && main.a.m && n2 == n6) {
                    char[] cArray = this.bs.toCharArray();
                    el el2 = new el("");
                    n5 = 0;
                    while (n5 < cArray.length) {
                        el2.addElement(String.valueOf(cArray[n5]));
                        ++n5;
                    }
                    el2.removeElementAt(0);
                    el2.insertElementAt(String.valueOf(this.bm.charAt(n2)), el2.size());
                    this.bs = "";
                    n5 = 0;
                    while (n5 < el2.size()) {
                        this.bs = String.valueOf(this.bs) + ((String)el2.elementAt(n5)).toUpperCase();
                        ++n5;
                    }
                    bt.a().a(this.bm.charAt(n2));
                }
            }
            ++n2;
        }
    }

    public final void c() {
        Object object;
        if (main.a.w % 100 == 0 && bv.l == 137) {
            bu = 30;
        }
        if (bj && main.a.w % 20 == 0) {
            object = this;
            if (((p)object).ev > 0) {
                --((p)object).ev;
            }
            if (!(!bk || bl || af.e().H == 14 || af.e().H == 5 || af.e().bl || af.e().ci || af.e().z())) {
                Object object2;
                boolean bl2 = false;
                int n2 = 0;
                while (n2 < F.size()) {
                    object2 = (aa)F.elementAt(n2);
                    if (((aa)object2).p != 0 && ((aa)object2).p != 1) {
                        bl2 = true;
                    }
                    ++n2;
                }
                if (bl2) {
                    n2 = 0;
                    int n3 = 0;
                    while (n3 < af.e().aF.length) {
                        h h2 = af.e().aF[n3];
                        if (h2 != null && h2.b.b == 6) {
                            n2 = 1;
                            break;
                        }
                        ++n3;
                    }
                    if (n2 == 0 && main.a.w % 150 == 0) {
                        bt.a().v();
                    }
                    if (af.e().U <= af.e().V * 20L / 100L || af.e().T <= af.e().W * 20L / 100L) {
                        super.H();
                    }
                    if (af.e().aQ == null || af.e().aQ != null && af.e().aQ.J) {
                        n3 = 0;
                        while (n3 < F.size()) {
                            aa aa2 = (aa)F.elementAt(n3);
                            if (aa2.p != 0 && aa2.p != 1 && aa2.k > 0L && !aa2.J) {
                                af.e().B = aa2.m;
                                af.e().C = aa2.n;
                                af.e().aQ = aa2;
                                bt.a().g();
                                ds.c("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                                break;
                            }
                            ++n3;
                        }
                    } else if (af.e().aQ.k <= 0L || af.e().aQ.p == 1 || af.e().aQ.p == 0) {
                        af.e().aQ = null;
                    }
                    if (af.e().aQ != null && ((p)object).ev == 0 && (af.e().D() == null || af.e().cb >= af.e().D().length || af.e().cd == null || af.e().cc == null)) {
                        long l2;
                        object2 = null;
                        if (main.a.e) {
                            int n4 = 0;
                            while (n4 < aQ.length) {
                                if (aQ[n4] != null && !p.aQ[n4].j && p.aQ[n4].a.a != 10 && p.aQ[n4].a.a != 11 && p.aQ[n4].a.a != 14 && p.aQ[n4].a.a != 23 && p.aQ[n4].a.a != 7 && af.e().D() == null && !p.aQ[n4].a.c() && af.e().T >= (l2 = p.aQ[n4].a.d == 2 ? 1L : (p.aQ[n4].a.d != 1 ? (long)p.aQ[n4].i : (long)p.aQ[n4].i * af.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aQ[n4];
                                    } else if (((bf)object2).e < p.aQ[n4].e) {
                                        object2 = aQ[n4];
                                    }
                                }
                                ++n4;
                            }
                            if (object2 != null) {
                                super.a((bf)object2, true);
                                super.b(af.e().aQ);
                            }
                        } else {
                            int n5 = 0;
                            while (n5 < aP.length) {
                                if (aP[n5] != null && !p.aP[n5].j && p.aP[n5].a.a != 10 && p.aP[n5].a.a != 11 && p.aP[n5].a.a != 14 && p.aP[n5].a.a != 23 && p.aP[n5].a.a != 7 && af.e().D() == null && af.e().T >= (l2 = p.aP[n5].a.d == 2 ? 1L : (p.aP[n5].a.d != 1 ? (long)p.aP[n5].i : (long)p.aP[n5].i * af.e().W / 100L))) {
                                    if (object2 == null) {
                                        object2 = aP[n5];
                                    } else if (((bf)object2).e < p.aP[n5].e) {
                                        object2 = aP[n5];
                                    }
                                }
                                ++n5;
                            }
                            if (object2 != null) {
                                super.a((bf)object2, true);
                                super.b(af.e().aQ);
                            }
                        }
                    }
                }
            }
        }
        object = this;
        if (((p)object).fB != 0) {
            eF = System.currentTimeMillis();
            if (eF - eE > 1000L) {
                eE = System.currentTimeMillis();
                ++eG;
            }
            if (eG > 20) {
                int n6 = 0;
                while (n6 < ((p)object).fu.length) {
                    ((p)object).fv[n6] = ((p)object).fu[n6];
                    ++n6;
                }
                --((p)object).fB;
                if (((p)object).fB == 0) {
                    ((p)object).fF = "";
                    aD.a(((p)object).fA, 0);
                    eG = 0;
                }
            } else if (((p)object).fz > ((p)object).fu.length - 1) {
                --((p)object).fB;
                if (((p)object).fB == 0) {
                    ((p)object).fF = "";
                    aD.a(((p)object).fA, 0);
                }
            } else {
                if (((p)object).fz < ((p)object).fv.length) {
                    if (((p)object).fw[((p)object).fz] == 15) {
                        if (((p)object).fv[((p)object).fz] == ((p)object).fu[((p)object).fz] - 1) {
                            ((p)object).fy[((p)object).fz] = 10;
                        }
                        if (((p)object).fv[((p)object).fz] == ((p)object).fu[((p)object).fz]) {
                            ((p)object).fw[((p)object).fz] = -1;
                            ++((p)object).fz;
                        }
                    } else if (main.a.w % 5 == 0) {
                        int n7 = ((p)object).fz;
                        ((p)object).fw[n7] = ((p)object).fw[n7] + 1;
                    }
                }
                int n8 = 0;
                while (n8 < ((p)object).fu.length) {
                    if (((p)object).fw[n8] != -1) {
                        int n9 = n8;
                        ((p)object).fx[n9] = ((p)object).fx[n9] + 1;
                        if (((p)object).fx[n8] > ((p)object).fw[n8] + ((p)object).fy[n8]) {
                            ((p)object).fx[n8] = 0;
                            int n10 = n8;
                            ((p)object).fv[n10] = ((p)object).fv[n10] + 1;
                            if (((p)object).fv[n8] >= 10) {
                                ((p)object).fv[n8] = 0;
                            }
                        }
                    }
                    ++n8;
                }
            }
        }
        bl.d();
        ++this.dR;
        if (this.dR == 100) {
            this.dR = 0;
        }
        try {
            if (x.c) {
                x.c = false;
            }
            if (M == 1) {
                eC = System.currentTimeMillis();
            }
            if (M == 100) {
                M = 0;
                eD = System.currentTimeMillis();
                int n11 = (int)(eD - eC) / 1000;
                bt.a().g(n11);
            }
            if (z > 0 && --z == 0) {
                ac.b = false;
            }
            if (!a) {
                if (j != l || k != m) {
                    cD = l - j << 2;
                    cE = m - k << 2;
                    cB &= 0xF;
                    k += (cC += cE) >> 4;
                    cC &= 0xF;
                    if ((j += (cB += cD) >> 4) < 24) {
                        j = 24;
                    }
                    if (j > n) {
                        j = n;
                    }
                    if (k < 0) {
                        k = 0;
                    }
                    if (k > cF) {
                        k = cF;
                    }
                }
                if ((o = j / bv.i - 1) < 0) {
                    o = 0;
                }
                p = k / bv.i;
                q = o + cw;
                r = p + cx;
                if (p < 0) {
                    p = 0;
                }
                if (r > bv.b - 1) {
                    r = bv.b - 1;
                }
                if ((bv.B = (af.e().B - 2 * d) / bv.i) < 0) {
                    bv.B = 0;
                }
                if ((bv.C = bv.B + bv.F) > bv.a) {
                    bv.C = bv.a;
                    bv.B = bv.C - bv.F;
                }
                if ((bv.D = (af.e().C - 2 * e) / bv.i) < 0) {
                    bv.D = 0;
                }
                if ((bv.E = bv.D + bv.G) > bv.b) {
                    bv.E = bv.b;
                    bv.D = bv.E - bv.G;
                }
                cK.b();
                cJ.b();
            }
            cq.b().c();
            int n12 = 0;
            while (n12 < D.size()) {
                ((af)D.elementAt(n12)).a();
                ++n12;
            }
            n12 = 0;
            while (n12 < cn.a.size()) {
                ((cn)cn.a.elementAt(n12)).a();
                ++n12;
            }
            af.e().a();
            if (af.e().H == 1 && main.a.w % 100 == 0) {
                System.gc();
            }
            if (this.bQ != null) {
                this.bQ.a();
            }
            ei.a();
            n12 = 0;
            while (n12 < F.size()) {
                ((aa)F.elementAt(n12)).c();
                ++n12;
            }
            n12 = 0;
            while (n12 < G.size()) {
                ((do)G.elementAt(n12)).a();
                ++n12;
            }
            this.ew = aQ.length;
            n12 = aQ.length - 1;
            while (n12 >= 0) {
                bf bf2 = aQ[n12];
                if (bf2 != null) {
                    this.ew = n12 + 1;
                    break;
                }
                --this.ew;
                --n12;
            }
            p.m();
            main.a.a().j();
            n12 = 0;
            while (n12 < 5) {
                if (bI[n12] != -1) {
                    if (bI[n12] > fa[n12]) {
                        int n13 = n12;
                        fd[n13] = fd[n13] + 1;
                        if (fd[n12] == 25) {
                            p.fd[n12] = 0;
                            p.bI[n12] = -1;
                            p.fa[n12] = 0;
                            p.fb[n12] = 0;
                            p.bG[n12] = 0;
                        }
                    } else {
                        int n14 = n12;
                        bI[n14] = bI[n14] + ds.g(fc[n12]);
                        int n15 = n12;
                        bG[n15] = bG[n15] + fb[n12];
                        int n16 = n12;
                        bH[n16] = bH[n16] + fc[n12];
                    }
                }
                ++n12;
            }
            bo.b();
            n12 = 0;
            while (n12 < 2) {
                if (fg[n12] != -1) {
                    int n17 = n12;
                    fg[n17] = fg[n17] + 1;
                    int n18 = n12;
                    fe[n18] = fe[n18] + (fi[n12] << 2);
                    int n19 = n12;
                    ff[n19] = ff[n19] - 1;
                    if (fg[n12] >= 6) {
                        p.fg[n12] = -1;
                    } else {
                        p.fh[n12] = (fg[n12] >> 1) % 3;
                    }
                }
                ++n12;
            }
            if (fo != fp) {
                fr = fp - fo << 2;
                fo += (fq += fr) >> 4;
                fq &= 0xF;
            }
            if (Math.abs(fp - fo) < 15 && fo < 0) {
                fp = 0;
            }
            if (Math.abs(fp - fo) < 15 && fo > 0) {
                fp = 0;
            }
            p p2 = this;
            if (p2.eL > 0) {
                --p2.eL;
            }
            if (p2.aV) {
                p2.aV = false;
                bq bq2 = p2.e(p2.eh, p2.ei);
                if (bq2 == null || bq2 != null && bq2.equals(af.e().aT) && bv.l == 51) {
                    at.a(134, p2.eh, p2.ei + main.a.ae / 2, 3);
                }
            }
            int n20 = 0;
            while (n20 < E.size()) {
                ((ce)E.elementAt(n20)).a();
                ++n20;
            }
            n20 = dc.y.size() - 1;
            while (n20 >= 0) {
                dc.x.removeElement(dc.y.elementAt(n20));
                dc.y.removeElementAt(n20);
                --n20;
            }
            n20 = 0;
            while (n20 < dc.x.size()) {
                dc dc2 = (dc)dc.x.elementAt(n20);
                dc2.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.z.size()) {
                dc dc3 = (dc)dc.z.elementAt(n20);
                dc3.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.A.size()) {
                dc dc4 = (dc)dc.A.elementAt(n20);
                dc4.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.B.size()) {
                dc dc5 = (dc)dc.B.elementAt(n20);
                dc5.a();
                ++n20;
            }
            n20 = 0;
            while (n20 < dc.w.size()) {
                dc dc6 = (dc)dc.w.elementAt(n20);
                dc6.a();
                ++n20;
            }
            ed.c();
            aD.a();
            aE.a();
            if (Q != null && !Q.equals(af.e())) {
                Q.a();
            }
            ++this.eH;
            if (this.eH > 3) {
                this.eH = 0;
            }
            if (this.bE) {
                ++this.bD;
                if (this.bD == 20L) {
                    this.bD = 0L;
                    this.bE = false;
                }
            } else if (this.bC > af.e().U) {
                long l3 = this.bC - af.e().U >> 1;
                if (l3 < 1L) {
                    l3 = 1L;
                }
                this.bC -= l3;
            } else {
                this.bC = af.e().U;
            }
            if (this.bB) {
                ++this.bA;
                if (this.bA == 20L) {
                    this.bA = 0L;
                    this.bB = false;
                }
            } else if (this.bz > af.e().T) {
                long l4 = this.bz - af.e().T >> 1;
                if (l4 < 1L) {
                    l4 = 1L;
                }
                this.bz -= l4;
            } else {
                this.bz = af.e().T;
            }
            if (this.dv > 0) {
                --this.dv;
            }
            if (this.r()) {
                while (this.bg - 100 < k) {
                    --k;
                }
            }
            n20 = 0;
            while (n20 < af.br.size()) {
                ((cy)af.br.elementAt(n20)).a();
                ++n20;
            }
            n20 = 0;
            while (n20 < bv.size()) {
                ((cy)bv.elementAt(n20)).a();
                ++n20;
            }
            p p3 = this;
            if (p3.fE) {
                p3.fC -= 2;
                if (p3.fC < -p3.fD) {
                    p3.fC = main.a.A;
                    ft.removeElementAt(0);
                    if (ft.size() == 0) {
                        p3.bR = false;
                        p3.fE = false;
                    } else {
                        p3.fD = di.c.a((String)ft.elementAt(0));
                    }
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        int n21 = main.a.w % 4000;
        if (n21 == 1000) {
            as.a(as.a, 10);
        }
        dh.a();
    }

    public final boolean r() {
        return this.et;
    }

    public static void a(en en2, int n2) {
        int n3 = 0;
        while (n3 < bv.v.size()) {
            cz cz2 = (cz)bv.v.elementAt(n3);
            if (cz2.c != -1 && cz2.h == n2) {
                cz2.a(en2);
            }
            ++n3;
        }
        if (bv.l == 48 && n2 == 3 && main.a.P != null && main.a.P[0] != 0) {
            n3 = 0;
            while (n3 < bv.c / main.a.P[0] + 1) {
                en2.a(main.a.N[0], n3 * main.a.P[0], bv.d - main.a.Q[0] - 70, 0);
                ++n3;
            }
        }
    }

    public static void b(en en2) {
        if (main.a.a) {
            return;
        }
        en2.a(en, 0, 0, main.a.A, main.a.B);
    }

    public final void a(en en2) {
        int n2;
        int n3;
        int n4;
        Object object;
        int n5;
        aN = 0;
        if (!bt) {
            return;
        }
        if (this.aZ || this.ba && ae.m == null) {
            ++this.aY;
            if (this.aY < 30 && this.aY >= 0 && main.a.w % 4 == 0 || this.aY >= 30 && this.aY <= 50 && main.a.w % 3 == 0 || this.aY > 50) {
                en2.a(0xFFFFFF);
                en2.d(0, 0, main.a.A, main.a.B);
                if (this.aY > 50) {
                    if (this.ba) {
                        this.ba = false;
                        this.aY = 0;
                        if (this.bd) {
                            this.c(this.bf, this.bg);
                        } else {
                            p p2 = this;
                            this.bb = false;
                            ei.a(17);
                            if (p2.bc) {
                                p2.bc = false;
                                ei.a(25);
                            }
                        }
                    }
                    this.e(en2);
                    en2.a(-j, -k);
                    en2.a(0, main.a.ae);
                    af.e().a(en2);
                    l.a(en2);
                    p.c(en2);
                    this.f(en2);
                    return;
                }
                return;
            }
        }
        main.a.c(en2);
        if ((this.bb || this.bR) && bv.o != 3) {
            p.b(en2);
        }
        if (bu > 0) {
            en2.a(-j + eJ[bu % eJ.length], -k + eK[bu % eK.length]);
            --bu;
        } else {
            en2.a(-j, -k);
        }
        if (this.eo) {
            n5 = main.a.w % 3 == 0 ? 3 : -3;
            en2.a(n5, 0);
        }
        ed.c(en2);
        ei.a(en2);
        bv.a(en2);
        bv.b(en2);
        int n6 = 0;
        while (n6 < D.size()) {
            af af2 = (af)D.elementAt(n6);
            if (af2.ck && bv.l == 128) {
                af2.b(en2, af2.B, af2.C, 0);
            }
            ++n6;
        }
        if (af.e().ck && bv.l == 128) {
            af.e().b(en2, af.e().B, af.e().C, 0);
        }
        p.a(en2, 2);
        if (af.e().an != null && main.a.e) {
            if (bb.cs == 20) {
                en2.a(dz, af.e().an.j + j, af.e().an.k + k, 3);
            } else {
                en2.a(dy, af.e().an.j + j, af.e().an.k + k, 3);
            }
        }
        ed.f(en2);
        dh.a.a(en2);
        n6 = 0;
        while (n6 < dc.B.size()) {
            dc dc2 = (dc)dc.B.elementAt(n6);
            dc2.a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < cn.a.size()) {
            ((cn)cn.a.elementAt(n6)).a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (do)G.elementAt(n6);
            if (do_.U > 0L) {
                do_.c(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < G.size()) {
            ((do)G.elementAt(n6)).a(en2);
            ++n6;
        }
        en2.a(0, main.a.ae);
        n6 = 0;
        while (n6 < D.size()) {
            af af3 = null;
            try {
                af3 = (af)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af3 == null || main.a.G.a && main.a.G.F() || !af3.bd)) {
                af3.c(en2);
            }
            ++n6;
        }
        af.e().c(en2);
        ei.b(en2);
        n6 = 0;
        while (n6 < F.size()) {
            ((aa)F.elementAt(n6)).a(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < cn.a.size()) {
            ((cn)cn.a.elementAt(n6)).b(en2);
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            af af4 = null;
            try {
                af4 = (af)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af4 == null || main.a.G.a && main.a.G.F())) {
                af4.a(en2);
            }
            ++n6;
        }
        af.e().a(en2);
        if (af.e().cf != null && af.e().D() != null && af.e().cb < af.e().D().length) {
            af.e().d(en2);
            af.e().b(en2);
        }
        n6 = 0;
        while (n6 < D.size()) {
            af af5 = null;
            try {
                af5 = (af)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (!(af5 == null || main.a.G.a && main.a.G.F() || af5.cf == null || af5.D() == null || af5.cb >= af5.D().length)) {
                af5.d(en2);
                af5.b(en2);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < E.size()) {
            ((ce)E.elementAt(n6)).a(en2);
            ++n6;
        }
        en2.a(0, -main.a.ae);
        Object object2 = en2;
        int n7 = 0;
        while (n7 < 2) {
            if (fg[n7] != -1) {
                if (fi[n7] == 1) {
                    ((en)object2).a(fj[fh[n7]], fe[n7], ff[n7], 3);
                } else {
                    ((en)object2).a(fj[fh[n7]], 0, 0, en.a(fj[fh[n7]]), en.b(fj[fh[n7]]), 2, fe[n7], ff[n7], 3);
                }
            }
            ++n7;
        }
        object2 = en2;
        n5 = 0;
        while (n5 < dc.x.size()) {
            object = (dc)dc.x.elementAt(n5);
            if (object != null && !(object instanceof ae)) {
                ((dc)object).a((en)object2);
            }
            ++n5;
        }
        if (!main.a.a) {
            n5 = 0;
            while (n5 < dc.A.size()) {
                object = (dc)dc.A.elementAt(n5);
                ((dc)object).a((en)object2);
                ++n5;
            }
        }
        n5 = 0;
        while (n5 < dc.z.size()) {
            object = (dc)dc.z.elementAt(n5);
            ((dc)object).a((en)object2);
            ++n5;
        }
        p.a(en2, 3);
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (do)G.elementAt(n6);
            do_.e(en2);
            ++n6;
        }
        ei.c(en2);
        n6 = 0;
        while (n6 < G.size()) {
            do do_ = (do)G.elementAt(n6);
            if (do_ != null && do_.z != null) {
                do_.z.a(en2, do_.B, do_.C - do_.al - main.a.ae, do_.I);
            }
            ++n6;
        }
        n6 = 0;
        while (n6 < D.size()) {
            af af6 = null;
            try {
                af6 = (af)D.elementAt(n6);
            }
            catch (Exception exception) {}
            if (af6 != null && af6.z != null) {
                af6.z.a(en2, af6.B, af6.C - af6.al, af6.I);
            }
            ++n6;
        }
        if (af.e().z != null) {
            af.e().z.a(en2, af.e().B, af.e().C - af.e().al, af.e().I);
        }
        dh.c.a(en2);
        dh.b.a(en2);
        ed.d(en2);
        int n8 = 0;
        while (n8 < bv.v.size()) {
            object = (cz)bv.v.elementAt(n8);
            if (((cz)object).c != -1 && ((cz)object).h > 3) {
                ((cz)object).a(en2);
            }
            ++n8;
        }
        bo.a(en2);
        if (bv.l == 120) {
            if (this.bS != 100) {
                n8 = this.bS * en.a(dQ) / 100;
                en2.a(dQ, bv.c / 2 - en.a(dQ) / 2, 220, 0);
                en2.e(bv.c / 2 - en.a(dQ) / 2, 220, n8, 10);
                en2.a(dO, bv.c / 2 - en.a(dQ) / 2, 220, 0);
                en2.e(0, 0, main.a.A, main.a.B);
            }
            if (this.bT) {
                ++this.bU;
                if (main.a.w % 3 == 0) {
                    ea ea2 = new ea(19, ds.b(bv.c / 2 - 50, bv.c / 2 + 50), 340, 2, 1, -1);
                    ei.a(ea2);
                }
                if (main.a.w % 15 == 0) {
                    ea ea3 = new ea(18, ds.b(bv.c / 2 - 5, bv.c / 2 + 5), ds.b(300, 320), 2, 1, -1);
                    ei.a(ea3);
                }
                if (this.bU == 100) {
                    this.b(bv.c / 2, 300);
                }
                if (this.bU == 110) {
                    this.bU = 0;
                    this.bT = false;
                }
            }
        }
        ed.a(en2);
        int n9 = 1;
        n6 = 0;
        while (n6 < ed.a.size()) {
            object = (ed)ed.a.elementAt(n6);
            if (((ed)object).b == 0) {
                n9 = 0;
                break;
            }
            ++n6;
        }
        if (en.b <= 1) {
            n9 = 0;
        }
        if (n9 != 0 && !this.bb) {
            int n10 = bv.c / (en.a(bv.A) + 50);
            if (n10 <= 0) {
                n10 = 1;
            }
            if (bv.e != 28) {
                n6 = 0;
                while (n6 < n10) {
                    n4 = 100 + n6 * (en.a(bv.A) + 50) - j / 2;
                    if (n4 + (n9 = en.a(bv.A)) >= j && n4 <= j + main.a.A && -20 + en.b(bv.A) >= k && -20 <= k + main.a.B) {
                        en2.a(bv.A, 100 + n6 * (en.a(bv.A) + 50) - j / 2, -20, 0);
                    }
                    ++n6;
                }
            }
        }
        l.a(en2);
        object2 = en2;
        try {
            if (ae.m == null && (n9 = p.x()) != -1) {
                do do_ = null;
                n4 = 0;
                while (n4 < G.size()) {
                    do do_2 = (do)G.elementAt(n4);
                    if (do_2.df.a == n9) {
                        if (do_ == null) {
                            do_ = do_2;
                        } else if (ds.g(do_2.B - af.e().B) < ds.g(do_.B - af.e().B)) {
                            do_ = do_2;
                        }
                    }
                    ++n4;
                }
                if (do_ != null && do_.H != 15 && (do_.B <= j || do_.B >= j + d || do_.C <= k || do_.C >= k + e) && main.a.w % 10 >= 5) {
                    n4 = do_.B - af.e().B;
                    int n11 = do_.C - af.e().C;
                    n9 = 0;
                    int n12 = 0;
                    n3 = 0;
                    if (n4 > 0 && n11 >= 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (main.a.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 >= 0 && n11 < 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = d - 10;
                            n12 = e / 2 + 30;
                            if (main.a.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n9 = d / 2;
                            n12 = 10;
                            n3 = 6;
                        }
                    }
                    if (n4 < 0 && n11 >= 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (main.a.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = e - 10;
                            n3 = 5;
                        }
                    } else if (n4 <= 0 && n11 < 0) {
                        if (ds.g(n4) >= ds.g(n11)) {
                            n9 = 10;
                            n12 = e / 2 + 30;
                            if (main.a.e) {
                                n12 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n9 = d / 2;
                            n12 = 10;
                            n3 = 6;
                        }
                    }
                    p.c((en)object2);
                    ((en)object2).a(bw, 0, 0, 13, 16, n3, n9, n12, cj.f);
                }
            }
        }
        catch (Exception exception) {}
        if (!a && bn == 1 && !main.a.G.a) {
            this.e(en2);
        }
        p.c(en2);
        object2 = en2;
        ((en)object2).a(0x808080);
        ((en)object2).d(0, main.a.B - 2, main.a.A, 2);
        n9 = (int)(af.e().Z * (long)main.a.A / 10000L);
        ((en)object2).a(0xFFFFFF);
        ((en)object2).d(0, main.a.B - 2, n9, 2);
        ((en)object2).a(0);
        n9 = main.a.A / 10;
        int n13 = 1;
        while (n13 < 10) {
            ((en)object2).d(n13 * n9, main.a.B - 2, 1, 2);
            ++n13;
        }
        if (!a) {
            if (main.a.an && bv.l != 170) {
                if (main.a.A > 250) {
                    en2.a(main.a.ah, 160, 6, 0);
                    di.s.a(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y ", 180, 2, 0);
                    di.s.a(en2, "s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 180, 12, 0);
                } else {
                    en2.a(main.a.ah, 5, main.a.B - 67, 0);
                    di.s.a(en2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 25, main.a.B - 70, 0);
                }
            }
            en2.a(-en2.a(), -en2.b());
            if ((bv.l == 128 || bv.l == 127) && bW != 0) {
                en2.a(0);
                en2.d(3, 88, 54, 8);
                en2.a(0xFF0000);
                en2.e(5, 90, bW, 4);
                en2.d(5, 90, 50, 4);
                en2.e(0, 0, 3000, 3000);
                di.c.a(en2, "Mabu", 30, 98, 2, di.f);
            }
            if (af.e().cL) {
                ++af.e().cM;
                if (main.a.w % 3 == 0) {
                    en2.a(0xFFFFFF);
                    en2.d(0, 0, main.a.A, main.a.B);
                }
                if (af.e().cM >= 100) {
                    af.e().U();
                }
            }
            int n14 = 0;
            while (n14 < D.size()) {
                af af7 = null;
                try {
                    af7 = (af)D.elementAt(n14);
                }
                catch (Exception exception) {}
                if (af7 != null && af7.cL && af.a(af7)) {
                    ++af7.cM;
                    if (main.a.w % 3 == 0) {
                        en2.a(0xFFFFFF);
                        en2.d(0, 0, main.a.A, main.a.B);
                    }
                    if (af7.cM >= 100) {
                        af7.U();
                    }
                }
                ++n14;
            }
            p.c(en2);
            this.f(en2);
            p.c(en2);
            if (main.a.e && main.a.f) {
                en en3 = en2;
                object2 = this;
                if (!((p)object2).N()) {
                    p.c(en3);
                    if (!bv.d() && !((p)object2).u()) {
                        if (bb.cs == 15) {
                            en3.a(dz, eN + 17, eO + 17, 3);
                        } else {
                            en3.a(dy, eN + 17, eO + 17, 3);
                        }
                    }
                }
            }
            p.c(en2);
            en en4 = en2;
            object2 = this;
            if (ft.size() != 0 && bV) {
                en4.e(0, main.a.B - 13, main.a.A, 15);
                en4.a(0, main.a.B - 13, main.a.A, 15, 0);
                String string = (String)ft.elementAt(0);
                di.e.a(en4, string, ((p)object2).fC, main.a.B - 12, 0);
            }
            if (!main.a.G.a && main.a.K == null && ae.m == null && ae.n == null && main.a.E.equals(c)) {
                super.a(en2);
            }
            p.c(en2);
            int n15 = 100 + (af.br.size() != 0 ? bv.size() * 12 : 0);
            if (af.e().ai != null) {
                n4 = 0;
                n3 = 0;
                int n16 = (main.a.B - 100 - 60) / 12;
                n14 = 0;
                while (n14 < D.size()) {
                    af af8 = (af)D.elementAt(n14);
                    if (af8.ah != -1 && af8.ah == af.e().ai.a) {
                        if (af8.F() && af8.B < af.e().B) {
                            int n17 = n16;
                            if (af.br.size() != 0) {
                                n17 -= bv.size();
                            }
                            if (n4 <= n17) {
                                di.r.a(en2, af8.ag, 20, n15 - 12 + n4 * 12, 0, di.o);
                                af8.a(en2, 10, n15 + n4 * 12 - 5);
                                ++n4;
                            }
                        } else if (af8.F() && af8.B > af.e().B && n3 <= n16) {
                            di.r.a(en2, af8.ag, main.a.A - 25, n15 - 12 + n3 * 12, 1, di.o);
                            af8.a(en2, main.a.A - 15, n15 + n3 * 12 - 5);
                            ++n3;
                        }
                    }
                    ++n14;
                }
            }
            cq.b().a(en2);
            if (aW && !main.a.G.a && main.a.w % 4 == 0) {
                en2.a(ce.f, this.aR.j + 15, this.aR.k + 30, 33);
            }
            if (this.eo) {
                this.es += 5;
                if (this.ep >= 0) {
                    this.ep += this.es;
                }
                if (this.ep < 0) {
                    --this.ep;
                    if (this.ep == -20) {
                        this.eo = false;
                        this.ep = 0;
                        this.es = 0;
                    }
                } else if ((this.eq - this.ep > 0 || this.ep < bv.c) && this.ep > 0) {
                    en2.a(0xFFFFFF);
                    if (!main.a.a && l.c != 3 && l.c != 5) {
                        en2.a(this.eq - this.ep, this.er - this.ep, 2 * this.ep, 2 * this.ep, 0, 360);
                    } else {
                        en2.d(0, 0, main.a.A, main.a.B);
                    }
                } else {
                    this.ep = -1;
                }
            }
            n14 = 0;
            while (n14 < af.br.size()) {
                n15 = 55;
                int n18 = this.aR.j + 32 + n14 * 24;
                en4 = en2;
                object2 = (cy)af.br.elementAt(n14);
                bl.b(en4, ((cy)object2).a, n18, 55, 0, 3);
                String string = String.valueOf(((cy)object2).c) + "'";
                if (((cy)object2).c == 0) {
                    string = String.valueOf(((cy)object2).b) + "s";
                }
                di.c.a(en4, string, n18, 70, 2, di.f);
                ++n14;
            }
            n14 = 0;
            while (n14 < bv.size()) {
                ((cy)bv.elementAt(n14)).a(en2, this.aR.j + (af.br.size() != 0 ? 5 : 25), (af.br.size() != 0 ? 90 : 45) + n14 * 12);
                ++n14;
            }
            this.d(en2);
            if (aw.fB == 1) {
                long l2;
                long l3 = l2 = l.d() - aS;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(l3 + 25200000L));
                n15 = calendar.get(11);
                int n19 = calendar.get(12);
                di.c.a(en2, String.valueOf(n15) + "h" + n19 + "m", 10, main.a.B - 65, 0, di.f);
            }
            if (!this.fF.equals("")) {
                n14 = 0;
                while (n14 < this.fG.length) {
                    di.c.a(en2, this.fG[n14], 5, 85 + n14 * 18, 0, di.f);
                    ++n14;
                }
            }
        }
        if ((n2 = main.a.C) > 200) {
            n2 = 200;
        }
        p.a(en2, 0 + main.a.A / 2, 0, n2);
        dh.d.a(en2);
        if (cb > l.d() && bv.l == 170 && ce && cd / 2 > 0) {
            try {
                this.a(en2, 0 + main.a.A / 2, 0);
            }
            catch (Exception exception) {}
        }
        if (bv.l == 172) {
            String cfr_ignored_0 = String.valueOf(aw.aB) + "  " + ci + "/" + cj;
            di.f.a(en2, String.valueOf(aw.aB) + "  " + ci + "/" + cj, main.a.A - 10, 40, 1);
        }
    }

    private void d(en en2) {
        if (this.fB != 0) {
            String string = "";
            int n2 = 0;
            while (n2 < this.fu.length) {
                string = String.valueOf(string) + this.fv[n2] + " ";
                ++n2;
            }
            bo.a(en2, 20, 45, 95, 35, 0xFFFFFF, false);
            di.f.a(en2, aw.m, 68, 50, 2);
            di.f.a(en2, String.valueOf(string), 68, 65, 2);
        }
    }

    public static do a(short s2) {
        int n2 = 0;
        while (n2 < G.size()) {
            do do_ = (do)G.elementAt(n2);
            if (do_.df.a == s2) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static af b(int n2) {
        int n3 = 0;
        while (n3 < D.size()) {
            af af2 = (af)D.elementAt(n3);
            if (af2.J == n2) {
                return af2;
            }
            ++n3;
        }
        return null;
    }

    public static aa c(int n2) {
        int n3 = 0;
        while (n3 < F.size()) {
            aa aa2 = (aa)F.elementAt(n3);
            if (aa2.y == n2) {
                return aa2;
            }
            ++n3;
        }
        return null;
    }

    public static aa a(byte by2) {
        return (aa)F.elementAt(by2);
    }

    public static do s() {
        int n2 = 0;
        while (n2 < G.size()) {
            do do_ = (do)G.elementAt(n2);
            if (do_.df.a == p.x()) {
                return do_;
            }
            ++n2;
        }
        return null;
    }

    public static void c(en en2) {
        en2.a(-en2.a(), -en2.b());
        en2.e(0, -200, main.a.A, 200 + main.a.B);
    }

    private void a(en en2, af af2) {
        int n2 = (int)(af2.U * fm / af2.V);
        int n3 = (int)(af2.T * (long)fl / af2.W);
        int n4 = (int)(this.bC * fm / af2.V);
        int n5 = (int)(this.bz * (long)fl / af2.W);
        en2.e(main.a.A / 2 + 58 - en.a(dM), 0, 95, 100);
        en2.b(dM, 0, 0, en.a(dM), en.b(dM), 2, main.a.A / 2 + 60, 0, 24);
        en2.e((int)((long)(main.a.A / 2 + 60 - 83) - fm + fm - (long)n4), 5, n4, 10);
        en2.a(dQ, main.a.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e((int)((long)(main.a.A / 2 + 60 - 83) - fm + fm - (long)n2), 5, n2, 10);
        en2.a(dO, main.a.A / 2 + 60 - 83, 5, 24);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e((int)((long)(main.a.A / 2 + 60 - 83 - fl) + fm - (long)n5), 20, n5, 6);
        en2.a(aG, main.a.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e((int)((long)(main.a.A / 2 + 60 - 83 - fl) + fm - (long)n3), 20, n3, 6);
        en2.a(aF, main.a.A / 2 + 60 - 83, 20, 24);
        en2.e(0, 0, main.a.A, main.a.B);
    }

    /*
     * WARNING - void declaration
     */
    private void a(en en2, boolean bl2, af af2) {
        void var2_5;
        int n2;
        int n3;
        void var3_6;
        if (var3_6 == null) {
            return;
        }
        if (var3_6.J == af.e().J) {
            int n4 = (int)(this.bC * fm / var3_6.V);
            n3 = (int)(this.bz * (long)fl / var3_6.W);
            n2 = (int)(var3_6.U * fm / var3_6.V);
        } else {
            int n5 = (int)(var3_6.cT * fm / var3_6.V);
            n3 = var3_6.cS * fl / 100;
            n2 = (int)(var3_6.U * fm / var3_6.V);
        }
        if (af.e().bN > 0) {
            int n6 = af.e().bL * fk / af.e().bM;
            en2.a(dN, 58, 29, 0);
            en2.e(83, 31, n6, 10);
            en2.a(dP, 83, 31, 0);
            en2.e(0, 0, main.a.A, main.a.B);
            di.s.a(en2, String.valueOf(af.e().bK) + ":" + af.e().bL + "/" + af.e().bM, 115, 29, 2);
        }
        if (var3_6.J != af.e().J) {
            en2.e(en.a(dM) - 95, 0, 95, 100);
        }
        en2.a(dM, 0, 0, 0);
        en2.e(83, 5, (int)var2_5, 10);
        en2.a(dQ, 83, 5, 0);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e(83, 5, n2, 10);
        en2.a(dO, 83, 5, 0);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e(83, 20, n3, 6);
        en2.a(aG, 83, 20, 0);
        en2.e(0, 0, main.a.A, main.a.B);
        en2.e(83, 20, n3, 6);
        en2.a(aF, 83, 20, 0);
        en2.e(0, 0, main.a.A, main.a.B);
        if (af.e().T == 0L && main.a.w % 10 > 5) {
            en2.e(83, 20, 2, 6);
            en2.a(aG, 83, 20, 0);
            en2.e(0, 0, main.a.A, main.a.B);
        }
    }

    public final void t() {
        this.eX = this.eY = System.currentTimeMillis();
        this.eZ = 180;
    }

    private static af L() {
        int n2 = 0;
        while (n2 < D.size()) {
            af af2 = (af)D.elementAt(n2);
            if (af2.aN != 0) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private af M() {
        int n2 = 0;
        while (n2 < D.size()) {
            af af2 = (af)D.elementAt(n2);
            if (af2.aN != 0 && af2 != p.L()) {
                return af2;
            }
            ++n2;
        }
        return null;
    }

    private void e(en en2) {
        if (af.bI) {
            return;
        }
        p.c(en2);
        if (bv.l == 130 && p.L() != null && this.M() != null) {
            en2.a(main.a.A / 2 - 62, 0);
            this.a(en2, true, p.L());
            en2.a(-(main.a.A / 2 - 65), 0);
            this.a(en2, this.M());
            p.L().b(en2, 137, 25, 0);
            this.M().b(en2, main.a.A - 15 - 122, 25, 2);
        } else if (this.u() && af.e().aU != null) {
            en2.a(main.a.A / 2 - 62, 0);
            this.a(en2, true, af.e().aU);
            en2.a(-(main.a.A / 2 - 65), 0);
            this.a(en2, af.e());
            af.e().b(en2, 137, 25, 0);
            af.e().aU.b(en2, main.a.A - 15 - 122, 25, 2);
        } else if (p.O() && main.a.A <= 320) {
            af af2 = af.e();
            boolean bl2 = true;
            bl2 = true;
            en en3 = en2;
            en3.a(fM, 1, 1, 0);
            int n2 = fH.getWidth();
            int n3 = fH.getHeight() / 2;
            int n4 = (int)(af2.U * (long)n2 / af2.V);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.a(fH, 0, n3, n4, n3, 0, 4, 20, 0);
            n4 = (int)(af2.T * (long)n2 / af2.W);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            en3.a(fH, 0, 0, n4, n3, 0, 4, 26, 0);
            n4 = 1 + fM.getWidth() / 2 + 1;
            di.m.a(en3, af2.ag, n4, 5, 2);
            if (af2.aQ != null) {
                if (af2.aQ.z() != null) {
                    di.m.a(en3, af2.aQ.z().e, n4, 33, 2);
                }
            } else if (af2.aT != null) {
                di.m.a(en3, af2.aT.df.b, n4, 33, 2);
            } else if (af2.aU != null) {
                di.m.a(en3, af2.aU.ag, n4, 33, 2);
            }
        } else {
            this.a(en2, true, af.e());
            if (af.e().i() != null || af.e().j() != null) {
                di.m.a(en2, aw.bx, this.fn / 2, 8, 2);
            } else if (af.e().aQ != null) {
                if (af.e().aQ.z() != null) {
                    di.m.a(en2, af.e().aQ.z().e, this.fn / 2, 9, 2);
                }
                if (af.e().aQ.C != 0) {
                    di.m.a(en2, String.valueOf(ai.a(af.e().aQ.k)), this.fn / 2, 22, 2);
                }
            } else if (af.e().aT != null) {
                di.m.a(en2, af.e().aT.df.b, this.fn / 2, 9, 2);
                if (af.e().aT.df.a == 4) {
                    di.m.a(en2, String.valueOf(p.j().aM.b) + "/" + p.j().aM.d, this.fn / 2, 22, 2);
                }
            } else if (af.e().aU != null) {
                di.m.a(en2, af.e().aU.ag, this.fn / 2, 9, 2);
                di.m.a(en2, String.valueOf(ai.a(af.e().aU.U)), this.fn / 2, 22, 2);
            } else {
                di.m.a(en2, af.e().ag, this.fn / 2, 9, 2);
                di.m.a(en2, String.valueOf(ai.a(af.e().y)), this.fn / 2, 22, 2);
            }
        }
        en2.a(-en2.a(), -en2.b());
        if (this.u() && this.eZ > 0) {
            this.eX = System.currentTimeMillis();
            if (this.eX - this.eY >= 1000L) {
                this.eY = System.currentTimeMillis();
                --this.eZ;
            }
            di.c.a(en2, String.valueOf(this.eZ), main.a.A / 2, 13, 2, di.f);
        }
        if (this.ez) {
            en2.a(ce.f, 40, 35, 33);
            --this.eA;
            if (this.eA < 0) {
                this.eA = 0;
                this.ez = false;
            }
        }
    }

    public final boolean u() {
        return bv.a() && (af.e().aN != 0 || bv.l == 130 && p.L() != null && this.M() != null);
    }

    private void f(en en2) {
        if (this.aL != null) {
            en en3 = en2;
            p p2 = this;
            es.a(en3, af.e().B, af.e().C);
            en3.a(-en3.a(), -en3.b());
            if (!main.a.F.a && !main.a.G.a && ae.m == null && main.a.e) {
                int n2 = 0;
                while (n2 < p2.bm.length()) {
                    int n3 = (main.a.A - p2.bm.length() * eI) / 2 + n2 * eI + eI / 2;
                    if (p2.bq[n2] == -1) {
                        en3.a(bo, n3, main.a.B - 25, 3);
                        di.f.a(en3, String.valueOf(p2.bm.charAt(n2)), n3, main.a.B - 30, 2);
                    } else {
                        en3.a(bp, n3, main.a.B - 25, 3);
                        di.g.a(en3, String.valueOf(p2.bm.charAt(n2)), n3, main.a.B - 30, 2);
                    }
                    ++n2;
                }
            }
            return;
        }
        if (main.a.K != null || ae.m != null || main.a.F.a || main.a.G.a || af.e().aD.c == 0 || cq.b().b || main.a.E == a.a) {
            return;
        }
        long l2 = l.d();
        long l3 = l2 - this.em;
        int n4 = 0;
        if (l3 < 10000L) {
            n4 = (int)(l3 * 20L / 10000L);
        }
        if (!main.a.e) {
            en2.a(bb.cs == 10 ? av : au, eV + bx - 1, by - 1, 0);
            bl.b(en2, 542, eV + bx + 3, by + 3, 0, 0);
            di.u.a(en2, "" + t, eV + bx + 22, by + 15, 1);
            if (l3 < 10000L) {
                en2.a(2721889);
                n4 = (int)(l3 * 20L / 10000L);
                en2.d(eV + bx + 3, by + 3 + n4, 20, 20 - n4);
            }
        } else if (af.e().H != 14) {
            if (p.dS.b) {
                if (aO != 1) {
                    en2.a(0x939090);
                    en2.d(bx + 9, by + 10 + 10, 22, 20);
                    en2.a(0xFFFFFF);
                    en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) + 10, 22, n4 != 0 ? n4 : 20);
                    en2.a(bb.cs == 10 ? dD : dC, bx, by + 10, 0);
                    di.p.a(en2, "" + t, bx + 20, by + 15 + 10, 2);
                    if (ch) {
                        en2.a(bb.cs == 14 ? dJ : dI, bx + 5, by - 6 - 40 + 10, 0);
                    } else if (ck) {
                        en2.a(bb.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.b(en2, 1088, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.a(bb.cs == 14 ? bo : bp, bx + 5, by - 6 - 40 + 10, 0);
                        bl.b(en2, 1087, bx - 7 + 5, by - 6 - 40 - 7 + 10, 0, 0);
                    }
                } else if (aO == 1) {
                    en2.a(bb.cs == 10 ? av : au, eV + bx - 1, by - 1 + 10, 0);
                    bl.b(en2, 542, eV + bx + 3, by + 3 + 10, 0, 0);
                    di.u.a(en2, "" + t, eV + bx + 22, by + 13 + 10, 1);
                    if (l3 < 10000L) {
                        en2.a(2721889);
                        n4 = (int)(l3 * 20L / 10000L);
                        en2.d(eV + bx + 3, by + 3 + n4 + 10, 20, 20 - n4);
                    }
                    if (ch) {
                        en2.a(bb.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    } else if (ck) {
                        en2.a(bb.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.b(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cl) {
                        en2.a(bb.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                        bl.b(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                    }
                }
            } else if (aO != 1) {
                en2.a(0x939090);
                en2.d(bx + 9, by + 10 - 6, 22, 20);
                en2.a(0xFFFFFF);
                en2.d(bx + 9, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6, 22, n4 != 0 ? n4 : 20);
                en2.a(bb.cs == 10 ? dD : dC, bx, by - 6, 0);
                di.p.a(en2, "" + t, bx + 20, by + 15 - 6, 2);
                if (ch) {
                    en2.a(bb.cs == 14 ? dJ : dI, bx, by - 6 - 40, 0);
                } else if (ck) {
                    en2.a(bb.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.b(en2, 1088, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                } else if (cl) {
                    en2.a(bb.cs == 14 ? bp : bo, bx + 20, by + 20 - 6 - 40, 3);
                    bl.b(en2, 1087, bx + 20 - 7, by + 20 - 6 - 40 - 7, 0, 0);
                }
            } else {
                en2.a(0x939090);
                en2.d(bx + 10, by + 10 - 6 + 10, 20, 18);
                en2.a(0xFFFFFF);
                en2.d(bx + 10, by + 10 + (n4 != 0 ? 20 - n4 : 0) - 6 + 10, 20, n4 != 0 ? n4 : 18);
                en2.a(bb.cs == 10 ? dF : dE, bx + 20, by + 20 - 6 + 10, 3);
                di.p.a(en2, "" + t, bx + 20, by + 15 - 6 + 10, 2);
                if (ch) {
                    en2.a(bb.cs == 14 ? dL : dK, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                } else if (ck) {
                    en2.a(bb.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.b(en2, 1088, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                } else if (cl) {
                    en2.a(bb.cs == 14 ? bp : bo, bx + 20 + 5, by + 20 - 6 - 40 + 10, 3);
                    bl.b(en2, 1087, bx + 20 - 7 + 5, by + 20 - 6 - 40 - 7 + 10, 0, 0);
                }
            }
        }
        if (O) {
            bf[] bfArray;
            bf[] bfArray2 = bfArray = main.a.e ? aQ : aP;
            if (!main.a.e) {
                en2.a(11152401);
                en2.d(eV + bx + 2, by - 10 + 6, 20, 10);
                di.s.a(en2, "*", eV + bx + 12, by - 8 + 6, 2);
            }
            int n5 = main.a.e ? this.ew : bfArray.length;
            int n6 = 0;
            while (n6 < n5) {
                bf bf2;
                if (!main.a.e) {
                    String[] stringArray;
                    if (cd.g) {
                        String[] stringArray2 = new String[5];
                        stringArray2[0] = "Q";
                        stringArray2[1] = "W";
                        stringArray2[2] = "E";
                        stringArray2[3] = "R";
                        stringArray = stringArray2;
                        stringArray2[4] = "T";
                    } else {
                        String[] stringArray3 = new String[5];
                        stringArray3[0] = "7";
                        stringArray3[1] = "8";
                        stringArray3[2] = "9";
                        stringArray3[3] = "1";
                        stringArray = stringArray3;
                        stringArray3[4] = "3";
                    }
                    String[] stringArray4 = stringArray;
                    en2.a(11152401);
                    en2.d(eV + eT[n6] + 2, eU[n6] - 10 + 8, 20, 10);
                    di.s.a(en2, stringArray4[n6], eV + eT[n6] + 12, eU[n6] - 10 + 6, 2);
                }
                if ((bf2 = bfArray[n6]) != af.e().aC) {
                    en2.a(au, eV + eT[n6] - 1, eU[n6] - 1, 0);
                }
                if (bf2 != null) {
                    if (bf2 == af.e().aC) {
                        en2.a(av, eV + eT[n6] - 1, eU[n6] - 1, 0);
                        if (main.a.e) {
                            en2.a(aa.R, 0, 12, 9, 6, 0, eV + eT[n6] + 8, eU[n6] - 7, 0);
                        }
                    }
                    en en4 = en2;
                    int n7 = eU[n6] + 13;
                    int n8 = eV + eT[n6] + 13;
                    bl.b(en4, bf2.a.f, n8, n7, 0, cj.f);
                    long l4 = System.currentTimeMillis();
                    long l5 = l4 - bf2.f;
                    if (l5 < (long)bf2.e) {
                        en4.a(2721889);
                        if (bf2.j && main.a.w % 6 > 2) {
                            en4.a(876862);
                        }
                        int n9 = (int)(l5 * 20L / (long)bf2.e);
                        en4.d(n8 - 10, n7 - 10 + n9, 20, 20 - n9);
                    } else {
                        bf2.j = false;
                    }
                    if (n6 == this.ex && main.a.w % 10 > 5 || n6 == this.eB) {
                        en2.a(ce.f, eV + eT[n6] + 13, eU[n6] + 14, 3);
                    }
                }
                ++n6;
            }
        }
        en en5 = en2;
        if (aO != 0 && af.e().H != 14) {
            en5.a(bb.cs == 5 ? dH : dG, eP + 20, eQ + 20, 3);
            dS.a(en5);
            en5.a(bb.cs == 13 ? dB : dA, eR + 20, eS + 20, 3);
        }
    }

    public static final void a(String string, int n2, int n3, int n4, int n5, int n6) {
        n4 = -1;
        int n7 = 0;
        while (n7 < 5) {
            if (bI[n7] == -1) {
                n4 = n7;
                break;
            }
            ++n7;
        }
        if (n4 == -1) {
            return;
        }
        p.bJ[n4] = n6;
        p.bF[n4] = string;
        p.bG[n4] = n2;
        p.bH[n4] = n3;
        p.fb[n4] = 0;
        p.fc[n4] = n5 < 0 ? -5 : 5;
        p.bI[n4] = 0;
        p.fd[n4] = 0;
        p.fa[n4] = 10;
        n7 = 0;
        while (n7 < 5) {
            if (bI[n7] != -1 && n4 != n7 && fc[n4] < 0 && ds.g(bG[n4] - bG[n7]) <= 20 && fa[n4] == fa[n7]) {
                int n8 = n4;
                fa[n8] = fa[n8] + 10;
            }
            ++n7;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = fg[0] == -1 ? 0 : 1;
        if (fg[n5] != -1) {
            return false;
        }
        p.fg[n5] = 0;
        p.fi[n5] = n4;
        p.fe[n5] = n2;
        p.ff[n5] = n3;
        return true;
    }

    private boolean N() {
        if (!main.a.f && main.a.E == p.j()) {
            return true;
        }
        if (!main.a.e) {
            return true;
        }
        if (cq.b().b) {
            return true;
        }
        if (bp.a) {
            return true;
        }
        return main.a.K != null || ae.m != null || main.a.F.a || main.a.G.a;
        {
        }
    }

    public static void d(int n2, int n3) {
        if (main.a.A == 128 || main.a.B <= 208) {
            n2 = 126;
            n3 = 160;
        }
        bM = n2;
        bN = n3;
        bL = f - n2 / 2;
        bK = cz - n3 / 2;
        if (main.a.e) {
            if (main.a.B <= 240) {
                bK -= 10;
            }
            if (main.a.e && !main.a.g && main.a.E instanceof p) {
                bM = 310;
                bL = d / 2 - bM / 2;
            }
        }
        if (bK < -10) {
            bK = -10;
        }
        if (main.a.B > 208 && bK < 0) {
            bK = 0;
        }
        if (main.a.B == 208 && bK < 10) {
            bK = 10;
        }
    }

    public static void v() {
        bv.e();
    }

    public static int w() {
        int n2 = af.e().aD == null ? -1 : ad[af.e().aD.a];
        return n2;
    }

    public static byte x() {
        byte by2 = 0;
        if (af.e().aD == null) {
            by2 = -1;
        } else if (af.e().aD.a <= ac.length - 1) {
            by2 = (byte)ac[af.e().aD.a];
        }
        return by2;
    }

    public final void a(String string, String string2) {
        cq.b().b = false;
        if (string2.equals(aw.cQ)) {
            if (p.aE.h == af.e().J) {
                return;
            }
            bt.a().a(string, p.aE.h);
            return;
        }
        if (string.equals("")) {
            return;
        }
        if (string.equals("pingABCD")) {
            bt.a().d();
            bt.a().e();
            boolean bl2 = bP = !bP;
        }
        if (string.equals("icon")) {
            boolean bl3 = ds.b = !ds.b;
        }
        if (string.equals("big")) {
            ds.c = !ds.c;
        }
        bt.a().b(string);
    }

    public final void D() {
    }

    public final void a(y y2) {
        bp.c();
        try {
            this.S = new int[y2.c().readByte()];
            this.T = new int[this.S.length];
            this.U = new int[this.S.length];
            this.V = new int[this.S.length];
            this.W = new int[this.S.length];
            this.Y = new String[this.S.length];
            this.X = new int[this.S.length];
            this.Z = new String[this.S.length];
            int n2 = 0;
            while (n2 < this.S.length) {
                this.S[n2] = y2.c().readByte();
                this.T[n2] = y2.c().readByte();
                this.U[n2] = y2.c().readByte();
                this.V[n2] = y2.c().readByte();
                byte by2 = y2.c().readByte();
                if (by2 == 1) {
                    this.Y[n2] = y2.c().readUTF();
                    this.W[n2] = y2.c().readInt();
                    this.Z[n2] = y2.c().readUTF();
                    this.X[n2] = y2.c().readInt();
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        main.a.G.r();
        main.a.G.s();
    }

    private void a(String string, de de2, de de3) {
        this.bQ = new dz();
        this.bQ.a(string, de2, de3);
    }

    public final void a(int n2, String string, byte by2) {
        af af2 = p.b(n2);
        if (af2 != null) {
            if (by2 == 3) {
                this.a(string, new de(aw.bs, 2000, af2), new de(aw.bj, 2009, af2));
            }
            if (by2 == 4) {
                this.a(string, new de(aw.bs, 2005, af2), new de(aw.bj, 2009, af2));
            }
        }
    }

    public final void d(int n2) {
        af af2 = p.b(n2);
        if (af2 != null) {
            this.a(String.valueOf(af2.ag) + aw.eC, new de(aw.bn, 11114, af2), new de(aw.bo, 2009, af2));
        }
    }

    public static void a(int n2, byte by2) {
        if (H.size() == 0) {
            bt.a().b((byte)2, by2);
            ds.c("getFlag1");
            return;
        }
        if (n2 == af.e().J) {
            ds.c("my cflag: isme");
            af.e();
            if (af.a(by2)) {
                ds.c("my cflag: true");
                int n3 = 0;
                while (n3 < H.size()) {
                    ep ep2 = (ep)H.elementAt(n3);
                    if (ep2 != null && ep2.a == by2) {
                        ds.c("my cflag: cflag==");
                        af.e().bz = ep2.b;
                    }
                    ++n3;
                }
                return;
            }
            af.e();
            if (!af.a(by2)) {
                ds.c("my cflag: false");
                bt.a().b((byte)2, by2);
                return;
            }
        } else {
            ds.c("my cflag: not me");
            if (p.b(n2) != null) {
                p.b(n2);
                if (af.a(by2)) {
                    ds.c("my cflag: true");
                    int n4 = 0;
                    while (n4 < H.size()) {
                        ep ep3 = (ep)H.elementAt(n4);
                        if (ep3 != null && ep3.a == by2) {
                            ds.c("my cflag: cflag==");
                            p.b((int)n2).bz = ep3.b;
                        }
                        ++n4;
                    }
                    return;
                }
                p.b(n2);
                if (!af.a(by2)) {
                    ds.c("my cflag: false");
                    bt.a().b((byte)2, by2);
                }
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void a(int n2, Object object) {
        ds.c("PERFORM WITH ID = " + n2);
        int n3 = 0;
        block40: do {
            switch (n3 == 0 ? n2 : n3) {
                case 888351: {
                    bt.a().g((byte)5);
                    main.a.h();
                    return;
                }
                case 11112: {
                    af af2 = (af)object;
                    bt.a().a((byte)1, af2.J);
                    return;
                }
                case 11113: {
                    af af3 = (af)object;
                    if (af3 == null) return;
                    bt.a().a((byte)0, af3.J, (byte)-1, -1);
                    return;
                }
                case 11114: {
                    this.bQ = null;
                    af af4 = (af)object;
                    if (af4 == null) {
                        return;
                    }
                    bt.a().a((byte)1, af4.J, (byte)-1, -1);
                    return;
                }
                case 11111: {
                    if (af.e().aU == null) {
                        return;
                    }
                    bp.a();
                    if (main.a.G.S.size() <= 0) {
                        af.e();
                        this.F();
                    }
                    main.a.G.a(af.e().aU);
                    main.a.G.s();
                    bt.a().c(af.e().aU.J);
                    bt.a().y(af.e().aU.J);
                    return;
                }
                case 11115: {
                    if (af.e().aU == null) {
                        return;
                    }
                    bp.a();
                    bt.a().a(af.e().aU.J, (short)af.e().aU.M);
                    return;
                }
                case 2000: {
                    this.bQ = null;
                    if ((af)object == null) {
                        bt.a().a((byte)1, (byte)3, -1);
                        return;
                    }
                    bt.a().a((byte)1, (byte)3, ((af)object).J);
                    bt.a().g();
                    return;
                }
                case 2001: {
                    main.a.h();
                    return;
                }
                case 2003: {
                    main.a.h();
                    bp.a();
                    bt.a().a((byte)0, (byte)3, af.e().aU.J);
                    return;
                }
                case 2004: {
                    main.a.h();
                    bt.a().a((byte)0, (byte)4, af.e().aU.J);
                    return;
                }
                case 2005: {
                    main.a.h();
                    this.bQ = null;
                    if ((af)object == null) {
                        bt.a().a((byte)1, (byte)4, -1);
                        return;
                    }
                    bt.a().a((byte)1, (byte)4, ((af)object).J);
                    return;
                }
                case 2009: {
                    this.bQ = null;
                    return;
                }
                case 2006: {
                    main.a.h();
                    bt.a().a((byte)2, (byte)4, af.e().aU.J);
                    return;
                }
                case 2007: {
                    main.a.h();
                    n3 = 12006;
                    continue block40;
                }
                case 11038: {
                    el el2 = new el("");
                    el2.addElement(new de(aw.aX[1], 110381));
                    el2.addElement(new de(aw.aX[2], 110382));
                    el2.addElement(new de(aw.aX[3], 110383));
                    main.a.F.a(el2);
                    return;
                }
                case 110382: {
                    bt.a().j();
                    return;
                }
                case 110383: {
                    bt.a().k();
                    return;
                }
                case 1: {
                    main.a.h();
                    return;
                }
                case 2: {
                    main.a.F.a = false;
                    return;
                }
                case 8002: {
                    this.a(false, true);
                    main.a.g();
                    main.a.f();
                    return;
                }
                case 11057: {
                    dc.z.removeAllElements();
                    dc.x.removeAllElements();
                    do do_ = (do)object;
                    if (do_.dk == 0) {
                        bt.a().a((short)do_.df.a, (byte)main.a.F.b);
                        return;
                    }
                    if (main.a.F.b != 0) return;
                    bt.a().l(do_.dk);
                    return;
                }
                case 11000: {
                    main.a.G.q();
                    main.a.G.s();
                    return;
                }
                case 11001: {
                    af.e().J();
                    return;
                }
                case 11002: {
                    main.a.G.A();
                    return;
                }
                case 11120: {
                    Object[] objectArray = (Object[])object;
                    object = (bf)objectArray[0];
                    int n4 = Integer.parseInt((String)objectArray[1]);
                    int n5 = 0;
                    while (true) {
                        if (n5 >= aQ.length) {
                            p.aQ[n4] = object;
                            p.y();
                            return;
                        }
                        if (aQ[n5] == object) {
                            p.aQ[n5] = null;
                        }
                        ++n5;
                    }
                }
                case 11121: {
                    Object[] objectArray = (Object[])object;
                    bf bf2 = (bf)objectArray[0];
                    int n6 = Integer.parseInt((String)objectArray[1]);
                    int n7 = 0;
                    while (true) {
                        if (n7 >= aP.length) {
                            p.aP[n6] = bf2;
                            p.z();
                            return;
                        }
                        if (aP[n7] == bf2) {
                            p.aP[n7] = null;
                        }
                        ++n7;
                    }
                }
                case 110001: {
                    main.a.G.q();
                    main.a.G.s();
                    return;
                }
                case 110004: {
                    main.a.F.a = false;
                    return;
                }
                case 11067: {
                    if (bv.n != 0) {
                        bt.a().f(0);
                        bp.a();
                        return;
                    }
                    aD.a(aw.aV, 0);
                    return;
                }
                case 11059: {
                    bf bf3 = aQ[this.ex];
                    this.b(bf3, false);
                    this.cn = null;
                    return;
                }
                case 12000: {
                    bt.a().a((byte)1, -1, (String)null);
                    return;
                }
                case 12001: {
                    main.a.h();
                    return;
                }
                case 12002: {
                    main.a.h();
                    i i2 = (i)object;
                    bt.a().a((byte)1, -1, i2.a, i2.b);
                    this.bQ = null;
                    return;
                }
                case 12003: {
                    i i3 = (i)object;
                    main.a.h();
                    bt.a().a((byte)2, -1, i3.a, i3.b);
                    this.bQ = null;
                    return;
                }
                case 12004: {
                    bf bf4 = (bf)object;
                    this.b(bf4, true);
                    af.e();
                    return;
                }
                case 110391: {
                    bt.a().a((byte)0, af.e().aU.J, -1, -1);
                    return;
                }
                case 12005: {
                    if (main.a.al == null) {
                        main.a.al = new ev();
                    }
                    main.a.al.b();
                    main.a.h();
                    return;
                }
                case 12006: {
                    GameMidlet.f.a();
                    return;
                }
            }
            return;
        } while (true);
    }

    public final void b(String string, String string2) {
        this.fu = new int[string.length()];
        this.fv = new int[string.length()];
        this.fw = new int[string.length()];
        this.fx = new int[string.length()];
        this.fy = new int[string.length()];
        int n2 = 0;
        while (n2 < string.length()) {
            this.fu[n2] = Short.parseShort(string.substring(n2, n2 + 1));
            this.fv[n2] = ds.b(0, 11);
            this.fw[n2] = 1;
            this.fy[n2] = 0;
            ++n2;
        }
        this.fB = 100;
        this.fz = 0;
        this.fA = string2;
        eE = eF = l.d();
    }

    public final void a(String string) {
        if (!this.fE) {
            this.fD = di.e.a(string);
            this.fC = main.a.A;
            this.fE = true;
        }
        if (string.startsWith("!")) {
            string = string.substring(1, string.length());
            this.bR = true;
        }
        ft.addElement(string);
    }

    public final void b(String string) {
        this.fF = string;
        this.fG = di.k.a(this.fF, 500);
    }

    private static boolean O() {
        return bv.c() && p.bY.a == 0;
    }

    private static void a(en en2, int n2, int n3, int n4) {
        if (bY == null) {
            return;
        }
        if (!a && bn == 1 && !main.a.G.a && p.O()) {
            int n5;
            int n6;
            if (n4 < p.fJ.a + (p.fI.a << 2)) {
                n4 = p.fJ.a + (p.fI.a << 2);
            }
            if (n2 > main.a.A - n4 / 2) {
                n2 = main.a.A - n4 / 2;
            }
            if (n2 < en.a(fM) + n4 / 2 + 10) {
                n2 = en.a(fM) + n4 / 2 + 10;
            }
            n3 = p.fI.b;
            int n7 = n3 + 0 + en.b(fL) / 2 + 2;
            int n8 = p.fJ.a;
            int n9 = n4 / 2 - n8 / 2;
            n4 = n2 - n4 / 2;
            int n10 = n2 + n8 / 2;
            int n11 = n9 - p.fI.a;
            int n12 = n11 / p.fI.a;
            if (n11 % p.fI.a > 0) {
                ++n12;
            }
            int n13 = 0;
            while (n13 < n12) {
                if (n13 < n12 - 1) {
                    fI.a(1, n4 + p.fI.a + n13 * p.fI.a, 3, 0, 0, en2);
                } else {
                    fI.a(1, n4 + n11, 3, 0, 0, en2);
                }
                if (n13 < n12 - 1) {
                    fI.a(1, n10 + n13 * p.fI.a, 3, 0, 0, en2);
                } else {
                    fI.a(1, n10 + n11 - p.fI.a, 3, 0, 0, en2);
                }
                ++n13;
            }
            fI.a(0, n4, 3, 2, 0, en2);
            fI.a(0, n10 + n11, 3, 0, 0, en2);
            if (p.bY.c > 0) {
                n13 = 2;
                n6 = 3;
                if (p.bY.e == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = p.bY.c * n9 / p.bY.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n4 + n9 - n5, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.a(n6, n4 + p.fI.a + n5 * p.fI.a, 3, 0, 0, en2);
                    } else {
                        fI.a(n6, n4 + n11, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.a(n13, n4, 3, 2, 0, en2);
                main.a.a(en2);
            }
            if (p.bY.d > 0) {
                n13 = 2;
                n6 = 3;
                if (p.bY.f == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = p.bY.d * n9 / p.bY.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                en2.e(n10, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fI.a(n6, n10 + n5 * p.fI.a, 3, 0, 0, en2);
                    } else {
                        fI.a(n6, n10 + n11 - p.fI.a, 3, 0, 0, en2);
                    }
                    ++n5;
                }
                fI.a(n13, n10 + n11, 3, 0, 0, en2);
                main.a.a(en2);
            }
            fJ.a(0, n2 - n8 / 2, 0, 0, 0, en2);
            String string = l.a(p.bY.n, (int)p.bY.m, true, false);
            di.d.a(en2, string, n2 + 1, 0 + p.fJ.b / 2 - di.g.a() / 2, 2);
            g.b(p.bY.e, 1).b(en2, p.bY.j, n2 - 5, n7 + 5, 1, di.f);
            g.b(p.bY.f, 1).b(en2, p.bY.k, n2 + 5, n7 + 5, 0, di.f);
            if (p.bY.a != 0) {
                n6 = 0 + n3 / 2 - 2;
                di.w.a(en2, "" + p.bY.c, n4 + n9 / 2, n6, 2);
                di.w.a(en2, "" + p.bY.d, n10 + n9 / 2, n6, 2);
            }
            en2.a(fK, n2, 0 + p.fJ.b + 2, 3);
            if (p.bY.a == 0) {
                p.a(en2, p.bY.g, p.bY.h, n2 - 13, p.bY.i, n2 + 13, n7);
            }
        }
    }

    private static void a(en en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (fL != null) {
            int n8;
            int n9 = en.b(fL) / 2;
            int n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n3) {
                    n8 = 1;
                }
                en2.a(fL, 0, n8 * n9, en.a(fL), n9, 0, n4 - n10 * (n9 + 1), n7, 3);
                ++n10;
            }
            n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n5) {
                    n8 = 1;
                }
                en2.a(fL, 0, n8 * n9, en.a(fL), n9, 0, n6 + n10 * (n9 + 1), n7, 3);
                ++n10;
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bk[] bkArray) {
        ch ch2 = new ch(n2, n3, n4, n5, n6, n7, n8, s2, bkArray);
        p.a(ch2);
    }

    public static void a(int n2, int n3, int n4, af af2, bk bk2, int n5, short s2, short s3) {
        ch ch2 = new ch(n2, n3, n4, af2.Z(), bk2, n5, s2, s3);
        p.a(ch2);
    }

    private static void a(ch ch2) {
        if (ch2.a == 0) {
            dh.a(ch2);
            return;
        }
        if (ch2.a == 1) {
            dh.b(ch2);
            return;
        }
        if (ch2.a == 2) {
            dh.c(ch2);
            return;
        }
        dh.d(ch2);
    }

    private void a(en en2, int n2, int n3) {
        if (n2 > main.a.A - 85) {
            n2 = main.a.A - 85;
        }
        if (n2 < en.a(fM) + 85 + 10) {
            n2 = en.a(fM) + 85 + 10;
        }
        en.b(fL);
        n3 = p.fJ.a;
        int n4 = 85 - n3 / 2;
        int n5 = n2 - 85 + 3;
        int n6 = n2 + n3 / 2;
        int n7 = (n4 -= p.fI.a) / p.fI.a;
        if (n4 % p.fI.a > 0) {
            ++n7;
        }
        int n8 = 0;
        while (n8 < n7) {
            if (n8 < n7 - 1) {
                en2.b(dT, 0, 15, en.a(dT), 15, 2, n5 + p.fI.a + n8 * p.fI.a, 3, 20);
            } else {
                en2.b(dT, 0, 15, en.a(dT), 15, 2, n5 + n4, 3, 20);
            }
            if (n8 < n7 - 1) {
                en2.b(dT, 0, 15, en.a(dT), 15, 2, n6 + n8 * p.fI.a, 3, 20);
            } else {
                en2.b(dT, 0, 15, en.a(dT), 15, 2, n6 + n4 - p.fI.a, 3, 20);
            }
            ++n8;
        }
        fI.a(0, n5, 3, 2, 0, en2);
        fI.a(0, n6 + n4, 3, 0, 0, en2);
        n8 = ca * 100 / (cd / 2) * 66 / 100;
        if (n8 > 0) {
            if (n8 < 6) {
                n8 = 6;
            }
            en2.e(n5, 3, n8, 15);
        }
        if (ca > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    en2.b(dT, 0, 60, en.a(dT), 15, 2, n5, 3, 20);
                } else {
                    en2.b(dT, 0, 75, en.a(dT), 15, 2, n5 + n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.a.a(en2);
        n7 = bZ * 100 / (cd / 2) * 66 / 100;
        if (66 - (66 - n7) > 0) {
            if (n7 < 6) {
                n7 = 6;
            }
            en2.e(n6 + 66 - n7, 3, 66 - (66 - n7), 15);
        }
        if (bZ > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    en2.b(dT, 0, 30, en.a(dT), 15, 0, n6 + n4, 3, 20);
                } else {
                    en2.b(dT, 0, 45, en.a(dT), 15, 0, n6 + n4 - n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.a.a(en2);
        fJ.a(0, n2 - n3 / 2 + 1, 0, 0, 0, en2);
        String string = String.valueOf(ai.b((int)((cb - l.d()) / 1000L)));
        di.d.a(en2, string, n5 + 85 - 2, 5, 2);
        di.o.a(en2, "T\u1ea7ng " + cf, n5 + 85 - 3, 0 + p.fJ.b, 2);
        n4 = di.a.a(String.valueOf(ca));
        di.b.a(en2, String.valueOf(ca), n2 - n3 / 2 - n4, 3 + p.fJ.b, 0);
        bl.b(en2, 2325, n2 - n3 / 2 - n4 - 15, 3 + p.fJ.b, 2, 20);
        n4 = di.a.a(String.valueOf(bZ));
        di.a.a(en2, String.valueOf(bZ), n2 + n3 / 2, 3 + p.fJ.b, 0);
        bl.b(en2, 2323, n2 + n3 / 2 + n4 + 3, 3 + p.fJ.b, 0, 20);
        di.f.a("#01 AAAAAAAAAA");
        p.b(en2, 40);
        main.a.a(en2);
    }

    private static void b(en en2, int n2) {
        String string = "#01 nnnnnnnnnnnn";
        int n3 = di.k.a(string);
        n3 = main.a.A - n3 - 20;
        int n4 = 0;
        while (n4 < fN) {
            di di2 = di.s;
            if (n4 == 0) {
                di2 = di.p;
            } else if (n4 == 1) {
                di2 = di.n;
            } else if (n4 == 2) {
                di2 = di.q;
            }
            if (n4 == fN - 1) {
                di2 = di.r;
            }
            String[] stringArray = ds.a((String)cg.elementAt(n4), "|", 0);
            int[] nArray = new int[2];
            nArray[1] = 18;
            int[] nArray2 = nArray;
            int n5 = 0;
            while (n5 < 2) {
                di2.a(en2, stringArray[n5], n3 + nArray2[n5], 40 + n4 * di.k.a(), 0, di.k);
                ++n5;
            }
            ++n4;
        }
        main.a.a(en2);
        main.a.a(en2);
    }
}

