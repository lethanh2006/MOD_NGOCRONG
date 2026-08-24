/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bh {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    public int a;
    public int b;
    public int c;
    private int i;
    private int j;
    private int[] k = new int[3];
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;

    public bh() {
    }

    public bh(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.f = n2;
        this.g = n3;
        this.d = n4;
        this.e = n5;
        this.c = 0;
        if (this.c < 0) {
            this.c = 0;
        }
    }

    public final void a() {
        int n2;
        int n3;
        if (this.c <= 0) {
            return;
        }
        if (main.a.k) {
            if (!this.l && main.a.b(this.f, this.g, this.d, this.e)) {
                n3 = 0;
                while (n3 < this.k.length) {
                    this.k[n3] = main.a.q;
                    ++n3;
                }
                this.j = main.a.q;
                this.l = true;
                this.m = this.n != 0;
                this.n = 0;
            } else if (this.l) {
                ++this.i;
                if (this.i > 5 && this.j == main.a.q && !this.m) {
                    this.j = -1000;
                }
                if ((n3 = main.a.q - this.k[0]) != 0 && this.h != -1) {
                    this.h = -1;
                }
                n2 = this.k.length - 1;
                while (n2 > 0) {
                    this.k[n2] = this.k[n2 - 1];
                    --n2;
                }
                this.k[0] = main.a.q;
                this.a -= n3;
                if (this.a < 0) {
                    this.a = 0;
                }
                if (this.a > this.c) {
                    this.a = this.c;
                }
                if (this.b < 0 || this.b > this.c) {
                    n3 /= 2;
                }
                this.b -= n3;
            }
        }
        if (main.a.l && this.l) {
            n3 = main.a.q - this.k[0];
            main.a.l = false;
            if (ds.g(n3) < 20 && ds.g(main.a.q - this.j) < 20 && !this.m && main.a.o) {
                this.n = 0;
                this.a = this.b;
                this.j = -1000;
                this.i = 0;
            } else if (this.h != -1 && this.i > 5) {
                this.i = 0;
            } else if (this.h == -1 && !this.m) {
                if (this.b < 0) {
                    this.a = 0;
                } else if (this.b > this.c) {
                    this.a = this.c;
                } else {
                    n2 = main.a.q - this.k[0] + (this.k[0] - this.k[1]) + (this.k[1] - this.k[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.n = -n2 * 100;
                }
            }
            this.l = false;
            this.i = 0;
            main.a.l = false;
        }
        if (this.b <= 0) {
            this.b = 0;
        }
        if (this.b >= this.c) {
            this.b = this.c;
        }
    }

    public final void b() {
        if (this.n != 0 && !this.l) {
            this.a += this.n / 100;
            if (this.a < 0) {
                this.a = 0;
            } else if (this.a > this.c) {
                this.a = this.c;
            } else {
                this.b = this.a;
            }
            this.n = this.n * 9 / 10;
            if (this.n < 100 && this.n > -100) {
                this.n = 0;
            }
        }
        if (this.b != this.a && !this.l) {
            this.o = this.a - this.b << 2;
            this.p += this.o;
            this.b += this.p >> 4;
            this.p &= 0xF;
        }
    }
}

