package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = -9223372036854775807L;
    private long lastPresentationTimeUs = -9223372036854775807L;
    private long joiningDeadlineMs = -9223372036854775807L;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    public static class FrameReleaseInfo {
        private long earlyUs = -9223372036854775807L;
        private long releaseTimeNs = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = -9223372036854775807L;
            this.releaseTimeNs = -9223372036854775807L;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j10, long j11, boolean z10);

        boolean shouldForceReleaseFrame(long j10, long j11);

        boolean shouldIgnoreFrame(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException;
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j10) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j10;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.playbackSpeed));
        return this.started ? j13 - (Util.msToUs(this.clock.elapsedRealtime()) - j11) : j13;
    }

    private void lowerFirstFrameState(int i10) {
        this.firstFrameState = Math.min(this.firstFrameState, i10);
    }

    private boolean shouldForceRelease(long j10, long j11, long j12) {
        if (this.joiningDeadlineMs != -9223372036854775807L && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i10 = this.firstFrameState;
        if (i10 == 0) {
            return this.started;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j11, Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
        }
        throw new IllegalStateException();
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public int getFrameReleaseAction(long j10, long j11, long j12, long j13, boolean z10, FrameReleaseInfo frameReleaseInfo) throws ExoPlaybackException {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == -9223372036854775807L) {
            this.initialPositionUs = j11;
        }
        if (this.lastPresentationTimeUs != j10) {
            this.frameReleaseHelper.onNextFrame(j10);
            this.lastPresentationTimeUs = j10;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j11, j12, j10);
        if (shouldForceRelease(j11, frameReleaseInfo.earlyUs, j13)) {
            return 0;
        }
        if (!this.started || j11 == this.initialPositionUs) {
            return 5;
        }
        long jNanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + jNanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - jNanoTime) / 1000;
        boolean z11 = (this.joiningDeadlineMs == -9223372036854775807L || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j11, j12, z10, z11)) {
            return 4;
        }
        return this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j12, z10) ? z11 ? 3 : 2 : frameReleaseInfo.earlyUs > 50000 ? 5 : 1;
    }

    public boolean isReady(boolean z10) {
        if (z10 && this.firstFrameState == 3) {
            this.joiningDeadlineMs = -9223372036854775807L;
            return true;
        }
        if (this.joiningDeadlineMs == -9223372036854775807L) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = -9223372036854775807L;
        return false;
    }

    public void join(boolean z10) {
        this.joiningRenderNextFrameImmediately = z10;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : -9223372036854775807L;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onEnabled(boolean z10) {
        this.firstFrameState = z10 ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z10 = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z10;
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = -9223372036854775807L;
        this.frameReleaseHelper.onStopped();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = -9223372036854775807L;
        this.initialPositionUs = -9223372036854775807L;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = -9223372036854775807L;
    }

    public void setChangeFrameRateStrategy(int i10) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i10);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setFrameRate(float f10) {
        this.frameReleaseHelper.onFormatChanged(f10);
    }

    public void setOutputSurface(@Nullable Surface surface) {
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(float f10) {
        if (f10 == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f10;
        this.frameReleaseHelper.onPlaybackSpeed(f10);
    }
}
