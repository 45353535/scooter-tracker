package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaff implements zzafy {
    private final zzafh zza;
    private final long zzb;

    public zzaff(zzafh zzafhVar, long j10) {
        this.zza = zzafhVar;
        this.zzb = j10;
    }

    private final zzafz zzd(long j10, long j11) {
        return new zzafz((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzafh zzafhVar = this.zza;
        zzafg zzafgVar = zzafhVar.zzk;
        zzafgVar.getClass();
        long jZzb = zzafhVar.zzb(j10);
        long[] jArr = zzafgVar.zza;
        int iZzm = zzfj.zzm(jArr, jZzb, true, false);
        long j11 = iZzm == -1 ? 0L : jArr[iZzm];
        long[] jArr2 = zzafgVar.zzb;
        zzafz zzafzVarZzd = zzd(j11, iZzm != -1 ? jArr2[iZzm] : 0L);
        if (zzafzVarZzd.zzb == j10 || iZzm == jArr.length - 1) {
            return new zzafw(zzafzVarZzd, zzafzVarZzd);
        }
        int i10 = iZzm + 1;
        return new zzafw(zzafzVarZzd, zzd(jArr[i10], jArr2[i10]));
    }
}
