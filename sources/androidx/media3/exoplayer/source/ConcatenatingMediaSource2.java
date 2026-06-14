package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;

    @GuardedBy("this")
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final ImmutableList<MediaSourceHolder> mediaSourceHolders;

    @Nullable
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    public static final class Builder {
        private int index;

        @Nullable
        private MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;
        private final ImmutableList.Builder<MediaSourceHolder> mediaSourceHoldersBuilder = ImmutableList.builder();

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, -9223372036854775807L);
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.build());
        }

        @CanIgnoreReturnValue
        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        @CanIgnoreReturnValue
        public Builder add(MediaItem mediaItem, long j10) {
            Assertions.checkNotNull(mediaItem);
            if (j10 == -9223372036854775807L) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j10 = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j10);
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }

        @CanIgnoreReturnValue
        public Builder add(MediaSource mediaSource, long j10) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j10 == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            ImmutableList.Builder<MediaSourceHolder> builder = this.mediaSourceHoldersBuilder;
            int i10 = this.index;
            this.index = i10 + 1;
            builder.add(new MediaSourceHolder(mediaSource, i10, Util.msToUs(j10)));
            return this;
        }
    }

    private static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final ImmutableList<Integer> firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final Object manifest;
        private final MediaItem mediaItem;
        private final ImmutableList<Long> periodOffsetsInWindowUs;
        private final ImmutableList<Timeline> timelines;

        public ConcatenatedTimeline(MediaItem mediaItem, ImmutableList<Timeline> immutableList, ImmutableList<Integer> immutableList2, ImmutableList<Long> immutableList3, boolean z10, boolean z11, long j10, long j11, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = immutableList;
            this.firstPeriodIndices = immutableList2;
            this.periodOffsetsInWindowUs = immutableList3;
            this.isSeekable = z10;
            this.isDynamic = z11;
            this.durationUs = j10;
            this.defaultPositionUs = j11;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i10) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i10 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i10) {
            if (period.durationUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i10 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : this.periodOffsetsInWindowUs.get(i10 + 1).longValue()) - this.periodOffsetsInWindowUs.get(i10).longValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = this.timelines.get(childIndex).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return this.firstPeriodIndices.get(childIndex).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            this.timelines.get(childIndexByPeriodIndex).getPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue(), period, z10);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(i10).longValue();
            period.durationUs = getPeriodDurationUs(period, i10);
            if (z10) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = this.timelines.get(childIndex);
            int iIntValue = this.firstPeriodIndices.get(childIndex).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = this.periodOffsetsInWindowUs.get(iIntValue).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i10) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i10);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, this.timelines.get(childIndexByPeriodIndex).getUidOfPeriod(i10 - this.firstPeriodIndices.get(childIndexByPeriodIndex).intValue()));
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -this.periodOffsetsInWindowUs.get(0).longValue());
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i10, long j10) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i10;
            this.initialPlaceholderDurationUs = j10;
        }
    }

    private void disableUnusedMediaSources() {
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i10);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j10, int i10) {
        return (int) (j10 % ((long) i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j10, int i10, int i11) {
        return (j10 * ((long) i10)) + ((long) i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i10, Object obj) {
        return Pair.create(Integer.valueOf(i10), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j10, int i10) {
        return j10 / ((long) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @Nullable
    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        ImmutableList.Builder builder;
        ImmutableList.Builder builder2;
        int i10;
        long j10;
        long j11;
        Timeline.Window window;
        boolean z10;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        ImmutableList.Builder builder3 = ImmutableList.builder();
        ImmutableList.Builder builder4 = ImmutableList.builder();
        ImmutableList.Builder builder5 = ImmutableList.builder();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        int i11 = 0;
        Object obj = null;
        int periodCount = 0;
        boolean z14 = false;
        boolean z15 = false;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (i11 < size) {
            MediaSourceHolder mediaSourceHolder = concatenatingMediaSource2.mediaSourceHolders.get(i11);
            Timeline timeline = mediaSourceHolder.mediaSource.getTimeline();
            Assertions.checkArgument(timeline.isEmpty() ^ z11, "Can't concatenate empty child Timeline.");
            builder3.add(timeline);
            builder4.add(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i12 = 0;
            while (i12 < timeline.getWindowCount()) {
                timeline.getWindow(i12, window2);
                if (!z14) {
                    z14 = z11;
                    obj = window2.manifest;
                }
                z12 = (z12 && Util.areEqual(obj, window2.manifest)) ? z11 : false;
                Timeline timeline2 = timeline;
                long j15 = window2.durationUs;
                if (j15 == -9223372036854775807L) {
                    j15 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j15 == -9223372036854775807L) {
                        return null;
                    }
                }
                j12 += j15;
                if (mediaSourceHolder.index == 0 && i12 == 0) {
                    builder = builder3;
                    builder2 = builder4;
                    j13 = window2.defaultPositionUs;
                    j14 = -window2.positionInFirstPeriodUs;
                } else {
                    builder = builder3;
                    builder2 = builder4;
                }
                z13 &= window2.isSeekable || window2.isPlaceholder;
                z15 |= window2.isDynamic;
                int i13 = window2.firstPeriodIndex;
                while (i13 <= window2.lastPeriodIndex) {
                    builder5.add(Long.valueOf(j14));
                    Timeline timeline3 = timeline2;
                    timeline3.getPeriod(i13, period, true);
                    ImmutableList.Builder builder6 = builder5;
                    long j16 = period.durationUs;
                    if (j16 == -9223372036854775807L) {
                        Assertions.checkArgument(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j16 = window2.positionInFirstPeriodUs + j15;
                    }
                    if (i13 != window2.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i12 == 0) || j16 == -9223372036854775807L)) {
                        i10 = i13;
                        j10 = j16;
                        j11 = 0;
                    } else {
                        i10 = i13;
                        j11 = -window2.positionInFirstPeriodUs;
                        j10 = j16 + j11;
                    }
                    Object objCheckNotNull = Assertions.checkNotNull(period.uid);
                    int i14 = i10;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(objCheckNotNull)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(objCheckNotNull).equals(Long.valueOf(j11))) {
                            z10 = false;
                        }
                        Assertions.checkArgument(z10, "Can't handle windows with changing offset in first period.");
                        mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j11));
                        j14 += j10;
                        i13 = i14 + 1;
                        builder5 = builder6;
                        timeline2 = timeline3;
                        window2 = window;
                    }
                    z10 = true;
                    Assertions.checkArgument(z10, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j11));
                    j14 += j10;
                    i13 = i14 + 1;
                    builder5 = builder6;
                    timeline2 = timeline3;
                    window2 = window;
                }
                i12++;
                builder3 = builder;
                builder4 = builder2;
                timeline = timeline2;
                z11 = true;
            }
            i11++;
            concatenatingMediaSource2 = this;
            z11 = true;
        }
        return new ConcatenatedTimeline(getMediaItem(), builder3.build(), builder4.build(), builder5.build(), z13, z15, j12, j13, z12 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        long jLongValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(mediaSourceHolder.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid))).longValue();
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j10 - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i10) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.d
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f5155b.handleMessage(message);
            }
        });
        for (int i10 = 0; i10 < this.mediaSourceHolders.size(); i10++) {
            prepareChildSource(Integer.valueOf(i10), this.mediaSourceHolders.get(i10).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource, androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, ImmutableList<MediaSourceHolder> immutableList) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = immutableList;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l10;
        return (j10 == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l10 = this.mediaSourceHolders.get(num.intValue()).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j10 : j10 + Util.usToMs(l10.longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }
}
