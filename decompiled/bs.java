/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.GameMidlet;
import main.a;

public final class bs
extends bb
implements b {
    public static String[] a;
    private static String[] x;
    public static byte b;
    private static short[] y;
    private static int z;
    public static boolean c;
    public static byte[] d;
    public static byte[] e;
    public static af[] f;
    public static boolean g;
    private de[] A;
    private de B;
    private int C;
    public static byte[] h;
    public static byte[] i;
    private static String D;
    private static String E;
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    public static String j;
    public static boolean k;
    public static String l;
    public static boolean m;
    private static int J;
    private static long K;
    private static String L;
    public static int n;
    public static boolean o;
    public static int p;
    public static int q;
    public static int r;
    public static boolean s;
    private static de M;
    public static int t;
    public static boolean u;
    public static boolean v;
    public static String w;
    private static String N;

    static {
        D = "V\u0169 tr\u1ee5 1:dragon1.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 2:dragon2.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 3:dragon3.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 4:dragon4.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 5:dragon5.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 6:dragon6.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 7:dragon7.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 8:dragon10.teamobi.com:14446:0:0:0,V\u0169 tr\u1ee5 9:dragon10.teamobi.com:14447:0:0:0,V\u0169 tr\u1ee5 10:dragon10.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 11:dragon11.teamobi.com:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:14445:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
        E = "V\u0169 tr\u1ee5 1:112.213.94.23:14445:0:0:0,V\u0169 tr\u1ee5 2:210.211.109.199:14445:0:0:0,V\u0169 tr\u1ee5 3:112.213.85.88:14445:0:0:0,V\u0169 tr\u1ee5 4:27.0.12.164:14445:0:0:0,V\u0169 tr\u1ee5 5:27.0.12.16:14445:0:0:0,V\u0169 tr\u1ee5 6:27.0.12.173:14445:0:0:0,V\u0169 tr\u1ee5 7:112.213.94.223:14445:0:0:0,V\u0169 tr\u1ee5 8:27.0.14.66:14446:0:0:0,V\u0169 tr\u1ee5 9:27.0.14.66:14447:0:0:0,V\u0169 tr\u1ee5 10:27.0.14.66:14445:0:0:0,V\u0169 tr\u1ee5 11:112.213.85.35:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:14445:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
        F = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
        G = "Naga:52.74.230.22:14446:2:0:0,2,0";
        H = "Universe 1:dragon.indonaga.com:14445:1:0:0,1,0";
        I = "Universe 1:52.74.230.22:14445:1:0:0,1,0";
        j = E;
        L = "NRlink3";
        s = false;
        t = -1;
        v = true;
        w = "svselect";
        N = "NRlink_extra";
    }

    public bs() {
        System.getProperty("com.sonyericsson.imei");
        this.n();
        if (!main.a.e) {
            z = 0;
            this.o();
        }
        p.a(-1, -1);
        p.j = 100;
        p.k = 200;
        if (this.B == null) {
            this.B = new de("G\u1ecdi hotline", this, 13, null);
            this.B.j = main.a.A - 75;
            this.B.k = l.c == 1 && !main.a.e ? main.a.B - 20 : 8;
        }
        int n2 = 0;
        if (0 == 2) {
            if (l.c == 1) {
                j = G;
                return;
            }
            j = F;
            return;
        }
        if (n2 == 1) {
            j = I;
            if (l.c == 1) {
                j = I;
                return;
            }
            j = H;
            return;
        }
        j = E;
        if (l.c == 1) {
            j = E;
            return;
        }
        j = D;
    }

    private void n() {
        this.C = 0;
        String string = eu.c(eu.e);
        if (string == null ? eu.b(String.valueOf(eu.d) + n) != null : !string.equals("") || eu.b(String.valueOf(eu.d) + n) != null) {
            this.C = 1;
        }
        this.A = new de[4 + this.C];
        int n2 = main.a.D - 15 * this.A.length + 28;
        int n3 = 0;
        while (n3 < this.A.length) {
            switch (n3) {
                case 0: {
                    this.A[0] = new de("", this, 3, null);
                    if (string == null) {
                        this.A[0].b = aw.gh;
                        if (eu.b(String.valueOf(eu.d) + n) == null) break;
                        this.A[0].b = aw.q;
                        break;
                    }
                    if (string.equals("")) {
                        this.A[0].b = aw.gh;
                        if (eu.b(String.valueOf(eu.d) + n) == null) break;
                        this.A[0].b = aw.q;
                        break;
                    }
                    this.A[0].b = String.valueOf(aw.gi) + ": " + string;
                    if (this.A[0].b.length() <= 23) break;
                    this.A[0].b = this.A[0].b.substring(0, 23);
                    this.A[0].b = String.valueOf(this.A[0].b) + "...";
                    break;
                }
                case 1: {
                    if (this.C == 1) {
                        this.A[1] = new de("", this, 10100, null);
                        this.A[1].b = aw.gh;
                        break;
                    }
                    this.A[1] = new de(aw.T, this, 7, null);
                    break;
                }
                case 2: {
                    if (this.C == 1) {
                        this.A[2] = new de(aw.T, this, 7, null);
                        break;
                    }
                    this.A[2] = new de("", this, 17, null);
                    break;
                }
                case 3: {
                    if (this.C == 1) {
                        this.A[3] = new de("", this, 17, null);
                        break;
                    }
                    this.A[3] = new de(aw.bU, this, 8, null);
                    break;
                }
                case 4: {
                    this.A[4] = new de(aw.bU, this, 8, null);
                }
            }
            this.A[n3].k = n2;
            this.A[n3].b();
            this.A[n3].j = (main.a.A - this.A[n3].l) / 2;
            n2 += 30;
            ++n3;
        }
    }

    public static void a() {
        bs.a(j);
    }

    public static void a(String string) {
        String[] stringArray = ds.a(string.trim(), ",", 0);
        ds.c(">>> getServerList= " + string);
        aw.a(Byte.parseByte(stringArray[stringArray.length - 2]));
        a = new String[stringArray.length - 2];
        x = new String[stringArray.length - 2];
        y = new short[stringArray.length - 2];
        d = new byte[stringArray.length - 2];
        h = new byte[stringArray.length - 2];
        i = new byte[stringArray.length - 2];
        int n2 = 0;
        while (n2 < stringArray.length - 2) {
            String[] stringArray2 = ds.a(stringArray[n2].trim(), ":", 0);
            bs.a[n2] = stringArray2[0];
            bs.x[n2] = stringArray2[1];
            bs.y[n2] = Short.parseShort(stringArray2[2]);
            bs.d[n2] = Byte.parseByte(stringArray2[3].trim());
            try {
                bs.h[n2] = Byte.parseByte(stringArray2[4].trim());
            }
            catch (Exception exception) {
                bs.h[n2] = 0;
            }
            try {
                bs.i[n2] = Byte.parseByte(stringArray2[5].trim());
            }
            catch (Exception exception) {
                bs.i[n2] = 0;
            }
            ++n2;
        }
        b = Byte.parseByte(stringArray[stringArray.length - 1]);
        ds.c(">>> getServerList= serverPriority: " + b);
        bs.p();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(en en2) {
        Object object;
        if (!u) {
            en2.a(0);
            en2.d(0, 0, main.a.A, main.a.B);
        } else {
            main.a.c(en2);
        }
        di.s.a(en2, "v2.5.0(" + en.b + ")", main.a.A - 2, 17, 1, di.o);
        try {
            object = "";
            if (t == 0) {
                String cfr_ignored_0 = String.valueOf(object) + a[n] + " disconnect";
            } else {
                String cfr_ignored_1 = String.valueOf(object) + a[n] + " connected";
            }
        }
        catch (Exception exception) {}
        if (!s || u) {
            if (l.c == 1 && !main.a.e) {
                di.s.a(en2, l, main.a.A - 2, main.a.B - 15, 1, di.o);
            } else {
                di.s.a(en2, l, main.a.A - 2, 2, 1, di.o);
            }
        } else {
            di.s.a(en2, l, main.a.A - 2, 2, 1, di.o);
        }
        object = en2;
        if (!u) {
            if (o) return;
            en2.a(x.j, main.a.C, main.a.D - 32, 3);
            if (!s) {
                di.c.a(en2, aw.gc, main.a.C, main.a.D + 24, 2);
                if (M == null) return;
                M.a(en2);
                return;
            }
            if (M != null) {
                M.a(en2);
            }
            en2.e(0, 0, main.a.A, main.a.B);
            di.c.a(en2, String.valueOf(aw.aE) + p + "%", main.a.A / 2, main.a.D + 24, 2);
            p.a(p.ai, p.aj, p.ak, main.a.A / 2 - 50, main.a.D + 45, 100, 100.0f, en2);
            p.a(p.af, p.ag, p.ah, main.a.A / 2 - 50, main.a.D + 45, 100, p, en2);
            return;
        }
        int n2 = main.a.D - 15 * this.A.length - 15;
        if (n2 < 25) {
            n2 = 25;
        }
        if (x.j != null) {
            en2.a(x.j, main.a.C, n2, 3);
        }
        n2 = this.A.length;
        int n3 = 0;
        while (n3 < n2) {
            this.A[n3].a(en2);
            ++n3;
        }
        en2.e(0, 0, main.a.A, main.a.B);
        if (en.b != 1) return;
        if (t == -1) {
            if (main.a.w % 20 <= 10) return;
            en2.a(p.ae, 0, 14, 7, 7, 0, (main.a.A - di.f.a(this.A[2 + this.C].b) >> 1) - 10, this.A[2 + this.C].k + 10, 0);
            return;
        }
        en2.a(p.ae, 0, t * 7, 7, 7, 0, (main.a.A - di.f.a(this.A[2 + this.C].b) >> 1) - 10, this.A[2 + this.C].k + 9, 0);
    }

    public final void c() {
        block14: {
            block13: {
                if (m) {
                    if (++J == 50) {
                        main.a.ak.i();
                        m = false;
                    }
                    if (J == 100) {
                        if (main.a.I == null) {
                            main.a.I = new x();
                        }
                        main.a.I.a();
                        bt.a().r();
                        m = false;
                    }
                }
                int n2 = 0;
                while (n2 < this.A.length) {
                    this.A[n2].n = n2 == z;
                    ++n2;
                }
                ++p.j;
                if (!u && (o || p == 100)) {
                    M = null;
                }
                super.c();
                if (af.bI) {
                    return;
                }
                if (!u) {
                    return;
                }
                if (!v) {
                    return;
                }
                if (main.a.E != this) {
                    return;
                }
                if (br.a().d()) break block13;
                if (l.d() <= K) break block14;
                bs.a(n, true);
                br.a().e();
                bs.k();
            }
            K = l.d() + 5000L;
        }
    }

    private void o() {
        ds.c("load Screen= " + u + " select= " + z);
        if (u) {
            this.cn = new de("", this, this.A[bs.z].e, null);
            return;
        }
        this.cn = M;
    }

    public static void b(en en2) {
    }

    public static void e() {
    }

    public final void d() {
        if (main.a.e) {
            if (this.B != null && this.B.c()) {
                this.B.a();
            }
            if (!u) {
                if (M != null && M.c()) {
                    M.a();
                }
                super.d();
                return;
            }
            int n2 = this.A.length;
            int n3 = 0;
            while (n3 < n2) {
                if (this.A[n3] != null && this.A[n3].c()) {
                    this.A[n3].a();
                }
                ++n3;
            }
        } else {
            if (l.c == 1 && main.a.i[13]) {
                main.a.i[13] = false;
                this.B.a();
            }
            if (u) {
                int n4;
                if (main.a.i[8]) {
                    n4 = this.A.length - 1;
                    main.a.i[8] = false;
                    if (++z > n4) {
                        z = 0;
                    }
                    this.o();
                }
                if (main.a.i[2]) {
                    n4 = this.A.length - 1;
                    main.a.i[2] = false;
                    if (--z < 0) {
                        z = n4;
                    }
                    this.o();
                }
            }
        }
        super.d();
    }

    private static void p() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(aw.fB);
            dataOutputStream.writeByte(a.length);
            int n2 = 0;
            while (n2 < a.length) {
                dataOutputStream.writeUTF(a[n2]);
                dataOutputStream.writeUTF(x[n2]);
                dataOutputStream.writeShort(y[n2]);
                dataOutputStream.writeByte(d[n2]);
                try {
                    dataOutputStream.writeByte(h[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                try {
                    dataOutputStream.writeByte(i[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                ++n2;
            }
            dataOutputStream.writeByte(b);
            eu.a(L, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            em.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void f() {
        Object object = eu.b(L);
        if (object == null) {
            bs.a(j);
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            aw.a(object.readByte());
            int n2 = object.readByte();
            a = new String[n2];
            x = new String[n2];
            y = new short[n2];
            d = new byte[n2];
            h = new byte[n2];
            i = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                bs.a[n3] = object.readUTF();
                bs.x[n3] = object.readUTF();
                bs.y[n3] = object.readShort();
                bs.d[n3] = object.readByte();
                try {
                    bs.h[n3] = object.readByte();
                }
                catch (Exception exception) {
                    bs.h[n3] = 0;
                }
                try {
                    bs.i[n3] = object.readByte();
                }
                catch (Exception exception) {
                    bs.i[n3] = 0;
                }
                ++n3;
            }
            b = object.readByte();
            object.close();
            em.e();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void b() {
        dh.b();
        p.k = 0;
        p.j = 0;
        this.n();
        c = false;
        main.a.I = null;
        String string = eu.c(eu.a);
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            main.a.a(0);
        }
        o = true;
        this.A[2 + this.C].b = String.valueOf(aw.aJ) + ": " + a[n];
        this.cn = new de("", this, this.A[bs.z].e, null);
        this.A[1 + this.C].b = aw.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].b = aw.bU;
        }
        af.bI = false;
        l.a();
        super.b();
    }

    public final void g() {
        p.k = 0;
        p.j = 0;
        this.n();
        c = false;
        main.a.I = null;
        String string = eu.c(eu.a);
        int n2 = string != null && string != "" ? Integer.parseInt(string) : -1;
        if (n2 > 0) {
            u = true;
            main.a.a(0);
        }
        o = true;
        this.A[2 + this.C].b = String.valueOf(aw.aJ) + ": " + a[n];
        this.cn = new de("", this, this.A[bs.z].e, null);
        this.A[1 + this.C].b = aw.T;
        if (this.A.length == 4 + this.C) {
            this.A[3 + this.C].b = aw.bU;
        }
        super.b();
    }

    public final void h() {
        if (main.a.ak == null) {
            main.a.ak = new bs();
        }
        r = 0;
        p = 0;
        k = true;
        main.a.ak.j();
        s = false;
        bs.M.n = true;
        this.cn = new de("", this, 2, null);
    }

    public final void i() {
        main.a.b(aw.aC);
        br.a().e();
        GameMidlet.a = x[n];
        GameMidlet.b = y[n];
        eu.a(w, n);
        if (d[n] != aw.fB) {
            aw.a(d[n]);
        }
        x.i = a[n];
        this.n();
        u = true;
        t = -1;
        v = true;
    }

    public final void a(int n2, Object object) {
        ds.c("perform trong ServerListScreen" + n2);
        if (n2 == 1000) {
            main.a.b();
        }
        if (n2 == 1 || n2 == 4) {
            br.a().e();
            v = false;
            u = true;
            t = 0;
            s = false;
            eu.a();
            this.b();
        }
        if (n2 == 2) {
            k = false;
            M = new de(aw.gd, this, 4, null);
            new de(aw.gd, this, 4, null).j = main.a.A / 2 - bb.cq / 2;
            bs.M.k = main.a.D + 65;
            this.co = null;
            if (!main.a.e) {
                bs.M.j = main.a.A / 2 - bb.cq / 2;
                bs.M.k = main.a.B - bb.cr - 1;
            }
            this.cn = new de("", this, 4, null);
            if (!s) {
                bt.a().b((byte)1, null);
                if (!main.a.e) {
                    bs.M.n = true;
                    this.cn = new de("", this, 4, null);
                }
                s = true;
            }
        }
        if (n2 == 3) {
            bs.l();
        }
        if (n2 == 10100) {
            if (main.a.I == null) {
                main.a.I = new x();
            }
            main.a.I.b();
            main.a.b();
            bt.a().f("");
            ds.c("tao user ao");
            main.a.i();
            x.i = a[n];
        }
        if (n2 == 5) {
            bs.a();
            if (a.length == 1) {
                return;
            }
            object = new el("");
            int n3 = 0;
            while (n3 < a.length) {
                ((el)object).addElement(new de(a[n3], this, 6, null));
                ++n3;
            }
            main.a.F.a((el)object);
            if (!main.a.e) {
                main.a.F.b = n;
            }
        }
        if (n2 == 6) {
            bs.a(main.a.F.b, false);
            this.i();
        }
        if (n2 == 7) {
            if (main.a.I == null) {
                main.a.I = new x();
            }
            main.a.I.b();
        }
        if (n2 == 8) {
            boolean bl2 = eu.d("lowGraphic") == 1;
            el el2 = new el("cau hinh");
            el2.addElement(new de(aw.y, this, 9, null));
            el2.addElement(new de(aw.z, this, 10, null));
            el2.addElement(new de(aw.A, this, 14, null));
            main.a.F.a(el2);
            main.a.F.b = bl2 ? 0 : 1;
        }
        if (n2 == 9) {
            eu.a("lowGraphic", 1);
            main.a.a(aw.cM, 8885, null);
        }
        if (n2 == 10) {
            eu.a("lowGraphic", 0);
            main.a.a(aw.cM, 8885, null);
        }
        if (n2 == 11) {
            if (main.a.I == null) {
                main.a.I = new x();
            }
            main.a.I.b();
            String string = eu.c(String.valueOf(eu.d) + n);
            if (string == null || string.equals("")) {
                bt.a().f("");
            } else {
                main.a.I.n = true;
                main.a.b();
                bt.a().c();
                bt.a().a(string, "", "2.5.0", (byte)1);
            }
            main.a.b(aw.aC);
            ds.c("tao user ao");
        }
        if (n2 == 12) {
            GameMidlet.f.a();
        }
        if (n2 == 13 && (!s || u)) {
            switch (l.c) {
                case 1: {
                    l.b();
                }
            }
        }
        if (n2 == 14) {
            de de2 = new de(aw.bn, main.a.ak, 15, null);
            de de3 = new de(aw.bo, main.a.ak, 16, null);
            main.a.a(aw.gg, de2, de3);
        }
        if (n2 == 15) {
            eu.a();
            main.a.a(aw.cM, 8885, null);
        }
        if (n2 == 16) {
            bp.c();
            main.a.K = null;
        }
        if (n2 == 17) {
            if (main.a.al == null) {
                main.a.al = new ev();
            }
            main.a.al.b();
        }
        if (n2 == 18) {
            main.a.h();
            bp.c();
            if (main.a.al == null) {
                main.a.al = new ev();
            }
            main.a.al.b();
        }
        if (n2 == 19) {
            if (l.c == 1) {
                bp.c();
                main.a.K = null;
                return;
            }
            t = 0;
            v = true;
        }
    }

    public final void j() {
        p.j = 0;
        p.k = 0;
        this.n();
        u = false;
        p = 0;
        o = false;
        s = false;
        r = 0;
        af.bI = false;
        bs bs2 = this;
        if (!u) {
            M = new de(aw.ge, bs2, 2, null);
            new de(aw.ge, bs2, 2, null).n = true;
            bs.M.j = main.a.A / 2 - bb.cq / 2;
            bs.M.k = main.a.D + 45;
            if (bs.M.k > main.a.B - 26) {
                bs.M.k = main.a.B - 26;
            }
        }
        if (!main.a.e) {
            z = 0;
            bs2.o();
        }
        super.b();
    }

    public static void k() {
        GameMidlet.a = x[n];
        GameMidlet.b = y[n];
        aw.a(d[n]);
        x.i = a[n];
        main.a.b();
    }

    public static void a(int n2, boolean bl2) {
        n = n2;
        if (bl2) {
            eu.a(w, n);
            ds.b("2>>>saveRMSInt:  RMS_svselect == " + n);
        }
    }

    public static void l() {
        if (main.a.I == null) {
            main.a.I = new x();
        }
        main.a.I.b();
        boolean bl2 = false;
        boolean bl3 = false;
        String string = eu.c(String.valueOf(eu.d) + n);
        try {
            if (!eu.c(eu.e).equals("")) {
                bl2 = true;
            }
            if (!string.equals("")) {
                bl3 = true;
            }
        }
        catch (Exception exception) {}
        main.a.b();
        bt.a().c();
        if (!bl2 && !bl3) {
            main.a.b();
            if (string == null || string.equals("")) {
                bt.a().f("");
            } else {
                main.a.I.n = true;
                bt.a().a(string, "", "2.5.0", (byte)1);
            }
            eu.a(w, n);
            if (br.a().d) {
                main.a.i();
            } else {
                main.a.a(aw.cM, 8884, null);
            }
        } else {
            main.a.I.a();
        }
        x.i = a[n];
    }

    public static void m() {
        if (e == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte((byte)e.length);
            int n2 = 0;
            while (n2 < e.length) {
                dataOutputStream.writeByte(e[n2]);
                if (e[n2] >= 0 && f != null && f[n2] != null) {
                    dataOutputStream.writeShort((short)bs.f[n2].bU);
                    dataOutputStream.writeShort((short)bs.f[n2].bW);
                    dataOutputStream.writeShort((short)bs.f[n2].bV);
                    dataOutputStream.writeShort((short)bs.f[n2].bX);
                    dataOutputStream.writeUTF(bs.f[n2].ag);
                }
                ++n2;
            }
            eu.a(N, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            em.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

