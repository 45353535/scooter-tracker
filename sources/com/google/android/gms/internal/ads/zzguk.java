package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzguk extends zzgwt {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgun zzc;

    zzguk(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzc = zzgunVar;
        this.zza = ((zzguf) zzgunVar.map.values()).listIterator(0);
        this.zzb = zzguv.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgub) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
