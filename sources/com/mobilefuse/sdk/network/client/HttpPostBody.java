package com.mobilefuse.sdk.network.client;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "", "content", "", "getContent", "()[B", "contentType", "", "getContentType", "()Ljava/lang/String;", "headers", "", "getHeaders", "()Ljava/util/Map;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public interface HttpPostBody {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        @NotNull
        public static Map<String, String> getHeaders(@NotNull HttpPostBody httpPostBody) {
            return MapsKt.emptyMap();
        }
    }

    @Nullable
    byte[] getContent();

    @NotNull
    String getContentType();

    @NotNull
    Map<String, String> getHeaders();
}
