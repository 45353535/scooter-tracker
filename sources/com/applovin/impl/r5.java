package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final u f10351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10352h;

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f10351g = uVar;
        this.f10352h = kVar.b();
    }

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f10351g.e());
        if (this.f10351g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f10351g.f().getLabel());
        }
        if (this.f10351g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f10351g.g().getLabel());
        }
        return map;
    }

    protected abstract i5 a(JSONObject jSONObject);

    protected void a(int i10, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Unable to fetch " + this.f10351g + " ad: server returned " + i10);
        }
        this.f9071a.g().a(d2.f8609z, this.f10351g, new AppLovinError(i10, str));
    }

    protected void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f9071a);
        r0.b(jSONObject, this.f9071a);
        r0.a(jSONObject, this.f9071a);
        u.a(jSONObject);
        this.f9071a.q0().a(a(jSONObject));
    }

    protected abstract String e();

    protected abstract String f();

    protected Map h() {
        HashMap map = new HashMap(4);
        map.put(Reporting.Key.ZONE_ID, this.f10351g.e());
        if (this.f10351g.f() != null) {
            map.put("size", this.f10351g.f().getLabel());
        }
        if (this.f10351g.g() != null) {
            map.put("require", this.f10351g.g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        u4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Fetching next ad of zone: " + this.f10351g);
        }
        if (((Boolean) this.f9071a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "User is connected to a VPN");
        }
        n7.a(this.f9071a, this.f9072b);
        this.f9071a.g().a(d2.f8605x, this.f10351g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f9071a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f9071a.a(x4.f11326h3)).booleanValue()) {
                aVarA = u4.a.a(((Integer) this.f9071a.a(x4.f11421s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f9071a.A().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f9071a.a(x4.D5)).booleanValue() && !((Boolean) this.f9071a.a(x4.f11477z5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f9071a.a(x4.f11355k5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f9071a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                u4.a aVarA2 = u4.a.a(((Integer) this.f9071a.a(x4.f11429t5)).intValue());
                Map mapA = n7.a(this.f9071a.A().a(h(), false, false));
                if (!((Boolean) this.f9071a.a(x4.M6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (n7.h(a()) || n7.j(a())) {
                map.putAll(this.f9071a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f10352h)) {
                map.put("sts", this.f10352h);
            }
            a.C0183a c0183aF = com.applovin.impl.sdk.network.a.a(this.f9071a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f9071a.a(x4.W2)).intValue()).c(((Boolean) this.f9071a.a(x4.X2)).booleanValue()).d(((Boolean) this.f9071a.a(x4.Y2)).booleanValue()).c(((Integer) this.f9071a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0183aF.a(andResetCustomPostBody);
                c0183aF.b(((Boolean) this.f9071a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0183aF.a(), this.f9071a);
            aVar.c(x4.f11359l0);
            aVar.b(x4.f11368m0);
            this.f9071a.q0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Unable to fetch ad for zone id: " + this.f10351g, th2);
            }
            a(0, th2.getMessage());
        }
    }

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f9267l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f9267l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.f10351g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f9267l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f9267l.b()), map);
                this.f9071a.g().d(d2.f8607y, map);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r5.this.a(i10, str2);
            this.f9071a.D().a("fetchAd", str, i10, str2);
        }
    }
}
