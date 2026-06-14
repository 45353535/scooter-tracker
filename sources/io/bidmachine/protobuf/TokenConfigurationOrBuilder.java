package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface TokenConfigurationOrBuilder extends MessageOrBuilder {
    String getAdNetworks(int i10);

    ByteString getAdNetworksBytes(int i10);

    int getAdNetworksCount();

    List<String> getAdNetworksList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    int getExpirationTime();

    String getType();

    ByteString getTypeBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
