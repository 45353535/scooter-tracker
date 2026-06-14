package lg;

import jg.m;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
final class k extends CoroutineDispatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f94289b = new k();

    private k() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        c.f94273h.w(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        c.f94273h.w(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        m.a(i10);
        return i10 >= j.f94286d ? m.b(this, str) : super.limitedParallelism(i10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
