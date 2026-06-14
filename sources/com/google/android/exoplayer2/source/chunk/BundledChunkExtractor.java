package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = new ChunkExtractor.Factory() { // from class: com.google.android.exoplayer2.source.chunk.a
        @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
        public final ChunkExtractor createProgressiveMediaExtractor(int i10, Format format, boolean z10, List list, TrackOutput trackOutput, PlayerId playerId) {
            return BundledChunkExtractor.a(i10, format, z10, list, trackOutput, playerId);
        }
    };
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs = new SparseArray<>();
    private long endTimeUs;
    private final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    private static final class BindingTrackOutput implements TrackOutput {
        private long endTimeUs;
        private final DummyTrackOutput fakeTrackOutput = new DummyTrackOutput();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f25070id;

        @Nullable
        private final Format manifestFormat;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        public BindingTrackOutput(int i10, int i11, @Nullable Format format) {
            this.f25070id = i10;
            this.type = i11;
            this.manifestFormat = format;
        }

        public void bind(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j10) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j10;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.f25070id, this.type);
            this.trackOutput = trackOutputTrack;
            Format format = this.sampleFormat;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            ((TrackOutput) Util.castNonNull(this.trackOutput)).format(this.sampleFormat);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) {
            return f.a(this, dataReader, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            long j11 = this.endTimeUs;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.trackOutput = this.fakeTrackOutput;
            }
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(j10, i10, i11, i12, cryptoData);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
            f.b(this, parsableByteArray, i10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
            return ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(dataReader, i10, z10);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(parsableByteArray, i10);
        }
    }

    public BundledChunkExtractor(Extractor extractor, int i10, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i10;
        this.primaryTrackManifestFormat = format;
    }

    public static /* synthetic */ ChunkExtractor a(int i10, Format format, boolean z10, List list, TrackOutput trackOutput, PlayerId playerId) {
        Extractor fragmentedMp4Extractor;
        String str = format.containerMimeType;
        if (MimeTypes.isText(str)) {
            return null;
        }
        if (MimeTypes.isMatroska(str)) {
            fragmentedMp4Extractor = new MatroskaExtractor(1);
        } else {
            fragmentedMp4Extractor = new FragmentedMp4Extractor(z10 ? 4 : 0, null, null, list, trackOutput);
        }
        return new BundledChunkExtractor(fragmentedMp4Extractor, i10, format);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i10 = 0; i10 < this.bindingTrackOutputs.size(); i10++) {
            formatArr[i10] = (Format) Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i10).sampleFormat);
        }
        this.sampleFormats = formatArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.seekMap;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j10, long j11) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j11;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j10 != -9223372036854775807L) {
                this.extractor.seek(0L, j10);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        extractor.seek(0L, j10);
        for (int i10 = 0; i10 < this.bindingTrackOutputs.size(); i10++) {
            this.bindingTrackOutputs.valueAt(i10).bind(trackOutputProvider, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        int i10 = this.extractor.read(extractorInput, POSITION_HOLDER);
        Assertions.checkState(i10 != 1);
        return i10 == 0;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i10);
        if (bindingTrackOutput == null) {
            Assertions.checkState(this.sampleFormats == null);
            bindingTrackOutput = new BindingTrackOutput(i10, i11, i11 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            bindingTrackOutput.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i10, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }
}
