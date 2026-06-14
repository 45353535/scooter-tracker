package com.appodeal.ads.services.adjust;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.Constants;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.purchase.ADJPConfig;
import com.adjust.sdk.purchase.ADJPLogLevel;
import com.adjust.sdk.purchase.AdjustPurchase;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.InitializationMode;
import com.appodeal.ads.modules.common.internal.service.Purchasable;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.service.ServiceError;
import eg.e0;
import eg.o0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/appodeal/ads/services/adjust/AdjustService;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/Purchasable;", "Lcom/appodeal/ads/modules/common/internal/service/RevenueTracker;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceDataProvider;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Adjust;", "<init>", "()V", "adjust_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdjustService implements Service<ServiceOptions.Adjust>, Purchasable, RevenueTracker, ServiceDataProvider<ServiceData.Adjust> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConnectorCallback f14522b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14524d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14521a = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdjustService.h();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f14523c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f14525e = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdjustService.f();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f14526f = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdjustService.i();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f14527g = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdjustService.d();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14528h = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.adjust.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AdjustService.a();
        }
    });

    public static final com.appodeal.ads.services.adjust.purchasable.f a() {
        return new com.appodeal.ads.services.adjust.purchasable.f();
    }

    public static final com.appodeal.ads.services.adjust.revenue.b d() {
        return new com.appodeal.ads.services.adjust.revenue.b();
    }

    public static final Map e(ServiceOptions.Adjust adjust) {
        return adjust.getConnectorCallback().getPartnerParams().getParamsMap();
    }

    public static final com.appodeal.ads.services.adjust.collector.e f() {
        return new com.appodeal.ads.services.adjust.collector.e();
    }

    public static final Map g(ServiceOptions.Adjust adjust) {
        return adjust.getConnectorCallback().getPartnerParams().getParamsMap();
    }

    public static final ServiceInfo h() {
        return new ServiceInfo("adjust", Constants.CLIENT_SDK, "0", k.a());
    }

    public static final CoroutineScope i() {
        return kotlinx.coroutines.i.a(o0.a().plus(new e0("ApdAdjustService")));
    }

    public final Object b(final ServiceOptions.Adjust adjust) {
        LogExtKt.logInternal$default("AdjustService", "Initialization mode: " + adjust.getMode(), null, 4, null);
        Context context = adjust.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String();
        String appToken = adjust.getAppToken();
        String environment = adjust.getEnvironment();
        this.f14523c = adjust.getEventTokens();
        this.f14522b = adjust.getConnectorCallback();
        this.f14524d = adjust.getIsEventTrackingEnabled();
        InitializationMode mode = adjust.getMode();
        if (mode == InitializationMode.Passive && !k.a()) {
            Log.d("Appodeal", "Service [Info]: If you using passive mode, you should initialize Adjust SDK before Appodeal SDK init.\nSee: https://docs.appodeal.com/android/services/services-passive-mode#initialize-adjust");
        }
        hg.i.F(hg.i.K(((com.appodeal.ads.services.adjust.collector.e) ((com.appodeal.ads.services.adjust.collector.b) this.f14525e.getValue())).f14541a, new i(adjust.getConnectorCallback(), null)), (CoroutineScope) this.f14526f.getValue());
        ((com.appodeal.ads.services.adjust.revenue.b) this.f14527g.getValue()).b(adjust.getIsRevenueTrackingEnabled(), new Function0() { // from class: com.appodeal.ads.services.adjust.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdjustService.e(adjust);
            }
        });
        ((com.appodeal.ads.services.adjust.purchasable.f) this.f14528h.getValue()).d(new j(this), new Function0() { // from class: com.appodeal.ads.services.adjust.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdjustService.g(adjust);
            }
        });
        if (mode == InitializationMode.Active) {
            if (appToken.length() == 0) {
                return ResultExtKt.asFailure(ServiceError.Adjust.NoAppToken.INSTANCE);
            }
            if (environment.length() == 0) {
                return ResultExtKt.asFailure(ServiceError.Adjust.NoEnvironment.INSTANCE);
            }
            AdjustConfig adjustConfig = new AdjustConfig(context, appToken, environment);
            adjustConfig.setLogLevel(adjust.getIsLoggingEnabled() ? LogLevel.VERBOSE : LogLevel.INFO);
            adjustConfig.enableFirstSessionDelay();
            adjustConfig.setExternalDeviceId(adjust.getAdId());
            ADJPConfig aDJPConfig = new ADJPConfig(appToken, environment);
            aDJPConfig.setLogLevel(adjust.getIsLoggingEnabled() ? ADJPLogLevel.VERBOSE : ADJPLogLevel.INFO);
            AdjustPurchase.init(aDJPConfig);
            adjustConfig.setOnAttributionChangedListener((com.appodeal.ads.services.adjust.collector.b) this.f14525e.getValue());
            Adjust.initSdk(adjustConfig);
            Adjust.onResume();
            Adjust.setExternalDeviceIdInDelay(adjust.getAdId());
        }
        return ResultExtKt.asSuccess(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions.Adjust r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.adjust.AdjustService.mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions$Adjust, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final ServiceInfo getInfo() {
        return (ServiceInfo) this.f14521a.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceDataProvider
    public final ServiceData getServiceData() {
        return ((com.appodeal.ads.services.adjust.collector.a) ((com.appodeal.ads.services.adjust.collector.e) ((com.appodeal.ads.services.adjust.collector.b) this.f14525e.getValue())).f14541a.getValue()).a();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final void logEvent(String eventName, Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (this.f14524d) {
            String str = (String) this.f14523c.get(eventName);
            if (str == null) {
                str = (String) this.f14523c.get("hs_sdk_unknown");
            }
            AdjustEvent adjustEvent = new AdjustEvent(str);
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            ConnectorCallback connectorCallback = this.f14522b;
            if (connectorCallback == null) {
                throw new IllegalArgumentException("callback can not be null!");
            }
            for (Map.Entry entry : MapsKt.plus(map, connectorCallback.getPartnerParams().getParamsMap()).entrySet()) {
                String str2 = (String) entry.getKey();
                String strValueOf = String.valueOf(entry.getValue());
                adjustEvent.addPartnerParameter(str2, strValueOf);
                adjustEvent.addCallbackParameter(str2, strValueOf);
            }
            Adjust.trackEvent(adjustEvent);
            LogExtKt.logInternal$default("AdjustService", "Appodeal invoked logEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: preInitialize-gIAlu-s */
    public final /* bridge */ /* synthetic */ Object mo4429preInitializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        return b((ServiceOptions.Adjust) serviceOptions);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.RevenueTracker
    public final void trackRevenue(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        ((com.appodeal.ads.services.adjust.revenue.b) this.f14527g.getValue()).trackRevenue(revenueInfo);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Purchasable
    public final Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation) {
        return ((com.appodeal.ads.services.adjust.purchasable.f) this.f14528h.getValue()).validatePurchase(inAppPurchase, continuation);
    }
}
