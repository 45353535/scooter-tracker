package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public interface zzgzz extends ScheduledExecutorService, zzgzy {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    zzgzx zzd(Runnable runnable, long j10, TimeUnit timeUnit);

    zzgzx zze(Callable callable, long j10, TimeUnit timeUnit);

    zzgzx zzf(Runnable runnable, long j10, long j11, TimeUnit timeUnit);

    zzgzx zzg(Runnable runnable, long j10, long j11, TimeUnit timeUnit);
}
