package com.google.android.gms.internal.fido;

import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzay extends zzau {
    final transient Object zza;

    zzay(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C4240b4.j.f42672d + this.zza.toString() + C4240b4.j.f42674e;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq
    /* JADX INFO: renamed from: zzd */
    public final zzaz iterator() {
        return new zzav(this.zza);
    }
}
