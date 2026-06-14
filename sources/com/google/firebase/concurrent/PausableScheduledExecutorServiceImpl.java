package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class PausableScheduledExecutorServiceImpl extends DelegatingScheduledExecutorService implements PausableScheduledExecutorService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PausableExecutorService f31867d;

    PausableScheduledExecutorServiceImpl(PausableExecutorService pausableExecutorService, ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.f31867d = pausableExecutorService;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f31867d.isPaused();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f31867d.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f31867d.resume();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
