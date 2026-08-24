/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class en {
    public Graphics a;
    public static int b = 1;

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.fillArc(n2 *= b, n3 *= b, n4 *= b, n5 *= b, 0, 360);
    }

    public final void a(Image image, int n2, int n3, int n4) {
        if (image == null) {
            return;
        }
        this.a.drawImage(image, n2 *= b, n3 *= b, n4);
    }

    public final void a(Image object, float f2, float f3, int n2) {
        int n3 = n2;
        float f4 = f3;
        f3 = f2;
        Image image = object;
        object = this;
        if (image != null) {
            object.a.drawImage(image, (int)(f3 *= (float)b), (int)(f4 *= (float)b), n3);
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a.drawLine(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        this.a.setColor(n6);
        this.a.fillRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final void b(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, n4, n5);
    }

    public final void c(int n2, int n3, int n4, int n5) {
        this.d(n2, n3, 1, n5);
        this.d(n2 + n4, n3, 1, n5);
        this.d(n2, n3, n4, 1);
        this.d(n2, n3 + n5, n4 + 1, 1);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.a.drawRegion(image, n2 *= b, n3 *= b, n4 *= b, n5 *= b, n6, n7 *= b, n8 *= b, n9);
    }

    public final void b(Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (image == null) {
            return;
        }
        this.a(image, 0, n3, n4, n5, n6, n7, n8, n9);
    }

    public final void a(Image image, int n2, int n3, int n4, int n5) {
        n2 = 0;
        while (n2 < n4 / en.a(image) + 1) {
            n3 = 0;
            while (n3 < n5 / en.b(image) + 1) {
                this.a.drawImage(image, 0 + n2 * en.a(image), 0 + n3 * en.b(image), 0);
                ++n3;
            }
            ++n2;
        }
    }

    public static int a(float f2, int n2, int n3) {
        ds.c("blend color");
        f2 = n3 >> 16 & 0xFF;
        float f3 = n3 >> 8 & 0xFF;
        float f4 = n3 & 0xFF;
        f2 *= 0.4f;
        f3 *= 0.4f;
        f4 *= 0.4f;
        if (f2 > 255.0f) {
            f2 = 255.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 255.0f) {
            f4 = 255.0f;
        }
        int n4 = 0xFF000000 | (int)f2 << 16 | (int)f3 << 8 | (int)f4 & 0xFF;
        return n4;
    }

    public final void d(int n2, int n3, int n4, int n5) {
        this.a.fillRect(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final int a() {
        return this.a.getTranslateX() / b;
    }

    public final int b() {
        return this.a.getTranslateY() / b;
    }

    public final void e(int n2, int n3, int n4, int n5) {
        this.a.setClip(n2 *= b, n3 *= b, n4 *= b, n5 *= b);
    }

    public final int c() {
        return this.a.getClipX();
    }

    public final int d() {
        return this.a.getClipY();
    }

    public final int e() {
        return this.a.getClipWidth();
    }

    public final int f() {
        return this.a.getClipHeight();
    }

    public final void a(int n2) {
        this.a.setColor(n2);
    }

    public final void a(int n2, int n3) {
        this.a.translate(n2 *= b, n3 *= b);
    }

    public static int a(Image image) {
        return image.getWidth() / b;
    }

    public static int b(Image image) {
        return image.getHeight() / b;
    }

    public static int c(Image image) {
        return image.getWidth();
    }

    public static int d(Image image) {
        return image.getHeight();
    }
}

