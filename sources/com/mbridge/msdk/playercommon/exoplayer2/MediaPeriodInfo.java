package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;

/* JADX INFO: loaded from: classes10.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f50055id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f50055id = mediaPeriodId;
        this.startPositionUs = j10;
        this.endPositionUs = j11;
        this.contentPositionUs = j12;
        this.durationUs = j13;
        this.isLastInTimelinePeriod = z10;
        this.isFinal = z11;
    }

    public MediaPeriodInfo copyWithPeriodIndex(int i10) {
        return new MediaPeriodInfo(this.f50055id.copyWithPeriodIndex(i10), this.startPositionUs, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j10) {
        return new MediaPeriodInfo(this.f50055id, j10, this.endPositionUs, this.contentPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }
}
