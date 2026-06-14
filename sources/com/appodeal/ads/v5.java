package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v5 extends l0 {
    public v5(z5 z5Var) {
        super(AdType.Interstitial, z5Var);
        this.f13583w = 1.1f;
        this.f13584x = 1.4f;
    }

    @Override // com.appodeal.ads.l0
    public final String D() {
        return "interstitials_disabled";
    }

    @Override // com.appodeal.ads.l0
    public final void E() {
        q7 q7Var;
        if (this.f13570j && this.f13572l && (q7Var = (q7) A()) != null) {
            te teVar = this.f13582v;
            if ((teVar == null || teVar != q7Var) && q7Var.h() && !q7Var.F) {
                t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
        }
    }

    @Override // com.appodeal.ads.l0
    public final uc a(te teVar, AdNetwork adNetwork, x2 x2Var) {
        return new l7((q7) teVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.l0
    public final te b(xe xeVar) {
        return new q7((d6) xeVar);
    }

    @Override // com.appodeal.ads.l0
    public final void f(Context context) {
        g(context, new d6());
    }

    @Override // com.appodeal.ads.l0
    public final void n(JSONObject jSONObject) {
    }
}
