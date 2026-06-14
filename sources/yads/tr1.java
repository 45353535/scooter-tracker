package yads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f116347a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f116348b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        sr1 sr1VarB;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (sr1VarB = b(str2)) != null) {
                    int i10 = sr1VarB.f115914b;
                    char c10 = i10 != 2 ? i10 != 5 ? i10 != 29 ? i10 != 42 ? i10 != 22 ? i10 != 23 ? (char) 0 : (char) 15 : Ascii.MIN : (char) 16 : '\f' : (char) 11 : '\n';
                    if (c10 == 0 || c10 == 16) {
                    }
                }
                break;
        }
        return false;
    }

    public static int b(String str, String str2) {
        sr1 sr1VarB;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (sr1VarB = b(str2)) == null) {
                    return 0;
                }
                int i10 = sr1VarB.f115914b;
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
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(c(str))) {
            return 1;
        }
        if ("video".equals(c(str))) {
            return 2;
        }
        if (e(str)) {
            return 3;
        }
        if ("image".equals(c(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f116347a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        a2.a(arrayList.get(0));
        throw null;
    }

    public static boolean e(String str) {
        return "text".equals(c(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean f(String str) {
        return "video".equals(c(str));
    }

    public static String a(String str) {
        sr1 sr1VarB;
        String strA = null;
        if (str == null) {
            return null;
        }
        String strA2 = ci.a(str.trim());
        if (!strA2.startsWith("avc1") && !strA2.startsWith("avc3")) {
            if (!strA2.startsWith("hev1") && !strA2.startsWith("hvc1")) {
                if (!strA2.startsWith("dvav") && !strA2.startsWith("dva1") && !strA2.startsWith("dvhe") && !strA2.startsWith("dvh1")) {
                    if (strA2.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!strA2.startsWith("vp9") && !strA2.startsWith("vp09")) {
                        if (!strA2.startsWith("vp8") && !strA2.startsWith("vp08")) {
                            if (strA2.startsWith("mp4a")) {
                                if (strA2.startsWith("mp4a.") && (sr1VarB = b(strA2)) != null) {
                                    strA = a(sr1VarB.f115913a);
                                }
                                return strA == null ? "audio/mp4a-latm" : strA;
                            }
                            if (strA2.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (strA2.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!strA2.startsWith("ac-3") && !strA2.startsWith("dac3")) {
                                if (!strA2.startsWith("ec-3") && !strA2.startsWith("dec3")) {
                                    if (strA2.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!strA2.startsWith("ac-4") && !strA2.startsWith("dac4")) {
                                        if (strA2.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (strA2.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!strA2.startsWith("dtsh") && !strA2.startsWith("dtsl")) {
                                            if (strA2.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (strA2.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (strA2.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (strA2.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (strA2.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (strA2.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (strA2.contains("cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!strA2.contains("eia608") && !strA2.contains("cea608")) {
                                                ArrayList arrayList = f116347a;
                                                if (arrayList.size() <= 0) {
                                                    return null;
                                                }
                                                a2.a(arrayList.get(0));
                                                throw null;
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static sr1 b(String str) {
        Matcher matcher = f116348b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new sr1(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String a(int i10) {
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
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 != 166) {
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
        return "audio/eac3";
    }
}
