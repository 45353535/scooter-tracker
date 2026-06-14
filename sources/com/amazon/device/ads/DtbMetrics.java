package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbMetric;
import com.amazon.device.ads.DtbMetrics;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class DtbMetrics implements Cloneable {
    private final String LOG_TAG = DtbMetrics.class.getSimpleName();
    private volatile Map<DtbMetric, Long> collectedMetrics = new EnumMap(DtbMetric.class);
    private volatile Map<DtbMetric, Long> tempTimer = new EnumMap(DtbMetric.class);
    private String instPxlUrl = null;

    DtbMetrics() {
    }

    public String getInstPxlUrl() {
        return this.instPxlUrl;
    }

    public int getMetricsCount() {
        return this.collectedMetrics.size();
    }

    public void incrementMetric(DtbMetric dtbMetric) {
        if (dtbMetric == null || dtbMetric.getMetricType() != DtbMetric.DtbMetricType.COUNTER) {
            throw new IllegalArgumentException("Either metric is null or metric type is not counter.");
        }
        if (this.collectedMetrics.get(dtbMetric) == null) {
            this.collectedMetrics.put(dtbMetric, 0L);
        }
        this.collectedMetrics.put(dtbMetric, Long.valueOf(this.collectedMetrics.get(dtbMetric).longValue() + 1));
    }

    public boolean isStarted(DtbMetric dtbMetric) {
        return this.tempTimer.containsKey(dtbMetric);
    }

    public void reset() {
        this.collectedMetrics.clear();
        this.tempTimer.clear();
    }

    public void resetMetric(DtbMetric dtbMetric) {
        try {
            this.collectedMetrics.remove(dtbMetric);
            this.tempTimer.remove(dtbMetric);
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to reset Metrics ", e10);
        }
    }

    public void setInstPxlUrl(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf("://")) != -1) {
            str = str.substring(iIndexOf + 3);
        }
        this.instPxlUrl = str;
    }

    public void startTimer(DtbMetric dtbMetric) {
        if (dtbMetric != null) {
            try {
                if (dtbMetric.getMetricType() == DtbMetric.DtbMetricType.TIMER) {
                    if (this.collectedMetrics.get(dtbMetric) == null) {
                        this.tempTimer.put(dtbMetric, Long.valueOf(System.currentTimeMillis()));
                        return;
                    }
                    throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to Start timer ", e10);
                return;
            }
        }
        throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
    }

    public void stopTimer(DtbMetric dtbMetric) {
        if (dtbMetric != null) {
            try {
                if (dtbMetric.getMetricType() != DtbMetric.DtbMetricType.COUNTER) {
                    if (this.tempTimer.get(dtbMetric) == null) {
                        throw new IllegalArgumentException("You are trying to stop a metric, which is not yet started: " + dtbMetric);
                    }
                    if (this.collectedMetrics.get(dtbMetric) == null) {
                        this.collectedMetrics.put(dtbMetric, Long.valueOf(System.currentTimeMillis() - this.tempTimer.get(dtbMetric).longValue()));
                        this.tempTimer.remove(dtbMetric);
                        return;
                    } else {
                        throw new IllegalArgumentException(dtbMetric + " is already set, your operation is trying to override a value.");
                    }
                }
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to stop timer ", e10);
                return;
            }
        }
        throw new IllegalArgumentException("Either metric is null or metric type is not timer.");
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "dtbm");
            for (Map.Entry<DtbMetric, Long> entry : this.collectedMetrics.entrySet()) {
                jSONObject.put(entry.getKey().getAAXName(), entry.getValue());
            }
        } catch (JSONException e10) {
            DtbLog.debug("Error while adding values to JSON object: " + e10.getLocalizedMessage());
        }
        return jSONObject.toString();
    }

    public String toURLEncodedString() {
        return DtbCommonUtils.getURLEncodedString(toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DtbMetrics m4259clone() {
        DtbMetrics dtbMetrics = new DtbMetrics();
        dtbMetrics.collectedMetrics.putAll(this.collectedMetrics);
        dtbMetrics.tempTimer.putAll(this.tempTimer);
        dtbMetrics.instPxlUrl = this.instPxlUrl;
        return dtbMetrics;
    }

    static class Submitter {
        public static final Submitter INSTANCE = new Submitter();
        private final String LOG_TAG = Submitter.class.getSimpleName();
        private final Queue<DtbMetrics> metricsQueue = new ConcurrentLinkedQueue();

        private Submitter() {
        }

        public static /* synthetic */ void a(Submitter submitter) {
            submitter.getClass();
            DtbLog.debug("Starting metrics submission..");
            submitter.submitMetrics();
            DtbLog.debug("Metrics submission thread complete.");
        }

        public void submitMetrics(DtbMetrics dtbMetrics) {
            if (dtbMetrics.getMetricsCount() > 0) {
                this.metricsQueue.add(dtbMetrics.m4259clone());
                dtbMetrics.reset();
                DtbLog.debug("Scheduling metrics submission in background thread.");
                DtbThreadService.getInstance().schedule(new Runnable() { // from class: com.amazon.device.ads.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DtbMetrics.Submitter.a(this.f7460b);
                    }
                });
                DtbLog.debug("Dispatched the metrics submit task on a background schedule thread.");
            }
        }

        private void submitMetrics() {
            Iterator<DtbMetrics> it = this.metricsQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                DtbMetrics next = it.next();
                i10++;
                DtbLog.debug("Starting metrics submission - Sequence " + i10);
                if (next.getInstPxlUrl() == null) {
                    it.remove();
                    DtbLog.debug("No metric url found- Sequence " + i10 + ", skipping..");
                } else {
                    String str = next.getInstPxlUrl() + next.toURLEncodedString();
                    DtbLog.debug("Metrics URL:" + str);
                    try {
                        DtbHttpClient dtbHttpClient = new DtbHttpClient(str);
                        dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                        dtbHttpClient.executeGET(60000);
                        if (dtbHttpClient.isHttpStatusCodeOK()) {
                            DtbLog.debug("Metrics submitted- Sequence " + i10);
                            it.remove();
                        } else {
                            DtbLog.debug("Metrics submission failed- Sequence " + i10 + ", response invalid");
                            return;
                        }
                    } catch (Exception e10) {
                        DtbLog.debug("Metrics submission failed- Sequence " + i10 + ", encountered error:" + e10.toString());
                        return;
                    }
                }
            }
        }
    }
}
