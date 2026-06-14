package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface HeaderBiddingAdOrBuilder extends MessageOrBuilder {
    boolean containsClientParams(String str);

    boolean containsServerParams(String str);

    String getBidder();

    ByteString getBidderBytes();

    @Deprecated
    Map<String, String> getClientParams();

    int getClientParamsCount();

    Map<String, String> getClientParamsMap();

    String getClientParamsOrDefault(String str, String str2);

    String getClientParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

    @Deprecated
    Map<String, String> getServerParams();

    int getServerParamsCount();

    Map<String, String> getServerParamsMap();

    String getServerParamsOrDefault(String str, String str2);

    String getServerParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
