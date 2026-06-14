package com.mobilefuse.sdk.telemetry.loggers;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.telemetry.LogLevel;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryHelpersKt;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetryService;
import com.mobilefuse.sdk.telemetry.implementations.SentryService;
import com.mobilefuse.sdk.telemetry.mfxlogs.EventTypes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJN\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "Lcom/mobilefuse/sdk/telemetry/loggers/BaseSampleRate;", "()V", "sentryService", "Lcom/mobilefuse/sdk/telemetry/TelemetryService;", "captureException", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "sender", "", "reportException", "telemetryBreadcrumbList", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "modules", "", "variables", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class ExceptionHandler extends BaseSampleRate {
    private TelemetryService sentryService = new SentryService();

    private final void reportException(Throwable e10, String sender, List<TelemetryBreadcrumb> telemetryBreadcrumbList, Map<String, String> modules, Map<String, String> variables) {
        Log.w("MobileFuse.Stability", "Gracefully handling an exception: " + e10.getMessage());
        e10.printStackTrace();
        if (getShouldTransmitToServer()) {
            this.sentryService.captureException(e10, sender, telemetryBreadcrumbList, modules, variables);
        }
    }

    public final void captureException(@NotNull Throwable e10, @NotNull String sender) {
        Intrinsics.checkNotNullParameter(e10, "e");
        Intrinsics.checkNotNullParameter(sender, "sender");
        try {
            TelemetryManager.Companion companion = TelemetryManager.INSTANCE;
            reportException(e10, sender, companion.getTelemetryEventList(), companion.getModules(), companion.getVariables());
            String str = "An exception occurred: " + e10.getMessage();
            StackTraceElement[] stackTrace = e10.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            StackTraceElement exceptionInfo = (StackTraceElement) ArraysKt.first(stackTrace);
            Pair pair = TuplesKt.to(PglCryptUtils.KEY_MESSAGE, String.valueOf(e10.getMessage()));
            Intrinsics.checkNotNullExpressionValue(exceptionInfo, "exceptionInfo");
            Pair pair2 = TuplesKt.to(C4240b4.i.f42616b, exceptionInfo.getFileName());
            Pair pair3 = TuplesKt.to("line", Integer.valueOf(exceptionInfo.getLineNumber()));
            StackTraceElement[] stackTrace2 = e10.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "e.stackTrace");
            companion.logBreadcrumb("exception", EventTypes.EXCEPTION.getValue(), MapsKt.mutableMapOf(pair, pair2, pair3, TuplesKt.to("trace", TelemetryHelpersKt.formatStackTrace(stackTrace2))), LogLevel.ERROR, str);
        } catch (Throwable unused) {
        }
    }
}
