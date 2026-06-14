package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzgyl extends zzgyn {
    zzgyl(ListenableFuture listenableFuture, zzgyw zzgywVar) {
        super(listenableFuture, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        ListenableFuture listenableFutureZza = zzgywVar.zza(obj2);
        zzgrc.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return listenableFutureZza;
    }
}
