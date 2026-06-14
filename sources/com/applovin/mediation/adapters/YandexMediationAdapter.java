package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.yandex.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class YandexMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static MaxAdapter.InitializationStatus status;
    private BannerAdView adView;
    private InterstitialAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final Map<String, String> adRequestParameters = new HashMap<String, String>() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.1
        {
            put("adapter_network_name", "applovin");
            put("adapter_version", BuildConfig.VERSION_NAME);
            put("adapter_network_sdk_version", AppLovinSdk.VERSION);
        }
    };

    private class AdViewListener implements BannerAdEventListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        AdViewListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onAdViewAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdLoaded() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad loaded");
            Bundle bundle = new Bundle(2);
            if (YandexMediationAdapter.this.adView != null) {
                BannerAdSize adSize = YandexMediationAdapter.this.adView.getAdSize();
                bundle.putInt("ad_width", adSize.getWidth());
                bundle.putInt("ad_height", adSize.getHeight());
            }
            this.listener.onAdViewAdLoaded(YandexMediationAdapter.this.adView, bundle);
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("AdView ad impression tracked");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad left application after click");
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad returned to application");
        }
    }

    private class InterstitialAdListener implements InterstitialAdLoadListener, InterstitialAdEventListener {
        private final MaxInterstitialAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        InterstitialAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Interstitial ad dismissed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log("Interstitial ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onInterstitialAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdFailedToShow(@NonNull AdError adError) {
            YandexMediationAdapter.this.log("Interstitial ad failed to show with error description: " + adError.getDescription());
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adError.getDescription()));
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Interstitial ad impression tracked");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            YandexMediationAdapter.this.log("Interstitial ad loaded");
            YandexMediationAdapter.this.interstitialAd = interstitialAd;
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Interstitial ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onInterstitialAdDisplayed();
            }
        }
    }

    private class MaxYandexNativeAd extends MaxNativeAd {
        public MaxYandexNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        private TextView createTextViewIfNeeded(View view) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            TextView textView = new TextView(view.getContext());
            textView.setAlpha(0.0f);
            ((ViewGroup) view).addView(textView);
            return textView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            TextView textViewCreateTextViewIfNeeded;
            if (YandexMediationAdapter.this.nativeAd == null) {
                YandexMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            YandexMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                View mainView = maxNativeAdView.getMainView();
                maxNativeAdView.removeView(mainView);
                YandexMediationAdapter.this.nativeAdView.addView(mainView);
                maxNativeAdView.addView(YandexMediationAdapter.this.nativeAdView);
                try {
                    YandexMediationAdapter.this.nativeAd.bindNativeAd(new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView).setIconView(maxNativeAdView.getIconImageView()).setTitleView(maxNativeAdView.getTitleTextView()).setDomainView(maxNativeAdView.getAdvertiserTextView()).setBodyView(maxNativeAdView.getBodyTextView()).setMediaView((MediaView) getMediaView()).setFeedbackView((ImageView) getOptionsView()).setCallToActionView(maxNativeAdView.getCallToActionButton()).build());
                    YandexMediationAdapter.this.nativeAdView.setVisibility(0);
                } catch (NativeAdException e10) {
                    YandexMediationAdapter.this.e("Failed to register native ad views.", e10);
                }
            } else {
                try {
                    MediaView mediaView = (MediaView) getMediaView();
                    ViewGroup viewGroup2 = (ViewGroup) mediaView.getParent();
                    viewGroup2.removeView(mediaView);
                    YandexMediationAdapter.this.nativeAdView.addView(mediaView, new ViewGroup.LayoutParams(-1, -1));
                    if ((viewGroup2 instanceof RelativeLayout) || (viewGroup2 instanceof FrameLayout)) {
                        viewGroup2.addView(YandexMediationAdapter.this.nativeAdView, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        YandexMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup2.getHeight(), 1073741824));
                        YandexMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup2.getWidth(), viewGroup2.getHeight());
                        viewGroup2.addView(YandexMediationAdapter.this.nativeAdView);
                    }
                    NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView);
                    builder.setMediaView(mediaView);
                    for (View view : list) {
                        Object tag = view.getTag();
                        if (tag != null) {
                            int iIntValue = ((Integer) tag).intValue();
                            if (iIntValue == 3) {
                                if (view instanceof ImageView) {
                                    builder.setIconView((ImageView) view);
                                }
                            } else if (iIntValue == 1) {
                                TextView textViewCreateTextViewIfNeeded2 = createTextViewIfNeeded(view);
                                if (textViewCreateTextViewIfNeeded2 != null) {
                                    builder.setTitleView(textViewCreateTextViewIfNeeded2);
                                }
                            } else if (iIntValue == 8) {
                                TextView textViewCreateTextViewIfNeeded3 = createTextViewIfNeeded(view);
                                if (textViewCreateTextViewIfNeeded3 != null) {
                                    builder.setDomainView(textViewCreateTextViewIfNeeded3);
                                }
                            } else if (iIntValue == 4) {
                                TextView textViewCreateTextViewIfNeeded4 = createTextViewIfNeeded(view);
                                if (textViewCreateTextViewIfNeeded4 != null) {
                                    builder.setBodyView(textViewCreateTextViewIfNeeded4);
                                }
                            } else if (iIntValue == 5 && (textViewCreateTextViewIfNeeded = createTextViewIfNeeded(view)) != null) {
                                builder.setCallToActionView(textViewCreateTextViewIfNeeded);
                            }
                        }
                    }
                    YandexMediationAdapter.this.nativeAd.bindNativeAd(builder.build());
                    YandexMediationAdapter.this.nativeAdView.setVisibility(0);
                } catch (Throwable th2) {
                    YandexMediationAdapter.this.e("Failed to register native ad views.", th2);
                }
            }
            return true;
        }
    }

    private class NativeAdListener implements NativeAdLoadListener, NativeAdEventListener {
        private final Context applicationContext;
        private final MaxNativeAdAdapterListener listener;
        private final String placementId;
        private final Bundle serverParameters;

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            MaxAdapterError maxError = YandexMediationAdapter.toMaxError(adRequestError);
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdLoaded(@NonNull NativeAd nativeAd) {
            YandexMediationAdapter.this.log("Native ad loaded: " + this.placementId);
            YandexMediationAdapter.this.nativeAd = nativeAd;
            nativeAd.setNativeAdEventListener(this);
            final NativeAdAssets adAssets = nativeAd.getAdAssets();
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(adAssets.getTitle())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(adAssets.getTitle()).setAdvertiser(adAssets.getDomain()).setBody(adAssets.getBody()).setCallToAction(adAssets.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(adAssets.getIcon() != null ? new BitmapDrawable(NativeAdListener.this.applicationContext.getResources(), adAssets.getIcon().getBitmap()) : null)).setOptionsView(new ImageView(NativeAdListener.this.applicationContext)).setMediaView(new MediaView(NativeAdListener.this.applicationContext));
                        if (AppLovinSdk.VERSION_CODE >= 11070000 && adAssets.getRating() != null) {
                            mediaView.setStarRating(Double.valueOf(adAssets.getRating().floatValue()));
                        }
                        NativeAdListener.this.listener.onNativeAdLoaded(YandexMediationAdapter.this.new MaxYandexNativeAd(mediaView), null);
                    }
                });
                return;
            }
            YandexMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") left application");
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log("Native ad (" + this.placementId + ") returned to application");
        }

        private NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }
    }

    private class RewardedAdListener implements RewardedAdLoadListener, RewardedAdEventListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        RewardedAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Rewarded ad hidden");
            if (this.hasGrantedReward || YandexMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = YandexMediationAdapter.this.getReward();
                YandexMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
            YandexMediationAdapter.this.log("Rewarded ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onRewardedAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdFailedToShow(@NonNull AdError adError) {
            YandexMediationAdapter.this.log("Rewarded ad failed to show with error description: " + adError.getDescription());
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adError.getDescription()));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdImpression(@Nullable ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Rewarded ad impression tracked");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            YandexMediationAdapter.this.log("Rewarded ad loaded");
            YandexMediationAdapter.this.rewardedAd = rewardedAd;
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Rewarded ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onRewardedAdDisplayed();
            }
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onRewarded(@NonNull Reward reward) {
            YandexMediationAdapter.this.log("Rewarded user with reward: " + reward.getAmount() + " " + reward.getType());
            this.hasGrantedReward = true;
        }
    }

    public YandexMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        AdRequest.Builder parameters = new AdRequest.Builder().setParameters(adRequestParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            parameters.setBiddingData(bidResponse);
        }
        return parameters.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequestConfiguration createAdRequestConfiguration(String str, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        AdRequestConfiguration.Builder parameters = new AdRequestConfiguration.Builder(str).setParameters(adRequestParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            parameters.setBiddingData(bidResponse);
        }
        return parameters.build();
    }

    private BidderTokenRequestConfiguration createBidderTokenRequestConfiguration(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Context context, MaxAdFormat maxAdFormat) {
        AdType adType = toAdType(maxAdFormat);
        BidderTokenRequestConfiguration.Builder builder = new BidderTokenRequestConfiguration.Builder(adType);
        if (adType == AdType.BANNER) {
            Object obj = maxAdapterSignalCollectionParameters.getLocalExtraParameters().get("adaptive_banner");
            boolean z10 = false;
            boolean z11 = (obj instanceof String) && "true".equalsIgnoreCase((String) obj);
            if (!z11 || AppLovinSdk.VERSION_CODE >= 13020099) {
                z10 = z11;
            } else {
                userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Yandex adaptive ads");
            }
            builder.setBannerAdSize(toYandexBannerAdSize(maxAdFormat, z10, maxAdapterSignalCollectionParameters, context));
        }
        return builder.setParameters(adRequestParameters).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NativeAdRequestConfiguration createNativeAdRequestConfiguration(String str, MaxAdapterResponseParameters maxAdapterResponseParameters) {
        NativeAdRequestConfiguration.Builder shouldLoadImagesAutomatically = new NativeAdRequestConfiguration.Builder(str).setParameters(adRequestParameters).setShouldLoadImagesAutomatically(true);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            shouldLoadImagesAutomatically.setBiddingData(bidResponse);
        }
        return shouldLoadImagesAutomatically.build();
    }

    private BannerAdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveAdViewWidth = getAdaptiveAdViewWidth(maxAdapterParameters, context);
        if (!isInlineAdaptiveAdView(maxAdapterParameters)) {
            return BannerAdSize.fixedSize(context, adaptiveAdViewWidth, MaxAdFormat.BANNER.getAdaptiveSize(adaptiveAdViewWidth, context).getHeight());
        }
        int inlineAdaptiveAdViewMaximumHeight = getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters);
        return inlineAdaptiveAdViewMaximumHeight > 0 ? BannerAdSize.inlineSize(context, adaptiveAdViewWidth, inlineAdaptiveAdViewMaximumHeight) : BannerAdSize.inlineSize(context, adaptiveAdViewWidth, AppLovinSdkUtils.pxToDp(context, context.getResources().getDisplayMetrics().heightPixels));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplication() : getApplicationContext();
    }

    private void loadAdOnUiThread(Runnable runnable) {
        if (AppLovinSdk.VERSION_CODE >= 11080300) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    }

    private static AdType toAdType(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? AdType.BANNER : maxAdFormat == MaxAdFormat.INTERSTITIAL ? AdType.INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? AdType.REWARDED : maxAdFormat == MaxAdFormat.APP_OPEN ? AdType.APP_OPEN_AD : maxAdFormat == MaxAdFormat.NATIVE ? AdType.NATIVE : AdType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.yandex.mobile.ads.common.AdRequestError r3) {
        /*
            int r0 = r3.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            if (r0 == 0) goto L23
            r2 = 1
            if (r0 == r2) goto L21
            r2 = 2
            if (r0 == r2) goto L1e
            r2 = 3
            if (r0 == r2) goto L1b
            r2 = 4
            if (r0 == r2) goto L18
            r2 = 5
            if (r0 == r2) goto L21
            goto L23
        L18:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L23
        L1b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L23
        L1e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L23
        L21:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L23:
            com.applovin.mediation.adapter.MaxAdapterError r0 = new com.applovin.mediation.adapter.MaxAdapterError
            int r2 = r3.getCode()
            java.lang.String r3 = r3.getDescription()
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.YandexMediationAdapter.toMaxError(com.yandex.mobile.ads.common.AdRequestError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BannerAdSize toYandexBannerAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (maxAdFormat.isAdViewAd()) {
            return (z10 && isAdaptiveAdViewFormat(maxAdFormat, maxAdapterParameters)) ? getAdaptiveAdSize(maxAdapterParameters, context) : BannerAdSize.fixedSize(context, maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight());
        }
        throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
    }

    private void updatePrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            MobileAds.setUserConsent(boolHasUserConsent.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacySettings(maxAdapterSignalCollectionParameters);
        Context context = getContext(activity);
        BidderTokenLoader.loadBidderToken(context, createBidderTokenRequestConfiguration(maxAdapterSignalCollectionParameters, context, maxAdapterSignalCollectionParameters.getAdFormat()), new BidderTokenLoadListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.3
            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenFailedToLoad(@NonNull String str) {
                YandexMediationAdapter.this.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }

            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenLoaded(@NonNull String str) {
                YandexMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!INITIALIZED.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Initializing Yandex SDK");
        sb2.append(maxAdapterInitializationParameters.isTesting() ? " in test mode " : "");
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        updatePrivacySettings(maxAdapterInitializationParameters);
        if (maxAdapterInitializationParameters.isTesting()) {
            MobileAds.enableLogging(true);
        }
        MobileAds.initialize(getContext(activity), new InitializationListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.2
            @Override // com.yandex.mobile.ads.common.InitializationListener
            public void onInitializationCompleted() {
                YandexMediationAdapter.this.log("Yandex SDK initialized");
                MaxAdapter.InitializationStatus unused = YandexMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                onCompletionListener.onCompletion(YandexMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, @Nullable final Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        final String label = maxAdFormat.getLabel();
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(label);
        sb2.append(" ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        final Context context = getContext(activity);
        updatePrivacySettings(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = false;
                boolean z11 = maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false);
                if (!z11 || AppLovinSdk.VERSION_CODE >= 13020099) {
                    z10 = z11;
                } else {
                    YandexMediationAdapter.this.userError("Please update AppLovin MAX SDK to version 13.2.0 or higher in order to use Yandex adaptive ads");
                }
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                BannerAdSize yandexBannerAdSize = yandexMediationAdapter.toYandexBannerAdSize(maxAdFormat, z10, maxAdapterResponseParameters, yandexMediationAdapter.getContext(activity));
                YandexMediationAdapter.this.adView = new BannerAdView(context);
                YandexMediationAdapter.this.adView.setAdUnitId(thirdPartyAdPlacementId);
                YandexMediationAdapter.this.adView.setAdSize(yandexBannerAdSize);
                YandexMediationAdapter.this.adView.setBannerAdEventListener(YandexMediationAdapter.this.new AdViewListener(label, maxAdViewAdapterListener));
                YandexMediationAdapter.this.adView.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable final Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append("interstitial ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        updatePrivacySettings(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(YandexMediationAdapter.this.getContext(activity));
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.interstitialAdListener = yandexMediationAdapter.new InterstitialAdListener(maxAdapterResponseParameters, maxInterstitialAdapterListener);
                interstitialAdLoader.setAdLoadListener(YandexMediationAdapter.this.interstitialAdListener);
                interstitialAdLoader.loadAd(YandexMediationAdapter.this.createAdRequestConfiguration(thirdPartyAdPlacementId, maxAdapterResponseParameters));
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "");
        sb2.append("native ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        final Context context = getContext(activity);
        updatePrivacySettings(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                NativeAdLoader nativeAdLoader = new NativeAdLoader(context);
                nativeAdLoader.setNativeAdLoadListener(new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener));
                nativeAdLoader.loadAd(YandexMediationAdapter.this.createNativeAdRequestConfiguration(thirdPartyAdPlacementId, maxAdapterResponseParameters));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable final Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append("rewarded ad for placement: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        updatePrivacySettings(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(YandexMediationAdapter.this.getContext(activity));
                YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
                yandexMediationAdapter.rewardedAdListener = yandexMediationAdapter.new RewardedAdListener(maxAdapterResponseParameters, maxRewardedAdapterListener);
                rewardedAdLoader.setAdLoadListener(YandexMediationAdapter.this.rewardedAdListener);
                rewardedAdLoader.loadAd(YandexMediationAdapter.this.createAdRequestConfiguration(thirdPartyAdPlacementId, maxAdapterResponseParameters));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(null);
            this.interstitialAdListener = null;
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
            this.rewardedAdListener = null;
            this.rewardedAd = null;
        }
        BannerAdView bannerAdView = this.adView;
        if (bannerAdView != null) {
            bannerAdView.destroy();
            this.adView = null;
        }
        this.nativeAd = null;
        this.nativeAdView = null;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    @Nullable
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            log("Interstitial ad failed to show - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (activity == null) {
            log("Interstitial ad display failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            interstitialAd.setAdEventListener(this.interstitialAdListener);
            this.interstitialAd.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd == null) {
            log("Rewarded ad failed to show - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (activity == null) {
            log("Rewarded ad display failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.setAdEventListener(this.rewardedAdListener);
            this.rewardedAd.show(activity);
        }
    }
}
