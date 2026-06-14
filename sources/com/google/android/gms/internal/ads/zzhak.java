package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
final class zzhak extends zzgzf {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzhak(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    static ListenableFuture zze(ListenableFuture listenableFuture, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhak zzhakVar = new zzhak(listenableFuture);
        zzhai zzhaiVar = new zzhai(zzhakVar);
        zzhakVar.zzb = scheduledExecutorService.schedule(zzhaiVar, j10, timeUnit);
        listenableFuture.addListener(zzhaiVar, zzgzd.INSTANCE);
        return zzhakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 14);
        sb2.append("inputFuture=[");
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        String string2 = sb2.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb3 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb3.append(string2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    final /* synthetic */ ListenableFuture zzf() {
        return this.zza;
    }

    final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
