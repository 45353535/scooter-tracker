package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* JADX INFO: loaded from: classes10.dex */
public interface ExtractorOutput {
    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i10, int i11);
}
