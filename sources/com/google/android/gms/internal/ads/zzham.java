package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final class zzham extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final Callable zzb;

    zzham(zzhan zzhanVar, Callable callable) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
