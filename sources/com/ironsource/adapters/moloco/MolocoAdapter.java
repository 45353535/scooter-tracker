package com.ironsource.adapters.moloco;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.adapters.moloco.banner.MolocoBannerAdapter;
import com.ironsource.adapters.moloco.interstitial.MolocoInterstitialAdapter;
import com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdapter;
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
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\nH\u0014J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f¨\u0006!"}, d2 = {"Lcom/ironsource/adapters/moloco/MolocoAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "providerName", "", "<init>", "(Ljava/lang/String;)V", "getVersion", "getCoreSDKVersion", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "initSdk", "", "appKey", "initializationSuccess", "initializationFailure", "getInitState", "Lcom/ironsource/adapters/moloco/MolocoAdapter$Companion$InitState;", "setMetaData", C4240b4.i.W, "values", "", "setConsent", C4240b4.j.f42669b0, "setCCPAValue", "value", "setCOPPAValue", "collectBiddingData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", y.f66058y, "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    private static final String AD_UNIT_ID = "adUnitId";

    @NotNull
    private static final String APP_KEY = "appKey";

    @NotNull
    private static final String GitHash = "3da37c8";

    @NotNull
    public static final String INVALID_CONFIGURATION = "invalid configuration";

    @NotNull
    private static final String META_DATA_MOLOCO_COPPA_KEY = "Moloco_COPPA";

    @NotNull
    private static final String VERSION = "5.5.0";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MediationInfo mediationInfo = new MediationInfo("LevelPlay");

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u0005H\u0007J\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\nJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ironsource/adapters/moloco/MolocoAdapter$Companion;", "", "<init>", "()V", "VERSION", "", "GitHash", "APP_KEY", "AD_UNIT_ID", "mediationInfo", "Lcom/moloco/sdk/publisher/MediationInfo;", "META_DATA_MOLOCO_COPPA_KEY", "INVALID_CONFIGURATION", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mInitState", "Lcom/ironsource/adapters/moloco/MolocoAdapter$Companion$InitState;", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/moloco/MolocoAdapter;", "providerName", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getAdapterSDKVersion", "getAppKey", "getAdUnitIdKey", "getMediationInfo", "getLoadErrorAndCheckNoFill", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/moloco/sdk/publisher/MolocoAdError;", "noFillError", "", "InitState", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/adapters/moloco/MolocoAdapter$Companion$InitState;", "", "<init>", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_FAILED", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InitState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InitState[] $VALUES;
            public static final InitState INIT_STATE_NONE = new InitState("INIT_STATE_NONE", 0);
            public static final InitState INIT_STATE_IN_PROGRESS = new InitState("INIT_STATE_IN_PROGRESS", 1);
            public static final InitState INIT_STATE_SUCCESS = new InitState("INIT_STATE_SUCCESS", 2);
            public static final InitState INIT_STATE_FAILED = new InitState("INIT_STATE_FAILED", 3);

            private static final /* synthetic */ InitState[] $values() {
                return new InitState[]{INIT_STATE_NONE, INIT_STATE_IN_PROGRESS, INIT_STATE_SUCCESS, INIT_STATE_FAILED};
            }

            static {
                InitState[] initStateArr$values = $values();
                $VALUES = initStateArr$values;
                $ENTRIES = qf.a.a(initStateArr$values);
            }

            private InitState(String str, int i10) {
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static InitState valueOf(String str) {
                return (InitState) Enum.valueOf(InitState.class, str);
            }

            public static InitState[] values() {
                return (InitState[]) $VALUES.clone();
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MolocoAdError.ErrorType.values().length];
                try {
                    iArr[MolocoAdError.ErrorType.AD_LOAD_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdUnitIdKey() {
            return "adUnitId";
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            return com.moloco.sdk.BuildConfig.SDK_VERSION_NAME;
        }

        @NotNull
        public final String getAppKey() {
            return "appKey";
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData("Moloco", "5.5.0");
        }

        @NotNull
        public final IronSourceError getLoadErrorAndCheckNoFill(@NotNull MolocoAdError error, int noFillError) {
            Intrinsics.checkNotNullParameter(error, "error");
            return WhenMappings.$EnumSwitchMapping$0[error.getErrorType().ordinal()] == 1 ? new IronSourceError(noFillError, error.getDescription()) : new IronSourceError(MolocoAdError.ErrorType.AD_LOAD_FAILED.getErrorCode(), error.getDescription());
        }

        @NotNull
        public final MediationInfo getMediationInfo() {
            return MolocoAdapter.mediationInfo;
        }

        @NotNull
        public final MolocoAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new MolocoAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MolocoAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new MolocoRewardedVideoAdapter(this));
        setBannerAdapter(new MolocoBannerAdapter(this));
        setInterstitialAdapter(new MolocoInterstitialAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectBiddingData$lambda$1(BiddingDataCallback biddingDataCallback, String bidToken, MolocoAdError.ErrorType errorType) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        if (errorType == null) {
            HashMap map = new HashMap();
            IronLog.ADAPTER_API.verbose("token = " + bidToken);
            map.put("token", bidToken);
            biddingDataCallback.onSuccess(map);
            return;
        }
        biddingDataCallback.onFailure("failed to receive token - Moloco, errorCode = " + errorType.getErrorCode() + ", error = " + errorType.getDescription());
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
    public static final void initSdk$lambda$0(MolocoAdapter molocoAdapter, MolocoInitStatus molocoInitStatus) {
        Intrinsics.checkNotNullParameter(molocoInitStatus, "molocoInitStatus");
        String description = molocoInitStatus.getDescription();
        if (molocoInitStatus.getInitialization() == Initialization.SUCCESS) {
            IronLog.ADAPTER_API.verbose("Initialization success " + description);
            molocoAdapter.initializationSuccess();
            return;
        }
        IronLog.ADAPTER_API.verbose("Initialization failed " + description);
        molocoAdapter.initializationFailure();
    }

    private final void initializationFailure() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            INetworkInitCallbackListener next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.onNetworkInitCallbackFailed("Moloco sdk init failed");
        }
        initCallbackListeners.clear();
    }

    private final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            INetworkInitCallbackListener next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private final void setCCPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("value = " + value);
        MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(null, null, Boolean.valueOf(value)));
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("isCoppa = " + value);
        MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(null, Boolean.valueOf(value), null));
    }

    @NotNull
    public static final MolocoAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    public final void collectBiddingData(@NotNull final BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        if (mInitState == Companion.InitState.INIT_STATE_SUCCESS) {
            MediationInfo mediationInfo2 = mediationInfo;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Moloco.getBidToken(mediationInfo2, applicationContext, new MolocoBidTokenListener() { // from class: com.ironsource.adapters.moloco.a
                @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
                public final void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
                    MolocoAdapter.collectBiddingData$lambda$1(biddingDataCallback, str, errorType);
                }
            });
            return;
        }
        IronLog.INTERNAL.verbose("returning null as token since init isn't completed");
        biddingDataCallback.onFailure("returning null as token since init isn't completed - Moloco");
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
        return "5.5.0";
    }

    public final void initSdk(@NotNull String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("appKey: " + appKey);
            MolocoLogger.setLogEnabled(isAdaptersDebugEnabled());
            Context applicationContext = ContextProvider.getInstance().getCurrentActiveActivity().getApplicationContext();
            Intrinsics.checkNotNull(applicationContext);
            Moloco.initialize(new MolocoInitParams(applicationContext, appKey, mediationInfo), new MolocoInitializationListener() { // from class: com.ironsource.adapters.moloco.b
                @Override // com.moloco.sdk.publisher.MolocoInitializationListener
                public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                    MolocoAdapter.initSdk$lambda$0(this.f42394a, molocoInitStatus);
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
        MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(Boolean.valueOf(consent), null, null));
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
        Intrinsics.checkNotNullExpressionValue(valueForType, "formatValueForType(...)");
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str));
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_MOLOCO_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }
}
