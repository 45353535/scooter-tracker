package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.http.HttpHeaders;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001_B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010&J%\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010+J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b5\u00106J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b7\u00106J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b8\u00106J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u0002090%¢\u0006\u0004\b:\u0010;J\u000f\u0010?\u001a\u00020<H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\bB\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\b\u0003\u0010HR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\b\u0005\u0010JR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\b\u0007\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\b\t\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\b\u000b\u0010NR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\b\r\u0010PR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\b\u000f\u0010RR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\b\u0010\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b\u0011\u0010TR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\b\u0012\u0010TR\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\b\u0014\u0010AR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\b\u0015\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\b\u0017\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0011\u0010[\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010]\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b]\u0010\\R\u0011\u0010?\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b?\u0010^¨\u0006`"}, d2 = {"Lcom/applovin/shadow/okhttp3/Response;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okhttp3/Request;", "request", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "", PglCryptUtils.KEY_MESSAGE, "", "code", "Lcom/applovin/shadow/okhttp3/Handshake;", "handshake", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchange", "<init>", "(Lhh/z;Lhh/y;Ljava/lang/String;ILhh/s;Lhh/t;Lhh/c0;Lhh/b0;Lhh/b0;Lhh/b0;JJLmh/c;)V", "-deprecated_request", "()Lcom/applovin/shadow/okhttp3/Request;", "-deprecated_protocol", "()Lcom/applovin/shadow/okhttp3/Protocol;", "-deprecated_code", "()I", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_handshake", "()Lcom/applovin/shadow/okhttp3/Handshake;", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", POBCTAOverlayData.KEY_CTA_HEADER, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lcom/applovin/shadow/okhttp3/Headers;", "trailers", "byteCount", "peekBody", "(J)Lcom/applovin/shadow/okhttp3/ResponseBody;", "-deprecated_body", "()Lcom/applovin/shadow/okhttp3/ResponseBody;", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "newBuilder", "()Lcom/applovin/shadow/okhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lcom/applovin/shadow/okhttp3/Response;", "-deprecated_cacheResponse", "-deprecated_priorResponse", "Lcom/applovin/shadow/okhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lcom/applovin/shadow/okhttp3/CacheControl;", "-deprecated_cacheControl", "()Lcom/applovin/shadow/okhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "-deprecated_receivedResponseAtMillis", "", "close", "()V", "toString", "Lcom/applovin/shadow/okhttp3/Request;", "()Lhh/z;", "Lcom/applovin/shadow/okhttp3/Protocol;", "()Lhh/y;", "Ljava/lang/String;", "I", "Lcom/applovin/shadow/okhttp3/Handshake;", "()Lhh/s;", "Lcom/applovin/shadow/okhttp3/Headers;", "()Lhh/t;", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "()Lhh/c0;", "Lcom/applovin/shadow/okhttp3/Response;", "()Lhh/b0;", "J", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "()Lmh/c;", "lazyCacheControl", "Lcom/applovin/shadow/okhttp3/CacheControl;", "", "isSuccessful", "()Z", "isRedirect", "()Lhh/d;", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Response implements Closeable, AutoCloseable {

    @Nullable
    private final ResponseBody body;

    @Nullable
    private final Response cacheResponse;
    private final int code;

    @Nullable
    private final Exchange exchange;

    @Nullable
    private final Handshake handshake;

    @NotNull
    private final Headers headers;

    @Nullable
    private CacheControl lazyCacheControl;

    @NotNull
    private final String message;

    @Nullable
    private final Response networkResponse;

    @Nullable
    private final Response priorResponse;

    @NotNull
    private final Protocol protocol;
    private final long receivedResponseAtMillis;

    @NotNull
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String message, int i10, @Nullable Handshake handshake, @NotNull Headers headers, @Nullable ResponseBody responseBody, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j10, long j11, @Nullable Exchange exchange) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m4385deprecated_cacheControl() {
        return cacheControl();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Nullable
    public final ResponseBody body() {
        return this.body;
    }

    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @Nullable
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    @Nullable
    public final Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    public final String header(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return header$default(this, name, null, 2, null);
    }

    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i10 = this.code;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    @NotNull
    public final String message() {
        return this.message;
    }

    @Nullable
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final ResponseBody peekBody(long byteCount) throws IOException {
        ResponseBody responseBody = this.body;
        Intrinsics.checkNotNull(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(byteCount);
        buffer.write((Source) bufferedSourcePeek, Math.min(byteCount, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.INSTANCE.create(buffer, this.body.contentType(), buffer.size());
    }

    @Nullable
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @NotNull
    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    @Nullable
    public final String header(@NotNull String name, @Nullable String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        String str = this.headers.get(name);
        return str == null ? defaultValue : str;
    }

    @NotNull
    public final List<String> headers(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b \b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0018J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010(J\u0019\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b*\u0010(J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\"\u001a\u00020O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010%\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u0005R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010Z\u001a\u0004\b^\u0010\\\"\u0004\b_\u0010\u0005R$\u0010*\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010\u0005R\"\u0010,\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010.\u001a\u00020+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010b\u001a\u0004\bg\u0010d\"\u0004\bh\u0010fR$\u0010i\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010n¨\u0006o"}, d2 = {"Lcom/applovin/shadow/okhttp3/Response$Builder;", "", "Lcom/applovin/shadow/okhttp3/Response;", "response", "<init>", "(Lhh/b0;)V", "()V", "", "name", "", "checkSupportResponse", "(Ljava/lang/String;Lcom/applovin/shadow/okhttp3/Response;)V", "checkPriorResponse", "(Lcom/applovin/shadow/okhttp3/Response;)V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "(Lcom/applovin/shadow/okhttp3/Request;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Protocol;", "protocol", "(Lcom/applovin/shadow/okhttp3/Protocol;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "", "code", "(I)Lcom/applovin/shadow/okhttp3/Response$Builder;", PglCryptUtils.KEY_MESSAGE, "(Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Handshake;", "handshake", "(Lcom/applovin/shadow/okhttp3/Handshake;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "value", POBCTAOverlayData.KEY_CTA_HEADER, "(Ljava/lang/String;Ljava/lang/String;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "addHeader", "removeHeader", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "(Lcom/applovin/shadow/okhttp3/Headers;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "body", "(Lcom/applovin/shadow/okhttp3/ResponseBody;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "networkResponse", "(Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okhttp3/Response$Builder;", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "(J)Lcom/applovin/shadow/okhttp3/Response$Builder;", "receivedResponseAtMillis", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "deferredTrailers", "initExchange$okhttp", "(Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;)V", "initExchange", "build", "()Lcom/applovin/shadow/okhttp3/Response;", "Lcom/applovin/shadow/okhttp3/Request;", "getRequest$okhttp", "()Lhh/z;", "setRequest$okhttp", "(Lhh/z;)V", "Lcom/applovin/shadow/okhttp3/Protocol;", "getProtocol$okhttp", "()Lhh/y;", "setProtocol$okhttp", "(Lhh/y;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lcom/applovin/shadow/okhttp3/Handshake;", "getHandshake$okhttp", "()Lhh/s;", "setHandshake$okhttp", "(Lhh/s;)V", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "Lcom/applovin/shadow/okhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lhh/t$a;", "setHeaders$okhttp", "(Lhh/t$a;)V", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "getBody$okhttp", "()Lhh/c0;", "setBody$okhttp", "(Lhh/c0;)V", "Lcom/applovin/shadow/okhttp3/Response;", "getNetworkResponse$okhttp", "()Lhh/b0;", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lmh/c;", "setExchange$okhttp", "(Lmh/c;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Builder {

        @Nullable
        private ResponseBody body;

        @Nullable
        private Response cacheResponse;
        private int code;

        @Nullable
        private Exchange exchange;

        @Nullable
        private Handshake handshake;

        @NotNull
        private Headers.Builder headers;

        @Nullable
        private String message;

        @Nullable
        private Response networkResponse;

        @Nullable
        private Response priorResponse;

        @Nullable
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @Nullable
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null && response.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (response.body() != null) {
                    throw new IllegalArgumentException((name + ".body != null").toString());
                }
                if (response.networkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.cacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Builder body(@Nullable ResponseBody body) {
            this.body = body;
            return this;
        }

        @NotNull
        public Response build() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        @NotNull
        public Builder code(int code) {
            this.code = code;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        @Nullable
        /* JADX INFO: renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        /* JADX INFO: renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        @Nullable
        /* JADX INFO: renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        @NotNull
        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        @Nullable
        /* JADX INFO: renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        @Nullable
        /* JADX INFO: renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* JADX INFO: renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @NotNull
        public Builder message(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response priorResponse) {
            checkPriorResponse(priorResponse);
            this.priorResponse = priorResponse;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void setBody$okhttp(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i10) {
            this.code = i10;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j10) {
            this.receivedResponseAtMillis = j10;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j10) {
            this.sentRequestAtMillis = j10;
        }

        public Builder(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
        }
    }
}
