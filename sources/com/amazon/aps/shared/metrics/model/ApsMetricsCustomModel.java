package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsCustomModel;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsEventBase;", "event", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsCustomEventInfo;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsCustomEventInfo;)V", "isToSendDeviceInfo", "", "jsonKeyName", "", "getJsonKeyName", "()Ljava/lang/String;", "toJsonObject", "Lorg/json/JSONObject;", "component1", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsCustomModel extends ApsMetricsEventBase {

    @NotNull
    private final ApsMetricsCustomEventInfo event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsCustomModel(@NotNull ApsMetricsCustomEventInfo event) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final ApsMetricsCustomEventInfo getEvent() {
        return this.event;
    }

    public static /* synthetic */ ApsMetricsCustomModel copy$default(ApsMetricsCustomModel apsMetricsCustomModel, ApsMetricsCustomEventInfo apsMetricsCustomEventInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsCustomEventInfo = apsMetricsCustomModel.event;
        }
        return apsMetricsCustomModel.copy(apsMetricsCustomEventInfo);
    }

    @NotNull
    public final ApsMetricsCustomModel copy(@NotNull ApsMetricsCustomEventInfo event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new ApsMetricsCustomModel(event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsCustomModel) && Intrinsics.areEqual(this.event, ((ApsMetricsCustomModel) other).event);
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public String getJsonKeyName() {
        return ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        return true;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public JSONObject toJsonObject() {
        return this.event.toJsonObject();
    }

    @NotNull
    public String toString() {
        return "ApsMetricsCustomModel(event=" + this.event + ")";
    }
}
