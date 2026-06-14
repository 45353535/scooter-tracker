package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.e2;

/* JADX INFO: loaded from: classes11.dex */
public interface ExtrasOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Struct getInternal();

    e2 getInternalOrBuilder();

    Struct getPrivate();

    e2 getPrivateOrBuilder();

    Struct getPublic();

    e2 getPublicOrBuilder();

    boolean hasInternal();

    boolean hasPrivate();

    boolean hasPublic();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
