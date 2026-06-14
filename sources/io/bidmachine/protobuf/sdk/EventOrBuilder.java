package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.e2;
import io.bidmachine.protobuf.sdk.Event;

/* JADX INFO: loaded from: classes3.dex */
public interface EventOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Struct getExtrasPrivate();

    e2 getExtrasPrivateOrBuilder();

    Monitor getMonitor();

    MonitorOrBuilder getMonitorOrBuilder();

    Event.PayloadCase getPayloadCase();

    Reader getReader();

    ReaderOrBuilder getReaderOrBuilder();

    boolean hasExtrasPrivate();

    boolean hasMonitor();

    boolean hasReader();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
