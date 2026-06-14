package com.applovin.impl;

import com.adjust.sdk.purchase.ADJPConstants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class j5 extends i5 {
    j5(com.applovin.impl.sdk.k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.l lVarA = this.f9071a.A();
        Map mapP = lVarA.p();
        n7.a("platform", "type", mapP);
        n7.a("api_level", ADJPConstants.KEY_SDK_VERSION, mapP);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(mapP));
        Map mapG = lVarA.G();
        n7.a(ADJPConstants.KEY_SDK_VERSION, "applovin_sdk_version", mapG);
        n7.a("ia", "installed_at", mapG);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapG));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.d(this.f9072b, "Submitting user data...");
        }
        Map mapC = r0.c(this.f9071a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f9071a.a(x4.F5)).booleanValue() || ((Boolean) this.f9071a.a(x4.f11477z5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapC);
            mapC = null;
        }
        a(mapC, jSONObject);
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            j5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r0.a(i10, this.f9071a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f9071a.o0().a(x4.f11304f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f9071a.o0().a(x4.f11340j, JsonUtils.getString(jSONObject2, "device_token", ""));
        r0.a(jSONObject2, this.f9071a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9071a).b(r0.b("2.0/device", this.f9071a)).a(r0.a("2.0/device", this.f9071a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f9071a.a(x4.M5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f9071a.a(x4.Z2)).intValue()).a(u4.a.a(((Integer) this.f9071a.a(x4.f11453w5)).intValue())).a(), this.f9071a);
        aVar.c(x4.f11376n0);
        aVar.b(x4.f11384o0);
        this.f9071a.q0().a(aVar);
    }
}
