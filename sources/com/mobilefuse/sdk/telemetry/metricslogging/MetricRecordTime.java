package com.mobilefuse.sdk.telemetry.metricslogging;

import androidx.collection.b;
import com.mobilefuse.sdk.telemetry.TelemetryHelpersKt;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordTime;", "", "name", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "id", "", "timeStamp", "", "(Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;IJ)V", "getId", "()I", "getName", "()Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "getTimeStamp", "()J", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class MetricRecordTime {
    private final int id;

    @NotNull
    private final MetricRecordName name;
    private final long timeStamp;

    public MetricRecordTime(@NotNull MetricRecordName name, int i10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.id = i10;
        this.timeStamp = j10;
    }

    public static /* synthetic */ MetricRecordTime copy$default(MetricRecordTime metricRecordTime, MetricRecordName metricRecordName, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            metricRecordName = metricRecordTime.name;
        }
        if ((i11 & 2) != 0) {
            i10 = metricRecordTime.id;
        }
        if ((i11 & 4) != 0) {
            j10 = metricRecordTime.timeStamp;
        }
        return metricRecordTime.copy(metricRecordName, i10, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetricRecordName getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final MetricRecordTime copy(@NotNull MetricRecordName name, int id2, long timeStamp) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MetricRecordTime(name, id2, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricRecordTime)) {
            return false;
        }
        MetricRecordTime metricRecordTime = (MetricRecordTime) other;
        return Intrinsics.areEqual(this.name, metricRecordTime.name) && this.id == metricRecordTime.id && this.timeStamp == metricRecordTime.timeStamp;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final MetricRecordName getName() {
        return this.name;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        MetricRecordName metricRecordName = this.name;
        return ((((metricRecordName != null ? metricRecordName.hashCode() : 0) * 31) + this.id) * 31) + b.a(this.timeStamp);
    }

    @NotNull
    public String toString() {
        return "MetricRecordTime(name=" + this.name + ", id=" + this.id + ", timeStamp=" + this.timeStamp + ")";
    }

    public /* synthetic */ MetricRecordTime(MetricRecordName metricRecordName, int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(metricRecordName, i10, (i11 & 4) != 0 ? TelemetryHelpersKt.getCurrentTimeMillis() : j10);
    }
}
