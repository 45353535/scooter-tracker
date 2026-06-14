package com.google.android.gms.internal.consent_sdk;

import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzea extends zzdw {
    final transient Object zza;

    zzea(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdx(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C4240b4.j.f42672d + this.zza.toString() + C4240b4.j.f42674e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: zzd */
    public final zzeb iterator() {
        return new zzdx(this.zza);
    }
}
