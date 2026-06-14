package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public class zzaek implements zzafy {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaek(long j10, long j11, int i10, int i11, boolean z10) {
        long jZze;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            jZze = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            jZze = zze(j10, j11, i10);
        }
        this.zzf = jZze;
    }

    private static long zze(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzafz zzafzVar = new zzafz(0L, this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j12 = ((long) this.zze) * j10;
        long j13 = this.zzc;
        long jMin = ((j12 / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzd = zzd(jMax);
        zzafz zzafzVar2 = new zzafz(jZzd, jMax);
        if (j11 != -1 && jZzd < j10) {
            long j14 = jMax + j13;
            if (j14 < this.zza) {
                return new zzafw(zzafzVar2, new zzafz(zzd(j14), j14));
            }
        }
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    public final long zzd(long j10) {
        return zze(j10, this.zzb, this.zze);
    }
}
