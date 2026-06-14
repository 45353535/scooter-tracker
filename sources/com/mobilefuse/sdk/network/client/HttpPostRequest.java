package com.mobilefuse.sdk.network.client;

import androidx.collection.b;
import com.mobilefuse.sdk.network.client.HttpPostBody;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u001c\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\\\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "T", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "Lcom/mobilefuse/sdk/network/client/HttpRequest;", "url", "", "body", "headers", "", "gzipEncoding", "", "emptyUserAgent", "timeoutMillis", "", "(Ljava/lang/String;Lcom/mobilefuse/sdk/network/client/HttpPostBody;Ljava/util/Map;ZZJ)V", "getBody", "()Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "Lcom/mobilefuse/sdk/network/client/HttpPostBody;", "getEmptyUserAgent", "()Z", "getGzipEncoding", "getHeaders", "()Ljava/util/Map;", "getTimeoutMillis", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "(Ljava/lang/String;Lcom/mobilefuse/sdk/network/client/HttpPostBody;Ljava/util/Map;ZZJ)Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "equals", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpPostRequest<T extends HttpPostBody> implements HttpRequest {

    @NotNull
    private final T body;
    private final boolean emptyUserAgent;
    private final boolean gzipEncoding;

    @NotNull
    private final Map<String, String> headers;
    private final long timeoutMillis;

    @NotNull
    private final String url;

    public HttpPostRequest(@NotNull String url, @NotNull T body, @NotNull Map<String, String> headers, boolean z10, boolean z11, long j10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.body = body;
        this.headers = headers;
        this.gzipEncoding = z10;
        this.emptyUserAgent = z11;
        this.timeoutMillis = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpPostRequest copy$default(HttpPostRequest httpPostRequest, String str, HttpPostBody httpPostBody, Map map, boolean z10, boolean z11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = httpPostRequest.getUrl();
        }
        if ((i10 & 2) != 0) {
            httpPostBody = httpPostRequest.body;
        }
        if ((i10 & 4) != 0) {
            map = httpPostRequest.getHeaders();
        }
        if ((i10 & 8) != 0) {
            z10 = httpPostRequest.getGzipEncoding();
        }
        if ((i10 & 16) != 0) {
            z11 = httpPostRequest.getEmptyUserAgent();
        }
        if ((i10 & 32) != 0) {
            j10 = httpPostRequest.getTimeoutMillis();
        }
        long j11 = j10;
        boolean z12 = z11;
        Map map2 = map;
        return httpPostRequest.copy(str, httpPostBody, map2, z10, z12, j11);
    }

    @NotNull
    public final String component1() {
        return getUrl();
    }

    @NotNull
    public final T component2() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> component3() {
        return getHeaders();
    }

    public final boolean component4() {
        return getGzipEncoding();
    }

    public final boolean component5() {
        return getEmptyUserAgent();
    }

    public final long component6() {
        return getTimeoutMillis();
    }

    @NotNull
    public final HttpPostRequest<T> copy(@NotNull String url, @NotNull T body, @NotNull Map<String, String> headers, boolean gzipEncoding, boolean emptyUserAgent, long timeoutMillis) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpPostRequest<>(url, body, headers, gzipEncoding, emptyUserAgent, timeoutMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpPostRequest)) {
            return false;
        }
        HttpPostRequest httpPostRequest = (HttpPostRequest) other;
        return Intrinsics.areEqual(getUrl(), httpPostRequest.getUrl()) && Intrinsics.areEqual(this.body, httpPostRequest.body) && Intrinsics.areEqual(getHeaders(), httpPostRequest.getHeaders()) && getGzipEncoding() == httpPostRequest.getGzipEncoding() && getEmptyUserAgent() == httpPostRequest.getEmptyUserAgent() && getTimeoutMillis() == httpPostRequest.getTimeoutMillis();
    }

    @NotNull
    public final T getBody() {
        return this.body;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public boolean getEmptyUserAgent() {
        return this.emptyUserAgent;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public boolean getGzipEncoding() {
        return this.gzipEncoding;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // com.mobilefuse.sdk.network.client.HttpRequest
    @NotNull
    public String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public int hashCode() {
        String url = getUrl();
        int iHashCode = (url != null ? url.hashCode() : 0) * 31;
        T t10 = this.body;
        int iHashCode2 = (iHashCode + (t10 != null ? t10.hashCode() : 0)) * 31;
        Map<String, String> headers = getHeaders();
        int iHashCode3 = (iHashCode2 + (headers != null ? headers.hashCode() : 0)) * 31;
        boolean gzipEncoding = getGzipEncoding();
        ?? r12 = gzipEncoding;
        if (gzipEncoding) {
            r12 = 1;
        }
        int i10 = (iHashCode3 + r12) * 31;
        boolean emptyUserAgent = getEmptyUserAgent();
        return ((i10 + (emptyUserAgent ? 1 : emptyUserAgent)) * 31) + b.a(getTimeoutMillis());
    }

    @NotNull
    public String toString() {
        return "HttpPostRequest(url=" + getUrl() + ", body=" + this.body + ", headers=" + getHeaders() + ", gzipEncoding=" + getGzipEncoding() + ", emptyUserAgent=" + getEmptyUserAgent() + ", timeoutMillis=" + getTimeoutMillis() + ")";
    }

    public /* synthetic */ HttpPostRequest(String str, HttpPostBody httpPostBody, Map map, boolean z10, boolean z11, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, httpPostBody, (i10 & 4) != 0 ? MapsKt.emptyMap() : map, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? 10000L : j10);
    }
}
