package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzckz;
import com.google.android.gms.internal.ads.zzejf;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class zzt extends zzz {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzK()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public zzcjw zzb(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z10, @Nullable zzejf zzejfVar) {
        return new zzckz(zzcjlVar, zzbgdVar, z10, zzejfVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }
}
