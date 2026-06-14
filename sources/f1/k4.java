package f1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k4 f70246a = new k4();

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f70248b;

        public a(String prefix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            this.f70247a = prefix;
            this.f70248b = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            return new Thread(r10, this.f70247a + this.f70248b.getAndIncrement());
        }
    }

    public static final ExecutorService a(int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, j10, timeUnit, new PriorityBlockingQueue());
        threadPoolExecutor.prestartAllCoreThreads();
        return threadPoolExecutor;
    }

    public static /* synthetic */ ExecutorService b(int i10, long j10, TimeUnit timeUnit, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = 10;
        }
        if ((i11 & 4) != 0) {
            timeUnit = TimeUnit.SECONDS;
        }
        return a(i10, j10, timeUnit);
    }

    public static final ScheduledExecutorService c(int i10, String threadPrefix) {
        Intrinsics.checkNotNullParameter(threadPrefix, "threadPrefix");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i10, new a(threadPrefix));
        scheduledThreadPoolExecutor.prestartAllCoreThreads();
        return scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ ScheduledExecutorService d(int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        if ((i11 & 2) != 0) {
            str = "CBAsync-";
        }
        return c(i10, str);
    }
}
