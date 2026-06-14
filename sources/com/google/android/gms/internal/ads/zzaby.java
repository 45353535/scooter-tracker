package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzaby implements zzadp {
    final /* synthetic */ zzuk zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzacc zzd;

    zzaby(zzacc zzaccVar, zzuk zzukVar, int i10, long j10) {
        this.zza = zzukVar;
        this.zzb = i10;
        this.zzc = j10;
        Objects.requireNonNull(zzaccVar);
        this.zzd = zzaccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zza(long j10) {
        this.zzd.zzay(this.zza, this.zzb, this.zzc, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzb() {
        this.zzd.zzav(this.zza, this.zzb, this.zzc);
    }
}
