package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhit {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhit() {
    }

    public final zzhit zza(Enum r22, Object obj) {
        this.zza.put(r22, obj);
        this.zzb.put(obj, r22);
        return this;
    }

    public final zzhiu zzb() {
        return new zzhiu(DesugarCollections.unmodifiableMap(this.zza), DesugarCollections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzhit(byte[] bArr) {
    }
}
