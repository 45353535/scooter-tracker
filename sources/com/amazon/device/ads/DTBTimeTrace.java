package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class DTBTimeTrace {
    private static final String LOG_TAG = "DTBTimeTrace";
    private static final String SERVERLESS_METRICS_TAG = "ServerlessMetrics";
    public static final String TIMETRACE_AD_DISPLAY_FAILED = "AD display failed";
    public static final String TIMETRACE_AD_DISPLAY_SUCCEEDED = "AD displayed";
    public static final String TIMETRACE_AD_LOADED = "AD loaded";
    public static final String TIMETRACE_AD_LOAD_FAILED = "AD load failed";
    public static final String TIMETRACE_AD_REQUESTED = "Request Ad";
    public static final String TIMETRACE_BID_FAILED = "Bid failed";
    public static final String TIMETRACE_BID_START = "Bid requested";
    public static final String TIMETRACE_BID_SUCCEEDED = "Bid succeeded";
    public static final String TIMETRACE_CUSTOM_EVENT_ACCEPTED = "Custom event accepted";
    public static final String TIMETRACE_CUSTOM_EVENT_IGNORED = "Custom event ignored";
    private static DTBTimeTrace theTrace;
    private boolean isStarted = false;
    private ArrayList<DTBTimeTracePhase> records = new ArrayList<>();
    private Date startDate;

    static class DTBTimeTracePhase {
        private Date date = new Date();
        private String label;

        DTBTimeTracePhase(String str) {
            this.label = str;
        }
    }

    DTBTimeTrace() {
    }

    public static DTBTimeTrace getInstance() {
        try {
            if (theTrace == null) {
                theTrace = new DTBTimeTrace();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBTimeTrace class");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to initialize DTBTimeTrace class", e10);
        }
        return theTrace;
    }

    public void addPhase(String str) {
        try {
            if (this.isStarted) {
                this.records.add(new DTBTimeTracePhase(str));
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute addPhase method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute addPhase method", e10);
        }
    }

    public void logTrace() {
        try {
            if (AdRegistration.isTestMode()) {
                DtbLog.debug(SERVERLESS_METRICS_TAG, getInstance().toString());
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute logTrace method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute logTrace method", e10);
        }
    }

    public void start() {
        try {
            if (AdRegistration.isTestMode()) {
                this.isStarted = true;
                this.startDate = new Date();
                this.records.clear();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute start method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute start method", e10);
        }
    }

    public void stop() {
        try {
            this.isStarted = false;
            this.records.clear();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute stop method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute stop method", e10);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Date date = this.startDate;
            if (date != null) {
                for (DTBTimeTracePhase dTBTimeTracePhase : this.records) {
                    sb2.append(dTBTimeTracePhase.label);
                    sb2.append("-> ");
                    sb2.append(dTBTimeTracePhase.date.getTime() - date.getTime());
                    sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                    date = dTBTimeTracePhase.date;
                }
                sb2.append("Total Time:");
                sb2.append(date.getTime() - this.startDate.getTime());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            start();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute toString method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute toString method", e10);
        }
        return sb2.toString();
    }
}
