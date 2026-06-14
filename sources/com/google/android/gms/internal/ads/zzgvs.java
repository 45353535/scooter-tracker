package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgvs extends zzgvr {
    final /* synthetic */ zzgvt zza;

    zzgvs(zzgvt zzgvtVar, int i10) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvr
    public final zzgva zza() {
        return new zzgvv(this.zza.zza(), new zzgvq(2));
    }
}
