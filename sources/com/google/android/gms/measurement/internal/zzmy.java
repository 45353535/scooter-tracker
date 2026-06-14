package com.google.android.gms.measurement.internal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzmy implements Runnable {
    final /* synthetic */ zzgb zza;
    final /* synthetic */ zznf zzb;

    zzmy(zznf zznfVar, zzgb zzgbVar) {
        this.zza = zzgbVar;
        Objects.requireNonNull(zznfVar);
        this.zzb = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznf zznfVar = this.zzb;
        synchronized (zznfVar) {
            try {
                zznfVar.zzd(false);
                zznl zznlVar = zznfVar.zza;
                if (!zznlVar.zzh()) {
                    zznlVar.zzu.zzaV().zzk().zza("Connected to service");
                    zznlVar.zzL(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
