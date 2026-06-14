package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

/* JADX INFO: loaded from: classes7.dex */
public interface AudioProcessorChain {
    PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z10);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j10);

    long getSkippedOutputFrameCount();
}
