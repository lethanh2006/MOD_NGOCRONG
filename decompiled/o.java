/*
 * Decompiled with CFR 0.152.
 */
public final class o {
    public static t a = new t("VSKILL");

    public static void a(bf bf2) {
        a.put(new Short(bf2.b), bf2);
    }

    public static bf a(short s2) {
        return (bf)a.get(new Short(s2));
    }
}

