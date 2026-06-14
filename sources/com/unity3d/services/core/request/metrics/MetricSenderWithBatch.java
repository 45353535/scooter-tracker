package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0003R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/unity3d/services/core/request/metrics/MetricSenderWithBatch;", "Lcom/unity3d/services/core/request/metrics/MetricSenderBase;", "_original", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "initializationStatusReader", "Lcom/unity3d/services/core/properties/InitializationStatusReader;", "(Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;Lcom/unity3d/services/core/properties/InitializationStatusReader;)V", "_logger", "Lcom/unity3d/ads/core/log/Logger;", "get_logger", "()Lcom/unity3d/ads/core/log/Logger;", "_logger$delegate", "Lkotlin/Lazy;", "_queue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lcom/unity3d/services/core/request/metrics/Metric;", "metricEndPoint", "", "getMetricEndPoint", "()Ljava/lang/String;", "sendEvent", "", "event", "value", "tags", "", "sendMetric", "metric", "sendMetrics", "metrics", "", "sendQueueIfNeeded", "updateOriginal", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MetricSenderWithBatch extends MetricSenderBase {

    /* JADX INFO: renamed from: _logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy _logger;

    @NotNull
    private SDKMetricsSender _original;

    @NotNull
    private final LinkedBlockingQueue<Metric> _queue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(@NotNull SDKMetricsSender _original, @NotNull InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        Intrinsics.checkNotNullParameter(_original, "_original");
        Intrinsics.checkNotNullParameter(initializationStatusReader, "initializationStatusReader");
        this._original = _original;
        this._queue = new LinkedBlockingQueue<>();
        this._logger = i.a(new Function0<Logger>() { // from class: com.unity3d.services.core.request.metrics.MetricSenderWithBatch$_logger$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                return (Logger) Utilities.getService(Logger.class);
            }
        });
    }

    private final Logger get_logger() {
        Object value = this._logger.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-_logger>(...)");
        return (Logger) value;
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    @Nullable
    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendEvent(@NotNull String event, @Nullable String value, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (event.length() != 0) {
            sendMetrics(CollectionsKt.listOf(new Metric(event, value, tags)));
            return;
        }
        get_logger().debug("Metric event not sent due to being empty: " + event);
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public void sendMetric(@NotNull Metric metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        sendMetrics(CollectionsKt.listOf(metric));
    }

    @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
    public synchronized void sendMetrics(@NotNull List<Metric> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._queue.addAll(metrics);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(CollectionsKt.emptyList());
    }

    public final void updateOriginal(@NotNull SDKMetricsSender metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this._original = metrics;
    }
}
