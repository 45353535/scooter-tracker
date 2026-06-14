package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbmy implements zzboh {
    private final zzbmz zza;

    public zzbmy(zzbmz zzbmzVar) {
        this.zza = zzbmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App event with no name parameter.");
        }
    }
}
