package vh;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements f, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f106824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f106825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106826d;

    public e0(j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f106824b = sink;
        this.f106825c = new e();
    }

    @Override // vh.j0
    public void H(e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.H(source, j10);
        emitCompleteSegments();
    }

    public f c(int i10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.B0(i10);
        return emitCompleteSegments();
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f106826d) {
            return;
        }
        try {
            if (this.f106825c.e0() > 0) {
                j0 j0Var = this.f106824b;
                e eVar = this.f106825c;
                j0Var.H(eVar, eVar.e0());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f106824b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f106826d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vh.f
    public f emit() {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        long jE0 = this.f106825c.e0();
        if (jE0 > 0) {
            this.f106824b.H(this.f106825c, jE0);
        }
        return this;
    }

    @Override // vh.f
    public f emitCompleteSegments() {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        long jP = this.f106825c.p();
        if (jP > 0) {
            this.f106824b.H(this.f106825c, jP);
        }
        return this;
    }

    @Override // vh.f, vh.j0, java.io.Flushable
    public void flush() {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        if (this.f106825c.e0() > 0) {
            j0 j0Var = this.f106824b;
            e eVar = this.f106825c;
            j0Var.H(eVar, eVar.e0());
        }
        this.f106824b.flush();
    }

    @Override // vh.f
    public e getBuffer() {
        return this.f106825c;
    }

    @Override // vh.f
    public long i(l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f106825c, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f106826d;
    }

    @Override // vh.f
    public OutputStream outputStream() {
        return new a();
    }

    @Override // vh.f
    public f r(h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.r(byteString);
        return emitCompleteSegments();
    }

    @Override // vh.j0
    public m0 timeout() {
        return this.f106824b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f106824b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f106825c.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // vh.f
    public f writeByte(int i10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeByte(i10);
        return emitCompleteSegments();
    }

    @Override // vh.f
    public f writeDecimalLong(long j10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeDecimalLong(j10);
        return emitCompleteSegments();
    }

    @Override // vh.f
    public f writeHexadecimalUnsignedLong(long j10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeHexadecimalUnsignedLong(j10);
        return emitCompleteSegments();
    }

    @Override // vh.f
    public f writeInt(int i10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // vh.f
    public f writeShort(int i10) {
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeShort(i10);
        return emitCompleteSegments();
    }

    @Override // vh.f
    public f writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f106826d) {
            throw new IllegalStateException("closed");
        }
        this.f106825c.writeUtf8(string);
        return emitCompleteSegments();
    }

    public static final class a extends OutputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            e0.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            e0 e0Var = e0.this;
            if (e0Var.f106826d) {
                return;
            }
            e0Var.flush();
        }

        public String toString() {
            return e0.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            e0 e0Var = e0.this;
            if (e0Var.f106826d) {
                throw new IOException("closed");
            }
            e0Var.f106825c.writeByte((byte) i10);
            e0.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            e0 e0Var = e0.this;
            if (!e0Var.f106826d) {
                e0Var.f106825c.write(data, i10, i11);
                e0.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // vh.f
    public f write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f106826d) {
            this.f106825c.write(source);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // vh.f
    public f writeUtf8(String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f106826d) {
            this.f106825c.writeUtf8(string, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @Override // vh.f
    public f write(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f106826d) {
            this.f106825c.write(source, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }
}
