package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzazl extends zzaxz {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzazl() {
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    protected final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzazl(String str) {
        HashMap mapZzb = zzaxz.zzb(str);
        if (mapZzb != null) {
            this.zza = (Long) mapZzb.get(0);
            this.zzb = (Long) mapZzb.get(1);
            this.zzc = (Long) mapZzb.get(2);
        }
    }
}
