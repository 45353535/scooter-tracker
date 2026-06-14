package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbnb implements zzboh {
    zzbnb() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        WindowManager windowManager = (WindowManager) zzcjlVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = com.google.android.gms.ads.internal.util.zzs.zzx(windowManager);
        int i10 = displayMetricsZzx.widthPixels;
        int i11 = displayMetricsZzx.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) zzcjlVar).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        map2.put("yInPixels", Integer.valueOf(iArr[1]));
        map2.put("windowWidthInPixels", Integer.valueOf(i10));
        map2.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcjlVar.zze("locationReady", map2);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("GET LOCATION COMPILED");
    }
}
