package com.ironsource.adapters.fyber;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FyberInterstitialAdListener implements InneractiveFullscreenAdEventsListenerWithImpressionData, InneractiveAdSpot.RequestListener {
    private InterstitialSmashListener mListener;
    private String mSpotId;

    FyberInterstitialAdListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mListener = interstitialSmashListener;
        this.mSpotId = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        String str;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.mSpotId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adDisplayError == null) {
            str = "Interstitial show failed (adDisplayError is null)";
        } else {
            String message = adDisplayError.getMessage();
            ironLog.verbose("error = " + message);
            str = message;
        }
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.mSpotId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (inneractiveErrorCode == null) {
            ironSourceError = ErrorBuilder.buildLoadFailedError("Interstitial failed to load (inneractiveErrorCode is null)");
        } else {
            ironLog.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
            ironSourceError = inneractiveErrorCode == InneractiveErrorCode.NO_FILL ? new IronSourceError(1158, inneractiveErrorCode.toString()) : ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString());
        }
        this.mListener.onInterstitialAdLoadFailed(ironSourceError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdReady();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        String creativeId = impressionData.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId + " creativeId = " + creativeId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (creativeId.isEmpty()) {
            this.mListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
        } else {
            HashMap map = new HashMap();
            map.put("creativeId", creativeId);
            this.mListener.onInterstitialAdOpened(map);
            this.mListener.onInterstitialAdShowSucceeded(map);
        }
    }
}
