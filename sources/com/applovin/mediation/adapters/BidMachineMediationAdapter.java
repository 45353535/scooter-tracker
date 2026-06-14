package com.applovin.mediation.adapters;

import ac.p;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
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
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.adapters.custom.bmwf.BMConstants;
import dc.s;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsFormat;
import io.bidmachine.BidMachine;
import io.bidmachine.BidTokenCallback;
import io.bidmachine.ImageData;
import io.bidmachine.InitializationCallback;
import io.bidmachine.MediaAssetType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l9.d;
import md.d;
import u8.d;

/* JADX INFO: loaded from: classes6.dex */
public class BidMachineMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxNativeAdAdapter {
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 10;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private u8.f adView;
    private l9.a interstitialAd;
    private ac.b nativeAd;
    private md.a rewardedAd;

    private class AdViewListener implements u8.c {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull u8.f fVar) {
            BidMachineMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull u8.f fVar) {
            BidMachineMediationAdapter.this.log("AdView ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull u8.f fVar) {
            BidMachineMediationAdapter.this.log("AdView ad impression");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull u8.f fVar, @NonNull ae.a aVar) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar);
            BidMachineMediationAdapter.this.log("AdView ad failed to load with error (" + maxError + ")");
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull u8.f fVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("AdView ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(fVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onAdViewAdLoaded(fVar, bundle);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull u8.f fVar, @NonNull ae.a aVar) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar.e(), aVar.g());
            BidMachineMediationAdapter.this.log("AdView ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }
    }

    private class InterstitialAdListener implements l9.c {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull l9.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull l9.a aVar, boolean z10) {
            BidMachineMediationAdapter.this.log("Interstitial ad closed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull l9.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull l9.a aVar) {
            BidMachineMediationAdapter.this.log("Interstitial ad impression");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull l9.a aVar, @NonNull ae.a aVar2) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar2);
            BidMachineMediationAdapter.this.log("Interstitial ad failed to load with error (" + maxError + ")");
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull l9.a aVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Interstitial ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(aVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onInterstitialAdLoaded(bundle);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull l9.a aVar, @NonNull ae.a aVar2) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar2.e(), aVar2.g());
            BidMachineMediationAdapter.this.log("Interstitial ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }
    }

