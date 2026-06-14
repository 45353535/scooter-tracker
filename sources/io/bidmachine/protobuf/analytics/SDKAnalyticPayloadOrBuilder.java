package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.analytics.SDKAnalyticPayload;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface SDKAnalyticPayloadOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    SDKAnalyticPayload.Metric getMetrics(int i10);

    int getMetricsCount();

    List<SDKAnalyticPayload.Metric> getMetricsList();

    SDKAnalyticPayload.MetricOrBuilder getMetricsOrBuilder(int i10);

    List<? extends SDKAnalyticPayload.MetricOrBuilder> getMetricsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
