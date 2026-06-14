package com.appodeal.ads.services.facebook_analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceDataProvider;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.service.ServiceError;
import com.facebook.AccessToken;
import com.facebook.appevents.o;
import com.facebook.d0;
import com.facebook.s;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/services/facebook_analytics/FacebookAnalyticsService;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceDataProvider;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceData$FacebookAnalytics;", "<init>", "()V", "facebook_analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FacebookAnalyticsService implements Service<ServiceOptions.FacebookAnalytics>, ServiceDataProvider<ServiceData.FacebookAnalytics> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14653a = i.a(new Function0() { // from class: com.appodeal.ads.services.facebook_analytics.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FacebookAnalyticsService.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f14654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConnectorCallback f14655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceData.FacebookAnalytics f14657e;

    public static final ServiceInfo a() {
        return new ServiceInfo("facebook_analytics", s.z(), "0", s.D());
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final ServiceInfo getInfo() {
        return (ServiceInfo) this.f14653a.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.ServiceDataProvider
    public final ServiceData getServiceData() {
        return this.f14657e;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: initialize-gIAlu-s */
    public final Object mo4428initializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        ServiceOptions.FacebookAnalytics facebookAnalytics = (ServiceOptions.FacebookAnalytics) serviceOptions;
        Context context = facebookAnalytics.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle.getString("com.facebook.sdk.ApplicationId");
            if (string != null && !StringsKt.y0(string)) {
                String string2 = bundle.getString("com.facebook.sdk.ClientToken");
                if (string2 == null || StringsKt.y0(string2)) {
                    return ResultExtKt.asFailure(ServiceError.FacebookAnalytics.ClientTokenIsNotOverridden.INSTANCE);
                }
                this.f14655c = facebookAnalytics.getConnectorCallback();
                this.f14656d = facebookAnalytics.getIsEventTrackingEnabled();
                if (facebookAnalytics.getIsLoggingEnabled()) {
                    s.T(true);
                    s.j(d0.APP_EVENTS);
                }
                if (this.f14654b == null) {
                    this.f14654b = o.f19698b.f(context);
                }
                AccessToken accessTokenE = AccessToken.INSTANCE.e();
                if (accessTokenE != null && !accessTokenE.n()) {
                    ServiceData.FacebookAnalytics facebookAnalytics2 = new ServiceData.FacebookAnalytics(accessTokenE.getUserId(), accessTokenE.getApplicationId());
                    ConnectorCallback connectorCallback = this.f14655c;
                    if (connectorCallback == null) {
                        throw new IllegalArgumentException("callback can not be null!");
                    }
                    connectorCallback.onServiceDataUpdated(facebookAnalytics2);
                    this.f14657e = facebookAnalytics2;
                }
                return ResultExtKt.asSuccess(Unit.f93236a);
            }
            return ResultExtKt.asFailure(ServiceError.FacebookAnalytics.AppIdIsNotOverridden.INSTANCE);
        } catch (Throwable th2) {
            LogExtKt.logInternal("FacebookAnalyticsService", "Failed to get meta data from manifest", th2);
            return ResultExtKt.asFailure(ServiceError.Internal.INSTANCE);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final void logEvent(String eventName, Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (this.f14656d) {
            o oVar = this.f14654b;
            if (oVar != null) {
                oVar.b(eventName, map != null ? b.a(map) : null);
            }
            LogExtKt.logInternal$default("FacebookAnalyticsService", "Appodeal invoked logEvent for " + eventName, null, 4, null);
        }
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: preInitialize-gIAlu-s */
    public final Object mo4429preInitializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        return Service.DefaultImpls.m4430preInitializegIAlus(this, (ServiceOptions.FacebookAnalytics) serviceOptions, continuation);
    }
}
