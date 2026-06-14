package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
final class TtmlSubtitle implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, TtmlRegion> regionMap;
    private final TtmlNode root;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2) {
        this.root = ttmlNode;
        this.regionMap = map2;
        this.globalStyles = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.eventTimesUs = ttmlNode.getEventTimesUs();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return this.root.getCues(j10, this.globalStyles, this.regionMap);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        return this.eventTimesUs[i10];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    Map<String, TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j10, false, false);
        if (iBinarySearchCeil < this.eventTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    TtmlNode getRoot() {
        return this.root;
    }
}
