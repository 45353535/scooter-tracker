package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.gf;
import com.ironsource.adqualitysdk.sdk.i.gq;
import com.ironsource.adqualitysdk.sdk.i.gs;
import com.ironsource.adqualitysdk.sdk.i.gy;
import com.ironsource.adqualitysdk.sdk.i.gz;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bc {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f781 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f782 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f783 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f784;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f785;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f786;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, List<? extends gl>> f787;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f788;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f789;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<String> f790;

    static {
        m5081();
        f790 = Arrays.asList(m5082("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0007\n\u000b\u0006\u0011", 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 60)).intern(), m5084(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u008a\u008e\u0082\u008d\u008c\u0085\u008b\u008a\u0083\u0082\u0081").intern(), m5084(null, View.getDefaultSize(0, 0) + 127, null, "\u008f\u0088\u0090\u008f\u0082\u0081\u0082\u008d\u008c\u0085\u008b\u008a\u0083\u0082\u0081").intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m5082("\f\u0007\u000f\u0010\u0002\u000f\f\n\r\u000b", 10 - (Process.myPid() >> 22), (byte) (Color.rgb(0, 0, 0) + 16777219)).intern(), m5086(new gr()));
        linkedHashMap.put(m5084(null, TextUtils.lastIndexOf("", '0') + 128, null, "\u0093\u0082\u0081\u0089\u0088\u0087\u0092\u0091").intern(), m5086(new gz(), new gz.d()));
        linkedHashMap.put(m5084(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0096\u0095\u0094\u0082\u0081").intern(), m5086(new fx()));
        linkedHashMap.put(m5084(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0092\u0087\u008f\u0095\u0098\u0097\u0097\u0081").intern(), m5086(new gb()));
        linkedHashMap.put(m5082("\u0017\u0000\r\u000b\u0014\r\u0014\u001a", 8 - KeyEvent.keyCodeFromString(""), (byte) (62 - Color.green(0))).intern(), m5086(new gd()));
        linkedHashMap.put(m5084(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0086\u0085\u008c\u0099\u008d\u0088\u0092\u0087\u0094").intern(), m5086(new gq.c(), new gq.d()));
        linkedHashMap.put(m5082("\u0017\u0000\u000b\u0007\u0016\t¢", Process.getGidForName("") + 8, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62)).intern(), m5086(new gg()));
        linkedHashMap.put(m5084(null, Color.argb(0, 0, 0, 0) + 127, null, "\u008d\u008f\u0087\u0088\u009b\u0085\u008c\u008d\u0092\u0092\u009a").intern(), m5086(new gi()));
        linkedHashMap.put(m5082("\u001c\u0016\u0011\u0015\u0006\b", 6 - (Process.myTid() >> 22), (byte) (75 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), m5086(new gy.e(), new gy.a()));
        linkedHashMap.put(m5084(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u008d\u009b\u0092\u0085\u009d\u008d\u0088\u0089\u009c").intern(), m5086(new gf.e(), new gf.c()));
        linkedHashMap.put(m5084(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0095\u009b\u0095\u0086\u0095\u0094").intern(), m5086(new go()));
        linkedHashMap.put(m5084(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0088\u0093\u0095\u0095\u0096\u0088\u008c\u0085\u008b\u0090").intern(), m5086(new ge()));
        linkedHashMap.put(m5082("\u000e\u0010\u001a\f\u0016\u0007", 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (19 - View.getDefaultSize(0, 0))).intern(), m5086(new gm()));
        linkedHashMap.put(m5082("\u001d\u0001\u001b\u001c\u0010\u001a", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, (byte) (120 - TextUtils.getOffsetBefore("", 0))).intern(), m5086(new gw()));
        linkedHashMap.put(m5084(null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, "\u0093\u0097\u0081\u0092\u0095\u009f\u0085\u009e\u0081").intern(), m5086(new fy()));
        linkedHashMap.put(m5082("\u0016\t\u0000\u0019\u000b\u0017\n\u0010\r\t", 10 - Color.red(0), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59)).intern(), m5086(new gh()));
        linkedHashMap.put(m5084(null, TextUtils.indexOf("", "") + 127, null, "\u0082\u0081\u008d\u008f\u0087 ").intern(), m5086(new gj()));
        linkedHashMap.put(m5084(null, 127 - Color.blue(0), null, "¢\u0094\u008c\u0097\u0089¡").intern(), m5086(new gk()));
        linkedHashMap.put(m5082("\u001d\u0000\b\u0010", 4 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37)).intern(), m5086(new gp()));
        linkedHashMap.put(m5082("\u0019\u001d\u001d\u0001\u000b\u0012\b\n", 7 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), m5086(new gn()));
        linkedHashMap.put(m5084(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0089\u008c\u0084\u0099£").intern(), m5086(new gs(), new gs.a()));
        linkedHashMap.put(m5084(null, 175 - AndroidCharacter.getMirror('0'), null, "\u008d\u008f\u0087\u0088\u0085¥\u0096\u0084¤").intern(), m5086(new gt()));
        linkedHashMap.put(m5082("\u0005\u001bnn\b\u000f", 7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (13 - View.combineMeasuredStates(0, 0))).intern(), m5086(new gv()));
        linkedHashMap.put(m5082("\u0004\u000f\u0019\b\f\u0006\u001f\u0006\r\u000f\u0019\u000b", 12 - View.MeasureSpec.getMode(0), (byte) (Process.getGidForName("") + 11)).intern(), m5086(new gu()));
        linkedHashMap.put(m5084(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0088\u0092\u008d\u009b\u0092\u008d¦").intern(), m5086(new ha()));
        linkedHashMap.put(m5084(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "¨\u008d\u0082\u0092\u0085§").intern(), m5086(new gx()));
        f787 = DesugarCollections.unmodifiableMap(linkedHashMap);
        f781 = (f783 + 75) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    static void m5081() {
        f786 = true;
        f785 = true;
        f789 = 20;
        f788 = new char[]{'U', 'x', 'e', 137, 'u', 128, '}', 136, 141, 'g', '|', 134, 'y', '^', 138, 'W', 'i', 130, 135, 'a', 131, 'v', 132, '`', '{', ']', 'w', 'V', 'X', 129, 142, 'Z', IOUtils.DIR_SEPARATOR_WINDOWS, 'l', 'c', 'd', 'b', 'h', 'm', 140};
        f784 = (char) 6;
        f782 = new char[]{'A', 'd', 'Q', 'S', 'h', 'a', 'r', 'e', 'U', 't', 'i', 'l', 's', 'I', 'o', 'n', 'u', 'c', 'F', 'b', 'k', 'B', 'V', 'g', 'M', 'T', 'p', 'j', 'y', 'm', 'w', 'C', 'D', 'E', 'G', 'H'};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Map<String, List<gl>> m5083() {
        ArrayList<String> arrayList = new ArrayList(f787.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : arrayList) {
            List<? extends gl> list = f787.get(str);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (gl glVar : list) {
                    if (m5090(glVar)) {
                        f783 = (f781 + 87) % 128;
                        arrayList2.add(glVar);
                    }
                }
                linkedHashMap.put(str, arrayList2);
                f781 = (f783 + 31) % 128;
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<? extends gl> m5086(gl... glVarArr) {
        f781 = (f783 + 63) % 128;
        List<? extends gl> listAsList = Arrays.asList(glVarArr);
        f783 = (f781 + 33) % 128;
        return listAsList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static gl m5087() {
        ga gaVar = new ga();
        int i10 = f783 + 57;
        f781 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 87 / 0;
        }
        return gaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    static List<String> m5088() {
        int i10 = f781 + 15;
        f783 = i10 % 128;
        if (i10 % 2 != 0) {
            return f790;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    static String m5089() {
        f783 = (f781 + 117) % 128;
        String strIntern = m5084(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u0082\u008d\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i10 = f783 + 5;
        f781 = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static List<gl> m5085() {
        List<gl> listAsList = Arrays.asList(new fz(), new gc(), new ft());
        int i10 = f783 + 9;
        f781 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5090(gl glVar) {
        int i10 = f783 + 69;
        f781 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                int i11 = 46 / 0;
                if (!Prode.m4529()) {
                    Class.forName(glVar.mo6487());
                }
                glVar.mo6488();
            } else if (Prode.m4529()) {
                glVar.mo6488();
            } else {
                Class.forName(glVar.mo6487());
            }
            f781 = (f783 + 97) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5084(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f788;
                int i11 = f789;
                if (f785) {
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
                if (f786) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5082(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f782;
                char c10 = f784;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2158 = 0;
                    while (true) {
                        int i11 = g.f2158;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2157 = cArr[i11];
                        g.f2155 = cArr[g.f2158 + 1];
                        if (g.f2157 == g.f2155) {
                            cArr3[g.f2158] = (char) (g.f2157 - b10);
                            cArr3[g.f2158 + 1] = (char) (g.f2155 - b10);
                        } else {
                            g.f2156 = g.f2157 / c10;
                            g.f2154 = g.f2157 % c10;
                            g.f2159 = g.f2155 / c10;
                            g.f2152 = g.f2155 % c10;
                            if (g.f2154 == g.f2152) {
                                g.f2156 = ((g.f2156 + c10) - 1) % c10;
                                g.f2159 = ((g.f2159 + c10) - 1) % c10;
                                int i12 = (g.f2156 * c10) + g.f2154;
                                int i13 = (g.f2159 * c10) + g.f2152;
                                int i14 = g.f2158;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2156 == g.f2159) {
                                g.f2154 = ((g.f2154 + c10) - 1) % c10;
                                g.f2152 = ((g.f2152 + c10) - 1) % c10;
                                int i15 = (g.f2156 * c10) + g.f2154;
                                int i16 = (g.f2159 * c10) + g.f2152;
                                int i17 = g.f2158;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2156 * c10) + g.f2152;
                                int i19 = (g.f2159 * c10) + g.f2154;
                                int i20 = g.f2158;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2158 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
