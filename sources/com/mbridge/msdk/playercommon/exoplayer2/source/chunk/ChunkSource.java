package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface ChunkSource {
    long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    void getNextChunk(MediaChunk mediaChunk, long j10, long j11, ChunkHolder chunkHolder);

    int getPreferredQueueSize(long j10, List<? extends MediaChunk> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(Chunk chunk);

    boolean onChunkLoadError(Chunk chunk, boolean z10, Exception exc);
}
