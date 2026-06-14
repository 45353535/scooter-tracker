package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzibo implements zzibf {
    final int zza;
    final zzies zzb;
    final boolean zzc;
    final boolean zzd;

    zzibo(zzibw zzibwVar, int i10, zzies zziesVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zziesVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzibo) obj).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zzies zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final zziet zzc() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzibf
    public final boolean zze() {
        return this.zzd;
    }
}
