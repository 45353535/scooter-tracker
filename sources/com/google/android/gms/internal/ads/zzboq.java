package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzboq implements zzgzl {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbou zzd;

    zzboq(zzbou zzbouVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        Objects.requireNonNull(zzbouVar);
        this.zzd = zzbouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlz)).booleanValue()) {
            this.zza.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
