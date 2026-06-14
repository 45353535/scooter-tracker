package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzbof implements zzboh {
    static final /* synthetic */ zzbof zza = new zzbof();

    private /* synthetic */ zzbof() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckx zzckxVar = (zzckx) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(StringUtils.COMMA);
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzckxVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
            map2.put(str2, boolValueOf);
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(";");
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        ((zzbrd) zzckxVar).zze("openableURLs", map2);
    }
}
