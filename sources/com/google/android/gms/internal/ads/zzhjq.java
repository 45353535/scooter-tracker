package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhjq {
    private HashMap zza = new HashMap();

    public final zzhjr zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhjr zzhjrVar = new zzhjr(DesugarCollections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhjrVar;
    }
}
