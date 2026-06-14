package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    @Nullable
    private final AdPlaybackStateUpdater adPlaybackStateUpdater;

    @Nullable
    private Timeline contentTimeline;

    @Nullable
    private SharedMediaPeriod lastUsedMediaPeriod;
    private final MediaSource mediaSource;

    @Nullable
    @GuardedBy("this")
    private Handler playbackHandler;
    private final ListMultimap<Pair<Long, Object>, SharedMediaPeriod> mediaPeriods = ArrayListMultimap.create();
    private ImmutableMap<Object, AdPlaybackState> adPlaybackStates = ImmutableMap.of();
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);

    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(Timeline timeline);
    }

    private static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback callback;
        public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public boolean[] hasNotifiedDownstreamFormatChange = new boolean[0];
        public long lastStartPositionUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(SharedMediaPeriod sharedMediaPeriod, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.sharedPeriod = sharedMediaPeriod;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaSourceEventDispatcher = eventDispatcher;
            this.drmEventDispatcher = eventDispatcher2;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j10) {
            return this.sharedPeriod.continueLoading(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j10, boolean z10) {
            this.sharedPeriod.discardBuffer(this, j10, z10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
            return this.sharedPeriod.getAdjustedSeekPositionUs(this, j10, seekParameters);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.sharedPeriod.getBufferedPositionUs(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.sharedPeriod.getNextLoadPositionUs(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.sharedPeriod.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.sharedPeriod.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.sharedPeriod.isLoading(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.sharedPeriod.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j10) {
            this.callback = callback;
            this.sharedPeriod.prepare(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return this.sharedPeriod.readDiscontinuity(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j10) {
            this.sharedPeriod.reevaluateBuffer(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j10) {
            return this.sharedPeriod.seekToUs(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            if (this.hasNotifiedDownstreamFormatChange.length == 0) {
                this.hasNotifiedDownstreamFormatChange = new boolean[sampleStreamArr.length];
            }
            return this.sharedPeriod.selectTracks(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j10);
        }
    }

    private static final class SampleStreamImpl implements SampleStream {
        private final MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(MediaPeriodImpl mediaPeriodImpl, int i10) {
            this.mediaPeriod = mediaPeriodImpl;
            this.streamIndex = i10;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.mediaPeriod.sharedPeriod.isReady(this.streamIndex);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.mediaPeriod.sharedPeriod.maybeThrowError(this.streamIndex);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.readData(mediaPeriodImpl, this.streamIndex, formatHolder, decoderInputBuffer, i10);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            MediaPeriodImpl mediaPeriodImpl = this.mediaPeriod;
            return mediaPeriodImpl.sharedPeriod.skipData(mediaPeriodImpl, this.streamIndex, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        private final ImmutableMap<Object, AdPlaybackState> adPlaybackStates;

        public ServerSideAdInsertionTimeline(Timeline timeline, ImmutableMap<Object, AdPlaybackState> immutableMap) {
            super(timeline);
            Assertions.checkState(timeline.getWindowCount() == 1);
            Timeline.Period period = new Timeline.Period();
            for (int i10 = 0; i10 < timeline.getPeriodCount(); i10++) {
                timeline.getPeriod(i10, period, true);
                Assertions.checkState(immutableMap.containsKey(Assertions.checkNotNull(period.uid)));
            }
            this.adPlaybackStates = immutableMap;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
            super.getPeriod(i10, period, true);
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(period.uid));
            long j10 = period.durationUs;
            long mediaPeriodPositionUsForContent = j10 == -9223372036854775807L ? adPlaybackState.contentDurationUs : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j10, -1, adPlaybackState);
            Timeline.Period period2 = new Timeline.Period();
            long mediaPeriodPositionUsForContent2 = 0;
            for (int i11 = 0; i11 < i10 + 1; i11++) {
                this.timeline.getPeriod(i11, period2, true);
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                if (i11 == 0) {
                    mediaPeriodPositionUsForContent2 = -ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                }
                if (i11 != i10) {
                    mediaPeriodPositionUsForContent2 += ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2);
                }
            }
            period.set(period.f24625id, period.uid, period.windowIndex, mediaPeriodPositionUsForContent, mediaPeriodPositionUsForContent2, adPlaybackState, period.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i10, Timeline.Window window, long j10) {
            super.getWindow(i10, window, j10);
            Timeline.Period period = new Timeline.Period();
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(Assertions.checkNotNull(getPeriod(window.firstPeriodIndex, period, true).uid)));
            long mediaPeriodPositionUsForContent = ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            if (window.durationUs == -9223372036854775807L) {
                long j11 = adPlaybackState.contentDurationUs;
                if (j11 != -9223372036854775807L) {
                    window.durationUs = j11 - mediaPeriodPositionUsForContent;
                }
            } else {
                Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
                long j12 = period2.positionInWindowUs;
                AdPlaybackState adPlaybackState2 = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
                window.durationUs = period3.positionInWindowUs + ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j12, -1, adPlaybackState2);
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SharedMediaPeriod implements MediaPeriod.Callback {
        private final MediaPeriod actualMediaPeriod;
        private AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;

        @Nullable
        private MediaPeriodImpl loadingPeriod;
        private final Object periodUid;
        private final List<MediaPeriodImpl> mediaPeriods = new ArrayList();
        private final Map<Long, Pair<LoadEventInfo, MediaLoadData>> activeLoads = new HashMap();
        public ExoTrackSelection[] trackSelections = new ExoTrackSelection[0];
        public SampleStream[] sampleStreams = new SampleStream[0];
        public MediaLoadData[] lastDownstreamFormatChangeData = new MediaLoadData[0];

        public SharedMediaPeriod(MediaPeriod mediaPeriod, Object obj, AdPlaybackState adPlaybackState) {
            this.actualMediaPeriod = mediaPeriod;
            this.periodUid = obj;
            this.adPlaybackState = adPlaybackState;
        }

        private int findMatchingStreamIndex(MediaLoadData mediaLoadData) {
            String str;
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i10 = 0;
            loop0: while (true) {
                ExoTrackSelection[] exoTrackSelectionArr = this.trackSelections;
                if (i10 >= exoTrackSelectionArr.length) {
                    return -1;
                }
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
                if (exoTrackSelection != null) {
                    TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                    boolean z10 = mediaLoadData.trackType == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i11 = 0; i11 < trackGroup.length; i11++) {
                        Format format = trackGroup.getFormat(i11);
                        if (format.equals(mediaLoadData.trackFormat) || (z10 && (str = format.f24619id) != null && str.equals(mediaLoadData.trackFormat.f24619id))) {
                            break loop0;
                        }
                    }
                }
                i10++;
            }
            return i10;
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(MediaPeriodImpl mediaPeriodImpl, long j10) {
            if (j10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            if (mediaPeriodPositionUs >= ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private long getStreamPositionUsWithNotYetStartedHandling(MediaPeriodImpl mediaPeriodImpl, long j10) {
            long j11 = mediaPeriodImpl.lastStartPositionUs;
            return j10 < j11 ? ServerSideAdInsertionUtil.getStreamPositionUs(j11, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState) - (mediaPeriodImpl.lastStartPositionUs - j10) : ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        private void maybeNotifyDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, int i10) {
            MediaLoadData mediaLoadData;
            boolean[] zArr = mediaPeriodImpl.hasNotifiedDownstreamFormatChange;
            if (zArr[i10] || (mediaLoadData = this.lastDownstreamFormatChangeData[i10]) == null) {
                return;
            }
            zArr[i10] = true;
            mediaPeriodImpl.mediaSourceEventDispatcher.downstreamFormatChanged(ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, mediaLoadData, this.adPlaybackState));
        }

        public void add(MediaPeriodImpl mediaPeriodImpl) {
            this.mediaPeriods.add(mediaPeriodImpl);
        }

        public boolean canReuseMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) Iterables.getLast(this.mediaPeriods);
            return ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodId, this.adPlaybackState) == ServerSideAdInsertionUtil.getStreamPositionUs(ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public boolean continueLoading(MediaPeriodImpl mediaPeriodImpl, long j10) {
            MediaPeriodImpl mediaPeriodImpl2 = this.loadingPeriod;
            if (mediaPeriodImpl2 != null && !mediaPeriodImpl.equals(mediaPeriodImpl2)) {
                for (Pair<LoadEventInfo, MediaLoadData> pair : this.activeLoads.values()) {
                    mediaPeriodImpl2.mediaSourceEventDispatcher.loadCompleted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl2, (MediaLoadData) pair.second, this.adPlaybackState));
                    mediaPeriodImpl.mediaSourceEventDispatcher.loadStarted((LoadEventInfo) pair.first, ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, (MediaLoadData) pair.second, this.adPlaybackState));
                }
            }
            this.loadingPeriod = mediaPeriodImpl;
            return this.actualMediaPeriod.continueLoading(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j10));
        }

        public void discardBuffer(MediaPeriodImpl mediaPeriodImpl, long j10, boolean z10) {
            this.actualMediaPeriod.discardBuffer(ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), z10);
        }

        public long getAdjustedSeekPositionUs(MediaPeriodImpl mediaPeriodImpl, long j10, SeekParameters seekParameters) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.getAdjustedSeekPositionUs(ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), seekParameters), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long getBufferedPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getBufferedPositionUs());
        }

        @Nullable
        public MediaPeriodImpl getMediaPeriodForEvent(@Nullable MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == -9223372036854775807L) {
                return null;
            }
            for (int i10 = 0; i10 < this.mediaPeriods.size(); i10++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i10);
                long mediaPeriodPositionUs = ServerSideAdInsertionUtil.getMediaPeriodPositionUs(Util.msToUs(mediaLoadData.mediaStartTimeMs), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                long mediaPeriodEndPositionUs = ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState);
                if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                    return mediaPeriodImpl;
                }
            }
            return null;
        }

        public long getNextLoadPositionUs(MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getNextLoadPositionUs());
        }

        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
            return this.actualMediaPeriod.getStreamKeys(list);
        }

        public TrackGroupArray getTrackGroups() {
            return this.actualMediaPeriod.getTrackGroups();
        }

        public boolean isLoading(MediaPeriodImpl mediaPeriodImpl) {
            return mediaPeriodImpl.equals(this.loadingPeriod) && this.actualMediaPeriod.isLoading();
        }

        public boolean isReady(int i10) {
            return ((SampleStream) Util.castNonNull(this.sampleStreams[i10])).isReady();
        }

        public boolean isUnused() {
            return this.mediaPeriods.isEmpty();
        }

        public void maybeThrowError(int i10) throws IOException {
            ((SampleStream) Util.castNonNull(this.sampleStreams[i10])).maybeThrowError();
        }

        public void maybeThrowPrepareError() throws IOException {
            this.actualMediaPeriod.maybeThrowPrepareError();
        }

        public void onDownstreamFormatChanged(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData) {
            int iFindMatchingStreamIndex = findMatchingStreamIndex(mediaLoadData);
            if (iFindMatchingStreamIndex != -1) {
                this.lastDownstreamFormatChangeData[iFindMatchingStreamIndex] = mediaLoadData;
                mediaPeriodImpl.hasNotifiedDownstreamFormatChange[iFindMatchingStreamIndex] = true;
            }
        }

        public void onLoadFinished(LoadEventInfo loadEventInfo) {
            this.activeLoads.remove(Long.valueOf(loadEventInfo.loadTaskId));
        }

        public void onLoadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            this.activeLoads.put(Long.valueOf(loadEventInfo.loadTaskId), Pair.create(loadEventInfo, mediaLoadData));
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.isPrepared = true;
            for (int i10 = 0; i10 < this.mediaPeriods.size(); i10++) {
                MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i10);
                MediaPeriod.Callback callback = mediaPeriodImpl.callback;
                if (callback != null) {
                    callback.onPrepared(mediaPeriodImpl);
                }
            }
        }

        public void prepare(MediaPeriodImpl mediaPeriodImpl, long j10) {
            mediaPeriodImpl.lastStartPositionUs = j10;
            if (this.hasStartedPreparing) {
                if (this.isPrepared) {
                    ((MediaPeriod.Callback) Assertions.checkNotNull(mediaPeriodImpl.callback)).onPrepared(mediaPeriodImpl);
                }
            } else {
                this.hasStartedPreparing = true;
                this.actualMediaPeriod.prepare(this, ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
            }
        }

        public int readData(MediaPeriodImpl mediaPeriodImpl, int i10, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
            int data = ((SampleStream) Util.castNonNull(this.sampleStreams[i10])).readData(formatHolder, decoderInputBuffer, i11 | 5);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, decoderInputBuffer.timeUs);
            if ((data == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (data == -3 && getBufferedPositionUs(mediaPeriodImpl) == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys)) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i10);
                decoderInputBuffer.clear();
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (data == -4) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i10);
                ((SampleStream) Util.castNonNull(this.sampleStreams[i10])).readData(formatHolder, decoderInputBuffer, i11);
                decoderInputBuffer.timeUs = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return data;
        }

        public long readDiscontinuity(MediaPeriodImpl mediaPeriodImpl) {
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                return -9223372036854775807L;
            }
            long discontinuity = this.actualMediaPeriod.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(discontinuity, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public void reevaluateBuffer(MediaPeriodImpl mediaPeriodImpl, long j10) {
            this.actualMediaPeriod.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j10));
        }

        public void release(MediaSource mediaSource) {
            mediaSource.releasePeriod(this.actualMediaPeriod);
        }

        public void remove(MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.loadingPeriod)) {
                this.loadingPeriod = null;
                this.activeLoads.clear();
            }
            this.mediaPeriods.remove(mediaPeriodImpl);
        }

        public long seekToUs(MediaPeriodImpl mediaPeriodImpl, long j10) {
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.seekToUs(ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState)), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long selectTracks(MediaPeriodImpl mediaPeriodImpl, ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
            mediaPeriodImpl.lastStartPositionUs = j10;
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                    ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i10];
                    boolean z10 = true;
                    if (exoTrackSelection != null) {
                        if (zArr[i10] && sampleStreamArr[i10] != null) {
                            z10 = false;
                        }
                        zArr2[i10] = z10;
                        if (z10) {
                            sampleStreamArr[i10] = Util.areEqual(this.trackSelections[i10], exoTrackSelection) ? new SampleStreamImpl(mediaPeriodImpl, i10) : new EmptySampleStream();
                        }
                    } else {
                        sampleStreamArr[i10] = null;
                        zArr2[i10] = true;
                    }
                }
                return j10;
            }
            this.trackSelections = (ExoTrackSelection[]) Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
            long streamPositionUs = ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            SampleStream[] sampleStreamArr2 = this.sampleStreams;
            SampleStream[] sampleStreamArr3 = sampleStreamArr2.length == 0 ? new SampleStream[exoTrackSelectionArr.length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr2, sampleStreamArr2.length);
            long jSelectTracks = this.actualMediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr3, zArr2, streamPositionUs);
            this.sampleStreams = (SampleStream[]) Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
            this.lastDownstreamFormatChangeData = (MediaLoadData[]) Arrays.copyOf(this.lastDownstreamFormatChangeData, sampleStreamArr3.length);
            for (int i11 = 0; i11 < sampleStreamArr3.length; i11++) {
                if (sampleStreamArr3[i11] == null) {
                    sampleStreamArr[i11] = null;
                    this.lastDownstreamFormatChangeData[i11] = null;
                } else if (sampleStreamArr[i11] == null || zArr2[i11]) {
                    sampleStreamArr[i11] = new SampleStreamImpl(mediaPeriodImpl, i11);
                    this.lastDownstreamFormatChangeData[i11] = null;
                }
            }
            return ServerSideAdInsertionUtil.getMediaPeriodPositionUs(jSelectTracks, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public int skipData(MediaPeriodImpl mediaPeriodImpl, int i10, long j10) {
            return ((SampleStream) Util.castNonNull(this.sampleStreams[i10])).skipData(ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
        }

        public void updateAdPlaybackState(AdPlaybackState adPlaybackState) {
            this.adPlaybackState = adPlaybackState;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            MediaPeriodImpl mediaPeriodImpl = this.loadingPeriod;
            if (mediaPeriodImpl == null) {
                return;
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(mediaPeriodImpl.callback)).onContinueLoadingRequested(this.loadingPeriod);
        }
    }

    public ServerSideAdInsertionMediaSource(MediaSource mediaSource, @Nullable AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
    }

    public static /* synthetic */ void a(ServerSideAdInsertionMediaSource serverSideAdInsertionMediaSource, ImmutableMap immutableMap) {
        AdPlaybackState adPlaybackState;
        for (SharedMediaPeriod sharedMediaPeriod : serverSideAdInsertionMediaSource.mediaPeriods.values()) {
            AdPlaybackState adPlaybackState2 = (AdPlaybackState) immutableMap.get(sharedMediaPeriod.periodUid);
            if (adPlaybackState2 != null) {
                sharedMediaPeriod.updateAdPlaybackState(adPlaybackState2);
            }
        }
        SharedMediaPeriod sharedMediaPeriod2 = serverSideAdInsertionMediaSource.lastUsedMediaPeriod;
        if (sharedMediaPeriod2 != null && (adPlaybackState = (AdPlaybackState) immutableMap.get(sharedMediaPeriod2.periodUid)) != null) {
            serverSideAdInsertionMediaSource.lastUsedMediaPeriod.updateAdPlaybackState(adPlaybackState);
        }
        serverSideAdInsertionMediaSource.adPlaybackStates = immutableMap;
        if (serverSideAdInsertionMediaSource.contentTimeline != null) {
            serverSideAdInsertionMediaSource.refreshSourceInfo(new ServerSideAdInsertionTimeline(serverSideAdInsertionMediaSource.contentTimeline, immutableMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLoadData correctMediaLoadData(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, mediaPeriodImpl, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, mediaPeriodImpl, adPlaybackState));
    }

    private static long correctMediaLoadDataPositionMs(long j10, MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jMsToUs = Util.msToUs(j10);
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        return Util.usToMs(mediaPeriodId.isAd() ? ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(jMsToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(jMsToUs, -1, adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        if (mediaPeriodId.isAd()) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
            if (adGroup.count == -1) {
                return 0L;
            }
            return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
        }
        int i10 = mediaPeriodId.nextAdGroupIndex;
        if (i10 == -1) {
            return Long.MAX_VALUE;
        }
        long j10 = adPlaybackState.getAdGroup(i10).timeUs;
        if (j10 == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    @Nullable
    private MediaPeriodImpl getMediaPeriodForEvent(@Nullable MediaSource.MediaPeriodId mediaPeriodId, @Nullable MediaLoadData mediaLoadData, boolean z10) {
        if (mediaPeriodId == null) {
            return null;
        }
        List<SharedMediaPeriod> list = this.mediaPeriods.get(new Pair<>(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (list.isEmpty()) {
            return null;
        }
        if (z10) {
            SharedMediaPeriod sharedMediaPeriod = (SharedMediaPeriod) Iterables.getLast(list);
            return sharedMediaPeriod.loadingPeriod != null ? sharedMediaPeriod.loadingPeriod : (MediaPeriodImpl) Iterables.getLast(sharedMediaPeriod.mediaPeriods);
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            MediaPeriodImpl mediaPeriodForEvent = list.get(i10).getMediaPeriodForEvent(mediaLoadData);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (MediaPeriodImpl) list.get(0).mediaPeriods.get(0);
    }

    private void releaseLastUsedMediaPeriod() {
        SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod != null) {
            sharedMediaPeriod.release(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        SharedMediaPeriod sharedMediaPeriod;
        Pair<Long, Object> pair = new Pair<>(Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        boolean z10 = false;
        if (sharedMediaPeriod2 != null) {
            if (sharedMediaPeriod2.periodUid.equals(mediaPeriodId.periodUid)) {
                sharedMediaPeriod = this.lastUsedMediaPeriod;
                this.mediaPeriods.put(pair, sharedMediaPeriod);
                z10 = true;
            } else {
                this.lastUsedMediaPeriod.release(this.mediaSource);
                sharedMediaPeriod = null;
            }
            this.lastUsedMediaPeriod = null;
        } else {
            sharedMediaPeriod = null;
        }
        if (sharedMediaPeriod == null && ((sharedMediaPeriod = (SharedMediaPeriod) Iterables.getLast(this.mediaPeriods.get(pair), null)) == null || !sharedMediaPeriod.canReuseMediaPeriod(mediaPeriodId, j10))) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodId.periodUid));
            SharedMediaPeriod sharedMediaPeriod3 = new SharedMediaPeriod(this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, ServerSideAdInsertionUtil.getStreamPositionUs(j10, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.put(pair, sharedMediaPeriod3);
            sharedMediaPeriod = sharedMediaPeriod3;
        }
        MediaPeriodImpl mediaPeriodImpl = new MediaPeriodImpl(sharedMediaPeriod, mediaPeriodId, createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        sharedMediaPeriod.add(mediaPeriodImpl);
        if (z10 && sharedMediaPeriod.trackSelections.length > 0) {
            mediaPeriodImpl.seekToUs(j10);
        }
        return mediaPeriodImpl;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onDownstreamFormatChanged(mediaPeriodForEvent, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i10, MediaSource.MediaPeriodId mediaPeriodId) {
        j.d(this, i10, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionManagerError(exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionReleased();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z10) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z10);
            return;
        }
        if (z10) {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        }
        mediaPeriodForEvent.mediaSourceEventDispatcher.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))), iOException, z10);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadStarted(loadEventInfo, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
        this.contentTimeline = timeline;
        AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            refreshSourceInfo(new ServerSideAdInsertionTimeline(timeline, this.adPlaybackStates));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i10, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
        } else {
            mediaPeriodForEvent.mediaSourceEventDispatcher.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (AdPlaybackState) Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = handlerCreateHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, transferListener, getPlayerId());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaPeriodImpl mediaPeriodImpl = (MediaPeriodImpl) mediaPeriod;
        mediaPeriodImpl.sharedPeriod.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.sharedPeriod.isUnused()) {
            this.mediaPeriods.remove(new Pair(Long.valueOf(mediaPeriodImpl.mediaPeriodId.windowSequenceNumber), mediaPeriodImpl.mediaPeriodId.periodUid), mediaPeriodImpl.sharedPeriod);
            if (this.mediaPeriods.isEmpty()) {
                this.lastUsedMediaPeriod = mediaPeriodImpl.sharedPeriod;
            } else {
                mediaPeriodImpl.sharedPeriod.release(this.mediaSource);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        this.contentTimeline = null;
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    public void setAdPlaybackStates(final ImmutableMap<Object, AdPlaybackState> immutableMap) {
        Assertions.checkArgument(!immutableMap.isEmpty());
        Object objCheckNotNull = Assertions.checkNotNull(immutableMap.values().asList().get(0).adsId);
        UnmodifiableIterator<Map.Entry<Object, AdPlaybackState>> it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, AdPlaybackState> next = it.next();
            Object key = next.getKey();
            AdPlaybackState value = next.getValue();
            Assertions.checkArgument(Util.areEqual(objCheckNotNull, value.adsId));
            AdPlaybackState adPlaybackState = this.adPlaybackStates.get(key);
            if (adPlaybackState != null) {
                for (int i10 = value.removedAdGroupCount; i10 < value.adGroupCount; i10++) {
                    AdPlaybackState.AdGroup adGroup = value.getAdGroup(i10);
                    Assertions.checkArgument(adGroup.isServerSideInserted);
                    if (i10 < adPlaybackState.adGroupCount && ServerSideAdInsertionUtil.getAdCountInGroup(value, i10) < ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i10)) {
                        AdPlaybackState.AdGroup adGroup2 = value.getAdGroup(i10 + 1);
                        Assertions.checkArgument(adGroup.contentResumeOffsetUs + adGroup2.contentResumeOffsetUs == adPlaybackState.getAdGroup(i10).contentResumeOffsetUs);
                        Assertions.checkArgument(adGroup.timeUs + adGroup.contentResumeOffsetUs == adGroup2.timeUs);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        Assertions.checkArgument(ServerSideAdInsertionUtil.getAdCountInGroup(value, i10) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            try {
                Handler handler = this.playbackHandler;
                if (handler == null) {
                    this.adPlaybackStates = immutableMap;
                } else {
                    handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            ServerSideAdInsertionMediaSource.a(this.f25066b, immutableMap);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i10, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i11) {
        MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i11);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionAcquired(i11);
        }
    }
}
