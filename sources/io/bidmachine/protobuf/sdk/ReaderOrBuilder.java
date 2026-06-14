package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.j2;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ReaderOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    Reader.Record getRecords(int i10);

    int getRecordsCount();

    List<Reader.Record> getRecordsList();

    Reader.RecordOrBuilder getRecordsOrBuilder(int i10);

    List<? extends Reader.RecordOrBuilder> getRecordsOrBuilderList();

    Timestamp getTimestamp();

    j2 getTimestampOrBuilder();

    boolean hasTimestamp();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
