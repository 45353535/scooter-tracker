package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class t6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f10999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f11000h;

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f10999g = bVar;
        this.f11000h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, Reporting.Key.ZONE_ID, this.f10999g.getAdZone().e());
        String clCode = this.f10999g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.v6
    protected boolean h() {
        return this.f10999g.K0();
    }

    @Override // com.applovin.impl.v6
    protected void a(o4 o4Var) {
        this.f10999g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f11000h.userRewardVerified(this.f10999g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f11000h.userOverQuota(this.f10999g, mapA);
        } else if (strB.equals("rejected")) {
            this.f11000h.userRewardRejected(this.f10999g, mapA);
        } else {
            this.f11000h.validationRequestFailed(this.f10999g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f11000h.userRewardRejected(this.f10999g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f11000h.validationRequestFailed(this.f10999g, i10);
            str = "network_timeout";
        }
        this.f10999g.a(o4.a(str));
    }
}
