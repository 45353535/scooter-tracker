package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzsq {
    private final zzv zza;
    private final zzv zzb;
    private final int zzc;
    private final int zzd;
    private final zzql zze;
    private final zzck zzf;

    private zzsq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzql zzqlVar, zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzqlVar;
        this.zzf = zzckVar;
    }

    final /* synthetic */ zzsq zza(zzql zzqlVar) {
        return new zzsq(this.zza, this.zzb, this.zzc, this.zzd, zzqlVar, this.zzf);
    }

    final /* synthetic */ boolean zzb(zzsq zzsqVar) {
        return zzsqVar.zze.equals(this.zze);
    }

    final /* synthetic */ long zzc(long j10) {
        return zzfj.zzr(j10, this.zza.zzH);
    }

    final /* synthetic */ long zzd(long j10) {
        return zzfj.zzr(j10, this.zze.zzb);
    }

    final /* synthetic */ zzrd zze() {
        zzql zzqlVar = this.zze;
        return new zzrd(zzqlVar.zza, zzqlVar.zzb, zzqlVar.zzc, false, false, zzqlVar.zze);
    }

    final /* synthetic */ boolean zzf() {
        return Objects.equals(this.zza.zzo, "audio/raw");
    }

    final /* synthetic */ zzv zzg() {
        return this.zza;
    }

    final /* synthetic */ zzv zzh() {
        return this.zzb;
    }

    final /* synthetic */ int zzi() {
        return this.zzc;
    }

    final /* synthetic */ int zzj() {
        return this.zzd;
    }

    final /* synthetic */ zzql zzk() {
        return this.zze;
    }

    final /* synthetic */ zzck zzl() {
        return this.zzf;
    }

    /* synthetic */ zzsq(zzv zzvVar, zzv zzvVar2, int i10, int i11, zzql zzqlVar, zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i10, i11, zzqlVar, zzckVar);
    }
}
