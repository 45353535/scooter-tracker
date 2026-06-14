package com.google.android.gms.internal.maps;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzbr extends zzbk {
    final /* synthetic */ zzbs zza;

    zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzbs zzbsVar = this.zza;
        zzbc.zza(i10, zzbsVar.zzc, FirebaseAnalytics.Param.INDEX);
        int i11 = i10 + i10;
        Object obj = zzbsVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzbsVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
