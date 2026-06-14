package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzikk extends zzikc {
    static {
        zzikh.zza(Collections.EMPTY_MAP);
    }

    /* synthetic */ zzikk(Map map, zziki zzikiVar) {
        super(map);
    }

    public static zzikj zzc(int i10) {
        return new zzikj(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzc = zzikd.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), ((zzikp) entry.getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapZzc);
    }
}
