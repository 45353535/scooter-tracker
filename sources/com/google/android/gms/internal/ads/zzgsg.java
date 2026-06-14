package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgsg extends zzgvi {
    final /* synthetic */ zzgsi zza;

    zzgsg(zzgsi zzgsiVar) {
        Objects.requireNonNull(zzgsiVar);
        this.zza = zzgsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgtd.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgsh(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgsi zzgsiVar = this.zza;
        zzgsiVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    final Map zza() {
        return this.zza;
    }
}
