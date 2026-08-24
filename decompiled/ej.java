/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ej
implements b {
    public el a = new el("infoWaitToShow");
    public r b;
    public int c = 100;
    private int k;
    public String[] d;
    private int l;
    private int m;
    private boolean n = false;
    private static Image o = l.b("/mainImage/myTexture2dgocnhon.png");
    public int e;
    public int f;
    private int p;
    public int g;
    public int h;
    public int i;
    public int j;

    public final void a() {
        this.d = null;
        this.a.removeAllElements();
    }

    public final void a(en en2, int n2, int n3, int n4) {
        if (this.a.size() != 0) {
            en2.a(n2, n3);
            if (this.d != null && this.d.length != 0 && this.p != 1) {
                int n5;
                int n6 = n5 = en.b == 1 ? 0 : 10;
                if (this.b.c == null) {
                    bo.a(en2, this.g, this.h, this.i, this.j, 0xFFFFFF, false);
                } else {
                    l.a(en2, this.g - 23, this.h - n5 / 2, this.i + 15);
                }
                if (this.b.c == null) {
                    en2.a(o, 0, 0, 9, 8, n4 == 1 ? 0 : 2, this.l - 3 + (n4 == 1 ? -15 : 20), this.m - 20 + this.k + 2, 17);
                }
                n4 = -1;
                int n7 = 0;
                while (n7 < this.d.length) {
                    int n8;
                    di di2 = di.k;
                    String string = this.d[n7];
                    if (this.d[n7].startsWith("|")) {
                        String[] stringArray = ds.a(this.d[n7], "|", 0);
                        if (stringArray.length == 3) {
                            string = stringArray[2];
                        }
                        if (stringArray.length == 4) {
                            string = stringArray[3];
                            Integer.parseInt(stringArray[2]);
                        }
                        n4 = n8 = Integer.parseInt(stringArray[1]);
                    } else {
                        n8 = n4;
                    }
                    switch (n8) {
                        case -1: {
                            di2 = di.k;
                            break;
                        }
                        case 0: {
                            di2 = di.f;
                            break;
                        }
                        case 1: {
                            di2 = di.h;
                            break;
                        }
                        case 2: {
                            di2 = di.b;
                            break;
                        }
                        case 3: {
                            di2 = di.p;
                            break;
                        }
                        case 4: {
                            di2 = di.r;
                            break;
                        }
                        case 5: {
                            di2 = di.q;
                            break;
                        }
                        case 7: {
                            di2 = di.a;
                        }
                    }
                    if (this.b.c == null) {
                        di2.a(en2, string, this.l, this.m - 15 + this.k + n7 * 12 - this.d.length * 12 - 9, 2);
                    } else {
                        n8 = this.g - 23;
                        int n9 = this.h - n5 / 2;
                        int n10 = l.c == 1 ? this.i + 28 : this.i + 25;
                        int n11 = this.j + (main.a.e ? 0 : 14) + n5;
                        en2.a(0x442211);
                        en2.d(n8, n9 + n11, n10, 2);
                        n10 = this.b.f * n10 / this.b.g;
                        if (n10 < 0) {
                            n10 = 0;
                        }
                        en2.a(43758);
                        en2.d(n8, n9 + n11, n10, 2);
                        if (this.b.f == 0) {
                            return;
                        }
                        this.b.c.a(en2, this.g + 5, this.h + this.j / 2, 0);
                        if (en.b == 1) {
                            (this.b.d ? di.F : di.I).a(en2, this.b.c.ag, this.g + 12, this.h + 3, 0);
                        } else {
                            (this.b.d ? di.F : di.I).a(en2, this.b.c.ag, this.g + 12, this.h - 3, 0);
                        }
                        if (!main.a.e) {
                            if (!cd.g) {
                                di.G.a(en2, "Nh\u1ea5n # \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                            } else {
                                di.G.a(en2, "Nh\u1ea5n Y \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                            }
                        }
                        if (en.b == 1) {
                            ag.a(en2, string, this.g + 14, this.h + this.j / 2 + 2, this.i - 16, this.j, di.H);
                        } else {
                            String[] stringArray = di.H.a(string, 120);
                            int n12 = 0;
                            while (n12 < stringArray.length) {
                                di.H.a(en2, stringArray[n12], this.g + 12, this.h + 12 + n12 * 12 - 3, 0);
                                ++n12;
                            }
                            main.a.a(en2);
                        }
                    }
                    ++n7;
                }
            }
            en2.a(-n2, -n3);
        }
    }

    public final void b() {
        if (this.a.size() != 0 && this.b.f == 0) {
            ++this.e;
            if (this.e >= this.b.b) {
                r r2;
                this.e = 0;
                this.a.removeElementAt(0);
                if (this.a.size() == 0) {
                    return;
                }
                this.b = r2 = (r)this.a.firstElement();
                this.c();
            }
        }
    }

    public final void c() {
        int n2;
        this.c = 100;
        if (main.a.A == 128) {
            this.c = 128;
        }
        if (this.b.c != null) {
            this.d = new String[]{this.b.a};
            if (en.b == 1) {
                n2 = this.d.length;
            } else {
                String[] stringArray = di.H.a(this.b.a, 120);
                n2 = stringArray.length;
            }
        } else {
            this.d = di.k.a(this.b.a, this.c - 10);
            n2 = this.d.length;
        }
        this.k = 7;
        this.g = this.l - this.c / 2 - 1;
        this.h = this.m - 15 + this.k - n2 * 12 - 15;
        this.i = this.c + 2 + (this.b.c != null ? 30 : 0);
        this.j = (n2 + 1) * 12 + 1 + (this.b.c != null ? 5 : 0);
    }

    public final void a(String string, int n2, af af2, boolean bl2) {
        this.p = n2;
        if (this.a.size() > 10) {
            this.a.removeElementAt(0);
        }
        if (this.a.size() > 0) {
            string.equals(((r)this.a.lastElement()).a);
        }
        r r2 = new r(string);
        if (this.p == 0) {
            r2.b = string.length();
        }
        if (r2.b < 70) {
            r2.b = 70;
        }
        if (this.p == 1) {
            r2.b = 10000000;
        }
        if (this.p == 3) {
            r2.b = 300;
            r2.h = l.d();
            r2.f = string.length();
            if (r2.f < 15) {
                r2.f = 15;
            }
            if (r2.f > 100) {
                r2.f = 100;
            }
            r2.g = r2.f;
        }
        if (af2 != null) {
            r2.c = af2;
            r2.d = bl2;
            main.a.G.a(r2);
            if (main.a.e && main.a.G.au) {
                p.aE.i = new de(aw.bq, this, 1000, r2);
            }
        }
        if (af2 != null && main.a.G.au || af2 == null) {
            this.a.addElement(r2);
        }
        if (this.a.size() == 1) {
            this.b = (r)this.a.firstElement();
            this.c();
        }
        if (main.a.e && af2 != null && main.a.G.au && main.a.A - 50 > 155 + this.i) {
            p.aE.i.j = main.a.A - this.i - 50;
            p.aE.i.k = 35;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            cq cq2 = cq.b();
            p.j();
            cq2.a(aw.cQ);
        }
    }
}

