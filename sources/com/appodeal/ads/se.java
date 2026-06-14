package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class se extends l0 {
    public se(we weVar) {
        super(AdType.Rewarded, weVar);
    }

    @Override // com.appodeal.ads.l0
    public final String D() {
        return "rewarded_video_disabled";
    }

    @Override // com.appodeal.ads.l0
    public final void E() {
        ce ceVar;
        if (this.f13570j && this.f13572l && (ceVar = (ce) A()) != null) {
            te teVar = this.f13582v;
            if ((teVar == null || teVar != ceVar) && ceVar.h() && !ceVar.F) {
                t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
        }
    }

    @Override // com.appodeal.ads.l0
    public final uc a(te teVar, AdNetwork adNetwork, x2 x2Var) {
        return new vd((ce) teVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.l0
    public final te b(xe xeVar) {
        return new ce((ge) xeVar);
    }

    @Override // com.appodeal.ads.l0
    public final void f(Context context) {
        g(context, new ge());
    }

    @Override // com.appodeal.ads.l0
    public final void n(JSONObject jSONObject) {
        if (jSONObject.has("max_duration")) {
            af.f12644b = jSONObject.optInt("max_duration", 0);
        }
    }
}
