package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class dt {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1877 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1878;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1879;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1880;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1881;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1882;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1883;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1884;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final List<String> f1885;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1886;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1887;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1888;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1889;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1890;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1891;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1892;

    static {
        m6391();
        f1891 = Pattern.compile(m6392("薶콞蟓꺕\u0ee0쥗䶴ɤ৯䦲誥栯蟓꺕\u0ee0쥗䶴ɤ믓霌併鯚驳\ud9e1Ꮧগ", 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f1892 = Pattern.compile(m6392("쑸⇕ᕺ몚鵫ꇯ\ue30c夃쌢겛쑸⇕\ue2e9\ue9e1\uf47d煆", 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        f1889 = Pattern.compile(m6392("ᔄѪᕺ몚鵫ꇯ㌇ؚ쌢겛ᔄѪ\ue2e9\ue9e1儁鶼", 15 - ImageFormat.getBitsPerPixel(0)).intern());
        f1888 = Pattern.compile(m6392("薶콞믓霌뤑韼煊ৌ\u1ae5턎믓霌뤑韼햍ే", 15 - View.resolveSize(0, 0)).intern());
        f1890 = Pattern.compile(m6392("薶콞믓霌뤑韼햍ే", 7 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        f1884 = Pattern.compile(m6390(new int[]{63, 33, 0, 3}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern());
        f1887 = Pattern.compile(m6392("帡娘軧ྟ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
        f1886 = Pattern.compile(m6390(new int[]{96, 5, 0, 0}, "\u0000\u0000\u0000\u0000\u0000", false).intern());
        f1885 = Arrays.asList(m6392("ᛟ⌅", KeyEvent.normalizeMetaState(0) + 2).intern(), m6392("ꦮ⒒ᩘ쐎", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m6392("砲㾹졊㍵", 4 - View.resolveSize(0, 0)).intern(), m6392("鐐\u0ee8⠧픋ུ갪", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern(), m6392("∐ᄎ㤉қＫ䔧", 5 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m6392("寬롦ێ⇓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2).intern(), m6392("\uebe8凌䖫敤瀦ꚺ", 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        f1879 = (f1877 + 85) % 128;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109 A[PHI: r8 r10
  0x0109: PHI (r8v24 com.ironsource.adqualitysdk.sdk.i.dy$d) = (r8v23 com.ironsource.adqualitysdk.sdk.i.dy$d), (r8v38 com.ironsource.adqualitysdk.sdk.i.dy$d) binds: [B:35:0x0081, B:37:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v35 java.lang.String) binds: [B:35:0x0081, B:37:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> m6387(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dt.m6387(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m6391() {
        f1880 = (char) 58808;
        f1881 = (char) 17955;
        f1878 = (char) 21237;
        f1883 = (char) 483;
        f1882 = new char[]{22, '-', '.', 'i', Ascii.MAX, Ascii.MAX, '|', 'a', 16, 'C', 'j', 'k', 'm', 's', 's', 'I', 'C', 'j', 'k', 'n', 'r', 'i', 'h', 'H', 'I', 'p', 'p', 'r', '[', '2', 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', 'O', 194, 233, 197, '3', 'c', 'f', 'o', 'l', 16, 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', '@', '0', 'j', 's', 'h', IOUtils.DIR_SEPARATOR_WINDOWS, '^', 'G', 'S', ']', '7', 'C', '?', 'A', '^', IOUtils.DIR_SEPARATOR_WINDOWS, '^', 'G', 'S', ']', '7', 'C', 'E', '.', '3', '.', 'A', 'F', 'E', 'C', 'C', 'E', 'H', 'g', IOUtils.DIR_SEPARATOR_UNIX, ']', 'l', 'l', 'l'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6392(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3016) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f3015 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f3015;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1880)) ^ ((c11 >>> 5) + f1878)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1881) ^ ((c12 + i12) ^ ((c12 << 4) + f1883))));
                            i12 -= 40503;
                        }
                        int i14 = n.f3015;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f3015 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6388(String str) {
        f1879 = (f1877 + 9) % 128;
        String strSubstring = str.substring(1, str.length() - 1);
        f1879 = (f1877 + 115) % 128;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6389(Pattern pattern, String str) {
        f1877 = (f1879 + 101) % 128;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i10 = f1877 + 47;
        f1879 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 33 / 0;
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6390(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2472) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1882, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2471 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2471;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2471 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2471 = 0;
                    while (true) {
                        int i16 = i.f2471;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2471 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2471 = 0;
                    while (true) {
                        int i17 = i.f2471;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2471 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
