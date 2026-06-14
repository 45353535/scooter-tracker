package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes5.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    private final int bitrate;
    private final long dataEndPosition;

    public ConstantBitrateSeeker(long j10, long j11, MpegAudioUtil.Header header, boolean z10) {
        this(j10, j11, header.bitrate, header.frameSize, z10);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        return getTimeUsAtPosition(j10);
    }

    public ConstantBitrateSeeker(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.bitrate = i10;
        this.dataEndPosition = j12 == -1 ? -1L : j12;
    }
}
