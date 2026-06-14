package vh;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
class t implements l0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f106906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f106907c;

    public t(InputStream input, m0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f106906b = input;
        this.f106907c = timeout;
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f106906b.close();
    }

    @Override // vh.l0
    public long read(e sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f106907c.f();
            g0 g0VarR0 = sink.r0(1);
            int i10 = this.f106906b.read(g0VarR0.f106833a, g0VarR0.f106835c, (int) Math.min(j10, 8192 - g0VarR0.f106835c));
            if (i10 != -1) {
                g0VarR0.f106835c += i10;
                long j11 = i10;
                sink.b0(sink.e0() + j11);
                return j11;
            }
            if (g0VarR0.f106834b != g0VarR0.f106835c) {
                return -1L;
            }
            sink.f106814b = g0VarR0.b();
            h0.b(g0VarR0);
            return -1L;
        } catch (AssertionError e10) {
            if (x.e(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // vh.l0
    public m0 timeout() {
        return this.f106907c;
    }

    public String toString() {
        return "source(" + this.f106906b + ')';
    }
}
