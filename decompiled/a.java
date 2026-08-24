/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;

public final class a
extends bb
implements b {
    public static a a;
    private cd b;
    private cd c;
    private int d;
    private int e;
    private int f = main.a.A - 20;
    private int g;
    private String[] h;
    private int i;

    public a() {
        if (this.f > 320) {
            this.f = 320;
        }
        this.h = di.g.a(aw.bc, this.f - 20);
        this.d = (main.a.A - this.f) / 2;
        this.e = main.a.B - 150 - (this.h.length - 1) * 20;
        this.g = 110 + (this.h.length - 1) * 20;
        this.b = new cd();
        this.b.i = aw.ba;
        this.b.a = this.d + 10;
        this.b.b = this.e + 35 + (this.h.length - 1) * 20;
        this.b.c = this.f - 20;
        this.b.d = bb.cp + 2;
        this.b.e = !main.a.e;
        this.b.c(0);
        if (!main.a.e) {
            this.co = this.b.j;
        }
        this.c = new cd();
        this.c.i = aw.bb;
        this.c.a = this.d + 10;
        this.c.b = this.b.b + 35;
        this.c.c = this.f - 20;
        this.c.d = bb.cp + 2;
        this.c.e = false;
        this.c.c(0);
        this.cm = new de(aw.bj, this, 1, null);
        this.cn = new de(aw.bd, this, 2, null);
        if (main.a.e) {
            this.cn.j = main.a.A / 2 + 18;
            this.cm.j = main.a.A / 2 - 85;
            this.cn.k = this.cm.k = this.e + this.g + 5;
        }
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public final void b() {
        this.i = 0;
        try {
            if (aw.fB == 0) {
                GameMidlet.f.platformRequest("http://ngocrongonline.com/");
            }
            if (aw.fB == 2) {
                GameMidlet.f.platformRequest("http://dragonball.indonaga.com/");
            }
            if (aw.fB == 1) {
                GameMidlet.f.platformRequest("http://world.teamobi.com/games-page-0.html");
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(en en2) {
        p.j().a(en2);
        bo.a(en2, this.d, this.e, this.f, this.g, -1, true);
        int n2 = 0;
        while (n2 < this.h.length) {
            di.g.a(en2, this.h[n2], main.a.A / 2, this.e + 15 + n2 * 20, 2);
            ++n2;
        }
        this.b.a(en2);
        this.c.a(en2);
        super.a(en2);
    }

    public final void c() {
        p.j().c();
        this.b.c();
        this.c.c();
    }

    public final void a(int n2) {
        if (this.b.e) {
            this.b.a(n2);
        } else if (this.c.e) {
            this.c.a(n2);
        }
        super.a(n2);
    }

    public final void d() {
        if (main.a.i[2]) {
            --this.i;
            if (this.i < 0) {
                this.i = 1;
            }
        } else if (main.a.i[8]) {
            ++this.i;
            if (this.i > 1) {
                this.i = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.f();
            if (this.i == 1) {
                this.b.e = false;
                this.c.e = true;
                if (!main.a.e) {
                    this.co = this.c.j;
                }
            } else if (this.i == 0) {
                this.b.e = true;
                this.c.e = false;
                if (!main.a.e) {
                    this.co = this.b.j;
                }
            } else {
                this.b.e = false;
                this.c.e = false;
            }
        }
        if (main.a.m) {
            if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.i = 0;
            } else if (main.a.a(this.c.a, this.c.b, this.c.c, this.c.d)) {
                this.i = 1;
            }
        }
        super.d();
        main.a.f();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            p.c.b();
            a = null;
        }
        if (n2 == 2) {
            if (this.b.d() == null || this.b.d().equals("")) {
                main.a.a(aw.be);
                return;
            }
            if (this.c.d() == null || this.c.d().equals("")) {
                main.a.a(aw.bf);
                return;
            }
            bt.a().a(this.b.d(), this.c.d());
            p.c.b();
            a = null;
        }
    }
}

