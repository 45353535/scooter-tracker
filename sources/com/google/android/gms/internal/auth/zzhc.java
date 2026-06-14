package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzhc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhd zzb;

    zzhc(zzhd zzhdVar) {
        this.zzb = zzhdVar;
        this.zza = zzhdVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
