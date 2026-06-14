package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class TtmlSubtitle implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, String> imageMap;
    private final Map<String, TtmlRegion> regionMap;
    private final TtmlNode root;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        this.root = ttmlNode;
        this.regionMap = map2;
        this.imageMap = map3;
        this.globalStyles = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.eventTimesUs = ttmlNode.getEventTimesUs();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return this.root.getCues(j10, this.globalStyles, this.regionMap, this.imageMap);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        return this.eventTimesUs[i10];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    @VisibleForTesting
    Map<String, TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j10, false, false);
        if (iBinarySearchCeil < this.eventTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @VisibleForTesting
    TtmlNode getRoot() {
        return this.root;
    }
}
