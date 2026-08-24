/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public class bb {
    public de cm;
    public de cn;
    public de co;
    public static int cp;
    public static int cq;
    public static int cr;
    public static int cs;

    static {
        cq = 68;
        cr = 26;
        cs = -1;
    }

    public void b() {
        a.f();
        a.g();
        a.E = this;
        a.h.setFullScreenMode(true);
    }

    public void a(int n2) {
    }

    public void c() {
    }

    public void d() {
        if (a.i[5] || bb.a(a.E.cn)) {
            a.i[5] = false;
            cs = -1;
            a.m = false;
            if (this.cn != null) {
                this.cn.a();
            }
        }
        if (a.i[12] || bb.a(a.E.cm)) {
            a.i[12] = false;
            cs = -1;
            a.m = false;
            if (cq.b().b) {
                if (cq.b().d != null) {
                    cq.b().d.a();
                }
            } else if (this.cm != null) {
                this.cm.a();
            }
        }
        if (a.i[13] || bb.a(a.E.co)) {
            a.i[13] = false;
            cs = -1;
            a.m = false;
            if (cq.b().b) {
                if (cq.b().e != null) {
                    cq.b().e.a();
                    return;
                }
            } else if (this.co != null) {
                this.co.a();
            }
        }
    }

    public static boolean a(de de2) {
        if (de2 == null) {
            return false;
        }
        if (de2.j >= 0 && de2.k != 0) {
            return de2.c();
        }
        if (a.K != null) {
            if (a.K.c != null && a.a(a.A - cq >> 1, a.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (de2 == a.K.c && a.l && a.m) {
                    return true;
                }
            }
            if (a.K.b != null && a.a(0, a.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (de2 == a.K.b && a.l && a.m) {
                    return true;
                }
            }
            if (a.K.d != null && a.a(a.A - cq, a.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if ((de2 == a.K.d || de2 == cq.b().e) && a.l && a.m) {
                    return true;
                }
            }
        } else {
            if (de2 == a.E.cm && a.a(0, a.B - cr - 5, cq, cr + 10)) {
                cs = 0;
                if (a.l && a.m) {
                    return true;
                }
            }
            if (de2 == a.E.co && a.a(a.A - cq, a.B - cr - 5, cq, cr + 10)) {
                cs = 2;
                if (a.l && a.m) {
                    return true;
                }
            }
            if ((de2 == a.E.cn || ae.m != null) && a.a(a.A - cq >> 1, a.B - cr - 5, cq, cr + 10)) {
                cs = 1;
                if (a.l && a.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(en en2) {
        en2.a(-en2.a(), -en2.b());
        en2.e(0, 0, a.A, a.B + 1);
        if (!cq.b().b && a.K == null && !a.F.a) {
            cx.a(en2, this.cm, this.cn, this.co);
        }
    }
}

