package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f20643a;

    public e0(h0 h0Var) {
        this.f20643a = h0Var;
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f20643a.f20749m.get()) {
            IAlog.a("%s : onAdRequestFailed: spot is already destroyed", h0.a(this.f20643a));
            h0 h0Var = this.f20643a;
            p pVar = h0Var.f20748l;
            h0Var.a(h0Var.f20741e);
            return;
        }
        if (this.f20643a.f20738b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f20643a.a(inneractiveAdRequest, eVar);
            }
            h0 h0Var2 = this.f20643a;
            if (!h0Var2.f20746j) {
                g0 g0Var = h0Var2.f20745i;
                if (g0Var != null) {
                    g0Var.onAdRefreshFailed(h0Var2, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            m mVar = h0Var2.f20744h;
            p pVar2 = h0Var2.f20748l;
            JSONArray jSONArrayB = null;
            com.fyber.inneractive.sdk.config.global.r rVar2 = pVar2 != null ? pVar2.f20849c : null;
            if (mVar != null && (rVar = mVar.f20849c) != null) {
                jSONArrayB = rVar.b();
            } else if (rVar2 != null) {
                jSONArrayB = rVar2.b();
            }
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, h0Var2.f20741e, eVar, jSONArrayB);
            h0 h0Var3 = this.f20643a;
            InneractiveAdSpot.RequestListener requestListener = h0Var3.f20738b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(h0Var3, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
