/*
 * Decompiled with CFR 0.152.
 */
public final class ak {
    public int a;
    public String b;
    public short[] c;
    public int d;
    public int e;
    public static el f = new el("vClanImage");
    public static t g = new t("h id images");

    public static void a(ak ak2) {
        bt.a().b((byte)ak2.a);
        f.addElement(ak2);
    }

    public static ak a(short s2) {
        int n2 = 0;
        while (n2 < f.size()) {
            ak ak2 = (ak)f.elementAt(n2);
            if (ak2.a == s2) {
                return ak2;
            }
            ++n2;
        }
        return null;
    }

    public static boolean a(int n2) {
        int n3 = 0;
        while (n3 < f.size()) {
            ak ak2 = (ak)f.elementAt(n3);
            if (ak2.a == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }
}

