/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class x
extends bb
implements b {
    public cd a;
    public cd b;
    public static boolean c = false;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s = false;
    private boolean t = false;
    private de u;
    private de v;
    private de w;
    private de x;
    private de y;
    private de z;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static String i;
    public static Image j;
    public static short k;
    public static long l;
    public static long m;
    private int A;
    private de B;
    private int C;
    private int D = main.a.D - 30;
    private int E;
    private int F = -1;
    public boolean n = false;
    private int G = 2;
    private int H = 0;
    private int I = -40;
    private int J = 1;
    private de K;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void b() {
        bu.a();
        this.a.e = true;
        this.b.e = false;
        if (main.a.e) {
            this.a.e = false;
        }
        main.a.a(0);
        this.cm = new de(aw.bA, this, 101, null);
        super.b();
    }

    public x() {
        int n2;
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        p.a(-1, -1);
        p.j = 100;
        p.k = 200;
        this.r = main.a.B > 200 ? main.a.D - 80 : main.a.D - 65;
        x x2 = this;
        this.q = -50;
        this.p = n2 = main.a.A >= 200 ? 160 : 140;
        this.A = main.a.D - bb.cp - 5;
        if (main.a.B <= 160) {
            this.A = 20;
        }
        this.a = new cd();
        this.a.b = main.a.D - bb.cp - 9;
        this.a.c = this.p;
        this.a.d = bb.cp + 2;
        this.a.e = true;
        this.a.c(0);
        this.a.i = String.valueOf(aw.fB == 2 ? "" : String.valueOf(aw.aj) + "/") + aw.ak;
        this.b = new cd();
        this.b.b = main.a.D - 4;
        this.b.c(2);
        this.b.c = this.p;
        this.b.d = bb.cp + 2;
        this.A += 35;
        this.s = true;
        n2 = eu.d(eu.g);
        if (n2 == 1) {
            this.s = true;
        } else if (n2 == 2) {
            this.s = false;
        }
        this.a.a(eu.c(eu.e));
        this.b.a(eu.c(eu.f));
        this.a.a((String)null);
        this.b.a((String)null);
        if (this.K == null) {
            this.K = new de("G\u1ecdi hotline", this, 13, null);
            this.K.j = main.a.A - 75;
            this.K.k = l.c == 1 && !main.a.e ? main.a.B - 20 : 8;
        }
        this.o = 0;
        this.u = new de(main.a.A > 200 ? aw.ax : aw.ay, main.a.h, 888393, null);
        new de(aw.bt, this, 2001, null);
        this.w = new de(aw.az, this, 2002, null);
        this.y = new de(aw.bv, this, 10021, null);
        this.z = new de(aw.bA, this, 101, null);
        this.cm = this.x = new de(aw.bi, this, 2003, null);
        if (main.a.e) {
            this.u.j = main.a.A / 2 + 8;
            this.x.j = main.a.A / 2 - bb.cq - 8;
            if (main.a.B >= 200) {
                this.u.k = this.D + 110;
                this.x.k = this.D + 110;
            }
            this.y.j = main.a.A / 2 + 3;
            this.y.k = this.D + 110;
            this.w.j = main.a.A / 2 - 84;
            this.w.k = this.x.k;
            this.z.j = 2;
            this.z.k = main.a.B - bb.cr;
        }
        this.E = 170;
        n2 = 184;
        if (184 >= main.a.A) {
            n2 = 152;
        }
        this.C = main.a.A / 2 - n2 / 2;
        this.D = main.a.D - 30;
        this.a.a = this.C + 10;
        this.a.b = this.D + 20;
        this.B = new de(aw.bs, this, 2008, null);
        this.B.j = main.a.A / 2 - 84;
        this.B.k = this.u.k;
        this.v = new de(aw.ac, this, 1003, null);
        this.v.j = main.a.A / 2 + 3;
        this.v.k = this.u.k;
        this.cn = this.B;
        this.cm = this.v;
    }

    public final void a() {
        ds.c("user ao= " + eu.c(String.valueOf(eu.d) + bs.n));
        String string = eu.c(eu.e);
        String string2 = eu.c(eu.f);
        this.n = (string == null || string.equals("")) && eu.c(String.valueOf(eu.d) + bs.n) != null && !eu.c(String.valueOf(eu.d) + bs.n).equals("");
        ds.c("isLogin 2= " + this.n);
        if ((string == null || string.equals("")) && this.n) {
            string = eu.c(String.valueOf(eu.d) + bs.n);
            string2 = "a";
        }
        ds.c("user = " + string + " pass= " + string2);
        if (string == null || string2 == null || string.equals("")) {
            return;
        }
        if (string2.equals("")) {
            this.o = 1;
            this.a.e = false;
            this.b.e = true;
            if (!main.a.e) {
                this.co = this.b.j;
            }
            return;
        }
        if (!br.a().d()) {
            main.a.b();
        }
        bt.a().a(string, string2, "2.5.0", this.n ? (byte)1 : 0);
        eu.a(bs.w, bs.n);
        if (br.a().d) {
            main.a.i();
        } else {
            main.a.a(String.valueOf(aw.x) + " [0]", 8884, null);
        }
        this.o = 0;
        if (!this.n) {
            this.h();
        }
        l.d();
    }

    public final void e() {
        if (this.s) {
            eu.a(eu.g, 1);
            eu.a(eu.e, this.a.d().toLowerCase().trim());
            eu.a(eu.f, this.b.d().toLowerCase().trim());
            return;
        }
        eu.a(eu.g, 2);
        eu.a(eu.e, "");
        eu.a(eu.f, "");
    }

    public final void c() {
        if (k > 0) {
            main.a.i();
            m = System.currentTimeMillis();
            if (m - l >= 1000L) {
                if ((k = (short)(k - 1)) == 0) {
                    main.a.I.a();
                }
                l = m;
            }
        }
        if (this.n && !this.t) {
            this.a.i = String.valueOf(aw.fB == 2 ? "" : String.valueOf(aw.aj) + "/") + aw.ak;
            this.b.i = aw.ad;
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
        } else {
            this.a.i = String.valueOf(aw.fB == 2 ? "" : String.valueOf(aw.aj) + "/") + aw.ak;
            this.b.i = aw.ad;
            this.a.c();
            this.b.c();
        }
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.a();
            ++n2;
        }
        if (!(!d || e || h || f || g)) {
            d = false;
            System.gc();
            bt.a().r();
        }
        if (++p.j > main.a.A * 3 + 100) {
            p.j = 100;
        }
        if (ae.m != null) {
            return;
        }
        x x2 = this;
        if (x2.r != x2.q) {
            x2.q += x2.r - x2.q >> 1;
        }
        if (this.H >= 0) {
            this.I += this.J * this.H;
            this.H += this.J * this.G;
            if (this.H <= 0) {
                this.J = -this.J;
            }
            if (this.I > 0) {
                this.J = -this.J;
                this.H -= 2 * this.G;
            }
        }
        if (this.F >= 0 && main.a.w % 100 == 0) {
            x2 = this;
            ++x2.F;
            if (x2.F >= aw.aY.length) {
                x2.F = 0;
            }
            if (main.a.K == main.a.L && main.a.L.a) {
                main.a.L.a(aw.aY[x2.F]);
            }
        }
        if (this.n && !this.t) {
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
        } else {
            this.a.i = String.valueOf(aw.fB == 2 ? "" : String.valueOf(aw.aj) + "/") + aw.ak;
            this.b.i = aw.ad;
            this.a.c();
            this.b.c();
        }
        if (main.a.e) {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.y;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
            if (this.z != null && this.z.c()) {
                this.z.a();
                return;
            }
        } else {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.y;
                return;
            }
            this.cn = this.B;
            this.cm = this.v;
        }
    }

    public final void a(int n2) {
        if (this.a.e) {
            this.a.a(n2);
        } else if (this.b.e) {
            this.b.a(n2);
        }
        super.a(n2);
    }

    public final void a(en en2) {
        main.a.c(en2);
        int n2 = this.a.b - 50;
        if (main.a.B <= 220) {
            n2 += 5;
        }
        di.s.a(en2, "v2.5.0", main.a.A - 2, 17, 1, di.o);
        if (l.c == 1 && !main.a.e) {
            di.s.a(en2, bs.l, main.a.A - 2, main.a.B - 15, 1, di.o);
        } else {
            di.s.a(en2, bs.l, main.a.A - 2, 2, 1, di.o);
        }
        if (main.a.K == null) {
            int n3 = main.a.A >= 200 ? 180 : 160;
            bo.a(en2, this.C, this.D - 10, n3, 105, -1, true);
            if (main.a.B > 160 && j != null) {
                en2.a(j, main.a.C, n2, 3);
            }
            n2 = 184;
            if (184 >= main.a.A) {
                n2 = 152;
            }
            this.C = main.a.A / 2 - n2 / 2;
            this.a.a = this.C + 10;
            this.a.b = this.D + 20;
            this.b.a = this.C + 10;
            this.b.b = this.D + 55;
            this.a.a(en2);
            this.b.a(en2);
            if (main.a.A < 176) {
                di.g.a(en2, String.valueOf(aw.al) + ":", this.a.a - 35, this.a.b + 7, 0);
                di.g.a(en2, String.valueOf(aw.am) + ":", this.b.a - 35, this.b.b + 7, 0);
                di.g.a(en2, String.valueOf(aw.aJ) + ": " + i, main.a.A / 2, this.b.b + 32, 2);
            }
        }
        super.a(en2);
        this.z.a(en2);
    }

    public final void d() {
        if (main.a.e && this.K != null && this.K.c()) {
            this.K.a();
        }
        if (c) {
            return;
        }
        if (!main.a.e) {
            this.co = this.a.e ? this.a.j : this.b.j;
        }
        if (main.a.i[2]) {
            --this.o;
            if (this.o < 0) {
                this.o = 1;
            }
        } else if (main.a.i[8]) {
            ++this.o;
            if (this.o > 1) {
                this.o = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.f();
            if (!this.n || this.t) {
                if (this.o == 1) {
                    this.a.e = false;
                    this.b.e = true;
                } else if (this.o == 0) {
                    this.a.e = true;
                    this.b.e = false;
                } else {
                    this.a.e = false;
                    this.b.e = false;
                }
            }
        }
        if (main.a.e) {
            if (this.t) {
                this.cn = this.w;
                this.cm = this.y;
            } else {
                this.cn = this.B;
                this.cm = this.v;
            }
        } else if (this.t) {
            this.cn = this.w;
            this.cm = this.y;
        } else {
            this.cn = this.B;
            this.cm = this.v;
        }
        if (main.a.m && (!this.n || this.t)) {
            if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
                this.o = 0;
            } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.o = 1;
            }
        }
        super.d();
        main.a.f();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 101: {
                main.a.ak.b();
                return;
            }
            case 13: {
                switch (l.c) {
                    case 1: {
                        l.b();
                        return;
                    }
                    case 3: 
                    case 5: {
                        return;
                    }
                    case 6: {
                        return;
                    }
                }
                return;
            }
            case 1000: {
                try {
                    GameMidlet.f.platformRequest((String)object);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                main.a.h();
                return;
            }
            case 1001: {
                main.a.h();
                this.t = false;
                return;
            }
            case 1002: {
                main.a.i();
                String string = eu.c("userAo" + bs.n);
                if (string == null || string.equals("")) {
                    bt.a().f("");
                    return;
                }
                main.a.I.n = true;
                main.a.b();
                bt.a().c();
                bt.a().a(string, "", "2.5.0", (byte)1);
                return;
            }
            case 1004: {
                bs.a();
                main.a.ak.b();
                return;
            }
            case 10021: {
                this.h();
                return;
            }
            case 1003: {
                main.a.a(aw.an);
                return;
            }
            case 1005: {
                try {
                    GameMidlet.f.platformRequest("http://ngocrongonline.com");
                    return;
                }
                catch (Exception exception) {
                    Exception exception3 = exception;
                    exception.printStackTrace();
                    return;
                }
            }
            case 10041: {
                eu.a("lowGraphic", 0);
                main.a.a(aw.cM, 8885, null);
                return;
            }
            case 10042: {
                eu.a("lowGraphic", 1);
                main.a.a(aw.cM, 8885, null);
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.s) {
                    this.s = false;
                    return;
                }
                this.s = true;
                return;
            }
            case 2002: {
                boolean bl2;
                x x2 = this;
                if (x2.a.d().equals("")) {
                    main.a.a(aw.U);
                    break;
                }
                x2.a.d().toCharArray();
                if (x2.b.d().equals("")) {
                    main.a.a(aw.V);
                    break;
                }
                if (x2.a.d().length() < 5) {
                    main.a.a(aw.W);
                    break;
                }
                object = null;
                if (aw.fB == 2) {
                    if (x2.a.d().indexOf("@") == -1 || x2.a.d().indexOf(".") == -1) {
                        object = aw.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(x2.a.d());
                        if (x2.a.d().length() < 8 || x2.a.d().length() > 12 || !x2.a.d().startsWith("0") && !x2.a.d().startsWith("84")) {
                            object = aw.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (x2.a.d().indexOf("@") == -1 || x2.a.d().indexOf(".") == -1) {
                            object = aw.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.a.a((String)object);
                } else {
                    main.a.L.a(String.valueOf(aw.ai) + (bl2 ? String.valueOf(aw.aj) + ": " : String.valueOf(aw.ak) + ": ") + x2.a.d() + "\n" + aw.ad + ": " + x2.b.d(), new de(aw.bu, x2, 4000, null), null, new de(aw.bo, main.a.h, 8882, null));
                }
                main.a.K = main.a.L;
                return;
            }
            case 2003: {
                x x3 = this;
                object = new el("vMenu Login");
                ((el)object).addElement(new de(aw.Z, x3, 2004, null));
                if (!x3.n) {
                    ((el)object).addElement(new de(aw.aa, x3, 1004, null));
                }
                ((el)object).addElement(new de(aw.ac, x3, 1003, null));
                ((el)object).addElement(new de(aw.aI, x3, 1005, null));
                int n3 = eu.d("lowGraphic");
                if (n3 == 1) {
                    ((el)object).addElement(new de(aw.bV, x3, 10041, null));
                } else {
                    ((el)object).addElement(new de(aw.bW, x3, 10042, null));
                }
                ((el)object).addElement(new de(aw.bp, main.a.h, 8885, null));
                main.a.F.a((el)object);
                return;
            }
            case 2004: {
                this.f();
                return;
            }
            case 2008: {
                eu.a(eu.e, this.a.d().trim());
                eu.a(eu.f, this.b.d().trim());
                if (bs.u) {
                    main.a.ak.b();
                    return;
                }
                main.a.ak.j();
                return;
            }
            case 4000: {
                object = this.a.d();
                x x4 = this;
                main.a.b(aw.aD);
                main.a.b();
                main.a.b(aw.J);
                bt bt2 = bt.a();
                String string = x4.b.d();
                String string2 = eu.c(String.valueOf(eu.d) + bs.n);
                eu.c("passAo");
                bt2.a((String)object, string, string2, "2.5.0");
                eu.a("acc", (String)object);
                eu.a(eu.f, x4.b.d());
            }
        }
    }

    private void h() {
        if (this.n) {
            this.a();
            return;
        }
        this.t = false;
        this.b.e = false;
        this.a.e = true;
        this.cm = this.x;
    }

    public final void f() {
        main.a.h();
        main.a.a(aw.fW);
        this.t = true;
        this.b.e = false;
        this.a.e = true;
    }

    public static void g() {
        l.d();
        if (main.a.I.n) {
            main.a.a(aw.fV, new de(aw.bn, main.a.G, 10019, null), new de(aw.bo, main.a.G, 10020, null));
            return;
        }
        ev.b = false;
        main.a.e();
    }
}

