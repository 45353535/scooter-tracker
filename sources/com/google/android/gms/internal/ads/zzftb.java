package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzftb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzftc zzb;

    zzftb(zzftc zzftcVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
