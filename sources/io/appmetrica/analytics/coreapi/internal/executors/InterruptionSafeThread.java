package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes12.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f75163a;

    public InterruptionSafeThread() {
        this.f75163a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f75163a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f75163a = false;
        interrupt();
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String str) {
        super(runnable, str);
        this.f75163a = true;
    }

    public InterruptionSafeThread(@NonNull String str) {
        super(str);
        this.f75163a = true;
    }

    @VisibleForTesting(otherwise = 5)
    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
        this.f75163a = true;
    }
}
