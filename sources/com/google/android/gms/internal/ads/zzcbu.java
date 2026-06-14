package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ ListenableFuture zza;

    zzcbu(zzcbz zzcbzVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzcbz.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzc.remove(this.zza);
    }
}
