package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.Session;

/* JADX INFO: loaded from: classes3.dex */
public interface SessionOrBuilder extends MessageOrBuilder {
    Session.Context getContext();

    Session.ContextOrBuilder getContextOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    String getSessionId();

    ByteString getSessionIdBytes();

    boolean hasContext();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
