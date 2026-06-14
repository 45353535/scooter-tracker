package vh;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements g, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f106828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f106829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106830d;

    public f0(l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f106828b = source;
        this.f106829c = new e();
    }

    @Override // vh.g
    public long C(h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // vh.g
    public long T(j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jP = this.f106829c.p();
            if (jP > 0) {
                j10 += jP;
                sink.H(this.f106829c, jP);
            }
        }
        if (this.f106829c.e0() <= 0) {
            return j10;
        }
        long jE0 = j10 + this.f106829c.e0();
        e eVar = this.f106829c;
        sink.H(eVar, eVar.e0());
        return jE0;
    }

    @Override // vh.g
    public long a0(h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return d(targetBytes, 0L);
    }

    @Override // vh.g
    public e buffer() {
        return this.f106829c;
    }

    public long c(h bytes, long j10) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jM = this.f106829c.M(bytes, j10);
            if (jM != -1) {
                return jM;
            }
            long jE0 = this.f106829c.e0();
            if (this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (jE0 - ((long) bytes.K())) + 1);
        }
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f106830d) {
            return;
        }
        this.f106830d = true;
        this.f106828b.close();
        this.f106829c.n();
    }

    public long d(h targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jR = this.f106829c.R(targetBytes, j10);
            if (jR != -1) {
                return jR;
            }
            long jE0 = this.f106829c.e0();
            if (this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, jE0);
        }
    }

    public boolean e(long j10, h bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.K() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!request(1 + j11) || this.f106829c.z(j11) != bytes.l(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // vh.g
    public boolean exhausted() {
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        return this.f106829c.exhausted() && this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // vh.g, vh.f
    public e getBuffer() {
        return this.f106829c;
    }

    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // vh.g
    public InputStream inputStream() {
        return new a();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f106830d;
    }

    @Override // vh.g
    public g peek() {
        return x.d(new d0(this));
    }

    @Override // vh.l0
    public long read(e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        if (this.f106829c.e0() == 0 && this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f106829c.read(sink, Math.min(j10, this.f106829c.e0()));
    }

    @Override // vh.g
    public byte readByte() throws EOFException {
        require(1L);
        return this.f106829c.readByte();
    }

    @Override // vh.g
    public byte[] readByteArray() {
        this.f106829c.i(this.f106828b);
        return this.f106829c.readByteArray();
    }

    @Override // vh.g
    public h readByteString() {
        this.f106829c.i(this.f106828b);
        return this.f106829c.readByteString();
    }

    @Override // vh.g
    public long readDecimalLong() throws EOFException {
        byte bZ;
        require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            bZ = this.f106829c.z(j10);
            if ((bZ < 48 || bZ > 57) && !(j10 == 0 && bZ == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bZ, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f106829c.readDecimalLong();
    }

    @Override // vh.g
    public long readHexadecimalUnsignedLong() throws EOFException {
        byte bZ;
        require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            bZ = this.f106829c.z(i10);
            if ((bZ < 48 || bZ > 57) && ((bZ < 97 || bZ > 102) && (bZ < 65 || bZ > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bZ, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f106829c.readHexadecimalUnsignedLong();
    }

    @Override // vh.g
    public int readInt() throws EOFException {
        require(4L);
        return this.f106829c.readInt();
    }

    @Override // vh.g
    public int readIntLe() throws EOFException {
        require(4L);
        return this.f106829c.readIntLe();
    }

    @Override // vh.g
    public long readLongLe() throws EOFException {
        require(8L);
        return this.f106829c.readLongLe();
    }

    @Override // vh.g
    public short readShort() throws EOFException {
        require(2L);
        return this.f106829c.readShort();
    }

    @Override // vh.g
    public short readShortLe() throws EOFException {
        require(2L);
        return this.f106829c.readShortLe();
    }

    @Override // vh.g
    public String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f106829c.i(this.f106828b);
        return this.f106829c.readString(charset);
    }

    @Override // vh.g
    public String readUtf8(long j10) throws EOFException {
        require(j10);
        return this.f106829c.readUtf8(j10);
    }

    @Override // vh.g
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return wh.a.c(this.f106829c, jIndexOf);
        }
        if (this.f106829c.e0() != 0) {
            return readUtf8(this.f106829c.e0());
        }
        return null;
    }

    @Override // vh.g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // vh.g
    public boolean request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        while (this.f106829c.e0() < j10) {
            if (this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // vh.g
    public void require(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // vh.g
    public void skip(long j10) throws EOFException {
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f106829c.e0() == 0 && this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f106829c.e0());
            this.f106829c.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // vh.g
    public boolean t(long j10, h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return e(j10, bytes, 0, bytes.K());
    }

    @Override // vh.l0
    public m0 timeout() {
        return this.f106828b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f106828b + ')';
    }

    @Override // vh.g
    public int w0(a0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        do {
            int iD = wh.a.d(this.f106829c, options, true);
            if (iD != -2) {
                if (iD == -1) {
                    return -1;
                }
                this.f106829c.skip(options.i()[iD].K());
                return iD;
            }
        } while (this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public long indexOf(byte b10, long j10, long j11) {
        if (this.f106830d) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jIndexOf = this.f106829c.indexOf(b11, jMax, j12);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long jE0 = this.f106829c.e0();
            if (jE0 >= j12 || this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, jE0);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // vh.g
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return wh.a.c(this.f106829c, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.f106829c.z(j11 - 1) == 13 && request(j11 + 1) && this.f106829c.z(j11) == 10) {
            return wh.a.c(this.f106829c, j11);
        }
        e eVar = new e();
        e eVar2 = this.f106829c;
        eVar2.s(eVar, 0L, Math.min(32, eVar2.e0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f106829c.e0(), j10) + " content=" + eVar.readByteString().r() + (char) 8230);
    }

    @Override // vh.g
    public byte[] readByteArray(long j10) throws EOFException {
        require(j10);
        return this.f106829c.readByteArray(j10);
    }

    @Override // vh.g
    public h readByteString(long j10) throws EOFException {
        require(j10);
        return this.f106829c.readByteString(j10);
    }

    public static final class a extends InputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            f0 f0Var = f0.this;
            if (f0Var.f106830d) {
                throw new IOException("closed");
            }
            return (int) Math.min(f0Var.f106829c.e0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            f0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            f0 f0Var = f0.this;
            if (f0Var.f106830d) {
                throw new IOException("closed");
            }
            if (f0Var.f106829c.e0() == 0) {
                f0 f0Var2 = f0.this;
                if (f0Var2.f106828b.read(f0Var2.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
            }
            return f0.this.f106829c.readByte() & 255;
        }

        public String toString() {
            return f0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!f0.this.f106830d) {
                b.b(data.length, i10, i11);
                if (f0.this.f106829c.e0() == 0) {
                    f0 f0Var = f0.this;
                    if (f0Var.f106828b.read(f0Var.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        return -1;
                    }
                }
                return f0.this.f106829c.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f106829c.e0() == 0 && this.f106828b.read(this.f106829c, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f106829c.read(sink);
    }
}
