package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: loaded from: classes10.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestampUs = -9223372036854775807L;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j10) {
        setFirstSampleTimestampUs(j10);
    }

    public static long ptsToUs(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long usToPts(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long adjustSampleTimestamp(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            this.lastSampleTimestampUs = j10;
        } else {
            long j11 = this.firstSampleTimestampUs;
            if (j11 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j11 - j10;
            }
            synchronized (this) {
                this.lastSampleTimestampUs = j10;
                notifyAll();
            }
        }
        return j10 + this.timestampOffsetUs;
    }

    public long adjustTsTimestamp(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            long jUsToPts = usToPts(this.lastSampleTimestampUs);
            long j11 = (4294967296L + jUsToPts) / MAX_PTS_PLUS_ONE;
            long j12 = ((j11 - 1) * MAX_PTS_PLUS_ONE) + j10;
            j10 += j11 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j12 - jUsToPts) < Math.abs(j10 - jUsToPts)) {
                j10 = j12;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j10));
    }

    public long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestampUs != -9223372036854775807L) {
            return this.lastSampleTimestampUs + this.timestampOffsetUs;
        }
        long j10 = this.firstSampleTimestampUs;
        if (j10 != Long.MAX_VALUE) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.lastSampleTimestampUs == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.timestampOffsetUs;
    }

    public void reset() {
        this.lastSampleTimestampUs = -9223372036854775807L;
    }

    public synchronized void setFirstSampleTimestampUs(long j10) {
        Assertions.checkState(this.lastSampleTimestampUs == -9223372036854775807L);
        this.firstSampleTimestampUs = j10;
    }

    public synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestampUs == -9223372036854775807L) {
            wait();
        }
    }
}
