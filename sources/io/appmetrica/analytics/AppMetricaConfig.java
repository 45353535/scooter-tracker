package io.appmetrica.analytics;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C5131h0;
import io.appmetrica.analytics.impl.C5463u5;
import io.appmetrica.analytics.impl.Gn;
import io.appmetrica.analytics.impl.K7;
import io.appmetrica.analytics.impl.O3;
import io.appmetrica.analytics.impl.no;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AppMetricaConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @Nullable
    public final Boolean advIdentifiersTracking;

    @Nullable
    public final Boolean anrMonitoring;

    @Nullable
    public final Integer anrMonitoringTimeout;

    @NonNull
    public final String apiKey;

    @Nullable
    public final Integer appBuildNumber;

    @Nullable
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean appOpenTrackingEnabled;

    @Nullable
    public final String appVersion;

    @Nullable
    public final Boolean crashReporting;

    @Nullable
    public final ICrashTransformer crashTransformer;

    @Nullable
    public final List<String> customHosts;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final String deviceType;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Map<String, String> errorEnvironment;

    @Nullable
    public final Boolean firstActivationAsUpdate;

    @Nullable
    public final Location location;

    @Nullable
    public final Boolean locationTracking;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Boolean nativeCrashReporting;

    @Nullable
    public final PreloadInfo preloadInfo;

    @Nullable
    public final Boolean revenueAutoTrackingEnabled;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;

    @Nullable
    public final String userProfileID;

    public static class Builder {
        private static final Gn D = new Gn(new C5131h0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5463u5 f74857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f74858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f74859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f74860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f74861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f74862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Location f74863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f74864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f74865i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f74866j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private PreloadInfo f74867k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f74868l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Boolean f74869m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f74870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f74871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f74872p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Boolean f74873q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f74874r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f74875s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f74876t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f74877u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f74878v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f74879w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f74880x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ICrashTransformer f74881y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f74882z;

        /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean z10) {
            this.f74868l = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.C.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f74865i = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean z10) {
            this.f74882z = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int i10) {
            this.A = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f74877u = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f74880x.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean z10) {
            this.f74875s = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String str) {
            this.f74859c = str;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean z10) {
            this.f74861e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.f74881y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f74869m = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String str) {
            this.f74876t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f74878v = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
            this.f74871o.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.f74863g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean z10) {
            this.f74864h = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f74866j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f74879w = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f74870n = Integer.valueOf(this.f74857a.a(i10));
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean z10) {
            this.f74862f = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.f74867k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean z10) {
            this.f74873q = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f74860d = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean z10) {
            this.f74874r = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f74872p = str;
            return this;
        }

        private Builder(String str) {
            this.f74871o = new LinkedHashMap();
            this.f74880x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f74857a = new C5463u5(str);
            this.f74858b = str;
        }
    }

    /* synthetic */ AppMetricaConfig(Builder builder, int i10) {
        this(builder);
    }

    @Nullable
    public static AppMetricaConfig fromJson(String str) {
        Builder builderA = new O3().a(str);
        if (builderA == null) {
            return null;
        }
        return builderA.build();
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new K7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", O3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                    string = null;
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!no.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f74858b;
        this.appVersion = builder.f74859c;
        this.sessionTimeout = builder.f74860d;
        this.crashReporting = builder.f74861e;
        this.nativeCrashReporting = builder.f74862f;
        this.location = builder.f74863g;
        this.locationTracking = builder.f74864h;
        this.advIdentifiersTracking = builder.f74865i;
        this.logs = builder.f74866j;
        this.preloadInfo = builder.f74867k;
        this.firstActivationAsUpdate = builder.f74868l;
        this.dataSendingEnabled = builder.f74869m;
        this.maxReportsInDatabaseCount = builder.f74870n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f74871o);
        this.userProfileID = builder.f74872p;
        this.revenueAutoTrackingEnabled = builder.f74873q;
        this.sessionsAutoTrackingEnabled = builder.f74874r;
        this.appOpenTrackingEnabled = builder.f74875s;
        this.deviceType = builder.f74876t;
        this.appBuildNumber = builder.f74877u;
        this.dispatchPeriodSeconds = builder.f74878v;
        this.maxReportsCount = builder.f74879w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f74880x);
        this.crashTransformer = builder.f74881y;
        this.anrMonitoring = builder.f74882z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    protected AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
