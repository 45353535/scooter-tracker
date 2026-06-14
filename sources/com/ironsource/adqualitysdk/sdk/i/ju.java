package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hc;
import com.ironsource.adqualitysdk.sdk.i.hd;
import com.ironsource.adqualitysdk.sdk.i.he;
import com.ironsource.adqualitysdk.sdk.i.hf;
import com.ironsource.adqualitysdk.sdk.i.hh;
import com.ironsource.adqualitysdk.sdk.i.hj;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ju {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2920 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2922;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Field f2925;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Class f2926;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Field f2927;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field f2928;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field f2929;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object f2930;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2921 = {42624, 61335, 13493, 32219, 33518, 52208, 4117, 22887, 61015, 14160, 31860, 33438, 52207, 4238, 23000, 61159, 14085, 31766, 34086, 51812, 4960, 22647, 61072, 14254, 31940, 34251, 51928, 4868, 22577, 57653, 26048, 11479, 63477, 48795, 16814, 2224, 54101, 39463, 11543, 62480, 48948, 16862, 2223, 54222, 39576, 11687, 62533, 48982, 18022, 2340, 53280, 39735, 11728, 62702, 49028, 18059, 2454, 53317, 39790, 8827, 62736, 48165, 30179, 15564, 59364, 44673, 20916, 6398, 50001, 35435, 15634, 58378, 44863, 20928, 6369, 50110, 35489, 15783, 58440, 44890, 22137, 6425, 49163, 35647, 15832, 58607, 44929, 22171, 6564, 49166, 35696, 12919, 58643, 44089, 22229, 6532, 49334, 65232, 47082, 27875, 9633, 55986, 37808, 18510, 381, 46641, 28428, 9278, 56001, 37880, 18667, 392, 46759, 'm', 18773, 37461, 56108, 9225, 27929, 46784, 65476, 18593, 37281, 55957, 9338, 'm', 18775, 37470, 56088, 9234, 27933, 46816, 65481, 18610, 37309, 55956, 9284, 27977, 46667, 65316, 18445, 37358, 56061, 9154, 'e', 18794, 37442, 56103, 9234, 27992, 46841, 65478, 18656, 37290, 55957, 9336, 27980, 46681, 65331, 18445, 37327, 56054, 9187, 27821, 46469, 65171, 18515, 37191, 55853, 9000, 27676, 46573, 65236, 18397, 37020, 55681, 9075, 27756, 46421, 65062, 18181, 36874, 'm', 18772, 37465, 56123, 9236, 27933, 46846, 65485, 18610, 37265, 55966, 9326, 27983, 7600, 21695, 36759, 50930, 14791, 28813, 43820, 57875, 21813, 35946, 51008, 14761, 28849, 43912, 58086, 21969, 35892, 51007, 15872, 29049, 43123, 58180, 21920, 35985, 51185};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f2924 = -5729520482673932008L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2923 = {1693989859, -1419725378, 1431591262, -530433451, 1416486627, 809395253, -709092733, -1795350470, 1541501394, 1205832009, -445660515, 1390802248, -1844616202, -1506937805, 1381387, -1625508086, 1823734382, 2054553513};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<View> m7027() {
        int i10 = f2920 + 91;
        int i11 = i10 % 128;
        f2922 = i11;
        try {
            if (i10 % 2 != 0) {
                throw null;
            }
            if (f2926 != null) {
                int i12 = i11 + 81;
                f2920 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                if (f2930 == null) {
                    Class<?> cls = Class.forName(m7031(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                    f2926 = cls;
                    f2930 = cls.getMethod(m7037(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), null).invoke(null, null);
                    f2922 = (f2920 + 69) % 128;
                }
            } else {
                Class<?> cls2 = Class.forName(m7031(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                f2926 = cls2;
                f2930 = cls2.getMethod(m7037(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), null).invoke(null, null);
                f2922 = (f2920 + 69) % 128;
            }
            return m7038(f2926, f2930);
        } catch (Throwable th2) {
            String strIntern = m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, View.resolveSizeAndState(0, 0, 0) + 12).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7031(View.resolveSizeAndState(0, 0, 0) + 62, (char) (Gravity.getAbsoluteGravity(0, 0) + 30118), View.resolveSizeAndState(0, 0, 0) + 35).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7097(strIntern, sb2.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View.OnClickListener m7030(View view) {
        try {
            Object objM7034 = m7034(view);
            if (objM7034 == null) {
                return null;
            }
            Class<?> cls = objM7034.getClass();
            synchronized (jx.class) {
                try {
                    if (f2927 == null) {
                        f2927 = m7026(cls, m7037(new int[]{1647960652, 67504897, 741322149, -1831457172, 985675184, 2052053239, 1182144666, -1060623268}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnClickListener) f2927.get(objM7034);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7035(MediaPlayer mediaPlayer, hc.c cVar) {
        Field fieldM7026;
        MediaPlayer.OnInfoListener onInfoListener;
        int i10 = f2922 + 31;
        f2920 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM7026 = m7026(MediaPlayer.class, m7037(new int[]{-1895515866, 2007252617, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 35 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM7026.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            } else {
                fieldM7026 = m7026(MediaPlayer.class, m7037(new int[]{-1895515866, 2007252617, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14).intern());
                onInfoListener = (MediaPlayer.OnInfoListener) fieldM7026.get(mediaPlayer);
                if (onInfoListener instanceof hc) {
                    return;
                }
            }
            fieldM7026.set(mediaPlayer, new hc(onInfoListener, cVar));
            f2922 = (f2920 + 41) % 128;
        } catch (Exception e10) {
            kd.m7160(m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m7037(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1928011288, 901128282, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 34 - MotionEvent.axisFromString("")).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<View> m7038(Class cls, Object obj) throws Exception {
        if (f2929 == null) {
            f2920 = (f2922 + 77) % 128;
            Field declaredField = cls.getDeclaredField(m7037(new int[]{1263426752, 2116323096, 488600841, 147584518}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            f2929 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2929.get(obj);
        if (!(obj2 instanceof List)) {
            if (!(obj2 instanceof View[])) {
                return new ArrayList();
            }
            List<View> listAsList = Arrays.asList((View[]) f2929.get(obj));
            f2922 = (f2920 + 53) % 128;
            return listAsList;
        }
        int i10 = f2920 + 89;
        f2922 = i10 % 128;
        if (i10 % 2 == 0) {
            return (List) f2929.get(obj);
        }
        List<View> list = (List) f2929.get(obj);
        int i11 = 45 / 0;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7032(MediaPlayer mediaPlayer, hj.c cVar) {
        f2922 = (f2920 + 23) % 128;
        try {
            Field fieldM7026 = m7026(MediaPlayer.class, m7037(new int[]{311139306, -1643041027, 1131013996, 1064934420, -660697305, -992132226, -556094993, 686564194, -2032507226, -2124753146, -1700934117, -1787212973}, 23 - TextUtils.indexOf("", "", 0, 0)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM7026.get(mediaPlayer);
            if (onSeekCompleteListener instanceof hj) {
                return;
            }
            fieldM7026.set(mediaPlayer, new hj(onSeekCompleteListener, cVar));
            f2920 = (f2922 + 125) % 128;
        } catch (Exception e10) {
            kd.m7160(m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12).intern(), m7031((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 144, (char) (Process.getGidForName("") + 1), 38 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m7036(MediaPlayer mediaPlayer, he.a aVar) {
        Field fieldM7026;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i10 = f2922 + 11;
        f2920 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM7026 = m7026(MediaPlayer.class, m7031(107 % View.MeasureSpec.makeMeasureSpec(1, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 75), 36 - (ViewConfiguration.getJumpTapTimeout() >>> 97)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM7026.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM7026.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            } else {
                fieldM7026 = m7026(MediaPlayer.class, m7031(125 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM7026.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM7026.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            }
            int i11 = f2920 + 63;
            f2922 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m7160(m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, ExpandableListView.getPackedPositionGroup(0L) + 12).intern(), m7037(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, 1986917678, 1957659000, -1494872016, 1653228110, 177372123, -1175409444, -2032507226, -2124753146, -1700934117, -1787212973}, 39 - Gravity.getAbsoluteGravity(0, 0)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7029(View view, hd.d dVar) {
        int i10 = f2922 + 113;
        f2920 = i10 % 128;
        if (i10 % 2 != 0) {
            View.OnClickListener onClickListenerM7030 = m7030(view);
            if (onClickListenerM7030 instanceof hd) {
                return;
            }
            view.setOnClickListener(new hd(onClickListenerM7030, dVar));
            f2922 = (f2920 + 123) % 128;
            return;
        }
        boolean z10 = m7030(view) instanceof hd;
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m7037(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2923.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m7033(View view, hh.c cVar) {
        f2920 = (f2922 + 79) % 128;
        View.OnTouchListener onTouchListenerM7025 = m7025(view);
        if (!(onTouchListenerM7025 instanceof hh)) {
            view.setOnTouchListener(new hh(onTouchListenerM7025, cVar));
        }
        int i10 = f2920 + 73;
        f2922 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m7031(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2921[i10 + i12]) ^ (((long) i12) * f2924)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m7025(View view) {
        try {
            Object objM7034 = m7034(view);
            if (objM7034 == null) {
                return null;
            }
            Class<?> cls = objM7034.getClass();
            synchronized (jx.class) {
                try {
                    if (f2925 == null) {
                        f2925 = m7026(cls, m7031(97 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 65212), '@' - AndroidCharacter.getMirror('0')).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return (View.OnTouchListener) f2925.get(objM7034);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m7034(View view) {
        try {
            synchronized (jx.class) {
                try {
                    if (f2928 == null) {
                        f2928 = m7026(View.class, m7031(182 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), 13 - TextUtils.getOffsetAfter("", 0)).intern());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f2928.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.media.MediaPlayer m7024(android.widget.VideoView r7) {
        /*
            r0 = 12
            int r1 = com.ironsource.adqualitysdk.sdk.i.ju.f2922
            r2 = 107(0x6b, float:1.5E-43)
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ju.f2920 = r3
            int r1 = r1 % 2
            java.lang.Class<android.widget.VideoView> r3 = android.widget.VideoView.class
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L37
            r1 = 1
            int r2 = android.text.TextUtils.lastIndexOf(r4, r2, r5, r1)     // Catch: java.lang.Exception -> L35
            int r2 = 69 - r2
            int r1 = android.view.KeyEvent.normalizeMetaState(r1)     // Catch: java.lang.Exception -> L35
            char r1 = (char) r1     // Catch: java.lang.Exception -> L35
            int r6 = android.text.TextUtils.indexOf(r4, r4, r5, r5)     // Catch: java.lang.Exception -> L35
            int r6 = 66 - r6
            java.lang.String r1 = m7031(r2, r1, r6)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Field r1 = m7026(r3, r1)     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L5f
            goto L58
        L35:
            r7 = move-exception
            goto L68
        L37:
            r1 = 48
            int r1 = android.text.TextUtils.lastIndexOf(r4, r1, r5, r5)     // Catch: java.lang.Exception -> L35
            int r1 = 112 - r1
            int r2 = android.view.KeyEvent.normalizeMetaState(r5)     // Catch: java.lang.Exception -> L35
            char r2 = (char) r2     // Catch: java.lang.Exception -> L35
            int r6 = android.text.TextUtils.indexOf(r4, r4, r5, r5)     // Catch: java.lang.Exception -> L35
            int r6 = 12 - r6
            java.lang.String r1 = m7031(r1, r2, r6)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Field r1 = m7026(r3, r1)     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L5f
        L58:
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.Exception -> L35
            android.media.MediaPlayer r7 = (android.media.MediaPlayer) r7     // Catch: java.lang.Exception -> L35
            return r7
        L5f:
            int r7 = com.ironsource.adqualitysdk.sdk.i.ju.f2922
            int r7 = r7 + 71
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ju.f2920 = r7
            goto L95
        L68:
            r1 = 6
            int[] r1 = new int[r1]
            r1 = {x0098: FILL_ARRAY_DATA , data: [-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217} // fill-array
            int r2 = android.text.TextUtils.getOffsetAfter(r4, r5)
            int r2 = 12 - r2
            java.lang.String r1 = m7037(r1, r2)
            java.lang.String r1 = r1.intern()
            int[] r0 = new int[r0]
            r0 = {x00a8: FILL_ARRAY_DATA , data: [1202942275, 1897688176, -829805524, -1025134213, 116532778, 423569652, -1341074123, -559565256, -25114885, -724874080, -138387675, -1770855416} // fill-array
            float r2 = android.media.AudioTrack.getMinVolume()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = r2 + 23
            java.lang.String r0 = m7037(r0, r2)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.i.kd.m7160(r1, r0, r7, r5)
        L95:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ju.m7024(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m7028(MediaPlayer mediaPlayer, hf.b bVar) {
        Field fieldM7026;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i10 = f2922 + 35;
        f2920 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                fieldM7026 = m7026(MediaPlayer.class, m7037(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, (ViewConfiguration.getMaximumFlingVelocity() - 4) * 71).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM7026.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM7026.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            } else {
                fieldM7026 = m7026(MediaPlayer.class, m7037(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM7026.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM7026.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            }
            int i11 = f2920 + 79;
            f2922 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            kd.m7160(m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, 11 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m7037(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1524524405, 1676793468, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, TextUtils.indexOf("", "", 0, 0) + 41).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field m7026(Class cls, String str) {
        int i10 = f2920 + 59;
        f2922 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            f2922 = (f2920 + 97) % 128;
            return declaredField;
        } catch (Exception e10) {
            kd.m7160(m7037(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m7031(TextUtils.indexOf((CharSequence) "", '0') + 196, (char) (7638 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 25).intern(), e10, false);
            return null;
        }
    }
}
