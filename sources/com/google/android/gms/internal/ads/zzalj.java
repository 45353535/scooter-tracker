package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzalj implements zzalp {
    private final zzafh zza;
    private final zzafg zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzalj(zzafh zzafhVar, zzafg zzafgVar) {
        this.zza = zzafhVar;
        this.zzb = zzafgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zza(zzaev zzaevVar) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfj.zzm(jArr, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzafy zzc() {
        zzgrc.zzi(this.zzc != -1);
        return new zzaff(this.zza, this.zzc);
    }

    public final void zzd(long j10) {
        this.zzc = j10;
    }
}
