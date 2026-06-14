package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgvb extends zzgws {
    final /* synthetic */ zzgvc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvb(zzgvc zzgvcVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgvcVar);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
