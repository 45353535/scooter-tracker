package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtj extends AbstractSet {
    final /* synthetic */ zzgtm zza;

    /* synthetic */ zzgtj(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
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
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgte(zzgtmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        return mapZzc != null ? mapZzc.keySet().remove(obj) : zzgtmVar.zzj(obj) != zzgtm.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
