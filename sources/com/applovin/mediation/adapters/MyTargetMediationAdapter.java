package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import com.applovin.mediation.adapters.mytarget.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.factories.NativeViewsFactory;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.NativeAdView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class MyTargetMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private MyTargetView adView;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;

    private class AdViewListener implements MyTargetView.MyTargetViewListener {
        private final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view loaded");
            this.listener.onAdViewAdLoaded(myTargetView);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull MyTargetView myTargetView) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Ad view failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(@NonNull MyTargetView myTargetView) {
            MyTargetMediationAdapter.this.log("Ad view displayed");
            this.listener.onAdViewAdDisplayed();
        }
    }

    private class InterstitialListener implements InterstitialAd.InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onClick(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDismiss(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial dismissed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDisplay(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial displayed");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onFailedToShow(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial ad display failed");
            this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onLoad(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull InterstitialAd interstitialAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Interstitial failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onVideoCompleted(@NonNull InterstitialAd interstitialAd) {
            MyTargetMediationAdapter.this.log("Interstitial video completed");
        }
    }

    private class MaxMyTargetNativeAd extends MaxNativeAd {
        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            NativeAd nativeAd = MyTargetMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                MyTargetMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            MyTargetMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            nativeAd.registerView(viewGroup, list);
            return true;
        }

        private MaxMyTargetNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }
    }

    private class NativeAdListener implements NativeAd.NativeAdListener, NativeAd.NativeAdMediaListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;
        private final String slotId;

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.slotId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad clicked: " + this.slotId);
            this.listener.onNativeAdClicked();
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdMediaListener
        public void onIconLoad(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad icon loaded: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdMediaListener
        public void onImageLoad(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad image loaded: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onLoad(@NonNull NativePromoBanner nativePromoBanner, @NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad loaded: " + this.slotId);
            if (MyTargetMediationAdapter.this.nativeAd != nativeAd) {
                MyTargetMediationAdapter.this.e("Mismatched instance of native ads - adapter: " + MyTargetMediationAdapter.this.nativeAd + " and listener: " + nativeAd);
                this.listener.onNativeAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
                return;
            }
            boolean zIsValidString = AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters));
            NativePromoBanner banner = nativeAd.getBanner();
            if (zIsValidString && TextUtils.isEmpty(banner.getTitle())) {
                MyTargetMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            ImageData icon = banner.getIcon();
            ImageData image = banner.getImage();
            MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(this.context);
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = icon != null ? icon.getBitmap() != null ? new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(this.context.getResources(), icon.getBitmap())) : new MaxNativeAd.MaxNativeAdImage(Uri.parse(icon.getUrl())) : null;
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage2 = image != null ? image.getBitmap() != null ? new MaxNativeAd.MaxNativeAdImage(new BitmapDrawable(this.context.getResources(), image.getBitmap())) : new MaxNativeAd.MaxNativeAdImage(Uri.parse(image.getUrl())) : null;
            MyTargetMediationAdapter.this.nativeAdView = NativeViewsFactory.getNativeAdView(this.context);
            MyTargetMediationAdapter.this.nativeAdView.setupView(nativeAd.getBanner());
            this.listener.onNativeAdLoaded(new MaxMyTargetNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(banner.getTitle()).setBody(banner.getDescription()).setCallToAction(banner.getCtaText()).setIcon(maxNativeAdImage).setMediaView(mediaAdView).setAdvertiser(banner.getAdvertisingLabel()).setMainImage(maxNativeAdImage2).setMediaContentAspectRatio(mediaAdView.getMediaAspectRatio())), null);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull NativeAd nativeAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Native ad (" + this.slotId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onShow(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad shown: " + this.slotId);
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoComplete(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video completed: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPause(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video paused: " + this.slotId);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPlay(@NonNull NativeAd nativeAd) {
            MyTargetMediationAdapter.this.log("Native ad video started: " + this.slotId);
        }
    }

    private class RewardedAdListener implements RewardedAd.RewardedAdListener {
        private boolean hasGrantedReward = false;
        private final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(@NonNull RewardedAd rewardedAd) {
            if (this.hasGrantedReward || MyTargetMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = MyTargetMediationAdapter.this.getReward();
                MyTargetMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            MyTargetMediationAdapter.this.log("Rewarded ad dismissed");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad display failed");
            this.listener.onRewardedAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(@NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(@NonNull IAdLoadingError iAdLoadingError, @NonNull RewardedAd rewardedAd) {
            MaxAdapterError maxError = MyTargetMediationAdapter.toMaxError(iAdLoadingError);
            MyTargetMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(@NonNull Reward reward, @NonNull RewardedAd rewardedAd) {
            MyTargetMediationAdapter.this.log("Rewarded ad reward granted");
            this.hasGrantedReward = true;
        }
    }

    public MyTargetMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private static MyTargetView.AdSize getBannerSize(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.BANNER ? MyTargetView.AdSize.ADSIZE_320x50 : maxAdFormat == MaxAdFormat.MREC ? MyTargetView.AdSize.ADSIZE_300x250 : maxAdFormat == MaxAdFormat.LEADER ? MyTargetView.AdSize.ADSIZE_728x90 : MyTargetView.AdSize.ADSIZE_320x50;
    }

    private Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.my.target.common.models.IAdLoadingError r3) {
        /*
            int r0 = r3.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 1403(0x57b, float:1.966E-42)
            if (r0 == r2) goto L37
            r2 = 1404(0x57c, float:1.967E-42)
            if (r0 == r2) goto L37
            r2 = 1500(0x5dc, float:2.102E-42)
            if (r0 == r2) goto L37
            r2 = 4001(0xfa1, float:5.607E-42)
            if (r0 == r2) goto L34
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 == r2) goto L37
            r2 = 5001(0x1389, float:7.008E-42)
            if (r0 == r2) goto L31
            switch(r0) {
                case 1000: goto L37;
                case 1001: goto L2e;
                case 1002: goto L2b;
                case 1003: goto L28;
                default: goto L21;
            }
        L21:
            switch(r0) {
                case 2000: goto L37;
                case 2001: goto L37;
                case 2002: goto L2e;
                case 2003: goto L2e;
                case 2004: goto L2e;
                case 2005: goto L2e;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 3000: goto L2e;
                case 3001: goto L2e;
                case 3002: goto L2e;
                case 3003: goto L31;
                case 3004: goto L2e;
                default: goto L27;
            }
        L27:
            goto L39
        L28:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L39
        L2b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L39
        L2e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L39
        L31:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L39
        L34:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
            goto L39
        L37:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L39:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.MyTargetMediationAdapter.toMaxError(com.my.target.common.models.IAdLoadingError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private void updatePrivacyStates(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            MyTargetPrivacy.setUserConsent(boolHasUserConsent.booleanValue());
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            MyTargetPrivacy.setCcpaUserConsent(boolIsDoNotSell.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updatePrivacyStates(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(MyTargetManager.getBidderToken(getContext(activity)));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(MyTargetVersion.class, "VERSION");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (initialized.compareAndSet(false, true)) {
            if (maxAdapterInitializationParameters.isTesting()) {
                MyTargetManager.setDebugMode(true);
            }
            log("Initializing myTarget SDK... ");
            MyTargetManager.initSdk(getContext(activity));
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int i10 = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(" ad view with format: ");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" for slot id: ");
        sb2.append(i10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        MyTargetView myTargetView = new MyTargetView(getContext(activity));
        this.adView = myTargetView;
        myTargetView.setSlotId(i10);
        this.adView.setAdSize(getBannerSize(maxAdFormat));
        this.adView.setRefreshAd(false);
        this.adView.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.adView.load();
        } else {
            this.adView.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        int i10 = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(" interstitial ad for slot id: ");
        sb2.append(i10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        InterstitialAd interstitialAd = new InterstitialAd(i10, getContext(activity));
        this.interstitialAd = interstitialAd;
        interstitialAd.setListener(new InterstitialListener(maxInterstitialAdapterListener));
        this.interstitialAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.interstitialAd.load();
        } else {
            this.interstitialAd.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        int i10 = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(" native ad for slot id: ");
        sb2.append(i10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        NativeAd nativeAd = new NativeAd(i10, getContext(activity));
        this.nativeAd = nativeAd;
        nativeAd.setListener(nativeAdListener);
        this.nativeAd.setMediaListener(nativeAdListener);
        this.nativeAd.getCustomParams().setCustomParam("mediation", "7");
        this.nativeAd.setAdChoicesPlacement(maxAdapterResponseParameters.getServerParameters().getInt("ad_choices_placement", 0));
        this.nativeAd.setCachePolicy(maxAdapterResponseParameters.getServerParameters().getInt("cache_policy", 0));
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.nativeAd.load();
        } else {
            this.nativeAd.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        int i10 = Integer.parseInt(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(" rewarded ad for slot id: ");
        sb2.append(i10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        RewardedAd rewardedAd = new RewardedAd(i10, getContext(activity));
        this.rewardedAd = rewardedAd;
        rewardedAd.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.getCustomParams().setCustomParam("mediation", "7");
        updatePrivacyStates(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            this.rewardedAd.load();
        } else {
            this.rewardedAd.loadFromBid(bidResponse);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.rewardedAd = null;
        }
        MyTargetView myTargetView = this.adView;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.setListener(null);
            this.nativeAd.unregisterView();
            this.nativeAd = null;
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show();
            return;
        }
        log("Interstitial ad is null");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Rewarded ad is null");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.INVALID_LOAD_STATE;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }
}
