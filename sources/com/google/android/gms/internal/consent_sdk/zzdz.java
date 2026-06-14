package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzdz extends zzdw {
    static final zzdz zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzdz(objArr, 0, objArr, 0, 0);
    }

    zzdz(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZza = zzdr.zza(obj.hashCode());
                while (true) {
                    int i10 = iZza & this.zzf;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZza = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zza(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: zzd */
    public final zzeb iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw
    final zzdv zzh() {
        return zzdv.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw
    final boolean zzl() {
        return true;
    }
}
