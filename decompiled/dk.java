/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dk {
    public short a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    int[] o;
    int p;

    public final void a(int n2, int[] nArray, int n3, int n4) {
        if (n2 <= 0) {
            return;
        }
        this.l = n2;
        this.o = nArray;
        this.m = n3;
        this.n = n4;
    }

    public dk() {
        new ej();
        this.l = -1;
        this.m = 0;
        this.n = 0;
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 1;
        this.o = nArray;
        this.c = ds.b(0, 3);
    }

    public final void a() {
        at.a(60, this.i, this.e + 3 + (main.a.w % 10 > 5 ? 1 : 0), 1);
    }
}

