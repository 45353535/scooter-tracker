package com.mobilefuse.sdk.network.client;

import androidx.collection.b;
import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/mobilefuse/sdk/network/client/HttpGetRequest;", "Lcom/mobilefuse/sdk/network/client/HttpRequest;", "url", "", "headers", "", "gzipEncoding", "", "emptyUserAgent", "timeoutMillis", "", "(Ljava/lang/String;Ljava/util/Map;ZZJ)V", "getEmptyUserAgent", "()Z", "getGzipEncoding", "getHeaders", "()Ljava/util/Map;", "getTimeoutMillis", "()J", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "equals", "other", "", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class HttpGetRequest implements HttpRequest {
    private final boolean emptyUserAgent;
    private final boolean gzipEncoding;

    @NotNull
    private final Map<String, String> headers;
    private final long timeoutMillis;

    @NotNull
    private final String url;

    public HttpGetRequest(@NotNull String url, @NotNull Map<String, String> headers, boolean z10, boolean z11, long j10) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.headers = headers;
        this.gzipEncoding = z10;
        this.emptyUserAgent = z11;
        this.timeoutMillis = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpGetRequest copy$default(HttpGetRequest httpGetRequest, String str, Map map, boolean z10, boolean z11, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = httpGetRequest.getUrl();
        }
        if ((i10 & 2) != 0) {
            map = httpGetRequest.getHeaders();
        }
        if ((i10 & 4) != 0) {
            z10 = httpGetRequest.getGzipEncoding();
        }
        if ((i10 & 8) != 0) {
            z11 = httpGetRequest.getEmptyUserAgent();
        }
        if ((i10 & 16) != 0) {
            j10 = httpGetRequest.getTimeoutMillis();
        }
        long j11 = j10;
        return httpGetRequest.copy(str, map, z10, z11, j11);
    }

    @NotNull
    public final String component1() {
        return getUrl();
    }

    @NotNull
    public final Map<String, String> component2() {
        return getHeaders();
    }

    public final boolean component3() {
        return getGzipEncoding();
    }

    public final boolean component4() {
        return getEmptyUserAgent();
    }

    public final long component5() {
        return getTimeoutMillis();
    }

    @NotNull
    public final HttpGetRequest copy(@NotNull String url, @NotNull Map<String, String> headers, boolean gzipEncoding, boolean emptyUserAgent, long timeoutMillis) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new HttpGetRequest(url, headers, gzipEncoding, emptyUserAgent, timeoutMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpGetRequest)) {
            return false;
        }
        HttpGetRequest httpGetRequest = (HttpGetRequest) other;
        return Intrinsics.areEqual(getUrl(), httpGetRequest.getUrl()) && Intrinsics.areEqual(getHeaders(), httpGetRequest.getHeaders()) && getGzipEncoding() == httpGetRequest.getGzipEncoding() && getEmptyUserAgent() == httpGetRequest.getEmptyUserAgent() && getTimeoutMillis() == httpGetRequest.getTimeoutMillis();
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
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        String url = getUrl();
        int iHashCode = (url != null ? url.hashCode() : 0) * 31;
        Map<String, String> headers = getHeaders();
        int iHashCode2 = (iHashCode + (headers != null ? headers.hashCode() : 0)) * 31;
        boolean gzipEncoding = getGzipEncoding();
        ?? r12 = gzipEncoding;
        if (gzipEncoding) {
            r12 = 1;
        }
        int i10 = (iHashCode2 + r12) * 31;
        boolean emptyUserAgent = getEmptyUserAgent();
        return ((i10 + (emptyUserAgent ? 1 : emptyUserAgent)) * 31) + b.a(getTimeoutMillis());
    }

    @NotNull
    public String toString() {
        return "HttpGetRequest(url=" + getUrl() + ", headers=" + getHeaders() + ", gzipEncoding=" + getGzipEncoding() + ", emptyUserAgent=" + getEmptyUserAgent() + ", timeoutMillis=" + getTimeoutMillis() + ")";
    }

    public /* synthetic */ HttpGetRequest(String str, Map map, boolean z10, boolean z11, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? MapsKt.emptyMap() : map, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? 10000L : j10);
    }
}
