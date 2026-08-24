/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class y {
    public byte a;
    private ByteArrayOutputStream b = null;
    private DataOutputStream c = null;
    private ByteArrayInputStream d = null;
    private DataInputStream e = null;

    public y() {
    }

    public y(byte by2) {
        this.a = by2;
        this.b = new ByteArrayOutputStream(1024);
        this.c = new DataOutputStream(this.b);
    }

    public y(byte by2, byte[] byArray) {
        this.a = by2;
        this.d = new ByteArrayInputStream(byArray);
        this.e = new DataInputStream(this.d);
    }

    public final byte[] a() {
        return this.b.toByteArray();
    }

    public final int b() {
        return this.e.readInt();
    }

    public final DataInputStream c() {
        return this.e;
    }

    public final DataOutputStream d() {
        return this.c;
    }

    public final void e() {
        try {
            if (this.e != null) {
                this.e.close();
            }
            if (this.c != null) {
                this.c.close();
                return;
            }
        }
        catch (IOException iOException) {}
    }
}

