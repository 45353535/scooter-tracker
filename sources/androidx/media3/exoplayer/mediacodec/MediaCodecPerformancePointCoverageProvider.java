package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    @RequiresApi(29)
    private static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            n.a();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, m.a(i10, i11, (int) d10));
            if (iEvaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (k.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            List supportedPerformancePoints;
            if (Util.SDK_INT >= 35) {
                return false;
            }
            try {
                Format formatBuild = new Format.Builder().setSampleMimeType("video/avc").build();
                if (formatBuild.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, formatBuild, false, false);
                    for (int i10 = 0; i10 < decoderInfosSoftMatch.size(); i10++) {
                        if (decoderInfosSoftMatch.get(i10).capabilities != null && decoderInfosSoftMatch.get(i10).capabilities.getVideoCapabilities() != null && (supportedPerformancePoints = decoderInfosSoftMatch.get(i10).capabilities.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            n.a();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, m.a(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
