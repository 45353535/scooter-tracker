package eg;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class t1 {
    public static final kotlinx.coroutines.s b(final int i10, final String str) {
        if (i10 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return w0.c(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: eg.s1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return t1.c(i10, str, atomicInteger, runnable);
                }
            })));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i10 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
