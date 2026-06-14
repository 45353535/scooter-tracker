package com.google.android.gms.internal.ads;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzfdq implements Callable {
    static final /* synthetic */ zzfdq zza = new zzfdq();

    private /* synthetic */ zzfdq() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap map = new HashMap();
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzat);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzau)).intValue()) {
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    map.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                }
            }
        }
        return new zzfds(map);
    }
}
