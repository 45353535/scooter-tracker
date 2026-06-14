package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uri;

    public LoadEventInfo(long j10, DataSpec dataSpec, long j11) {
        this(j10, dataSpec, dataSpec.uri, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo(long j10, DataSpec dataSpec, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.loadTaskId = j10;
        this.dataSpec = dataSpec;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j11;
        this.loadDurationMs = j12;
        this.bytesLoaded = j13;
    }
}
