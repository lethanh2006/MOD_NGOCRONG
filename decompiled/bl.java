/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class bl {
    public static int[][] a;
    public static Image[] b;
    public static eg[] c;
    public static el d;
    private static Image h;
    public static byte[] e;
    public static el f;
    private static int i;
    public static short g;

    static {
        d = new el("vKeys");
        h = null;
        f = new el("");
    }

    public static void a() {
        if (b == null) {
            b = new Image[]{l.a("/img/Big0.png"), l.a("/img/Big1.png"), l.a("/img/Big2.png"), l.a("/img/Big3.png")};
            System.gc();
        }
    }

    public static void b() {
        System.gc();
        h = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
    }

    public bl() {
        bl.e();
    }

    public static void c() {
        new bl();
    }

    private static void e() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NR_image")));
            int n2 = dataInputStream.readShort();
            a = new int[n2][5];
            int n3 = 0;
            while (n3 < n2) {
                bl.a[n3][0] = dataInputStream.readUnsignedByte();
                bl.a[n3][1] = dataInputStream.readShort();
                bl.a[n3][2] = dataInputStream.readShort();
                bl.a[n3][3] = dataInputStream.readShort();
                bl.a[n3][4] = dataInputStream.readShort();
                if (!(n3 >= 84 && n3 <= 90 || n3 >= 372 && n3 <= 384 || n3 >= 371 && n3 <= 377 || a[n3][1] < 256 && a[n3][3] < 256 && a[n3][2] < 256 && a[n3][4] < 256)) {
                    bl.a[n3] = null;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void a(int n2) {
        if (en.b == 1) {
            Image image = l.b("/SmallImage/Small" + n2 + ".png");
            if (image != null) {
                bl.c[n2] = new eg(image, n2);
                return;
            }
            bl.c[n2] = new eg(h, n2);
            if (main.a.E == main.a.am) {
                bt.a().p(n2);
                return;
            }
            f.addElement(c[n2]);
            return;
        }
        Image image = l.b("/SmallImage/Small" + n2 + ".png");
        if (image != null) {
            bl.c[n2] = new eg(image, n2);
            return;
        }
        boolean bl2 = false;
        Object object = eu.b(String.valueOf(en.b) + "Small" + n2);
        if (object != null) {
            if (e != null && ((byte[])object).length % 127 != e[n2]) {
                bl2 = true;
            }
            if (!bl2) {
                Image image2 = Image.createImage((byte[])object, (int)0, (int)((byte[])object).length);
                object = image2;
                if (image2 != null) {
                    bl.c[n2] = new eg((Image)object, n2);
                } else {
                    bl2 = true;
                }
            }
        } else {
            bl2 = true;
        }
        if (bl2) {
            bl.c[n2] = new eg(h, n2);
            if (main.a.E == main.a.am) {
                bt.a().p(n2);
                return;
            }
            f.addElement(c[n2]);
        }
    }

    public static void a(en en2, int n2, int n3, int n4, int n5, int n6) {
        bl.b(en2, n2, n3, n4, 0, n6);
    }

    public static void b(en en2, int n2, int n3, int n4, int n5, int n6) {
        try {
            if (b == null) {
                eg eg2 = c[n2];
                if (eg2 == null) {
                    bl.a(n2);
                    return;
                }
                en2.a(eg2.a, 0, 0, en.a(eg2.a), en.b(eg2.a), n5, n3, n4, n6);
                return;
            }
            if (a != null) {
                if (n2 >= a.length || a[n2] == null || a[n2][1] >= 256 || a[n2][3] >= 256 || a[n2][2] >= 256 || a[n2][4] >= 256) {
                    eg eg3 = c[n2];
                    if (eg3 == null) {
                        bl.a(n2);
                        return;
                    }
                    eg3.a(en2, n5, n3, n4, n6);
                    return;
                }
                if (a[n2][0] != 4 && b[a[n2][0]] != null) {
                    en2.a(b[a[n2][0]], a[n2][1], a[n2][2], a[n2][3], a[n2][4], n5, n3, n4, n6);
                    return;
                }
                eg eg4 = c[n2];
                if (eg4 == null) {
                    bl.a(n2);
                    return;
                }
                eg4.a(en2, n5, n3, n4, n6);
                return;
            }
            if (main.a.E != p.j()) {
                eg eg5 = c[n2];
                if (eg5 == null) {
                    bl.a(n2);
                    return;
                }
                eg5.a(en2, n5, n3, n4, n6);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void a(en en2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        try {
            if (b == null) {
                eg eg2 = c[n2];
                if (eg2 == null) {
                    bl.a(n2);
                    return;
                }
                en2.a(eg2.a, 0, n3 * n6, n6, n7, n8, n4, n5, n9);
                return;
            }
            if (a != null) {
                if (n2 >= a.length || a[n2] == null || a[n2][1] >= 256 || a[n2][3] >= 256 || a[n2][2] >= 256 || a[n2][4] >= 256) {
                    eg eg3 = c[n2];
                    if (eg3 == null) {
                        bl.a(n2);
                        return;
                    }
                    eg3.a(en2, n8, n3, n4, n5, n6, n7, n9);
                    return;
                }
                if (a[n2][0] != 4 && b[a[n2][0]] != null) {
                    en2.a(b[a[n2][0]], 0, n3 * n6, n6, n7, n8, n4, n5, n9);
                    return;
                }
                eg eg4 = c[n2];
                if (eg4 == null) {
                    bl.a(n2);
                    return;
                }
                eg4.a(en2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
            if (main.a.E != p.j()) {
                eg eg5 = c[n2];
                if (eg5 == null) {
                    bl.a(n2);
                    return;
                }
                eg5.a(en2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void d() {
        int n2 = 0;
        if (main.a.w % 1000 == 0) {
            int n3 = 0;
            while (n3 < c.length) {
                if (c[n3] != null) {
                    ++n2;
                    eg eg2 = c[n3];
                    ++eg2.d;
                    if (eg2.d - eg2.c > 1 && !af.e().a(eg2.b)) {
                        bl.c[eg2.b] = null;
                    }
                    ++i;
                }
                ++n3;
            }
            if (n2 > 200 && main.a.a) {
                c = new eg[g];
            }
        }
    }
}

