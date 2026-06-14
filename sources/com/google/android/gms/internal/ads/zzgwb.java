package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwb extends zzguf {
    final /* synthetic */ zzgwc zza;

    zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i10, zzgwcVar.zzw(), FirebaseAnalytics.Param.INDEX);
        int i11 = i10 + i10;
        Object obj = zzgwcVar.zzv()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgwcVar.zzv()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }
}
