package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    private static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f24900id;
        public final long size;

        private ChunkHeader(int i10, long j10) {
            this.f24900id = i10;
            this.size = j10;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static boolean checkFileType(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i10 = ChunkHeader.peek(extractorInput, parsableByteArray).f24900id;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i11 = parsableByteArray.readInt();
        if (i11 == 1463899717) {
            return true;
        }
        Log.e(TAG, "Unsupported form type: " + i11);
        return false;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1718449184, extractorInput, parsableByteArray);
        Assertions.checkState(chunkHeaderSkipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i10 = ((int) chunkHeaderSkipToChunk.size) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            extractorInput.peekFully(bArr, 0, i10);
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = bArr;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.f24900id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) chunkHeaderPeek.size) + 8);
        return littleEndianLong;
    }

    private static ChunkHeader skipToChunk(int i10, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f24900id != i10) {
            Log.w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.f24900id);
            long j10 = chunkHeaderPeek.size + 8;
            if (j10 > SieveCacheKt.NodeLinkMask) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.f24900id);
            }
            extractorInput.skipFully((int) j10);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        return chunkHeaderPeek;
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(chunkHeaderSkipToChunk.size));
    }
}
