package com.mobilefuse.sdk.network.client;

import com.my.target.common.menu.MenuActionType;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpBinaryPostBody;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "content", "", "headers", "", "", "([BLjava/util/Map;)V", "getContent", "()[B", "contentType", "getContentType", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpBinaryPostBody implements HttpPostBody {

    @NotNull
    private final byte[] content;

    @NotNull
    private final String contentType;

    @NotNull
    private final Map<String, String> headers;

    public HttpBinaryPostBody(@NotNull byte[] content, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.content = content;
        this.headers = headers;
        this.contentType = "application/octet-stream";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpBinaryPostBody copy$default(HttpBinaryPostBody httpBinaryPostBody, byte[] bArr, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = httpBinaryPostBody.getContent();
        }
        if ((i10 & 2) != 0) {
            map = httpBinaryPostBody.getHeaders();
        }
        return httpBinaryPostBody.copy(bArr, map);
    }

    @NotNull
    public final byte[] component1() {
        return getContent();
    }

    @NotNull
    public final Map<String, String> component2() {
        return getHeaders();
    }

    @NotNull
    public final HttpBinaryPostBody copy(@NotNull byte[] content, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpBinaryPostBody(content, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HttpBinaryPostBody.class, other != null ? other.getClass() : null) || !(other instanceof HttpBinaryPostBody)) {
            return false;
        }
        HttpBinaryPostBody httpBinaryPostBody = (HttpBinaryPostBody) other;
        return Intrinsics.areEqual(getHeaders(), httpBinaryPostBody.getHeaders()) && Intrinsics.areEqual(getContentType(), httpBinaryPostBody.getContentType()) && Arrays.equals(getContent(), httpBinaryPostBody.getContent());
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public byte[] getContent() {
        return this.content;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpPostBody
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return (((Arrays.hashCode(getContent()) * 31) + getHeaders().hashCode()) * 31) + getContentType().hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpBinaryPostBody(content=" + Arrays.toString(getContent()) + ", headers=" + getHeaders() + ")";
    }

    public /* synthetic */ HttpBinaryPostBody(byte[] bArr, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
