package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzhal extends zzgzv {
    final /* synthetic */ zzhan zza;
    private final zzgyv zzb;

    zzhal(zzhan zzhanVar, zzgyv zzgyvVar) {
        Objects.requireNonNull(zzhanVar);
        this.zza = zzhanVar;
        this.zzb = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgyv zzgyvVar = this.zzb;
        ListenableFuture listenableFutureZza = zzgyvVar.zza();
        zzgrc.zzl(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgyvVar);
        return listenableFutureZza;
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
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
