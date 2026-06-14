package com.amazon.aps.shared.metrics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsEventBase;", "", "timestamp", "", "<init>", "(J)V", "isToSendDeviceInfo", "", "jsonKeyName", "", "getJsonKeyName", "()Ljava/lang/String;", "toJsonObject", "Lorg/json/JSONObject;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ApsMetricsEventBase {
    private final long timestamp;

    public ApsMetricsEventBase() {
        this(0L, 1, null);
    }

    @NotNull
    public abstract String getJsonKeyName();

    public boolean isToSendDeviceInfo() {
        return false;
    }

    @NotNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, this.timestamp);
        return jSONObject;
    }

    public ApsMetricsEventBase(long j10) {
        this.timestamp = j10;
    }

    public /* synthetic */ ApsMetricsEventBase(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? System.currentTimeMillis() : j10);
    }
}
