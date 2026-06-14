package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public interface DeviceExtensionOrBuilder extends MessageOrBuilder {
    int getBattery();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    boolean getRooted();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
