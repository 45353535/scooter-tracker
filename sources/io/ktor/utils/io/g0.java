package io.ktor.utils.io;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pg.s f82106b;

    @Nullable
    private volatile r closed;

    public g0(pg.s source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f82106b = source;
    }

    @Override // io.ktor.utils.io.e
    public void a(Throwable th2) {
        String message;
        if (this.closed != null) {
            return;
        }
        this.f82106b.close();
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new r(new IOException(message, th2));
    }

    @Override // io.ktor.utils.io.e
    public Throwable b() {
        r rVar = this.closed;
        if (rVar != null) {
            return r.c(rVar, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.e
    public Object d(int i10, Continuation continuation) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return kotlin.coroutines.jvm.internal.b.a(this.f82106b.request(i10));
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.e
    public pg.s g() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.f82106b.getBuffer();
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.e
    public boolean h() {
        return this.f82106b.exhausted();
    }
}
