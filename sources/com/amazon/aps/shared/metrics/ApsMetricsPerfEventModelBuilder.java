package com.amazon.aps.shared.metrics;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdClickEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdFetchEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdapterEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfImpressionFiredEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfVideoCompletedEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.amazon.device.ads.DtbConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0014J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/amazon/aps/shared/metrics/ApsMetricsPerfEventModelBuilder;", "", "<init>", "()V", "perfModel", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfModel;", "withMediationName", DtbConstants.MEDIATION_NAME, "", "withCorrelationId", "correlationId", "withAdFormat", "adFormat", "withVideoFlag", "videoFlag", "", "withAdImpressionEndTime", "result", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsResult;", MRAIDNativeFeatureProvider.EXTRA_EVENT_END_TIME, "", "withBidId", "bidId", "withAdFetchStartTime", "startTime", "withAdFetchEndTime", "withAdapterStartTime", "withAdapterEndTime", "withAdClickEvent", "timestamp", "withVideoCompletedEvent", "withEvent", "event", "Lcom/amazon/aps/shared/metrics/model/ApsMetricsPerfEventBase;", "build", "Lorg/json/JSONObject;", "getFunnelEventName", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ApsMetricsPerfEventModelBuilder {

    @NotNull
    private final ApsMetricsPerfModel perfModel = new ApsMetricsPerfModel(null, 1, 0 == true ? 1 : 0);

    private final String getFunnelEventName() {
        return this.perfModel.getFetchEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_FETCHEVENT : this.perfModel.getAdapterEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT : this.perfModel.getAdClickEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT : this.perfModel.getBidEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT : this.perfModel.getImpressionEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT : this.perfModel.getVideoCompletedEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOCOMPLETEDEVENT : "";
    }

    public static /* synthetic */ ApsMetricsPerfEventModelBuilder withAdClickEvent$default(ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withAdClickEvent");
        }
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return apsMetricsPerfEventModelBuilder.withAdClickEvent(j10);
    }

    public static /* synthetic */ ApsMetricsPerfEventModelBuilder withVideoCompletedEvent$default(ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withVideoCompletedEvent");
        }
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return apsMetricsPerfEventModelBuilder.withVideoCompletedEvent(j10);
    }

    @Nullable
    public final JSONObject build() {
        try {
            return new ApsMetricsTahoeDataModel(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_FUNNEL, getFunnelEventName(), new ApsMetricsDataModel(new ApsMetricsEvent(this.perfModel)).toJsonObject()).toJsonObject();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error building the perf metrics object from builder", e10);
            return null;
        }
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdClickEvent(long timestamp) {
        this.perfModel.setAdClickEvent(new ApsMetricsPerfAdClickEvent(timestamp));
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdFetchEndTime(@NotNull ApsMetricsResult result, long endTime) {
        Intrinsics.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdFetchEvent fetchEvent = apsMetricsPerfModel.getFetchEvent();
        if (fetchEvent == null) {
            fetchEvent = new ApsMetricsPerfAdFetchEvent(result);
        }
        apsMetricsPerfModel.setFetchEvent(fetchEvent);
        ApsMetricsPerfAdFetchEvent fetchEvent2 = this.perfModel.getFetchEvent();
        if (fetchEvent2 != null) {
            fetchEvent2.setResult(result);
        }
        ApsMetricsPerfAdFetchEvent fetchEvent3 = this.perfModel.getFetchEvent();
        if (fetchEvent3 != null) {
            fetchEvent3.setEndTime(endTime);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdFetchStartTime(long startTime) {
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdFetchEvent fetchEvent = apsMetricsPerfModel.getFetchEvent();
        if (fetchEvent == null) {
            fetchEvent = new ApsMetricsPerfAdFetchEvent(null, 1, 0 == true ? 1 : 0);
        }
        apsMetricsPerfModel.setFetchEvent(fetchEvent);
        ApsMetricsPerfAdFetchEvent fetchEvent2 = this.perfModel.getFetchEvent();
        if (fetchEvent2 != null) {
            fetchEvent2.setStartTime(startTime);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdFormat(@NotNull String adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.perfModel.setAdFormat(adFormat);
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdImpressionEndTime(@NotNull ApsMetricsResult result, long endTime) {
        Intrinsics.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent = new ApsMetricsPerfImpressionFiredEvent(result);
        apsMetricsPerfImpressionFiredEvent.setEndTime(endTime);
        apsMetricsPerfModel.setImpressionEvent(apsMetricsPerfImpressionFiredEvent);
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdapterEndTime(@NotNull ApsMetricsResult result, long endTime) {
        Intrinsics.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdapterEvent adapterEvent = apsMetricsPerfModel.getAdapterEvent();
        if (adapterEvent == null) {
            adapterEvent = new ApsMetricsPerfAdapterEvent(null, 1, 0 == true ? 1 : 0);
        }
        apsMetricsPerfModel.setAdapterEvent(adapterEvent);
        ApsMetricsPerfAdapterEvent adapterEvent2 = this.perfModel.getAdapterEvent();
        if (adapterEvent2 != null) {
            adapterEvent2.setResult(result);
        }
        ApsMetricsPerfAdapterEvent adapterEvent3 = this.perfModel.getAdapterEvent();
        if (adapterEvent3 != null) {
            adapterEvent3.setEndTime(endTime);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withAdapterStartTime(long startTime) {
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdapterEvent adapterEvent = apsMetricsPerfModel.getAdapterEvent();
        if (adapterEvent == null) {
            adapterEvent = new ApsMetricsPerfAdapterEvent(null, 1, 0 == true ? 1 : 0);
        }
        apsMetricsPerfModel.setAdapterEvent(adapterEvent);
        ApsMetricsPerfAdapterEvent adapterEvent2 = this.perfModel.getAdapterEvent();
        if (adapterEvent2 != null) {
            adapterEvent2.setStartTime(startTime);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withBidId(@Nullable String bidId) {
        if (bidId != null) {
            this.perfModel.setBidId(bidId);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withCorrelationId(@NotNull String correlationId) {
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        this.perfModel.setCorrelationId(correlationId);
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withEvent(@NotNull ApsMetricsPerfEventBase event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ApsMetricsPerfAaxBidEvent) {
            this.perfModel.setBidEvent((ApsMetricsPerfAaxBidEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfImpressionFiredEvent) {
            this.perfModel.setImpressionEvent((ApsMetricsPerfImpressionFiredEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfAdFetchEvent) {
            this.perfModel.setFetchEvent((ApsMetricsPerfAdFetchEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfAdapterEvent) {
            this.perfModel.setAdapterEvent((ApsMetricsPerfAdapterEvent) event);
        }
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withMediationName(@Nullable String mediationName) {
        this.perfModel.setNetworkName(mediationName);
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withVideoCompletedEvent(long timestamp) {
        this.perfModel.setVideoCompletedEvent(new ApsMetricsPerfVideoCompletedEvent(timestamp));
        return this;
    }

    @NotNull
    public final ApsMetricsPerfEventModelBuilder withVideoFlag(boolean videoFlag) {
        this.perfModel.setVideoFlag(Boolean.valueOf(videoFlag));
        return this;
    }
}
