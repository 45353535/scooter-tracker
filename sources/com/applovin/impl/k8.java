package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9184c;

    public k8(JSONObject jSONObject) {
        this.f9182a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f9183b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f9184c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f9182a;
    }

    public String b() {
        return this.f9183b;
    }

    public List c() {
        return this.f9184c;
    }
}
