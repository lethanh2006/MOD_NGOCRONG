/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class ds {
    private static short[] d;
    private static short[] e;
    private static int[] f;
    public static Random a;
    public static boolean b;
    public static boolean c;

    static {
        short[] sArray = new short[91];
        sArray[1] = 18;
        sArray[2] = 36;
        sArray[3] = 54;
        sArray[4] = 71;
        sArray[5] = 89;
        sArray[6] = 107;
        sArray[7] = 125;
        sArray[8] = 143;
        sArray[9] = 160;
        sArray[10] = 178;
        sArray[11] = 195;
        sArray[12] = 213;
        sArray[13] = 230;
        sArray[14] = 248;
        sArray[15] = 265;
        sArray[16] = 282;
        sArray[17] = 299;
        sArray[18] = 316;
        sArray[19] = 333;
        sArray[20] = 350;
        sArray[21] = 367;
        sArray[22] = 384;
        sArray[23] = 400;
        sArray[24] = 416;
        sArray[25] = 433;
        sArray[26] = 449;
        sArray[27] = 465;
        sArray[28] = 481;
        sArray[29] = 496;
        sArray[30] = 512;
        sArray[31] = 527;
        sArray[32] = 543;
        sArray[33] = 558;
        sArray[34] = 573;
        sArray[35] = 587;
        sArray[36] = 602;
        sArray[37] = 616;
        sArray[38] = 630;
        sArray[39] = 644;
        sArray[40] = 658;
        sArray[41] = 672;
        sArray[42] = 685;
        sArray[43] = 698;
        sArray[44] = 711;
        sArray[45] = 724;
        sArray[46] = 737;
        sArray[47] = 749;
        sArray[48] = 761;
        sArray[49] = 773;
        sArray[50] = 784;
        sArray[51] = 796;
        sArray[52] = 807;
        sArray[53] = 818;
        sArray[54] = 828;
        sArray[55] = 839;
        sArray[56] = 849;
        sArray[57] = 859;
        sArray[58] = 868;
        sArray[59] = 878;
        sArray[60] = 887;
        sArray[61] = 896;
        sArray[62] = 904;
        sArray[63] = 912;
        sArray[64] = 920;
        sArray[65] = 928;
        sArray[66] = 935;
        sArray[67] = 943;
        sArray[68] = 949;
        sArray[69] = 956;
        sArray[70] = 962;
        sArray[71] = 968;
        sArray[72] = 974;
        sArray[73] = 979;
        sArray[74] = 984;
        sArray[75] = 989;
        sArray[76] = 994;
        sArray[77] = 998;
        sArray[78] = 1002;
        sArray[79] = 1005;
        sArray[80] = 1008;
        sArray[81] = 1011;
        sArray[82] = 1014;
        sArray[83] = 1016;
        sArray[84] = 1018;
        sArray[85] = 1020;
        sArray[86] = 1022;
        sArray[87] = 1023;
        sArray[88] = 1023;
        sArray[89] = 1024;
        sArray[90] = 1024;
        d = sArray;
        String[] stringArray = new String[]{"<color=#ff0000ff>[  LOG_CAT  ]</color>", "<color=#ff0000ff>[LOG_SESSION]</color>", "<color=#ffff00ff>[LOG_SESSION]</color>", "<color=#ff0000ff>[LOG_MOBILE ]</color>", ""};
        a = new Random();
        new el("");
    }

    public static void a() {
        e = new short[91];
        f = new int[91];
        int n2 = 0;
        while (n2 <= 90) {
            ds.e[n2] = d[90 - n2];
            ds.f[n2] = e[n2] == 0 ? Integer.MAX_VALUE : (d[n2] << 10) / e[n2];
            ++n2;
        }
    }

    public static final int a(int n2) {
        if ((n2 = ds.c(n2)) >= 0 && n2 < 90) {
            return d[n2];
        }
        if (n2 >= 90 && n2 < 180) {
            return d[180 - n2];
        }
        if (n2 >= 180 && n2 < 270) {
            return -d[n2 - 180];
        }
        return -d[360 - n2];
    }

    public static final int b(int n2) {
        if ((n2 = ds.c(n2)) >= 0 && n2 < 90) {
            return e[n2];
        }
        if (n2 >= 90 && n2 < 180) {
            return -e[180 - n2];
        }
        if (n2 >= 180 && n2 < 270) {
            return -e[n2 - 180];
        }
        return e[360 - n2];
    }

    public static final int a(int n2, int n3) {
        int n4;
        block6: {
            int n5;
            block7: {
                block5: {
                    block4: {
                        int n6;
                        if (n2 == 0) break block5;
                        n4 = Math.abs((n3 << 10) / n2);
                        int n7 = 0;
                        while (n7 <= 90) {
                            if (f[n7] >= n4) {
                                n6 = n7;
                                break block4;
                            }
                            ++n7;
                        }
                        n6 = n4 = 0;
                    }
                    if (n3 >= 0 && n2 < 0) {
                        n4 = 180 - n4;
                    }
                    if (n3 < 0 && n2 < 0) {
                        n4 += 180;
                    }
                    if (n3 >= 0 || n2 < 0) break block6;
                    n5 = 360 - n4;
                    break block7;
                }
                n5 = n3 > 0 ? 90 : 270;
            }
            n4 = n5;
        }
        return n4;
    }

    public static final int c(int n2) {
        if (n2 >= 360) {
            n2 -= 360;
        }
        if (n2 < 0) {
            n2 += 360;
        }
        return n2;
    }

    public static void a(en en2) {
        di.f.a(en2, "check Controller= " + bt.d, 3, 55, 0);
        di.f.a(en2, "check Map= " + bt.e, 3, 75, 0);
    }

    public static void b() {
        long l2 = l.d();
        if (bt.b - l2 > 5000L) {
            bt.a().d();
        }
        if (bt.c - l2 > 5000L) {
            bt.a().e();
        }
    }

    public static String a(String string) {
        if (l.c != 7) {
            return string;
        }
        if (af.e() != null && af.e().aD != null && af.e().aD.c >= 10) {
            return string;
        }
        if (string.indexOf("Gohan") != -1) {
            string = ds.a(string, "Gohan", "Hango");
        }
        if (string.indexOf("G\u00f4han") != -1) {
            string = ds.a(string, "G\u00f4han", "Hango");
        }
        if (string.indexOf("Bunma") != -1) {
            string = ds.a(string, "Bunma", "Mabun");
        }
        if (string.indexOf("Bunman") != -1) {
            string = ds.a(string, "Bunman", "Mabun");
        }
        if (string.indexOf("Bun ma") != -1) {
            string = ds.a(string, "Bun ma", "Mabun");
        }
        if (string.indexOf("\u0110\u1eadu th\u1ea7n") != -1) {
            string = ds.a(string, "\u0110\u1eadu th\u1ea7n", "C\u00e2y th\u1ea7n");
        }
        if (string.indexOf("Mabu") != -1) {
            string = ds.a(string, "Mabu", "Buma");
        }
        if (string.indexOf("Ma b\u01b0") != -1) {
            string = ds.a(string, "Ma b\u01b0", "Buma");
        }
        if (string.indexOf("Xayda") != -1) {
            string = ds.a(string, "Xayda", "Dasay");
        }
        if (string.indexOf("Xay da") != -1) {
            string = ds.a(string, "Xay da", "Dasay");
        }
        if (string.indexOf("Nam\u1ebfc") != -1) {
            string = ds.a(string, "Nam\u1ebfc", "Mecda");
        }
        if (string.indexOf("Na m\u1ebfc") != -1) {
            string = ds.a(string, "Na m\u1ebfc", "Mecda");
        }
        if (string.indexOf("Namek") != -1) {
            string = ds.a(string, "Namek", "Mecda");
        }
        if (string.indexOf("R\u1ed3ng th\u1ea7n") != -1) {
            string = ds.a(string, "R\u1ed3ng th\u1ea7n", "R\u1ed3ng \u0111\u1ea5t");
        }
        if (string.indexOf("Kame") != -1) {
            string = ds.a(string, "Kame", "Meka");
        }
        if (string.indexOf("Vegeta") != -1) {
            string = ds.a(string, "Vegeta", "Tageve");
        }
        if (string.indexOf("Kakalot") != -1) {
            string = ds.a(string, "Kakalot", "Lotkaka");
        }
        if (string.indexOf("Broly") != -1) {
            string = ds.a(string, "Broly", "Lybro");
        }
        if (string.indexOf("Ng\u1ecdc r\u1ed3ng") != -1) {
            string = ds.a(string, "Ng\u1ecdc r\u1ed3ng", "Ng\u1ecdc th\u1ea7n");
        }
        if (string.indexOf("ng\u1ecdc r\u1ed3ng") != -1) {
            string = ds.a(string, "ng\u1ecdc r\u1ed3ng", "Ng\u1ecdc th\u1ea7n");
        }
        if (string.indexOf("Radic") != -1) {
            string = ds.a(string, "Radic", "Dicra");
        }
        if (string.indexOf("Ra dic") != -1) {
            string = ds.a(string, "Ra dic", "Dicra");
        }
        if (string.indexOf("Ra \u0111\u00edc") != -1) {
            string = ds.a(string, "Ra \u0111\u00edc", "Dicra");
        }
        if (string.indexOf("Cadic") != -1) {
            string = ds.a(string, "Cadic", "Dicca");
        }
        if (string.indexOf("Ca dic") != -1) {
            string = ds.a(string, "Ca dic", "Dicca");
        }
        if (string.indexOf("Ca \u0111\u00edc") != -1) {
            string = ds.a(string, "Ca \u0111\u00edc", "Dicca");
        }
        if (string.indexOf("Quy l\u00e3o") != -1) {
            string = ds.a(string, "Quy l\u00e3o", "L\u00e3o");
        }
        if (string.indexOf("quy l\u00e3o") != -1) {
            string = ds.a(string, "quy l\u00e3o", "l\u00e3o");
        }
        if (string.indexOf("QuyL\u00e3o") != -1) {
            string = ds.a(string, "Quy L\u00e3o", "L\u00e3o");
        }
        if (string.indexOf("Santa") != -1) {
            string = ds.a(string, "Santa", "Tasan");
        }
        if (string.indexOf("H\u1ea1t M\u00edt") != -1) {
            string = ds.a(string, "H\u1ea1t M\u00edt", "H\u1ea1t D\u1ebb");
        }
        if (string.indexOf("H\u1ea1t m\u00edt") != -1) {
            string = ds.a(string, "H\u1ea1t m\u00edt", "H\u1ea1t d\u1ebb");
        }
        if (string.indexOf("T\u00e0u b\u1ea3y b\u1ea3y") != -1) {
            string = ds.a(string, "T\u00e0u b\u1ea3y b\u1ea3y", "T\u00e0u t\u00e0u");
        }
        if (string.indexOf("Uron") != -1) {
            string = ds.a(string, "Uron", "Onru");
        }
        if (string.indexOf("U ron") != -1) {
            string = ds.a(string, "U ron", "Onru");
        }
        if (string.indexOf("Ur\u00f4n") != -1) {
            string = ds.a(string, "Ur\u00f4n", "Onru");
        }
        if (string.indexOf("Ng\u1ecdc R\u1ed3ng") != -1) {
            string = ds.a(string, "Ng\u1ecdc R\u1ed3ng", "Ng\u1ecdc th\u1ea7n");
        }
        if (string.indexOf("Ng\u1ecdc r\u1ed3ng") != -1) {
            string = ds.a(string, "Ng\u1ecdc r\u1ed3ng", "Ng\u1ecdc th\u1ea7n");
        }
        if (string.indexOf("Fide") != -1) {
            string = ds.a(string, "Fide", "Defi");
        }
        if (string.indexOf("Vegeta") != -1) {
            string = ds.a(string, "Vegeta", "Tageve");
        }
        if (string.indexOf("Moori") != -1) {
            string = ds.a(string, "Moori", "Rimoo");
        }
        if (string.indexOf("Aru") != -1) {
            string = ds.a(string, "Aru", "Ura");
        }
        if (string.indexOf("Kamejoko") != -1) {
            string = ds.a(string, "Kamejoko", "Kojomeka");
        }
        if (string.indexOf("kamejoko") != -1) {
            string = ds.a(string, "kamejoko", "kojomeka");
        }
        if (string.indexOf("Kame") != -1) {
            string = ds.a(string, "Kame", "Meka");
        }
        if (string.indexOf("kame") != -1) {
            string = ds.a(string, "kame", "meka");
        }
        if (string.indexOf("Masenko") != -1) {
            string = ds.a(string, "Masenko", "Kosenma");
        }
        if (string.indexOf("Th\u00e1i D\u01b0\u01a1ng H\u1ea1 San") != -1) {
            string = ds.a(string, "Th\u00e1i D\u01b0\u01a1ng H\u1ea1 San", "H\u1ea1 D\u01b0\u01a1ng");
        }
        if (string.indexOf("Solar flare") != -1) {
            string = ds.a(string, "Solar flare", "Solar");
        }
        if (string.indexOf("Qu\u1ea3 c\u1ea7u k\u00eanh khi") != -1) {
            string = ds.a(string, "Qu\u1ea3 c\u1ea7u k\u00eanh khi", "Qu\u1ea3 c\u1ea7u");
        }
        if (string.indexOf("Genki-Dama") != -1) {
            string = ds.a(string, "Genki-Dama", "Dama");
        }
        if (string.indexOf("Genki-Dama") != -1) {
            string = ds.a(string, "Genki-Dama", "Dama");
        }
        if (string.indexOf("Makankosappo") != -1) {
            string = ds.a(string, "Makankosappo", "Oppasoknakam");
        }
        return string;
    }

    public static String a(String string, String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = string.indexOf(string2);
        int n3 = 0;
        int n4 = string2.length();
        while (n2 != -1) {
            stringBuffer.append(string.substring(n3, n2)).append(string3);
            n3 = n2 + n4;
            n2 = string.indexOf(string2, n3);
        }
        stringBuffer.append(string.substring(n3, string.length()));
        return stringBuffer.toString();
    }

    public static int d(int n2) {
        return a.nextInt(n2);
    }

    public static int b(int n2, int n3) {
        if (n2 == n3) {
            return n2;
        }
        return n2 + a.nextInt(n3 - n2);
    }

    public static int e(int n2) {
        int n3 = 0;
        while (n3 == 0) {
            n3 = a.nextInt() % n2;
        }
        return n3;
    }

    public static int c(int n2, int n3) {
        n2 += a.nextInt(n3 - n2);
        n3 = 2;
        if (a.nextInt(n3) == 0) {
            n2 = -n2;
        }
        return n2;
    }

    public static int a(int n2, int n3, int n4, int n5) {
        return ds.f((n2 - n4) * (n2 - n4) + (n3 - n5) * (n3 - n5));
    }

    public static int d(int n2, int n3) {
        return ds.f(n2 * n2 + n3 * n3);
    }

    public static int f(int n2) {
        int n3;
        if (n2 <= 0) {
            return 0;
        }
        int n4 = (n2 + 1) / 2;
        while (Math.abs((n3 = n4) - (n4 = n4 / 2 + n2 / (n4 * 2))) > 1) {
        }
        return n4;
    }

    public static int e(int n2, int n3) {
        n3 = 1;
        int n4 = 0;
        while (n4 < 2) {
            n3 *= n2;
            ++n4;
        }
        return n3;
    }

    public static int g(int n2) {
        if (n2 > 0) {
            return n2;
        }
        return -n2;
    }

    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n6 >= n2 && n6 <= n2 + n4 && n7 >= n3 && n7 <= n3 + n5;
    }

    public static void b(String string) {
    }

    public static void c(String string) {
    }

    public static String[] a(String string, String stringArray, int n2) {
        int n3 = string.indexOf((String)stringArray);
        if (n3 >= 0) {
            stringArray = ds.a(string.substring(n3 + stringArray.length()), (String)stringArray, n2 + 1);
        } else {
            stringArray = new String[n2 + 1];
            n3 = string.length();
        }
        stringArray[n2] = string.substring(0, n3);
        return stringArray;
    }

    public static String a(long l2) {
        String string;
        if (l2 >= 1000000000L) {
            String string2 = aw.bg;
            long l3 = l2 % 1000000000L / 100000000L;
            string = String.valueOf(l2 /= 1000000000L);
            string = l3 > 0L ? String.valueOf(string) + "," + l3 + string2 : String.valueOf(string) + string2;
        } else if (l2 >= 1000000L) {
            String string3 = aw.bh;
            long l4 = l2 % 1000000L / 100000L;
            string = String.valueOf(l2 /= 1000000L);
            string = l4 > 0L ? String.valueOf(string) + "," + l4 + string3 : String.valueOf(string) + string3;
        } else {
            string = String.valueOf(l2);
        }
        return string;
    }

    public static String b(long l2) {
        String string;
        if (l2 >= 1000000000L) {
            String string2 = aw.bg;
            long l3 = l2 % 1000000000L / 10000000L;
            string = String.valueOf(l2 /= 1000000000L);
            if (l3 >= 10L) {
                if (l3 % 10L == 0L) {
                    l3 /= 10L;
                }
                string = String.valueOf(string) + "," + l3 + string2;
            } else {
                string = l3 > 0L ? String.valueOf(string) + ",0" + l3 + string2 : String.valueOf(string) + string2;
            }
        } else if (l2 >= 1000000L) {
            String string3 = aw.bh;
            long l4 = l2 % 1000000L / 10000L;
            string = String.valueOf(l2 /= 1000000L);
            if (l4 >= 10L) {
                if (l4 % 10L == 0L) {
                    l4 /= 10L;
                }
                string = String.valueOf(string) + "," + l4 + string3;
            } else {
                string = l4 > 0L ? String.valueOf(string) + ",0" + l4 + string3 : String.valueOf(string) + string3;
            }
        } else if (l2 >= 10000L) {
            String string4 = "k";
            long l5 = l2 % 1000L / 10L;
            string = String.valueOf(l2 /= 1000L);
            if (l5 >= 10L) {
                if (l5 % 10L == 0L) {
                    l5 /= 10L;
                }
                string = String.valueOf(string) + "," + l5 + string4;
            } else {
                string = l5 > 0L ? String.valueOf(string) + ",0" + l5 + string4 : String.valueOf(string) + string4;
            }
        } else {
            string = String.valueOf(l2);
        }
        return string;
    }
}

