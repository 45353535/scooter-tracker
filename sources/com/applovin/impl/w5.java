package com.applovin.impl;

import android.content.Context;
import com.adjust.sdk.purchase.ADJPConstants;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class w5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final q0.e f11212g;

    public w5(q0.e eVar, com.applovin.impl.sdk.k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f11212g = eVar;
    }

    protected Map e() {
        HashMap map = new HashMap();
        map.put(ADJPConstants.KEY_SDK_VERSION, AppLovinSdk.VERSION);
        if (!((Boolean) this.f9071a.a(x4.f11355k5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9071a.i0());
        }
        Map mapG = this.f9071a.A().G();
        map.put("package_name", String.valueOf(mapG.get("package_name")));
        map.put("app_version", String.valueOf(mapG.get("app_version")));
        Map mapN = this.f9071a.A().N();
        map.put("platform", String.valueOf(mapN.get("platform")));
        map.put("os", String.valueOf(mapN.get("os")));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapE = e();
        JSONObject jSONObjectA = a(a());
        if (((Boolean) this.f9071a.a(x4.C5)).booleanValue() || ((Boolean) this.f9071a.a(x4.f11477z5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectA, (Map<String, ?>) mapE);
            mapE = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f9071a).c("POST").b(l3.i(this.f9071a)).a(l3.h(this.f9071a)).b(mapE).a(jSONObjectA).a((Object) new JSONObject()).c(((Long) this.f9071a.a(r3.f10334t7)).intValue()).a(u4.a.a(((Integer) this.f9071a.a(x4.f11413r5)).intValue())).a(), this.f9071a, d());
        aVar.c(r3.f10326p7);
        aVar.b(r3.f10328q7);
        this.f9071a.q0().a(aVar);
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            w5.this.f11212g.a(str, jSONObject, i10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            w5.this.f11212g.a(str, i10, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", w3.b(this.f9071a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a aVarF = this.f9071a.A().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarF.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarF.a());
        Map mapK0 = this.f9071a.k0();
        if (!CollectionUtils.isEmpty(mapK0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapK0));
        }
        return jSONObject;
    }
}
