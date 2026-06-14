package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
public final class IndexSeekMap implements SeekMap {
    private final long durationUs;
    private final boolean isSeekable;
    private final long[] positions;
    private final long[] timesUs;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j10) {
        Assertions.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.isSeekable = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.positions = jArr;
            this.timesUs = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.positions = jArr3;
            long[] jArr4 = new long[i10];
            this.timesUs = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.durationUs = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        if (!this.isSeekable) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j10, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs == j10 || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i10 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i10], this.positions[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.isSeekable;
    }
}
