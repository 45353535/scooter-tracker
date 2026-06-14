package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final DataSource encryptionDataSource;

    @Nullable
    private Uri expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;

    @Nullable
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private final DataSource mediaDataSource;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private final PlayerId playerId;
    private final Format[] playlistFormats;
    private final HlsPlaylistTracker playlistTracker;
    private final Uri[] playlistUrls;
    private boolean seenExpectedPlaylistError;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;
    private final FullSegmentEncryptionKeyCache keyCache = new FullSegmentEncryptionKeyCache(4);
    private byte[] scratchSpace = Util.EMPTY_BYTE_ARRAY;
    private long liveEdgeInPeriodTimeUs = -9223372036854775807L;

    private static final class EncryptionKeyChunk extends DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, @Nullable Object obj, byte[] bArr) {
            super(dataSource, dataSpec, 3, format, i10, obj, bArr);
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        protected void consume(byte[] bArr, int i10) {
            this.result = Arrays.copyOf(bArr, i10);
        }

        @Nullable
        public byte[] getResult() {
            return this.result;
        }
    }

    public static final class HlsChunkHolder {

        @Nullable
        public Chunk chunk;
        public boolean endOfStream;

        @Nullable
        public Uri playlistUrl;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }
    }

    @VisibleForTesting
    static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(String str, long j10, List<HlsMediaPlaylist.SegmentBase> list) {
            super(0L, list.size() - 1);
            this.playlistBaseUri = str;
            this.startOfPlaylistInPeriodUs = j10;
            this.segmentBases = list;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return this.startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.startOfPlaylistInPeriodUs + this.segmentBases.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.segmentBases.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.playlistBaseUri, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    private static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(iArr[0]));
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
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
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (isBlacklisted(this.selectedIndex, jElapsedRealtime)) {
                for (int i10 = this.length - 1; i10 >= 0; i10--) {
                    if (!isBlacklisted(i10, jElapsedRealtime)) {
                        this.selectedIndex = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long j10, int i10) {
            this.segmentBase = segmentBase;
            this.mediaSequence = j10;
            this.partIndex = i10;
            this.isPreload = (segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable List<Format> list, PlayerId playerId) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.playlistUrls = uriArr;
        this.playlistFormats = formatArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider;
        this.muxedCaptionFormats = list;
        this.playerId = playerId;
        DataSource dataSourceCreateDataSource = hlsDataSourceFactory.createDataSource(1);
        this.mediaDataSource = dataSourceCreateDataSource;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((formatArr[i10].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.trackSelection = new InitializationTrackSelection(this.trackGroup, Ints.toArray(arrayList));
    }

    @Nullable
    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist hlsMediaPlaylist, @Nullable HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, str);
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(@Nullable HlsMediaChunk hlsMediaChunk, boolean z10, HlsMediaPlaylist hlsMediaPlaylist, long j10, long j11) {
        if (hlsMediaChunk != null && !z10) {
            if (!hlsMediaChunk.isLoadCompleted()) {
                return new Pair<>(Long.valueOf(hlsMediaChunk.chunkIndex), Integer.valueOf(hlsMediaChunk.partIndex));
            }
            Long lValueOf = Long.valueOf(hlsMediaChunk.partIndex == -1 ? hlsMediaChunk.getNextChunkIndex() : hlsMediaChunk.chunkIndex);
            int i10 = hlsMediaChunk.partIndex;
            return new Pair<>(lValueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = hlsMediaPlaylist.durationUs + j10;
        if (hlsMediaChunk != null && !this.independentSegments) {
            j11 = hlsMediaChunk.startTimeUs;
        }
        if (!hlsMediaPlaylist.hasEndTag && j11 >= j12) {
            return new Pair<>(Long.valueOf(hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) hlsMediaPlaylist.segments, Long.valueOf(j13), true, !this.playlistTracker.isLive() || hlsMediaChunk == null);
        long j14 = ((long) iBinarySearchFloor) + hlsMediaPlaylist.mediaSequence;
        if (iBinarySearchFloor >= 0) {
            HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(iBinarySearchFloor);
            List<HlsMediaPlaylist.Part> list = j13 < segment.relativeStartTimeUs + segment.durationUs ? segment.parts : hlsMediaPlaylist.trailingParts;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                HlsMediaPlaylist.Part part = list.get(i11);
                if (j13 >= part.relativeStartTimeUs + part.durationUs) {
                    i11++;
                } else if (part.isIndependent) {
                    j14 += list == hlsMediaPlaylist.trailingParts ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(i));
    }

    @Nullable
    private static SegmentBaseHolder getNextSegmentHolder(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 == hlsMediaPlaylist.segments.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < hlsMediaPlaylist.trailingParts.size()) {
                return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(i10), j10, i10);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
        if (i10 == -1) {
            return new SegmentBaseHolder(segment, j10, -1);
        }
        if (i10 < segment.parts.size()) {
            return new SegmentBaseHolder(segment.parts.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < hlsMediaPlaylist.segments.size()) {
            return new SegmentBaseHolder(hlsMediaPlaylist.segments.get(i12), j10 + 1, -1);
        }
        if (hlsMediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new SegmentBaseHolder(hlsMediaPlaylist.trailingParts.get(0), j10 + 1, 0);
    }

    @VisibleForTesting
    static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist hlsMediaPlaylist, long j10, int i10) {
        int i11 = (int) (j10 - hlsMediaPlaylist.mediaSequence);
        if (i11 < 0 || hlsMediaPlaylist.segments.size() < i11) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < hlsMediaPlaylist.segments.size()) {
            if (i10 != -1) {
                HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i11);
                if (i10 == 0) {
                    arrayList.add(segment);
                } else if (i10 < segment.parts.size()) {
                    List<HlsMediaPlaylist.Part> list = segment.parts;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<HlsMediaPlaylist.Segment> list2 = hlsMediaPlaylist.segments;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (hlsMediaPlaylist.partTargetDurationUs != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < hlsMediaPlaylist.trailingParts.size()) {
                List<HlsMediaPlaylist.Part> list3 = hlsMediaPlaylist.trailingParts;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Nullable
    private Chunk maybeCreateEncryptionChunkFor(@Nullable Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemove = this.keyCache.remove(uri);
        if (bArrRemove != null) {
            this.keyCache.put(uri, bArrRemove);
            return null;
        }
        return new EncryptionKeyChunk(this.encryptionDataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), this.playlistFormats[i10], this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.scratchSpace);
    }

    private long resolveTimeToLiveEdgeUs(long j10) {
        long j11 = this.liveEdgeInPeriodTimeUs;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        this.liveEdgeInPeriodTimeUs = hlsMediaPlaylist.hasEndTag ? -9223372036854775807L : hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
    }

    public MediaChunkIterator[] createMediaChunkIterators(@Nullable HlsMediaChunk hlsMediaChunk, long j10) {
        int iIndexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i10 = 0; i10 < length; i10++) {
            int indexInTrackGroup = this.trackSelection.getIndexInTrackGroup(i10);
            Uri uri = this.playlistUrls[indexInTrackGroup];
            if (this.playlistTracker.isSnapshotValid(uri)) {
                HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, false);
                Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, indexInTrackGroup != iIndexOf, playlistSnapshot, initialStartTimeUs, j10);
                mediaChunkIteratorArr[i10] = new HlsMediaPlaylistSegmentIterator(playlistSnapshot.baseUri, initialStartTimeUs, getSegmentBaseList(playlistSnapshot, ((Long) nextMediaSequenceAndPartIndex.first).longValue(), ((Integer) nextMediaSequenceAndPartIndex.second).intValue()));
            } else {
                mediaChunkIteratorArr[i10] = MediaChunkIterator.EMPTY;
            }
        }
        return mediaChunkIteratorArr;
    }

    public long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters) {
        int selectedIndex = this.trackSelection.getSelectedIndex();
        Uri[] uriArr = this.playlistUrls;
        HlsMediaPlaylist playlistSnapshot = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.playlistTracker.getPlaylistSnapshot(uriArr[this.trackSelection.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot == null || playlistSnapshot.segments.isEmpty() || !playlistSnapshot.hasIndependentSegments) {
            return j10;
        }
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        long j11 = j10 - initialStartTimeUs;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) playlistSnapshot.segments, Long.valueOf(j11), true, true);
        long j12 = playlistSnapshot.segments.get(iBinarySearchFloor).relativeStartTimeUs;
        return seekParameters.resolveSeekPositionUs(j11, j12, iBinarySearchFloor != playlistSnapshot.segments.size() - 1 ? playlistSnapshot.segments.get(iBinarySearchFloor + 1).relativeStartTimeUs : j12) + initialStartTimeUs;
    }

    public int getChunkPublicationState(HlsMediaChunk hlsMediaChunk) {
        if (hlsMediaChunk.partIndex == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) Assertions.checkNotNull(this.playlistTracker.getPlaylistSnapshot(this.playlistUrls[this.trackGroup.indexOf(hlsMediaChunk.trackFormat)], false));
        int i10 = (int) (hlsMediaChunk.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i10 < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i10 < hlsMediaPlaylist.segments.size() ? hlsMediaPlaylist.segments.get(i10).parts : hlsMediaPlaylist.trailingParts;
        if (hlsMediaChunk.partIndex >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(hlsMediaChunk.partIndex);
        if (part.isPreload) {
            return 0;
        }
        return Util.areEqual(Uri.parse(UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), hlsMediaChunk.dataSpec.uri) ? 1 : 2;
    }

    public void getNextChunk(long j10, long j11, List<HlsMediaChunk> list, boolean z10, HlsChunkHolder hlsChunkHolder) {
        int i10;
        HlsMediaChunk hlsMediaChunk = list.isEmpty() ? null : (HlsMediaChunk) Iterables.getLast(list);
        int iIndexOf = hlsMediaChunk == null ? -1 : this.trackGroup.indexOf(hlsMediaChunk.trackFormat);
        long jMax = j11 - j10;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j10);
        if (hlsMediaChunk != null && !this.independentSegments) {
            long durationUs = hlsMediaChunk.getDurationUs();
            jMax = Math.max(0L, jMax - durationUs);
            if (jResolveTimeToLiveEdgeUs != -9223372036854775807L) {
                jResolveTimeToLiveEdgeUs = Math.max(0L, jResolveTimeToLiveEdgeUs - durationUs);
            }
        }
        this.trackSelection.updateSelectedTrack(j10, jMax, jResolveTimeToLiveEdgeUs, list, createMediaChunkIterators(hlsMediaChunk, j11));
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z11 = iIndexOf != selectedIndexInTrackGroup;
        Uri uri = this.playlistUrls[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(uri)) {
            hlsChunkHolder.playlistUrl = uri;
            this.seenExpectedPlaylistError &= uri.equals(this.expectedPlaylistUrl);
            this.expectedPlaylistUrl = uri;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, true);
        Assertions.checkNotNull(playlistSnapshot);
        this.independentSegments = playlistSnapshot.hasIndependentSegments;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        Pair<Long, Integer> nextMediaSequenceAndPartIndex = getNextMediaSequenceAndPartIndex(hlsMediaChunk, z11, playlistSnapshot, initialStartTimeUs, j11);
        long jLongValue = ((Long) nextMediaSequenceAndPartIndex.first).longValue();
        int iIntValue = ((Integer) nextMediaSequenceAndPartIndex.second).intValue();
        int i11 = iIndexOf;
        if (jLongValue >= playlistSnapshot.mediaSequence || hlsMediaChunk == null || !z11) {
            i10 = selectedIndexInTrackGroup;
        } else {
            uri = this.playlistUrls[i11];
            playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(uri, true);
            Assertions.checkNotNull(playlistSnapshot);
            initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            Pair<Long, Integer> nextMediaSequenceAndPartIndex2 = getNextMediaSequenceAndPartIndex(hlsMediaChunk, false, playlistSnapshot, initialStartTimeUs, j11);
            jLongValue = ((Long) nextMediaSequenceAndPartIndex2.first).longValue();
            iIntValue = ((Integer) nextMediaSequenceAndPartIndex2.second).intValue();
            i10 = i11;
        }
        Uri uri2 = uri;
        HlsMediaPlaylist hlsMediaPlaylist = playlistSnapshot;
        if (jLongValue < hlsMediaPlaylist.mediaSequence) {
            this.fatalError = new BehindLiveWindowException();
            return;
        }
        SegmentBaseHolder nextSegmentHolder = getNextSegmentHolder(hlsMediaPlaylist, jLongValue, iIntValue);
        if (nextSegmentHolder == null) {
            if (!hlsMediaPlaylist.hasEndTag) {
                hlsChunkHolder.playlistUrl = uri2;
                this.seenExpectedPlaylistError &= uri2.equals(this.expectedPlaylistUrl);
                this.expectedPlaylistUrl = uri2;
                return;
            } else {
                if (z10 || hlsMediaPlaylist.segments.isEmpty()) {
                    hlsChunkHolder.endOfStream = true;
                    return;
                }
                nextSegmentHolder = new SegmentBaseHolder((HlsMediaPlaylist.SegmentBase) Iterables.getLast(hlsMediaPlaylist.segments), (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())) - 1, -1);
            }
        }
        this.seenExpectedPlaylistError = false;
        this.expectedPlaylistUrl = null;
        Uri fullEncryptionKeyUri = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase.initializationSegment);
        Chunk chunkMaybeCreateEncryptionChunkFor = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri, i10);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor;
        if (chunkMaybeCreateEncryptionChunkFor != null) {
            return;
        }
        Uri fullEncryptionKeyUri2 = getFullEncryptionKeyUri(hlsMediaPlaylist, nextSegmentHolder.segmentBase);
        Chunk chunkMaybeCreateEncryptionChunkFor2 = maybeCreateEncryptionChunkFor(fullEncryptionKeyUri2, i10);
        hlsChunkHolder.chunk = chunkMaybeCreateEncryptionChunkFor2;
        if (chunkMaybeCreateEncryptionChunkFor2 != null) {
            return;
        }
        long j12 = initialStartTimeUs;
        boolean zShouldSpliceIn = HlsMediaChunk.shouldSpliceIn(hlsMediaChunk, uri2, hlsMediaPlaylist, nextSegmentHolder, j12);
        if (zShouldSpliceIn && nextSegmentHolder.isPreload) {
            return;
        }
        hlsChunkHolder.chunk = HlsMediaChunk.createInstance(this.extractorFactory, this.mediaDataSource, this.playlistFormats[i10], j12, hlsMediaPlaylist, nextSegmentHolder, uri2, this.muxedCaptionFormats, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.isTimestampMaster, this.timestampAdjusterProvider, hlsMediaChunk, this.keyCache.get(fullEncryptionKeyUri2), this.keyCache.get(fullEncryptionKeyUri), zShouldSpliceIn, this.playerId);
    }

    public int getPreferredQueueSize(long j10, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j10, list);
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public ExoTrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public boolean maybeExcludeTrack(Chunk chunk, long j10) {
        ExoTrackSelection exoTrackSelection = this.trackSelection;
        return exoTrackSelection.blacklist(exoTrackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), j10);
    }

    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.expectedPlaylistUrl;
        if (uri == null || !this.seenExpectedPlaylistError) {
            return;
        }
        this.playlistTracker.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean obtainsChunksForPlaylist(Uri uri) {
        return Util.contains(this.playlistUrls, uri);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            this.keyCache.put(encryptionKeyChunk.dataSpec.uri, (byte[]) Assertions.checkNotNull(encryptionKeyChunk.getResult()));
        }
    }

    public boolean onPlaylistError(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.playlistUrls;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.trackSelection.indexOf(i10)) == -1) {
            return true;
        }
        this.seenExpectedPlaylistError |= uri.equals(this.expectedPlaylistUrl);
        return j10 == -9223372036854775807L || (this.trackSelection.blacklist(iIndexOf, j10) && this.playlistTracker.excludeMediaPlaylist(uri, j10));
    }

    public void reset() {
        this.fatalError = null;
    }

    public void setIsTimestampMaster(boolean z10) {
        this.isTimestampMaster = z10;
    }

    public void setTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    public boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j10, chunk, list);
    }
}
