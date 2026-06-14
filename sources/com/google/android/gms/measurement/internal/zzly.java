package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzly implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzmb zzb;

    zzly(zzmb zzmbVar, long j10) {
        this.zza = j10;
        Objects.requireNonNull(zzmbVar);
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zzb;
        zzmbVar.zzu.zzw().zzc(this.zza);
        zzmbVar.zza = null;
    }
}
