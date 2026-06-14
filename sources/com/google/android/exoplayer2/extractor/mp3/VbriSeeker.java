package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes7.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j10, long j11) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j10;
        this.dataEndPosition = j11;
    }

    @Nullable
    public static VbriSeeker create(long j10, long j11, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(10);
        int i10 = parsableByteArray.readInt();
        VbriSeeker vbriSeeker = null;
        if (i10 <= 0) {
            return null;
        }
        int i11 = header.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i10, ((long) (i11 >= 32000 ? 1152 : 576)) * 1000000, i11);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        int i12 = 2;
        parsableByteArray.skipBytes(2);
        long j12 = j11 + ((long) header.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i13 = 0;
        long j13 = j11;
        while (i13 < unsignedShort) {
            VbriSeeker vbriSeeker2 = vbriSeeker;
            int i14 = unsignedShort2;
            long[] jArr3 = jArr;
            jArr3[i13] = (((long) i13) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i13] = Math.max(j13, j12);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == i12) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return vbriSeeker2;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j13 += ((long) unsignedByte) * ((long) i14);
            i13++;
            vbriSeeker = vbriSeeker2;
            unsignedShort2 = i14;
            jArr = jArr3;
            j12 = j12;
            i12 = 2;
        }
        long[] jArr4 = jArr;
        if (j10 != -1 && j10 != j13) {
            Log.w(TAG, "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new VbriSeeker(jArr4, jArr2, jScaleLargeTimestamp, j13);
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
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j10, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j10 || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i10 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i10], this.positions[i10]));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j10, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
