package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzemf implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzemg zzc;

    zzemf(zzemg zzemgVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzemgVar);
        this.zzc = zzemgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z10);
            if (this.zzc.zzc().clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbo)).intValue()) {
                zzfkiVar.zzd();
            } else {
                zzfkiVar.zze(context);
            }
        } catch (zzfjr e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Cannot show interstitial.");
            throw new zzdmb(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzb;
    }
}
