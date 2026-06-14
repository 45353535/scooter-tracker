package com.mobilefuse.sdk.telemetry.metricslogging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/metricslogging/MetricsMfxService;", "", "onAdIsReady", "", "adInfo", "Lcom/mobilefuse/sdk/telemetry/metricslogging/TelemetryAdInfo;", "onAdRendered", "onAdvertisingIdRequestFailed", "onBidTokenCreated", "onBidTokenCreatedWithJIT", "onVideoReady", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public interface MetricsMfxService {
    void onAdIsReady(@NotNull TelemetryAdInfo adInfo);

    void onAdRendered(@NotNull TelemetryAdInfo adInfo);

    void onAdvertisingIdRequestFailed(@NotNull TelemetryAdInfo adInfo);

    void onBidTokenCreated(@NotNull TelemetryAdInfo adInfo);

    void onBidTokenCreatedWithJIT(@NotNull TelemetryAdInfo adInfo);

    void onVideoReady(@NotNull TelemetryAdInfo adInfo);
}
