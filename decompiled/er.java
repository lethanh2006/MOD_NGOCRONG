/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class er
extends bb
implements b {
    private static er b;
    public cd[] a;
    private int c;
    private int d;
    private int e;
    private int f;
    private String[] g;
    private String h;
    private cq i;
    private int j;
    private int k;

    public static er a() {
        if (b == null) {
            b = new er();
        }
        return b;
    }

    public final void b() {
        if (l.c == 5 && this.a.length == 1 || l.c == 3 && this.a.length == 1) {
            this.i = new cq();
            this.i.h = this.h;
            this.i.a.i = this.a[0].f;
            this.i.g = "";
            this.i.b = true;
            this.i.a.c(0);
            if (main.a.e) {
                return;
            }
        } else {
            this.j = 0;
            super.b();
        }
    }

    public final void a(int n2, String string) {
        this.k = n2;
        er er2 = this;
        this.h = string;
        er2.e = main.a.A - 20;
        if (er2.e > 320) {
            er2.e = 320;
        }
        ds.c("title= " + string);
        er2.g = di.f.a(string, er2.e - 20);
        er2.c = (main.a.A - er2.e) / 2;
        er2.a = new cd[er2.k];
        er2.f = er2.a.length * 35 + (er2.g.length - 1) * 20 + 40;
        er2.d = main.a.B - er2.f - 40 - (er2.g.length - 1) * 20;
        int n3 = 0;
        while (n3 < er2.a.length) {
            er2.a[n3] = new cd();
            er2.a[n3].i = "";
            er2.a[n3].a = er2.c + 10;
            er2.a[n3].b = er2.d + 35 + (er2.g.length - 1) * 20 + n3 * 35;
            er2.a[n3].c = er2.e - 20;
            er2.a[n3].d = bb.cp + 2;
            er2.a[0].e = !main.a.e;
            if (!main.a.e) {
                er2.co = er2.a[0].j;
            }
            ++n3;
        }
        er2.cm = new de(aw.bj, er2, 1, null);
        er2.cn = new de(aw.bs, er2, 2, null);
        if (main.a.e) {
            er2.cn.j = main.a.A / 2 + 18;
            er2.cm.j = main.a.A / 2 - 85;
            er2.cn.k = er2.cm.k = er2.d + er2.f + 5;
        }
        this.b();
    }

    public final void a(en en2) {
        p.j().a(en2);
        bo.a(en2, this.c, this.d, this.e, this.f, -1, true);
        int n2 = 0;
        while (n2 < this.g.length) {
            di.g.a(en2, this.g[n2], main.a.A / 2, this.d + 15 + n2 * 20, 2);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].a(en2);
            ++n2;
        }
        super.a(en2);
    }

    public final void c() {
        p.j().c();
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].c();
            ++n2;
        }
    }

    public final void a(int n2) {
        int n3 = 0;
        while (n3 < this.a.length) {
            if (this.a[n3].e) {
                this.a[n3].a(n2);
                break;
            }
            ++n3;
        }
        super.a(n2);
    }

    public final void d() {
        if (main.a.i[2]) {
            --this.j;
            if (this.j < 0) {
                this.j = this.a.length - 1;
            }
        } else if (main.a.i[8]) {
            ++this.j;
            if (this.j > this.a.length - 1) {
                this.j = 0;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.f();
            int n2 = 0;
            while (n2 < this.a.length) {
                if (this.j == n2) {
                    this.a[n2].e = true;
                    if (!main.a.e) {
                        this.co = this.a[n2].j;
                    }
                } else {
                    this.a[n2].e = false;
                }
                if (main.a.m && main.a.a(this.a[n2].a, this.a[n2].b, this.a[n2].c, this.a[n2].d)) {
                    this.j = n2;
                    break;
                }
                ++n2;
            }
        }
        super.d();
        main.a.f();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            p.c.b();
            b = null;
        }
        if (n2 == 2) {
            if (l.c == 5 && this.a.length == 1 || l.c == 3 && this.a.length == 1) {
                if (this.i.a.d() == null || this.i.a.d().equals("")) {
                    main.a.a(aw.gj);
                    return;
                }
                this.a[0].a(this.i.a.d());
                bt.a().a(this.a);
                p.c.b();
                return;
            }
            n2 = 0;
            while (n2 < this.a.length) {
                if (this.a[n2].d() == null || this.a[n2].d().equals("")) {
                    main.a.a(aw.gj);
                    return;
                }
                ++n2;
            }
            bt.a().a(this.a);
            p.c.b();
        }
    }
}

