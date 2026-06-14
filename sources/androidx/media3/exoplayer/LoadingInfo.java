package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        @CanIgnoreReturnValue
        public Builder setLastRebufferRealtimeMs(long j10) {
            Assertions.checkArgument(j10 >= 0 || j10 == -9223372036854775807L);
            this.lastRebufferRealtimeMs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackPositionUs(long j10) {
            this.playbackPositionUs = j10;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackSpeed(float f10) {
            Assertions.checkArgument(f10 > 0.0f || f10 == -3.4028235E38f);
            this.playbackSpeed = f10;
            return this;
        }

        public Builder() {
            this.playbackPositionUs = -9223372036854775807L;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = -9223372036854775807L;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j10) {
        long j11 = this.lastRebufferRealtimeMs;
        return (j11 == -9223372036854775807L || j10 == -9223372036854775807L || j11 < j10) ? false : true;
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }
}
