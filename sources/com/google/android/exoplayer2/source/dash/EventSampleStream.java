package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final Format upstreamFormat;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private long pendingSeekPositionUs = -9223372036854775807L;

    public EventSampleStream(EventStream eventStream, Format format, boolean z10) {
        this.upstreamFormat = format;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z10);
    }

    public String eventStreamId() {
        return this.eventStream.id();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = this.currentIndex;
        boolean z10 = i11 == this.eventTimesUs.length;
        if (z10 && !this.eventStreamAppendable) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.currentIndex = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrEncode = this.eventMessageEncoder.encode(this.eventStream.events[i11]);
            decoderInputBuffer.ensureSpaceForWrite(bArrEncode.length);
            decoderInputBuffer.data.put(bArrEncode);
        }
        decoderInputBuffer.timeUs = this.eventTimesUs[i11];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    public void seekToUs(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j10, true, false);
        this.currentIndex = iBinarySearchCeil;
        if (!this.eventStreamAppendable || iBinarySearchCeil != this.eventTimesUs.length) {
            j10 = -9223372036854775807L;
        }
        this.pendingSeekPositionUs = j10;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long j10) {
        int iMax = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j10, true, false));
        int i10 = iMax - this.currentIndex;
        this.currentIndex = iMax;
        return i10;
    }

    public void updateEventStream(EventStream eventStream, boolean z10) {
        int i10 = this.currentIndex;
        long j10 = i10 == 0 ? -9223372036854775807L : this.eventTimesUs[i10 - 1];
        this.eventStreamAppendable = z10;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j11 = this.pendingSeekPositionUs;
        if (j11 != -9223372036854775807L) {
            seekToUs(j11);
        } else if (j10 != -9223372036854775807L) {
            this.currentIndex = Util.binarySearchCeil(jArr, j10, false, false);
        }
    }
}
