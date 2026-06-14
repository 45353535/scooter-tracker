package com.amazon.aps.shared.metrics.model;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdClickEvent;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "timestamp", "", "<init>", "(J)V", "component1", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfAdClickEvent extends ApsMetricsPerfEventBase {
    private final long timestamp;

    public ApsMetricsPerfAdClickEvent(long j10) {
        super(null, j10, 0L, 5, null);
        this.timestamp = j10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final long getTimestamp() {
        return this.timestamp;
    }

    public static /* synthetic */ ApsMetricsPerfAdClickEvent copy$default(ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = apsMetricsPerfAdClickEvent.timestamp;
        }
        return apsMetricsPerfAdClickEvent.copy(j10);
    }

    @NotNull
    public final ApsMetricsPerfAdClickEvent copy(long timestamp) {
        return new ApsMetricsPerfAdClickEvent(timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsPerfAdClickEvent) && this.timestamp == ((ApsMetricsPerfAdClickEvent) other).timestamp;
    }

    public int hashCode() {
        return b.a(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfAdClickEvent(timestamp=" + this.timestamp + ")";
    }
}
