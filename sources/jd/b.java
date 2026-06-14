package jd;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f85786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f85787c;

    public b(int i10, Runnable runnable) {
        this.f85786b = runnable;
        this.f85787c = new AtomicInteger(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f85787c.decrementAndGet() > 0) {
            return;
        }
        this.f85786b.run();
    }
}
