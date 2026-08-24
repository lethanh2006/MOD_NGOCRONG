/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bp {
    public static boolean a;
    private static String c;
    private static String d;
    private static int e;
    public static boolean b;

    public static void a(String string, String string2, int n2) {
        if (string == null) {
            return;
        }
        a = true;
        c = string;
        d = string2;
        e = n2;
    }

    public static void a() {
        bp.a(aw.aC, null, 1000);
        b = true;
    }

    public static void a(en en2) {
        if (!a) {
            return;
        }
        if (b && e > 4990) {
            return;
        }
        cx.a(main.a.C - 75, 10, 150, 55, en2);
        if (b) {
            main.a.a(main.a.C - di.t.a(c) / 2 - 10, 38, en2);
            di.t.a(en2, c, main.a.C + 5, 31, 2);
            return;
        }
        if (d != null) {
            di.t.a(en2, c, main.a.C, 23, 2);
            di.m.a(en2, d, main.a.C, 40, 2);
            return;
        }
        di.t.a(en2, c, main.a.C, 31, 2);
    }

    public static void b() {
        if (!a) {
            return;
        }
        if (e > 0 && --e <= 0) {
            bp.c();
        }
    }

    public static void c() {
        c = "";
        d = null;
        b = false;
        e = 0;
        a = false;
    }
}

