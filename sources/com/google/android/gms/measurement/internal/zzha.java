package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzha implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhb zzb;

    zzha(zzhb zzhbVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzhbVar);
        this.zzb = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zzas(this.zza);
    }
}
