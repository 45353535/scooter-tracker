package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdRequest f20765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f20766b;

    public l(m mVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f20766b = mVar;
        this.f20765a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z10) {
            this.f20766b.c(this.f20765a);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(exc instanceof com.fyber.inneractive.sdk.network.b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR, i.NO_APP_CONFIG_AVAILABLE, exc);
        m mVar = this.f20766b;
        mVar.a(this.f20765a, mVar.c(), inneractiveInfrastructureError);
    }
}
