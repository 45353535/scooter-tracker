package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;
    public final long seekTimeUs;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, Object obj, long j10, long j11, long j12, long j13) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j13);
        this.seekTimeUs = j12;
    }

    public final int getFirstSampleIndex(int i10) {
        return this.firstSampleIndices[i10];
    }

    protected final BaseMediaChunkOutput getOutput() {
        return this.output;
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
