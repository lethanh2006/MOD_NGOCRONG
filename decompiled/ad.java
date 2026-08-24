/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class ad {
    private Random b;
    Vector a;
    private int[] c;

    public ad(int n2, int n3, int n4, int n5) {
        this.b = new Random();
        this.a = new Vector();
        this.c = new int[]{0xFF0000, 0xFFFF00, 65280, 0xFFFFFF, 255, 65535, 0xF0F0F0, 0xC0C0C0};
        n4 = 0;
        while (n4 < 72) {
            this.a.addElement(new aj(n2, n3, Math.abs(this.b.nextInt() % 8) + 3, n4 * 5, this.c[Math.abs(this.b.nextInt() % this.c.length)]));
            ++n4;
        }
    }

    public ad() {
    }

    public static InputStream a(String string) {
        return "".getClass().getResourceAsStream(string);
    }
}

