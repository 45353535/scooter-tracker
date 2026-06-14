package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.d;
import com.explorestack.protobuf.j2;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.a;
import io.bidmachine.protobuf.ResponsePayload;

/* JADX INFO: loaded from: classes11.dex */
public interface ResponsePayloadOrBuilder extends MessageOrBuilder {
    Timestamp getCacheTime();

    j2 getCacheTimeOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    ResponsePayload.PayloadOneofCase getPayloadOneofCase();

    Placement getRequestItemSpec();

    d getRequestItemSpecOrBuilder();

    Openrtb getResponseCache();

    a getResponseCacheOrBuilder();

    String getResponseCacheUrl();

    ByteString getResponseCacheUrlBytes();

    boolean hasCacheTime();

    boolean hasRequestItemSpec();

    boolean hasResponseCache();

    boolean hasResponseCacheUrl();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
