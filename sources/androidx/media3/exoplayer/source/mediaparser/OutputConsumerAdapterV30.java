package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(30)
@SuppressLint({"Override"})
@UnstableApi
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final String TAG = "OConsumerAdapterV30";

    @Nullable
    private String containerMimeType;

    @Nullable
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private ExtractorOutput extractorOutput;

    @Nullable
    private ChunkIndex lastChunkIndex;
    private final ArrayList<TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;

    @Nullable
    private MediaParser.SeekMap lastSeekMap;
    private List<Format> muxedCaptionFormats;
    private int primaryTrackIndex;

    @Nullable
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;

    @Nullable
    private TimestampAdjuster timestampAdjuster;
    private final ArrayList<Format> trackFormats;
    private final ArrayList<TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    private static final class DataReaderAdapter implements DataReader {

        @Nullable
        public MediaParser$InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.DataReader
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            return n.a(Util.castNonNull(this.input)).read(bArr, i10, i11);
        }
    }

    private static final class SeekMapAdapter implements SeekMap {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        private static SeekPoint asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            if (durationMicros != SieveCacheKt.NodeMetaAndPreviousMask) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            Pair seekPoints = this.adaptedSeekMap.getSeekPoints(j10);
            Object obj = seekPoints.first;
            return obj == seekPoints.second ? new SeekMap.SeekPoints(asExoPlayerSeekPoint(androidx.media3.exoplayer.source.k.a(obj))) : new SeekMap.SeekPoints(asExoPlayerSeekPoint(androidx.media3.exoplayer.source.k.a(obj)), asExoPlayerSeekPoint(androidx.media3.exoplayer.source.k.a(seekPoints.second)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    private void ensureSpaceForTrackIndex(int i10) {
        for (int size = this.trackOutputs.size(); size <= i10; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i10;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("csd-");
            int i11 = i10 + 1;
            sb2.append(i10);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb2.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(MediaFormatUtil.getArray(byteBuffer));
            i10 = i11;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String getMimeType(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    b10 = 0;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    b10 = 1;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    b10 = 2;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    b10 = 3;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    b10 = 4;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    b10 = 5;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    b10 = 6;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    b10 = 7;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    b10 = 8;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    b10 = 9;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    b10 = 10;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    b10 = Ascii.FF;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 6:
                return "video/mp4";
            case 1:
                return "audio/ogg";
            case 2:
                return "video/mp2t";
            case 3:
                return "audio/mp4a-latm";
            case 4:
                return "audio/raw";
            case 5:
                return "video/mp2p";
            case 7:
                return "audio/ac3";
            case 8:
                return "audio/amr";
            case 9:
                return "audio/flac";
            case 10:
                return "video/webm";
            case 11:
                return "audio/ac4";
            case 12:
                return "audio/mpeg";
            case 13:
                return "video/x-flv";
            default:
                throw new IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.trackOutputs.get(i10) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        LongBuffer longBufferAsLongBuffer = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer2 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        LongBuffer longBufferAsLongBuffer3 = ((ByteBuffer) Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        ChunkIndex chunkIndex = new ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    @Nullable
    private TrackOutput.CryptoData toExoPlayerCryptoData(int i10, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        int i11;
        int i12;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i10) == cryptoInfo) {
            return (TrackOutput.CryptoData) Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i10));
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            i11 = Integer.parseInt((String) Util.castNonNull(matcher.group(1)));
            i12 = Integer.parseInt((String) Util.castNonNull(matcher.group(2)));
        } catch (RuntimeException e10) {
            Log.e(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e10);
            i11 = 0;
            i12 = 0;
        }
        TrackOutput.CryptoData cryptoData = new TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i11, i12);
        this.lastReceivedCryptoInfos.set(i10, cryptoInfo);
        this.lastOutputCryptoDatas.set(i10, cryptoData);
        return cryptoData;
    }

    @Nullable
    private static DrmInitData toExoPlayerDrmInitData(@Nullable String str, @Nullable android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[schemeInitDataCount];
        for (int i10 = 0; i10 < schemeInitDataCount; i10++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i10);
            schemeDataArr[i10] = new DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private Format toExoPlayerFormat(MediaParser.TrackData trackData) {
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        int i10 = 0;
        Format.Builder accessibilityChannel = new Format.Builder().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.containerMimeType).setPeakBitrate(mediaFormat.getInteger(com.taurusx.tax.f.a.f65992s, -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(MediaFormatUtil.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger("width", -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString("language")).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        while (true) {
            if (i10 >= this.muxedCaptionFormats.size()) {
                break;
            }
            Format format = this.muxedCaptionFormats.get(i10);
            if (Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setLabels(format.labels).setMetadata(format.metadata);
                break;
            }
            i10++;
        }
        return accessibilityChannel.build();
    }

    private static int toTrackTypeConstant(@Nullable String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return MimeTypes.getTrackType(str);
        }
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    @Nullable
    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    @Nullable
    public Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        Format[] formatArr = new Format[this.trackFormats.size()];
        for (int i10 = 0; i10 < this.trackFormats.size(); i10++) {
            formatArr[i10] = (Format) Assertions.checkNotNull(this.trackFormats.get(i10));
        }
        return formatArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j10) {
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j10) : SEEK_POINT_PAIR_START;
    }

    public void onSampleCompleted(int i10, long j10, int i11, int i12, int i13, @Nullable MediaCodec.CryptoInfo cryptoInfo) {
        long j11 = this.sampleTimestampUpperLimitFilterUs;
        if (j11 == -9223372036854775807L || j10 < j11) {
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j10 = timestampAdjuster.adjustSampleTimestamp(j10);
            }
            ((TrackOutput) Assertions.checkNotNull(this.trackOutputs.get(i10))).sampleMetadata(j10, i11, i12, i13, toExoPlayerCryptoData(i10, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i10, MediaParser$InputReader mediaParser$InputReader) throws IOException {
        ensureSpaceForTrackIndex(i10);
        this.scratchDataReaderAdapter.input = mediaParser$InputReader;
        TrackOutput trackOutputTrack = this.trackOutputs.get(i10);
        if (trackOutputTrack == null) {
            trackOutputTrack = this.extractorOutput.track(i10, -1);
            this.trackOutputs.set(i10, trackOutputTrack);
        }
        trackOutputTrack.sampleData((DataReader) this.scratchDataReaderAdapter, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == SieveCacheKt.NodeMetaAndPreviousMask) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    public void onTrackCountFound(int i10) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i10, MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i10);
        TrackOutput trackOutput = this.trackOutputs.get(i10);
        if (trackOutput == null) {
            String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i10;
            }
            TrackOutput trackOutputTrack = this.extractorOutput.track(i10, trackTypeConstant);
            this.trackOutputs.set(i10, trackOutputTrack);
            if (string != null) {
                return;
            } else {
                trackOutput = trackOutputTrack;
            }
        }
        Format exoPlayerFormat = toExoPlayerFormat(trackData);
        Format format = this.primaryTrackManifestFormat;
        trackOutput.format((format == null || i10 != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
        this.trackFormats.set(i10, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(List<Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j10) {
        this.sampleTimestampUpperLimitFilterUs = j10;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    public OutputConsumerAdapterV30(@Nullable Format format, int i10, boolean z10) {
        this.expectDummySeekMap = z10;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i10;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new NoOpExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        this.muxedCaptionFormats = ImmutableList.of();
    }
}
