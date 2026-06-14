package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i10 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i10 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i10] = sampleQueueArr[i10].getWriteIndex();
            i10++;
        }
    }

    public void setSampleOffsetUs(long j10) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i12 >= iArr.length) {
                Log.e(TAG, "Unmatched track of type: " + i11);
                return new DummyTrackOutput();
            }
            if (i11 == iArr[i12]) {
                return this.sampleQueues[i12];
            }
            i12++;
        }
    }
}
