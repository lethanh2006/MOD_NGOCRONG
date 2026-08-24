/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.lcdui.Image;

public final class ac
implements bd {
    private static ac e;
    private y f;
    public static boolean a;
    private float g;
    public static boolean b;
    public static boolean c;
    public static t d;

    static {
        a = false;
        c = false;
        d = new t("frame new boss");
    }

    public static ac a() {
        if (e == null) {
            e = new ac();
        }
        return e;
    }

    public final void a(boolean bl2) {
        if (main.a.E != main.a.al || !main.a.al.a) {
            if (bl2) {
                System.out.println("connect 1 ok");
                bs.t = 2;
                bt.a().c();
                bt bt2 = bt.a();
                return;
            }
            bt bt3 = bt.a();
            if (eu.d(eu.b) != -1) {
                l.c = eu.d(eu.b);
            }
            try {
                ds.c("setType");
                y y2 = bt.d((byte)2);
                y2.d().writeByte(l.c);
                y2.d().writeByte(en.b);
                y2.d().writeBoolean(false);
                y2.d().writeInt(main.a.A);
                y2.d().writeInt(main.a.B);
                y2.d().writeBoolean(cd.g);
                y2.d().writeBoolean(main.a.e);
                y2.d().writeUTF(String.valueOf(System.getProperty("microedition.platform")) + "|" + "2.5.0");
                InputStream inputStream = bt3.getClass().getResourceAsStream("res\\info");
                if (inputStream != null) {
                    inputStream.read(null);
                    y2.d().writeShort((null).length);
                    ((OutputStream)y2.d()).write(null);
                    ds.b("write " + (null).length + "|" + "2.5.0");
                }
                bt3.a = br.b();
                bt3.a.a(y2);
                bt3.a = br.a();
                y2.e();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            bt3 = bt.a();
        }
    }

    public final void b(boolean bl2) {
        if (!bl2) {
            if (main.a.E == main.a.ak && bs.s && !bt.f) {
                bs.t = 0;
                main.a.ak.h();
            }
            l.a(bl2);
            return;
        }
        l.a(bl2);
    }

    public final void c(boolean bl2) {
        block5: {
            block4: {
                if (bl2) break block4;
                if (main.a.E == main.a.ak && !bt.f) {
                    main.a.ak.h();
                }
                if (main.a.E != main.a.I || bt.f) break block5;
            }
            l.b(bl2);
        }
    }

    private void c(y y2) {
        try {
            int n2 = y2.c().readUnsignedByte();
            h h2 = p.Q.aH[n2];
            p.Q.aH[n2].r = y2.c().readInt();
            h2.l = y2.c().readByte();
            h2.c = new el("item.options");
            try {
                while (true) {
                    ee ee2;
                    if ((ee2 = ac.b(y2)) == null) {
                        continue;
                    }
                    h2.c.addElement(ee2);
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(y var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[CASE]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void d(y y2) {
        int n2 = y2.c().readByte();
        ab.a = new bg[n2];
        ds.c("[LEN] sl nguoi choi " + n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = y2.c().readInt();
            String string = y2.c().readUTF();
            short s2 = y2.c().readShort();
            short s3 = y2.c().readShort();
            short s4 = y2.c().readShort();
            long l2 = y2.c().readLong();
            ab.a[n3] = new bg(n4, string, s2, s3, s4, l2);
            ++n3;
        }
        ((ab)null).b();
        ((ab)null).a((byte)n2);
    }

    private static void a(DataInputStream dataInputStream) {
        p.an = dataInputStream.readByte();
        p.j().L = new ek[dataInputStream.readByte()];
        int n2 = 0;
        while (n2 < p.j().L.length) {
            p.j().L[n2] = new ek();
            p.j();
            p.j();
            dataInputStream.readUTF();
            ++n2;
        }
        p.I = new da[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < p.I.length) {
            p.I[n2] = new da();
            p.I[n2].a = n2;
            dataInputStream.readUTF();
            p.I[n2].b = new et[dataInputStream.readByte()];
            int n3 = 0;
            while (n3 < p.I[n2].b.length) {
                p.I[n2].b[n3] = new et();
                p.I[n2].b[n3].a = dataInputStream.readByte();
                p.I[n2].b[n3].b = dataInputStream.readUTF();
                p.I[n2].b[n3].c = dataInputStream.readByte();
                p.I[n2].b[n3].d = dataInputStream.readByte();
                p.I[n2].b[n3].e = dataInputStream.readByte();
                p.I[n2].b[n3].f = dataInputStream.readShort();
                p.I[n2].b[n3].i = dataInputStream.readUTF();
                int n4 = 130;
                if (main.a.A == 128 || main.a.B <= 208) {
                    n4 = 100;
                }
                p.I[n2].b[n3].g = di.m.a(dataInputStream.readUTF(), n4);
                p.I[n2].b[n3].h = new bf[dataInputStream.readByte()];
                n4 = 0;
                while (n4 < p.I[n2].b[n3].h.length) {
                    p.I[n2].b[n3].h[n4] = new bf();
                    p.I[n2].b[n3].h[n4].b = dataInputStream.readShort();
                    p.I[n2].b[n3].h[n4].a = p.I[n2].b[n3];
                    p.I[n2].b[n3].h[n4].c = dataInputStream.readByte();
                    p.I[n2].b[n3].h[n4].d = dataInputStream.readLong();
                    p.I[n2].b[n3].h[n4].i = dataInputStream.readShort();
                    p.I[n2].b[n3].h[n4].e = dataInputStream.readInt();
                    p.I[n2].b[n3].h[n4].g = dataInputStream.readShort();
                    p.I[n2].b[n3].h[n4].h = dataInputStream.readShort();
                    dataInputStream.readByte();
                    p.I[n2].b[n3].h[n4].k = dataInputStream.readShort();
                    dataInputStream.readShort();
                    p.I[n2].b[n3].h[n4].l = dataInputStream.readUTF();
                    o.a(p.I[n2].b[n3].h[n4]);
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void b(DataInputStream dataInputStream) {
        System.out.println(">>>createMap: " + dataInputStream.available());
        p.am = dataInputStream.readByte();
        bv.w = new String[dataInputStream.readShort()];
        int n2 = 0;
        while (n2 < bv.w.length) {
            bv.w[n2] = dataInputStream.readUTF();
            ++n2;
        }
        do.dg = new ap[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < do.dg.length) {
            do.dg[n2] = new ap();
            do.dg[n2].a = n2;
            do.dg[n2].b = dataInputStream.readUTF();
            do.dg[n2].c = dataInputStream.readShort();
            do.dg[n2].d = dataInputStream.readShort();
            do.dg[n2].e = dataInputStream.readShort();
            do.dg[n2].f = new String[dataInputStream.readByte()][];
            int n3 = 0;
            while (n3 < do.dg[n2].f.length) {
                do.dg[n2].f[n3] = new String[dataInputStream.readByte()];
                int n4 = 0;
                while (n4 < do.dg[n2].f[n3].length) {
                    do.dg[n2].f[n3][n4] = dataInputStream.readUTF();
                    ++n4;
                }
                ++n3;
            }
            n2 = (byte)(n2 + 1);
        }
        aa.c = new dy[dataInputStream.readShort()];
        n2 = 0;
        while (n2 < aa.c.length) {
            aa.c[n2] = new dy();
            aa.c[n2].c = dataInputStream.readByte();
            aa.c[n2].e = dataInputStream.readUTF();
            aa.c[n2].d = dataInputStream.readLong();
            aa.c[n2].a = dataInputStream.readByte();
            aa.c[n2].b = dataInputStream.readByte();
            aa.c[n2].g = dataInputStream.readByte();
            ++n2;
        }
    }

    private static void a(DataInputStream dataInputStream, boolean bl2) {
        p.al = dataInputStream.readByte();
        ds.c("vcData= " + p.al + " vData=" + p.ap);
        eu.a("NR_dart", ai.a(dataInputStream));
        eu.a("NR_arrow", ai.a(dataInputStream));
        eu.a("NR_effect", ai.a(dataInputStream));
        eu.a("NR_image", ai.a(dataInputStream));
        eu.a("NR_part", ai.a(dataInputStream));
        eu.a("NR_skill", ai.a(dataInputStream));
        eu.a("NRdata");
    }

    private static Image a(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a(y y2, int n2) {
        try {
            cb cb2 = new cb();
            byte by2 = y2.c().readByte();
            cb2.b = by2;
            cb2.a = y2.c().readInt();
            cb2.c = y2.c().readInt();
            cb2.d = y2.c().readUTF();
            cb2.h = y2.c().readByte();
            cb2.e = y2.c().readInt() + 1000000000;
            ds.c("type= " + cb2.b + " id= " + cb2.a + " playID= " + cb2.c + " time= " + cb2.e);
            boolean bl2 = false;
            p.aW = false;
            if (by2 == 0) {
                String string = y2.c().readUTF();
                ds.c("str chat " + string);
                p.aW = true;
                if (di.k.a(string) > g.ab - 60) {
                    cb2.f = di.k.a(string, g.ab - 10);
                } else {
                    cb2.f = new String[1];
                    cb2.f[0] = string;
                }
                cb2.g = y2.c().readByte();
            } else if (by2 == 1) {
                cb2.i = y2.c().readByte();
                cb2.j = y2.c().readByte();
                bl2 = y2.c().readByte() == 1;
                if (bl2) {
                    p.aW = true;
                }
                if (cb2.c != af.e().J) {
                    cb2.k = cb2.i < cb2.j ? new String[]{aw.cG} : null;
                }
                if (main.a.G.ai != null) {
                    main.a.G.a(cb2.i, cb2.j);
                }
            } else if (by2 == 2 && af.e().aj == 0) {
                p.aW = true;
                cb2.k = new String[]{aw.bv, aw.cH};
            }
            if (main.a.E != p.c) {
                p.aW = false;
            } else if (main.a.G.a && main.a.G.A == 0 && main.a.G.B == 3) {
                p.aW = false;
            }
            cb.a(cb2, n2, bl2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void a(byte n2) {
        ds.c("is loading map = " + af.bI);
        p.j().aX = 0;
        p.bl = false;
        cw.a = null;
        p.aD.f = false;
        p.aE.f = false;
        p.z = 0;
        main.a.G.a = false;
        bu.a();
        if (!p.b && !cw.b) {
            p.j().a();
        }
        p.a(n2 == 1 ? af.e().B : -1, n2 == 0 ? -1 : 0);
        bv.h();
        bv.c(bv.e);
        ds.c("LOAD GAMESCR 2");
        af.e().D = 0;
        af.e().H = 4;
        af.e().bP = null;
        af.e().aQ = null;
        af.e().aU = null;
        af.e().aT = null;
        af.e().aV = null;
        af.e().cf = null;
        af.e().c(false);
        af.e().cg = null;
        main.a.l();
        if (af.e().C >= bv.d - 100) {
            af.e().bq = true;
            af.e().B += ds.g(ds.b(0, 80));
            bt.a().g();
        }
        p.j().l();
        main.a.a(bv.o);
        af.bH = false;
        int n3 = 0;
        while (n3 < af.e().aB.size()) {
            af.e().aB.elementAt(n3);
            ++n3;
        }
        main.a.g();
        main.a.f();
        p.j().bC = af.e().U;
        p.j().bz = af.e().T;
        af.bG = false;
        p.j().b();
        if (af.e().C <= 10 && n2 != 0 && n2 != 2) {
            cn cn2 = new cn(af.e().B, af.e().C, af.e().bU, af.e().I, 1, true, n2 == 1 ? af.e().K : n2);
            cn.a(cn2);
            af.e().s = true;
        }
        if (n2 == 2) {
            af.e().r();
        }
        if (p.j().bb) {
            if (bv.l == p.j().bh && bv.n == p.j().bi) {
                p.j().c(p.j().bf, p.j().bg);
            }
            if (en.b > 1) {
                p.j().p();
            }
        }
        bp.c();
        bp.a(bv.k, String.valueOf(aw.cl) + " " + bv.n, 30);
        main.a.h();
        main.a.d = false;
        v.b();
        v.a();
        main.a.X = 2;
        main.a.Y = l.d() + 1000L;
    }

    private void e(y y2) {
        try {
            Object object;
            ds.c("123 char= " + af.e() == null ? "null" : "!null");
            af af2 = af.e();
            af af3 = af.e();
            af.e();
            short s2 = y2.c().readShort();
            af3.bD = s2;
            af2.B = s2;
            af af4 = af.e();
            af af5 = af.e();
            af.e();
            short s3 = y2.c().readShort();
            af5.bE = s3;
            af4.C = s3;
            af.e().cl = af.e().B;
            af.e().cm = af.e().C;
            ds.c("head= " + af.e().bU + " body= " + af.e().bW + " left= " + af.e().bV + " x= " + af.e().B + " y= " + af.e().C + " chung toc= " + af.e().K);
            if (af.e().B >= 0 && af.e().B <= 100) {
                af.e().I = 1;
            } else if (af.e().B >= bv.a - 100 && af.e().B <= bv.a) {
                af.e().I = -1;
            }
            int n2 = y2.c().readByte();
            ds.c("vGo size= " + n2);
            if (!p.aD.e) {
                p.aD.d = af.e().B - p.j;
                p.aD.c = af.e().C - p.k;
            }
            int n3 = 0;
            while (n3 < n2) {
                new bw(y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readShort(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readUTF());
                ++n3;
            }
            n2 = y2.c().readByte();
            aa.L.removeAllElements();
            n3 = 0;
            while (n3 < n2) {
                object = new aa(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte());
                new aa(n3, y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readBoolean(), y2.c().readShort(), y2.c().readByte(), y2.c().readLong(), y2.c().readByte(), y2.c().readLong(), y2.c().readShort(), y2.c().readShort(), y2.c().readByte(), y2.c().readByte()).P = ((aa)object).m;
                ((aa)object).Q = ((aa)object).n;
                ((aa)object).I = y2.c().readBoolean();
                if (aa.c[((aa)object).C].c != 0) {
                    ((aa)object).o = n3 % 3 == 0 ? -1 : 1;
                    ((aa)object).m += 10 - n3 % 20;
                }
                ((aa)object).J = false;
                cc cc2 = null;
                an an2 = null;
                d d2 = null;
                cl cl2 = null;
                if (((aa)object).C == 70) {
                    cc2 = new cc(n3, (short)((aa)object).m, (short)((aa)object).n, 70, ((aa)object).k, ((aa)object).l, ((aa)object).G);
                }
                if (((aa)object).C == 71) {
                    an2 = new an(n3, (short)((aa)object).m, (short)((aa)object).n, 71, ((aa)object).k, ((aa)object).l);
                }
                if (((aa)object).C == 72) {
                    d2 = new d(n3, (short)((aa)object).m, (short)((aa)object).n, 72, ((aa)object).k, ((aa)object).l);
                }
                if (((aa)object).I) {
                    cl2 = new cl(n3, (short)((aa)object).m, (short)((aa)object).n, ((aa)object).C, ((aa)object).k, ((aa)object).l);
                }
                if (cl2 != null) {
                    p.F.addElement(cl2);
                } else if (cc2 != null) {
                    p.F.addElement(cc2);
                } else if (an2 != null) {
                    p.F.addElement(an2);
                } else if (d2 != null) {
                    p.F.addElement(d2);
                } else {
                    p.F.addElement(object);
                }
                n3 = (byte)(n3 + 1);
            }
            if (af.e().aR != null && p.c(af.e().aR.y) == null) {
                af.e().aR.v();
                af.e().aR.m = af.e().B;
                af.e().aR.n = af.e().C - 40;
                p.F.addElement(af.e().aR);
            }
            y2.c().readByte();
            n2 = y2.c().readByte();
            ds.c("NPC size= " + n2);
            n3 = 0;
            while (n3 < n2) {
                block71: {
                    short s4;
                    byte by2;
                    short s5;
                    short s6;
                    byte by3;
                    block72: {
                        by3 = y2.c().readByte();
                        s6 = y2.c().readShort();
                        s5 = y2.c().readShort();
                        by2 = y2.c().readByte();
                        ds.c("tempalte = " + by2);
                        s4 = y2.c().readShort();
                        ds.c("1");
                        if (by2 == 6) break block71;
                        ds.c("2");
                        if (af.e().aD.c >= 7 && (af.e().aD.c != 7 || af.e().aD.a > 1)) break block72;
                        if (by2 == 7 || by2 == 8 || by2 == 9) break block71;
                        ds.c("3");
                    }
                    if (af.e().aD.c >= 6 || by2 != 16) {
                        if (by2 == 4) {
                            p.j().aM = new k(n3, by3, s6, s5, by2, s4);
                            bt.a().e((byte)2);
                            p.G.addElement(p.j().aM);
                            ds.c("5");
                        } else {
                            do do_ = new do(n3, by3, s6, s5 + 3, by2, s4);
                            p.G.addElement(do_);
                            ds.c("6");
                        }
                    }
                }
                ++n3;
            }
            n2 = y2.c().readByte();
            ds.c("item size = " + n2);
            int n4 = 0;
            while (n4 < n2) {
                short s7 = y2.c().readShort();
                short s8 = y2.c().readShort();
                short s9 = y2.c().readShort();
                short s10 = y2.c().readShort();
                int n5 = y2.c().readInt();
                int n6 = 0;
                if (n5 == -2) {
                    n6 = y2.c().readShort();
                }
                ce ce2 = new ce(n5, s7, s8, (int)s9, (int)s10, (short)n6);
                s8 = 0;
                n6 = 0;
                while (n6 < p.E.size()) {
                    ce ce3 = (ce)p.E.elementAt(n6);
                    if (ce3.d == ce2.d) {
                        s8 = 1;
                        break;
                    }
                    ++n6;
                }
                if (s8 == 0) {
                    p.E.addElement(ce2);
                }
                ++n4;
            }
            bv.v.removeAllElements();
            if (en.b == 1) {
                cz.a();
            }
            cz.l.removeAllElements();
            if (!main.a.a || main.a.a && bv.a() || bv.l == 45 || bv.l == 46 || bv.l == 47 || bv.l == 48 || bv.l == 120 || bv.l == 128 || bv.l == 170 || bv.l == 49) {
                n4 = y2.c().readShort();
                int n7 = 0;
                while (n7 < n4) {
                    short s11 = y2.c().readShort();
                    short s12 = y2.c().readShort();
                    short s13 = y2.c().readShort();
                    if (bv.a(s11) != null) {
                        Object object2 = bv.a(s11);
                        cz cz2 = new cz();
                        new cz().a = s11;
                        cz2.c = ((cz)object2).c;
                        cz2.f = ((cz)object2).f;
                        cz2.g = ((cz)object2).g;
                        cz2.d = s12 * bv.i;
                        cz2.e = s13 * bv.i;
                        cz2.h = ((cz)object2).h;
                        if (bv.b(cz2.a)) {
                            int n8 = cz2.b = n7 % 2 == 0 ? 0 : 2;
                            if (bv.l == 45) {
                                cz2.b = 0;
                            }
                        }
                        if (!cz.k.containsKey(String.valueOf(cz2.c))) {
                            if (en.b == 1) {
                                object2 = l.c("/mapBackGround/" + cz2.c + ".png");
                                if (object2 == null) {
                                    object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    br.b().d();
                                    bt.a().c(cz2.c);
                                }
                                cz.k.put(String.valueOf(cz2.c), object2);
                            } else {
                                s11 = 0;
                                byte[] byArray = eu.b(String.valueOf(en.b) + "bgItem" + cz2.c);
                                object2 = byArray;
                                if (byArray != null) {
                                    if (cz.n != null) {
                                        ds.c("Small  last= " + ((Object)object2).length % 127 + "new Version= " + cz.n[cz2.c]);
                                        if (((Object)object2).length % 127 != cz.n[cz2.c]) {
                                            s11 = 1;
                                        }
                                    }
                                    if (s11 == 0) {
                                        if ((object2 = Image.createImage((byte[])object2, (int)0, (int)((Object)object2).length)) != null) {
                                            cz.k.put(String.valueOf(cz2.c), object2);
                                        } else {
                                            s11 = 1;
                                        }
                                    }
                                } else {
                                    s11 = 1;
                                }
                                if (s11 != 0) {
                                    object2 = l.c("/mapBackGround/" + cz2.c + ".png");
                                    if (object2 == null) {
                                        object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                        bt.a().c(cz2.c);
                                    }
                                    cz.k.put(String.valueOf(cz2.c), object2);
                                }
                            }
                            cz.m.addElement(String.valueOf(cz2.c));
                        }
                        if (!cz.a(String.valueOf(cz2.c))) {
                            cz.l.addElement(String.valueOf(cz2.c));
                        }
                        bv.v.addElement(cz2);
                    }
                    ++n7;
                }
                n7 = 0;
                while (n7 < cz.m.size()) {
                    object = (String)cz.m.elementAt(n7);
                    if (!cz.a((String)object)) {
                        cz.k.remove(object);
                        if (cz.k.containsKey(String.valueOf(object) + "blend" + 1)) {
                            cz.k.remove(String.valueOf(object) + "blend" + 1);
                        }
                        if (cz.k.containsKey(String.valueOf(object) + "blend" + 3)) {
                            cz.k.remove(String.valueOf(object) + "blend" + 3);
                        }
                        cz.m.removeElementAt(n7);
                        --n7;
                    }
                    ++n7;
                }
                ed.d = false;
                ed.e = 0;
                ei.a.removeAllElements();
                ed.a.removeAllElements();
                ea.m.removeAllElements();
                n7 = y2.c().readShort();
                System.out.println("nKey= " + n7);
                int n9 = 0;
                while (n9 < n7) {
                    Object object3 = y2.c().readUTF();
                    String string = y2.c().readUTF();
                    System.out.println("key= " + (String)object3 + " value= " + string + "--------------------------------------------------------------------");
                    String[] stringArray = object3;
                    object3 = string;
                    String[] stringArray2 = stringArray;
                    if (stringArray.equals("eff")) {
                        if (g.I <= 0) {
                            int n10;
                            stringArray2 = ds.a((String)object3, ".", 0);
                            int n11 = Integer.parseInt(stringArray2[0]);
                            int n12 = Integer.parseInt(stringArray2[1]);
                            int n13 = Integer.parseInt(stringArray2[2]);
                            int n14 = Integer.parseInt(stringArray2[3]);
                            if (stringArray2.length <= 4) {
                                n4 = -1;
                                n10 = 1;
                            } else {
                                n4 = Integer.parseInt(stringArray2[4]);
                                n10 = Integer.parseInt(stringArray2[5]);
                            }
                            object3 = new ea(n11, n13, n14, n12, n4, n10);
                            if (stringArray2.length > 6) {
                                object3.b = Integer.parseInt(stringArray2[6]);
                                if (stringArray2.length > 7) {
                                    object3.c = Integer.parseInt(stringArray2[7]);
                                    object3.d = Integer.parseInt(stringArray2[8]);
                                }
                            }
                            ei.a((ea)object3);
                        }
                    } else if (stringArray2.equals("beff") && g.I <= 1) {
                        ed.a(Integer.parseInt((String)object3));
                    }
                    ++n9;
                }
            } else {
                n4 = y2.c().readShort();
                int n15 = 0;
                while (n15 < n4) {
                    y2.c().readShort();
                    y2.c().readShort();
                    y2.c().readShort();
                    ++n15;
                }
                n15 = y2.c().readShort();
                int n16 = 0;
                while (n16 < n15) {
                    y2.c().readUTF();
                    y2.c().readUTF();
                    ++n16;
                }
            }
            bv.p = y2.c().readByte();
            byte by4 = y2.c().readByte();
            n4 = by4;
            ac.a(by4);
        }
        catch (Exception exception) {
            ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap khong thanh cong");
            main.a.e();
            bs.m = true;
            main.a.h();
        }
        main.a.d = false;
        ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap thanh cong");
    }

    private void f(y y2) {
        try {
            try {
                int n2 = y2.c().readByte();
                l.e("messageNotMap: cmd:" + n2);
                switch (n2) {
                    case 16: {
                        a.a().b();
                        break;
                    }
                    case 17: {
                        af.e();
                        af.N();
                        break;
                    }
                    case 18: {
                        main.a.d = false;
                        main.a.h();
                        Integer n3 = new Integer(y2.c().readInt());
                        ((j)null).a(aw.av, new de(aw.bs, main.a.h, 88829, n3), 0);
                        break;
                    }
                    case 20: {
                        af.e().aM = y2.c().readByte();
                        p.aD.a(String.valueOf(aw.bG) + " " + af.e().aM, 0);
                        break;
                    }
                    case 33: {
                        break;
                    }
                    case 35: {
                        main.a.h();
                        p.j().n();
                        p.aD.a(y2.c().readUTF(), 0);
                        break;
                    }
                    case 36: {
                        p.aC = y2.c().readByte();
                        ds.c("load Me Active: " + p.aC);
                        break;
                    }
                    case 4: {
                        main.a.I.e();
                        p.bj = false;
                        p.bk = false;
                        x.d = true;
                        x.e = true;
                        x.f = true;
                        x.g = true;
                        x.h = true;
                        p.ap = y2.c().readByte();
                        p.aq = y2.c().readByte();
                        p.ar = y2.c().readByte();
                        p.as = y2.c().readByte();
                        y2.c().readByte();
                        if (main.a.I.n) {
                            eu.a(eu.e, "");
                            eu.a(eu.f, "");
                        } else {
                            eu.a(String.valueOf(eu.d) + bs.n, "");
                        }
                        ds.c("****** DATA VERSION: Server " + p.ap + " Client " + p.al);
                        ds.c("****** MAP VERSION: Server " + p.aq + " Client " + p.am);
                        ds.c("****** SKILL VERSION: Server " + p.ar + " Client " + p.an);
                        ds.c("****** ITEM VERSION: Server " + p.as + " Client " + p.ao);
                        if (p.ap != p.al) {
                            ds.c("send update data");
                            p.b = false;
                            bt.a().l();
                        } else {
                            try {
                                x.e = false;
                            }
                            catch (Exception exception) {
                                Exception exception2 = exception;
                                exception.printStackTrace();
                                p.al = (byte)-1;
                                bt.a().l();
                            }
                        }
                        if (p.aq != p.am) {
                            p.b = false;
                            bt.a().m();
                        } else {
                            try {
                                if (!p.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NRmap")));
                                    ac.b(dataInputStream);
                                }
                                x.f = false;
                            }
                            catch (Exception exception) {
                                p.am = (byte)-1;
                                bt.a().m();
                            }
                        }
                        if (p.ar != p.an) {
                            p.b = false;
                            bt.a().n();
                        } else {
                            try {
                                if (!p.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NRskill")));
                                    ac.a(dataInputStream);
                                }
                                x.g = false;
                            }
                            catch (Exception exception) {
                                p.an = (byte)-1;
                                bt.a().n();
                            }
                        }
                        if (p.as != p.ao) {
                            p.b = false;
                            bt.a().o();
                        } else {
                            try {
                                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NRitem0")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NRitem1")));
                                this.b(dataInputStream, false);
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(eu.b("NRitem100")));
                                this.b(dataInputStream, false);
                                x.h = false;
                            }
                            catch (Exception exception) {
                                p.ao = (byte)-1;
                                bt.a().o();
                            }
                            try {
                                Object object = eu.b("NRitem101");
                                if (object != null) {
                                    object = new DataInputStream(new ByteArrayInputStream((byte[])object));
                                    this.b((DataInputStream)object, false);
                                }
                            }
                            catch (Exception exception) {}
                        }
                        System.out.println("3>>>readOk:isLoadAllData: " + p.b);
                        if (!p.b) {
                            p.j();
                            p.i();
                        } else {
                            bt.a().p();
                        }
                        n2 = y2.c().readByte();
                        ds.c("CAPTION LENT= " + n2);
                        p.R = new long[n2];
                        n2 = 0;
                        while (n2 < p.R.length) {
                            p.R[n2] = y2.c().readLong();
                            ++n2;
                        }
                        break;
                    }
                    case 6: {
                        ds.c("GET UPDATE_MAP " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        ac.b(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        eu.a("NRmap", byArray);
                        byArray = new byte[]{p.am};
                        eu.a("NRmapVersion", byArray);
                        ds.c("GET UPDATE_MAP NRmapVersion:" + byArray);
                        x.f = false;
                        p.j();
                        p.i();
                        break;
                    }
                    case 7: {
                        ds.c("GET UPDATE_SKILL " + y2.c().available() + " bytes");
                        y2.c().mark(100000);
                        ac.a(y2.c());
                        y2.c().reset();
                        byte[] byArray = new byte[y2.c().available()];
                        y2.c().readFully(byArray);
                        eu.a("NRskill", byArray);
                        byArray = new byte[]{p.an};
                        eu.a("NRskillVersion", byArray);
                        x.g = false;
                        p.j();
                        p.i();
                        break;
                    }
                    case 8: {
                        ds.c("GET UPDATE_ITEM " + y2.c().available() + " bytes");
                        DataInputStream dataInputStream = y2.c();
                        Object object = this;
                        try {
                            ((ac)object).b(dataInputStream, true);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        break;
                    }
                    case 10: {
                        try {
                            af.bI = true;
                            ds.c("REQUEST MAP TEMPLATE");
                            main.a.d = true;
                            bv.f = null;
                            bv.g = null;
                            System.gc();
                            bv.a = y2.c().readByte();
                            bv.b = y2.c().readByte();
                            bv.f = new int[bv.a * bv.b];
                            ds.c("Cmd.REQUEST_MAPTEMPLATE=10  w|H= " + bv.a + "|" + bv.b + "\n Dien Tich = " + bv.a * bv.b);
                            n2 = 0;
                            while (n2 < bv.f.length) {
                                int n4 = y2.c().readByte();
                                if (n4 < 0) {
                                    n4 += 256;
                                }
                                bv.f[n2] = (char)n4;
                                ++n2;
                            }
                            bv.g = new int[bv.f.length];
                            y2 = this.f;
                            this.e(y2);
                            try {
                                byte by2 = y2.c().readByte();
                                n2 = by2;
                                bv.j = by2 != 0;
                            }
                            catch (Exception exception) {}
                        }
                        catch (Exception exception) {
                            Exception exception3 = exception;
                            exception.printStackTrace();
                        }
                        y2.e();
                        this.f.e();
                        this.f = null;
                        y2 = null;
                        break;
                    }
                }
            }
            catch (Exception exception) {
                if (y2 != null) {
                    y2.e();
                    return;
                }
            }
        }
        finally {
            if (y2 != null) {
                y2.e();
            }
        }
    }

    private static void g(y y2) {
        try {
            try {
                byte by2 = y2.c().readByte();
                switch (by2) {
                    case 2: {
                        String string;
                        bs.j = string = y2.c().readUTF();
                        bs.a(string);
                        try {
                            byte by3 = y2.c().readByte();
                            g.ad = by3 == 1;
                        }
                        catch (Exception exception) {}
                        c = true;
                    }
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                if (y2 != null) {
                    y2.e();
                    return;
                }
            }
        }
        finally {
            if (y2 != null) {
                y2.e();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void h(y var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [19[CASE]], but top level block is 7[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(bf bf2) {
        if (af.e().aC == null) {
            af.e().aC = bf2;
        } else if (bf2.a.equals(af.e().aC.a)) {
            af.e().aC = bf2;
        }
        af.e().az.addElement(bf2);
        if ((bf2.a.e == 1 || bf2.a.e == 4 || bf2.a.e == 2 || bf2.a.e == 3) && (bf2.a.c == 0 || bf2.a.c > 0 && bf2.c > 0)) {
            if (bf2.a.a == af.e().aP) {
                bt.a().i(af.e().aP);
            }
            af.e().aA.addElement(bf2);
        }
    }

    private static boolean a(af object, y y2) {
        try {
            ((af)object).Q = y2.c().readByte();
            ((af)object).bc = y2.c().readBoolean();
            ((af)object).aN = y2.c().readByte();
            ds.c("ADD TYPE PK= " + ((af)object).aN + " to player " + ((af)object).J);
            ((af)object).ax = p.I[y2.c().readByte()];
            ((af)object).K = y2.c().readByte();
            ((af)object).bU = y2.c().readShort();
            ((af)object).ag = y2.c().readUTF();
            ((af)object).cT = ((af)object).U = y2.c().readLong();
            if (((af)object).U == 0L) {
                ((af)object).H = 14;
            }
            ((af)object).V = y2.c().readLong();
            if (((af)object).C >= bv.d - 100) {
                ((af)object).bq = true;
            }
            ((af)object).bW = y2.c().readShort();
            ((af)object).bV = y2.c().readShort();
            ((af)object).bX = y2.c().readShort();
            ds.c(" body= " + ((af)object).bW + " leg= " + ((af)object).bV + " bag=" + ((af)object).bX + "BAG ==" + ((af)object).bX + "*********************************");
            ((af)object).bd = true;
            y2.c().readByte();
            if (((af)object).bY == -1) {
                ((af)object).t();
            }
            if (((af)object).bW == -1) {
                ((af)object).u();
            }
            if (((af)object).bV == -1) {
                ((af)object).v();
            }
            ds.c("1");
            ((af)object).B = y2.c().readShort();
            ((af)object).C = y2.c().readShort();
            ((af)object).cl = ((af)object).B;
            ((af)object).cm = ((af)object).C;
            ((af)object).R = y2.c().readShort();
            ((af)object).S = y2.c().readShort();
            int n2 = y2.c().readByte();
            int n3 = 0;
            while (n3 < n2) {
                ec ec2 = new ec(y2.c().readByte(), y2.c().readInt(), y2.c().readInt(), y2.c().readShort());
                ((af)object).aB.addElement(ec2);
                ++n3;
            }
            ds.c("Controller readCharInfo body: body|leg|bag " + ((af)object).bW + ((af)object).bV + ((af)object).bX);
            return true;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return false;
        }
    }

    private void i(y object) {
        try {
            String string = ((y)object).c().readUTF();
            byte by2 = ((y)object).c().readByte();
            byte[] byArray = ai.a((y)object);
            object = byArray;
            Image image = ac.a(byArray);
            as.a(string, image, by2);
            if (object != null) {
                as.a(string, by2, (byte[])object);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void b(DataInputStream dataInputStream, boolean bl2) {
        block17: {
            try {
                dataInputStream.mark(1000000);
                p.ao = dataInputStream.readByte();
                int n2 = dataInputStream.readByte();
                l.e(">>loadItemNew:  type:" + n2);
                if (n2 == 0) {
                    p.j().K = new dn[dataInputStream.readShort()];
                    n2 = 0;
                    while (n2 < p.j().K.length) {
                        p.j().K[n2] = new dn();
                        p.j().K[n2].a = n2;
                        p.j().K[n2].b = dataInputStream.readUTF();
                        p.j();
                        dataInputStream.readByte();
                        ++n2;
                    }
                    try {
                        n2 = dataInputStream.readShort();
                        int n3 = 0;
                        while (n3 < n2) {
                            short s2 = dataInputStream.readShort();
                            p.j().K[s2].c = dataInputStream.readUnsignedByte();
                            ++n3;
                        }
                    }
                    catch (Exception exception) {}
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        eu.a("NRitem0", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 == 1) {
                    Object object;
                    dp.a.clear();
                    n2 = dataInputStream.readShort();
                    int n4 = 0;
                    while (n4 < n2) {
                        dd dd2 = new dd((short)n4, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean());
                        object = dd2;
                        dp.a(dd2);
                        ++n4;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        eu.a("NRitem1", byArray);
                        object = new byte[]{p.ao};
                        eu.a("NRitemVersion", object);
                        return;
                    }
                    break block17;
                }
                if (n2 == 2) break block17;
                if (n2 == 100) {
                    af.cU = ac.c(dataInputStream);
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        eu.a("NRitem100", byArray);
                        return;
                    }
                    break block17;
                }
                if (n2 != 101) break block17;
                try {
                    n2 = dataInputStream.readShort();
                    af.da = new short[n2];
                    int n5 = 0;
                    while (n5 < n2) {
                        short s3;
                        af.da[n5] = s3 = dataInputStream.readShort();
                        ++n5;
                    }
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        eu.a("NRitem101", byArray);
                        return;
                    }
                }
                catch (Exception exception) {
                    af.da = new short[0];
                    return;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void b(y y2, int n2) {
        try {
            int n3 = y2.c().readByte();
            int[][] nArrayArray = new int[n3][];
            int n4 = 0;
            while (n4 < n3) {
                int n5 = y2.c().readByte();
                nArrayArray[n4] = new int[n5];
                int n6 = 0;
                while (n6 < n5) {
                    nArrayArray[n4][n6] = y2.c().readByte();
                    ++n6;
                }
                ++n4;
            }
            d.put(String.valueOf(n2), nArrayArray);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static int[][] c(DataInputStream dataInputStream) {
        int[][] nArrayArray = new int[][]{{542, 543}};
        try {
            int n2 = dataInputStream.readShort();
            nArrayArray = new int[n2][];
            n2 = 0;
            while (n2 < nArrayArray.length) {
                int n3 = dataInputStream.readByte();
                nArrayArray[n2] = new int[n3];
                int n4 = 0;
                while (n4 < n3) {
                    nArrayArray[n2][n4] = dataInputStream.readShort();
                    ++n4;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return nArrayArray;
    }

    private void j(y object) {
        block11: {
            try {
                block12: {
                    byte by2 = ((y)object).c().readByte();
                    if (by2 != 0) break block11;
                    try {
                        byte s2 = ((y)object).c().readByte();
                        if (s2 == 0) {
                            short s3 = ((y)object).c().readShort();
                            String string = ((y)object).c().readUTF();
                            String string2 = ((y)object).c().readUTF();
                            int n2 = ((y)object).c().readInt();
                            short s4 = ((y)object).c().readShort();
                            byte by3 = ((y)object).c().readByte();
                            p.bY = new cg(by2, s3, string, string2, n2, s4);
                            new cg(by2, s3, string, string2, n2, s4).g = by3;
                            p.bY.a(by2, 0, 0);
                            break block11;
                        }
                        if (s2 == 1) {
                            int n3 = ((y)object).c().readInt();
                            int n4 = ((y)object).c().readInt();
                            if (p.bY == null) break block12;
                            int n5 = n3;
                            object = p.bY;
                            p.bY.a = by2;
                            ((cg)object).c = n5;
                            ((cg)object).d = n4;
                            break block11;
                        }
                        if (s2 == 2) {
                            byte by3 = ((y)object).c().readByte();
                            int n6 = 0;
                            if (by3 == 1) {
                                n6 = 1;
                            } else if (by3 == 2) {
                                n6 = 2;
                            }
                            p.bY = null;
                            p.a(n6, -1, 0, main.a.C, main.a.D, 0, 0, (short)-1, null);
                            break block11;
                        }
                        if (s2 == 5) {
                            short s5 = ((y)object).c().readShort();
                            if (p.bY == null) break block12;
                            short s6 = s5;
                            object = p.bY;
                            p.bY.a = by2;
                            ((cg)object).m = s6;
                            ((cg)object).n = main.a.b;
                            break block11;
                        }
                        if (s2 != 4) break block12;
                        byte by4 = ((y)object).c().readByte();
                        byte by5 = ((y)object).c().readByte();
                        if (p.bY == null) break block12;
                        p.bY.a(by2, by4, by5);
                        break block11;
                    }
                    catch (Exception exception) {}
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void k(y object) {
        try {
            int n2 = ((y)object).c().readByte();
            if (n2 == 0) {
                short s2;
                af.e().cZ = s2 = ((y)object).c().readShort();
                bu.a();
                bu.g();
                return;
            }
            if (n2 == 2) {
                int n3 = ((y)object).c().readInt();
                byte by2 = ((y)object).c().readByte();
                n2 = ((y)object).c().readShort();
                String string = String.valueOf(n2) + "," + by2;
                as.a("banner_" + n2, as.a);
                main.a.T.put(String.valueOf(n3), string);
                return;
            }
            if (n2 == 3) {
                short s3 = ((y)object).c().readShort();
                bl.a(s3);
                ed.c = s3;
                return;
            }
            if (n2 == 4) {
                String string = ((y)object).c().readUTF();
                main.a.U.addElement(string);
                return;
            }
            if (n2 == 5) {
                String string = "\n|ChienTruong|Log: ";
                int n4 = ((y)object).c().readByte();
                if (n4 == 0) {
                    p.cc = ((y)object).c().readUTF();
                    byte by3 = ((y)object).c().readByte();
                    p.bZ = by3;
                    p.ca = by3;
                    p.cd = by3 << 1;
                    p.ce = false;
                    string = String.valueOf(string) + "\tsub    0|  nCT_team= " + p.cc + "|nCT_TeamA =" + p.ca + "  isPaint_CT=false \n";
                } else if (n4 == 1) {
                    n2 = ((y)object).c().readInt();
                    p.cf = n4 = ((y)object).c().readByte();
                    p.cb = (long)(n2 * 1000) + l.d();
                    p.ce = true;
                    string = String.valueOf(string) + "\tsub    1 floor= " + n4 + "|timeBallte= " + n2 + "isPaint_CT=true \n";
                } else if (n4 == 2) {
                    p.ca = ((y)object).c().readByte();
                    p.bZ = ((y)object).c().readByte();
                    p.cg.removeAllElements();
                    n2 = ((y)object).c().readByte();
                    n4 = 0;
                    while (n4 < n2) {
                        String string2 = "";
                        string2 = String.valueOf(string2) + ((y)object).c().readByte() + "|";
                        string2 = String.valueOf(string2) + ((y)object).c().readUTF() + "|";
                        string2 = String.valueOf(string2) + ((y)object).c().readShort() + "|";
                        string2 = String.valueOf(string2) + ((y)object).c().readInt();
                        p.cg.addElement(string2);
                        ++n4;
                    }
                    string = String.valueOf(string) + "\tsub   2|  A= " + p.ca + "|B =" + p.bZ + "  isPaint_CT=true \n";
                } else if (n4 == 3) {
                    block22: {
                        object = bt.a();
                        y y2 = null;
                        try {
                            try {
                                y2 = new y(24);
                                y2.d().writeByte(n2);
                                y2.d().writeByte(n4);
                                ds.b(" =====> SEND OPTION_HAT " + n2 + "_" + n4);
                                ((bt)object).a.a(y2);
                            }
                            catch (Exception exception) {
                                y2.e();
                                break block22;
                            }
                        }
                        catch (Throwable throwable) {
                            y2.e();
                            throw throwable;
                        }
                        y2.e();
                    }
                    p.cf = 0;
                    p.cb = 0L;
                    p.ce = false;
                    string = String.valueOf(string) + "\tsub    3|  isPaint_CT=false \n";
                } else if (n4 == 4) {
                    p.ci = ((y)object).c().readByte();
                    p.cj = ((y)object).c().readByte();
                }
                string = String.valueOf(string) + "END LOG CT.";
                ds.b(string);
                return;
            }
            ac.a((byte)n2, (y)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void l(y object) {
        try {
            int n2 = ((y)object).c().readShort();
            int n3 = -1;
            try {
                n3 = ((y)object).c().readByte();
            }
            catch (Exception exception) {}
            if (n3 == 0) {
                short s2 = ((y)object).c().readShort();
                n3 = 0;
                while (n3 < af.e().az.size()) {
                    bf bf2 = (bf)af.e().az.elementAt(n3);
                    if (bf2.b == n2) {
                        bf2.m = s2;
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == 1) {
                byte by2 = ((y)object).c().readByte();
                n3 = 0;
                while (n3 < af.e().az.size()) {
                    bf bf3 = (bf)af.e().az.elementAt(n3);
                    if (bf3.b == n2) {
                        n2 = 0;
                        while (n2 < 20) {
                            String string = "Skills_" + bf3.a.a + "_" + by2 + "_" + n2;
                            as.a(string, as.a);
                            ++n2;
                        }
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == -1) {
                bf bf4;
                object = o.a((short)n2);
                n3 = 0;
                while (n3 < af.e().az.size()) {
                    bf4 = (bf)af.e().az.elementAt(n3);
                    if (bf4.a.a == ((bf)object).a.a) {
                        af.e().az.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < af.e().aA.size()) {
                    bf4 = (bf)af.e().aA.elementAt(n3);
                    if (bf4.a.a == ((bf)object).a.a) {
                        af.e().aA.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < p.aQ.length) {
                    if (p.aQ[n3] != null && p.aQ[n3].a.a == ((bf)object).a.a) {
                        p.aQ[n3] = object;
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < p.aP.length) {
                    if (p.aP[n3] != null && p.aP[n3].a.a == ((bf)object).a.a) {
                        p.aP[n3] = object;
                        break;
                    }
                    ++n3;
                }
                if (af.e().aC.a.a == ((bf)object).a.a) {
                    af.e().aC = object;
                }
                p.aD.a(String.valueOf(aw.eD) + ((bf)object).a.b + aw.eE + ((bf)object).c, 0);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static void a(byte by2, y y2) {
        block12: {
            try {
                int n2;
                String string;
                if (by2 != 127) break block12;
                main.a.h();
                bs.j = string = y2.c().readUTF();
                bs.a(string);
                ds.c(">>>>read.isEXTRA_LINK " + string);
                int n3 = y2.c().readByte();
                ds.c(">>>>read.isEXTRA_LINK  numSv: " + n3);
                if (n3 > 0) {
                    bs.e = new byte[n3];
                    bs.f = new af[n3];
                    n2 = 0;
                    while (n2 < n3) {
                        bs.e[n2] = y2.c().readByte();
                        ds.c(String.valueOf(bs.a[n2]) + ">>>>read.isEXTRA_LINK  typeClass: " + bs.e[n2]);
                        if (bs.e[n2] >= 0) {
                            bs.g = true;
                            bs.f[n2] = new af();
                            bs.f[n2].K = bs.e[n2];
                            bs.f[n2].bU = y2.c().readShort();
                            bs.f[n2].bW = y2.c().readShort();
                            bs.f[n2].bV = y2.c().readShort();
                            bs.f[n2].bX = y2.c().readShort();
                            bs.f[n2].ag = y2.c().readUTF();
                        }
                        ++n2;
                    }
                }
                bs.m();
                bs.c = false;
                af.bI = false;
                x.c = false;
                bs.m = false;
                n2 = 0;
                n3 = 0;
                try {
                    if (!eu.c(eu.e).equals("")) {
                        n2 = 1;
                    }
                    if (!eu.c(String.valueOf(eu.d) + bs.n).equals("")) {
                        n3 = 1;
                    }
                }
                catch (Exception exception) {}
                if (!bs.g && n2 == 0 && n3 == 0) {
                    bs.l();
                    return;
                }
                if (eu.d(bs.w) == -1) {
                    ev.b = false;
                    main.a.al.b();
                    return;
                }
                bs.a(eu.d(bs.w), false);
                if (bs.f != null && bs.f[bs.n] != null) {
                    main.a.am.a(bs.f[bs.n]);
                    return;
                }
                bs.l();
                return;
            }
            catch (Exception exception) {
                ds.c(">>>>read.isEXTRA_LINK  errr:");
                main.a.al.b();
            }
        }
    }

    public static ee b(y y2) {
        ee ee2 = null;
        try {
            short s2 = y2.c().readShort();
            int n2 = y2.c().readInt();
            if (s2 != -1) {
                ee2 = new ee(s2, n2);
            }
        }
        catch (Exception exception) {
            ds.b(">>>>read.ItemOption  errr:");
        }
        return ee2;
    }

    private void m(y y2) {
        try {
            byte by2 = y2.c().readByte();
            l.e(">>---read_cmdExtraBig-sub:" + by2 + "  " + y2.c().available());
            if (by2 == 0) {
                this.b(y2.c(), true);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

