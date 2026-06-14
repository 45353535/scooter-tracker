package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.j2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AppOrBuilder extends MessageOrBuilder {
    String getAppName();

    ByteString getAppNameBytes();

    String getAppVer();

    ByteString getAppVerBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    Timestamp getFirstLaunchTime();

    j2 getFirstLaunchTimeOrBuilder();

    String getFmwname();

    ByteString getFmwnameBytes();

    Timestamp getInstallBeginServerTimestamp();

    j2 getInstallBeginServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickServerTimestamp();

    j2 getInstallReferrerClickServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickTimestamp();

    j2 getInstallReferrerClickTimestampOrBuilder();

    String getInstallReferrerUrl();

    ByteString getInstallReferrerUrlBytes();

    Timestamp getInstallTime();

    j2 getInstallTimeOrBuilder();

    String getInstallVersion();

    ByteString getInstallVersionBytes();

    boolean getIsGooglePlayInstant();

    Context.App.Release getRelease();

    Context.App.ReleaseOrBuilder getReleaseOrBuilder();

    Timestamp getSdkInstallTime();

    j2 getSdkInstallTimeOrBuilder();

    String getStorecat();

    ByteString getStorecatBytes();

    String getStoresubcat(int i10);

    ByteString getStoresubcatBytes(int i10);

    int getStoresubcatCount();

    List<String> getStoresubcatList();

    boolean hasFirstLaunchTime();

    boolean hasInstallBeginServerTimestamp();

    boolean hasInstallReferrerClickServerTimestamp();

    boolean hasInstallReferrerClickTimestamp();

    boolean hasInstallTime();

    boolean hasRelease();

    boolean hasSdkInstallTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
