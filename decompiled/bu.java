/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bu {
    public static boolean a = false;
    private static bu l;
    public static float b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;

    static {
        b = 0.5f;
        c = 30;
        d = 31;
        e = 32;
        f = 33;
        g = 34;
        h = 35;
        i = 36;
        j = 37;
        k = 38;
    }

    public static bu a() {
        if (l == null) {
            l = new bu();
        }
        return l;
    }

    public final void b() {
        if (af.cW) {
            eu.a("isPaintAura", 0);
            af.cW = false;
        } else {
            eu.a("isPaintAura", 1);
            af.cW = true;
        }
        bu.g();
    }

    public final void c() {
        if (!main.a.e) {
            bu bu2 = this;
            if (p.bV = !p.bV) {
                eu.a("serverchat", 0);
            } else {
                eu.a("serverchat", 1);
            }
            bu.g();
            return;
        }
        bu bu3 = this;
        if (p.aO == 0) {
            p.aO = 1;
            eu.a("analog", p.aO);
            p.m();
        } else {
            p.aO = 0;
            eu.a("analog", p.aO);
            p.m();
        }
        bu.g();
    }

    public final void d() {
        if (main.a.a) {
            eu.a("lowGraphic", 0);
            main.a.a(aw.cM, 8885, null);
        } else {
            eu.a("lowGraphic", 1);
            main.a.a(aw.cM, 8885, null);
        }
        bu.g();
    }

    public final void e() {
        if (af.cX) {
            eu.a("isPaintAura2", 0);
            af.cX = false;
        } else {
            eu.a("isPaintAura2", 1);
            af.cX = true;
        }
        bu.g();
    }

    public static void f() {
        if (main.a.I.n && af.e().aD != null && af.e().aD.c >= 2) {
            g.G = new String[]{aw.i, aw.bT, aw.bS, aw.bR, aw.aG, aw.bQ, aw.aq, aw.bU, aw.T, aw.I};
            if (af.e().bO) {
                g.G = new String[]{aw.i, aw.bT, aw.bS, aw.w, aw.bR, aw.aG, aw.bQ, aw.aq, aw.bU, aw.T, aw.I};
            }
        } else {
            g.G = new String[]{aw.i, aw.bT, aw.bS, aw.bR, aw.aG, aw.bQ, aw.aq, aw.bU, aw.T};
            if (af.e().bO) {
                g.G = new String[]{aw.i, aw.bT, aw.bS, aw.w, aw.bR, aw.aG, aw.bQ, aw.aq, aw.bU, aw.T};
            }
        }
        if (a) {
            String[] stringArray = new String[g.G.length + 1];
            int n2 = 0;
            while (n2 < g.G.length) {
                stringArray[n2] = g.G[n2];
                ++n2;
            }
            stringArray[g.G.length] = aw.d;
            g.G = stringArray;
        }
    }

    public static void g() {
        String string;
        String string2 = "[x]   ";
        String string3 = "[  ]   ";
        String string4 = string = p.aO == 0 ? String.valueOf(string3) + aw.F : String.valueOf(string2) + aw.G;
        if (!main.a.e) {
            string = !p.bV ? String.valueOf(string3) + aw.bX : String.valueOf(string2) + aw.bX;
        }
        g.H = new String[]{af.cW ? String.valueOf(string2) + aw.cb.trim() : String.valueOf(string3) + aw.cb.trim(), af.cX ? String.valueOf(string2) + aw.cc.trim() : String.valueOf(string3) + aw.cc.trim(), main.a.aj ? String.valueOf(string2) + aw.fC.trim() : String.valueOf(string3) + aw.fC.trim(), main.a.a ? String.valueOf(string2) + aw.y.trim() : String.valueOf(string3) + aw.y.trim(), string};
    }

    public static void h() {
        br.a().e();
        main.a.G.A();
        main.a.I.f();
        main.a.I.b();
    }
}

