package com.appodeal.ads.adapters.dtexchange.unified;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListenerWithImpressionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedViewAdCallback f12202a;

    public d(UnifiedViewAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12202a = callback;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        this.f12202a.onAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f12202a.printError(String.valueOf(adDisplayError), null);
        this.f12202a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(String.valueOf(adDisplayError), null, 2, null));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public final void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public final void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public final void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        LoadingError loadingError = null;
        this.f12202a.printError(String.valueOf(inneractiveErrorCode), null);
        UnifiedViewAdCallback unifiedViewAdCallback = this.f12202a;
        if (inneractiveErrorCode != null) {
            switch (a.f12200a[inneractiveErrorCode.ordinal()]) {
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
        }
        unifiedViewAdCallback.onAdLoadFailed(loadingError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData
    public final void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        this.f12202a.onAdRevenueReceived(b.a(impressionData));
    }
}
