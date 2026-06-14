package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class v5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f11131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONArray f11132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f11133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0175a f11134j;

    public v5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0175a interfaceC0175a) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.f11131g = a3Var;
        this.f11132h = jSONArray;
        this.f11133i = context;
        this.f11134j = interfaceC0175a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            r0.c(jSONObject, this.f9071a);
            r0.b(jSONObject, this.f9071a);
            r0.a(jSONObject, this.f9071a);
            l3.f(jSONObject, this.f9071a);
            l3.d(jSONObject, this.f9071a);
            l3.e(jSONObject, this.f9071a);
            l3.g(jSONObject, this.f9071a);
            this.f9071a.m().a();
            MaxAdFormat maxAdFormatA = this.f11131g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f11131g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f9071a.D().a(d2.f8560a1, this.f9072b, map);
                }
                this.f11134j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (n7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f9072b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f9072b, str);
            this.f11134j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f9071a.D().a(d2.S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Unable to process mediated ad response for ad unit " + this.f11131g.b(), th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f9071a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !n7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f9071a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f9071a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f10392f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.f10393g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.f9071a);
    }

    private String f() {
        return l3.b(this.f9071a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f9071a.A().a((Map) null, false, true);
        mapA.putAll(this.f11131g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f11131g.b());
        map.put("AppLovin-Ad-Format", this.f11131g.a().getLabel());
        Map mapD = this.f11131g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        v5 v5Var;
        JSONObject jSONObjectG;
        HashMap map;
        MaxAdFormat maxAdFormatA = this.f11131g.a();
        String strB = this.f11131g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f9071a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "User is connected to a VPN");
        }
        this.f9071a.P().a(d2.f8574h0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f9071a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f9071a.Y();
            s3 s3Var = s3.f10392f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        n7.a(this.f9071a, this.f9072b);
        try {
            jSONObjectG = g();
            map = new HashMap();
            if (!((Boolean) this.f9071a.a(x4.B5)).booleanValue() && !((Boolean) this.f9071a.a(x4.f11477z5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f9071a.a(x4.f11355k5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9071a.i0());
            }
            if (this.f9071a.s0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f9071a.s0().b();
            String str = this.f9071a.n0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strA = uc.a(StringUtils.COMMA, listB);
                map.put("filter_ad_network", strA);
                if (!this.f9071a.s0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f9071a.s0().d()) {
                    map.put("force_ad_network", strA);
                }
            } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            v5Var = this;
        } catch (Throwable th2) {
            th = th2;
            v5Var = this;
        }
        try {
            a aVar = v5Var.new a(com.applovin.impl.sdk.network.a.a(this.f9071a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f9071a.a(r3.f10345y8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f9071a.a(r3.f10332s7)).intValue()).a(((Integer) this.f9071a.a(x4.W2)).intValue()).b(((Long) this.f9071a.a(r3.f10330r7)).intValue()).a(u4.a.a(((Integer) this.f9071a.a(x4.f11405q5)).intValue())).f(true).a(), this.f9071a, strB, maxAdFormatA);
            aVar.c(r3.f10326p7);
            aVar.b(r3.f10328q7);
            v5Var.f9071a.q0().a(aVar);
        } catch (Throwable th3) {
            th = th3;
            if (com.applovin.impl.sdk.o.a()) {
                v5Var.f9073c.a(v5Var.f9072b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
            }
            a("", 0, th.getMessage());
        }
    }

    class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f11135m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f11136n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f11135m = str;
            this.f11136n = maxAdFormat;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                v5.this.a(str, i10, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f9267l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f9267l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f11135m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f11136n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f9267l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f9267l.b()), map);
            this.f9071a.P().d(d2.f8576i0, map);
            v5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            v5.this.a(str, i10, str2);
            this.f9071a.D().a("fetchMediatedAd", str, i10, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f11131g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strB);
        jSONObject2.put("ad_format", this.f11131g.a().getLabel());
        Map map = CollectionUtils.map(this.f11131g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f9071a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f9071a.n0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f9071a.R() != null) {
                Queue<y2> queueC = this.f9071a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", uc.a(StringUtils.COMMA, arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", uc.a(StringUtils.COMMA, arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f9071a.T().a()));
            jSONObject2.put("installed", w3.b(this.f9071a));
            jSONObject2.put("initialized", this.f9071a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f9071a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f9071a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f9071a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void a(JSONObject jSONObject) {
        f6 f6Var = new f6(this.f11131g, jSONObject, this.f11133i, this.f9071a, this.f11134j);
        long j10 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f9071a.q0().a(f6Var, d6.b.MEDIATION, j10, true);
        } else {
            this.f9071a.q0().a(f6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f11131g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i10);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", com.applovin.impl.sdk.utils.StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f11131g.a().getLabel(), map);
        this.f9071a.P().d(d2.f8578j0, map);
        t2.a(this.f11134j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f11132h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f9071a.n0().getExtraParameters()));
    }
}
