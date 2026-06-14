package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwe extends zzguf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzgwe(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgrc.zzm(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return true;
    }
}
