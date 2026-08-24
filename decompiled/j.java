/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class j
extends n {
    private String[] e;
    public cd a;
    private int f = 40;

    public j() {
        if (main.a.A <= 176) {
            this.f = 10;
        }
        this.a = new cd();
        this.a.a = this.f + 10;
        this.a.b = main.a.B - bb.cp - 43;
        this.a.c = main.a.A - 2 * (this.f + 10);
        this.a.d = bb.cp + 2;
        this.a.e = true;
        this.d = this.a.j;
    }

    public final void a(String object, de de2, int n2) {
        this.a.a("");
        this.a.c(n2);
        this.e = di.t.a((String)object, main.a.A - (this.f << 1));
        this.b = new de(aw.bj, main.a.a(), 8882, null);
        this.c = de2;
        object = this;
        main.a.K = object;
    }

    public final void a(en en2) {
        main.a.M.a(en2, this.f, main.a.B - 77 - bb.cr, main.a.A - (this.f << 1), 69, this.e);
        this.a.a(en2);
        super.a(en2);
    }

    public final void a(int n2) {
        this.a.a(n2);
        super.a(n2);
    }

    public final void a() {
        this.a.c();
        super.a();
    }
}

