package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfrp implements zzgzl {
    final /* synthetic */ zzfsa zza;

    zzfrp(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        this.zza.zzC(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzB(obj);
    }
}
