package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zzbhr {
    private final Map zza = new HashMap();
    private final zzbht zzb;

    public zzbhr(zzbht zzbhtVar) {
        this.zzb = zzbhtVar;
    }

    public final void zza(String str, @Nullable zzbhq zzbhqVar) {
        this.zza.put(str, zzbhqVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbhq zzbhqVar = (zzbhq) map.get(str2);
        String[] strArr = {str};
        if (zzbhqVar != null) {
            this.zzb.zzb(zzbhqVar, j10, strArr);
        }
        map.put(str, new zzbhq(j10, null, null));
    }

    public final zzbht zzc() {
        return this.zzb;
    }
}
