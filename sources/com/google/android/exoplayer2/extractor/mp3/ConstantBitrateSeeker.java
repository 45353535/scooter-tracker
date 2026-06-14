package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;

/* JADX INFO: loaded from: classes7.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    public ConstantBitrateSeeker(long j10, long j11, MpegAudioUtil.Header header, boolean z10) {
        super(j10, j11, header.bitrate, header.frameSize, z10);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j10) {
        return getTimeUsAtPosition(j10);
    }
}
