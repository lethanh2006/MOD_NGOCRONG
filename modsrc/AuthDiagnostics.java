import java.io.DataInputStream;

/** Logs server status dialogs without consuming the packet or exposing an account. */
public final class AuthDiagnostics {
    private static String lastMessage;
    private static long lastLoggedAt;

    private AuthDiagnostics() {
    }

    public static void inspect(y message) {
        if (message == null || message.a != (byte) -26) {
            return;
        }

        DataInputStream input = message.c();
        if (input == null || !input.markSupported()) {
            return;
        }

        try {
            input.mark(65535);
            String serverMessage = redact(input.readUTF());
            input.reset();

            long now = System.currentTimeMillis();
            if (!serverMessage.equals(lastMessage) || now - lastLoggedAt >= 30000L) {
                System.out.println("SERVER STATUS: " + serverMessage);
                lastMessage = serverMessage;
                lastLoggedAt = now;
            }
        } catch (Exception ignored) {
            try {
                input.reset();
            } catch (Exception ignoredReset) {
            }
        }
    }

    private static String redact(String value) {
        if (value == null) {
            return "";
        }
        return value
                .replaceAll("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}", "[account]")
                .replace('\n', ' ')
                .replace('\r', ' ');
    }
}
