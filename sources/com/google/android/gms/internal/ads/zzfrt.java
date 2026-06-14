package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrt implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzfsa zzb;

    zzfrt(zzfsa zzfsaVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzE(this.zza);
    }
}
