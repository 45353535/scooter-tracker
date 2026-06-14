package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcvu implements zzdct, zzbde, zzdgh {
    private final zzfir zza;
    private final zzdbx zzb;
    private final zzddc zzc;
    private final zzddy zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcvu(zzfir zzfirVar, zzdbx zzdbxVar, zzddc zzddcVar, zzddy zzddyVar) {
        this.zza = zzfirVar;
        this.zzb = zzdbxVar;
        this.zzc = zzddcVar;
        this.zzf = zzddyVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        int i10 = this.zza.zze;
        if (i10 == 1) {
            if (zzbddVar.zzj) {
                zzd();
            }
        } else if (i10 == 4 && zzbddVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbddVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        int i10 = this.zza.zze;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        zzd();
    }
}
