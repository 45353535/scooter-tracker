package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes8.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j10, int i10) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zza(this.zzb.zzb.zzb);
        zzdxyVarZza.zzc("action", "ad_closed");
        zzdxyVarZza.zzc("show_time", String.valueOf(j10));
        zzdxyVarZza.zzc("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        zzdxyVarZza.zzc("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? ApsMetricsDataMap.APSMETRICS_FIELD_URL : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME : "cb" : "cc" : "bb" : "h");
        zzdxyVarZza.zzd();
    }
}
