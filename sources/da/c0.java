package da;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f68475a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f68476b = -1;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f68479c;

        public b(String str, boolean z10, boolean z11) {
            this.f68477a = str;
            this.f68478b = z10;
            this.f68479c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f68477a, bVar.f68477a) && this.f68478b == bVar.f68478b && this.f68479c == bVar.f68479c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f68477a.hashCode() + 31) * 31) + (this.f68478b ? 1231 : 1237)) * 31) + (this.f68479c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    private interface d {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i10);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    private static final class e implements d {
        private e() {
        }

        @Override // da.c0.d
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // da.c0.d
        public MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // da.c0.d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // da.c0.d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // da.c0.d
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f68480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f68481b;

        public f(boolean z10, boolean z11, boolean z12) {
            this.f68480a = (z10 || z11 || z12) ? 1 : 0;
        }

        private void a() {
            if (this.f68481b == null) {
                this.f68481b = new MediaCodecList(this.f68480a).getCodecInfos();
            }
        }

        @Override // da.c0.d
        public int getCodecCount() {
            a();
            return this.f68481b.length;
        }

        @Override // da.c0.d
        public MediaCodecInfo getCodecInfoAt(int i10) {
            a();
            return this.f68481b[i10];
        }

        @Override // da.c0.d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // da.c0.d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // da.c0.d
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface g {
        int getScore(Object obj);
    }

    private static void A(List list, final g gVar) {
        Collections.sort(list, new Comparator() { // from class: da.a0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c0.c(gVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(r rVar) {
        return (rVar.f68550i ? 2 : 0) + (!rVar.f68551j ? 1 : 0);
    }

    public static /* synthetic */ int b(io.bidmachine.media3.common.a aVar, r rVar) {
        return rVar.n(aVar) ? 1 : 0;
    }

    public static /* synthetic */ int c(g gVar, Object obj, Object obj2) {
        return gVar.getScore(obj2) - gVar.getScore(obj);
    }

    public static /* synthetic */ int d(r rVar) {
        String str = rVar.f68542a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (o0.f98837a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (o0.f98837a < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && ((r) list.get(0)).f68542a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(r.D("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            A(list, new g() { // from class: da.y
                @Override // da.c0.g
                public final int getScore(Object obj) {
                    return c0.d((r) obj);
                }
            });
        }
        if (o0.f98837a >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((r) list.get(0)).f68542a)) {
            return;
        }
        list.add((r) list.remove(0));
    }

    public static String f(io.bidmachine.media3.common.a aVar) {
        Pair pairI;
        if ("audio/eac3-joc".equals(aVar.f80561o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(aVar.f80561o) && (pairI = i(aVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(aVar.f80561o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List g(x xVar, io.bidmachine.media3.common.a aVar, boolean z10, boolean z11) {
        String strF = f(aVar);
        return strF == null ? ImmutableList.of() : xVar.getDecoderInfos(strF, z10, z11);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair i(io.bidmachine.media3.common.a aVar) {
        return q9.i.n(aVar);
    }

    public static r j(String str, boolean z10, boolean z11) {
        List listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return (r) listK.get(0);
    }

    public static synchronized List k(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap map = f68475a;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListL = l(bVar, new f(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListL.isEmpty() && o0.f98837a <= 23) {
                arrayListL = l(bVar, new e());
                if (!arrayListL.isEmpty()) {
                    q9.u.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((r) arrayListL.get(0)).f68542a);
                }
            }
            e(str, arrayListL);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListL);
            map.put(bVar, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[PHI: r16
  0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList l(da.c0.b r19, da.c0.d r20) throws da.c0.c {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.c0.l(da.c0$b, da.c0$d):java.util.ArrayList");
    }

    public static List m(x xVar, io.bidmachine.media3.common.a aVar, boolean z10, boolean z11) {
        List decoderInfos = xVar.getDecoderInfos(aVar.f80561o, z10, z11);
        return ImmutableList.builder().addAll((Iterable) decoderInfos).addAll((Iterable) g(xVar, aVar, z10, z11)).build();
    }

    public static List n(List list, final io.bidmachine.media3.common.a aVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new g() { // from class: da.z
            @Override // da.c0.g
            public final int getScore(Object obj) {
                return c0.b(aVar, (r) obj);
            }
        });
        return arrayList;
    }

    public static List o(List list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new g() { // from class: da.b0
            @Override // da.c0.g
            public final int getScore(Object obj) {
                return c0.a((r) obj);
            }
        });
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public static r p() {
        return j("audio/raw", false, false);
    }

    public static Pair q(io.bidmachine.media3.common.a aVar) {
        String strH = r9.f.h(aVar.f80564r);
        if (strH == null) {
            return null;
        }
        return q9.i.q(strH, o0.j1(strH.trim(), "\\."), aVar.C);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return o0.f98837a >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = o0.f98837a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return o0.f98837a >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (o0.f98837a >= 29) {
            return x(mediaCodecInfo);
        }
        if (n9.w.o(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (o0.f98837a >= 29) {
            return z(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
