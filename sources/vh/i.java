package vh;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f106850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deflater f106851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106852d;

    public i(f sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f106850b = sink;
        this.f106851c = deflater;
    }

    private final void c(boolean z10) throws IOException {
        g0 g0VarR0;
        int iDeflate;
        e buffer = this.f106850b.getBuffer();
        while (true) {
            g0VarR0 = buffer.r0(1);
            if (z10) {
                try {
                    Deflater deflater = this.f106851c;
                    byte[] bArr = g0VarR0.f106833a;
                    int i10 = g0VarR0.f106835c;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.f106851c;
                byte[] bArr2 = g0VarR0.f106833a;
                int i11 = g0VarR0.f106835c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                g0VarR0.f106835c += iDeflate;
                buffer.b0(buffer.e0() + ((long) iDeflate));
                this.f106850b.emitCompleteSegments();
            } else if (this.f106851c.needsInput()) {
                break;
            }
        }
        if (g0VarR0.f106834b == g0VarR0.f106835c) {
            buffer.f106814b = g0VarR0.b();
            h0.b(g0VarR0);
        }
    }

    @Override // vh.j0
    public void H(e source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.e0(), 0L, j10);
        while (j10 > 0) {
            g0 g0Var = source.f106814b;
            Intrinsics.checkNotNull(g0Var);
            int iMin = (int) Math.min(j10, g0Var.f106835c - g0Var.f106834b);
            this.f106851c.setInput(g0Var.f106833a, g0Var.f106834b, iMin);
            c(false);
            long j11 = iMin;
            source.b0(source.e0() - j11);
            int i10 = g0Var.f106834b + iMin;
            g0Var.f106834b = i10;
            if (i10 == g0Var.f106835c) {
                source.f106814b = g0Var.b();
                h0.b(g0Var);
            }
            j10 -= j11;
        }
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f106852d) {
            return;
        }
        try {
            m();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f106851c.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f106850b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f106852d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vh.j0, java.io.Flushable
    public void flush() throws IOException {
        c(true);
        this.f106850b.flush();
    }

    public final void m() throws IOException {
        this.f106851c.finish();
        c(false);
    }

    @Override // vh.j0
    public m0 timeout() {
        return this.f106850b.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f106850b + ')';
    }
}
