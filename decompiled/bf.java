/*
 * Decompiled with CFR 0.152.
 */
public final class bf {
    public et a;
    public short b;
    public int c;
    public long d;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public boolean j = false;
    public short k;
    public String l;
    public short m;

    public final String a() {
        if (this.e % 1000 == 0) {
            return String.valueOf(this.e / 1000);
        }
        int n2 = this.e % 1000;
        return String.valueOf(this.e / 1000) + "." + (n2 % 100 == 0 ? n2 / 100 : n2 / 10);
    }
}

