package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeqc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdko zza;

    zzeqc(zzeqd zzeqdVar, zzdko zzdkoVar) {
        this.zza = zzdkoVar;
        Objects.requireNonNull(zzeqdVar);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzc().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdko zzdkoVar = this.zza;
        zzdkoVar.zzd().zza();
        zzdkoVar.zze().zza();
    }
}
