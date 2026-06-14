package sg.bigo.ads.common.h.b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
class c extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f102506a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    protected static synchronized c a(boolean z10) {
        try {
            if (f102506a == null) {
                synchronized (c.class) {
                    try {
                        if (f102506a == null) {
                            b(z10);
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f102506a;
    }

    private static synchronized void b(boolean z10) {
        f102506a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.common.n.c("Download", z10), new ThreadPoolExecutor.AbortPolicy());
    }
}
