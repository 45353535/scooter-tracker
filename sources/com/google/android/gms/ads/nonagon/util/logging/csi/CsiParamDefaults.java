package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgrt;
import com.ironsource.C4240b4;
import com.ironsource.N6;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(C4240b4.i.G, zzs.zzv());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzJ(context) ? "0" : "1");
        zzbgv zzbgvVar = zzbhe.zza;
        List listZzf = zzbd.zzb().zzf();
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzhN)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put(EidRequestBuilder.REQUEST_FIELD_EMAIL, TextUtils.join(StringUtils.COMMA, listZzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmN)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzG(context) ? "0" : "1");
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkR)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzcX)).booleanValue()) {
                map.put(N6.L, zzgrt.zza(zzt.zzh().zzu()));
            }
        }
    }
}
