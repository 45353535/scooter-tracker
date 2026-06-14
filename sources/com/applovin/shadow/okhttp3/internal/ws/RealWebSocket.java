package com.applovin.shadow.okhttp3.internal.ws;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.Callback;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.WebSocket;
import com.applovin.shadow.okhttp3.WebSocketListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketReader;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u0002:\n\u0083\u0001\u0082\u0001\u0084\u0001\u0085\u0001\u0086\u0001BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J!\u0010-\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b+\u0010,J\u001d\u00102\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001b¢\u0006\u0004\b4\u0010\u001dJ\r\u00105\u001a\u00020\u0012¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u001b¢\u0006\u0004\b<\u0010\u001dJ\r\u0010=\u001a\u00020\u0017¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0017¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00020\u0017¢\u0006\u0004\b@\u0010>J\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020.H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u0015H\u0016¢\u0006\u0004\bB\u0010EJ\u0017\u0010G\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010EJ\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u0015H\u0016¢\u0006\u0004\bH\u0010EJ\u001f\u0010K\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020.H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010A\u001a\u00020.H\u0016¢\u0006\u0004\b\u0019\u0010MJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010NJ\u0015\u0010O\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0015¢\u0006\u0004\bO\u0010NJ!\u0010P\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\bP\u0010QJ'\u0010P\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u00172\b\u0010J\u001a\u0004\u0018\u00010.2\u0006\u0010R\u001a\u00020\u000b¢\u0006\u0004\bP\u0010SJ\u000f\u0010U\u001a\u00020\u0012H\u0000¢\u0006\u0004\bT\u00106J\u000f\u0010W\u001a\u00020\u001bH\u0000¢\u0006\u0004\bV\u0010\u001dJ#\u0010[\u001a\u00020\u001b2\n\u0010Z\u001a\u00060Xj\u0002`Y2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b[\u0010\\R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010]R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010cR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0014\u0010d\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010s\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010eR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00150v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020y0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010bR\u0016\u0010{\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010eR\u0018\u0010\u0080\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|R\u0016\u0010=\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010~R\u0016\u0010?\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010~R\u0016\u0010@\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010~R\u0018\u0010\u0081\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|¨\u0006\u0087\u0001"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket;", "Lcom/applovin/shadow/okhttp3/WebSocket;", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lcom/applovin/shadow/okhttp3/Request;", "originalRequest", "Lcom/applovin/shadow/okhttp3/WebSocketListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "<init>", "(Llh/e;Lhh/z;Ljava/lang/Object;Ljava/util/Random;JLjava/lang/Object;J)V", "", "isValid", "(Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions;)Z", "Lcom/applovin/shadow/okio/ByteString;", "data", "", "formatOpcode", "send", "(Lcom/applovin/shadow/okio/ByteString;I)Z", "", "runWriter", "()V", "request", "()Lcom/applovin/shadow/okhttp3/Request;", "queueSize", "()J", MenuActionType.CANCEL, "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "client", "connect", "(Lcom/applovin/shadow/okhttp3/OkHttpClient;)V", "Lcom/applovin/shadow/okhttp3/Response;", "response", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lcom/applovin/shadow/okhttp3/Response;Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "(Ljava/lang/String;Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "processNextFrame", "()Z", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)V", "tearDown", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "bytes", "(Lcom/applovin/shadow/okio/ByteString;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "(Ljava/lang/String;)Z", "(Lcom/applovin/shadow/okio/ByteString;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "failWebSocket", "(Ljava/lang/Exception;Lcom/applovin/shadow/okhttp3/Response;)V", "Lcom/applovin/shadow/okhttp3/Request;", "Lcom/applovin/shadow/okhttp3/WebSocketListener;", "getListener$okhttp", "()Ljava/lang/Object;", "Ljava/util/Random;", "J", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketExtensions;", C4240b4.i.W, "Ljava/lang/String;", "Lcom/applovin/shadow/okhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/Call;", "Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "writerTask", "Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketReader;", "reader", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketReader;", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketWriter;", "writer", "Lcom/applovin/shadow/okhttp3/internal/ws/WebSocketWriter;", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", C4240b4.i.f42652t, "awaitingPong", y.f66058y, "Close", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;

    @Nullable
    private Call call;
    private boolean enqueuedClose;

    @Nullable
    private WebSocketExtensions extensions;
    private boolean failed;

    @NotNull
    private final String key;

    @NotNull
    private final WebSocketListener listener;

    @NotNull
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;

    @Nullable
    private String name;

    @NotNull
    private final Request originalRequest;
    private final long pingIntervalMillis;

    @NotNull
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;

    @NotNull
    private final Random random;

    @Nullable
    private WebSocketReader reader;
    private int receivedCloseCode;

    @Nullable
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;

    @Nullable
    private Streams streams;

    @NotNull
    private TaskQueue taskQueue;

    @Nullable
    private WebSocketWriter writer;

    @Nullable
    private Task writerTask;

    @NotNull
    private static final List<Protocol> ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lcom/applovin/shadow/okio/ByteString;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILvh/h;J)V", "I", "getCode", "()I", "Lcom/applovin/shadow/okio/ByteString;", "getReason", "()Lvh/h;", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @Nullable
        private final ByteString reason;

        public Close(int i10, @Nullable ByteString byteString, long j10) {
            this.code = i10;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final ByteString getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lcom/applovin/shadow/okio/ByteString;", "data", "<init>", "(ILvh/h;)V", "I", "getFormatOpcode", "()I", "Lcom/applovin/shadow/okio/ByteString;", "getData", "()Lvh/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {

        @NotNull
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i10, @NotNull ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = i10;
            this.data = data;
        }

        @NotNull
        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "<init>", "(ZLvh/g;Lvh/f;)V", "Z", "getClient", "()Z", "Lcom/applovin/shadow/okio/BufferedSource;", "getSource", "()Lvh/g;", "Lcom/applovin/shadow/okio/BufferedSink;", "getSink", "()Lvh/f;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements Closeable {
        private final boolean client;

        @NotNull
        private final BufferedSink sink;

        @NotNull
        private final BufferedSource source;

        public Streams(boolean z10, @NotNull BufferedSource source, @NotNull BufferedSink sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.client = z10;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final BufferedSink getSink() {
            return this.sink;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/ws/RealWebSocket$WriterTask;", "Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "<init>", "(Ljava/lang/Object;)V", "", "runOnce", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e10) {
                RealWebSocket.this.failWebSocket(e10, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request originalRequest, @NotNull WebSocketListener listener, @NotNull Random random, long j10, @Nullable WebSocketExtensions webSocketExtensions, long j11) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j10;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j11;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        ByteString.Companion companion = ByteString.INSTANCE;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f93236a;
        this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            return webSocketExtensions.serverMaxWindowBits == null || new IntRange(8, 15).k(webSocketExtensions.serverMaxWindowBits.intValue());
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void awaitTermination(long timeout, @NotNull TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(timeout, timeUnit);
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!StringsKt.N(HttpHeaders.UPGRADE, strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = Response.header$default(response, HttpHeaders.UPGRADE, null, 2, null);
        if (!StringsKt.N("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = Response.header$default(response, HttpHeaders.SEC_WEBSOCKET_ACCEPT, null, 2, null);
        String strBase64 = ByteString.INSTANCE.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (Intrinsics.areEqual(strBase64, strHeader$default3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader$default3 + '\'');
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    public boolean close(int code, @Nullable String reason) {
        return close(code, reason, 60000L);
    }

    public final void connect(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.originalRequest.header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS) != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header(HttpHeaders.UPGRADE, "websocket").header("Connection", HttpHeaders.UPGRADE).header(HttpHeaders.SEC_WEBSOCKET_KEY, this.key).header(HttpHeaders.SEC_WEBSOCKET_VERSION, net.pubnative.lite.sdk.models.Protocol.VAST_4_2).header(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: com.applovin.shadow.okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // com.applovin.shadow.okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                RealWebSocket.this.failWebSocket(e10, null);
            }

            @Override // com.applovin.shadow.okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) throws Throwable {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Exchange exchange = response.getExchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    Intrinsics.checkNotNull(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e10) {
                        RealWebSocket.this.failWebSocket(e10, null);
                    }
                } catch (IOException e11) {
                    RealWebSocket.this.failWebSocket(e11, response);
                    Util.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception e10, @Nullable Response response) {
        Intrinsics.checkNotNullParameter(e10, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            Unit unit = Unit.f93236a;
            try {
                this.listener.onFailure(this, e10, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String name, @NotNull Streams streams) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j10 = this.pingIntervalMillis;
                if (j10 != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                        final String str = name + " ping";
                        this.taskQueue.schedule(new Task(str) { // from class: com.applovin.shadow.okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.writePingFrame$okhttp();
                                return nanos;
                            }
                        }, nanos);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                Unit unit = Unit.f93236a;
                this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, @NotNull String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (code == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.receivedCloseCode != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.receivedCloseCode = code;
                this.receivedCloseReason = reason;
                streams = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    Streams streams2 = this.streams;
                    this.streams = null;
                    webSocketReader = this.reader;
                    this.reader = null;
                    webSocketWriter = this.writer;
                    this.writer = null;
                    this.taskQueue.shutdown();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.listener.onClosing(this, code, reason);
            if (streams != null) {
                this.listener.onClosed(this, code, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // com.applovin.shadow.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull ByteString payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull ByteString payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e10) {
            failWebSocket(e10, null);
            return false;
        }
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    @NotNull
    /* JADX INFO: renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    public boolean send(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return send(ByteString.INSTANCE.encodeUtf8(text), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i10;
        Streams streams;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                ByteString byteStringPoll = this.pongQueue.poll();
                final boolean z10 = true;
                Object obj = null;
                if (byteStringPoll == null) {
                    Object objPoll = this.messageAndCloseQueue.poll();
                    if (objPoll instanceof Close) {
                        i10 = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i10 != -1) {
                            streams = this.streams;
                            this.streams = null;
                            webSocketReader = this.reader;
                            this.reader = null;
                            webSocketWriter = this.writer;
                            this.writer = null;
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue taskQueue = this.taskQueue;
                            final String str2 = this.name + " cancel";
                            taskQueue.schedule(new Task(str2, z10) { // from class: com.applovin.shadow.okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.cancel();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i10 = -1;
                        streams = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i10 = -1;
                    streams = null;
                }
                Unit unit = Unit.f93236a;
                try {
                    if (byteStringPoll != null) {
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writePong(byteStringPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= (long) message.getData().size();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        Intrinsics.checkNotNull(webSocketWriter2);
                        webSocketWriter2.writeClose(close.getCode(), close.getReason());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.listener;
                            Intrinsics.checkNotNull(str);
                            webSocketListener.onClosed(this, i10, str);
                        }
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.closeQuietly(streams);
                    }
                    if (webSocketReader != null) {
                        Util.closeQuietly(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i10 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                Unit unit = Unit.f93236a;
                if (i10 == -1) {
                    try {
                        webSocketWriter.writePing(ByteString.EMPTY);
                        return;
                    } catch (IOException e10) {
                        failWebSocket(e10, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i10 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean close(int code, @Nullable String reason, long cancelAfterCloseMillis) {
        ByteString byteStringEncodeUtf8;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                byteStringEncodeUtf8 = ByteString.INSTANCE.encodeUtf8(reason);
                if (byteStringEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
                }
            } else {
                byteStringEncodeUtf8 = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(code, byteStringEncodeUtf8, cancelAfterCloseMillis));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.applovin.shadow.okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // com.applovin.shadow.okhttp3.WebSocket
    public boolean send(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(ByteString data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) data.size()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) data.size();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }
}
