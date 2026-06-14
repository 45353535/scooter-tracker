package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class aw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f589 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f590 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f592 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f593 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f595 = 196;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f596;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f597;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f598;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f594 = {312, 317, 308, 297, 306, 313, 304, 265, 310, 307, 228, 301, 311, 300, 296, 264, 293, 294};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f591 = {-249871222, 1447174715, 197520244, 1648896034, 317761997, -1233006717, -2034892610, -1853135002, -27184752, 502131792, -1648048931, -708895012, 815181033, 991412463, -1453478111, 1046018402, 55339931, -1757561124};

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f599;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f599 = iArr;
            try {
                iArr[d.f608.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f599[d.f611.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f599[d.f610.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f599[d.f607.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum d {
        f608,
        f607,
        f610,
        f611;


        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f600 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f601 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f602;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static byte[] f603;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f604;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static short[] f605;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f606;

        static {
            m4948();
            f601 = (f600 + 63) % 128;
        }

        public static d valueOf(String str) {
            f601 = (f600 + 77) % 128;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i10 = f601 + 105;
            f600 = i10 % 128;
            if (i10 % 2 == 0) {
                return dVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f600 = (f601 + 97) % 128;
            d[] dVarArr = (d[]) values().clone();
            int i10 = f600 + 117;
            f601 = i10 % 128;
            if (i10 % 2 != 0) {
                return dVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m4947(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3017) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f602;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f603;
                        i14 = bArr != null ? (byte) (bArr[f604 + i10] + i13) : (short) (f605[f604 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f3018 = ((i10 + i14) - 2) + f604 + i15;
                        o.f3019 = b10;
                        char c10 = (char) (i11 + f606);
                        o.f3021 = c10;
                        sb2.append(c10);
                        o.f3020 = o.f3021;
                        o.f3022 = 1;
                        while (o.f3022 < i14) {
                            byte[] bArr2 = f603;
                            if (bArr2 != null) {
                                int i16 = o.f3018;
                                o.f3018 = i16 - 1;
                                o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                            } else {
                                short[] sArr = f605;
                                int i17 = o.f3018;
                                o.f3018 = i17 - 1;
                                o.f3021 = (char) (o.f3020 + (((short) (sArr[i17] + s10)) ^ o.f3019));
                            }
                            sb2.append(o.f3021);
                            o.f3020 = o.f3021;
                            o.f3022++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static void m4948() {
            f604 = -1552642572;
            f602 = 107;
            f606 = 736639886;
            f603 = new byte[]{-104, 0, Ascii.VT, -102, -17, 7, 13, 1, -102, 8, 3, 7, 3, -102, 17, 2, -23, 19};
        }
    }

    public aw(JSONObject jSONObject) {
        this.f597 = m4941(jSONObject.optString(m4942(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0084\u0083\u0082\u0081").intern()));
        this.f596 = m4943(jSONObject.optString(m4944(new int[]{1677581700, 1568689871}, 2 - Color.green(0)).intern()));
        this.f598 = m4940(jSONObject.optString(m4944(new int[]{-1679930329, 672363503, 1731016771, -1658967260}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6).intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4940(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i10 = f592 + 31;
            f589 = i10 % 128;
            if (i10 % 2 != 0 ? !str.equals(m4942(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u0087\u0087\u0086\u0085").intern()) : !str.equals(m4942(null, 85 - (Process.getThreadPriority(0) + 32), null, "\u0087\u0087\u0086\u0085").intern())) {
                return str;
            }
        }
        f592 = (f589 + 83) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.ironsource.adqualitysdk.sdk.i.aw.d m4941(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aw.m4941(java.lang.String):com.ironsource.adqualitysdk.sdk.i.aw$d");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> m4943(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i10 = f592 + 73;
        f589 = i10 % 128;
        List<String> listAsList = i10 % 2 == 0 ? Arrays.asList(str.split(m4944(new int[]{-231744396, -1523333307}, 1 >>> TextUtils.getOffsetBefore("", 1)).intern())) : Arrays.asList(str.split(m4944(new int[]{-231744396, -1523333307}, TextUtils.getOffsetBefore("", 0) + 1).intern()));
        f589 = (f592 + 69) % 128;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4946(String str) {
        int i10;
        try {
            i10 = AnonymousClass4.f599[this.f597.ordinal()];
        } catch (Exception e10) {
            kd.m7160(m4944(new int[]{-1666146046, 95630002, -1547939219, 180157551, -583088506, -2015564159, -58690802, -1335806337, 455296167, 1181227952, -1041048927, -1438469512}, AndroidCharacter.getMirror('0') - 26).intern(), m4942(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0084\u0087\u0092\u0091\u008d\u008c\u0090\u008f\u0087\u0086\u008a\u008e\u008d\u008b\u0085\u008c\u008b\u0089\u008a\u0089\u0089\u0088").intern(), e10, false);
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            boolean zContains = this.f596.contains(str);
            int i11 = f589 + 79;
            f592 = i11 % 128;
            if (i11 % 2 == 0) {
                return zContains;
            }
            throw null;
        }
        if (i10 != 3) {
            if (i10 != 4) {
            }
            return false;
        }
        if (this.f596.size() > 0) {
            if (kc.m7147(str, this.f596.get(0)) < 0) {
                return true;
            }
            f589 = (f592 + 63) % 128;
            return false;
        }
        if (this.f596.size() > 0) {
            f592 = (f589 + 63) % 128;
            if (kc.m7147(str, this.f596.get(0)) < 0) {
                return false;
            }
            int i12 = f589 + 73;
            f592 = i12 % 128;
            return i12 % 2 == 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4945() {
        int i10 = f589;
        String str = this.f598;
        f592 = (i10 + 17) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4942(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f594;
                int i11 = f595;
                if (f590) {
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
                if (f593) {
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4944(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f591.clone();
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
