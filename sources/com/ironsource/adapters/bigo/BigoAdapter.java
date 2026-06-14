package com.ironsource.adapters.bigo;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.ironsource.C4574uf;
import com.ironsource.adapters.bigo.banner.BigoBannerAdapter;
import com.ironsource.adapters.bigo.interstitial.BigoInterstitialAdapter;
import com.ironsource.adapters.bigo.rewardedvideo.BigoRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0000¢\u0006\u0002\b\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0014H\u0014J\u001e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0014¨\u0006#"}, d2 = {"Lcom/ironsource/adapters/bigo/BigoAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lsg/bigo/ads/BigoAdSdk$InitListener;", "providerName", "", "(Ljava/lang/String;)V", "getBiddingData", "", "", "getBiddingData$bigoadapter_release", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/bigo/BigoAdapter$Companion$InitState;", "getVersion", "initSdk", "", "appId", "initializationSuccess", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "onInitialized", "setCCPAValue", "doNotSell", "setCOPPAValue", "value", "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoAdapter extends AbstractAdapter implements INetworkInitCallbackListener, BigoAdSdk.InitListener {

    @NotNull
    private static final String APP_ID = "appId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String GitHash = "5e8a96a";

    @NotNull
    private static final String MEDIATION_INFO;

    @NotNull
    private static final String META_DATA_BIGO_COPPA_KEY = "LevelPlay_ChildDirected";

    @NotNull
    private static final String NETWORK_NAME = "Bigo";

    @NotNull
    public static final String SLOT_ID = "slotId";

    @NotNull
    private static final String VERSION = "5.2.0";

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners;

    @NotNull
    private static Companion.InitState mInitState;

    @NotNull
    private static final AtomicBoolean mWasInitCalled;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\u0006\u0010\u0016\u001a\u00020\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/bigo/BigoAdapter$Companion;", "", "()V", "APP_ID", "", "GitHash", "MEDIATION_INFO", "getMEDIATION_INFO", "()Ljava/lang/String;", "META_DATA_BIGO_COPPA_KEY", "NETWORK_NAME", "SLOT_ID", "VERSION", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mInitState", "Lcom/ironsource/adapters/bigo/BigoAdapter$Companion$InitState;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAdapterSDKVersion", "getAppIdKey", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getLoadError", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lsg/bigo/ads/api/AdError;", "getSlotIdKey", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/bigo/BigoAdapter;", "providerName", "InitState", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/adapters/bigo/BigoAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            String sDKVersionName = BigoAdSdk.getSDKVersionName();
            Intrinsics.checkNotNullExpressionValue(sDKVersionName, "getSDKVersionName()");
            return sDKVersionName;
        }

        @NotNull
        public final String getAppIdKey() {
            return "appId";
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(BigoAdapter.NETWORK_NAME, "5.2.0");
        }

        @NotNull
        public final IronSourceError getLoadError(@NotNull AdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new IronSourceError(error.getCode(), error.getMessage());
        }

        @NotNull
        public final String getMEDIATION_INFO() {
            return BigoAdapter.MEDIATION_INFO;
        }

        @NotNull
        public final String getSlotIdKey() {
            return BigoAdapter.SLOT_ID;
        }

        @NotNull
        public final BigoAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new BigoAdapter(providerName);
        }

        private Companion() {
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(DtbConstants.MEDIATION_NAME, "LevelPlay");
            jSONObject.putOpt("mediationVersion", LevelPlay.getSdkVersion());
            jSONObject.putOpt(C4574uf.f45563b, "5.2.0");
        } catch (Throwable th2) {
            IronLog.INTERNAL.error("Error creating mediation info JSON in BigoAdapter " + th2);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "mediationInfoJSON.toString()");
        MEDIATION_INFO = string;
        mWasInitCalled = new AtomicBoolean(false);
        mInitState = Companion.InitState.INIT_STATE_NONE;
        initCallbackListeners = new HashSet<>();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigoAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new BigoRewardedVideoAdapter(this));
        setInterstitialAdapter(new BigoInterstitialAdapter(this));
        setBannerAdapter(new BigoBannerAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@Nullable Context context) {
        return INSTANCE.getIntegrationData(context);
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
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.CCPA, doNotSell ^ true);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.COPPA, value ^ true);
    }

    @NotNull
    public static final BigoAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @Nullable
    public final Map<String, Object> getBiddingData$bigoadapter_release() {
        if (mInitState != Companion.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.error("returning nil as token since init isn't completed");
            return null;
        }
        HashMap map = new HashMap();
        String bidderToken = BigoAdSdk.getBidderToken();
        IronLog.ADAPTER_API.verbose("token = " + bidderToken);
        map.put("token", bidderToken);
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

    public final void initSdk(@NotNull String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("appId = " + appId);
        }
        BigoAdSdk.initialize(ContextProvider.getInstance().getApplicationContext(), new AdConfig.Builder().setDebug(isAdaptersDebugEnabled()).setAppId(appId).build(), this);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // sg.bigo.ads.BigoAdSdk.InitListener
    public void onInitialized() {
        IronLog.ADAPTER_API.verbose("BIGO SDK Initialized");
        initializationSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        IronLog.ADAPTER_API.verbose("consent = " + consent);
        BigoAdSdk.setUserConsent(ContextProvider.getInstance().getApplicationContext(), ConsentOptions.GDPR, consent);
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
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_BIGO_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
