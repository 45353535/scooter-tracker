package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgzb extends zzgzv {
    private final Executor zza;
    final /* synthetic */ zzgzc zzb;

    zzgzb(zzgzc zzgzcVar, Executor executor) {
        Objects.requireNonNull(zzgzcVar);
        this.zzb = zzgzcVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgzv
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzg(Throwable th2) {
        zzgzc zzgzcVar = this.zzb;
        zzgzcVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzgzcVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzgzcVar.cancel(false);
        } else {
            zzgzcVar.zzb(th2);
        }
    }
}
