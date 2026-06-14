package com.appodeal.ads.services.sentry_analytics;

import android.content.Context;
import androidx.activity.s;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import com.appodeal.ads.modules.common.internal.service.CrashReportingService;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.service.ServiceError;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.e2;
import io.sentry.g7;
import io.sentry.i0;
import io.sentry.k5;
import io.sentry.v7;
import io.sentry.w6;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/services/sentry_analytics/SentryAnalyticsService;", "Lcom/appodeal/ads/modules/common/internal/service/Service;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$SentryAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/CrashReportingService;", "<init>", "()V", "sentry_analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SentryAnalyticsService implements Service<ServiceOptions.SentryAnalytics>, CrashReportingService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14730c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f14728a = i.a(new Function0() { // from class: com.appodeal.ads.services.sentry_analytics.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SentryAnalyticsService.a();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f14731d = SetsKt.setOf((Object[]) new String[]{LogConstants.KEY_SDK_PUBLIC, LogConstants.KEY_MEDIATION, LogConstants.KEY_NAVIGATION, LogConstants.KEY_NETWORK_API});

    public static final ServiceInfo a() {
        return new ServiceInfo("sentry_analytics", "8.26.0", "0", k5.F());
    }

    public static final io.sentry.e b(SentryAnalyticsService sentryAnalyticsService, io.sentry.e breadcrumb, i0 i0Var) {
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(i0Var, "<unused var>");
        if (Intrinsics.areEqual(breadcrumb.k(), "ui.lifecycle") && sentryAnalyticsService.f14729b) {
            return null;
        }
        return breadcrumb;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c9 A[PHI: r1
  0x03c9: PHI (r1v18 kotlin.Pair) = (r1v17 kotlin.Pair), (r1v17 kotlin.Pair), (r1v42 kotlin.Pair) binds: [B:99:0x03c1, B:101:0x03c7, B:145:0x03c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.sentry.w6 c(android.content.Context r76, com.appodeal.ads.modules.common.internal.data.ApplicationData r77, com.appodeal.ads.modules.common.internal.data.UserPersonalData r78, com.appodeal.ads.modules.common.internal.data.DeviceData r79, io.sentry.w6 r80, io.sentry.i0 r81) {
        /*
            Method dump skipped, instruction units count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.sentry_analytics.SentryAnalyticsService.c(android.content.Context, com.appodeal.ads.modules.common.internal.data.ApplicationData, com.appodeal.ads.modules.common.internal.data.UserPersonalData, com.appodeal.ads.modules.common.internal.data.DeviceData, io.sentry.w6, io.sentry.i0):io.sentry.w6");
    }

    public static final void e(String str, String str2, ServiceOptions.SentryAnalytics sentryAnalytics, final ApplicationData applicationData, boolean z10, final SentryAnalyticsService sentryAnalyticsService, final Context context, final UserPersonalData userPersonalData, final DeviceData deviceData, SentryAndroidOptions sentry) {
        Intrinsics.checkNotNullParameter(sentry, "sentry");
        sentry.setDsn(str);
        sentry.setEnvironment(str2);
        sentry.setAttachViewHierarchy(sentryAnalytics.getIsAttachViewHierarchy());
        sentry.setRelease(applicationData.getSdkVersion());
        sentry.setDebug(false);
        sentry.setEnableNdk(true);
        sentry.setAnrEnabled(true);
        sentry.setAttachThreads(z10);
        sentry.setEnableScopeSync(true);
        sentry.setAttachStacktrace(true);
        sentry.setAnrReportInDebug(true);
        sentry.setEnableUserInteractionTracing(true);
        sentry.enableAllAutoBreadcrumbs(sentryAnalyticsService.f14729b);
        sentry.setMaxBreadcrumbs(sentryAnalytics.getMaxBreadcrumbs());
        sentry.setBeforeBreadcrumb(new v7.a() { // from class: com.appodeal.ads.services.sentry_analytics.c
            @Override // io.sentry.v7.a
            public final io.sentry.e a(io.sentry.e eVar, i0 i0Var) {
                return SentryAnalyticsService.b(this.f14741a, eVar, i0Var);
            }
        });
        sentry.setBeforeSend(new v7.c() { // from class: com.appodeal.ads.services.sentry_analytics.d
            @Override // io.sentry.v7.c
            public final w6 a(w6 w6Var, i0 i0Var) {
                return SentryAnalyticsService.c(context, applicationData, userPersonalData, deviceData, w6Var, i0Var);
            }
        });
    }

    @Override // com.appodeal.ads.modules.common.internal.service.CrashReportingService
    public final void addBreadcrumb(String key, Map params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f14731d.contains(key)) {
            io.sentry.e eVar = new io.sentry.e();
            eVar.y(LogConstants.KEY_SDK);
            eVar.u(key);
            eVar.w(g7.INFO);
            for (Map.Entry entry : params.entrySet()) {
                eVar.v((String) entry.getKey(), (String) entry.getValue());
            }
            k5.h(eVar);
        }
    }

    public final Object d(final ServiceOptions.SentryAnalytics sentryAnalytics) {
        boolean z10;
        final String sentryDsn = sentryAnalytics.getSentryDsn();
        if (sentryDsn.length() == 0) {
            return ResultExtKt.asFailure(ServiceError.SentryAnalytics.NoDsnProvided.INSTANCE);
        }
        final String sentryEnvironment = sentryAnalytics.getSentryEnvironment();
        if (sentryEnvironment.length() == 0) {
            return ResultExtKt.asFailure(ServiceError.SentryAnalytics.NoEnvironmentProvided.INSTANCE);
        }
        if (!sentryAnalytics.getIsSentryTrackingEnabled()) {
            return ResultExtKt.asSuccess(Unit.f93236a);
        }
        final UserPersonalData userPersonalData = sentryAnalytics.getUserPersonalData();
        final DeviceData deviceData = sentryAnalytics.getDeviceData();
        final ApplicationData applicationData = sentryAnalytics.getApplicationData();
        final boolean sentryCollectThreads = sentryAnalytics.getSentryCollectThreads();
        final Context context = sentryAnalytics.getCom.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants.NATIVE_CONTEXT java.lang.String();
        e eVar = f.f14746c;
        String serverLevel = sentryAnalytics.getBreadcrumbs();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(serverLevel, "serverLevel");
        EnumEntries<f> enumEntries = f.f14749f;
        if (s.a(enumEntries) && enumEntries.isEmpty()) {
            z10 = false;
        } else {
            for (f fVar : enumEntries) {
                if (Intrinsics.areEqual(fVar.f14750b, serverLevel) && fVar != f.f14747d) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        this.f14729b = z10;
        this.f14730c = sentryAnalytics.getIsInternalEventTrackingEnabled();
        e2.e(context, new k5.a() { // from class: com.appodeal.ads.services.sentry_analytics.a
            @Override // io.sentry.k5.a
            public final void a(v7 v7Var) {
                SentryAnalyticsService.e(sentryDsn, sentryEnvironment, sentryAnalytics, applicationData, sentryCollectThreads, this, context, userPersonalData, deviceData, (SentryAndroidOptions) v7Var);
            }
        });
        return ResultExtKt.asSuccess(Unit.f93236a);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final ServiceInfo getInfo() {
        return (ServiceInfo) this.f14728a.getValue();
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: initialize-gIAlu-s */
    public final /* bridge */ /* synthetic */ Object mo4428initializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        return d((ServiceOptions.SentryAnalytics) serviceOptions);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.CrashReportingService
    /* JADX INFO: renamed from: isBreadcrumbsEnabled, reason: from getter */
    public final boolean getF14729b() {
        return this.f14729b;
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    public final void logEvent(String eventName, Map map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.appodeal.ads.modules.common.internal.service.Service
    /* JADX INFO: renamed from: preInitialize-gIAlu-s */
    public final Object mo4429preInitializegIAlus(ServiceOptions serviceOptions, Continuation continuation) {
        return Service.DefaultImpls.m4430preInitializegIAlus(this, (ServiceOptions.SentryAnalytics) serviceOptions, continuation);
    }

    @Override // com.appodeal.ads.modules.common.internal.service.CrashReportingService
    public final void reportThrowable(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.f14730c) {
            k5.l(throwable);
        }
    }
}
