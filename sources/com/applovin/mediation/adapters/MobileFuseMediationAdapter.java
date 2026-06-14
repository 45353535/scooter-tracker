package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.mobilefuse.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.adapters.custom.bmwf.BMConstants;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.SdkInitListener;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenRequest;
import com.mobilefuse.sdk.internal.TokenGeneratorListener;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class MobileFuseMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private MobileFuseBannerAd adView;
    private MobileFuseInterstitialAd interstitialAd;
    private MobileFuseNativeAd nativeAd;
    private MobileFuseRewardedAd rewardedAd;

    /* JADX INFO: renamed from: com.applovin.mediation.adapters.MobileFuseMediationAdapter$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$mobilefuse$sdk$AdError;

        static {
            int[] iArr = new int[AdError.values().length];
            $SwitchMap$com$mobilefuse$sdk$AdError = iArr;
            try {
                iArr[AdError.AD_ALREADY_LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$AdError[AdError.AD_LOAD_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$AdError[AdError.AD_ALREADY_RENDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$mobilefuse$sdk$AdError[AdError.AD_RUNTIME_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class AdViewAdListener implements MobileFuseBannerAd.Listener {
        private final MaxAdViewAdapterListener listener;

        public AdViewAdListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdClicked() {
            MobileFuseMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
        public void onAdCollapsed() {
            MobileFuseMediationAdapter.this.log("AdView ad collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdError(AdError adError) {
            if (adError == AdError.AD_ALREADY_LOADED || adError == AdError.AD_LOAD_ERROR) {
                MaxAdapterError maxError = MobileFuseMediationAdapter.this.toMaxError(adError);
                MobileFuseMediationAdapter.this.log("AdView ad failed to load with error (" + maxError + ")");
                this.listener.onAdViewAdLoadFailed(maxError);
                return;
            }
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getErrorCode(), adError.getErrorMessage());
            MobileFuseMediationAdapter.this.log("AdView ad failed to display with error (" + maxAdapterError + ")");
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
        public void onAdExpanded() {
            MobileFuseMediationAdapter.this.log("AdView ad expanded");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdExpired() {
            MobileFuseMediationAdapter.this.log("AdView ad expired");
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdLoaded() {
            MobileFuseMediationAdapter.this.log("AdView ad loaded");
            this.listener.onAdViewAdLoaded(MobileFuseMediationAdapter.this.adView);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdNotFilled() {
            MobileFuseMediationAdapter.this.log("AdView ad failed to load - no fill");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdRendered() {
            MobileFuseMediationAdapter.this.log("AdView ad displayed");
            this.listener.onAdViewAdDisplayed();
        }
    }

    private class InterstitialAdListener implements MobileFuseInterstitialAd.Listener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdClicked() {
            MobileFuseMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.mobilefuse.sdk.MobileFuseInterstitialAd.Listener
        public void onAdClosed() {
            MobileFuseMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdError(AdError adError) {
            if (adError == AdError.AD_ALREADY_LOADED || adError == AdError.AD_LOAD_ERROR) {
                MaxAdapterError maxError = MobileFuseMediationAdapter.this.toMaxError(adError);
                MobileFuseMediationAdapter.this.log("Interstitial ad failed to load with error (" + maxError + ")");
                this.listener.onInterstitialAdLoadFailed(maxError);
                return;
            }
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getErrorCode(), adError.getErrorMessage());
            MobileFuseMediationAdapter.this.log("Interstitial ad failed to display with error (" + maxAdapterError + ")");
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdExpired() {
            MobileFuseMediationAdapter.this.log("Interstitial ad expired");
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdLoaded() {
            MobileFuseMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdNotFilled() {
            MobileFuseMediationAdapter.this.log("Interstitial ad failed to load - no fill");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdRendered() {
            MobileFuseMediationAdapter.this.log("Interstitial ad displayed");
            this.listener.onInterstitialAdDisplayed();
        }
    }

    private class MaxMobileFuseNativeAd extends MaxNativeAd {
        public MaxMobileFuseNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) throws Throwable {
            MobileFuseNativeAd mobileFuseNativeAd = MobileFuseMediationAdapter.this.nativeAd;
            if (mobileFuseNativeAd == null) {
                MobileFuseMediationAdapter.this.e("Failed to register native ad view: native ad is null.");
                return false;
            }
            MobileFuseMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            mobileFuseNativeAd.registerViewForInteraction(viewGroup, list);
            return true;
        }
    }

    private class NativeAdListener implements MobileFuseNativeAd.Listener {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
        public void onAdClicked() {
            MobileFuseMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxError = MobileFuseMediationAdapter.this.toMaxError(adError);
            if (adError == AdError.AD_ALREADY_LOADED || adError == AdError.AD_LOAD_ERROR) {
                MobileFuseMediationAdapter.this.log("Native ad failed to load with error (" + maxError + ")");
            } else {
                MobileFuseMediationAdapter.this.log("Native ad failed to display with error (" + maxError + ")");
            }
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdExpired() {
            MobileFuseMediationAdapter.this.log("Native ad expired");
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdLoaded() {
            if (MobileFuseMediationAdapter.this.nativeAd == null) {
                MobileFuseMediationAdapter.this.e("Native ad is null");
                return;
            }
            MobileFuseMediationAdapter.this.log("Native ad loaded");
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || MobileFuseMediationAdapter.this.nativeAd.hasTitle()) {
                this.listener.onNativeAdLoaded(MobileFuseMediationAdapter.this.new MaxMobileFuseNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(MobileFuseMediationAdapter.this.nativeAd.getTitle()).setAdvertiser(MobileFuseMediationAdapter.this.nativeAd.getSponsoredText()).setBody(MobileFuseMediationAdapter.this.nativeAd.getDescriptionText()).setCallToAction(MobileFuseMediationAdapter.this.nativeAd.getCtaButtonText()).setIcon(new MaxNativeAd.MaxNativeAdImage(MobileFuseMediationAdapter.this.nativeAd.getIconDrawable())).setMediaView(MobileFuseMediationAdapter.this.nativeAd.getMainContentView())), null);
                return;
            }
            MobileFuseMediationAdapter.this.e("Native ad (" + MobileFuseMediationAdapter.this.nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdNotFilled() {
            MobileFuseMediationAdapter.this.log("Native ad failed to load - no fill");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
        public void onAdRendered() {
            MobileFuseMediationAdapter.this.log("Native ad displayed");
            this.listener.onNativeAdDisplayed(null);
        }
    }

    private class NativeAdViewListener implements MobileFuseNativeAd.Listener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;

        NativeAdViewListener(MaxAdFormat maxAdFormat, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
        public void onAdClicked() {
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdError(@NonNull AdError adError) {
            if (adError == AdError.AD_ALREADY_LOADED || adError == AdError.AD_LOAD_ERROR) {
                MaxAdapterError maxError = MobileFuseMediationAdapter.this.toMaxError(adError);
                MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error (" + maxError + ")");
                this.listener.onAdViewAdLoadFailed(maxError);
                return;
            }
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getErrorCode(), adError.getErrorMessage());
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to display with error (" + maxAdapterError + ")");
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdExpired() {
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad expired");
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdLoaded() throws Throwable {
            MaxNativeAdView maxNativeAdView;
            if (MobileFuseMediationAdapter.this.nativeAd == null) {
                MobileFuseMediationAdapter.this.e("Native " + this.adFormat.getLabel() + " ad is null");
                return;
            }
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded");
            MaxMobileFuseNativeAd maxMobileFuseNativeAd = MobileFuseMediationAdapter.this.new MaxMobileFuseNativeAd(new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(MobileFuseMediationAdapter.this.nativeAd.getTitle()).setBody(MobileFuseMediationAdapter.this.nativeAd.getDescriptionText()).setAdvertiser(MobileFuseMediationAdapter.this.nativeAd.getSponsoredText()).setCallToAction(MobileFuseMediationAdapter.this.nativeAd.getCtaButtonText()).setIconView(MobileFuseMediationAdapter.this.nativeAd.getIconView()).setMediaView(MobileFuseMediationAdapter.this.nativeAd.getMainContentView()));
            String string = BundleUtils.getString("template", "", this.serverParameters);
            if (string.equals("vertical")) {
                maxNativeAdView = new MaxNativeAdView(maxMobileFuseNativeAd, this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", MobileFuseMediationAdapter.this.getApplicationContext());
            } else {
                if (!AppLovinSdkUtils.isValidString(string)) {
                    string = "media_banner_template";
                }
                maxNativeAdView = new MaxNativeAdView(maxMobileFuseNativeAd, string, MobileFuseMediationAdapter.this.getApplicationContext());
            }
            maxMobileFuseNativeAd.prepareForInteraction(MobileFuseMediationAdapter.this.getClickableViews(maxNativeAdView), maxNativeAdView);
            this.listener.onAdViewAdLoaded(maxNativeAdView);
        }

        @Override // com.mobilefuse.sdk.LoadableAdListener
        public void onAdNotFilled() {
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load - no fill");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.mobilefuse.sdk.MobileFuseNativeAd.Listener
        public void onAdRendered() {
            MobileFuseMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad displayed");
            this.listener.onAdViewAdDisplayed(null);
        }
    }

    private class RewardedAdListener implements MobileFuseRewardedAd.Listener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdClicked() {
            MobileFuseMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
        public void onAdClosed() {
            MobileFuseMediationAdapter.this.log("Rewarded ad hidden");
            if (this.hasGrantedReward || MobileFuseMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = MobileFuseMediationAdapter.this.getReward();
                MobileFuseMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdError(AdError adError) {
            if (adError == AdError.AD_ALREADY_LOADED || adError == AdError.AD_LOAD_ERROR) {
                MaxAdapterError maxError = MobileFuseMediationAdapter.this.toMaxError(adError);
                MobileFuseMediationAdapter.this.log("Rewarded ad failed to load with error (" + maxError + ")");
                this.listener.onRewardedAdLoadFailed(maxError);
                return;
            }
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getErrorCode(), adError.getErrorMessage());
            MobileFuseMediationAdapter.this.log("Rewarded ad failed to display with error (" + maxAdapterError + ")");
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdExpired() {
            MobileFuseMediationAdapter.this.log("Rewarded ad expired");
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdLoaded() {
            MobileFuseMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdNotFilled() {
            MobileFuseMediationAdapter.this.log("Rewarded ad failed to load - no fill");
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdRendered() {
            MobileFuseMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
        public void onUserEarnedReward() {
            MobileFuseMediationAdapter.this.log("Rewarded ad should grant reward");
            this.hasGrantedReward = true;
        }
    }

    public MobileFuseMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        ArrayList arrayList = new ArrayList(6);
        if (maxNativeAdView.getTitleTextView() != null) {
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (maxNativeAdView.getAdvertiserTextView() != null) {
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (maxNativeAdView.getBodyTextView() != null) {
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (maxNativeAdView.getCallToActionButton() != null) {
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (maxNativeAdView.getIconImageView() != null) {
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        if (maxNativeAdView.getMediaContentViewGroup() != null) {
            arrayList.add(maxNativeAdView.getMediaContentViewGroup());
        }
        return arrayList;
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private MobileFuseBannerAd.AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return MobileFuseBannerAd.AdSize.BANNER_300x50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return MobileFuseBannerAd.AdSize.BANNER_728x90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return MobileFuseBannerAd.AdSize.BANNER_300x250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxAdapterError toMaxError(AdError adError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (adError == null) {
            return maxAdapterError;
        }
        int i10 = AnonymousClass3.$SwitchMap$com$mobilefuse$sdk$AdError[adError.ordinal()];
        if (i10 == 1 || i10 == 2) {
            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
        } else if (i10 == 3 || i10 == 4) {
            maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        }
        return new MaxAdapterError(maxAdapterError, adError.getErrorCode(), adError.getErrorMessage());
    }

    private void updatePrivacyPreferences(MaxAdapterParameters maxAdapterParameters) {
        MobileFusePrivacyPreferences.Builder builder = new MobileFusePrivacyPreferences.Builder();
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            builder.setUsPrivacyConsentString(boolIsDoNotSell.booleanValue() ? BMConstants.BM_CCPA_NO_CONSENT_VALUE : BMConstants.BM_CCPA_CONSENT_VALUE);
        } else {
            builder.setUsPrivacyConsentString("1---");
        }
        MobileFuse.setPrivacyPreferences(builder.build());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacyPreferences(maxAdapterSignalCollectionParameters);
        MobileFuseBiddingTokenProvider.getToken(new MobileFuseBiddingTokenRequest(MobileFuse.getPrivacyPreferences(), maxAdapterSignalCollectionParameters.isTesting()), getContext(activity), new TokenGeneratorListener() { // from class: com.applovin.mediation.adapters.MobileFuseMediationAdapter.2
            @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
            public void onTokenGenerated(@NonNull String str) {
                MobileFuseMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }

            @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
            public void onTokenGenerationFailed(@NonNull String str) {
                MobileFuseMediationAdapter.this.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return MobileFuse.getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(initializationStatus, null);
            return;
        }
        log("Initializing MobileFuse SDK");
        initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        MobileFuseSettings.setTestMode(maxAdapterInitializationParameters.isTesting());
        MobileFuseSettings.setSdkAdapter("applovin_bidding", getAdapterVersion());
        MobileFuse.init(new SdkInitListener() { // from class: com.applovin.mediation.adapters.MobileFuseMediationAdapter.1
            @Override // com.mobilefuse.sdk.SdkInitListener
            public void onInitError() {
                MobileFuseMediationAdapter.this.log("MobileFuse SDK failed to initialize");
                MaxAdapter.InitializationStatus unused = MobileFuseMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(MobileFuseMediationAdapter.initializationStatus, null);
            }

            @Override // com.mobilefuse.sdk.SdkInitListener
            public void onInitSuccess() {
                MobileFuseMediationAdapter.this.log("MobileFuse SDK initialized");
                MaxAdapter.InitializationStatus unused = MobileFuseMediationAdapter.initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(MobileFuseMediationAdapter.initializationStatus, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) throws Throwable {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(z10 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        updatePrivacyPreferences(maxAdapterResponseParameters);
        if (z10) {
            MobileFuseNativeAd mobileFuseNativeAd = new MobileFuseNativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.nativeAd = mobileFuseNativeAd;
            mobileFuseNativeAd.setAdListener(new NativeAdViewListener(maxAdFormat, maxAdapterResponseParameters, maxAdViewAdapterListener));
            this.nativeAd.loadAdFromBiddingToken(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        MobileFuseBannerAd mobileFuseBannerAd = new MobileFuseBannerAd(getContext(activity), thirdPartyAdPlacementId, toAdSize(maxAdFormat));
        this.adView = mobileFuseBannerAd;
        mobileFuseBannerAd.setListener(new AdViewAdListener(maxAdViewAdapterListener));
        this.adView.setAutorefreshEnabled(false);
        this.adView.setMuted(true);
        this.adView.loadAdFromBiddingToken(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        MobileFuseInterstitialAd mobileFuseInterstitialAd = new MobileFuseInterstitialAd(getContext(activity), thirdPartyAdPlacementId);
        this.interstitialAd = mobileFuseInterstitialAd;
        mobileFuseInterstitialAd.setListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        this.interstitialAd.loadAdFromBiddingToken(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading native ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        MobileFuseNativeAd mobileFuseNativeAd = new MobileFuseNativeAd(getContext(activity), thirdPartyAdPlacementId);
        this.nativeAd = mobileFuseNativeAd;
        mobileFuseNativeAd.setAdListener(new NativeAdListener(maxAdapterResponseParameters, maxNativeAdAdapterListener));
        this.nativeAd.loadAdFromBiddingToken(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        MobileFuseRewardedAd mobileFuseRewardedAd = new MobileFuseRewardedAd(getContext(activity), thirdPartyAdPlacementId);
        this.rewardedAd = mobileFuseRewardedAd;
        mobileFuseRewardedAd.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.loadAdFromBiddingToken(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() throws Throwable {
        MobileFuseInterstitialAd mobileFuseInterstitialAd = this.interstitialAd;
        if (mobileFuseInterstitialAd != null) {
            mobileFuseInterstitialAd.setListener(null);
            this.interstitialAd = null;
        }
        MobileFuseRewardedAd mobileFuseRewardedAd = this.rewardedAd;
        if (mobileFuseRewardedAd != null) {
            mobileFuseRewardedAd.setListener(null);
            this.rewardedAd = null;
        }
        MobileFuseBannerAd mobileFuseBannerAd = this.adView;
        if (mobileFuseBannerAd != null) {
            mobileFuseBannerAd.destroy();
            this.adView.setListener(null);
            this.adView = null;
        }
        MobileFuseNativeAd mobileFuseNativeAd = this.nativeAd;
        if (mobileFuseNativeAd != null) {
            mobileFuseNativeAd.unregisterViews();
            this.nativeAd.setAdListener(null);
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        if (this.interstitialAd.isLoaded()) {
            this.interstitialAd.showAd();
            return;
        }
        log("Unable to show interstitial - ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        if (this.rewardedAd.isLoaded()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.showAd();
        } else {
            log("Unable to show rewarded ad - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }
}
