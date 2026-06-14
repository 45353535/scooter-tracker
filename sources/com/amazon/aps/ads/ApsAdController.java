package com.amazon.aps.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.bidder.adapter.ApsBidderInterstitialAdAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.jvm.internal.v0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001,\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&J\u001e\u0010\"\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\tJ\u0010\u0010*\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\tH\u0002J\u0014\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b00R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-¨\u00061"}, d2 = {"Lcom/amazon/aps/ads/ApsAdController;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/ads/listeners/ApsAdListener;", "<init>", "(Landroid/content/Context;Lcom/amazon/aps/ads/listeners/ApsAdListener;)V", "HTTPS_WEB_URL", "", "getHTTPS_WEB_URL", "()Ljava/lang/String;", "TAG", "apsAdListener", "value", "Lcom/amazon/aps/ads/ApsAdView;", "apsAdView", "getApsAdView", "()Lcom/amazon/aps/ads/ApsAdView;", "", "isAdAvailable", "()Z", "apsAd", "Lcom/amazon/aps/ads/ApsAd;", "apsBidderInterstitialAdAdapter", "Lcom/amazon/aps/bidder/adapter/ApsBidderInterstitialAdAdapter;", "fetchAd", "", C4424m2.f43623v, "startOMSDKSession", "addInViewGroup", "parent", "Landroid/view/ViewGroup;", "fetchInterstitialAd", "fetchBannerAd", "extraInfo", "Landroid/os/Bundle;", "width", "", "height", "extraInfoAsString", "fetchRewardedAd", "fetchBidderAdInterstitialAd", "apsAdListenerInternal", "com/amazon/aps/ads/ApsAdController$apsAdListenerInternal$1", "Lcom/amazon/aps/ads/ApsAdController$apsAdListenerInternal$1;", "safeCall", "action", "Lkotlin/Function0;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsAdController {

    @NotNull
    private final String HTTPS_WEB_URL;

    @Nullable
    private final String TAG;
    private ApsAd apsAd;

    @NotNull
    private final ApsAdListener apsAdListener;

    @NotNull
    private final ApsAdController$apsAdListenerInternal$1 apsAdListenerInternal;
    private ApsAdView apsAdView;

    @Nullable
    private ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter;

    @NotNull
    private final Context context;
    private boolean isAdAvailable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            try {
                iArr[ApsAdFormat.LEADERBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApsAdFormat.MREC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApsAdFormat.BANNER_SMART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApsAdFormat.REWARDED_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApsAdFormat.INTERSTITIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApsAdFormat.INSTREAM_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ApsAdController(@NotNull Context context, @NotNull ApsAdListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.HTTPS_WEB_URL = "https://c.amazon-adsystem.com/";
        this.TAG = v0.b(getClass()).getSimpleName();
        this.apsAdListener = listener;
        ApsAdUtils.checkNullAndLogInvalidArg(context, listener);
        this.apsAdListenerInternal = new ApsAdController$apsAdListenerInternal$1(this);
    }

    private final void fetchBannerAd(ApsAd apsAd) {
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        getApsAdView().fetchAd(apsAd);
    }

    private final boolean fetchBidderAdInterstitialAd(String extraInfoAsString) {
        ApsAd apsAd = null;
        try {
            if (ApsAdUtils.sdkRenderingBridgeEnabled(extraInfoAsString)) {
                JSONObject jSONObject = new JSONObject(extraInfoAsString);
                ApsAd apsAd2 = this.apsAd;
                if (apsAd2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    apsAd2 = null;
                }
                apsAd2.setBidder(jSONObject.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
                ApsAd apsAd3 = this.apsAd;
                if (apsAd3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    apsAd3 = null;
                }
                apsAd3.setBridgingBidderExtra(jSONObject.getJSONObject(DtbConstants.AMZN_BIDDER_REQUEST_KEY));
                ApsAd apsAd4 = this.apsAd;
                if (apsAd4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    apsAd4 = null;
                }
                apsAd4.setImpressionUrl(jSONObject.getString(DtbConstants.AMZN_IMP_URL_KEY));
                Context context = this.context;
                ApsAd apsAd5 = this.apsAd;
                if (apsAd5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    apsAd5 = null;
                }
                this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(context, apsAd5, this.apsAdListenerInternal);
                return true;
            }
        } catch (Exception e10) {
            APSEventSeverity aPSEventSeverity = APSEventSeverity.FATAL;
            APSEventType aPSEventType = APSEventType.EXCEPTION;
            a1 a1Var = a1.f93282a;
            ApsAd apsAd6 = this.apsAd;
            if (apsAd6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            } else {
                apsAd = apsAd6;
            }
            String str = String.format("SDKB : Failed to call fetch Bidder : %s Interstitial ad", Arrays.copyOf(new Object[]{apsAd.getBidder()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, e10);
        }
        return false;
    }

    private final void fetchInterstitialAd(ApsAd apsAd) {
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        if (apsAd.bidderRenderingFlowEnabled()) {
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(this.context, apsAd, this.apsAdListenerInternal);
            ApsLog.d("Fetch Bidder Interstitial ad");
        } else {
            getApsAdView().setApsAd(apsAd);
            getApsAdView().fetchAd(apsAd.getBidInfo(), apsAd.getRenderingBundle());
            apsAd.setAdView(getApsAdView());
        }
    }

    private final void startOMSDKSession() {
        try {
            DtbOmSdkSessionManager omSdkManager = getApsAdView().getOmSdkManager();
            if (omSdkManager != null) {
                if (getApsAdView().getIsVideo()) {
                    omSdkManager.initJavaScriptOmAdSession(getApsAdView(), this.HTTPS_WEB_URL);
                } else {
                    omSdkManager.initHtmlDisplayOmAdSession(getApsAdView(), this.HTTPS_WEB_URL);
                }
                omSdkManager.registerAdView(getApsAdView());
                omSdkManager.startAdSession();
                omSdkManager.displayAdEventLoaded();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unable to start OM SDK session for Interstitial ad", e10);
        }
    }

    public final void addInViewGroup(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        try {
            ApsAd apsAd = this.apsAd;
            if (apsAd != null) {
                if (apsAd == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                }
                ApsAd apsAd2 = this.apsAd;
                ApsAd apsAd3 = null;
                if (apsAd2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    apsAd2 = null;
                }
                if (apsAd2.getAdView() != null) {
                    ApsAd apsAd4 = this.apsAd;
                    if (apsAd4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                    } else {
                        apsAd3 = apsAd4;
                    }
                    parent.addView(apsAd3.getAdView());
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - addInViewGroup", e10);
        }
    }

    public final void fetchAd(@NotNull ApsAd apsAd) {
        Intrinsics.checkNotNullParameter(apsAd, "apsAd");
        ApsAdUtils.checkNullAndLogInvalidArg(apsAd);
        try {
            this.apsAd = apsAd;
            ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
            switch (apsAdFormat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[apsAdFormat.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    fetchBannerAd(apsAd);
                    return;
                case 5:
                case 6:
                    fetchInterstitialAd(apsAd);
                    return;
                case 7:
                    ApsAdUtils.throwExceptionOrRemoteLog("InStream video adFormat not supported");
                    return;
                default:
                    throw new m();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - fetchAd", e10);
        }
    }

    public final void fetchRewardedAd(@NotNull String extraInfoAsString) {
        Intrinsics.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.REWARDED_VIDEO, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.VIDEO, 9999, 9999));
        if (fetchBidderAdInterstitialAd(extraInfoAsString)) {
            ApsLog.d("Fetch Bidder Interstitial ad");
            return;
        }
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }

    @NotNull
    public final ApsAdView getApsAdView() {
        ApsAdView apsAdView = this.apsAdView;
        if (apsAdView != null) {
            return apsAdView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apsAdView");
        return null;
    }

    @NotNull
    public final String getHTTPS_WEB_URL() {
        return this.HTTPS_WEB_URL;
    }

    /* JADX INFO: renamed from: isAdAvailable, reason: from getter */
    public final boolean getIsAdAvailable() {
        return this.isAdAvailable;
    }

    public final void safeCall(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            action.invoke();
        } catch (AbstractMethodError unused) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AbstractMethodError listener method not implemented:ApsAdController - safeCall");
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unexpected exception:ApsAdController - safeCall", e10);
        }
    }

    public final void show() {
        try {
            ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter = this.apsBidderInterstitialAdAdapter;
            if (apsBidderInterstitialAdAdapter != null) {
                if (apsBidderInterstitialAdAdapter != null) {
                    Context context = this.context;
                    ApsAd apsAd = this.apsAd;
                    if (apsAd == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                        apsAd = null;
                    }
                    apsBidderInterstitialAdAdapter.showInterstitialAd(context, apsAd, this.apsAdListenerInternal);
                }
                ApsLog.d("Show Bidder Interstitial ad");
                return;
            }
            if (getApsAdView().getMraidHandler() == null) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "There is no controller before showing the interstitial ad");
                return;
            }
            DTBAdMRAIDController mraidHandler = getApsAdView().getMraidHandler();
            if (mraidHandler != null) {
                mraidHandler.startOMSDKSession();
            }
            ApsLog.d(this.TAG, "Starting the Aps interstitial activity");
            ApsInterstitialActivity.INSTANCE.setAdViewRefPassed(new WeakReference<>(getApsAdView()));
            this.context.startActivity(new Intent(this.context, (Class<?>) ApsInterstitialActivity.class));
            ApsLog.d(this.TAG, "Sending the ApsAdView in live data");
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - show", e10);
        }
    }

    public final void fetchBannerAd(@NotNull Bundle extraInfo, int width, int height) {
        Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
        this.apsAd = new ApsAd(extraInfo, ApsAdFormatUtils.getAdFormat(AdType.DISPLAY, height, width));
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfo);
    }

    public final void fetchBannerAd(@NotNull String extraInfoAsString, int width, int height) {
        Intrinsics.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.DISPLAY, height, width));
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }

    public final void fetchInterstitialAd(@NotNull Bundle extraInfo) {
        Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfo, ApsAdFormatUtils.getAdFormat(AdType.INTERSTITIAL, 9999, 9999));
        ApsAd apsAd = null;
        if (ApsAdUtils.sdkRenderingBridgeEnabled(extraInfo)) {
            ApsAd apsAd2 = this.apsAd;
            if (apsAd2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                apsAd2 = null;
            }
            apsAd2.setBidder(extraInfo.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
            ApsAd apsAd3 = this.apsAd;
            if (apsAd3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                apsAd3 = null;
            }
            String string = extraInfo.getString(DtbConstants.AMZN_BIDDER_REQUEST_KEY);
            apsAd3.setBridgingBidderExtra(string != null ? new JSONObject(string) : null);
            ApsAd apsAd4 = this.apsAd;
            if (apsAd4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apsAd");
                apsAd4 = null;
            }
            apsAd4.setImpressionUrl(extraInfo.getString(DtbConstants.AMZN_IMP_URL_KEY));
            Context context = this.context;
            ApsAd apsAd5 = this.apsAd;
            if (apsAd5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            } else {
                apsAd = apsAd5;
            }
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(context, apsAd, this.apsAdListenerInternal);
            return;
        }
        ApsAd apsAd6 = this.apsAd;
        if (apsAd6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            apsAd6 = null;
        }
        apsAd6.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd7 = this.apsAd;
        if (apsAd7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd = apsAd7;
        }
        apsAdView.setApsAd(apsAd);
        getApsAdView().fetchAd(extraInfo);
    }

    public final void fetchInterstitialAd(@NotNull String extraInfoAsString) {
        Intrinsics.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.INTERSTITIAL, 9999, 9999));
        if (fetchBidderAdInterstitialAd(extraInfoAsString)) {
            ApsLog.d("Fetch Bidder Interstitial ad");
            return;
        }
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }
}
