package com.ironsource.adapters.yandex;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.adapters.yandex.banner.YandexBannerAdapter;
import com.ironsource.adapters.yandex.interstitial.YandexInterstitialAdapter;
import com.ironsource.adapters.yandex.rewardedvideo.YandexRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002!\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0016H\u0014J\u001e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0014¨\u0006#"}, d2 = {"Lcom/ironsource/adapters/yandex/YandexAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "providerName", "", "(Ljava/lang/String;)V", "collectBiddingData", "", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "bidderTokenRequest", "Lcom/yandex/mobile/ads/common/BidderTokenRequestConfiguration;", "getConfigParams", "", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/yandex/YandexAdapter$InitState;", "getVersion", "initSdk", "appId", "initializationSuccess", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "setCOPPAValue", "value", "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "InitState", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    private static final String AD_UNIT_ID_KEY = "adUnitId";

    @NotNull
    private static final String APP_ID_KEY = "appId";

    @NotNull
    private static final String GitHash = "66f1b5b";

    @NotNull
    private static final String MEDIATION_NAME = "ironsource";

    @NotNull
    private static final String META_DATA_YANDEX_COPPA_KEY = "Yandex_COPPA";

    @NotNull
    private static final String VERSION = "5.2.0";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static InitState mInitState = InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\u0006\u0010\u0014\u001a\u00020\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ironsource/adapters/yandex/YandexAdapter$Companion;", "", "()V", "AD_UNIT_ID_KEY", "", "APP_ID_KEY", "GitHash", "MEDIATION_NAME", "META_DATA_YANDEX_COPPA_KEY", "VERSION", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mInitState", "Lcom/ironsource/adapters/yandex/YandexAdapter$InitState;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAdUnitIdKey", "getAdapterSDKVersion", "getAppIdKey", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getLoadErrorAndCheckNoFill", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/yandex/mobile/ads/common/AdRequestError;", "noFillError", "", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/yandex/YandexAdapter;", "providerName", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdUnitIdKey() {
            return "adUnitId";
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            return MobileAds.getLibraryVersion();
        }

        @NotNull
        public final String getAppIdKey() {
            return "appId";
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData("Yandex", "5.2.0");
        }

        @NotNull
        public final IronSourceError getLoadErrorAndCheckNoFill(@NotNull AdRequestError error, int noFillError) {
            Intrinsics.checkNotNullParameter(error, "error");
            return error.getCode() == 4 ? new IronSourceError(noFillError, error.getDescription()) : new IronSourceError(error.getCode(), error.getDescription());
        }

        @NotNull
        public final YandexAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new YandexAdapter(providerName);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/adapters/yandex/YandexAdapter$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new YandexRewardedVideoAdapter(this));
        setInterstitialAdapter(new YandexInterstitialAdapter(this));
        setBannerAdapter(new YandexBannerAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK;
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@Nullable Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSdk$lambda$0(YandexAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initializationSuccess();
    }

    private final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        MobileAds.setAgeRestrictedUser(value);
    }

    @NotNull
    public static final YandexAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    public final void collectBiddingData(@NotNull final BiddingDataCallback biddingDataCallback, @NotNull BidderTokenRequestConfiguration bidderTokenRequest) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Intrinsics.checkNotNullParameter(bidderTokenRequest, "bidderTokenRequest");
        if (mInitState == InitState.INIT_STATE_SUCCESS) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            BidderTokenLoader.loadBidderToken(applicationContext, bidderTokenRequest, new BidderTokenLoadListener() { // from class: com.ironsource.adapters.yandex.YandexAdapter.collectBiddingData.1
                @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
                public void onBidderTokenFailedToLoad(@NotNull String failureReason) {
                    Intrinsics.checkNotNullParameter(failureReason, "failureReason");
                    biddingDataCallback.onFailure("failed to receive token - Yandex " + failureReason);
                }

                @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
                public void onBidderTokenLoaded(@NotNull String bidderToken) {
                    Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
                    HashMap map = new HashMap();
                    IronLog.ADAPTER_API.verbose("token = " + bidderToken);
                    map.put("token", bidderToken);
                    biddingDataCallback.onSuccess(map);
                }
            });
        } else {
            IronLog.INTERNAL.verbose("returning null as token since init isn't completed");
            biddingDataCallback.onFailure("returning null as token since init isn't completed - Yandex");
        }
    }

    @NotNull
    public final Map<String, String> getConfigParams() {
        return MapsKt.mapOf(TuplesKt.to("adapter_version", "5.2.0"), TuplesKt.to("adapter_network_name", "ironsource"), TuplesKt.to("adapter_network_sdk_version", LevelPlay.getSdkVersion()));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public final InitState getInitState() {
        return mInitState;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.2.0";
    }

    public final void initSdk(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("appId = " + appId);
            MobileAds.enableLogging(isAdaptersDebugEnabled());
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            MobileAds.initialize(applicationContext, new InitializationListener() { // from class: com.ironsource.adapters.yandex.a
                @Override // com.yandex.mobile.ads.common.InitializationListener
                public final void onInitializationCompleted() {
                    YandexAdapter.initSdk$lambda$0(this.f42422a);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        IronLog.ADAPTER_API.verbose("consent = " + consent);
        MobileAds.setUserConsent(consent);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.isEmpty()) {
            return;
        }
        String str = values.get(0);
        IronLog.ADAPTER_API.verbose("key = " + key + ", value = " + str);
        String valueForType = MetaDataUtils.formatValueForType(str, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(valueForType, "formatValueForType(value….META_DATA_VALUE_BOOLEAN)");
        if (MetaDataUtils.isValidMetaData(key, META_DATA_YANDEX_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
