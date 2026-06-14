package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;

    @Nullable
    private IOException fatalError;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i10, int[] iArr, ExoTrackSelection exoTrackSelection, int i11, long j10, boolean z10, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i10, iArr, exoTrackSelection, i11, dataSourceCreateDataSource, j10, this.maxSegmentsPerLoad, z10, list, playerTrackEmsgHandler, playerId);
        }

        public Factory(DataSource.Factory factory, int i10) {
            this(BundledChunkExtractor.FACTORY, factory, i10);
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i10) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i10;
        }
    }

    protected static final class RepresentationHolder {

        @Nullable
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        RepresentationHolder(long j10, Representation representation, BaseUrl baseUrl, @Nullable ChunkExtractor chunkExtractor, long j11, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j10;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j11;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        @CheckResult
        RepresentationHolder copyWithNewRepresentation(long j10, Representation representation) throws BehindLiveWindowException {
            long segmentNum;
            long segmentNum2;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j10, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j10, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j10);
            if (segmentCount == 0) {
                return new RepresentationHolder(j10, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j11 = segmentCount + firstSegmentNum;
            long j12 = j11 - 1;
            long timeUs2 = index.getTimeUs(j12) + index.getDurationUs(j12, j10);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j13 = this.segmentNumShift;
            if (timeUs2 == timeUs3) {
                segmentNum = j11 - firstSegmentNum2;
            } else {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j13 - (index2.getSegmentNum(timeUs, j10) - firstSegmentNum);
                    return new RepresentationHolder(j10, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
                }
                segmentNum = index.getSegmentNum(timeUs3, j10) - firstSegmentNum2;
            }
            segmentNum2 = j13 + segmentNum;
            return new RepresentationHolder(j10, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
        }

        @CheckResult
        RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        @CheckResult
        RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public long getFirstAvailableSegmentNum(long j10) {
            return this.segmentIndex.getFirstAvailableSegmentNum(this.periodDurationUs, j10) + this.segmentNumShift;
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getLastAvailableSegmentNum(long j10) {
            return (getFirstAvailableSegmentNum(j10) + this.segmentIndex.getAvailableSegmentCount(this.periodDurationUs, j10)) - 1;
        }

        public long getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentEndTimeUs(long j10) {
            return getSegmentStartTimeUs(j10) + this.segmentIndex.getDurationUs(j10 - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j10) {
            return this.segmentIndex.getSegmentNum(j10, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j10) {
            return this.segmentIndex.getTimeUs(j10 - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j10) {
            return this.segmentIndex.getSegmentUrl(j10 - this.segmentNumShift);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long j10, long j11) {
            return this.segmentIndex.isExplicit() || j11 == -9223372036854775807L || getSegmentEndTimeUs(j10) <= j11;
        }
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j10, long j11, long j12) {
            super(j10, j11);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j12;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.representationHolder.getSegmentUrl(currentIndex);
            int i10 = this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8;
            RepresentationHolder representationHolder = this.representationHolder;
            return DashUtil.buildDataSpec(representationHolder.representation, representationHolder.selectedBaseUrl.url, segmentUrl, i10);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i10, int[] iArr, ExoTrackSelection exoTrackSelection, int i11, DataSource dataSource, long j10, int i12, boolean z10, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        int i13 = i11;
        this.trackType = i13;
        this.dataSource = dataSource;
        this.periodIndex = i10;
        this.elapsedRealtimeOffsetMs = j10;
        this.maxSegmentsPerLoad = i12;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler2 = playerTrackEmsgHandler;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler2;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i10);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i14 = 0;
        while (i14 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i14));
            BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            BaseUrl baseUrl = baseUrlSelectBaseUrl == null ? representation.baseUrls.get(0) : baseUrlSelectBaseUrl;
            ChunkExtractor chunkExtractorCreateProgressiveMediaExtractor = factory.createProgressiveMediaExtractor(i13, representation.format, z10, list, playerTrackEmsgHandler2, playerId);
            long j11 = periodDurationUs;
            representationHolderArr[i14] = new RepresentationHolder(j11, representation, baseUrl, chunkExtractorCreateProgressiveMediaExtractor, 0L, representation.getIndex());
            i14++;
            playerTrackEmsgHandler2 = playerTrackEmsgHandler;
            periodDurationUs = j11;
            i13 = i11;
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (exoTrackSelection.isBlacklisted(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i10);
    }

    private long getAvailableLiveDurationUs(long j10, long j11) {
        if (!this.manifest.dynamic) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j10), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j10))) - j11);
    }

    private long getNowPeriodTimeUs(long j10) {
        DashManifest dashManifest = this.manifest;
        long j11 = dashManifest.availabilityStartTimeMs;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - Util.msToUs(j11 + dashManifest.getPeriod(this.periodIndex).startMs);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i10 : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i10).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j10, long j11, long j12) {
        return mediaChunk != null ? mediaChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(j10), j11, j12);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i10) {
        RepresentationHolder representationHolder = this.representationHolders[i10];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (baseUrlSelectBaseUrl == null || baseUrlSelectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder representationHolderCopyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(baseUrlSelectBaseUrl);
        this.representationHolders[i10] = representationHolderCopyWithNewSelectedBaseUrl;
        return representationHolderCopyWithNewSelectedBaseUrl;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        long j11 = j10;
        RepresentationHolder[] representationHolderArr = this.representationHolders;
        int length = representationHolderArr.length;
        int i10 = 0;
        while (i10 < length) {
            RepresentationHolder representationHolder = representationHolderArr[i10];
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(j11);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                long segmentCount = representationHolder.getSegmentCount();
                return seekParameters.resolveSeekPositionUs(j11, segmentStartTimeUs, (segmentStartTimeUs >= j11 || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
            i10++;
            j11 = j10;
        }
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void getNextChunk(long j10, long j11, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        long j12;
        int i10;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j13;
        int i11;
        MediaChunk mediaChunk;
        boolean z10;
        if (this.fatalError != null) {
            return;
        }
        long j14 = j11 - j10;
        long jMsToUs = Util.msToUs(this.manifest.availabilityStartTimeMs) + Util.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j11;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long jMsToUs2 = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
            long nowPeriodTimeUs = getNowPeriodTimeUs(jMsToUs2);
            boolean z11 = true;
            MediaChunk mediaChunk2 = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.trackSelection.length();
            MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
            int i12 = 0;
            while (i12 < length) {
                RepresentationHolder representationHolder = this.representationHolders[i12];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i12] = MediaChunkIterator.EMPTY;
                    mediaChunk = mediaChunk2;
                    i10 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    i11 = i12;
                    j12 = j14;
                    j13 = jMsToUs2;
                } else {
                    int i13 = length;
                    long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(jMsToUs2);
                    long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(jMsToUs2);
                    j12 = j14;
                    i10 = i13;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j13 = jMsToUs2;
                    MediaChunk mediaChunk3 = mediaChunk2;
                    i11 = i12;
                    long segmentNum = getSegmentNum(representationHolder, mediaChunk3, j11, firstAvailableSegmentNum, lastAvailableSegmentNum);
                    mediaChunk = mediaChunk3;
                    if (segmentNum < firstAvailableSegmentNum) {
                        mediaChunkIteratorArr[i11] = MediaChunkIterator.EMPTY;
                    } else {
                        z10 = z11;
                        mediaChunkIteratorArr[i11] = new RepresentationSegmentIterator(updateSelectedBaseUrl(i11), segmentNum, lastAvailableSegmentNum, nowPeriodTimeUs);
                        i12 = i11 + 1;
                        z11 = z10;
                        jMsToUs2 = j13;
                        j14 = j12;
                        mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                        length = i10;
                        mediaChunk2 = mediaChunk;
                    }
                }
                z10 = z11;
                i12 = i11 + 1;
                z11 = z10;
                jMsToUs2 = j13;
                j14 = j12;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                length = i10;
                mediaChunk2 = mediaChunk;
            }
            MediaChunk mediaChunk4 = mediaChunk2;
            long j15 = j14;
            long j16 = jMsToUs2;
            ?? r12 = z11;
            this.trackSelection.updateSelectedTrack(j10, j15, getAvailableLiveDurationUs(j16, j10), list, mediaChunkIteratorArr2);
            RepresentationHolder representationHolderUpdateSelectedBaseUrl = updateSelectedBaseUrl(this.trackSelection.getSelectedIndex());
            ChunkExtractor chunkExtractor = representationHolderUpdateSelectedBaseUrl.chunkExtractor;
            if (chunkExtractor != null) {
                Representation representation = representationHolderUpdateSelectedBaseUrl.representation;
                RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                RangedUri indexUri = representationHolderUpdateSelectedBaseUrl.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    chunkHolder.chunk = newInitializationChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri);
                    return;
                }
            }
            long j17 = representationHolderUpdateSelectedBaseUrl.periodDurationUs;
            boolean z12 = j17 != -9223372036854775807L ? r12 == true ? 1 : 0 : false;
            if (representationHolderUpdateSelectedBaseUrl.getSegmentCount() == 0) {
                chunkHolder.endOfStream = z12;
                return;
            }
            long firstAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getFirstAvailableSegmentNum(j16);
            long lastAvailableSegmentNum2 = representationHolderUpdateSelectedBaseUrl.getLastAvailableSegmentNum(j16);
            long segmentNum2 = getSegmentNum(representationHolderUpdateSelectedBaseUrl, mediaChunk4, j11, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
            if (segmentNum2 < firstAvailableSegmentNum2) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
            if (segmentNum2 > lastAvailableSegmentNum2 || (this.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                chunkHolder.endOfStream = z12;
                return;
            }
            if (z12 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs(segmentNum2) >= j17) {
                chunkHolder.endOfStream = r12;
                return;
            }
            int iMin = (int) Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
            if (j17 != -9223372036854775807L) {
                while (iMin > r12 && representationHolderUpdateSelectedBaseUrl.getSegmentStartTimeUs((((long) iMin) + segmentNum2) - 1) >= j17) {
                    iMin--;
                }
            }
            chunkHolder.chunk = newMediaChunk(representationHolderUpdateSelectedBaseUrl, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, iMin, list.isEmpty() ? j11 : -9223372036854775807L, nowPeriodTimeUs);
        }
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

    protected Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i10, @Nullable Object obj, @Nullable RangedUri rangedUri, @Nullable RangedUri rangedUri2) {
        RangedUri rangedUri3 = rangedUri;
        Representation representation = representationHolder.representation;
        if (rangedUri3 != null) {
            RangedUri rangedUriAttemptMerge = rangedUri3.attemptMerge(rangedUri2, representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge != null) {
                rangedUri3 = rangedUriAttemptMerge;
            }
        } else {
            rangedUri3 = rangedUri2;
        }
        return new InitializationChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, rangedUri3, 0), format, i10, obj, representationHolder.chunkExtractor);
    }

    protected Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i10, Format format, int i11, Object obj, long j10, int i12, long j11, long j12) {
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j10);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j10);
        if (representationHolder.chunkExtractor == null) {
            int i13 = 8;
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j10);
            if (representationHolder.isSegmentAvailableAtFullNetworkSpeed(j10, j12)) {
                i13 = 0;
            }
            return new SingleSampleMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, i13), format, i11, obj, segmentStartTimeUs, segmentEndTimeUs, j10, i10, format);
        }
        int i14 = 8;
        int i15 = 1;
        int i16 = 1;
        while (i15 < i12) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(j10 + ((long) i15)), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i16++;
            i15++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j13 = (j10 + ((long) i16)) - 1;
        int i17 = i16;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j13);
        long j14 = representationHolder.periodDurationUs;
        if (j14 == -9223372036854775807L || j14 > segmentEndTimeUs2) {
            j14 = -9223372036854775807L;
        }
        if (representationHolder.isSegmentAvailableAtFullNetworkSpeed(j13, j12)) {
            i14 = 0;
        }
        return new ContainerMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, i14), format, i11, obj, segmentStartTimeUs, segmentEndTimeUs2, j11, j14, j10, i17, -representation.presentationTimeOffsetUs, representationHolder.chunkExtractor);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = representationHolder.chunkExtractor.getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z10, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z10) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.missingLastSegment = true;
                        return true;
                    }
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (baseUrlSelectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(baseUrlSelectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsCreateFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((fallbackOptionsCreateFallbackOptions.isFallbackAvailable(2) || fallbackOptionsCreateFallbackOptions.isFallbackAvailable(1)) && (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsCreateFallbackOptions, loadErrorInfo)) != null && fallbackOptionsCreateFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            int i10 = fallbackSelectionFor.type;
            if (i10 == 2) {
                ExoTrackSelection exoTrackSelection = this.trackSelection;
                return exoTrackSelection.blacklist(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
            }
            if (i10 == 1) {
                this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i10) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i10;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i10);
            ArrayList<Representation> representations = getRepresentations();
            for (int i11 = 0; i11 < this.representationHolders.length; i11++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i11));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i11] = representationHolderArr[i11].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e10) {
            this.fatalError = e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }
}
