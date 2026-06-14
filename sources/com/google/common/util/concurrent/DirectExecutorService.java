package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DirectExecutorService extends AbstractListeningExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f31447b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31448c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31449d = false;

    DirectExecutorService() {
    }

    private void a() {
        synchronized (this.f31447b) {
            try {
                int i10 = this.f31448c - 1;
                this.f31448c = i10;
                if (i10 == 0) {
                    this.f31447b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b() {
        synchronized (this.f31447b) {
            try {
                if (this.f31449d) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f31448c++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        synchronized (this.f31447b) {
            while (true) {
                try {
                    if (this.f31449d && this.f31448c == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.f31447b, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b();
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z10;
        synchronized (this.f31447b) {
            z10 = this.f31449d;
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z10;
        synchronized (this.f31447b) {
            try {
                z10 = this.f31449d && this.f31448c == 0;
            } finally {
            }
        }
        return z10;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.f31447b) {
            try {
                this.f31449d = true;
                if (this.f31448c == 0) {
                    this.f31447b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
