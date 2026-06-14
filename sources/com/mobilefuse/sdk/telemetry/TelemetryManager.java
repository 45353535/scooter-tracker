package com.mobilefuse.sdk.telemetry;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpersKt;
import com.mobilefuse.sdk.telemetry.loggers.ExceptionHandler;
import com.mobilefuse.sdk.telemetry.loggers.LogsHandler;
import com.mobilefuse.sdk.telemetry.loggers.MetricsHandler;
import com.mobilefuse.sdk.telemetry.loggers.SampleRatesManager;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import com.taurusx.tax.f.y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryManager;", "", "()V", y.f66058y, "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class TelemetryManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final ExceptionHandler exceptionHandler;
    private static final LogsHandler logsHandler;
    private static final MetricsHandler metricsHandler;
    private static final Map<String, String> modules;

    @NotNull
    private static String releaseVersion;
    private static final SampleRatesManager sampleRatesManager;
    private static final Map<String, String> variables;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007JB\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\rH\u0007J\u0018\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0007J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0007J\u0016\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020\u0018H\u0007J\b\u00103\u001a\u00020\u0018H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryManager$Companion;", "", "()V", "exceptionHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "getExceptionHandler", "()Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "logsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;", "metricsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/MetricsHandler;", "modules", "", "", "releaseVersion", "getReleaseVersion$annotations", "getReleaseVersion", "()Ljava/lang/String;", "setReleaseVersion", "(Ljava/lang/String;)V", "sampleRatesManager", "Lcom/mobilefuse/sdk/telemetry/loggers/SampleRatesManager;", "variables", "enableStructuredLogs", "", "getModules", "getSessionId", "getTelemetryEventList", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "getVariables", "logBreadcrumb", "category", "logType", "data", "", "logLevel", "Lcom/mobilefuse/sdk/telemetry/LogLevel;", PglCryptUtils.KEY_MESSAGE, "registerModule", "module", "version", "registerVariable", "variable", "value", "reportAdMetric", "telemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "events", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "reportSessionStarted", "updateSampleRateFromServer", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getReleaseVersion$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logBreadcrumb$default(Companion companion, String str, String str2, Map map, LogLevel logLevel, String str3, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i10 & 8) != 0) {
                logLevel = LogLevel.INFO;
            }
            companion.logBreadcrumb(str, str2, map2, logLevel, str3);
        }

        public final void enableStructuredLogs() {
            TelemetryManager.logsHandler.enableAndSendEventsImmediately();
        }

        @NotNull
        public final ExceptionHandler getExceptionHandler() {
            return TelemetryManager.exceptionHandler;
        }

        @NotNull
        public final Map<String, String> getModules() {
            return TelemetryManager.modules;
        }

        @NotNull
        public final String getReleaseVersion() {
            return TelemetryManager.releaseVersion;
        }

        @NotNull
        public final String getSessionId() {
            return TelemetryManager.logsHandler.getSessionId();
        }

        @NotNull
        public final List<TelemetryBreadcrumb> getTelemetryEventList() {
            return TelemetryManager.logsHandler.getTelemetryEventList();
        }

        @NotNull
        public final Map<String, String> getVariables() {
            return TelemetryManager.variables;
        }

        public final void logBreadcrumb(@NotNull String category, @NotNull String logType, @Nullable Map<String, ? extends Object> data, @NotNull LogLevel logLevel, @NotNull String message) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(logType, "logType");
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter(message, "message");
            try {
                TelemetryBreadcrumb telemetryBreadcrumb = new TelemetryBreadcrumb(message, category, data, 0L, logLevel, logType, false, 72, null);
                if (data != null) {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message + ' ' + SentryHelpersKt.getJsonWithStringValues(data));
                } else {
                    Log.d("MobileFuse.Telemetry", '[' + category + "] " + message);
                }
                TelemetryManager.logsHandler.reportBreadcrumb(telemetryBreadcrumb);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        public final void registerModule(@NotNull String module, @NotNull String version) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(version, "version");
            try {
                TelemetryManager.modules.put(module, version);
            } catch (Throwable unused) {
            }
        }

        public final void registerVariable(@NotNull String variable, @NotNull String value) {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                TelemetryManager.variables.put(variable, value);
            } catch (Throwable unused) {
            }
        }

        public final void reportAdMetric(@NotNull TelemetryAdInfo telemetryAdInfo, @NotNull MetricRecordName events) {
            Intrinsics.checkNotNullParameter(telemetryAdInfo, "telemetryAdInfo");
            Intrinsics.checkNotNullParameter(events, "events");
            TelemetryManager.metricsHandler.reportMetric(telemetryAdInfo, events);
        }

        public final void reportSessionStarted() {
            TelemetryManager.logsHandler.reportSessionStarted(TelemetryManager.modules, TelemetryManager.variables);
        }

        public final void setReleaseVersion(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            TelemetryManager.releaseVersion = str;
        }

        public final void updateSampleRateFromServer() {
            TelemetryManager.sampleRatesManager.updateSampleRateFromServer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        releaseVersion = "Unset";
        modules = new LinkedHashMap();
        variables = new LinkedHashMap();
        LogsHandler logsHandler2 = new LogsHandler();
        logsHandler = logsHandler2;
        MetricsHandler metricsHandler2 = new MetricsHandler();
        metricsHandler = metricsHandler2;
        ExceptionHandler exceptionHandler2 = new ExceptionHandler();
        exceptionHandler = exceptionHandler2;
        sampleRatesManager = new SampleRatesManager(exceptionHandler2, logsHandler2, metricsHandler2);
        try {
            companion.registerModule(BuildConfig.LIBRARY_PACKAGE_NAME, "1.9.3");
            companion.registerModule("kotlin", KotlinVersion.CURRENT.toString());
        } catch (Throwable unused) {
        }
    }

    public static final void enableStructuredLogs() {
        INSTANCE.enableStructuredLogs();
    }

    @NotNull
    public static final Map<String, String> getModules() {
        return INSTANCE.getModules();
    }

    @NotNull
    public static final String getReleaseVersion() {
        return releaseVersion;
    }

    @NotNull
    public static final List<TelemetryBreadcrumb> getTelemetryEventList() {
        return INSTANCE.getTelemetryEventList();
    }

    @NotNull
    public static final Map<String, String> getVariables() {
        return INSTANCE.getVariables();
    }

    public static final void logBreadcrumb(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map, @NotNull LogLevel logLevel, @NotNull String str3) {
        INSTANCE.logBreadcrumb(str, str2, map, logLevel, str3);
    }

    public static final void registerModule(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerModule(str, str2);
    }

    public static final void registerVariable(@NotNull String str, @NotNull String str2) {
        INSTANCE.registerVariable(str, str2);
    }

    public static final void reportSessionStarted() {
        INSTANCE.reportSessionStarted();
    }

    public static final void setReleaseVersion(@NotNull String str) {
        releaseVersion = str;
    }

    public static final void updateSampleRateFromServer() {
        INSTANCE.updateSampleRateFromServer();
    }
}
