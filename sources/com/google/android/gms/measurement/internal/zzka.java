package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzka implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlj zzb;

    zzka(zzlj zzljVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzic zzicVar = this.zzb.zzu;
        zzhe zzheVar = zzicVar.zzd().zzf;
        long j10 = this.zza;
        zzheVar.zzb(j10);
        zzicVar.zzaV().zzj().zzb("Session timeout duration set", Long.valueOf(j10));
    }
}
