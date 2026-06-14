package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.Error;

/* JADX INFO: loaded from: classes3.dex */
public interface ErrorOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Error.Data getError();

    Error.DataOrBuilder getErrorOrBuilder();

    String getName();

    ByteString getNameBytes();

    Error.Data getReason();

    Error.DataOrBuilder getReasonOrBuilder();

    boolean hasError();

    boolean hasReason();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
