package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ih {

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    private static int f2506 = 0;

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    private static int[] f2507 = null;

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    private static int f2508 = 1;

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    private static char f2509;

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    private static char f2510;

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    private static char f2511;

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final List<String> f2512;

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    private static char f2513;

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static String f2514;

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static String f2515;

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static String f2516;

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static String f2517;

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static String f2518;

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static String f2519;

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static String f2520;

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static String f2521;

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static String f2522;

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static String f2523;

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static String f2524;

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static String f2525;

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static String f2526;

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static String f2527;

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static String f2528;

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static String f2529;

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static String f2530;

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static String f2531;

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static String f2532;

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static String f2533;

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static String f2534;

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static String f2535;

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static String f2536;

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static String f2537;

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static String f2538;

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static String f2539;

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static String f2540;

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static String f2541;

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static String f2542;

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static String f2543;

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static String f2544;

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static String f2545;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static String f2546;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static String f2547;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static String f2548;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static String f2549;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static String f2550;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static String f2551;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static String f2552;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static String f2553;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static String f2554;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static String f2555;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static String f2556;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static String f2557;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static String f2558;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String f2559;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String f2560;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String f2561;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String f2562;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String f2563;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String f2564;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String f2565;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String f2566;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String f2567;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String f2568;

    static {
        m6776();
        f2568 = m6774("ᰜ㨈Ꝓ䘯ㆨ胂쏍瓭\udba6벚㼶⑻", 11 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern();
        f2566 = m6775(new int[]{-498205326, -334482891}, 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
        f2567 = m6774("蕨籔貯辫", 4 - View.MeasureSpec.getSize(0)).intern();
        f2564 = m6775(new int[]{224868329, -1561737919, -244338116, -913064376}, 5 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();
        f2565 = m6774("䁦ꃚﮑ\ue623侃ຫ", 6 - KeyEvent.getDeadChar(0, 0)).intern();
        f2559 = m6774("ﾂ䓮", 2 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        f2563 = m6775(new int[]{1594732683, -1991234404, 1074882090, -2028464284}, 6 - View.MeasureSpec.getMode(0)).intern();
        f2560 = m6774("␋\udf69愑ᩃ␋\udf69\uee31ܡ", 7 - ExpandableListView.getPackedPositionChild(0L)).intern();
        f2562 = m6775(new int[]{1984114608, 506203705, 783172606, -961917670, 960307929, -1733154794}, 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
        f2561 = m6774("酐쨄H耓\uaa3d伭ꚬ電", 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        f2558 = m6775(new int[]{-69084525, -1641115252, -1963626466, 1251136782}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6).intern();
        f2555 = m6775(new int[]{419416770, -1265654623, 67948381, 689824142, 1715866967, 524557713}, ExpandableListView.getPackedPositionGroup(0L) + 10).intern();
        f2554 = m6775(new int[]{-1813297723, 397644442, -1447963127, -528469189}, Color.argb(0, 0, 0, 0) + 5).intern();
        f2556 = m6774("䁦ꃚ닳㺸ﳑ߭", (Process.myTid() >> 22) + 5).intern();
        f2557 = m6774("䁦ꃚ닳㺸콏㉲", 6 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        f2549 = m6775(new int[]{1464604843, -801341484, 1161421771, -51584362}, 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        f2553 = m6774("졥\ud8fb\ue6bc률摺᛬㐆猘", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9).intern();
        f2550 = m6774("桚瘐ᨨ뎹쟋\ue796㐆猘", TextUtils.indexOf("", "", 0) + 8).intern();
        f2551 = m6775(new int[]{783025666, 1104965642, -2073012042, -695371920}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6).intern();
        f2552 = m6775(new int[]{1671490142, -1031254408, 1455189805, -1331689408}, 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        f2546 = m6774("롥ꈷ\ue9f5봕ꌼ鷿", 6 - TextUtils.indexOf("", "", 0, 0)).intern();
        f2545 = m6775(new int[]{439352912, -1915811394, 1451006110, -15262611}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7).intern();
        f2544 = m6774("ᶜ\uf8a8\ue800\u0003㐆猘콏㉲", 6 - ExpandableListView.getPackedPositionChild(0L)).intern();
        f2548 = m6775(new int[]{1657498432, 2030989121, 1451006110, -15262611}, ImageFormat.getBitsPerPixel(0) + 8).intern();
        f2547 = m6775(new int[]{-1397889529, -448655219, 1451006110, -15262611}, 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        f2540 = m6775(new int[]{1588009154, -1269528718, 1451006110, -15262611}, 7 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern();
        f2539 = m6774("롥ꈷ책猳拁蝃", Gravity.getAbsoluteGravity(0, 0) + 6).intern();
        f2542 = m6775(new int[]{-1982986149, 1759003828, -2057226330, -368271239}, 5 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        f2543 = m6774("넓쀄\u19dd㹂㼶⑻", ExpandableListView.getPackedPositionChild(0L) + 6).intern();
        f2541 = m6775(new int[]{1059968356, 1694208728, -1731094834, -2093193337}, ((Process.getThreadPriority(0) + 20) >> 6) + 5).intern();
        f2536 = m6775(new int[]{1961379458, -1308959392, 592515058, -220013348}, 5 - View.MeasureSpec.getSize(0)).intern();
        f2538 = m6774("넓쀄䁦ꃚ", 4 - View.MeasureSpec.getSize(0)).intern();
        f2537 = m6774("넓쀄䁦ꃚ፨鸪", 4 - TextUtils.lastIndexOf("", '0', 0, 0)).intern();
        f2535 = m6774("넓쀄첽ᤫ", ExpandableListView.getPackedPositionType(0L) + 4).intern();
        f2534 = m6774("넓쀄\uee31ܡ䈕噽첽ᤫ", 7 - TextUtils.lastIndexOf("", '0')).intern();
        f2529 = m6774("넓쀄\u19dd㹂緣ꬹ첽ᤫ", 7 - TextUtils.indexOf((CharSequence) "", '0')).intern();
        f2530 = m6775(new int[]{-2000577504, 1217080452, -450808358, 936182669, 960307929, -1733154794}, 8 - TextUtils.indexOf((CharSequence) "", '0')).intern();
        f2531 = m6775(new int[]{524986905, -289089429, -1606983182, -2038823744, -1744619149, 823385755, -1447963127, -528469189}, Color.argb(0, 0, 0, 0) + 13).intern();
        f2532 = m6774("됪퀿\uee31ܡ䵏⫀拶䀧ᬙ퀟", TextUtils.indexOf((CharSequence) "", '0') + 11).intern();
        f2533 = m6774("됪퀿\uee31ܡꃞ㧻筹\ue1ac酐쨄졍묵", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11).intern();
        f2526 = m6775(new int[]{242131595, 1375407669, 1319185302, 1701518602, 1079827599, -88721146}, ExpandableListView.getPackedPositionChild(0L) + 12).intern();
        f2527 = m6775(new int[]{242131595, 1375407669, -510305518, -438916016, 1079827599, -88721146}, TextUtils.getOffsetAfter("", 0) + 11).intern();
        f2525 = m6774("됪퀿\uee31ܡ시絴ᨗஞꌼ鷿졍묵", View.resolveSizeAndState(0, 0, 0) + 11).intern();
        f2524 = m6775(new int[]{242131595, 1375407669, -779942554, 1525709271, -1082400517, 1239875977, -1447963127, -528469189}, 12 - MotionEvent.axisFromString("")).intern();
        f2528 = m6775(new int[]{242131595, 1375407669, 1596849087, 171364963, 1884378433, -1333825646, -1189832670, 935335679}, 14 - View.getDefaultSize(0, 0)).intern();
        f2519 = m6774("拶䀧⨆鞶\ue053磤劺⬟", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern();
        f2520 = m6774("ഀꮖ䋵⧛\uee31ܡ㩣ᑬ넓쀄", Gravity.getAbsoluteGravity(0, 0) + 10).intern();
        f2521 = m6775(new int[]{212981319, 1396441836}, ExpandableListView.getPackedPositionGroup(0L) + 2).intern();
        f2523 = m6775(new int[]{41426065, -999950591}, 3 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        f2522 = m6775(new int[]{1943103448, -486798861}, 2 - TextUtils.lastIndexOf("", '0')).intern();
        f2516 = m6775(new int[]{-583965139, -961419016, 1056357534, -572635185, 355224915, 168618276, 963747992, 835158991}, 14 - (KeyEvent.getMaxKeyCode() >> 16)).intern();
        f2517 = m6775(new int[]{-649118139, -68681440, 1943650294, -1469818053}, Color.blue(0) + 8).intern();
        f2515 = m6775(new int[]{1731748647, -893896553}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3).intern();
        f2518 = m6774("蕨籔췟霫", TextUtils.indexOf("", "", 0, 0) + 3).intern();
        f2514 = m6774("ᨨ뎹疺揃", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4).intern();
        f2512 = Arrays.asList(m6774("䁦ꃚ㳜栗ꨱ萕糌냇졍묵", 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        int i10 = f2508 + 59;
        f2506 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static void m6776() {
        f2513 = (char) 36322;
        f2511 = (char) 51218;
        f2510 = (char) 38943;
        f2509 = (char) 10160;
        f2507 = new int[]{-157458501, -385449010, 1346141580, -1135469075, -866682578, 190399484, -1860883870, 173452349, -1135439293, 58944956, 1826312839, 1689302286, 1355007758, -1096640772, -2034491490, 160606241, -271634586, 1262033320};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6774(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2513)) ^ ((c11 >>> 5) + f2510)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2511) ^ ((c12 + i12) ^ ((c12 << 4) + f2509))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6775(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2507.clone();
                e.f1937 = 0;
                while (true) {
                    int i11 = e.f1937;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1939 = (c10 << 16) + c11;
                        e.f1938 = (c12 << 16) + c13;
                        e.m6423(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1939 ^ iArr2[i13];
                            e.f1939 = i14;
                            e.f1938 = e.m6422(i14) ^ e.f1938;
                            int i15 = e.f1939;
                            e.f1939 = e.f1938;
                            e.f1938 = i15;
                        }
                        int i16 = e.f1939;
                        e.f1939 = e.f1938;
                        e.f1938 = i16;
                        e.f1938 = i16 ^ iArr2[16];
                        e.f1939 ^= iArr2[17];
                        int i17 = e.f1937;
                        int i18 = e.f1939;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1938;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m6423(iArr2);
                        int i20 = e.f1937;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1937 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
