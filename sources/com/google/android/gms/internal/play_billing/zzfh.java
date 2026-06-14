package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfh {
    static final zzfh zza = new zzfh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzfh() {
        this.zzd = new HashMap();
    }

    public final zzft zza(zzhb zzhbVar, int i10) {
        return (zzft) this.zzd.get(new zzfg(zzhbVar, i10));
    }

    zzfh(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
