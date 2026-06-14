package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.taurusx.tax.y.z.w.z;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfbx implements zzfav {

    @Nullable
    private final AdvertisingIdClient.Info zza;

    @Nullable
    private final String zzb;
    private final zzgah zzc;

    public zzfbx(@Nullable AdvertisingIdClient.Info info, @Nullable String str, zzgah zzgahVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", z.C0835z.f67724y);
            zzgah zzgahVar = this.zzc;
            if (zzgahVar.zzc()) {
                jSONObjectZzh.put("paidv1_id_android_3p", zzgahVar.zza());
                jSONObjectZzh.put("paidv1_creation_time_android_3p", zzgahVar.zzb());
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        s0.a(this, obj);
    }
}
