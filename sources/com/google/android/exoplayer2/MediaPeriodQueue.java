package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes7.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final AnalyticsCollector analyticsCollector;
    private final HandlerWrapper analyticsCollectorHandler;
    private int length;

    @Nullable
    private MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;

    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;

    @Nullable
    private MediaPeriodHolder playing;

    @Nullable
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();

    public MediaPeriodQueue(AnalyticsCollector analyticsCollector, HandlerWrapper handlerWrapper) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
    }

    private boolean areDurationsCompatible(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.f24623id.equals(mediaPeriodInfo2.f24623id);
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long j10) {
        Timeline timeline2;
        Object obj;
        long j11;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j10;
        boolean z10 = false;
        if (!mediaPeriodInfo.isLastInTimelinePeriod) {
            MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f24623id;
            timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
            if (!mediaPeriodId.isAd()) {
                int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
                if (this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3) {
                    z10 = true;
                }
                if (firstAdIndexToPlay != this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) && !z10) {
                    return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
                }
                return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            int i10 = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i10);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i10, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i10, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            long jLongValue = mediaPeriodInfo.requestedContentPositionUs;
            if (jLongValue == -9223372036854775807L) {
                Timeline.Window window = this.window;
                Timeline.Period period = this.period;
                Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, -9223372036854775807L, Math.max(0L, rendererOffset));
                timeline2 = timeline;
                if (periodPositionUs == null) {
                    return null;
                }
                jLongValue = ((Long) periodPositionUs.second).longValue();
            } else {
                timeline2 = timeline;
            }
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, Math.max(getMinStartPositionAfterAdGroupUs(timeline2, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), jLongValue), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        long j12 = 0;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.f24623id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i11 = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        Object objCheckNotNull = Assertions.checkNotNull(this.period.uid);
        long j13 = mediaPeriodInfo.f24623id.windowSequenceNumber;
        if (timeline.getWindow(i11, this.window).firstPeriodIndex == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs2 = timeline.getPeriodPositionUs(this.window, this.period, i11, -9223372036854775807L, Math.max(0L, rendererOffset));
            if (periodPositionUs2 == null) {
                return null;
            }
            Object obj2 = periodPositionUs2.first;
            long jLongValue2 = ((Long) periodPositionUs2.second).longValue();
            MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next == null || !next.uid.equals(obj2)) {
                j13 = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + j13;
            } else {
                j13 = next.info.f24623id.windowSequenceNumber;
            }
            obj = obj2;
            j11 = jLongValue2;
            j12 = -9223372036854775807L;
        } else {
            obj = objCheckNotNull;
            j11 = 0;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j11, j13, this.window, this.period);
        if (j12 != -9223372036854775807L && mediaPeriodInfo.requestedContentPositionUs != -9223372036854775807L) {
            if (timeline.getPeriodByUid(mediaPeriodInfo.f24623id.periodUid, this.period).getAdGroupCount() > 0) {
                Timeline.Period period2 = this.period;
                if (period2.isServerSideInsertedAdGroup(period2.getRemovedAdGroupCount())) {
                    z10 = true;
                }
            }
            if (mediaPeriodIdResolveMediaPeriodIdForAds.isAd() && z10) {
                j12 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (z10) {
                j11 = mediaPeriodInfo.requestedContentPositionUs;
            }
        }
        return getMediaPeriodInfo(timeline, mediaPeriodIdResolveMediaPeriodIdForAds, j12, j11);
    }

    @Nullable
    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return mediaPeriodId.isAd() ? getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j10, mediaPeriodId.windowSequenceNumber) : getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j11, j10, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object obj, int i10, int i11, long j10, long j11) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i10, i11, j11);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i11 == this.period.getFirstAdIndexToPlay(i10) ? this.period.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
        if (adDurationUs != -9223372036854775807L && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new MediaPeriodInfo(mediaPeriodId, adResumePositionUs, j10, -9223372036854775807L, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfoForContent(com.google.android.exoplayer2.Timeline r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.exoplayer2.Timeline$Period r5 = r0.period
            r1.getPeriodByUid(r2, r5)
            com.google.android.exoplayer2.Timeline$Period r5 = r0.period
            int r5 = r5.getAdGroupIndexAfterPositionUs(r3)
            r6 = 1
            r7 = 0
            r8 = -1
            if (r5 != r8) goto L2e
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            int r9 = r9.getAdGroupCount()
            if (r9 <= 0) goto L4d
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            int r10 = r9.getRemovedAdGroupCount()
            boolean r9 = r9.isServerSideInsertedAdGroup(r10)
            if (r9 == 0) goto L4d
            r9 = r6
            goto L4e
        L2e:
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            boolean r9 = r9.isServerSideInsertedAdGroup(r5)
            if (r9 == 0) goto L4d
            com.google.android.exoplayer2.Timeline$Period r9 = r0.period
            long r9 = r9.getAdGroupTimeUs(r5)
            com.google.android.exoplayer2.Timeline$Period r11 = r0.period
            long r12 = r11.durationUs
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L4d
            boolean r9 = r11.hasPlayedAdGroup(r5)
            if (r9 == 0) goto L4d
            r9 = r6
            r5 = r8
            goto L4e
        L4d:
            r9 = r7
        L4e:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.isLastInPeriod(r11)
            boolean r22 = r0.isLastInWindow(r1, r11)
            boolean r23 = r0.isLastInTimeline(r1, r11, r2)
            if (r5 == r8) goto L6e
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            boolean r1 = r1.isServerSideInsertedAdGroup(r5)
            if (r1 == 0) goto L6e
            r20 = r6
            goto L70
        L6e:
            r20 = r7
        L70:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L80
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.getAdGroupTimeUs(r5)
        L7d:
            r16 = r14
            goto L89
        L80:
            if (r9 == 0) goto L87
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.durationUs
            goto L7d
        L87:
            r16 = r12
        L89:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L97
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L94
            goto L97
        L94:
            r18 = r16
            goto L9d
        L97:
            com.google.android.exoplayer2.Timeline$Period r1 = r0.period
            long r14 = r1.durationUs
            r18 = r14
        L9d:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto Lb4
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lb4
            if (r23 != 0) goto Lab
            if (r9 != 0) goto Laa
            goto Lab
        Laa:
            r6 = r7
        Lab:
            long r3 = (long) r6
            long r3 = r18 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lb4:
            r12 = r3
            com.google.android.exoplayer2.MediaPeriodInfo r10 = new com.google.android.exoplayer2.MediaPeriodInfo
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MediaPeriodQueue.getMediaPeriodInfoForContent(com.google.android.exoplayer2.Timeline, java.lang.Object, long, long, long):com.google.android.exoplayer2.MediaPeriodInfo");
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object obj, int i10) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i10);
        return adGroupTimeUs == Long.MIN_VALUE ? this.period.durationUs : adGroupTimeUs + this.period.getContentResumeOffsetUs(i10);
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, boolean z10) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z10;
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private void notifyQueueUpdate() {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            builder.add(next.info.f24623id);
        }
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        final MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? null : mediaPeriodHolder.info.f24623id;
        this.analyticsCollectorHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.a2
            @Override // java.lang.Runnable
            public final void run() {
                this.f24629b.analyticsCollector.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
            }
        });
    }

    private long resolvePeriodIndexToWindowSequenceNumber(Timeline timeline, Object obj) {
        int indexOfPeriod;
        int i10 = timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i10) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (MediaPeriodHolder next = this.playing; next != null; next = next.getNext()) {
            if (next.uid.equals(obj)) {
                return next.info.f24623id.windowSequenceNumber;
            }
        }
        for (MediaPeriodHolder next2 = this.playing; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(next2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i10) {
                return next2.info.f24623id.windowSequenceNumber;
            }
        }
        long j10 = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j10;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j10;
        }
        return j10;
    }

    private boolean updateForPlaybackModeChange(Timeline timeline) {
        Timeline timeline2;
        MediaPeriodHolder next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(next.uid);
        while (true) {
            timeline2 = timeline;
            indexOfPeriod = timeline2.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (next.getNext() != null && !next.info.isLastInTimelinePeriod) {
                next = next.getNext();
            }
            MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || timeline2.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
            timeline = timeline2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.info = getUpdatedMediaPeriodInfo(timeline2, next.info);
        return !zRemoveAfter;
    }

    @Nullable
    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i10 = this.length - 1;
        this.length = i10;
        if (i10 == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.info.f24623id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        Assertions.checkState((mediaPeriodHolder == null || mediaPeriodHolder.getNext() == null) ? false : true);
        this.reading = this.reading.getNext();
        notifyQueueUpdate();
        return this.reading;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        MediaPeriodHolder next = (MediaPeriodHolder) Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = next.uid;
        this.oldFrontPeriodWindowSequenceNumber = next.info.f24623id.windowSequenceNumber;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        MediaPeriodInfo mediaPeriodInfo2;
        long rendererOffset;
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder == null) {
            rendererOffset = 1000000000000L;
            mediaPeriodInfo2 = mediaPeriodInfo;
        } else {
            mediaPeriodInfo2 = mediaPeriodInfo;
            rendererOffset = (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo2.startPositionUs;
        }
        MediaPeriodHolder mediaPeriodHolder2 = new MediaPeriodHolder(rendererCapabilitiesArr, rendererOffset, trackSelector, allocator, mediaSourceList, mediaPeriodInfo2, trackSelectorResult);
        MediaPeriodHolder mediaPeriodHolder3 = this.loading;
        if (mediaPeriodHolder3 != null) {
            mediaPeriodHolder3.setNext(mediaPeriodHolder2);
        } else {
            this.playing = mediaPeriodHolder2;
            this.reading = mediaPeriodHolder2;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolder2;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolder2;
    }

    @Nullable
    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    @Nullable
    public MediaPeriodInfo getNextMediaPeriodInfo(long j10, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(playbackInfo.timeline, mediaPeriodHolder, j10);
    }

    @Nullable
    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    @Nullable
    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.MediaPeriodInfo getUpdatedMediaPeriodInfo(com.google.android.exoplayer2.Timeline r16, com.google.android.exoplayer2.MediaPeriodInfo r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r2.f24623id
            boolean r12 = r15.isLastInPeriod(r3)
            boolean r13 = r15.isLastInWindow(r1, r3)
            boolean r14 = r15.isLastInTimeline(r1, r3, r12)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r2.f24623id
            java.lang.Object r4 = r4.periodUid
            com.google.android.exoplayer2.Timeline$Period r5 = r15.period
            r1.getPeriodByUid(r4, r5)
            boolean r1 = r3.isAd()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L33
            int r1 = r3.nextAdGroupIndex
            if (r1 != r6) goto L2c
            goto L33
        L2c:
            com.google.android.exoplayer2.Timeline$Period r7 = r15.period
            long r7 = r7.getAdGroupTimeUs(r1)
            goto L34
        L33:
            r7 = r4
        L34:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L46
            com.google.android.exoplayer2.Timeline$Period r1 = r15.period
            int r4 = r3.adGroupIndex
            int r5 = r3.adIndexInAdGroup
            long r4 = r1.getAdDurationUs(r4, r5)
        L44:
            r9 = r4
            goto L5a
        L46:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L53
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L51
            goto L53
        L51:
            r9 = r7
            goto L5a
        L53:
            com.google.android.exoplayer2.Timeline$Period r1 = r15.period
            long r4 = r1.getDurationUs()
            goto L44
        L5a:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L6a
            com.google.android.exoplayer2.Timeline$Period r1 = r15.period
            int r4 = r3.adGroupIndex
            boolean r1 = r1.isServerSideInsertedAdGroup(r4)
        L68:
            r11 = r1
            goto L7a
        L6a:
            int r1 = r3.nextAdGroupIndex
            if (r1 == r6) goto L78
            com.google.android.exoplayer2.Timeline$Period r4 = r15.period
            boolean r1 = r4.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L78
            r1 = 1
            goto L68
        L78:
            r1 = 0
            goto L68
        L7a:
            com.google.android.exoplayer2.MediaPeriodInfo r1 = new com.google.android.exoplayer2.MediaPeriodInfo
            r5 = r3
            long r3 = r2.startPositionUs
            r16 = r1
            long r0 = r2.requestedContentPositionUs
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.MediaPeriodQueue.getUpdatedMediaPeriodInfo(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.MediaPeriodInfo):com.google.android.exoplayer2.MediaPeriodInfo");
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j10) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j10);
        }
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        boolean z10 = false;
        Assertions.checkState(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z10 = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        this.loading.setNext(null);
        notifyQueueUpdate();
        return z10;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j10) {
        return resolveMediaPeriodIdForAds(timeline, obj, j10, resolvePeriodIndexToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(Timeline timeline, Object obj, long j10) {
        long jResolvePeriodIndexToWindowSequenceNumber = resolvePeriodIndexToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z10 = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z11 = this.period.getAdGroupCount() > 0;
            z10 |= z11;
            Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = Assertions.checkNotNull(this.period.uid);
            }
            if (z10 && (!z11 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j10, jResolvePeriodIndexToWindowSequenceNumber, this.window, this.period);
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            return !mediaPeriodHolder.info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.info.durationUs != -9223372036854775807L && this.length < 100;
        }
        return true;
    }

    public boolean updateQueuedPeriods(Timeline timeline, long j10, long j11) {
        MediaPeriodInfo updatedMediaPeriodInfo;
        MediaPeriodHolder next = this.playing;
        MediaPeriodHolder mediaPeriodHolder = null;
        while (next != null) {
            MediaPeriodInfo mediaPeriodInfo = next.info;
            if (mediaPeriodHolder == null) {
                updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo);
            } else {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder, j10);
                if (followingMediaPeriodInfo == null) {
                    return !removeAfter(mediaPeriodHolder);
                }
                if (!canKeepMediaPeriodHolder(mediaPeriodInfo, followingMediaPeriodInfo)) {
                    return !removeAfter(mediaPeriodHolder);
                }
                updatedMediaPeriodInfo = followingMediaPeriodInfo;
            }
            next.info = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo.durationUs, updatedMediaPeriodInfo.durationUs)) {
                next.updateClipping();
                long j12 = updatedMediaPeriodInfo.durationUs;
                return (removeAfter(next) || (next == this.reading && !next.info.isFollowedByTransitionToSameStream && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(Timeline timeline, int i10) {
        this.repeatMode = i10;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(Timeline timeline, boolean z10) {
        this.shuffleModeEnabled = z10;
        return updateForPlaybackModeChange(timeline);
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object obj, long j10, long j11, Timeline.Window window, Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        while (period.durationUs == 0 && period.getAdGroupCount() > 0 && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()) && period.getAdGroupIndexForPositionUs(0L) == -1) {
            int i10 = indexOfPeriod + 1;
            if (indexOfPeriod >= window.lastPeriodIndex) {
                break;
            }
            timeline.getPeriod(i10, period, true);
            obj = Assertions.checkNotNull(period.uid);
            indexOfPeriod = i10;
        }
        timeline.getPeriodByUid(obj, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j10);
        if (adGroupIndexForPositionUs == -1) {
            return new MediaSource.MediaPeriodId(obj, j11, period.getAdGroupIndexAfterPositionUs(j10));
        }
        return new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j11);
    }
}
