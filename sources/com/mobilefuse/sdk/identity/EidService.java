package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.ServiceInitState;
import com.mobilefuse.sdk.service.ServicesInitError;
import com.mobilefuse.sdk.service.ServicesInitResult;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.telemetry.TelemetryAction;
import com.mobilefuse.sdk.telemetry.TelemetryActionParam;
import com.mobilefuse.sdk.telemetry.TelemetryActionType;
import com.mobilefuse.sdk.utils.AppVisibilityObserver;
import com.taurusx.tax.f.y;
import com.taurusx.tax.y.z.w.s;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 W2\u00020\u0001:\u0001WBW\b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0004\u0018\u00010\u001d2\u0006\u00106\u001a\u00020\u001dJ\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d08J\u000e\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;J\u0014\u00109\u001a\u0002022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0=J'\u0010>\u001a\u0002022\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002020@H\u0010¢\u0006\u0002\bAJ\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\"H\u0002J\r\u0010D\u001a\u000202H\u0001¢\u0006\u0002\bEJ#\u0010F\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010G\u001a\b\u0012\u0004\u0012\u00020;0=H\u0001¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLJ#\u0010M\u001a\u0002022\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0=H\u0001¢\u0006\u0002\bOJ\u0018\u0010P\u001a\u0002022\u0006\u00106\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010Q\u001a\u0002022\u0006\u00103\u001a\u000204J\r\u0010R\u001a\u000202H\u0001¢\u0006\u0002\bSJ\u0010\u0010T\u001a\u0002022\u0006\u0010U\u001a\u00020\u001dH\u0002J\b\u0010V\u001a\u000202H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R,\u0010)\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u0010-\u001a\u00020\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'¨\u0006X"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "appVisibilityObserver", "Lcom/mobilefuse/sdk/utils/AppVisibilityObserver;", "eidDataStore", "Lcom/mobilefuse/sdk/identity/EidPrefsDataStore;", "eidRequestDebouncer", "Lcom/mobilefuse/sdk/identity/EidRequestDebouncer;", "eidRefreshMonitor", "Lcom/mobilefuse/sdk/identity/EidRefreshMonitor;", "eidDataUpdateDispatcher", "Lcom/mobilefuse/sdk/identity/EidDataUpdateDispatcher;", "eidRequestBuilder", "Lcom/mobilefuse/sdk/identity/EidRequestBuilder;", "eidRequestProcessor", "Lcom/mobilefuse/sdk/identity/EidRequestProcessor;", "eidsOutputTransformer", "Lcom/mobilefuse/sdk/identity/EidsOutputTransformer;", "(Lcom/mobilefuse/sdk/utils/AppVisibilityObserver;Lcom/mobilefuse/sdk/identity/EidPrefsDataStore;Lcom/mobilefuse/sdk/identity/EidRequestDebouncer;Lcom/mobilefuse/sdk/identity/EidRefreshMonitor;Lcom/mobilefuse/sdk/identity/EidDataUpdateDispatcher;Lcom/mobilefuse/sdk/identity/EidRequestBuilder;Lcom/mobilefuse/sdk/identity/EidRequestProcessor;Lcom/mobilefuse/sdk/identity/EidsOutputTransformer;)V", "eidData", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "getEidData$mobilefuse_sdk_core_release$annotations", "()V", "getEidData$mobilefuse_sdk_core_release", "()Lcom/mobilefuse/sdk/identity/EidSdkData;", "setEidData$mobilefuse_sdk_core_release", "(Lcom/mobilefuse/sdk/identity/EidSdkData;)V", "eidOverrides", "", "", "getEidOverrides$mobilefuse_sdk_core_release$annotations", "getEidOverrides$mobilefuse_sdk_core_release", "()Ljava/util/Map;", "initialized", "", "getInitialized$mobilefuse_sdk_core_release$annotations", "getInitialized$mobilefuse_sdk_core_release", "()Z", "setInitialized$mobilefuse_sdk_core_release", "(Z)V", "value", "managedModeEnabled", "getManagedModeEnabled$annotations", "getManagedModeEnabled", "setManagedModeEnabled", "requestPenaltyActive", "getRequestPenaltyActive$mobilefuse_sdk_core_release$annotations", "getRequestPenaltyActive$mobilefuse_sdk_core_release", "setRequestPenaltyActive$mobilefuse_sdk_core_release", "addEidDataUpdateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/identity/EidDataUpdateListener;", "getEid", "partner", "getEidsAsHttpQueryParams", "", "handleSdkStateChanged", "signal", "Lcom/mobilefuse/sdk/identity/IdentifierUpdateSignal;", "signals", "", "initServiceImpl", "completeAction", "Lkotlin/Function2;", "initServiceImpl$mobilefuse_sdk_core_release", "onAppVisibilityChanged", "isInForeground", "onEidRefreshTimeout", "onEidRefreshTimeout$mobilefuse_sdk_core_release", "onEidRequest", MRAIDPresenter.UPDATE_SIGNALS, "onEidRequest$mobilefuse_sdk_core_release", "onNewEidDataError", "error", "Lcom/mobilefuse/sdk/exception/BaseError;", "onNewEidDataError$mobilefuse_sdk_core_release", "onNewEidDataReceived", "alteredEids", "onNewEidDataReceived$mobilefuse_sdk_core_release", "overrideEid", "removeEidDataUpdateListener", "requireInitializedEidService", "requireInitializedEidService$mobilefuse_sdk_core_release", "rescheduleEidRefreshWithDefaultTtl", "logMsg", "resetImpl", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class EidService extends MobileFuseService {
    public static final int DEFAULT_REFRESH_TTL_SECONDS = 300;

    @NotNull
    public static final String MFX_EID_ENDPOINT = "https://mfx.mobilefuse.com/eids";

    @NotNull
    public static final String SERVICE_TELEMETRY_ID = "EidService";
    public static final int TOO_MANY_REQUESTS_TIME_PENALTY_SECONDS = 300;
    private final AppVisibilityObserver appVisibilityObserver;

    @NotNull
    private EidSdkData eidData;
    private final EidPrefsDataStore eidDataStore;
    private final EidDataUpdateDispatcher eidDataUpdateDispatcher;

    @NotNull
    private final Map<String, String> eidOverrides;
    private final EidRefreshMonitor eidRefreshMonitor;
    private final EidRequestBuilder eidRequestBuilder;
    private final EidRequestDebouncer eidRequestDebouncer;
    private final EidRequestProcessor eidRequestProcessor;
    private final EidsOutputTransformer eidsOutputTransformer;
    private boolean initialized;
    private boolean managedModeEnabled;
    private boolean requestPenaltyActive;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean verbose = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u001fR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u0014\u0010\u000b\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/mobilefuse/sdk/identity/EidService$Companion;", "", "()V", "DEFAULT_REFRESH_TTL_SECONDS", "", "getDEFAULT_REFRESH_TTL_SECONDS$mobilefuse_sdk_core_release$annotations", "MFX_EID_ENDPOINT", "", "SERVICE_TELEMETRY_ID", "TOO_MANY_REQUESTS_TIME_PENALTY_SECONDS", "getTOO_MANY_REQUESTS_TIME_PENALTY_SECONDS$mobilefuse_sdk_core_release$annotations", "telemetryActionsEnabled", "", "getTelemetryActionsEnabled$mobilefuse_sdk_core_release", "()Z", "verbose", "getVerbose", "setVerbose", "(Z)V", "addTelemetryAction", "", "actionType", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionType;", "actionExtras", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "addTelemetryAction$mobilefuse_sdk_core_release", "getService", "Lcom/mobilefuse/sdk/identity/EidService;", s.z.f67719y, NotificationCompat.CATEGORY_MESSAGE, "log$mobilefuse_sdk_core_release", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addTelemetryAction$mobilefuse_sdk_core_release$default(Companion companion, TelemetryActionType telemetryActionType, List list, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = CollectionsKt.emptyList();
            }
            companion.addTelemetryAction$mobilefuse_sdk_core_release(telemetryActionType, list);
        }

        @VisibleForTesting
        public static /* synthetic */ void getDEFAULT_REFRESH_TTL_SECONDS$mobilefuse_sdk_core_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getTOO_MANY_REQUESTS_TIME_PENALTY_SECONDS$mobilefuse_sdk_core_release$annotations() {
        }

        public final void addTelemetryAction$mobilefuse_sdk_core_release(@NotNull TelemetryActionType actionType, @NotNull List<TelemetryActionParam> actionExtras) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(actionExtras, "actionExtras");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                Telemetry.INSTANCE.onAction(new TelemetryAction(EidService.SERVICE_TELEMETRY_ID, actionType, actionExtras, null, 0L, 24, null));
            } catch (Throwable th2) {
                int i10 = EidService$Companion$addTelemetryAction$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                if (i10 == 1) {
                    StabilityHelper.logException("[Automatically caught]", th2);
                } else if (i10 != 2) {
                    throw new m();
                }
            }
        }

        @NotNull
        public final EidService getService() {
            return EidServiceKt.getEidService();
        }

        public final boolean getTelemetryActionsEnabled$mobilefuse_sdk_core_release() {
            return Telemetry.INSTANCE.getStoreActionsEnabled();
        }

        public final boolean getVerbose() {
            return EidService.verbose;
        }

        public final void log$mobilefuse_sdk_core_release(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (getVerbose()) {
                DebuggingKt.logDebug(this, msg, EidService.SERVICE_TELEMETRY_ID);
            }
        }

        public final void setVerbose(boolean z10) {
            EidService.verbose = z10;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @VisibleForTesting
    public EidService() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getEidData$mobilefuse_sdk_core_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEidOverrides$mobilefuse_sdk_core_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getInitialized$mobilefuse_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getManagedModeEnabled$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRequestPenaltyActive$mobilefuse_sdk_core_release$annotations() {
    }

    @NotNull
    public static final EidService getService() {
        return INSTANCE.getService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppVisibilityChanged(boolean isInForeground) {
        Companion companion = INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) App visibility has changed. Is now in foreground: " + isInForeground);
        if (!getManagedModeEnabled()) {
            companion.log$mobilefuse_sdk_core_release("(-) MFX EID managed mode is disabled, reject processing app visibility change");
        } else if (this.requestPenaltyActive) {
            companion.log$mobilefuse_sdk_core_release("(-) time penalty is currently active, reject processing app visibility change");
        } else if (isInForeground) {
            this.eidRequestProcessor.processPostponedRequest();
        }
    }

    private final void rescheduleEidRefreshWithDefaultTtl(String logMsg) {
        INSTANCE.log$mobilefuse_sdk_core_release("(-) " + logMsg + ". Will refresh again in 300 seconds");
        this.eidData = EidSdkData.copy$default(this.eidData, System.currentTimeMillis() + ((long) 300000), null, null, null, 14, null);
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService.rescheduleEidRefreshWithDefaultTtl.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EidService.this.eidDataStore.storeSdkEids(EidSdkData.copy$default(EidService.this.getEidData(), 0L, null, null, null, 15, null));
            }
        }, 1, null);
        EidRefreshMonitor.start$default(this.eidRefreshMonitor, this.eidData.getMfxRefreshTimestamp(), false, 2, null);
    }

    public final void addEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateDispatcher.addEidDataUpdateListener(listener);
    }

    @Nullable
    public final String getEid(@NotNull String partner) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        if (this.eidOverrides.containsKey(partner)) {
            INSTANCE.log$mobilefuse_sdk_core_release("(+) Returned overridden EID value for partner \"" + partner + '\"');
            return this.eidOverrides.get(partner);
        }
        if (!getManagedModeEnabled()) {
            INSTANCE.log$mobilefuse_sdk_core_release("(-) EID managed mode is disabled, skipped returning managed EID identifier");
            return null;
        }
        if (PrivacyCenter.INSTANCE.isVendorEnabled(partner)) {
            INSTANCE.log$mobilefuse_sdk_core_release("(+) Returned managed EID value for partner \"" + partner + '\"');
            return this.eidData.getSdkEids().get(partner);
        }
        INSTANCE.log$mobilefuse_sdk_core_release("(-) EID vendor " + partner + " is disabled, skipped returning EID identifier");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getEidData$mobilefuse_sdk_core_release, reason: from getter */
    public final EidSdkData getEidData() {
        return this.eidData;
    }

    @NotNull
    public final Map<String, String> getEidOverrides$mobilefuse_sdk_core_release() {
        return this.eidOverrides;
    }

    @NotNull
    public final Map<String, String> getEidsAsHttpQueryParams() {
        Either errorResult;
        Object value;
        Map<String, String> mapEmptyMap;
        Map<String, String> mapUriEncodeForBidRequest$mobilefuse_sdk_core_release;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (this.eidRequestProcessor.shouldApplyCoppaRestrictions()) {
                mapUriEncodeForBidRequest$mobilefuse_sdk_core_release = MapsKt.emptyMap();
            } else {
                EidsOutputTransformer eidsOutputTransformer = this.eidsOutputTransformer;
                if (getManagedModeEnabled()) {
                    mapEmptyMap = this.eidData.getSdkEids();
                } else {
                    INSTANCE.log$mobilefuse_sdk_core_release("(-) EID managed mode is disabled, use only overridden EID identifiers");
                    mapEmptyMap = MapsKt.emptyMap();
                }
                mapUriEncodeForBidRequest$mobilefuse_sdk_core_release = eidsOutputTransformer.uriEncodeForBidRequest$mobilefuse_sdk_core_release(mapEmptyMap, this.eidOverrides);
            }
            errorResult = new SuccessResult(mapUriEncodeForBidRequest$mobilefuse_sdk_core_release);
        } catch (Throwable th2) {
            if (EidService$getEidsAsHttpQueryParams$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = MapsKt.emptyMap();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Map) value;
    }

    /* JADX INFO: renamed from: getInitialized$mobilefuse_sdk_core_release, reason: from getter */
    public final boolean getInitialized() {
        return this.initialized;
    }

    public final boolean getManagedModeEnabled() {
        return this.managedModeEnabled;
    }

    /* JADX INFO: renamed from: getRequestPenaltyActive$mobilefuse_sdk_core_release, reason: from getter */
    public final boolean getRequestPenaltyActive() {
        return this.requestPenaltyActive;
    }

    public final void handleSdkStateChanged(@NotNull IdentifierUpdateSignal signal) {
        Intrinsics.checkNotNullParameter(signal, "signal");
        handleSdkStateChanged(SetsKt.setOf(signal));
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        if (this.initialized) {
            completeAction.invoke(this, Boolean.TRUE);
            return;
        }
        this.initialized = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.appVisibilityObserver.setOnAppVisibilityChanged(new EidService$initServiceImpl$1$1(this));
            this.eidRequestDebouncer.setOnEidRequest(new EidService$initServiceImpl$1$2(this));
            this.eidRefreshMonitor.setOnTimeout(new EidService$initServiceImpl$1$3(this));
            this.eidDataUpdateDispatcher.setEidOverridesFactory(new Function0<Map<String, String>>() { // from class: com.mobilefuse.sdk.identity.EidService$initServiceImpl$$inlined$handleExceptions$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Map<String, String> invoke() {
                    return this.this$0.getEidOverrides$mobilefuse_sdk_core_release();
                }
            });
            this.eidRequestProcessor.setOnNewEidDataReceived(new EidService$initServiceImpl$1$5(this));
            this.eidRequestProcessor.setOnNewEidDataError(new EidService$initServiceImpl$1$6(this));
            INSTANCE.log$mobilefuse_sdk_core_release("(+) Load cached EIDs");
            final Flow flowFlowSingle = FlowKt.flowSingle((Function0) new Function0<Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>>() { // from class: com.mobilefuse.sdk.identity.EidService$initServiceImpl$$inlined$handleExceptions$lambda$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Pair<? extends Map<String, ? extends String>, ? extends EidSdkData> invoke() {
                    return TuplesKt.to(this.this$0.eidDataStore.loadEidOverrides(), this.this$0.eidDataStore.loadSdkEids());
                }
            });
            final Schedulers schedulers = Schedulers.IO;
            final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>>, Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$$special$$inlined$emitOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>> flow2) {
                    Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                    SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$$special$$inlined$emitOn$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            flowFlowSingle.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidService$$special$.inlined.emitOn.1.1.1
                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    flow2.emit(value);
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitError(@NotNull Throwable error) {
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    FlowCollector.DefaultImpls.emitError(this, error);
                                }

                                @Override // com.mobilefuse.sdk.rx.FlowCollector
                                public void emitSuccess(T t10) {
                                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                                }
                            });
                        }
                    });
                }
            });
            final Schedulers schedulers2 = Schedulers.MAIN;
            FlowKt.flow(new Function1<FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>>, Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super Pair<? extends Map<String, ? extends String>, ? extends EidSdkData>> flow2) {
                    Intrinsics.checkNotNullParameter(flow2, "$this$flow");
                    flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidService$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow2;
                            SchedulersKt.runOnScheduler(schedulers2, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$$special$.inlined.runOn.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    flowCollector.emit(value);
                                }
                            });
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t10) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t10);
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.EidService$initServiceImpl$$inlined$handleExceptions$lambda$3
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) throws Throwable {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Pair pair = (Pair) ((SuccessResult) result).getValue();
                        this.this$0.getEidOverrides$mobilefuse_sdk_core_release().putAll((Map) pair.getFirst());
                        this.this$0.setEidData$mobilefuse_sdk_core_release((EidSdkData) pair.getSecond());
                        this.this$0.eidDataUpdateDispatcher.dispatchUpdatedEidData(this.this$0.getEidData(), this.this$0.getEidOverrides$mobilefuse_sdk_core_release().keySet(), true);
                        this.this$0.eidDataUpdateDispatcher.dispatchUpdatedEidData(this.this$0.getEidData(), this.this$0.getEidData().getSdkEids().keySet(), false);
                        this.this$0.eidRefreshMonitor.start(this.this$0.getEidData().getMfxRefreshTimestamp(), true);
                        this.this$0.appVisibilityObserver.startActivityLifecycleObserving();
                        completeAction.invoke(this.this$0, Boolean.TRUE);
                    }
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t10) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                }
            });
        } catch (Throwable th2) {
            int i10 = EidService$initServiceImpl$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @VisibleForTesting
    public final void onEidRefreshTimeout$mobilefuse_sdk_core_release() {
        Companion companion = INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) EID refresh timer timeout occured");
        if (!this.requestPenaltyActive) {
            handleSdkStateChanged(IdentifierUpdateSignal.EID_REFRESH_TIMEOUT);
        } else {
            companion.log$mobilefuse_sdk_core_release("(+) release request time penalty, don't emit refresh signal");
            this.requestPenaltyActive = false;
        }
    }

    @VisibleForTesting
    public final void onEidRequest$mobilefuse_sdk_core_release(@NotNull EidSdkData eidData, @NotNull Set<? extends IdentifierUpdateSignal> updateSignals) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(updateSignals, "updateSignals");
        Companion companion = INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) EID refresh request has been debounced. Schedule sending it.");
        if (!getManagedModeEnabled()) {
            companion.log$mobilefuse_sdk_core_release("(-) MFX EID managed mode is disabled, reject processing debounced EID refresh");
        } else if (this.requestPenaltyActive) {
            companion.log$mobilefuse_sdk_core_release("(-) time penalty is currently active, reject processing debounced EID refresh");
        } else {
            this.eidRequestProcessor.processRequest(eidData, updateSignals, !this.appVisibilityObserver.getAppIsInForeground());
        }
    }

    @VisibleForTesting
    public final void onNewEidDataError$mobilefuse_sdk_core_release(@NotNull BaseError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!getManagedModeEnabled()) {
                INSTANCE.log$mobilefuse_sdk_core_release("(-) MFX EID managed mode is disabled: skipped processing EID response error: " + error);
                return;
            }
            if (this.requestPenaltyActive) {
                INSTANCE.log$mobilefuse_sdk_core_release("(-) time penalty is currently active, reject processing EID response error");
                return;
            }
            Companion companion = INSTANCE;
            companion.log$mobilefuse_sdk_core_release("(-) Error server response for EID refresh request: " + error.getMessage());
            if (!(error instanceof HttpError.ConnectionError)) {
                rescheduleEidRefreshWithDefaultTtl("An EID request failed due to a non-network connection error");
                return;
            }
            int statusCode = ((HttpError.ConnectionError) error).getStatusCode();
            if (statusCode == 204) {
                rescheduleEidRefreshWithDefaultTtl("An EID request had an empty response (no content)");
                return;
            }
            if (statusCode == 400) {
                rescheduleEidRefreshWithDefaultTtl("Bad EID request");
                return;
            }
            if (statusCode == 429) {
                companion.log$mobilefuse_sdk_core_release("(-) Too many EID requests. Pause refreshing for 300 seconds and ignore EID signals");
                this.requestPenaltyActive = true;
                EidRefreshMonitor.start$default(this.eidRefreshMonitor, System.currentTimeMillis() + ((long) 300000), false, 2, null);
            } else {
                rescheduleEidRefreshWithDefaultTtl("An EID request failed with HTTP status code " + statusCode);
            }
        } catch (Throwable th2) {
            int i10 = EidService$onNewEidDataError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @VisibleForTesting
    public final void onNewEidDataReceived$mobilefuse_sdk_core_release(@NotNull final EidSdkData eidData, @NotNull final Set<String> alteredEids) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(alteredEids, "alteredEids");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!getManagedModeEnabled()) {
                INSTANCE.log$mobilefuse_sdk_core_release("(-) MFX EID managed mode is disabled, reject received new EID data");
                return;
            }
            if (this.requestPenaltyActive) {
                INSTANCE.log$mobilefuse_sdk_core_release("(-) time penalty is currently active, reject processing received EID response");
                return;
            }
            INSTANCE.log$mobilefuse_sdk_core_release("(+) Received new EID data from server with altered EIDs for partners: " + alteredEids);
            this.eidData = eidData;
            SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$onNewEidDataReceived$$inlined$handleExceptions$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.eidDataStore.storeSdkEids(EidSdkData.copy$default(eidData, 0L, null, null, null, 15, null));
                }
            }, 1, null);
            EidRefreshMonitor.start$default(this.eidRefreshMonitor, eidData.getMfxRefreshTimestamp(), false, 2, null);
            this.eidDataUpdateDispatcher.dispatchUpdatedEidData(eidData, alteredEids, false);
        } catch (Throwable th2) {
            int i10 = EidService$onNewEidDataReceived$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void overrideEid(@NotNull String partner, @Nullable String value) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        Companion companion = INSTANCE;
        companion.log$mobilefuse_sdk_core_release("(+) Requested EID override for partner: \"" + partner + "\" with value \"" + value + '\"');
        if (value == null || value.length() == 0) {
            companion.log$mobilefuse_sdk_core_release("(+) Clear EID override");
            if (!this.eidOverrides.containsKey(partner)) {
                companion.log$mobilefuse_sdk_core_release("(-) Can't find partner \"" + partner + "\" to clear override value. Ignore request.");
                return;
            }
            companion.log$mobilefuse_sdk_core_release("(+) Clear EID override for partner \"" + partner + '\"');
            this.eidOverrides.remove(partner);
            SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService.overrideEid.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    EidService.this.eidDataStore.storeEidOverrides(MapsKt.toMap(EidService.this.getEidOverrides$mobilefuse_sdk_core_release()));
                }
            }, 1, null);
            this.eidDataUpdateDispatcher.dispatchUpdatedEidData(this.eidData, SetsKt.setOf(partner), getEid(partner) == null);
            return;
        }
        if (Intrinsics.areEqual(this.eidOverrides.get(partner), value)) {
            companion.log$mobilefuse_sdk_core_release("(-) Already found EID value \"" + value + "\" for partner \"" + partner + "\". Ignore request.");
            return;
        }
        companion.log$mobilefuse_sdk_core_release("(+) Successfully set EID override for partner \"" + partner + "\" to value \"" + value + '\"');
        this.eidOverrides.put(partner, value);
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.EidService.overrideEid.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EidService.this.eidDataStore.storeEidOverrides(MapsKt.toMap(EidService.this.getEidOverrides$mobilefuse_sdk_core_release()));
            }
        }, 1, null);
        this.eidDataUpdateDispatcher.dispatchUpdatedEidData(this.eidData, SetsKt.setOf(partner), true);
    }

    public final void removeEidDataUpdateListener(@NotNull EidDataUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.eidDataUpdateDispatcher.removeEidDataUpdateListener(listener);
    }

    @VisibleForTesting
    public final void requireInitializedEidService$mobilefuse_sdk_core_release() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (getState() != ServiceInitState.IDLE) {
                return;
            }
            MobileFuseServices.initServices(SetsKt.setOf(EidServiceKt.getEidService()), new Function1<Either<? extends ServicesInitError, ? extends ServicesInitResult>, Unit>() { // from class: com.mobilefuse.sdk.identity.EidService$requireInitializedEidService$1$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Either<ServicesInitError, ServicesInitResult> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Either<? extends ServicesInitError, ? extends ServicesInitResult> either) {
                    invoke2((Either<ServicesInitError, ServicesInitResult>) either);
                    return Unit.f93236a;
                }
            });
        } catch (Throwable th2) {
            int i10 = EidService$requireInitializedEidService$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
    }

    public final void setEidData$mobilefuse_sdk_core_release(@NotNull EidSdkData eidSdkData) {
        Intrinsics.checkNotNullParameter(eidSdkData, "<set-?>");
        this.eidData = eidSdkData;
    }

    public final void setInitialized$mobilefuse_sdk_core_release(boolean z10) {
        this.initialized = z10;
    }

    public final void setManagedModeEnabled(boolean z10) {
        this.managedModeEnabled = z10;
        if (getState() == ServiceInitState.INITIALIZED) {
            handleSdkStateChanged(IdentifierUpdateSignal.VENDOR_ENABLEMENT_CHANGED);
        }
    }

    public final void setRequestPenaltyActive$mobilefuse_sdk_core_release(boolean z10) {
        this.requestPenaltyActive = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EidService(AppVisibilityObserver appVisibilityObserver, EidPrefsDataStore eidPrefsDataStore, EidRequestDebouncer eidRequestDebouncer, EidRefreshMonitor eidRefreshMonitor, EidDataUpdateDispatcher eidDataUpdateDispatcher, EidRequestBuilder eidRequestBuilder, EidRequestProcessor eidRequestProcessor, EidsOutputTransformer eidsOutputTransformer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        AppVisibilityObserver appVisibilityObserver2 = (i10 & 1) != 0 ? new AppVisibilityObserver() : appVisibilityObserver;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        int i11 = 1;
        EidPrefsDataStore eidPrefsDataStore2 = (i10 & 2) != 0 ? new EidPrefsDataStore(null, i11, 0 == true ? 1 : 0) : eidPrefsDataStore;
        EidRequestDebouncer eidRequestDebouncer2 = (i10 & 4) != 0 ? new EidRequestDebouncer(0L, i11, b12 == true ? 1 : 0) : eidRequestDebouncer;
        EidRefreshMonitor eidRefreshMonitor2 = (i10 & 8) != 0 ? new EidRefreshMonitor() : eidRefreshMonitor;
        EidDataUpdateDispatcher eidDataUpdateDispatcher2 = (i10 & 16) != 0 ? new EidDataUpdateDispatcher() : eidDataUpdateDispatcher;
        EidRequestBuilder eidRequestBuilder2 = (i10 & 32) != 0 ? new EidRequestBuilder(new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuseTargetingData.INSTANCE.getEmail();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.2
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuseTargetingData.INSTANCE.getPhoneNumber();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.3
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuseSettings.getAdvertisingId();
            }
        }, new Function0<Boolean>() { // from class: com.mobilefuse.sdk.identity.EidService.4
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return MobileFuseSettings.isLimitTrackingEnabled();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.5
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuse.getPrivacyPreferences().getGppConsentString();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.6
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuse.getPrivacyPreferences().getUsPrivacyConsentString();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.7
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return AppLifecycleHelper.getGlobalContext().getPackageName();
            }
        }, new Function0<String>() { // from class: com.mobilefuse.sdk.identity.EidService.8
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return MobileFuseSettings.getAppVersionName();
            }
        }, false, 256, null) : eidRequestBuilder;
        this(appVisibilityObserver2, eidPrefsDataStore2, eidRequestDebouncer2, eidRefreshMonitor2, eidDataUpdateDispatcher2, eidRequestBuilder2, (i10 & 64) != 0 ? new EidRequestProcessor(eidRequestBuilder2, null, null, 6, null) : eidRequestProcessor, (i10 & 128) != 0 ? new EidsOutputTransformer(b11 == true ? 1 : 0, i11, b10 == true ? 1 : 0) : eidsOutputTransformer);
    }

    public final void handleSdkStateChanged(@NotNull Set<? extends IdentifierUpdateSignal> signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            requireInitializedEidService$mobilefuse_sdk_core_release();
            Companion companion = INSTANCE;
            companion.log$mobilefuse_sdk_core_release("(+) Received request to refresh EIDs with signals: " + signals);
            if (!getManagedModeEnabled()) {
                companion.log$mobilefuse_sdk_core_release("(-) EID managed mode is disabled, reject EID update signal");
            } else if (this.requestPenaltyActive) {
                companion.log$mobilefuse_sdk_core_release("(-) time penalty is currently active, reject EID update signal");
            } else {
                this.eidRequestDebouncer.debounceEidUpdate(this.eidData, signals);
            }
        } catch (Throwable th2) {
            int i10 = EidService$handleSdkStateChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    @VisibleForTesting
    public EidService(@NotNull AppVisibilityObserver appVisibilityObserver, @NotNull EidPrefsDataStore eidDataStore, @NotNull EidRequestDebouncer eidRequestDebouncer, @NotNull EidRefreshMonitor eidRefreshMonitor, @NotNull EidDataUpdateDispatcher eidDataUpdateDispatcher, @NotNull EidRequestBuilder eidRequestBuilder, @NotNull EidRequestProcessor eidRequestProcessor, @NotNull EidsOutputTransformer eidsOutputTransformer) {
        Intrinsics.checkNotNullParameter(appVisibilityObserver, "appVisibilityObserver");
        Intrinsics.checkNotNullParameter(eidDataStore, "eidDataStore");
        Intrinsics.checkNotNullParameter(eidRequestDebouncer, "eidRequestDebouncer");
        Intrinsics.checkNotNullParameter(eidRefreshMonitor, "eidRefreshMonitor");
        Intrinsics.checkNotNullParameter(eidDataUpdateDispatcher, "eidDataUpdateDispatcher");
        Intrinsics.checkNotNullParameter(eidRequestBuilder, "eidRequestBuilder");
        Intrinsics.checkNotNullParameter(eidRequestProcessor, "eidRequestProcessor");
        Intrinsics.checkNotNullParameter(eidsOutputTransformer, "eidsOutputTransformer");
        this.appVisibilityObserver = appVisibilityObserver;
        this.eidDataStore = eidDataStore;
        this.eidRequestDebouncer = eidRequestDebouncer;
        this.eidRefreshMonitor = eidRefreshMonitor;
        this.eidDataUpdateDispatcher = eidDataUpdateDispatcher;
        this.eidRequestBuilder = eidRequestBuilder;
        this.eidRequestProcessor = eidRequestProcessor;
        this.eidsOutputTransformer = eidsOutputTransformer;
        this.eidOverrides = new LinkedHashMap();
        this.eidData = new EidSdkData(0L, null, null, null, 15, null);
        this.managedModeEnabled = true;
    }
}
