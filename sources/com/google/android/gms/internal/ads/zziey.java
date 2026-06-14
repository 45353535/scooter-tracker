package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zziey implements Iterator, yf.a {
    final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    zziey(Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzifa((Map.Entry) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
