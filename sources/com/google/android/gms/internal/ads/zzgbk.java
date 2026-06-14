package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgbk implements zzikp {
    final /* synthetic */ zzgbl zza;

    zzgbk(zzgbl zzgblVar) {
        Objects.requireNonNull(zzgblVar);
        this.zza = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgbs(this.zza.zza(), null);
    }
}
