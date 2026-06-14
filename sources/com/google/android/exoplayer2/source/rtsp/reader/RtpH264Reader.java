package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.rtsp.RtpPacket;
import com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes7.dex */
final class RtpH264Reader implements RtpPayloadReader {
    private static final int FU_PAYLOAD_OFFSET = 2;
    private static final long MEDIA_CLOCK_FREQUENCY = 90000;
    private static final int NAL_UNIT_TYPE_IDR = 5;
    private static final int RTP_PACKET_TYPE_FU_A = 28;
    private static final int RTP_PACKET_TYPE_STAP_A = 24;
    private static final String TAG = "RtpH264Reader";
    private int bufferFlags;
    private int fragmentedSampleSizeBytes;
    private final RtpPayloadFormat payloadFormat;
    private long startTimeOffsetUs;
    private TrackOutput trackOutput;
    private final ParsableByteArray nalStartCodeArray = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    private final ParsableByteArray fuScratchBuffer = new ParsableByteArray();
    private long firstReceivedTimestamp = -9223372036854775807L;
    private int previousSequenceNumber = -1;

    public RtpH264Reader(RtpPayloadFormat rtpPayloadFormat) {
        this.payloadFormat = rtpPayloadFormat;
    }

    private static int getBufferFlagsFromNalType(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    private void processFragmentationUnitPacket(ParsableByteArray parsableByteArray, int i10) {
        byte b10 = parsableByteArray.getData()[0];
        byte b11 = parsableByteArray.getData()[1];
        int i11 = (b10 & 224) | (b11 & Ascii.US);
        boolean z10 = (b11 & UnsignedBytes.MAX_POWER_OF_TWO) > 0;
        boolean z11 = (b11 & SignedBytes.MAX_POWER_OF_TWO) > 0;
        if (z10) {
            this.fragmentedSampleSizeBytes += writeStartCode();
            parsableByteArray.getData()[1] = (byte) i11;
            this.fuScratchBuffer.reset(parsableByteArray.getData());
            this.fuScratchBuffer.setPosition(1);
        } else {
            int nextSequenceNumber = RtpPacket.getNextSequenceNumber(this.previousSequenceNumber);
            if (i10 != nextSequenceNumber) {
                Log.w(TAG, Util.formatInvariant("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(nextSequenceNumber), Integer.valueOf(i10)));
                return;
            } else {
                this.fuScratchBuffer.reset(parsableByteArray.getData());
                this.fuScratchBuffer.setPosition(2);
            }
        }
        int iBytesLeft = this.fuScratchBuffer.bytesLeft();
        this.trackOutput.sampleData(this.fuScratchBuffer, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        if (z11) {
            this.bufferFlags = getBufferFlagsFromNalType(i11 & 31);
        }
    }

    private void processSingleNalUnitPacket(ParsableByteArray parsableByteArray) {
        int iBytesLeft = parsableByteArray.bytesLeft();
        this.fragmentedSampleSizeBytes += writeStartCode();
        this.trackOutput.sampleData(parsableByteArray, iBytesLeft);
        this.fragmentedSampleSizeBytes += iBytesLeft;
        this.bufferFlags = getBufferFlagsFromNalType(parsableByteArray.getData()[0] & Ascii.US);
    }

    private void processSingleTimeAggregationPacket(ParsableByteArray parsableByteArray) {
        parsableByteArray.readUnsignedByte();
        while (parsableByteArray.bytesLeft() > 4) {
            int unsignedShort = parsableByteArray.readUnsignedShort();
            this.fragmentedSampleSizeBytes += writeStartCode();
            this.trackOutput.sampleData(parsableByteArray, unsignedShort);
            this.fragmentedSampleSizeBytes += unsignedShort;
        }
        this.bufferFlags = 0;
    }

    private static long toSampleUs(long j10, long j11, long j12) {
        return j10 + Util.scaleLargeTimestamp(j11 - j12, 1000000L, MEDIA_CLOCK_FREQUENCY);
    }

    private int writeStartCode() {
        this.nalStartCodeArray.setPosition(0);
        int iBytesLeft = this.nalStartCodeArray.bytesLeft();
        ((TrackOutput) Assertions.checkNotNull(this.trackOutput)).sampleData(this.nalStartCodeArray, iBytesLeft);
        return iBytesLeft;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void consume(ParsableByteArray parsableByteArray, long j10, int i10, boolean z10) throws ParserException {
        try {
            int i11 = parsableByteArray.getData()[0] & Ascii.US;
            Assertions.checkStateNotNull(this.trackOutput);
            if (i11 > 0 && i11 < 24) {
                processSingleNalUnitPacket(parsableByteArray);
            } else if (i11 == 24) {
                processSingleTimeAggregationPacket(parsableByteArray);
            } else {
                if (i11 != 28) {
                    throw ParserException.createForMalformedManifest(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                processFragmentationUnitPacket(parsableByteArray, i10);
            }
            if (z10) {
                if (this.firstReceivedTimestamp == -9223372036854775807L) {
                    this.firstReceivedTimestamp = j10;
                }
                this.trackOutput.sampleMetadata(toSampleUs(this.startTimeOffsetUs, j10, this.firstReceivedTimestamp), this.bufferFlags, this.fragmentedSampleSizeBytes, 0, null);
                this.fragmentedSampleSizeBytes = 0;
            }
            this.previousSequenceNumber = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw ParserException.createForMalformedManifest(null, e10);
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void createTracks(ExtractorOutput extractorOutput, int i10) {
        TrackOutput trackOutputTrack = extractorOutput.track(i10, 2);
        this.trackOutput = trackOutputTrack;
        ((TrackOutput) Util.castNonNull(trackOutputTrack)).format(this.payloadFormat.format);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void onReceivingFirstPacket(long j10, int i10) {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.reader.RtpPayloadReader
    public void seek(long j10, long j11) {
        this.firstReceivedTimestamp = j10;
        this.fragmentedSampleSizeBytes = 0;
        this.startTimeOffsetUs = j11;
    }
}
