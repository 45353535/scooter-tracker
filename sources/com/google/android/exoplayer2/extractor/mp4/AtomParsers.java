package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z10) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z10;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i10 = this.index + 1;
            this.index = i10;
            if (i10 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i11 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i11;
                this.nextSamplesPerChunkChangeIndex = i11 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j10, long j11) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j10;
            this.peakBitrate = j11;
        }
    }

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i10) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i10];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i10 = this.fixedSampleSize;
            return i10 == -1 ? this.data.readUnsignedIntToInt() : i10;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i10 = this.fieldSize;
            if (i10 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i10 == 16) {
                return this.data.readUnsignedShort();
            }
            int i11 = this.sampleIndex;
            this.sampleIndex = i11 + 1;
            if (i11 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    private static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f24897id;
        private final int rotationDegrees;

        public TkhdData(int i10, long j10, int i11) {
            this.f24897id = i10;
            this.duration = j10;
            this.rotationDegrees = i11;
        }
    }

    private AtomParsers() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i10, int i11, int i12) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i11, null);
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int i13 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i13 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i10) {
                return position;
            }
            position += i13;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i10) {
        if (i10 == TYPE_soun) {
            return 1;
        }
        if (i10 == TYPE_vide) {
            return 2;
        }
        if (i10 == TYPE_text || i10 == TYPE_sbtl || i10 == TYPE_subt || i10 == TYPE_clcp) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.DrmInitData r29, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r30, int r31) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseAudioSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    @Nullable
    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i15 = parsableByteArray.readInt();
            int i16 = parsableByteArray.readInt();
            if (i16 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i16 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i16 == 1935894633) {
                i13 = i12;
                i14 = i15;
            }
            i12 += i15;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i13 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i13, i14, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            jArr[i10] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i10] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j10 = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j10, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i10) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i10 = parsableByteArray.readInt();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i11] = parsableByteArray.readString(i12 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i13 = parsableByteArray2.readInt();
            int i14 = parsableByteArray2.readInt() - 1;
            if (i14 < 0 || i14 >= i10) {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i14);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i13, strArr[i14]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, StsdData stsdData) {
        parsableByteArray.setPosition(i11 + 16);
        if (i10 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i12).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i13 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i12, i13 + i12);
            }
            i12 += i13;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i10, int i11) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int i12 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i12 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i12)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i12;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            parsableByteArray.setPosition(i14);
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i12 = unsignedByte & 15;
                    i13 = (unsignedByte & 240) >> 4;
                }
                boolean z10 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z10 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z10, str, unsignedByte2, bArr2, i13, i12, bArr);
            }
            i14 += i15;
        }
    }

    @Nullable
    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i11 < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f10 = unsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new SmtaMetadataEntry(f10, parsableByteArray.readUnsignedByte()));
            }
            parsableByteArray.setPosition(position + i11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027d  */
    /* JADX WARN: Type inference failed for: r11v15, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.extractor.mp4.TrackSampleTable parseStbl(com.google.android.exoplayer2.extractor.mp4.Track r36, com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r37, com.google.android.exoplayer2.extractor.GaplessInfoHolder r38) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseStbl(com.google.android.exoplayer2.extractor.mp4.Track, com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom, com.google.android.exoplayer2.extractor.GaplessInfoHolder):com.google.android.exoplayer2.extractor.mp4.TrackSampleTable");
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i10, int i11, String str, @Nullable DrmInitData drmInitData, boolean z10) throws ParserException {
        parsableByteArray.setPosition(12);
        int i12 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i12);
        int i13 = 0;
        while (i13 < i12) {
            int position = parsableByteArray.getPosition();
            int i14 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i14 > 0, "childAtomSize must be positive");
            int i15 = parsableByteArray.readInt();
            if (i15 == 1635148593 || i15 == 1635148595 || i15 == 1701733238 || i15 == 1831958048 || i15 == 1836070006 || i15 == 1752589105 || i15 == 1751479857 || i15 == 1932670515 || i15 == 1211250227 || i15 == 1987063864 || i15 == 1987063865 || i15 == 1635135537 || i15 == 1685479798 || i15 == 1685479729 || i15 == 1685481573 || i15 == 1685481521) {
                StsdData stsdData2 = stsdData;
                int i16 = i13;
                parseVideoSampleEntry(parsableByteArray, i15, position, i14, i10, i11, drmInitData, stsdData2, i16);
                stsdData = stsdData2;
                i13 = i16;
            } else if (i15 == 1836069985 || i15 == 1701733217 || i15 == 1633889587 || i15 == 1700998451 || i15 == 1633889588 || i15 == 1835823201 || i15 == 1685353315 || i15 == 1685353317 || i15 == 1685353320 || i15 == 1685353324 || i15 == 1685353336 || i15 == 1935764850 || i15 == 1935767394 || i15 == 1819304813 || i15 == 1936684916 || i15 == 1953984371 || i15 == 778924082 || i15 == 778924083 || i15 == 1835557169 || i15 == 1835560241 || i15 == 1634492771 || i15 == 1634492791 || i15 == 1970037111 || i15 == 1332770163 || i15 == 1716281667) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, i15, position, i14, i10, str, z10, drmInitData, stsdData3, i13);
                stsdData = stsdData3;
            } else if (i15 == 1414810956 || i15 == 1954034535 || i15 == 2004251764 || i15 == 1937010800 || i15 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, i15, position, i14, i10, str, stsdData);
            } else if (i15 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i15, position, i10, stsdData);
            } else if (i15 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i10).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + i14);
            i13++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i11 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                parsableByteArray.readBytes(bArr, 0, i14);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        stsdData.format = new Format.Builder().setId(i13).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j10).setInitializationData(immutableListOf).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j10;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i10 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i11 = fullAtomVersion == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i13 >= i11) {
                parsableByteArray.skipBytes(i11);
                break;
            }
            if (parsableByteArray.getData()[position + i13] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j10 = unsignedInt;
                }
            } else {
                i13++;
            }
        }
        parsableByteArray.skipBytes(16);
        int i14 = parsableByteArray.readInt();
        int i15 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i16 = parsableByteArray.readInt();
        int i17 = parsableByteArray.readInt();
        if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
            i12 = 90;
        } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
            i12 = 270;
        } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
            i12 = 180;
        }
        return new TkhdData(i10, j10, i12);
    }

    @Nullable
    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        long j11 = j10 == -9223372036854775807L ? tkhd.duration : j10;
        long mvhd = parseMvhd(leafAtom.data);
        long jScaleLargeTimestamp = j11 != -9223372036854775807L ? Util.scaleLargeTimestamp(j11, 1000000L, mvhd) : -9223372036854775807L;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        Atom.LeafAtom leafAtomOfType = containerAtom3.getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafAtomOfType.data, tkhd.f24897id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z11);
        if (z10 || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f24897id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), mvhd, jScaleLargeTimestamp, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11, Function<Track, Track> function) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < containerAtom.containerChildren.size(); i10++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i10);
            if (containerAtom2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(parseStbl(trackApply, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata udtaMeta = null;
        Metadata smta = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i10 = parsableByteArray.readInt();
            int i11 = parsableByteArray.readInt();
            if (i11 == 1835365473) {
                parsableByteArray.setPosition(position);
                udtaMeta = parseUdtaMeta(parsableByteArray, position + i10);
            } else if (i11 == 1936553057) {
                parsableByteArray.setPosition(position);
                smta = parseSmta(parsableByteArray, position + i10);
            }
            parsableByteArray.setPosition(position + i10);
        }
        return Pair.create(udtaMeta, smta);
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i11);
            }
            parsableByteArray.setPosition(position + i11);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, int i14, @Nullable DrmInitData drmInitData, StsdData stsdData, int i15) throws ParserException {
        DrmInitData drmInitData2;
        int i16;
        int i17;
        String str;
        float f10;
        List<byte[]> list;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21 = i11;
        int i22 = i12;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i21 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i21, i22);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i15] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        String str5 = null;
        List<byte[]> listOf = null;
        byte[] projFromParent = null;
        int i23 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i24 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsFromParent = null;
        boolean z10 = false;
        while (position - i21 < i22) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i25 = parsableByteArray.readInt();
            if (i25 == 0 && parsableByteArray.getPosition() - i11 == i22) {
                break;
            }
            ExtractorUtil.checkContainerInput(i25 > 0, "childAtomSize must be positive");
            int i26 = parsableByteArray.readInt();
            if (i26 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listOf = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z10) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                str5 = avcConfig.codecs;
                str4 = "video/avc";
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i16 = position;
            } else {
                if (i26 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    listOf = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z10) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    str5 = hevcConfig.codecs;
                    int i27 = hevcConfig.colorSpace;
                    int i28 = hevcConfig.colorRange;
                    iIsoTransferCharacteristicsToColorTransfer = hevcConfig.colorTransfer;
                    iIsoColorPrimariesToColorSpace = i27;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i16 = position;
                    i24 = i28;
                    i17 = iIntValue;
                    str = str3;
                    str4 = "video/hevc";
                } else {
                    if (i26 == 1685480259 || i26 == 1685485123) {
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i16 = position;
                        i17 = iIntValue;
                        str = str3;
                        f10 = paspFromParent;
                        list = listOf;
                        i18 = iIsoColorPrimariesToColorSpace;
                        i19 = i24;
                        i20 = iIsoTransferCharacteristicsToColorTransfer;
                        DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                        if (dolbyVisionConfig != null) {
                            str5 = dolbyVisionConfig.codecs;
                            str4 = "video/dolby-vision";
                        }
                    } else {
                        i16 = position;
                        if (i26 == 1987076931) {
                            ExtractorUtil.checkContainerInput(str4 == null, null);
                            str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            parsableByteArray.setPosition(position2 + 12);
                            parsableByteArray.skipBytes(2);
                            boolean z11 = (parsableByteArray.readUnsignedByte() & 1) != 0;
                            int unsignedByte = parsableByteArray.readUnsignedByte();
                            int unsignedByte2 = parsableByteArray.readUnsignedByte();
                            iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte);
                            i24 = z11 ? 1 : 2;
                            iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte2);
                        } else if (i26 == 1635135811) {
                            ExtractorUtil.checkContainerInput(str4 == null, null);
                            str2 = "video/av01";
                        } else if (i26 == 1668050025) {
                            if (byteBufferAllocateHdrStaticInfo == null) {
                                byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                            }
                            ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                            byteBuffer.position(21);
                            byteBuffer.putShort(parsableByteArray.readShort());
                            byteBuffer.putShort(parsableByteArray.readShort());
                            byteBufferAllocateHdrStaticInfo = byteBuffer;
                            drmInitData2 = drmInitDataCopyWithSchemeType;
                        } else if (i26 == 1835295606) {
                            if (byteBufferAllocateHdrStaticInfo == null) {
                                byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                            }
                            ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                            short s10 = parsableByteArray.readShort();
                            short s11 = parsableByteArray.readShort();
                            short s12 = parsableByteArray.readShort();
                            i17 = iIntValue;
                            short s13 = parsableByteArray.readShort();
                            str = str3;
                            short s14 = parsableByteArray.readShort();
                            short s15 = parsableByteArray.readShort();
                            drmInitData2 = drmInitDataCopyWithSchemeType;
                            short s16 = parsableByteArray.readShort();
                            List<byte[]> list2 = listOf;
                            short s17 = parsableByteArray.readShort();
                            long unsignedInt = parsableByteArray.readUnsignedInt();
                            long unsignedInt2 = parsableByteArray.readUnsignedInt();
                            byteBuffer2.position(1);
                            byteBuffer2.putShort(s14);
                            byteBuffer2.putShort(s15);
                            byteBuffer2.putShort(s10);
                            byteBuffer2.putShort(s11);
                            byteBuffer2.putShort(s12);
                            byteBuffer2.putShort(s13);
                            byteBuffer2.putShort(s16);
                            byteBuffer2.putShort(s17);
                            byteBuffer2.putShort((short) (unsignedInt / 10000));
                            byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                            byteBufferAllocateHdrStaticInfo = byteBuffer2;
                            listOf = list2;
                            paspFromParent = paspFromParent;
                        } else {
                            drmInitData2 = drmInitDataCopyWithSchemeType;
                            i17 = iIntValue;
                            str = str3;
                            f10 = paspFromParent;
                            list = listOf;
                            if (i26 == 1681012275) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                str4 = str;
                            } else if (i26 == 1702061171) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                String str6 = esdsFromParent.mimeType;
                                byte[] bArr = esdsFromParent.initializationData;
                                listOf = bArr != null ? ImmutableList.of(bArr) : list;
                                str4 = str6;
                                paspFromParent = f10;
                                position = i16 + i25;
                                i21 = i11;
                                i22 = i12;
                                stsdData2 = stsdData;
                                iIntValue = i17;
                                str3 = str;
                                drmInitDataCopyWithSchemeType = drmInitData2;
                            } else if (i26 == 1885434736) {
                                paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                listOf = list;
                                z10 = true;
                                position = i16 + i25;
                                i21 = i11;
                                i22 = i12;
                                stsdData2 = stsdData;
                                iIntValue = i17;
                                str3 = str;
                                drmInitDataCopyWithSchemeType = drmInitData2;
                            } else if (i26 == 1937126244) {
                                projFromParent = parseProjFromParent(parsableByteArray, position2, i25);
                            } else if (i26 == 1936995172) {
                                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                parsableByteArray.skipBytes(3);
                                if (unsignedByte3 == 0) {
                                    int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                    if (unsignedByte4 == 0) {
                                        i23 = 0;
                                    } else if (unsignedByte4 == 1) {
                                        i23 = 1;
                                    } else if (unsignedByte4 == 2) {
                                        i23 = 2;
                                    } else if (unsignedByte4 == 3) {
                                        i23 = 3;
                                    }
                                }
                            } else {
                                i18 = iIsoColorPrimariesToColorSpace;
                                if (i26 == 1668246642) {
                                    i19 = i24;
                                    if (i18 == -1) {
                                        i20 = iIsoTransferCharacteristicsToColorTransfer;
                                        if (i19 == -1 && i20 == -1) {
                                            int i29 = parsableByteArray.readInt();
                                            if (i29 == TYPE_nclx || i29 == TYPE_nclc) {
                                                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                parsableByteArray.skipBytes(2);
                                                boolean z12 = i25 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                i24 = z12 ? 1 : 2;
                                                iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                            } else {
                                                Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(i29));
                                            }
                                        }
                                        position = i16 + i25;
                                        i21 = i11;
                                        i22 = i12;
                                        stsdData2 = stsdData;
                                        iIntValue = i17;
                                        str3 = str;
                                        drmInitDataCopyWithSchemeType = drmInitData2;
                                    }
                                } else {
                                    i19 = i24;
                                }
                                i20 = iIsoTransferCharacteristicsToColorTransfer;
                            }
                            listOf = list;
                            paspFromParent = f10;
                            position = i16 + i25;
                            i21 = i11;
                            i22 = i12;
                            stsdData2 = stsdData;
                            iIntValue = i17;
                            str3 = str;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                        }
                        str4 = str2;
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                    }
                    i24 = i19;
                    iIsoTransferCharacteristicsToColorTransfer = i20;
                    iIsoColorPrimariesToColorSpace = i18;
                    listOf = list;
                    paspFromParent = f10;
                    position = i16 + i25;
                    i21 = i11;
                    i22 = i12;
                    stsdData2 = stsdData;
                    iIntValue = i17;
                    str3 = str;
                    drmInitDataCopyWithSchemeType = drmInitData2;
                }
                position = i16 + i25;
                i21 = i11;
                i22 = i12;
                stsdData2 = stsdData;
                iIntValue = i17;
                str3 = str;
                drmInitDataCopyWithSchemeType = drmInitData2;
            }
            i17 = iIntValue;
            str = str3;
            position = i16 + i25;
            i21 = i11;
            i22 = i12;
            stsdData2 = stsdData;
            iIntValue = i17;
            str3 = str;
            drmInitDataCopyWithSchemeType = drmInitData2;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        float f11 = paspFromParent;
        List<byte[]> list3 = listOf;
        int i30 = iIsoColorPrimariesToColorSpace;
        int i31 = i24;
        int i32 = iIsoTransferCharacteristicsToColorTransfer;
        if (str4 == null) {
            return;
        }
        Format.Builder drmInitData4 = new Format.Builder().setId(i13).setSampleMimeType(str4).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(f11).setRotationDegrees(i14).setProjectionData(projFromParent).setStereoMode(i23).setInitializationData(list3).setDrmInitData(drmInitData3);
        if (i30 != -1 || i31 != -1 || i32 != -1 || byteBufferAllocateHdrStaticInfo != null) {
            drmInitData4.setColorInfo(new ColorInfo(i30, i31, i32, byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null));
        }
        if (esdsFromParent != null) {
            drmInitData4.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = drmInitData4.build();
    }
}
