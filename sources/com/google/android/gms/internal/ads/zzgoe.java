package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i10) {
        return new zzgoc(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th2) {
        this.zza.zzb(i10 - 1, -1L, th2, null);
    }

    public final ListenableFuture zze(int i10, ListenableFuture listenableFuture) {
        zzgoc zzgocVarZza = zza(i10);
        zzgocVarZza.zza();
        zzgzo.zzr(listenableFuture, new zzgod(this, zzgocVarZza), zzhaf.zza());
        return listenableFuture;
    }

    public final void zzf(int i10, Runnable runnable) {
        try {
            zza(i10).zza();
            runnable.run();
        } finally {
        }
    }
}
