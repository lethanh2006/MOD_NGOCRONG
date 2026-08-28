import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/** PC socket wrapper with a bounded connection attempt. */
public final class ay {
    private static final int CONNECT_TIMEOUT_MS = 3500;

    Socket a;

    public ay(String host, int port) throws IOException {
        Socket socket = new Socket();
        boolean connected = false;
        try {
            socket.connect(new InetSocketAddress(host, port), CONNECT_TIMEOUT_MS);
            socket.setTcpNoDelay(true);
            socket.setKeepAlive(true);
            this.a = socket;
            connected = true;
        } finally {
            if (!connected) {
                try {
                    socket.close();
                } catch (IOException ignored) {
                }
            }
        }
    }

    public final void a() throws IOException {
        if (this.a != null) {
            this.a.close();
        }
    }

    public final DataOutputStream b() throws IOException {
        return new DataOutputStream(this.a.getOutputStream());
    }

    public final DataInputStream c() throws IOException {
        return new DataInputStream(this.a.getInputStream());
    }
}
