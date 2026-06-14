package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public interface LoadControl {

    @Deprecated
    public static final MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());

    public static final class Parameters {
        public final long bufferedDurationUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final Timeline timeline;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10, long j11, float f10, boolean z10, boolean z11, long j12) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j10;
            this.bufferedDurationUs = j11;
            this.playbackSpeed = f10;
            this.playWhenReady = z10;
            this.rebuffering = z11;
            this.targetLiveOffsetUs = j12;
        }
    }

    Allocator getAllocator();

    @Deprecated
    long getBackBufferDurationUs();

    long getBackBufferDurationUs(PlayerId playerId);

    @Deprecated
    void onPrepared();

    void onPrepared(PlayerId playerId);

    @Deprecated
    void onReleased();

    void onReleased(PlayerId playerId);

    @Deprecated
    void onStopped();

    void onStopped(PlayerId playerId);

    @Deprecated
    void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    boolean retainBackBufferFromKeyframe();

    boolean retainBackBufferFromKeyframe(PlayerId playerId);

    @Deprecated
    boolean shouldContinueLoading(long j10, long j11, float f10);

    boolean shouldContinueLoading(Parameters parameters);

    @Deprecated
    boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11);

    @Deprecated
    boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10, float f10, boolean z10, long j11);

    boolean shouldStartPlayback(Parameters parameters);
}
