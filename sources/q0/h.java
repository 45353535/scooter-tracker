package q0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class h implements ThreadFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f98612d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadGroup f98613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f98614b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f98615c;

    public h() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f98613a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f98615c = "lottie-" + f98612d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f98613a, runnable, this.f98615c + this.f98614b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
