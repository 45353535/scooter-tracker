package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzboj implements zzboh {
    private final zzbok zza;

    public zzboj(zzbok zzbokVar) {
        this.zza = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e10);
        }
        zzbok zzbokVar = this.zza;
        zzbokVar.zza(zEquals);
        zzbokVar.zzb(zEquals2, f10);
        zzcjlVar.zzaE(zEquals);
    }
}
