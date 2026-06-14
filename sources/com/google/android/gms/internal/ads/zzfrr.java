package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrr implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza;
    final /* synthetic */ zzfsa zzb;

    zzfrr(zzfsa zzfsaVar, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = zzeaVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzb = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzF(this.zza);
    }
}
