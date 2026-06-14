package com.ironsource.adapters.bidmachine;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.adapters.bidmachine.banner.BidMachineBannerAdapter;
import com.ironsource.adapters.bidmachine.interstitial.BidMachineInterstitialAdapter;
import com.ironsource.adapters.bidmachine.rewardedvideo.BidMachineRewardedVideoAdapter;
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
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.BidMachine;
import io.bidmachine.BidTokenCallback;
import io.bidmachine.InitializationCallback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0014J\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fH\u0014¨\u0006!"}, d2 = {"Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "providerName", "", "(Ljava/lang/String;)V", "collectBiddingData", "", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "adPlacementConfig", "Lio/bidmachine/AdPlacementConfig;", "getCoreSDKVersion", "getInitState", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter$Companion$InitState;", "getVersion", "initSdk", "sourceId", "initializationSuccess", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "setCCPAValue", "value", "setCOPPAValue", "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", y.f66058y, "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    public static final String CREATIVE_ID_KEY = "creativeId";

    @NotNull
    private static final String GitHash = "e26d363";

    @NotNull
    private static final String META_DATA_BIDMACHINE_CCPA_CONSENT_VALUE = "1YN-";

    @NotNull
    private static final String META_DATA_BIDMACHINE_CCPA_NO_CONSENT_VALUE = "1YY-";

    @NotNull
    private static final String META_DATA_BIDMACHINE_COPPA_KEY = "BidMachine_COPPA";

    @NotNull
    private static final String PLACEMENT_ID_KEY = "placementId";

    @NotNull
    private static final String SOURCE_ID_KEY = "sourceId";

    @NotNull
    private static final String VERSION = "5.1.0";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001aR$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/ironsource/adapters/bidmachine/BidMachineAdapter$Companion;", "", "<init>", "()V", "", "providerName", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", IronSourceConstants.START_ADAPTER, "(Ljava/lang/String;)Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/ironsource/mediationsdk/IntegrationData;", "getIntegrationData", "(Landroid/content/Context;)Lcom/ironsource/mediationsdk/IntegrationData;", "getAdapterSDKVersion", "()Ljava/lang/String;", "getSourceIdKey", "getPlacementIdKey", "Lae/a;", "error", "", "noFillError", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "getLoadErrorAndCheckNoFill", "(Lae/a;I)Lcom/ironsource/mediationsdk/logger/IronSourceError;", "CREATIVE_ID_KEY", "Ljava/lang/String;", "GitHash", "META_DATA_BIDMACHINE_CCPA_CONSENT_VALUE", "META_DATA_BIDMACHINE_CCPA_NO_CONSENT_VALUE", "META_DATA_BIDMACHINE_COPPA_KEY", "PLACEMENT_ID_KEY", "SOURCE_ID_KEY", "VERSION", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter$Companion$InitState;", "mInitState", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter$Companion$InitState;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "InitState", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ironsource/adapters/bidmachine/BidMachineAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return "3.5.0";
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(BidMachine.NAME, "5.1.0");
        }

        @NotNull
        public final IronSourceError getLoadErrorAndCheckNoFill(@NotNull ae.a error, int noFillError) {
            Intrinsics.checkNotNullParameter(error, "error");
            return error.e() == 103 ? new IronSourceError(noFillError, error.g()) : new IronSourceError(error.e(), error.g());
        }

        @NotNull
        public final String getPlacementIdKey() {
            return "placementId";
        }

        @NotNull
        public final String getSourceIdKey() {
            return "sourceId";
        }

        @NotNull
        public final BidMachineAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new BidMachineAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidMachineAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new BidMachineRewardedVideoAdapter(this));
        setInterstitialAdapter(new BidMachineInterstitialAdapter(this));
        setBannerAdapter(new BidMachineBannerAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectBiddingData$lambda$1(BiddingDataCallback biddingDataCallback, String token) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "$biddingDataCallback");
        Intrinsics.checkNotNullParameter(token, "token");
        if (token.length() == 0) {
            IronLog.INTERNAL.verbose("failed to receive token - returned null/empty token");
            biddingDataCallback.onFailure("failed to receive token - returned null/empty token - BidMachine");
            return;
        }
        IronLog.ADAPTER_API.verbose("token = " + token);
        HashMap map = new HashMap();
        map.put("token", token);
        biddingDataCallback.onSuccess(map);
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
    public static final void initSdk$lambda$0(BidMachineAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initializationSuccess();
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
        IronLog.ADAPTER_API.verbose("value = " + str);
        BidMachine.setUSPrivacyString(str);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        BidMachine.setCoppa(Boolean.valueOf(value));
    }

    @NotNull
    public static final BidMachineAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    public final void collectBiddingData(@NotNull final BiddingDataCallback biddingDataCallback, @NotNull AdPlacementConfig adPlacementConfig) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Intrinsics.checkNotNullParameter(adPlacementConfig, "adPlacementConfig");
        if (mInitState == Companion.InitState.INIT_STATE_SUCCESS) {
            BidMachine.getBidToken(ContextProvider.getInstance().getApplicationContext(), adPlacementConfig, new BidTokenCallback() { // from class: com.ironsource.adapters.bidmachine.b
                @Override // io.bidmachine.BidTokenCallback
                public final void onCollected(String str) {
                    BidMachineAdapter.collectBiddingData$lambda$1(biddingDataCallback, str);
                }
            });
            return;
        }
        IronLog.INTERNAL.verbose("returning null as token since init isn't completed");
        biddingDataCallback.onFailure("returning null as token since init isn't completed - BidMachine");
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
        return "5.1.0";
    }

    public final void initSdk(@NotNull String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("sourceId = " + sourceId);
            BidMachine.setLoggingEnabled(isAdaptersDebugEnabled());
            BidMachine.initialize(ContextProvider.getInstance().getApplicationContext(), sourceId, new InitializationCallback() { // from class: com.ironsource.adapters.bidmachine.a
                @Override // io.bidmachine.InitializationCallback
                public final void onInitialized() {
                    BidMachineAdapter.initSdk$lambda$0(this.f42375a);
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
        BidMachine.setSubjectToGDPR(Boolean.TRUE);
        BidMachine.setConsentConfig(consent, null);
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
        } else if (MetaDataUtils.isValidMetaData(key, "BidMachine_COPPA", valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
