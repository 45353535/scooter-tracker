package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaPeriod;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes7.dex */
final class RtspMediaPeriod implements MediaPeriod {
    private static final int PORT_BINDING_MAX_RETRY_COUNT = 3;
    private final Allocator allocator;
    private MediaPeriod.Callback callback;
    private final Handler handler = Util.createHandlerForCurrentLooper();
    private final InternalListener internalListener;
    private boolean isUsingRtpTcp;
    private final Listener listener;
    private boolean loadingFinished;
    private boolean notifyDiscontinuity;
    private long pendingSeekPositionUs;
    private long pendingSeekPositionUsForTcpRetry;

    @Nullable
    private RtspMediaSource.RtspPlaybackException playbackException;
    private int portBindingRetryCount;

    @Nullable
    private IOException preparationError;
    private boolean prepared;
    private boolean released;
    private long requestedSeekPositionUs;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private final RtspClient rtspClient;
    private final List<RtspLoaderWrapper> rtspLoaderWrappers;
    private final List<RtpLoadInfo> selectedLoadInfos;
    private ImmutableList<TrackGroup> trackGroups;
    private boolean trackSelected;

    /* JADX INFO: Access modifiers changed from: private */
    final class InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
        private InternalListener() {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            Handler handler = RtspMediaPeriod.this.handler;
            final RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.e
                @Override // java.lang.Runnable
                public final void run() {
                    rtspMediaPeriod.maybeFinishPrepare();
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpDataLoadable rtpDataLoadable, long j10, long j11, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            RtspMediaPeriod.this.playbackException = rtspPlaybackException;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackStarted(long j10, ImmutableList<RtspTrackTiming> immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                arrayList.add((String) Assertions.checkNotNull(immutableList.get(i10).uri.getPath()));
            }
            for (int i11 = 0; i11 < RtspMediaPeriod.this.selectedLoadInfos.size(); i11++) {
                if (!arrayList.contains(((RtpLoadInfo) RtspMediaPeriod.this.selectedLoadInfos.get(i11)).getTrackUri().getPath())) {
                    RtspMediaPeriod.this.listener.onSeekingUnsupported();
                    if (RtspMediaPeriod.this.isSeekPending()) {
                        RtspMediaPeriod.this.notifyDiscontinuity = true;
                        RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                        RtspMediaPeriod.this.requestedSeekPositionUs = -9223372036854775807L;
                        RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < immutableList.size(); i12++) {
                RtspTrackTiming rtspTrackTiming = immutableList.get(i12);
                RtpDataLoadable loadableByTrackUri = RtspMediaPeriod.this.getLoadableByTrackUri(rtspTrackTiming.uri);
                if (loadableByTrackUri != null) {
                    loadableByTrackUri.setTimestamp(rtspTrackTiming.rtpTimestamp);
                    loadableByTrackUri.setSequenceNumber(rtspTrackTiming.sequenceNumber);
                    if (RtspMediaPeriod.this.isSeekPending() && RtspMediaPeriod.this.pendingSeekPositionUs == RtspMediaPeriod.this.requestedSeekPositionUs) {
                        loadableByTrackUri.seekToUs(j10, rtspTrackTiming.rtpTimestamp);
                    }
                }
            }
            if (!RtspMediaPeriod.this.isSeekPending()) {
                if (RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry != -9223372036854775807L) {
                    RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
                    rtspMediaPeriod.seekToUs(rtspMediaPeriod.pendingSeekPositionUsForTcpRetry);
                    RtspMediaPeriod.this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
                    return;
                }
                return;
            }
            if (RtspMediaPeriod.this.pendingSeekPositionUs == RtspMediaPeriod.this.requestedSeekPositionUs) {
                RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                RtspMediaPeriod.this.requestedSeekPositionUs = -9223372036854775807L;
            } else {
                RtspMediaPeriod.this.pendingSeekPositionUs = -9223372036854775807L;
                RtspMediaPeriod rtspMediaPeriod2 = RtspMediaPeriod.this;
                rtspMediaPeriod2.seekToUs(rtspMediaPeriod2.requestedSeekPositionUs);
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onRtspSetupCompleted() {
            RtspMediaPeriod.this.rtspClient.startPlayback(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineRequestFailed(String str, @Nullable Throwable th2) {
            RtspMediaPeriod.this.preparationError = th2 == null ? new IOException(str) : new IOException(str, th2);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList) {
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                RtspMediaTrack rtspMediaTrack = immutableList.get(i10);
                RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
                RtspLoaderWrapper rtspLoaderWrapper = rtspMediaPeriod.new RtspLoaderWrapper(rtspMediaTrack, i10, rtspMediaPeriod.rtpDataChannelFactory);
                RtspMediaPeriod.this.rtspLoaderWrappers.add(rtspLoaderWrapper);
                rtspLoaderWrapper.startLoading();
            }
            RtspMediaPeriod.this.listener.onSourceInfoRefreshed(rtspSessionTiming);
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
        public void onUpstreamFormatChanged(Format format) {
            Handler handler = RtspMediaPeriod.this.handler;
            final RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.f
                @Override // java.lang.Runnable
                public final void run() {
                    rtspMediaPeriod.maybeFinishPrepare();
                }
            });
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i10, int i11) {
            return ((RtspLoaderWrapper) Assertions.checkNotNull((RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i10))).sampleQueue;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpDataLoadable rtpDataLoadable, long j10, long j11) {
            if (RtspMediaPeriod.this.getBufferedPositionUs() == 0) {
                if (RtspMediaPeriod.this.isUsingRtpTcp) {
                    return;
                }
                RtspMediaPeriod.this.retryWithRtpTcp();
                RtspMediaPeriod.this.isUsingRtpTcp = true;
                return;
            }
            for (int i10 = 0; i10 < RtspMediaPeriod.this.rtspLoaderWrappers.size(); i10++) {
                RtspLoaderWrapper rtspLoaderWrapper = (RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i10);
                if (rtspLoaderWrapper.loadInfo.loadable == rtpDataLoadable) {
                    rtspLoaderWrapper.cancelLoad();
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDataLoadable rtpDataLoadable, long j10, long j11, IOException iOException, int i10) {
            if (!RtspMediaPeriod.this.prepared) {
                RtspMediaPeriod.this.preparationError = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                RtspMediaPeriod.this.playbackException = new RtspMediaSource.RtspPlaybackException(rtpDataLoadable.rtspMediaTrack.uri.toString(), iOException);
            } else if (RtspMediaPeriod.access$1008(RtspMediaPeriod.this) < 3) {
                return Loader.RETRY;
            }
            return Loader.DONT_RETRY;
        }
    }

    interface Listener {
        void onSeekingUnsupported();

        void onSourceInfoRefreshed(RtspSessionTiming rtspSessionTiming);
    }

    final class RtpLoadInfo {
        private final RtpDataLoadable loadable;
        public final RtspMediaTrack mediaTrack;

        @Nullable
        private String transport;

        public RtpLoadInfo(RtspMediaTrack rtspMediaTrack, int i10, RtpDataChannel.Factory factory) {
            this.mediaTrack = rtspMediaTrack;
            this.loadable = new RtpDataLoadable(i10, rtspMediaTrack, new RtpDataLoadable.EventListener() { // from class: com.google.android.exoplayer2.source.rtsp.h
                @Override // com.google.android.exoplayer2.source.rtsp.RtpDataLoadable.EventListener
                public final void onTransportReady(String str, RtpDataChannel rtpDataChannel) {
                    RtspMediaPeriod.RtpLoadInfo.a(this.f25121a, str, rtpDataChannel);
                }
            }, RtspMediaPeriod.this.internalListener, factory);
        }

        public static /* synthetic */ void a(RtpLoadInfo rtpLoadInfo, String str, RtpDataChannel rtpDataChannel) {
            rtpLoadInfo.transport = str;
            RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener = rtpDataChannel.getInterleavedBinaryDataListener();
            if (interleavedBinaryDataListener != null) {
                RtspMediaPeriod.this.rtspClient.registerInterleavedDataChannel(rtpDataChannel.getLocalPort(), interleavedBinaryDataListener);
                RtspMediaPeriod.this.isUsingRtpTcp = true;
            }
            RtspMediaPeriod.this.maybeSetupTracks();
        }

        public Uri getTrackUri() {
            return this.loadable.rtspMediaTrack.uri;
        }

        public String getTransport() {
            Assertions.checkStateNotNull(this.transport);
            return this.transport;
        }

        public boolean isTransportReady() {
            return this.transport != null;
        }
    }

    private final class RtspLoaderWrapper {
        private boolean canceled;
        public final RtpLoadInfo loadInfo;
        private final Loader loader;
        private boolean released;
        private final SampleQueue sampleQueue;

        public RtspLoaderWrapper(RtspMediaTrack rtspMediaTrack, int i10, RtpDataChannel.Factory factory) {
            this.loadInfo = RtspMediaPeriod.this.new RtpLoadInfo(rtspMediaTrack, i10, factory);
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb2.append(i10);
            this.loader = new Loader(sb2.toString());
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(RtspMediaPeriod.this.allocator);
            this.sampleQueue = sampleQueueCreateWithoutDrm;
            sampleQueueCreateWithoutDrm.setUpstreamFormatChangeListener(RtspMediaPeriod.this.internalListener);
        }

        public void cancelLoad() {
            if (this.canceled) {
                return;
            }
            this.loadInfo.loadable.cancelLoad();
            this.canceled = true;
            RtspMediaPeriod.this.updateLoadingFinished();
        }

        public long getBufferedPositionUs() {
            return this.sampleQueue.getLargestQueuedTimestampUs();
        }

        public boolean isSampleQueueReady() {
            return this.sampleQueue.isReady(this.canceled);
        }

        public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i10, this.canceled);
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.loader.release();
            this.sampleQueue.release();
            this.released = true;
        }

        public void seekTo(long j10) {
            if (this.canceled) {
                return;
            }
            this.loadInfo.loadable.resetForSeek();
            this.sampleQueue.reset();
            this.sampleQueue.setStartTimeUs(j10);
        }

        public int skipData(long j10) throws Throwable {
            int skipCount = this.sampleQueue.getSkipCount(j10, this.canceled);
            this.sampleQueue.skip(skipCount);
            return skipCount;
        }

        public void startLoading() {
            this.loader.startLoading(this.loadInfo.loadable, RtspMediaPeriod.this.internalListener, 0);
        }
    }

    private final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i10) {
            this.track = i10;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return RtspMediaPeriod.this.isReady(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
            if (RtspMediaPeriod.this.playbackException != null) {
                throw RtspMediaPeriod.this.playbackException;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
            return RtspMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i10);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j10) {
            return RtspMediaPeriod.this.skipData(this.track, j10);
        }
    }

    public RtspMediaPeriod(Allocator allocator, RtpDataChannel.Factory factory, Uri uri, Listener listener, String str, SocketFactory socketFactory, boolean z10) {
        this.allocator = allocator;
        this.rtpDataChannelFactory = factory;
        this.listener = listener;
        InternalListener internalListener = new InternalListener();
        this.internalListener = internalListener;
        this.rtspClient = new RtspClient(internalListener, internalListener, str, uri, socketFactory, z10);
        this.rtspLoaderWrappers = new ArrayList();
        this.selectedLoadInfos = new ArrayList();
        this.pendingSeekPositionUs = -9223372036854775807L;
        this.requestedSeekPositionUs = -9223372036854775807L;
        this.pendingSeekPositionUsForTcpRetry = -9223372036854775807L;
    }

    static /* synthetic */ int access$1008(RtspMediaPeriod rtspMediaPeriod) {
        int i10 = rtspMediaPeriod.portBindingRetryCount;
        rtspMediaPeriod.portBindingRetryCount = i10 + 1;
        return i10;
    }

    private static ImmutableList<TrackGroup> buildTrackGroups(ImmutableList<RtspLoaderWrapper> immutableList) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            builder.add(new TrackGroup(Integer.toString(i10), (Format) Assertions.checkNotNull(immutableList.get(i10).sampleQueue.getUpstreamFormat())));
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public RtpDataLoadable getLoadableByTrackUri(Uri uri) {
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            if (!this.rtspLoaderWrappers.get(i10).canceled) {
                RtpLoadInfo rtpLoadInfo = this.rtspLoaderWrappers.get(i10).loadInfo;
                if (rtpLoadInfo.getTrackUri().equals(uri)) {
                    return rtpLoadInfo.loadable;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSeekPending() {
        return this.pendingSeekPositionUs != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (this.released || this.prepared) {
            return;
        }
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            if (this.rtspLoaderWrappers.get(i10).sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.prepared = true;
        this.trackGroups = buildTrackGroups(ImmutableList.copyOf((Collection) this.rtspLoaderWrappers));
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeSetupTracks() {
        boolean zIsTransportReady = true;
        for (int i10 = 0; i10 < this.selectedLoadInfos.size(); i10++) {
            zIsTransportReady &= this.selectedLoadInfos.get(i10).isTransportReady();
        }
        if (zIsTransportReady && this.trackSelected) {
            this.rtspClient.setupSelectedTracks(this.selectedLoadInfos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void retryWithRtpTcp() {
        this.rtspClient.retryWithRtpTcp();
        RtpDataChannel.Factory factoryCreateFallbackDataChannelFactory = this.rtpDataChannelFactory.createFallbackDataChannelFactory();
        if (factoryCreateFallbackDataChannelFactory == null) {
            this.playbackException = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.rtspLoaderWrappers.size());
        ArrayList arrayList2 = new ArrayList(this.selectedLoadInfos.size());
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i10);
            if (rtspLoaderWrapper.canceled) {
                arrayList.add(rtspLoaderWrapper);
            } else {
                RtspLoaderWrapper rtspLoaderWrapper2 = new RtspLoaderWrapper(rtspLoaderWrapper.loadInfo.mediaTrack, i10, factoryCreateFallbackDataChannelFactory);
                arrayList.add(rtspLoaderWrapper2);
                rtspLoaderWrapper2.startLoading();
                if (this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                    arrayList2.add(rtspLoaderWrapper2.loadInfo);
                }
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.rtspLoaderWrappers);
        this.rtspLoaderWrappers.clear();
        this.rtspLoaderWrappers.addAll(arrayList);
        this.selectedLoadInfos.clear();
        this.selectedLoadInfos.addAll(arrayList2);
        for (int i11 = 0; i11 < immutableListCopyOf.size(); i11++) {
            ((RtspLoaderWrapper) immutableListCopyOf.get(i11)).cancelLoad();
        }
    }

    private boolean seekInsideBufferUs(long j10) {
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            if (!this.rtspLoaderWrappers.get(i10).sampleQueue.seekTo(j10, false)) {
                return false;
            }
        }
        return true;
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLoadingFinished() {
        this.loadingFinished = true;
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            this.loadingFinished &= this.rtspLoaderWrappers.get(i10).canceled;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        if (isSeekPending()) {
            return;
        }
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i10);
            if (!rtspLoaderWrapper.canceled) {
                rtspLoaderWrapper.sampleQueue.discardTo(j10, z10, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.loadingFinished || this.rtspLoaderWrappers.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.requestedSeekPositionUs;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        boolean z10 = true;
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i10);
            if (!rtspLoaderWrapper.canceled) {
                jMin = Math.min(jMin, rtspLoaderWrapper.getBufferedPositionUs());
                z10 = false;
            }
        }
        if (z10 || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return getStreamKeys((List<ExoTrackSelection>) list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        Assertions.checkState(this.prepared);
        return new TrackGroupArray((TrackGroup[]) ((ImmutableList) Assertions.checkNotNull(this.trackGroups)).toArray(new TrackGroup[0]));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return !this.loadingFinished;
    }

    boolean isReady(int i10) {
        return !suppressRead() && this.rtspLoaderWrappers.get(i10).isSampleQueueReady();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.preparationError;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        try {
            this.rtspClient.start();
        } catch (IOException e10) {
            this.preparationError = e10;
            Util.closeQuietly(this.rtspClient);
        }
    }

    int readData(int i10, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (suppressRead()) {
            return -3;
        }
        return this.rtspLoaderWrappers.get(i10).read(formatHolder, decoderInputBuffer, i11);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifyDiscontinuity) {
            return -9223372036854775807L;
        }
        this.notifyDiscontinuity = false;
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
    }

    public void release() {
        for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
            this.rtspLoaderWrappers.get(i10).release();
        }
        Util.closeQuietly(this.rtspClient);
        this.released = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j10) {
        if (getBufferedPositionUs() == 0 && !this.isUsingRtpTcp) {
            this.pendingSeekPositionUsForTcpRetry = j10;
            return j10;
        }
        discardBuffer(j10, false);
        this.requestedSeekPositionUs = j10;
        if (isSeekPending()) {
            int state = this.rtspClient.getState();
            if (state != 1) {
                if (state != 2) {
                    throw new IllegalStateException();
                }
                this.pendingSeekPositionUs = j10;
                this.rtspClient.seekToUs(j10);
                return j10;
            }
        } else if (!seekInsideBufferUs(j10)) {
            this.pendingSeekPositionUs = j10;
            this.rtspClient.seekToUs(j10);
            for (int i10 = 0; i10 < this.rtspLoaderWrappers.size(); i10++) {
                this.rtspLoaderWrappers.get(i10).seekTo(j10);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            if (sampleStreamArr[i10] != null && (exoTrackSelectionArr[i10] == null || !zArr[i10])) {
                sampleStreamArr[i10] = null;
            }
        }
        this.selectedLoadInfos.clear();
        for (int i11 = 0; i11 < exoTrackSelectionArr.length; i11++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i11];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int iIndexOf = ((ImmutableList) Assertions.checkNotNull(this.trackGroups)).indexOf(trackGroup);
                this.selectedLoadInfos.add(((RtspLoaderWrapper) Assertions.checkNotNull(this.rtspLoaderWrappers.get(iIndexOf))).loadInfo);
                if (this.trackGroups.contains(trackGroup) && sampleStreamArr[i11] == null) {
                    sampleStreamArr[i11] = new SampleStreamImpl(iIndexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.rtspLoaderWrappers.size(); i12++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i12);
            if (!this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                rtspLoaderWrapper.cancelLoad();
            }
        }
        this.trackSelected = true;
        maybeSetupTracks();
        return j10;
    }

    int skipData(int i10, long j10) {
        if (suppressRead()) {
            return -3;
        }
        return this.rtspLoaderWrappers.get(i10).skipData(j10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public ImmutableList<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return ImmutableList.of();
    }
}
