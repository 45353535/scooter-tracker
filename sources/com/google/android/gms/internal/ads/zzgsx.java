package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgsx extends AbstractCollection {
    final /* synthetic */ zzgsy zza;

    zzgsx(zzgsy zzgsyVar) {
        Objects.requireNonNull(zzgsyVar);
        this.zza = zzgsyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.zzk();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.zzd();
    }
}
