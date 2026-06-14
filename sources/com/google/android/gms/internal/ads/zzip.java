package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
public final class zzip {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* synthetic */ zzip(float f10, float f11, long j10, float f12, long j11, long j12, float f13, byte[] bArr) {
        this.zza = j11;
        this.zzb = j12;
    }

    private final void zzf() {
        long j10;
        long j11 = this.zzc;
        if (j11 != -9223372036854775807L) {
            j10 = this.zzd;
            if (j10 == -9223372036854775807L) {
                long j12 = this.zzf;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.zzg;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze == j10) {
            return;
        }
        this.zze = j10;
        this.zzh = j10;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    public final void zza(zzaf zzafVar) {
        long j10 = zzafVar.zza;
        this.zzc = zzfj.zzq(-9223372036854775807L);
        this.zzf = zzfj.zzq(-9223372036854775807L);
        this.zzg = zzfj.zzq(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j10) {
        this.zzd = j10;
        zzf();
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.zzb;
        this.zzh = j11;
        long j12 = this.zzg;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.zzh = j12;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j10, long j11) {
        float f10;
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.zzm;
        if (j13 == -9223372036854775807L) {
            this.zzm = j12;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j12, zzg(j13, j12, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j12 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j14 = this.zzm + (this.zzn * 3);
        if (this.zzh > j14) {
            float fZzq = zzfj.zzq(1000L);
            f10 = 1.0E-7f;
            long[] jArr = {j14, this.zze, this.zzh - (((long) (fZzq * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzq)))};
            jMax = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j15 = jArr[i10];
                if (j15 > jMax) {
                    jMax = j15;
                }
            }
            this.zzh = jMax;
        } else {
            f10 = 1.0E-7f;
            long jMax3 = j10 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j16 = this.zzh;
            String str = zzfj.zza;
            jMax = Math.max(j16, Math.min(jMax3, j14));
            this.zzh = jMax;
            long j17 = this.zzg;
            if (j17 != -9223372036854775807L && jMax > j17) {
                this.zzh = j17;
                jMax = j17;
            }
        }
        long j18 = j10 - jMax;
        if (Math.abs(j18) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j18 * f10) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
