package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        return new DiscardingTrackOutput();
    }
}
