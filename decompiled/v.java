/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class v {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean l;
    public static boolean m;

    public static boolean a(int n2, int n3) {
        return af.e().aD != null && af.e().aD.c == n2 && af.e().aD.a == 0;
    }

    public static void a() {
        if (main.a.G.a) {
            i = false;
        }
        if (p.s() != null) {
            a = p.s().B;
            b = p.s().C;
            k = 0;
            j = true;
            c = main.a.e ? 1 : 0;
        }
    }

    public static void a(int n2) {
        if (main.a.G.a) {
            return;
        }
        if (bo.a.size() - 1 < n2) {
            return;
        }
        bo bo2 = (bo)bo.a.elementAt(n2);
        a = bo2.d + bo2.b / 2;
        b = bo2.e + 30;
        i = !bo2.k && bo2.j;
        c = 0;
        j = true;
        k = 0;
        if (!main.a.e) {
            i = false;
        }
    }

    public static void b() {
        aa aa2;
        c = 1;
        if (main.a.G.a) {
            i = false;
        }
        boolean bl2 = false;
        int n2 = 0;
        while (n2 < p.F.size()) {
            aa2 = (aa)p.F.elementAt(n2);
            if (aa2.f) {
                bl2 = true;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < p.F.size()) {
            aa2 = (aa)p.F.elementAt(n2);
            if (aa2.f) {
                a = aa2.m;
                b = aa2.n + 5;
                j = true;
                if (aa2.p != 0) break;
                aa2.f = false;
                return;
            }
            if (!bl2) {
                if (aa2.p == 0) {
                    aa2.f = false;
                } else {
                    aa2.f = true;
                    return;
                }
            }
            ++n2;
        }
    }

    public static boolean c() {
        if (main.a.G.a) {
            i = false;
        }
        int n2 = 0;
        while (n2 < p.E.size()) {
            ce ce2 = (ce)p.E.elementAt(n2);
            if (ce2.c == af.e().J && ce2.e.a == 73) {
                c = 1;
                a = ce2.a;
                b = ce2.b + 5;
                j = true;
                return true;
            }
            ++n2;
        }
        return false;
    }
}

