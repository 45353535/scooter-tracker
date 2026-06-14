package androidx.media3.common.util;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.material.TextFieldImplKt;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.Player;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.ironsource.A1;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Util {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;

    @UnstableApi
    public static final String DEVICE;

    @UnstableApi
    public static final String DEVICE_DEBUG_INFO;

    @UnstableApi
    public static final byte[] EMPTY_BYTE_ARRAY;

    @UnstableApi
    public static final long[] EMPTY_LONG_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN;

    @UnstableApi
    public static final String MANUFACTURER;

    @UnstableApi
    public static final String MODEL;

    @UnstableApi
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;

    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    @RequiresApi(21)
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i10) {
            return resources.getDrawable(i10, context.getTheme());
        }
    }

    @RequiresApi(29)
    private static class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static void startForeground(Service service, int i10, Notification notification, int i11, String str) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (RuntimeException e10) {
                Log.e(Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e10;
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        SDK_INT = i10;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i10;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, TextFieldImplKt.AnimationDuration, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    private Util() {
    }

    public static /* synthetic */ void a(SettableFuture settableFuture, Runnable runnable, Object obj) {
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            runnable.run();
            settableFuture.set(obj);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }

    @UnstableApi
    public static long addWithOverflowDefault(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    @UnstableApi
    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static /* synthetic */ void b(SettableFuture settableFuture, ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    @UnstableApi
    public static int binarySearchCeil(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= iArr.length || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.min(iArr.length - 1, i12) : i12;
    }

    @UnstableApi
    public static int binarySearchFloor(int[] iArr, int i10, boolean z10, boolean z11) {
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

    public static /* synthetic */ void c(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(Futures.getDone(listenableFuture)));
            } catch (Throwable th2) {
                settableFuture.setException(th2);
            }
        } catch (Error e10) {
            e = e10;
            settableFuture.setException(e);
        } catch (CancellationException unused) {
            settableFuture.cancel(false);
        } catch (RuntimeException e11) {
            e = e11;
            settableFuture.setException(e);
        } catch (ExecutionException e12) {
            e = e12;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    @UnstableApi
    public static <T> T castNonNull(@Nullable T t10) {
        return t10;
    }

    @UnstableApi
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    @UnstableApi
    public static int ceilDivide(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i10 = 0; i10 < mediaItem.localConfiguration.subtitleConfigurations.size(); i10++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i10).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @UnstableApi
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @UnstableApi
    public static int compareLong(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    @UnstableApi
    public static int constrainValue(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    @UnstableApi
    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static <T> boolean contentEquals(@Nullable SparseArray<T> sparseArray, @Nullable SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    @UnstableApi
    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        if (SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
        }
        return iKeyAt;
    }

    @UnstableApi
    public static int crc16(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = UnsignedBytes.toInt(bArr[i10]);
            i12 = crc16UpdateFourBits(i13 & 15, crc16UpdateFourBits(i13 >> 4, i12));
            i10++;
        }
        return i12;
    }

    private static int crc16UpdateFourBits(int i10, int i11) {
        return (CRC16_BYTES_MSBF[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    @UnstableApi
    public static int crc32(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = CRC32_BYTES_MSBF[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    @UnstableApi
    public static int crc8(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = CRC8_BYTES_MSBF[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    @UnstableApi
    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i10 >= strArr.length) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    @UnstableApi
    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @UnstableApi
    public static File createTempDirectory(Context context, String str) throws IOException {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    @UnstableApi
    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    public static /* synthetic */ Thread d(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @UnstableApi
    public static long durationUsToSampleCount(long j10, int i10) {
        return scaleLargeValue(j10, i10, 1000000L, RoundingMode.CEILING);
    }

    public static /* synthetic */ Thread e(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @UnstableApi
    public static String escapeFileName(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (shouldEscapeCharacter(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (shouldEscapeCharacter(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i11--;
            } else {
                sb2.append(cCharAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        return sb2.toString();
    }

    @UnstableApi
    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    @UnstableApi
    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    @RequiresApi(21)
    @UnstableApi
    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int i10) {
        if (i10 == 0) {
            return "application/dash+xml";
        }
        if (i10 == 1) {
            return "application/vnd.ms-sstr+xml";
        }
        if (i10 != 2) {
            return null;
        }
        return "application/x-mpegURL";
    }

    @UnstableApi
    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @UnstableApi
    @Deprecated
    public static int getAudioContentTypeForStreamType(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) ? 4 : 2;
        }
        return 1;
    }

    @RequiresApi(21)
    @UnstableApi
    public static AudioFormat getAudioFormat(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    @android.annotation.SuppressLint({"InlinedApi"})
    @androidx.media3.common.util.UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getAudioTrackChannelConfig(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = androidx.media3.common.util.Util.SDK_INT
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.getAudioTrackChannelConfig(int):int");
    }

    @UnstableApi
    public static int getAudioUsageForStreamType(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                return i10 != 8 ? 1 : 3;
            }
        }
        return i11;
    }

    @UnstableApi
    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        boolean z10 = false;
        Player.Commands.Builder builderAddIf = new Player.Commands.Builder().addAll(commands).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z10 = true;
        }
        return builderAddIf.addIf(12, z10).build();
    }

    @UnstableApi
    public static int getBigEndianInt(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    @UnstableApi
    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    @UnstableApi
    public static int getCodecCountOfType(@Nullable String str, int i10) {
        int i11 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i10 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i11++;
            }
        }
        return i11;
    }

    @Nullable
    @UnstableApi
    public static String getCodecsOfType(@Nullable String str, int i10) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i10 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    @UnstableApi
    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    @UnstableApi
    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    @UnstableApi
    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @UnstableApi
    public static Locale getDefaultDisplayLocale() {
        return SDK_INT >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @UnstableApi
    public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i10) {
        return SDK_INT >= 21 ? Api21.getDrawable(context, resources, i10) : resources.getDrawable(i10);
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "playready":
                return C.PLAYREADY_UUID;
            case "widevine":
                return C.WIDEVINE_UUID;
            case "clearkey":
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeForMediaDrmErrorCode(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            i10 = Integer.parseInt((String) Assertions.checkNotNull(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    @UnstableApi
    public static String getFormatSupportString(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    @UnstableApi
    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        Assertions.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt << 8) | str.charAt(i10);
        }
        return iCharAt;
    }

    @UnstableApi
    public static String getLocaleLanguageTag(Locale locale) {
        return SDK_INT >= 21 ? getLocaleLanguageTagV21(locale) : locale.toString();
    }

    @RequiresApi(21)
    private static String getLocaleLanguageTagV21(Locale locale) {
        return locale.toLanguageTag();
    }

    @UnstableApi
    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
    }

    @UnstableApi
    public static long getMediaDurationForPlayoutDuration(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    @UnstableApi
    public static long getNowUnixTimeMs(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : android.os.SystemClock.elapsedRealtime() + j10;
    }

    @UnstableApi
    public static int getPcmEncoding(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    @UnstableApi
    public static Format getPcmFormat(int i10, int i11, int i12) {
        return new Format.Builder().setSampleMimeType("audio/raw").setChannelCount(i11).setSampleRate(i12).setPcmEncoding(i10).build();
    }

    @UnstableApi
    public static int getPcmFrameSize(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    @UnstableApi
    public static long getPlayoutDurationForMediaDuration(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    @UnstableApi
    public static List<String> getRoleFlagStrings(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add(C4240b4.i.Z);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    @UnstableApi
    public static List<String> getSelectionFlagStrings(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @UnstableApi
    public static int getStreamTypeForAudioUsage(int i10) {
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

    @UnstableApi
    public static String getStringForTime(StringBuilder sb2, Formatter formatter, long j10) {
        long j11 = j10 == -9223372036854775807L ? 0L : j10;
        String str = j11 < 0 ? TokenBuilder.TOKEN_DELIMITER : "";
        long jAbs = (Math.abs(j11) + 500) / 1000;
        long j12 = jAbs % 60;
        long j13 = (jAbs / 60) % 60;
        long j14 = jAbs / 3600;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    @UnstableApi
    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i10 = 0; i10 < systemLocales.length; i10++) {
            systemLocales[i10] = normalizeLanguageCode(systemLocales[i10]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), StringUtils.COMMA);
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            Log.e(TAG, "Failed to read system property " + str, e10);
            return null;
        }
    }

    @UnstableApi
    public static String getTrackTypeString(int i10) {
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

    @UnstableApi
    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + MediaLibraryInfo.VERSION_SLASHY;
    }

    @UnstableApi
    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    @UnstableApi
    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean handlePauseButtonAction(@Nullable Player player) {
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        player.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean handlePlayButtonAction(@androidx.annotation.Nullable androidx.media3.common.Player r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.isCommandAvailable(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.isCommandAvailable(r3)
            if (r1 == 0) goto L24
            r4.seekToDefaultPosition()
            goto L15
        L24:
            boolean r1 = r4.isCommandAvailable(r2)
            if (r1 == 0) goto L2e
            r4.play()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.handlePlayButtonAction(androidx.media3.common.Player):boolean");
    }

    public static boolean handlePlayPauseButtonAction(@Nullable Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(Uri uri, @Nullable String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String str) {
        if (str == null) {
            return inferContentType(uri);
        }
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

    @UnstableApi
    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(parsableByteArray2.getData(), iInflate, parsableByteArray2.capacity() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                } else {
                    parsableByteArray2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    @UnstableApi
    public static String intToStringMaxRadix(int i10) {
        return Integer.toString(i10, 36);
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String canonicalPath3 = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                canonicalPath3 = externalFilesDir.getCanonicalPath();
            }
            if (canonicalPath.startsWith(canonicalPath2)) {
                return true;
            }
            if (canonicalPath3 != null) {
                if (canonicalPath.startsWith(canonicalPath3)) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    @UnstableApi
    public static boolean isAutomotive(Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    @UnstableApi
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    @UnstableApi
    public static boolean isEncodingHighResolutionPcm(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    @UnstableApi
    public static boolean isEncodingLinearPcm(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    @UnstableApi
    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        int i10 = SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 != 30) {
            return false;
        }
        String str = MODEL;
        return Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231");
    }

    @UnstableApi
    public static boolean isLinebreak(int i10) {
        return i10 == 10 || i10 == 13;
    }

    @UnstableApi
    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || C4240b4.i.f42616b.equals(scheme);
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        return A1.f40170e.equals(str) || "external_primary".equals(str);
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        if (SDK_INT < 23) {
            return false;
        }
        return isLocalFileUri(uri) ? !isAppSpecificStorageFileUri(activity, uri) : isMediaStoreExternalContentUri(uri);
    }

    @UnstableApi
    public static boolean isRunningOnEmulator() {
        String lowerCase = Ascii.toLowerCase(DEVICE);
        return lowerCase.contains("emulator") || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()));
    }

    @UnstableApi
    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @UnstableApi
    public static boolean isWear(Context context) {
        return SDK_INT >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    @UnstableApi
    public static int linearSearch(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @UnstableApi
    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(ByteStreams.toByteArray(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
    }

    @UnstableApi
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMax = Math.max(jMax, sparseLongArray.valueAt(i10));
        }
        return jMax;
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i10 = 0; i10 < immutableList.size(); i10++) {
                    if (maybeRequestReadStoragePermission(activity, immutableList.get(i10).uri)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @UnstableApi
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i10));
        }
        return jMin;
    }

    @UnstableApi
    public static <T> void moveItems(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    @UnstableApi
    public static long msToUs(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    @UnstableApi
    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.w
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.e(str, runnable);
            }
        });
    }

    @UnstableApi
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.t
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.d(str, runnable);
            }
        });
    }

    @UnstableApi
    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, TokenBuilder.TOKEN_DELIMITER)[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return (SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) || CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t10) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t10;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i10) {
        Assertions.checkArgument(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i10, int i11) {
        Assertions.checkArgument(i10 >= 0);
        Assertions.checkArgument(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    @UnstableApi
    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        Assertions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    @UnstableApi
    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
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

    @UnstableApi
    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    @UnstableApi
    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    @UnstableApi
    public static <T> ListenableFuture<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t10) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        postOrRun(handler, new Runnable() { // from class: androidx.media3.common.util.s
            @Override // java.lang.Runnable
            public final void run() {
                Util.a(settableFutureCreate, runnable, t10);
            }
        });
        return settableFutureCreate;
    }

    @UnstableApi
    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @UnstableApi
    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    @Nullable
    @UnstableApi
    public static Intent registerReceiverNotExported(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return SDK_INT < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    @UnstableApi
    public static <T> void removeRange(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    @RequiresApi(api = 33)
    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @UnstableApi
    public static long sampleCountToDurationUs(long j10, int i10) {
        return scaleLargeValue(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long scaleLargeTimestamp(long j10, long j11, long j12) {
        return scaleLargeValue(j10, j11, j12, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long[] scaleLargeTimestamps(List<Long> list, long j10, long j11) {
        return scaleLargeValues(list, j10, j11, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static void scaleLargeTimestampsInPlace(long[] jArr, long j10, long j11) {
        scaleLargeValuesInPlace(jArr, j10, j11, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long scaleLargeValue(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? scaleLargeValueFallback(j10, j11, j12, roundingMode) : LongMath.saturatedMultiply(j11, LongMath.divide(j10, j12, RoundingMode.UNNECESSARY)) : LongMath.divide(j11, LongMath.divide(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : LongMath.saturatedMultiply(j10, LongMath.divide(j11, j12, RoundingMode.UNNECESSARY)) : LongMath.divide(j10, LongMath.divide(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    private static long scaleLargeValueFallback(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jSaturatedMultiply = LongMath.saturatedMultiply(j10, j11);
        if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
            return LongMath.divide(jSaturatedMultiply, j12, roundingMode);
        }
        long jGcd = LongMath.gcd(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jDivide = LongMath.divide(j11, jGcd, roundingMode2);
        long jDivide2 = LongMath.divide(j12, jGcd, roundingMode2);
        long jGcd2 = LongMath.gcd(Math.abs(j10), Math.abs(jDivide2));
        long jDivide3 = LongMath.divide(j10, jGcd2, roundingMode2);
        long jDivide4 = LongMath.divide(jDivide2, jGcd2, roundingMode2);
        long jSaturatedMultiply2 = LongMath.saturatedMultiply(jDivide3, jDivide);
        if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
            return LongMath.divide(jSaturatedMultiply2, jDivide4, roundingMode);
        }
        double d10 = jDivide3 * (jDivide / jDivide4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return DoubleMath.roundToLong(d10, roundingMode);
    }

    @UnstableApi
    public static long[] scaleLargeValues(List<Long> list, long j10, long j11, RoundingMode roundingMode) {
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j12 != 0) {
            int i10 = 0;
            if (j13 >= j12 && j13 % j12 == 0) {
                long jDivide = LongMath.divide(j13, j12, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = LongMath.divide(list.get(i10).longValue(), jDivide, roundingMode2);
                    i10++;
                }
            } else if (j13 >= j12 || j12 % j13 != 0) {
                int i11 = 0;
                while (i11 < size) {
                    long jLongValue = list.get(i11).longValue();
                    if (jLongValue != 0) {
                        if (j13 >= jLongValue && j13 % jLongValue == 0) {
                            jArr[i11] = LongMath.divide(j12, LongMath.divide(j13, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j13 >= jLongValue || jLongValue % j13 != 0) {
                            jArr[i11] = scaleLargeValueFallback(jLongValue, j12, j13, roundingMode2);
                        } else {
                            jArr[i11] = LongMath.saturatedMultiply(j12, LongMath.divide(jLongValue, j13, RoundingMode.UNNECESSARY));
                        }
                    }
                    i11++;
                    j12 = j10;
                    j13 = j11;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jDivide2 = LongMath.divide(j12, j13, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = LongMath.saturatedMultiply(list.get(i10).longValue(), jDivide2);
                    i10++;
                }
            }
        }
        return jArr;
    }

    @UnstableApi
    public static void scaleLargeValuesInPlace(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jDivide = LongMath.divide(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = LongMath.divide(jArr[i10], jDivide, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jDivide2 = LongMath.divide(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = LongMath.saturatedMultiply(jArr[i10], jDivide2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = LongMath.divide(j10, LongMath.divide(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = scaleLargeValueFallback(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = LongMath.saturatedMultiply(j10, LongMath.divide(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    @UnstableApi
    public static void setForegroundServiceNotification(Service service, int i10, Notification notification, int i11, String str) {
        if (SDK_INT >= 29) {
            Api29.startForeground(service, i10, notification, i11, str);
        } else {
            service.startForeground(i10, notification);
        }
    }

    private static boolean shouldEscapeCharacter(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static boolean shouldShowPlayButton(@Nullable Player player) {
        return shouldShowPlayButton(player, true);
    }

    @UnstableApi
    public static void sneakyThrow(Throwable th2) throws Throwable {
        sneakyThrowInternal(th2);
    }

    @UnstableApi
    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    @UnstableApi
    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    @UnstableApi
    public static String[] splitCodecs(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    @UnstableApi
    public static ComponentName startForegroundService(Context context, Intent intent) {
        return SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    @UnstableApi
    public static long subtractWithOverflowDefault(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    @UnstableApi
    public static long sum(long... jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @UnstableApi
    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    @UnstableApi
    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return ByteStreams.toByteArray(inputStream);
    }

    @UnstableApi
    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & Ascii.SI, 16));
        }
        return sb2.toString();
    }

    @UnstableApi
    public static long toLong(int i10, int i11) {
        return toUnsignedLong(i11) | (toUnsignedLong(i10) << 32);
    }

    @UnstableApi
    public static long toUnsignedLong(int i10) {
        return ((long) i10) & 4294967295L;
    }

    @UnstableApi
    public static <T, U> ListenableFuture<T> transformFutureAsync(final ListenableFuture<U> listenableFuture, final AsyncFunction<U, T> asyncFunction) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.media3.common.util.u
            @Override // java.lang.Runnable
            public final void run() {
                Util.b(settableFutureCreate, listenableFuture);
            }
        }, MoreExecutors.directExecutor());
        listenableFuture.addListener(new Runnable() { // from class: androidx.media3.common.util.v
            @Override // java.lang.Runnable
            public final void run() {
                Util.c(listenableFuture, settableFutureCreate, asyncFunction);
            }
        }, MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    @Nullable
    @UnstableApi
    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }

    @UnstableApi
    public static long usToMs(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    @UnstableApi
    public static void writeBoolean(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    @UnstableApi
    public static long ceilDivide(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    @UnstableApi
    public static long constrainValue(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, Charsets.UTF_8);
    }

    @UnstableApi
    public static boolean handlePlayPauseButtonAction(@Nullable Player player, boolean z10) {
        return shouldShowPlayButton(player, z10) ? handlePlayButtonAction(player) : handlePauseButtonAction(player);
    }

    @UnstableApi
    public static boolean shouldShowPlayButton(@Nullable Player player, boolean z10) {
        return player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4 || (z10 && player.getPlaybackSuppressionReason() != 0);
    }

    @UnstableApi
    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i10 = 0;
        for (int i11 : iArr) {
            bArr[i10] = (byte) (i11 >> 24);
            bArr[i10 + 1] = (byte) (i11 >> 16);
            int i12 = i10 + 3;
            bArr[i10 + 2] = (byte) (i11 >> 8);
            i10 += 4;
            bArr[i12] = (byte) i11;
        }
        return bArr;
    }

    @UnstableApi
    public static float constrainValue(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    @UnstableApi
    public static <T> boolean contains(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    @UnstableApi
    public static int linearSearch(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    @UnstableApi
    public static int binarySearchCeil(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    @UnstableApi
    public static int binarySearchFloor(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int inferContentType(Uri uri) {
        int iInferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher((CharSequence) Assertions.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
                return 0;
            }
            if (strGroup.contains(ISM_HLS_FORMAT_EXTENSION)) {
                return 2;
            }
        }
        return 1;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= size || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(list.size() - 1, i11) : i11;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    @UnstableApi
    public static Format getPcmFormat(AudioProcessor.AudioFormat audioFormat) {
        return getPcmFormat(audioFormat.encoding, audioFormat.channelCount, audioFormat.sampleRate);
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (SDK_INT >= 23) {
            getDisplaySizeV23(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (!isReadStoragePermissionRequestNeeded(activity, uri)) {
            return false;
        }
        if (SDK_INT < 33) {
            return requestExternalStoragePermission(activity);
        }
        return requestReadMediaPermissions(activity);
    }

    @UnstableApi
    public static byte[] toByteArray(float f10) {
        return Ints.toByteArray(Float.floatToIntBits(f10));
    }

    @UnstableApi
    public static int binarySearchFloor(LongArray longArray, long j10, boolean z10, boolean z11) {
        int i10;
        int size = longArray.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            if (longArray.get(i12) < j10) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        if (z10 && (i10 = size + 1) < longArray.size() && longArray.get(i10) == j10) {
            return i10;
        }
        if (z11 && size == -1) {
            return 0;
        }
        return size;
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th2) throws Throwable {
        throw th2;
    }
}
