package com.unity3d.ads.network.model;

import com.my.target.common.menu.MenuActionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/network/model/HttpResponse;", "", "body", "statusCode", "", "headers", "", "", "urlString", "(Ljava/lang/Object;ILjava/util/Map;Ljava/lang/String;)V", "getBody", "()Ljava/lang/Object;", "getHeaders", "()Ljava/util/Map;", "getStatusCode", "()I", "getUrlString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", MenuActionType.COPY, "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpResponse {

    @NotNull
    private final Object body;

    @NotNull
    private final Map<String, Object> headers;
    private final int statusCode;

    @NotNull
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body) {
        this(body, 0, null, null, 14, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrlString() {
        return this.urlString;
    }

    @NotNull
    public final HttpResponse copy(@NotNull Object body, int statusCode, @NotNull Map<String, ? extends Object> headers, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return new HttpResponse(body, statusCode, headers, urlString);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) other;
        return Intrinsics.areEqual(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && Intrinsics.areEqual(this.headers, httpResponse.headers) && Intrinsics.areEqual(this.urlString, httpResponse.urlString);
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10) {
        this(body, i10, null, null, 12, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends Object> headers) {
        this(body, i10, headers, null, 8, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    public HttpResponse(@NotNull Object body, int i10, @NotNull Map<String, ? extends Object> headers, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? MapsKt.emptyMap() : map, (i11 & 8) != 0 ? "" : str);
    }
}
