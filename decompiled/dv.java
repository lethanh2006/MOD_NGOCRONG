/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dv {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int p;
    private int q;
    public int i;
    public int j;
    public int k;
    public int l;
    private int r;
    private int s;
    private int[] t = new int[3];
    public boolean m;
    private boolean u;
    private int v;
    public int n;
    public int o;
    private int w;
    private boolean x = true;

    public final ca a() {
        int n2;
        if (this.x) {
            int n3 = 0;
            dv dv2 = this;
            int n4 = dv2.p;
            int n5 = dv2.q;
            int n6 = dv2.i;
            int n7 = dv2.j;
            if (main.a.k) {
                if (!dv2.m && main.a.b(n4, n5, n6, n7)) {
                    n6 = 0;
                    while (n6 < dv2.t.length) {
                        dv2.t[0] = main.a.q;
                        ++n6;
                    }
                    dv2.s = main.a.q;
                    dv2.m = true;
                    dv2.n = -1;
                    dv2.u = dv2.v != 0;
                    dv2.v = 0;
                } else if (dv2.m) {
                    ++dv2.r;
                    if (dv2.r > 5 && dv2.s == main.a.q && !dv2.u) {
                        dv2.s = -1000;
                        if (dv2.w > 1) {
                            n6 = (dv2.b + main.a.q - n5) / dv2.o;
                            n3 = (dv2.a + main.a.p - n4) / dv2.o;
                            dv2.n = n6 * dv2.w + n3;
                        } else {
                            dv2.n = (dv2.b + main.a.q - n5) / dv2.o;
                        }
                    }
                    if ((n6 = main.a.q - dv2.t[0]) != 0 && dv2.n != -1) {
                        dv2.n = -1;
                    }
                    n3 = dv2.t.length - 1;
                    while (n3 > 0) {
                        dv2.t[n3] = dv2.t[n3 - 1];
                        --n3;
                    }
                    dv2.t[0] = main.a.q;
                    dv2.b -= n6;
                    if (dv2.b < 0) {
                        dv2.b = 0;
                    }
                    if (dv2.b > dv2.l) {
                        dv2.b = dv2.l;
                    }
                    if (dv2.d < 0 || dv2.d > dv2.l) {
                        n6 /= 2;
                    }
                    dv2.d -= n6;
                }
            }
            n6 = 0;
            if (main.a.m && dv2.m) {
                n3 = main.a.q - dv2.t[0];
                main.a.m = false;
                if (ds.g(n3) < 20 && ds.g(main.a.q - dv2.s) < 20 && !dv2.u) {
                    dv2.v = 0;
                    dv2.b = dv2.d;
                    dv2.s = -1000;
                    if (dv2.w > 1) {
                        n3 = (dv2.b + main.a.q - n5) / dv2.o;
                        n4 = (dv2.a + main.a.p - n4) / dv2.o;
                        dv2.n = n3 * dv2.w + n4;
                    } else {
                        dv2.n = (dv2.b + main.a.q - n5) / dv2.o;
                    }
                    dv2.r = 0;
                    n6 = 1;
                } else if (dv2.n != -1 && dv2.r > 5) {
                    dv2.r = 0;
                    n6 = 1;
                } else if (dv2.n == -1 && !dv2.u) {
                    if (dv2.d < 0) {
                        dv2.b = 0;
                    } else if (dv2.d > dv2.l) {
                        dv2.b = dv2.l;
                    } else {
                        n3 = main.a.q - dv2.t[0] + (dv2.t[0] - dv2.t[1]) + (dv2.t[1] - dv2.t[2]);
                        n3 = n3 > 10 ? 10 : (n3 < -10 ? -10 : 0);
                        dv2.v = -n3 * 100;
                    }
                }
                dv2.m = false;
                dv2.r = 0;
                main.a.m = false;
            }
            ca ca2 = new ca();
            new ca().b = dv2.n;
            ca2.c = n6;
            ca2.a = dv2.m;
            return ca2;
        }
        dv dv3 = this;
        int n8 = dv3.p;
        int n9 = dv3.q;
        int n10 = dv3.i;
        int n11 = dv3.j;
        if (main.a.k) {
            if (!dv3.m && main.a.b(n8, n9, n10, n11)) {
                n2 = 0;
                while (n2 < dv3.t.length) {
                    dv3.t[0] = main.a.p;
                    ++n2;
                }
                dv3.s = main.a.p;
                dv3.m = true;
                dv3.n = -1;
                dv3.u = dv3.v != 0;
                dv3.v = 0;
            } else if (dv3.m) {
                ++dv3.r;
                if (dv3.r > 5 && dv3.s == main.a.p && !dv3.u) {
                    dv3.s = -1000;
                    dv3.n = (dv3.a + main.a.p - n8) / dv3.o;
                }
                if ((n2 = main.a.p - dv3.t[0]) != 0 && dv3.n != -1) {
                    dv3.n = -1;
                }
                n11 = dv3.t.length - 1;
                while (n11 > 0) {
                    dv3.t[n11] = dv3.t[n11 - 1];
                    --n11;
                }
                dv3.t[0] = main.a.p;
                dv3.a -= n2;
                if (dv3.a < 0) {
                    dv3.a = 0;
                }
                if (dv3.a > dv3.k) {
                    dv3.a = dv3.k;
                }
                if (dv3.c < 0 || dv3.c > dv3.k) {
                    n2 /= 2;
                }
                dv3.c -= n2;
            }
        }
        n2 = 0;
        if (main.a.m && dv3.m) {
            n11 = main.a.p - dv3.t[0];
            main.a.m = false;
            if (ds.g(n11) < 20 && ds.g(main.a.p - dv3.s) < 20 && !dv3.u) {
                dv3.v = 0;
                dv3.a = dv3.c;
                dv3.s = -1000;
                dv3.n = (dv3.a + main.a.p - n8) / dv3.o;
                dv3.r = 0;
                n2 = 1;
            } else if (dv3.n != -1 && dv3.r > 5) {
                dv3.r = 0;
                n2 = 1;
            } else if (dv3.n == -1 && !dv3.u) {
                if (dv3.c < 0) {
                    dv3.a = 0;
                } else if (dv3.c > dv3.k) {
                    dv3.a = dv3.k;
                } else {
                    n8 = main.a.p - dv3.t[0] + (dv3.t[0] - dv3.t[1]) + (dv3.t[1] - dv3.t[2]);
                    n8 = n8 > 10 ? 10 : (n8 < -10 ? -10 : 0);
                    dv3.v = -n8 * 100;
                }
            }
            dv3.m = false;
            dv3.r = 0;
            main.a.m = false;
        }
        ca ca3 = new ca();
        new ca().b = dv3.n;
        ca3.c = n2;
        ca3.a = dv3.m;
        return ca3;
    }

    public final void b() {
        if (this.v != 0 && !this.m) {
            if (this.x) {
                this.b += this.v / 100;
                if (this.b < 0) {
                    this.b = 0;
                } else if (this.b > this.l) {
                    this.b = this.l;
                } else {
                    this.d = this.b;
                }
            } else {
                this.a += this.v / 100;
                if (this.a < 0) {
                    this.a = 0;
                } else if (this.a > this.k) {
                    this.a = this.k;
                } else {
                    this.c = this.a;
                }
            }
            this.v = this.v * 9 / 10;
            if (this.v < 100 && this.v > -100) {
                this.v = 0;
            }
        }
        if (this.c != this.a && !this.m) {
            this.e = this.a - this.c << 2;
            this.g += this.e;
            this.c += this.g >> 4;
            this.g &= 0xF;
        }
        if (this.d != this.b && !this.m) {
            this.f = this.b - this.d << 2;
            this.h += this.f;
            this.d += this.h >> 4;
            this.h &= 0xF;
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, int n8) {
        this.p = n4;
        this.q = n5;
        this.o = n3;
        this.i = n6;
        this.j = n7;
        this.x = true;
        this.w = 1;
        n4 = n2;
        if (false) {
            ++n4;
        }
        this.l = n4 * n3 - n7;
        if (this.l < 0) {
            this.l = 0;
        }
        if (this.k < 0) {
            this.k = 0;
        }
    }

    public final void a(int n2) {
        if (this.x) {
            this.b = n2 -= (this.j - this.o) / 2;
            if (this.b < 0) {
                this.b = 0;
            }
            if (this.b > this.l) {
                this.b = this.l;
                return;
            }
        } else {
            this.a = n2 -= (this.i - this.o) / 2;
            if (this.a < 0) {
                this.a = 0;
            }
            if (this.a > this.k) {
                this.a = this.k;
            }
        }
    }
}

