package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class zzgsj implements Iterator {
    final Iterator zza;
    Collection zzb;
    Iterator zzc;
    final /* synthetic */ zzgsv zzd;

    zzgsj(zzgsv zzgsvVar) {
        Objects.requireNonNull(zzgsvVar);
        this.zzd = zzgsvVar;
        this.zza = zzgsvVar.zzo().entrySet().iterator();
        this.zzb = null;
        this.zzc = zzguw.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzc.remove();
        Collection collection = this.zzb;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        this.zzd.zzq(r0.zzp() - 1);
    }
}
