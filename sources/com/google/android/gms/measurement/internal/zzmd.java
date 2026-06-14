package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzmd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zznl zzd;

    zzmd(zznl zznlVar, AtomicReference atomicReference, zzr zzrVar, boolean z10) {
        this.zza = atomicReference;
        this.zzb = zzrVar;
        this.zzc = z10;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zznl zznlVar;
        zzgb zzgbVarZzZ;
        AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznlVar = this.zzd;
                    zzgbVarZzZ = zznlVar.zzZ();
                } catch (RemoteException e10) {
                    this.zzd.zzu.zzaV().zzb().zzb("Failed to get all user properties; remote exception", e10);
                    atomicReference = this.zza;
                }
                if (zzgbVarZzZ == null) {
                    zznlVar.zzu.zzaV().zzb().zza("Failed to get all user properties; not connected to service");
                    atomicReference2.notify();
                    return;
                }
                zzr zzrVar = this.zzb;
                Preconditions.checkNotNull(zzrVar);
                atomicReference2.set(zzgbVarZzZ.zzj(zzrVar, this.zzc));
                zznlVar.zzV();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
