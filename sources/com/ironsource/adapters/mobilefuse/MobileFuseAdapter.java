package com.ironsource.adapters.mobilefuse;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.adapters.mobilefuse.banner.MobileFuseBannerAdapter;
import com.ironsource.adapters.mobilefuse.interstitial.MobileFuseInterstitialAdapter;
import com.ironsource.adapters.mobilefuse.rewardedvideo.MobileFuseRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.SdkInitListener;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider;
import com.mobilefuse.sdk.internal.MobileFuseBiddingTokenRequest;
import com.mobilefuse.sdk.internal.TokenGeneratorListener;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0017H\u0014J\u001e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0014¨\u0006'"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lcom/mobilefuse/sdk/SdkInitListener;", "providerName", "", "(Ljava/lang/String;)V", "collectBiddingData", "", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter$Companion$InitState;", "getPrivacyData", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "getVersion", "initSdk", "config", "Lorg/json/JSONObject;", "initializationFailure", "initializationSuccess", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "onInitError", "onInitSuccess", "setCCPAValue", "doNotSell", "setCOPPAValue", "value", "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseAdapter extends AbstractAdapter implements INetworkInitCallbackListener, SdkInitListener {

    @NotNull
    private static final String DO_NOT_SELL_NO_VALUE = "1YN-";

    @NotNull
    private static final String DO_NOT_SELL_YES_VALUE = "1YY-";

    @NotNull
    private static final String GitHash = "9f697d2";

    @NotNull
    public static final String LOG_INIT_FAILED = "MobileFuse sdk init failed";

    @NotNull
    private static final String META_DATA_MOBILE_FUSE_COPPA_KEY = "LevelPlay_ChildDirected";

    @NotNull
    private static final String NETWORK_NAME = "MobileFuse";

    @NotNull
    private static final String PLACEMENT_ID = "placementId";
    private static final boolean TEST_MODE = false;

    @NotNull
    private static final String VERSION = "5.0.0";
    private static boolean coppaValue;
    private static boolean doNotTrackValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @NotNull
    private static String doNotSellValue = "1-";

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0006\u0010\u001e\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter$Companion;", "", "()V", "DO_NOT_SELL_NO_VALUE", "", "DO_NOT_SELL_YES_VALUE", "GitHash", "LOG_INIT_FAILED", "META_DATA_MOBILE_FUSE_COPPA_KEY", "NETWORK_NAME", "PLACEMENT_ID", "TEST_MODE", "", "VERSION", "coppaValue", "doNotSellValue", "doNotTrackValue", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mInitState", "Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter$Companion$InitState;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAdapterSDKVersion", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getPlacementIdKey", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;", "providerName", "InitState", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_FAILED", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS,
            INIT_STATE_FAILED
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            String sdkVersion = MobileFuse.getSdkVersion();
            Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion()");
            return sdkVersion;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(MobileFuseAdapter.NETWORK_NAME, "5.0.0");
        }

        @NotNull
        public final String getPlacementIdKey() {
            return "placementId";
        }

        @NotNull
        public final MobileFuseAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new MobileFuseAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new MobileFuseRewardedVideoAdapter(this));
        setInterstitialAdapter(new MobileFuseInterstitialAdapter(this));
        setBannerAdapter(new MobileFuseBannerAdapter(this));
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

    private final MobileFusePrivacyPreferences getPrivacyData() {
        MobileFusePrivacyPreferences.Builder builder = new MobileFusePrivacyPreferences.Builder();
        builder.setUsPrivacyConsentString(doNotSellValue);
        builder.setSubjectToCoppa(coppaValue);
        builder.setDoNotTrack(doNotTrackValue);
        return builder.build();
    }

    private final void initializationFailure() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.InitState.INIT_STATE_FAILED;
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackFailed(LOG_INIT_FAILED);
        }
        initCallbackListeners.clear();
    }

    private final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.InitState.INIT_STATE_SUCCESS;
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(boolean doNotSell) {
        IronLog.ADAPTER_API.verbose("ccpa = " + doNotSell);
        doNotSellValue = doNotSell ? "1YY-" : "1YN-";
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        coppaValue = value;
    }

    @NotNull
    public static final MobileFuseAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    public final void collectBiddingData(@NotNull final BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest = new MobileFuseBiddingTokenRequest(getPrivacyData(), false, null, 4, null);
        MobileFuseBiddingTokenProvider.Companion companion = MobileFuseBiddingTokenProvider.INSTANCE;
        Context applicationContext = ContextProvider.getInstance().getCurrentActiveActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().currentAct…tivity.applicationContext");
        companion.getToken(mobileFuseBiddingTokenRequest, applicationContext, new TokenGeneratorListener() { // from class: com.ironsource.adapters.mobilefuse.MobileFuseAdapter.collectBiddingData.1
            @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
            public void onTokenGenerated(@NotNull String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                HashMap map = new HashMap();
                map.put("token", token);
                biddingDataCallback.onSuccess(map);
            }

            @Override // com.mobilefuse.sdk.internal.TokenGeneratorListener
            public void onTokenGenerationFailed(@NotNull String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                biddingDataCallback.onFailure(error);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public final Companion.InitState getInitState() {
        return mInitState;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.0.0";
    }

    public final void initSdk(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            MobileFuse.init(this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.mobilefuse.sdk.SdkInitListener
    public void onInitError() {
        initializationFailure();
    }

    @Override // com.mobilefuse.sdk.SdkInitListener
    public void onInitSuccess() {
        initializationSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        IronLog.ADAPTER_API.verbose("consent = " + consent);
        doNotTrackValue = consent ^ true;
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
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str));
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_MOBILE_FUSE_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
