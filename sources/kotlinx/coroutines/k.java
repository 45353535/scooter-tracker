package kotlinx.coroutines;

import eg.p0;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    public static final class a {
        public static p0 a(k kVar, long j10, Runnable runnable, CoroutineContext coroutineContext) {
            return eg.i0.a().f(j10, runnable, coroutineContext);
        }
    }

    void e(long j10, CancellableContinuation cancellableContinuation);

    p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext);
}
