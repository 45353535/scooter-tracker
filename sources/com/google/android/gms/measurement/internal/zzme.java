package com.google.android.gms.measurement.internal;

import androidx.annotation.BinderThread;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzme extends zzgd {
    final /* synthetic */ AtomicReference zza;

    zzme(zznl zznlVar, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(zznlVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    @BinderThread
    public final void zze(List list) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
