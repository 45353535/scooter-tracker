package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.C4240b4;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j10, long j11) {
        long jUsToMs = Util.usToMs(j11);
        long j12 = mediaChunk.startTimeUs;
        long j13 = mediaChunk.endTimeUs;
        StringBuilder sb2 = new StringBuilder(103);
        sb2.append("Unexpected sample timestamp: ");
        sb2.append(jUsToMs);
        sb2.append(" in chunk [");
        sb2.append(j12);
        sb2.append(", ");
        sb2.append(j13);
        sb2.append(C4240b4.j.f42674e);
        super(sb2.toString());
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j10;
        this.rejectedSampleTimeUs = j11;
    }
}
