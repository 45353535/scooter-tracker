package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfImpressionFiredEvent;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;)V", "getResult", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfImpressionFiredEvent extends ApsMetricsPerfEventBase {

    @NotNull
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfImpressionFiredEvent(@NotNull ApsMetricsResult result) {
        super(result, 0L, 0L, 6, null);
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ ApsMetricsPerfImpressionFiredEvent copy$default(ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfImpressionFiredEvent.result;
        }
        return apsMetricsPerfImpressionFiredEvent.copy(apsMetricsResult);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApsMetricsResult getResult() {
        return this.result;
    }

    @NotNull
    public final ApsMetricsPerfImpressionFiredEvent copy(@NotNull ApsMetricsResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new ApsMetricsPerfImpressionFiredEvent(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsPerfImpressionFiredEvent) && this.result == ((ApsMetricsPerfImpressionFiredEvent) other).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    @NotNull
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfImpressionFiredEvent(result=" + this.result + ")";
    }
}
