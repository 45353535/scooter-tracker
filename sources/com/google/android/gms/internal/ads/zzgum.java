package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgum extends zzgub {
    private final transient zzgun zza;

    zzgum(zzgun zzgunVar) {
        this.zza = zzgunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzguk(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    /* JADX INFO: renamed from: zza */
    public final zzgwt iterator() {
        return new zzguk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i10) {
        zzgwu zzgwuVarListIterator = ((zzguf) this.zza.map.values()).listIterator(0);
        while (zzgwuVarListIterator.hasNext()) {
            i10 = ((zzgub) zzgwuVarListIterator.next()).zzg(objArr, i10);
        }
        return i10;
    }
}
