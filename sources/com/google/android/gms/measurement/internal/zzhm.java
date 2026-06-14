package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzhm extends LruCache {
    final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhm(zzht zzhtVar, int i10) {
        super(20);
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzC(str);
    }
}
