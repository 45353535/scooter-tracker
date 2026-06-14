package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.purchase.ADJPConstants;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.same.net.wrapper.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.out.MBConfiguration;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import net.pubnative.lite.sdk.models.AdExperience;

/* JADX INFO: loaded from: classes10.dex */
public class b extends c {
    public b(Context context) {
        super(context);
    }

    private void a(e eVar) {
        eVar.a("platform", "1");
        eVar.a(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a(CommonUrlParts.APP_VERSION, m0.B(this.mContext));
        eVar.a("app_version_code", m0.A(this.mContext) + "");
        eVar.a("orientation", m0.F(this.mContext) + "");
        eVar.a("model", m0.n());
        eVar.a(AdExperience.BRAND, m0.s());
        eVar.a(N6.V0, "");
        eVar.a("gaid2", g.c());
        int iS = m0.s(this.mContext);
        eVar.a("network_type", iS + "");
        eVar.a("network_str", m0.a(this.mContext, iS) + "");
        eVar.a("language", m0.p(this.mContext));
        eVar.a("timezone", m0.w());
        eVar.a("useragent", m0.i());
        eVar.a(ADJPConstants.KEY_SDK_VERSION, MBConfiguration.SDK_VERSION);
        f.a(eVar, this.mContext);
        f.b(eVar);
        f.j(eVar);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        a(eVar);
    }
}
