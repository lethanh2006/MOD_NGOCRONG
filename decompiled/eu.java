/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class eu {
    public static String a = "ResVersion";
    public static String b = "clienttype";
    public static String c = "lastZoomlevel";
    public static String d = "userAo";
    public static String e = "acc";
    public static String f = "pass";
    public static String g = "check";

    public static void a(String string, byte[] byArray) {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)("vj" + string), (boolean)true);
            if (recordStore.getNumRecords() > 0) {
                recordStore.setRecord(1, byArray, 0, byArray.length);
            } else {
                recordStore.addRecord(byArray, 0, byArray.length);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            ds.c("bi loi save -------------------------" + string);
            return;
        }
    }

    public static void a(String string) {
        int n2 = 0;
        while (n2 < RecordStore.listRecordStores().length) {
            if (RecordStore.listRecordStores().equals(string)) {
                Throwable throwable;
                try {
                    RecordStore.deleteRecordStore((String)string);
                }
                catch (RecordStoreNotFoundException recordStoreNotFoundException) {
                    throwable = recordStoreNotFoundException;
                    recordStoreNotFoundException.printStackTrace();
                }
                catch (RecordStoreException recordStoreException) {
                    throwable = recordStoreException;
                    recordStoreException.printStackTrace();
                }
            }
            ++n2;
        }
    }

    public static void a() {
        ds.c("CLEAR ALL");
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (stringArray == null) {
                return;
            }
            int n2 = 0;
            while (n2 < stringArray.length) {
                if (stringArray[n2] != null && stringArray[n2] != "2.5.0" && stringArray[n2] != bs.w && stringArray[n2] != e && stringArray[n2] != f && stringArray[n2] != g) {
                    RecordStore.deleteRecordStore((String)stringArray[n2]);
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static byte[] b(String string) {
        byte[] byArray;
        try {
            string = RecordStore.openRecordStore((String)("vj" + string), (boolean)false);
            byArray = string.getRecord(1);
            string.closeRecordStore();
        }
        catch (Exception exception) {
            return null;
        }
        return byArray;
    }

    public static void a(String string, int n2) {
        try {
            eu.a(string, new byte[]{(byte)n2});
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(String object, String string) {
        try {
            eu.a((String)object, string.getBytes("UTF-8"));
            return;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static String c(String object) {
        byte[] byArray = eu.b((String)object);
        object = byArray;
        if (byArray == null) {
            return null;
        }
        try {
            String string = new String((byte[])object, "UTF-8");
            return string;
        }
        catch (Exception exception) {
            return new String((byte[])object);
        }
    }

    public static int d(String object) {
        byte[] byArray = eu.b((String)object);
        object = byArray;
        if (byArray == null) {
            return -1;
        }
        return (int)object[0];
    }
}

