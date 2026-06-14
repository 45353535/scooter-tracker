package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f20867a;

    public q(s sVar) {
        this.f20867a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        s sVar = this.f20867a;
        sVar.getClass();
        IAlog.a("%sweb view returned onReady!", IAlog.a(sVar));
        com.fyber.inneractive.sdk.response.e eVar = this.f20867a.f20753b;
        UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).f23736p : null;
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
            s sVar2 = this.f20867a;
            sVar2.getClass();
            try {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EVENT_READY_ON_CLIENT;
                InneractiveAdRequest inneractiveAdRequest = sVar2.f20752a;
                x xVar = sVar2.f20754c;
                new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, xVar != null ? ((q0) xVar).f21036b : null).a((String) null);
            } catch (Exception unused) {
            }
        }
        this.f20867a.g();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        s sVar = this.f20867a;
        sVar.getClass();
        com.fyber.inneractive.sdk.util.r.f23895a.execute(new e(new f(sVar.f20753b, sVar.f20752a, "send_failed_display_creatives", sVar.f20758g.b()), inneractiveInfrastructureError));
        s sVar2 = this.f20867a;
        sVar2.getClass();
        IAlog.a("%sweb view returned onFailedLoading!", IAlog.a(sVar2));
        this.f20867a.b(inneractiveInfrastructureError);
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_ERROR_UNSECURE_CONTENT;
            s sVar3 = this.f20867a;
            new com.fyber.inneractive.sdk.network.w(tVar, sVar3.f20752a, sVar3.f20753b).a((String) null);
        }
    }
}
