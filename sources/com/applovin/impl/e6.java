package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e6 extends i5 implements m2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f8781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f8782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f8783j;

    public e6(JSONObject jSONObject, u uVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(jSONObject, uVar, false, appLovinAdLoadListener, kVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Starting task for AppLovin ad...");
            }
            this.f9071a.q0().a(new j6(jSONObject, this.f8780g, this, this.f9071a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Starting task for VAST ad...");
            }
            this.f9071a.q0().a(h6.a(jSONObject, this.f8780g, this, this.f9071a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8782i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f8783j || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f9071a.g().a(d2.A, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.m2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8782i;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f8783j) {
            return;
        }
        this.f9071a.g().a(d2.B, this.f8781h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8780g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.k(this.f9072b, "No ads were returned from the server");
            }
            n7.a(this.f8781h.e(), this.f8781h.d(), this.f8780g, this.f9071a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public e6(JSONObject jSONObject, u uVar, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f8780g = jSONObject;
        this.f8781h = uVar;
        this.f8782i = appLovinAdLoadListener;
        this.f8783j = z10;
    }
}
