package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public interface RegsCcpaExtensionOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    String getUsPrivacy();

    ByteString getUsPrivacyBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
