package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.c;
import com.explorestack.protobuf.e2;

/* JADX INFO: loaded from: classes11.dex */
public interface InitRequestV2OrBuilder extends MessageOrBuilder {
    Context getContext();

    c getContextOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Struct getExt();

    e2 getExtOrBuilder();

    boolean hasContext();

    boolean hasExt();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
