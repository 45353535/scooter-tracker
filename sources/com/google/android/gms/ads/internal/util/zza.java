package com.google.android.gms.ads.internal.util;

import j$.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zza implements Runnable {
    final /* synthetic */ zzb zza;

    zza(zzb zzbVar) {
        Objects.requireNonNull(zzbVar);
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.zza;
        zzbVar.zzc(Thread.currentThread());
        zzbVar.zza();
    }
}
