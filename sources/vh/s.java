package vh;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements l0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f106902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f106903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106905e;

    public s(g source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f106902b = source;
        this.f106903c = inflater;
    }

    private final void n() {
        int i10 = this.f106904d;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f106903c.getRemaining();
        this.f106904d -= remaining;
        this.f106902b.skip(remaining);
    }

    public final long c(e sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f106905e) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            g0 g0VarR0 = sink.r0(1);
            int iMin = (int) Math.min(j10, 8192 - g0VarR0.f106835c);
            m();
            int iInflate = this.f106903c.inflate(g0VarR0.f106833a, g0VarR0.f106835c, iMin);
            n();
            if (iInflate > 0) {
                g0VarR0.f106835c += iInflate;
                long j11 = iInflate;
                sink.b0(sink.e0() + j11);
                return j11;
            }
            if (g0VarR0.f106834b == g0VarR0.f106835c) {
                sink.f106814b = g0VarR0.b();
                h0.b(g0VarR0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f106905e) {
            return;
        }
        this.f106903c.end();
        this.f106905e = true;
        this.f106902b.close();
    }

    public final boolean m() {
        if (!this.f106903c.needsInput()) {
            return false;
        }
        if (this.f106902b.exhausted()) {
            return true;
        }
        g0 g0Var = this.f106902b.getBuffer().f106814b;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.f106835c;
        int i11 = g0Var.f106834b;
        int i12 = i10 - i11;
        this.f106904d = i12;
        this.f106903c.setInput(g0Var.f106833a, i11, i12);
        return false;
    }

    @Override // vh.l0
    public long read(e sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jC = c(sink, j10);
            if (jC > 0) {
                return jC;
            }
            if (this.f106903c.finished() || this.f106903c.needsDictionary()) {
                return -1L;
            }
        } while (!this.f106902b.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // vh.l0
    public m0 timeout() {
        return this.f106902b.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(l0 source, Inflater inflater) {
        this(x.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
