package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ChunkSource {
    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    void getNextChunk(long j10, long j11, List<? extends MediaChunk> list, ChunkHolder chunkHolder);

    int getPreferredQueueSize(long j10, List<? extends MediaChunk> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(Chunk chunk);

    boolean onChunkLoadError(Chunk chunk, boolean z10, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    void release();

    boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list);
}
