/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class u {
    private byte c;
    public String a;
    public static el b = new el("");
    private static el d = new el("");

    public u(String string, byte by2) {
        this.a = string;
        this.c = by2;
    }

    public static void a() {
        el el2 = new el("");
        Object object = eu.b("ImageSource");
        if (object == null) {
            bt.a().a(el2);
            return;
        }
        d = new el("");
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            int n2 = object.readShort();
            String[] stringArray = new String[n2];
            byte[] byArray = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                stringArray[n3] = object.readUTF();
                byArray[n3] = object.readByte();
                d.addElement(new u(stringArray[n3], byArray[n3]));
                ++n3;
            }
            object.close();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        ds.c("vS size= " + b.size() + " vRMS size= " + d.size());
        bt.a().a(el2);
    }

    public static void b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(b.size());
            int n2 = 0;
            while (n2 < b.size()) {
                dataOutputStream.writeUTF(((u)u.b.elementAt((int)n2)).a);
                dataOutputStream.writeByte(((u)u.b.elementAt((int)n2)).c);
                ++n2;
            }
            eu.a("ImageSource", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}

