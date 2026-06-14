package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeqa implements zzdmc {
    final /* synthetic */ zzfir zza;

    zzeqa(zzeqd zzeqdVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzeqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zza;
    }
}
