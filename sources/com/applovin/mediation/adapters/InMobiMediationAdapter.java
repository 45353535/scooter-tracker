package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.inmobi.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class InMobiMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxNativeAdAdapter, MaxSignalProvider {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 5;
    private static final float DEFAULT_MEDIA_CONTENT_ASPECT_RATIO = 1.9050859f;
    private static final int ICON_VIEW_TAG = 3;
    private static final String KEY_PARTNER_GDPR_CONSENT = "partner_gdpr_consent_available";
    private static final int RATING_VIEW_TAG = 6;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private InMobiBanner adView;
    private InMobiInterstitial interstitialAd;
    private InMobiNative nativeAd;
    private InMobiInterstitial rewardedAd;

    /* JADX INFO: renamed from: com.applovin.mediation.adapters.InMobiMediationAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode = iArr;
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private class AdViewListener extends BannerAdEventListener {
        final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiBanner inMobiBanner, Map map) {
            onAdClicked2(inMobiBanner, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onAdDismissed(@NonNull InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onAdDisplayed(@NonNull InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView expanded");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.inmobi.ads.listeners.BannerAdEventListener
        public void onUserLeftApplication(@NonNull InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView will leave application");
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public void onAdClicked2(@NonNull InMobiBanner inMobiBanner, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("AdView clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdImpression(@NonNull InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView impression tracked");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(@NonNull InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter.this.log("AdView failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
            this.listener.onAdViewAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(@NonNull InMobiBanner inMobiBanner, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("AdView loaded");
            if (TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onAdViewAdLoaded(inMobiBanner);
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", adMetaInfo.getCreativeID());
            this.listener.onAdViewAdLoaded(inMobiBanner, bundle);
        }
    }

    private class InterstitialListener extends InterstitialAdEventListener {
        final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiInterstitial inMobiInterstitial, Map map) {
            onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial failed to display");
            this.listener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial did show");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will show");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will leave application");
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public void onAdClicked2(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdFetchSuccessful(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial request succeeded");
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdImpression(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial impression tracked");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(@NonNull InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter.this.log("Interstitial failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
            this.listener.onInterstitialAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial loaded");
            if (TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onInterstitialAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", adMetaInfo.getCreativeID());
            this.listener.onInterstitialAdLoaded(bundle);
        }
    }

    private class MaxInMobiNativeAd extends MaxNativeAd {
        private final MaxAdFormat format;
        private final MaxAdapterListener listener;

        public MaxInMobiNativeAd(MaxAdapterListener maxAdapterListener, MaxNativeAd.Builder builder, MaxAdFormat maxAdFormat) {
            super(builder);
            this.listener = maxAdapterListener;
            this.format = maxAdFormat;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            InMobiNative inMobiNative = InMobiMediationAdapter.this.nativeAd;
            if (inMobiNative == null) {
                InMobiMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder(viewGroup);
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                if (maxNativeAdView.getTitleTextView() != null) {
                    builder.setTitleView(maxNativeAdView.getTitleTextView());
                }
                if (maxNativeAdView.getIconImageView() != null) {
                    builder.setIconView(maxNativeAdView.getIconImageView());
                }
                if (maxNativeAdView.getBodyTextView() != null) {
                    builder.setDescriptionView(maxNativeAdView.getBodyTextView());
                }
                if (maxNativeAdView.getCallToActionButton() != null) {
                    builder.setCTAView(maxNativeAdView.getCallToActionButton());
                }
                if (maxNativeAdView.getStarRatingContentViewGroup() != null) {
                    builder.setRatingView(maxNativeAdView.getStarRatingContentViewGroup());
                }
                if (maxNativeAdView.getAdvertiserTextView() != null) {
                    builder.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
                }
            } else {
                for (View view : list) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue == 1) {
                            builder.setTitleView(view);
                        } else if (iIntValue == 3) {
                            if (view instanceof ImageView) {
                                builder.setIconView((ImageView) view);
                            }
                        } else if (iIntValue == 4) {
                            builder.setDescriptionView(view);
                        } else if (iIntValue == 5) {
                            builder.setCTAView(view);
                        } else if (iIntValue == 6) {
                            builder.setRatingView(view);
                        } else if (iIntValue == 8) {
                            builder.setAdvertiserView(view);
                        }
                    }
                }
            }
            inMobiNative.registerViewForTracking(builder.build());
            return true;
        }
    }

    private class NativeAdListener extends NativeAdEventListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final float mediaContentAspectRatio;
        private final String placementId;
        private final Bundle serverParameters;

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.mediaContentAspectRatio = InMobiMediationAdapter.this.getNativeAdMediaContentAspectRatio(maxAdapterResponseParameters);
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleNativeAdLoaded(@NonNull final InMobiNative inMobiNative, @NonNull final AdMetaInfo adMetaInfo, final Drawable drawable) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.InMobiMediationAdapter.NativeAdListener.2
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAd.Builder builder = new MaxNativeAd.Builder();
                    MaxAdFormat maxAdFormat = MaxAdFormat.NATIVE;
                    MaxNativeAd.Builder starRating = builder.setAdFormat(maxAdFormat).setTitle(inMobiNative.getAdTitle()).setAdvertiser(inMobiNative.getAdvertiserName()).setBody(inMobiNative.getAdDescription()).setCallToAction(inMobiNative.getCtaText()).setIcon(new MaxNativeAd.MaxNativeAdImage(drawable)).setMediaView(inMobiNative.getMediaView()).setMediaContentAspectRatio(NativeAdListener.this.mediaContentAspectRatio).setStarRating(Double.valueOf(inMobiNative.getAdRating()));
                    NativeAdListener nativeAdListener = NativeAdListener.this;
                    MaxInMobiNativeAd maxInMobiNativeAd = InMobiMediationAdapter.this.new MaxInMobiNativeAd(nativeAdListener.listener, starRating, maxAdFormat);
                    if (!AppLovinSdkUtils.isValidString(adMetaInfo.getCreativeID())) {
                        NativeAdListener.this.listener.onNativeAdLoaded(maxInMobiNativeAd, null);
                        return;
                    }
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", adMetaInfo.getCreativeID());
                    NativeAdListener.this.listener.onNativeAdLoaded(maxInMobiNativeAd, bundle);
                }
            });
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdClicked(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDismissed(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad fullscreen dismissed");
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDisplayed(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad fullscreen displayed");
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onUserWillLeaveApplication(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad user will leave application");
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdImpression(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(@NonNull InMobiNative inMobiNative, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
            MaxAdapterError maxError = InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus);
            InMobiMediationAdapter.this.log("Native ad failed to load with error " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(final InMobiNative inMobiNative, @NonNull final AdMetaInfo adMetaInfo) {
            if (InMobiMediationAdapter.this.nativeAd == null || inMobiNative == null || InMobiMediationAdapter.this.nativeAd != inMobiNative) {
                InMobiMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(inMobiNative.getAdTitle())) {
                InMobiMediationAdapter.this.log("Native ad loaded: " + this.placementId);
                InMobiMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.InMobiMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NativeAdListener.this.handleNativeAdLoaded(inMobiNative, adMetaInfo, InMobiMediationAdapter.this.fetchNativeAdIcon(inMobiNative.getAdIcon(), NativeAdListener.this.serverParameters, NativeAdListener.this.context));
                    }
                });
                return;
            }
            InMobiMediationAdapter.this.e("Native ad (" + inMobiNative + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }
    }

    private class NativeAdViewListener extends NativeAdEventListener {
        private final WeakReference<Activity> activityRef;
        private final MaxAdFormat adFormat;
        private final MaxAdViewAdapterListener listener;
        private final float mediaContentAspectRatio;
        private final String placementId;
        private final Bundle serverParameters;

        NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.mediaContentAspectRatio = InMobiMediationAdapter.this.getNativeAdMediaContentAspectRatio(maxAdapterResponseParameters);
            this.adFormat = maxAdFormat;
            this.activityRef = new WeakReference<>(activity);
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdClicked(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDismissed(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad fullscreen dismissed");
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onAdFullScreenDisplayed(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad fullscreen displayed");
        }

        @Override // com.inmobi.ads.listeners.NativeAdEventListener
        public void onUserWillLeaveApplication(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad user will leave application");
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdImpression(@NonNull InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(@NonNull InMobiNative inMobiNative, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
            MaxAdapterError maxError = InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus);
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(final InMobiNative inMobiNative, @NonNull final AdMetaInfo adMetaInfo) {
            if (InMobiMediationAdapter.this.nativeAd == null || inMobiNative == null || InMobiMediationAdapter.this.nativeAd != inMobiNative) {
                InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            InMobiMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded: " + this.placementId);
            final Context context = InMobiMediationAdapter.this.getContext(this.activityRef.get());
            InMobiMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.InMobiMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    final Drawable drawableFetchNativeAdIcon = InMobiMediationAdapter.this.fetchNativeAdIcon(inMobiNative.getAdIcon(), NativeAdViewListener.this.serverParameters, context);
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.InMobiMediationAdapter.NativeAdViewListener.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaxNativeAdView maxNativeAdViewCreateMaxNativeAdView;
                            MaxNativeAd.Builder starRating = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(inMobiNative.getAdTitle()).setAdvertiser(inMobiNative.getAdvertiserName()).setBody(inMobiNative.getAdDescription()).setCallToAction(inMobiNative.getCtaText()).setIcon(new MaxNativeAd.MaxNativeAdImage(drawableFetchNativeAdIcon)).setMediaView(inMobiNative.getMediaView()).setMediaContentAspectRatio(NativeAdViewListener.this.mediaContentAspectRatio).setStarRating(Double.valueOf(inMobiNative.getAdRating()));
                            NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                            MaxInMobiNativeAd maxInMobiNativeAd = InMobiMediationAdapter.this.new MaxInMobiNativeAd(nativeAdViewListener.listener, starRating, NativeAdViewListener.this.adFormat);
                            String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                            if (!string.contains("vertical")) {
                                InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                                if (!AppLovinSdkUtils.isValidString(string)) {
                                    string = "media_banner_template";
                                }
                                maxNativeAdViewCreateMaxNativeAdView = inMobiMediationAdapter.createMaxNativeAdView(maxInMobiNativeAd, string);
                            } else if ("vertical".equals(string)) {
                                maxNativeAdViewCreateMaxNativeAdView = InMobiMediationAdapter.this.createMaxNativeAdView(maxInMobiNativeAd, NativeAdViewListener.this.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template");
                            } else {
                                maxNativeAdViewCreateMaxNativeAdView = InMobiMediationAdapter.this.createMaxNativeAdView(maxInMobiNativeAd, string);
                            }
                            maxInMobiNativeAd.prepareForInteraction(InMobiMediationAdapter.this.getClickableViews(maxNativeAdViewCreateMaxNativeAdView), maxNativeAdViewCreateMaxNativeAdView);
                            if (!AppLovinSdkUtils.isValidString(adMetaInfo.getCreativeID())) {
                                NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdView);
                                return;
                            }
                            Bundle bundle = new Bundle(1);
                            bundle.putString("creative_id", adMetaInfo.getCreativeID());
                            NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdView, bundle);
                        }
                    });
                }
            });
        }
    }

    private class RewardedAdListener extends InterstitialAdEventListener {
        private boolean hasGrantedReward;
        final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public /* bridge */ /* synthetic */ void onAdClicked(@NonNull InMobiInterstitial inMobiInterstitial, Map map) {
            onAdClicked2(inMobiInterstitial, (Map<Object, Object>) map);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDismissed(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad hidden");
            if (this.hasGrantedReward || InMobiMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = InMobiMediationAdapter.this.getReward();
                InMobiMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayFailed(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad failed to display");
            this.listener.onRewardedAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayed(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdWillDisplay(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onRewardsUnlocked(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad granted reward");
            this.hasGrantedReward = true;
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onUserLeftApplication(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad will leave application");
        }

        /* JADX INFO: renamed from: onAdClicked, reason: avoid collision after fix types in other method */
        public void onAdClicked2(@NonNull InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdFetchSuccessful(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad request succeeded");
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdImpression(@NonNull InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad impression tracked");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(@NonNull InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter.this.log("Rewarded ad failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
            this.listener.onRewardedAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(@NonNull InMobiInterstitial inMobiInterstitial, @NonNull AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad loaded");
            if (TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onRewardedAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("creative_id", adMetaInfo.getCreativeID());
            this.listener.onRewardedAdLoaded(bundle);
        }
    }

    public InMobiMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdView(MaxNativeAd maxNativeAd, String str) {
        return new MaxNativeAdView(maxNativeAd, str, getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable fetchNativeAdIcon(InMobiNativeImage inMobiNativeImage, Bundle bundle, Context context) {
        if (inMobiNativeImage == null) {
            log("Native ad icon Object is NULL");
            return null;
        }
        String url = inMobiNativeImage.getUrl();
        if (TextUtils.isEmpty(url)) {
            log("Native ad icon url " + url + " is not valid");
            return null;
        }
        log("Adding native ad icon (" + url + ") to queue to be fetched");
        try {
            return createDrawableFuture(url, context.getResources()).get(BundleUtils.getInt("image_task_timeout_seconds", 5, bundle), TimeUnit.SECONDS);
        } catch (Throwable th2) {
            e("Failed to fetch icon image from URL: " + url, th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        return maxNativeAdView.getClickableViews();
    }

    private JSONObject getConsentJSONObject(MaxAdapterParameters maxAdapterParameters) {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
            if (boolHasUserConsent != null) {
                jSONObject.put(KEY_PARTNER_GDPR_CONSENT, boolHasUserConsent);
                return jSONObject;
            }
        } catch (JSONException e10) {
            log("Failed to create consent JSON object", e10);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(@Nullable Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private Map<String, String> getExtras() {
        HashMap map = new HashMap(2);
        map.put("tp", "c_applovin");
        map.put("tp-ver", AppLovinSdk.VERSION);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getNativeAdMediaContentAspectRatio(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("native_ad_media_content_aspect_ratio");
        return obj instanceof Number ? ((Number) obj).floatValue() : DEFAULT_MEDIA_CONTENT_ASPECT_RATIO;
    }

    private InMobiInterstitial loadFullscreenAd(long j10, MaxAdapterResponseParameters maxAdapterResponseParameters, InterstitialAdEventListener interstitialAdEventListener, @Nullable Activity activity) {
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(getContext(activity), j10, interstitialAdEventListener);
        inMobiInterstitial.setExtras(getExtras());
        updatePrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (TextUtils.isEmpty(bidResponse)) {
            inMobiInterstitial.load();
            return inMobiInterstitial;
        }
        inMobiInterstitial.load(bidResponse.getBytes());
        return inMobiInterstitial;
    }

    private boolean showFullscreenAd(InMobiInterstitial inMobiInterstitial) {
        if (!inMobiInterstitial.isReady()) {
            return false;
        }
        inMobiInterstitial.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiAdRequestStatus.StatusCode statusCode = inMobiAdRequestStatus.getStatusCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass2.$SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[statusCode.ordinal()]) {
            case 2:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 13:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 19:
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
                break;
            case 20:
            case 21:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
        }
        return new MaxAdapterError(maxAdapterError, statusCode.ordinal(), inMobiAdRequestStatus.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String());
    }

    private void updatePrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        InMobiSdk.setPartnerGDPRConsent(getConsentJSONObject(maxAdapterParameters));
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            InMobiPrivacyCompliance.setDoNotSell(boolIsDoNotSell.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, @Nullable Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (!InMobiSdk.isSDKInitialized()) {
            maxSignalCollectionListener.onSignalCollectionFailed("InMobi SDK initialization failed.");
        } else {
            updatePrivacySettings(maxAdapterSignalCollectionParameters);
            maxSignalCollectionListener.onSignalCollected(InMobiSdk.getToken(getExtras(), null));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return InMobiSdk.getVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, @Nullable Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        String string = maxAdapterInitializationParameters.getServerParameters().getString("account_id");
        log("Initializing InMobi SDK with account id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        Context context = getContext(activity);
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        JSONObject consentJSONObject = getConsentJSONObject(maxAdapterInitializationParameters);
        if (string != null) {
            InMobiSdk.init(context, string, consentJSONObject, new SdkInitializationListener() { // from class: com.applovin.mediation.adapters.InMobiMediationAdapter.1
                @Override // com.inmobi.sdk.SdkInitializationListener
                public void onInitializationComplete(@Nullable Error error) {
                    if (error == null) {
                        InMobiMediationAdapter.this.log("InMobi SDK successfully initialized.");
                        MaxAdapter.InitializationStatus unused = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                        onCompletionListener.onCompletion(InMobiMediationAdapter.status, null);
                        return;
                    }
                    InMobiMediationAdapter.this.log("InMobi SDK initialization failed with error: " + error.getMessage());
                    MaxAdapter.InitializationStatus unused2 = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(InMobiMediationAdapter.status, error.getMessage());
                }
            });
            InMobiSdk.setLogLevel(maxAdapterInitializationParameters.isTesting() ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.ERROR);
        } else {
            log("InMobi SDK initialization failed with null account id");
            MaxAdapter.InitializationStatus initializationStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
            status = initializationStatus;
            onCompletionListener.onCompletion(initializationStatus, "Account id is null");
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, @Nullable Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int i10;
        int i11;
        long j10 = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading");
        sb2.append(z10 ? " native " : " ");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" AdView ad for placement: ");
        sb2.append(j10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing " + maxAdFormat.getLabel() + " ad load...");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updatePrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        Context context = getContext(activity);
        if (z10) {
            InMobiNative inMobiNative = new InMobiNative(context, j10, new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener));
            this.nativeAd = inMobiNative;
            inMobiNative.setExtras(getExtras());
            if (zIsValidString) {
                this.nativeAd.load(bidResponse.getBytes());
                return;
            } else {
                this.nativeAd.load();
                return;
            }
        }
        InMobiBanner inMobiBanner = new InMobiBanner(context, j10);
        this.adView = inMobiBanner;
        inMobiBanner.setExtras(getExtras());
        this.adView.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        this.adView.setEnableAutoRefresh(false);
        this.adView.setListener(new AdViewListener(maxAdViewAdapterListener));
        float f10 = context.getResources().getDisplayMetrics().density;
        if (maxAdFormat == MaxAdFormat.BANNER) {
            i10 = 320;
            i11 = 50;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            i10 = 728;
            i11 = 90;
        } else {
            if (maxAdFormat != MaxAdFormat.MREC) {
                throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
            }
            i10 = 300;
            i11 = 250;
        }
        this.adView.setLayoutParams(new LinearLayout.LayoutParams(Math.round(i10 * f10), Math.round(i11 * f10)));
        if (zIsValidString) {
            this.adView.load(bidResponse.getBytes());
        } else {
            this.adView.load();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        long j10 = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading interstitial ad for placement: " + j10 + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (InMobiSdk.isSDKInitialized()) {
            this.interstitialAd = loadFullscreenAd(j10, maxAdapterResponseParameters, new InterstitialListener(maxInterstitialAdapterListener), activity);
        } else {
            log("InMobi SDK not successfully initialized: failing interstitial ad load...");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing native ad load...");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updatePrivacySettings(maxAdapterResponseParameters);
        long j10 = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("native ad for placement: ");
        sb2.append(j10);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        Context context = getContext(activity);
        InMobiNative inMobiNative = new InMobiNative(context, j10, new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener));
        this.nativeAd = inMobiNative;
        inMobiNative.setExtras(getExtras());
        if (zIsValidString) {
            this.nativeAd.load(bidResponse.getBytes());
        } else {
            this.nativeAd.load();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        long j10 = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading rewarded ad for placement: " + j10 + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (InMobiSdk.isSDKInitialized()) {
            this.rewardedAd = loadFullscreenAd(j10, maxAdapterResponseParameters, new RewardedAdListener(maxRewardedAdapterListener), activity);
        } else {
            log("InMobi SDK not successfully initialized: failing rewarded ad load...");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InMobiBanner inMobiBanner = this.adView;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
            this.adView = null;
        }
        InMobiNative inMobiNative = this.nativeAd;
        if (inMobiNative != null) {
            inMobiNative.destroy();
            this.nativeAd = null;
        }
        this.interstitialAd = null;
        this.rewardedAd = null;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldInitializeOnUiThread() {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (showFullscreenAd(this.interstitialAd)) {
            return;
        }
        log("Interstitial ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, @Nullable Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        configureReward(maxAdapterResponseParameters);
        if (showFullscreenAd(this.rewardedAd)) {
            return;
        }
        log("Rewarded ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }
}
