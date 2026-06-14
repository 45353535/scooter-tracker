package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface DashChunkSource extends ChunkSource {

    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i10, int[] iArr, ExoTrackSelection exoTrackSelection, int i11, long j10, boolean z10, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId);
    }

    void updateManifest(DashManifest dashManifest, int i10);

    void updateTrackSelection(ExoTrackSelection exoTrackSelection);
}
