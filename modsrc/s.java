import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

import main.GameMidlet;

/** Reads one immutable socket stream and never touches a newer connection. */
final class s implements Runnable {
    private final br a;
    private final DataInputStream b;
    private final int c;

    s(br session, DataInputStream input, int generation) {
        this.a = session;
        this.b = input;
        this.c = generation;
    }

    public final void run() {
        try {
            while (this.isCurrent()) {
                y message = this.readMessage();
                if (message.a == (byte)-27) {
                    this.readHandshake(message);
                    continue;
                }

                if (!this.isCurrent()) {
                    return;
                }
                try {
                    this.a.b.a(message);
                } catch (Exception exception) {
                    if (this.isCurrent()) {
                        exception.printStackTrace();
                    }
                }
            }
            return;
        } catch (Exception exception) {
            if (this.isCurrent()) {
                ProtocolDiagnostics.readerStopped(this.a, this.c, exception);
            }
        }

        this.finishCurrentConnection();
    }

    private y readMessage() throws IOException {
        byte command = this.b.readByte();
        if (this.a.j) {
            command = br.a(this.a, command);
        }

        int length;
        if (isLargePacket(command)) {
            int low = br.a(this.a, this.b.readByte()) + 128;
            int middle = br.a(this.a, this.b.readByte()) + 128;
            int high = br.a(this.a, this.b.readByte()) + 128;
            length = low + (middle << 8) + (high << 16);
        } else if (this.a.j) {
            int high = br.a(this.a, this.b.readByte()) & 255;
            int low = br.a(this.a, this.b.readByte()) & 255;
            length = high << 8 | low;
        } else {
            length = this.b.readUnsignedShort();
        }

        byte[] payload = new byte[length];
        int offset = 0;
        while (offset < length) {
            int count = this.b.read(payload, offset, length - offset);
            if (count < 0) {
                throw new EOFException("socket closed inside packet");
            }
            if (count == 0) {
                continue;
            }
            offset += count;
            this.a.i += count;
        }
        this.a.i += 5;
        int transferred = br.a().i + br.a().h;
        this.a.m = transferred / 1024 + "." + transferred % 1024 / 102 + "Kb";

        if (this.a.j) {
            for (int index = 0; index < payload.length; ++index) {
                payload[index] = br.a(this.a, payload[index]);
            }
        }
        ProtocolDiagnostics.received(this.a, command, payload, this.c);
        return new y(command, payload);
    }

    private void readHandshake(y message) throws IOException {
        synchronized (this.a) {
            if (!this.isCurrentLocked()) {
                return;
            }

            int keyLength = message.c().readByte();
            this.a.k = new byte[keyLength];
            for (int index = 0; index < keyLength; ++index) {
                this.a.k[index] = message.c().readByte();
            }
            for (int index = 0; index < this.a.k.length - 1; ++index) {
                this.a.k[index + 1] = (byte)(this.a.k[index + 1] ^ this.a.k[index]);
            }

            this.a.j = true;
            GameMidlet.c = message.c().readUTF();
            GameMidlet.d = message.c().readInt();
            GameMidlet.g = message.c().readByte() != 0;
            ProtocolDiagnostics.handshakeReceived(this.a, this.c, GameMidlet.g);
            ConnectionStabilityMod.recordHandshake(this.a, this.c);
            if (this.a.c && GameMidlet.g) {
                main.a.c();
            }
        }
    }

    private void finishCurrentConnection() {
        bd handler;
        boolean primary;
        boolean handshakeComplete;
        long connectedAt;

        synchronized (this.a) {
            if (!this.isCurrentLocked() || !this.a.d) {
                return;
            }
            handler = this.a.b;
            primary = this.a.c;
            handshakeComplete = this.a.j;
            connectedAt = this.a.l;
        }

        if (!handshakeComplete) {
            ConnectionStabilityMod.recordFailure(
                    this.a, this.c, "server closed before handshake");
        }
        if (handler != null) {
            if (System.currentTimeMillis() - connectedAt > 500L) {
                handler.c(primary);
            } else {
                handler.b(primary);
            }
        }

        synchronized (this.a) {
            if (this.isCurrentLocked() && br.a(this.a) != null) {
                br.c(this.a);
            }
        }
    }

    private boolean isCurrent() {
        synchronized (this.a) {
            return this.isCurrentLocked() && this.a.d();
        }
    }

    private boolean isCurrentLocked() {
        return this.a.y == this.c && this.a.a == this.b;
    }

    private static boolean isLargePacket(byte command) {
        return command == (byte)-32
                || command == (byte)-66
                || command == (byte)11
                || command == (byte)-67
                || command == (byte)-74
                || command == (byte)-87
                || command == (byte)66
                || command == (byte)12;
    }
}
