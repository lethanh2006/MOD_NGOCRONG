/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cz {
    public int a;
    public int b;
    public short c;
    public int d;
    public int e;
    public int f;
    public int g;
    public byte h;
    public int[] i;
    public int[] j;
    public static t k = new t("imgNew BgItem");
    public static el l = new el("vKeyNews");
    public static el m = new el("vKeyLast");
    public static byte[] n;
    private int o = 0;
    private int p = 0;
    private static int[] q;

    static {
        q = new int[]{79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};
    }

    public static void a() {
        k.clear();
        l.removeAllElements();
        m.removeAllElements();
    }

    public static boolean a(String string) {
        int n2 = 0;
        while (n2 < l.size()) {
            String string2 = (String)l.elementAt(n2);
            if (string2.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private boolean b() {
        int n2 = 0;
        while (n2 < q.length) {
            if (this.c == q[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final void a(en en2) {
        if (af.bI) {
            return;
        }
        if (this.c == 279 && p.j().bU >= 110) {
            return;
        }
        int n2 = p.j;
        int n3 = p.k;
        Image image = (Image)k.get(String.valueOf(this.c));
        if (image != null) {
            if (this.c == 96) {
                return;
            }
            if (this.h == 4) {
                this.o = -n2 / 2 + 100;
            }
            if (this.c == 28 && this.h == 3) {
                this.o = -n2 / 3 + 200;
            }
            if ((this.c == 67 || this.c == 68 || this.c == 69 || this.c == 70) && this.h == 3) {
                this.o = -n2 / 3 + 200;
            }
            if (this.b() && this.h < 4) {
                this.o = -(n2 >> 4) + 50;
                this.p = (n3 >> 5) - 15;
            }
            int n4 = this.d + this.f + this.o;
            int n5 = this.e + this.g + this.p;
            if (this.d + this.f + image.getWidth() + this.o >= n2 && this.d + this.f + this.o <= n2 + main.a.A && this.e + this.g + this.p + image.getHeight() >= n3 && this.e + this.g + this.p <= n3 + main.a.B) {
                en2.a(image, 0, 0, en.a(image), en.b(image), this.b, this.d + this.f + this.o, this.e + this.g + this.p, 0);
                if (this.c == 11 && bv.l != 122) {
                    en2.e(n4, n5 + 24, 48, 14);
                    int n6 = 0;
                    while (n6 < 2) {
                        en2.a(bv.h, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, n4 + n6 * 24, n5 + 24, 0);
                        ++n6;
                    }
                    en2.e(p.j, p.k, p.d, p.e);
                }
            }
            if (bv.g() && this.c > 137 && this.c != 156 && this.c != 159 && this.c != 157 && this.c != 165 && this.c != 167 && this.c != 168 && this.c != 169 && this.c != 170 && this.c != 238 && bv.c - (this.d + this.f + this.o) >= n2 && bv.c - (this.d + this.f + this.o + image.getWidth()) <= n2 + main.a.A && this.e + this.g + this.p + image.getHeight() >= n3 && this.e + this.g + this.p <= n3 + main.a.B && (this.c < 241 || this.c >= 266)) {
                en2.a(image, 0, 0, en.a(image), en.b(image), 2, bv.c - (this.d + this.f + this.o) - en.a(image), this.e + this.g + this.p, 0);
            }
        }
    }
}

