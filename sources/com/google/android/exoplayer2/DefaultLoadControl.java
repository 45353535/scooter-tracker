package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes7.dex */
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
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

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

        @Deprecated
        public DefaultLoadControl createDefaultLoadControl() {
            return build();
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

    private void reset(boolean z10) {
        int i10 = this.targetBufferBytesOverwrite;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.targetBufferBytes = i10;
        this.isLoading = false;
        if (z10) {
            this.allocator.reset();
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

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return this.backBufferDurationUs;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        this.targetBufferBytes = iCalculateTargetBufferBytes;
        this.allocator.setTargetBufferSize(iCalculateTargetBufferBytes);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
        long jMin = this.minBufferUs;
        if (f10 > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f10), this.maxBufferUs);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.prioritizeTimeOverSizeThresholds && z11) {
                z10 = false;
            }
            this.isLoading = z10;
            if (!z10 && j11 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.maxBufferUs || z11) {
            this.isLoading = false;
        }
        return this.isLoading;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j10, f10);
        long jMin = z10 ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || playoutDurationForMediaDuration >= jMin) {
            return true;
        }
        return !this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
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
        this.targetBufferBytes = i14 == -1 ? 13107200 : i14;
        this.prioritizeTimeOverSizeThresholds = z10;
        this.backBufferDurationUs = Util.msToUs(i15);
        this.retainBackBufferFromKeyframe = z11;
    }
}
