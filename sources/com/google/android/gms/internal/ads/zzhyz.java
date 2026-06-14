package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzhyz extends AbstractSet {
    final /* synthetic */ zzhzc zza;

    zzhyz(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zza = zzhzcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzhyy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.zza.zze(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
