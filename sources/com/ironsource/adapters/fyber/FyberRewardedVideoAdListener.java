package com.ironsource.adapters.fyber;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FyberRewardedVideoAdListener implements InneractiveAdSpot.RequestListener, InneractiveFullScreenAdRewardedListener, InneractiveFullscreenAdEventsListenerWithImpressionData, VideoContentListener {
    private RewardedVideoSmashListener mListener;
    private String mSpotId;

    FyberRewardedVideoAdListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mListener = rewardedVideoSmashListener;
        this.mSpotId = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
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
            str = "Rewarded Video show failed (adDisplayError is null)";
        } else {
            String message = adDisplayError.getMessage();
            ironLog.verbose("error = " + message);
            str = message;
        }
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        if (inneractiveErrorCode != null) {
            ironLog.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
            this.mListener.onRewardedVideoLoadFailed(inneractiveErrorCode == InneractiveErrorCode.NO_FILL ? new IronSourceError(1058, inneractiveErrorCode.toString()) : ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString()));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i10, int i11) {
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
            this.mListener.onRewardedVideoAdOpened();
            this.mListener.onRewardedVideoAdStarted();
        } else {
            HashMap map = new HashMap();
            map.put("creativeId", creativeId);
            this.mListener.onRewardedVideoAdOpened(map);
            this.mListener.onRewardedVideoAdStarted(map);
        }
    }
}
