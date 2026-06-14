package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmb zze;

    zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j10, boolean z10) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j10;
        this.zzd = z10;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
