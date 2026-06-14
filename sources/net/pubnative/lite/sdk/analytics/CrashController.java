package net.pubnative.lite.sdk.analytics;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class CrashController {
    public ReportingEvent formatException(Exception exc) {
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("error");
        reportingEvent.setPlatform("android");
        if (exc != null) {
            if (exc.getMessage() != null) {
                reportingEvent.setErrorMessage(exc.getMessage());
            }
            StackTraceElement[] stackTrace = exc.getStackTrace();
            if (stackTrace != null) {
                reportingEvent.setCustomString("Stacktrace", Arrays.toString(stackTrace));
            }
            if (exc.getLocalizedMessage() != null) {
                reportingEvent.setCustomString("LocalizedMessage", exc.getLocalizedMessage());
            }
        }
        return reportingEvent;
    }

    public ReportingEvent formatException(Throwable th2) {
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("error");
        reportingEvent.setPlatform("android");
        if (th2 != null) {
            if (th2.getMessage() != null) {
                reportingEvent.setErrorMessage(th2.getMessage());
            }
            if (th2.getStackTrace() != null) {
                reportingEvent.setCustomString("Stacktrace", Arrays.toString(th2.getStackTrace()));
            }
            if (th2.getLocalizedMessage() != null) {
                reportingEvent.setCustomString("LocalizedMessage", th2.getLocalizedMessage());
            }
        }
        return reportingEvent;
    }
}
