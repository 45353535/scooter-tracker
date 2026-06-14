package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzehe {
    private final zzbzn zza;

    zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcel.zza(listenableFutureZza, "persistFlags");
        }
    }
}
