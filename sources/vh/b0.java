package vh;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
final class b0 implements j0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OutputStream f106790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0 f106791c;

    public b0(OutputStream out, m0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f106790b = out;
        this.f106791c = timeout;
    }

    @Override // vh.j0
    public void H(e source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.e0(), 0L, j10);
        while (j10 > 0) {
            this.f106791c.f();
            g0 g0Var = source.f106814b;
            Intrinsics.checkNotNull(g0Var);
            int iMin = (int) Math.min(j10, g0Var.f106835c - g0Var.f106834b);
            this.f106790b.write(g0Var.f106833a, g0Var.f106834b, iMin);
            g0Var.f106834b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.b0(source.e0() - j11);
            if (g0Var.f106834b == g0Var.f106835c) {
                source.f106814b = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f106790b.close();
    }

    @Override // vh.j0, java.io.Flushable
    public void flush() throws IOException {
        this.f106790b.flush();
    }

    @Override // vh.j0
    public m0 timeout() {
        return this.f106791c;
    }

    public String toString() {
        return "sink(" + this.f106790b + ')';
    }
}
