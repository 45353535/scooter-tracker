package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzvw {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzha zzc;

    public zzvw(zzafa zzafaVar, zzamd zzamdVar) {
    }

    public final void zza(zzha zzhaVar) {
        if (zzhaVar != this.zzc) {
            this.zzc = zzhaVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
