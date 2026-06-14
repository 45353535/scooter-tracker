package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    zzb(zzd zzdVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzdVar);
        this.zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zze(this.zza, this.zzb);
    }
}
