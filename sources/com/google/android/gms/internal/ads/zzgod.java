package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgod implements zzgzl {
    final /* synthetic */ zzgoc zza;

    zzgod(zzgoe zzgoeVar, zzgoc zzgocVar) {
        this.zza = zzgocVar;
        Objects.requireNonNull(zzgoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzgoc zzgocVar = this.zza;
        zzgocVar.zzb(th2);
        zzgocVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
