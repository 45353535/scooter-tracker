package com.appodeal.ads.modules.common.internal.service;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.adjust.sdk.purchase.ADJPConstants;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appodeal.ads.modules.common.internal.data.ApplicationData;
import com.appodeal.ads.modules.common.internal.data.DeviceData;
import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "", "initializationTimeout", "", "getInitializationTimeout", "()J", "isEventTrackingEnabled", "", "()Z", "isRevenueTrackingEnabled", "isLoggingEnabled", "connectorCallback", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "Appsflyer", "Adjust", "FacebookAnalytics", "Firebase", "SentryAnalytics", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$SentryAnalytics;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ServiceOptions {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u0011\u00106R\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b\u0012\u00106R\u001a\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b\u0013\u00106R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Adjust;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "appToken", f.b.f45109c, "", "eventTokens", ADJPConstants.KEY_ENVIRONMENT, "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", C4240b4.a.f42515t, "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "userPersonalData", "", "initializationTimeout", "", "isEventTrackingEnabled", "isRevenueTrackingEnabled", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getAppToken", "()Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getAdId", "d", "Ljava/util/Map;", "getEventTokens", "()Ljava/util/Map;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getEnvironment", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "g", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "getUserPersonalData", "()Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "h", "J", "getInitializationTimeout", "()J", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Z", "()Z", "j", CampaignEx.JSON_KEY_AD_K, CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Adjust implements ServiceOptions {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String appToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String adId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final Map eventTokens;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String environment;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final InitializationMode mode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final UserPersonalData userPersonalData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final long initializationTimeout;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean isEventTrackingEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean isRevenueTrackingEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean isLoggingEnabled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final ConnectorCallback connectorCallback;

        public Adjust(Context context, String appToken, String adId, Map<String, String> eventTokens, String environment, InitializationMode mode, UserPersonalData userPersonalData, long j10, boolean z10, boolean z11, boolean z12, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appToken, "appToken");
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(eventTokens, "eventTokens");
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(userPersonalData, "userPersonalData");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.context = context;
            this.appToken = appToken;
            this.adId = adId;
            this.eventTokens = eventTokens;
            this.environment = environment;
            this.mode = mode;
            this.userPersonalData = userPersonalData;
            this.initializationTimeout = j10;
            this.isEventTrackingEnabled = z10;
            this.isRevenueTrackingEnabled = z11;
            this.isLoggingEnabled = z12;
            this.connectorCallback = connectorCallback;
        }

        public final String getAdId() {
            return this.adId;
        }

        public final String getAppToken() {
            return this.appToken;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public ConnectorCallback getConnectorCallback() {
            return this.connectorCallback;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getEnvironment() {
            return this.environment;
        }

        public final Map<String, String> getEventTokens() {
            return this.eventTokens;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public long getInitializationTimeout() {
            return this.initializationTimeout;
        }

        public final InitializationMode getMode() {
            return this.mode;
        }

        public final UserPersonalData getUserPersonalData() {
            return this.userPersonalData;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isEventTrackingEnabled, reason: from getter */
        public boolean getIsEventTrackingEnabled() {
            return this.isEventTrackingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isLoggingEnabled, reason: from getter */
        public boolean getIsLoggingEnabled() {
            return this.isLoggingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isRevenueTrackingEnabled, reason: from getter */
        public boolean getIsRevenueTrackingEnabled() {
            return this.isRevenueTrackingEnabled;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\f\u0010+R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b\u0010\u0010+R\u001a\u0010\u0011\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b\u0011\u0010+R\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b\u0012\u0010+R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Appsflyer;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", RemoteConfigConstants.RequestFieldKey.APP_ID, "devKey", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", C4240b4.a.f42515t, "", "conversionKeys", "", "isInternalEventTrackingEnabled", "inAppTrackerType", "", "initializationTimeout", "isEventTrackingEnabled", "isRevenueTrackingEnabled", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;Ljava/util/List;ZLjava/lang/String;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getDevKey", "d", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "getConversionKeys", "()Ljava/util/List;", InneractiveMediationDefs.GENDER_FEMALE, "Z", "()Z", "g", "getInAppTrackerType", "h", "J", "getInitializationTimeout", "()J", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", CampaignEx.JSON_KEY_AD_K, CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Appsflyer implements ServiceOptions {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String appId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String devKey;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final InitializationMode mode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final List conversionKeys;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isInternalEventTrackingEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final String inAppTrackerType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final long initializationTimeout;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean isEventTrackingEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean isRevenueTrackingEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean isLoggingEnabled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final ConnectorCallback connectorCallback;

        public Appsflyer(Context context, String appId, String devKey, InitializationMode mode, List<String> conversionKeys, boolean z10, String inAppTrackerType, long j10, boolean z11, boolean z12, boolean z13, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(devKey, "devKey");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(conversionKeys, "conversionKeys");
            Intrinsics.checkNotNullParameter(inAppTrackerType, "inAppTrackerType");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.context = context;
            this.appId = appId;
            this.devKey = devKey;
            this.mode = mode;
            this.conversionKeys = conversionKeys;
            this.isInternalEventTrackingEnabled = z10;
            this.inAppTrackerType = inAppTrackerType;
            this.initializationTimeout = j10;
            this.isEventTrackingEnabled = z11;
            this.isRevenueTrackingEnabled = z12;
            this.isLoggingEnabled = z13;
            this.connectorCallback = connectorCallback;
        }

        public final String getAppId() {
            return this.appId;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public ConnectorCallback getConnectorCallback() {
            return this.connectorCallback;
        }

        public final Context getContext() {
            return this.context;
        }

        public final List<String> getConversionKeys() {
            return this.conversionKeys;
        }

        public final String getDevKey() {
            return this.devKey;
        }

        public final String getInAppTrackerType() {
            return this.inAppTrackerType;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public long getInitializationTimeout() {
            return this.initializationTimeout;
        }

        public final InitializationMode getMode() {
            return this.mode;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isEventTrackingEnabled, reason: from getter */
        public boolean getIsEventTrackingEnabled() {
            return this.isEventTrackingEnabled;
        }

        /* JADX INFO: renamed from: isInternalEventTrackingEnabled, reason: from getter */
        public final boolean getIsInternalEventTrackingEnabled() {
            return this.isInternalEventTrackingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isLoggingEnabled, reason: from getter */
        public boolean getIsLoggingEnabled() {
            return this.isLoggingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isRevenueTrackingEnabled, reason: from getter */
        public boolean getIsRevenueTrackingEnabled() {
            return this.isRevenueTrackingEnabled;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$FacebookAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "initializationTimeout", "", "isEventTrackingEnabled", "isRevenueTrackingEnabled", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "J", "getInitializationTimeout", "()J", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Z", "()Z", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FacebookAnalytics implements ServiceOptions {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final long initializationTimeout;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean isEventTrackingEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean isRevenueTrackingEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean isLoggingEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final ConnectorCallback connectorCallback;

        public FacebookAnalytics(Context context, long j10, boolean z10, boolean z11, boolean z12, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.context = context;
            this.initializationTimeout = j10;
            this.isEventTrackingEnabled = z10;
            this.isRevenueTrackingEnabled = z11;
            this.isLoggingEnabled = z12;
            this.connectorCallback = connectorCallback;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public ConnectorCallback getConnectorCallback() {
            return this.connectorCallback;
        }

        public final Context getContext() {
            return this.context;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public long getInitializationTimeout() {
            return this.initializationTimeout;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isEventTrackingEnabled, reason: from getter */
        public boolean getIsEventTrackingEnabled() {
            return this.isEventTrackingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isLoggingEnabled, reason: from getter */
        public boolean getIsLoggingEnabled() {
            return this.isLoggingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isRevenueTrackingEnabled, reason: from getter */
        public boolean getIsRevenueTrackingEnabled() {
            return this.isRevenueTrackingEnabled;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\u0018\u0000 >2\u00020\u0001:\u0001>Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\r\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b\u0011\u0010.R\u001a\u0010\u0012\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b\u0012\u0010.R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b\u0013\u0010.R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$Firebase;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "expirationDuration", "", "", "configKeys", "adRevenueKey", "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", C4240b4.a.f42515t, "", "isInternalEventTrackingEnabled", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "userPersonalData", "initializationTimeout", "isEventTrackingEnabled", "isRevenueTrackingEnabled", "isLoggingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;ZLcom/appodeal/ads/modules/common/internal/data/UserPersonalData;JZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/Long;", "getExpirationDuration", "()Ljava/lang/Long;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/List;", "getConfigKeys", "()Ljava/util/List;", "d", "Ljava/lang/String;", "getAdRevenueKey", "()Ljava/lang/String;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", "getMode", "()Lcom/appodeal/ads/modules/common/internal/service/InitializationMode;", InneractiveMediationDefs.GENDER_FEMALE, "Z", "()Z", "g", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "getUserPersonalData", "()Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "h", "J", "getInitializationTimeout", "()J", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", CampaignEx.JSON_KEY_AD_K, CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", y.f66058y, "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Firebase implements ServiceOptions {
        public static final String DefaultAdRevenueKey = "custom_ad_impression";

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Long expirationDuration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final List configKeys;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final String adRevenueKey;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final InitializationMode mode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isInternalEventTrackingEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final UserPersonalData userPersonalData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final long initializationTimeout;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean isEventTrackingEnabled;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean isRevenueTrackingEnabled;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean isLoggingEnabled;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final ConnectorCallback connectorCallback;

        public Firebase(Context context, Long l10, List<String> configKeys, String adRevenueKey, InitializationMode mode, boolean z10, UserPersonalData userPersonalData, long j10, boolean z11, boolean z12, boolean z13, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configKeys, "configKeys");
            Intrinsics.checkNotNullParameter(adRevenueKey, "adRevenueKey");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(userPersonalData, "userPersonalData");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.context = context;
            this.expirationDuration = l10;
            this.configKeys = configKeys;
            this.adRevenueKey = adRevenueKey;
            this.mode = mode;
            this.isInternalEventTrackingEnabled = z10;
            this.userPersonalData = userPersonalData;
            this.initializationTimeout = j10;
            this.isEventTrackingEnabled = z11;
            this.isRevenueTrackingEnabled = z12;
            this.isLoggingEnabled = z13;
            this.connectorCallback = connectorCallback;
        }

        public final String getAdRevenueKey() {
            return this.adRevenueKey;
        }

        public final List<String> getConfigKeys() {
            return this.configKeys;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public ConnectorCallback getConnectorCallback() {
            return this.connectorCallback;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Long getExpirationDuration() {
            return this.expirationDuration;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public long getInitializationTimeout() {
            return this.initializationTimeout;
        }

        public final InitializationMode getMode() {
            return this.mode;
        }

        public final UserPersonalData getUserPersonalData() {
            return this.userPersonalData;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isEventTrackingEnabled, reason: from getter */
        public boolean getIsEventTrackingEnabled() {
            return this.isEventTrackingEnabled;
        }

        /* JADX INFO: renamed from: isInternalEventTrackingEnabled, reason: from getter */
        public final boolean getIsInternalEventTrackingEnabled() {
            return this.isInternalEventTrackingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isLoggingEnabled, reason: from getter */
        public boolean getIsLoggingEnabled() {
            return this.isLoggingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isRevenueTrackingEnabled, reason: from getter */
        public boolean getIsRevenueTrackingEnabled() {
            return this.isRevenueTrackingEnabled;
        }
    }

    ConnectorCallback getConnectorCallback();

    long getInitializationTimeout();

    /* JADX INFO: renamed from: isEventTrackingEnabled */
    boolean getIsEventTrackingEnabled();

    /* JADX INFO: renamed from: isLoggingEnabled */
    boolean getIsLoggingEnabled();

    /* JADX INFO: renamed from: isRevenueTrackingEnabled */
    boolean getIsRevenueTrackingEnabled();

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b\t\u0010+R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b\n\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\b\u0014\u0010+R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010)\u001a\u0004\b\u0017\u0010+R\u001a\u0010\u0018\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\b\u0018\u0010+R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\b\u0019\u0010+R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions$SentryAnalytics;", "Lcom/appodeal/ads/modules/common/internal/service/ServiceOptions;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "sentryDsn", "sentryEnvironment", "", "sentryCollectThreads", "isSentryTrackingEnabled", "isAttachViewHierarchy", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "deviceData", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "applicationData", "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "userPersonalData", "breadcrumbs", "", "maxBreadcrumbs", "isInternalEventTrackingEnabled", "", "initializationTimeout", "isLoggingEnabled", "isEventTrackingEnabled", "isRevenueTrackingEnabled", "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "connectorCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZZLcom/appodeal/ads/modules/common/internal/data/DeviceData;Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;Ljava/lang/String;IZJZZZLcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getSentryDsn", "()Ljava/lang/String;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getSentryEnvironment", "d", "Z", "getSentryCollectThreads", "()Z", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "g", "Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "getDeviceData", "()Lcom/appodeal/ads/modules/common/internal/data/DeviceData;", "h", "Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", "getApplicationData", "()Lcom/appodeal/ads/modules/common/internal/data/ApplicationData;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "getUserPersonalData", "()Lcom/appodeal/ads/modules/common/internal/data/UserPersonalData;", "j", "getBreadcrumbs", CampaignEx.JSON_KEY_AD_K, "I", "getMaxBreadcrumbs", "()I", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "J", "getInitializationTimeout", "()J", "n", "o", "p", CampaignEx.JSON_KEY_AD_Q, "Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "getConnectorCallback", "()Lcom/appodeal/ads/modules/common/internal/service/ConnectorCallback;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SentryAnalytics implements ServiceOptions {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String sentryDsn;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final String sentryEnvironment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean sentryCollectThreads;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean isSentryTrackingEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isAttachViewHierarchy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final DeviceData deviceData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final ApplicationData applicationData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final UserPersonalData userPersonalData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final String breadcrumbs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final int maxBreadcrumbs;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final boolean isInternalEventTrackingEnabled;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public final long initializationTimeout;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final boolean isLoggingEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public final boolean isEventTrackingEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final boolean isRevenueTrackingEnabled;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final ConnectorCallback connectorCallback;

        public SentryAnalytics(Context context, String sentryDsn, String sentryEnvironment, boolean z10, boolean z11, boolean z12, DeviceData deviceData, ApplicationData applicationData, UserPersonalData userPersonalData, String breadcrumbs, int i10, boolean z13, long j10, boolean z14, boolean z15, boolean z16, ConnectorCallback connectorCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sentryDsn, "sentryDsn");
            Intrinsics.checkNotNullParameter(sentryEnvironment, "sentryEnvironment");
            Intrinsics.checkNotNullParameter(deviceData, "deviceData");
            Intrinsics.checkNotNullParameter(applicationData, "applicationData");
            Intrinsics.checkNotNullParameter(userPersonalData, "userPersonalData");
            Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
            Intrinsics.checkNotNullParameter(connectorCallback, "connectorCallback");
            this.context = context;
            this.sentryDsn = sentryDsn;
            this.sentryEnvironment = sentryEnvironment;
            this.sentryCollectThreads = z10;
            this.isSentryTrackingEnabled = z11;
            this.isAttachViewHierarchy = z12;
            this.deviceData = deviceData;
            this.applicationData = applicationData;
            this.userPersonalData = userPersonalData;
            this.breadcrumbs = breadcrumbs;
            this.maxBreadcrumbs = i10;
            this.isInternalEventTrackingEnabled = z13;
            this.initializationTimeout = j10;
            this.isLoggingEnabled = z14;
            this.isEventTrackingEnabled = z15;
            this.isRevenueTrackingEnabled = z16;
            this.connectorCallback = connectorCallback;
        }

        public final ApplicationData getApplicationData() {
            return this.applicationData;
        }

        public final String getBreadcrumbs() {
            return this.breadcrumbs;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public ConnectorCallback getConnectorCallback() {
            return this.connectorCallback;
        }

        public final Context getContext() {
            return this.context;
        }

        public final DeviceData getDeviceData() {
            return this.deviceData;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        public long getInitializationTimeout() {
            return this.initializationTimeout;
        }

        public final int getMaxBreadcrumbs() {
            return this.maxBreadcrumbs;
        }

        public final boolean getSentryCollectThreads() {
            return this.sentryCollectThreads;
        }

        public final String getSentryDsn() {
            return this.sentryDsn;
        }

        public final String getSentryEnvironment() {
            return this.sentryEnvironment;
        }

        public final UserPersonalData getUserPersonalData() {
            return this.userPersonalData;
        }

        /* JADX INFO: renamed from: isAttachViewHierarchy, reason: from getter */
        public final boolean getIsAttachViewHierarchy() {
            return this.isAttachViewHierarchy;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isEventTrackingEnabled, reason: from getter */
        public boolean getIsEventTrackingEnabled() {
            return this.isEventTrackingEnabled;
        }

        /* JADX INFO: renamed from: isInternalEventTrackingEnabled, reason: from getter */
        public final boolean getIsInternalEventTrackingEnabled() {
            return this.isInternalEventTrackingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isLoggingEnabled, reason: from getter */
        public boolean getIsLoggingEnabled() {
            return this.isLoggingEnabled;
        }

        @Override // com.appodeal.ads.modules.common.internal.service.ServiceOptions
        /* JADX INFO: renamed from: isRevenueTrackingEnabled, reason: from getter */
        public boolean getIsRevenueTrackingEnabled() {
            return this.isRevenueTrackingEnabled;
        }

        /* JADX INFO: renamed from: isSentryTrackingEnabled, reason: from getter */
        public final boolean getIsSentryTrackingEnabled() {
            return this.isSentryTrackingEnabled;
        }

        public /* synthetic */ SentryAnalytics(Context context, String str, String str2, boolean z10, boolean z11, boolean z12, DeviceData deviceData, ApplicationData applicationData, UserPersonalData userPersonalData, String str3, int i10, boolean z13, long j10, boolean z14, boolean z15, boolean z16, ConnectorCallback connectorCallback, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, str2, z10, z11, z12, deviceData, applicationData, userPersonalData, str3, i10, z13, j10, z14, (i11 & 16384) != 0 ? false : z15, (i11 & 32768) != 0 ? false : z16, connectorCallback);
        }
    }
}
