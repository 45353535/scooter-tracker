package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"com/applovin/shadow/okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "Lcom/applovin/shadow/okio/Source;", "cacheRequestClosed", "", "close", "", "read", "", "sink", "Lcom/applovin/shadow/okio/Buffer;", "byteCount", "timeout", "Lcom/applovin/shadow/okio/Timeout;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements Source, AutoCloseable {
    final /* synthetic */ BufferedSink $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ BufferedSource $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.$source = bufferedSource;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = bufferedSink;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long j10 = this.$source.read(sink, byteCount);
            if (j10 != -1) {
                sink.copyTo(this.$cacheBody.getBuffer(), sink.size() - j10, j10);
                this.$cacheBody.emitCompleteSegments();
                return j10;
            }
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheBody.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.cacheRequestClosed) {
                throw e10;
            }
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
            throw e10;
        }
    }

    @Override // com.applovin.shadow.okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.$source.getTimeout();
    }
}
