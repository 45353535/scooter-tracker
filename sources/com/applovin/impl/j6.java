package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class j6 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f9129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f9130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f9131i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f9129g = jSONObject;
        this.f9130h = jSONObject2;
        this.f9131i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f9129g, this.f9130h, this.f9071a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f9129g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f9129g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.f9071a, this.f9131i);
        m5Var.c(zBooleanValue2);
        m5Var.b(zBooleanValue);
        this.f9071a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}
