package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes7.dex */
public interface RtpPayloadReader {

    public interface Factory {
        RtpPayloadReader createPayloadReader(RtpPayloadFormat rtpPayloadFormat);
    }

    void consume(ParsableByteArray parsableByteArray, long j10, int i10, boolean z10) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, int i10);

    void onReceivingFirstPacket(long j10, int i10);

    void seek(long j10, long j11);
}
