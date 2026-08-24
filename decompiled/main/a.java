/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package main;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class a
extends dg
implements b {
    public static boolean a = false;
    public static long b = 0L;
    public static boolean c = true;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static a h;
    public static boolean[] i;
    private static boolean[] ap;
    public static boolean[] j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static be[] v;
    public static int w;
    public static int x;
    private static int aq;
    public static boolean y;
    public static boolean z;
    private static long ar;
    private static long as;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static bb E;
    public static az F;
    public static g G;
    public static g H;
    public static x I;
    public static bi J;
    public static n K;
    public static bc L;
    public static cx M;
    public static Image[] N;
    public static int O;
    private static int at;
    public static int[] P;
    public static int[] Q;
    private en au = new en();
    public static Image[] R;
    public static Image[] S;
    public static t T;
    public static el U;
    private static el av;
    private static el aw;
    public static el V;
    public static boolean W;
    public static int X;
    public static long Y;
    private static int ax;
    private int ay;
    private static boolean az;
    private static Image aA;
    private static Image aB;
    public static Image[] Z;
    private static Image[] aC;
    public static int[] aa;
    public static int[] ab;
    private static int aD;
    private static int aE;
    private static int aF;
    private static int aG;
    private static int[] aH;
    private static int[] aI;
    private static int[] aJ;
    public static boolean ac;
    private static boolean aK;
    private static int aL;
    public static int ad;
    public static int ae;
    private static int[] aM;
    public static int[] af;
    private static int[] aN;
    private static int aO;
    private static int[] aP;
    private static Image aQ;
    private static Image aR;
    private static boolean aS;
    private static long aT;
    public static int ag;
    public static Image ah;
    private static int aU;
    private static int aV;
    private long aW = System.currentTimeMillis() + 1000L;
    private long aX = System.currentTimeMillis() + 1000L;
    private static String aY;
    private static int aZ;
    private static el ba;
    private int bb = 12;
    public static boolean ai;
    private int[] bc;
    private int[] bd;
    private int[] be;
    private static int[] bf;
    private static Image[] bg;
    private static Image bh;
    private static Image[][] bi;
    public static boolean aj;
    public static bs ak;
    public static ev al;
    public static am am;
    public static boolean an;
    private boolean bj;
    private static long bk;
    private static int bl;

    static {
        e = false;
        i = new boolean[15];
        ap = new boolean[15];
        j = new boolean[15];
        v = new be[4];
        new Object();
        at = 0;
        R = new Image[7];
        S = new Image[7];
        T = new t("");
        U = new el("");
        X = -1;
        ax = -1;
        Z = new Image[3];
        aC = new Image[3];
        ad = -1;
        aM = new int[5];
        aO = 0;
        aP = new int[]{1, 4, 11};
        (new int[1])[0] = -1;
        aT = 0L;
        new el("vFlyText");
        aU = 0;
        aZ = A - 60;
        ba = new el("");
        ai = false;
        new Random();
        aj = true;
        bl = 15;
    }

    public a() {
        a a2 = this;
        A = a2.m();
        B = a2.n();
        bb.cp = di.t.a() + 8;
        F = new az();
        G = new g();
        new el("vCurrPopup");
        C = A / 2;
        D = B / 2;
        if (a2.hasPointerEvents()) {
            e = true;
            if (A >= 240) {
                f = true;
            }
            if (A < 320) {
                g = true;
            }
        }
        L = new bc();
        if (B <= 160) {
            cx.a = 15;
            bb.cr = 17;
        }
        h = a2;
        System.gc();
        M = new cx();
        if (!a) {
            if (bi == null) {
                bi = new Image[2][5];
                int n2 = 0;
                while (n2 < 2) {
                    int n3 = 0;
                    while (n3 < 5) {
                        main.a.bi[n2][n3] = l.b("/e/d" + n2 + n3 + ".png");
                        ++n3;
                    }
                    ++n2;
                }
            }
            a2.bc = new int[2];
            a2.bd = new int[2];
            a2.be = new int[2];
            a2.be[1] = -1;
            a2.be[0] = -1;
        }
        main.a.o();
        bh = l.b("/mainImage/myTexture2df.png");
        int n4 = eu.d(eu.b);
        if (n4 != -1) {
            l.c = n4;
        }
        if (l.c == 7 && (eu.c("fake") == null || eu.c("fake") == "")) {
            bh = l.b("/mainImage/wait.png");
        }
        av = new el("vDebugUpdate");
        aw = new el("vDeBugPait");
        V = new el("vDebugSesion");
        n4 = 0;
        while (n4 < 3) {
            main.a.Z[n4] = l.b("/mainImage/myTexture2dbd" + n4 + ".png");
            ++n4;
        }
        en.a(Z[0]);
        en.b(Z[0]);
        en.a(Z[1]);
        en.b(Z[1]);
        g.I = eu.d("lowGraphic");
        a = eu.d("lowGraphic") == 1;
        p.bV = eu.d("serverchat") != 1;
        af.cW = eu.d("isPaintAura") == 1;
        af.cX = eu.d("isPaintAura2") == 1;
        ds.a();
        bl.b();
        bo.a();
        g.ab = 176;
        if (176 > A) {
            g.ab = A;
        }
        ah = l.b("/mainImage/18+.png");
        n4 = 0;
        while (n4 < 7) {
            main.a.R[n4] = l.b("/effectdata/blue/" + n4 + ".png");
            main.a.S[n4] = l.b("/effectdata/violet/" + n4 + ".png");
            ++n4;
        }
        ak = new bs();
        al = new ev();
        I = new x();
        am = new am();
    }

    public static a a() {
        return h;
    }

    public static void b() {
        if (!br.a().d()) {
            br.a().a(GameMidlet.a, GameMidlet.b);
        }
    }

    public static void c() {
        if (!br.b().d()) {
            ds.c("IP2= " + GameMidlet.c + " PORT 2= " + GameMidlet.d);
            br.b().a(GameMidlet.c, GameMidlet.d);
        }
    }

    public static void a(en en2) {
        en2.a(-en2.a(), -en2.b());
        en2.e(0, 0, A, B);
    }

    public static void b(en en2) {
        en2.a(-en2.a(), -en2.b());
        en2.a(0, 0);
        en2.e(0, 0, A, B);
        en2.a(-p.j, -p.k);
    }

    public final void d() {
        block140: {
            int n2;
            block139: {
                block141: {
                    Object object;
                    if (X == 1 && Y < l.d()) {
                        Y = l.d();
                        X = -1;
                        af.bI = false;
                        K = null;
                        bp.c();
                        l.a(true);
                    }
                    if (X == 2 && Y < l.d() && w % 2 == 0 && E != null) {
                        if (E == p.j()) {
                            if (af.bI) {
                                af.bI = false;
                            }
                            if (bs.m) {
                                bs.m = false;
                            }
                        }
                        if (bl.f.size() > 0) {
                            object = (eg)bl.f.elementAt(0);
                            bt.a().p(((eg)object).b);
                            bl.f.removeElementAt(0);
                        }
                        ea.n.size();
                    }
                    if (l.d() > this.aW) {
                        this.aW += 1000L;
                        aU = 0;
                    }
                    ++aU;
                    if (U.size() > 0 && aY == null) {
                        object = (String)U.elementAt(0);
                        aY = object;
                        aZ = A - 60;
                        ax = -1;
                        U.removeElementAt(0);
                    }
                    if (w % 5 == 0) {
                        b = l.d();
                    }
                    if (l.d() > this.aX) {
                        this.aX += 1000L;
                        aV = 0;
                    }
                    ++aV;
                    av.removeAllElements();
                    long l2 = System.currentTimeMillis();
                    if (p.bP) {
                        ds.b();
                    }
                    if (l2 - ar >= 780L && !y) {
                        ar = l2;
                        y = true;
                    } else {
                        y = false;
                    }
                    if (l2 - as >= 7800L && !z) {
                        as = l2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x > 0) {
                        --x;
                    }
                    if (++w > 10000) {
                        if (System.currentTimeMillis() - aT > 20000L && E == I) {
                            GameMidlet.f.a();
                        }
                        w = 0;
                    }
                    if (E == null) break block140;
                    if (ae.n != null) {
                        ae.n.a();
                        ae.n.b();
                    } else if (ae.m != null) {
                        ae.m.a();
                        ae.m.b();
                    } else if (K != null) {
                        K.a();
                    } else if (main.a.F.a) {
                        F.b();
                        F.a();
                    } else if (main.a.G.a) {
                        G.B();
                        if (main.a.b(main.a.G.b, 0, main.a.G.d, main.a.G.e)) {
                            W = false;
                        }
                        if (H != null && main.a.H.a) {
                            H.B();
                            if (main.a.b(main.a.H.b, 0, main.a.H.d, main.a.H.e)) {
                                W = true;
                            }
                        }
                        if (H != null) {
                            if (W) {
                                H.u();
                            } else {
                                G.u();
                            }
                        } else {
                            G.u();
                        }
                        if (main.a.G.o != null && main.a.G.o.b) {
                            G.t();
                        } else if (H != null && main.a.H.o != null && main.a.H.o.b) {
                            H.t();
                        } else if (main.a.b(main.a.G.b, 0, main.a.G.d, main.a.G.e) && H != null || H == null) {
                            G.u();
                        } else if (H != null && main.a.H.a && main.a.b(main.a.H.b, 0, main.a.H.d, main.a.H.e)) {
                            H.u();
                        }
                        if (main.a.b(main.a.G.b + main.a.G.d, 0, A - (main.a.G.d << 1), main.a.G.e) && m && main.a.G.az) {
                            G.A();
                        }
                    }
                    if (!d) {
                        E.c();
                    }
                    if (!main.a.G.a && ae.n == null) {
                        E.d();
                    }
                    if (af.e().aD == null || E != p.c) break block141;
                    int n3 = af.e().aD.c;
                    int n4 = af.e().aD.a;
                    v.j = false;
                    v.k = 0;
                    v.c = 0;
                    v.i = true;
                    v.m = true;
                    if (main.a.F.a && n3 > 0) {
                        v.i = false;
                    }
                    switch (n3) {
                        case 0: {
                            if (ae.m != null || af.e().H == 14) {
                                v.a = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0 && bv.t.size() != 0) {
                                    v.a = ((bw)bv.t.elementAt((int)0)).a - 100;
                                    v.b = ((bw)bv.t.elementAt((int)0)).b + 40;
                                    v.j = true;
                                }
                                if (n4 == 1) {
                                    v.a(0);
                                }
                                if (n4 == 2) {
                                    v.a();
                                }
                                if (n4 == 3) {
                                    if (!main.a.G.a) {
                                        v.a();
                                    } else if (main.a.G.B == 0) {
                                        if (main.a.G.ai == null) {
                                            v.a = main.a.G.ae + main.a.G.ag / 2;
                                            v.b = main.a.G.af + 20;
                                        } else if (main.a.F.e != 0) {
                                            v.a = main.a.G.ae + 25;
                                            v.b = main.a.G.af + 60;
                                        }
                                    } else if (main.a.G.B == 1) {
                                        v.a = main.a.G.C + 10;
                                        v.b = 65;
                                    }
                                }
                                if (n4 == 4) {
                                    if (main.a.G.a) {
                                        v.a = main.a.G.aa.j + 5;
                                        v.b = main.a.G.aa.k + 5;
                                    } else if (main.a.F.a) {
                                        v.a = A / 2;
                                        v.b = B - 20;
                                    } else {
                                        v.a();
                                    }
                                }
                                if (n4 == 5) {
                                    v.a();
                                }
                            }
                            break block139;
                        }
                        case 1: {
                            if (ae.m != null || af.e().H == 14) {
                                v.a = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (bv.d()) {
                                        v.a(0);
                                    } else {
                                        v.b();
                                    }
                                }
                                if (n4 == 1) {
                                    if (!bv.d()) {
                                        v.a(1);
                                    } else {
                                        v.a();
                                    }
                                }
                            }
                            break block139;
                        }
                        case 2: {
                            if (ae.m != null || af.e().H == 14) {
                                v.a = A / 2;
                                v.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (!bv.d()) {
                                        v.f = true;
                                    }
                                    if (!main.a.G.a) {
                                        if (!v.f) {
                                            v.a = p.j().aR.j;
                                            v.b = p.j().aR.k + 13;
                                            v.k = 1;
                                        } else {
                                            if (p.w() == bv.l) {
                                                if (!v.c()) {
                                                    v.b();
                                                }
                                            } else {
                                                v.a(0);
                                            }
                                            if (v.f) {
                                                v.g = true;
                                            }
                                        }
                                    } else if (!v.f) {
                                        if (main.a.G.B == 0) {
                                            n3 = B > 300 ? 15 : 10;
                                            v.a = main.a.G.ae + main.a.G.ag / 2;
                                            v.b = main.a.G.af + main.a.G.ah - n3;
                                        } else {
                                            v.a = main.a.G.C + 10;
                                            v.b = 65;
                                        }
                                    } else if (!v.g) {
                                        v.a = main.a.G.aa.j + 5;
                                        v.b = main.a.G.aa.k + 5;
                                    } else {
                                        v.i = false;
                                    }
                                    if (af.e().T <= 0L) {
                                        v.a = p.bx + 5;
                                        v.b = p.by + 13;
                                        v.j = false;
                                    }
                                }
                                if (n4 == 1) {
                                    break;
                                }
                            }
                            break block139;
                        }
                        case 3: {
                            if (ae.m != null || af.e().H == 14) {
                                v.a = A / 2;
                                v.b = B - 15;
                            } else if (n4 == 0) {
                                if (!main.a.G.a) {
                                    if (!v.h) {
                                        v.a = p.j().aR.j;
                                        v.b = p.j().aR.k + 13;
                                        v.k = 1;
                                    } else {
                                        if (p.w() == bv.l) {
                                            if (!v.c()) {
                                                v.b();
                                            }
                                        } else {
                                            v.a(0);
                                        }
                                        if (v.f) {
                                            v.g = true;
                                        }
                                    }
                                } else if (!v.h) {
                                    v.a = main.a.G.ae + 10 + 108 - 18;
                                    v.b = 65;
                                } else if (!v.g) {
                                    v.a = main.a.G.aa.j + 5;
                                    v.b = main.a.G.aa.k + 5;
                                } else {
                                    v.i = false;
                                }
                                if (af.e().T <= 0L) {
                                    v.a = p.bx + 5;
                                    v.b = p.by + 13;
                                    v.j = false;
                                }
                            } else {
                                v.i = false;
                                v.m = false;
                            }
                            break block139;
                        }
                        default: {
                            if (af.e().aD.c == 9 && af.e().aD.a == 2) {
                                n3 = 0;
                                while (n3 < bo.a.size()) {
                                    bo bo2 = (bo)bo.a.elementAt(n3);
                                    if (bo2.e <= 24) {
                                        v.a = bo2.d + bo2.b / 2;
                                        v.b = bo2.e + 30;
                                        v.j = true;
                                        v.i = false;
                                        v.m = true;
                                        break block139;
                                    }
                                    ++n3;
                                }
                            }
                            v.i = false;
                            v.m = false;
                            break block139;
                        }
                    }
                }
                v.i = false;
                v.m = false;
            }
            int n5 = n2 = v.k == 0 ? 2 : -2;
            if (!v.e) {
                v.l = false;
                if (++v.d == 50) {
                    v.d = 0;
                    v.e = true;
                }
            } else {
                ++v.d;
                if (v.c == 0) {
                    if (v.d == 2) {
                        v.a += n2 * 2;
                        v.b -= 4;
                        v.l = true;
                    }
                    if (v.d == 4) {
                        v.a -= n2 * 2;
                        v.b += 4;
                        v.e = false;
                        v.l = false;
                        v.d = 0;
                    }
                    if (v.d > 4) {
                        v.e = false;
                    }
                }
                if (v.c == 1) {
                    if (v.d == 2) {
                        if (e) {
                            p.a(aw.cI, v.a, v.b + 10, 0, 20, 7);
                        }
                        v.l = true;
                        v.a += n2 * 2;
                        v.b -= 4;
                    }
                    if (v.d == 4) {
                        v.l = false;
                        v.a -= n2;
                        v.b += 2;
                    }
                    if (v.d == 6) {
                        v.l = true;
                        v.a += n2;
                        v.b -= 2;
                    }
                    if (v.d == 8) {
                        v.l = false;
                        v.a -= n2;
                        v.b += 2;
                    }
                    if (v.d == 10) {
                        v.a -= n2;
                        v.b += 2;
                        v.e = false;
                        v.d = 0;
                    }
                }
            }
            bu.a();
        }
        System.currentTimeMillis();
        bp.b();
        if (this.bj) {
            this.bj = false;
            main.a.e();
        }
        if (E != null && E instanceof p && (aZ += ax << 1) - g.v.getWidth() <= 60) {
            ax = 0;
            ++this.ay;
            if (this.ay > 150) {
                this.ay = 0;
                aY = null;
            }
        }
        if (E != null && E.equals(p.j())) {
            if (p.aD != null) {
                p.aD.a();
            }
            if (p.aE != null) {
                p.aE.a();
            }
        }
        o = false;
    }

    public static void e() {
        try {
            af.bI = false;
            af.bG = false;
            bu.a();
            x.c = false;
            bv.p = 0;
            bv.q = 0;
            af.g();
            p.k();
            p.g();
            bp.c();
            eo eo2 = p.aD;
            eo2.b.a();
            eo2 = p.aE;
            eo2.b.a();
            p.aE.i = null;
            ae.m = null;
            ac.b = false;
            p.a(-1, -1);
            p.bv.removeAllElements();
            p.j = 100;
            main.a.G.B = 0;
            main.a.G.ak = e ? -1 : 0;
            G.a();
            H = null;
            p.bt = true;
            cb.l.removeAllElements();
            p.A.removeAllElements();
            p.B.removeAllElements();
            p.C.removeAllElements();
            bv.v.removeAllElements();
            ed.a.removeAllElements();
            ei.a.removeAllElements();
            ea.m.removeAllElements();
            main.a.F.a = false;
            main.a.G.a = false;
            main.a.G.k.removeAllElements();
            if (main.a.G.j != null) {
                main.a.G.j.k = false;
            }
            br.a().e();
            br.b().e();
        }
        catch (Exception exception) {}
        bs.v = true;
        bs.t = -1;
        bs.u = true;
        if (bs.n == -1) {
            al.b();
            return;
        }
        if (ak == null) {
            ak = new bs();
        }
        ak.b();
    }

    private static void a(en en2, int n2, int n3, int n4, int n5, int n6, int n7) {
        en2.a(n2);
        n2 = p.k;
        if (n2 > B) {
            n2 = B;
        }
        en2.d(0, n4 - (n7 != 0 ? n2 >> n7 : 0), n5, n6 + (n7 != 0 ? n2 >> n7 : 0));
    }

    private static void a(en en2, int n2, int n3, int n4, int n5) {
        block22: {
            try {
                int n6;
                int n7;
                int n8 = n2 - 1;
                if (n8 == N.length - 1 && (p.j().bb || p.j().bR)) {
                    en2.a(p.j().be);
                    en2.d(0, 0, A, B);
                    if (ad == 2 || ad == 4 || ad == 7) {
                        main.a.d(en2);
                        main.a.e(en2);
                    }
                    if (p.j().bR && !a) {
                        du.a(en2);
                    }
                    return;
                }
                if (N == null || N[n8] == null) break block22;
                if (aI[n8] != 0) {
                    int n9 = n8;
                    aI[n9] = aI[n9] + aJ[n8];
                }
                if ((n7 = p.k) > B) {
                    n7 = B;
                }
                if (aH[n8] != 0) {
                    n6 = -((p.j + aI[n8] >> aH[n8]) % P[n8]);
                    while (n6 < p.d) {
                        en2.a(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                } else {
                    n6 = 0;
                    while (n6 < p.d) {
                        en2.a(N[n8], n6, aM[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                }
                if (n4 != -1) {
                    if (n8 == aO - 1) {
                        main.a.a(en2, n4, 0, -(n7 >> n3), p.d, aM[n8], n3);
                    } else {
                        main.a.a(en2, n4, 0, aM[n8 - 1] + Q[n8 - 1], p.d, aM[n8] - (aM[n8 - 1] + Q[n8 - 1]), n3);
                    }
                }
                if (n5 != -1) {
                    if (n8 == 0) {
                        main.a.a(en2, n5, 0, aM[n8] + Q[n8], p.d, p.e - (aM[n8] + Q[n8]), n3);
                    } else {
                        main.a.a(en2, n5, 0, aM[n8] + Q[n8], p.d, aM[n8 - 1] - (aM[n8] + Q[n8]) + 80, n3);
                    }
                }
                if (E == p.c) {
                    if (n2 == 1 && ad == 11 && bv.p == 0) {
                        en2.a(aB, -(p.j >> aH[0]) + 400, aM[0] + 30 - (n7 >> 2), cj.c);
                    }
                    if (n2 == 1 && ad == 13) {
                        en2.a(N[1], -(p.j >> aH[0]) + bv.a * 24 / 4, aM[0] - (n7 >> 3) + 30, 0);
                        en2.a(N[1], 0, 0, P[1], Q[1], 2, -(p.j >> aH[0]) + bv.a * 24 / 4 + P[1], aM[0] - (n7 >> 3) + 30, 0);
                    }
                    if (n2 == 3 && bv.l == 1) {
                        n6 = 0;
                        while (n6 < bv.d / en.b(aQ)) {
                            en2.a(aQ, -(p.j >> aH[2]) + 300, n6 * en.b(aQ) - (n7 >> 3), 0);
                            ++n6;
                        }
                    }
                }
                n6 = -(p.j + aI[n8] >> aH[n8]);
                ei.a(en2, n6, aM[n8] + Q[n8] - (n7 >> n3), n8);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void d(en en2) {
        if (aA != null) {
            en2.a(aA, aD, aE, 0);
        }
        if (ac) {
            if (w % 200 == 0) {
                aK = true;
            }
            if (aK) {
                if (++aL == 10) {
                    aL = 0;
                    aK = false;
                }
                if (aL % 2 == 0) {
                    en2.a(0xFFFFFF);
                    en2.d(0, 0, A, B);
                }
            }
        }
    }

    private static void e(en en2) {
        if (aB != null) {
            en2.a(aB, aF, aG, 0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(en en2) {
        if (!aS) {
            en2.a(0);
            en2.d(0, 0, A, B);
        }
        if (af.bI) {
            return;
        }
        int n2 = p.d;
        en2.a(-en2.a(), -en2.b());
        en2.a(0);
        en2.d(0, 0, A, B);
        try {
            if (az && !a) {
                if (E == p.j()) {
                    if (bv.l != 172 && (bv.l == 137 || bv.l == 115 || bv.l == 117 || bv.l == 118 || bv.l == 120 || bv.j)) {
                        en2.a(0);
                        en2.d(0, 0, A, B);
                        return;
                    }
                    if (bv.l == 138) {
                        en2.a(0x676767);
                        en2.d(0, 0, A, B);
                        return;
                    }
                }
                if (ad == 0) {
                    main.a.a(en2, 4, 6, af[3], aN[3]);
                    main.a.a(en2, 3, 4, -1, aN[2]);
                    main.a.a(en2, 2, 3, -1, aN[1]);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 1) {
                    main.a.a(en2, 4, 6, -1, -1);
                    main.a.a(en2, 3, 3, -1, -1);
                    main.a.a(en2, af[2], 0, -(p.k >> 5), n2, aM[2], 5);
                    main.a.a(en2, aN[2], 0, aM[2] + Q[2] - (p.k >> 3), n2, 70, 3);
                    main.a.a(en2, 2, 2, -1, -1);
                    main.a.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 2) {
                    main.a.a(en2, 5, 10, af[4], aN[4]);
                    main.a.a(en2, 4, 8, -1, af[2]);
                    main.a.a(en2, 3, 5, -1, aN[2]);
                    main.a.a(en2, 2, 2, -1, aN[1]);
                    main.a.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 3) {
                    int n3 = p.k - (325 - p.g);
                    en2.a(0, -n3);
                    main.a.a(en2, p.j().bb || p.j().bR ? p.j().be : af[2], 0, n3 - (p.k >> 3), n2, aM[2] - n3 + (p.k >> 3) + 100, 2);
                    main.a.a(en2, 3, 2, -1, aN[2]);
                    main.a.a(en2, 2, 0, -1, -1);
                    main.a.a(en2, 1, 0, -1, aN[0]);
                    en2.a(0, -en2.b());
                    return;
                }
                if (ad == 4) {
                    main.a.a(en2, 4, 7, af[3], -1);
                    main.a.a(en2, 3, 3, -1, en.b > 1 ? aN[2] : af[1]);
                    main.a.a(en2, 2, 2, af[1], aN[1]);
                    main.a.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 5) {
                    main.a.a(en2, 4, 15, af[3], -1);
                    main.a.d(en2);
                    en2.a(100, 10);
                    main.a.d(en2);
                    en2.a(-100, -10);
                    main.a.e(en2);
                    main.a.a(en2, 3, 10, -1, -1);
                    main.a.a(en2, 2, 6, -1, -1);
                    main.a.a(en2, 1, 4, -1, -1);
                    en2.a(0, 27);
                    main.a.a(en2, 1, 2, -1, -1);
                    en2.a(0, 20);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    en2.a(-en2.a(), -en2.b());
                    return;
                }
                if (ad == 6) {
                    main.a.a(en2, 5, 10, af[4], aN[4]);
                    main.a.d(en2);
                    main.a.e(en2);
                    en2.a(60, 40);
                    main.a.e(en2);
                    en2.a(-60, -40);
                    main.a.a(en2, 4, 7, -1, aN[3]);
                    ed.e(en2);
                    main.a.a(en2, 3, 4, -1, -1);
                    main.a.a(en2, 2, 3, -1, aN[1]);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 7) {
                    main.a.a(en2, 4, 6, af[3], aN[3]);
                    main.a.a(en2, 3, 5, -1, -1);
                    main.a.a(en2, 2, 4, -1, -1);
                    main.a.a(en2, 1, 3, -1, aN[0]);
                    return;
                }
                if (ad == 8) {
                    main.a.a(en2, 4, 8, af[3], aN[3]);
                    main.a.d(en2);
                    main.a.e(en2);
                    main.a.a(en2, 3, 4, -1, aN[2]);
                    main.a.a(en2, 2, 2, -1, aN[1]);
                    if ((bv.l >= 92 && bv.l <= 96 || bv.l == 51 || bv.l == 52) && E != I) return;
                    main.a.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                if (ad == 9) {
                    main.a.a(en2, 4, 8, af[3], aN[3]);
                    main.a.d(en2);
                    main.a.e(en2);
                    en2.a(-80, 20);
                    main.a.e(en2);
                    en2.a(80, -20);
                    ed.e(en2);
                    main.a.a(en2, 3, 5, -1, -1);
                    main.a.a(en2, 2, 3, -1, -1);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 10) {
                    int n4 = p.k - (380 - p.g);
                    en2.a(0, -n4);
                    main.a.a(en2, p.j().bb ? p.j().be : af[1], 0, n4 - (p.k >> 2), n2, aM[1] - n4 + (p.k >> 2) + 100, 2);
                    main.a.a(en2, 2, 2, -1, aN[1]);
                    main.a.d(en2);
                    main.a.e(en2);
                    main.a.a(en2, 1, 0, -1, -1);
                    en2.a(0, -en2.b());
                    return;
                }
                if (ad == 11) {
                    main.a.a(en2, 3, 6, af[2], aN[2]);
                    main.a.d(en2);
                    main.a.a(en2, 2, 3, -1, aN[1]);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 12) {
                    en2.a(9161471);
                    en2.d(0, 0, A, B);
                    main.a.a(en2, 3, 4, -1, 0xDBFFFF);
                    main.a.a(en2, 2, 3, -1, 0xDBFFFF);
                    main.a.a(en2, 1, 2, -1, 0xDBFFFF);
                    return;
                }
                if (ad == 13) {
                    en2.a(0xE8F8F8);
                    en2.d(0, 0, A, B);
                    main.a.a(en2, 1, 5, -1, 0xE8F8F8);
                    return;
                }
                if (ad == 15) {
                    en2.a(0x282848);
                    en2.d(0, 0, A, B);
                    main.a.a(en2, 2, 3, -1, aN[1]);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 16) {
                    main.a.a(en2, 4, 6, af[3], aN[3]);
                    int n5 = 0;
                    while (n5 < aC.length) {
                        en2.a(aC[n5], aa[n5], ab[n5], 33);
                        ++n5;
                    }
                    main.a.a(en2, 3, 4, -1, aN[2]);
                    main.a.a(en2, 2, 3, -1, aN[1]);
                    main.a.a(en2, 1, 2, -1, aN[0]);
                    return;
                }
                if (ad == 19) {
                    main.a.a(en2, 5, 10, af[4], aN[4]);
                    main.a.a(en2, 4, 8, -1, af[2]);
                    main.a.a(en2, 3, 5, -1, aN[2]);
                    main.a.a(en2, 2, 2, -1, aN[1]);
                    main.a.a(en2, 1, 1, -1, aN[0]);
                    return;
                }
                main.a.a(en2, aN[3], 0, aM[3] + Q[3], p.d, aM[2] + Q[2], 6);
                main.a.a(en2, 4, 6, af[3], aN[3]);
                main.a.d(en2);
                main.a.a(en2, 3, 4, -1, aN[2]);
                main.a.a(en2, 2, 3, -1, aN[1]);
                main.a.a(en2, 1, 2, -1, aN[0]);
                return;
            }
            en2.a(2315859);
            en2.d(0, 0, A, B);
            if (aR == null) return;
            int n6 = -((p.j >> 2) % en.a(aR));
            while (n6 < p.d) {
                en2.a(aR, n6, (p.k >> 3) + B / 2 - 50, 0);
                n6 += en.a(aR);
            }
            en2.a(5084791);
            en2.d(0, (p.k >> 3) + B / 2 - 50 + en.b(aR), n2, B);
            return;
        }
        catch (Exception exception) {
            en2.a(0);
            en2.d(0, 0, A, B);
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void b(int var0) {
        try {
            var1_1 = p.g;
            switch (var0) {
                case 0: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 70;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 20;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 30;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 50;
                    return;
                }
                case 1: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 120;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 40;
                    main.a.aM[2] = main.a.aM[1] - 90;
                    main.a.aM[3] = main.a.aM[2] - 25;
                    return;
                }
                case 2: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 150;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] - 60;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] - 40;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] - 10;
                    main.a.aM[4] = main.a.aM[3] - main.a.Q[4];
                    return;
                }
                case 3: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 10;
                    main.a.aM[1] = main.a.aM[0] + 80;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] - 10;
                    return;
                }
                case 4: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 130;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1];
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] - 20;
                    main.a.aM[3] = main.a.aM[1] - main.a.Q[2] - 80;
                    return;
                }
                case 5: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 40;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 10;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 15;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 50;
                    return;
                }
                case 6: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 100;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] - 30;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 10;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 15;
                    main.a.aM[4] = main.a.aM[3] - main.a.Q[4] + 15;
                    return;
                }
                case 7: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 20;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 15;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 20;
                    main.a.aM[3] = main.a.aM[1] - main.a.Q[2] - 10;
                    return;
                }
                case 8: {
                    main.a.aM[0] = var1_1 - 103 + 150;
                    if (bv.l == 103) {
                        main.a.aM[0] = main.a.aM[0] - 100;
                    }
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] - 10;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 40;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 10;
                    return;
                }
                case 9: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 100;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 22;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 50;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3];
                    return;
                }
                case 10: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] - 45;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] - 10;
                    return;
                }
                case 11: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 60;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 5;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] - 15;
                    return;
                }
                case 12: {
                    main.a.aM[0] = var1_1 + 40;
                    main.a.aM[1] = main.a.aM[0] - 40;
                    main.a.aM[2] = main.a.aM[1] - 40;
                    return;
                }
                case 13: {
                    main.a.aM[0] = var1_1 - 80;
                    main.a.aM[1] = main.a.aM[0];
                    return;
                }
                case 15: {
                    main.a.aM[0] = var1_1 - 20;
                    main.a.aM[1] = main.a.aM[0] - 80;
                    return;
                }
                case 16: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 75;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 50;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 50;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 90;
                    return;
                }
                case 19: {
                    main.a.aM[0] = var1_1 - main.a.Q[0] + 150;
                    main.a.aM[1] = main.a.aM[0] - main.a.Q[1] - 60;
                    main.a.aM[2] = main.a.aM[1] - main.a.Q[2] - 40;
                    main.a.aM[3] = main.a.aM[2] - main.a.Q[3] - 10;
                    main.a.aM[4] = main.a.aM[3] - main.a.Q[4];
                    return;
                }
            }
            main.a.aM[0] = var1_1 - main.a.Q[0] + 75;
            main.a.aM[1] = main.a.aM[0] - main.a.Q[1] + 50;
            main.a.aM[2] = main.a.aM[1] - main.a.Q[2] + 50;
            main.a.aM[3] = main.a.aM[2] - main.a.Q[3] + 90;
            return;
        }
        catch (Exception v0) {
            var0 = 0;
            ** while (var0 < main.a.aM.length)
        }
