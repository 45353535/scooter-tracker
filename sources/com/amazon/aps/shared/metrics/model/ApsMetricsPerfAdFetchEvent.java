package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdFetchEvent;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;)V", "getResult", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "setResult", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "toJsonObject", "Lorg/json/JSONObject;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfAdFetchEvent extends ApsMetricsPerfEventBase {

    @Nullable
    private ApsMetricsResult result;

    @Nullable
    private String url;

    public ApsMetricsPerfAdFetchEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfAdFetchEvent copy$default(ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdFetchEvent.result;
        }
        return apsMetricsPerfAdFetchEvent.copy(apsMetricsResult);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApsMetricsResult getResult() {
        return this.result;
    }

    @NotNull
    public final ApsMetricsPerfAdFetchEvent copy(@Nullable ApsMetricsResult result) {
        return new ApsMetricsPerfAdFetchEvent(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsPerfAdFetchEvent) && this.result == ((ApsMetricsPerfAdFetchEvent) other).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        ApsMetricsResult apsMetricsResult = this.result;
        if (apsMetricsResult == null) {
            return 0;
        }
        return apsMetricsResult.hashCode();
    }

    public void setResult(@Nullable ApsMetricsResult apsMetricsResult) {
        this.result = apsMetricsResult;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        String str = this.url;
        if (str != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, str);
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdFetchEvent(result=" + this.result + ")";
    }

    public /* synthetic */ ApsMetricsPerfAdFetchEvent(ApsMetricsResult apsMetricsResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdFetchEvent(@Nullable ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
