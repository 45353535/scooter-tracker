package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import com.ironsource.C4240b4;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j10, long j11) {
        super("Unexpected sample timestamp: " + Util.usToMs(j11) + " in chunk [" + mediaChunk.startTimeUs + ", " + mediaChunk.endTimeUs + C4240b4.j.f42674e);
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j10;
        this.rejectedSampleTimeUs = j11;
    }
}
