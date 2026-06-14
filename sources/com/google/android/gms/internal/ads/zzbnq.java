package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnq implements zzboh {
    zzbnq() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String strValueOf = String.valueOf((String) map.get(TypedValues.Custom.S_STRING));
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(strValueOf));
    }
}
