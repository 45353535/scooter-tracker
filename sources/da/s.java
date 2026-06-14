package da;

import android.media.MediaCodecInfo;
import da.c0;
import io.bidmachine.media3.common.a;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f68554a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            androidx.media3.exoplayer.mediacodec.n.a();
            int iC = c(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.m.a(i10, i11, (int) d10));
            if (iC == 1 && s.f68554a == null) {
                Boolean unused = s.f68554a = Boolean.valueOf(d());
                if (s.f68554a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z10) {
            List supportedPerformancePoints;
            try {
                io.bidmachine.media3.common.a aVarN = new a.b().u0("video/avc").N();
                if (aVarN.f80561o != null) {
                    List listM = c0.m(x.f68600a, aVarN, z10, false);
                    for (int i10 = 0; i10 < listM.size(); i10++) {
                        if (((r) listM.get(i10)).f68545d != null && ((r) listM.get(i10)).f68545d.getVideoCapabilities() != null && (supportedPerformancePoints = ((r) listM.get(i10)).f68545d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            androidx.media3.exoplayer.mediacodec.n.a();
                            return c(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.m.a(1280, 720, 60));
                        }
                    }
                }
            } catch (c0.c unused) {
            }
            return 0;
        }

        private static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (androidx.media3.exoplayer.mediacodec.k.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            if (o0.f98837a >= 35) {
                return false;
            }
            int iB = b(false);
            int iB2 = b(true);
            if (iB == 0) {
                return true;
            }
            return iB2 == 0 ? iB != 2 : (iB == 2 && iB2 == 2) ? false : true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (o0.f98837a < 29) {
            return 0;
        }
        Boolean bool = f68554a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
