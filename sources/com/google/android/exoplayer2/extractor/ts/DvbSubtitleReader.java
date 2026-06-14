package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {
    private int bytesToCheck;
    private final TrackOutput[] outputs;
    private int sampleBytesWritten;
    private long sampleTimeUs = -9223372036854775807L;
    private final List<TsPayloadReader.DvbSubtitleInfo> subtitleInfos;
    private boolean writingSample;

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> list) {
        this.subtitleInfos = list;
        this.outputs = new TrackOutput[list.size()];
    }

    private boolean checkNextByte(ParsableByteArray parsableByteArray, int i10) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray.readUnsignedByte() != i10) {
            this.writingSample = false;
        }
        this.bytesToCheck--;
        return this.writingSample;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        if (this.writingSample) {
            if (this.bytesToCheck != 2 || checkNextByte(parsableByteArray, 32)) {
                if (this.bytesToCheck != 1 || checkNextByte(parsableByteArray, 0)) {
                    int position = parsableByteArray.getPosition();
                    int iBytesLeft = parsableByteArray.bytesLeft();
                    for (TrackOutput trackOutput : this.outputs) {
                        parsableByteArray.setPosition(position);
                        trackOutput.sampleData(parsableByteArray, iBytesLeft);
                    }
                    this.sampleBytesWritten += iBytesLeft;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i10 = 0; i10 < this.outputs.length; i10++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.subtitleInfos.get(i10);
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            trackOutputTrack.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType("application/dvbsubs").setInitializationData(Collections.singletonList(dvbSubtitleInfo.initializationData)).setLanguage(dvbSubtitleInfo.language).build());
            this.outputs[i10] = trackOutputTrack;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
        if (this.writingSample) {
            if (this.sampleTimeUs != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.outputs) {
                    trackOutput.sampleMetadata(this.sampleTimeUs, 1, this.sampleBytesWritten, 0, null);
                }
            }
            this.writingSample = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.writingSample = true;
        if (j10 != -9223372036854775807L) {
            this.sampleTimeUs = j10;
        }
        this.sampleBytesWritten = 0;
        this.bytesToCheck = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = -9223372036854775807L;
    }
}
