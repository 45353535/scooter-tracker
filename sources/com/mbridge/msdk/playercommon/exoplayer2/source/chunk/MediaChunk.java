package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, long j10, long j11, long j12) {
        super(dataSource, dataSpec, 1, format, i10, obj, j10, j11);
        Assertions.checkNotNull(format);
        this.chunkIndex = j12;
    }

    public long getNextChunkIndex() {
        long j10 = this.chunkIndex;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
