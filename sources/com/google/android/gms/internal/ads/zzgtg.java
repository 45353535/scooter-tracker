package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtg extends zzgti {
    final /* synthetic */ zzgtm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtg(zzgtm zzgtmVar) {
        super(zzgtmVar, null);
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    final Object zza(int i10) {
        return this.zza.zzp(i10);
    }
}
