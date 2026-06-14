package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeox implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    zzeox(zzeoz zzeozVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeozVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z10);
            zzfkiVar.zzm();
        } catch (zzfjr e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e10);
            throw new zzdmb(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzb;
    }
}
