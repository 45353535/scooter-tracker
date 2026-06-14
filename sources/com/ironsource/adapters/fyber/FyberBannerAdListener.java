package com.ironsource.adapters.fyber;

import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FyberBannerAdListener implements InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListenerWithImpressionData {
    private WeakReference<FyberAdapter> mAdapter;
    private BannerSmashListener mListener;
    private String mSpotId;

    FyberBannerAdListener(FyberAdapter fyberAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mAdapter = new WeakReference<>(fyberAdapter);
        this.mListener = bannerSmashListener;
        this.mSpotId = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdScreenDismissed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLeftApplication();
        }
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
            ironSourceError = ErrorBuilder.buildLoadFailedError("Banner failed to load (inneractiveErrorCode is null)");
        } else {
            ironLog.verbose("inneractiveErrorCode = " + inneractiveErrorCode);
            ironSourceError = inneractiveErrorCode == InneractiveErrorCode.NO_FILL ? new IronSourceError(606, inneractiveErrorCode.toString()) : ErrorBuilder.buildLoadFailedError(inneractiveErrorCode.toString());
        }
        this.mListener.onBannerAdLoadFailed(ironSourceError);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FyberAdapter> weakReference = this.mAdapter;
        if (weakReference == null || weakReference.get() == null) {
            IronLog.INTERNAL.verbose("adapter is null");
            return;
        }
        if (!inneractiveAdSpot.isReady()) {
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(this.mAdapter.get().getProviderName() + " banner failed to load, Spot not ready - " + this.mSpotId));
            return;
        }
        ISBannerSize iSBannerSize = this.mAdapter.get().mSpotIdToBannerSize.get(this.mSpotId);
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner size is null"));
            return;
        }
        FrameLayout.LayoutParams layoutParamsCalculateLayoutParams = this.mAdapter.get().calculateLayoutParams(iSBannerSize);
        if (layoutParamsCalculateLayoutParams != null) {
            FrameLayout frameLayout = new FrameLayout(ContextProvider.getInstance().getApplicationContext());
            this.mAdapter.get().mInneractiveAdViewUnitController.bindView(frameLayout);
            this.mListener.onBannerAdLoaded(frameLayout, layoutParamsCalculateLayoutParams);
        } else {
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("Fyber - size = " + iSBannerSize));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
        String creativeId = impressionData.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("spotId = " + this.mSpotId + " creativeId = " + creativeId);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            if (creativeId.isEmpty()) {
                this.mListener.onBannerAdShown();
                return;
            }
            HashMap map = new HashMap();
            map.put("creativeId", creativeId);
            this.mListener.onBannerAdShown(map);
        }
    }
}
