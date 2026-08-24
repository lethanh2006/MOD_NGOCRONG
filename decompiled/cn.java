/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cn {
    public static el a = new el("vTeleport");
    public int b;
    public int c;
    private int f;
    private int g;
    private boolean h;
    private int i;
    public int d;
    private int j;
    private int k;
    private static Image[] l = new Image[5];
    private static Image m;
    private boolean n;
    private boolean o;
    private boolean p = false;
    public boolean e;
    private boolean q;
    private int r;
    private int s = 1;
    private int t;
    private int u;
    private boolean v;
    private boolean w;

    public cn(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7) {
        this.b = n2;
        this.c = 5;
        this.i = n3;
        ds.c("TELEPORT x= " + n2 + " y= " + n3 + " type= " + n6);
        this.f = n4;
        this.g = n6;
        this.h = bl2;
        this.j = n5;
        this.k = n7;
        this.r = 0;
        n3 = 0;
        while (n3 < 100) {
            ++n3;
            this.i += 12;
            if (!bv.a(n2, this.i, 2)) continue;
            if (this.i % 24 == 0) break;
            this.i -= this.i % 24;
            break;
        }
        ds.c("Y2= " + this.i + "--------------------------------------------------------------");
        this.o = true;
        this.n = false;
        if (this.k > 2) {
            this.i += 4;
            if (l[3] == null) {
                cn.l[3] = l.c("/mainImage/myTexture2dmaybay4a.png");
            }
            if (l[4] == null) {
                cn.l[4] = l.c("/mainImage/myTexture2dmaybay4b.png");
            }
            if (m == null) {
                m = l.c("/mainImage/hole.png");
            }
        } else if (l[n7] == null) {
            cn.l[n7] = l.b("/mainImage/myTexture2dmaybay" + (n7 + 1) + ".png");
        }
        if (n2 > p.j && n2 < p.j + main.a.A && this.i > 100) {
            bu.a();
            bu.a();
            this.p = true;
            bu.a();
        }
    }

    public static void a(cn cn2) {
        a.addElement(cn2);
    }

    public final void a(en en2) {
        if (this.k > 2 && this.v) {
            en2.a(m, this.b, this.i + 20, cj.c);
        }
    }

    public final void b(en en2) {
        if (af.bI) {
            return;
        }
        if (this.b < p.j || this.b > p.j + main.a.A) {
            return;
        }
        av av2 = p.x[this.f];
        int n2 = 0;
        int n3 = 0;
        if (this.k == 0) {
            n2 = 15;
            n3 = 40;
        }
        if (this.k == 1) {
            n2 = 7;
            n3 = 55;
        }
        if (this.k == 2) {
            n2 = 18;
            n3 = 52;
        }
        if (this.q && this.k < 3) {
            bl.b(en2, av2.a[af.bC[0][0][0]].a, this.b + (this.j == 1 ? n2 : -n2), this.c - n3, this.j == 1 ? 0 : 2, cj.a);
        }
        if (this.k < 3) {
            en2.a(l[this.k], 0, 0, en.a(l[this.k]), en.b(l[this.k]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.o) {
            if (this.r > 10) {
                en2.a(l[4], 0, 0, en.a(l[4]), en.b(l[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
                return;
            }
            en2.a(l[3], 0, 0, en.a(l[3]), en.b(l[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
            return;
        }
        if (this.r < 20) {
            en2.a(l[4], 0, 0, en.a(l[4]), en.b(l[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, cj.c);
            return;
        }
        en2.a(l[3], 0, 0, en.a(l[3]), en.b(l[3]), this.j == 1 ? 2 : 0, this.b, this.c, cj.c);
    }

    public final void a() {
        if (this.k > 2 && this.e && this.c != -80) {
            if (this.o && this.r == 0) {
                if (main.a.w % 3 == 0) {
                    at.a(1, this.b, this.c, 1, 0);
                }
            } else if (this.n && main.a.w % 3 == 0) {
                at.a(1, this.b, this.c + 16, 1, 1);
            }
        }
        ++this.t;
        if (this.t > 3) {
            this.t = 0;
        }
        if (this.o) {
            this.e = true;
            boolean bl2 = this.q = this.g != 0;
            if (this.k < 3) {
                int n2 = this.i - this.c >> 3;
                if (n2 <= 0) {
                    n2 = 1;
                    this.e = false;
                }
                this.c += n2;
            } else {
                if (main.a.w % 2 == 0) {
                    ++this.s;
                }
                if (this.i - this.c < this.s) {
                    this.c = this.i;
                    this.e = false;
                } else {
                    this.c += this.s;
                }
            }
            if (this.h && this.g == 1 && af.e().s) {
                af.e().B = this.b;
                af.e().C = this.c - 30;
                af.e().H = 4;
                p.l = this.b - p.f;
                p.m = this.c - p.g - 1;
                p.aD.f = false;
            }
            if (p.b(this.d) != null && !this.h && this.g == 1 && p.b((int)this.d).s) {
                p.b((int)this.d).B = this.b;
                p.b((int)this.d).C = this.c - 30;
                p.b((int)this.d).H = 4;
            }
            if (ds.g(this.c - this.i) < 50 && bv.a(this.b, this.c, 2)) {
                this.v = true;
                if (this.k < 3) {
                    bu.a();
                    if (this.c % 24 != 0) {
                        this.c -= this.c % 24;
                    }
                    ++this.r;
                    if (this.r > 10) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.h) {
                            af.e().s = false;
                        } else if (p.b(this.d) != null) {
                            p.b((int)this.d).s = false;
                        }
                        this.q = false;
                    }
                } else {
                    this.c = this.i;
                    if (!this.w) {
                        at.a(92, this.b + 4, this.c + 14, 1, 0);
                        p.bu = 10;
                        this.w = true;
                    }
                    ++this.r;
                    if (this.r > 30) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.h) {
                            af.e().s = false;
                        } else if (p.b(this.d) != null) {
                            p.b((int)this.d).s = false;
                        }
                        this.q = false;
                    }
                }
            }
        } else if (this.n) {
            ++this.r;
            if (this.r > 30) {
                int n3 = this.i + 24 - this.c >> 3;
                if (n3 > 30) {
                    n3 = 30;
                }
                this.c -= n3;
                this.e = true;
            } else {
                if (this.r == 14 && this.p) {
                    bu.a();
                }
                if (this.r > 0 && this.g == 0) {
                    if (this.h) {
                        af.e().s = false;
                        if (af.e().H != 14) {
                            af.e().H = 3;
                        }
                        af.e().E = -3;
                    } else if (p.b(this.d) != null) {
                        p.b((int)this.d).s = false;
                        if (p.b((int)this.d).H != 14) {
                            p.b((int)this.d).H = 3;
                        }
                        p.b((int)this.d).E = -3;
                    }
                    this.q = false;
                }
                if (this.r > 12 && this.g == 0) {
                    if (this.h) {
                        af.e().s = true;
                    } else if (p.b(this.d) != null) {
                        p.b((int)this.d).B = this.b;
                        p.b((int)this.d).C = this.c;
                        p.b((int)this.d).s = true;
                    }
                    this.q = true;
                }
            }
            if (this.h) {
                if (this.g == 0) {
                    p.l = this.b - p.f;
                    p.m = this.c - p.g - 1;
                }
                if (this.g == 1) {
                    p.aD.f = true;
                }
            }
            if (this.c <= -80) {
                if (this.h && this.g == 0) {
                    ac.b = false;
                    af.bG = true;
                }
                if (!this.h && p.b(this.d) != null && this.g == 0) {
                    p.D.removeElement(p.b(this.d));
                }
                if (this.k < 3) {
                    a.removeElement(this);
                } else {
                    this.c = -80;
                    ++this.u;
                    if (this.u > 80) {
                        this.u = 0;
                        a.removeElement(this);
                    }
                }
            }
        }
        if (this.e && this.k < 3 && ds.g(this.c - this.i) <= 50 && main.a.w % 5 == 0) {
            ea ea2 = new ea(19, this.b, this.i + 20, 2, 1, -1);
            ei.a(ea2);
        }
    }
}

