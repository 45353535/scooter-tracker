package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f9925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f9927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9928f = false;

    o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f9923a = JsonUtils.getString(jSONObject, "name", "");
        this.f9924b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f9925c = a(jSONObject);
        this.f9926d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f9927e = a(com.ironsource.mediationsdk.d.f43819h, jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f9926d;
    }

    public String b() {
        return this.f9924b;
    }

    public String c() {
        return this.f9923a;
    }

    public k8 d() {
        return this.f9925c;
    }

    public List e() {
        return this.f9927e;
    }

    public boolean f() {
        return this.f9928f;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f9928f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
