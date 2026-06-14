package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private final HashMap<PlayerId, PlayerLoadingState> loadingStates;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private final int targetBufferBytesOverwrite;
    private long threadId;

    public static final class Builder {

        @Nullable
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = 2500;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @CanIgnoreReturnValue
        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBackBuffer(int i10, boolean z10) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i10;
            this.retainBackBufferFromKeyframe = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBufferDurationsMs(int i10, int i11, int i12, int i13) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i10;
            this.maxBufferMs = i11;
            this.bufferForPlaybackMs = i12;
            this.bufferForPlaybackAfterRebufferMs = i13;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrioritizeTimeOverSizeThresholds(boolean z10) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetBufferBytes(int i10) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i10;
            return this;
        }
    }

    private static class PlayerLoadingState {
        public boolean isLoading;
        public int targetBufferBytes;

        private PlayerLoadingState() {
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i10, int i11, String str, String str2) {
        Assertions.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void removePlayer(PlayerId playerId) {
        if (this.loadingStates.remove(playerId) != null) {
            updateAllocator();
        }
    }

    private void resetPlayerLoadingState(PlayerId playerId) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(playerId));
        int i10 = this.targetBufferBytesOverwrite;
        if (i10 == -1) {
            i10 = 13107200;
        }
        playerLoadingState.targetBufferBytes = i10;
        playerLoadingState.isLoading = false;
    }

    private void updateAllocator() {
        if (this.loadingStates.isEmpty()) {
            this.allocator.reset();
        } else {
            this.allocator.setTargetBufferSize(calculateTotalTargetBufferBytes());
        }
    }

    protected int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int defaultBufferSize = 0;
        for (int i10 = 0; i10 < rendererArr.length; i10++) {
            if (exoTrackSelectionArr[i10] != null) {
                defaultBufferSize += getDefaultBufferSize(rendererArr[i10].getTrackType());
            }
        }
        return Math.max(13107200, defaultBufferSize);
    }

    @VisibleForTesting
    int calculateTotalTargetBufferBytes() {
        Iterator<PlayerLoadingState> it = this.loadingStates.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().targetBufferBytes;
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ long getBackBufferDurationUs() {
        return c2.a(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onPrepared() {
        c2.c(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onReleased() {
        c2.e(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onStopped() {
        c2.g(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        c2.i(this, timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean retainBackBufferFromKeyframe() {
        return c2.l(this);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldContinueLoading(long j10, long j11, float f10) {
        return c2.n(this, j10, j11, f10);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        return c2.p(this, j10, f10, z10, j11);
    }

    protected DefaultLoadControl(DefaultAllocator defaultAllocator, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        assertGreaterOrEqual(i12, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i11, i10, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i15, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i10);
        this.maxBufferUs = Util.msToUs(i11);
        this.bufferForPlaybackUs = Util.msToUs(i12);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i13);
        this.targetBufferBytesOverwrite = i14;
        this.prioritizeTimeOverSizeThresholds = z10;
        this.backBufferDurationUs = Util.msToUs(i15);
        this.retainBackBufferFromKeyframe = z11;
        this.loadingStates = new HashMap<>();
        this.threadId = -1L;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public long getBackBufferDurationUs(PlayerId playerId) {
        return this.backBufferDurationUs;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onPrepared(PlayerId playerId) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.threadId;
        Assertions.checkState(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.threadId = id2;
        if (!this.loadingStates.containsKey(playerId)) {
            this.loadingStates.put(playerId, new PlayerLoadingState());
        }
        resetPlayerLoadingState(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onReleased(PlayerId playerId) {
        removePlayer(playerId);
        if (this.loadingStates.isEmpty()) {
            this.threadId = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onStopped(PlayerId playerId) {
        removePlayer(playerId);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        c2.k(this, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldContinueLoading(LoadControl.Parameters parameters) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(parameters.playerId));
        boolean z10 = true;
        boolean z11 = this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
        long jMin = this.minBufferUs;
        float f10 = parameters.playbackSpeed;
        if (f10 > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f10), this.maxBufferUs);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = parameters.bufferedDurationUs;
        if (j10 < jMax) {
            if (!this.prioritizeTimeOverSizeThresholds && z11) {
                z10 = false;
            }
            playerLoadingState.isLoading = z10;
            if (!z10 && j10 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.maxBufferUs || z11) {
            playerLoadingState.isLoading = false;
        }
        return playerLoadingState.isLoading;
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public /* synthetic */ boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j10, float f10, boolean z10, long j11) {
        return c2.q(this, timeline, mediaPeriodId, j10, f10, z10, j11);
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        PlayerLoadingState playerLoadingState = (PlayerLoadingState) Assertions.checkNotNull(this.loadingStates.get(playerId));
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        playerLoadingState.targetBufferBytes = iCalculateTargetBufferBytes;
        updateAllocator();
    }

    @Override // androidx.media3.exoplayer.LoadControl
    public boolean shouldStartPlayback(LoadControl.Parameters parameters) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(parameters.bufferedDurationUs, parameters.playbackSpeed);
        long jMin = parameters.rebuffering ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        long j10 = parameters.targetLiveOffsetUs;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || playoutDurationForMediaDuration >= jMin) {
            return true;
        }
        return !this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= calculateTotalTargetBufferBytes();
    }
}
