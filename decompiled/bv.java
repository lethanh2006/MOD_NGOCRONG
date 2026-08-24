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
import main.GameMidlet;
import main.a;

public final class bv {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static int I;
    public static int[] f;
    public static int[] g;
    private static Image[] J;
    private static Image K;
    private static Image L;
    public static Image h;
    private static Image M;
    private static Image N;
    public static byte i;
    private static int O;
    private static int P;
    private static int Q;
    private static int R;
    public static boolean j;
    public static String k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static byte r;
    public static byte s;
    public static el t;
    public static el u;
    public static el v;
    public static String[] w;
    public static Image x;
    private static int[] S;
    public static int[][] y;
    public static int[][][] z;
    public static Image A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;

    static {
        I = -1;
        i = (byte)24;
        j = false;
        k = "";
        m = -1;
        q = -1;
        s = (byte)-1;
        t = new el("vGO");
        u = new el("vItemBg");
        v = new el("vCurrItem");
        x = l.b("/mainImage/myTexture2dbong.png");
        new el("vObject");
        S = new int[]{21, 22, 23, 39, 40, 41};
        int[] nArray = new int[]{21, 22, 23, 24, 25, 26};
        int[] nArray2 = new int[3];
        nArray2[1] = 7;
        nArray2[2] = 14;
        A = l.b("/bg/light.png");
        int[] nArray3 = new int[]{5257738, 8807192};
        H = 0;
    }

    public static boolean a() {
        return l == 51 || l == 103 || l == 112 || l == 113 || l == 129 || l == 130;
    }

    public static boolean b() {
        return l == 39 || l == 40 || l == 41;
    }

    public static boolean c() {
        return p.bY != null && l == p.bY.l;
    }

    public static cz a(int n2) {
        int n3 = 0;
        while (n3 < u.size()) {
            cz cz2 = (cz)u.elementAt(n3);
            if (cz2.a == n2) {
                return cz2;
            }
            ++n3;
        }
        return null;
    }

