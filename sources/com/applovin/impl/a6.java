package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a6 extends y5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f8225j;

    public a6(k kVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar2) {
        super(u.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar2);
        this.f8225j = kVar;
    }

    @Override // com.applovin.impl.r5
    protected Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f8225j.b());
        map.put("adtoken_prefix", this.f8225j.d());
        return map;
    }
}
