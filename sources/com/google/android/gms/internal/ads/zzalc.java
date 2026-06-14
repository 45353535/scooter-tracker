package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzv zzg;
    public final int zzh;

    @Nullable
    public final long[] zzi;

    @Nullable
    public final long[] zzj;
    public final int zzk;

    @Nullable
    private final zzald[] zzl;

    public zzalc(int i10, int i11, long j10, long j11, long j12, long j13, zzv zzvVar, int i12, @Nullable zzald[] zzaldVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = zzvVar;
        this.zzh = i12;
        this.zzl = zzaldVarArr;
        this.zzk = i13;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    @Nullable
    public final zzald zza(int i10) {
        return this.zzl[i10];
    }

    public final zzalc zzb(zzv zzvVar) {
        return new zzalc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
