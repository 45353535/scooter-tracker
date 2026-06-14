package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgiu implements zzfxb {
    private final Context zza;
    private final zzgmz zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    zzgiu(Context context, zzgbf zzgbfVar, zzgmz zzgmzVar) {
        this.zza = context;
        this.zzc = zzgbfVar.zzb();
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
        this.zzb = zzgmzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zza(Map map) {
        ListenableFuture listenableFuture;
        zzaxg zzaxgVar;
        map.put("v", this.zzc);
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (zzaxgVar = (zzaxg) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzaxgVar.zzb().length() <= 1) ? ExifInterface.LONGITUDE_EAST : zzaxgVar.zzb();
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        return map;
    }
}
