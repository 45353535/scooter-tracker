package yads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.material.TextFieldImplKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.exoplayer2.C;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f117341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f117343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f117344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f117345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f117346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f117347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f117348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f117349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f117350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap f117351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f117352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f117353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f117354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f117355o;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f117341a = i10;
        String str = Build.DEVICE;
        f117342b = str;
        String str2 = Build.MANUFACTURER;
        f117343c = str2;
        String str3 = Build.MODEL;
        f117344d = str3;
        f117345e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f117346f = new byte[0];
        f117347g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f117348h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f117349i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f117350j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f117352l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f117353m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f117354n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f117355o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, TextFieldImplKt.AnimationDuration, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static long a(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static int b(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 == 24) {
            return 536870912;
        }
        if (i10 != 32) {
            return 0;
        }
        return C.ENCODING_PCM_32BIT;
    }

    public static int c(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String d(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static boolean e(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static long f(String str) throws ba2 {
        int i10;
        Matcher matcher = f117347g.matcher(str);
        if (!matcher.matches()) {
            throw new ba2("Invalid date/time format: " + str, null, true, 1);
        }
        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = 0;
        } else {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (TokenBuilder.TOKEN_DELIMITER.equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static Point c(Context context) {
        DisplayManager displayManager;
        int i10 = f117341a;
        Display display = (i10 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && d(context)) {
            String strB = i10 < 28 ? b("sys.display-size") : b("vendor.display-size");
            if (!TextUtils.isEmpty(strB)) {
                try {
                    String[] strArrSplit = strB.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                uf1.b("Util", "Invalid display size: " + strB);
            }
            if ("Sony".equals(f117343c) && f117344d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i13 = f117341a;
        if (i13 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        if (i13 >= 17) {
            display.getRealSize(point);
            return point;
        }
        display.getSize(point);
        return point;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strA = ci.a(str);
        int i10 = 0;
        String str2 = strA.split(TokenBuilder.TOKEN_DELIMITER, 2)[0];
        if (f117351k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap map = new HashMap(iSOLanguages.length + f117352l.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i11 = 0;
            while (true) {
                String[] strArr = f117352l;
                if (i11 >= strArr.length) {
                    break;
                }
                map.put(strArr[i11], strArr[i11 + 1]);
                i11 += 2;
            }
            f117351k = map;
        }
        String str4 = (String) f117351k.get(str2);
        if (str4 != null) {
            strA = str4 + strA.substring(str2.length());
            str2 = str4;
        }
        if (!SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) && !CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) && !"zh".equals(str2)) {
            return strA;
        }
        while (true) {
            String[] strArr2 = f117353m;
            if (i10 >= strArr2.length) {
                return strA;
            }
            if (strA.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + strA.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int a(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return z10 ? iBinarySearch : i10;
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static int a(List list, Long l10, boolean z10) {
        int i10;
        int iBinarySearch = Collections.binarySearch(list, l10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || ((Comparable) list.get(i11)).compareTo(l10) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return ci.b(networkCountryIso);
            }
        }
        return ci.b(Locale.getDefault().getCountry());
    }

    public static int a(wf1 wf1Var, long j10) {
        int i10 = wf1Var.f117442a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (wf1Var.a(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < wf1Var.f117442a && wf1Var.a(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static int b(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long b(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int a(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static Handler b(Handler.Callback callback) {
        return new Handler(c(), callback);
    }

    public static ExecutorService d(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: yads.ws0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return w83.a(str, runnable);
            }
        });
    }

    public static String[] d() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = f117341a >= 24 ? configuration.getLocales().toLanguageTags().split(StringUtils.COMMA, -1) : new String[]{a(configuration.locale)};
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = e(strArrSplit[i10]);
        }
        return strArrSplit;
    }

    public static String b(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            uf1.b("Util", uf1.a("Failed to read system property ".concat(str), e10));
            return null;
        }
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float a(float f10) {
        return Math.max(0.0f, Math.min(f10, 0.95f));
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int a(int i10) {
        if (i10 == 12) {
            return f117341a >= 32 ? 743676 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = f117341a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int a(String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static byte[] c(String str) {
        return str.getBytes(st.f115925c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(Uri uri, String str) {
        int i10;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && ci.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strA = ci.a(lastPathSegment.substring(iLastIndexOf + 1));
                strA.getClass();
                switch (strA.hashCode()) {
                    case 104579:
                        if (strA.equals("ism")) {
                        }
                        break;
                    case 108321:
                        if (strA.equals("mpd")) {
                        }
                        break;
                    case 3242057:
                        if (strA.equals("isml")) {
                        }
                        break;
                    case 3299913:
                        if (strA.equals("m3u8")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: yads.w83.a(android.net.Uri, java.lang.String):int");
            }

            public static Looper c() {
                Looper looperMyLooper = Looper.myLooper();
                return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
            }

            public static boolean a(w92 w92Var, w92 w92Var2, Inflater inflater) {
                int i10 = w92Var.f117358c - w92Var.f117357b;
                if (i10 <= 0) {
                    return false;
                }
                if (w92Var2.f117356a.length < i10) {
                    w92Var2.a(i10 * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                byte[] bArr = w92Var.f117356a;
                int i11 = w92Var.f117357b;
                inflater.setInput(bArr, i11, w92Var.f117358c - i11);
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr2 = w92Var2.f117356a;
                        iInflate += inflater.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (inflater.finished()) {
                            w92Var2.d(iInflate);
                            inflater.reset();
                            return true;
                        }
                        if (inflater.needsDictionary() || inflater.needsInput()) {
                            break;
                        }
                        byte[] bArr3 = w92Var2.f117356a;
                        if (iInflate == bArr3.length) {
                            w92Var2.a(bArr3.length * 2);
                        }
                    } catch (DataFormatException unused) {
                        return false;
                    } finally {
                        inflater.reset();
                    }
                }
                return false;
            }

            public static Object[] a(Object[] objArr, Object[] objArr2) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
                System.arraycopy(objArr2, 0, objArrCopyOf, objArr.length, objArr2.length);
                return objArrCopyOf;
            }

            public static Object[] a(int i10, Object[] objArr) {
                if (i10 <= objArr.length) {
                    return Arrays.copyOf(objArr, i10);
                }
                throw new IllegalArgumentException();
            }

            public static Object[] a(Object[] objArr, int i10) {
                if (i10 <= objArr.length) {
                    return Arrays.copyOfRange(objArr, 1, i10);
                }
                throw new IllegalArgumentException();
            }

            public static void a(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            public static boolean a(Parcel parcel) {
                return parcel.readInt() != 0;
            }

            public static long a(long j10, long j11, long j12) {
                if (j12 >= j11 && j12 % j11 == 0) {
                    return j10 / (j12 / j11);
                }
                if (j12 < j11 && j11 % j12 == 0) {
                    return (j11 / j12) * j10;
                }
                return (long) (j10 * (j11 / j12));
            }

            public static void a(long[] jArr, long j10) {
                int i10 = 0;
                if (j10 >= 1000000 && j10 % 1000000 == 0) {
                    long j11 = j10 / 1000000;
                    while (i10 < jArr.length) {
                        jArr[i10] = jArr[i10] / j11;
                        i10++;
                    }
                    return;
                }
                if (j10 < 1000000 && 1000000 % j10 == 0) {
                    long j12 = 1000000 / j10;
                    while (i10 < jArr.length) {
                        jArr[i10] = jArr[i10] * j12;
                        i10++;
                    }
                    return;
                }
                double d10 = 1000000 / j10;
                while (i10 < jArr.length) {
                    jArr[i10] = (long) (jArr[i10] * d10);
                    i10++;
                }
            }

            public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
                return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
            }

            public static Handler a(Handler.Callback callback) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    return new Handler(looperMyLooper, callback);
                }
                throw new IllegalStateException();
            }

            public static Handler a(Looper looper, Handler.Callback callback) {
                return new Handler(looper, callback);
            }

            public static /* synthetic */ Thread a(String str, Runnable runnable) {
                return new Thread(runnable, str);
            }

            public static String a(Locale locale) {
                if (f117341a >= 21) {
                    return locale.toLanguageTag();
                }
                return locale.toString();
            }

            public static String a(byte[] bArr) {
                return new String(bArr, st.f115925c);
            }

            public static String a(byte[] bArr, int i10, int i11) {
                return new String(bArr, i10, i11, st.f115925c);
            }
        }
