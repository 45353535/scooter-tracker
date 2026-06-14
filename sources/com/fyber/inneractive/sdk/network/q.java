package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f21357a;

    public q(s sVar) {
        this.f21357a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (exc == null) {
            s sVar = this.f21357a;
            sVar.a(sVar.f21368e, eVar);
            return;
        }
        this.f21357a.getClass();
        InneractiveErrorCode inneractiveErrorCode = exc instanceof k1 ? ((k1) exc).f21327a == 204 ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.SERVER_INTERNAL_ERROR : (!(exc instanceof FileNotFoundException) && (exc instanceof n0)) ? InneractiveErrorCode.SERVER_INVALID_RESPONSE : InneractiveErrorCode.CONNECTION_ERROR;
        s sVar2 = this.f21357a;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR, exc);
        InneractiveAdRequest inneractiveAdRequest = sVar2.f21368e;
        if (sVar2.f21343a == null) {
            return;
        }
        if (sVar2.f21344b) {
            IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
        } else {
            if (sVar2.f21344b || (oVar = sVar2.f21343a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }
}
