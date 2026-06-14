package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes9.dex */
final class PausableExecutorImpl implements PausableExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f31862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f31863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final LinkedBlockingQueue f31864d = new LinkedBlockingQueue();

    PausableExecutorImpl(boolean z10, Executor executor) {
        this.f31862b = z10;
        this.f31863c = executor;
    }

    private void a() {
        if (this.f31862b) {
            return;
        }
        Runnable runnable = (Runnable) this.f31864d.poll();
        while (runnable != null) {
            this.f31863c.execute(runnable);
            runnable = !this.f31862b ? (Runnable) this.f31864d.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31864d.offer(runnable);
        a();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f31862b;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f31862b = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f31862b = false;
        a();
    }
}
