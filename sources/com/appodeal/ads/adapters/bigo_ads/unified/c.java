package com.appodeal.ads.adapters.bigo_ads.unified;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bigo_ads.BigoAdsNetwork;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c implements AdInteractionListener, AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedViewAdCallback f12180a;

    public c(UnifiedViewAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12180a = callback;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f12180a.onAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError showError) {
        Intrinsics.checkNotNullParameter(showError, "showError");
        this.f12180a.printError(showError.getMessage(), Integer.valueOf(showError.getCode()));
        this.f12180a.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12180a.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        this.f12180a.onAdLoadFailed(BigoAdsNetwork.INSTANCE.mapError(adError));
    }
}
