package com.applovin.shadow.okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okhttp3.internal.http1.HeadersReader;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/applovin/shadow/okhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okhttp3/ResponseBody;", "response", "<init>", "(Lhh/c0;)V", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "", "boundary", "(Lvh/g;Ljava/lang/String;)V", "", "maxResult", "currentPartBytesRemaining", "(J)J", "Lcom/applovin/shadow/okhttp3/MultipartReader$Part;", "nextPart", "()Lcom/applovin/shadow/okhttp3/MultipartReader$Part;", "", "close", "()V", "Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/applovin/shadow/okio/ByteString;", "dashDashBoundary", "Lcom/applovin/shadow/okio/ByteString;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lcom/applovin/shadow/okhttp3/MultipartReader$PartSource;", "currentPart", "Lcom/applovin/shadow/okhttp3/MultipartReader$PartSource;", y.f66058y, "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Options afterBoundaryOptions;

    @NotNull
    private final String boundary;
    private boolean closed;

    @NotNull
    private final ByteString crlfDashDashBoundary;

    @Nullable
    private PartSource currentPart;

    @NotNull
    private final ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @NotNull
    private final BufferedSource source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/applovin/shadow/okhttp3/MultipartReader$Companion;", "", "<init>", "()V", "Lcom/applovin/shadow/okio/Options;", "afterBoundaryOptions", "Lcom/applovin/shadow/okio/Options;", "getAfterBoundaryOptions", "()Lvh/a0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Options getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okhttp3/Headers;", "headers", "Lcom/applovin/shadow/okio/BufferedSource;", "body", "<init>", "(Lhh/t;Lvh/g;)V", "", "close", "()V", "Lcom/applovin/shadow/okhttp3/Headers;", "()Lhh/t;", "Lcom/applovin/shadow/okio/BufferedSource;", "()Lvh/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements Closeable, AutoCloseable {

        @NotNull
        private final BufferedSource body;

        @NotNull
        private final Headers headers;

        public Part(@NotNull Headers headers, @NotNull BufferedSource body) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @NotNull
        /* JADX INFO: renamed from: body, reason: from getter */
        public final BufferedSource getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        @NotNull
        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/applovin/shadow/okhttp3/MultipartReader$PartSource;", "Lcom/applovin/shadow/okio/Source;", "<init>", "(Ljava/lang/Object;)V", "", "close", "()V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "Lcom/applovin/shadow/okio/Timeout;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PartSource implements Source, AutoCloseable {

        @NotNull
        private final Timeout timeout = new Timeout();

        public PartSource() {
        }

        @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // com.applovin.shadow.okio.Source
        public long read(@NotNull Buffer sink, long byteCount) {
            long j10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            Timeout timeout = MultipartReader.this.source.getTimeout();
            Timeout timeout2 = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long timeoutNanos = timeout.getTimeoutNanos();
            long jMinTimeout = Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(jMinTimeout, timeUnit);
            if (!timeout.getHasDeadline()) {
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    long j11 = jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (timeout2.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return j11;
                } catch (Throwable th2) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th2;
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                j10 = 0;
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            } else {
                j10 = 0;
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                long j12 = jCurrentPartBytesRemaining2 == j10 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                return j12;
            } catch (Throwable th3) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
                throw th3;
            }
        }

        @Override // com.applovin.shadow.okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        afterBoundaryOptions = companion.of(companion2.encodeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS), companion2.encodeUtf8("--"), companion2.encodeUtf8(" "), companion2.encodeUtf8("\t"));
    }

    public MultipartReader(@NotNull BufferedSource source, @NotNull String boundary) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxResult) throws IOException {
        this.source.require(this.crlfDashDashBoundary.size());
        long jIndexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        return jIndexOf == -1 ? Math.min(maxResult, (this.source.getBuffer().size() - ((long) this.crlfDashDashBoundary.size())) + 1) : Math.min(maxResult, jIndexOf);
    }

    @NotNull
    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Nullable
    public final Part nextPart() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.skip(jCurrentPartBytesRemaining);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z10 = false;
        while (true) {
            int iSelect = this.source.select(afterBoundaryOptions);
            if (iSelect == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iSelect == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, Okio.buffer(partSource));
            }
            if (iSelect == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iSelect == 2 || iSelect == 3) {
                z10 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(@NotNull ResponseBody response) throws IOException {
        String strParameter;
        Intrinsics.checkNotNullParameter(response, "response");
        BufferedSource bodySource = response.getBodySource();
        MediaType mediaType = response.get$contentType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(bodySource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
