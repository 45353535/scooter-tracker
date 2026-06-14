package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f93621b = new h0();

    private h0() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        i0 i0Var = (i0) coroutineContext.get(i0.f93622c);
        if (i0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        i0Var.f93623b = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
