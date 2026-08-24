/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class dw
implements Runnable {
    private final Vector a;
    private br b;

    public dw(br br2) {
        this.b = br2;
        this.a = new Vector();
    }

    public final void a(y y2) {
        this.a.addElement(y2);
    }

    public final void run() {
        while (this.b.d) {
            Object object;
            try {
                if (this.b.j) {
                    while (this.a.size() > 0) {
                        object = (y)this.a.elementAt(0);
                        this.a.removeElementAt(0);
                        br.a(this.b, (y)object);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (Exception exception) {}
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }

    static Vector a(dw dw2) {
        return dw2.a;
    }
}

