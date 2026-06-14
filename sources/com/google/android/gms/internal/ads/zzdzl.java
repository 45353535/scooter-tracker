package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class zzdzl {

    @Nullable
    private Long zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private Integer zzd;

    @Nullable
    private String zze;

    @Nullable
    private Integer zzf;

    /* synthetic */ zzdzl(String str, byte[] bArr) {
        this.zzb = str;
    }

    final /* synthetic */ String zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlv);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.zza);
            jSONObject.put("eventCategory", this.zzb);
            jSONObject.putOpt("event", this.zzc);
            jSONObject.putOpt("errorCode", this.zzd);
            jSONObject.putOpt("rewardType", this.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.zzf);
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(string).length() + 2);
        sb2.append(str);
        sb2.append("(\"h5adsEvent\",");
        sb2.append(string);
        sb2.append(");");
        return sb2.toString();
    }

    final /* synthetic */ void zzb(Long l10) {
        this.zza = l10;
    }

    final /* synthetic */ void zzc(String str) {
        this.zzc = str;
    }

    final /* synthetic */ void zzd(Integer num) {
        this.zzd = num;
    }

    final /* synthetic */ void zze(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzf(Integer num) {
        this.zzf = num;
    }
}
