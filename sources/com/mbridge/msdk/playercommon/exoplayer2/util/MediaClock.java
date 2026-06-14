package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;

/* JADX INFO: loaded from: classes10.dex */
public interface MediaClock {
    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters);
}
