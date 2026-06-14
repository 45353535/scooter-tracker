package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdapterEvent;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;)V", "getResult", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "setResult", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfAdapterEvent extends ApsMetricsPerfEventBase {

    @Nullable
    private ApsMetricsResult result;

    public ApsMetricsPerfAdapterEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfAdapterEvent copy$default(ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdapterEvent.result;
        }
        return apsMetricsPerfAdapterEvent.copy(apsMetricsResult);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApsMetricsResult getResult() {
        return this.result;
    }

    @NotNull
    public final ApsMetricsPerfAdapterEvent copy(@Nullable ApsMetricsResult result) {
        return new ApsMetricsPerfAdapterEvent(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsPerfAdapterEvent) && this.result == ((ApsMetricsPerfAdapterEvent) other).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @Nullable
    public ApsMetricsResult getResult() {
        return this.result;
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

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdapterEvent(result=" + this.result + ")";
    }

    public /* synthetic */ ApsMetricsPerfAdapterEvent(ApsMetricsResult apsMetricsResult, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdapterEvent(@Nullable ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
