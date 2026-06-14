package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgbq implements zzikp {
    final /* synthetic */ zzgbr zza;

    zzgbq(zzgbr zzgbrVar) {
        Objects.requireNonNull(zzgbrVar);
        this.zza = zzgbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbr zzgbrVar = this.zza;
        return new zzgbu(zzgbrVar.zzb(), zzgbrVar.zzc(), null);
    }
}
