/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import main.GameMidlet;
import main.a;

public class aj {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    float k;
    long l;
    long m;
    boolean n;
    int[] o;
    int[] p;

    public aj(int n2, int n3, int n4, int n5, int n6) {
        this.i = 0;
        this.j = 0xFF0000;
        this.l = 0L;
        this.m = 150L;
        this.n = true;
        this.o = new int[2];
        this.p = new int[2];
        this.g = n3;
        this.d = n2;
        this.k = 1.0f;
        this.c = n4;
        this.h = n5;
        this.a = main.a.A;
        this.b = main.a.B;
        this.l = System.currentTimeMillis();
        n4 = 0;
        while (n4 < 2) {
            this.o[n4] = n2;
            this.p[n4] = n3;
            ++n4;
        }
        this.j = n6;
    }

    public static void a(en en2, int n2, int n3, int n4) {
        en2.a(n4);
        en2.d(n2, n3, 1, 2);
    }

    public aj() {
    }

    /*
     * WARNING - void declaration
     */
    public static void a(y object) {
        try {
            switch (((y)object).a) {
                case -128: {
                    Object y2 = object;
                    try {
                        byte by2 = ((y)y2).c().readByte();
                        int n2 = ((y)y2).c().readInt();
                        af af2 = n2 == af.e().J ? af.e() : p.b(n2);
                        if (by2 == 0) {
                            short s2 = ((y)y2).c().readShort();
                            byte by3 = ((y)y2).c().readByte();
                            byte by4 = ((y)y2).c().readByte();
                            short s3 = ((y)y2).c().readShort();
                            byte by5 = ((y)y2).c().readByte();
                            if (af2 != null) {
                                af2.a(new ea((int)s2, af2, (int)by3, (int)by4, (int)s3, by5));
                            }
                            break;
                        }
                        if (by2 == 1) {
                            short s4 = ((y)y2).c().readShort();
                            if (af2 != null) {
                                af2.b(0, (int)s4);
                            }
                            break;
                        }
                        if (by2 == 2) {
                            if (af2 != null) {
                                af2.b(-1, 0);
                            }
                            break;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 127: {
                    Object y3 = object;
                    try {
                        byte by6 = ((y)y3).c().readByte();
                        if (by6 == 0) {
                            aq.a();
                            el el2 = new el("");
                            int n3 = ((y)y3).c().readShort();
                            int n4 = 0;
                            int n5 = 0;
                            while (n5 < n3) {
                                short s5;
                                int n6;
                                byte by7;
                                byte by8;
                                byte by9;
                                ef ef2 = new ef();
                                short s6 = ((y)y3).c().readShort();
                                int n7 = n5 + 1;
                                byte by10 = ((y)y3).c().readShort();
                                byte by11 = ((y)y3).c().readByte();
                                byte by12 = ((y)y3).c().readByte();
                                byte by13 = ((y)y3).c().readByte();
                                int n8 = -1;
                                af af3 = null;
                                byte by14 = ((y)y3).c().readByte();
                                if (by14 == 0) {
                                    n8 = ((y)y3).c().readShort();
                                } else {
                                    short s7 = ((y)y3).c().readShort();
                                    short s8 = ((y)y3).c().readShort();
                                    by9 = ((y)y3).c().readShort();
                                    by7 = by8 = ((y)y3).c().readShort();
                                    n6 = by9;
                                    s5 = s8;
                                    short s9 = s7;
                                    af af4 = new af();
                                    new af().bU = s9;
                                    af4.bW = s5;
                                    af4.bV = n6;
                                    af4.bX = by7;
                                    af3 = af4;
                                }
                                String string = ((y)y3).c().readUTF();
                                String string2 = ((y)y3).c().readUTF();
                                by9 = ((y)y3).c().readByte();
                                by8 = ((y)y3).c().readByte();
                                byte by15 = ((y)y3).c().readByte();
                                ee[] eeArray = null;
                                if (by15 != 0) {
                                    eeArray = new ee[by15];
                                    int n9 = 0;
                                    while (n9 < eeArray.length) {
                                        ac.a();
                                        ee ee2 = ac.b((y)y3);
                                        byte by16 = ((y)y3).c().readByte();
                                        if (ee2 != null) {
                                            eeArray[n9] = ee2;
                                            eeArray[n9].b = by16;
                                        }
                                        ++n9;
                                    }
                                }
                                ee[] eeArray2 = eeArray;
                                af af5 = af3;
                                String string3 = string2;
                                String string4 = string;
                                int n10 = n8;
                                byte by17 = by14;
                                byte by18 = by11;
                                by7 = by10;
                                n6 = n7;
                                s5 = s6;
                                ef ef3 = ef2;
                                ef2.e = s5;
                                ef3.f = n6;
                                ef3.g = by7;
                                ef3.a = by18;
                                ef3.d = by17;
                                if (n10 != -1) {
                                    ef3.m = new aa();
                                    ef3.m.C = n10;
                                }
                                ef3.h = string4;
                                ef3.i = string3;
                                ef3.l = af5;
                                ef3.n = eeArray2;
                                ef3.a();
                                ef2.a(by9);
                                ef2.b(by8);
                                ef2.a(by12, by13);
                                el2.addElement(ef2);
                                if (by9 > 0) {
                                    ++n4;
                                }
                                ++n5;
                            }
                            aq.a().a(el2, n4, n3);
                            break;
                        }
                        if (by6 == 1) {
                            short s10 = ((y)y3).c().readShort();
                            byte by19 = ((y)y3).c().readByte();
                            if (ef.a(aq.f, s10) != null) {
                                ef.a(aq.f, s10).b(by19);
                            }
                            aq.e();
                            break;
                        }
                        if (by6 == 2) {
                            short s11 = ((y)y3).c().readShort();
                            byte by20 = ((y)y3).c().readByte();
                            int n11 = 0;
                            int n12 = 0;
                            while (n12 < aq.f.size()) {
                                ef ef4 = (ef)aq.f.elementAt(n12);
                                if (ef4 != null) {
                                    if (ef4.e == s11) {
                                        ef4.a(by20);
                                    }
                                    if (ef4.j > 0) {
                                        ++n11;
                                    }
                                }
                                ++n12;
                            }
                            aq.a(n11, aq.f.size());
                            if (ef.a(aq.g, s11) != null) {
                                ef.a(aq.g, s11).a(by20);
                                break;
                            }
                        } else if (by6 == 3) {
                            short s12 = ((y)y3).c().readShort();
                            byte by21 = ((y)y3).c().readByte();
                            byte by22 = ((y)y3).c().readByte();
                            if (ef.a(aq.f, s12) != null) {
                                ef.a(aq.f, s12).a(by21, by22);
                            }
                            if (ef.a(aq.g, s12) != null) {
                                ef.a(aq.g, s12).a(by21, by22);
                                break;
                            }
                        } else if (by6 == 4) {
                            int n13 = ((y)y3).c().readInt();
                            short s13 = ((y)y3).c().readShort();
                            af af6 = n13 == af.e().J ? af.e() : p.b(n13);
                            if (af6 != null) {
                                af6.cV = s13;
                                af6.cY = ((y)y3).c().readByte();
                                break;
                            }
                        }
                    }
                    catch (Exception exception) {
                        Exception exception3 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 114: {
                    try {
                        ((y)object).c().readUTF();
                        l.e = ((y)object).c().readByte();
                        l.f = ((y)object).c().readByte();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                case 113: {
                    short nArray;
                    byte by23 = 0;
                    byte by24 = 0;
                    int n14 = 0;
                    boolean n15 = false;
                    int n2 = 0;
                    int n3 = -1;
                    try {
                        by23 = ((y)object).c().readByte();
                        by24 = ((y)object).c().readByte();
                        n14 = ((y)object).c().readShort();
                        nArray = ((y)object).c().readShort();
                        n2 = ((y)object).c().readShort();
                        n3 = ((y)object).c().readShort();
                    }
                    catch (Exception exception) {}
                    ei.a(new ea(n14, nArray, n2, (int)by24, (int)by23, n3));
                    return;
                }
                case 48: {
                    byte by25 = ((y)object).c().readByte();
                    bs.a(by25, false);
                    main.a.e();
                    br.a().e();
                    main.a.h();
                    bs.m = true;
                    return;
                }
                case 31: {
                    int n18 = ((y)object).c().readInt();
                    short s14 = ((y)object).c().readByte();
                    if (s14 == 1) {
                        void by31;
                        s14 = ((y)object).c().readShort();
                        int n19 = -1;
                        Object n23 = null;
                        short s2 = 0;
                        int n4 = 0;
                        try {
                            byte by2 = ((y)object).c().readByte();
                            n19 = by2;
                            if (by2 > 0) {
                                int n5 = ((y)object).c().readByte();
                                int[] n25 = new int[n5];
                                int n6 = 0;
                                while (n6 < n5) {
                                    n25[n6] = ((y)object).c().readByte();
                                    ++n6;
                                }
                                s2 = ((y)object).c().readShort();
                                n4 = ((y)object).c().readShort();
                            }
                        }
                        catch (Exception exception) {}
                        if (n18 == af.e().J) {
                            af.e().v = new dk();
                            af.e().v.a = s14;
                            if (n19 > 0) {
                                af.e().v.a(n19, (int[])by31, s2, n4);
                                return;
                            }
                        } else {
                            af af2 = p.b(n18);
                            p.b(n18).v = new dk();
                            af2.v.a = s14;
                            if (n19 > 0) {
                                af2.v.a(n19, (int[])by31, s2, n4);
                                return;
                            }
                        }
                        break;
                    }
                    if (n18 == af.e().J) {
                        af.e().v.a();
                        af.e().v = null;
                        return;
                    }
                    af af8 = p.b(n18);
                    af8.v.a();
                    af8.v = null;
                    return;
                }
                case -89: {
                    main.a.an = ((y)object).c().readByte() == 1;
                    return;
                }
                case 42: {
                    main.a.h();
                    x.c = false;
                    af.bI = false;
                    byte by27 = ((y)object).c().readByte();
                    if (main.a.J == null) {
                        main.a.J = new bi(by27);
                    }
                    main.a.J.b();
                    return;
                }
                case 52: {
                    af af3;
                    byte by28 = ((y)object).c().readByte();
                    if (by28 == 1) {
                        int by36 = ((y)object).c().readInt();
                        if (by36 == af.e().J) {
                            af.e().c(true);
                            af.e().B = ((y)object).c().readShort();
                            af.e().C = ((y)object).c().readShort();
                        } else {
                            af3 = p.b(by36);
                            if (af3 != null) {
                                af3.c(true);
                                af3.B = ((y)object).c().readShort();
                                af3.C = ((y)object).c().readShort();
                            }
                        }
                    }
                    if (by28 == 0) {
                        int s21 = ((y)object).c().readInt();
                        if (s21 == af.e().J) {
                            af.e().c(false);
                        } else {
                            af3 = p.b(s21);
                            if (af3 != null) {
                                af3.c(false);
                            }
                        }
                    }
                    if (by28 == 2) {
                        int af10 = ((y)object).c().readInt();
                        int n7 = ((y)object).c().readInt();
                        al al2 = (al)p.b(af10);
                        al2.c(n7);
                    }
                    if (by28 == 3) {
                        p.bW = ((y)object).c().readByte();
                        return;
                    }
                    break;
                }
                case 51: {
                    void s28;
                    int by39 = ((y)object).c().readInt();
                    al al3 = (al)p.b(by39);
                    byte by3 = ((y)object).c().readByte();
                    short s3 = ((y)object).c().readShort();
                    short s4 = ((y)object).c().readShort();
                    byte by30 = ((y)object).c().readByte();
                    af[] afArray = new af[by30];
                    long[] lArray = new long[by30];
                    boolean n44 = false;
                    while (s28 < by30) {
                        int n8 = ((y)object).c().readInt();
                        ds.c("char ID=" + n8);
                        afArray[s28] = null;
                        afArray[s28] = n8 != af.e().J ? p.b(n8) : af.e();
                        lArray[s28] = ((y)object).c().readLong();
                        ++s28;
                    }
                    al3.a(by3, s3, s4, afArray, lArray);
                    return;
                }
                case -127: {
                    aj.b((y)object);
                    return;
                }
                case -126: {
                    byte n50 = ((y)object).c().readByte();
                    ds.c("type quay= " + n50);
                    if (n50 == 1) {
                        ((y)object).c().readByte();
                        String string = ((y)object).c().readUTF();
                        String string5 = ((y)object).c().readUTF();
                        p.j().b(string, string5);
                    }
                    if (n50 == 0) {
                        p.j().b(((y)object).c().readUTF());
                        return;
                    }
                    break;
                }
                case -122: {
                    short s5 = ((y)object).c().readShort();
                    do do_ = p.a(s5);
                    int n27 = ((y)object).c().readByte();
                    do_.dj = new int[n27];
                    int n28 = 0;
                    while (n28 < n27) {
                        do_.dj[n28] = ((y)object).c().readShort();
                        ++n28;
                    }
                    do_.a(((y)object).c().readByte(), ((y)object).c().readInt());
                    return;
                }
                case 102: {
                    int n9;
                    int n10;
                    long[] lArray;
                    af[] afArray;
                    int n31;
                    aa aa2;
                    byte by32 = ((y)object).c().readByte();
                    if (by32 == 0 || by32 == 1 || by32 == 2 || by32 == 6) {
                        aa2 = aa.x();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 6) {
                            aa2.u = -1000;
                            aa2.t = -1000;
                            ((d)aa2).b = -1000;
                            ((d)aa2).a = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        n31 = ((y)object).c().readByte();
                        afArray = new af[n31];
                        lArray = new long[n31];
                        n10 = 0;
                        while (n10 < n31) {
                            n9 = ((y)object).c().readInt();
                            afArray[n10] = null;
                            afArray[n10] = n9 != af.e().J ? p.b(n9) : af.e();
                            lArray[n10] = ((y)object).c().readLong();
                            ++n10;
                        }
                        ((d)aa2).a(afArray, lArray, by32);
                    }
                    if (by32 == 3 || by32 == 4 || by32 == 5 || by32 == 7) {
                        aa2 = aa.y();
                        if (aa2 == null) {
                            return;
                        }
                        if (by32 == 7) {
                            aa2.u = -1000;
                            aa2.t = -1000;
                            ((an)aa2).b = -1000;
                            ((an)aa2).a = -1000;
                            aa2.n = -1000;
                            aa2.m = -1000;
                            return;
                        }
                        if (by32 == 3 || by32 == 4) {
                            n31 = ((y)object).c().readByte();
                            afArray = new af[n31];
                            lArray = new long[n31];
                            n10 = 0;
                            while (n10 < n31) {
                                n9 = ((y)object).c().readInt();
                                afArray[n10] = null;
                                afArray[n10] = n9 != af.e().J ? p.b(n9) : af.e();
                                lArray[n10] = ((y)object).c().readLong();
                                ++n10;
                            }
                            ((an)aa2).a(afArray, lArray, by32);
                        }
                        if (by32 == 5) {
                            n31 = ((y)object).c().readShort();
                            ((an)aa2).b((short)n31);
                        }
                    }
                    if (by32 > 9 && by32 < 30) {
                        aj.a((y)object, by32);
                        return;
                    }
                    break;
                }
                case 101: {
                    ds.c("big boss--------------------------------------------------");
                    cc cc2 = aa.w();
                    if (cc2 == null) {
                        return;
                    }
                    byte by33 = ((y)object).c().readByte();
                    if (by33 == 0 || by33 == 1 || by33 == 2 || by33 == 4 || by33 == 3) {
                        if (by33 == 3) {
                            short s6 = ((y)object).c().readShort();
                            cc2.t = s6;
                            cc2.a = s6;
                            cc2.u = ((y)object).c().readShort();
                            cc2.D();
                        } else {
                            int n11 = ((y)object).c().readByte();
                            ds.c("CHUONG nChar= " + n11);
                            af[] afArray = new af[n11];
                            long[] lArray = new long[n11];
                            int n12 = 0;
                            while (n12 < n11) {
                                int n34 = ((y)object).c().readInt();
                                ds.c("char ID=" + n34);
                                afArray[n12] = null;
                                afArray[n12] = n34 != af.e().J ? p.b(n34) : af.e();
                                lArray[n12] = ((y)object).c().readLong();
                                ++n12;
                            }
                            cc2.a(afArray, lArray, by33);
                        }
                    }
                    if (by33 == 5) {
                        cc2.b = true;
                        cc2.p = 2;
                    }
                    if (by33 == 6) {
                        cc2.C();
                        cc2.m = ((y)object).c().readShort();
                        cc2.n = ((y)object).c().readShort();
                    }
                    if (by33 == 7) {
                        cc2.a(null, null, by33);
                    }
                    if (by33 == 8) {
                        short s7 = ((y)object).c().readShort();
                        cc2.t = s7;
                        cc2.a = s7;
                        cc2.u = ((y)object).c().readShort();
                        cc2.p = 2;
                    }
                    if (by33 == 9) {
                        cc2.u = -1000;
                        cc2.t = -1000;
                        cc2.a = -1000;
                        cc2.n = -1000;
                        cc2.m = -1000;
                        return;
                    }
                    break;
                }
                case -120: {
                    long l2 = l.d();
                    bt.d = l2 - bt.b;
                    bt.a().d();
                    return;
                }
                case -121: {
                    long l3 = l.d();
                    bt.e = l3 - bt.c;
                    bt.a().e();
                    return;
                }
                case 100: {
                    byte by34 = ((y)object).c().readByte();
                    int n35 = ((y)object).c().readByte();
                    h h2 = null;
                    if (by34 == 0) {
                        h2 = af.e().aH[n35];
                    }
                    if (by34 == 1) {
                        h2 = af.e().aF[n35];
                    }
                    if ((n35 = ((y)object).c().readShort()) != -1) {
                        h2.b = dp.a((short)n35);
                        h2.h = ((y)object).c().readInt();
                        ((y)object).c().readUTF();
                        ((y)object).c().readUTF();
                        byte by4 = ((y)object).c().readByte();
                        n35 = by4;
                        if (by4 != 0) {
                            h2.a = new ee[n35];
                            n35 = 0;
                            while (n35 < h2.a.length) {
                                ac.a();
                                ee ee3 = ac.b((y)object);
                                if (ee3 != null) {
                                    h2.a[n35] = ee3;
                                }
                                ++n35;
                            }
                        }
                        if (h2.h <= 0) {
                            return;
                        }
                    }
                    break;
                }
                case -123: {
                    int n36 = ((y)object).c().readInt();
                    if (p.b(n36) != null) {
                        p.b((int)n36).cS = ((y)object).c().readByte();
                        return;
                    }
                    break;
                }
                case -119: {
                    af.e().w = ((y)object).c().readInt();
                    return;
                }
                case -117: {
                    p.j().bU = 0;
                    p.j().bS = ((y)object).c().readByte();
                    if (p.j().bS == 100) {
                        p.j().bT = true;
                    }
                    if (p.j().bS == 101) {
                        do.di = true;
                        return;
                    }
                    break;
                }
                case -116: {
                    p.bk = ((y)object).c().readByte() == 1;
                    return;
                }
                case -115: {
                    af.e().a(((y)object).c().readUTF(), ((y)object).c().readShort(), ((y)object).c().readShort(), ((y)object).c().readShort());
                    return;
                }
                case -113: {
                    byte[] byArray = new byte[10];
                    int n37 = 0;
                    while (n37 < 10) {
                        byArray[n37] = ((y)object).c().readByte();
                        ++n37;
                    }
                    p.j().b(byArray);
                    p.j().a(byArray);
                    p.j().c(byArray);
                    return;
                }
                case -111: {
                    int n38 = ((y)object).c().readShort();
                    u.b = new el("");
                    int n39 = 0;
                    while (n39 < n38) {
                        String string = ((y)object).c().readUTF();
                        byte by47 = ((y)object).c().readByte();
                        u.b.addElement(new u(string, by47));
                        ++n39;
                    }
                    u.a();
                    u.b();
                    return;
                }
                case 125: {
                    byte by37 = ((y)object).c().readByte();
                    int n40 = ((y)object).c().readInt();
                    if (n40 == af.e().J) {
                        af.e().b(by37);
                        return;
                    }
                    if (p.b(n40) != null) {
                        p.b(n40).b(by37);
                        return;
                    }
                    break;
                }
                case 124: {
                    short s8 = ((y)object).c().readShort();
                    object = ((y)object).c().readUTF();
                    ds.c("noi chuyen = " + (String)object + "npc ID= " + s8);
                    do do_ = p.a(s8);
                    if (do_ != null) {
                        do_.a((String)object);
                        return;
                    }
                    break;
                }
                case 123: {
                    void var4_147;
                    int n41 = ((y)object).c().readInt();
                    short s22 = ((y)object).c().readShort();
                    short s23 = ((y)object).c().readShort();
                    byte by38 = ((y)object).c().readByte();
                    ds.c("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= " + s22 + " y= " + s23 + "chaPos= " + n41 + "type Pos= " + by38);
                    Object var4_144 = null;
                    if (n41 == af.e().J) {
                        af af4 = af.e();
                    } else if (p.b(n41) != null) {
                        af af5 = p.b(n41);
                    }
                    if (var4_147 != null) {
                        at.a(by38 == 0 ? 60 : 173, (af)var4_147, 1);
                        var4_147.a(s22, s23, by38);
                        return;
                    }
                    break;
                }
                case 122: {
                    short s24 = ((y)object).c().readShort();
                    ds.c("second login = " + s24);
                    x.k = s24;
                    x.m = x.l = System.currentTimeMillis();
                    main.a.h();
                    return;
                }
                case 121: {
                    l.g = ((y)object).c().readUTF();
                    ((y)object).c().readUTF();
                    ds.c("SHOW AD public ID= " + l.g);
                    return;
                }
                case -124: {
                    int n13;
                    int n43;
                    byte by40 = ((y)object).c().readByte();
                    byte by41 = ((y)object).c().readByte();
                    if (by41 == 0) {
                        if (by40 == 2) {
                            n43 = ((y)object).c().readInt();
                            if (n43 == af.e().J) {
                                af.e().S();
                            } else if (p.b(n43) != null) {
                                p.b(n43).S();
                            }
                        }
                        n43 = ((y)object).c().readUnsignedByte();
                        int n14 = ((y)object).c().readInt();
                        ds.c("playerID= " + n14 + " skillID= " + n43);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((y)object).c().readInt();
                                if (n14 == af.e().J) {
                                    af.e().cI = n43;
                                    p.b(n13).b(af.e());
                                } else if (p.b(n14) != null && n13 != af.e().J) {
                                    p.b((int)n14).cI = n43;
                                    p.b(n13).b(p.b(n14));
                                } else if (p.b(n14) != null && n13 == af.e().J) {
                                    p.b((int)n14).cI = n43;
                                    af.e().b(p.b(n14));
                                }
                            } else if (n14 == af.e().J) {
                                af.e().P();
                            } else if (p.b(n14) != null) {
                                p.b(n14).P();
                            }
                        }
                        if (n43 == 33) {
                            if (by40 == 1) {
                                if (n14 == af.e().J) {
                                    af.e().cK = true;
                                } else if (p.b(n14) != null) {
                                    p.b((int)n14).cK = true;
                                }
                            } else if (n14 == af.e().J) {
                                af.e().Q();
                            } else if (p.b(n14) != null) {
                                p.b(n14).Q();
                            }
                        }
                        if (n43 == 39) {
                            if (by40 == 1) {
                                if (n14 == af.e().J) {
                                    af.e().cN = true;
                                } else if (p.b(n14) != null) {
                                    p.b((int)n14).cN = true;
                                }
                            } else if (n14 == af.e().J) {
                                af.e().T();
                            } else if (p.b(n14) != null) {
                                p.b(n14).T();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                if (n14 == af.e().J) {
                                    af.e().cO = true;
                                } else if (p.b(n14) != null) {
                                    p.b((int)n14).cO = true;
                                }
                            } else if (n14 == af.e().J) {
                                af.e().R();
                            } else if (p.b(n14) != null) {
                                p.b(n14).R();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                if (n14 == af.e().J) {
                                    af.e().cQ = true;
                                } else if (p.b(n14) != null) {
                                    p.b((int)n14).cQ = true;
                                }
                            } else if (n14 == af.e().J) {
                                af.e().V();
                            } else if (p.b(n14) != null) {
                                p.b(n14).V();
                            }
                        }
                        if (n43 == 42) {
                            if (by40 == 1) {
                                if (n14 == af.e().J) {
                                    af.e().cR = true;
                                }
                            } else if (n14 == af.e().J) {
                                af.e().cR = false;
                                ds.c("tra ve huy chieu 2");
                            }
                        }
                    }
                    if (by41 == 1) {
                        n43 = ((y)object).c().readUnsignedByte();
                        byte by5 = ((y)object).c().readByte();
                        ds.c("modbHoldID= " + by5 + " skillID= " + n43 + "eff ID= " + by40);
                        if (n43 == 32) {
                            if (by40 == 1) {
                                n13 = ((y)object).c().readInt();
                                if (n13 == af.e().J) {
                                    p.a((byte)by5).j = n43;
                                    af.e().a(p.a(by5));
                                } else if (p.b(n13) != null) {
                                    p.a((byte)by5).j = n43;
                                    p.b(n13).a(p.a(by5));
                                }
                            } else {
                                p.a(by5).r();
                            }
                        }
                        if (n43 == 40) {
                            if (by40 == 1) {
                                p.a((byte)by5).ab = true;
                            } else {
                                p.a(by5).s();
                            }
                        }
                        if (n43 == 41) {
                            if (by40 == 1) {
                                p.a((byte)by5).ac = true;
                                return;
                            }
                            p.a(by5).t();
                            return;
                        }
                    }
                    break;
                }
                case -125: {
                    cq.b().b = false;
                    String string = ((y)object).c().readUTF();
                    ds.c("titile= " + string);
                    int n15 = ((y)object).c().readByte();
                    er.a().a(n15, string);
                    int n16 = 0;
                    while (n16 < n15) {
                        er.a().a[n16].i = ((y)object).c().readUTF();
                        byte by42 = ((y)object).c().readByte();
                        if (by42 == 0) {
                            er.a().a[n16].c(1);
                        }
                        if (by42 == 1) {
                            er.a().a[n16].c(0);
                        }
                        if (by42 == 2) {
                            er.a().a[n16].c(2);
                        }
                        ++n16;
                    }
                    return;
                }
                case -110: {
                    int n46;
                    byte by6 = ((y)object).c().readByte();
                    if (by6 == 1) {
                        n46 = ((y)object).c().readInt();
                        byte[] byArray = eu.b(String.valueOf(n46));
                        if (byArray == null) {
                            bt.a().a((byte)1, -1, (byte[])null);
                        } else {
                            bt.a().a((byte)1, n46, byArray);
                        }
                    }
                    if (by6 == 0) {
                        n46 = ((y)object).c().readInt();
                        short s25 = ((y)object).c().readShort();
                        byte[] byArray = new byte[s25];
                        ((y)object).c().read(byArray, 0, s25);
                        eu.a(String.valueOf(n46), byArray);
                        return;
                    }
                    break;
                }
                case 93: {
                    String string = ((y)object).c().readUTF();
                    string = ds.a(string);
                    p.j().a(string);
                    return;
                }
                case -106: {
                    short s26 = ((y)object).c().readShort();
                    short s27 = ((y)object).c().readShort();
                    if (cy.a(s26)) {
                        cy.c(s26).a(s27, false);
                        return;
                    }
                    cy cy2 = new cy(s26, s27);
                    af.br.addElement(cy2);
                    return;
                }
                case -105: {
                    au.a().b = 0;
                    au.a().c = ((y)object).c().readShort();
                    au.a().d = au.a().e = System.currentTimeMillis();
                    au.a().a = ((y)object).c().readByte();
                    au.a().b();
                    return;
                }
                case -103: {
                    int n47 = ((y)object).c().readByte();
                    ds.c("server gui ve actionFlag = " + n47);
                    if (n47 == 0) {
                        main.a.G.Y.removeAllElements();
                        n47 = ((y)object).c().readByte();
                        int n48 = 0;
                        while (n48 < n47) {
                            h h3 = new h();
                            short s9 = ((y)object).c().readShort();
                            if (s9 != -1) {
                                h3.b = dp.a(s9);
                                byte by7 = ((y)object).c().readByte();
                                if (by7 != -1) {
                                    h3.a = new ee[by7];
                                    int n17 = 0;
                                    while (n17 < h3.a.length) {
                                        ac.a();
                                        ee ee2 = ac.b((y)object);
                                        if (ee2 != null) {
                                            h3.a[n17] = ee2;
                                        }
                                        ++n17;
                                    }
                                }
                            }
                            main.a.G.Y.addElement(h3);
                            ++n48;
                        }
                        main.a.G.h();
                        main.a.G.s();
                        return;
                    }
                    if (n47 == 1) {
                        n47 = ((y)object).c().readInt();
                        byte by45 = ((y)object).c().readByte();
                        ds.c("---------------actionFlag1:  " + n47 + " : " + by45);
                        if (n47 == af.e().J) {
                            af.e().by = by45;
                        } else if (p.b(n47) != null) {
                            p.b((int)n47).by = by45;
                        }
                        p.j();
                        p.a(n47, by45);
                        return;
                    }
                    if (n47 == 2) {
                        void var4_155;
                        Object object2;
                        void var4_153;
                        n47 = ((y)object).c().readByte();
                        short s29 = ((y)object).c().readShort();
                        ep ep2 = new ep();
                        new ep().a = (byte)n47;
                        ep2.b = s29;
                        p.H.addElement(ep2);
                        boolean bl2 = false;
                        while (var4_153 < p.H.size()) {
                            object2 = (ep)p.H.elementAt((int)var4_153);
                            ds.c("i: " + (int)var4_153 + "  cflag: " + ((ep)object2).a + "   IDimageFlag: " + ((ep)object2).b);
                            ++var4_153;
                        }
                        boolean bl3 = false;
                        while (var4_155 < p.D.size()) {
                            object2 = (af)p.D.elementAt((int)var4_155);
                            if (object2 != null && ((af)object2).by == n47) {
                                ((af)object2).bz = s29;
                            }
                            ++var4_155;
                        }
                        if (af.e().by == n47) {
                            af.e().bz = s29;
                            return;
                        }
                    }
                    break;
                }
                case -102: {
                    byte by46 = ((y)object).c().readByte();
                    if (by46 != 0 && by46 == 1) {
                        main.a.I.n = false;
                        bt.a().a(eu.c(eu.e), eu.c(eu.f), "2.5.0", (byte)0);
                        return;
                    }
                    break;
                }
                case -101: {
                    if (main.a.I == null) {
                        main.a.I = new x();
                    }
                    main.a.I.n = true;
                    main.a.b();
                    String string = ((y)object).c().readUTF();
                    eu.a(String.valueOf(eu.d) + bs.n, string);
                    bt.a().c();
                    bt.a().a(string, "", "2.5.0", (byte)1);
                    return;
                }
                case -100: {
                    byte by8;
                    bp.c();
                    boolean bl2 = false;
                    if (main.a.A > 2 * g.ab) {
                        bl2 = true;
                    }
                    if ((by8 = ((y)object).c().readByte()) < 0) break;
                    ds.c("t Indxe= " + by8);
                    main.a.G.K[by8] = ((y)object).c().readByte();
                    main.a.G.L[by8] = ((y)object).c().readByte();
                    ds.c("max page= " + main.a.G.K[by8] + " curr page= " + main.a.G.L[by8]);
                    int n18 = ((y)object).c().readUnsignedByte();
                    af.e().aJ[by8] = new h[n18];
                    g.ar = aw.es;
                    int n19 = 0;
                    while (n19 < n18) {
                        short s10 = ((y)object).c().readShort();
                        if (s10 != -1) {
                            int n20;
                            af.e().aJ[by8][n19] = new h();
                            af.e().aJ[by8][n19].b = dp.a(s10);
                            af.e().aJ[by8][n19].d = ((y)object).c().readShort();
                            af.e().aJ[by8][n19].n = ((y)object).c().readInt();
                            af.e().aJ[by8][n19].p = ((y)object).c().readInt();
                            af.e().aJ[by8][n19].v = ((y)object).c().readByte();
                            af.e().aJ[by8][n19].h = ((y)object).c().readInt();
                            af.e().aJ[by8][n19].B = ((y)object).c().readByte();
                            byte by9 = ((y)object).c().readByte();
                            if (by9 != -1) {
                                af.e().aJ[by8][n19].a = new ee[by9];
                                n20 = 0;
                                while (n20 < af.e().aJ[by8][n19].a.length) {
                                    ac.a();
                                    ee ee3 = ac.b((y)object);
                                    if (ee3 != null) {
                                        af.e().aJ[by8][n19].a[n20] = ee3;
                                        af.e().aJ[by8][n19].A = main.a.G.a(af.e().aJ[by8][n19]);
                                    }
                                    ++n20;
                                }
                            }
                            if ((n20 = ((y)object).c().readByte()) == 1) {
                                short s11 = ((y)object).c().readShort();
                                short s12 = ((y)object).c().readShort();
                                short s13 = ((y)object).c().readShort();
                                short s14 = ((y)object).c().readShort();
                                af.e().aJ[by8][n19].a(s11, s12, s13, s14);
                            }
                            if (GameMidlet.e >= 237) {
                                af.e().aJ[by8][n19].H = ((y)object).c().readUTF();
                                ds.b("nguoi ki gui  " + af.e().aJ[by8][n19].H);
                            }
                        }
                        ++n19;
                    }
                    if (bl2) {
                        main.a.H.e();
                    }
                    main.a.G.y();
                    main.a.G.f = 0;
                    main.a.G.g = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static void b(y y2) {
        try {
            byte by2 = y2.c().readByte();
            if (by2 == 0) {
                by2 = y2.c().readByte();
                short[] sArray = new short[by2];
                byte by3 = 0;
                while (by3 < by2) {
                    sArray[by3] = y2.c().readShort();
                    ++by3;
                }
                by3 = y2.c().readByte();
                by2 = y2.c().readInt();
                short s2 = y2.c().readShort();
                ar.a().a(sArray, by3, by2, s2);
                return;
            }
            if (by2 == 1) {
                by2 = y2.c().readByte();
                short[] sArray = new short[by2];
                byte by4 = 0;
                while (by4 < by2) {
                    sArray[by4] = y2.c().readShort();
                    ++by4;
                }
                ar.a().a(sArray);
                return;
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
    }

    private static void a(y y2, int n2) {
        try {
            int n3;
            byte by2 = y2.c().readByte();
            cl cl2 = aa.a(by2);
            if (cl2 == null) {
                return;
            }
            if (n2 == 10) {
                n3 = y2.c().readShort();
                short s2 = y2.c().readShort();
                cl2.a((short)n3, s2);
            }
            if (n2 >= 11 && n2 <= 20) {
                byte by3 = y2.c().readByte();
                n3 = by3;
                af[] afArray = new af[by3];
                long[] lArray = new long[n3];
                int n4 = 0;
                while (n4 < n3) {
                    int n5 = y2.c().readInt();
                    afArray[n4] = null;
                    afArray[n4] = n5 != af.e().J ? p.b(n5) : af.e();
                    lArray[n4] = y2.c().readLong();
                    ++n4;
                }
                n4 = y2.c().readByte();
                cl2.a(afArray, lArray, (byte)(n2 - 10), (byte)n4);
            }
            if (n2 == 21) {
                cl2.a = y2.c().readShort();
                cl2.b = y2.c().readShort();
                cl2.C();
            }
            if (n2 == 23) {
                cl2.D();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

