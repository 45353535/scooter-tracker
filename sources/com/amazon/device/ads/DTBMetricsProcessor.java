package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBMetricReport;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class DTBMetricsProcessor {
    static String ALERT_SDK_WRAPPING = "alert_sdk_wrapping";
    static String ALERT_SDK_WRAPPING_V2 = "alert_sdk_wrapping_v2";
    static String REPORT_LOAD_FAILURE = "fetch_failure";
    static String REPORT_LOAD_LATENCY = "fetch_latency";
    static String REPORT_LOST_BID = "lost_bid";
    static String REPORT_MEDIATION_LATENCY = "mediation_latency";
    private static String SIMPLE_TAG = "DTB_Metrics";
    private static DTBMetricsProcessor theProcessor = new DTBMetricsProcessor();
    private final Object lock = new Object();
    private List<DTBMetricReport> reportQueue = new ArrayList();
    private boolean running;

    private DTBMetricsProcessor() {
    }

    private void addReport(DTBMetricReport dTBMetricReport) {
        synchronized (this.reportQueue) {
            this.reportQueue.add(dTBMetricReport);
        }
    }

    private static String cacheBusterQueryString() {
        return AdRegistration.isTestMode() ? "?cb=0" : String.format("?cb=%d", Integer.valueOf((int) (Math.random() * 1.0E7d)));
    }

    private void dispenseReport() {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7457b.dispenseReportImpl();
                }
            });
        } else {
            dispenseReportImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispenseReportImpl() {
        synchronized (this.lock) {
            try {
                if (this.running) {
                    return;
                }
                this.running = true;
                while (this.reportQueue.size() > 0) {
                    DTBMetricReport dTBMetricReport = this.reportQueue.get(0);
                    try {
                        if (DTBMetricsConfiguration.getInstance().isTypeEnabled(dTBMetricReport.getType())) {
                            String completeURLForPixelsBasedOnReportURL = getCompleteURLForPixelsBasedOnReportURL(dTBMetricReport);
                            DtbLog.debug(SIMPLE_TAG, "Report URL:\n" + completeURLForPixelsBasedOnReportURL + "\nType:" + dTBMetricReport.getType());
                            String str = SIMPLE_TAG;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Report:\n");
                            sb2.append(dTBMetricReport);
                            DtbLog.debug(str, sb2.toString());
                            new DtbHttpClient(completeURLForPixelsBasedOnReportURL).executeGET(60000);
                            removeFromQueue();
                            DtbLog.debug(SIMPLE_TAG, "Report Submission Success");
                        } else {
                            DtbLog.debug(SIMPLE_TAG, "Report type:" + dTBMetricReport.getType() + " is ignored");
                            removeFromQueue();
                        }
                    } catch (RuntimeException e10) {
                        e = e10;
                        DtbLog.warn("Exception:" + e.getMessage());
                        removeFromQueue();
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Exception occurred while processing metric report", e);
                    } catch (MalformedURLException e11) {
                        DtbLog.warn("Malformed Exception:" + e11.getMessage());
                    } catch (IOException e12) {
                        DtbLog.warn("IOException:" + e12.getMessage());
                        DtbLog.debug(SIMPLE_TAG, "Report Submission Failure");
                    } catch (JSONException e13) {
                        e = e13;
                        DtbLog.warn("Exception:" + e.getMessage());
                        removeFromQueue();
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Exception occurred while processing metric report", e);
                    }
                }
                this.running = false;
            } finally {
            }
        }
    }

    private String getCompleteURLForPixelsBasedOnReportURL(DTBMetricReport dTBMetricReport) throws UnsupportedEncodingException {
        String hostname = (dTBMetricReport.getHostname() == null || dTBMetricReport.getHostname().trim().length() == 0) ? DtbConstants.AAX_HOSTNAME : dTBMetricReport.getHostname();
        return (dTBMetricReport.getBidId() == null || dTBMetricReport.getBidId().trim().length() == 0) ? String.format("%s/x/px/p/PH/%s%s", hostname, dTBMetricReport.toEncodedString(), cacheBusterQueryString()) : String.format("%s/x/px/%s/%s%s", hostname, dTBMetricReport.getBidId(), dTBMetricReport.toEncodedString(), cacheBusterQueryString());
    }

    static DTBMetricsProcessor getInstance() {
        return theProcessor;
    }

    private boolean isMainThread() {
        return DTBAdUtil.isMainThread();
    }

    private void removeFromQueue() {
        synchronized (this.reportQueue) {
            this.reportQueue.remove(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void submitExpiredReportImpl(List<DTBMetricReport.BidWrapper> list) {
        Iterator<DTBMetricReport.BidWrapper> it = list.iterator();
        while (it.hasNext()) {
            addReport(DTBMetricReport.reportWithBidIdAndType(it.next(), REPORT_LOST_BID));
        }
        dispenseReport();
    }

    void submitErrorReport(String str, Map<String, Object> map) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map));
        dispenseReport();
    }

    void submitExpiredReport(final List<DTBMetricReport.BidWrapper> list) {
        if (isMainThread()) {
            DtbThreadService.getInstance().execute(new Runnable() { // from class: com.amazon.device.ads.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7453b.submitExpiredReportImpl(list);
                }
            });
        } else {
            submitExpiredReportImpl(list);
        }
    }

    void submitLatencyReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str, int i10) {
        addReport(DTBMetricReport.reportWithBidTypeLatency(bidWrapper, str, i10));
        dispenseReport();
    }

    void submitSimpleReportBidId(DTBMetricReport.BidWrapper bidWrapper, String str) {
        addReport(DTBMetricReport.reportWithBidIdAndType(bidWrapper, str));
        dispenseReport();
    }

    void submitErrorReport(String str, Map<String, Object> map, DTBMetricReport.BidWrapper bidWrapper) {
        addReport(DTBMetricReport.reportWithTypeAndExtraProperties(str, map, bidWrapper));
        dispenseReport();
    }
}
