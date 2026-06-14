package com.appodeal.ads.adapters.dtexchange.unified;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InneractiveAdSpot.RequestListener, InneractiveFullScreenAdRewardedListener, InneractiveFullscreenAdEventsListenerWithImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12201a;

    public c(UnifiedFullscreenAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12201a = callback;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        this.f12201a.onAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public final void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        this.f12201a.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f12201a.printError(String.valueOf(adDisplayError), null);
        this.f12201a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(String.valueOf(adDisplayError), null, 2, null));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        this.f12201a.onAdRevenueReceived(b.a(impressionData));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public final void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        this.f12201a.onAdFinished();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        LoadingError loadingError;
        this.f12201a.printError(inneractiveErrorCode != null ? inneractiveErrorCode.name() : null, inneractiveErrorCode);
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.f12201a;
        switch (inneractiveErrorCode == null ? -1 : a.f12200a[inneractiveErrorCode.ordinal()]) {
            case 1:
                loadingError = LoadingError.ConnectionError;
                break;
            case 2:
            case 3:
            case 4:
                loadingError = LoadingError.TimeoutError;
                break;
            case 5:
            case 6:
            case 7:
                loadingError = LoadingError.IncorrectAdunit;
                break;
            case 8:
                loadingError = LoadingError.IncorrectCreative;
                break;
            case 9:
                loadingError = LoadingError.NoFill;
                break;
            case 10:
                loadingError = LoadingError.Canceled;
                break;
            case 11:
                loadingError = LoadingError.AdTypeNotSupportedInAdapter;
                break;
            default:
                loadingError = LoadingError.InternalError;
                break;
        }
        unifiedFullscreenAdCallback.onAdLoadFailed(loadingError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        this.f12201a.onAdLoaded();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        this.f12201a.onAdShown();
    }
}
