package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(@IntRange(from = 1) long j10, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        this(0L, j10, f10);
    }

    private long getTimestampUsAfter(int i10) {
        long jRound = this.startPositionUs + Math.round(this.framesDurationUs * ((double) i10));
        Assertions.checkState(jRound >= 0);
        return jRound;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i10 = this.totalNumberOfFramesToAdd;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return getTimestampUsAfter(i10 - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i10 = this.framesAdded;
        this.framesAdded = i10 + 1;
        return getTimestampUsAfter(i10);
    }

    public ConstantRateTimestampIterator(@IntRange(from = 0) long j10, @IntRange(from = 1) long j11, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        boolean z10 = false;
        Assertions.checkArgument(j11 > 0);
        Assertions.checkArgument(f10 > 0.0f);
        if (0 <= j10 && j10 < j11) {
            z10 = true;
        }
        Assertions.checkArgument(z10);
        this.startPositionUs = j10;
        this.endPositionUs = j11;
        this.frameRate = f10;
        this.totalNumberOfFramesToAdd = Math.round(((j11 - j10) / 1000000.0f) * f10);
        this.framesDurationUs = 1000000.0f / f10;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }
}
