package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfyw extends zzibl implements zzidd {
    private zzfyw() {
        throw null;
    }

    public final zzfyw zza(String str) {
        str.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().remove(str);
        return this;
    }

    public final Map zzb() {
        return DesugarCollections.unmodifiableMap(((zzfyy) this.zza).zzb());
    }

    public final zzfyw zzc(String str, zzfyu zzfyuVar) {
        str.getClass();
        zzfyuVar.getClass();
        zzbg();
        ((zzfyy) this.zza).zze().put(str, zzfyuVar);
        return this;
    }

    /* synthetic */ zzfyw(byte[] bArr) {
        super(zzfyy.zzb);
    }
}
