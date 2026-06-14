package com.ironsource.adapters.inmobi;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.C4240b4;
import com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter;
import com.ironsource.adapters.inmobi.interstitial.InMobiInterstitialAdapter;
import com.ironsource.adapters.inmobi.rewardedvideo.InMobiRewardedVideoAdapter;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
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
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\nH\u0014J\u001e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/inmobi/InMobiAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "providerName", "", "<init>", "(Ljava/lang/String;)V", "getVersion", "getCoreSDKVersion", "isUsingActivityBeforeImpression", "", "adFormat", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "initSDK", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", InMobiAdapter.ACCOUNT_ID, "setConsent", C4240b4.j.f42669b0, "setMetaData", C4240b4.i.W, "values", "", "shouldSetAgeRestrictedOnInitSuccess", "setAgeRestricted", "isAgeRestricted", "getConsentObject", "Lorg/json/JSONObject;", "getBiddingData", "", "", "getExtrasMap", "", "InitState", y.f66058y, "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    public static final String ACCOUNT_ID = "accountId";

    @NotNull
    public static final String CREATIVE_ID_KEY = "creativeId";

    @NotNull
    public static final String EMPTY_STRING = "";

    @NotNull
    private static final String GitHash = "dbe19bf";

    @NotNull
    public static final String INMOBI_DO_NOT_SELL_KEY = "do_not_sell";

    @NotNull
    private static final String INMOBI_KEYWORD = "InMobi";

    @NotNull
    public static final String META_DATA_INMOBI_AGE_RESTRICTED = "inMobi_AgeRestricted";

    @NotNull
    public static final String META_DATA_INMOBI_CHILD_DIRECTED = "LevelPlay_Child_Directed";

    @NotNull
    public static final String PLACEMENT_ID = "placementId";

    @NotNull
    private static final String VERSION = "5.3.0";

    @Nullable
    private static Boolean ageRestrictionCollectingUserData;

    @Nullable
    private static String consentCollectingUserData;

    @Nullable
    private static Boolean doNotSellCollectingUserData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static AtomicBoolean isInitiated = new AtomicBoolean(false);

    @NotNull
    private static AtomicBoolean isAgeRestrictionCalled = new AtomicBoolean(false);

    @NotNull
    private static InitState initState = InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0007J\b\u0010.\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0012\u0010&\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010%¨\u0006/"}, d2 = {"Lcom/ironsource/adapters/inmobi/InMobiAdapter$Companion;", "", "<init>", "()V", "VERSION", "", "GitHash", "META_DATA_INMOBI_AGE_RESTRICTED", "META_DATA_INMOBI_CHILD_DIRECTED", "INMOBI_DO_NOT_SELL_KEY", "ACCOUNT_ID", "PLACEMENT_ID", "INMOBI_KEYWORD", "EMPTY_STRING", "CREATIVE_ID_KEY", "isInitiated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isAgeRestrictionCalled", "initState", "Lcom/ironsource/adapters/inmobi/InMobiAdapter$InitState;", "getInitState$inmobiadapter_release", "()Lcom/ironsource/adapters/inmobi/InMobiAdapter$InitState;", "setInitState$inmobiadapter_release", "(Lcom/ironsource/adapters/inmobi/InMobiAdapter$InitState;)V", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "getInitCallbackListeners$inmobiadapter_release", "()Ljava/util/HashSet;", "consentCollectingUserData", "ageRestrictionCollectingUserData", "", "getAgeRestrictionCollectingUserData", "()Ljava/lang/Boolean;", "setAgeRestrictionCollectingUserData", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "doNotSellCollectingUserData", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/inmobi/InMobiAdapter;", "providerName", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "getAdapterSDKVersion", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            return InMobiSdk.getVersion();
        }

        @Nullable
        public final Boolean getAgeRestrictionCollectingUserData() {
            return InMobiAdapter.ageRestrictionCollectingUserData;
        }

        @NotNull
        public final HashSet<INetworkInitCallbackListener> getInitCallbackListeners$inmobiadapter_release() {
            return InMobiAdapter.initCallbackListeners;
        }

        @NotNull
        public final InitState getInitState$inmobiadapter_release() {
            return InMobiAdapter.initState;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new IntegrationData(InMobiAdapter.INMOBI_KEYWORD, "5.3.0");
        }

        public final void setAgeRestrictionCollectingUserData(@Nullable Boolean bool) {
            InMobiAdapter.ageRestrictionCollectingUserData = bool;
        }

        public final void setInitState$inmobiadapter_release(@NotNull InitState initState) {
            Intrinsics.checkNotNullParameter(initState, "<set-?>");
            InMobiAdapter.initState = initState;
        }

        @NotNull
        public final InMobiAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new InMobiAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/adapters/inmobi/InMobiAdapter$InitState;", "", "<init>", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_ERROR", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InitState[] $VALUES;
        public static final InitState INIT_STATE_NONE = new InitState("INIT_STATE_NONE", 0);
        public static final InitState INIT_STATE_IN_PROGRESS = new InitState("INIT_STATE_IN_PROGRESS", 1);
        public static final InitState INIT_STATE_SUCCESS = new InitState("INIT_STATE_SUCCESS", 2);
        public static final InitState INIT_STATE_ERROR = new InitState("INIT_STATE_ERROR", 3);

        private static final /* synthetic */ InitState[] $values() {
            return new InitState[]{INIT_STATE_NONE, INIT_STATE_IN_PROGRESS, INIT_STATE_SUCCESS, INIT_STATE_ERROR};
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        setRewardedVideoAdapter(new InMobiRewardedVideoAdapter(this));
        setInterstitialAdapter(new InMobiInterstitialAdapter(this));
        setBannerAdapter(new InMobiBannerAdapter(this));
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    private final JSONObject getConsentObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = consentCollectingUserData;
            if (str != null && str.length() != 0) {
                jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, consentCollectingUserData);
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e10) {
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@NotNull Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSDK$lambda$0(Context context, String str, InMobiAdapter inMobiAdapter, InMobiInitListener inMobiInitListener) {
        InMobiSdk.init(context, str, inMobiAdapter.getConsentObject(), inMobiInitListener);
    }

    @NotNull
    public static final InMobiAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @Nullable
    public final Map<String, Object> getBiddingData() {
        if (initState != InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("returning null as token since init did not finish");
            return null;
        }
        String str = "";
        String token = InMobiSdk.getToken(getExtrasMap(), "");
        if (token != null && token.length() != 0) {
            str = token;
        }
        IronLog.ADAPTER_API.verbose("token = " + str);
        HashMap map = new HashMap();
        map.put("token", str);
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @NotNull
    public final Map<String, String> getExtrasMap() {
        HashMap map = new HashMap();
        map.put("tp", "c_supersonic");
        map.put("tp-ver", getVersion());
        Boolean bool = doNotSellCollectingUserData;
        if (bool != null) {
            map.put("do_not_sell", bool.booleanValue() ? "1" : "0");
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.3.0";
    }

    public final void initSDK(@NotNull final Context context, @NotNull final String accountId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (initState == InitState.INIT_STATE_NONE || initState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (isInitiated.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose("accountId = " + accountId);
            initState = InitState.INIT_STATE_IN_PROGRESS;
            InMobiSdk.setLogLevel(isAdaptersDebugEnabled() ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.NONE);
            final InMobiInitListener inMobiInitListener = new InMobiInitListener();
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.inmobi.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiAdapter.initSDK$lambda$0(context, accountId, this, inMobiInitListener);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    public final void setAgeRestricted(boolean isAgeRestricted) {
        if (initState != InitState.INIT_STATE_SUCCESS) {
            ageRestrictionCollectingUserData = Boolean.valueOf(isAgeRestricted);
            return;
        }
        IronLog.ADAPTER_API.verbose("isAgeRestricted = " + isAgeRestricted);
        InMobiSdk.setIsAgeRestricted(isAgeRestricted);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        consentCollectingUserData = String.valueOf(consent);
        if (initState == InitState.INIT_STATE_SUCCESS) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " consent = " + consent);
            InMobiSdk.updateGDPRConsent(getConsentObject());
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
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            doNotSellCollectingUserData = Boolean.valueOf(MetaDataUtils.getMetaDataBooleanValue(str));
            return;
        }
        String valueForType = MetaDataUtils.formatValueForType(str, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(key, META_DATA_INMOBI_AGE_RESTRICTED, valueForType) || MetaDataUtils.isValidMetaData(key, META_DATA_INMOBI_CHILD_DIRECTED, valueForType)) {
            setAgeRestricted(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }

    public final boolean shouldSetAgeRestrictedOnInitSuccess() {
        return isAgeRestrictionCalled.compareAndSet(false, true) && ageRestrictionCollectingUserData != null;
    }
}
