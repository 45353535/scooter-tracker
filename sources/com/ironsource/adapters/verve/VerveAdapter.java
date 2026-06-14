package com.ironsource.adapters.verve;

import android.app.Application;
import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.adapters.verve.banner.VerveBannerAdapter;
import com.ironsource.adapters.verve.interstitial.VerveInterstitialAdapter;
import com.ironsource.adapters.verve.rewardedvideo.VerveRewardedVideoAdapter;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.utils.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0017H\u0002J\u001e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0014¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/verve/VerveAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lnet/pubnative/lite/sdk/HyBid$InitialisationListener;", "providerName", "", "(Ljava/lang/String;)V", "collectBiddingData", "", "", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/verve/VerveAdapter$Companion$InitState;", "getVersion", "initSdk", "", "config", "Lorg/json/JSONObject;", "initializationFailure", "initializationSuccess", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "onInitialisationFinished", "success", "setCCPAValue", "value", "setCOPPAValue", "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerveAdapter extends AbstractAdapter implements INetworkInitCallbackListener, HyBid.InitialisationListener {

    @NotNull
    private static final String APP_TOKEN = "appToken";

    @NotNull
    private static final String GitHash = "bba1727";

    @NotNull
    public static final String LOG_INIT_FAILED = "Verve sdk init failed";

    @NotNull
    private static final String MEDIATION_NAME = "lp";

    @NotNull
    private static final String META_DATA_VERVE_CCPA_NO_VALUE = "1YN-";

    @NotNull
    private static final String META_DATA_VERVE_CCPA_YES_VALUE = "1YY-";

    @NotNull
    private static final String META_DATA_VERVE_COPPA_KEY = "LevelPlay_ChildDirected";

    @NotNull
    private static final String NETWORK_NAME = "Verve";

    @NotNull
    private static final String VERSION = "5.2.0";

    @NotNull
    private static final String ZONE_ID = "zoneId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\u0006\u0010\u0017\u001a\u00020\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ironsource/adapters/verve/VerveAdapter$Companion;", "", "()V", "APP_TOKEN", "", "GitHash", "LOG_INIT_FAILED", "MEDIATION_NAME", "META_DATA_VERVE_CCPA_NO_VALUE", "META_DATA_VERVE_CCPA_YES_VALUE", "META_DATA_VERVE_COPPA_KEY", "NETWORK_NAME", "VERSION", "ZONE_ID", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mInitState", "Lcom/ironsource/adapters/verve/VerveAdapter$Companion$InitState;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAdapterSDKVersion", "getAppTokenKey", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getLoadError", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", "getZoneIdKey", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/verve/VerveAdapter;", "providerName", "InitState", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/verve/VerveAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_FAILED", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            String sDKVersionInfo = HyBid.getSDKVersionInfo();
            Intrinsics.checkNotNullExpressionValue(sDKVersionInfo, "getSDKVersionInfo()");
            return sDKVersionInfo;
        }

        @NotNull
        public final String getAppTokenKey() {
            return VerveAdapter.APP_TOKEN;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(VerveAdapter.NETWORK_NAME, "5.2.0");
        }

        @NotNull
        public final IronSourceError getLoadError(@Nullable Throwable error) {
            Intrinsics.checkNotNull(error, "null cannot be cast to non-null type net.pubnative.lite.sdk.HyBidError");
            HyBidError hyBidError = (HyBidError) error;
            return new IronSourceError(hyBidError.getErrorCode().getCode(), hyBidError.getErrorCode().getMessage());
        }

        @NotNull
        public final String getZoneIdKey() {
            return VerveAdapter.ZONE_ID;
        }

        @NotNull
        public final VerveAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new VerveAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerveAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new VerveRewardedVideoAdapter(this));
        setInterstitialAdapter(new VerveInterstitialAdapter(this));
        setBannerAdapter(new VerveBannerAdapter(this));
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

    private final void setCCPAValue(boolean value) {
        String str = value ? "1YY-" : "1YN-";
        IronLog.ADAPTER_API.verbose("ccpa value = " + str);
        HyBid.getUserDataManager().setIABUSPrivacyString(str);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        HyBid.setCoppaEnabled(value);
    }

    @NotNull
    public static final VerveAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @NotNull
    public final Map<String, Object> collectBiddingData(@NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> map = new HashMap<>();
        String customRequestSignalData = HyBid.getCustomRequestSignalData(MEDIATION_NAME);
        IronLog.ADAPTER_API.verbose("token = " + customRequestSignalData);
        map.put("token", customRequestSignalData);
        biddingDataCallback.onSuccess(map);
        return map;
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
        return "5.2.0";
    }

    public final void initSdk(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString(INSTANCE.getAppTokenKey());
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("appToken = " + strOptString);
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            ironLog.verbose("appToken: " + strOptString);
            if (isAdaptersDebugEnabled()) {
                HyBid.setLogLevel(Logger.Level.debug);
            }
            Context applicationContext = ContextProvider.getInstance().getCurrentActiveActivity().getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            HyBid.initialize(strOptString, (Application) applicationContext, this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // net.pubnative.lite.sdk.HyBid.InitialisationListener
    public void onInitialisationFinished(boolean success) {
        IronLog.ADAPTER_API.verbose("Verve initialization " + (success ? "succeeded" : C4240b4.i.f42652t));
        if (success) {
            initializationSuccess();
        } else {
            initializationFailure();
        }
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
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_VERVE_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
