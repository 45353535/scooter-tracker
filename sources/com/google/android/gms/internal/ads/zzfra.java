package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfra {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public zzfra(long j10, double d10, long j11, double d11, Clock clock) {
        this.zza = j10;
        this.zzb = j11;
        this.zzf = clock;
        zza();
    }

    public final void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final long zzb() {
        double d10 = this.zzg;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzh.nextDouble() * ((j10 - r0) + 1)));
    }

    public final void zzc() {
        this.zze = this.zzf.currentTimeMillis() + zzb();
        double d10 = this.zzg;
        this.zzg = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final boolean zze() {
        zzbgv zzbgvVar = zzbhe.zzJ;
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue()) && this.zzg >= this.zzb;
    }

    public final synchronized void zzf(int i10) {
        Preconditions.checkArgument(i10 > 0);
        this.zzd = i10;
    }
}
