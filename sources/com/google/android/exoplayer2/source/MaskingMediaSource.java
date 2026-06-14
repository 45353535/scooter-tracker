package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final Timeline.Period period;
    private MaskingTimeline timeline;

    @Nullable
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;

    private static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object MASKING_EXTERNAL_PERIOD_UID = new Object();

        @Nullable
        private final Object replacedInternalPeriodUid;

        @Nullable
        private final Object replacedInternalWindowUid;

        private MaskingTimeline(Timeline timeline, @Nullable Object obj, @Nullable Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public static MaskingTimeline createWithPlaceholderTimeline(MediaItem mediaItem) {
            return new MaskingTimeline(new PlaceholderTimeline(mediaItem), Timeline.Window.SINGLE_WINDOW_UID, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static MaskingTimeline createWithRealTimeline(Timeline timeline, @Nullable Object obj, @Nullable Object obj2) {
            return new MaskingTimeline(timeline, obj, obj2);
        }

        public MaskingTimeline cloneWithUpdatedTimeline(Timeline timeline) {
            return new MaskingTimeline(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            Object obj2;
            Timeline timeline = this.timeline;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            this.timeline.getPeriod(i10, period, z10);
            if (Util.areEqual(period.uid, this.replacedInternalPeriodUid) && z10) {
                period.uid = MASKING_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i10) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i10);
            return Util.areEqual(uidOfPeriod, this.replacedInternalPeriodUid) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            this.timeline.getWindow(i10, window, j10);
            if (Util.areEqual(window.uid, this.replacedInternalWindowUid)) {
                window.uid = Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }
    }

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem mediaItem;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return obj == MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            period.set(z10 ? 0 : null, z10 ? MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID : null, 0, -9223372036854775807L, 0L, AdPlaybackState.NONE, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i10) {
            return MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z10) {
        super(mediaSource);
        this.useLazyPreparation = z10 && mediaSource.isSingleWindow();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline == null) {
            this.timeline = MaskingTimeline.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        } else {
            this.timeline = MaskingTimeline.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        }
    }

    private Object getExternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long j10) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.f25049id.periodUid);
        if (indexOfPeriod == -1) {
            return;
        }
        long j11 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j10);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    @Nullable
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline r15) {
        /*
            r14 = this;
            boolean r0 = r14.isPrepared
            if (r0 == 0) goto L19
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r0.cloneWithUpdatedTimeline(r15)
            r14.timeline = r15
            com.google.android.exoplayer2.source.MaskingMediaPeriod r15 = r14.unpreparedMaskingMediaPeriod
            if (r15 == 0) goto Lae
            long r0 = r15.getPreparePositionOverrideUs()
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r0)
            goto Lae
        L19:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L36
            boolean r0 = r14.hasRealTimeline
            if (r0 == 0) goto L2a
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r0.cloneWithUpdatedTimeline(r15)
            goto L32
        L2a:
            java.lang.Object r0 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            java.lang.Object r1 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r15, r0, r1)
        L32:
            r14.timeline = r15
            goto Lae
        L36:
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            r1 = 0
            r15.getWindow(r1, r0)
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            long r2 = r0.getDefaultPositionUs()
            com.google.android.exoplayer2.Timeline$Window r0 = r14.window
            java.lang.Object r0 = r0.uid
            com.google.android.exoplayer2.source.MaskingMediaPeriod r4 = r14.unpreparedMaskingMediaPeriod
            if (r4 == 0) goto L74
            long r4 = r4.getPreparePositionUs()
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r6 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaPeriod r7 = r14.unpreparedMaskingMediaPeriod
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r7.f25049id
            java.lang.Object r7 = r7.periodUid
            com.google.android.exoplayer2.Timeline$Period r8 = r14.period
            r6.getPeriodByUid(r7, r8)
            com.google.android.exoplayer2.Timeline$Period r6 = r14.period
            long r6 = r6.getPositionInWindowUs()
            long r6 = r6 + r4
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r4 = r14.timeline
            com.google.android.exoplayer2.Timeline$Window r5 = r14.window
            com.google.android.exoplayer2.Timeline$Window r1 = r4.getWindow(r1, r5)
            long r4 = r1.getDefaultPositionUs()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            com.google.android.exoplayer2.Timeline$Window r9 = r14.window
            com.google.android.exoplayer2.Timeline$Period r10 = r14.period
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.getPeriodPositionUs(r9, r10, r11, r12)
            java.lang.Object r1 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            boolean r15 = r14.hasRealTimeline
            if (r15 == 0) goto L94
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r14.timeline
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = r15.cloneWithUpdatedTimeline(r8)
            goto L98
        L94:
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r15 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(r8, r0, r1)
        L98:
            r14.timeline = r15
            com.google.android.exoplayer2.source.MaskingMediaPeriod r15 = r14.unpreparedMaskingMediaPeriod
            if (r15 == 0) goto Lae
            r14.setPreparePositionOverrideToUnpreparedMaskingPeriod(r2)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.f25049id
            java.lang.Object r0 = r15.periodUid
            java.lang.Object r0 = r14.getInternalPeriodUid(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r15 = r15.copyWithPeriodUid(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.hasRealTimeline = r0
            r14.isPrepared = r0
            com.google.android.exoplayer2.source.MaskingMediaSource$MaskingTimeline r0 = r14.timeline
            r14.refreshSourceInfo(r0)
            if (r15 == 0) goto Lc6
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = r14.unpreparedMaskingMediaPeriod
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.source.MaskingMediaPeriod r0 = (com.google.android.exoplayer2.source.MaskingMediaPeriod) r0
            r0.createPeriod(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.MaskingMediaSource.onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline):void");
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j10);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
            return maskingMediaPeriod;
        }
        this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
        if (!this.hasStartedPreparing) {
            this.hasStartedPreparing = true;
            prepareChildSource();
        }
        return maskingMediaPeriod;
    }
}
