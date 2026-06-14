package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f9340g;

    public m6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        super("TaskReportAppLovinReward", kVar);
        this.f9340g = bVar;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, Reporting.Key.ZONE_ID, this.f9340g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f9340g.P());
        String clCode = this.f9340g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.o6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Reported reward successfully for ad: " + this.f9340g);
        }
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.o6
    protected o4 h() {
        return this.f9340g.i();
    }

    @Override // com.applovin.impl.o6
    protected void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "No reward result was found for ad: " + this.f9340g);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "Failed to report reward for ad: " + this.f9340g + " - error code: " + i10);
        }
        this.f9071a.g().a(d2.H, this.f9340g);
    }
}
