package com.appodeal.ads.modules.common.internal.service;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.taurusx.tax.f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00112\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "requiresSplitInitialization", "", "getRequiresSplitInitialization", "()Z", "Facebook", "Firebase", "SentryAnalytics", "Appsflyer", "Adjust", y.f66058y, "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Facebook;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$SentryAnalytics;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ServiceVariant {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f13764a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "", "requiresSplitInitialization", "Z", "getRequiresSplitInitialization", "()Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Adjust implements ServiceVariant {
        public static final Adjust INSTANCE = new Adjust();

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getClassName() {
            return "com.appodeal.ads.services.adjust.AdjustService";
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public boolean getRequiresSplitInitialization() {
            return true;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getServiceName() {
            return "Adjust";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "", "requiresSplitInitialization", "Z", "getRequiresSplitInitialization", "()Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Appsflyer implements ServiceVariant {
        public static final Appsflyer INSTANCE = new Appsflyer();

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getClassName() {
            return "com.appodeal.ads.services.appsflyer.AppsflyerService";
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public boolean getRequiresSplitInitialization() {
            return true;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getServiceName() {
            return MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Companion;", "", "", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "getValues", "()Ljava/util/List;", "values", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f13764a = new Companion();

        public final List<ServiceVariant> getValues() {
            return CollectionsKt.listOf((Object[]) new ServiceVariant[]{Facebook.INSTANCE, Firebase.INSTANCE, SentryAnalytics.INSTANCE, Appsflyer.INSTANCE, Adjust.INSTANCE});
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Facebook;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "", "requiresSplitInitialization", "Z", "getRequiresSplitInitialization", "()Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Facebook implements ServiceVariant {
        public static final Facebook INSTANCE = new Facebook();

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getClassName() {
            return "com.appodeal.ads.services.facebook_analytics.FacebookAnalyticsService";
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public boolean getRequiresSplitInitialization() {
            return false;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getServiceName() {
            return "Facebook Analytics";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "", "requiresSplitInitialization", "Z", "getRequiresSplitInitialization", "()Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Firebase implements ServiceVariant {
        public static final Firebase INSTANCE = new Firebase();

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getClassName() {
            return "com.appodeal.ads.services.firebase.FirebaseService";
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public boolean getRequiresSplitInitialization() {
            return true;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getServiceName() {
            return "Firebase Analytics";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant$SentryAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "className", "getClassName", "", "requiresSplitInitialization", "Z", "getRequiresSplitInitialization", "()Z", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SentryAnalytics implements ServiceVariant {
        public static final SentryAnalytics INSTANCE = new SentryAnalytics();

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getClassName() {
            return "com.appodeal.ads.services.sentry_analytics.SentryAnalyticsService";
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public boolean getRequiresSplitInitialization() {
            return false;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceVariant
        public String getServiceName() {
            return "Sentry Analytics";
        }
    }

    String getClassName();

    boolean getRequiresSplitInitialization();

    String getServiceName();
}
