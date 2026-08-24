/*
 * Decompiled with CFR 0.152.
 */
public final class ax
extends dc {
    private cp a;
    private int b;
    private int c;
    private int d;
    private short e = 0;
    private long f = 0L;

    public static void a(int n2, int n3, int n4, int n5) {
        ax ax2 = new ax();
        new ax().a = p.y[n2 - 1];
        ax2.c = n3;
        ax2.d = n4;
        ax2.e = (short)2;
        dc.w.addElement(ax2);
    }

    public final void a(en en2) {
        if (en.b == 1) {
            ++p.aN;
        }
        if (p.aN < 8) {
            int n2 = this.c + this.a.a[this.b].a;
            int n3 = this.d + this.a.a[this.b].b;
            bl.b(en2, this.a.a[this.b].c, n2, n3, 0, 3);
        }
    }

    public final void a() {
        if (0L != 0L) {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.b = 0;
            }
            if (System.currentTimeMillis() > 0L) {
                dc.w.removeElement(this);
                return;
            }
        } else {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.e = (short)(this.e - 1);
                if (this.e <= 0) {
                    dc.w.removeElement(this);
                    return;
                }
                this.b = 0;
            }
        }
    }
}

