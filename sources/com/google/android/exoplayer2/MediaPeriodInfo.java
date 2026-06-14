package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes7.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f24623id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        Assertions.checkArgument(!z13 || z11);
        Assertions.checkArgument(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        Assertions.checkArgument(z14);
        this.f24623id = mediaPeriodId;
        this.startPositionUs = j10;
        this.requestedContentPositionUs = j11;
        this.endPositionUs = j12;
        this.durationUs = j13;
        this.isFollowedByTransitionToSameStream = z10;
        this.isLastInTimelinePeriod = z11;
        this.isLastInTimelineWindow = z12;
        this.isFinal = z13;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j10) {
        return j10 == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.f24623id, this.startPositionUs, j10, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j10) {
        return j10 == this.startPositionUs ? this : new MediaPeriodInfo(this.f24623id, j10, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f24623id, mediaPeriodInfo.f24623id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f24623id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
