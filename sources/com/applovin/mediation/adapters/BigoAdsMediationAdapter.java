package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.bigoads.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C4574uf;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdLoader;
import sg.bigo.ads.api.NativeAdRequest;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.api.SplashAdLoader;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes6.dex */
public class BigoAdsMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxAppOpenAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxNativeAdAdapter {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final String MEDIATION_INFO;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private BannerAd adViewAd;
    private AdViewListener adViewListener;
    private SplashAd appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private InterstitialAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    private NativeAd nativeAd;
    private NativeAdListener nativeAdListener;
    private NativeAdViewListener nativeAdViewListener;
    private RewardVideoAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    private class AdViewListener implements AdLoadListener<BannerAd>, AdInteractionListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked recorded for slot id: " + this.slotId);
            this.listener.onAdViewAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log(this.adFormat.getLabel() + " ad impression recorded for slot id: " + this.slotId);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + this.slotId + ") failed to load with error :" + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        private AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.slotId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull BannerAd bannerAd) {
            BigoAdsMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded for slot id: " + this.slotId);
            BigoAdsMediationAdapter.this.adViewAd = bannerAd;
            bannerAd.setAdInteractionListener(BigoAdsMediationAdapter.this.adViewListener);
            this.listener.onAdViewAdLoaded(bannerAd.adView());
        }
    }

    private class AppOpenAdListener implements AdLoadListener<SplashAd>, SplashAdInteractionListener {
        private final MaxAppOpenAdapterListener listener;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log("App open ad click recorded for slot id: " + this.slotId);
            this.listener.onAppOpenAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log("App open ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // sg.bigo.ads.api.SplashAdInteractionListener
        public void onAdFinished() {
            BigoAdsMediationAdapter.this.log("App open ad finished for slot id: " + this.slotId);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log("App open ad impression recorded for slot id: " + this.slotId);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
        }

        @Override // sg.bigo.ads.api.SplashAdInteractionListener
        public void onAdSkipped() {
            BigoAdsMediationAdapter.this.log("App open ad skipped for slot id: " + this.slotId);
            this.listener.onAppOpenAdHidden();
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log("App open ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onAppOpenAdLoadFailed(maxError);
        }

        private AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.slotId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull SplashAd splashAd) {
            BigoAdsMediationAdapter.this.log("App open ad loaded for slot id: " + this.slotId);
            BigoAdsMediationAdapter.this.appOpenAd = splashAd;
            this.listener.onAppOpenAdLoaded();
        }
    }

    private class InterstitialAdListener implements AdLoadListener<InterstitialAd>, AdInteractionListener {
        private final MaxInterstitialAdapterListener listener;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log("Interstitial ad click recorded for slot id: " + this.slotId);
            this.listener.onInterstitialAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
            BigoAdsMediationAdapter.this.log("Interstitial ad hidden for slot id: " + this.slotId);
            this.listener.onInterstitialAdHidden();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log("Interstitial ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log("Interstitial ad impression recorded for slot id: " + this.slotId);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
            BigoAdsMediationAdapter.this.log("Interstitial ad opened for slot id: " + this.slotId);
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log("Interstitial ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        private InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.slotId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            BigoAdsMediationAdapter.this.log("Interstitial ad loaded for slot id: " + this.slotId);
            BigoAdsMediationAdapter.this.interstitialAd = interstitialAd;
            this.listener.onInterstitialAdLoaded();
        }
    }

    private class MaxBigoAdsNativeAd extends MaxNativeAd {
        public MaxBigoAdsNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        private void updateTagsForNativeAdView(MaxNativeAdView maxNativeAdView) {
            if (maxNativeAdView.getTitleTextView() != null) {
                maxNativeAdView.getTitleTextView().setTag(2);
            }
            if (maxNativeAdView.getAdvertiserTextView() != null) {
                maxNativeAdView.getAdvertiserTextView().setTag(3);
            }
            if (maxNativeAdView.getBodyTextView() != null) {
                maxNativeAdView.getBodyTextView().setTag(6);
            }
            if (maxNativeAdView.getCallToActionButton() != null) {
                maxNativeAdView.getCallToActionButton().setTag(7);
            }
            if (maxNativeAdView.getIconImageView() != null) {
                maxNativeAdView.getIconImageView().setTag(1);
            }
            if (maxNativeAdView.getOptionsContentViewGroup() != null) {
                maxNativeAdView.getOptionsContentViewGroup().setTag(4);
            }
            if (maxNativeAdView.getMediaContentViewGroup() != null) {
                maxNativeAdView.getMediaContentViewGroup().setTag(5);
            }
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            NativeAd nativeAd = BigoAdsMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                BigoAdsMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                updateTagsForNativeAdView(maxNativeAdView);
                nativeAd.registerViewForInteraction(viewGroup, maxNativeAdView.getMediaContentViewGroup() != null ? (MediaView) getMediaView() : null, maxNativeAdView.getIconImageView() != null ? maxNativeAdView.getIconImageView() : null, maxNativeAdView.getOptionsContentViewGroup() != null ? (AdOptionsView) getOptionsView() : null, list);
            } else {
                MediaView mediaView = null;
                ImageView imageView = null;
                for (View view : list) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue == 1) {
                            view.setTag(2);
                        } else if (iIntValue == 8) {
                            view.setTag(3);
                        } else if (iIntValue == 4) {
                            view.setTag(6);
                        } else if (iIntValue == 3) {
                            view.setTag(1);
                            if (view instanceof ImageView) {
                                imageView = (ImageView) view;
                            }
                        } else if (iIntValue == 2) {
                            view.setTag(5);
                            mediaView = (MediaView) getMediaView();
                        } else if (iIntValue == 5) {
                            view.setTag(7);
                        }
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, mediaView, imageView, (AdOptionsView) null, list);
            }
            return true;
        }
    }

    private class NativeAdListener implements AdLoadListener<NativeAd>, AdInteractionListener {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log("Native ad click recorded for slot id: " + this.slotId);
            this.listener.onNativeAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log("Native ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log("Native ad impression recorded for slot id: " + this.slotId);
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log("Native ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        private NativeAdListener(String str, Bundle bundle, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.slotId = str;
            this.serverParameters = bundle;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull NativeAd nativeAd) {
            BigoAdsMediationAdapter.this.log("Native ad loaded for slot id: " + this.slotId);
            if (nativeAd == null) {
                BigoAdsMediationAdapter.this.log("Native ad (" + nativeAd + ")  can't be null.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            nativeAd.setAdInteractionListener(BigoAdsMediationAdapter.this.nativeAdListener);
            BigoAdsMediationAdapter.this.nativeAd = nativeAd;
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(nativeAd.getTitle())) {
                BigoAdsMediationAdapter.this.log("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            Context applicationContext = BigoAdsMediationAdapter.this.getApplicationContext();
            ImageView imageView = new ImageView(applicationContext);
            AdOptionsView adOptionsView = new AdOptionsView(applicationContext);
            MediaView mediaView = new MediaView(applicationContext);
            BigoAdsMediationAdapter.updateMuteState(this.serverParameters, mediaView);
            this.listener.onNativeAdLoaded(BigoAdsMediationAdapter.this.new MaxBigoAdsNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAd.getTitle()).setAdvertiser(nativeAd.getAdvertiser()).setBody(nativeAd.getDescription()).setCallToAction(nativeAd.getCallToAction()).setIconView(imageView).setOptionsView(adOptionsView).setMediaView(mediaView).setMediaContentAspectRatio(nativeAd.getMediaContentAspectRatio())), null);
        }
    }

    private class NativeAdViewListener implements AdLoadListener<NativeAd>, AdInteractionListener {
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad click recorded for slot id: " + this.slotId);
            this.listener.onAdViewAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad impression recorded for slot id: " + this.slotId);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        private NativeAdViewListener(String str, MaxAdFormat maxAdFormat, Bundle bundle, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.slotId = str;
            this.adFormat = maxAdFormat;
            this.serverParameters = bundle;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull NativeAd nativeAd) {
            MaxNativeAdView maxNativeAdView;
            BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded for slot id: " + this.slotId);
            if (nativeAd == null) {
                BigoAdsMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad + (" + nativeAd + ") can 't be null.");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            nativeAd.setAdInteractionListener(BigoAdsMediationAdapter.this.nativeAdViewListener);
            BigoAdsMediationAdapter.this.nativeAd = nativeAd;
            Context applicationContext = BigoAdsMediationAdapter.this.getApplicationContext();
            ImageView imageView = new ImageView(applicationContext);
            AdOptionsView adOptionsView = new AdOptionsView(applicationContext);
            MediaView mediaView = new MediaView(applicationContext);
            BigoAdsMediationAdapter.updateMuteState(this.serverParameters, mediaView);
            MaxBigoAdsNativeAd maxBigoAdsNativeAd = BigoAdsMediationAdapter.this.new MaxBigoAdsNativeAd(new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(nativeAd.getTitle()).setAdvertiser(nativeAd.getAdvertiser()).setBody(nativeAd.getDescription()).setCallToAction(nativeAd.getCallToAction()).setIconView(imageView).setOptionsView(adOptionsView).setMediaView(mediaView));
            String string = BundleUtils.getString("template", "", this.serverParameters);
            if ("vertical".equals(string)) {
                maxNativeAdView = new MaxNativeAdView(maxBigoAdsNativeAd, this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", BigoAdsMediationAdapter.this.getApplicationContext());
            } else {
                maxNativeAdView = new MaxNativeAdView(maxBigoAdsNativeAd, string, BigoAdsMediationAdapter.this.getApplicationContext());
            }
            maxBigoAdsNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView);
            this.listener.onAdViewAdLoaded(maxNativeAdView);
        }
    }

    private class RewardedAdListener implements AdLoadListener<RewardVideoAd>, RewardAdInteractionListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String slotId;

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            BigoAdsMediationAdapter.this.log("Rewarded ad click recorded for slot id: " + this.slotId);
            this.listener.onRewardedAdClicked();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
            if (this.hasGrantedReward || BigoAdsMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = BigoAdsMediationAdapter.this.getReward();
                BigoAdsMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            BigoAdsMediationAdapter.this.log("Rewarded ad hidden for slot id: " + this.slotId);
            this.listener.onRewardedAdHidden();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(@NonNull AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            BigoAdsMediationAdapter.this.log("Rewarded ad (" + this.slotId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            BigoAdsMediationAdapter.this.log("Rewarded ad impression recorded for slot id: " + this.slotId);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
            BigoAdsMediationAdapter.this.log("Rewarded ad opened for slot id: " + this.slotId);
        }

        @Override // sg.bigo.ads.api.RewardAdInteractionListener
        public void onAdRewarded() {
            BigoAdsMediationAdapter.this.log("User earned reward for slot id: " + this.slotId);
            this.hasGrantedReward = true;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(@NonNull AdError adError) {
            MaxAdapterError maxError = BigoAdsMediationAdapter.toMaxError(adError);
            BigoAdsMediationAdapter.this.log("Rewarded ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        private RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.slotId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onAdLoaded(@NonNull RewardVideoAd rewardVideoAd) {
            BigoAdsMediationAdapter.this.log("Rewarded ad loaded for slot id: " + this.slotId);
            BigoAdsMediationAdapter.this.rewardedAd = rewardVideoAd;
            this.listener.onRewardedAdLoaded();
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(DtbConstants.MEDIATION_NAME, "Max");
            jSONObject.putOpt("mediationVersion", AppLovinSdk.VERSION);
            jSONObject.putOpt(C4574uf.f45563b, BuildConfig.VERSION_NAME);
        } catch (Throwable th2) {
            Log.e("BigoAdsMediationAdapter", "Error creating mediation info JSON", th2);
        }
        MEDIATION_INFO = jSONObject.toString();
    }

    public BigoAdsMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @Nullable
    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(sg.bigo.ads.api.AdError r3) {
        /*
            int r0 = r3.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 == r2) goto L37
            r2 = 1001(0x3e9, float:1.403E-42)
            if (r0 == r2) goto L34
            r2 = 1011(0x3f3, float:1.417E-42)
            if (r0 == r2) goto L31
            switch(r0) {
                case 1003: goto L2e;
                case 1004: goto L2b;
                case 1005: goto L28;
                case 1006: goto L25;
                case 1007: goto L22;
                default: goto L15;
            }
        L15:
            switch(r0) {
                case 2000: goto L1f;
                case 2001: goto L1c;
                case 2002: goto L25;
                case 2003: goto L25;
                case 2004: goto L25;
                case 2005: goto L19;
                default: goto L18;
            }
        L18:
            goto L39
        L19:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.MISSING_ACTIVITY
            goto L39
        L1c:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS
            goto L39
        L1f:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L39
        L22:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L39
        L25:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_DISPLAY_FAILED
            goto L39
        L28:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L39
        L2b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L39
        L2e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L39
        L31:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L39
        L34:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L39
        L37:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NOT_INITIALIZED
        L39:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.BigoAdsMediationAdapter.toMaxError(sg.bigo.ads.api.AdError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateMuteState(Bundle bundle, MediaView mediaView) {
        VideoController videoController = mediaView.getVideoController();
        if (!bundle.containsKey("is_muted") || videoController == null) {
            return;
        }
        videoController.mute(bundle.getBoolean("is_muted"));
    }

    private void updateUserConsent(MaxAdapterParameters maxAdapterParameters) {
        Context applicationContext = getApplicationContext();
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            BigoAdSdk.setUserConsent(applicationContext, ConsentOptions.GDPR, boolHasUserConsent.booleanValue());
        }
        if (maxAdapterParameters.isDoNotSell() != null) {
            BigoAdSdk.setUserConsent(applicationContext, ConsentOptions.CCPA, !r4.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserConsent(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(BigoAdSdk.getBidderToken());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return BigoAdSdk.getSDKVersionName();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
        log("Initializing Bigo Ads SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        BigoAdSdk.initialize(getApplicationContext(), new AdConfig.Builder().setAppId(string).setDebug(maxAdapterInitializationParameters.isTesting()).build(), new BigoAdSdk.InitListener() { // from class: com.applovin.mediation.adapters.BigoAdsMediationAdapter.1
            @Override // sg.bigo.ads.BigoAdSdk.InitListener
            public void onInitialized() {
                if (BigoAdSdk.isInitialized()) {
                    BigoAdsMediationAdapter.this.log("Bigo Ads SDK initialized");
                    MaxAdapter.InitializationStatus unused = BigoAdsMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                } else {
                    BigoAdsMediationAdapter.this.log("Bigo Ads SDK failed to initialize");
                    MaxAdapter.InitializationStatus unused2 = BigoAdsMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                }
                onCompletionListener.onCompletion(BigoAdsMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(z10 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for slot id: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        if (!BigoAdSdk.isInitialized()) {
            log("Bigo Ads SDK not successfully initialized: failing " + maxAdFormat.getLabel() + " ad load for slot id: " + thirdPartyAdPlacementId);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserConsent(maxAdapterResponseParameters);
        if (z10) {
            this.nativeAdViewListener = new NativeAdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdapterResponseParameters.getServerParameters(), maxAdViewAdapterListener);
            new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) this.nativeAdViewListener).withExt(MEDIATION_INFO).build().loadAd(new NativeAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).build());
            return;
        }
        AdSize adSize = toAdSize(maxAdFormat);
        if (adSize != null) {
            this.adViewListener = new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener);
            new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.adViewListener).withExt(MEDIATION_INFO).build().loadAd(new BannerAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).withAdSizes(adSize).build());
            return;
        }
        MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_INVALID_CONFIGURATION, "Unsupported ad format: " + maxAdFormat);
        log(maxAdFormat.getLabel() + " ad failed to load with error: " + maxAdapterError);
        maxAdViewAdapterListener.onAdViewAdLoadFailed(maxAdapterError);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading app open ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!BigoAdSdk.isInitialized()) {
            log("Bigo Ads SDK not successfully initialized: failing app open ad load for slot id: " + thirdPartyAdPlacementId);
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateUserConsent(maxAdapterResponseParameters);
        this.appOpenAdListener = new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
        SplashAdLoader splashAdLoaderBuild = new SplashAdLoader.Builder().withAdLoadListener((AdLoadListener<SplashAd>) this.appOpenAdListener).withExt(MEDIATION_INFO).build();
        ApplicationInfo applicationInfo = getApplicationContext().getApplicationInfo();
        splashAdLoaderBuild.loadAd(new SplashAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).withAppLogo(applicationInfo.logo).withAppName(applicationInfo.name).build());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (BigoAdSdk.isInitialized()) {
            updateUserConsent(maxAdapterResponseParameters);
            this.interstitialAdListener = new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener);
            new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) this.interstitialAdListener).withExt(MEDIATION_INFO).build().loadAd(new InterstitialAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("Bigo Ads SDK not successfully initialized: failing interstitial ad load for slot id: " + thirdPartyAdPlacementId);
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading native ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (BigoAdSdk.isInitialized()) {
            updateUserConsent(maxAdapterResponseParameters);
            this.nativeAdListener = new NativeAdListener(thirdPartyAdPlacementId, maxAdapterResponseParameters.getServerParameters(), maxNativeAdAdapterListener);
            new NativeAdLoader.Builder().withAdLoadListener((AdLoadListener<NativeAd>) this.nativeAdListener).withExt(MEDIATION_INFO).build().loadAd(new NativeAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("Bigo Ads SDK not successfully initialized: failing native ad load for slot id: " + thirdPartyAdPlacementId);
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (BigoAdSdk.isInitialized()) {
            updateUserConsent(maxAdapterResponseParameters);
            this.rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
            new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) this.rewardedAdListener).withExt(MEDIATION_INFO).build().loadAd(new RewardVideoAdRequest.Builder().withSlotId(thirdPartyAdPlacementId).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("Bigo Ads SDK not successfully initialized: failing rewarded ad load for slot id: " + thirdPartyAdPlacementId);
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
            this.interstitialAdListener = null;
        }
        SplashAd splashAd = this.appOpenAd;
        if (splashAd != null) {
            splashAd.destroy();
            this.appOpenAd = null;
            this.appOpenAdListener = null;
        }
        RewardVideoAd rewardVideoAd = this.rewardedAd;
        if (rewardVideoAd != null) {
            rewardVideoAd.destroy();
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        BannerAd bannerAd = this.adViewAd;
        if (bannerAd != null) {
            bannerAd.destroy();
            this.adViewAd = null;
            this.adViewListener = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
            this.nativeAdViewListener = null;
            this.nativeAdListener = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing app open ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!this.appOpenAd.isExpired()) {
            this.appOpenAd.setAdInteractionListener((SplashAdInteractionListener) this.appOpenAdListener);
            this.appOpenAd.show();
            return;
        }
        log("Unable to show app open ad for slot id: " + thirdPartyAdPlacementId + " - ad expired");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!this.interstitialAd.isExpired()) {
            this.interstitialAd.setAdInteractionListener(this.interstitialAdListener);
            this.interstitialAd.show();
            return;
        }
        log("Unable to show interstitial ad for slot id: " + thirdPartyAdPlacementId + " - ad expired");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad for slot id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!this.rewardedAd.isExpired()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.setAdInteractionListener((RewardAdInteractionListener) this.rewardedAdListener);
            this.rewardedAd.show();
            return;
        }
        log("Unable to show rewarded ad for slot id: " + thirdPartyAdPlacementId + " - ad expired");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }
}
