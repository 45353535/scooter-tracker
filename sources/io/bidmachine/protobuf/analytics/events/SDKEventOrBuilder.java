package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.d2;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j2;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;

/* JADX INFO: loaded from: classes12.dex */
public interface SDKEventOrBuilder extends MessageOrBuilder {
    int getAction();

    StringValue getAdType();

    d2 getAdTypeOrBuilder();

    String getContext();

    ByteString getContextBytes();

    Struct getCustomParams();

    e2 getCustomParamsOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Error getError();

    ErrorOrBuilder getErrorOrBuilder();

    Timestamp getFinishTime();

    j2 getFinishTimeOrBuilder();

    StringValue getNetwork();

    d2 getNetworkOrBuilder();

    double getPrice();

    Timestamp getStartTime();

    j2 getStartTimeOrBuilder();

    boolean hasAdType();

    boolean hasCustomParams();

    boolean hasError();

    boolean hasFinishTime();

    boolean hasNetwork();

    boolean hasStartTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
