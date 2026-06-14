package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.text.SubtitleParser;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class PreloadMediaSource extends WrappingMediaSource {
    private static final String TAG = "PreloadMediaSource";
    private final Allocator allocator;
    private final BandwidthMeter bandwidthMeter;
    private boolean onSourcePreparedNotified;
    private boolean onUsedByPlayerNotified;

    @Nullable
    private Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> playingPreloadedMediaPeriodAndId;
    private boolean preloadCalled;
    private final PreloadControl preloadControl;
    private final Handler preloadHandler;

    @Nullable
    private Pair<PreloadMediaPeriod, MediaPeriodKey> preloadingMediaPeriodAndKey;
    private boolean prepareChildSourceCalled;
    private final RendererCapabilities[] rendererCapabilities;
    private long startPositionUs;

    @Nullable
    private Timeline timeline;
    private final TrackSelector trackSelector;

    public static final class Factory implements MediaSource.Factory {
        private final Allocator allocator;
        private final BandwidthMeter bandwidthMeter;
        private final MediaSource.Factory mediaSourceFactory;
        private final PreloadControl preloadControl;
        private final Looper preloadLooper;
        private final RendererCapabilities[] rendererCapabilities;
        private final TrackSelector trackSelector;

        public Factory(MediaSource.Factory factory, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
            this.mediaSourceFactory = factory;
            this.preloadControl = preloadControl;
            this.trackSelector = trackSelector;
            this.bandwidthMeter = bandwidthMeter;
            this.rendererCapabilities = (RendererCapabilities[]) Arrays.copyOf(rendererCapabilitiesArr, rendererCapabilitiesArr.length);
            this.allocator = allocator;
            this.preloadLooper = looper;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return q.a(this, z10);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return this.mediaSourceFactory.getSupportedTypes();
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public /* synthetic */ MediaSource.Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return q.c(this, factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public PreloadMediaSource createMediaSource(MediaItem mediaItem) {
            return new PreloadMediaSource(this.mediaSourceFactory.createMediaSource(mediaItem), this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.mediaSourceFactory.setCmcdConfigurationFactory(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        public PreloadMediaSource createMediaSource(MediaSource mediaSource) {
            return new PreloadMediaSource(mediaSource, this.preloadControl, this.trackSelector, this.bandwidthMeter, this.rendererCapabilities, this.allocator, this.preloadLooper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MediaPeriodKey {
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final Long startPositionUs;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j10) {
            this.mediaPeriodId = mediaPeriodId;
            this.startPositionUs = Long.valueOf(j10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.mediaPeriodIdEqualsWithoutWindowSequenceNumber(this.mediaPeriodId, mediaPeriodKey.mediaPeriodId) && this.startPositionUs.equals(mediaPeriodKey.startPositionUs);
        }

        public int hashCode() {
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.mediaPeriodId.periodUid.hashCode()) * 31;
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            return ((((((iHashCode + mediaPeriodId.adGroupIndex) * 31) + mediaPeriodId.adIndexInAdGroup) * 31) + mediaPeriodId.nextAdGroupIndex) * 31) + this.startPositionUs.intValue();
        }
    }

    public interface PreloadControl {
        boolean onContinueLoadingRequested(PreloadMediaSource preloadMediaSource, long j10);

        void onLoadedToTheEndOfSource(PreloadMediaSource preloadMediaSource);

        boolean onSourcePrepared(PreloadMediaSource preloadMediaSource);

        boolean onTracksSelected(PreloadMediaSource preloadMediaSource);

        void onUsedByPlayer(PreloadMediaSource preloadMediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        private final long periodStartPositionUs;
        private boolean prepared;

        public PreloadMediaPeriodCallback(long j10) {
            this.periodStartPositionUs = j10;
        }

        public static /* synthetic */ void a(PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod) {
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            if (preloadMediaPeriodCallback.prepared && mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE) {
                PreloadMediaSource.this.preloadControl.onLoadedToTheEndOfSource(PreloadMediaSource.this);
            } else if (!preloadMediaPeriodCallback.prepared || PreloadMediaSource.this.preloadControl.onContinueLoadingRequested(PreloadMediaSource.this, preloadMediaPeriod.getBufferedPositionUs())) {
                preloadMediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadMediaPeriodCallback.periodStartPositionUs).build());
            }
        }

        public static /* synthetic */ void b(PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod) {
            TrackSelectorResult trackSelectorResultSelectTracks;
            if (PreloadMediaSource.this.isUsedByPlayer()) {
                return;
            }
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
            try {
                trackSelectorResultSelectTracks = PreloadMediaSource.this.trackSelector.selectTracks(PreloadMediaSource.this.rendererCapabilities, preloadMediaPeriod.getTrackGroups(), ((MediaPeriodKey) ((Pair) Assertions.checkNotNull(PreloadMediaSource.this.preloadingMediaPeriodAndKey)).second).mediaPeriodId, (Timeline) Assertions.checkNotNull(PreloadMediaSource.this.timeline));
            } catch (ExoPlaybackException e10) {
                Log.e(PreloadMediaSource.TAG, "Failed to select tracks", e10);
                trackSelectorResultSelectTracks = null;
            }
            if (trackSelectorResultSelectTracks != null) {
                preloadMediaPeriod.selectTracksForPreloading(trackSelectorResultSelectTracks.selections, preloadMediaPeriodCallback.periodStartPositionUs);
                if (PreloadMediaSource.this.preloadControl.onTracksSelected(PreloadMediaSource.this)) {
                    preloadMediaPeriod.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(preloadMediaPeriodCallback.periodStartPositionUs).build());
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public void onPrepared(final MediaPeriod mediaPeriod) {
            this.prepared = true;
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.j
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadMediaSource.PreloadMediaPeriodCallback.b(this.f5177b, mediaPeriod);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(final MediaPeriod mediaPeriod) {
            PreloadMediaSource.this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.k
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadMediaSource.PreloadMediaPeriodCallback.a(this.f5179b, mediaPeriod);
                }
            });
        }
    }

    public static /* synthetic */ void b(PreloadMediaSource preloadMediaSource) {
        preloadMediaSource.preloadCalled = false;
        preloadMediaSource.startPositionUs = -9223372036854775807L;
        preloadMediaSource.onSourcePreparedNotified = false;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = preloadMediaSource.preloadingMediaPeriodAndKey;
        if (pair != null) {
            preloadMediaSource.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            preloadMediaSource.preloadingMediaPeriodAndKey = null;
        }
        preloadMediaSource.releaseSourceInternal();
        preloadMediaSource.preloadHandler.removeCallbacksAndMessages(null);
    }

    public static /* synthetic */ void c(PreloadMediaSource preloadMediaSource) {
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = preloadMediaSource.preloadingMediaPeriodAndKey;
        if (pair != null) {
            preloadMediaSource.mediaSource.releasePeriod(((PreloadMediaPeriod) pair.first).mediaPeriod);
            preloadMediaSource.preloadingMediaPeriodAndKey = null;
        }
    }

    public static /* synthetic */ void d(PreloadMediaSource preloadMediaSource, long j10) {
        preloadMediaSource.preloadCalled = true;
        preloadMediaSource.startPositionUs = j10;
        preloadMediaSource.onSourcePreparedNotified = false;
        if (preloadMediaSource.isUsedByPlayer()) {
            preloadMediaSource.notifyOnUsedByPlayer();
        } else {
            preloadMediaSource.setPlayerId(PlayerId.UNSET);
            preloadMediaSource.prepareSourceInternal(preloadMediaSource.bandwidthMeter.getTransferListener());
        }
    }

    public static /* synthetic */ void e(PreloadMediaSource preloadMediaSource, Timeline timeline) {
        if (preloadMediaSource.isUsedByPlayer() || preloadMediaSource.onSourcePreparedNotified) {
            return;
        }
        preloadMediaSource.onSourcePreparedNotified = true;
        if (preloadMediaSource.preloadControl.onSourcePrepared(preloadMediaSource)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(new Timeline.Window(), new Timeline.Period(), 0, preloadMediaSource.startPositionUs);
            preloadMediaSource.createPeriod(new MediaSource.MediaPeriodId(periodPositionUs.first), preloadMediaSource.allocator, ((Long) periodPositionUs.second).longValue()).preload(preloadMediaSource.new PreloadMediaPeriodCallback(((Long) periodPositionUs.second).longValue()), ((Long) periodPositionUs.second).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isUsedByPlayer() {
        return prepareSourceCalled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mediaPeriodIdEqualsWithoutWindowSequenceNumber(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid) && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup && mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex;
    }

    private void notifyOnUsedByPlayer() {
        this.preloadControl.onUsedByPlayer(this);
        this.onUsedByPlayerNotified = true;
    }

    public void clear() {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.f
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.c(this.f5172b);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair = this.playingPreloadedMediaPeriodAndId;
        return (pair == null || !mediaPeriodIdEqualsWithoutWindowSequenceNumber(mediaPeriodId, (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(pair)).second)) ? mediaPeriodId : (MediaSource.MediaPeriodId) ((Pair) Assertions.checkNotNull(this.playingPreloadedMediaPeriodAndId)).second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(final Timeline timeline) {
        this.timeline = timeline;
        refreshSourceInfo(timeline);
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.h
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.e(this.f5175b, timeline);
            }
        });
    }

    public void preload(final long j10) {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.g
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.d(this.f5173b, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void prepareSourceInternal() {
        if (isUsedByPlayer() && !this.onUsedByPlayerNotified) {
            notifyOnUsedByPlayer();
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            onChildSourceInfoRefreshed(timeline);
        } else {
            if (this.prepareChildSourceCalled) {
                return;
            }
            this.prepareChildSourceCalled = true;
            prepareChildSource();
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair == null || preloadMediaPeriod != ((Pair) Assertions.checkNotNull(pair)).first) {
            Pair<PreloadMediaPeriod, MediaSource.MediaPeriodId> pair2 = this.playingPreloadedMediaPeriodAndId;
            if (pair2 != null && preloadMediaPeriod == ((Pair) Assertions.checkNotNull(pair2)).first) {
                this.playingPreloadedMediaPeriodAndId = null;
            }
        } else {
            this.preloadingMediaPeriodAndKey = null;
        }
        this.mediaSource.releasePeriod(preloadMediaPeriod.mediaPeriod);
    }

    public void releasePreloadMediaSource() {
        this.preloadHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.e
            @Override // java.lang.Runnable
            public final void run() {
                PreloadMediaSource.b(this.f5171b);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        if (isUsedByPlayer()) {
            return;
        }
        this.onUsedByPlayerNotified = false;
        if (this.preloadCalled) {
            return;
        }
        this.timeline = null;
        this.prepareChildSourceCalled = false;
        super.releaseSourceInternal();
    }

    private PreloadMediaSource(MediaSource mediaSource, PreloadControl preloadControl, TrackSelector trackSelector, BandwidthMeter bandwidthMeter, RendererCapabilities[] rendererCapabilitiesArr, Allocator allocator, Looper looper) {
        super(mediaSource);
        this.preloadControl = preloadControl;
        this.trackSelector = trackSelector;
        this.bandwidthMeter = bandwidthMeter;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.allocator = allocator;
        this.preloadHandler = Util.createHandler(looper, null);
        this.startPositionUs = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public PreloadMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j10) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j10);
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair = this.preloadingMediaPeriodAndKey;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) ((Pair) Assertions.checkNotNull(this.preloadingMediaPeriodAndKey)).first;
            if (isUsedByPlayer()) {
                this.preloadingMediaPeriodAndKey = null;
                this.playingPreloadedMediaPeriodAndId = new Pair<>(preloadMediaPeriod, mediaPeriodId);
            }
            return preloadMediaPeriod;
        }
        Pair<PreloadMediaPeriod, MediaPeriodKey> pair2 = this.preloadingMediaPeriodAndKey;
        if (pair2 != null) {
            this.mediaSource.releasePeriod(((PreloadMediaPeriod) ((Pair) Assertions.checkNotNull(pair2)).first).mediaPeriod);
            this.preloadingMediaPeriodAndKey = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j10));
        if (!isUsedByPlayer()) {
            this.preloadingMediaPeriodAndKey = new Pair<>(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }
}
