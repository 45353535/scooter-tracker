package com.mobilefuse.sdk.telemetry.metricslogging;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.y.z.w.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0007J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecord;", "", "name", "", "value", "", s.z.f67720z, "Lorg/json/JSONObject;", "(Ljava/lang/String;FLorg/json/JSONObject;)V", "getName", "()Ljava/lang/String;", "getTag", "()Lorg/json/JSONObject;", "getValue", "()F", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toJsonObject", "toString", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MetricRecord {

    @NotNull
    private final String name;

    @Nullable
    private final JSONObject tag;
    private final float value;

    public MetricRecord(@NotNull String name, float f10, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = f10;
        this.tag = jSONObject;
    }

    public static /* synthetic */ MetricRecord copy$default(MetricRecord metricRecord, String str, float f10, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metricRecord.name;
        }
        if ((i10 & 2) != 0) {
            f10 = metricRecord.value;
        }
        if ((i10 & 4) != 0) {
            jSONObject = metricRecord.tag;
        }
        return metricRecord.copy(str, f10, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getTag() {
        return this.tag;
    }

    @NotNull
    public final MetricRecord copy(@NotNull String name, float value, @Nullable JSONObject tag) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MetricRecord(name, value, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricRecord)) {
            return false;
        }
        MetricRecord metricRecord = (MetricRecord) other;
        return Intrinsics.areEqual(this.name, metricRecord.name) && Float.compare(this.value, metricRecord.value) == 0 && Intrinsics.areEqual(this.tag, metricRecord.tag);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final JSONObject getTag() {
        return this.tag;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.value)) * 31;
        JSONObject jSONObject = this.tag;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", this.name);
        jSONObject.put("v", Float.valueOf(this.value));
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, this.tag);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "MetricRecord(name=" + this.name + ", value=" + this.value + ", tag=" + this.tag + ")";
    }

    public /* synthetic */ MetricRecord(String str, float f10, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f10, (i10 & 4) != 0 ? null : jSONObject);
    }
}
