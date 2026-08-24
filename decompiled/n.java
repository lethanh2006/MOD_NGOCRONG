/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public abstract class n {
    public de b;
    public de c;
    public de d;

    public void a(en en2) {
        en2.a(-en2.a(), -en2.b());
        en2.e(0, 0, a.A, a.B);
        cx.a(en2, this.b, this.c, this.d);
    }

    public void a(int n2) {
        switch (n2) {
            case -38: 
            case -1: {
                a.j[2] = true;
                a.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                a.j[8] = true;
                a.i[8] = true;
                return;
            }
            case -21: 
            case -6: {
                a.j[12] = true;
                a.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                a.j[13] = true;
                a.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                a.j[5] = true;
                a.i[5] = true;
                return;
            }
            case -27: {
                return;
            }
        }
    }

    public void a() {
        if (this.c != null && (a.i[5] || bb.a(this.c))) {
            a.i[5] = false;
            a.l = false;
            bb.cs = -1;
            a.m = false;
            if (this.c != null) {
                this.c.a();
            }
            bb.cs = -1;
        }
        if (this.b != null && (a.i[12] || bb.a(this.b))) {
            a.i[12] = false;
            a.l = false;
            bb.cs = -1;
            a.m = false;
            if (this.b != null) {
                this.b.a();
            }
            bb.cs = -1;
        }
        if (this.d != null && (a.i[13] || bb.a(this.d))) {
            a.i[13] = false;
            a.l = false;
            a.m = false;
            bb.cs = -1;
            if (this.d != null) {
                this.d.a();
            }
            bb.cs = -1;
        }
        a.f();
        a.g();
    }
}

