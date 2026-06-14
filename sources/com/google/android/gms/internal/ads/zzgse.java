package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class zzgse extends zzgsv implements zzgva {
    protected zzgse(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zza(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
