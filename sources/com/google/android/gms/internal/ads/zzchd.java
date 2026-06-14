package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzchd implements zzboh {
    private final zzchc zza;

    public zzchd(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.zza(str2);
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("src missing from video GMSG.");
            }
        }
    }
}
