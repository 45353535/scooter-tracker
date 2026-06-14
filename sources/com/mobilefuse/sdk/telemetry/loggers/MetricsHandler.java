package com.mobilefuse.sdk.telemetry.loggers;

import com.mobilefuse.sdk.telemetry.metricslogging.MetricRecordName;
import com.mobilefuse.sdk.telemetry.metricslogging.MetricsMfxImpl;
import com.mobilefuse.sdk.telemetry.metricslogging.TelemetryAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/loggers/MetricsHandler;", "Lcom/mobilefuse/sdk/telemetry/loggers/BaseSampleRate;", "()V", "metricsMfxImpl", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricsMfxImpl;", "getMetricsMfxImpl", "()Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricsMfxImpl;", "reportMetric", "", "telemetryAdInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "events", "Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricRecordName;", "reportMetricInternal", "instanceId", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final class MetricsHandler extends BaseSampleRate {

    @NotNull
    private final MetricsMfxImpl metricsMfxImpl = new MetricsMfxImpl();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MetricRecordName.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MetricRecordName.ON_AD_READY.ordinal()] = 1;
            iArr[MetricRecordName.ON_AD_RENDERED.ordinal()] = 2;
            iArr[MetricRecordName.VIDEO_CACHED.ordinal()] = 3;
            iArr[MetricRecordName.BID_TOKEN_GENERATED.ordinal()] = 4;
            iArr[MetricRecordName.ADVERTISING_ID_REQUEST_FAILED.ordinal()] = 5;
        }
    }

    private final void reportMetricInternal(int instanceId, MetricRecordName events) {
        this.metricsMfxImpl.reportMetric(instanceId, events);
    }

    @NotNull
    public final MetricsMfxImpl getMetricsMfxImpl() {
        return this.metricsMfxImpl;
    }

    public final void reportMetric(@NotNull TelemetryAdInfo telemetryAdInfo, @NotNull MetricRecordName events) {
        Intrinsics.checkNotNullParameter(telemetryAdInfo, "telemetryAdInfo");
        Intrinsics.checkNotNullParameter(events, "events");
        if (getShouldTransmitToServer()) {
            reportMetricInternal(telemetryAdInfo.getAdInstanceId(), events);
            int i10 = WhenMappings.$EnumSwitchMapping$0[events.ordinal()];
            if (i10 == 1) {
                this.metricsMfxImpl.onAdIsReady(telemetryAdInfo);
                return;
            }
            if (i10 == 2) {
                this.metricsMfxImpl.onAdRendered(telemetryAdInfo);
                return;
            }
            if (i10 == 3) {
                this.metricsMfxImpl.onVideoReady(telemetryAdInfo);
                return;
            }
            if (i10 == 4) {
                this.metricsMfxImpl.onBidTokenCreated(telemetryAdInfo);
                this.metricsMfxImpl.onBidTokenCreatedWithJIT(telemetryAdInfo);
            } else {
                if (i10 != 5) {
                    return;
                }
                this.metricsMfxImpl.onAdvertisingIdRequestFailed(telemetryAdInfo);
            }
        }
    }
}
