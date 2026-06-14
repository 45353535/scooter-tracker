package com.applovin.mediation.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.pubmatic.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.openwrap.banner.POBBannerView;
import com.pubmatic.sdk.openwrap.core.POBReward;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.pubmatic.sdk.openwrap.core.signal.POBSignalConfig;
import com.pubmatic.sdk.openwrap.core.signal.POBSignalGenerator;
import com.pubmatic.sdk.openwrap.interstitial.POBInterstitial;
import com.pubmatic.sdk.rewardedad.POBRewardedAd;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class PubMaticMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private POBBannerView adView;
    private POBInterstitial interstitialAd;
    private POBRewardedAd rewardedAd;

    private class AdViewListener extends POBBannerView.POBBannerViewListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerView.POBBannerViewListener
        public void onAdClicked(@NonNull POBBannerView pOBBannerView) {
            PubMaticMediationAdapter.this.log("Ad view clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerView.POBBannerViewListener
        public void onAdFailed(@NonNull POBBannerView pOBBannerView, @NonNull POBError pOBError) {
            MaxAdapterError maxError = PubMaticMediationAdapter.toMaxError(pOBError);
            PubMaticMediationAdapter.this.log("Ad view failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerView.POBBannerViewListener
        public void onAdImpression(@NonNull POBBannerView pOBBannerView) {
            PubMaticMediationAdapter.this.log("Ad view impression");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.pubmatic.sdk.openwrap.banner.POBBannerView.POBBannerViewListener
        public void onAdReceived(@NonNull POBBannerView pOBBannerView) {
            PubMaticMediationAdapter.this.log("Ad view received");
            this.listener.onAdViewAdLoaded(pOBBannerView);
        }
    }

    private class InterstitialListener extends POBInterstitial.POBInterstitialListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdClicked(@NonNull POBInterstitial pOBInterstitial) {
            PubMaticMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdClosed(@NonNull POBInterstitial pOBInterstitial) {
            PubMaticMediationAdapter.this.log("Interstitial closed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdFailedToLoad(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
            MaxAdapterError maxError = PubMaticMediationAdapter.toMaxError(pOBError);
            PubMaticMediationAdapter.this.log("Interstitial failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdFailedToShow(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, pOBError.getErrorCode(), pOBError.getErrorMessage());
            PubMaticMediationAdapter.this.log("Interstitial failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdImpression(@NonNull POBInterstitial pOBInterstitial) {
            PubMaticMediationAdapter.this.log("Interstitial impression");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitial.POBInterstitialListener
        public void onAdReceived(@NonNull POBInterstitial pOBInterstitial) {
            PubMaticMediationAdapter.this.log("Interstitial received");
            this.listener.onInterstitialAdLoaded();
        }
    }

    private class RewardedListener extends POBRewardedAd.POBRewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdClicked(@NonNull POBRewardedAd pOBRewardedAd) {
            PubMaticMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdClosed(@NonNull POBRewardedAd pOBRewardedAd) {
            if (this.hasGrantedReward || PubMaticMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = PubMaticMediationAdapter.this.getReward();
                PubMaticMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            PubMaticMediationAdapter.this.log("Rewarded ad closed");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdFailedToLoad(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
            MaxAdapterError maxError = PubMaticMediationAdapter.toMaxError(pOBError);
            PubMaticMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdFailedToShow(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, pOBError.getErrorCode(), pOBError.getErrorMessage());
            PubMaticMediationAdapter.this.log("Rewarded ad failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdImpression(@NonNull POBRewardedAd pOBRewardedAd) {
            PubMaticMediationAdapter.this.log("Rewarded ad impression");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onAdReceived(@NonNull POBRewardedAd pOBRewardedAd) {
            PubMaticMediationAdapter.this.log("Rewarded ad received");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAd.POBRewardedAdListener
        public void onReceiveReward(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBReward pOBReward) {
            PubMaticMediationAdapter.this.log("Rewarded ad reward granted");
            this.hasGrantedReward = true;
        }
    }

    public PubMaticMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.pubmatic.sdk.common.POBError r3) {
        /*
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            int r1 = r3.getErrorCode()
            r2 = 2001(0x7d1, float:2.804E-42)
            if (r1 == r2) goto L39
            r2 = 2002(0x7d2, float:2.805E-42)
            if (r1 == r2) goto L36
            r2 = 3001(0xbb9, float:4.205E-42)
            if (r1 == r2) goto L39
            r2 = 5001(0x1389, float:7.008E-42)
            if (r1 == r2) goto L33
            r2 = 5002(0x138a, float:7.009E-42)
            if (r1 == r2) goto L33
            switch(r1) {
                case 1001: goto L30;
                case 1002: goto L2d;
                case 1003: goto L2a;
                case 1004: goto L27;
                case 1005: goto L24;
                case 1006: goto L39;
                case 1007: goto L39;
                case 1008: goto L39;
                case 1009: goto L21;
                case 1010: goto L39;
                case 1011: goto L1e;
                case 1012: goto L30;
                case 1013: goto L33;
                default: goto L1d;
            }
        L1d:
            goto L3b
        L1e:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L3b
        L21:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.WEBVIEW_ERROR
            goto L3b
        L24:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L3b
        L27:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.SERVER_ERROR
            goto L3b
        L2a:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L3b
        L2d:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L3b
        L30:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L3b
        L33:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L3b
        L36:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY
            goto L3b
        L39:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L3b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = new com.applovin.mediation.adapter.MaxAdapterError
            int r2 = r3.getErrorCode()
            java.lang.String r3 = r3.getErrorMessage()
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.PubMaticMediationAdapter.toMaxError(com.pubmatic.sdk.common.POBError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    @Nullable
    private static POBAdFormat toPubMaticAdFormat(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return POBAdFormat.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return POBAdFormat.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return POBAdFormat.MREC;
        }
        if (maxAdFormat == MaxAdFormat.INTERSTITIAL) {
            return POBAdFormat.INTERSTITIAL;
        }
        if (maxAdFormat == MaxAdFormat.REWARDED) {
            return POBAdFormat.REWARDEDAD;
        }
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        POBAdFormat pubMaticAdFormat = toPubMaticAdFormat(maxAdapterSignalCollectionParameters.getAdFormat());
        if (pubMaticAdFormat == null) {
            maxSignalCollectionListener.onSignalCollectionFailed("Invalid ad format");
        } else {
            maxSignalCollectionListener.onSignalCollected(POBSignalGenerator.generateSignal(getApplicationContext(), POBBiddingHost.ALMAX, new POBSignalConfig.Builder(pubMaticAdFormat).setGpid(maxAdapterSignalCollectionParameters.getAdUnitId()).build()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return OpenWrapSDK.getVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        String string = BundleUtils.getString("publisher_id", maxAdapterInitializationParameters.getServerParameters());
        int i10 = BundleUtils.getInt("profile_id", maxAdapterInitializationParameters.getServerParameters());
        log("Initializing PubMatic SDK with publisherId: " + string + ", profileId: " + i10 + APSSharedUtil.TRUNCATE_SEPARATOR);
        OpenWrapSDK.initialize(getApplicationContext(), new OpenWrapSDKConfig.Builder(string, Collections.singletonList(Integer.valueOf(i10))).build(), new OpenWrapSDKInitializer.Listener() { // from class: com.applovin.mediation.adapters.PubMaticMediationAdapter.1
            @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
            public void onFailure(@NonNull POBError pOBError) {
                PubMaticMediationAdapter.this.log("PubMatic SDK failed to initialize with error: " + pOBError);
                MaxAdapter.InitializationStatus unused = PubMaticMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(PubMaticMediationAdapter.status, pOBError.getErrorMessage());
            }

            @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
            public void onSuccess() {
                PubMaticMediationAdapter.this.log("PubMatic SDK initialized");
                MaxAdapter.InitializationStatus unused = PubMaticMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(PubMaticMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    @SuppressLint({"MissingPermission"})
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading " + maxAdFormat.getLabel() + " ad");
        POBBannerView pOBBannerView = new POBBannerView(getApplicationContext());
        this.adView = pOBBannerView;
        pOBBannerView.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.loadAd(bidResponse, POBBiddingHost.ALMAX);
        this.adView.pauseAutoRefresh();
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    @SuppressLint({"MissingPermission"})
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading interstitial ad");
        POBInterstitial pOBInterstitial = new POBInterstitial(getApplicationContext());
        this.interstitialAd = pOBInterstitial;
        pOBInterstitial.setListener(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.loadAd(bidResponse, POBBiddingHost.ALMAX);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    @SuppressLint({"MissingPermission"})
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log("Loading rewarded ad");
        POBRewardedAd rewardedAd = POBRewardedAd.getRewardedAd(getApplicationContext());
        if (rewardedAd == null) {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        this.rewardedAd = rewardedAd;
        rewardedAd.setListener(new RewardedListener(maxRewardedAdapterListener));
        this.rewardedAd.loadAd(bidResponse, POBBiddingHost.ALMAX);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        POBInterstitial pOBInterstitial = this.interstitialAd;
        if (pOBInterstitial != null) {
            pOBInterstitial.destroy();
            this.interstitialAd = null;
        }
        POBRewardedAd pOBRewardedAd = this.rewardedAd;
        if (pOBRewardedAd != null) {
            pOBRewardedAd.destroy();
            this.rewardedAd = null;
        }
        POBBannerView pOBBannerView = this.adView;
        if (pOBBannerView != null) {
            pOBBannerView.destroy();
            this.adView = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad");
        POBInterstitial pOBInterstitial = this.interstitialAd;
        if (pOBInterstitial != null) {
            pOBInterstitial.show();
            return;
        }
        log("Interstitial ad failed to show - ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Rewarded ad failed to show - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }
}
