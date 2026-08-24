/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bn {
    private static byte[] a = new byte[]{-22, 2, 12, 4, 5, 2, -10};
    private int b = 0;

    public static Image a(String string) {
        Image image = null;
        string = "/x" + en.b + string;
        try {
            Object object = new DataInputStream("".getClass().getResourceAsStream(string));
            int n2 = ((FilterInputStream)object).available();
            byte[] byArray = new byte[n2];
            ((DataInputStream)object).read(byArray, 0, n2);
            object = new bn();
            new bn().b = 0;
            int n3 = 0;
            while (n3 < byArray.length) {
                byte by2 = byArray[n3];
                Object object2 = object;
                by2 = (byte)(a[((bn)object2).b++] & 0xFF ^ by2 & 0xFF);
                if (((bn)object2).b >= a.length) {
                    ((bn)object2).b %= a.length;
                }
                byArray[n3] = by2;
                ++n3;
            }
            image = Image.createImage((byte[])byArray, (int)0, (int)n2);
        }
        catch (IOException iOException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (NullPointerException nullPointerException) {}
        if (image == null) {
            try {
                image = Image.createImage((String)string);
            }
            catch (IOException iOException) {
                return null;
            }
        }
        return image;
    }
}

