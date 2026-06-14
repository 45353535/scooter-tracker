package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
interface OggSeeker {
    @Nullable
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput) throws IOException;

    void startSeek(long j10);
}
