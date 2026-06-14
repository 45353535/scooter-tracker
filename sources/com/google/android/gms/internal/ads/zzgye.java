package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzgye extends zzgyg {
    zzgye(ListenableFuture listenableFuture, Class cls, zzgyw zzgywVar) {
        super(listenableFuture, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        ListenableFuture listenableFutureZza = zzgywVar.zza(th2);
        zzgrc.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return listenableFutureZza;
    }
}
