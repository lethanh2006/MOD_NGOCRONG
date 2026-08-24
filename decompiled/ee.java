/*
 * Decompiled with CFR 0.152.
 */
public final class ee {
    public int a;
    public byte b;
    public dn c;

    public ee() {
    }

    public ee(int n2, int n3) {
        if (n2 == 22) {
            n2 = 6;
            n3 *= 1000;
        }
        if (n2 == 23) {
            n2 = 7;
            n3 *= 1000;
        }
        this.a = n3;
        this.c = p.j().K[n2];
    }

    public final String a() {
        return ai.a(this.c.b, "#", String.valueOf(this.a));
    }
}

