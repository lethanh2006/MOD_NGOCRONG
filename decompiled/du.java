/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.Vector;
import main.a;

public final class du {
    private static Random a = new Random();
    private static Vector b = new Vector();
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static float j;
    private static int[] k;
    private static int[] l;
    private static boolean m;
    private static long n;
    private static long o;

    static {
        k = new int[3];
        l = new int[3];
        m = false;
        n = 0L;
        o = 150L;
    }

    public static void a(en en2) {
        if (m) {
            du.l[2] = l[1];
            du.k[2] = k[1];
            du.l[1] = l[0];
            du.k[1] = k[0];
            du.l[0] = d;
            du.k[0] = c;
            c = (int)(Math.cos((double)e * Math.PI / 180.0) * (double)i * (double)h) + f;
            d = (int)((double)i * Math.sin((double)e * Math.PI / 180.0) * (double)h - (double)(0.0f * (float)h * (float)h / 2.0f));
            if (System.currentTimeMillis() - n >= o) {
                ++h;
                n = System.currentTimeMillis();
            }
        }
        if (h > 32 && m) {
            m = false;
            b.removeAllElements();
            b.addElement(new ad(ds.b(50, main.a.A - 50), ds.b(main.a.B - 100, main.a.B), 5, 72));
        }
        en2.a(0);
        en2.d(0, 0, 0, 0);
        en2.a(0xFF0000);
        int n2 = 0;
        while (n2 < b.size()) {
            en en3 = en2;
            ad ad2 = (ad)b.elementAt(n2);
            int n3 = 0;
            while (n3 < ad2.a.size()) {
                aj aj2 = (aj)ad2.a.elementAt(n3);
                if (aj2.f < -200) {
                    ad2.a.removeElementAt(n3);
                }
                en en4 = en3;
                aj.a(en4, aj2.a - aj2.e, aj2.b - aj2.f, aj2.j);
                int n4 = 0;
                while (n4 < 2) {
                    aj.a(en4, aj2.a - aj2.o[n4], aj2.b - aj2.p[n4], aj2.j);
                    ++n4;
                }
                if (aj2.n && System.currentTimeMillis() - aj2.l >= aj2.m) {
                    ++aj2.i;
                    aj2.l = System.currentTimeMillis();
                    aj2.o[1] = aj2.o[0];
                    aj2.p[1] = aj2.p[0];
                    aj2.o[0] = aj2.e;
                    aj2.p[0] = aj2.f;
                    aj2.e = (int)(Math.cos((double)aj2.h * Math.PI / 180.0) * (double)aj2.c * (double)aj2.i) + aj2.d;
                    aj2.f = (int)((double)aj2.c * Math.sin((double)aj2.h * Math.PI / 180.0) * (double)aj2.i - (double)(aj2.k * (float)aj2.i * (float)aj2.i / 2.0f)) + aj2.g;
                }
                ++n3;
            }
            ++n2;
        }
        if (!m) {
            int n5 = -(Math.abs(a.nextInt() % 3) + 5);
            if (n5 == -5 && !m) {
                f = 0;
                e = 80;
                m = true;
                du.a();
                return;
            }
            if (n5 == -7 && !m) {
                e = 60;
                f = 0;
                m = true;
                du.a();
                return;
            }
            if (n5 == -6 && !m) {
                e = 120;
                f = 0;
                m = true;
                du.a();
            }
        }
    }

    private static void a() {
        g = 0;
        i = 16;
        h = 0;
        j = 0.0f;
        int n2 = 0;
        while (n2 < 3) {
            du.l[n2] = 0;
            du.k[n2] = f;
            ++n2;
        }
        m = true;
    }
}

