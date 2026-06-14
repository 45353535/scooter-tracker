package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzikc implements zzikg {
    private final Map zza;

    zzikc(Map map) {
        this.zza = DesugarCollections.unmodifiableMap(map);
    }

    final Map zza() {
        return this.zza;
    }
}
