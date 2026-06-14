package vh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n implements j0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f106884b;

    public n(j0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f106884b = delegate;
    }

    @Override // vh.j0
    public void H(e source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f106884b.H(source, j10);
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f106884b.close();
    }

    @Override // vh.j0, java.io.Flushable
    public void flush() {
        this.f106884b.flush();
    }

    @Override // vh.j0
    public m0 timeout() {
        return this.f106884b.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f106884b + ')';
    }
}
