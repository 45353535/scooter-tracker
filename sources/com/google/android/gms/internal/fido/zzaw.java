package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzaw extends zzat {
    static final zzat zza = new zzaw(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzaw(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzam.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzat, com.google.android.gms.internal.fido.zzaq
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final Object[] zze() {
        return this.zzb;
    }
}
