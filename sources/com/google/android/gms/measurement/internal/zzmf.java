package com.google.android.gms.measurement.internal;

import androidx.annotation.BinderThread;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzmf extends zzgg {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zznl zzb;

    zzmf(zznl zznlVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    @BinderThread
    public final void zze(zzoq zzoqVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.zza.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
