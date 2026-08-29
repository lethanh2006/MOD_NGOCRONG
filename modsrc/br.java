/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class br
implements db {
    private static br o = new br();
    private static br p = new br();
    private DataOutputStream q;
    public DataInputStream a;
    public bd b;
    public boolean c = true;
    private ay r;
    public volatile boolean d;
    public volatile boolean e;
    private final dw s = new dw(this);
    private Thread t;
    public Thread f;
    public Thread g;
    public int h;
    public int i;
    volatile boolean j;
    public byte[] k = null;
    private byte u;
    private byte v;
    long l;
    public String m = "";
    private long w = 0L;
    public static boolean n;
    private static int x;
    volatile int y;

    public static br a() {
        return o;
    }

    public static br b() {
        return p;
    }

    public final void c() {
        dw.a(this.s).removeAllElements();
    }

    public final boolean d() {
        return this.d && this.r != null && this.r.a != null && this.a != null;
    }

    public final void a(bd bd2) {
        this.b = bd2;
    }

    public final void a(String string, int n2) {
        System.out.println(">>connect: " + string + ":" + n2);
        if (this.d || this.e) {
            return;
        }
        // Chỉ giữ một lần connect đang chạy. ay giới hạn thời gian mở socket,
        // nên một server không phản hồi sẽ tự nhả guard trước lần retry kế tiếp.
        if (this.t != null && this.t.isAlive()) {
            return;
        }
        if (TimeUtil.d() < this.w) {
            return;
        }
        this.w = TimeUtil.d() + 1000L;
        if (this.c) {
            bs.t = -1;
        }
        this.j = false;
        br br2 = this;
        br2.f();
        int generation = ++this.y;
        this.t = new Thread(new cf(this, string, n2, generation));
        this.t.start();
    }

    public final void a(y y2) {
        ++x;
        this.s.a(y2);
    }

    private synchronized void b(y object) {
        byte[] byArray = ((y)object).a();
        try {
            if (this.j) {
                byte by2 = this.a(((y)object).a);
                this.q.writeByte(by2);
            } else {
                this.q.writeByte(((y)object).a);
            }
            if (byArray != null) {
                int n2;
                int n3 = byArray.length;
                if (this.j) {
                    n2 = this.a((byte)(n3 >> 8));
                    this.q.writeByte(n2);
                    n3 = this.a((byte)n3);
                    this.q.writeByte(n3);
                } else {
                    this.q.writeShort(n3);
                }
                if (this.j) {
                    n2 = 0;
                    while (n2 < byArray.length) {
                        byArray[n2] = this.a(byArray[n2]);
                        ++n2;
                    }
                }
                ((OutputStream)this.q).write(byArray);
                this.h += 5 + byArray.length;
            } else {
                this.q.writeShort(0);
                this.h += 5;
            }
            this.q.flush();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private byte a(byte by2) {
        byte by3 = this.v;
        this.v = (byte)(by3 + 1);
        by2 = (byte)(this.k[by3] & 0xFF ^ by2 & 0xFF);
        if (this.v >= this.k.length) {
            this.v = (byte)(this.v % this.k.length);
        }
        return by2;
    }

    public final void e() {
        this.f();
    }

    private void f() {
        // Invalidates connect/watchdog threads that belong to the old socket.
        ++this.y;
        // Messages queued before the handshake belong to the socket being closed.
        // Keeping them would replay stale -29/login packets after the next retry.
        this.c();
        this.k = null;
        this.u = 0;
        this.v = 0;
        try {
            this.d = false;
            this.e = false;
            if (this.r != null && this.r.a != null) {
                this.r.a();
            }
            this.r = null;
            if (this.q != null) {
                this.q.close();
            }
            this.q = null;
            if (this.a != null) {
                this.a.close();
            }
            this.a = null;
            if (this.g != null) {
                this.g.interrupt();
            }
            this.g = null;
            if (this.f != null) {
                this.f.interrupt();
            }
            this.f = null;
            if (this.c) {
                bs.t = 0;
            }
            System.gc();
            ac.c = false;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    static ay a(br br2) {
        return br2.r;
    }

    static void a(br br2, ay ay2) {
        br2.r = ay2;
    }

    static void a(br br2, DataOutputStream dataOutputStream) {
        br2.q = dataOutputStream;
    }

    static dw b(br br2) {
        return br2.s;
    }

    static void a(br br2, y y2) {
        br2.b(y2);
    }

    static void c(br br2) {
        br2.f();
    }

    static byte a(br br2, byte by2) {
        byte by3 = br2.u;
        br2.u = (byte)(by3 + 1);
        by2 = (byte)(br2.k[by3] & 0xFF ^ by2 & 0xFF);
        if (br2.u >= br2.k.length) {
            br2.u = (byte)(br2.u % br2.k.length);
        }
        return by2;
    }
}
