package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class u6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f11072g;

    public u6(c3 c3Var, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateMaxReward", kVar);
        this.f11072g = c3Var;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f11072g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f11072g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f11072g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f11072g.getFormat().getLabel());
        String strS0 = this.f11072g.s0();
        if (!StringUtils.isValidString(strS0)) {
            strS0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strS0);
        String strB = this.f11072g.B();
        if (!StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strB);
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.v6
    protected boolean h() {
        return this.f11072g.w0();
    }

    @Override // com.applovin.impl.v6
    protected void a(o4 o4Var) {
        this.f11072g.a(o4Var);
    }

    @Override // com.applovin.impl.q6
    protected void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f11072g.a(o4.a(str));
        this.f9071a.P().a(d2.f8602v0, this.f11072g, CollectionUtils.hashMap("error_message", str));
    }
}
