package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.network.f1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdmParametersOuterClass$AdmParameters f20168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20171d;

    public y(String str, String str2) {
        this.f20169b = str;
        this.f20171d = str2;
    }

    public final void a(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            AdmParametersOuterClass$AdmParameters from = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f20169b, 0));
            this.f20168a = from;
            if (from != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (Exception e10) {
            IAlog.f("failed to parse ad markup payload %s", e10.getMessage());
            com.fyber.inneractive.sdk.util.r.f23896b.post(new u(c0Var, e10));
        }
    }

    public final void b(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f20168a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f20168a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.f23896b.post(new x(c0Var));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f20168a;
            int iA = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : c.OTHER.a();
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(iA);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f20613a.f20614a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar2 != null ? eVar2.b() : null;
            if (bVarB != null) {
                bVarB.f23710a = bVarB.a();
                a(bVarB);
                eVar = bVarB.f23710a;
            } else {
                IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(iA));
            }
        } catch (Exception e10) {
            IAlog.a("failed parse adm network request with no input stream", e10, new Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        f1 f1Var = new f1(new v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.f21377d = new w(this);
        IAConfigManager.O.f20313s.a(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.response.b r29) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.adm.y.a(com.fyber.inneractive.sdk.response.b):void");
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f20170c;
    }
}
