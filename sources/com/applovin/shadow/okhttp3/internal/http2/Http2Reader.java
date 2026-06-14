package com.applovin.shadow.okhttp3.internal.http2;

import androidx.collection.SieveCacheKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http2.Hpack;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "", "client", "<init>", "(Lvh/g;Z)V", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;", "handler", "", SessionDescription.ATTR_LENGTH, "flags", "streamId", "", "readHeaders", "(Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;III)V", "padding", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "readHeaderBlock", "(IIII)Ljava/util/List;", "readData", "readPriority", "(Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;I)V", "readRstStream", "readSettings", "readPushPromise", "readPing", "readGoAway", "readWindowUpdate", "readConnectionPreface", "(Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;)Z", "close", "()V", "Lcom/applovin/shadow/okio/BufferedSource;", "Z", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lcom/applovin/shadow/okhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lcom/applovin/shadow/okhttp3/internal/http2/Hpack$Reader;", y.f66058y, "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Reader implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Logger logger;
    private final boolean client;

    @NotNull
    private final ContinuationSource continuation;

    @NotNull
    private final Hpack.Reader hpackReader;

    @NotNull
    private final BufferedSource source;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", SessionDescription.ATTR_LENGTH, "flags", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "<init>", "(Lvh/g;)V", "", "readContinuationHeader", "()V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "close", "Lcom/applovin/shadow/okio/BufferedSource;", "", SessionDescription.ATTR_LENGTH, "I", "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", "left", "getLeft", "setLeft", "padding", "getPadding", "setPadding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContinuationSource implements Source, AutoCloseable {
        private int flags;
        private int left;
        private int length;
        private int padding;

        @NotNull
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(@NotNull BufferedSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i10 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.INSTANCE;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i11 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i11;
            if (iAnd == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 != 0) {
                    long j10 = this.source.read(sink, Math.min(byteCount, i10));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j10;
                    return j10;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i10) {
            this.flags = i10;
        }

        public final void setLeft(int i10) {
            this.left = i10;
        }

        public final void setLength(int i10) {
            this.length = i10;
        }

        public final void setPadding(int i10) {
            this.padding = i10;
        }

        public final void setStreamId(int i10) {
            this.streamId = i10;
        }

        @Override // com.applovin.shadow.okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.source.getTimeout();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH&J.\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J(\u0010#\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0011H&J&\u0010'\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u000eH&¨\u00060"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lcom/applovin/shadow/okio/ByteString;", "host", "port", "maxAge", "", "data", "inFinished", "", "source", "Lcom/applovin/shadow/okio/BufferedSource;", SessionDescription.ATTR_LENGTH, "goAway", "lastGoodStreamId", "errorCode", "Lcom/applovin/shadow/okhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lcom/applovin/shadow/okhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lcom/applovin/shadow/okhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, @NotNull String origin, @NotNull ByteString protocol, @NotNull String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, @NotNull BufferedSource source, int length) throws IOException;

        void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull ByteString debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) throws IOException;

        void rstStream(int streamId, @NotNull ErrorCode errorCode);

        void settings(boolean clearPrevious, @NotNull Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@NotNull BufferedSource source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.client = z10;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z10, streamId, this.source, INSTANCE.lengthWithoutPadding(length, flags, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = length - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i11);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i12 > 0) {
            byteString = this.source.readByteString(i12);
        }
        handler.goAway(i10, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.setLeft(length);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            readPriority(handler, streamId);
            length -= 5;
        }
        handler.headers(z10, streamId, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(length, flags, iAnd), iAnd, flags, streamId));
    }

    private final void readPing(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    private final void readPushPromise(Handler handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (flags & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(streamId, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(INSTANCE.lengthWithoutPadding(length - 4, flags, iAnd), iAnd, flags, streamId));
    }

    private final void readRstStream(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.INSTANCE.fromHttp2(i10);
        if (errorCodeFromHttp2 != null) {
            handler.rstStream(streamId, errorCodeFromHttp2);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    private final void readSettings(Handler handler, int length, int flags, int streamId) throws IOException {
        int i10;
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        Settings settings = new Settings();
        d dVarT = g.t(g.v(0, length), 6);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), 65535);
                i10 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i10 < 16384 || i10 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i10);
                if (iE == iF) {
                    break;
                } else {
                    iE += iG;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i10);
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long jAnd = Util.and(this.source.readInt(), SieveCacheKt.NodeLinkMask);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(streamId, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean requireSettings, @NotNull Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i10 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i10, medium, iAnd, iAnd2));
            }
            if (requireSettings && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i10);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i10);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i10);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i10);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i10);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i10);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i10);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i10);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i10);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (Intrinsics.areEqual(byteString, byteString2)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + byteString2.utf8());
    }

    private final void readPriority(Handler handler, int streamId) throws IOException {
        int i10 = this.source.readInt();
        handler.priority(streamId, i10 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }
}
