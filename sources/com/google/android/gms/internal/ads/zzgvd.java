package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgvd extends zzgws {
    final /* synthetic */ zzgve zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvd(zzgve zzgveVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgveVar);
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
