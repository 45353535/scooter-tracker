package com.mobilefuse.sdk.telemetry.loggers;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import uf.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0006\u0010\u0019\u001a\u00020\u0016J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/SampleRatesManager;", "", "exceptionHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;", "logsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;", "metricsHandler", "Lcom/mobilefuse/sdk/telemetry/loggers/MetricsHandler;", "(Lcom/mobilefuse/sdk/telemetry/loggers/ExceptionHandler;Lcom/mobilefuse/sdk/telemetry/loggers/LogsHandler;Lcom/mobilefuse/sdk/telemetry/loggers/MetricsHandler;)V", "sdkVersion", "", "getSdkVersion", "()Ljava/lang/String;", "serverURL", "Ljava/net/URL;", "getServerURL$mobilefuse_sdk_telemetry_release$annotations", "()V", "getServerURL$mobilefuse_sdk_telemetry_release", "()Ljava/net/URL;", "setServerURL$mobilefuse_sdk_telemetry_release", "(Ljava/net/URL;)V", "getSampleRates", "", "parseJsonSampleRateResponse", "response", "updateSampleRateFromServer", "updateSampleRates", "exceptionSampleRate", "", "logsSampleRate", "metricsSampleRate", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class SampleRatesManager {
    private final ExceptionHandler exceptionHandler;
    private final LogsHandler logsHandler;
    private final MetricsHandler metricsHandler;

    @NotNull
    private final String sdkVersion;

    @NotNull
    private URL serverURL;

    public SampleRatesManager(@NotNull ExceptionHandler exceptionHandler, @NotNull LogsHandler logsHandler, @NotNull MetricsHandler metricsHandler) {
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(logsHandler, "logsHandler");
        Intrinsics.checkNotNullParameter(metricsHandler, "metricsHandler");
        this.exceptionHandler = exceptionHandler;
        this.logsHandler = logsHandler;
        this.metricsHandler = metricsHandler;
        String str = (String) StringsKt.split$default("1.9.3", new String[]{TokenBuilder.TOKEN_DELIMITER}, false, 0, 6, null).get(0);
        this.sdkVersion = str;
        this.serverURL = new URL("https://cdn.mobilefuse.com/sdk/sample-rate/android/" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSampleRates() {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.loggers.SampleRatesManager.getSampleRates.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                URL serverURL = SampleRatesManager.this.getServerURL();
                SampleRatesManager.this.parseJsonSampleRateResponse(new String(r.f(serverURL), Charsets.UTF_8));
            }
        }, 1, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getServerURL$mobilefuse_sdk_telemetry_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseJsonSampleRateResponse(String response) {
        try {
            JSONObject jSONObject = new JSONObject(response);
            updateSampleRates(jSONObject.optDouble(EidRequestBuilder.REQUEST_FIELD_EMAIL, 0.0d), jSONObject.optDouble(CmcdData.Factory.STREAM_TYPE_LIVE, 0.0d), jSONObject.optDouble("m", 0.0d));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private final void updateSampleRates(double exceptionSampleRate, double logsSampleRate, double metricsSampleRate) {
        this.exceptionHandler.updateSampleRate(exceptionSampleRate);
        this.logsHandler.updateSampleRate(logsSampleRate);
        this.metricsHandler.updateSampleRate(metricsSampleRate);
        this.logsHandler.reportSampleRateBreadcrumb(exceptionSampleRate, logsSampleRate, metricsSampleRate);
    }

    @NotNull
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: getServerURL$mobilefuse_sdk_telemetry_release, reason: from getter */
    public final URL getServerURL() {
        return this.serverURL;
    }

    public final void setServerURL$mobilefuse_sdk_telemetry_release(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "<set-?>");
        this.serverURL = url;
    }

    public final void updateSampleRateFromServer() {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.telemetry.loggers.SampleRatesManager.updateSampleRateFromServer.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SampleRatesManager.this.getSampleRates();
            }
        }, 1, null);
    }
}
