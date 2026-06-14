package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    private static final class MediaPeriodQueueTracker {

        @Nullable
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue = ImmutableList.of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelines = ImmutableMap.of();
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
        }

        private void addTimelineForMediaPeriodId(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                builder.put(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.put(mediaPeriodId, timeline2);
            }
        }

        @Nullable
        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, ImmutableList<MediaSource.MediaPeriodId> immutableList, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = immutableList.get(i10);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object obj, boolean z10, int i10, int i11, int i12) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z10 && mediaPeriodId.adGroupIndex == i10 && mediaPeriodId.adIndexInAdGroup == i11) {
                return true;
            }
            return !z10 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i12;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder = ImmutableMap.builder();
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(builder, this.playingMediaPeriod, timeline);
                if (!Objects.equal(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equal(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equal(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i10 = 0; i10 < this.mediaPeriodQueue.size(); i10++) {
                    addTimelineForMediaPeriodId(builder, this.mediaPeriodQueue.get(i10), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(builder, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = builder.buildOrThrow();
        }

        @Nullable
        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) Iterables.getLast(this.mediaPeriodQueue);
        }

        @Nullable
        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        @Nullable
        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        @Nullable
        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                this.readingMediaPeriod = (MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId);
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        this.clock = (Clock) Assertions.checkNotNull(clock);
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.m0
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                DefaultAnalyticsCollector.g((AnalyticsListener) obj, flagSet);
            }
        });
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    public static /* synthetic */ void A(AnalyticsListener.EventTime eventTime, int i10, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i10);
    }

    public static /* synthetic */ void L(AnalyticsListener.EventTime eventTime, boolean z10, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z10);
        analyticsListener.onIsLoadingChanged(eventTime, z10);
    }

    public static /* synthetic */ void M(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    public static /* synthetic */ void a0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 1, decoderCounters);
    }

    public static /* synthetic */ void b(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 1, decoderCounters);
    }

    public static /* synthetic */ void d0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format);
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 1, format);
    }

    public static /* synthetic */ void e0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format);
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 2, format);
    }

    public static /* synthetic */ void g(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i10, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i10 >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i10, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(@Nullable PlaybackException playbackException) {
        MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(new MediaSource.MediaPeriodId(mediaPeriodId));
    }

    public static /* synthetic */ void i(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 2, decoderCounters);
    }

    public static /* synthetic */ void j0(AnalyticsListener.EventTime eventTime, int i10, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i10);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i10);
    }

    public static /* synthetic */ void m0(AnalyticsListener.EventTime eventTime, String str, long j10, long j11, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j10);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j11, j10);
        analyticsListener.onDecoderInitialized(eventTime, 1, str, j10);
    }

    public static /* synthetic */ void n0(AnalyticsListener.EventTime eventTime, String str, long j10, long j11, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j10);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j11, j10);
        analyticsListener.onDecoderInitialized(eventTime, 2, str, j10);
    }

    public static /* synthetic */ void p(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 2, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1028, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.z
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
        this.listeners.release();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @CallSuper
    public void addListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.listeners.add(analyticsListener);
    }

    protected final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    protected final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean z10 = timeline.equals(this.player.getCurrentTimeline()) && i10 == this.player.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z10) {
                defaultPositionMs = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(i10, this.window).getDefaultPositionMs();
            }
        } else if (z10 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            defaultPositionMs = this.player.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i10, mediaPeriodId2, defaultPositionMs, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.s
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekStarted(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.g
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1029, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.i
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(final String str, final long j10, final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.m
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.m0(eventTimeGenerateReadingMediaPeriodEventTime, str, j11, j10, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1012, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.p0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1013, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.o0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.b(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1007, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.f1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.a0(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1009, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.k
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.d0(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(final long j10) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1010, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.r0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(eventTimeGenerateReadingMediaPeriodEventTime, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAudioSessionIdChanged(final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.t
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(eventTimeGenerateReadingMediaPeriodEventTime, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioSinkError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1014, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.z0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioUnderrun(final int i10, final long j10, final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1011, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.l
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(eventTimeGenerateReadingMediaPeriodEventTime, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onAvailableCommandsChanged(final Player.Commands commands) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.f0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAvailableCommandsChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int i10, final long j10, final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, 1006, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.i0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(eventTimeGenerateLoadingMediaPeriodEventTime, i10, j10, j11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final List<Cue> list) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.u0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, (List<Cue>) list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.k1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceInfoChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.l1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDeviceVolumeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.w
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1023, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.l0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1026, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.p1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1025, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.j1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.drm.j.d(this, i10, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.c1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(eventTimeGenerateMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1027, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.s0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(eventTimeGenerateMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(final int i10, final long j10) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1018, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.w0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(eventTimeGeneratePlayingMediaPeriodEventTime, i10, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.q1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.L(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z10, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.f
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.s1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.q
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.b0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.e1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(final long j10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.o1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(@Nullable final MediaItem mediaItem, final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.d0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.n
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.m1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.x
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.p
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.j0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.y0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.c0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerErrorChanged(@Nullable final PlaybackException playbackException) {
        final AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.x0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerErrorChanged(eventTimeForErrorEvent, playbackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.r
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaylistMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.y
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRepeatModeChanged(final int i10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.q0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekBackIncrementChanged(final long j10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.c
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onSeekForwardIncrementChanged(final long j10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.b
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSeekProcessed() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.v
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekProcessed(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onShuffleModeEnabledChanged(final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.j
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.e
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(eventTimeGenerateReadingMediaPeriodEventTime, z10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.a0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i10, i11);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(Timeline timeline, final int i10) {
        this.mediaPeriodQueueTracker.onTimelineChanged((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.g1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTrackSelectionParametersChanged(final TrackSelectionParameters trackSelectionParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.n0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onTracksChanged(final Tracks tracks) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.v0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1005, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.b1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(eventTimeGenerateMediaPeriodEventTime, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoCodecError(final Exception exc) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1030, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.h
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoCodecError(eventTimeGenerateReadingMediaPeriodEventTime, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(final String str, final long j10, final long j11) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1016, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.k0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.n0(eventTimeGenerateReadingMediaPeriodEventTime, str, j11, j10, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(final String str) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1019, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.n1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(eventTimeGenerateReadingMediaPeriodEventTime, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDisabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1020, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.t0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.p(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoEnabled(final DecoderCounters decoderCounters) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1015, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.h0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.i(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(final long j10, final int i10) {
        final AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, 1021, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.a1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(eventTimeGeneratePlayingMediaPeriodEventTime, j10, i10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1017, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.g0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.e0(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(final VideoSize videoSize) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.r1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.M(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(final float f10) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.i1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @CallSuper
    public void release() {
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: com.google.android.exoplayer2.analytics.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f24735b.releaseInternal();
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @CallSuper
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    protected final void sendEvent(AnalyticsListener.EventTime eventTime, int i10, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i10, eventTime);
        this.listeners.sendEvent(i10, event);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    @CallSuper
    public void setPlayer(final Player player, Looper looper) {
        Assertions.checkState(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        this.player = (Player) Assertions.checkNotNull(player);
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.analytics.u
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.f24768a.eventTimes));
            }
        });
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.listeners.setThrowsWhenUsingWrongThread(z10);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        this.mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, (Player) Assertions.checkNotNull(this.player));
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int i11) {
        final AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i10, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1022, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.h1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.A(eventTimeGenerateMediaPeriodEventTime, i11, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i10) {
        if (i10 == 1) {
            this.isSeeking = false;
        }
        this.mediaPeriodQueueTracker.onPositionDiscontinuity((Player) Assertions.checkNotNull(this.player));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.d1
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                DefaultAnalyticsCollector.j0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i10, positionInfo, positionInfo2, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(final Object obj, final long j10) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.d
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj2) {
                ((AnalyticsListener) obj2).onRenderedFirstFrame(eventTimeGenerateReadingMediaPeriodEventTime, obj, j10);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onCues(final CueGroup cueGroup) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.analytics.e0
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onCues(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup);
            }
        });
    }

    private AnalyticsListener.EventTime generateEventTime(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.player);
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
