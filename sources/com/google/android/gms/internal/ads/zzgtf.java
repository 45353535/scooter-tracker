package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtf extends zzgti {
    final /* synthetic */ zzgtm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtf(zzgtm zzgtmVar) {
        super(zzgtmVar, null);
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    final /* bridge */ /* synthetic */ Object zza(int i10) {
        return new zzgtk(this.zza, i10);
    }
}
