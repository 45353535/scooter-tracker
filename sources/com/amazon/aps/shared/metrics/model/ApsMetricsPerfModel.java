package com.amazon.aps.shared.metrics.model;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010?\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020AH\u0016J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010D\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0005R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\u0005R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0005R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0007¨\u0006J"}, d2 = {"Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfModel;", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsEventBase;", "networkName", "", "<init>", "(Ljava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "setNetworkName", "bidId", "getBidId", "setBidId", "videoFlag", "", "getVideoFlag", "()Ljava/lang/Boolean;", "setVideoFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "adFormat", "getAdFormat", "setAdFormat", "correlationId", "getCorrelationId", "setCorrelationId", "bidEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAaxBidEvent;", "getBidEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAaxBidEvent;", "setBidEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAaxBidEvent;)V", "adapterEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdapterEvent;", "getAdapterEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdapterEvent;", "setAdapterEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdapterEvent;)V", "fetchEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdFetchEvent;", "getFetchEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdFetchEvent;", "setFetchEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdFetchEvent;)V", "impressionEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfImpressionFiredEvent;", "getImpressionEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfImpressionFiredEvent;", "setImpressionEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfImpressionFiredEvent;)V", "adClickEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdClickEvent;", "getAdClickEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdClickEvent;", "setAdClickEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfAdClickEvent;)V", "videoCompletedEvent", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfVideoCompletedEvent;", "getVideoCompletedEvent", "()Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfVideoCompletedEvent;", "setVideoCompletedEvent", "(Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfVideoCompletedEvent;)V", "jsonKeyName", "getJsonKeyName", "isToSendDeviceInfo", "toJsonObject", "Lorg/json/JSONObject;", "component1", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ApsMetricsPerfModel extends ApsMetricsEventBase {

    @Nullable
    private ApsMetricsPerfAdClickEvent adClickEvent;

    @Nullable
    private String adFormat;

    @Nullable
    private ApsMetricsPerfAdapterEvent adapterEvent;

    @Nullable
    private ApsMetricsPerfAaxBidEvent bidEvent;

    @Nullable
    private String bidId;

    @Nullable
    private String correlationId;

    @Nullable
    private ApsMetricsPerfAdFetchEvent fetchEvent;

    @Nullable
    private ApsMetricsPerfImpressionFiredEvent impressionEvent;

    @Nullable
    private String networkName;

    @Nullable
    private ApsMetricsPerfVideoCompletedEvent videoCompletedEvent;

    @Nullable
    private Boolean videoFlag;

    public ApsMetricsPerfModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfModel copy$default(ApsMetricsPerfModel apsMetricsPerfModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsPerfModel.networkName;
        }
        return apsMetricsPerfModel.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @NotNull
    public final ApsMetricsPerfModel copy(@Nullable String networkName) {
        return new ApsMetricsPerfModel(networkName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApsMetricsPerfModel) && Intrinsics.areEqual(this.networkName, ((ApsMetricsPerfModel) other).networkName);
    }

    @Nullable
    public final ApsMetricsPerfAdClickEvent getAdClickEvent() {
        return this.adClickEvent;
    }

    @Nullable
    public final String getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final ApsMetricsPerfAdapterEvent getAdapterEvent() {
        return this.adapterEvent;
    }

    @Nullable
    public final ApsMetricsPerfAaxBidEvent getBidEvent() {
        return this.bidEvent;
    }

    @Nullable
    public final String getBidId() {
        return this.bidId;
    }

    @Nullable
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @Nullable
    public final ApsMetricsPerfAdFetchEvent getFetchEvent() {
        return this.fetchEvent;
    }

    @Nullable
    public final ApsMetricsPerfImpressionFiredEvent getImpressionEvent() {
        return this.impressionEvent;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public String getJsonKeyName() {
        return "p";
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final ApsMetricsPerfVideoCompletedEvent getVideoCompletedEvent() {
        return this.videoCompletedEvent;
    }

    @Nullable
    public final Boolean getVideoFlag() {
        return this.videoFlag;
    }

    public int hashCode() {
        String str = this.networkName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        return (this.bidEvent == null && this.adapterEvent == null) ? false : true;
    }

    public final void setAdClickEvent(@Nullable ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent) {
        this.adClickEvent = apsMetricsPerfAdClickEvent;
    }

    public final void setAdFormat(@Nullable String str) {
        this.adFormat = str;
    }

    public final void setAdapterEvent(@Nullable ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent) {
        this.adapterEvent = apsMetricsPerfAdapterEvent;
    }

    public final void setBidEvent(@Nullable ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        this.bidEvent = apsMetricsPerfAaxBidEvent;
    }

    public final void setBidId(@Nullable String str) {
        this.bidId = str;
    }

    public final void setCorrelationId(@Nullable String str) {
        this.correlationId = str;
    }

    public final void setFetchEvent(@Nullable ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent) {
        this.fetchEvent = apsMetricsPerfAdFetchEvent;
    }

    public final void setImpressionEvent(@Nullable ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent) {
        this.impressionEvent = apsMetricsPerfImpressionFiredEvent;
    }

    public final void setNetworkName(@Nullable String str) {
        this.networkName = str;
    }

    public final void setVideoCompletedEvent(@Nullable ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent) {
        this.videoCompletedEvent = apsMetricsPerfVideoCompletedEvent;
    }

    public final void setVideoFlag(@Nullable Boolean bool) {
        this.videoFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    @NotNull
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        String str = this.networkName;
        if (str != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_NETWORK, str);
        }
        String str2 = this.bidId;
        if (str2 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDID, str2);
        }
        String str3 = this.correlationId;
        if (str3 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CORRELATIONID, str3);
        }
        Boolean bool = this.videoFlag;
        if (bool != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, bool.booleanValue());
        }
        String str4 = this.adFormat;
        if (str4 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, str4);
        }
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent = this.bidEvent;
        if (apsMetricsPerfAaxBidEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT, apsMetricsPerfAaxBidEvent.toJsonObject());
        }
        ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent = this.adapterEvent;
        if (apsMetricsPerfAdapterEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, apsMetricsPerfAdapterEvent.toJsonObject());
        }
        ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent = this.fetchEvent;
        if (apsMetricsPerfAdFetchEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_FETCHEVENT, apsMetricsPerfAdFetchEvent.toJsonObject());
        }
        ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent = this.impressionEvent;
        if (apsMetricsPerfImpressionFiredEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, apsMetricsPerfImpressionFiredEvent.toJsonObject());
        }
        ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent = this.adClickEvent;
        if (apsMetricsPerfAdClickEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT, apsMetricsPerfAdClickEvent.toJsonObject());
        }
        ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent = this.videoCompletedEvent;
        if (apsMetricsPerfVideoCompletedEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOCOMPLETEDEVENT, apsMetricsPerfVideoCompletedEvent.toJsonObject());
        }
        return jsonObject;
    }

    @NotNull
    public String toString() {
        return "ApsMetricsPerfModel(networkName=" + this.networkName + ")";
    }

    public /* synthetic */ ApsMetricsPerfModel(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public ApsMetricsPerfModel(@Nullable String str) {
        super(0L, 1, null);
        this.networkName = str;
    }
}
