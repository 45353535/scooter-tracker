package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f9889g;

    public n6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskReportMaxReward", kVar);
        this.f9889g = c3Var;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9889g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9889g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9889g.e());
        String strS0 = this.f9889g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f9889g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.o6
    protected void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Reported reward successfully for mediated ad: " + this.f9889g);
        }
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.o6
    protected o4 h() {
        return this.f9889g.o0();
    }

    @Override // com.applovin.impl.o6
    protected void i() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.b(this.f9072b, "No reward result was found for mediated ad: " + this.f9889g);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Failed to report reward for mediated ad: " + this.f9889g + " - error code: " + i10);
        }
        this.f9071a.P().a(d2.f8600u0, this.f9889g);
    }
}
