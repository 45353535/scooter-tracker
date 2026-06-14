package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcz implements zzfax {
    final ScheduledExecutorService zza;

    public zzfcz(zzbxw zzbxwVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zzk(zzgzo.zzi(zzgzo.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfd)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfcy.zza, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 49;
    }
}
