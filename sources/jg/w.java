package jg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends CoroutineDispatcher implements kotlinx.coroutines.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.k f85921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineDispatcher f85922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f85923d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(CoroutineDispatcher coroutineDispatcher, String str) {
        kotlinx.coroutines.k kVar = coroutineDispatcher instanceof kotlinx.coroutines.k ? (kotlinx.coroutines.k) coroutineDispatcher : null;
        this.f85921b = kVar == null ? eg.i0.a() : kVar;
        this.f85922c = coroutineDispatcher;
        this.f85923d = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.f85922c.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.f85922c.dispatchYield(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.k
    public void e(long j10, CancellableContinuation cancellableContinuation) {
        this.f85921b.e(j10, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.k
    public eg.p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f85921b.f(j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.f85922c.isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.f85923d;
    }
}
