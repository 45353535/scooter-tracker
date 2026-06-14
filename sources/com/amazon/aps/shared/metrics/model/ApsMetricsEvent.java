package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsEvent;", "", "metricsEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsEventBase;", "<init>", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsEventBase;)V", "isToSendDeviceInfo", "", "toJsonObject", "Lorg/json/JSONObject;", "component1", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsEvent {

    @NotNull
    private final ApsMetricsEventBase metricsEvent;

    public ApsMetricsEvent(@NotNull ApsMetricsEventBase metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.metricsEvent = metricsEvent;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final ApsMetricsEventBase getMetricsEvent() {
        return this.metricsEvent;
    }

    public static /* synthetic */ ApsMetricsEvent copy$default(ApsMetricsEvent apsMetricsEvent, ApsMetricsEventBase apsMetricsEventBase, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsEventBase = apsMetricsEvent.metricsEvent;
        }
        return apsMetricsEvent.copy(apsMetricsEventBase);
    }

    @NotNull
    public final ApsMetricsEvent copy(@NotNull ApsMetricsEventBase metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        return new ApsMetricsEvent(metricsEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsEvent) && Intrinsics.areEqual(this.metricsEvent, ((ApsMetricsEvent) other).metricsEvent);
    }

    public int hashCode() {
        return this.metricsEvent.hashCode();
    }

    public final boolean isToSendDeviceInfo() {
        return this.metricsEvent.isToSendDeviceInfo();
    }

    @NotNull
    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ApsMetricsEventBase apsMetricsEventBase = this.metricsEvent;
        jSONObject.put(apsMetricsEventBase.getJsonKeyName(), apsMetricsEventBase.toJsonObject());
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsEvent(metricsEvent=" + this.metricsEvent + ")";
    }
}
