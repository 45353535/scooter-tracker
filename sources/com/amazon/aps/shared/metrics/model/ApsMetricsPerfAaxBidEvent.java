package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAaxBidEvent;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "hostname", "", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;Ljava/lang/String;)V", "getResult", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "getHostname", "()Ljava/lang/String;", "refreshFlag", "", "getRefreshFlag", "()Ljava/lang/Boolean;", "setRefreshFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "toJsonObject", "Lorg/json/JSONObject;", "component1", "component2", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfAaxBidEvent extends ApsMetricsPerfEventBase {

    @NotNull
    private final String hostname;

    @Nullable
    private Boolean refreshFlag;

    @NotNull
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfAaxBidEvent(@NotNull ApsMetricsResult result, @NotNull String hostname) {
        super(result, 0L, 0L, 6, null);
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        this.result = result;
        this.hostname = hostname;
    }

    public static /* synthetic */ ApsMetricsPerfAaxBidEvent copy$default(ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent, ApsMetricsResult apsMetricsResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAaxBidEvent.result;
        }
        if ((i10 & 2) != 0) {
            str = apsMetricsPerfAaxBidEvent.hostname;
        }
        return apsMetricsPerfAaxBidEvent.copy(apsMetricsResult, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApsMetricsResult getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHostname() {
        return this.hostname;
    }

    @NotNull
    public final ApsMetricsPerfAaxBidEvent copy(@NotNull ApsMetricsResult result, @NotNull String hostname) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return new ApsMetricsPerfAaxBidEvent(result, hostname);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApsMetricsPerfAaxBidEvent)) {
            return false;
        }
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent = (ApsMetricsPerfAaxBidEvent) other;
        return this.result == apsMetricsPerfAaxBidEvent.result && Intrinsics.areEqual(this.hostname, apsMetricsPerfAaxBidEvent.hostname);
    }

    @NotNull
    public final String getHostname() {
        return this.hostname;
    }

    @Nullable
    public final Boolean getRefreshFlag() {
        return this.refreshFlag;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.hostname.hashCode();
    }

    public final void setRefreshFlag(@Nullable Boolean bool) {
        this.refreshFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("h", this.hostname);
        Boolean bool = this.refreshFlag;
        if (bool != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, bool.booleanValue());
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAaxBidEvent(result=" + this.result + ", hostname=" + this.hostname + ")";
    }
}
