/*
 * Decompiled with CFR 0.152.
 */
package main;

import main.a;

public final class b {
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 28;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    public int a;
    private int u;
    private boolean v = false;
    public boolean b;
    public boolean c;
    public boolean d;

    public b() {
        if (main.a.A < 300) {
            this.b = true;
            this.c = false;
            this.d = false;
        }
        if (main.a.A >= 300 && main.a.A <= 380) {
            this.b = false;
            this.c = true;
            this.d = false;
        }
        if (main.a.A > 380) {
            this.b = false;
            this.c = false;
            this.d = true;
        }
        if (!this.d) {
            this.s = 0;
            this.a = main.a.C;
            this.t = main.a.D >> 1;
            this.u = main.a.B - 80;
            return;
        }
        this.s = 0;
        this.a = main.a.C / 4 * 3 - 20;
        this.t = main.a.D >> 1;
        this.u = main.a.B;
        if (l.c == 2) {
            this.s = 0;
            this.t = (main.a.B >> 1) + 40;
            this.a = main.a.C / 4 * 3 - 40;
            this.u = main.a.B;
        }
    }

    public final void a() {
        block26: {
            try {
                if (p.aO == 0) {
                    return;
                }
                if (main.a.k && !main.a.m) {
                    boolean bl2;
                    block27: {
                        this.m = main.a.r;
                        this.n = main.a.s;
                        if (this.m < 0 || this.m > this.a || this.n < this.t || this.n > this.u) break block26;
                        if (!this.v) {
                            this.e = this.g = this.m;
                            this.f = this.h = this.n;
                        }
                        this.v = true;
                        this.o = main.a.p - this.e;
                        this.p = main.a.q - this.f;
                        this.q = ds.e(this.o, 2) + ds.e(this.p, 2);
                        this.l = ds.f(this.q);
                        if (ds.g(this.o) <= 4 && ds.g(this.p) <= 4) break block26;
                        this.r = ds.a(this.o, this.p);
                        if (!main.a.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k)) {
                            if (this.l != 0) {
                                this.h = this.p * this.k / this.l;
                                this.g = this.o * this.k / this.l;
                                this.g += this.e;
                                this.h += this.f;
                                if (!ds.a(this.e - this.k, this.f - this.k, 2 * this.k, 2 * this.k, this.g, this.h)) {
                                    this.g = this.i;
                                    this.h = this.j;
                                } else {
                                    this.i = this.g;
                                    this.j = this.h;
                                }
                            } else {
                                this.g = this.i;
                                this.h = this.j;
                            }
                        } else {
                            this.g = main.a.p;
                            this.h = main.a.q;
                        }
                        main.a.g();
                        int n2 = 2;
                        if (p.aO == 0) {
                            bl2 = false;
                        } else if (af.e().H == 3) {
                            bl2 = true;
                        } else {
                            n2 = 2;
                            while (n2 > 0) {
                                int n3 = main.a.v[n2].a - main.a.v[n2 - 1].a;
                                int n4 = main.a.v[n2].b - main.a.v[n2 - 1].b;
                                if (ds.g(n3) > 2 && ds.g(n4) > 2) {
                                    bl2 = false;
                                    break block27;
                                }
                                --n2;
                            }
                            bl2 = true;
                        }
                    }
                    if (bl2) {
                        if (this.r <= 360 && this.r >= 340 || this.r >= 0 && this.r <= 20) {
                            main.a.j[6] = true;
                            main.a.i[6] = true;
                            return;
                        }
                        if (this.r > 40 && this.r < 70) {
                            main.a.j[6] = true;
                            main.a.i[6] = true;
                            return;
                        }
                        if (this.r >= 70 && this.r <= 110) {
                            main.a.j[8] = true;
                            main.a.i[8] = true;
                            return;
                        }
                        if (this.r > 110 && this.r < 120) {
                            main.a.j[4] = true;
                            main.a.i[4] = true;
                            return;
                        }
                        if (this.r >= 120 && this.r <= 200) {
                            main.a.j[4] = true;
                            main.a.i[4] = true;
                            return;
                        }
                        if (this.r > 200 && this.r < 250) {
                            main.a.j[2] = true;
                            main.a.i[2] = true;
                            main.a.j[4] = true;
                            main.a.i[4] = true;
                            return;
                        }
                        if (this.r >= 250 && this.r <= 290) {
                            main.a.j[2] = true;
                            main.a.i[2] = true;
                            return;
                        }
                        if (this.r > 290 && this.r < 340) {
                            main.a.j[2] = true;
                            main.a.i[2] = true;
                            main.a.j[6] = true;
                            main.a.i[6] = true;
                            return;
                        }
                        break block26;
                    }
                    main.a.g();
                    return;
                }
                this.e = 45;
                this.g = 45;
                this.h = !this.d ? (this.f = main.a.B - 90) : (this.f = main.a.B - 45);
                this.v = false;
                main.a.g();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void a(en en2) {
        if (p.aO == 0) {
            return;
        }
        this.s = 0;
        this.t = (main.a.B >> 1) + 40;
        this.a = main.a.C / 4 * 3 - 40;
        this.u = main.a.B;
        en2.a(p.aA, this.e, this.f, 3);
        en2.a(p.aB, this.g, this.h, 3);
    }

    public final boolean b() {
        if (p.aO == 0) {
            return false;
        }
        return this.v;
    }

    public final boolean c() {
        block3: {
            try {
                if (p.aO != 0) break block3;
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        boolean bl2 = main.a.p >= 0 && main.a.p <= 0 + this.a && main.a.q >= this.t && main.a.q <= this.t + this.u || main.a.p >= 0 && main.a.p <= main.a.A && main.a.q >= this.t && main.a.q <= this.t + this.u || main.a.p >= main.a.A - 50;
        return bl2;
    }
}

