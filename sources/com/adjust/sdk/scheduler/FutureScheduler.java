package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes5.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j10);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j10, long j11);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j10);

    void teardown();
}
