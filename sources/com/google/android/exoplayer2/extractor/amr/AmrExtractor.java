package com.google.android.exoplayer2.extractor.amr;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class AmrExtractor implements Extractor {
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    private static final int MAX_FRAME_SIZE_BYTES;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final int[] frameSizeBytesByTypeWb;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean hasOutputSeekMap;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private final byte[] scratch;
    private SeekMap seekMap;
    private long timeOffsetUs;
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.amr.a
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AmrExtractor.a();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return e.a(this, uri, map);
        }
    };
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        frameSizeBytesByTypeWb = iArr;
        MAX_FRAME_SIZE_BYTES = iArr[8];
    }

    public AmrExtractor() {
        this(0);
    }

    public static /* synthetic */ Extractor[] a() {
        return new Extractor[]{new AmrExtractor()};
    }

    static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    static int frameSizeBytesByTypeNb(int i10) {
        return frameSizeBytesByTypeNb[i10];
    }

    static int frameSizeBytesByTypeWb(int i10) {
        return frameSizeBytesByTypeWb[i10];
    }

    private static int getBitrateFromFrameSize(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private SeekMap getConstantBitrateSeekMap(long j10, boolean z10) {
        return new ConstantBitrateSeekMap(j10, this.firstSamplePosition, getBitrateFromFrameSize(this.firstSampleSize, 20000L), this.firstSampleSize, z10);
    }

    private int getFrameSizeInBytes(int i10) throws ParserException {
        if (isValidFrameType(i10)) {
            return this.isWideBand ? frameSizeBytesByTypeWb[i10] : frameSizeBytesByTypeNb[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.isWideBand ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.createForMalformedContainer(sb2.toString(), null);
    }

    private boolean isNarrowBandValidFrameType(int i10) {
        if (this.isWideBand) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean isValidFrameType(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return isWideBandValidFrameType(i10) || isNarrowBandValidFrameType(i10);
    }

    private boolean isWideBandValidFrameType(int i10) {
        if (this.isWideBand) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void maybeOutputFormat() {
        if (this.hasOutputFormat) {
            return;
        }
        this.hasOutputFormat = true;
        boolean z10 = this.isWideBand;
        this.trackOutput.format(new Format.Builder().setSampleMimeType(z10 ? "audio/amr-wb" : "audio/3gpp").setMaxInputSize(MAX_FRAME_SIZE_BYTES).setChannelCount(1).setSampleRate(z10 ? 16000 : 8000).build());
    }

    private void maybeOutputSeekMap(long j10, int i10) {
        int i11;
        if (this.hasOutputSeekMap) {
            return;
        }
        int i12 = this.flags;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.firstSampleSize) == -1 || i11 == this.currentSampleSize)) {
            SeekMap.Unseekable unseekable = new SeekMap.Unseekable(-9223372036854775807L);
            this.seekMap = unseekable;
            this.extractorOutput.seekMap(unseekable);
            this.hasOutputSeekMap = true;
            return;
        }
        if (this.numSamplesWithSameSize >= 20 || i10 == -1) {
            SeekMap constantBitrateSeekMap = getConstantBitrateSeekMap(j10, (i12 & 2) != 0);
            this.seekMap = constantBitrateSeekMap;
            this.extractorOutput.seekMap(constantBitrateSeekMap);
            this.hasOutputSeekMap = true;
        }
    }

    private static boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) throws IOException {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b10 = this.scratch[0];
        if ((b10 & 131) <= 0) {
            return getFrameSizeInBytes((b10 >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    private int readSample(ExtractorInput extractorInput) throws IOException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(extractorInput);
                this.currentSampleSize = iPeekNextSampleSize;
                this.currentSampleBytesRemaining = iPeekNextSampleSize;
                if (this.firstSampleSize == -1) {
                    this.firstSamplePosition = extractorInput.getPosition();
                    this.firstSampleSize = this.currentSampleSize;
                }
                if (this.firstSampleSize == this.currentSampleSize) {
                    this.numSamplesWithSameSize++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, this.currentSampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i10 = this.currentSampleBytesRemaining - iSampleData;
        this.currentSampleBytesRemaining = i10;
        if (i10 > 0) {
            return 0;
        }
        this.trackOutput.sampleMetadata(this.timeOffsetUs + this.currentSampleTimeUs, 1, this.currentSampleSize, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(extractorInput);
        maybeOutputSeekMap(extractorInput.getLength(), sample);
        return sample;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleSize = 0;
        this.currentSampleBytesRemaining = 0;
        if (j10 != 0) {
            SeekMap seekMap = this.seekMap;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                this.timeOffsetUs = ((ConstantBitrateSeekMap) seekMap).getTimeUsAtPosition(j10);
                return;
            }
        }
        this.timeOffsetUs = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return readAmrHeader(extractorInput);
    }

    public AmrExtractor(int i10) {
        this.flags = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.scratch = new byte[1];
        this.firstSampleSize = -1;
    }
}
