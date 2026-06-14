package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.flow.e0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f20163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e f20164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f20165c;

    public v(y yVar, c0 c0Var, com.fyber.inneractive.sdk.response.e eVar) {
        this.f20165c = yVar;
        this.f20163a = c0Var;
        this.f20164b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (eVar == null || exc != null) {
            String message = exc != null ? exc.getMessage() : "empty";
            com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f21138d.b(this.f20165c.f20171d);
            iVarB.f21152a.put(new com.fyber.inneractive.sdk.metrics.h(message), Long.valueOf(System.currentTimeMillis() - iVarB.f21154c));
            if (this.f20163a != null) {
                Exception exc2 = exc != null ? exc : new Exception("adm markup network result is empty");
                c0 c0Var = this.f20163a;
                this.f20165c.getClass();
                c0Var.a(exc2, (exc == null || !(exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a)) ? ((exc instanceof k1) && ((k1) exc).f21327a == 404) ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, this.f20164b);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f21138d;
        com.fyber.inneractive.sdk.metrics.i iVarB2 = dVar.b(this.f20165c.f20171d);
        iVarB2.f21152a.put(new com.fyber.inneractive.sdk.metrics.h("success"), Long.valueOf(System.currentTimeMillis() - iVarB2.f21154c));
        c0 c0Var2 = this.f20163a;
        if (c0Var2 != null) {
            IAlog.a("%s : InneractiveAdSpotImpl data available", h0.a(c0Var2.f20635d));
            h0 h0Var = c0Var2.f20635d;
            com.fyber.inneractive.sdk.config.global.r rVar = c0Var2.f20633b;
            e0 e0Var = h0Var.f20740d;
            if (h0Var.f20749m.get()) {
                IAlog.a("%s: loadAdWithRetries: spot is already destroyed won't continue", IAlog.a(h0Var));
                h0Var.a(h0Var.f20741e);
                return;
            }
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.f20748l;
            if (pVar != null) {
                pVar.f20848b = e0Var;
                dVar.b(h0Var.f20737a).f21155d = System.currentTimeMillis();
                pVar.f20854g = eVar;
                if (!IAConfigManager.e()) {
                    IAConfigManager.addListener(pVar);
                    IAConfigManager.a();
                } else {
                    pVar.f20849c = rVar;
                    com.fyber.inneractive.sdk.network.p pVar2 = new com.fyber.inneractive.sdk.network.p(rVar, eVar, h0Var.f20737a, pVar);
                    pVar.f20850d = pVar2;
                    pVar2.c();
                }
            }
        }
    }
}
