package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtl extends AbstractCollection {
    final /* synthetic */ zzgtm zza;

    /* synthetic */ zzgtl(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        return mapZzc != null ? mapZzc.values().iterator() : new zzgtg(zzgtmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
