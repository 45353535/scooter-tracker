package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbpa implements zzboh {
    private final zzboz zza;

    public zzbpa(zzboz zzbozVar) {
        this.zza = zzbozVar;
    }

    public static void zzb(zzcjl zzcjlVar, zzboz zzbozVar) {
        zzcjlVar.zzab("/reward", new zzbpa(zzbozVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcas zzcasVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcasVar = new zzcas(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e10);
        }
        this.zza.zzb(zzcasVar);
    }
}
