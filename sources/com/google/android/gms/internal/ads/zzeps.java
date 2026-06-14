package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeps implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzfjc zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ zzepz zzd;
    final /* synthetic */ zzepu zze;

    zzeps(zzepu zzepuVar, zzcen zzcenVar, zzfjc zzfjcVar, zzfir zzfirVar, zzepz zzepzVar) {
        this.zza = zzcenVar;
        this.zzb = zzfjcVar;
        this.zzc = zzfirVar;
        this.zzd = zzepzVar;
        Objects.requireNonNull(zzepuVar);
        this.zze = zzepuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzepz zzepzVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzepzVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
