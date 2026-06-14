package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8221b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f8220a = JsonUtils.getString(jSONObject, "id", "");
        this.f8221b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f8220a;
    }

    public String b() {
        return this.f8221b;
    }
}
