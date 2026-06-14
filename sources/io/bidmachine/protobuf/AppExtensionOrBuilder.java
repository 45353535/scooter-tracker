package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.j2;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public interface AppExtensionOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Timestamp getInstallTime();

    j2 getInstallTimeOrBuilder();

    long getUptime();

    boolean hasInstallTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
