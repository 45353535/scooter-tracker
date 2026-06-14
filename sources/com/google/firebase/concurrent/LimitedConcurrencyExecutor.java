package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes9.dex */
class LimitedConcurrencyExecutor implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f31858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Semaphore f31859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f31860d = new LinkedBlockingQueue();

    LimitedConcurrencyExecutor(Executor executor, int i10) {
        Preconditions.checkArgument(i10 > 0, "concurrency must be positive.");
        this.f31858b = executor;
        this.f31859c = new Semaphore(i10, true);
    }

    public static /* synthetic */ void a(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        limitedConcurrencyExecutor.getClass();
        try {
            runnable.run();
        } finally {
            limitedConcurrencyExecutor.f31859c.release();
            limitedConcurrencyExecutor.c();
        }
    }

    private Runnable b(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.w
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.a(this.f31923b, runnable);
            }
        };
    }

    private void c() {
        while (this.f31859c.tryAcquire()) {
            Runnable runnable = (Runnable) this.f31860d.poll();
            if (runnable == null) {
                this.f31859c.release();
                return;
            }
            this.f31858b.execute(b(runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31860d.offer(runnable);
        c();
    }
}
