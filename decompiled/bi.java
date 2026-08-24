/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.a;

public final class bi
extends bb
implements b {
    private cd a;
    private cd b;
    private cd c;
    private cd d;
    private cd e;
    private cd f;
    private cd g;
    private cd h;
    private cd i;
    private static boolean j = false;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    private boolean o = false;
    private de p;
    private de q;
    private de r;
    private de s;
    private de t;
    private int u;
    private de v;
    private int w;
    private int x = 130;
    private int y;
    private int z = -1;
    private boolean A = false;
    private int B = 2;
    private int C = 0;
    private int D = -40;
    private int E = 1;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void b() {
        System.out.println("Res switch");
        bu.a();
        this.a.e = true;
        this.b.e = false;
        if (main.a.e) {
            this.a.e = false;
        }
        super.b();
    }

    public bi(byte by2) {
        byte by3 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by3;
        if (by3 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        p.a(-1, -1);
        p.j = 100;
        p.k = 200;
        this.m = main.a.B > 200 ? main.a.D - 80 : main.a.D - 65;
        bi bi2 = this;
        this.l = -50;
        this.u = main.a.D - bb.cp - 5;
        if (main.a.B <= 160) {
            this.u = 20;
        }
        this.i = new cd();
        this.i.c(1);
        this.i.c = 220;
        this.i.d = bb.cp + 2;
        this.i.i = "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i";
        if (by2 == 1) {
            this.i.a("01234567890");
        }
        this.a = new cd();
        this.a.c = 220;
        this.a.d = bb.cp + 2;
        this.a.e = true;
        this.a.i = "H\u1ecd v\u00e0 t\u00ean";
        if (by2 == 1) {
            this.a.a("Nguy\u1ec5n V\u0103n A");
        }
        this.a.c(0);
        this.b = new cd();
        this.b.c(1);
        this.b.c = 70;
        this.b.d = bb.cp + 2;
        this.b.i = "Ng\u00e0y sinh";
        if (by2 == 1) {
            this.b.a("01");
        }
        this.c = new cd();
        this.c.c(1);
        this.c.c = 70;
        this.c.d = bb.cp + 2;
        this.c.i = "Th\u00e1ng sinh";
        if (by2 == 1) {
            this.c.a("01");
        }
        this.d = new cd();
        this.d.c(1);
        this.d.c = 70;
        this.d.d = bb.cp + 2;
        this.d.i = "N\u0103m sinh";
        if (by2 == 1) {
            this.d.a("1980");
        }
        this.e = new cd();
        this.e.c(0);
        this.e.c = 220;
        this.e.d = bb.cp + 2;
        this.e.i = "\u0110\u1ecba ch\u1ec9 \u0111\u0103ng k\u00fd th\u01b0\u1eddng tr\u00fa";
        if (by2 == 1) {
            this.e.a("123 \u0111\u01b0\u1eddng s\u1ed1 1, Qu\u1eadn 1, TP.HCM");
        }
        this.f = new cd();
        this.f.c(1);
        this.f.c = 220;
        this.f.d = bb.cp + 2;
        this.f.i = "S\u1ed1 Ch\u1ee9ng minh nh\u00e2n d\u00e2n ho\u1eb7c s\u1ed1 h\u1ed9 chi\u1ebfu";
        if (by2 == 1) {
            this.f.a("123456789");
        }
        this.g = new cd();
        this.g.c(0);
        this.g.c = 220;
        this.g.d = bb.cp + 2;
        this.g.i = "Ng\u00e0y c\u1ea5p";
        if (by2 == 1) {
            this.g.a("01/01/1990");
        }
        this.h = new cd();
        this.h.c(0);
        this.h.c = 220;
        this.h.d = bb.cp + 2;
        this.h.i = "N\u01a1i c\u1ea5p";
        if (by2 == 1) {
            this.h.a("TP.HCM");
        }
        this.u += 35;
        this.n = true;
        this.k = 0;
        this.p = new de(main.a.A > 200 ? aw.ax : aw.ay, main.a.h, 888393, null);
        new de(aw.bt, this, 2001, null);
        this.r = new de(aw.az, this, 2002, null);
        this.t = new de(aw.bv, this, 10021, null);
        this.cm = this.s = new de(aw.bi, this, 2003, null);
        if (main.a.e) {
            this.p.j = main.a.A / 2 - 100;
            this.s.j = main.a.A / 2 - bb.cq - 8;
            if (main.a.B >= 200) {
                this.p.k = main.a.B / 2 - 40;
                this.s.k = this.x + 110;
            }
            this.t.j = main.a.A / 2 + 3;
            this.t.k = this.x + 110;
            this.r.j = main.a.A / 2 - 84;
            this.r.k = this.s.k;
        }
        this.y = 170;
        by2 = (byte)184;
        if (184 >= main.a.A) {
            by2 = (byte)152;
        }
        this.w = main.a.A / 2 - by2 / 2;
        this.x = 5;
        this.a.a = this.w + 10;
        this.a.b = this.x + 20;
        this.v = new de(aw.bs, this, 2008, null);
        this.v.j = 260;
        this.v.k = main.a.B - 60;
        this.q = new de("Tho\u00e1t", this, 1003, null);
        this.q.j = 260;
        this.q.k = main.a.B - 30;
        this.v.j = main.a.A / 2 - 80;
        this.q.j = main.a.A / 2 + 10;
        this.q.k = this.v.k = main.a.B - 25;
        this.cn = this.v;
        this.cm = this.q;
    }

    public final void c() {
        this.a.c();
        this.i.c();
        this.b.c();
        this.c.c();
        this.d.c();
        int n2 = 0;
        while (n2 < dc.x.size()) {
            dc dc2 = (dc)dc.x.elementAt(n2);
            dc2.a();
            ++n2;
        }
        if (++p.j > main.a.A * 3 + 100) {
            p.j = 100;
        }
        if (ae.m != null) {
            return;
        }
        bi bi2 = this;
        if (bi2.m != bi2.l) {
            bi2.l += bi2.m - bi2.l >> 1;
        }
        if (this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if (this.C <= 0) {
                this.E = -this.E;
            }
            if (this.D > 0) {
                this.E = -this.E;
                this.C -= 2 * this.B;
            }
        }
        if (this.z >= 0 && main.a.w % 100 == 0) {
            bi2 = this;
            ++bi2.z;
            if (bi2.z >= aw.aY.length) {
                bi2.z = 0;
            }
            if (main.a.K == main.a.L && main.a.L.a) {
                main.a.L.a(aw.aY[bi2.z]);
            }
        }
        if (main.a.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.t;
                return;
            }
            this.cn = this.v;
            this.cm = this.q;
            return;
        }
        if (this.o) {
            this.cn = this.r;
            this.cm = this.t;
            return;
        }
        this.cn = this.v;
        this.cm = this.q;
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
        if (ae.m != null) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (main.a.K == null) {
            this.w = main.a.C - 120;
            this.x = (main.a.B - 110) / 2;
            bo.a(en2, this.w, this.x, 240, 110, -1, true);
            this.a.a = this.w + 10;
            this.a.b = this.x + 15;
            this.i.a = this.a.a;
            this.i.b = this.a.b + 30;
            this.b.a = this.w + 10;
            this.b.b = this.i.b + 30;
            this.c.a = this.b.a + 75;
            this.c.b = this.b.b;
            this.d.a = this.c.a + 75;
            this.d.b = this.c.b;
            di.i.a(en2, "C\u1eadp nh\u1eadt th\u00f4ng tin", main.a.C, this.x + 2, 2);
            this.a.a(en2);
            this.i.a(en2);
            this.b.a(en2);
            this.c.a(en2);
            this.d.a(en2);
        }
        main.a.a(en2);
        String string = "2.5.0";
        en2.a(main.a.O);
        en2.d(main.a.A - 40, 4, 36, 11);
        di.o.a(en2, string, main.a.A - 22, 4, 2);
        en2.a(main.a.ah, 10, 10, 0);
        super.a(en2);
    }

    public final void d() {
        if (!main.a.e) {
            this.co = this.a.e ? this.a.j : this.b.j;
        }
        if (main.a.i[2]) {
            --this.k;
            if (this.k < 0) {
                this.k = 1;
            }
        } else if (main.a.i[8]) {
            ++this.k;
            if (this.k > 1) {
                this.k = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.f();
            if (this.k == 1) {
                this.a.e = false;
                this.b.e = true;
            } else if (this.k == 0) {
                this.a.e = true;
                this.b.e = false;
            } else {
                this.a.e = false;
                this.b.e = false;
            }
        }
        if (main.a.e) {
            if (this.o) {
                this.cn = this.r;
                this.cm = this.t;
            } else {
                this.cn = this.v;
                this.cm = this.q;
            }
        } else if (this.o) {
            this.cn = this.r;
            this.cm = this.t;
        } else {
            this.cn = this.v;
            this.cm = this.q;
        }
        if (main.a.m) {
            if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
                this.k = 0;
            } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.k = 1;
            }
        }
        super.d();
        main.a.f();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
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
                this.o = false;
                return;
            }
            case 1002: {
                return;
            }
            case 1004: {
                bs.a();
                main.a.ak.b();
                return;
            }
            case 10021: {
                bi bi2 = this;
                this.o = false;
                bi2.b.e = false;
                bi2.a.e = true;
                bi2.cm = bi2.s;
                return;
            }
            case 1003: {
                main.a.ak.b();
                br.a().e();
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
                return;
            }
            case 10042: {
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.n) {
                    this.n = false;
                    return;
                }
                this.n = true;
                return;
            }
            case 2002: {
                boolean bl2;
                bi bi3 = this;
                if (bi3.a.d().equals("")) {
                    main.a.a(aw.U);
                    break;
                }
                bi3.a.d().toCharArray();
                if (bi3.b.d().equals("")) {
                    main.a.a(aw.V);
                    break;
                }
                if (bi3.a.d().length() < 5) {
                    main.a.a(aw.W);
                    break;
                }
                object = null;
                if (aw.fB == 2) {
                    if (bi3.a.d().indexOf("@") == -1 || bi3.a.d().indexOf(".") == -1) {
                        object = aw.Y;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(bi3.a.d());
                        if (bi3.a.d().length() < 8 || bi3.a.d().length() > 12 || !bi3.a.d().startsWith("0") && !bi3.a.d().startsWith("84")) {
                            object = aw.X;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (bi3.a.d().indexOf("@") == -1 || bi3.a.d().indexOf(".") == -1) {
                            object = aw.Y;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.a.a((String)object);
                } else {
                    main.a.L.a(String.valueOf(aw.ai) + (bl2 ? String.valueOf(aw.aj) + ": " : String.valueOf(aw.ak) + ": ") + bi3.a.d() + "\n" + aw.ad + ": " + bi3.b.d(), new de(aw.bu, bi3, 4000, null), null, new de(aw.bo, main.a.h, 8882, null));
                }
                main.a.K = main.a.L;
                return;
            }
            case 2003: {
                bi bi4 = this;
                object = new el("vMenu Login");
                ((el)object).addElement(new de(aw.Z, bi4, 2004, null));
                ((el)object).addElement(new de(aw.aa, bi4, 1004, null));
                ((el)object).addElement(new de(aw.ac, bi4, 1003, null));
                ((el)object).addElement(new de(aw.aI, bi4, 1005, null));
                int n3 = eu.d("lowGraphic");
                if (n3 == 1) {
                    ((el)object).addElement(new de(aw.bV, bi4, 10041, null));
                } else {
                    ((el)object).addElement(new de(aw.bW, bi4, 10042, null));
                }
                ((el)object).addElement(new de(aw.bp, main.a.h, 8885, null));
                main.a.F.a((el)object);
                return;
            }
            case 2004: {
                bi bi5 = this;
                main.a.h();
                main.a.a(aw.fW);
                bi5.o = true;
                bi5.b.e = false;
                bi5.a.e = true;
                return;
            }
            case 2008: {
                if (this.b.d().equals("") || this.c.d().equals("") || this.d.d().equals("") || this.i.d().equals("") || this.a.d().equals("")) {
                    main.a.a("Vui l\u00f2ng \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin");
                    return;
                }
                main.a.a(aw.aC);
                bt.a().a(this.b.d(), this.c.d(), this.d.d(), "", "", "", "", this.i.d(), this.a.d());
            }
        }
    }
}

