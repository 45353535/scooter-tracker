package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "startTime", "", MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;JJ)V", "getResult", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "toJsonObject", "Lorg/json/JSONObject;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsPerfEventBase {
    private long endTime;

    @Nullable
    private final ApsMetricsResult result;
    private long startTime;

    public ApsMetricsPerfEventBase() {
        this(null, 0L, 0L, 7, null);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j10) {
        this.endTime = j10;
    }

    public final void setStartTime(long j10) {
        this.startTime = j10;
    }

    @NotNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ApsMetricsResult result = getResult();
        if (result != null) {
            jSONObject.put("r", result == ApsMetricsResult.Success);
        }
        long j10 = this.startTime;
        if (j10 != 0) {
            jSONObject.put("st", j10);
        }
        long j11 = this.endTime;
        if (j11 != 0) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, j11);
        }
        return jSONObject;
    }

    public ApsMetricsPerfEventBase(@Nullable ApsMetricsResult apsMetricsResult, long j10, long j11) {
        this.result = apsMetricsResult;
        this.startTime = j10;
        this.endTime = j11;
    }

    public /* synthetic */ ApsMetricsPerfEventBase(ApsMetricsResult apsMetricsResult, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : apsMetricsResult, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? 0L : j11);
    }
}
