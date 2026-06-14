package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class g6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8910h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f8909g = jSONObject;
        this.f8910h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8909g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processing ad...");
            }
            this.f9071a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f8909g, this.f8910h, this.f9071a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.k(this.f9072b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.f8909g, this.f9071a);
        this.f8910h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
