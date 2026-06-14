package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class ba {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f732 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f733 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f734 = {-1651954596, -790938195, 992154125, 913496587, -1926373809, 669856641, -301240990, 786897866, -773343164, 1760198774, -235625106, -467461580, 1141034504, 1909661372, -2102263130, -431286527, 318154931, 71342177};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f735 = 112;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private b f736 = b.f751;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private c f737 = c.f768;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f738;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f739;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f740;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f741;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f742;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f743;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ba$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        static final /* synthetic */ int[] f744;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f745;

        static {
            int[] iArr = new int[c.valuesCustom().length];
            f744 = iArr;
            try {
                iArr[c.f761.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f744[c.f764.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f744[c.f766.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f744[c.f765.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f744[c.f767.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.valuesCustom().length];
            f745 = iArr2;
            try {
                iArr2[b.f754.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f745[b.f753.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f745[b.f752.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f745[b.f747.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f745[b.f755.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        f751,
        f754,
        f753,
        f752,
        f755,
        f747;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f746 = 0;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f748 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f749;

        static {
            m5072();
            f748 = (f746 + 35) % 128;
        }

        public static b valueOf(String str) {
            f746 = (f748 + 29) % 128;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i10 = f748 + 55;
            f746 = i10 % 128;
            if (i10 % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            f746 = (f748 + 105) % 128;
            b[] bVarArr = (b[]) values().clone();
            f748 = (f746 + 27) % 128;
            return bVarArr;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m5071(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                    System.arraycopy(f749, i10, cArr, 0, i11);
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static void m5072() {
            f749 = new char[]{'\'', 'I', 'N', '_', 190, 197, 196, 190, 193, 196, 195, '#', 'H', 'K', 'K', 'N', 'N', 'E', 'F', 'J', 'Q', 'Q', 'K', '\'', 'M', 257, 257, 258, 265, 255, 254, 272, 262, 133, 264, 264, 266, 259};
        }
    }

    public enum c {
        f768,
        f764,
        f766,
        f765,
        f767,
        f761;


        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static boolean f756 = false;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f757 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f758 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f759;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f760;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static boolean f763;

        static {
            m5073();
            int i10 = f758 + 95;
            f757 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 57 / 0;
            }
        }

        public static c valueOf(String str) {
            f758 = (f757 + 41) % 128;
            c cVar = (c) Enum.valueOf(c.class, str);
            f757 = (f758 + 5) % 128;
            return cVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            f757 = (f758 + 61) % 128;
            c[] cVarArr = (c[]) values().clone();
            f757 = (f758 + 75) % 128;
            return cVarArr;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        static void m5073() {
            f763 = true;
            f756 = true;
            f759 = 196;
            f760 = new char[]{274, 275, 265, 283, 278, 291, 261, 267, 280, 277, 281, 269, 264, 279, 276, 271, 282, 272, 286, 266, 263};
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m5074(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f3012) {
                try {
                    char[] cArr2 = f760;
                    int i11 = f759;
                    if (f756) {
                        int length = bArr.length;
                        m.f3014 = length;
                        char[] cArr3 = new char[length];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i12 = m.f3013;
                            int i13 = m.f3014 - 1;
                            int i14 = m.f3013;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            m.f3013 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f763) {
                        int length2 = cArr.length;
                        m.f3014 = length2;
                        char[] cArr4 = new char[length2];
                        m.f3013 = 0;
                        while (m.f3013 < m.f3014) {
                            int i15 = m.f3013;
                            int i16 = m.f3014 - 1;
                            int i17 = m.f3013;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            m.f3013 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f3014 = length3;
                    char[] cArr5 = new char[length3];
                    m.f3013 = 0;
                    while (m.f3013 < m.f3014) {
                        int i18 = m.f3013;
                        int i19 = m.f3014 - 1;
                        int i20 = m.f3013;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        m.f3013 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    ba(String str) {
        this.f742 = str;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m5058() {
        f732 = (f733 + 89) % 128;
        String strName = this.f736.name();
        f732 = (f733 + 125) % 128;
        return strName;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m5059() {
        int i10 = f732;
        f733 = (i10 + 29) % 128;
        if (this.f739 != null) {
            f733 = (i10 + 77) % 128;
            if (this.f741 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5063("ￃ\ufff6\uffe7￮ￃ\ufff9\b\u0015\u0016\f\u0012\u0011\u0016ￃ\u0016\u0018\u0013\u0013\u0012\u0015\u0017\b\u0007\uffdd", 24 - Color.red(0), false, -TextUtils.lastIndexOf("", '0', 0), 206 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(this.f739);
                sb2.append(m5065(new int[]{-1791069471, -903715253}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3).intern());
                sb2.append(this.f741);
                return sb2.toString();
            }
        }
        int i11 = f733 + 53;
        f732 = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5060() {
        if (this.f742.equals(m5063("\u0006\ufff3\uffff\u0002\ufff4\u0014\u0002", ((byte) KeyEvent.getModifierMetaStateMask()) + 8, true, 4 - TextUtils.lastIndexOf("", '0'), 211 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m5062());
        sb3.append(m5065(new int[]{73906157, -1654754441}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern());
        sb2.append(sb3.toString());
        String strM5064 = m5064();
        if (strM5064 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strM5064);
            sb4.append(m5065(new int[]{73906157, -1654754441}, 1 - ExpandableListView.getPackedPositionType(0L)).intern());
            sb2.append(sb4.toString());
        }
        String strM5059 = m5059();
        if (strM5059 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strM5059);
            sb5.append(m5065(new int[]{73906157, -1654754441}, Color.argb(0, 0, 0, 0) + 1).intern());
            sb2.append(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(m5063("\u0019\u0006\u0019\ufff8ￅ\uffdf\u0018\u001a", KeyEvent.getDeadChar(0, 0) + 8, true, TextUtils.lastIndexOf("", '0', 0, 0) + 5, 203 - Color.red(0)).intern());
        sb6.append(m5058());
        sb6.append(m5065(new int[]{73906157, -1654754441}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        sb2.append(sb6.toString());
        b bVar = this.f736;
        if (bVar != b.f752) {
            int i10 = f732 + 107;
            f733 = i10 % 128;
            if (i10 % 2 != 0) {
                b bVar2 = b.f751;
                throw null;
            }
            if (bVar != b.f755) {
                String strM5061 = m5061(this.f737);
                if (strM5061 != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(m5063("\u001b\u001b\r\ufff5\uffc8￢\r\u000f\t", View.MeasureSpec.makeMeasureSpec(0, 0) + 9, true, ExpandableListView.getPackedPositionType(0L) + 4, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 200).intern());
                    sb7.append(strM5061);
                    sb2.append(sb7.toString());
                }
                k.m7102(m5063("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", 12 - View.resolveSizeAndState(0, 0, 0), true, TextUtils.indexOf((CharSequence) "", '0', 0) + 3, 206 - TextUtils.getTrimmedLength("")).intern(), sb2.toString());
                f732 = (f733 + 53) % 128;
                return;
            }
        }
        k.m7109(m5063("\u0006￣￭￦\ufff5\u001b\u0016\u000b\u000e\u0003\u0017\ufff3", Color.argb(0, 0, 0, 0) + 12, true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, 206 - Color.alpha(0)).intern(), sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m5061(c cVar) {
        int i10 = f732 + 89;
        f733 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (cVar != null) {
            int i11 = AnonymousClass2.f744[cVar.ordinal()];
            if (i11 == 1) {
                return m5065(new int[]{137488030, -359922737, -2017774956, 1751944291, -1219746495, 1032070237, 1584024098, -1787785060, 926411803, 1010934812, -2074228985, -1614840226}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22).intern();
            }
            if (i11 == 2) {
                String str = String.format(m5065(new int[]{451501713, 1405190935, -171910612, 1274250387, 1195938589, 1238607191, 1132235826, 310786192, -1518597579, 636733615, -907901415, -563455962, -90577279, 1750423757, 571822032, 586410798, 1220481365, -1395748232, -2001810257, 626156600, 1375904924, -1657499583, 1195938589, 1238607191, 1132235826, 310786192, 323998113, -234917244, -2054184062, 2137770738, 1566473387, -1273628156}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62).intern(), this.f742, this.f740, this.f738);
                f732 = (f733 + 3) % 128;
                return str;
            }
            if (i11 == 3) {
                return String.format(m5063("ￅ\u0019\u0014\u0013ￅ\u0018\u000eￅ\u0018ￊￅ\u0013\u0014\u000e\u0018\u0017\n\u001bￅ\ufff0￩\ufff8ￅ\u0018ￊ\u0017\u0014\u0019\b\n\u0013\u0013\u0014\bￅ\n\r\u0019ￅ\u001e\u0007ￅ\t\n\u0019\u0017\u0014\u0015\u0015\u001a\u0018ￅ\u0019\n\u001e", ExpandableListView.getPackedPositionChild(0L) + 56, true, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, Color.green(0) + 203).intern(), this.f742, this.f740);
            }
            if (i11 == 4) {
                return m5063("\u0001ﾾ\u0003\u0018\u0007\n\uffff\u0007\u0012\u0007\f\u0007ﾾ\r\u0012ﾾ\u0002\u0003\n\u0007\uffff￤\u0010\r\u0012\u0001\u0003\f\f\r", 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 22 - TextUtils.getTrimmedLength(""), 210 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
            }
            if (i11 == 5) {
                return m5063("\u0014\u000f\u0012￦\u0001\t\f\u0005\u0004\uffc0\u0014\u000f\uffc0\u0003\u0012\u0005\u0001\u0014\u0005\uffc0\u0003\u000f\u000e\u000e\u0005\u0003", 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, Color.argb(0, 0, 0, 0) + 3, 208 - View.MeasureSpec.getSize(0)).intern();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m5062() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5065(new int[]{-1305707743, 2105371948, -1305707743, 2105371948, -1305707743, 2105371948, -1885524501, 766283140}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern());
        sb2.append(this.f742);
        sb2.append(m5063("ￂ\u0005\u0011\u0010\u0010\u0007\u0005\u0016\u0011\u0014ￂ", 11 - View.combineMeasuredStates(0, 0), false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 206 - (Process.myPid() >> 22)).intern());
        String string = sb2.toString();
        if (this.f743 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(this.f743);
            sb3.append(m5065(new int[]{506916697, 2073069639}, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            string = sb3.toString();
            f732 = (f733 + 1) % 128;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(m5063("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, true, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 157 - TextUtils.indexOf("", "", 0)).intern());
        String string2 = sb4.toString();
        int i10 = f733 + 73;
        f732 = i10 % 128;
        if (i10 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m5064() {
        if (this.f742 != null) {
            int i10 = f732 + 83;
            f733 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            String strIntern = this.f740;
            if (strIntern != null) {
                if (strIntern.equals(m5063("\ufff0\u0002\u000f", 3 - ExpandableListView.getPackedPositionGroup(0L), false, 2 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getTrimmedLength("") + 175).intern())) {
                    f733 = (f732 + 31) % 128;
                    if (this.f736 != b.f755) {
                        int i11 = f732 + 95;
                        f733 = i11 % 128;
                        strIntern = (i11 % 2 != 0 ? m5065(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 37 >> View.MeasureSpec.getMode(0)) : m5065(new int[]{1998754247, -1627987434, 933966035, -919751033, -1173963287, -365185903}, 11 - View.MeasureSpec.getMode(0))).intern();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f742);
                sb2.append(m5065(new int[]{401584120, 1315452641, 1370400122, -1742726920, 126769399, -1909906021, -126146041, 1467086522}, Color.alpha(0) + 14).intern());
                sb2.append(strIntern);
                String string = sb2.toString();
                int i12 = f733 + 51;
                f732 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 83 / 0;
                }
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x007b  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m5070(com.ironsource.adqualitysdk.sdk.i.cm r9) {
        /*
            r8 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ba.f732
            int r0 = r0 + 57
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ba.f733 = r0
            r9.m5900()
            java.lang.String r0 = r9.m5896()
            r8.f742 = r0
            java.lang.String r0 = r9.m5899()
            r8.f743 = r0
            java.lang.String r0 = r9.m5891()
            r8.f740 = r0
            java.lang.String r0 = ""
            r1 = 0
            int r2 = android.text.TextUtils.indexOf(r0, r0, r1)
            int r2 = r2 + 7
            int r3 = android.graphics.ImageFormat.getBitsPerPixel(r1)
            int r3 = 5 - r3
            float r4 = android.view.ViewConfiguration.getScrollFriction()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = 183 - r4
            java.lang.String r6 = "\uffff\u0006￼\ufffb\b\uffff\ufffe"
            r7 = 1
            java.lang.String r2 = m5063(r6, r2, r7, r3, r4)
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = r8.f740
            boolean r2 = r2.equals(r3)
            if (r2 == r7) goto L7b
            int r2 = com.ironsource.adqualitysdk.sdk.i.ba.f732
            int r2 = r2 + 17
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.ba.f733 = r2
            r2 = 0
            int r2 = android.widget.ExpandableListView.getPackedPositionType(r2)
            int r2 = 8 - r2
            float r3 = android.media.AudioTrack.getMinVolume()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = r3 + 8
            int r4 = android.view.ViewConfiguration.getScrollBarSize()
            int r4 = r4 >> 8
            int r4 = r4 + 183
            java.lang.String r5 = "�\u0002\f\ufffa\ufffb\u0005\ufffe�"
            java.lang.String r2 = m5063(r5, r2, r1, r3, r4)
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = r8.f740
            boolean r2 = r2.equals(r3)
            r2 = r2 ^ r7
            if (r2 == r7) goto L9d
        L7b:
            r2 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r0, r2)
            int r2 = 2 - r2
            int r3 = android.os.Process.myPid()
            int r3 = r3 >> 22
            int r3 = 2 - r3
            int r0 = android.text.TextUtils.getOffsetAfter(r0, r1)
            int r0 = r0 + 175
            java.lang.String r4 = "\ufff0\u0002\u000f"
            java.lang.String r0 = m5063(r4, r2, r1, r3, r0)
            java.lang.String r0 = r0.intern()
            r8.f740 = r0
        L9d:
            java.lang.String r0 = r9.m5892()
            r8.f739 = r0
            java.lang.String r0 = r9.m5893()
            r8.f741 = r0
            java.lang.String r9 = r9.m5894()
            r8.f738 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ba.m5070(com.ironsource.adqualitysdk.sdk.i.cm):void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5063(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.b.f730) {
            try {
                char[] cArr2 = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.b.f728 = 0;
                while (true) {
                    int i13 = com.ironsource.adqualitysdk.sdk.i.b.f728;
                    if (i13 >= i10) {
                        break;
                    }
                    com.ironsource.adqualitysdk.sdk.i.b.f729 = cArr[i13];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.b.f728] = (char) (com.ironsource.adqualitysdk.sdk.i.b.f729 + i12);
                    int i14 = com.ironsource.adqualitysdk.sdk.i.b.f728;
                    cArr2[i14] = (char) (cArr2[i14] - f735);
                    com.ironsource.adqualitysdk.sdk.i.b.f728 = i14 + 1;
                }
                if (i11 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.b.f731 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = com.ironsource.adqualitysdk.sdk.i.b.f731;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = com.ironsource.adqualitysdk.sdk.i.b.f731;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    com.ironsource.adqualitysdk.sdk.i.b.f728 = 0;
                    while (true) {
                        int i17 = com.ironsource.adqualitysdk.sdk.i.b.f728;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        com.ironsource.adqualitysdk.sdk.i.b.f728 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final boolean m5066() {
        f733 = (f732 + 17) % 128;
        b bVar = this.f736;
        if (bVar != b.f754 && bVar != b.f753) {
            f732 = (f733 + 29) % 128;
            if (bVar != b.f751) {
                return false;
            }
        }
        int i10 = f733 + 37;
        f732 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 67 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m5068(b bVar) {
        f733 = (f732 + 51) % 128;
        this.f736 = bVar;
        if (bVar != b.f747) {
            int i10 = f733 + 5;
            f732 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f737 = c.f768;
                throw null;
            }
            this.f737 = c.f768;
        }
        int i11 = AnonymousClass2.f745[bVar.ordinal()];
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            m5060();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final void m5069(c cVar) {
        f732 = (f733 + 11) % 128;
        this.f737 = cVar;
        m5068(b.f747);
        int i10 = f732 + 125;
        f733 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    final String m5067() {
        f732 = (f733 + 53) % 128;
        String strM5061 = m5061(this.f737);
        int i10 = f733 + 89;
        f732 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM5061;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5065(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f734.clone();
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
