/*
 * Decompiled with CFR 0.152.
 */
public final class ei {
    public static el a = new el("vEff");

    public static void a(ea ea2) {
        a.addElement(ea2);
    }

    public static void a(int n2) {
        if (ei.b(n2) != null) {
            a.removeElement(ei.b(n2));
        }
    }

    private static ea b(int n2) {
        int n3 = 0;
        while (n3 < a.size()) {
            ea ea2 = (ea)a.elementAt(n3);
            if (ea2.a == n2) {
                return ea2;
            }
            ++n3;
        }
        return null;
    }

    public static void a(en en2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < a.size()) {
            if (((ea)ei.a.elementAt((int)n5)).h == -n4) {
                ((ea)a.elementAt(n5)).a(en2, n2, n3);
            }
            ++n5;
        }
    }

    public static void a(en en2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((ea)ei.a.elementAt((int)n2)).h == 1) {
                ((ea)a.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void b(en en2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((ea)ei.a.elementAt((int)n2)).h == 2) {
                ((ea)a.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void c(en en2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((ea)ei.a.elementAt((int)n2)).h == 3) {
                ((ea)a.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void d(en en2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((ea)ei.a.elementAt((int)n2)).h == 4) {
                ((ea)a.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    public static void a() {
        int n2 = 0;
        while (n2 < a.size()) {
            ((ea)a.elementAt(n2)).a();
            ++n2;
        }
    }
}

