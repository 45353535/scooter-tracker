package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes3.dex */
public interface ContextOrBuilder extends MessageOrBuilder {
    App getApp();

    AppOrBuilder getAppOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Device getDevice();

    DeviceOrBuilder getDeviceOrBuilder();

    SDK getSdk();

    SDKOrBuilder getSdkOrBuilder();

    Session getSession();

    SessionOrBuilder getSessionOrBuilder();

    User getUser();

    UserOrBuilder getUserOrBuilder();

    boolean hasApp();

    boolean hasDevice();

    boolean hasSdk();

    boolean hasSession();

    boolean hasUser();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
