package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f20847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f20848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f20849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.m f20850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20852f = false;

    public o(String str) {
        this.f20851e = str;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f20847a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.f20754c;
        return xVar != null ? xVar.b() : kVar.f20753b;
    }

    public String d() {
        return IAlog.a(this);
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f23840a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f20848b != null) {
            if (eVar != null && eVar.f23729i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f23729i + ": " + eVar.f23730j));
            }
            ((e0) this.f20848b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f20847a;
        if (cVar != null) {
            n nVar = this.f20848b;
            if (nVar == null || (xVar = ((k) cVar).f20754c) == null) {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            } else {
                e0 e0Var = (e0) nVar;
                if (e0Var.f20643a.f20749m.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.f20643a));
                    h0 h0Var = e0Var.f20643a;
                    p pVar = h0Var.f20748l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.f20643a;
                    if (!h0Var2.f20746j && (s0Var = h0Var2.f20742f) != null && s0Var.supportsRefresh()) {
                        if (e0Var.f20643a.f20742f.canRefreshAd()) {
                            h0 h0Var3 = e0Var.f20643a;
                            h0Var3.f20741e = xVar;
                            xVar.f21035a = inneractiveAdRequest;
                            g0 g0Var = h0Var3.f20745i;
                            if (g0Var != null) {
                                g0Var.onAdRefreshed(h0Var3);
                            } else {
                                s0 s0Var2 = h0Var3.f20742f;
                                if (s0Var2 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                }
                            }
                        } else {
                            IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.f20643a));
                            h0 h0Var4 = e0Var.f20643a;
                            h0Var4.f20745i.onAdRefreshFailed(h0Var4, InneractiveErrorCode.CANCELLED);
                        }
                    } else {
                        h0 h0Var5 = e0Var.f20643a;
                        h0Var5.f20741e = xVar;
                        xVar.f21035a = inneractiveAdRequest;
                        for (s0 s0Var3 : h0Var5.f20743g) {
                            if (s0Var3.supports(h0Var5)) {
                                h0Var5.f20742f = s0Var3;
                                h0 h0Var6 = e0Var.f20643a;
                                InneractiveAdSpot.RequestListener requestListener = h0Var6.f20738b;
                                if (requestListener != null) {
                                    if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                        InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                        s0 s0Var4 = h0Var6.f20742f;
                                        if ((xVar instanceof w0) && (s0Var4 instanceof NativeAdUnitController)) {
                                            w0 w0Var = (w0) xVar;
                                            w0Var.f21032v = (NativeAdUnitController) s0Var4;
                                            nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                        } else {
                                            IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var6));
                                            nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                        }
                                    } else {
                                        requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                    }
                                }
                                e0Var.f20643a.f20746j = false;
                            }
                        }
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.f20643a), e0Var.f20643a.f20741e.f21038d);
                        m mVar = e0Var.f20643a.f20744h;
                        com.fyber.inneractive.sdk.response.e eVarC = mVar != null ? mVar.c() : null;
                        e0Var.a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.f20643a.f20741e.f21038d)));
                        h0 h0Var7 = e0Var.f20643a;
                        h0Var7.f20741e = null;
                        h0Var7.f20746j = false;
                    }
                    String str = e0Var.f20643a.f20737a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f21138d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.f20643a;
                    x xVar2 = h0Var8.f20741e;
                    if (xVar2 != null && (eVar = xVar2.f21036b) != null && eVar.f23736p != null) {
                        x xVar3 = h0Var8.f20741e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.f21036b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.f20739c, h0Var8.f20737a, eVar2.f23736p, xVar3.f21037c.b()).a();
                    }
                }
            }
            this.f20847a = null;
        }
        b(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f20847a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).f20754c) == null) ? null : xVar.f21035a;
        com.fyber.inneractive.sdk.response.e eVarC = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.f20848b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, eVarC, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, eVarC);
        }
    }

    public void a(boolean z10) {
        this.f20852f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f20847a;
        if (cVar == null || !z10) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.f20847a).f20754c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.f20847a = null;
    }
}
