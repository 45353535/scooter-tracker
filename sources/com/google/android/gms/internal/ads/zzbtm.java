package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbtm {
    public final List zza;
    public final String zzb;

    @Nullable
    public final String zzc;

    public zzbtm(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.zza = DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, POBCTAOverlayData.KEY_CTA_CLICKURL);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbto.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(POBCoreNativeConstants.NATIVE_ASSETS);
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbto.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
