package com.google.android.gms.internal.consent_sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzdy extends zzdv {
    static final zzdv zza = new zzdy(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzdy(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzdj.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, com.google.android.gms.internal.consent_sdk.zzds
    final int zza(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final Object[] zze() {
        return this.zzb;
    }
}
