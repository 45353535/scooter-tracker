package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzht {
    private final Map zza = new HashMap();

    @Nullable
    private Map zzb;

    public final synchronized Map zza() {
        try {
            if (this.zzb == null) {
                this.zzb = DesugarCollections.unmodifiableMap(new HashMap(this.zza));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzb;
    }
}
