package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetd implements zzfax {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzetd(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzetc zzetcVar = zzetc.zza;
        Executor executor = this.zzb;
        ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFuture, zzetcVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznV)).intValue() > 0) {
            listenableFutureZzj = zzgzo.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgzo.zzh(listenableFutureZzj, Throwable.class, zzetb.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 6;
    }
}
