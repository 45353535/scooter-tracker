package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;

    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    @Nullable
    public static XingSeeker create(long j10, long j11, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        int i10 = header.samplesPerFrame;
        int i11 = header.sampleRate;
        int i12 = parsableByteArray.readInt();
        if ((i12 & 1) != 1 || (unsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedIntToInt, ((long) i10) * 1000000, i11);
        if ((i12 & 6) != 6) {
            return new XingSeeker(j11, header.frameSize, jScaleLargeTimestamp);
        }
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = parsableByteArray.readUnsignedByte();
        }
        if (j10 != -1) {
            long j12 = j11 + unsignedInt;
            if (j10 != j12) {
                Log.w(TAG, "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new XingSeeker(j11, header.frameSize, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    private long getTimeUsForTableIndex(int i10) {
        return (this.durationUs * ((long) i10)) / 100;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j10, 0L, this.durationUs);
        double d10 = (jConstrainValue * 100.0d) / this.durationUs;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) Assertions.checkStateNotNull(this.tableOfContents))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d11 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        long j11 = j10 - this.dataStartPosition;
        if (!isSeekable() || j11 <= this.xingFrameSize) {
            return 0L;
        }
        long[] jArr = (long[]) Assertions.checkStateNotNull(this.tableOfContents);
        double d10 = (j11 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, (long) d10, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j12 = jArr[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i10);
        return timeUsForTableIndex + Math.round((j12 == (iBinarySearchFloor == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j10, int i10, long j11, long j12, @Nullable long[] jArr) {
        this.dataStartPosition = j10;
        this.xingFrameSize = i10;
        this.durationUs = j11;
        this.tableOfContents = jArr;
        this.dataSize = j12;
        this.dataEndPosition = j12 != -1 ? j10 + j12 : -1L;
    }
}
