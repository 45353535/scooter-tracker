package com.amazon.aps.shared.metrics.model;

import com.amazon.aps.shared.ApsMetrics;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsDataModel;", "", "metrics", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsEvent;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsEvent;)V", "toJsonObject", "Lorg/json/JSONObject;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsDataModel {

    @NotNull
    private final ApsMetricsEvent metrics;

    public ApsMetricsDataModel(@NotNull ApsMetricsEvent metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    @NotNull
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, System.currentTimeMillis());
        jSONObject2.put("id", UUID.randomUUID().toString());
        if (this.metrics.isToSendDeviceInfo()) {
            ApsMetrics.Companion companion = ApsMetrics.INSTANCE;
            jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_DEVICEINFO, companion.getApsMetricsDeviceInfo().toJsonObject());
            jSONObject2.put("s", companion.getApsMetricsSdkInfo().toJsonObject());
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.metrics.toJsonObject());
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_APS, jSONObject2.put("m", jSONArray));
        return jSONObject;
    }
}
