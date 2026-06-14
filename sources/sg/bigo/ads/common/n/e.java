package sg.bigo.ads.common.n;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f102589a;

    public e(String str, int i10, int i11) {
        super(i11, i10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, false));
        this.f102589a = new AtomicInteger(0);
    }

    public static void a(a aVar) {
        c.a(aVar);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th2) {
        this.f102589a.decrementAndGet();
        super.afterExecute(runnable, th2);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f102589a.incrementAndGet();
        super.execute(runnable);
    }

    public e(String str, int i10, boolean z10) {
        super(0, i10, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c(str, z10));
        this.f102589a = new AtomicInteger(0);
    }
}
