/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class em
extends bb {
    private static int c;
    private boolean d = false;
    private static int e;
    private static int f;
    public static em a;
    public static Image b;

    static {
        e = -1;
        f = -1;
        b = l.b("/gamelogo.png");
    }

    public em() {
        a = this;
    }

    public static void a() {
        c = 0;
    }

    public final void c() {
        if (++c == 30 && !this.d) {
            this.d = true;
            if (eu.d("serverchat") != -1) {
                boolean bl2 = p.bV = eu.d("serverchat") == 0;
            }
            if (eu.d("isPlaySound") != -1) {
                boolean bl3 = main.a.aj = eu.d("isPlaySound") == 1;
            }
            if (main.a.aj) {
                bu.a();
            }
            bu.a();
            bu.g();
            bs.f();
        }
        if (c >= 150) {
            if (br.a().d()) {
                bs.u = true;
            } else {
                l.b(true);
                if (main.a.ak == null) {
                    main.a.ak = new bs();
                }
            }
            main.a.ak.b();
        }
        bs.e();
    }

    public static void e() {
        ds.b(">>>>>loadIP:  svselect == " + eu.d(bs.w));
        bs.a(eu.d(bs.w), false);
        if (bs.n == -1) {
            ds.b(">>>loadIP:  svselect == -1");
            bs.a(bs.b, true);
        }
        bs.k();
    }

    public final void a(en en2) {
        if (b != null && c < 30) {
            en2.a(0xFFFFFF);
            en2.d(0, 0, main.a.A, main.a.B);
            en2.a(b, main.a.A / 2, main.a.B / 2, 3);
        }
        if (e != -1) {
            en2.a(0);
            en2.d(0, 0, main.a.A, main.a.B);
            en2.a(x.j, main.a.A / 2, main.a.B / 2 - 24, cj.c);
            main.a.a(main.a.C, main.a.B / 2 + 24, en2);
            di.c.a(en2, String.valueOf(aw.aE) + e * 100 / f + "%", main.a.A / 2, main.a.B / 2, 2);
            return;
        }
        if (c >= 30) {
            en2.a(0);
            en2.d(0, 0, main.a.A, main.a.B);
            main.a.a(main.a.C, main.a.D, en2);
            bs.b(en2);
        }
    }

    public static void f() {
        b = l.b("/gamelogo.png");
    }
}