lbl-1000:
        // 1 sources

        {
            main.a.aM[var0] = 1;
            ++var0;
            continue;
        }
lbl113:
        // 1 sources

    }

    public static void a(int n2) {
        try {
            Object object;
            Object object2;
            aS = true;
            ed.f = ad == 12 ? bv.d - 100 : bv.d - 160;
            ds.c("load bg id= " + n2 + "map ID= " + bv.l);
            ed.a();
            main.a.c(n2);
            if (bv.m == n2 && bv.q == bv.p || n2 == -1) {
                return;
            }
            ae = 12;
            bv.m = (byte)n2;
            bv.q = (byte)bv.p;
            aH = new int[]{1, 2, 3, 7, 8};
            aI = new int[5];
            aJ = new int[5];
            ad = n2;
            ac = false;
            N = null;
            aA = null;
            aQ = null;
            switch (ad) {
                case 0: {
                    aQ = l.a("/bg/caycot.png");
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                    if (bv.p != 2) break;
                    ae = 8;
                    break;
                }
                case 1: {
                    ae = 7;
                    aO = 4;
                    break;
                }
                case 2: {
                    int[] nArray = new int[5];
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray2 = new int[5];
                    nArray2[2] = 2;
                    aJ = nArray2;
                    aO = 5;
                    break;
                }
                case 3: {
                    aO = 3;
                    break;
                }
                case 4: {
                    ed.a(3);
                    int[] nArray = new int[5];
                    nArray[1] = 1;
                    aI = nArray;
                    int[] nArray3 = new int[5];
                    nArray3[1] = 1;
                    aJ = nArray3;
                    aO = 4;
                    break;
                }
                case 5: {
                    aO = 4;
                    break;
                }
                case 6: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    aI = nArray;
                    int[] nArray4 = new int[5];
                    nArray4[0] = 2;
                    aJ = nArray4;
                    aO = 5;
                    break;
                }
                case 7: {
                    aO = 4;
                    break;
                }
                case 8: {
                    ae = 8;
                    aO = 4;
                    break;
                }
                case 9: {
                    ed.a(9);
                    aO = 4;
                    break;
                }
                case 10: {
                    aO = 2;
                    break;
                }
                case 11: {
                    ae = 7;
                    main.a.aH[2] = 0;
                    aO = 3;
                    break;
                }
                case 12: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    nArray[1] = 1;
                    aI = nArray;
                    int[] nArray5 = new int[5];
                    nArray5[0] = 2;
                    nArray5[1] = 1;
                    aJ = nArray5;
                    aO = 3;
                    break;
                }
                case 13: {
                    aO = 2;
                    break;
                }
                case 15: {
                    ds.c("HELL");
                    aO = 2;
                    break;
                }
                case 16: {
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                    break;
                }
                case 19: {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray6 = new int[5];
                    nArray6[1] = 2;
                    nArray6[2] = 1;
                    aJ = nArray6;
                    aO = 5;
                    break;
                }
                default: {
                    aH = new int[]{1, 3, 5, 7};
                    aO = 4;
                }
            }
            if (n2 <= 16) {
                O = cj.g[ad];
            } else {
                try {
                    String string = "/bg/b" + ad + 3 + ".png";
                    if (bv.p != 0) {
                        string = "/bg/b" + ad + 3 + "-" + bv.p + ".png";
                    }
                    object2 = new int[1];
                    object = l.a(string);
                    object.getRGB(object2, 0, 1, en.c(object) / 2, 0, 1, 1);
                    O = object2[0];
                }
                catch (Exception exception) {
                    O = cj.g[cj.g.length - 1];
                }
            }
            af = new int[cj.g.length];
            aN = new int[cj.g.length];
            int n3 = 0;
            while (n3 < cj.g.length) {
                main.a.af[n3] = cj.g[n3];
                main.a.aN[n3] = cj.g[n3];
                ++n3;
            }
            if (a) {
                aR = l.a("/bg/b63.png");
                return;
            }
            N = new Image[aO];
            P = new int[aO];
            Q = new int[aO];
            aN = new int[aO];
            af = new int[aO];
            if (bv.p == 100) {
                main.a.N[0] = l.a("/bg/b100.png");
                main.a.N[1] = l.a("/bg/b100.png");
                main.a.N[2] = l.a("/bg/b82-1.png");
                main.a.N[3] = l.a("/bg/b93.png");
                n3 = 0;
                while (n3 < aO) {
                    if (N[n3] != null) {
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, en.c(N[n3]) / 2, 0, 1, 1);
                        main.a.af[n3] = object2[0];
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, en.c(N[n3]) / 2, en.d(N[n3]) - 1, 1, 1);
                        main.a.aN[n3] = object2[0];
                        main.a.P[n3] = en.a(N[n3]);
                        main.a.Q[n3] = en.b(N[n3]);
                    } else if (aO > 1) {
                        main.a.N[n3] = l.a("/bg/b" + ad + "0.png");
                        main.a.P[n3] = en.a(N[n3]);
                        main.a.Q[n3] = en.b(N[n3]);
                    }
                    ++n3;
                }
            } else {
                n3 = 0;
                while (n3 < aO) {
                    object2 = "/bg/b" + ad + n3 + ".png";
                    if (bv.p != 0) {
                        object2 = "/bg/b" + ad + n3 + "-" + bv.p + ".png";
                    }
                    main.a.N[n3] = l.a((String)object2);
                    if (N[n3] != null) {
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, en.c(N[n3]) / 2, 0, 1, 1);
                        main.a.af[n3] = (int)object[0];
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, en.c(N[n3]) / 2, en.d(N[n3]) - 1, 1, 1);
                        main.a.aN[n3] = (int)object[0];
                        main.a.P[n3] = en.a(N[n3]);
                        main.a.Q[n3] = en.b(N[n3]);
                    } else if (aO > 1) {
                        main.a.N[n3] = l.a("/bg/b" + ad + "0.png");
                        main.a.P[n3] = en.a(N[n3]);
                        main.a.Q[n3] = en.b(N[n3]);
                    }
                    ++n3;
                }
            }
            main.a.b(ad);
            ds.c("5");
            aa = new int[]{p.d / 2 - 40, p.d / 2 + 40, p.d / 2 - 100, p.d / 2 - 80, p.d / 2 - 120};
            ab = new int[]{130, 100, 150, 140, 80};
            aC = null;
            if (ad != 0) {
                if (ad == 2) {
                    aA = l.a("/bg/sun0.png");
                    aD = p.d / 2 + 50;
                    aE = aM[4] - 40;
                    bv.h = l.a("/tWater/wts");
                } else if (ad == 19) {
                    bv.h = l.a("/tWater/water_flow_32");
                } else if (ad == 4) {
                    aA = l.a("/bg/sun2.png");
                    aD = p.d / 2 + 30;
                    aE = aM[3];
                } else if (ad == 7) {
                    aA = l.a("/bg/sun3" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun4" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d - p.d / 3;
                    aE = aM[3] - 80;
                    aF = aD - 100;
                    aG = aM[3] - 30;
                } else if (ad == 6) {
                    aA = l.a("/bg/sun5" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun6" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d - p.d / 3;
                    aE = aM[4];
                    aF = aD - 100;
                    aG = aM[4] + 20;
                } else if (n2 == 5) {
                    aA = l.a("/bg/sun8" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun7" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d / 2 - 50;
                    aE = aM[3] + 20;
                    aF = p.d / 2 + 20;
                    aG = aM[3] - 30;
                } else if (ad == 8 && bv.l < 90) {
                    aA = l.a("/bg/sun9" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun10" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d / 2 - 30;
                    aE = aM[3] + 60;
                    aF = p.d / 2 + 20;
                    aG = aM[3] + 10;
                } else if (n2 == 9) {
                    aA = l.a("/bg/sun11" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun12" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d - p.d / 3;
                    aE = aM[4] + 20;
                    aF = aD - 80;
                    aG = aM[4] + 40;
                } else if (n2 == 10) {
                    aA = l.a("/bg/sun13" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/sun14" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d - p.d / 3;
                    aE = aM[1] - 30;
                    aF = aD - 80;
                    aG = aM[1];
                } else if (n2 == 11) {
                    aA = l.a("/bg/sun15" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aB = l.a("/bg/b113" + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    aD = p.d / 2 - 30;
                    aE = aM[2] - 30;
                } else if (n2 == 12) {
                    ab = new int[]{200, 170, 220, 150, 250};
                } else if (n2 == 16) {
                    aa = new int[]{90, 170, 250, 320, 400, 450, 500};
                    ab = new int[]{aM[2] + 5, aM[2] - 20, aM[2] - 50, aM[2] - 30, aM[2] - 50, aM[2], aM[2] - 40};
                    aC = new Image[7];
                    n3 = 0;
                    while (n3 < aC.length) {
                        int n4 = 160;
                        if (n3 == 1 || n3 == 3) {
                            n4 = 161;
                        }
                        main.a.aC[n3] = l.a("/bg/sun" + n4 + ".png");
                        ++n3;
                    }
                } else if (n2 == 19) {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aI = nArray;
                    int[] nArray7 = new int[5];
                    nArray7[1] = 2;
                    nArray7[2] = 1;
                    aJ = nArray7;
                    aO = 5;
                } else {
                    aA = null;
                    aB = null;
                    aA = l.a("/bg/sun" + n2 + (bv.p == 0 ? "" : "-" + bv.p) + ".png");
                    if (l.a("/tWater/water_flow_" + n2) != null) {
                        bv.h = l.a("/tWater/water_flow_" + n2);
                    }
                    aD = p.d - p.d / 3;
                    aE = aM[2] - 30;
                }
            }
            az = false;
            if (!false) {
                az = true;
                return;
            }
        }
        catch (Exception exception) {
            aS = false;
        }
    }

    private static void c(int n2) {
        int n3 = 0;
        while (n3 < aP.length) {
            int n4;
            if (n2 == aP[n3] && (n4 = ds.b(0, 2)) == 0) {
                ed.a(0);
                return;
            }
            ++n3;
        }
    }

    public final void keyPressed(int n2) {
        aT = System.currentTimeMillis();
        if (n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 122 || n2 == 10 || n2 == 8 || n2 == 13 || n2 == 32 || n2 == 31) {
            ag = n2;
        }
        if (K != null) {
            K.a(n2);
            ag = 0;
            return;
        }
        E.a(n2);
        switch (n2) {
            case 48: {
                main.a.j[0] = true;
                main.a.i[0] = true;
                return;
            }
            case 49: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[1] = true;
                    main.a.i[1] = true;
                }
                return;
            }
            case 51: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[3] = true;
                    main.a.i[3] = true;
                }
                return;
            }
            case 55: {
                main.a.j[7] = true;
                main.a.i[7] = true;
                return;
            }
            case 57: {
                main.a.j[9] = true;
                main.a.i[9] = true;
                return;
            }
            case 42: {
                main.a.j[10] = true;
                main.a.i[10] = true;
                return;
            }
            case 35: {
                main.a.j[11] = true;
                main.a.i[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.j[12] = true;
                main.a.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.j[13] = true;
                main.a.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                if (E instanceof p || E instanceof ar) {
                    af.e();
                }
                main.a.j[5] = true;
                main.a.i[5] = true;
                return;
            }
            case -38: 
            case -1: {
                if (E instanceof p || E instanceof ar) {
                    af.e();
                }
                main.a.j[2] = true;
                main.a.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                if (E instanceof p || E instanceof ar) {
                    af.e();
                }
                main.a.j[8] = true;
                main.a.i[8] = true;
                return;
            }
            case -3: {
                if (E instanceof p || E instanceof ar) {
                    af.e();
                }
                main.a.j[4] = true;
                main.a.i[4] = true;
                return;
            }
            case -4: {
                if (E instanceof p || E instanceof ar) {
                    af.e();
                }
                main.a.j[6] = true;
                main.a.i[6] = true;
                return;
            }
            case 50: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[2] = true;
                    main.a.i[2] = true;
                }
                return;
            }
            case 52: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[4] = true;
                    main.a.i[4] = true;
                }
                return;
            }
            case 54: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[6] = true;
                    main.a.i[6] = true;
                }
                return;
            }
            case 56: {
                if (E == ar.a || E == p.c && c && !cq.b().b) {
                    main.a.j[8] = true;
                    main.a.i[8] = true;
                }
                return;
            }
            case 53: {
                if (E != ar.a && (E != p.c || !c || cq.b().b)) break;
                main.a.j[5] = true;
                main.a.i[5] = true;
            }
        }
    }

    public final void keyReleased(int n2) {
        ag = 0;
        switch (n2) {
            case 48: {
                main.a.j[0] = false;
                main.a.ap[0] = true;
                return;
            }
            case 49: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[1] = false;
                    main.a.ap[1] = true;
                }
                return;
            }
            case 51: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[3] = false;
                    main.a.ap[3] = true;
                }
                return;
            }
            case 55: {
                main.a.j[7] = false;
                main.a.ap[7] = true;
                return;
            }
            case 57: {
                main.a.j[9] = false;
                main.a.ap[9] = true;
                return;
            }
            case 42: {
                main.a.j[10] = false;
                main.a.ap[10] = true;
                return;
            }
            case 35: {
                main.a.j[11] = false;
                main.a.ap[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.j[12] = false;
                main.a.ap[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.j[13] = false;
                main.a.ap[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.a.j[5] = false;
                main.a.ap[5] = true;
                return;
            }
            case -38: 
            case -1: {
                main.a.j[2] = false;
                return;
            }
            case -39: 
            case -2: {
                main.a.j[8] = false;
                return;
            }
            case -3: {
                main.a.j[4] = false;
                return;
            }
            case -4: {
                main.a.j[6] = false;
                return;
            }
            case 50: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[2] = false;
                    main.a.ap[2] = true;
                }
                return;
            }
            case 52: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[4] = false;
                    main.a.ap[4] = true;
                }
                return;
            }
            case 54: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[6] = false;
                    main.a.ap[6] = true;
                }
                return;
            }
            case 56: {
                if (E == p.c && c && !cq.b().b) {
                    main.a.j[8] = false;
                    main.a.ap[8] = true;
                }
                return;
            }
            case 53: {
                if (E != p.c || !c || cq.b().b) break;
                main.a.j[5] = false;
                main.a.ap[5] = true;
            }
        }
    }

    public final void a(int n2, int n3) {
        o = false;
        if (ds.g(n2 - t) >= 10 || ds.g(n3 - u) >= 10) {
            l = false;
            k = true;
            n = true;
        }
        p = n2;
        q = n3;
        if (++at > 3) {
            at = 0;
        }
        main.a.v[main.a.at] = new be(n2, n3);
    }

    public final void b(int n2, int n3) {
        o = false;
        m = false;
        ai = true;
        k = true;
        l = false;
        n = false;
        aT = System.currentTimeMillis();
        r = n2;
        s = n3;
        t = n2;
        u = n3;
        p = n2;
        q = n3;
    }

    public final void c(int n2, int n3) {
        if (!n) {
            o = true;
        }
        k = false;
        m = true;
        n = false;
        l = true;
        bb.cs = -1;
        p = n2;
        q = n3;
    }

    public static boolean a(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return p >= n2 && p <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public static void f() {
        int n2 = 0;
        while (n2 < i.length) {
            main.a.i[n2] = false;
            ++n2;
        }
        m = false;
    }

    public static void g() {
        int n2 = 0;
        while (n2 < j.length) {
            main.a.j[n2] = false;
            ++n2;
        }
    }

    public final void paint(Graphics object) {
        Object object2;
        this.au.a = object;
        aw.removeAllElements();
        if (E != null) {
            E.a(this.au);
        }
        this.au.a(-this.au.a(), -this.au.b());
        this.au.e(0, 0, A, B);
        if (main.a.G.a) {
            G.a(this.au);
            if (H != null && main.a.H.a) {
                H.a(this.au);
            }
            if (main.a.G.o != null && main.a.G.o.b) {
                main.a.G.o.a(this.au);
            }
            if (H != null && main.a.H.o != null && main.a.H.o.b) {
                main.a.H.o.a(this.au);
            }
        }
        if (p.bP) {
            ds.a(this.au);
        }
        bp.a(this.au);
        if (K != null) {
            K.a(this.au);
        } else if (main.a.F.a) {
            main.a.a(this.au);
            F.a(this.au);
        }
        p.aD.a(this.au);
        p.aE.a(this.au);
        if (p.j().bQ != null) {
            p.j().bQ.a(this.au);
        }
        if (ae.m != null) {
            ae.m.a(this.au);
        }
        object = this.au;
        if (ae.n == null && !af.e().t && !af.e().s) {
            object2 = object;
            try {
                if (v.m && (v.a <= p.j || v.a >= p.j + p.d || v.b <= p.k || v.b >= p.k + p.e) && w % 10 >= 5 && ae.m == null && ae.n == null && !main.a.G.a && v.j) {
                    int n2 = v.a - af.e().B;
                    int n3 = v.b - af.e().C;
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    if (n2 > 0 && n3 >= 0) {
                        if (ds.g(n2) >= ds.g(n3)) {
                            n4 = p.d - 10;
                            n5 = p.e / 2 + 30;
                            if (e) {
                                n5 = p.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = p.d / 2;
                            n5 = p.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 >= 0 && n3 < 0) {
                        if (ds.g(n2) >= ds.g(n3)) {
                            n4 = p.d - 10;
                            n5 = p.e / 2 + 30;
                            if (e) {
                                n5 = p.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = p.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    if (n2 < 0 && n3 >= 0) {
                        if (ds.g(n2) >= ds.g(n3)) {
                            n4 = 10;
                            n5 = p.e / 2 + 30;
                            if (e) {
                                n5 = p.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = p.d / 2;
                            n5 = p.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 <= 0 && n3 < 0) {
                        if (ds.g(n2) >= ds.g(n3)) {
                            n4 = 10;
                            n5 = p.e / 2 + 30;
                            if (e) {
                                n5 = p.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = p.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    p.c((en)object2);
                    ((en)object2).a(p.bw, 0, 0, 13, 16, n6, n4, n5, cj.f);
                }
            }
            catch (Exception exception) {}
            if (!(main.a.F.e != 0 || !v.i || ae.q != null || af.bG || E != p.j() || main.a.G.a && main.a.G.h != 0)) {
                if (v.j) {
                    ((en)object).a(-p.j, -p.k);
                }
                if (v.k == 0) {
                    ((en)object).a(g.i, v.a - 15, v.b, 0);
                }
                if (v.k == 1) {
                    ((en)object).a(g.i, 0, 0, 14, 16, 2, v.a + 15, v.b, cj.b);
                }
                if (v.l) {
                    ((en)object).a(ce.f, v.a, v.b, 3);
                }
                ((en)object).a(-((en)object).a(), -((en)object).b());
            }
        }
        if (ae.n != null) {
            ae.n.a(this.au);
        }
        int n7 = 0;
        while (n7 < dc.x.size()) {
            object2 = (dc)dc.x.elementAt(n7);
            if (object2 instanceof ae && !object2.equals(ae.m) && !object2.equals(ae.n)) {
                ((dc)object2).a(this.au);
            }
            ++n7;
        }
        if (K != null) {
            K.a(this.au);
        }
        if (af.bI || x.c || bs.m || am.a) {
            en en2 = this.au;
            String string = "";
            main.a.a(en2);
            en2.a(0);
            en2.d(0, 0, A, B);
            en2.a(x.j, A / 2, B / 2 - 24, cj.c);
            main.a.a(C, B / 2 + 24, en2);
            di.c.a(en2, String.valueOf(aw.aC) + (x.k > 0 ? " " + x.k + "s" : string), A / 2, B / 2, 2);
            if (bl > 0 && x.k <= 0 && l.d() - bk >= 1000L) {
                if (--bl == 0) {
                    bl = 15;
                }
                bk = l.d();
            }
        }
        main.a.a(this.au);
        ei.d(this.au);
        if (an && !d) {
            if (E == I || E == ak || E == al) {
                this.au.a(ah, 5, 5, 0);
            }
            if (E == cw.a) {
                this.au.a(ah, C, 5, 0);
            }
        }
        int n8 = 0;
        while (n8 < ba.size()) {
            object2 = (String)ba.elementAt(n8);
            di.a.a(this.au, (String)object2, A, B - this.bb - n8 * this.bb, 1);
            di.c.a(this.au, (String)object2, A - 1, B - this.bb - n8 * this.bb - 1, 1);
            ++n8;
        }
        main.a.a(this.au);
        n8 = B / 4;
        if (E != null && E instanceof p && aY != null) {
            this.au.e(60, n8, A - 120, di.s.a() + 2);
            di.o.a(this.au, aY, aZ, n8 + 1, 0);
            di.n.a(this.au, aY, aZ, n8, 0);
            this.au.e(0, 0, A, B);
        }
    }

    public static void h() {
        K = null;
        bp.c();
    }

    public static void a(String string) {
        L.a(string, null, new de(aw.bs, h, 8882, null), null);
        K = L;
    }

    public static void b(String string) {
        L.a(string, null, new de(aw.bv, h, 8882, null), null);
        K = L;
        main.a.L.a = true;
    }

    public static void c(String string) {
        L.a(string, null, new de(aw.bv, h, 8882, null), null);
        K = L;
        main.a.L.a = true;
    }

    public static void i() {
        af.bI = true;
    }

    public static void a(String string, int n2, Object object) {
        L.a(string, null, new de(aw.bs, h, n2, null), null);
        L.c();
    }

    public static void a(String string, de de2, de de3) {
        L.a(string, de2, null, de3);
        L.c();
    }

    public final void sizeChanged(int n2, int n3) {
    }

    public final boolean a(int n2, int n3, int n4) {
        if (a) {
            return false;
        }
        int n5 = n2 = n2 == 1 ? 0 : 1;
        if (this.be[n2] != -1) {
            return false;
        }
        this.be[n2] = 0;
        this.bc[n2] = n3;
        this.bd[n2] = n4;
        return true;
    }

    private static void o() {
        if (a) {
            return;
        }
        bg = new Image[3];
        int n2 = 0;
        while (n2 < 3) {
            main.a.bg[n2] = l.b("/e/w" + n2 + ".png");
            ++n2;
        }
        int[] nArray = new int[2];
        bf = nArray;
        main.a.bf[1] = -1;
        nArray[0] = -1;
    }

    public final void j() {
        if (a) {
            return;
        }
        try {
            int n2 = 0;
            while (n2 < 2) {
                if (this.be[n2] != -1) {
                    int n3 = n2;
                    this.be[n3] = this.be[n3] + 1;
                    if (this.be[n2] >= 5) {
                        this.be[n2] = -1;
                    }
                    if (n2 == 0) {
                        int n4 = n2;
                        this.bc[n4] = this.bc[n4] - 1;
                    } else {
                        int n5 = n2;
                        this.bc[n5] = this.bc[n5] + 1;
                    }
                    int n6 = n2;
                    this.bd[n6] = this.bd[n6] - 1;
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean d(int n2, int n3) {
        if (n2 < p.j) {
            return false;
        }
        if (n2 > p.j + p.d) {
            return false;
        }
        if (n3 < p.k) {
            return false;
        }
        return n3 <= p.k + p.e + 30;
    }

    public static void a(int n2, int n3, en en2) {
        int n4 = aq % (l.c == 7 ? 8 : 9);
        if (++aq == 1000) {
            aq = 0;
        }
        en2.a(bh, 0, n4 << 4, 16, 16, 0, n2, n3, 3);
    }

    public final void k() {
        this.bj = true;
    }

    public static boolean b(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return p >= n2 && p <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 10001: {
                K = null;
                bp.c();
                return;
            }
            case 10000: {
                K = null;
                bp.c();
                return;
            }
            case 9000: {
                K = null;
                bp.c();
                em.b = null;
                bl.a();
                System.gc();
                bs.o = true;
                bs.u = true;
                p.j().l();
                if (E == I) break;
                ak.g();
                return;
            }
            case 999: {
                K = null;
                bp.c();
                return;
            }
            case 9999: {
                K = null;
                bp.c();
                main.a.b();
                bt.a().c();
                I.a();
                return;
            }
            case 8881: {
                Object object2 = (String)object;
                try {
                    GameMidlet.f.platformRequest((String)object2);
                }
                catch (Exception exception) {
                    object2 = exception;
                    exception.printStackTrace();
                }
                K = null;
                return;
            }
            case 8882: {
                bp.c();
                K = null;
                bs.v = false;
                return;
            }
            case 8884: {
                K = null;
                bp.c();
                if (al == null) {
                    al = new ev();
                }
                al.b();
                return;
            }
            case 8885: {
                GameMidlet.f.a();
                return;
            }
            case 8886: {
                K = null;
                bp.c();
                String string = (String)object;
                bt.a().c(string);
                return;
            }
            case 8887: {
                K = null;
                bp.c();
                n2 = (Integer)object;
                bt.a().m(n2);
                return;
            }
            case 8888: {
                n2 = (Integer)object;
                bt.a().n(n2);
                K = null;
                bp.c();
                return;
            }
            case 8889: {
                String string = (String)object;
                K = null;
                bp.c();
                bt.a().d(string);
                return;
            }
            case 88810: {
                n2 = (Integer)object;
                K = null;
                bp.c();
                bt.a().k(n2);
                return;
            }
            case 88811: {
                K = null;
                bp.c();
                bt.a().i();
                return;
            }
            case 88814: {
                h[] hArray = (h[])object;
                K = null;
                bp.c();
                bt.a().a(hArray);
                return;
            }
            case 88815: {
                return;
            }
            case 88817: {
                ae.c("", 1, af.e().aT);
                bt.a().a(af.e().aT.df.a, main.a.F.b, 0);
                return;
            }
            case 88818: {
                n2 = ((Short)object).shortValue();
                bt.a().a((short)n2, null.a.d());
                K = null;
                bp.c();
                return;
            }
            case 88819: {
                n2 = ((Short)object).shortValue();
                bt.a().b((short)n2);
                return;
            }
            case 88820: {
                String[] stringArray = (String[])object;
                if (af.e().aT == null) {
                    return;
                }
                object = new Integer(main.a.F.b);
                if (stringArray.length > 1) {
                    el el2 = new el("vSub");
                    int n3 = 0;
                    while (n3 < stringArray.length - 1) {
                        el2.addElement(new de(stringArray[n3 + 1], h, 88821, object));
                        ++n3;
                    }
                    F.a(el2);
                    return;
                }
                ae.c("", 1, af.e().aT);
                bt.a().a(af.e().aT.df.a, ((Integer)object).intValue(), 0);
                return;
            }
            case 88821: {
                int n4 = (Integer)object;
                ae.c("", 1, af.e().aT);
                bt.a().a(af.e().aT.df.a, n4, main.a.F.b);
                return;
            }
            case 88822: {
                ae.c("", 1, af.e().aT);
                bt.a().a(af.e().aT.df.a, main.a.F.b, 0);
                return;
            }
            case 88823: {
                main.a.a(aw.K);
                return;
            }
            case 88824: {
                main.a.a(aw.L);
                return;
            }
            case 88825: {
                main.a.c(aw.M);
                return;
            }
            case 88826: {
                main.a.c(aw.N);
                return;
            }
            case 88827: {
                main.a.a(aw.O);
                return;
            }
            case 88828: {
                main.a.a(aw.P);
                return;
            }
            case 88829: {
                String string = null.a.d();
                if (string.equals("")) {
                    return;
                }
                bt.a().b(string, (int)((Integer)object));
                bp.a();
                return;
            }
            case 88836: {
                null.a.b(6);
                ((j)null).a(aw.S, new de(aw.bu, h, 888361, null), 1);
                return;
            }
            case 888361: {
                String string = null.a.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    main.a.a(aw.Q);
                    return;
                }
                try {
                    bt.a().q(Integer.parseInt(string));
                    return;
                }
                catch (Exception exception) {
                    main.a.a(aw.R);
                    return;
                }
            }
            case 88837: {
                String string = null.a.d();
                K = null;
                bp.c();
                try {
                    bt.a().s(Integer.parseInt(string.trim()));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88839: {
                String string = null.a.d();
                K = null;
                bp.c();
                if (string.length() < 6 || string.equals("")) {
                    main.a.a(aw.Q);
                    return;
                }
                try {
                    String string2 = string;
                    string = null;
                    int n5 = 8882;
                    object = string2;
                    n5 = 888391;
                    String string3 = aw.ah;
                    L.a(string3, new de(aw.bn, h, 888391, object), new de("", h, 888391, object), new de(aw.bo, h, 8882, null));
                    L.c();
                    return;
                }
                catch (Exception exception) {
                    main.a.a(aw.R);
                    return;
                }
            }
            case 888391: {
                String string = (String)object;
                K = null;
                bp.c();
                bt.a().r(Integer.parseInt(string));
                return;
            }
            case 888392: {
                bt.a().a(4, main.a.F.b, 0);
                return;
            }
            case 888393: {
                I.a();
                return;
            }
            case 888394: {
                K = null;
                bp.c();
                return;
            }
            case 888395: {
                if (E.equals(em.a) || E.equals(ak)) {
                    ak.b();
                } else {
                    I.b();
                }
                K = null;
                bp.c();
                return;
            }
            case 888396: {
                K = null;
                bp.c();
                return;
            }
            case 888397: {
                K = null;
                bp.c();
                return;
            }
            case 101024: {
                K = null;
                bp.c();
                return;
            }
            case 101025: {
                K = null;
                bp.c();
                if (bs.u) {
                    ak.b();
                    return;
                }
                ak.j();
                return;
            }
            case 101026: {
                l.b(true);
                return;
            }
            case 100001: {
                bt.a().b((byte)0, (byte)-1);
                bp.a();
                return;
            }
            case 100002: {
                if (I == null) {
                    I = new x();
                }
                x.g();
                return;
            }
            case 100003: {
                return;
            }
            case 100004: {
                return;
            }
            case 100005: {
                if (af.e().H == 14) {
                    main.a.a(aw.ex);
                    return;
                }
                bt.a().h();
                return;
            }
            case 100006: {
                l.b(true);
                return;
            }
            case 100016: {
                bs.a(17, false);
                main.a.e();
                bs.m = true;
                K = null;
                bp.c();
            }
        }
    }

    public static void l() {
        l = false;
        k = false;
        ai = false;
        m = false;
        o = false;
        p.j().aU = 0L;
        p.j().aT = false;
    }
}