    public static boolean d() {
        int n2 = 0;
        while (n2 < S.length) {
            if (l == S[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean b(int n2) {
        if (n2 == 156 || n2 == 330 || n2 == 345 || n2 == 334) {
            return false;
        }
        if (l == 54 || l == 55 || l == 56 || l == 57 || l == 58 || l == 59 || l == 103) {
            return false;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < v.size()) {
            cz cz2 = (cz)v.elementAt(n4);
            if (cz2.a == n2) {
                ++n3;
            }
            ++n4;
        }
        return n3 > 2;
    }

    public static final void e() {
        if (K == null) {
            K = l.a("/tWater/wtf.png");
        }
        if (L == null) {
            L = l.a("/tWater/twtf.png");
        }
        if (h == null) {
            h = l.a("/tWater/wts.png");
        }
        if (M == null) {
            M = l.a("/tWater/wtsN.png");
        }
        if (N == null) {
            N = l.a("/tWater/wtsN2.png");
        }
        System.gc();
    }

    public static void c(int n2) {
        d = b * i;
        c = a * i;
        --n2;
        try {
            int n3 = 0;
            while (n3 < a * b) {
                int n4 = 0;
                while (n4 < y[n2].length) {
                    int n5 = y[n2][n4];
                    int[] nArray = z[n2][n4];
                    int n6 = n3;
                    int n7 = 0;
                    while (n7 < nArray.length) {
                        if (f[n6] == nArray[n7]) {
                            int n8 = n6;
                            g[n8] = g[n8] | n5;
                            break;
                        }
                        ++n7;
                    }
                    ++n4;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Error Load Map");
            exception.printStackTrace();
            GameMidlet.f.a();
            return;
        }
    }

    public static boolean f() {
        return l == 45 || l == 46 || l == 48;
    }

    public static boolean g() {
        return j || l == 45 || l == 46 || l == 48 || l == 51 || l == 52 || l == 103 || l == 112 || l == 113 || l == 115 || l == 117 || l == 118 || l == 119 || l == 120 || l == 121 || l == 125 || l == 129 || l == 130;
    }

    private static void a(en en2, int n2, int n3, int n4) {
        try {
            if (J == null) {
                return;
            }
            if (J.length != 1) {
                en2.a(J[n2], n3 * i, n4 * i, 0);
                return;
            }
            en2.a(J[0], 0, n2 * i, i, i, 0, n3 * i, n4 * i, 0);
        }
        catch (Exception exception) {}
    }

    private static void a(en en2, int n2, int n3, int n4, int n5) {
        try {
            if (J == null) {
                return;
            }
            if (J.length == 1) {
                en2.a(J[0], 0, n2 * 24, 24, 24, 0, n3, n4, 0);
                return;
            }
            en2.a(J[n2], n3, n4, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void a(en en2) {
        try {
            int n2;
            int n3;
            if (af.bI) {
                return;
            }
            p.j();
            p.a(en2, 1);
            int n4 = p.o;
            while (n4 < p.q) {
                n3 = p.p;
                while (n3 < p.r) {
                    if (n4 != 0 && n4 != a - 1) {
                        n2 = f[n3 * a + n4] - 1;
                        if ((bv.a(n4, n3) & 0x100) != 256) {
                            if ((bv.a(n4, n3) & 0x20) == 32) {
                                en2.a(K, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if ((bv.a(n4, n3) & 0x80) == 128) {
                                en2.a(L, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if (e != 13 || n2 == -1) {
                                if (e == 2 && (bv.a(n4, n3) & 0x200) == 512 && n2 != -1) {
                                    bv.a(en2, n2, n4 * i, n3 * i, 24);
                                    bv.a(en2, n2, n4 * i, n3 * i + 1, 24);
                                }
                                if ((bv.a(n4, n3) & 0x10) == 16) {
                                    O = n4 * i - p.j;
                                    P = O - p.f;
                                    R = (i - 2) * P / i;
                                    Q = R + p.f;
                                    bv.a(en2, n2, Q + p.j, n3 * i, 24);
                                } else if ((bv.a(n4, n3) & 0x200) == 512) {
                                    if (n2 != -1) {
                                        bv.a(en2, n2, n4 * i, n3 * i, 24);
                                        bv.a(en2, n2, n4 * i, n3 * i + 1, 24);
                                    }
                                } else if (n2 != -1) {
                                    bv.a(en2, n2, n4, n3);
                                }
                            }
                        }
                    }
                    ++n3;
                }
                ++n4;
            }
            if (p.j < 24) {
                n4 = p.p;
                while (n4 < p.r) {
                    n3 = f[n4 * a + 1] - 1;
                    if (n3 != -1) {
                        bv.a(en2, n3, 0, n4);
                    }
                    ++n4;
                }
            }
            if (p.j > p.n) {
                n4 = a - 2;
                n3 = p.p;
                while (n3 < p.r) {
                    n2 = f[n3 * a + n4] - 1;
                    if (n2 != -1) {
                        bv.a(en2, n2, n4 + 1, n3);
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static boolean i() {
        return l != 54 && l != 55 && l != 56 && l != 57 && l != 138 && l != 167;
    }

    public static final void b(en en2) {
        if (main.a.a) {
            return;
        }
        try {
            int n2 = p.o;
            while (n2 < p.q) {
                int n3 = p.p;
                while (n3 < p.r) {
                    if ((bv.a(n2, n3) & 0x40) == 64) {
                        Image image = e == 5 ? M : (e == 8 ? N : h);
                        if (!bv.i()) {
                            en2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 1, 0);
                            en2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 3, 0);
                        }
                        en2.a(image, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, n2 * i, n3 * i - 12, 0);
                        if (H == 0 && bv.i()) {
                            H = n3 * i - 12;
                            int n4 = 0xFFFFFF;
                            if (main.a.ad == 2) {
                                n4 = 10871287;
                            } else if (main.a.ad == 4) {
                                n4 = 8111470;
                            } else if (main.a.ad == 7) {
                                n4 = 5693125;
                            } else if (main.a.ad == 19) {
                                n4 = 0xFF0000;
                            }
                            ed.a(n4, H + 15);
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            ed.b(en2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void d(int n2) {
        InputStream inputStream = ad.a("/mymap/" + n2);
        inputStream = new DataInputStream(inputStream);
        a = (char)((FilterInputStream)inputStream).read();
        b = (char)((FilterInputStream)inputStream).read();
        f = new int[((FilterInputStream)inputStream).available()];
        int n3 = 0;
        while (n3 < a * b) {
            bv.f[n3] = (char)((FilterInputStream)inputStream).read();
            ++n3;
        }
        g = new int[f.length];
    }

    public static final int a(int n2, int n3) {
        try {
            return g[n3 * a + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int b(int n2, int n3) {
        try {
            return g[n3 / i * a + n2 / i];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        try {
            return (g[n3 / i * a + n2 / i] & n4) == n4;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final void b(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] | 0x200;
    }

    public static final void c(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] & 0xFFFFFDFF;
    }

    public static final int e(int n2) {
        return n2 / i * i;
    }

    public static final int f(int n2) {
        return n2 / i * i;
    }

    public static void h() {
        System.gc();
        if (I != e) {
            if (l.c == 5 || l.c == 3 || l.c == 8) {
                if (en.b == 1) {
                    Image[] imageArray = new Image[1];
                    J = imageArray;
                    imageArray[0] = l.c("/t/" + e + ".png");
                } else {
                    J = new Image[100];
                    int n2 = 0;
                    while (n2 < J.length) {
                        bv.J[n2] = l.c("/t/" + e + "/" + (n2 + 1) + ".png");
                        ++n2;
                    }
                }
            } else {
                Image image = l.a("/t/" + e + "$1.png");
                if (image != null) {
                    eu.a("x" + en.b + "t" + e);
                    J = new Image[100];
                    int n3 = 0;
                    while (n3 < J.length) {
                        bv.J[n3] = l.a("/t/" + e + "$" + (n3 + 1) + ".png");
                        ++n3;
                    }
                } else {
                    image = l.a("/t/" + e + ".png");
                    if (image != null) {
                        Image[] imageArray = new Image[1];
                        J = imageArray;
                        imageArray[0] = image;
                    }
                }
            }
            I = e;
        }
    }
}

