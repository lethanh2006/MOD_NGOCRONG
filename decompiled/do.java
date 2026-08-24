/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public class do
extends af {
    public ap df;
    public static ap[] dg;
    public boolean dh;
    private int a;
    private int b;
    public static boolean di;
    private static int c;
    public int[] dj;
    private int d;
    private long e;
    private long f;
    public int dk;

    static {
        int[] nArray = new int[]{1, -1, 1, -1};
        int[] nArray2 = new int[]{1, -1, -1, 1};
    }

    public do(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bd = true;
        this.aO = n7;
        ds.c("npc avatar= " + this.aO);
        this.B = n4;
        this.C = n5;
        this.cl = n4;
        this.cm = n5;
        this.H = n3;
        if (n2 != -1) {
            this.df = dg[n6];
        }
        if (n6 == 23 || n6 == 42) {
            this.al = 45;
        }
        if (n6 == 51) {
            this.bd = false;
            this.a = n3;
            ds.c("duaHau = " + n3);
        }
        if (this.df != null) {
            if (this.df.b == null) {
                this.df.b = "";
            }
            this.df.b = ds.a(this.df.b);
        }
    }

    public final void a(byte by2, int n2) {
        this.a = by2;
        this.e = this.f = System.currentTimeMillis();
        this.d = n2;
        ds.c("in ra second= " + this.d);
    }

    public static void aa() {
        int n2 = 0;
        while (n2 < p.G.size()) {
            do do_ = (do)p.G.elementAt(n2);
            ((do)p.G.elementAt(n2)).ca = null;
            do_.bZ = -1;
            ++n2;
        }
    }

    public void a() {
        block10: {
            block13: {
                block11: {
                    block12: {
                        if (this.df.a == 51) {
                            this.f = System.currentTimeMillis();
                            if (this.f - this.e >= 1000L) {
                                --this.d;
                                this.e = this.f;
                                if (this.d < 0) {
                                    this.d = 0;
                                }
                            }
                        }
                        if (this.bd) {
                            this.H();
                        }
                        if (this.ca != null) break block10;
                        byte[] byArray = new byte[]{-1, 9, 9, 10, 10, 11, 11};
                        if (af.e().L < 9 || af.e().L > 10 || af.e().ax.a <= 0 || byArray[af.e().ax.a] != this.df.a) break block11;
                        if (af.e().aD != null) break block12;
                        this.ca = p.y[57];
                        break block13;
                    }
                    if (af.e().aD == null || af.e().aD.a + 1 != af.e().aD.f.length) break block10;
                    this.ca = p.y[62];
                    break block13;
                }
                p.j();
                byte by2 = p.x();
                if (af.e().aD == null && by2 == this.df.a) break block13;
                if (af.e().aD == null || by2 != this.df.a) break block10;
                int cfr_ignored_0 = af.e().aD.a + 1;
                int cfr_ignored_1 = af.e().aD.f.length;
                this.ca = p.y[98];
            }
            this.bZ = 0;
        }
        super.a();
        if (bv.l == 51) {
            this.I = this.B > af.e().B ? -1 : 1;
            if (this.df.a % 2 == 0) {
                if (this.as == 1) {
                    this.as = 0;
                    return;
                }
                this.as = 1;
            }
        }
    }

    public void a(en en2) {
        if (af.bI) {
            return;
        }
        if (this.dh) {
            return;
        }
        if (!this.G()) {
            return;
        }
        if (this.H == 15) {
            return;
        }
        if (this.aN != 0) {
            super.a(en2);
            return;
        }
        if (this.df == null) {
            return;
        }
        if (this.df.a != 4 && this.df.a != 51 && this.df.a != 50) {
            en2.a(bv.x, this.B, this.C, 3);
        }
        if (this.df.a == 3) {
            bl.b(en2, 265, this.B, this.C, 0, 33);
            if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                en2.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al + 4, 33);
            }
            this.b = 60;
        } else if (this.df.a != 4) {
            if (this.df.a == 50 || this.df.a == 51) {
                if (this.dj != null) {
                    if (this.df.a == 50 && di) {
                        ea ea2;
                        ++c;
                        if (main.a.w % 3 == 0) {
                            ea2 = new ea(19, this.B + ds.b(-50, 50), this.C, 2, 1, -1);
                            ei.a(ea2);
                        }
                        if (main.a.w % 15 == 0) {
                            ea2 = new ea(18, this.B + ds.b(-5, 5), this.C + ds.b(-90, 0), 2, 1, -1);
                            ei.a(ea2);
                        }
                        if (c == 100) {
                            p.j().b(this.B, this.C);
                        }
                        if (c == 110) {
                            di = false;
                            this.df.a = 4;
                        }
                    }
                    int n2 = 0;
                    if (bl.c[this.dj[this.a]] != null && bl.c[this.dj[this.a]].a != null) {
                        n2 = en.b(bl.c[this.dj[this.a]].a);
                    }
                    bl.b(en2, this.dj[this.a], this.B + ds.b(-1, 1), this.C, 0, 33);
                    if (af.e().aT != null && af.e().aT.equals(this)) {
                        if (ae.m == null) {
                            en2.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9 + 16 - n2, 33);
                        }
                        di.c.a(en2, ai.b(this.d), this.B, this.C - this.al - 16 - di.k.a() - 20 - n2 + 16, 2, di.f);
                    } else {
                        di.c.a(en2, ai.b(this.d), this.B, this.C - this.al - 8 - di.k.a() - 20 - n2 + 16, 2, di.f);
                    }
                }
            } else if (this.df.a == 6) {
                bl.b(en2, 545, this.B, this.C + 5, 0, 33);
                if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                    en2.a(aa.R, 0, 0, 9, 6, 0, this.B, this.C - this.al - 9, 33);
                }
                di.c.a(en2, String.valueOf(bv.n), this.B, this.C - this.al + 19 - di.k.a(), 2);
            } else {
                int n3 = this.df.c;
                int n4 = this.df.e;
                int n5 = this.df.d;
                av av2 = p.x[n3];
                av av3 = p.x[n4];
                av av4 = p.x[n5];
                if (this.I == 1) {
                    bl.b(en2, av2.a[af.bC[this.as][0][0]].a, this.B + af.bC[this.as][0][1] + av2.a[af.bC[this.as][0][0]].b, this.C - af.bC[this.as][0][2] + av2.a[af.bC[this.as][0][0]].c, 0, 0);
                    bl.b(en2, av3.a[af.bC[this.as][1][0]].a, this.B + af.bC[this.as][1][1] + av3.a[af.bC[this.as][1][0]].b, this.C - af.bC[this.as][1][2] + av3.a[af.bC[this.as][1][0]].c, 0, 0);
                    bl.b(en2, av4.a[af.bC[this.as][2][0]].a, this.B + af.bC[this.as][2][1] + av4.a[af.bC[this.as][2][0]].b, this.C - af.bC[this.as][2][2] + av4.a[af.bC[this.as][2][0]].c, 0, 0);
                } else {
                    bl.b(en2, av2.a[af.bC[this.as][0][0]].a, this.B - af.bC[this.as][0][1] - av2.a[af.bC[this.as][0][0]].b, this.C - af.bC[this.as][0][2] + av2.a[af.bC[this.as][0][0]].c, 2, 24);
                    bl.b(en2, av3.a[af.bC[this.as][1][0]].a, this.B - af.bC[this.as][1][1] - av3.a[af.bC[this.as][1][0]].b, this.C - af.bC[this.as][1][2] + av3.a[af.bC[this.as][1][0]].c, 2, 24);
                    bl.b(en2, av4.a[af.bC[this.as][2][0]].a, this.B - af.bC[this.as][2][1] - av4.a[af.bC[this.as][2][0]].b, this.C - af.bC[this.as][2][2] + av4.a[af.bC[this.as][2][0]].c, 2, 24);
                }
                if (bv.l != 51) {
                    int n6 = 15;
                    if (this.df.a == 47) {
                        n6 = 47;
                    }
                    if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                        int n7 = 0;
                        int n8 = 0;
                        if (af.e().aT.df.a == 28 || af.e().aT.df.a == 41) {
                            n7 = 3;
                            n8 = -12;
                        }
                        en2.a(aa.R, 0, 0, 9, 6, 0, this.B + n7, this.C - this.al - (n6 - 8) + n8, 33);
                    }
                }
                this.b = 65;
            }
        }
        if (this.bZ >= 0 && this.ca != null && this.aN == 0) {
            bl.b(en2, this.ca.a[this.bZ].c, this.B + this.ca.a[this.bZ].a, this.C + this.ca.a[this.bZ].b - this.b, 0, 3);
            if (main.a.w % 2 == 0) {
                ++this.bZ;
                if (this.bZ >= this.ca.a.length) {
                    this.bZ = 0;
                }
            }
        }
    }

    public final void e(en en2) {
        if (af.bI) {
            return;
        }
        if (this.dh) {
            return;
        }
        if (!this.G()) {
            return;
        }
        if (this.H == 15) {
            return;
        }
        if (this.df == null) {
            return;
        }
        if (this.df.a == 3) {
            if (af.e().aT != null && af.e().aT.equals(this)) {
                di.n.a(en2, this.df.b, this.B, this.C - this.al - di.k.a() - 5, 2, di.o);
            } else {
                di.n.a(en2, this.df.b, this.B, this.C - this.al - 3 - di.k.a(), 2, di.o);
            }
            this.b = 60;
            return;
        }
        if (this.df.a != 4) {
            if (this.df.a == 50 || this.df.a == 51) {
                if (this.dj != null) {
                    int n2 = 0;
                    if (bl.c[this.dj[this.a]] != null && bl.c[this.dj[this.a]].a != null) {
                        n2 = en.b(bl.c[this.dj[this.a]].a);
                    }
                    if (af.e().aT != null && af.e().aT.equals(this)) {
                        di.n.a(en2, this.df.b, this.B, this.C - this.al - di.k.a() - n2, 2, di.o);
                        return;
                    }
                    di.n.a(en2, this.df.b, this.B, this.C - this.al - 8 - di.k.a() - n2 + 16, 2, di.o);
                    return;
                }
            } else {
                if (this.df.a == 6) {
                    if (af.e().aT != null && af.e().aT.equals(this)) {
                        di.n.a(en2, this.df.b, this.B, this.C - this.al - di.k.a() - 16, 2, di.o);
                        return;
                    }
                    di.n.a(en2, this.df.b, this.B, this.C - this.al - 8 - di.k.a(), 2, di.o);
                    return;
                }
                if (bv.l != 51) {
                    int n3 = 15;
                    if (this.df.a == 47) {
                        n3 = 47;
                    }
                    if (af.e().aT != null && af.e().aT.equals(this)) {
                        if (bv.l != 113) {
                            int n4 = 0;
                            int n5 = 0;
                            if (af.e().aT.df.a == 28 || af.e().aT.df.a == 41) {
                                n4 = 3;
                                n5 = -12;
                            }
                            di.n.a(en2, this.df.b, this.B + n4, this.C - this.al - di.k.a() - n3 + n5, 2, di.o);
                        }
                    } else {
                        n3 = 8;
                        if (this.df.a == 47) {
                            n3 = 40;
                        }
                        if (bv.l != 113) {
                            int n6 = 0;
                            int n7 = 0;
                            if (this.df.a == 28 || this.df.a == 41) {
                                n6 = 3;
                                n7 = -12;
                            }
                            di.n.a(en2, this.df.b, this.B + n6, this.C - this.al - n3 - di.k.a() + n7, 2, di.o);
                        }
                    }
                }
                this.b = 65;
            }
        }
    }

    public final void k() {
        this.H = 15;
        af.x = null;
    }
}

