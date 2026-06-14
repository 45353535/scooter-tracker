package vh;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class o implements l0, AutoCloseable {

    @NotNull
    private final l0 delegate;

    public o(l0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final l0 m8687deprecated_delegate() {
        return this.delegate;
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final l0 delegate() {
        return this.delegate;
    }

    @Override // vh.l0
    public long read(e sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j10);
    }

    @Override // vh.l0
    @NotNull
    public m0 timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
