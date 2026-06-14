package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzce extends zzbw {
    final /* synthetic */ zzcf zza;

    zzce(zzcf zzcfVar) {
        Objects.requireNonNull(zzcfVar);
        this.zza = zzcfVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzcf zzcfVar = this.zza;
        zzbj.zza(i10, zzcfVar.zzc, FirebaseAnalytics.Param.INDEX);
        int i11 = i10 + i10;
        Object obj = zzcfVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzcfVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        return true;
    }
}
