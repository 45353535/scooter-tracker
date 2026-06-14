package vh;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
final class d implements j0, AutoCloseable {
    @Override // vh.j0
    public void H(e source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j10);
    }

    @Override // vh.j0
    public m0 timeout() {
        return m0.f106880e;
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // vh.j0, java.io.Flushable
    public void flush() {
    }
}
