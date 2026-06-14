package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwq extends zzgup {
    final transient Object zza;

    zzgwq(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgux(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append(C4240b4.j.f42672d);
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    /* JADX INFO: renamed from: zza */
    public final zzgwt iterator() {
        return new zzgux(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgup, com.google.android.gms.internal.ads.zzgub
    public final zzguf zze() {
        return zzguf.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }
}
