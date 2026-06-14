package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public final class PlaybackParameters {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    private static final String FIELD_SPEED = Util.intToStringMaxRadix(0);
    private static final String FIELD_PITCH = Util.intToStringMaxRadix(1);

    public PlaybackParameters(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        this(f10, 1.0f);
    }

    @UnstableApi
    public static PlaybackParameters fromBundle(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(FIELD_SPEED, 1.0f), bundle.getFloat(FIELD_PITCH, 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public long getMediaTimeUsForPlayoutTimeMs(long j10) {
        return j10 * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.speed)) * 31) + Float.floatToRawIntBits(this.pitch);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(FIELD_SPEED, this.speed);
        bundle.putFloat(FIELD_PITCH, this.pitch);
        return bundle;
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    @CheckResult
    public PlaybackParameters withSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        return new PlaybackParameters(f10, this.pitch);
    }

    public PlaybackParameters(@FloatRange(from = 0.0d, fromInclusive = false) float f10, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        Assertions.checkArgument(f10 > 0.0f);
        Assertions.checkArgument(f11 > 0.0f);
        this.speed = f10;
        this.pitch = f11;
        this.scaledUsPerMs = Math.round(f10 * 1000.0f);
    }
}
