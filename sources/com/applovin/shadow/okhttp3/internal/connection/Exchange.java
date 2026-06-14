package com.applovin.shadow.okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.RealResponseBody;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSink;
import com.applovin.shadow.okio.ForwardingSource;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002STB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u001bJ\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u0010\u001bJ\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u001bJ\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u0010\u001bJ9\u00108\u001a\u00028\u0000\"\n\b\u0000\u00103*\u0004\u0018\u00010\f2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u000e¢\u0006\u0004\b:\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR$\u0010F\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR$\u0010J\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001a\u0010M\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010I¨\u0006U"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/EventListener;", "eventListener", "Lcom/applovin/shadow/okhttp3/internal/connection/ExchangeFinder;", "finder", "Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lmh/e;Lhh/r;Lmh/d;Lnh/d;)V", "Ljava/io/IOException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "trackFailure", "(Ljava/io/IOException;)V", "Lcom/applovin/shadow/okhttp3/Request;", "request", "writeRequestHeaders", "(Lcom/applovin/shadow/okhttp3/Request;)V", "", "duplex", "Lcom/applovin/shadow/okio/Sink;", "createRequestBody", "(Lcom/applovin/shadow/okhttp3/Request;Z)Lcom/applovin/shadow/okio/Sink;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lcom/applovin/shadow/okhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lcom/applovin/shadow/okhttp3/Response$Builder;", "Lcom/applovin/shadow/okhttp3/Response;", "response", "responseHeadersEnd", "(Lcom/applovin/shadow/okhttp3/Response;)V", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "openResponseBody", "(Lcom/applovin/shadow/okhttp3/Response;)Lcom/applovin/shadow/okhttp3/ResponseBody;", "Lcom/applovin/shadow/okhttp3/Headers;", "trailers", "()Lcom/applovin/shadow/okhttp3/Headers;", "Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "()Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;", "webSocketUpgradeFailed", "noNewExchangesOnConnection", MenuActionType.CANCEL, "detachWithViolence", ExifInterface.LONGITUDE_EAST, "", "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lmh/e;", "Lcom/applovin/shadow/okhttp3/EventListener;", "getEventListener$okhttp", "()Lhh/r;", "Lcom/applovin/shadow/okhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lmh/d;", "Lcom/applovin/shadow/okhttp3/internal/http/ExchangeCodec;", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "connection", "Lcom/applovin/shadow/okhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lmh/f;", "isCoalescedConnection$okhttp", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Exchange {

    @NotNull
    private final RealCall call;

    @NotNull
    private final ExchangeCodec codec;

    @NotNull
    private final RealConnection connection;

    @NotNull
    private final EventListener eventListener;

    @NotNull
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/Exchange$RequestBodySink;", "Lcom/applovin/shadow/okio/ForwardingSink;", "Lcom/applovin/shadow/okio/Sink;", "delegate", "", "contentLength", "<init>", "(Lmh/c;Lvh/j0;J)V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, EidRequestBuilder.REQUEST_FIELD_EMAIL, "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lcom/applovin/shadow/okio/Buffer;", "source", "byteCount", "", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "flush", "()V", "close", "J", "", "completed", "Z", "bytesReceived", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(@NotNull Exchange exchange, Sink delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j10;
        }

        private final <E extends IOException> E complete(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e10);
        }

        @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
        public void write(@NotNull Buffer source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.contentLength;
            if (j10 == -1 || this.bytesReceived + byteCount <= j10) {
                try {
                    super.write(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e10) {
                    throw complete(e10);
                }
            }
            throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/connection/Exchange$ResponseBodySource;", "Lcom/applovin/shadow/okio/ForwardingSource;", "Lcom/applovin/shadow/okio/Source;", "delegate", "", "contentLength", "<init>", "(Lmh/c;Lvh/l0;J)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "", "close", "()V", "Ljava/io/IOException;", ExifInterface.LONGITUDE_EAST, EidRequestBuilder.REQUEST_FIELD_EMAIL, "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "bytesReceived", "", "invokeStartEvent", "Z", "completed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(@NotNull Exchange exchange, Source delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j10;
            this.invokeStartEvent = true;
            if (j10 == 0) {
                complete(null);
            }
        }

        @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        public final <E extends IOException> E complete(E e10) {
            if (this.completed) {
                return e10;
            }
            this.completed = true;
            if (e10 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e10);
        }

        @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            try {
                long j10 = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                }
                if (j10 == -1) {
                    complete(null);
                    return -1L;
                }
                long j11 = this.bytesReceived + j10;
                long j12 = this.contentLength;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j11);
                }
                this.bytesReceived = j11;
                if (j11 == j12) {
                    complete(null);
                }
                return j10;
            } catch (IOException e10) {
                throw complete(e10);
            }
        }
    }

    public Exchange(@NotNull RealCall call, @NotNull EventListener eventListener, @NotNull ExchangeFinder finder, @NotNull ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException e10) {
        this.hasFailure = true;
        this.finder.trackFailure(e10);
        this.codec.getConnection().trackFailure$okhttp(this.call, e10);
    }

    public final <E extends IOException> E bodyComplete(long bytesRead, boolean responseDone, boolean requestDone, E e10) {
        if (e10 != null) {
            trackFailure(e10);
        }
        if (requestDone) {
            if (e10 != null) {
                this.eventListener.requestFailed(this.call, e10);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e10 != null) {
                this.eventListener.responseFailed(this.call, e10);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return (E) this.call.messageDone$okhttp(this, requestDone, responseDone, e10);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    @NotNull
    public final Sink createRequestBody(@NotNull Request request, boolean duplex) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = duplex;
        RequestBody requestBodyBody = request.body();
        Intrinsics.checkNotNull(requestBodyBody);
        long jContentLength = requestBodyBody.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    @NotNull
    /* JADX INFO: renamed from: getConnection$okhttp, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    @NotNull
    /* JADX INFO: renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.areEqual(this.finder.getAddress().url().host(), this.connection.getRoute().address().url().host());
    }

    /* JADX INFO: renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    @NotNull
    public final RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    @NotNull
    public final ResponseBody openResponseBody(@NotNull Response response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(strHeader$default, jReportedContentLength, Okio.buffer(new ResponseBodySource(this, this.codec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e10) {
            this.eventListener.responseFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    @Nullable
    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e10) {
            this.eventListener.responseFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    public final void responseHeadersEnd(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    @NotNull
    public final Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(@NotNull Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }
}
