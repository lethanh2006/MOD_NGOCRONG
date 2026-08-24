/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;
import main.a;

public final class as {
    public static t a = new t("h ImgByName");

    public static void a(String string, Image image, byte by2) {
        a.put(string, new bm(image, by2));
    }

    public static bm a(String string, t t2) {
        bm bm2 = (bm)t2.get(string);
        if (bm2 == null) {
            bm2 = new bm();
            bm bm3 = as.a(string);
            if (bm3 != null) {
                bm2.a = bm3.a;
                bm2.d = bm3.d;
            }
            t2.put(string, bm2);
        }
        bm2.b = main.a.b / 1000L;
        if (bm2.a == null) {
            --bm2.c;
            if (bm2.c <= 0) {
                bt.a().g(string);
                bm2.c = 200;
            }
        }
        return bm2;
    }

    private static bm a(String object) {
        object = String.valueOf(en.b) + "ImgByName_" + (String)object;
        byte[] byArray = eu.b((String)object);
        if (byArray == null) {
            return null;
        }
        try {
            object = new bm();
            new bm().d = byArray[0];
            ((bm)object).a = Image.createImage((byte[])byArray, (int)1, (int)(byArray.length - 1));
        }
        catch (Exception exception) {
            return null;
        }
        return object;
    }

    public static void a(String string, byte by2, byte[] byArray) {
        string = String.valueOf(en.b) + "ImgByName_" + string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by2);
            by2 = 0;
            while (by2 < byArray.length) {
                dataOutputStream.writeByte(byArray[by2]);
                by2 = (byte)(by2 + 1);
            }
            eu.a(string, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void a(t t2, int n2) {
        el el2 = new el("checkDelHash");
        Enumeration enumeration = t2.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            bm bm2 = (bm)t2.get(string);
            if (main.a.b / 1000L - bm2.b <= 600L) continue;
            el2.addElement(string);
        }
        int n3 = 0;
        while (n3 < el2.size()) {
            t2.remove((String)el2.elementAt(n3));
            ++n3;
        }
    }
}

