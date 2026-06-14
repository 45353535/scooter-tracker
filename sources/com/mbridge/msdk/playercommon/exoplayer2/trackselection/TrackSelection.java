package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.MediaChunk;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface TrackSelection {

    public interface Factory {
        TrackSelection createTrackSelection(TrackGroup trackGroup, int... iArr);
    }

    boolean blacklist(int i10, long j10);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends MediaChunk> list);

    Format getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    TrackGroup getTrackGroup();

    int indexOf(int i10);

    int indexOf(Format format);

    int length();

    void onPlaybackSpeed(float f10);

    void updateSelectedTrack(long j10, long j11, long j12);
}
