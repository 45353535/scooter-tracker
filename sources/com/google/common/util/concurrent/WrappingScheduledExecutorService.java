package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class WrappingScheduledExecutorService extends WrappingExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ScheduledExecutorService f31631c;

    protected WrappingScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f31631c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f31631c.schedule(b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f31631c.scheduleAtFixedRate(b(runnable), j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f31631c.scheduleWithFixedDelay(b(runnable), j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return this.f31631c.schedule(c(callable), j10, timeUnit);
    }
}
