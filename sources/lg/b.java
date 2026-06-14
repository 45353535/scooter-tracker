package lg;

import java.util.concurrent.Executor;
import jg.f0;
import jg.h0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends s implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f94271c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CoroutineDispatcher f94272d = CoroutineDispatcher.limitedParallelism$default(k.f94289b, h0.e("kotlinx.coroutines.io.parallelism", kotlin.ranges.g.e(64, f0.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f94272d.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        f94272d.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(kotlin.coroutines.e.f93267b, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10, String str) {
        return k.f94289b.limitedParallelism(i10, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.s
    public Executor m() {
        return this;
    }
}
