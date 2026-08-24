/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ef {
    public byte a;
    public byte b;
    public byte c;
    public byte d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public byte j;
    public byte k;
    public af l;
    public aa m;
    public ee[] n;
    int[] o;
    int p;
    long q;
    public ae r;
    private el s;

    public ef() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.o = nArray;
        this.p = 0;
        this.s = new el("");
    }

    public final void a(byte by2, byte by3) {
        this.b = by2;
        this.c = by3;
    }

    public final void a(byte by2) {
        this.j = by2;
        this.a();
    }

    public final void b(byte by2) {
        this.k = by2;
        this.a();
    }

    public static ef a(el el2, int n2) {
        if (el2 != null) {
            int n3 = 0;
            while (n3 < el2.size()) {
                ef ef2 = (ef)el2.elementAt(n3);
                if (ef2 != null && ef2.e == n2) {
                    return ef2;
                }
                ++n3;
            }
        }
        return null;
    }

    public final void a() {
        Object object;
        this.r = new ae();
        String string = "";
        string = String.valueOf(string) + "\n|6|" + this.i;
        string = String.valueOf(string) + "\n--";
        if (this.n != null) {
            int n2 = 0;
            while (true) {
                int n3 = 0;
                int n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].b) {
                        ++n3;
                        break;
                    }
                    ++n4;
                }
                if (n3 == 0) break;
                string = n2 == 0 ? String.valueOf(string) + "\n|6|2|--" + aw.h + "--" : String.valueOf(string) + "\n|6|2|--" + aw.g + " Lv." + n2 + "--";
                n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].b) {
                        String string2 = "1";
                        if (this.j == 0) {
                            string2 = "2";
                        } else if (this.n[n4].b != 0) {
                            if (this.k == 0) {
                                string2 = "2";
                            } else if (this.j < this.n[n4].b) {
                                string2 = "2";
                            }
                        }
                        string = String.valueOf(string) + "\n|" + string2 + "|1|" + (String)object;
                    }
                    ++n4;
                }
                if (n3 == 0) continue;
                ++n2;
            }
        }
        object = this.r;
        this.r.a = aq.d;
        ((ae)object).e = aq.b;
        ((ae)object).d = di.k.a(string, ((ae)object).a - 8);
        ((ae)object).b = 10000000;
        ((ae)object).i = null;
        ((ae)object).g = ((ae)object).d.length * 12;
        ((ae)object).f = aq.c;
        ((ae)object).t = 10;
        ((ae)object).h = ((ae)object).g - aq.e;
        if (((ae)object).h < 0) {
            ((ae)object).h = 0;
        }
    }

    public final void a(en en2, int n2, int n3) {
        ef ef2 = this;
        if (ef2.b == ef2.c && ef2.s.size() == 0) {
            int n4 = ds.b(1, 5);
            int n5 = 0;
            while (n5 < n4) {
                be be2 = new be();
                new be().a = ds.b(5, 25);
                be2.b = ds.b(5, 25);
                be2.d = n5 * ds.b(0, 8);
                be2.e = 0;
                be2.c = -1;
                ef2.s.addElement(be2);
                ++n5;
            }
        }
        int n6 = 0;
        while (n6 < this.s.size()) {
            be be3 = (be)this.s.elementAt(n6);
            if (be3 != null) {
                if (be3.e < be3.d) {
                    ++be3.e;
                }
                if (be3.e >= be3.d) {
                    be3.c = main.a.w / 3 % (aq.a.c + 1);
                    if (be3.c >= aq.a.c) {
                        this.s.removeElementAt(n6);
                        --n6;
                    } else {
                        aq.a.a(be3.c, n2 + be3.a, n3 + be3.b, 0, 3, en2);
                    }
                }
            }
            ++n6;
        }
    }
}

