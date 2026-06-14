package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzajk extends zzaek implements zzajr {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzajk(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, false);
        this.zza = j11;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10 != -1 ? j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j10) {
        return zzd(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzb;
    }

    public final zzajk zzh(long j10) {
        return new zzajk(j10, this.zza, this.zzb, this.zzc, false);
    }
}
