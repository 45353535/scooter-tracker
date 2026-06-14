package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class zzacg {
    private final Context zza;
    private final zzacs zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzact zzh = new zzact(1.0f);
    private zzdn zze = zzdn.zza;

    public zzacg(Context context, zzacs zzacsVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzacsVar;
    }

    public final zzacg zza(boolean z10) {
        this.zzd = true;
        return this;
    }

    public final zzacg zzb(zzdn zzdnVar) {
        this.zze = zzdnVar;
        return this;
    }

    public final zzacg zzc(long j10) {
        this.zzg = j10;
        return this;
    }

    public final zzaco zzd() {
        zzgrc.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzacm(false);
        }
        zzaco zzacoVar = new zzaco(this, null);
        this.zzf = true;
        return zzacoVar;
    }

    final /* synthetic */ Context zze() {
        return this.zza;
    }

    final /* synthetic */ zzacs zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    final /* synthetic */ zzdn zzi() {
        return this.zze;
    }

    final /* synthetic */ long zzj() {
        return this.zzg;
    }

    final /* synthetic */ zzact zzk() {
        return this.zzh;
    }
}
