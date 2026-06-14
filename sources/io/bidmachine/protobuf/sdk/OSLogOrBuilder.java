package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.OSLog;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface OSLogOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    OSLog.Record getRecords(int i10);

    int getRecordsCount();

    List<OSLog.Record> getRecordsList();

    OSLog.RecordOrBuilder getRecordsOrBuilder(int i10);

    List<? extends OSLog.RecordOrBuilder> getRecordsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
