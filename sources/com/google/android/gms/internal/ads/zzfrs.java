package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb;
    final /* synthetic */ zzfsa zzc;

    zzfrs(zzfsa zzfsaVar, long j10, com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zza = j10;
        this.zzb = zzeaVar;
        Objects.requireNonNull(zzfsaVar);
        this.zzc = zzfsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfsa zzfsaVar = this.zzc;
        if (zzfsaVar.zzI() != null) {
            zzfrf zzfrfVarZzI = zzfsaVar.zzI();
            long j10 = this.zza;
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            zzfrfVarZzI.zzi(j10, zzfsa.zzX(zzeaVar), zzfsaVar.zzK(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzfsaVar.zzH());
        }
    }
}
