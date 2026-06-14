package com.google.android.exoplayer2.extractor;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;

    @Nullable
    private final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;

    @Nullable
    public final SeekTable seekTable;
    public final long totalSamples;

    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.pointSampleNumbers = jArr;
            this.pointOffsets = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i10) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i10 * 8);
        this.minBlockSizeSamples = parsableBitArray.readBits(16);
        this.maxBlockSizeSamples = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        int bits = parsableBitArray.readBits(20);
        this.sampleRate = bits;
        this.sampleRateLookupKey = getSampleRateLookupKey(bits);
        this.channels = parsableBitArray.readBits(3) + 1;
        int bits2 = parsableBitArray.readBits(5) + 1;
        this.bitsPerSample = bits2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(bits2);
        this.totalSamples = parsableBitArray.readBitsToLong(36);
        this.seekTable = null;
        this.metadata = null;
    }

    @Nullable
    private static Metadata concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        Metadata vorbisComments = VorbisUtil.parseVorbisComments(list);
        if (vorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new Metadata(list2).copyWithAppendedEntriesFrom(vorbisComments);
    }

    private static int getBitsPerSampleLookupKey(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int getSampleRateLookupKey(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new Metadata(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(@Nullable SeekTable seekTable) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, seekTable, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(VorbisUtil.parseVorbisComments(list)));
    }

    public long getApproxBytesPerFrame() {
        long j10;
        long j11;
        int i10 = this.maxFrameSize;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.minFrameSize)) / 2;
            j11 = 1;
        } else {
            int i11 = this.minBlockSizeSamples;
            j10 = ((((i11 != this.maxBlockSizeSamples || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.channels)) * ((long) this.bitsPerSample)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j10 = this.totalSamples;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.sampleRate);
    }

    public Format getFormat(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i10 = this.maxFrameSize;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new Format.Builder().setSampleMimeType("audio/flac").setMaxInputSize(i10).setChannelCount(this.channels).setSampleRate(this.sampleRate).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public int getMaxDecodedFrameSize() {
        return this.maxBlockSizeSamples * this.channels * (this.bitsPerSample / 8);
    }

    @Nullable
    public Metadata getMetadataCopyWithAppendedEntriesFrom(@Nullable Metadata metadata) {
        Metadata metadata2 = this.metadata;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public long getSampleNumber(long j10) {
        return Util.constrainValue((j10 * ((long) this.sampleRate)) / 1000000, 0L, this.totalSamples - 1);
    }

    public FlacStreamMetadata(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i10, i11, i12, i13, i14, i15, i16, j10, (SeekTable) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private FlacStreamMetadata(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable SeekTable seekTable, @Nullable Metadata metadata) {
        this.minBlockSizeSamples = i10;
        this.maxBlockSizeSamples = i11;
        this.minFrameSize = i12;
        this.maxFrameSize = i13;
        this.sampleRate = i14;
        this.sampleRateLookupKey = getSampleRateLookupKey(i14);
        this.channels = i15;
        this.bitsPerSample = i16;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i16);
        this.totalSamples = j10;
        this.seekTable = seekTable;
        this.metadata = metadata;
    }
}
