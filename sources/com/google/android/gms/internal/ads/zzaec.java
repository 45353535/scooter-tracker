package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaec {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzaec(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        this.zzb = j11;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = j15;
        this.zzc = j16;
        this.zzh = zza(j11, 0L, j13, j14, j15, j16);
    }

    protected static long zza(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        String str = zzfj.zza;
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    final /* synthetic */ long zzb() {
        return this.zzf;
    }

    final /* synthetic */ long zzc() {
        return this.zzg;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ void zzf(long j10, long j11) {
        this.zzd = j10;
        this.zzf = j11;
        zzi();
    }

    final /* synthetic */ void zzg(long j10, long j11) {
        this.zze = j10;
        this.zzg = j11;
        zzi();
    }

    final /* synthetic */ long zzh() {
        return this.zzh;
    }
}
