package com.mobilefuse.sdk.telemetry.implementations;

import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import com.mobilefuse.sdk.telemetry.TelemetryManager;
import com.mobilefuse.sdk.telemetry.TelemetryService;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryBreadcrumbs;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryDataModelToJsonKt;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryEvent;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryException;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryHelpersKt;
import com.mobilefuse.sdk.telemetry.implementations.sentry.SentryStackFrame;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/implementations/SentryService;", "Lcom/mobilefuse/sdk/telemetry/TelemetryService;", "()V", "host", "", C4240b4.i.W, "projectId", "serviceSdkName", "serviceVersion", "captureException", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "sender", "breadcrumbs", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "modules", "", "variables", "getStackFrameForCulprit", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", "exception", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "culprit", "sendApiRequest", D5.f40571r, "jsonContent", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class SentryService implements TelemetryService {
    private final String key = "24b4a64987c44acda8bf1f536d1a6ae8";
    private final String projectId = "6512411";
    private final String host = "o861477.ingest.sentry.io";
    private final String serviceSdkName = "sentry-mf-kotlin";
    private final String serviceVersion = "1.9.3";

    private final SentryStackFrame getStackFrameForCulprit(SentryException exception, String culprit) {
        for (SentryStackFrame sentryStackFrame : exception.getStacktrace().getFrames()) {
            if (Intrinsics.areEqual(sentryStackFrame.getModule(), culprit)) {
                return sentryStackFrame;
            }
        }
        return null;
    }

    private final void sendApiRequest(final String endpoint, final String jsonContent) {
        new Thread(new Runnable() { // from class: com.mobilefuse.sdk.telemetry.implementations.SentryService.sendApiRequest.1
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bytes;
                boolean z10;
                try {
                    URL url = new URL(DtbConstants.HTTPS + SentryService.this.key + '@' + SentryService.this.host + "/api/" + SentryService.this.projectId + IOUtils.DIR_SEPARATOR_UNIX + endpoint);
                    try {
                        bytes = Gzip.toGzipByteArray(jsonContent);
                        z10 = true;
                    } catch (Throwable unused) {
                        bytes = jsonContent.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        z10 = false;
                    }
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod("POST");
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    httpURLConnection.setRequestProperty("User-Agent", SentryService.this.serviceSdkName + IOUtils.DIR_SEPARATOR_UNIX + SentryService.this.serviceVersion);
                    httpURLConnection.setRequestProperty("Content-Type", D5.L);
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                    httpURLConnection.setRequestProperty("X-Sentry-Auth", "Sentry sentry_version=7,sentry_timestamp=" + jCurrentTimeMillis + ",sentry_key=" + SentryService.this.key + ",sentry_client=" + SentryService.this.serviceSdkName + IOUtils.DIR_SEPARATOR_UNIX + SentryService.this.serviceVersion);
                    if (z10) {
                        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                    }
                    httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bytes);
                    outputStream.flush();
                    Log.d("MobileFuse.Telemetry", "Server Response: [" + httpURLConnection.getResponseCode() + IOUtils.DIR_SEPARATOR_UNIX + httpURLConnection.getResponseMessage() + ']');
                } catch (Throwable unused2) {
                }
            }
        }).start();
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryService
    public void captureException(@NotNull Throwable e10, @NotNull String sender, @NotNull List<TelemetryBreadcrumb> breadcrumbs, @NotNull Map<String, String> modules, @NotNull Map<String, String> variables) {
        String string;
        String function;
        Intrinsics.checkNotNullParameter(e10, "e");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(variables, "variables");
        try {
            SentryStackFrame stackFrameForCulprit = getStackFrameForCulprit(SentryHelpersKt.getSentryException(e10), sender);
            if (stackFrameForCulprit == null || (function = stackFrameForCulprit.getFunction()) == null) {
                function = "Unknown Function";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SentryHelpersKt.getSentryException(e10).getType());
            sb2.append(" in SDK ");
            sb2.append(TelemetryManager.INSTANCE.getReleaseVersion());
            sb2.append(" (");
            sb2.append(sender);
            sb2.append('.');
            sb2.append(function);
            sb2.append(") ");
            sb2.append("for '");
            sb2.append(variables.get("app.bundle"));
            sb2.append("': ");
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            sb2.append(message);
            string = sb2.toString();
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            string = message2 == null ? th2.toString() : message2;
        }
        SentryEvent sentryEvent = new SentryEvent(string, SentryHelpersKt.getSentryException(e10), modules, variables, TelemetryManager.INSTANCE.getReleaseVersion(), sender, new SentryBreadcrumbs(breadcrumbs), null, 0L, null, 896, null);
        String string2 = SentryDataModelToJsonKt.getJson(sentryEvent).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "event.json.toString()");
        Log.d("MobileFuse.Telemetry", "Transmitting exception with eventId " + sentryEvent.getEventId());
        Log.d("MobileFuse.Telemetry", string2);
        sendApiRequest("store/", string2);
    }
}
