package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.adjust.sdk.purchase.ADJPConstants;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.models.AdExperience;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class t5 extends i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f10992j = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f10994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f10995i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    private class c extends i5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t5.this.f10995i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "Timing out fetch basic settings...");
                }
                t5.this.a(new JSONObject());
            }
        }
    }

    public t5(int i10, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f10994h = new Object();
        this.f10993g = i10;
        this.f10995i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return r0.a((String) this.f9071a.a(x4.f11350k0), "5.0/i", b());
    }

    private String g() {
        return r0.a((String) this.f9071a.a(x4.f11341j0), "5.0/i", b());
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f9071a;
            x4 x4Var = x4.f11477z5;
            if (((Boolean) kVar.a(x4Var)).booleanValue() || ((Boolean) this.f9071a.a(x4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", j.b());
            jSONObject.put("init_count", this.f10993g);
            jSONObject.put("server_installed_at", this.f9071a.a(x4.f11383o));
            if (this.f9071a.C0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f9071a.z0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", n7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", n7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f9071a.a(x4.L3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f9071a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f9071a.C());
            jSONObject.put("installed_mediation_adapters", w3.b(this.f9071a));
            Map mapG = this.f9071a.A().G();
            jSONObject.put("package_name", mapG.get("package_name"));
            jSONObject.put("app_version", mapG.get("app_version"));
            jSONObject.put("debug", mapG.get("debug"));
            jSONObject.put("tg", mapG.get("tg"));
            jSONObject.put("target_sdk", mapG.get("target_sdk"));
            jSONObject.put("session_id", mapG.get("session_id"));
            List list = (List) mapG.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapG.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f9071a.J() != null ? this.f9071a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapG.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_gdprApplies", mapG.get("IABTCF_gdprApplies"));
            Object obj = mapG.get(com.taurusx.tax.g.q.f66281i);
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, com.taurusx.tax.g.q.f66281i, (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f9071a.x().b());
            Map mapN = this.f9071a.A().N();
            jSONObject.put("platform", mapN.get("platform"));
            jSONObject.put("os", mapN.get("os"));
            jSONObject.put(CommonUrlParts.LOCALE, mapN.get(CommonUrlParts.LOCALE));
            jSONObject.put(AdExperience.BRAND, mapN.get(AdExperience.BRAND));
            jSONObject.put("brand_name", mapN.get("brand_name"));
            jSONObject.put("hardware", mapN.get("hardware"));
            jSONObject.put("model", mapN.get("model"));
            jSONObject.put("revision", mapN.get("revision"));
            jSONObject.put("is_tablet", mapN.get("is_tablet"));
            jSONObject.put("screen_size_in", mapN.get("screen_size_in"));
            jSONObject.put("supported_abis", mapN.get("supported_abis"));
            Object obj2 = mapN.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f9071a.a(x4.W3)).booleanValue()) {
                jSONObject.put("mtl", this.f9071a.m0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put(EidRequestBuilder.REQUEST_FIELD_LMT, memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            v.a aVarF = this.f9071a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = p0.c().b(a());
            if (((Boolean) this.f9071a.a(x4.G3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarH = this.f9071a.A().H();
            if (((Boolean) this.f9071a.a(x4.f11475z3)).booleanValue() && bVarH != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarH.f10753a);
                jSONObject.put("idfv_scope", bVarH.f10754b);
            }
            if (((Boolean) this.f9071a.a(x4.C3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f9071a.u());
            }
            if (((Boolean) this.f9071a.a(x4.E3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f9071a.h0());
            }
            if (((Boolean) this.f9071a.a(x4.I3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f9071a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f9071a.E());
            if (this.f9071a.s0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f9071a.s0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f9071a.n0().getExtraParameters()));
            Map mapK0 = this.f9071a.k0();
            if (!CollectionUtils.isEmpty(mapK0)) {
                jSONObject.put("segments", new JSONObject(mapK0));
            }
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to create JSON body", e10);
            }
            this.f9071a.D().a(this.f9072b, "createJSONBody", e10);
        }
        return jSONObject;
    }

    protected Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f9071a.a(x4.A5)).booleanValue() && !((Boolean) this.f9071a.a(x4.f11477z5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f9071a.a(x4.f11355k5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9071a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f9071a.q(), map);
        Boolean boolB = p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!o0.i() && f10992j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.a(this.f9072b, "Cannot update security provider", th2);
                }
            }
        }
        this.f9071a.v0().d(d2.f8571g, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map mapH = h();
        a.C0183a c0183aB = com.applovin.impl.sdk.network.a.a(this.f9071a).b(g()).a(f()).b(mapH).a(e()).b(((Boolean) this.f9071a.a(x4.L5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f9071a.a(x4.f11281c3)).intValue()).b(((Integer) this.f9071a.a(x4.f11308f3)).intValue());
        com.applovin.impl.sdk.k kVar = this.f9071a;
        x4 x4Var = x4.f11272b3;
        com.applovin.impl.sdk.network.a aVarA = c0183aB.c(((Integer) kVar.a(x4Var)).intValue()).e(((Boolean) this.f9071a.a(x4.f11387o3)).booleanValue()).a(u4.a.a(((Integer) this.f9071a.a(x4.f11397p5)).intValue())).f(true).a();
        this.f9071a.q0().a(new c(this.f9071a), d6.b.TIMEOUT, ((long) ((Integer) this.f9071a.a(x4Var)).intValue()) + 250);
        a aVar = new a(aVarA, this.f9071a, d(), jElapsedRealtime);
        aVar.c(x4.f11341j0);
        aVar.b(x4.f11350k0);
        this.f9071a.q0().a(aVar);
    }

    class a extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f10996m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10, long j10) {
            super(aVar, kVar, z10);
            this.f10996m = j10;
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10996m;
            t5.this.a(jSONObject);
            this.f9071a.v0().d(d2.f8573h, t5.this.a(str, jElapsedRealtime, i10, jSONObject, null));
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to fetch basic SDK settings: server returned " + i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f10996m;
            t5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f9071a.v0().d(d2.f8575i, t5.this.a(str, jElapsedRealtime, i10, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j10, int i10, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, C4240b4.j.D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f10993g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j10));
        map.put("code", Integer.toString(i10));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f10994h) {
            bVar = this.f10995i;
            this.f10995i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
