package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes8.dex */
final class zzajm implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzajm(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfj.zzq(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzajm zzd(long j10, zzaiq zzaiqVar, long j11) {
        int[] iArr = zzaiqVar.zzd;
        int length = iArr.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzaiqVar.zzb + iArr[i12]);
            j12 += (long) (zzaiqVar.zzc + zzaiqVar.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzajm(jArr, jArr2, j11);
    }

    private static Pair zzh(long j10, long[] jArr, long[] jArr2) {
        int iZzm = zzfj.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long j12 = jArr2[iZzm];
        int i10 = iZzm + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        String str = zzfj.zza;
        Pair pairZzh = zzh(zzfj.zzp(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzafz zzafzVar = new zzafz(zzfj.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzafw(zzafzVar, zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j10) {
        return zzfj.zzq(((Long) zzh(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return -2147483647;
    }
}
