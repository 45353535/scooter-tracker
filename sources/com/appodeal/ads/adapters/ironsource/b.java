package com.appodeal.ads.adapters.ironsource;

import com.appodeal.ads.AdNetworkInitializationListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements InitListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdNetworkInitializationListener f12366a;

    public b(AdNetworkInitializationListener adNetworkInitializationListener) {
        this.f12366a = adNetworkInitializationListener;
    }

    @Override // com.unity3d.ironsourceads.InitListener
    public final void onInitFailed(IronSourceError ironSourceError) {
        IronSourceNetwork.isInitialized.set(false);
        this.f12366a.onInitializationFailed(IronSourceNetwork.mapError(ironSourceError.getErrorCode()));
    }

    @Override // com.unity3d.ironsourceads.InitListener
    public final void onInitSuccess() {
        IronSourceNetwork.isInitialized.set(true);
        this.f12366a.onInitializationFinished();
    }
}
