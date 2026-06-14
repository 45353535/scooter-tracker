package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DownloadHelper {
    public static final DefaultTrackSelector.Parameters DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT = DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT.buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    private Callback callback;
    private final Handler callbackHandler;
    private List<ExoTrackSelection>[][] immutableTrackSelectionsByPeriodAndRenderer;
    private boolean isPreparedWithMedia;
    private final MediaItem.LocalConfiguration localConfiguration;
    private MappingTrackSelector.MappedTrackInfo[] mappedTrackInfos;
    private MediaPreparer mediaPreparer;

    @Nullable
    private final MediaSource mediaSource;
    private final RendererCapabilities[] rendererCapabilities;
    private final SparseIntArray scratchSet;
    private TrackGroupArray[] trackGroupArrays;
    private List<ExoTrackSelection>[][] trackSelectionsByPeriodAndRenderer;
    private final DefaultTrackSelector trackSelector;
    private final Timeline.Window window;

    public interface Callback {
        void onPrepareError(DownloadHelper downloadHelper, IOException iOException);

        void onPrepared(DownloadHelper downloadHelper);
    }

    private static final class DownloadTrackSelection extends BaseTrackSelection {

        private static final class Factory implements ExoTrackSelection.Factory {
            private Factory() {
            }

            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i10 = 0; i10 < definitionArr.length; i10++) {
                    ExoTrackSelection.Definition definition = definitionArr[i10];
                    exoTrackSelectionArr[i10] = definition == null ? null : new DownloadTrackSelection(definition.group, definition.tracks);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long j10, long j11, long j12, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }
    }

    private static final class FakeBandwidthMeter implements BandwidthMeter {
        private FakeBandwidthMeter() {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public long getBitrateEstimate() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public /* synthetic */ long getTimeToFirstByteEstimateUs() {
            return com.google.android.exoplayer2.upstream.a.a(this);
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        @Nullable
        public TransferListener getTransferListener() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_FAILED = 1;
        private static final int DOWNLOAD_HELPER_CALLBACK_MESSAGE_PREPARED = 0;
        private static final int MESSAGE_CHECK_FOR_FAILURE = 1;
        private static final int MESSAGE_CONTINUE_LOADING = 2;
        private static final int MESSAGE_PREPARE_SOURCE = 0;
        private static final int MESSAGE_RELEASE = 3;
        private final DownloadHelper downloadHelper;
        public MediaPeriod[] mediaPeriods;
        private final MediaSource mediaSource;
        private final Handler mediaSourceHandler;
        private final HandlerThread mediaSourceThread;
        private boolean released;
        public Timeline timeline;
        private final Allocator allocator = new DefaultAllocator(true, 65536);
        private final ArrayList<MediaPeriod> pendingMediaPeriods = new ArrayList<>();
        private final Handler downloadHelperHandler = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f25009b.handleDownloadHelperCallbackMessage(message);
            }
        });

        public MediaPreparer(MediaSource mediaSource, DownloadHelper downloadHelper) {
            this.mediaSource = mediaSource;
            this.downloadHelper = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.mediaSourceThread = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.mediaSourceHandler = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleDownloadHelperCallbackMessage(Message message) {
            if (this.released) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 0) {
                try {
                    this.downloadHelper.onMediaPrepared();
                } catch (ExoPlaybackException e10) {
                    this.downloadHelperHandler.obtainMessage(1, new IOException(e10)).sendToTarget();
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            release();
            this.downloadHelper.onMediaPreparationFailed((IOException) Util.castNonNull(message.obj));
            return true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.mediaSource.prepareSource(this, null, PlayerId.UNSET);
                this.mediaSourceHandler.sendEmptyMessage(1);
                return true;
            }
            int i11 = 0;
            if (i10 == 1) {
                try {
                    if (this.mediaPeriods == null) {
                        this.mediaSource.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i11 < this.pendingMediaPeriods.size()) {
                            this.pendingMediaPeriods.get(i11).maybeThrowPrepareError();
                            i11++;
                        }
                    }
                    this.mediaSourceHandler.sendEmptyMessageDelayed(1, 100L);
                } catch (IOException e10) {
                    this.downloadHelperHandler.obtainMessage(1, e10).sendToTarget();
                }
                return true;
            }
            if (i10 == 2) {
                MediaPeriod mediaPeriod = (MediaPeriod) message.obj;
                if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                    mediaPeriod.continueLoading(0L);
                }
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            MediaPeriod[] mediaPeriodArr = this.mediaPeriods;
            if (mediaPeriodArr != null) {
                int length = mediaPeriodArr.length;
                while (i11 < length) {
                    this.mediaSource.releasePeriod(mediaPeriodArr[i11]);
                    i11++;
                }
            }
            this.mediaSource.releaseSource(this);
            this.mediaSourceHandler.removeCallbacksAndMessages(null);
            this.mediaSourceThread.quit();
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod mediaPeriod) {
            this.pendingMediaPeriods.remove(mediaPeriod);
            if (this.pendingMediaPeriods.isEmpty()) {
                this.mediaSourceHandler.removeMessages(1);
                this.downloadHelperHandler.sendEmptyMessage(0);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        public void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
            MediaPeriod[] mediaPeriodArr;
            if (this.timeline != null) {
                return;
            }
            if (timeline.getWindow(0, new Timeline.Window()).isLive()) {
                this.downloadHelperHandler.obtainMessage(1, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.timeline = timeline;
            this.mediaPeriods = new MediaPeriod[timeline.getPeriodCount()];
            int i10 = 0;
            while (true) {
                mediaPeriodArr = this.mediaPeriods;
                if (i10 >= mediaPeriodArr.length) {
                    break;
                }
                MediaPeriod mediaPeriodCreatePeriod = this.mediaSource.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i10)), this.allocator, 0L);
                this.mediaPeriods[i10] = mediaPeriodCreatePeriod;
                this.pendingMediaPeriods.add(mediaPeriodCreatePeriod);
                i10++;
            }
            for (MediaPeriod mediaPeriod : mediaPeriodArr) {
                mediaPeriod.prepare(this, 0L);
            }
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.mediaSourceHandler.sendEmptyMessage(3);
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
            if (this.pendingMediaPeriods.contains(mediaPeriod)) {
                this.mediaSourceHandler.obtainMessage(2, mediaPeriod).sendToTarget();
            }
        }
    }

    public DownloadHelper(MediaItem mediaItem, @Nullable MediaSource mediaSource, TrackSelectionParameters trackSelectionParameters, RendererCapabilities[] rendererCapabilitiesArr) {
        this.localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        this.mediaSource = mediaSource;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(trackSelectionParameters, new DownloadTrackSelection.Factory());
        this.trackSelector = defaultTrackSelector;
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.scratchSet = new SparseIntArray();
        defaultTrackSelector.init(new TrackSelector.InvalidationListener() { // from class: com.google.android.exoplayer2.offline.d
            @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
            public final void onTrackSelectionsInvalidated() {
                DownloadHelper.d();
            }
        }, new FakeBandwidthMeter());
        this.callbackHandler = Util.createHandlerForCurrentOrMainLooper();
        this.window = new Timeline.Window();
    }

    public static /* synthetic */ void a(CueGroup cueGroup) {
    }

    private void addTrackSelectionInternal(int i10, TrackSelectionParameters trackSelectionParameters) throws ExoPlaybackException {
        this.trackSelector.setParameters(trackSelectionParameters);
        runTrackSelection(i10);
        UnmodifiableIterator<TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            this.trackSelector.setParameters(trackSelectionParameters.buildUpon().setOverrideForType(it.next()).build());
            runTrackSelection(i10);
        }
    }

    private void assertPreparedWithMedia() {
        Assertions.checkState(this.isPreparedWithMedia);
    }

    public static /* synthetic */ DrmSessionManager b(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        return drmSessionManager;
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory) {
        return createMediaSource(downloadRequest, factory, null);
    }

    private static MediaSource createMediaSourceInternal(MediaItem mediaItem, DataSource.Factory factory, @Nullable final DrmSessionManager drmSessionManager) {
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(factory, ExtractorsFactory.EMPTY);
        if (drmSessionManager != null) {
            defaultMediaSourceFactory.setDrmSessionManagerProvider(new DrmSessionManagerProvider() { // from class: com.google.android.exoplayer2.offline.b
                @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
                public final DrmSessionManager get(MediaItem mediaItem2) {
                    return DownloadHelper.b(drmSessionManager, mediaItem2);
                }
            });
        }
        return defaultMediaSourceFactory.createMediaSource(mediaItem);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e(Metadata metadata) {
    }

    public static /* synthetic */ void f(DownloadHelper downloadHelper, Callback callback) {
        downloadHelper.getClass();
        callback.onPrepared(downloadHelper);
    }

    @Deprecated
    public static DownloadHelper forDash(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forDash(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    @Deprecated
    public static DownloadHelper forHls(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forHls(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem) {
        Assertions.checkArgument(isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)));
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), null, null, null);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT);
    }

    public static DefaultTrackSelector.Parameters getDefaultTrackSelectorParameters(Context context) {
        return DefaultTrackSelector.Parameters.getDefaults(context).buildUpon().setForceHighestSupportedBitrate(true).setConstrainAudioChannelCountToDeviceCapabilities(false).build();
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener() { // from class: com.google.android.exoplayer2.offline.DownloadHelper.1
            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onDroppedFrames(int i10, long j10) {
                com.google.android.exoplayer2.video.c.a(this, i10, j10);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onRenderedFirstFrame(Object obj, long j10) {
                com.google.android.exoplayer2.video.c.b(this, obj, j10);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoCodecError(Exception exc) {
                com.google.android.exoplayer2.video.c.c(this, exc);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDecoderInitialized(String str, long j10, long j11) {
                com.google.android.exoplayer2.video.c.d(this, str, j10, j11);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDecoderReleased(String str) {
                com.google.android.exoplayer2.video.c.e(this, str);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.video.c.f(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.video.c.g(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoFrameProcessingOffset(long j10, int i10) {
                com.google.android.exoplayer2.video.c.h(this, j10, i10);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoInputFormatChanged(Format format) {
                com.google.android.exoplayer2.video.c.i(this, format);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                com.google.android.exoplayer2.video.c.k(this, videoSize);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                com.google.android.exoplayer2.video.c.j(this, format, decoderReuseEvaluation);
            }
        }, new AudioRendererEventListener() { // from class: com.google.android.exoplayer2.offline.DownloadHelper.2
            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioCodecError(Exception exc) {
                com.google.android.exoplayer2.audio.b.a(this, exc);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDecoderInitialized(String str, long j10, long j11) {
                com.google.android.exoplayer2.audio.b.b(this, str, j10, j11);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDecoderReleased(String str) {
                com.google.android.exoplayer2.audio.b.c(this, str);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.audio.b.d(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
                com.google.android.exoplayer2.audio.b.e(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioInputFormatChanged(Format format) {
                com.google.android.exoplayer2.audio.b.f(this, format);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioPositionAdvancing(long j10) {
                com.google.android.exoplayer2.audio.b.h(this, j10);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioSinkError(Exception exc) {
                com.google.android.exoplayer2.audio.b.i(this, exc);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioUnderrun(int i10, long j10, long j11) {
                com.google.android.exoplayer2.audio.b.j(this, i10, j10, j11);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
                com.google.android.exoplayer2.audio.b.k(this, z10);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                com.google.android.exoplayer2.audio.b.g(this, format, decoderReuseEvaluation);
            }
        }, new TextOutput() { // from class: com.google.android.exoplayer2.offline.f
            @Override // com.google.android.exoplayer2.text.TextOutput
            public final void onCues(CueGroup cueGroup) {
                DownloadHelper.a(cueGroup);
            }

            @Override // com.google.android.exoplayer2.text.TextOutput
            public /* synthetic */ void onCues(List list) {
                com.google.android.exoplayer2.text.c.a(this, list);
            }
        }, new MetadataOutput() { // from class: com.google.android.exoplayer2.offline.g
            @Override // com.google.android.exoplayer2.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
                DownloadHelper.e(metadata);
            }
        });
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i10 = 0; i10 < rendererArrCreateRenderers.length; i10++) {
            rendererCapabilitiesArr[i10] = rendererArrCreateRenderers[i10].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    private static boolean isProgressive(MediaItem.LocalConfiguration localConfiguration) {
        return Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType) == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPreparationFailed(final IOException iOException) {
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.c
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHelper downloadHelper = this.f25004b;
                ((DownloadHelper.Callback) Assertions.checkNotNull(downloadHelper.callback)).onPrepareError(downloadHelper, iOException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMediaPrepared() throws ExoPlaybackException {
        Assertions.checkNotNull(this.mediaPreparer);
        Assertions.checkNotNull(this.mediaPreparer.mediaPeriods);
        Assertions.checkNotNull(this.mediaPreparer.timeline);
        int length = this.mediaPreparer.mediaPeriods.length;
        int length2 = this.rendererCapabilities.length;
        this.trackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        this.immutableTrackSelectionsByPeriodAndRenderer = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                this.trackSelectionsByPeriodAndRenderer[i10][i11] = new ArrayList();
                this.immutableTrackSelectionsByPeriodAndRenderer[i10][i11] = DesugarCollections.unmodifiableList(this.trackSelectionsByPeriodAndRenderer[i10][i11]);
            }
        }
        this.trackGroupArrays = new TrackGroupArray[length];
        this.mappedTrackInfos = new MappingTrackSelector.MappedTrackInfo[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.trackGroupArrays[i12] = this.mediaPreparer.mediaPeriods[i12].getTrackGroups();
            this.trackSelector.onSelectionActivated(runTrackSelection(i12).info);
            this.mappedTrackInfos[i12] = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(this.trackSelector.getCurrentMappedTrackInfo());
        }
        setPreparedWithMedia();
        ((Handler) Assertions.checkNotNull(this.callbackHandler)).post(new Runnable() { // from class: com.google.android.exoplayer2.offline.h
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHelper downloadHelper = this.f25008b;
                ((DownloadHelper.Callback) Assertions.checkNotNull(downloadHelper.callback)).onPrepared(downloadHelper);
            }
        });
    }

    private TrackSelectorResult runTrackSelection(int i10) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResultSelectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, this.trackGroupArrays[i10], new MediaSource.MediaPeriodId(this.mediaPreparer.timeline.getUidOfPeriod(i10)), this.mediaPreparer.timeline);
        for (int i11 = 0; i11 < trackSelectorResultSelectTracks.length; i11++) {
            ExoTrackSelection exoTrackSelection = trackSelectorResultSelectTracks.selections[i11];
            if (exoTrackSelection != null) {
                List<ExoTrackSelection> list = this.trackSelectionsByPeriodAndRenderer[i10][i11];
                int i12 = 0;
                while (true) {
                    if (i12 >= list.size()) {
                        list.add(exoTrackSelection);
                        break;
                    }
                    ExoTrackSelection exoTrackSelection2 = list.get(i12);
                    if (exoTrackSelection2.getTrackGroup().equals(exoTrackSelection.getTrackGroup())) {
                        this.scratchSet.clear();
                        for (int i13 = 0; i13 < exoTrackSelection2.length(); i13++) {
                            this.scratchSet.put(exoTrackSelection2.getIndexInTrackGroup(i13), 0);
                        }
                        for (int i14 = 0; i14 < exoTrackSelection.length(); i14++) {
                            this.scratchSet.put(exoTrackSelection.getIndexInTrackGroup(i14), 0);
                        }
                        int[] iArr = new int[this.scratchSet.size()];
                        for (int i15 = 0; i15 < this.scratchSet.size(); i15++) {
                            iArr[i15] = this.scratchSet.keyAt(i15);
                        }
                        list.set(i12, new DownloadTrackSelection(exoTrackSelection2.getTrackGroup(), iArr));
                    } else {
                        i12++;
                    }
                }
            }
        }
        return trackSelectorResultSelectTracks;
    }

    private void setPreparedWithMedia() {
        this.isPreparedWithMedia = true;
    }

    public void addAudioLanguagesToSelection(String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 1);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredAudioLanguage(str).build();
                for (int i10 = 0; i10 < periodCount; i10++) {
                    addTrackSelectionInternal(i10, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTextLanguagesToSelection(boolean z10, String... strArr) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = DEFAULT_TRACK_SELECTOR_PARAMETERS_WITHOUT_CONTEXT.buildUpon();
            builderBuildUpon.setSelectUndeterminedTextLanguage(z10);
            builderBuildUpon.setForceHighestSupportedBitrate(true);
            for (RendererCapabilities rendererCapabilities : this.rendererCapabilities) {
                int trackType = rendererCapabilities.getTrackType();
                builderBuildUpon.setTrackTypeDisabled(trackType, trackType != 3);
            }
            int periodCount = getPeriodCount();
            for (String str : strArr) {
                TrackSelectionParameters trackSelectionParametersBuild = builderBuildUpon.setPreferredTextLanguage(str).build();
                for (int i10 = 0; i10 < periodCount; i10++) {
                    addTrackSelectionInternal(i10, trackSelectionParametersBuild);
                }
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTrackSelection(int i10, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            addTrackSelectionInternal(i10, trackSelectionParameters);
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void addTrackSelectionForSingleRenderer(int i10, int i11, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        try {
            assertPreparedWithMedia();
            DefaultTrackSelector.Parameters.Builder builderBuildUpon = parameters.buildUpon();
            int i12 = 0;
            while (i12 < this.mappedTrackInfos[i10].getRendererCount()) {
                builderBuildUpon.setRendererDisabled(i12, i12 != i11);
                i12++;
            }
            if (list.isEmpty()) {
                addTrackSelectionInternal(i10, builderBuildUpon.build());
                return;
            }
            TrackGroupArray trackGroups = this.mappedTrackInfos[i10].getTrackGroups(i11);
            for (int i13 = 0; i13 < list.size(); i13++) {
                builderBuildUpon.setSelectionOverride(i11, trackGroups, list.get(i13));
                addTrackSelectionInternal(i10, builderBuildUpon.build());
            }
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void clearTrackSelections(int i10) {
        assertPreparedWithMedia();
        for (int i11 = 0; i11 < this.rendererCapabilities.length; i11++) {
            this.trackSelectionsByPeriodAndRenderer[i10][i11].clear();
        }
    }

    public DownloadRequest getDownloadRequest(@Nullable byte[] bArr) {
        return getDownloadRequest(this.localConfiguration.uri.toString(), bArr);
    }

    @Nullable
    public Object getManifest() {
        if (this.mediaSource == null) {
            return null;
        }
        assertPreparedWithMedia();
        if (this.mediaPreparer.timeline.getWindowCount() > 0) {
            return this.mediaPreparer.timeline.getWindow(0, this.window).manifest;
        }
        return null;
    }

    public MappingTrackSelector.MappedTrackInfo getMappedTrackInfo(int i10) {
        assertPreparedWithMedia();
        return this.mappedTrackInfos[i10];
    }

    public int getPeriodCount() {
        if (this.mediaSource == null) {
            return 0;
        }
        assertPreparedWithMedia();
        return this.trackGroupArrays.length;
    }

    public TrackGroupArray getTrackGroups(int i10) {
        assertPreparedWithMedia();
        return this.trackGroupArrays[i10];
    }

    public List<ExoTrackSelection> getTrackSelections(int i10, int i11) {
        assertPreparedWithMedia();
        return this.immutableTrackSelectionsByPeriodAndRenderer[i10][i11];
    }

    public Tracks getTracks(int i10) {
        assertPreparedWithMedia();
        return TrackSelectionUtil.buildTracks(this.mappedTrackInfos[i10], this.immutableTrackSelectionsByPeriodAndRenderer[i10]);
    }

    public void prepare(final Callback callback) {
        Assertions.checkState(this.callback == null);
        this.callback = callback;
        MediaSource mediaSource = this.mediaSource;
        if (mediaSource != null) {
            this.mediaPreparer = new MediaPreparer(mediaSource, this);
        } else {
            this.callbackHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.offline.e
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadHelper.f(this.f25006b, callback);
                }
            });
        }
    }

    public void release() {
        MediaPreparer mediaPreparer = this.mediaPreparer;
        if (mediaPreparer != null) {
            mediaPreparer.release();
        }
        this.trackSelector.release();
    }

    public void replaceTrackSelections(int i10, TrackSelectionParameters trackSelectionParameters) {
        try {
            assertPreparedWithMedia();
            clearTrackSelections(i10);
            addTrackSelectionInternal(i10, trackSelectionParameters);
        } catch (ExoPlaybackException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static MediaSource createMediaSource(DownloadRequest downloadRequest, DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        return createMediaSourceInternal(downloadRequest.toMediaItem(), factory, drmSessionManager);
    }

    @Deprecated
    public static DownloadHelper forProgressive(Context context, Uri uri, @Nullable String str) {
        return forMediaItem(context, new MediaItem.Builder().setUri(uri).setCustomCacheKey(str).build());
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Context context, Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory) {
        return forSmoothStreaming(uri, factory, renderersFactory, null, getDefaultTrackSelectorParameters(context));
    }

    public DownloadRequest getDownloadRequest(String str, @Nullable byte[] bArr) {
        DownloadRequest.Builder mimeType = new DownloadRequest.Builder(str, this.localConfiguration.uri).setMimeType(this.localConfiguration.mimeType);
        MediaItem.DrmConfiguration drmConfiguration = this.localConfiguration.drmConfiguration;
        DownloadRequest.Builder data = mimeType.setKeySetId(drmConfiguration != null ? drmConfiguration.getKeySetId() : null).setCustomCacheKey(this.localConfiguration.customCacheKey).setData(bArr);
        if (this.mediaSource == null) {
            return data.build();
        }
        assertPreparedWithMedia();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.trackSelectionsByPeriodAndRenderer.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            int length2 = this.trackSelectionsByPeriodAndRenderer[i10].length;
            for (int i11 = 0; i11 < length2; i11++) {
                arrayList2.addAll(this.trackSelectionsByPeriodAndRenderer[i10][i11]);
            }
            arrayList.addAll(this.mediaPreparer.mediaPeriods[i10].getStreamKeys(arrayList2));
        }
        return data.setStreamKeys(arrayList).build();
    }

    @Deprecated
    public static DownloadHelper forDash(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/dash+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    @Deprecated
    public static DownloadHelper forHls(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/x-mpegURL").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    public static DownloadHelper forMediaItem(Context context, MediaItem mediaItem, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, getDefaultTrackSelectorParameters(context), renderersFactory, factory, null);
    }

    @Deprecated
    public static DownloadHelper forSmoothStreaming(Uri uri, DataSource.Factory factory, RenderersFactory renderersFactory, @Nullable DrmSessionManager drmSessionManager, TrackSelectionParameters trackSelectionParameters) {
        return forMediaItem(new MediaItem.Builder().setUri(uri).setMimeType("application/vnd.ms-sstr+xml").build(), trackSelectionParameters, renderersFactory, factory, drmSessionManager);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory) {
        return forMediaItem(mediaItem, trackSelectionParameters, renderersFactory, factory, null);
    }

    public static DownloadHelper forMediaItem(MediaItem mediaItem, TrackSelectionParameters trackSelectionParameters, @Nullable RenderersFactory renderersFactory, @Nullable DataSource.Factory factory, @Nullable DrmSessionManager drmSessionManager) {
        RendererCapabilities[] rendererCapabilities;
        boolean zIsProgressive = isProgressive((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration));
        Assertions.checkArgument(zIsProgressive || factory != null);
        MediaSource mediaSourceCreateMediaSourceInternal = zIsProgressive ? null : createMediaSourceInternal(mediaItem, (DataSource.Factory) Util.castNonNull(factory), drmSessionManager);
        if (renderersFactory != null) {
            rendererCapabilities = getRendererCapabilities(renderersFactory);
        } else {
            rendererCapabilities = new RendererCapabilities[0];
        }
        return new DownloadHelper(mediaItem, mediaSourceCreateMediaSourceInternal, trackSelectionParameters, rendererCapabilities);
    }
}
