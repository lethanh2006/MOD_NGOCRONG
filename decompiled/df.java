/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class df {
    public int a;
    public int b;
    public int c;
    public Image d;

    public df(int n2) {
        Image image = ch.a(n2);
        if (image != null) {
            this.d = image;
            this.a = ch.c[n2][0];
            this.b = ch.c[n2][1] / ch.c[n2][2];
            this.c = ch.c[n2][2];
        }
    }

    public df(Image image, int n2, int n3) {
        if (image != null) {
            this.d = image;
            this.a = n2;
            this.b = n3;
            this.c = image.getHeight() / n3;
            if (this.c <= 0) {
                this.c = 1;
            }
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, en en2) {
        try {
            if (this.d != null) {
                if (n2 > this.c) {
                    n2 = this.c;
                }
                en2.a(this.d, 0, n2 * this.b, this.a, this.b, n5, n3, n4, n6);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

