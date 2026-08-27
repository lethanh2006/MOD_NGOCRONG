/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cq
implements b {
    private static cq i;
    public cd a;
    public boolean b = false;
    public bx c;
    private long j = 0L;
    public de d;
    public de e;
    public de f = null;
    private int k;
    // CFR dat ten field nay la "l", trung voi class l dung o l.c.
    private int chatY;
    private int m;
    private int n;
    public String g;
    public String h = String.valueOf(aw.bq) + " ";

    public final void a() {
        this.d = new de(aw.bs, this, 8000, null, 1, main.a.B - bb.cr + 1);
        this.e = new de(aw.bk, this, 8001, null, main.a.A - 70, main.a.B - bb.cr + 1);
        this.f = null;
        this.m = this.a.c + 28;
        this.n = this.a.d + 26;
        this.k = main.a.A / 2 - this.m / 2;
        this.chatY = this.a.b - 18;
        if (this.m > 320) {
            this.m = 320;
        }
        this.d.j = this.k;
        this.e.j = this.k + this.m - 68;
        if (main.a.e) {
            this.a.b -= 5;
            this.chatY -= 20;
            this.n += 30;
            this.d.j = main.a.A / 2 - 68 - 5;
            this.e.j = main.a.A / 2 + 5;
            this.d.k = main.a.B - 30;
            this.e.k = main.a.B - 30;
        }
    }

    public final void a(int n2) {
        if (this.b) {
            this.a.a(n2);
        }
        if (this.a.d().equals("")) {
            this.e.b = aw.bj;
            return;
        }
        this.e.b = aw.bk;
    }

    public static cq b() {
        if (i == null) {
            i = new cq();
            return i;
        }
        return i;
    }

    public cq() {
        this.a = new cd();
        this.a.i = aw.bq;
        this.a.c = main.a.A - 32;
        if (this.a.c > 250) {
            this.a.c = 250;
        }
        this.a.d = bb.cp + 2;
        this.a.a = main.a.A / 2 - this.a.c / 2;
        this.a.e = true;
        this.a.b(80);
    }

    public final void a(int n2, bx bx2, String string) {
        this.e.b = aw.bj;
        this.g = string;
        this.a.a(n2);
        if (!this.a.d().equals("") && main.a.K == null) {
            this.c = bx2;
            this.b = true;
        }
    }

    public final void a(String string) {
        this.e.b = aw.bj;
        this.g = string;
        if (main.a.K == null) {
            this.b = true;
            if (main.a.e) {
                this.a.a();
            }
        }
    }

    public final void c() {
        if (!this.b) {
            return;
        }
        if (l.c != 5 && l.c != 3) {
            this.a.c();
        }
        if (this.a.h) {
            this.a.h = false;
            this.a(this.a.d(), this.g);
            this.a.a("");
            this.e.b = aw.bj;
        }
    }

    public final void a(en en2) {
        if (!this.b) {
            return;
        }
        if (l.c == 5 || l.c == 3) {
            return;
        }
        bo.a(en2, this.k, this.chatY, this.m, this.n, -1, true);
        di.g.a(en2, String.valueOf(this.h) + this.g, this.a.a, this.a.b - (main.a.e ? 17 : 12), 0);
        cx.a(en2, this.d, this.f, this.e);
        this.a.a(en2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                ds.c("perform chat 1");
                if (this.c == null) break;
                long l2 = System.currentTimeMillis();
                if (l2 - this.j < 1000L) {
                    return;
                }
                this.j = l2;
                this.a(this.a.d(), this.g);
                this.a.a("");
                this.e.b = aw.bj;
                return;
            }
            case 8001: {
                ds.c("perform chat 2");
                if (this.a.d().equals("")) {
                    this.b = false;
                    this.c.D();
                }
                this.a.b();
            }
        }
    }

    /** Gui chat binh thuong, nhung giu lenh ts lai o client. */
    private void a(String message, String context) {
        if (this.c instanceof p && AutoAttackMod.handleChat(message)) {
            this.b = false;
            return;
        }
        this.c.a(message, context);
    }
}
