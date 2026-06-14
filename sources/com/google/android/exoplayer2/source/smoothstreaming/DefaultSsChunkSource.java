package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultSsChunkSource implements SsChunkSource {
    private final ChunkExtractor[] chunkExtractors;
    private int currentManifestChunkOffset;
    private final DataSource dataSource;

    @Nullable
    private IOException fatalError;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int streamElementIndex;
    private ExoTrackSelection trackSelection;

    public static final class Factory implements SsChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource.Factory
        public SsChunkSource createChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i10, ExoTrackSelection exoTrackSelection, @Nullable TransferListener transferListener) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultSsChunkSource(loaderErrorThrower, ssManifest, i10, exoTrackSelection, dataSourceCreateDataSource);
        }
    }

    private static final class StreamElementIterator extends BaseMediaChunkIterator {
        private final SsManifest.StreamElement streamElement;
        private final int trackIndex;

        public StreamElementIterator(SsManifest.StreamElement streamElement, int i10, int i11) {
            super(i11, streamElement.chunkCount - 1);
            this.streamElement = streamElement;
            this.trackIndex = i10;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            return getChunkStartTimeUs() + this.streamElement.getChunkDurationUs((int) getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.streamElement.getStartTimeUs((int) getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            return new DataSpec(this.streamElement.buildRequestUri(this.trackIndex, (int) getCurrentIndex()));
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i10, ExoTrackSelection exoTrackSelection, DataSource dataSource) {
        TimestampAdjuster timestampAdjuster;
        TrackEncryptionBox[] trackEncryptionBoxArr;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = ssManifest;
        this.streamElementIndex = i10;
        this.trackSelection = exoTrackSelection;
        this.dataSource = dataSource;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[i10];
        this.chunkExtractors = new ChunkExtractor[exoTrackSelection.length()];
        for (int i11 = 0; i11 < this.chunkExtractors.length; i11++) {
            int indexInTrackGroup = exoTrackSelection.getIndexInTrackGroup(i11);
            Format format = streamElement.formats[indexInTrackGroup];
            if (format.drmInitData != null) {
                trackEncryptionBoxArr = ((SsManifest.ProtectionElement) Assertions.checkNotNull(ssManifest.protectionElement)).trackEncryptionBoxes;
                timestampAdjuster = null;
            } else {
                timestampAdjuster = null;
                trackEncryptionBoxArr = null;
            }
            int i12 = streamElement.type;
            this.chunkExtractors[i11] = new BundledChunkExtractor(new FragmentedMp4Extractor(3, timestampAdjuster, new Track(indexInTrackGroup, i12, streamElement.timescale, -9223372036854775807L, ssManifest.durationUs, format, 0, trackEncryptionBoxArr, i12 == 2 ? 4 : 0, null, null)), streamElement.type, format);
        }
    }

    private static MediaChunk newMediaChunk(Format format, DataSource dataSource, Uri uri, int i10, long j10, long j11, long j12, int i11, @Nullable Object obj, ChunkExtractor chunkExtractor) {
        return new ContainerMediaChunk(dataSource, new DataSpec(uri), format, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, chunkExtractor);
    }

    private long resolveTimeToLiveEdgeUs(long j10) {
        SsManifest ssManifest = this.manifest;
        if (!ssManifest.isLive) {
            return -9223372036854775807L;
        }
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        int i10 = streamElement.chunkCount - 1;
        return (streamElement.getStartTimeUs(i10) + streamElement.getChunkDurationUs(i10)) - j10;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        int chunkIndex = streamElement.getChunkIndex(j10);
        long startTimeUs = streamElement.getStartTimeUs(chunkIndex);
        return seekParameters.resolveSeekPositionUs(j10, startTimeUs, (startTimeUs >= j10 || chunkIndex >= streamElement.chunkCount + (-1)) ? startTimeUs : streamElement.getStartTimeUs(chunkIndex + 1));
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public final void getNextChunk(long j10, long j11, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        List<? extends MediaChunk> list2;
        int nextChunkIndex;
        long j12 = j11;
        if (this.fatalError != null) {
            return;
        }
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        if (streamElement.chunkCount == 0) {
            chunkHolder.endOfStream = !r4.isLive;
            return;
        }
        if (list.isEmpty()) {
            nextChunkIndex = streamElement.getChunkIndex(j12);
            list2 = list;
        } else {
            list2 = list;
            nextChunkIndex = (int) (list2.get(list.size() - 1).getNextChunkIndex() - ((long) this.currentManifestChunkOffset));
            if (nextChunkIndex < 0) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
        }
        if (nextChunkIndex >= streamElement.chunkCount) {
            chunkHolder.endOfStream = !this.manifest.isLive;
            return;
        }
        long j13 = j12 - j10;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j10);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i10 = 0; i10 < length; i10++) {
            mediaChunkIteratorArr[i10] = new StreamElementIterator(streamElement, this.trackSelection.getIndexInTrackGroup(i10), nextChunkIndex);
        }
        this.trackSelection.updateSelectedTrack(j10, j13, jResolveTimeToLiveEdgeUs, list2, mediaChunkIteratorArr);
        long startTimeUs = streamElement.getStartTimeUs(nextChunkIndex);
        long chunkDurationUs = startTimeUs + streamElement.getChunkDurationUs(nextChunkIndex);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = nextChunkIndex + this.currentManifestChunkOffset;
        int selectedIndex = this.trackSelection.getSelectedIndex();
        chunkHolder.chunk = newMediaChunk(this.trackSelection.getSelectedFormat(), this.dataSource, streamElement.buildRequestUri(this.trackSelection.getIndexInTrackGroup(selectedIndex), nextChunkIndex), i11, startTimeUs, chunkDurationUs, j14, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.chunkExtractors[selectedIndex]);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j10, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j10, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z10, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.trackSelection), loadErrorInfo);
        if (!z10 || fallbackSelectionFor == null || fallbackSelectionFor.type != 2) {
            return false;
        }
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.blacklist(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (ChunkExtractor chunkExtractor : this.chunkExtractors) {
            chunkExtractor.release();
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateManifest(SsManifest ssManifest) {
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        int i10 = this.streamElementIndex;
        SsManifest.StreamElement streamElement = streamElementArr[i10];
        int i11 = streamElement.chunkCount;
        SsManifest.StreamElement streamElement2 = ssManifest.streamElements[i10];
        if (i11 == 0 || streamElement2.chunkCount == 0) {
            this.currentManifestChunkOffset += i11;
        } else {
            int i12 = i11 - 1;
            long startTimeUs = streamElement.getStartTimeUs(i12) + streamElement.getChunkDurationUs(i12);
            long startTimeUs2 = streamElement2.getStartTimeUs(0);
            if (startTimeUs <= startTimeUs2) {
                this.currentManifestChunkOffset += i11;
            } else {
                this.currentManifestChunkOffset += streamElement.getChunkIndex(startTimeUs2);
            }
        }
        this.manifest = ssManifest;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
