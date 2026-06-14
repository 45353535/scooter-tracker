package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z5 extends r5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f11644i;

    public z5(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f11644i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.r5
    protected i5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f11644i, this.f9071a);
    }

    @Override // com.applovin.impl.r5
    protected String e() {
        return r0.d(this.f9071a);
    }

    @Override // com.applovin.impl.r5
    protected String f() {
        return r0.e(this.f9071a);
    }

    @Override // com.applovin.impl.r5
    protected void a(int i10, String str) {
        super.a(i10, str);
        this.f11644i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
