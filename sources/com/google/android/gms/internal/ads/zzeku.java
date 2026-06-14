package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeku implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    zzeku(zzekv zzekvVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzekvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) throws zzdmb {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z10);
            zzfkiVar.zzz(context);
        } catch (zzfjr e10) {
            throw new zzdmb(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzb;
    }
}
