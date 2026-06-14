package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzaju(long j10, int i10, long j11, int i11, long j12, @Nullable long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    @Nullable
    public static zzaju zzd(zzajt zzajtVar, long j10) {
        long jZzb = zzajtVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j10, zzafrVar.zzc, jZzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    private final long zzh(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + ((long) this.zzb));
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j11 = this.zzc;
        String str = zzfj.zza;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / j11;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d12 = jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        long j12 = this.zze;
        zzafz zzafzVar2 = new zzafz(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j12), j12 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.zza;
        if (j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.zze;
        int iZzm = zzfj.zzm(jArr, (long) d10, true, true);
        long jZzh = zzh(iZzm);
        long j12 = jArr[iZzm];
        int i10 = iZzm + 1;
        long jZzh2 = zzh(i10);
        return jZzh + Math.round((j12 == (iZzm == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jZzh2 - jZzh));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzd;
    }
}
