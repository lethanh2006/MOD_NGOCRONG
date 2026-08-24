/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class ae
extends dc
implements b {
    public int a = 100;
    public int b;
    public int c;
    public String[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public do i;
    private static long C;
    private static long D;
    private int E;
    private String[] F;
    public de j;
    public de k;
    public de l;
    public static ae m;
    public static ae n;
    private static String G;
    private static do H;
    public byte o = 0;
    public byte p = 0;
    public static dv q;
    private static boolean I;
    private int J;
    private static int K;
    private int L;
    public boolean[] r = new boolean[20];
    public static int s;
    private int M = 0;
    private int N = 0;
    private int O = 0;
    private Image P;
    public int t;
    public boolean u = false;
    public static int v;
    private int Q = 0;
    private int R = 0;

    static {
        s = 7;
    }

    public static void a(String string, do do_) {
        G = string;
        H = do_;
        if (m == null) {
            ae.b(G, 100000, H);
            G = null;
            H = null;
        }
    }

    public static void a(String stringArray, int n2, do do_) {
        stringArray = new String[]{stringArray};
        if (do_.J != 5 && p.aD.e) {
            p.aD.f = false;
        }
        af.bH = true;
        n = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).t = 5;
        ae.n.e = main.a.A / 2 - ae.n.a / 2 - 1;
        ae.n.f = main.a.B - 20 - ae.n.g;
        ae.n.E = 0;
        ae.n.F = stringArray;
        q = new dv();
        int n3 = ae.n.d.length;
        q.a(n3, 12, ae.n.e, ae.n.f - ae.n.t + 12, ae.n.a + 2, ae.n.g - 25, true, 1);
        bu.a();
    }

    public static void b(String stringArray, int n2, do do_) {
        ds.c("chat= " + (String)stringArray);
        stringArray = ds.a((String)stringArray, "\n", 0);
        af.bH = true;
        m = ae.c(stringArray[0], 100000, do_);
        ae.c(stringArray[0], 100000, do_).E = 0;
        ae.m.F = stringArray;
        String string = aw.bl;
        if (stringArray.length == 1) {
            string = aw.bj;
        }
        ae.m.j = new de(string, m, 8000, null);
        ae.m.j.j = main.a.A / 2 - 35;
        ae.m.j.k = main.a.B - 35;
        bu.a();
    }

    public static ae c(String string, int n2, do do_) {
        ds.c("ADD POP");
        ds.c(af.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().a = main.a.A - 30 - (main.a.F.a ? main.a.F.c : 0);
        if (ae2.a > 320) {
            ae2.a = 320;
        }
        if (string.length() < 10) {
            ae2.a = 64;
        }
        if (main.a.A == 128) {
            ae2.a = 128;
        }
        ae2.d = di.p.a(string, ae2.a - 10);
        ae2.b = n2;
        ae2.i = do_;
        af.x = ae2;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > main.a.B - 80) {
            ae2.g = main.a.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            p.aD.a("", 1);
        }
        C = D = l.d();
        return ae2;
    }

    public static ae a(String string, int n2, do do_, int n3) {
        ds.c("ADD POP");
        ds.c(af.e().aT != null ? "!null" : "null");
        K = 10;
        ae ae2 = new ae();
        new ae().a = main.a.A - 30 - (main.a.F.a ? main.a.F.c : 0);
        if (ae2.a > 320) {
            ae2.a = 320;
        }
        if (string.length() < 10) {
            ae2.a = 64;
        }
        if (main.a.A == 128) {
            ae2.a = 128;
        }
        ae2.d = di.p.a(string, ae2.a - 10);
        ae2.b = 100000;
        ae2.i = do_;
        ae2.J = 5820;
        af.x = ae2;
        ae2.g = 15 - ae2.c + ae2.d.length * 12 + 10;
        if (ae2.g > main.a.B - 80) {
            ae2.g = main.a.B - 80;
        }
        dc.x.addElement(ae2);
        I = false;
        if (do_ != null && do_.J == 5) {
            I = true;
            p.aD.a("", 1);
        }
        ae2.g += 15;
        C = D = l.d();
        return ae2;
    }

    public final void a() {
        if (q != null) {
            p.aD.f = false;
            q.b();
        } else {
            p.aD.f = true;
        }
        if (main.a.F.a) {
            this.t = 0;
            this.e = main.a.A / 2 - this.a / 2 - 1;
            this.f = main.a.F.d - this.g;
        } else {
            this.t = 0;
            if (p.j().co != null || p.j().cm != null || p.j().cn != null || this.j != null || this.k != null) {
                this.t = 5;
                this.e = main.a.A / 2 - this.a / 2 - 1;
                this.f = main.a.B - 20 - this.g;
            } else {
                this.e = main.a.A / 2 - this.a / 2 - 1;
                this.f = main.a.B - 5 - this.g;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (K > 0) {
            --K;
        } else {
            p.aD.b.e = 0;
            int n2 = 0;
            while (n2 < p.aD.b.a.size()) {
                if (((r)p.aD.b.a.elementAt((int)n2)).b != 70) {
                    ((r)p.aD.b.a.elementAt((int)n2)).b = 10;
                }
                ++n2;
            }
        }
        if (this.c > 1) {
            --this.c;
        }
        if (this.i != null && af.x != null && af.x != this || this.i != null && af.x == null || this.b <= 0) {
            dc.z.removeElement(this);
            dc.x.removeElement(this);
        }
    }

    public final void a(en object) {
        int n2;
        Object object2;
        int n3;
        if (p.j().bd && p.j().ba) {
            return;
        }
        main.a.a((en)object);
        int n4 = this.e;
        int n5 = this.f;
        int n6 = this.a + 2;
        int n7 = this.g;
        if (!(n4 > 0 && n5 > 0 || main.a.G.a)) {
            return;
        }
        if (this.i != null) {
            n3 = main.a.w % 10 > 2 ? 0 : 1;
            bl.b((en)object, this.i.aO, this.e + 14, this.f + n3, 0, cj.d);
        }
        if (this.J != 0) {
            n3 = main.a.w % 10 > 2 ? 0 : 1;
            bl.b((en)object, this.J, this.e + n6 / 2, this.f + this.g - 15 + n3, 0, cj.f);
        }
        bo.a((en)object, n4, n5, n6, n7, 0xFFFFFF, false);
        if (q != null) {
            ((en)object).e(n4, n5, n6, n7 - 16);
            ((en)object).a(0, -ae.q.d);
        }
        n3 = 0;
        int n8 = 0;
        if (this.u) {
            n3 = ((en)object).a();
            n8 = ((en)object).b();
            ((en)object).e(n4, n5 + 1, n6, n7 - 17);
            ((en)object).a(0, -v);
        }
        int n9 = -1;
        int n10 = 0;
        while (n10 < this.d.length) {
            if (this.d[n10].startsWith("--")) {
                ((en)object).a(0);
                ((en)object).d(n4 + 10, this.f + this.c + n10 * 12 + 6, n6 - 20, 1);
            } else {
                int n11;
                object2 = di.k;
                n2 = 2;
                Object object3 = this.d[n10];
                if (this.d[n10].startsWith("|")) {
                    String[] stringArray = ds.a(this.d[n10], "|", 0);
                    if (stringArray.length == 3) {
                        object3 = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object3 = stringArray[3];
                        n2 = Integer.parseInt(stringArray[2]);
                    }
                    n9 = n11 = Integer.parseInt(stringArray[1]);
                } else {
                    n11 = n9;
                }
                switch (n11) {
                    case -1: {
                        object2 = di.k;
                        break;
                    }
                    case 0: {
                        object2 = di.f;
                        break;
                    }
                    case 1: {
                        object2 = di.h;
                        break;
                    }
                    case 2: {
                        object2 = di.b;
                        break;
                    }
                    case 3: {
                        object2 = di.p;
                        break;
                    }
                    case 4: {
                        object2 = di.r;
                        break;
                    }
                    case 5: {
                        object2 = di.q;
                        break;
                    }
                    case 7: {
                        object2 = di.a;
                        break;
                    }
                    case 8: {
                        object2 = di.d;
                        break;
                    }
                    case 9: {
                        object2 = di.d;
                    }
                }
                if (this.d[n10].startsWith("<")) {
                    String[] stringArray = ds.a(this.d[n10], "<", 0);
                    object3 = ds.a(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object3[1]);
                    } else {
                        C = l.d();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object3 = String.valueOf(this.L) + " " + object3[2];
                    ((di)object2).a((en)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.t + 12, n2);
                } else {
                    if (n2 == 2) {
                        ((di)object2).a((en)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.t + 12, n2);
                    }
                    if (n2 == 1) {
                        ((di)object2).a((en)object, (String)object3, this.e + this.a - 5, this.f + this.c + n10 * 12 - this.t + 12, n2);
                    }
                }
            }
            ++n10;
        }
        if (this.u) {
            main.a.a((en)object);
            ((en)object).a(n3, n8);
        }
        if (this.p > 4) {
            this.N = (this.p + 1) / 2;
            this.M = this.p - this.N;
            int[] nArray = new int[this.p];
            object2 = new int[this.p];
            n2 = 0;
            while (n2 < this.N) {
                ((en)object).a(g.s, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + en.a(g.s), n5 + n7 - 17, 3);
                nArray[n2] = n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + en.a(g.s);
                object2[n2] = n5 + n7 - 17;
                ++n2;
            }
            n2 = 0;
            while (n2 < this.M) {
                ((en)object).a(g.s, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + en.a(g.s), n5 + n7 - 8, 3);
                nArray[this.N + n2] = n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + en.a(g.s);
                object2[this.N + n2] = n5 + n7 - 8;
                ++n2;
            }
            ds.b(String.valueOf(this.p) + "maxStarSlot");
            if (this.p >= 7) {
                int n12 = 7;
                while (n12 < this.p) {
                    if (this.r[n12]) {
                        ((en)object).a(g.u, nArray[n12], (int)object2[n12], 3);
                    }
                    ++n12;
                }
            }
            if (this.o > 0) {
                this.P = g.r;
                if (this.o >= this.N) {
                    this.O = this.o - this.N;
                    n2 = 0;
                    while (n2 < this.N) {
                        ((en)object).a(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + en.a(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < this.O) {
                        if (n2 + this.N >= s) {
                            this.P = g.t;
                        }
                        ((en)object).a(this.P, n4 + n6 / 2 - this.M * 20 / 2 + n2 * 20 + en.a(this.P), n5 + n7 - 8, 3);
                        ++n2;
                    }
                } else {
                    n2 = 0;
                    while (n2 < this.o) {
                        ((en)object).a(this.P, n4 + n6 / 2 - this.N * 20 / 2 + n2 * 20 + en.a(this.P), n5 + n7 - 17, 3);
                        ++n2;
                    }
                }
            }
        } else {
            n10 = 0;
            while (n10 < this.p) {
                ((en)object).a(g.s, n4 + n6 / 2 - this.p * 20 / 2 + n10 * 20 + en.a(g.s), n5 + n7 - 13, 3);
                ++n10;
            }
            if (this.o > 0) {
                n10 = 0;
                while (n10 < this.o) {
                    ((en)object).a(g.r, n4 + n6 / 2 - this.p * 20 / 2 + n10 * 20 + en.a(g.r), n5 + n7 - 13, 3);
                    ++n10;
                }
            }
        }
        en en2 = object;
        object = this;
        en2.a(-en2.a(), -en2.b());
        en2.e(0, 0, main.a.A, main.a.B);
        if (((ae)object).j != null) {
            cx.a(en2, null, ((ae)object).j, null);
        }
        if (((ae)object).k != null) {
            cx.a(en2, ((ae)object).k, null, ((ae)object).l);
        }
    }

    public final void a(en en2, int n2) {
        int n3 = this.e;
        int n4 = this.f;
        int n5 = this.a;
        int n6 = en2.a();
        int n7 = en2.b();
        en2.a(0, -n2);
        if (!(n3 > 0 && n4 > 0 || main.a.G.a)) {
            return;
        }
        n2 = -1;
        n4 = 0;
        while (n4 < this.d.length) {
            if (this.d[n4].startsWith("--")) {
                en2.a(0xFFFFFF);
                en2.d(n3 + 10, this.f + this.c + n4 * 12 - 6, n5 - 20, 1);
            } else {
                int n8;
                di di2 = di.s;
                int n9 = 2;
                Object object = this.d[n4];
                if (this.d[n4].startsWith("|")) {
                    String[] stringArray = ds.a(this.d[n4], "|", 0);
                    if (stringArray.length == 3) {
                        object = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object = stringArray[3];
                        n9 = Integer.parseInt(stringArray[2]);
                    }
                    n2 = n8 = Integer.parseInt(stringArray[1]);
                } else {
                    n8 = n2;
                }
                switch (n8) {
                    case -1: {
                        di2 = di.s;
                        break;
                    }
                    case 0: {
                        di2 = di.c;
                        break;
                    }
                    case 1: {
                        di2 = di.h;
                        break;
                    }
                    case 2: {
                        di2 = di.a;
                    }
                }
                if (this.d[n4].startsWith("<")) {
                    String[] stringArray = ds.a(this.d[n4], "<", 0);
                    object = ds.a(stringArray[1], ">", 1);
                    if (this.L == 0) {
                        this.L = Integer.parseInt(object[1]);
                    } else {
                        C = l.d();
                        if (C - D >= 1000L) {
                            D = C;
                            --this.L;
                        }
                    }
                    object = String.valueOf(this.L) + " " + object[2];
                    di2.a(en2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.t, n9);
                } else {
                    if (n9 == 2) {
                        di2.a(en2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.t, n9);
                    }
                    if (n9 == 1) {
                        di2.a(en2, (String)object, this.e + this.a - 5, this.f + this.c + n4 * 12 - this.t, n9);
                    }
                }
            }
            ++n4;
        }
        main.a.a(en2);
        en2.a(n6, n7);
    }

    private void a(int n2) {
        if ((v += n2 * 12) < 0) {
            v = 0;
        }
        if (v > this.h) {
            v = this.h;
        }
    }

    public final void b() {
        if (this.u) {
            if (main.a.i[8]) {
                main.a.i[8] = false;
                this.a(1);
            }
            if (main.a.i[2]) {
                main.a.i[2] = false;
                this.a(-1);
            }
            if (main.a.a(this.e, 0, this.a + 2, this.g)) {
                if (main.a.n) {
                    if (this.R == 0) {
                        this.R = main.a.q;
                    }
                    this.Q = this.R - main.a.q;
                    if (this.Q != 0) {
                        v += this.Q;
                        this.R = main.a.q;
                    }
                    if (v < 0) {
                        v = 0;
                    }
                    if (v > this.h) {
                        v = this.h;
                    }
                } else {
                    this.R = 0;
                    this.R = 0;
                }
            }
        }
        if (q != null) {
            if (main.a.e) {
                q.a();
            }
            if (main.a.j[2]) {
                ae.q.b -= 12;
                if (ae.q.b < 0) {
                    ae.q.b = 0;
                }
            }
            if (main.a.j[8]) {
                main.a.i[8] = false;
                ae.q.b += 12;
                if (ae.q.b > ae.q.l) {
                    ae.q.b = ae.q.l;
                }
            }
        }
        if (main.a.i[5] || bb.a(main.a.E.cn)) {
            main.a.i[5] = false;
            bb.cs = -1;
            if (this.j != null) {
                this.j.a();
            } else if (this.k != null) {
                this.k.a();
            } else if (this.l != null) {
                this.l.a();
            }
        }
        if (q != null && ae.q.m) {
            return;
        }
        if (this.k != null && (main.a.i[12] || main.a.i[5] || bb.a(this.k))) {
            main.a.i[12] = false;
            main.a.i[5] = false;
            main.a.l = false;
            main.a.m = false;
            this.k.a();
            bb.cs = -1;
        }
        if (this.l != null && (main.a.i[13] || bb.a(this.l))) {
            main.a.i[13] = false;
            main.a.l = false;
            main.a.m = false;
            this.l.a();
            bb.cs = -1;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            try {
                GameMidlet.f.platformRequest((String)object);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            GameMidlet.f.notifyDestroyed();
            main.a.h();
        }
        if (n2 == 1001) {
            q = null;
            af.x = null;
            n = null;
            p.aD.f = true;
            af.bH = false;
            if (I) {
                p.aD.b.e = 0;
                p.aD.b.b.b = 10;
            }
        }
        if (n2 == 8000) {
            if (K > 0) {
                return;
            }
            int n3 = ae.m.E;
            if (++n3 >= ae.m.F.length) {
                af.x = null;
                m = null;
                p.aD.f = true;
                af.bH = false;
                if (G != null) {
                    ae.b(G, 100000, H);
                    G = null;
                    H = null;
                    return;
                }
                if (I) {
                    p.aD.b.e = 0;
                    n2 = 0;
                    while (n2 < p.aD.b.a.size()) {
                        if (((r)p.aD.b.a.elementAt((int)n2)).b == 10000000) {
                            ((r)p.aD.b.a.elementAt((int)n2)).b = 10;
                        }
                        ++n2;
                    }
                }
                return;
            }
            ae ae2 = ae.c(ae.m.F[n3], ae.m.b, ae.m.i);
            ae.c(ae.m.F[n3], ae.m.b, ae.m.i).E = n3;
            ae2.F = ae.m.F;
            ae2.j = ae.m.j;
            m = ae2;
        }
    }
}

