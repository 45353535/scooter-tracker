package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnk implements zzboh {
    zzbnk() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            String str = (String) map.get("enabled");
            zzboh zzbohVar = zzbog.zza;
            if (!zzgql.zze("true", str) && !zzgql.zze("false", str)) {
                return;
            }
            zzgai.zza(zzcjlVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
