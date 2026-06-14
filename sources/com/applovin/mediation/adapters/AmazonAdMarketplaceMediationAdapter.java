package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdError;
import com.amazon.aps.ads.ApsAdNetworkInfo;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdNetwork;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.SDKUtilities;
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
import com.applovin.mediation.adapters.amazonadmarketplace.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AmazonAdMarketplaceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter {
    private ApsAdController adViewController;
    private ApsAdController interstitialAdController;
    private ApsAdController rewardedAdController;
    private static final Map<MaxAdFormat, DTBAdLoader> adLoaders = DesugarCollections.synchronizedMap(new HashMap());
    private static final Set<Integer> usedAdLoaders = DesugarCollections.synchronizedSet(new HashSet());
    private static final Map<String, MediationHints> mediationHintsCache = new HashMap();
    private static final Object mediationHintsCacheLock = new Object();
    private static final Map<MaxAdFormat, String> hashedBidderIds = new HashMap();
    private static final Object hashedBidderIdsLock = new Object();

    private class AdViewListener implements ApsAdListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClicked(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("AdView clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClosed(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("AdView collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdError(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("AdView error");
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdFailedToLoad(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("AdView failed to load");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.UNSPECIFIED);
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdLoaded(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("AdView ad loaded");
            this.listener.onAdViewAdLoaded(apsAd.getAdView(), AmazonAdMarketplaceMediationAdapter.this.createExtraInfo(this.adFormat, apsAd.getCrid()));
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdOpen(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("AdView expanded");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onImpressionFired(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("AdView impression fired");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public /* synthetic */ void onVideoCompleted(ApsAd apsAd) {
            t0.a.d(this, apsAd);
        }

        private AdViewListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }
    }

    private static class CleanupMediationHintsTask implements Runnable {
        private final MediationHints mediationHints;
        private final String mediationHintsCacheId;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (AmazonAdMarketplaceMediationAdapter.mediationHintsCacheLock) {
                try {
                    MediationHints mediationHints = (MediationHints) AmazonAdMarketplaceMediationAdapter.mediationHintsCache.get(this.mediationHintsCacheId);
                    if (mediationHints != null && mediationHints.f11675id.equals(this.mediationHints.f11675id)) {
                        AmazonAdMarketplaceMediationAdapter.mediationHintsCache.remove(this.mediationHintsCacheId);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private CleanupMediationHintsTask(String str, MediationHints mediationHints) {
            this.mediationHintsCacheId = str;
            this.mediationHints = mediationHints;
        }
    }

    private class InterstitialListener implements ApsAdListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClicked(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClosed(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial closed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdError(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("Interstitial ad error");
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdFailedToLoad(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("Interstitial failed to load");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdLoaded(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial loaded");
            this.listener.onInterstitialAdLoaded(AmazonAdMarketplaceMediationAdapter.this.createExtraInfo(MaxAdFormat.INTERSTITIAL, apsAd.getCrid()));
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdOpen(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial did open");
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onImpressionFired(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial did fire impression");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onVideoCompleted(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Interstitial video completed");
        }
    }

    private static class MediationHints {
        private final DTBAdResponse dtbAdResponse;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f11675id;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediationHints)) {
                return false;
            }
            MediationHints mediationHints = (MediationHints) obj;
            String str = this.f11675id;
            if (str == null ? mediationHints.f11675id != null : !str.equals(mediationHints.f11675id)) {
                return false;
            }
            DTBAdResponse dTBAdResponse = this.dtbAdResponse;
            DTBAdResponse dTBAdResponse2 = mediationHints.dtbAdResponse;
            return dTBAdResponse != null ? dTBAdResponse.equals(dTBAdResponse2) : dTBAdResponse2 == null;
        }

        public int hashCode() {
            String str = this.f11675id;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            DTBAdResponse dTBAdResponse = this.dtbAdResponse;
            return iHashCode + (dTBAdResponse != null ? dTBAdResponse.hashCode() : 0);
        }

        @NonNull
        public String toString() {
            return "MediationHints{id=" + this.f11675id + ", dtbAdResponse=" + this.dtbAdResponse + '}';
        }

        private MediationHints(DTBAdResponse dTBAdResponse) {
            this.f11675id = UUID.randomUUID().toString().toLowerCase(Locale.US);
            this.dtbAdResponse = dTBAdResponse;
        }
    }

    private class RewardedAdListener implements ApsAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClicked(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdClosed(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad closed");
            if (this.hasGrantedReward || AmazonAdMarketplaceMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AmazonAdMarketplaceMediationAdapter.this.getReward();
                AmazonAdMarketplaceMediationAdapter.this.d("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdError(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("Rewarded ad error");
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdFailedToLoad(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.e("Rewarded ad failed to load");
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdLoaded(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded(AmazonAdMarketplaceMediationAdapter.this.createExtraInfo(MaxAdFormat.REWARDED, apsAd.getCrid()));
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onAdOpen(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad did open");
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onImpressionFired(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad did fire impression");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.amazon.aps.ads.listeners.ApsAdListener
        public void onVideoCompleted(ApsAd apsAd) {
            AmazonAdMarketplaceMediationAdapter.this.d("Rewarded ad video completed");
            this.hasGrantedReward = true;
        }
    }

    public AmazonAdMarketplaceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createExtraInfo(MaxAdFormat maxAdFormat, String str) {
        Bundle bundle = new Bundle(2);
        if (AppLovinSdkUtils.isValidString(str)) {
            bundle.putString("creative_id", str);
        }
        synchronized (hashedBidderIdsLock) {
            try {
                String str2 = hashedBidderIds.get(maxAdFormat);
                if (AppLovinSdkUtils.isValidString(str2)) {
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("amazon_hashed_bidder_id", str2);
                    bundle.putBundle("ad_values", bundle2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failSignalCollection(AdError adError, MaxSignalCollectionListener maxSignalCollectionListener) {
        failSignalCollection("Signal collection failed: " + adError.getCode() + " - " + adError.getMessage(), maxSignalCollectionListener);
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private String getMediationHintsCacheId(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.LEADER) {
            maxAdFormat = MaxAdFormat.BANNER;
        }
        return str + "_" + maxAdFormat.getLabel();
    }

    private boolean loadFullscreenAd(String str, ApsAdController apsAdController) {
        MediationHints mediationHints;
        synchronized (mediationHintsCacheLock) {
            Map<String, MediationHints> map = mediationHintsCache;
            mediationHints = map.get(str);
            map.remove(str);
        }
        if (mediationHints == null) {
            e("Unable to find mediation hints");
            return false;
        }
        apsAdController.fetchInterstitialAd(SDKUtilities.getBidInfo(mediationHints.dtbAdResponse));
        return true;
    }

    private void loadSubsequentSignal(DTBAdLoader dTBAdLoader, String str, final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final MaxAdFormat maxAdFormat, final MaxSignalCollectionListener maxSignalCollectionListener) {
        d("Found existing ad loader (" + dTBAdLoader + ") for format: " + maxAdFormat + " - loading...");
        if (!(dTBAdLoader instanceof ApsAdRequest)) {
            dTBAdLoader = new ApsAdRequest((DTBAdRequest) dTBAdLoader);
        }
        ApsAdRequest apsAdRequest = (ApsAdRequest) dTBAdLoader;
        apsAdRequest.setCorrelationId(str);
        if (apsAdRequest.getAdNetworkInfo() == null) {
            apsAdRequest.setNetworkInfo(new ApsAdNetworkInfo(ApsAdNetwork.MAX));
            ApsMetrics.customEvent("APPLOVIN_SET_NETWORK_EVENT", "AdNetwork Type : null", null);
        } else {
            String adNetworkName = apsAdRequest.getAdNetworkInfo().getAdNetworkName();
            ApsAdNetwork apsAdNetwork = ApsAdNetwork.MAX;
            if (!apsAdNetwork.toString().equalsIgnoreCase(adNetworkName)) {
                apsAdRequest.setNetworkInfo(new ApsAdNetworkInfo(apsAdNetwork));
                ApsMetrics.customEvent("APPLOVIN_SET_NETWORK_EVENT", "AdNetwork Type : mismatch . Network name set as " + adNetworkName + ", instead of " + apsAdNetwork, null);
            }
        }
        apsAdRequest.loadAd(new ApsAdRequestListener() { // from class: com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter.1
            @Override // com.amazon.aps.ads.listeners.ApsAdRequestListener
            public void onFailure(ApsAdError apsAdError) {
                if (apsAdError.getAdLoader() == null) {
                    APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "MAX - ApsAdError getAdLoader returns null");
                    return;
                }
                AmazonAdMarketplaceMediationAdapter.adLoaders.put(maxAdFormat, apsAdError.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.usedAdLoaders.add(Integer.valueOf(apsAdError.getAdLoader().hashCode()));
                AmazonAdMarketplaceMediationAdapter.this.d("Signal failed to collect for ad loader: " + apsAdError.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.this.failSignalCollection(apsAdError, maxSignalCollectionListener);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdRequestListener
            public void onSuccess(ApsAd apsAd) {
                AmazonAdMarketplaceMediationAdapter.adLoaders.put(maxAdFormat, apsAd.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.usedAdLoaders.add(Integer.valueOf(apsAd.getAdLoader().hashCode()));
                AmazonAdMarketplaceMediationAdapter.this.d("Signal collected for ad loader: " + apsAd.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.this.processAdResponse(maxAdapterSignalCollectionParameters, apsAd, maxAdFormat, maxSignalCollectionListener);
            }
        });
    }

    private void maybeCleanupAdView(ApsAdController apsAdController) {
        if (apsAdController == null || apsAdController.getApsAdView() == null) {
            return;
        }
        apsAdController.getApsAdView().cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAdResponse(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat, MaxSignalCollectionListener maxSignalCollectionListener) {
        d("Processing ad response...");
        String pricePoint = SDKUtilities.getPricePoint(dTBAdResponse);
        if (!AppLovinSdkUtils.isValidString(pricePoint)) {
            failSignalCollection("Received empty bid id", maxSignalCollectionListener);
            return;
        }
        MediationHints mediationHints = new MediationHints(dTBAdResponse);
        String mediationHintsCacheId = getMediationHintsCacheId(pricePoint, maxAdFormat);
        synchronized (mediationHintsCacheLock) {
            mediationHintsCache.put(mediationHintsCacheId, mediationHints);
        }
        long millis = TimeUnit.SECONDS.toMillis(maxAdapterSignalCollectionParameters.getServerParameters().getLong("mediation_hints_cleanup_delay_sec", TimeUnit.MINUTES.toSeconds(5L)));
        if (millis > 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new CleanupMediationHintsTask(mediationHintsCacheId, mediationHints), millis);
        }
        setHashedBidderId(maxAdFormat, maxAdFormat.isAdViewAd() ? String.valueOf(dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().get("amznp")) : String.valueOf(dTBAdResponse.getDefaultVideoAdsRequestCustomParams().get("amznp")));
        d("Successfully loaded encoded bid id: " + pricePoint);
        maxSignalCollectionListener.onSignalCollected(pricePoint);
    }

    private void setHashedBidderId(MaxAdFormat maxAdFormat, String str) {
        synchronized (hashedBidderIdsLock) {
            hashedBidderIds.put(maxAdFormat, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ad  */
    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void collectSignal(com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters r17, @androidx.annotation.Nullable android.app.Activity r18, com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener r19) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter.collectSignal(com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters, android.app.Activity, com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener):void");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return Aps.getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (maxAdapterInitializationParameters.isTesting()) {
            Aps.setTestingMode(true);
            Aps.enableLogging(true);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        MediationHints mediationHints;
        String string = maxAdapterResponseParameters.getServerParameters().getString("encoded_bid_id");
        d("Loading " + maxAdFormat.getLabel() + " ad view ad for encoded bid id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (TextUtils.isEmpty(string)) {
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        String mediationHintsCacheId = getMediationHintsCacheId(string, maxAdFormat);
        synchronized (mediationHintsCacheLock) {
            Map<String, MediationHints> map = mediationHintsCache;
            mediationHints = map.get(mediationHintsCacheId);
            map.remove(mediationHintsCacheId);
        }
        if (mediationHints == null) {
            e("Unable to find mediation hints");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
            return;
        }
        this.adViewController = new ApsAdController(getContext(activity), new AdViewListener(maxAdFormat, maxAdViewAdapterListener));
        if (mediationHints.dtbAdResponse instanceof ApsAd) {
            this.adViewController.fetchAd((ApsAd) mediationHints.dtbAdResponse);
        } else {
            DTBAdSize dTBAdSize = mediationHints.dtbAdResponse.getDTBAds().get(0);
            this.adViewController.fetchBannerAd(SDKUtilities.getBidInfo(mediationHints.dtbAdResponse), dTBAdSize.getWidth(), dTBAdSize.getHeight());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String string = maxAdapterResponseParameters.getServerParameters().getString("encoded_bid_id");
        d("Loading interstitial ad for encoded bid id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (TextUtils.isEmpty(string)) {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (activity == null) {
            log("Interstitial ad load failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.interstitialAdController = new ApsAdController(activity, new InterstitialListener(maxInterstitialAdapterListener));
            if (loadFullscreenAd(getMediationHintsCacheId(string, MaxAdFormat.INTERSTITIAL), this.interstitialAdController)) {
                return;
            }
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String string = maxAdapterResponseParameters.getServerParameters().getString("encoded_bid_id");
        d("Loading rewarded ad for encoded bid id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (TextUtils.isEmpty(string)) {
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (activity == null) {
            log("Rewarded ad load failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.rewardedAdController = new ApsAdController(activity, new RewardedAdListener(maxRewardedAdapterListener));
            if (loadFullscreenAd(getMediationHintsCacheId(string, MaxAdFormat.REWARDED), this.rewardedAdController)) {
                return;
            }
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        maybeCleanupAdView(this.adViewController);
        this.adViewController = null;
        maybeCleanupAdView(this.interstitialAdController);
        this.interstitialAdController = null;
        maybeCleanupAdView(this.rewardedAdController);
        this.rewardedAdController = null;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        ApsAdController apsAdController = this.interstitialAdController;
        if (apsAdController != null) {
            apsAdController.show();
            return;
        }
        e("Interstitial ad is null");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAdController != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAdController.show();
        } else {
            e("Rewarded ad is null");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }

    private void failSignalCollection(String str, MaxSignalCollectionListener maxSignalCollectionListener) {
        e(str);
        maxSignalCollectionListener.onSignalCollectionFailed(str);
    }
}
