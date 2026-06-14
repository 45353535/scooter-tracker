package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface SdkAnalyticConfigOrBuilder extends MessageOrBuilder {
    String getContext();

    ByteString getContextBytes();

    int getCount();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    int getInterval();

    SdkAnalyticConfig.MetricConfig getMetricConfigs(int i10);

    int getMetricConfigsCount();

    List<SdkAnalyticConfig.MetricConfig> getMetricConfigsList();

    SdkAnalyticConfig.MetricConfigOrBuilder getMetricConfigsOrBuilder(int i10);

    List<? extends SdkAnalyticConfig.MetricConfigOrBuilder> getMetricConfigsOrBuilderList();

    String getUrl();

    ByteString getUrlBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
