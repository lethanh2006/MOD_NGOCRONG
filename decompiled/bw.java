/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bw
implements b {
    public short a;
    public short b;
    public short c;
    public short d;
    public boolean e;
    public boolean f;
    public bo g;

    public bw(short s2, short s3, short s4, short s5, boolean bl2, boolean bl3, String string) {
        this.a = s2;
        this.b = s3;
        this.c = s4;
        this.d = s5;
        string = ds.a(string);
        this.e = bl2;
        this.f = bl3;
        if ((bv.l == 21 || bv.l == 22 || bv.l == 23) && this.a >= 0 && this.a <= 24) {
            return;
        }
        if ((bv.l == 0 && af.e().K != 0 || bv.l == 7 && af.e().K != 1 || bv.l == 14 && af.e().K != 2) && bl3) {
            return;
        }
        if (bv.f() || bv.l == 47) {
            if (s3 > 150 && bv.f()) {
                return;
            }
            this.g = new bo(string, s2 + (s4 - s2) / 2, s5 - (s2 > 100 ? 24 : 48));
            this.g.i = new de(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
            bv.t.addElement(this);
            return;
        }
        if (!bl2 && !bl3) {
            this.g = new bo(string, s2, s3 - 24);
            this.g.i = new de(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        } else {
            if (bv.b()) {
                this.g = new bo(string, s2, s3 - 16);
            } else {
                s2 = (short)(s2 + (s4 - s2) / 2);
                this.g = new bo(string, s2, s3 - (s3 != 0 ? 16 : -32));
            }
            this.g.i = new de(null, this, 2, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        }
        bv.t.addElement(this);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                n2 = (this.a + this.c) / 2;
                int n3 = this.d;
                if (this.d > this.b + 24) {
                    n3 = (this.b + this.d) / 2;
                }
                p.j().aX = 0;
                af.e().bP = new dm(n2, n3);
                af.e().I = af.e().B - af.e().bP.a > 0 ? -1 : 1;
                bt.a().g();
                return;
            }
            case 2: {
                p.j().aX = 0;
                if (af.e().i() != null) {
                    bt.a().g();
                    bp.a();
                    bt.a().q();
                    af.bG = true;
                    return;
                }
                if (af.e().j() != null) {
                    bt.a().g();
                    bt.a().f();
                    af.bH = true;
                    af.bG = true;
                    main.a.g();
                    main.a.f();
                    bp.a();
                    return;
                }
                n2 = (this.a + this.c) / 2;
                short s2 = this.d;
                af.e().bP = new dm(n2, s2);
                af.e().I = af.e().B - af.e().bP.a > 0 ? -1 : 1;
                af.e().ay = new de(null, this, 2, null);
            }
        }
    }
}

