/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class eo {
    public int[][] a = new int[3][];
    public ej b = new ej();
    private int j;
    private int k;
    private int l;
    private int m;
    public int c;
    private int n;
    private int o;
    private int p;
    public int d;
    private int q;
    private int r;
    public boolean e;
    public boolean f = true;
    public int g;
    public int h;
    public de i;

    public eo() {
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2] = new int[3];
            ++n2;
        }
    }

    public final void a(en en2) {
        if (this.equals(p.aE) && p.j().u()) {
            return;
        }
        if (this.equals(p.aE) && p.j().bQ != null) {
            return;
        }
        if (!p.bt) {
            return;
        }
        if (main.a.E != p.j() && main.a.E != ar.a()) {
            return;
        }
        if (ae.n != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        if (af.bG) {
            return;
        }
        if (main.a.G.a && this.equals(p.aE)) {
            return;
        }
        en2.a(-en2.a(), -en2.b());
        en2.e(0, 0, main.a.A, main.a.B);
        if (this.b != null) {
            this.b.a(en2, this.d, this.c, this.j);
        }
        if (this.b.b != null && this.b.b.c == null && this.a != null) {
            bl.b(en2, this.a[af.e().K][this.k], this.d, this.c + 3 + (main.a.w % 10 > 5 ? 1 : 0), this.j == 1 ? 0 : 2, cj.f);
        }
        en2.a(-en2.a(), -en2.b());
    }

    public final void a() {
        if (this.b != null && this.b.a != null && this.b.a.size() == 0 && this.c != -40) {
            --this.b.f;
            if (this.b.f <= 0) {
                this.c = -40;
                this.b.e = 0;
                this.b.a.removeAllElements();
                this.b.d = null;
                this.b.f = 200;
            }
        }
        if (this.equals(p.aE) && p.j().bQ != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        Object object = this;
        if (((eo)object).c != ((eo)object).m) {
            ((eo)object).o = ((eo)object).m - ((eo)object).c << 2;
            ((eo)object).n += ((eo)object).o;
            ((eo)object).c += ((eo)object).n >> 4;
            ((eo)object).n &= 0xF;
        }
        if (((eo)object).d != ((eo)object).p) {
            ((eo)object).r = ((eo)object).p - ((eo)object).d << 2;
            ((eo)object).q += ((eo)object).r;
            ((eo)object).d += ((eo)object).q >> 4;
            ((eo)object).q &= 0xF;
        }
        ++((eo)object).l;
        if (((eo)object).l == 5) {
            ((eo)object).l = 0;
            ((eo)object).k = ((eo)object).k == 0 ? 1 : 0;
        }
        if (this.b == null) {
            return;
        }
        if (this.b != null && this.b.b == null) {
            return;
        }
        if (!this.e) {
            if (this.g > 0) {
                --this.g;
                if (this.g == 0) {
                    main.a.G.l();
                    main.a.G.s();
                }
            }
            if (main.a.w % 3 == 0) {
                if (af.e().I == 1) {
                    this.p = af.e().B - 20 - p.j;
                }
                if (af.e().I == -1) {
                    this.p = af.e().B + 20 - p.j;
                }
                if (this.p <= 24) {
                    this.p += this.b.c / 2;
                }
                if (this.p >= main.a.A - 24) {
                    this.p -= this.b.c / 2;
                }
                this.m = af.e().C - 40 - p.k;
                if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                    this.m = (this.b.d.length + 1) * 12 + 10;
                }
                if (this.b.b.c != null) {
                    if (main.a.A - 50 > 155 + this.b.i) {
                        this.p = main.a.A - 60 - this.b.i / 2;
                        this.m = this.b.j + 10;
                    } else {
                        this.p = main.a.A - 20 - this.b.i / 2;
                        this.m = 45 + this.b.j;
                        if (main.a.A > main.a.B || main.a.A < 220) {
                            this.p = main.a.A - 20 - this.b.i / 2;
                            this.m = this.b.j + 10;
                        }
                    }
                }
            }
            this.j = this.d > af.e().B - p.j ? -1 : 1;
        }
        if (this.b.b != null) {
            if (this.b.a.size() > 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.b.e = 0;
                        this.b.a.removeElementAt(0);
                        this.b.b = object = (r)this.b.a.firstElement();
                        this.b.c();
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.b.a.removeElementAt(0);
                        if (this.b.a.size() == 0) {
                            return;
                        }
                        this.b.b = object = (r)this.b.a.firstElement();
                        this.b.c();
                        return;
                    }
                }
            } else if (this.b.a.size() == 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.e = true;
                    }
                    if (this.b.e == this.b.b.b) {
                        this.m = -40;
                        this.p = af.e().B - p.j + (af.e().I == 1 ? -20 : 20);
                    }
                    if (this.b.e >= this.b.b.b + 20) {
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.b.f = 200;
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.e = true;
                        this.m = -40;
                        this.p = af.e().B - p.j + (af.e().I == 1 ? -20 : 20);
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final void a(String string, af af2, boolean bl2) {
        this.h = af2.J;
        this.b.a(string, 3, af2, bl2);
        this.e = false;
    }

    public final void a(String string, int n2) {
        string = ds.a(string);
        if (this.b.a.size() > 0 && string.equals(((r)this.b.a.lastElement()).a)) {
            return;
        }
        if (this.b.a.size() > 10) {
            int n3 = 0;
            while (n3 < 5) {
                this.b.a.removeElementAt(0);
                ++n3;
            }
        }
        this.b.a(string, n2, null, false);
        if (this.b.a.size() == 1) {
            this.c = 0;
            this.d = af.e().B - p.j + (af.e().I == 1 ? -20 : 20);
        }
        this.e = false;
    }
}

