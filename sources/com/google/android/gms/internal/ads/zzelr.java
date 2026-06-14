package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzelr implements zzdmc {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzfir zzb;
    final /* synthetic */ zzelt zzc;

    zzelr(zzelt zzeltVar, zzcen zzcenVar, zzfir zzfirVar) {
        this.zza = zzcenVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzeltVar);
        this.zzc = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, @Nullable zzdbs zzdbsVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzb;
    }
}
