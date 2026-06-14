package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzov implements Runnable {
    final /* synthetic */ zzph zza;
    final /* synthetic */ zzpg zzb;

    zzov(zzpg zzpgVar, zzph zzphVar) {
        this.zza = zzphVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zzb;
        zzpgVar.zzau(this.zza);
        zzpgVar.zzc();
    }
}