    private class MaxBidMachineNativeAd extends MaxNativeAd {
        public MaxBidMachineNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            ac.b bVar = BidMachineMediationAdapter.this.nativeAd;
            if (bVar == null) {
                BidMachineMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            BidMachineMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            HashSet hashSet = new HashSet(list);
            Iterator<View> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageView = null;
                    break;
                }
                View next = it.next();
                if (next instanceof ImageView) {
                    imageView = (ImageView) next;
                    break;
                }
            }
            bVar.j(viewGroup, imageView, (s) getMediaView(), hashSet);
            return true;
        }
    }

    private class NativeAdListener implements ac.k {
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(Bundle bundle, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleNativeAdLoaded(@NonNull final ac.b bVar, final MaxNativeAd.MaxNativeAdImage maxNativeAdImage) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.2
                @Override // java.lang.Runnable
                public void run() {
                    Bundle bundle;
                    MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(bVar.h()).setBody(bVar.e()).setCallToAction(bVar.d()).setIcon(maxNativeAdImage).setOptionsView(bVar.f(BidMachineMediationAdapter.this.getApplicationContext())).setMediaView(new s(BidMachineMediationAdapter.this.getApplicationContext()));
                    if (bVar.getMainImage() != null) {
                        mediaView.setMainImage(new MaxNativeAd.MaxNativeAdImage(bVar.getMainImage().getImage()));
                    }
                    MaxBidMachineNativeAd maxBidMachineNativeAd = BidMachineMediationAdapter.this.new MaxBidMachineNativeAd(mediaView);
                    String creativeId = BidMachineMediationAdapter.this.getCreativeId(bVar.getAuctionResult());
                    if (TextUtils.isEmpty(creativeId)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle(1);
                        bundle.putString("creative_id", creativeId);
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(maxBidMachineNativeAd, bundle);
                }
            });
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull ac.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull ac.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull ac.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad impression");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull ac.b bVar, @NonNull ae.a aVar) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar);
            BidMachineMediationAdapter.this.log("Native ad failed to load with error (" + maxError + ")");
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull final ac.b bVar) {
            BidMachineMediationAdapter.this.log("Native ad loaded");
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(bVar.h())) {
                BidMachineMediationAdapter.this.e("Native ad (" + bVar + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            ImageData icon = bVar.getIcon();
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
            if (icon == null) {
                handleNativeAdLoaded(bVar, null);
                return;
            }
            Drawable image = icon.getImage();
            Uri localUri = icon.getLocalUri();
            final String remoteUrl = icon.getRemoteUrl();
            if (image != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(image);
            } else if (localUri != null) {
                maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(localUri);
            } else if (remoteUrl != null) {
                BidMachineMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Drawable drawable;
                        BidMachineMediationAdapter.this.log("Adding native ad icon (" + remoteUrl + ") to queue to be fetched");
                        BidMachineMediationAdapter bidMachineMediationAdapter = BidMachineMediationAdapter.this;
                        try {
                            drawable = bidMachineMediationAdapter.createDrawableFuture(remoteUrl, bidMachineMediationAdapter.getApplicationContext().getResources()).get(BundleUtils.getInt("image_task_timeout_seconds", 10, NativeAdListener.this.serverParameters), TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            BidMachineMediationAdapter.this.e("Failed to fetch icon image", th2);
                            drawable = null;
                        }
                        NativeAdListener.this.handleNativeAdLoaded(bVar, new MaxNativeAd.MaxNativeAdImage(drawable));
                    }
                });
                return;
            }
            handleNativeAdLoaded(bVar, maxNativeAdImage);
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull ac.b bVar, @NonNull ae.a aVar) {
            BidMachineMediationAdapter.this.log("Native ad failed to show with error (" + aVar + ")");
        }
    }

    private class RewardedAdListener implements md.c {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull md.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // io.bidmachine.AdFullScreenListener
        public void onAdClosed(@NonNull md.a aVar, boolean z10) {
            BidMachineMediationAdapter.this.log("Rewarded ad closed");
            if (this.hasGrantedReward || BidMachineMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = BidMachineMediationAdapter.this.getReward();
                BidMachineMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull md.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad expired");
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull md.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad impression");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull md.a aVar, @NonNull ae.a aVar2) {
            MaxAdapterError maxError = BidMachineMediationAdapter.this.toMaxError(aVar2);
            BidMachineMediationAdapter.this.log("Rewarded ad failed to load with error (" + maxError + ")");
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull md.a aVar) {
            Bundle bundle;
            BidMachineMediationAdapter.this.log("Rewarded ad loaded");
            String creativeId = BidMachineMediationAdapter.this.getCreativeId(aVar.getAuctionResult());
            if (TextUtils.isEmpty(creativeId)) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putString("creative_id", creativeId);
            }
            this.listener.onRewardedAdLoaded(bundle);
        }

        @Override // io.bidmachine.AdRewardedListener
        public void onAdRewarded(@NonNull md.a aVar) {
            BidMachineMediationAdapter.this.log("Rewarded ad should grant reward");
            this.hasGrantedReward = true;
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull md.a aVar, @NonNull ae.a aVar2) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, aVar2.e(), aVar2.g());
            BidMachineMediationAdapter.this.log("Rewarded ad failed to show with error (" + maxAdapterError + ")");
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }
    }

    public BidMachineMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String getCreativeId(@Nullable zb.c cVar) {
        if (cVar != null) {
            return cVar.getCreativeId();
        }
        return null;
    }

    private u8.e toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return u8.e.Size_320x50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return u8.e.Size_728x90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return u8.e.Size_300x250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    @Nullable
    private AdsFormat toAdsFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (adFormat == MaxAdFormat.BANNER) {
            return AdsFormat.Banner_320x50;
        }
        if (adFormat == MaxAdFormat.MREC) {
            return AdsFormat.Banner_300x250;
        }
        if (adFormat == MaxAdFormat.LEADER) {
            return AdsFormat.Banner_728x90;
        }
        if (adFormat == MaxAdFormat.NATIVE) {
            return AdsFormat.Native;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdsFormat.Interstitial;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdsFormat.Rewarded;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.applovin.mediation.adapter.MaxAdapterError toMaxError(ae.a r5) {
        /*
            r4 = this;
            int r0 = r5.e()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L23
            switch(r0) {
                case 100: goto L20;
                case 101: goto L1d;
                case 102: goto L1a;
                case 103: goto L17;
                default: goto Ld;
            }
        Ld:
            switch(r0) {
                case 106: goto L1d;
                case 107: goto L14;
                case 108: goto L1d;
                case 109: goto L23;
                case 110: goto L11;
                default: goto L10;
            }
        L10:
            goto L25
        L11:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L25
        L14:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L25
        L17:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L25
        L1a:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L25
        L1d:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L25
        L20:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L25
        L23:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.SERVER_ERROR
        L25:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            int r3 = r1.getCode()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r5 = r5.g()
            r2.<init>(r3, r1, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.BidMachineMediationAdapter.toMaxError(ae.a):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private void updateSettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            BidMachine.setConsentConfig(boolHasUserConsent.booleanValue(), null);
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            BidMachine.setUSPrivacyString(boolIsDoNotSell.booleanValue() ? BMConstants.BM_CCPA_NO_CONSENT_VALUE : BMConstants.BM_CCPA_CONSENT_VALUE);
        } else {
            BidMachine.setUSPrivacyString("1---");
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal for " + maxAdapterSignalCollectionParameters.getAdFormat().getLabel() + " ad...");
        updateSettings(maxAdapterSignalCollectionParameters);
        AdsFormat adsFormat = toAdsFormat(maxAdapterSignalCollectionParameters);
        if (adsFormat == null) {
            log("Signal collection failed with error: invalid ad format - ad format is null");
            maxSignalCollectionListener.onSignalCollectionFailed("invalid ad format - ad format is null");
            return;
        }
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        AdPlacementConfig.Builder builder = new AdPlacementConfig.Builder(adsFormat);
        Bundle bundle = BundleUtils.getBundle("placement_ids", Bundle.EMPTY, maxAdapterSignalCollectionParameters.getServerParameters());
        if (AppLovinSdkUtils.isValidString(adUnitId)) {
            String string = bundle.getString(adUnitId);
            if (AppLovinSdkUtils.isValidString(string)) {
                builder.withPlacementId(string);
            } else {
                log("No valid slot ID found during signal collection");
            }
        }
        BidMachine.getBidToken(getApplicationContext(), builder.build(), new BidTokenCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.2
            @Override // io.bidmachine.BidTokenCallback
            public void onCollected(@NonNull String str) {
                BidMachineMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "3.5.0.0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(BidMachine.class, "VERSION");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        final String string = maxAdapterInitializationParameters.getServerParameters().getString("source_id");
        log("Initializing BidMachine SDK with source id: " + string);
        BidMachine.setLoggingEnabled(maxAdapterInitializationParameters.isTesting());
        BidMachine.setTestMode(maxAdapterInitializationParameters.isTesting());
        updateSettings(maxAdapterInitializationParameters);
        BidMachine.initialize(getApplicationContext(), string, new InitializationCallback() { // from class: com.applovin.mediation.adapters.BidMachineMediationAdapter.1
            @Override // io.bidmachine.InitializationCallback
            public void onInitialized() {
                BidMachineMediationAdapter.this.log("BidMachine SDK successfully finished initialization with source id: " + string);
                MaxAdapter.InitializationStatus unused = BidMachineMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(BidMachineMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        log("Loading " + maxAdFormat.getLabel() + " ad...");
        updateSettings(maxAdapterResponseParameters);
        u8.f fVar = new u8.f(getApplicationContext());
        this.adView = fVar;
        fVar.setListener(new AdViewListener(maxAdViewAdapterListener));
        this.adView.load((u8.d) ((d.c) new d.c().c(toAdSize(maxAdFormat)).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Loading interstitial ad...");
        updateSettings(maxAdapterResponseParameters);
        l9.a aVar = new l9.a(getApplicationContext());
        this.interstitialAd = aVar;
        aVar.setListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        this.interstitialAd.load((l9.d) ((d.b) new d.b().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        log("Loading native ad...");
        updateSettings(maxAdapterResponseParameters);
        ac.b bVar = new ac.b(getApplicationContext());
        this.nativeAd = bVar;
        bVar.setListener(new NativeAdListener(maxAdapterResponseParameters.getServerParameters(), maxNativeAdAdapterListener));
        this.nativeAd.load((p) ((p.b) new p.b().c(MediaAssetType.All).setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Loading rewarded ad...");
        updateSettings(maxAdapterResponseParameters);
        md.a aVar = new md.a(getApplicationContext());
        this.rewardedAd = aVar;
        aVar.setListener(new RewardedAdListener(maxRewardedAdapterListener));
        this.rewardedAd.load((md.d) ((d.b) new d.b().setBidPayload(maxAdapterResponseParameters.getBidResponse())).build());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        l9.a aVar = this.interstitialAd;
        if (aVar != null) {
            aVar.setListener(null);
            this.interstitialAd.destroy();
            this.interstitialAd = null;
        }
        md.a aVar2 = this.rewardedAd;
        if (aVar2 != null) {
            aVar2.setListener(null);
            this.rewardedAd.destroy();
            this.rewardedAd = null;
        }
        u8.f fVar = this.adView;
        if (fVar != null) {
            fVar.setListener(null);
            this.adView.destroy();
            this.adView = null;
        }
        ac.b bVar = this.nativeAd;
        if (bVar != null) {
            bVar.k();
            this.nativeAd.setListener(null);
            this.nativeAd.destroy();
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (this.interstitialAd.isExpired()) {
            log("Unable to show interstitial - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.interstitialAd.canShow()) {
            this.interstitialAd.show();
            return;
        }
        log("Unable to show interstitial - ad not ready");
        MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedAd.isExpired()) {
            log("Unable to show rewarded ad - ad expired");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_EXPIRED;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (this.rewardedAd.canShow()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        } else {
            log("Unable to show rewarded ad - ad not ready");
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
        }
    }
}
