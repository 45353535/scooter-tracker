package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwa extends zzguf {
    static final zzguf zza = new zzgwa(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzgwa(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgrc.zzm(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }
}
