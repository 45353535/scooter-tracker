package jg;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient CoroutineContext f85874b;

    public h(CoroutineContext coroutineContext) {
        this.f85874b = coroutineContext;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f85874b);
    }
}
