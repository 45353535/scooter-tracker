package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ChunkExtractor {

    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i10, Format format, boolean z10, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);
    }

    public interface TrackOutputProvider {
        TrackOutput track(int i10, int i11);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j10, long j11);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();
}
