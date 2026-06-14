package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y2 extends k3 implements MaxAd {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f11506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f11507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a3 f11508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f11509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f11510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MaxAdWaterfallInfo f11511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f11512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f11513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f11514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f11515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f11516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f11517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f11518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f11519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f11520y;

    protected y2(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.f11506k = new AtomicBoolean();
        this.f11507l = new AtomicBoolean();
        this.f11508m = a3Var;
        this.f11509n = hVar;
        this.f11510o = hVar != null ? hVar.b() : null;
    }

    private long J() {
        return a("load_started_time_ms", 0L);
    }

    public static y2 a(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new b3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new d3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (fromString.isFullscreenAd()) {
            return new c3(a3Var, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(h5 h5Var) {
        JSONObject jSONObjectA;
        if (h5Var.a("credentials")) {
            jSONObjectA = h5Var.a("credentials", new JSONObject());
        } else {
            jSONObjectA = h5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, Reporting.Key.PLACEMENT_ID, R());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(h5 h5Var) {
        return Double.valueOf(JsonUtils.getDouble(h5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public com.applovin.impl.mediation.h A() {
        return this.f11509n;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public Bundle E() {
        JSONObject jSONObjectA;
        h5 h5Var = this.f9171h;
        if (h5Var != null) {
            return (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.ng
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f9922a.c((h5) obj);
                }
            });
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, Reporting.Key.PLACEMENT_ID, R());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long F() {
        return this.f11518w;
    }

    public long G() {
        if (J() > 0) {
            return I() - J();
        }
        return -1L;
    }

    public long H() {
        return this.f11516u;
    }

    public long I() {
        return a("load_completed_time_ms", 0L);
    }

    public String K() {
        return this.f11519x;
    }

    public int L() {
        return a("mspc", ((Integer) this.f9164a.a(r3.f10314g8)).intValue());
    }

    public JSONObject M() {
        h5 h5Var = this.f9171h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.mg
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.d((h5) obj);
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public a3 N() {
        return this.f11508m;
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public JSONObject P() {
        h5 h5Var = this.f9171h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.kg
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.f((h5) obj);
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", "");
    }

    public String R() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public long S() {
        return this.f11517v;
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public boolean W() {
        return StringUtils.isValidString(D());
    }

    public boolean X() {
        com.applovin.impl.mediation.h hVar = this.f11509n;
        return hVar != null && hVar.k() && this.f11509n.j();
    }

    public boolean Y() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public abstract y2 a(com.applovin.impl.mediation.h hVar);

    public void a0() {
        this.f11518w = SystemClock.elapsedRealtime() - this.f11514s;
    }

    public void b0() {
        this.f11513r = SystemClock.elapsedRealtime();
        this.f11515t = this.f9164a.m0().getTotalBackgroundDurationMillis();
    }

    public void c0() {
        long totalBackgroundDurationMillis = this.f9164a.m0().getTotalBackgroundDurationMillis() - this.f11515t;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11513r;
        this.f11517v = jElapsedRealtime;
        this.f11516u = jElapsedRealtime - totalBackgroundDurationMillis;
    }

    public void d0() {
        this.f11514s = SystemClock.elapsedRealtime();
    }

    public void e0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void f0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean g0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f11520y;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f11509n;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(R());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f11512q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f9164a.a(r3.f10319l8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            h5 h5Var = this.f9171h;
            return h5Var != null ? ((Double) h5Var.a(new Function() { // from class: com.applovin.impl.pg
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return y2.e((h5) obj);
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f9164a.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return 0.0d;
        }
        this.f9164a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        h5 h5Var = this.f9171h;
        return h5Var != null ? (String) h5Var.a(new Function() { // from class: com.applovin.impl.og
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.g((h5) obj);
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f11511p;
    }

    public void h(String str) {
        this.f11520y = str;
    }

    public Boolean h0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public void i(String str) {
        this.f11519x = str;
    }

    public Boolean i0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + R() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public String z() {
        return this.f11510o;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectX = x();
        if (jSONObjectX.has(str)) {
            return JsonUtils.getString(jSONObjectX, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectM = M();
        return jSONObjectM.has(str) ? JsonUtils.getString(jSONObjectM, str, str2) : a(str, str2);
    }

    public void t() {
        this.f11509n = null;
        this.f11511p = null;
    }

    public AtomicBoolean u() {
        return this.f11506k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f11507l;
    }

    public JSONObject x() {
        h5 h5Var = this.f9171h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.lg
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return y2.b((h5) obj);
            }
        }) : a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (!X() || (hVar = this.f11509n) == null) {
            return null;
        }
        return hVar.d();
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f11511p = maxAdWaterfallInfo;
    }

    public void a(long j10) {
        this.f11512q = j10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectM = M();
        JsonUtils.putAll(jSONObjectM, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectM);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
