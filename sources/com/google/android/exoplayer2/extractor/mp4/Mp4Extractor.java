package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Function;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mp4.d
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.b();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private Mp4Track[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        @Nullable
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.trueHdSampleRechunker = "audio/true-hd".equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor() {
        this(0);
    }

    public static /* synthetic */ Track a(Track track) {
        return track;
    }

    public static /* synthetic */ Extractor[] b() {
        return new Extractor[]{new Mp4Extractor()};
    }

    private static int brandToFileType(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i10 = 0; i10 < mp4TrackArr.length; i10++) {
            jArr[i10] = new long[mp4TrackArr[i10].sampleTable.sampleCount];
            jArr2[i10] = mp4TrackArr[i10].sampleTable.timestampsUs[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < mp4TrackArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < mp4TrackArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            TrackSampleTable trackSampleTable = mp4TrackArr[i12].sampleTable;
            j10 += (long) trackSampleTable.sizes[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = trackSampleTable.timestampsUs[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j10) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j10) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i12 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i12];
            int i13 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i13 != trackSampleTable.sampleCount) {
                long j14 = trackSampleTable.offsets[i13];
                long j15 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i11 : i10;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j10, long j11) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j10);
        return synchronizationSampleIndex == -1 ? j11 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j11);
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        AtomParsers.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    private void processAtomEnded(long j10) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j10) {
            Atom.ContainerAtom containerAtomPop = this.containerAtoms.pop();
            if (containerAtomPop.type == 1836019574) {
                processMoovAtom(containerAtomPop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(containerAtomPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        List<TrackSampleTable> list;
        int i10;
        boolean z10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        boolean z12 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            Pair<Metadata, Metadata> udta = AtomParsers.parseUdta(leafAtomOfType);
            Metadata metadata3 = (Metadata) udta.first;
            Metadata metadata4 = (Metadata) udta.second;
            if (metadata3 != null) {
                gaplessInfoHolder.setFromMetadata(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(1835365473);
        Metadata mdtaFromMeta = containerAtomOfType != null ? AtomParsers.parseMdtaFromMeta(containerAtomOfType) : null;
        List<TrackSampleTable> traks = AtomParsers.parseTraks(containerAtom, gaplessInfoHolder, -9223372036854775807L, null, (this.flags & 1) != 0, z12, new Function() { // from class: com.google.android.exoplayer2.extractor.mp4.c
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return Mp4Extractor.a((Track) obj);
            }
        });
        int size = traks.size();
        long j10 = -9223372036854775807L;
        int i12 = 0;
        int size2 = -1;
        while (i12 < size) {
            TrackSampleTable trackSampleTable = traks.get(i12);
            if (trackSampleTable.sampleCount == 0) {
                list = traks;
                i10 = size;
                z10 = z11;
            } else {
                Track track = trackSampleTable.track;
                Metadata metadata5 = mdtaFromMeta;
                long j11 = track.durationUs;
                if (j11 == -9223372036854775807L) {
                    j11 = trackSampleTable.durationUs;
                }
                long jMax = Math.max(j10, j11);
                list = traks;
                i10 = size;
                Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i12, track.type));
                int i13 = "audio/true-hd".equals(track.format.sampleMimeType) ? trackSampleTable.maximumSize * 16 : trackSampleTable.maximumSize + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i13);
                if (track.type == 2 && j11 > 0 && (i11 = trackSampleTable.sampleCount) > 1) {
                    builderBuildUpon.setFrameRate(i11 / (j11 / 1000000.0f));
                }
                MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, builderBuildUpon);
                mdtaFromMeta = metadata5;
                MetadataUtil.setFormatMetadata(track.type, metadata2, mdtaFromMeta, builderBuildUpon, metadata, this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries));
                mp4Track.trackOutput.format(builderBuildUpon.build());
                if (track.type == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(mp4Track);
                j10 = jMax;
                z10 = true;
            }
            i12++;
            z11 = z10;
            traks = list;
            size = i10;
        }
        this.firstVideoTrackIndex = size2;
        this.durationUs = j10;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[0]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j10) {
        if (this.atomType == 1836086884) {
            int i10 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.atomSize - ((long) i10));
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        Atom.ContainerAtom containerAtomPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j10 = this.atomSize;
        if (j10 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j10 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && (containerAtomPeek = this.containerAtoms.peek()) != null) {
                length = containerAtomPeek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j11 = this.atomSize;
            int i10 = this.atomHeaderBytesRead;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, j12));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j12);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= SieveCacheKt.NodeLinkMask);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z10;
        long j10 = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j10;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j10);
            if (this.atomType == 1718909296) {
                this.fileType = processFtypAtom(parsableByteArray);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, parsableByteArray));
            }
        } else {
            if (j10 >= 262144) {
                positionHolder.position = extractorInput.getPosition() + j10;
                z10 = true;
                processAtomEnded(position);
                return (z10 || this.parserState == 2) ? false : true;
            }
            extractorInput.skipFully((int) j10);
        }
        z10 = false;
        processAtomEnded(position);
        if (z10) {
        }
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i10;
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i11 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j10 = trackSampleTable.offsets[i11];
        int i12 = trackSampleTable.sizes[i11];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j11 = (j10 - position) + ((long) this.sampleBytesRead);
        if (j11 < 0 || j11 >= 262144) {
            positionHolder.position = j10;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j11 += 8;
            i12 -= 8;
        }
        extractorInput.skipFully((int) j11);
        Track track = mp4Track.track;
        if (track.nalUnitLengthFieldLength == 0) {
            if ("audio/ac4".equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i12, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i12 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i13 = this.sampleBytesWritten;
                if (i13 >= i12) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i12 - i13, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i14 = mp4Track.track.nalUnitLengthFieldLength;
            int i15 = 4 - i14;
            while (this.sampleBytesWritten < i12) {
                int i16 = this.sampleCurrentNalBytesRemaining;
                if (i16 == 0) {
                    extractorInput.readFully(data, i15, i14);
                    this.sampleBytesRead += i14;
                    this.nalLength.setPosition(0);
                    int i17 = this.nalLength.readInt();
                    if (i17 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i17;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    i12 += i15;
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i16, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                }
            }
        }
        int i18 = i12;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j12 = trackSampleTable2.timestampsUs[i11];
        int i19 = trackSampleTable2.flags[i11];
        if (trueHdSampleRechunker != null) {
            i10 = 0;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j12, i19, i18, 0, null);
            if (i11 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
        } else {
            i10 = 0;
            trackOutput.sampleMetadata(j12, i19, i18, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = i10;
        this.sampleBytesWritten = i10;
        this.sampleCurrentNalBytesRemaining = i10;
        return i10;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i10 = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (i10 == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return i10;
    }

    private static boolean shouldParseContainerAtom(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j10) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j10);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        return getSeekPoints(j10, -1);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i10 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j10 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j11);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return Sniffer.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
    }

    public Mp4Extractor(int i10) {
        this.flags = i10;
        this.parserState = (i10 & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r5 != 0) goto L13
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r2 = com.google.android.exoplayer2.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.firstVideoTrackIndex
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            int r6 = getSynchronizationSampleIndex(r4, r1)
            if (r6 != r5) goto L35
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            com.google.android.exoplayer2.extractor.SeekPoint r2 = com.google.android.exoplayer2.extractor.SeekPoint.START
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.timestampsUs
            r12 = r11[r6]
            long[] r11 = r4.offsets
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.sampleCount
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.timestampsUs
            r9 = r2[r1]
            long[] r2 = r4.offsets
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.firstVideoTrackIndex
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            com.google.android.exoplayer2.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
            long r5 = maybeAdjustSeekOffset(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = maybeAdjustSeekOffset(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            com.google.android.exoplayer2.extractor.SeekPoint r3 = new com.google.android.exoplayer2.extractor.SeekPoint
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r1.<init>(r3)
            return r1
        L8f:
            com.google.android.exoplayer2.extractor.SeekPoint r4 = new com.google.android.exoplayer2.extractor.SeekPoint
            r4.<init>(r9, r1)
            com.google.android.exoplayer2.extractor.SeekMap$SeekPoints r1 = new com.google.android.exoplayer2.extractor.SeekMap$SeekPoints
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.getSeekPoints(long, int):com.google.android.exoplayer2.extractor.SeekMap$SeekPoints");
    }
}
