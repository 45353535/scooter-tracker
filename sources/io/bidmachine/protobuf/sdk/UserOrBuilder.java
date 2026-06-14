package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface UserOrBuilder extends MessageOrBuilder {
    String getCcpa();

    ByteString getCcpaBytes();

    String getConsent();

    ByteString getConsentBytes();

    boolean getCoppa();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    boolean getGdpr();

    String getGpp();

    ByteString getGppBytes();

    int getGppSid(int i10);

    int getGppSidCount();

    List<Integer> getGppSidList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
