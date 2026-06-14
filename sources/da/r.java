package da;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.ironsource.C4240b4;
import j$.util.Objects;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f68545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f68546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f68547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f68549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f68550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f68551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f68552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f68553l;

    r(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f68542a = (String) q9.a.e(str);
        this.f68543b = str2;
        this.f68544c = str3;
        this.f68545d = codecCapabilities;
        this.f68549h = z10;
        this.f68550i = z11;
        this.f68551j = z12;
        this.f68546e = z13;
        this.f68547f = z14;
        this.f68548g = z15;
        this.f68552k = z16;
        this.f68553l = n9.w.t(str2);
    }

    private static boolean A(String str) {
        if (o0.f98837a > 22) {
            return false;
        }
        String str2 = Build.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean B(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean C(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static r D(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new r(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || A(str)) ? false : true, codecCapabilities != null && t(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)), m(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((o0.f98837a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        q9.u.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C4240b4.j.f42674e);
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(o0.k(i10, widthAlignment) * widthAlignment, o0.k(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i10 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(io.bidmachine.media3.common.a r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.r.k(io.bidmachine.media3.common.a, boolean):boolean");
    }

    private boolean l(io.bidmachine.media3.common.a aVar) {
        return (Objects.equals(aVar.f80561o, "audio/flac") && aVar.G == 22 && o0.f98837a < 34 && this.f68542a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return o0.f98837a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !z();
    }

    private boolean q(io.bidmachine.media3.common.a aVar) {
        return this.f68543b.equals(aVar.f80561o) || this.f68543b.equals(c0.f(aVar));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        q9.u.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f68542a + ", " + this.f68543b + "] [" + o0.f98841e + C4240b4.j.f42674e);
    }

    private void w(String str) {
        q9.u.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f68542a + ", " + this.f68543b + "] [" + o0.f98841e + C4240b4.j.f42674e);
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO");
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f68545d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public u9.c e(io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2) {
        io.bidmachine.media3.common.a aVar3;
        io.bidmachine.media3.common.a aVar4;
        int i10 = !Objects.equals(aVar.f80561o, aVar2.f80561o) ? 8 : 0;
        if (this.f68553l) {
            if (aVar.f80571y != aVar2.f80571y) {
                i10 |= 1024;
            }
            if (!this.f68546e && (aVar.f80568v != aVar2.f80568v || aVar.f80569w != aVar2.f80569w)) {
                i10 |= 512;
            }
            if ((!n9.g.h(aVar.C) || !n9.g.h(aVar2.C)) && !Objects.equals(aVar.C, aVar2.C)) {
                i10 |= 2048;
            }
            if (y(this.f68542a) && !aVar.f(aVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new u9.c(this.f68542a, aVar, aVar2, aVar.f(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.E != aVar4.E) {
                i10 |= 4096;
            }
            if (aVar3.F != aVar4.F) {
                i10 |= 8192;
            }
            if (aVar3.G != aVar4.G) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f68543b)) {
                Pair pairI = c0.i(aVar3);
                Pair pairI2 = c0.i(aVar4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new u9.c(this.f68542a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (!aVar3.f(aVar4)) {
                i10 |= 32;
            }
            if (x(this.f68543b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new u9.c(this.f68542a, aVar3, aVar4, 1, 0);
            }
        }
        return new u9.c(this.f68542a, aVar3, aVar4, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f68545d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f68545d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f68542a, this.f68543b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        w("channelCount.support, " + i10);
        return false;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f68545d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        w("sampleRate.support, " + i10);
        return false;
    }

    public boolean n(io.bidmachine.media3.common.a aVar) {
        return q(aVar) && k(aVar, false) && l(aVar);
    }

    public boolean o(io.bidmachine.media3.common.a aVar) {
        int i10;
        int i11;
        if (!q(aVar) || !k(aVar, true) || !l(aVar)) {
            return false;
        }
        if (!this.f68553l) {
            int i12 = aVar.F;
            return (i12 == -1 || j(i12)) && ((i10 = aVar.E) == -1 || i(i10));
        }
        int i13 = aVar.f80568v;
        if (i13 <= 0 || (i11 = aVar.f80569w) <= 0) {
            return true;
        }
        return u(i13, i11, aVar.f80570x);
    }

    public boolean p() {
        if (o0.f98837a >= 29 && "video/x-vnd.on2.vp9".equals(this.f68543b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(io.bidmachine.media3.common.a aVar) {
        if (this.f68553l) {
            return this.f68546e;
        }
        Pair pairI = c0.i(aVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f68542a;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f68545d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (o0.f98837a >= 29) {
            int iC = s.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                w("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !C(this.f68542a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
