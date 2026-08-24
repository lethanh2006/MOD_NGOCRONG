/*
 * Decompiled with CFR 0.152.
 */
public final class dh
extends el {
    public static dh a = new dh("low");
    public static dh b = new dh("mid");
    public static dh c = new dh("mid2");
    public static dh d = new dh("hi");

    private void c() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null) {
                ch2.a();
                if (ch2.b) {
                    this.removeElementAt(n2);
                }
            }
            --n2;
        }
    }

    public static void a() {
        d.c();
        b.c();
        c.c();
        a.c();
    }

    public final void a(en en2) {
        int n2 = 0;
        while (n2 < this.size()) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null && !ch2.b) {
                ((ch)this.elementAt(n2)).a(en2);
            }
            ++n2;
        }
    }

    private void d() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            ch ch2 = (ch)this.elementAt(n2);
            if (ch2 != null) {
                ch2.b = true;
                this.removeElementAt(n2);
            }
            --n2;
        }
    }

    public static void b() {
        d.d();
        a.d();
        b.d();
        c.d();
    }

    public static void a(ch ch2) {
        d.addElement(ch2);
    }

    public static void b(ch ch2) {
        b.addElement(ch2);
    }

    public static void c(ch ch2) {
        c.addElement(ch2);
    }

    public static void d(ch ch2) {
        a.addElement(ch2);
    }

    private dh(String string) {
        super(string);
    }
}

