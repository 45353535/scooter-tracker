package com.appodeal.ads.services.firebase;

import android.content.ContextWrapper;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.InitializationMode;
import com.appodeal.ads.modules.common.internal.service.InternalEventTracker;
import com.appodeal.ads.modules.common.internal.service.RevenueTracker;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.impl.ServiceInitializationAwaiterImpl;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.service.ServiceError;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/appodeal/ads/services/firebase/FirebaseService;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceDataProvider;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/RevenueTracker;", "Lcom/appodeal/ads/modules/common/internal/service/InternalEventTracker;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceInitializationAwaiter;", "<init>", "()V", "firebase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FirebaseService implements Service<ServiceOptions.Firebase>, ServiceDataProvider<ServiceData.Firebase>, RevenueTracker, InternalEventTracker, ServiceInitializationAwaiter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ServiceData.Firebase f14663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConnectorCallback f14664g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ServiceInitializationAwaiterImpl f14658a = new ServiceInitializationAwaiterImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f14659b = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.firebase.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FirebaseService.a();
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14665h = ServiceOptions.Firebase.DefaultAdRevenueKey;

    public static final ServiceInfo a() {
        String property;
        boolean z10;
        Properties properties;
        ClassLoader classLoader;
        try {
            properties = new Properties();
            classLoader = Unit.f93236a.getClass().getClassLoader();
        } catch (Throwable th2) {
            LogExtKt.logInternal("FirebaseService", "Failed to get sdk version", th2);
            property = "23.0.0";
        }
        if (classLoader == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        properties.load(classLoader.getResourceAsStream("firebase-analytics.properties"));
        property = properties.getProperty("firebase-analytics_client");
        if (property == null) {
            property = properties.getProperty("version");
        }
        if (property == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        try {
            List<FirebaseApp> apps = FirebaseApp.getApps(new ContextWrapper(null));
            Intrinsics.checkNotNullExpressionValue(apps, "getApps(...)");
            z10 = !apps.isEmpty();
        } catch (Throwable th3) {
            LogExtKt.logInternal("FirebaseService", "Failed to check is initialized", th3);
            z10 = false;
        }
        return new ServiceInfo(RemoteConfigComponent.DEFAULT_NAMESPACE, property, "0", z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.appodeal.ads.services.firebase.FirebaseService r4, java.util.List r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.firebase.FirebaseService.c(com.appodeal.ads.services.firebase.FirebaseService, java.util.List, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    public final Object await(Continuation continuation) {
        return this.f14658a.await(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions.Firebase r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.services.firebase.d
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.services.firebase.d r0 = (com.appodeal.ads.services.firebase.d) r0
            int r1 = r0.f14673t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14673t = r1
            goto L18
        L13:
            com.appodeal.ads.services.firebase.d r0 = new com.appodeal.ads.services.firebase.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14671r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14673t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            com.appodeal.ads.services.firebase.i r6 = new com.appodeal.ads.services.firebase.i
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.f14673t = r3
            java.lang.Object r6 = kotlinx.coroutines.i.g(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.firebase.FirebaseService.mo4428initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions$Firebase, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final ServiceInfo getInfo() {
        return (ServiceInfo) this.f14659b.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceDataProvider
    public final ServiceData getServiceData() {
        return this.f14663f;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.InternalEventTracker
    public final void internalLogEvent(String eventName, Map params) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f14660c) {
            AnalyticsKt.getAnalytics(Firebase.INSTANCE).logEvent(eventName, b.a(params));
            LogExtKt.logInternal$default("FirebaseService", "Appodeal invoked internalLogEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.InternalEventTracker
    /* JADX INFO: renamed from: isInternalEventTrackingEnabled, reason: from getter */
    public final boolean getF14660c() {
        return this.f14660c;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    public final void launchAwaitingAsync(long j10) {
        this.f14658a.launchAwaitingAsync(j10);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final void logEvent(String eventName, Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (this.f14661d) {
            AnalyticsKt.getAnalytics(Firebase.INSTANCE).logEvent(eventName, map != null ? b.a(map) : null);
            LogExtKt.logInternal$default("FirebaseService", "Appodeal invoked logEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: preInitialize-gIAlu-s */
    public final Object mo4429preInitializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        ServiceOptions.Firebase firebase = (ServiceOptions.Firebase) serviceOptions;
        this.f14664g = firebase.getConnectorCallback();
        this.f14661d = firebase.getIsEventTrackingEnabled();
        this.f14662e = firebase.getIsRevenueTrackingEnabled();
        this.f14660c = firebase.getIsInternalEventTrackingEnabled();
        this.f14665h = firebase.getAdRevenueKey();
        if (firebase.getMode() == InitializationMode.Active) {
            FirebaseAnalytics.getInstance(firebase.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String()).setAnalyticsCollectionEnabled(false);
            if (FirebaseKt.initialize(Firebase.INSTANCE, firebase.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String()) == null) {
                return ResultExtKt.asFailure(ServiceError.FirebaseAnalytics.GoogleServicesNotApplied.INSTANCE);
            }
        }
        return ResultExtKt.asSuccess(Unit.f93236a);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceInitializationAwaiter
    public final void releaseAwaiter() {
        this.f14658a.releaseAwaiter();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.RevenueTracker
    public final void trackRevenue(RevenueInfo revenueInfo) {
        Intrinsics.checkNotNullParameter(revenueInfo, "revenueInfo");
        if (this.f14662e) {
            FirebaseAnalytics analytics = AnalyticsKt.getAnalytics(Firebase.INSTANCE);
            String str = this.f14665h;
            ParametersBuilder parametersBuilder = new ParametersBuilder();
            parametersBuilder.param(FirebaseAnalytics.Param.AD_PLATFORM, k.a(revenueInfo.getRevenuePlatform()));
            parametersBuilder.param(FirebaseAnalytics.Param.AD_SOURCE, revenueInfo.getNetworkName());
            parametersBuilder.param("ad_format", revenueInfo.getAdTypeString());
            parametersBuilder.param(FirebaseAnalytics.Param.AD_UNIT_NAME, StringsKt.J1(revenueInfo.getAdUnitName(), 100));
            parametersBuilder.param("value", revenueInfo.getRevenue());
            parametersBuilder.param("currency", revenueInfo.getCurrency());
            for (Map.Entry<String, String> entry : revenueInfo.getPayload().entrySet()) {
                parametersBuilder.param(entry.getKey(), entry.getValue());
            }
            analytics.logEvent(str, parametersBuilder.getF31736a());
            LogExtKt.logInternal$default("FirebaseService", "Appodeal invoked trackRevenue with " + revenueInfo, null, 4, null);
        }
    }
}
