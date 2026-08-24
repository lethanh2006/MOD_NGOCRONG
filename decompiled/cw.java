/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class cw
extends bb
implements b {
    public static cw a;
    public static boolean b;
    private de c;
    private static cd d;
    private static int e;
    private static int f;
    private static int g;
    private static int[][] h;
    private static int[] i;
    private static int[] j;
    private int[] k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    static {
        b = false;
        h = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
        i = new int[]{2, 13, 8};
        j = new int[]{1, 12, 7};
    }

    public static cw a() {
        if (a == null) {
            a = new cw();
        }
        return a;
    }

    private static void a(byte[] byArray) {
        int n2 = 0;
        while (n2 < byArray.length) {
            InputStream inputStream = ad.a("/mymap/" + byArray[n2]);
            inputStream = new DataInputStream(inputStream);
            dl.a[n2] = (char)((FilterInputStream)inputStream).read();
            dl.b[n2] = (char)((FilterInputStream)inputStream).read();
            dl.e[n2] = new int[((FilterInputStream)inputStream).available()];
            int n3 = 0;
            while (n3 < dl.a[n2] * dl.b[n2]) {
                dl.e[n2][n3] = ((FilterInputStream)inputStream).read();
                ++n3;
            }
            dl.f[n2] = new int[dl.e[n2].length];
            ++n2;
        }
    }

    public final void b() {
        x.c = false;
        main.a.F.a = false;
        main.a.h();
        super.b();
        e = ds.b(0, 3);
        f = ds.b(0, 3);
        this.e();
        af.bI = false;
        if (d != null) {
            cw.d.i = aw.aw;
        }
        if (main.a.e) {
            this.c = new de(bs.a[bs.n], this, 10018, null);
            this.c.j = 1;
            this.c.k = 3;
        }
    }

    private void e() {
        bv.f = new int[dl.e[e].length];
        int n2 = 0;
        while (n2 < dl.e[e].length) {
            bv.f[n2] = dl.e[e][n2];
            ++n2;
        }
        bv.g = dl.f[e];
        bv.d = dl.d[e];
        bv.c = dl.c[e];
        bv.e = dl.c[e];
        bv.a = dl.a[e];
        bv.b = dl.b[e];
        bv.e = this.k[e] + 1;
        bv.h();
        main.a.a(this.k[e]);
        p.a(this.l, this.m);
    }

    public cw() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.k = nArray;
        this.l = 168;
        this.m = 350;
        this.n = 45;
        if (main.a.I == null) {
            main.a.I = new x();
        }
        try {
            if (!main.a.a) {
                byte[] byArray = new byte[]{39, 40, 41};
                if (!main.a.a) {
                    try {
                        int n2 = 0;
                        while (n2 < byArray.length) {
                            InputStream inputStream = ad.a("/mymap/mapTable" + byArray[n2]);
                            inputStream = new DataInputStream(inputStream);
                            int n3 = ((DataInputStream)inputStream).readShort();
                            dl.g[n2] = new el("MapTemplate.vCurrItem[a] ");
                            int n4 = 0;
                            while (n4 < n3) {
                                short s2 = ((DataInputStream)inputStream).readShort();
                                short s3 = ((DataInputStream)inputStream).readShort();
                                short s4 = ((DataInputStream)inputStream).readShort();
                                if (bv.a(s2) != null) {
                                    cz cz2 = bv.a(s2);
                                    cz cz3 = new cz();
                                    new cz().a = s2;
                                    cz3.c = cz2.c;
                                    cz3.f = cz2.f;
                                    cz3.g = cz2.g;
                                    cz3.d = s3 * bv.i;
                                    cz3.e = s4 * bv.i;
                                    cz3.h = cz2.h;
                                    dl.g[n2].addElement(cz3);
                                    if (!cz.k.containsKey(String.valueOf(cz3.c))) {
                                        Image image;
                                        try {
                                            image = l.b("/mapBackGround/" + cz3.c + ".png");
                                            cz.k.put(String.valueOf(cz3.c), image);
                                        }
                                        catch (Exception exception) {
                                            image = l.c("/mapBackGround/" + cz3.c + ".png");
                                            if (image == null) {
                                                image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                                bt.a().c(cz3.c);
                                            }
                                            cz.k.put(String.valueOf(cz3.c), image);
                                        }
                                        cz.m.addElement(String.valueOf(cz3.c));
                                    }
                                    if (!cz.a(String.valueOf(cz3.c))) {
                                        cz.l.addElement(String.valueOf(cz3.c));
                                    }
                                }
                                ++n4;
                            }
                            ++n2;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                }
            }
            cw.a(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        if (main.a.A <= 200) {
            p.d(128, 100);
            p.bL = (main.a.A - 128) / 2;
            p.bK = 10;
            this.m += 15;
            this.n -= 15;
        }
        e = 1;
        d = new cd();
        new cd().c = main.a.I.a.c;
        if (main.a.A < 200) {
            cw.d.c = 60;
        }
        cw.d.d = 26;
        if (main.a.A < 200) {
            cw.d.a = p.bL + 45;
            cw.d.b = p.bK + 12;
        } else {
            cw.d.a = main.a.A / 2 - cw.d.c / 2;
            cw.d.b = 35;
        }
        if (!main.a.e) {
            cw.d.e = true;
        }
        d.c(0);
        cw.d.i = aw.aw;
        if (d.d().equals("@")) {
            d.a(main.a.I.a.d().substring(0, main.a.I.a.d().indexOf("@")));
        }
        e = 1;
        f = 0;
        this.cn = new de(aw.bz, this, 8000, null);
        this.cm = new de(aw.bA, this, 8001, null);
        if (!main.a.e) {
            this.co = cw.d.j;
        }
    }

    public final void a(int n2) {
        d.a(n2);
    }

    public final void c() {
        ++this.o;
        if (this.o > 30) {
            this.o = 0;
        }
        this.p = this.o % 15 < 5 ? 0 : 1;
        d.c();
        if (this.c != null && this.c.c()) {
            this.c.a();
        }
        if (g != 0) {
            cw.d.e = false;
        }
    }

    public final void d() {
        if (main.a.i[2] && --g < 0) {
            g = aw.aK.length - 1;
        }
        if (main.a.i[8] && ++g >= aw.aK.length) {
            g = 0;
        }
        if (g == 0) {
            if (!main.a.e) {
                this.co = cw.d.j;
            }
            d.c();
        }
        if (g == 1) {
            if (main.a.i[4]) {
                if (--e < 0) {
                    e = aw.aL.length - 1;
                }
                this.e();
            }
            if (main.a.i[6]) {
                if (++e > aw.aL.length - 1) {
                    e = 0;
                }
                this.e();
            }
            this.co = null;
        }
        if (g == 2) {
            if (main.a.i[4] && --f < 0) {
                f = aw.fp[0].length - 1;
            }
            if (main.a.i[6] && ++f > aw.fp[0].length - 1) {
                f = 0;
            }
            this.co = null;
        }
        if (main.a.m) {
            int n2;
            int n3 = 110;
            int n4 = 60;
            if (main.a.A > main.a.B) {
                n3 = 100;
                n4 = 40;
            }
            if (main.a.a(main.a.A / 2 - 117, 15, 234, 80)) {
                g = 0;
                cw.d.e = true;
            }
            if (main.a.a(main.a.A / 2 - 117, n3 - 30, 234, n4 + 5)) {
                g = 1;
                n2 = e;
                e = (main.a.p - (main.a.A / 2 - 117)) / 78;
                if (e < 0) {
                    e = 0;
                }
                if (e > aw.aL.length - 1) {
                    e = aw.aL.length - 1;
                }
                if (n2 != e) {
                    this.e();
                }
            }
            if (main.a.a(main.a.A / 2 - 117, n3 - 30 + n4 + 5, 234, 65)) {
                g = 2;
                n2 = f;
                f = (main.a.p - (main.a.A / 2 - 117)) / 78;
                if (f < 0) {
                    f = 0;
                }
                if (f > aw.fp[0].length - 1) {
                    f = aw.fp[0].length - 1;
                }
                if (n2 != g) {
                    this.e();
                }
            }
        }
        super.d();
        main.a.g();
        main.a.f();
    }

    public final void a(en en2) {
        int n2;
        int n3;
        if (af.bI) {
            return;
        }
        main.a.c(en2);
        en2.a(-p.j, -p.k);
        if (!main.a.a) {
            n3 = 0;
            while (n3 < dl.g[e].size()) {
                cz cz2 = (cz)dl.g[e].elementAt(n3);
                if (cz2.c != -1 && cz2.h == 1) {
                    cz2.a(en2);
                }
                ++n3;
            }
        }
        bv.a(en2);
        n3 = 30;
        if (main.a.A == 128) {
            n3 = 20;
        }
        int n4 = h[e][f];
        int n5 = i[e];
        int n6 = j[e];
        en2.a(bv.x, this.l, this.m + this.n, 3);
        av av2 = p.x[n4];
        av av3 = p.x[n5];
        av av4 = p.x[n6];
        bl.b(en2, av2.a[af.bC[this.p][0][0]].a, this.l + af.bC[this.p][0][1] + av2.a[af.bC[this.p][0][0]].b, this.m - af.bC[this.p][0][2] + av2.a[af.bC[this.p][0][0]].c + this.n, 0, 0);
        bl.b(en2, av3.a[af.bC[this.p][1][0]].a, this.l + af.bC[this.p][1][1] + av3.a[af.bC[this.p][1][0]].b, this.m - af.bC[this.p][1][2] + av3.a[af.bC[this.p][1][0]].c + this.n, 0, 0);
        bl.b(en2, av4.a[af.bC[this.p][2][0]].a, this.l + af.bC[this.p][2][1] + av4.a[af.bC[this.p][2][0]].b, this.m - af.bC[this.p][2][2] + av4.a[af.bC[this.p][2][0]].c + this.n, 0, 0);
        if (!main.a.a) {
            n2 = 0;
            while (n2 < dl.g[e].size()) {
                cz cz3 = (cz)dl.g[e].elementAt(n2);
                if (cz3.c != -1 && cz3.h == 3) {
                    cz3.a(en2);
                }
                ++n2;
            }
        }
        en2.a(-en2.a(), -en2.b());
        if (main.a.A < 200) {
            cx.b(p.bL, p.bK, p.bM, p.bN, en2);
            bl.b(en2, av2.a[af.bC[0][0][0]].a, main.a.A / 2 + af.bC[0][0][1] + av2.a[af.bC[0][0][0]].b, p.bK + 30 + n3 * 3 - af.bC[0][0][2] + av2.a[af.bC[0][0][0]].c + this.n, 0, 0);
            bl.b(en2, av3.a[af.bC[0][1][0]].a, main.a.A / 2 + af.bC[0][1][1] + av3.a[af.bC[0][1][0]].b, p.bK + 30 + n3 * 3 - af.bC[0][1][2] + av3.a[af.bC[0][1][0]].c + this.n, 0, 0);
            bl.b(en2, av4.a[af.bC[0][2][0]].a, main.a.A / 2 + af.bC[0][2][1] + av4.a[af.bC[0][2][0]].b, p.bK + 30 + n3 * 3 - af.bC[0][2][2] + av4.a[af.bC[0][2][0]].c + this.n, 0, 0);
            n2 = 0;
            while (n2 < aw.aK.length) {
                if (g == n2) {
                    en2.a(p.bw, 0, 0, 13, 16, 2, p.bL + 10 + (main.a.w % 7 > 3 ? 1 : 0), p.bK + 35 + n2 * n3, cj.f);
                    en2.a(p.bw, 0, 0, 13, 16, 0, p.bL + p.bM - 10 - (main.a.w % 7 > 3 ? 1 : 0), p.bK + 35 + n2 * n3, cj.f);
                }
                di.f.a(en2, aw.aK[n2], p.bL + 20, p.bK + 30 + n2 * n3, 0);
                ++n2;
            }
            di.f.a(en2, aw.aL[e], p.bL + 70, p.bK + 30 + n3 * 1, 0);
            di.f.a(en2, aw.fp[e][f], p.bL + 55, p.bK + 30 + n3 * 2, 0);
        } else {
            n2 = 110;
            int n7 = 60;
            if (main.a.A > main.a.B) {
                n2 = 100;
                n7 = 45;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != e) {
                    en2.a(p.aw, main.a.A / 2 - 78 + n3 * 78, n2, 3);
                } else {
                    if (g == 1) {
                        en2.a(p.bw, 0, 0, 13, 16, 4, main.a.A / 2 - 78 + n3 * 78, n2 - 20 + (main.a.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.a(p.ax, main.a.A / 2 - 78 + n3 * 78, n2, 3);
                }
                di.f.a(en2, aw.aL[n3], main.a.A / 2 - 78 + n3 * 78, n2 - 5, 2);
                ++n3;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != f) {
                    en2.a(p.aw, main.a.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                } else {
                    if (g == 2) {
                        en2.a(p.bw, 0, 0, 13, 16, 4, main.a.A / 2 - 78 + n3 * 78, n2 + n7 - 20 + (main.a.w % 7 > 3 ? 1 : 0), cj.f);
                    }
                    en2.a(p.ax, main.a.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                }
                di.f.a(en2, aw.fp[e][n3], main.a.A / 2 - 78 + n3 * 78, n2 + n7 - 5, 2);
                ++n3;
            }
            if (g == 0) {
                en2.a(p.bw, 0, 0, 13, 16, 4, main.a.A / 2, 20 + (main.a.w % 7 > 3 ? 1 : 0), cj.f);
            }
        }
        d.a(en2);
        en2.e(0, 0, main.a.A, main.a.B);
        if (this.c != null) {
            this.c.a(en2);
        }
        super.a(en2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                if (d.d().equals("")) {
                    main.a.a(aw.as);
                    return;
                }
                if (d.d().length() < 5) {
                    main.a.a(aw.at);
                    return;
                }
                if (d.d().length() > 15) {
                    main.a.a(aw.au);
                    return;
                }
                bp.a();
                bt.a().a(d.d(), e, h[e][f]);
                return;
            }
            case 8001: {
                if (main.a.I.n) {
                    main.a.a(aw.fV, new de(aw.bn, this, 10019, null), new de(aw.bo, this, 10020, null));
                    return;
                }
                br.a().e();
                main.a.ak.b();
                return;
            }
            case 10020: {
                main.a.h();
                return;
            }
            case 10019: {
                br.a().e();
                main.a.h();
                main.a.ak.b();
                return;
            }
            case 10018: {
                bs.a(-1, true);
                ev.b = false;
                main.a.al.b();
            }
        }
    }
}

