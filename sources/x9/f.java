package x9;

import y9.i;

/* JADX INFO: loaded from: classes12.dex */
public interface f {
    long getAvailableSegmentCount(long j10, long j11);

    long getDurationUs(long j10, long j11);

    long getFirstAvailableSegmentNum(long j10, long j11);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j10, long j11);

    long getSegmentCount(long j10);

    long getSegmentNum(long j10, long j11);

    i getSegmentUrl(long j10);

    long getTimeUs(long j10);

    boolean isExplicit();
}
