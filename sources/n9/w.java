package n9;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList f95661a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f95662b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f95663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95664b;

        public a(int i10, int i11) {
            this.f95663a = i10;
            this.f95664b = i11;
        }

        public int a() {
            int i10 = this.f95664b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        a aVarI;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (aVarI = i(str2)) != null && (iA = aVarI.a()) != 0 && iA != 16) {
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : o0.l1(str)) {
            String strG = g(str2);
            if (strG != null && o(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrL1 = o0.l1(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrL1) {
                if (str2.equals(g(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(StringUtils.COMMA);
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    private static String e(String str) {
        ArrayList arrayList = f95661a;
        if (arrayList.size() <= 0) {
            return null;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int f(String str, String str2) {
        a aVarI;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b10 = 0;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b10 = 1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b10 = 2;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b10 = 3;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b10 = 4;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    b10 = 5;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b10 = 6;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b10 = 7;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b10 = 8;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b10 = 9;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b10 = 10;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b10 = Ascii.VT;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (aVarI = i(str2)) == null) {
                    return 0;
                }
                return aVarI.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        a aVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return "video/av01";
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? "audio/ac3" : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? "audio/eac3" : lowerCase.startsWith("ec+3") ? "audio/eac3-joc" : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? "audio/vnd.dts" : lowerCase.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? "audio/vnd.dts.hd" : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? "audio/opus" : lowerCase.startsWith("vorbis") ? "audio/vorbis" : lowerCase.startsWith("flac") ? "audio/flac" : lowerCase.startsWith("stpp") ? "application/ttml+xml" : lowerCase.startsWith("wvtt") ? "text/vtt" : lowerCase.contains("cea708") ? "application/cea-708" : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? "application/cea-608" : e(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (aVarI = i(lowerCase)) != null) {
            strH = h(aVarI.f95663a);
        }
        return strH == null ? "audio/mp4a-latm" : strH;
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static a i(String str) {
        Matcher matcher = f95662b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) q9.a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String j(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    private static int l(String str) {
        ArrayList arrayList = f95661a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        androidx.privacysandbox.ads.adservices.topics.a.a(arrayList.get(0));
        throw null;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : o0.l1(str)) {
            String strG = g(str2);
            if (strG != null && t(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean q(String str) {
        return "image".equals(j(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean s(String str) {
        return "text".equals(j(str)) || MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean t(String str) {
        return "video".equals(j(str));
    }

    public static String u(String str) {
        String lowerCase;
        if (str == null) {
            return null;
        }
        lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return lowerCase;
        }
    }
}
