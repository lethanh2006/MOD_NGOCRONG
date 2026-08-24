/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bc
extends n {
    private String[] e;
    public boolean a;
    private int f;
    private int g = 35;
    private long h = -1L;

    public bc() {
        if (main.a.A <= 176) {
            this.g = 10;
        }
        if (main.a.A > 320) {
            this.g = 80;
        }
    }

    public final void b() {
        this.a(aw.aC, null, null, null);
        main.a.K = this;
        this.h = l.d() + 5000L;
    }

    public final void c() {
        main.a.K = this;
        this.h = -1L;
    }

    public final void a(String string) {
        this.e = di.t.a(string, main.a.A - ((this.g << 1) + 20));
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * di.t.a() + 20;
        }
    }

    public final void a(String string, de de2, de de3, de de4) {
        this.e = di.t.a(string, main.a.A - ((this.g << 1) + 20));
        this.b = de2;
        this.c = de3;
        this.d = de4;
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * di.t.a() + 20;
        }
        if (main.a.e) {
            if (de2 != null) {
                this.b.j = main.a.A / 2 - 68 - 5;
                this.b.k = main.a.B - 50;
            }
            if (de4 != null) {
                this.d.j = main.a.A / 2 + 5;
                this.d.k = main.a.B - 50;
            }
            if (de3 != null) {
                this.c.j = main.a.A / 2 - 35;
                this.c.k = main.a.B - 50;
            }
        }
        this.a = false;
        this.h = -1L;
    }

    public final void a(en en2) {
        en2.e(0, 0, main.a.A, main.a.B);
        if (x.c) {
            return;
        }
        int n2 = main.a.B - this.f - 38;
        int n3 = main.a.A - (this.g << 1);
        cx.a(this.g, n2, n3, this.f, en2);
        n2 = n2 + (this.f - this.e.length * di.t.a()) / 2 - 2;
        if (this.a) {
            main.a.a(main.a.C, (n2 += 8) - 12, en2);
        }
        n3 = 0;
        while (n3 < this.e.length) {
            di.f.a(en2, this.e[n3], main.a.C, n2, 2);
            ++n3;
            n2 += di.t.a();
        }
        super.a(en2);
    }

    public final void a() {
        super.a();
        if (this.h != -1L && l.d() > this.h) {
            main.a.h();
        }
    }
}

