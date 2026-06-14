package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zzhae extends zzhaa implements zzgzz {
    final ScheduledExecutorService zza;

    zzhae(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhan zzhanVarZze = zzhan.zze(runnable, null);
        return new zzhac(zzhanVarZze, scheduledExecutorService.schedule(zzhanVarZze, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgzx schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzhan zzhanVar = new zzhan(callable);
        return new zzhac(zzhanVar, this.zza.schedule(zzhanVar, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleAtFixedRate(zzhadVar, j10, j11, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzgzz, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgzx scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhad zzhadVar = new zzhad(runnable);
        return new zzhac(zzhadVar, this.zza.scheduleWithFixedDelay(zzhadVar, j10, j11, timeUnit));
    }
}
