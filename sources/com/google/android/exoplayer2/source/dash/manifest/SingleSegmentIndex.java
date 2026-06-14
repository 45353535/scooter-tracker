package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.source.dash.DashSegmentIndex;

/* JADX INFO: loaded from: classes7.dex */
final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri uri;

    public SingleSegmentIndex(RangedUri rangedUri) {
        this.uri = rangedUri;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j10, long j11) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getDurationUs(long j10, long j11) {
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentCount(long j10) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentNum(long j10, long j11) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public RangedUri getSegmentUrl(long j10) {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getTimeUs(long j10) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }
}
