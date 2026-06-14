package com.ironsource.adapters.vungle;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import com.ironsource.adapters.vungle.banner.VungleBannerAdapter;
import com.ironsource.adapters.vungle.interstitial.VungleInterstitialAdapter;
import com.ironsource.adapters.vungle.rewardedvideo.VungleRewardedVideoAdapter;
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
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VunglePrivacySettings;
import com.vungle.ads.VungleWrapperFramework;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0014J\u001e\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0014¨\u0006 "}, d2 = {"Lcom/ironsource/adapters/vungle/VungleAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "providerName", "", "(Ljava/lang/String;)V", "collectBiddingData", "", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/vungle/VungleAdapter$Companion$InitState;", "getVersion", "initSDK", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", InneractiveMediationDefs.REMOTE_KEY_APP_ID, "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "setCCPAValue", "value", "setCOPPAValue", "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    public static final String APP_ID = "AppID";

    @NotNull
    public static final String CREATIVE_ID_KEY = "creativeId";

    @NotNull
    private static final String GitHash = "c8e854e";

    @NotNull
    private static final String META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION = "1.0.0";

    @NotNull
    private static final String META_DATA_VUNGLE_COPPA_KEY = "Vungle_COPPA";

    @NotNull
    public static final String PLACEMENT_ID = "PlacementId";

    @NotNull
    private static final String VERSION = "5.2.0";

    @NotNull
    private static final String VUNGLE_KEYWORD = "Vungle";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static AtomicBoolean isInitiated = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/ironsource/adapters/vungle/VungleAdapter$Companion;", "", "()V", "APP_ID", "", "CREATIVE_ID_KEY", "GitHash", "META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION", "META_DATA_VUNGLE_COPPA_KEY", "PLACEMENT_ID", "VERSION", "VUNGLE_KEYWORD", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "getInitCallbackListeners$vungleadapter_release", "()Ljava/util/HashSet;", "isInitiated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mInitState", "Lcom/ironsource/adapters/vungle/VungleAdapter$Companion$InitState;", "getMInitState$vungleadapter_release", "()Lcom/ironsource/adapters/vungle/VungleAdapter$Companion$InitState;", "setMInitState$vungleadapter_release", "(Lcom/ironsource/adapters/vungle/VungleAdapter$Companion$InitState;)V", "getAdapterSDKVersion", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/vungle/VungleAdapter;", "providerName", "InitState", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/vungle/VungleAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_FAILED", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return VungleAds.INSTANCE.getSdkVersion();
        }

        @NotNull
        public final HashSet<INetworkInitCallbackListener> getInitCallbackListeners$vungleadapter_release() {
            return VungleAdapter.initCallbackListeners;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new IntegrationData("Vungle", "5.2.0");
        }

        @NotNull
        public final InitState getMInitState$vungleadapter_release() {
            return VungleAdapter.mInitState;
        }

        public final void setMInitState$vungleadapter_release(@NotNull InitState initState) {
            Intrinsics.checkNotNullParameter(initState, "<set-?>");
            VungleAdapter.mInitState = initState;
        }

        @NotNull
        public final VungleAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new VungleAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new VungleRewardedVideoAdapter(this));
        setInterstitialAdapter(new VungleInterstitialAdapter(this));
        setBannerAdapter(new VungleBannerAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@NotNull Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    private final void setCCPAValue(boolean value) {
        boolean z10 = !value;
        IronLog.ADAPTER_API.verbose("ccpa = " + z10);
        VunglePrivacySettings.setCCPAStatus(z10);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("coppa = " + value);
        VunglePrivacySettings.setCOPPAStatus(value);
    }

    @NotNull
    public static final VungleAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    public final void collectBiddingData(@NotNull final BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        VungleAds.Companion companion = VungleAds.INSTANCE;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        companion.getBiddingToken(applicationContext, new BidTokenCallback() { // from class: com.ironsource.adapters.vungle.VungleAdapter.collectBiddingData.1
            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenCollected(@NotNull String bidToken) {
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                HashMap map = new HashMap();
                String coreSDKVersion = VungleAdapter.this.getCoreSDKVersion();
                IronLog.ADAPTER_API.verbose("sdkVersion = " + coreSDKVersion + ", token = " + bidToken);
                map.put("sdkVersion", coreSDKVersion);
                map.put("token", bidToken);
                biddingDataCallback.onSuccess(map);
            }

            @Override // com.vungle.ads.BidTokenCallback
            public void onBidTokenError(@NotNull String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                biddingDataCallback.onFailure("failed to receive token - Vungle , error = " + errorMessage);
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
        return "5.2.0";
    }

    public final void initSDK(@NotNull Context context, @NotNull String appID) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appID, "appID");
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (isInitiated.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose("appId = " + appID);
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            VungleAds.Companion companion = VungleAds.INSTANCE;
            companion.setIntegrationName(VungleWrapperFramework.ironsource, "5.2.0");
            companion.init(context, appID, new VungleInitListener());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        IronLog.ADAPTER_API.verbose("gdpr = " + consent);
        VunglePrivacySettings.setGDPRStatus(consent, META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION);
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
        Intrinsics.checkNotNullExpressionValue(valueForType, "formatValueForType(\n    …A_VALUE_BOOLEAN\n        )");
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str));
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_VUNGLE_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
