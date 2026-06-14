package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.d2;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ConfigurationOrBuilder extends MessageOrBuilder {
    StringValue getBpk();

    d2 getBpkOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Monitor.Configuration getMonitors(int i10);

    int getMonitorsCount();

    List<Monitor.Configuration> getMonitorsList();

    Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10);

    List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList();

    Reader.Configuration getReaders(int i10);

    int getReadersCount();

    List<Reader.Configuration> getReadersList();

    Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10);

    List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList();

    boolean hasBpk();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
