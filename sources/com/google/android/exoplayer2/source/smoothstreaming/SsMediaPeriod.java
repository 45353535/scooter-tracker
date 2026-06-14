package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class SsMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<SsChunkSource>> {
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final SsChunkSource.Factory chunkSourceFactory;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private ChunkSampleStream<SsChunkSource>[] sampleStreams;
    private final TrackGroupArray trackGroups;

    @Nullable
    private final TransferListener transferListener;

    public SsMediaPeriod(SsManifest ssManifest, SsChunkSource.Factory factory, @Nullable TransferListener transferListener, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, LoaderErrorThrower loaderErrorThrower, Allocator allocator) {
        this.manifest = ssManifest;
        this.chunkSourceFactory = factory;
        this.transferListener = transferListener;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.mediaSourceEventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.trackGroups = buildTrackGroups(ssManifest, drmSessionManager);
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(0);
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(chunkSampleStreamArrNewSampleStreamArray);
    }

    private ChunkSampleStream<SsChunkSource> buildSampleStream(ExoTrackSelection exoTrackSelection, long j10) {
        int iIndexOf = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
        return new ChunkSampleStream<>(this.manifest.streamElements[iIndexOf].type, null, null, this.chunkSourceFactory.createChunkSource(this.manifestLoaderErrorThrower, this.manifest, iIndexOf, exoTrackSelection, this.transferListener), this, this.allocator, j10, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.mediaSourceEventDispatcher);
    }

    private static TrackGroupArray buildTrackGroups(SsManifest ssManifest, DrmSessionManager drmSessionManager) {
        TrackGroup[] trackGroupArr = new TrackGroup[ssManifest.streamElements.length];
        int i10 = 0;
        while (true) {
            SsManifest.StreamElement[] streamElementArr = ssManifest.streamElements;
            if (i10 >= streamElementArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = streamElementArr[i10].formats;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i11 = 0; i11 < formatArr.length; i11++) {
                Format format = formatArr[i11];
                formatArr2[i11] = format.copyWithCryptoType(drmSessionManager.getCryptoType(format));
            }
            trackGroupArr[i10] = new TrackGroup(Integer.toString(i10), formatArr2);
            i10++;
        }
    }

    private static ChunkSampleStream<SsChunkSource>[] newSampleStreamArray(int i10) {
        return new ChunkSampleStream[i10];
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j10) {
        return this.compositeSequenceableLoader.continueLoading(j10);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j10, boolean z10) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.discardBuffer(j10, z10);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(j10, seekParameters);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ExoTrackSelection exoTrackSelection = list.get(i10);
            int iIndexOf = this.trackGroups.indexOf(exoTrackSelection.getTrackGroup());
            for (int i11 = 0; i11 < exoTrackSelection.length(); i11++) {
                arrayList.add(new StreamKey(iIndexOf, exoTrackSelection.getIndexInTrackGroup(i11)));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j10) {
        this.callback = callback;
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j10) {
        this.compositeSequenceableLoader.reevaluateBuffer(j10);
    }

    public void release() {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.release();
        }
        this.callback = null;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j10) throws Throwable {
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            chunkSampleStream.seekToUs(j10);
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j10) {
        ExoTrackSelection exoTrackSelection;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
            SampleStream sampleStream = sampleStreamArr[i10];
            if (sampleStream != null) {
                ChunkSampleStream chunkSampleStream = (ChunkSampleStream) sampleStream;
                if (exoTrackSelectionArr[i10] == null || !zArr[i10]) {
                    chunkSampleStream.release();
                    sampleStreamArr[i10] = null;
                } else {
                    ((SsChunkSource) chunkSampleStream.getChunkSource()).updateTrackSelection(exoTrackSelectionArr[i10]);
                    arrayList.add(chunkSampleStream);
                }
            }
            if (sampleStreamArr[i10] == null && (exoTrackSelection = exoTrackSelectionArr[i10]) != null) {
                ChunkSampleStream<SsChunkSource> chunkSampleStreamBuildSampleStream = buildSampleStream(exoTrackSelection, j10);
                arrayList.add(chunkSampleStreamBuildSampleStream);
                sampleStreamArr[i10] = chunkSampleStreamBuildSampleStream;
                zArr2[i10] = true;
            }
        }
        ChunkSampleStream<SsChunkSource>[] chunkSampleStreamArrNewSampleStreamArray = newSampleStreamArray(arrayList.size());
        this.sampleStreams = chunkSampleStreamArrNewSampleStreamArray;
        arrayList.toArray(chunkSampleStreamArrNewSampleStreamArray);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.sampleStreams);
        return j10;
    }

    public void updateManifest(SsManifest ssManifest) {
        this.manifest = ssManifest;
        for (ChunkSampleStream<SsChunkSource> chunkSampleStream : this.sampleStreams) {
            ((SsChunkSource) chunkSampleStream.getChunkSource()).updateManifest(ssManifest);
        }
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(ChunkSampleStream<SsChunkSource> chunkSampleStream) {
        this.callback.onContinueLoadingRequested(this);
    }
}
