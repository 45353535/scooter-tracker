package androidx.media3.common.util;

import androidx.media3.common.audio.SpeedProvider;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j10) {
        long j11 = 0;
        double dMin = 0.0d;
        while (j11 < j10) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j11);
            if (nextSpeedChangeTimeUs == -9223372036854775807L) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j10) - j11) / ((double) speedProvider.getSpeed(j11));
            j11 = nextSpeedChangeTimeUs;
        }
        return Math.round(dMin);
    }
}
