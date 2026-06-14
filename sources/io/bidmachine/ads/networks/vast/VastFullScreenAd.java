package io.bidmachine.ads.networks.vast;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c9.g;
import c9.n;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.iab.vast.activity.VastView;
import m9.d;
import od.h;
import od.i;
import od.j;
import od.k;

/* JADX INFO: loaded from: classes12.dex */
class VastFullScreenAd extends h {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private m9.a postBannerAdMeasurer;

    @Nullable
    private VastFullScreenAdLoadListener vastAdLoadListener;

    @Nullable
    private VastFullScreenAdShowListener vastAdShowListener;

    @Nullable
    private d vastOMSDKAdMeasurer;

    @Nullable
    private g vastRequest;

    @Nullable
    private VastView vastView;

    @NonNull
    private final n videoType;

    VastFullScreenAd(@NonNull n nVar) {
        this.videoType = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyVastView() {
        VastView vastView = this.vastView;
        if (vastView != null) {
            vastView.e0();
            this.vastView = null;
        }
    }

    @Override // od.b
    public void onDestroy() {
        this.vastAdLoadListener = null;
        this.vastAdShowListener = null;
        d dVar = this.vastOMSDKAdMeasurer;
        if (dVar != null) {
            dVar.j();
            this.vastOMSDKAdMeasurer = null;
        }
        m9.a aVar = this.postBannerAdMeasurer;
        if (aVar != null) {
            aVar.destroy(new Runnable() { // from class: io.bidmachine.ads.networks.vast.VastFullScreenAd.1
                @Override // java.lang.Runnable
                public void run() {
                    VastFullScreenAd.this.destroyVastView();
                }
            });
            this.postBannerAdMeasurer = null;
        } else {
            destroyVastView();
        }
        if (this.vastRequest != null) {
            this.vastRequest = null;
        }
    }

    @Override // od.h
    public void show(@NonNull ContextProvider contextProvider, @NonNull i iVar, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        g gVar = this.vastRequest;
        if (gVar == null || !gVar.u()) {
            iVar.onAdShowFailed(ae.a.i("VAST fullscreen object is null or can not find video file"));
        } else {
            this.vastAdShowListener = new VastFullScreenAdShowListener(iVar, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
            this.vastRequest.x(contextProvider.getContext(), this.videoType, this.vastAdShowListener, this.vastView, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
        }
    }

    @Override // od.b
    public void load(@NonNull ContextProvider contextProvider, @NonNull i iVar, @NonNull j jVar, @NonNull k kVar, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        VastParams vastParams = new VastParams(kVar);
        if (vastParams.isValid(iVar)) {
            if (vastParams.omsdkEnabled) {
                this.vastOMSDKAdMeasurer = new d();
                this.postBannerAdMeasurer = new m9.a();
            }
            Context applicationContext = contextProvider.getApplicationContext();
            this.vastAdLoadListener = new VastFullScreenAdLoadListener(iVar);
            this.vastView = new VastView(applicationContext);
            g gVarA = g.V().d(vastParams.cacheControl).f(vastParams.placeholderTimeoutSec).g(vastParams.skipOffset).e(vastParams.companionSkipOffset).b(vastParams.useNativeClose).c(this.vastOMSDKAdMeasurer).a();
            this.vastRequest = gVarA;
            gVarA.T(applicationContext, vastParams.creativeAdm, this.vastAdLoadListener);
        }
    }
}
