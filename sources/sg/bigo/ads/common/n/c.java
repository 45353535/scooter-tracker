package sg.bigo.ads.common.n;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f102557e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f102559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f102560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f102561d;

    public c(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f102560c.newThread(runnable);
        threadNewThread.setName(this.f102558a + TokenBuilder.TOKEN_DELIMITER + this.f102559b.getAndIncrement());
        if (this.f102561d) {
            threadNewThread.setPriority(10);
        }
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
                if (c.f102557e != null) {
                    c.f102557e.a(th2);
                }
            }
        });
        return threadNewThread;
    }

    public c(String str, boolean z10) {
        this.f102558a = "BGAd-".concat(String.valueOf(str));
        this.f102559b = new AtomicInteger(1);
        this.f102560c = Executors.defaultThreadFactory();
        this.f102561d = z10;
    }

    protected static void a(a aVar) {
        f102557e = aVar;
    }
}
