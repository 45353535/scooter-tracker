package cc;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class b implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b f6689c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f6690b;

    private b() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f6690b = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
    }

    public static b a() {
        if (f6689c == null) {
            f6689c = new b();
        }
        return f6689c;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6690b.execute(runnable);
    }
}
