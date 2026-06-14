package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes7.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int HEADER_SIZE = 18;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private int bytesRead;
    private Format format;
    private String formatId;

    @Nullable
    private final String language;
    private TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int syncBytes;
    private final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[18]);
    private int state = 0;
    private long timeUs = -9223372036854775807L;

    public DtsReader(@Nullable String str) {
        this.language = str;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i10) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i10 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i11 = this.bytesRead + iMin;
        this.bytesRead = i11;
        return i11 == i10;
    }

    private void parseHeader() {
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            Format dtsFormat = DtsUtil.parseDtsFormat(data, this.formatId, this.language, null);
            this.format = dtsFormat;
            this.output.format(dtsFormat);
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = (int) ((((long) DtsUtil.parseDtsAudioSampleCount(data)) * 1000000) / ((long) this.format.sampleRate));
    }

    private boolean skipToNextSync(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i10 = this.syncBytes << 8;
            this.syncBytes = i10;
            int unsignedByte = i10 | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            if (DtsUtil.isSyncWord(unsignedByte)) {
                byte[] data = this.headerScratchBytes.getData();
                int i11 = this.syncBytes;
                data[0] = (byte) ((i11 >> 24) & 255);
                data[1] = (byte) ((i11 >> 16) & 255);
                data[2] = (byte) ((i11 >> 8) & 255);
                data[3] = (byte) (i11 & 255);
                this.bytesRead = 4;
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, iMin);
                    int i11 = this.bytesRead + iMin;
                    this.bytesRead = i11;
                    int i12 = this.sampleSize;
                    if (i11 == i12) {
                        long j10 = this.timeUs;
                        if (j10 != -9223372036854775807L) {
                            this.output.sampleMetadata(j10, 1, i12, 0, null);
                            this.timeUs += this.sampleDurationUs;
                        }
                        this.state = 0;
                    }
                } else if (continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                    parseHeader();
                    this.headerScratchBytes.setPosition(0);
                    this.output.sampleData(this.headerScratchBytes, 18);
                    this.state = 2;
                }
            } else if (skipToNextSync(parsableByteArray)) {
                this.state = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.timeUs = j10;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.timeUs = -9223372036854775807L;
    }
}
