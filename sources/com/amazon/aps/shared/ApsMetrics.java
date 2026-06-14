package com.amazon.aps.shared;

import android.content.Context;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsCustomEventModelBuilder;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsConfigOverride;
import com.amazon.aps.shared.metrics.model.ApsMetricsDeviceInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsSdkInfo;
import com.amazon.aps.shared.util.APSNetworkManager;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.ironsource.C4574uf;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import zf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/shared/ApsMetrics;", "", "<init>", "()V", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetrics {

    @NotNull
    private static final String CUSTOM_FAILURE_ERROR_DETAIL = "Error in sending the custom event";
    public static final int METRICS_API_SCHEMA_VERSION = 1;
    public static final double METRICS_DEFAULT_SAMPLING_RATE = 0.1d;
    private static final int SAMPLING_ALLOWED_FROM = 0;

    @Nullable
    private static String adapterVersion;

    @Nullable
    private static Context context;
    private static boolean isSamplingAllowed;

    @Nullable
    private static ApsMetricsConfigOverride metricsConfigOverride;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static ApsMetricsDeviceInfo apsMetricsDeviceInfo = new ApsMetricsDeviceInfo(null, null, null, null, null, 31, null);

    @NotNull
    private static ApsMetricsSdkInfo apsMetricsSdkInfo = new ApsMetricsSdkInfo(null, null, 3, null);
    private static double samplingPercentage = 0.1d;

    @NotNull
    public static final String METRICS_DEFAULT_ENDPOINT_URL = "https://prod.tahoe-analytics.publishers.advertising.a2z.com/logevent/putRecord";

    @Nullable
    private static String endpointUrl = METRICS_DEFAULT_ENDPOINT_URL;

    @NotNull
    public static final String METRICS_DEFAULT_METRICS_API_KEY = "a5c71f6aff54eb34c826d952c285eaf0650b4259c83ae598962681a6429b63f6";

    @Nullable
    private static String apiKey = METRICS_DEFAULT_METRICS_API_KEY;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0007J4\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\bH\u0007J$\u00103\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u00010\b2\b\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u000207H\u0007J\u001a\u00108\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u00010\b2\u0006\u00109\u001a\u00020:H\u0007J\u001a\u0010;\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u00010\b2\u0006\u00109\u001a\u00020:H\u0007J(\u0010<\u001a\u00020-2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010?\u001a\u00020'H\u0007J\b\u0010@\u001a\u00020'H\u0007J\b\u0010A\u001a\u00020-H\u0002J\u0012\u0010B\u001a\u00020-2\b\u0010C\u001a\u0004\u0018\u00010+H\u0007J\n\u0010D\u001a\u0004\u0018\u00010+H\u0007J\b\u0010E\u001a\u00020'H\u0007J\b\u0010F\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/amazon/aps/shared/ApsMetrics$Companion;", "", "<init>", "()V", "METRICS_API_SCHEMA_VERSION", "", "SAMPLING_ALLOWED_FROM", "CUSTOM_FAILURE_ERROR_DETAIL", "", "METRICS_DEFAULT_SAMPLING_RATE", "", "value", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsDeviceInfo;", "apsMetricsDeviceInfo", "getApsMetricsDeviceInfo", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsDeviceInfo;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsSdkInfo;", "apsMetricsSdkInfo", "getApsMetricsSdkInfo", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsSdkInfo;", "METRICS_DEFAULT_ENDPOINT_URL", "METRICS_DEFAULT_METRICS_API_KEY", DTBMetricsConfiguration.APSMETRICS_SAMPLING_RATE, "getSamplingPercentage", "()D", "setSamplingPercentage", "(D)V", "endpointUrl", "getEndpointUrl", "()Ljava/lang/String;", "setEndpointUrl", "(Ljava/lang/String;)V", DTBMetricsConfiguration.APSMETRICS_APIKEY, "getApiKey", "setApiKey", C4574uf.f45563b, "getAdapterVersion", "setAdapterVersion", "isSamplingAllowed", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "metricsConfigOverride", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsConfigOverride;", "customEvent", "", C4240b4.i.f42633j0, "eventValue", "extra", "Lorg/json/JSONObject;", "eventCategory", "bidEvent", "bidId", DtbConstants.MEDIATION_NAME, "aaxBid", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAaxBidEvent;", "adEvent", "builder", "Lcom/amazon/aps/shared/metrics/ApsMetricsPerfEventModelBuilder;", "adapterEvent", "init", "deviceInfo", "sdkInfo", "isInitialized", "isOkToSendData", "calculateSamplingAllowed", "setMetricsConfigOverride", "override", "getMetricsConfigOverride", "hasMetricsConfigOverride", "effectiveSamplingPercentage", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void calculateSamplingAllowed() {
            try {
                boolean z10 = true;
                if (new Random().nextInt(10000000) + 1 > a.c(effectiveSamplingPercentage() * ((double) 100000))) {
                    z10 = false;
                }
                ApsMetrics.isSamplingAllowed = z10;
            } catch (RuntimeException e10) {
                ApsLog.e("Unable to set the sampling rate " + e10);
                ApsMetrics.isSamplingAllowed = false;
            }
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                jSONObject = null;
            }
            companion.customEvent(str, str2, jSONObject);
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, ApsMetricsDeviceInfo apsMetricsDeviceInfo, ApsMetricsSdkInfo apsMetricsSdkInfo, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                apsMetricsDeviceInfo = null;
            }
            if ((i10 & 4) != 0) {
                apsMetricsSdkInfo = null;
            }
            companion.init(context, apsMetricsDeviceInfo, apsMetricsSdkInfo);
        }

        public final void adEvent(@Nullable String bidId, @NotNull ApsMetricsPerfEventModelBuilder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            ApsLog.d("Logging perf metrics event");
            try {
                if (isOkToSendData()) {
                    APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(builder.withBidId(bidId).build());
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the ad event", e10);
            }
        }

        public final void adapterEvent(@Nullable String bidId, @NotNull ApsMetricsPerfEventModelBuilder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            ApsLog.d("Logging adapter event");
            adEvent(bidId, builder);
        }

        public final void bidEvent(@Nullable String bidId, @Nullable String mediationName, @NotNull ApsMetricsPerfAaxBidEvent aaxBid) {
            Intrinsics.checkNotNullParameter(aaxBid, "aaxBid");
            try {
                ApsLog.d("Logging bid event");
                if (isOkToSendData()) {
                    APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(new ApsMetricsPerfEventModelBuilder().withMediationName(mediationName).withBidId(bidId).withEvent(aaxBid).build());
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error sending the bid event", e10);
            }
        }

        public final void customEvent(@NotNull String eventName, @Nullable String eventValue, @Nullable JSONObject extra) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            customEvent(eventName, eventValue, extra, null);
        }

        public final double effectiveSamplingPercentage() {
            return ApsMetrics.metricsConfigOverride != null ? r0.getSamplingPercentage() : getSamplingPercentage();
        }

        @Nullable
        public final String getAdapterVersion() {
            return ApsMetrics.adapterVersion;
        }

        @Nullable
        public final String getApiKey() {
            return ApsMetrics.apiKey;
        }

        @NotNull
        public final ApsMetricsDeviceInfo getApsMetricsDeviceInfo() {
            return ApsMetrics.apsMetricsDeviceInfo;
        }

        @NotNull
        public final ApsMetricsSdkInfo getApsMetricsSdkInfo() {
            return ApsMetrics.apsMetricsSdkInfo;
        }

        @Nullable
        public final String getEndpointUrl() {
            return ApsMetrics.endpointUrl;
        }

        @Nullable
        public final ApsMetricsConfigOverride getMetricsConfigOverride() {
            return ApsMetrics.metricsConfigOverride;
        }

        public final double getSamplingPercentage() {
            return ApsMetrics.samplingPercentage;
        }

        public final boolean hasMetricsConfigOverride() {
            return ApsMetrics.metricsConfigOverride != null;
        }

        public final void init(@NotNull Context context, @Nullable ApsMetricsDeviceInfo deviceInfo, @Nullable ApsMetricsSdkInfo sdkInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                ApsLog.setLogLevel(ApsLogLevel.All);
                if (deviceInfo != null) {
                    Companion companion = ApsMetrics.INSTANCE;
                    ApsMetrics.apsMetricsDeviceInfo = ApsMetricsDeviceInfo.copy$default(deviceInfo, null, null, null, null, null, 31, null);
                }
                if (sdkInfo != null) {
                    Companion companion2 = ApsMetrics.INSTANCE;
                    ApsMetrics.apsMetricsSdkInfo = ApsMetricsSdkInfo.copy$default(sdkInfo, null, null, 3, null);
                }
                ApsMetrics.context = context;
                calculateSamplingAllowed();
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in initializing the ApsMetrics", e10);
            }
        }

        public final boolean isInitialized() {
            return ApsMetrics.context != null;
        }

        public final boolean isOkToSendData() {
            if (!isInitialized() || !ApsMetrics.isSamplingAllowed || APSSharedUtil.isNullOrEmpty(getApiKey()) || APSSharedUtil.isNullOrEmpty(getEndpointUrl())) {
                return false;
            }
            ApsMetricsConfigOverride apsMetricsConfigOverride = ApsMetrics.metricsConfigOverride;
            return (apsMetricsConfigOverride != null && apsMetricsConfigOverride.getHasCustomOnlyFlag() && apsMetricsConfigOverride.getCustomOnly()) ? false : true;
        }

        public final void setAdapterVersion(@Nullable String str) {
            if (str != null) {
                ApsMetrics.adapterVersion = str;
            }
        }

        public final void setApiKey(@Nullable String str) {
            if (APSSharedUtil.isNullOrEmpty(str)) {
                return;
            }
            ApsMetrics.apiKey = str;
        }

        public final void setEndpointUrl(@Nullable String str) {
            if (APSSharedUtil.isNullOrEmpty(str)) {
                return;
            }
            ApsMetrics.endpointUrl = str;
        }

        public final void setMetricsConfigOverride(@Nullable ApsMetricsConfigOverride override) {
            String str;
            ApsMetrics.metricsConfigOverride = override;
            if (override != null) {
                str = "Metrics config override applied: " + override;
            } else {
                str = "Metrics config override cleared";
            }
            ApsLog.i(str);
            calculateSamplingAllowed();
        }

        public final void setSamplingPercentage(double d10) {
            if (0.0d > d10 || d10 > 100.0d) {
                return;
            }
            ApsMetrics.samplingPercentage = d10;
            calculateSamplingAllowed();
        }

        private Companion() {
        }

        public static /* synthetic */ void customEvent$default(Companion companion, String str, String str2, JSONObject jSONObject, String str3, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                jSONObject = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            companion.customEvent(str, str2, jSONObject, str3);
        }

        public final void customEvent(@NotNull String eventName, @Nullable String eventValue, @Nullable JSONObject extra, @Nullable String eventCategory) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            try {
                ApsLog.d("Logging custom event:" + eventName);
                if (isOkToSendData()) {
                    ApsMetricsCustomEventModelBuilder apsMetricsCustomEventModelBuilder = new ApsMetricsCustomEventModelBuilder();
                    apsMetricsCustomEventModelBuilder.withEventName(eventName);
                    if (eventValue != null) {
                        apsMetricsCustomEventModelBuilder.withEventValue(eventValue);
                    }
                    if (extra != null) {
                        apsMetricsCustomEventModelBuilder.withEventDetail(extra);
                    }
                    if (eventCategory != null) {
                        apsMetricsCustomEventModelBuilder.withEventCategory(eventCategory);
                    }
                    JSONObject jSONObjectBuild = apsMetricsCustomEventModelBuilder.build();
                    if (jSONObjectBuild != null) {
                        APSNetworkManager.getInstance(ApsMetrics.context).sendMetrics(jSONObjectBuild);
                    }
                }
            } catch (RuntimeException e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, ApsMetrics.CUSTOM_FAILURE_ERROR_DETAIL, e10);
            }
        }
    }

    private ApsMetrics() {
    }

    public static final void adEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        INSTANCE.adEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void adapterEvent(@Nullable String str, @NotNull ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder) {
        INSTANCE.adapterEvent(str, apsMetricsPerfEventModelBuilder);
    }

    public static final void bidEvent(@Nullable String str, @Nullable String str2, @NotNull ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        INSTANCE.bidEvent(str, str2, apsMetricsPerfAaxBidEvent);
    }

    public static final void customEvent(@NotNull String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
        INSTANCE.customEvent(str, str2, jSONObject);
    }

    public static final double effectiveSamplingPercentage() {
        return INSTANCE.effectiveSamplingPercentage();
    }

    @Nullable
    public static final ApsMetricsConfigOverride getMetricsConfigOverride() {
        return INSTANCE.getMetricsConfigOverride();
    }

    public static final boolean hasMetricsConfigOverride() {
        return INSTANCE.hasMetricsConfigOverride();
    }

    public static final void init(@NotNull Context context2, @Nullable ApsMetricsDeviceInfo apsMetricsDeviceInfo2, @Nullable ApsMetricsSdkInfo apsMetricsSdkInfo2) {
        INSTANCE.init(context2, apsMetricsDeviceInfo2, apsMetricsSdkInfo2);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public static final boolean isOkToSendData() {
        return INSTANCE.isOkToSendData();
    }

    public static final void setMetricsConfigOverride(@Nullable ApsMetricsConfigOverride apsMetricsConfigOverride) {
        INSTANCE.setMetricsConfigOverride(apsMetricsConfigOverride);
    }

    public static final void customEvent(@NotNull String str, @Nullable String str2, @Nullable JSONObject jSONObject, @Nullable String str3) {
        INSTANCE.customEvent(str, str2, jSONObject, str3);
    }
}
