package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
final class RtspSessionTiming {
    private static final long LIVE_START_TIME = 0;
    private static final String START_TIMING_NTP_FORMAT = "npt=%.3f-";
    public final long startTimeMs;
    public final long stopTimeMs;
    public static final RtspSessionTiming DEFAULT = new RtspSessionTiming(0, -9223372036854775807L);
    private static final Pattern NPT_RANGE_PATTERN = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    private RtspSessionTiming(long j10, long j11) {
        this.startTimeMs = j10;
        this.stopTimeMs = j11;
    }

    public static String getOffsetStartTimeTiming(long j10) {
        return Util.formatInvariant(START_TIMING_NTP_FORMAT, Double.valueOf(j10 / 1000.0d));
    }

    public static RtspSessionTiming parseTiming(String str) throws ParserException {
        long j10;
        Matcher matcher = NPT_RANGE_PATTERN.matcher(str);
        Assertions.checkArgument(matcher.matches());
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        long j11 = str2.equals("now") ? 0L : (long) (Float.parseFloat(str2) * 1000.0f);
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup) * 1000.0f);
                Assertions.checkArgument(j10 > j11);
            } catch (NumberFormatException e10) {
                throw ParserException.createForMalformedManifest(strGroup, e10);
            }
        } else {
            j10 = -9223372036854775807L;
        }
        return new RtspSessionTiming(j11, j10);
    }

    public long getDurationMs() {
        return this.stopTimeMs - this.startTimeMs;
    }

    public boolean isLive() {
        return this.stopTimeMs == -9223372036854775807L;
    }
}
