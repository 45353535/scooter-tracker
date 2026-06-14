package com.unity3d.ads.network.model;

import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.shadow.okio.Utf8;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.unity3d.ads.network.model.HttpBody;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u009d\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u001b\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nHÆ\u0003J\u0015\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00103\u001a\u00020\u000fHÆ\u0003J¦\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u000fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u0006<"}, d2 = {"Lcom/unity3d/ads/network/model/HttpRequest;", "", "baseURL", "", "path", "method", "Lcom/unity3d/ads/network/model/RequestType;", "body", "Lcom/unity3d/ads/network/model/HttpBody;", "headers", "", "", "parameters", "scheme", "port", "", "connectTimeout", "readTimeout", "writeTimeout", "callTimeout", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)V", "getBaseURL", "()Ljava/lang/String;", "getBody", "()Lcom/unity3d/ads/network/model/HttpBody;", "getCallTimeout", "()I", "getConnectTimeout", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/unity3d/ads/network/model/RequestType;", "getParameters", "getPath", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReadTimeout", "getScheme", "getWriteTimeout", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/network/model/RequestType;Lcom/unity3d/ads/network/model/HttpBody;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;IIII)Lcom/unity3d/ads/network/model/HttpRequest;", "equals", "", "other", "hashCode", "toString", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpRequest {

    @NotNull
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;

    @NotNull
    private final String baseURL;

    @NotNull
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;

    @NotNull
    private final Map<String, List<String>> headers;

    @NotNull
    private final RequestType method;

    @NotNull
    private final Map<String, String> parameters;

    @NotNull
    private final String path;

    @Nullable
    private final Integer port;
    private final int readTimeout;

    @NotNull
    private final String scheme;
    private final int writeTimeout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i14 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i14 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i14 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i14 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i14 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i14 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i14 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i14 & 256) != 0) {
            i10 = httpRequest.connectTimeout;
        }
        if ((i14 & 512) != 0) {
            i11 = httpRequest.readTimeout;
        }
        if ((i14 & 1024) != 0) {
            i12 = httpRequest.writeTimeout;
        }
        if ((i14 & 2048) != 0) {
            i13 = httpRequest.callTimeout;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i10;
        int i18 = i11;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i17, i18, i15, i16);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseURL() {
        return this.baseURL;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCallTimeout() {
        return this.callTimeout;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HttpBody getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @NotNull
    public final HttpRequest copy(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer port, int connectTimeout, int readTimeout, int writeTimeout, int callTimeout) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, port, connectTimeout, readTimeout, writeTimeout, callTimeout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return Intrinsics.areEqual(this.baseURL, httpRequest.baseURL) && Intrinsics.areEqual(this.path, httpRequest.path) && this.method == httpRequest.method && Intrinsics.areEqual(this.body, httpRequest.body) && Intrinsics.areEqual(this.headers, httpRequest.headers) && Intrinsics.areEqual(this.parameters, httpRequest.parameters) && Intrinsics.areEqual(this.scheme, httpRequest.scheme) && Intrinsics.areEqual(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    @NotNull
    public final String getBaseURL() {
        return this.baseURL;
    }

    @NotNull
    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final RequestType getMethod() {
        return this.method;
    }

    @NotNull
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    @NotNull
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, Utf8.MASK_2BYTES, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, 0, 0, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, 0, 0, 3072, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, 0, 2048, null);
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(@NotNull String baseURL, @NotNull String path, @NotNull RequestType method, @NotNull HttpBody body, @NotNull Map<String, ? extends List<String>> headers, @NotNull Map<String, String> parameters, @NotNull String scheme, @Nullable Integer num, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(baseURL, "baseURL");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? RequestType.GET : requestType, (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i14 & 16) != 0 ? MapsKt.emptyMap() : map, (i14 & 32) != 0 ? MapsKt.emptyMap() : map2, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? 30000 : i10, (i14 & 512) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & 2048) != 0 ? 30000 : i13);
    }
}
