package com.google.android.exoplayer2.source.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting(otherwise = 3)
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.checkState(timeline.getPeriodCount() == 1);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        this.timeline.getPeriod(i10, period, z10);
        long j10 = period.durationUs;
        if (j10 == -9223372036854775807L) {
            j10 = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.f24625id, period.uid, period.windowIndex, j10, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }
}
