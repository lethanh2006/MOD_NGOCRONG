/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ev
extends bb
implements b {
    private int c = 0;
    private el d = new el("");
    private de e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private de k;
    private de l;
    private static String m = "area_select";
    private boolean n;
    public boolean a;
    private bh o;
    private byte p = 0;
    private byte q = 0;
    private byte r = 0;
    private de s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V = 15;
    private String[] W;
    private String[] X;
    private String[] Y;
    private String Z;
    private static Image[] aa;
    public static boolean b;

    public final void b() {
        bu.a();
        super.b();
        if (aa == null) {
            aa = new Image[3];
            int n2 = 0;
            while (n2 < aa.length) {
                ev.aa[n2] = l.b("/iconHead_" + n2 + ".png");
                ++n2;
            }
        }
        this.c = bs.n;
        this.i = 1;
        this.j = 1;
        ev ev2 = this;
        if (main.a.e) {
            if (eu.b(m) == null) {
                ev2.n = true;
                ev2.s = new de(aw.bs, ev2, 999, null);
                ev2.s.j = main.a.C - 38;
                ev2.s.k = main.a.D + 50;
                ev2.d = new el("");
                ev2.d.addElement(ev2.s);
                ev2.O = main.a.D - 30;
                ev2.P = 70;
                ev2.Q = 20;
            } else {
                ev2.n = false;
                ev2.g();
                ev2.a((int)ev2.p, (int)ev2.r);
            }
        }
        if (!this.a && !this.n) {
            this.k = new de(this.W[0], this, 98, null);
            this.k.j = 0;
            this.k.k = 0;
            this.l = new de(this.W[1], this, 97, null);
            this.l.j = 50;
            this.l.k = 0;
            this.d = new el("");
            this.d.addElement(this.k);
            this.d.addElement(this.l);
            this.a();
        }
    }

    public ev() {
        String[] stringArray = new String[]{"Ti\u1ebfng Vi\u1ec7t", "English", "Indo"};
        this.W = new String[]{"VI\u1ec6T NAM", "GLOBAL"};
        this.X = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n", "M\u00e1y ch\u1ee7 Super"};
        this.Y = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n:\nTi\u1ebfn tr\u00ecnh game b\u00ecnh th\u01b0\u1eddng.", "M\u00e1y ch\u1ee7 Super:\n -Kh\u00f4ng th\u1ec3 giao d\u1ecbch v\u00e0ng.\n x3 S\u1ee9c m\u1ea1nh\n x3 Ti\u1ec1m n\u0103ng\n x3 V\u00e0ng\n x3 V\u1eadt ph\u1ea9m kh\u00e1c"};
        this.Z = "Ch\u1ec9 hi\u1ec7n th\u1ecb m\u00e1y ch\u1ee7 \u0111\u00e3 ch\u01a1i.";
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        bv.o = by2;
        if (by2 == 5 || bv.o == 6) {
            bv.o = 4;
        }
        p.a(-1, -1);
        p.j = 100;
        p.k = 200;
    }

    private void a() {
        this.c = bs.n;
        this.h = 5;
        this.f = 90;
        this.g = bb.cr;
        this.i = 2;
        if (this.d.size() > 2) {
            this.i = main.a.A / (this.f + this.h);
        }
        this.j = this.d.size() / this.i + (this.d.size() % this.i == 0 ? 0 : 1);
        int n2 = 0;
        while (n2 < this.d.size()) {
            de de2 = (de)this.d.elementAt(n2);
            if (de2 != null) {
                int n3 = main.a.C - this.i * (this.f + this.h) / 2;
                int n4 = main.a.D - this.j * (this.g + this.h) / 2;
                de2.j = n3 += n2 % this.i * (this.f + this.h);
                de2.k = n4 += n2 / this.i * (this.g + this.h);
                de2.l = this.f;
            }
            ++n2;
        }
    }

    public final void c() {
        if (++p.j > main.a.A * 3 + 100) {
            p.j = 100;
        }
        if (!this.a) {
            int n2 = 0;
            while (n2 < this.d.size()) {
                de de2 = (de)this.d.elementAt(n2);
                if (!main.a.e) {
                    if (n2 == this.c) {
                        de2.n = main.a.w % 10 < 4;
                        this.cn = this.e = new de(aw.bw, this, de2.e, null);
                    } else {
                        de2.n = false;
                    }
                } else if (de2 != null && de2.c()) {
                    ds.c("sellllect      " + this.c + "   " + de2.b);
                    de2.a();
                }
                ++n2;
            }
        }
        this.e();
        this.f();
        bs.e();
    }

    public final void a(en en2) {
        main.a.c(en2);
        if (this.n) {
            en en3 = en2;
            ev ev2 = this;
            if (ev2.n) {
                ev2.a(en3, main.a.C - ev2.P / 2, ev2.O);
                ev2.s.a(en3);
            }
        } else if (this.a) {
            en en4 = en2;
            ev ev3 = this;
            if (ev3.a) {
                int n2;
                en4.a(14601141);
                en4.d(ev3.u, ev3.v, ev3.w, ev3.x);
                bo.a(en4, ev3.y - 50, ev3.z, 100, 20, 0, true);
                di.f.a(en4, aw.ab, ev3.y, ev3.z + 5, 2);
                int n3 = 0;
                while (n3 < ev3.R) {
                    n2 = ev3.H + n3 * (ev3.J + 5);
                    bo.a(en4, ev3.G, n2, ev3.I, ev3.J, ev3.r == n3 ? 1 : 0, true);
                    di.f.a(en4, ev3.X[n3], ev3.G + ev3.I / 2, n2 + 5, 2);
                    ++n3;
                }
                en4.a(10254674);
                en4.d(ev3.K, ev3.L, ev3.M, ev3.N);
                Object object = di.k.a(ev3.Y[ev3.r], ev3.M - 10);
                n2 = 0;
                while (n2 < ((String[])object).length) {
                    di.s.a(en4, object[n2], ev3.K + 5, ev3.L + 5 + n2 * 11, 0);
                    ++n2;
                }
                Object object2 = en4;
                object = ev3;
                int n4 = object.K;
                int n5 = object.L + object.N + 2;
                ((en)object2).a(0xFFFFFF);
                ((en)object2).d(n4, n5, object.S, object.S);
                if (b) {
                    ((en)object2).a(3329330);
                    ((en)object2).d(n4 + 1, n5 + 1, object.S - 2, object.S - 2);
                }
                di.f.a((en)object2, object.Z, n4 + object.S + 2, n5, 0);
                ev3.a(en4, 10, ev3.O);
                en4.a(10254674);
                en4.d(ev3.A, ev3.B, ev3.C, ev3.D);
                en4.e(ev3.A, ev3.B, ev3.C, ev3.D);
                en4.a(0, -ev3.o.b);
                int n6 = 0;
                while (n6 < ev3.d.size()) {
                    object2 = (de)ev3.d.elementAt(n6);
                    if (object2 != null) {
                        ((de)object2).a(en4);
                        if (((de)object2).r && main.a.w % 10 > 1) {
                            en4.a(g.v, ((de)object2).j + 60, ((de)object2).k, 0);
                        }
                    }
                    ++n6;
                }
                main.a.a(en4);
            }
        } else {
            int n7 = 0;
            while (n7 < this.d.size()) {
                if (this.d.elementAt(n7) != null) {
                    ((de)this.d.elementAt(n7)).a(en2);
                }
                ++n7;
            }
        }
        super.a(en2);
    }

    public final void d() {
        super.d();
        int n2 = this.c % this.i;
        int n3 = this.c / this.i;
        if (main.a.i[4]) {
            if (n2 > 0) {
                --this.c;
            }
            main.a.i[4] = false;
        } else if (main.a.i[6]) {
            if (n2 < this.i - 1) {
                ++this.c;
            }
            main.a.i[6] = false;
        } else if (main.a.i[2]) {
            if (n3 > 0) {
                this.c -= this.i;
            }
            main.a.i[2] = false;
        } else if (main.a.i[8]) {
            System.out.println("-----------vo mainSelect: " + this.c);
            if (n3 < this.j - 1) {
                this.c += this.i;
            }
            main.a.i[8] = false;
        }
        if (this.c < 0) {
            this.c = 0;
        }
        if (this.c >= this.d.size()) {
            this.c = this.d.size() - 1;
        }
        if (main.a.i[5]) {
            ((de)this.d.elementAt(n2)).a();
            main.a.i[5] = false;
        }
        main.a.f();
    }

    public final void a(int n2, Object object) {
        block12: {
            ds.c("perform trong ServerScr:" + n2);
            switch (n2) {
                case 999: {
                    ev ev2 = this;
                    byte[] byArray = new byte[2];
                    object = byArray;
                    byArray[0] = ev2.p;
                    object[1] = ev2.q;
                    eu.a(m, (byte[])object);
                    this.a((int)this.p, 0);
                    return;
                }
                case 97: {
                    if (!this.a) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < bs.a.length) {
                            if (bs.d[n2] != 0) {
                                this.d.addElement(new de(bs.a[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.a();
                        return;
                    }
                    break block12;
                }
                case 98: {
                    if (!this.a) {
                        this.d.removeAllElements();
                        n2 = 0;
                        while (n2 < bs.a.length) {
                            if (bs.d[n2] == 0) {
                                this.d.addElement(new de(bs.a[n2], this, n2 + 100, null));
                            }
                            ++n2;
                        }
                        this.a();
                        return;
                    }
                    break block12;
                }
                case 99: {
                    br.a().c();
                    bs.a(this.c, false);
                    break;
                }
                default: {
                    br.a().e();
                    bs.a(n2 - 100, true);
                    bs.k();
                    if (main.a.ak != null) break;
                    main.a.ak = new bs();
                }
            }
            main.a.ak.i();
            main.a.ak.b();
        }
    }

    private void a(int n2, int n3) {
        this.n = false;
        if (l.c != 1) {
            this.a = true;
        }
        this.S = 10;
        this.w = main.a.A / 3 << 1;
        this.x = main.a.B / 3 << 1;
        this.u = (main.a.A - this.w) / 2;
        this.v = (main.a.B - this.x) / 2 + 20;
        this.y = main.a.A / 2;
        this.z = this.v - 30;
        this.C = this.w / 3 << 1;
        this.I = this.w - this.C - 15;
        if (this.I < 80) {
            this.I = 80;
            this.C = this.w - this.I - 15;
        }
        this.D = this.x - 10 - this.S;
        this.A = this.u + this.w - this.C - 5;
        this.B = this.v + 5;
        this.G = this.u + 5;
        this.H = this.v + 5;
        this.J = 20;
        this.K = this.u + 5;
        this.L = this.v + this.X.length * (this.J + 5) + 5;
        this.M = this.I;
        this.N = this.x - (5 + this.X.length * (this.J + 5) + 5) - this.S;
        this.O = 10;
        this.P = 70;
        this.Q = 20;
        this.a((byte)n2, (byte)n3);
    }

    private void a(byte by2, byte by3) {
        de de2;
        int n2;
        this.d.removeAllElements();
        this.R = 1;
        this.p = by2;
        aw.a(by2);
        int n3 = 0;
        while (n3 < bs.a.length) {
            if (by2 == 1) {
                if (bs.d[n3] != 0 && bs.h[n3] == 1) {
                    this.R = 2;
                }
            } else if (bs.h[n3] == 1) {
                this.R = 2;
            }
            ++n3;
        }
        if (by3 > (byte)(this.R - 1)) {
            by3 = (byte)(this.R - 1);
        }
        this.r = by3;
        n3 = 0;
        while (n3 < bs.a.length) {
            if (by2 == 1) {
                if (bs.d[n3] != 0) {
                    if (bs.h[n3] == 1) {
                        this.R = 2;
                    }
                    if (bs.h[n3] == by3) {
                        n2 = -1;
                        if (bs.e != null && n3 < bs.e.length) {
                            n2 = bs.e[n3];
                        }
                        if (!b || n2 != -1) {
                            de2 = new de(bs.a[n3], this, n3 + 100, null);
                            boolean bl2 = new de(bs.a[n3], this, n3 + 100, null).r = bs.i[n3] == 1;
                            if (n2 >= 0) {
                                de2.i = aa[n2];
                            }
                            this.d.addElement(de2);
                        }
                    }
                }
            } else {
                if (bs.h[n3] == 1) {
                    this.R = 2;
                }
                if (bs.d[n3] == 0 && bs.h[n3] == by3) {
                    n2 = -1;
                    if (bs.e != null && n3 < bs.e.length) {
                        n2 = bs.e[n3];
                    }
                    if (!b || n2 != -1) {
                        de2 = new de(bs.a[n3], this, n3 + 100, null);
                        boolean bl3 = new de(bs.a[n3], this, n3 + 100, null).r = bs.i[n3] == 1;
                        if (n2 >= 0) {
                            de2.i = aa[n2];
                        }
                        this.d.addElement(de2);
                    }
                }
            }
            ++n3;
        }
        ev ev2 = this;
        by3 = 0;
        while (by3 < ev2.d.size() - 1) {
            de de3 = (de)ev2.d.elementAt(by3);
            n2 = by3 + 1;
            while (n2 < ev2.d.size()) {
                de2 = (de)ev2.d.elementAt(n2);
                if (de2.r && !de3.r) {
                    de de4 = de2;
                    de2 = de3;
                    de3 = de4;
                    ev2.d.setElementAt(de3, by3);
                    ev2.d.setElementAt(de2, n2);
                }
                ++n2;
            }
            by3 = (byte)(by3 + 1);
        }
        ev2 = this;
        this.c = bs.n;
        ev2.h = 5;
        ev2.f = 76;
        ev2.g = bb.cr;
        ev2.i = 1;
        by3 = (byte)(ev2.A + ev2.C / 2 + 3);
        ev2.F = ev2.B + 5;
        ev2.i = ev2.C / (ev2.f + ev2.h);
        if (ev2.i <= 0) {
            ev2.i = 1;
        }
        ev2.j = ev2.d.size() / ev2.i + (ev2.d.size() % ev2.i == 0 ? 0 : 1);
        ev2.E = by3 - ev2.i * (ev2.f + ev2.h) / 2;
        int n4 = 0;
        while (n4 < ev2.d.size()) {
            de de5 = (de)ev2.d.elementAt(n4);
            if (de5 != null) {
                int n5 = ev2.E + n4 % ev2.i * (ev2.f + ev2.h);
                int n6 = ev2.F + n4 / ev2.i * (ev2.g + ev2.h);
                de5.j = n5;
                de5.k = n6;
                de5.l = ev2.f;
            }
            ++n4;
        }
        ev2.o = new bh(ev2.A, ev2.B, ev2.C, ev2.D, 0, 0, 0, true);
        n4 = ev2.j * (ev2.g + ev2.h) - ev2.D;
        bh bh2 = ev2.o;
        if (n4 < 0) {
            n4 = 0;
        }
        bh2.c = n4;
        if (bh2.b > bh2.c) {
            bh2.b = bh2.c;
        }
        if (bh2.a > bh2.c) {
            bh2.a = bh2.c;
        }
        bh2 = ev2.o;
        ev2.o.a = 0;
    }

    private void a(en en2, int n2, int n3) {
        this.T = n2 -= 5;
        bo.a(en2, n2, n3, this.P, this.Q, 0, true);
        di.f.a(en2, this.W[this.p], n2 + (this.P - 10) / 2, n3 + 5, 2);
        en2.a(aa.R, 0, 30, 9, 6, 0, n2 + this.P - 10, n3 + 14, 33);
        if (this.t) {
            this.U = n3 + this.Q + 5;
            en2.a(10254674);
            en2.d(n2, this.U, this.P, this.W.length * this.V + 1);
            n3 = 0;
            while (n3 < this.W.length) {
                di.s.a(en2, this.W[n3], n2 + this.P / 2, this.U + n3 * this.V + 2, 2);
                if (this.p == n3) {
                    en2.a(15591444);
                    en2.c(n2 + 2, this.U + n3 * this.V + 1, this.P - 4, this.V - 2);
                }
                ++n3;
            }
        }
    }

    private void e() {
        int n2;
        byte by2;
        if (!this.a) {
            return;
        }
        int n3 = 0;
        if (this.o != null) {
            this.o.b();
            if (main.a.b(this.A, 0, this.C, main.a.B)) {
                this.o.a();
            }
            n3 = this.o.b;
        }
        if (main.a.b(this.A, this.B, this.C, this.D)) {
            by2 = (main.a.p - this.E) / (this.f + this.h) + (main.a.q - this.F + n3) / (this.g + this.h) * this.i;
            n2 = this.d.size();
            if (by2 >= 0 && by2 < n2) {
                this.c = by2;
                by2 = 0;
                while (by2 < this.d.size()) {
                    de de2 = (de)this.d.elementAt(by2);
                    if (de2 != null) {
                        if (by2 == this.c) {
                            if (de2.a(0, n3)) {
                                de2.a();
                            }
                        } else {
                            de2.n = false;
                        }
                    }
                    ++by2;
                }
            }
        }
        if (main.a.b(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && main.a.m) {
            b = !b;
            this.a(this.p, this.r);
        }
        if (this.R == 1) {
            return;
        }
        by2 = 0;
        while (by2 < this.R) {
            n2 = this.H + by2 * (this.J + 5);
            if (main.a.a(this.G, n2, this.I, this.J) && main.a.k) {
                this.a(this.p, by2);
                return;
            }
            by2 = (byte)(by2 + 1);
        }
    }

    private void f() {
        if (main.a.b(this.T, this.O, this.P, this.Q) && main.a.m) {
            this.t = !this.t;
            main.a.m = false;
        }
        if (this.t) {
            int n2 = 0;
            while (n2 < this.W.length) {
                int n3 = this.U + n2 * this.V;
                if (main.a.a(this.T, n3, this.P, this.V) && main.a.k) {
                    if (this.n) {
                        this.p = (byte)n2;
                    } else {
                        this.a(n2, (int)this.r);
                    }
                    this.t = false;
                    return;
                }
                n2 = (byte)(n2 + 1);
            }
        }
    }

    private void g() {
        byte[] byArray = eu.b(m);
        try {
            this.p = byArray[0];
            this.q = byArray[1];
            return;
        }
        catch (Exception exception) {
            this.q = 0;
            this.p = 0;
            return;
        }
    }
}

