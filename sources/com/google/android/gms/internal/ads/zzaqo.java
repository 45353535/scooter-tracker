package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes8.dex */
final class zzaqo implements zzafy {
    private final zzaql zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaqo(zzaql zzaqlVar, int i10, long j10, long j11) {
        this.zza = zzaqlVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzaqlVar.zzd);
        this.zzd = j12;
        this.zze = zzd(j12);
    }

    private final long zzd(long j10) {
        return zzfj.zzt(j10 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        long j11 = this.zzb;
        zzaql zzaqlVar = this.zza;
        long j12 = (((long) zzaqlVar.zzc) * j10) / (j11 * 1000000);
        String str = zzfj.zza;
        long j13 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = zzaqlVar.zzd;
        long jZzd = zzd(jMax);
        long j15 = this.zzc;
        zzafz zzafzVar = new zzafz(jZzd, (jMax * j14) + j15);
        if (jZzd >= j10 || jMax == j13) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j16 = jMax + 1;
        return new zzafw(zzafzVar, new zzafz(zzd(j16), j15 + (j14 * j16)));
    }
}
