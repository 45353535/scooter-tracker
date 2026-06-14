package com.fyber.inneractive.sdk.flow;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f20632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f20633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f20635d;

    public c0(h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        this.f20635d = h0Var;
        this.f20632a = yVar;
        this.f20633b = rVar;
        this.f20634c = str;
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.global.q qVar;
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        com.fyber.inneractive.sdk.config.global.q qVar2;
        IAlog.a("%s : InneractiveAdSpotImpl markup data available", h0.a(this.f20635d));
        if (this.f20635d.f20749m.get()) {
            h0 h0Var = this.f20635d;
            p pVar = h0Var.f20748l;
            h0Var.a(h0Var.f20741e);
            return;
        }
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f20632a.f20168a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f20633b;
            List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = IAConfigManager.O.f20320z;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : rVar.f20398b.values()) {
                if (hVar != null && (lVar = aVar.f20364a) != null && (qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar.f20392a.get(hVar.f20379b)) != null) {
                    hVar.f20394a = qVar2.f20394a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = IAConfigManager.O.f20320z;
            aVar2.f20365b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.h hVar2 : rVar.f20398b.values()) {
                for (AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    String identifier = experiment.getIdentifier();
                    String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.f20364a;
                    if (lVar2 != null && (qVar = (com.fyber.inneractive.sdk.config.global.q) lVar2.f20392a.get(hVar2.f20379b)) != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar.f20396c.get(identifier)) != null) {
                        Iterator it = bVar.f20368c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                                if (kVar.f20390b.equals(variant)) {
                                    break;
                                }
                            } else {
                                kVar = null;
                                break;
                            }
                        }
                        hVar2.f20380c.put(bVar.f20366a, bVar);
                        if (kVar != null) {
                            hVar2.f20381d.put(bVar.f20366a, kVar);
                        }
                    }
                }
            }
        }
    }

    public final void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
        i iVar;
        com.fyber.inneractive.sdk.network.t tVar;
        if (this.f20635d.f20749m.get()) {
            IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", h0.a(this.f20635d));
            h0 h0Var = this.f20635d;
            p pVar = h0Var.f20748l;
            h0Var.a(h0Var.f20741e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl data error", h0.a(this.f20635d));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.f20635d.getClass();
        if (exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a) {
            iVar = i.NATIVE_AD_PARSING_ERROR;
        } else {
            iVar = i.ADM_FETCH_FAILED;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, iVar);
        e0 e0Var = this.f20635d.f20740d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        p pVar2 = this.f20635d.f20748l;
        if (pVar2 != null) {
            IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            n nVar = pVar2.f20848b;
            if (nVar != null) {
                ((e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        h0 h0Var2 = this.f20635d;
        String str = this.f20634c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f20633b;
        h0Var2.getClass();
        int i10 = f0.f20732a[inneractiveErrorCode.ordinal()];
        if (i10 == 1 || i10 == 2) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        } else if (i10 != 3) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR;
        } else {
            tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        }
        if (eVar != null) {
            eVar.D = false;
        }
        String name = exc.getClass().getName();
        if (exc instanceof k1) {
            name = "NetworkStackException";
        }
        JSONArray jSONArrayB = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f21417b = tVar;
        wVar.f21416a = null;
        wVar.f21419d = jSONArrayB;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, PglCryptUtils.KEY_MESSAGE);
        InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f21421f.put(xVar.f21423a);
        wVar.a((String) null);
    }
}
