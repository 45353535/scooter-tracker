package com.google.android.exoplayer2;

import com.google.android.exoplayer2.MediaItem;

/* JADX INFO: loaded from: classes7.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j10, long j11);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j10);
}
