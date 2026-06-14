package q9;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f98794a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f98795b = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f98796c = Pattern.compile("^\\D?(\\d+)$");

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int c(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List e(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String f(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(o0.G("hvc1.%s%d.%X.%c%d", f98795b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f98794a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static ImmutableList h(byte b10, byte b11, byte b12, byte b13) {
        return ImmutableList.of(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer i(String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b10 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b10 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b10 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b10 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b10 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b10 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b10 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b10 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b10 = 8;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b10 = 9;
                }
                break;
            case 1568:
                if (str.equals(Protocol.VAST_4_1)) {
                    b10 = 10;
                }
                break;
            case 1569:
                if (str.equals(Protocol.VAST_4_1_WRAPPER)) {
                    b10 = Ascii.VT;
                }
                break;
            case 1570:
                if (str.equals(Protocol.VAST_4_2)) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
        }
        return null;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair k(String str, String[] strArr) {
        int iT;
        if (strArr.length != 3) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(n9.w.h(Integer.parseInt(strArr[1], 16))) && (iT = t(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iT), 0);
            }
        } catch (NumberFormatException unused) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair l(String str, String[] strArr, n9.g gVar) {
        int i10;
        if (strArr.length < 4) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                u.h("CodecSpecificDataUtil", "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                u.h("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (gVar == null || !(gVar.f95310d != null || (i10 = gVar.f95309c) == 7 || i10 == 6)) ? 2 : 4096 : 1;
            int iA = a(i12);
            if (iA != -1) {
                return new Pair(Integer.valueOf(i14), Integer.valueOf(iA));
            }
            u.h("CodecSpecificDataUtil", "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair m(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iC = c(i11);
            if (iC == -1) {
                u.h("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iB = b(i10);
            if (iB != -1) {
                return new Pair(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            u.h("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    public static Pair n(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80557k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(aVar.f80561o)) {
            return o(aVar.f80557k, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2) {
            case "av01":
                return l(aVar.f80557k, strArrSplit, aVar.C);
            case "avc1":
            case "avc2":
                return m(aVar.f80557k, strArrSplit);
            case "hev1":
            case "hvc1":
                return q(aVar.f80557k, strArrSplit, aVar.C);
            case "mp4a":
                return k(aVar.f80557k, strArrSplit);
            case "s263":
                return p(aVar.f80557k, strArrSplit);
            case "vp09":
                return r(aVar.f80557k, strArrSplit);
            default:
                return null;
        }
    }

    private static Pair o(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f98796c.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numJ = j(strGroup);
        if (numJ == null) {
            u.h("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numI = i(str2);
        if (numI != null) {
            return new Pair(numJ, numI);
        }
        u.h("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair p(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair q(String str, String[] strArr, n9.g gVar) {
        if (strArr.length < 4) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f98796c.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (gVar == null || gVar.f95309c != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                u.h("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numS = s(str2);
        if (numS != null) {
            return new Pair(Integer.valueOf(i10), numS);
        }
        u.h("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair r(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iX = x(i10);
            if (iX == -1) {
                u.h("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iW = w(i11);
            if (iW != -1) {
                return new Pair(Integer.valueOf(iX), Integer.valueOf(iW));
            }
            u.h("CodecSpecificDataUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            u.h("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer s(String str) {
        if (str == null) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b10 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b10 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b10 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b10 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b10 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b10 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b10 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b10 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b10 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b10 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b10 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b10 = Ascii.VT;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b10 = Ascii.FF;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b10 = 13;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b10 = Ascii.SO;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b10 = Ascii.SI;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b10 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b10 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b10 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b10 = Ascii.SYN;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b10 = Ascii.ETB;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b10 = Ascii.EM;
                }
                break;
        }
        switch (b10) {
        }
        return null;
    }

    private static int t(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair u(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        d0Var.W(9);
        int iH = d0Var.H();
        d0Var.W(20);
        return Pair.create(Integer.valueOf(d0Var.L()), Integer.valueOf(iH));
    }

    public static boolean v(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    private static int w(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int x(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }
}
