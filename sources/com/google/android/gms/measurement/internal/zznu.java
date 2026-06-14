package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zznu implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzoc zzb;

    zznu(zzoc zzocVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzocVar);
        this.zzb = zzocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk(this.zza);
    }
}
