package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {
    public final String baseUri;
    public final boolean hasIndependentSegments;
    public final List<String> tags;

    protected HlsPlaylist(String str, List<String> list, boolean z10) {
        this.baseUri = str;
        this.tags = DesugarCollections.unmodifiableList(list);
        this.hasIndependentSegments = z10;
    }
}
