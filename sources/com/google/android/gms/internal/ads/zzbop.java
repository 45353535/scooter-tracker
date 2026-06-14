package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbop implements zzboh {
    private final zzdzc zza;

    public zzbop(zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(Reporting.Key.EVENT_TYPE) || TextUtils.isEmpty((CharSequence) map.get(Reporting.Key.EVENT_TYPE))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get(Reporting.Key.EVENT_TYPE)), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e10);
        }
    }
}
