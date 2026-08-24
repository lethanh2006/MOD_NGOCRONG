/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import main.a;

public final class bt {
    db a = br.a();
    private static bt g;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static boolean f;

    public static bt a() {
        if (g == null) {
            g = new bt();
        }
        return g;
    }

    public final void a(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(18);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(String object, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        y y2 = null;
        try {
            try {
                y2 = new y(42);
                y2.d().writeUTF((String)object);
                y2.d().writeUTF(string);
                y2.d().writeUTF(string2);
                y2.d().writeUTF(string3);
                y2.d().writeUTF(string4);
                y2.d().writeUTF(string5);
                y2.d().writeUTF(string6);
                y2.d().writeUTF(string7);
                y2.d().writeUTF(string8);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, el el2) {
        ds.c("combine");
        y y2 = null;
        try {
            try {
                y2 = new y(-81);
                y2.d().writeByte(1);
                y2.d().writeByte(el2.size());
                int n2 = 0;
                while (n2 < el2.size()) {
                    y2.d().writeByte(((h)el2.elementAt((int)n2)).g);
                    ds.c("gui id " + ((h)el2.elementAt((int)n2)).g);
                    ++n2;
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, byte by3, int n3) {
        ds.c("giao dich action = " + by2);
        y y2 = null;
        try {
            try {
                y2 = new y(-86);
                y2.d().writeByte(by2);
                if (by2 == 0 || by2 == 1) {
                    y2.d().writeInt(n2);
                }
                if (by2 == 2) {
                    ds.c("gui len indxe =" + by3 + " num= " + n3);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    y2.d().writeByte(by3);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(cd[] cdArray) {
        y y2 = null;
        try {
            try {
                y2 = new y(-125);
                y2.d().writeByte(cdArray.length);
                int n2 = 0;
                while (n2 < cdArray.length) {
                    y2.d().writeUTF(cdArray[n2].d());
                    ++n2;
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2) {
        y y2 = null;
        try {
            try {
                y2 = new y(112);
                y2.d().writeByte(0);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(char c2) {
        ds.c("cap char c= " + c2);
        y y2 = null;
        try {
            try {
                y2 = new y(-85);
                y2.d().writeChar(c2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2) {
        ds.c("add friend");
        y y2 = null;
        try {
            try {
                y2 = new y(-80);
                y2.d().writeByte(by2);
                if (n2 != -1) {
                    y2.d().writeInt(n2);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2) {
        ds.c("get ngoc");
        y y2 = null;
        try {
            try {
                y2 = new y(-76);
                y2.d().writeByte(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-79);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-62);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(byte by2) {
        ds.c("Skill not focus so " + by2);
        y y2 = null;
        try {
            try {
                y2 = new y(-45);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void d(int n2) {
        y y2 = null;
        try {
            try {
                ds.c("CLAN DONATE");
                y2 = new y(-54);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(int n2, String string, int n3) {
        y y2 = null;
        try {
            try {
                ds.c("CLAN MESSAGE");
                y2 = new y(-51);
                y2.d().writeByte(n2);
                if (n2 == 0) {
                    y2.d().writeUTF(string);
                }
                if (n2 == 2) {
                    y2.d().writeInt(n3);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, byte by3, byte by4, short s2) {
        if (af.e().H == 14) {
            return;
        }
        y y2 = null;
        try {
            try {
                y2 = new y(-43);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeByte(by4);
                if (by4 == -1) {
                    y2.d().writeShort(s2);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(int n2, byte by2) {
        ds.c("JOIN CLAN " + n2);
        y y2 = null;
        try {
            try {
                y2 = new y(-49);
                y2.d().writeInt(n2);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void e(int n2) {
        ds.c("MEMBER CLAN " + n2);
        y y2 = null;
        try {
            try {
                y2 = new y(-50);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(String object) {
        ds.c("send SEARCH CLAN " + (String)object);
        y y2 = null;
        try {
            try {
                y2 = new y(-47);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2, byte by2) {
        ds.c("REMOTE CLAN id = " + n2 + " role= " + by2);
        y y2 = null;
        try {
            try {
                y2 = new y(-56);
                y2.d().writeInt(n2);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b() {
        ds.c("LEAVE CLAN");
        y y2 = null;
        try {
            try {
                y2 = new y(-55);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, int n3, int n4) {
        ds.c("invite action = " + by2 + "layerid= " + n2 + " clanID= " + n3 + " code= " + n4);
        y y2 = null;
        try {
            try {
                y2 = new y(-57);
                y2.d().writeByte(by2);
                if (by2 == 0) {
                    y2.d().writeInt(n2);
                }
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeInt(n3);
                    y2.d().writeInt(n4);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, String string) {
        y y2 = null;
        try {
            try {
                y2 = new y(-46);
                y2.d().writeByte(by2);
                if (by2 == 2 || by2 == 4) {
                    y2.d().writeShort((short)n2);
                    y2.d().writeUTF(string);
                    ds.c("SEND SLOGAN= " + string);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, byte by3) {
        y y2 = null;
        try {
            try {
                y2 = new y(-40);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public static y d(byte by2) {
        y y2 = new y(-29);
        y2.d().writeByte(by2);
        return y2;
    }

    private static y i(byte by2) {
        y y2 = new y(-28);
        y2.d().writeByte(by2);
        return y2;
    }

    public final void c() {
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
            InputStream inputStream = this.getClass().getResourceAsStream("res\\info");
            if (inputStream != null) {
                inputStream.read(null);
                y2.d().writeShort((null).length);
                ((OutputStream)y2.d()).write(null);
                ds.b("write " + (null).length + "|" + "2.5.0");
            }
            this.a.a(y2);
            y2.e();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void d() {
        y y2 = null;
        try {
            try {
                y2 = new y(-120);
                this.a.a(y2);
            }
            catch (Exception exception) {
                b = l.d();
                y2.e();
                return;
            }
        }
        finally {
            b = l.d();
            y2.e();
        }
    }

    public final void e() {
        y y2 = null;
        try {
            try {
                y2 = new y(-121);
                this.a.a(y2);
            }
            catch (Exception exception) {
                c = l.d();
                y2.e();
                return;
            }
        }
        finally {
            c = l.d();
            y2.e();
        }
    }

    public final void a(String object, String string, String string2, byte by2) {
        ds.c("Login " + (String)object + " " + string + " " + string2);
        try {
            y y2 = bt.d((byte)0);
            y2.d().writeUTF((String)object);
            y2.d().writeUTF(string);
            y2.d().writeUTF(string2);
            y2.d().writeByte(by2);
            y2.d().writeByte(aw.fB);
            this.a.a(y2);
            y2.e();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void a(String string, String string2, String string3, String object) {
        ds.c("Request Register " + string + " " + string2 + " " + (String)object);
        try {
            object = bt.d((byte)1);
            ((y)object).d().writeUTF(string);
            ((y)object).d().writeUTF(string2);
            if (string3 != null && !string3.equals("")) {
                ((y)object).d().writeUTF(string3);
                ((y)object).d().writeUTF("a");
            }
            this.a.a((y)object);
            ((y)object).e();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void f() {
        y y2 = new y(-23);
        this.a.a(y2);
        y2.e();
    }

    public final void e(byte by2) {
        y y2 = new y(-34);
        try {
            y2.d().writeByte(by2);
            this.a.a(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f(int n2) {
        y y2 = new y(21);
        try {
            y2.d().writeByte(n2);
            this.a.a(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g(int n2) {
        y y2 = new y(-78);
        try {
            y2.d().writeInt(n2);
            this.a.a(y2);
            y2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g() {
        int n2 = af.e().B - af.e().bD;
        int n3 = af.e().C - af.e().bE;
        if (af.bG || n2 == 0 && n3 == 0 || ac.b || af.e().s || af.e().C <= 0 || af.e().cP) {
            return;
        }
        try {
            y y2 = new y(-7);
            af.e().bD = af.e().B;
            af.e().bE = af.e().C;
            af.e();
            af.e();
            af.e();
            af.e();
            if (bv.a(af.e().B / bv.i, af.e().C / bv.i) == 0) {
                y2.d().writeByte(1);
            } else {
                y2.d().writeByte(0);
            }
            y2.d().writeShort(af.e().B);
            if (n3 != 0) {
                y2.d().writeShort(af.e().C);
            }
            this.a.a(y2);
            ++p.M;
            y2.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(String object, int n2, int n3) {
        y y2 = new y(-28);
        try {
            y2.d().writeByte(2);
            y2.d().writeUTF((String)object);
            y2.d().writeByte(n2);
            y2.d().writeByte(n3);
            ds.c("name= " + (String)object + " gender= " + n2 + " hair=" + n3);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.a.a(y2);
    }

    public final void h(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(11);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, byte by3, short s2) {
        y y2 = null;
        try {
            try {
                y2 = new y(7);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeShort(s2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, int n3) {
        y y2 = null;
        try {
            try {
                y2 = new y(6);
                y2.d().writeByte(by2);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void i(int n2) {
        ds.c(String.valueOf(af.e().ag) + " SELECT SKILL " + n2);
        y y2 = null;
        try {
            try {
                y2 = new y(34);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(short s2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-66);
                y2.d().writeShort(s2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void h() {
        y y2 = null;
        try {
            try {
                y2 = new y(29);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(short s2, byte by2) {
        ds.c("confirme menu=" + by2 + " npc= " + s2);
        y y2 = null;
        try {
            try {
                y2 = new y(32);
                y2.d().writeShort(s2);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void j(int n2) {
        ds.c("npc id" + n2);
        y y2 = null;
        try {
            try {
                y2 = new y(33);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(int n2, int n3, int n4) {
        y y2 = null;
        try {
            try {
                y2 = new y(22);
                y2.d().writeByte(n2);
                y2.d().writeByte(n3);
                y2.d().writeByte(n4);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(short s2) {
        y y2 = null;
        try {
            try {
                y2 = new y(27);
                y2.d().writeShort(s2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(short s2, String string) {
        y y2 = null;
        try {
            try {
                y2 = new y(88);
                y2.d().writeShort(s2);
                y2.d().writeUTF(string);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(h[] hArray) {
        main.a.L.b();
        y y2 = null;
        try {
            try {
                y2 = new y(13);
                int n2 = 0;
                while (n2 < hArray.length) {
                    if (hArray[n2] != null) {
                        y2.d().writeByte(hArray[n2].g);
                    }
                    ++n2;
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void k(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(37);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void i() {
        y y2 = null;
        try {
            try {
                y2 = new y(50);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(el el2, el el3, int n2) {
        try {
            ds.c("SEND ATTACT vChar=  " + el3.size());
            y y2 = null;
            if (n2 == 0) {
                return;
            }
            if (el2.size() > 0 && el3.size() > 0) {
                bq bq2;
                if (n2 == 1) {
                    y2 = new y(-4);
                } else if (n2 == 2) {
                    y2 = new y(67);
                }
                y2.d().writeByte(el2.size());
                n2 = 0;
                while (n2 < el2.size()) {
                    bq2 = (aa)el2.elementAt(n2);
                    y2.d().writeByte(bq2.y);
                    ++n2;
                }
                n2 = 0;
                while (n2 < el3.size()) {
                    bq2 = (af)el3.elementAt(n2);
                    if (bq2 != null) {
                        y2.d().writeInt(((af)bq2).J);
                    } else {
                        y2.d().writeInt(-1);
                    }
                    ++n2;
                }
            } else if (el2.size() > 0) {
                ds.c("PLAYER ATTACK NPC");
                y2 = new y(54);
                n2 = 0;
                while (n2 < el2.size()) {
                    aa aa2 = (aa)el2.elementAt(n2);
                    if (!aa2.J) {
                        y2.d().writeByte(aa2.y);
                    } else {
                        y2.d().writeByte(-1);
                        y2.d().writeInt(aa2.y);
                    }
                    ++n2;
                }
            } else if (el3.size() > 0) {
                ds.c("player attack player ");
                y2 = new y(-60);
                n2 = 0;
                while (n2 < el3.size()) {
                    af af2 = (af)el3.elementAt(n2);
                    y2.d().writeInt(af2.J);
                    ++n2;
                }
            }
            y2.d().writeByte((byte)af.e().I);
            if (y2 == null) {
                return;
            }
            this.a.a(y2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void l(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-20);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void j() {
        y y2 = null;
        try {
            try {
                y2 = new y(-15);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void k() {
        y y2 = null;
        try {
            try {
                y2 = new y(-16);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(String object) {
        y y2 = null;
        try {
            try {
                ds.c("Send chat " + (String)object);
                y2 = new y(44);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void l() {
        y y2 = null;
        try {
            try {
                y2 = new y(-87);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void m() {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)6);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void n() {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)7);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void o() {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)8);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void p() {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)13);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(String object) {
        y y2 = null;
        try {
            try {
                y2 = new y(53);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void m(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(76);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void n(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(77);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, byte by3, int n2) {
        ds.c("PLAYER VS PLAYER");
        y y2 = null;
        try {
            try {
                y2 = new y(-59);
                y2.d().writeByte(by2);
                y2.d().writeByte(by3);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void o(int n2) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)10);
                y2.d().writeByte(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void d(String object) {
        y y2 = null;
        try {
            try {
                y2 = new y(17);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(String object, int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-72);
                y2.d().writeInt(n2);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void e(String object) {
        y y2 = null;
        try {
            try {
                y2 = new y(-71);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(String object, String string) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)16);
                y2.d().writeUTF((String)object);
                y2.d().writeUTF(string);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(String object, int n2) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)18);
                y2.d().writeInt(n2);
                y2.d().writeUTF((String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void p(int n2) {
        main.a.b();
        y y2 = null;
        try {
            try {
                y2 = new y(-67);
                y2.d().writeInt(n2);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void q(int n2) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)37);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void r(int n2) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)41);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void s(int n2) {
        y y2 = null;
        try {
            try {
                y2 = bt.i((byte)39);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(short s2) {
        ds.c("get image id= " + s2);
        y y2 = null;
        try {
            try {
                y2 = new y(-32);
                y2.d().writeShort(s2);
                this.a = br.b().d() && !br.b().e ? br.b() : br.a();
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void q() {
        ds.c("send map offline");
        y y2 = null;
        try {
            try {
                y2 = new y(-33);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void r() {
        y y2 = null;
        try {
            try {
                y2 = new y(-38);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void t(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-38);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void s() {
        ds.c("finishLoadMap");
        y y2 = null;
        try {
            try {
                y2 = new y(-39);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void u(int n2) {
        ds.c("request bag image");
        y y2 = null;
        try {
            try {
                y2 = new y(-63);
                y2.d().writeShort(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void f(String object) {
        ds.c("Login 2");
        y y2 = null;
        try {
            try {
                y2 = new y(-101);
                y2.d().writeUTF((String)object);
                y2.d().writeByte(1);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void f(byte by2) {
        ds.c("request magic tree");
        y y2 = null;
        try {
            try {
                y2 = new y(-34);
                y2.d().writeByte(2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(int n2, int n3) {
        y y2 = null;
        try {
            try {
                int n4 = 16;
                y y3 = new y(-30);
                y3.d().writeByte(16);
                y2 = y3;
                y2.d().writeByte(n2);
                y2.d().writeShort(n3);
                ds.c("g\u1eedi t\u0103ng ti\u1ec1m n\u0103ng NUM= " + n3 + " type= " + n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, el object) {
        ds.c("request resource action= " + by2);
        object = null;
        try {
            try {
                object = new y(-74);
                ((y)object).d().writeByte(by2);
                if (br.b().d() && !br.b().e) {
                    this.a = br.b();
                } else {
                    f = true;
                    this.a = br.a();
                }
                this.a.a((y)object);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                ((y)object).e();
                return;
            }
        }
        finally {
            ((y)object).e();
        }
    }

    public final void v(int n2) {
        ds.c("request magic tree");
        y y2 = null;
        try {
            try {
                y2 = new y(-91);
                y2.d().writeByte(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void t() {
        y y2 = null;
        try {
            try {
                y2 = new y(-107);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(String object, byte by2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-96);
                y2.d().writeUTF((String)object);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void w(int n2) {
        ds.c("GUI THACH DAUA");
        y y2 = null;
        try {
            try {
                y2 = new y(-118);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, int n2) {
        ds.c("add friend");
        y y2 = null;
        try {
            try {
                y2 = new y(-99);
                y2.d().writeByte(by2);
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeInt(n2);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, byte by3, int n3, int n4) {
        y y2 = null;
        try {
            try {
                ds.c("ki gui action= " + by2 + " item id= " + n2);
                y2 = new y(-100);
                y2.d().writeByte(by2);
                if (by2 == 0) {
                    y2.d().writeShort(n2);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                    y2.d().writeInt(n4);
                    ds.c("ki gui so luong " + n4);
                }
                if (by2 == 1 || by2 == 2) {
                    y2.d().writeShort(n2);
                }
                if (by2 == 3) {
                    y2.d().writeShort(n2);
                    y2.d().writeByte(by3);
                    y2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    y2.d().writeByte(by3);
                    y2.d().writeByte(n3);
                    ds.c("currTab= " + by3 + " page= " + n3);
                }
                if (by2 == 5) {
                    y2.d().writeShort(n2);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(byte by2, byte by3) {
        y y2 = null;
        try {
            try {
                y2 = new y(-103);
                y2.d().writeByte(by2);
                ds.c("------------service--  " + by2 + "   " + by3);
                if (by2 != 0) {
                    y2.d().writeByte(by3);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void x(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-104);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void g(byte by2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-108);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void u() {
        y y2 = null;
        try {
            try {
                y2 = new y(-105);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void h(byte by2) {
        y y2 = null;
        try {
            try {
                ds.c("FUNSION");
                y2 = new y(125);
                y2.d().writeByte(by2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(el el2) {
        y y2 = null;
        try {
            try {
                ds.c("IMAGE SOURCE size= " + el2.size());
                y2 = new y(-111);
                y2.d().writeShort(el2.size());
                if (el2.size() > 0) {
                    int n2 = 0;
                    while (n2 < el2.size()) {
                        ds.c("gui len str " + ((u)el2.elementAt((int)n2)).a);
                        y2.d().writeUTF(((u)el2.elementAt((int)n2)).a);
                        ++n2;
                    }
                }
                if (br.b().d() && !br.b().e) {
                    this.a = br.b();
                } else {
                    this.a = br.a();
                    f = true;
                }
                this.a.a(y2);
                this.a = br.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, int n2, byte[] byArray) {
        y y2 = null;
        try {
            try {
                ds.c("SERVER DATA");
                y2 = new y(-110);
                y2.d().writeByte(1);
                y2.d().writeInt(n2);
                if (byArray != null) {
                    n2 = byArray.length;
                    y2.d().writeShort(n2);
                    y2.d().write(byArray, 0, n2);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte[] byArray) {
        y y2 = null;
        try {
            try {
                y2 = new y(-113);
                int n2 = 0;
                while (n2 < p.aQ.length) {
                    y2.d().writeByte(byArray[n2]);
                    ++n2;
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void v() {
        y y2 = null;
        try {
            try {
                y2 = new y(-114);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void y(int n2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-30);
                y2.d().writeByte(63);
                y2.d().writeInt(n2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(int n2, short s2) {
        y y2 = null;
        try {
            try {
                y2 = new y(-30);
                y2.d().writeByte(64);
                y2.d().writeInt(n2);
                y2.d().writeShort(s2);
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void g(String object) {
        y y2 = null;
        try {
            try {
                y2 = new y(66);
                y2.d().writeUTF((String)object);
                ds.c(">>>getGetImgByName = " + (String)object);
                this.a.a(y2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void c(byte by2, byte by3) {
        y y2 = new y(-127);
        try {
            try {
                y2.d().writeByte(by2);
                if (by3 > 0) {
                    y2.d().writeByte(by3);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void b(int n2, int n3) {
        y y2 = new y(127);
        try {
            try {
                y2.d().writeByte(n2);
                if (n3 != -1) {
                    y2.d().writeShort(n3);
                }
                this.a.a(y2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void w() {
        y y2 = new y(69);
        try {
            try {
                this.a.a(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }

    public final void a(byte by2, byte by3, short s2, short s3) {
        y y2 = null;
        try {
            try {
                y2 = new y(-45);
                y2.d().writeByte(20);
                y2.d().writeByte(by2);
                y2.d().writeShort(af.e().B);
                y2.d().writeShort(af.e().C);
                y2.d().writeByte(by3);
                y2.d().writeShort(s2);
                y2.d().writeShort(s3);
                this.a.a(y2);
            }
            catch (Exception exception) {
                y2.e();
                return;
            }
        }
        finally {
            y2.e();
        }
    }
}

