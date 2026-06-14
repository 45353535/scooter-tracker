package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaee {
    public static final zzaee zza = new zzaee(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaee(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaee zza(long j10, long j11) {
        return new zzaee(-1, j10, j11);
    }

    public static zzaee zzb(long j10, long j11) {
        return new zzaee(-2, j10, j11);
    }

    public static zzaee zzc(long j10) {
        return new zzaee(0, -9223372036854775807L, j10);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
