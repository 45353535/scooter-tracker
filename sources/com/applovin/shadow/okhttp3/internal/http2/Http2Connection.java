package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.http2.Http2Reader;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 »\u00012\u00020\u0001:\b¼\u0001»\u0001½\u0001¾\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010\u000fJ#\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010#J-\u0010(\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b&\u0010'J/\u0010,\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u00103\u001a\u00020.H\u0000¢\u0006\u0004\b4\u00101J\u001f\u00109\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001dH\u0000¢\u0006\u0004\b7\u00108J%\u0010=\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\r\u0010=\u001a\u00020\u0012¢\u0006\u0004\b=\u0010@J\r\u0010A\u001a\u00020\u0012¢\u0006\u0004\bA\u0010@J\r\u0010B\u001a\u00020\u0012¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020\u00122\u0006\u00103\u001a\u00020.¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0012H\u0016¢\u0006\u0004\bE\u0010@J)\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\bI\u0010JJ#\u0010N\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u000b2\b\b\u0002\u0010M\u001a\u00020LH\u0007¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u001d¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020\u0012H\u0000¢\u0006\u0004\bW\u0010@J\u0017\u0010[\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\bY\u0010ZJ%\u0010^\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\\\u0010]J-\u0010b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010_\u001a\u00020\u000bH\u0000¢\u0006\u0004\b`\u0010aJ/\u0010g\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010d\u001a\u00020c2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u000bH\u0000¢\u0006\u0004\be\u0010fJ\u001f\u0010i\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\bh\u00101R\u001a\u0010j\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010o\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR&\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001a\u0010y\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R$\u0010}\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b}\u0010~\u001a\u0004\b\u007f\u0010\u0016\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0082\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010~\u001a\u0005\b\u0083\u0001\u0010\u0016\"\u0006\b\u0084\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010kR\u0015\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0090\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0090\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0090\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0090\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0090\u0001R\u001c\u0010\u0097\u0001\u001a\u00020P8\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010\u009b\u0001\u001a\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u0098\u0001\u001a\u0006\b\u009c\u0001\u0010\u009a\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00020\u001d2\u0007\u0010\u009f\u0001\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010\u0090\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R*\u0010£\u0001\u001a\u00020\u001d2\u0007\u0010\u009f\u0001\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0090\u0001\u001a\u0006\b¤\u0001\u0010¢\u0001R*\u0010¥\u0001\u001a\u00020\u001d2\u0007\u0010\u009f\u0001\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u0090\u0001\u001a\u0006\b¦\u0001\u0010¢\u0001R*\u0010§\u0001\u001a\u00020\u001d2\u0007\u0010\u009f\u0001\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0090\u0001\u001a\u0006\b¨\u0001\u0010¢\u0001R \u0010ª\u0001\u001a\u00030©\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001d\u0010¯\u0001\u001a\u00030®\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R!\u0010´\u0001\u001a\u00070³\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001¨\u0006¿\u0001"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lph/f$a;)V", "", "associatedStreamId", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "requestHeaders", "", "out", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "newStream", "(ILjava/util/List;Z)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "Ljava/io/IOException;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "failConnection", "(Ljava/io/IOException;)V", "openStreamCount", "()I", "id", "getStream", "(I)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "removeStream", "", "read", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "pushStream", "(Ljava/util/List;Z)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "byteCount", "writeData", "(IZLcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "cause", "close$okhttp", "(Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;", "taskRunner", "start", "(ZLcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;)V", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lcom/applovin/shadow/okhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILcom/applovin/shadow/okio/BufferedSource;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "client", "Z", "getClient$okhttp", "()Z", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lph/f$c;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lcom/applovin/shadow/okhttp3/internal/http2/PushObserver;", "pushObserver", "Lcom/applovin/shadow/okhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "okHttpSettings", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lph/m;", "peerSettings", "getPeerSettings", "setPeerSettings", "(Lph/m;)V", "<set-?>", "readBytesTotal", "getReadBytesTotal", "()J", "readBytesAcknowledged", "getReadBytesAcknowledged", "writeBytesTotal", "getWriteBytesTotal", "writeBytesMaximum", "getWriteBytesMaximum", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Writer;", "writer", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Writer;", "getWriter", "()Lph/j;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lph/f$d;", "", "currentPushRequests", "Ljava/util/Set;", y.f66058y, "Builder", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Connection implements Closeable, AutoCloseable {
    public static final int AWAIT_PING = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @NotNull
    private final String connectionName;

    @NotNull
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @NotNull
    private final Listener listener;
    private int nextStreamId;

    @NotNull
    private final Settings okHttpSettings;

    @NotNull
    private Settings peerSettings;

    @NotNull
    private final PushObserver pushObserver;

    @NotNull
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @NotNull
    private final ReaderRunnable readerRunnable;

    @NotNull
    private final TaskQueue settingsListenerQueue;

    @NotNull
    private final Socket socket;

    @NotNull
    private final Map<Integer, Http2Stream> streams;

    @NotNull
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @NotNull
    private final Http2Writer writer;

    @NotNull
    private final TaskQueue writerQueue;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\r\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLlh/e;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "Lcom/applovin/shadow/okio/BufferedSink;", "sink", "(Ljava/net/Socket;Ljava/lang/String;Lcom/applovin/shadow/okio/BufferedSource;Lcom/applovin/shadow/okio/BufferedSink;)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "Lcom/applovin/shadow/okhttp3/internal/http2/PushObserver;", "pushObserver", "(Lcom/applovin/shadow/okhttp3/internal/http2/PushObserver;)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Builder;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "build", "()Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Llh/e;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lcom/applovin/shadow/okio/BufferedSource;", "getSource$okhttp", "()Lvh/g;", "setSource$okhttp", "(Lvh/g;)V", "Lcom/applovin/shadow/okio/BufferedSink;", "getSink$okhttp", "()Lvh/f;", "setSink$okhttp", "(Lvh/f;)V", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lph/f$c;", "setListener$okhttp", "(Lph/f$c;)V", "Lcom/applovin/shadow/okhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lph/l;", "setPushObserver$okhttp", "(Lph/l;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean client;
        public String connectionName;

        @NotNull
        private Listener listener;
        private int pingIntervalMillis;

        @NotNull
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;

        @NotNull
        private final TaskRunner taskRunner;

        public Builder(boolean z10, @NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i10 & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @NotNull
        /* JADX INFO: renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        @NotNull
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        @NotNull
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        @NotNull
        public final Builder listener(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.client = z10;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(@NotNull Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.pingIntervalMillis = i10;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver) {
            Intrinsics.checkNotNullParameter(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@NotNull BufferedSink bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(@NotNull Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(@NotNull BufferedSource bufferedSource) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source) throws IOException {
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source, @NotNull BufferedSink sink) throws IOException {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                str = Util.okHttpName + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            setConnectionName$okhttp(str);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "AWAIT_PING", "I", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lph/m;", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection;", "settings", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "onStream", "stream", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Stream;", y.f66058y, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Listener {

        @NotNull
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(@NotNull Http2Stream stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(@NotNull Http2Connection connection, @NotNull Settings settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(@NotNull Http2Stream stream) throws IOException;
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\tJ'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b8\u00109J?\u0010@\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lph/f;Lph/h;)V", "invoke", "()V", "", "inFinished", "", "streamId", "Lcom/applovin/shadow/okio/BufferedSource;", "source", SessionDescription.ATTR_LENGTH, "data", "(ZILcom/applovin/shadow/okio/BufferedSource;I)V", "associatedStreamId", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "settings", "(ZLcom/applovin/shadow/okhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lcom/applovin/shadow/okio/ByteString;", "debugData", "goAway", "(ILcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;Lcom/applovin/shadow/okio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;Lcom/applovin/shadow/okio/ByteString;Ljava/lang/String;IJ)V", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lph/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        @NotNull
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(@NotNull Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, @NotNull String origin, @NotNull ByteString protocol, @NotNull String host, int port, long maxAge) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(host, "host");
        }

        public final void applyAndAckSettings(boolean clearPrevious, @NotNull Settings settings) {
            long initialWindowSize;
            int i10;
            Http2Stream[] http2StreamArr;
            final boolean z10 = true;
            Intrinsics.checkNotNullParameter(settings, "settings");
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            final Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!clearPrevious) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        ref$ObjectRef.f93280b = settings;
                        initialWindowSize = ((long) settings.getInitialWindowSize()) - ((long) peerSettings.getInitialWindowSize());
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) ref$ObjectRef.f93280b);
                        TaskQueue taskQueue = http2Connection.settingsListenerQueue;
                        final String str = http2Connection.getConnectionName() + " onSettings";
                        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                http2Connection.getListener().onSettings(http2Connection, (Settings) ref$ObjectRef.f93280b);
                                return -1L;
                            }
                        }, 0L);
                        Unit unit = Unit.f93236a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) ref$ObjectRef.f93280b);
                } catch (IOException e10) {
                    http2Connection.failConnection(e10);
                }
                Unit unit2 = Unit.f93236a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        Unit unit3 = Unit.f93236a;
                    }
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean inFinished, int streamId, @NotNull BufferedSource source, int length) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            Http2Stream stream = this.this$0.getStream(streamId);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                long j10 = length;
                this.this$0.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull ByteString debugData) {
            int i10;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
                Unit unit = Unit.f93236a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<Header> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            final Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream != null) {
                    Unit unit = Unit.f93236a;
                    stream.receiveHeaders(Util.toHeaders(headerBlock), inFinished);
                    return;
                }
                if (http2Connection.isShutdown) {
                    return;
                }
                if (streamId <= http2Connection.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, Util.toHeaders(headerBlock));
                http2Connection.setLastGoodStreamId$okhttp(streamId);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
                TaskQueue taskQueueNewQueue = http2Connection.taskRunner.newQueue();
                final String str = http2Connection.getConnectionName() + '[' + streamId + "] onStream";
                final boolean z10 = true;
                taskQueueNewQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            http2Connection.getListener().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName(), 4, e10);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            invoke2();
            return Unit.f93236a;
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName() + " ping";
                final Http2Connection http2Connection = this.this$0;
                final boolean z10 = true;
                taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        http2Connection.writePing(true, payload1, payload2);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (payload1 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            http2Connection2.awaitPongsReceived++;
                            Intrinsics.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        Unit unit = Unit.f93236a;
                    } else {
                        http2Connection2.degradedPongsReceived++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) throws Throwable {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, @NotNull ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(streamId);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean clearPrevious, @NotNull final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName() + " applyAndAckSettings";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(clearPrevious, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // com.applovin.shadow.okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    Intrinsics.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    Unit unit = Unit.f93236a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                    Unit unit2 = Unit.f93236a;
                }
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2() throws Throwable {
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.close$okhttp(errorCode, errorCode, null);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    this.this$0.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                    Util.closeQuietly(this.reader);
                } catch (IOException e11) {
                    e = e11;
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    this.this$0.close$okhttp(errorCode2, errorCode2, e);
                    Util.closeQuietly(this.reader);
                }
            } catch (Throwable th3) {
                th = th3;
                this.this$0.close$okhttp(errorCode, errorCode, null);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            final String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new Task(str) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z10;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z10 = true;
                        } else {
                            this.intervalPingsSent++;
                            z10 = false;
                        }
                    }
                    if (z10) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(IOException e10) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, e10);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z10, TaskRunner taskRunner, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z10, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException cause) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    /* JADX INFO: renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @NotNull
    /* JADX INFO: renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* JADX INFO: renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    @NotNull
    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Nullable
    public final synchronized Http2Stream getStream(int id2) {
        return this.streams.get(Integer.valueOf(id2));
    }

    @NotNull
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (nowNs >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, out);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int streamId, @NotNull BufferedSource source, final int byteCount, final boolean inFinished) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        final Buffer buffer = new Buffer();
        long j10 = byteCount;
        source.require(j10);
        source.read(buffer, j10);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onData";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(streamId, buffer, byteCount, inFinished);
                    if (zOnData) {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !inFinished) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(streamId));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int streamId, @NotNull final List<Header> requestHeaders, final boolean inFinished) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onHeaders";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(streamId, requestHeaders, inFinished);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !inFinished) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int streamId, @NotNull final List<Header> requestHeaders) throws Throwable {
        Throwable th2;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                    this.currentPushRequests.add(Integer.valueOf(streamId));
                    TaskQueue taskQueue = this.pushQueue;
                    final String str = this.connectionName + '[' + streamId + "] onRequest";
                    final boolean z10 = true;
                    taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            if (!this.pushObserver.onRequest(streamId, requestHeaders)) {
                                return -1L;
                            }
                            try {
                                this.getWriter().rstStream(streamId, ErrorCode.CANCEL);
                                synchronized (this) {
                                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }, 0L);
                    return;
                }
                try {
                    writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
            throw th2;
        }
    }

    public final void pushResetLater$okhttp(final int streamId, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + streamId + "] onReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(streamId, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(streamId));
                    Unit unit = Unit.f93236a;
                }
                return -1L;
            }
        }, 0L);
    }

    @NotNull
    public final Http2Stream pushStream(int associatedStreamId, @NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(associatedStreamId, requestHeaders, out);
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @Nullable
    public final synchronized Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(streamId));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + ((long) DEGRADED_PONG_TIMEOUT_NS);
            Unit unit = Unit.f93236a;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z10 = true;
            taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.lastGoodStreamId = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.nextStreamId = i10;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@NotNull Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                Unit unit = Unit.f93236a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.writer) {
            t0 t0Var = new t0();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                t0Var.f93331b = i10;
                Unit unit = Unit.f93236a;
                this.writer.goAway(i10, statusCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long read) {
        long j10 = this.readBytesTotal + read;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = kotlin.Unit.f93236a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r9, boolean r10, @org.jetbrains.annotations.Nullable com.applovin.shadow.okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map<java.lang.Integer, com.applovin.shadow.okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r4 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http2.Http2Connection.writeData(int, boolean, com.applovin.shadow.okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, @NotNull List<Header> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (IOException e10) {
            failConnection(e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, @NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(final int streamId, @NotNull final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] writeSynReset";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.writeSynReset$okhttp(streamId, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + streamId + "] windowUpdate";
        final boolean z10 = true;
        taskQueue.schedule(new Task(str, z10) { // from class: com.applovin.shadow.okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    this.getWriter().windowUpdate(streamId, unacknowledgedBytesRead);
                    return -1L;
                } catch (IOException e10) {
                    this.failConnection(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    private final Http2Stream newStream(int associatedStreamId, List<Header> requestHeaders, boolean out) throws Throwable {
        Throwable th2;
        boolean z10 = true;
        boolean z11 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.isShutdown) {
                                    throw new ConnectionShutdownException();
                                }
                                int i10 = this.nextStreamId;
                                this.nextStreamId = i10 + 2;
                                Http2Stream http2Stream = new Http2Stream(i10, this, z11, false, null);
                                if (out && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                                    z10 = false;
                                }
                                if (http2Stream.isOpen()) {
                                    this.streams.put(Integer.valueOf(i10), http2Stream);
                                }
                                Unit unit = Unit.f93236a;
                                if (associatedStreamId == 0) {
                                    this.writer.headers(z11, i10, requestHeaders);
                                } else {
                                    if (this.client) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.writer.pushPromise(associatedStreamId, i10, requestHeaders);
                                }
                                if (z10) {
                                    this.writer.flush();
                                }
                                return http2Stream;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public final void start(boolean z10) throws IOException {
        start$default(this, z10, null, 2, null);
    }

    public final void start(boolean sendConnectionPreface, @NotNull TaskRunner taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.AnonymousClass1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
