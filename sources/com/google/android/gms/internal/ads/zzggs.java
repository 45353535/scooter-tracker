package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzggs extends zzghb {
    private final Map zza;

    zzggs(zzawg zzawgVar, zzgfx zzgfxVar, Map map, zzgoe zzgoeVar) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zzawgVar, zzgfxVar, zzgoeVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG));
        objArr.getClass();
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzawgVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzawgVar.zzX(jLongValue2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
