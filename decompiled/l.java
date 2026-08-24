/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class l {
    public static boolean a = false;
    public static boolean b = false;
    private static Image i = l.b("/mainImage/black.png");
    public static int c = 1;
    public static byte d = 0;
    public static byte e = 0;
    public static byte f = (byte)5;
    public static String g;
    public static boolean h;

    static {
        h = false;
    }

    public static void a() {
        e = 0;
    }

    public static int a(Image image) {
        if (c == 5) {
            return image.getWidth();
        }
        return image.getWidth();
    }

    public static int b(Image image) {
        if (c == 5) {
            return image.getHeight();
        }
        return image.getWidth();
    }

    public static String a(long l2, int n2, boolean bl2, boolean bl3) {
        long l3 = (l2 + (long)(n2 * 1000) - System.currentTimeMillis()) / 1000L;
        if (l3 <= 0L) {
            return "";
        }
        return String.valueOf(l3);
    }

    public static String a(long l2) {
        int n2;
        String string;
        boolean bl2;
        String string2;
        block9: {
            string2 = "" + l2;
            bl2 = false;
            try {
                if (l2 < 0L) {
                    bl2 = true;
                    l2 = -l2;
                    string2 = "" + l2;
                }
                if (l2 >= 1000000000L) {
                    string = "b";
                    n2 = ("" + (l2 /= 1000000000L)).length();
                    break block9;
                }
                if (l2 >= 1000000L) {
                    string = "m";
                    n2 = ("" + (l2 /= 1000000L)).length();
                    break block9;
                }
                if (l2 >= 1000L) {
                    string = "k";
                    n2 = ("" + (l2 /= 1000L)).length();
                    break block9;
                }
                if (bl2) {
                    return "-" + string2;
                }
                return string2;
            }
            catch (Exception exception) {}
        }
        int n3 = Integer.parseInt(string2.substring(n2, 2));
        string2 = n3 == 0 ? String.valueOf(string2.substring(0, n2)) + string : (n3 % 10 == 0 ? String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 1) + string : String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 2) + string);
        if (bl2) {
            return "-" + string2;
        }
        return string2;
    }

    public static void b() {
        try {
            GameMidlet.f.platformRequest(bs.l);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public static void a(en en2, int n2, int n3, int n4) {
        n4 = n4 / en.a(i) + 1;
        int n5 = 0;
        while (n5 < n4) {
            en2.a(i, n2 + n5 * en.a(i), n3, 0);
            ++n5;
        }
    }

    public static void c() {
        while (ac.b) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    public static void a(boolean bl2) {
        if (main.a.E.equals(em.a)) {
            main.a.a(String.valueOf(aw.x) + " [1]", 8884, null);
            return;
        }
        br.a().c();
        br.b().c();
        bs.c = false;
        if (ac.a) {
            main.a.a(aw.x, 8885, null);
            return;
        }
        x.c = false;
        x.i = bs.a[bs.n];
        if (main.a.E != main.a.ak) {
            ds.c("===========> 2 v\u00e0o OnconnectFail");
        } else {
            main.a.h();
            bs.u = true;
            main.a.ak.b();
        }
        af.bI = false;
        if (bl2) {
            bs.t = 0;
        }
    }

    public static void b(boolean bl2) {
        br.a().c();
        br.b().c();
        if (ac.a) {
            main.a.h.k();
            main.a.a(aw.aF, 8885, null);
            return;
        }
        if (main.a.E != main.a.ak) {
            main.a.a(String.valueOf(aw.x) + " [2]", 8884, null);
        } else {
            main.a.h();
        }
        af.bI = false;
        if (bl2) {
            bs.t = 0;
        }
        main.a.h.k();
    }

    public static Image a(String string) {
        Object object = "/x" + en.b + string;
        ds.c("path load rms= " + string);
        string = bn.a(string);
        if (string == null) {
            object = ds.a((String)object, ".", 0);
            object = ds.a(object[0], "/", 0);
            object = "x" + en.b + object[((String[])object).length - 1];
            byte[] byArray = eu.b((String)object);
            object = byArray;
            if (byArray != null) {
                string = Image.createImage((byte[])object, (int)0, (int)((String[])object).length);
            }
        }
        return string;
    }

    public static Image b(String string) {
        Image image = null;
        try {
            image = bn.a(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static Image c(String string) {
        string = "/x" + en.b + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static void a(en en2) {
        int n2 = 0;
        while (n2 < 5) {
            if (p.bI[n2] != -1 && main.a.d(p.bG[n2], p.bH[n2])) {
                if (p.bJ[n2] == 0) {
                    di.v.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2);
                } else if (p.bJ[n2] == 1) {
                    di.x.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2);
                } else if (p.bJ[n2] == 2) {
                    di.y.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2);
                } else if (p.bJ[n2] == 3) {
                    di.x.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.y);
                } else if (p.bJ[n2] == 8) {
                    di.r.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.f);
                } else if (p.bJ[n2] == 4) {
                    di.s.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.o);
                } else if (p.bJ[n2] == 5) {
                    di.z.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2);
                } else if (p.bJ[n2] == 6) {
                    di.x.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.v);
                } else if (p.bJ[n2] == 7) {
                    di.c.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.f);
                } else if (p.bJ[n2] == 9) {
                    di.p.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.f);
                } else if (p.bJ[n2] == 10) {
                    di.l.b(en2, p.bF[n2], p.bG[n2], p.bH[n2], 2, di.f);
                }
            }
            ++n2;
        }
    }

    public static long d() {
        return System.currentTimeMillis();
    }

    public static df d(String string) {
        df df2 = null;
        bm bm2 = null;
        bm2 = as.a(string, as.a);
        if (bm2.a != null) {
            int n2 = bm2.a.getHeight() / bm2.d;
            if (n2 <= 0) {
                n2 = 1;
            }
            df2 = new df(bm2.a, bm2.a.getWidth(), n2);
        }
        return df2;
    }

    public static void e(String string) {
    }
}

