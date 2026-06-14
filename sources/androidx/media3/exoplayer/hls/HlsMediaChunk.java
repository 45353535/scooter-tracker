package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UriUtil;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.HlsChunkSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;

    @Nullable
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;

    @Nullable
    private final DataSource initDataSource;

    @Nullable
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isPrimaryTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;

    @Nullable
    private final HlsMediaChunkExtractor previousExtractor;
    private ImmutableList<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    private final long timestampAdjusterInitializationTimeoutMs;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z10, @Nullable DataSource dataSource2, @Nullable DataSpec dataSpec2, boolean z11, Uri uri, @Nullable List<Format> list, int i10, @Nullable Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, TimestampAdjuster timestampAdjuster, long j13, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z15, PlayerId playerId) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j12);
        this.mediaSegmentEncrypted = z10;
        this.partIndex = i11;
        this.isPublished = z12;
        this.discontinuitySequenceNumber = i12;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z11;
        this.playlistUrl = uri;
        this.isPrimaryTimestampSource = z14;
        this.timestampAdjuster = timestampAdjuster;
        this.timestampAdjusterInitializationTimeoutMs = j13;
        this.hasGapTag = z13;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z15;
        this.playerId = playerId;
        this.sampleQueueFirstSampleIndices = ImmutableList.of();
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j10, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, @Nullable List<Format> list, int i10, @Nullable Object obj, boolean z10, TimestampAdjusterProvider timestampAdjusterProvider, long j11, @Nullable HlsMediaChunk hlsMediaChunk, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z11, PlayerId playerId, @Nullable CmcdData.Factory factory) {
        boolean z12;
        DataSource dataSourceBuildDataSource;
        DataSpec dataSpecBuild;
        boolean z13;
        Uri uri2;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec dataSpecBuild2 = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        if (factory != null) {
            dataSpecBuild2 = factory.setChunkDurationUs(segmentBase.durationUs).createCmcdData().addToDataSpec(dataSpecBuild2);
        }
        DataSpec dataSpec = dataSpecBuild2;
        boolean z14 = bArr != null;
        DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, z14 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z15 = bArr2 != null;
            byte[] encryptionIvArray = z15 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            z12 = true;
            dataSpecBuild = new DataSpec.Builder().setUri(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url)).setPosition(segment.byteRangeOffset).setLength(segment.byteRangeLength).build();
            if (factory != null) {
                dataSpecBuild = factory.setObjectType(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT).createCmcdData().addToDataSpec(dataSpecBuild);
            }
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray);
            z13 = z15;
        } else {
            z12 = true;
            dataSourceBuildDataSource = null;
            dataSpecBuild = null;
            z13 = false;
        }
        long j12 = j10 + segmentBase.relativeStartTimeUs;
        long j13 = j12 + segmentBase.durationUs;
        int i11 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            DataSpec dataSpec2 = hlsMediaChunk.initDataSpec;
            boolean z16 = (dataSpecBuild == dataSpec2 || (dataSpecBuild != null && dataSpec2 != null && dataSpecBuild.uri.equals(dataSpec2.uri) && dataSpecBuild.position == hlsMediaChunk.initDataSpec.position)) ? z12 : false;
            uri2 = uri;
            boolean z17 = (uri2.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) ? z12 : false;
            id3Decoder = hlsMediaChunk.id3Decoder;
            parsableByteArray = hlsMediaChunk.scratchId3Data;
            hlsMediaChunkExtractor = (z16 && z17 && !hlsMediaChunk.extractorInvalidated && hlsMediaChunk.discontinuitySequenceNumber == i11) ? hlsMediaChunk.extractor : null;
        } else {
            uri2 = uri;
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec, format, z14, dataSourceBuildDataSource, dataSpecBuild, z13, uri2, list, i10, obj, j12, j13, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i11, segmentBase.hasGapTag, z10, timestampAdjusterProvider.getAdjuster(i11), j11, segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z11, playerId);
    }

    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z10, boolean z11) throws IOException {
        DataSpec dataSpecSubrange;
        long position;
        long j10;
        if (z10) {
            z = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z11);
            if (z) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.trackFormat.roleFlags & 16384) == 0) {
                            throw e10;
                        }
                        this.extractor.onTruncatedSegmentParsed();
                        position = defaultExtractorInputPrepareExtraction.getPosition();
                        j10 = dataSpec.position;
                    }
                } catch (Throwable th2) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th2;
                }
            }
            position = defaultExtractorInputPrepareExtraction.getPosition();
            j10 = dataSpec.position;
            this.nextLoadPosition = (int) (position - j10);
        } finally {
            DataSourceUtil.closeQuietly(dataSource);
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        if (!(segmentBase instanceof HlsMediaPlaylist.Part)) {
            return hlsMediaPlaylist.hasIndependentSegments;
        }
        if (((HlsMediaPlaylist.Part) segmentBase).isIndependent) {
            return true;
        }
        return segmentBaseHolder.partIndex == 0 && hlsMediaPlaylist.hasIndependentSegments;
    }

    private void loadMedia() throws IOException {
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted, true);
    }

    private void maybeLoadInitData() throws IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws Throwable {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
            return -9223372036854775807L;
        }
        this.scratchId3Data.skipBytes(3);
        int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
        int i10 = synchSafeInt + 10;
        if (i10 > this.scratchId3Data.capacity()) {
            byte[] data = this.scratchId3Data.getData();
            this.scratchId3Data.reset(i10);
            System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
        }
        extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
        Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
        if (metadataDecode == null) {
            return -9223372036854775807L;
        }
        int length = metadataDecode.length();
        for (int i11 = 0; i11 < length; i11++) {
            Metadata.Entry entry = metadataDecode.get(i11);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                    this.scratchId3Data.setPosition(0);
                    this.scratchId3Data.setLimit(8);
                    return this.scratchId3Data.readLong() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec, boolean z10) throws Throwable {
        HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jOpen = dataSource.open(dataSpec);
        if (z10) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isPrimaryTimestampSource, this.startTimeUs, this.timestampAdjusterInitializationTimeoutMs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
                defaultExtractorInput = defaultExtractorInput;
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                this.output.setSampleOffsetUs(jPeekId3PrivTimestamp != -9223372036854775807L ? this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp) : this.startTimeUs);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    public static boolean shouldSpliceIn(@Nullable HlsMediaChunk hlsMediaChunk, Uri uri, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j10) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j10 + segmentBaseHolder.segmentBase.relativeStartTimeUs < hlsMediaChunk.endTimeUs;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public int getFirstSampleIndex(int i10) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i10 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return this.sampleQueueFirstSampleIndices.get(i10).intValue();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, ImmutableList<Integer> immutableList) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = immutableList;
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public void publish() {
        this.isPublished = true;
    }
}
