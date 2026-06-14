package com.google.android.gms.internal.ads;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class zzijt extends zzijy {
    final String zza;

    public zzijt(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzijy
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
