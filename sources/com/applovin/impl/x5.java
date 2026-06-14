package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class x5 extends z5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f11481j;

    public x5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar2);
        this.f11481j = kVar;
    }

    @Override // com.applovin.impl.r5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f11481j.b());
        map.put("adtoken_prefix", this.f11481j.d());
        return map;
    }
}
