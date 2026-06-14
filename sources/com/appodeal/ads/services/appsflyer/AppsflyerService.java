package com.appodeal.ads.services.appsflyer;

import android.content.Context;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.InternalEventTracker;
import com.appodeal.ads.modules.common.internal.service.Purchasable;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.service.ServiceError;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
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
import kotlinx.coroutines.Job;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/services/appsflyer/AppsflyerService;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/Purchasable;", "Lcom/appodeal/ads/modules/common/internal/service/RevenueTracker;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceDataProvider;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$AppsFlyer;", "Lcom/appodeal/ads/modules/common/internal/service/InternalEventTracker;", "<init>", "()V", "appsflyer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppsflyerService implements Service<ServiceOptions.Appsflyer>, Purchasable, RevenueTracker, ServiceDataProvider<ServiceData.AppsFlyer>, InternalEventTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConnectorCallback f14572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f14573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f14575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14576f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.appodeal.ads.services.appsflyer.purchasable.a f14579i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14571a = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppsflyerService.h();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f14577g = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppsflyerService.e();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f14578h = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppsflyerService.i();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f14580j = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.appsflyer.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppsflyerService.a();
        }
    });

    public static final com.appodeal.ads.services.appsflyer.revenue.b a() {
        return new com.appodeal.ads.services.appsflyer.revenue.b();
    }

    public static final Map d(AppsflyerService appsflyerService) {
        ConnectorCallback connectorCallback = appsflyerService.f14572b;
        if (connectorCallback != null) {
            return connectorCallback.getPartnerParams().getParamsMap();
        }
        throw new IllegalArgumentException("callback can not be null!");
    }

    public static final com.appodeal.ads.services.appsflyer.collector.e e() {
        return new com.appodeal.ads.services.appsflyer.collector.e();
    }

    public static final Unit f(AppsflyerService appsflyerService) {
        Job job = appsflyerService.f14575e;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        appsflyerService.f14575e = null;
        return Unit.f93236a;
    }

    public static final ServiceInfo h() {
        String sdkVersion = AppsFlyerLib.getInstance().getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion(...)");
        return new ServiceInfo("appsflyer", sdkVersion, "0", false);
    }

    public static final CoroutineScope i() {
        return kotlinx.coroutines.i.a(o0.a().plus(new e0("ApdAppsflyerService")));
    }

    public final Object b(ServiceOptions.Appsflyer appsflyer) {
        LogExtKt.logInternal$default("AppsflyerService", "Pre-Initialization mode: " + appsflyer.getCom.ironsource.b4.a.t java.lang.String(), null, 4, null);
        this.f14572b = appsflyer.getConnectorCallback();
        this.f14573c = appsflyer.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String();
        this.f14576f = appsflyer.getIsEventTrackingEnabled();
        this.f14574d = appsflyer.getIsInternalEventTrackingEnabled();
        ((com.appodeal.ads.services.appsflyer.collector.e) ((com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue())).e(appsflyer.getConversionKeys(), new Function0() { // from class: com.appodeal.ads.services.appsflyer.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppsflyerService.f(this.f14590b);
            }
        });
        ConnectorCallback connectorCallback = appsflyer.getConnectorCallback();
        this.f14575e = hg.i.F(hg.i.K(((com.appodeal.ads.services.appsflyer.collector.e) ((com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue())).f14587b, new i(connectorCallback, null)), (CoroutineScope) this.f14578h.getValue());
        hg.i.F(hg.i.K(((com.appodeal.ads.services.appsflyer.collector.e) ((com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue())).f14586a, new j(connectorCallback, null)), (CoroutineScope) this.f14578h.getValue());
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        ConnectorCallback connectorCallback2 = this.f14572b;
        if (connectorCallback2 == null) {
            throw new IllegalArgumentException("callback can not be null!");
        }
        appsFlyerLib.setAdditionalData(connectorCallback2.getPartnerParams().getParamsMap());
        int i10 = g.f14591a[appsflyer.getCom.ironsource.b4.a.t java.lang.String().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new m();
            }
            if (appsflyer.getDevKey().length() == 0) {
                return ResultExtKt.asFailure(ServiceError.Appsflyer.NoDevKeyProvided.INSTANCE);
            }
            if (appsflyer.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String().length() == 0) {
                return ResultExtKt.asFailure(ServiceError.Appsflyer.NoAppIdProvided.INSTANCE);
            }
            appsFlyerLib.setDebugLog(appsflyer.getIsLoggingEnabled());
            appsFlyerLib.setLogLevel(appsflyer.getIsLoggingEnabled() ? AFLogger.LogLevel.VERBOSE : AFLogger.LogLevel.NONE);
            appsFlyerLib.setAppId(appsflyer.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            appsFlyerLib.enableTCFDataCollection(true);
            appsFlyerLib.init(appsflyer.getDevKey(), (com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue(), g());
            appsFlyerLib.logEvent(g(), null, null);
            com.appodeal.ads.services.appsflyer.collector.a aVar = (com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue();
            Intrinsics.checkNotNull(appsFlyerLib);
            ((com.appodeal.ads.services.appsflyer.collector.e) aVar).d(appsFlyerLib, g(), "Pre-Initialize");
        }
        return ResultExtKt.asSuccess(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions.Appsflyer r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.appsflyer.AppsflyerService.mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions$Appsflyer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Context g() {
        Context context = this.f14573c;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("context can not be null!");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final ServiceInfo getInfo() {
        return (ServiceInfo) this.f14571a.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceDataProvider
    public final ServiceData getServiceData() {
        return (ServiceData.AppsFlyer) ((com.appodeal.ads.services.appsflyer.collector.e) ((com.appodeal.ads.services.appsflyer.collector.a) this.f14577g.getValue())).f14586a.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.InternalEventTracker
    public final void internalLogEvent(String eventName, Map params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f14574d) {
            AppsFlyerLib.getInstance().logEvent(g(), eventName, params);
            LogExtKt.logInternal$default("AppsflyerService", "Appodeal invoked internalLogEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.InternalEventTracker
    /* JADX INFO: renamed from: isInternalEventTrackingEnabled, reason: from getter */
    public final boolean getF14574d() {
        return this.f14574d;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final void logEvent(String eventName, Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (this.f14576f) {
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            ConnectorCallback connectorCallback = this.f14572b;
            if (connectorCallback == null) {
                throw new IllegalArgumentException("callback can not be null!");
            }
            AppsFlyerLib.getInstance().logEvent(g(), eventName, MapsKt.plus(map, connectorCallback.getPartnerParams().getParamsMap()));
            LogExtKt.logInternal$default("AppsflyerService", "Appodeal invoked logEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: preInitialize-gIAlu-s */
    public final /* bridge */ /* synthetic */ Object mo4429preInitializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        return b((ServiceOptions.Appsflyer) serviceOptions);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.RevenueTracker
    public final void trackRevenue(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        ((com.appodeal.ads.services.appsflyer.revenue.b) this.f14580j.getValue()).trackRevenue(revenueInfo);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Purchasable
    public final Object validatePurchase(InAppPurchase inAppPurchase, Continuation continuation) {
        com.appodeal.ads.services.appsflyer.purchasable.a aVar = this.f14579i;
        if (aVar != null) {
            return aVar.validatePurchase(inAppPurchase, continuation);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
