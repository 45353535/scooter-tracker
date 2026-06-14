package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ai implements Comparable<ai> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f308 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f309 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f310 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f311 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f312 = 244;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f313 = {360, 359, 345, 354, 356, 352, 347, 361, 349, 344};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jb f314;

    public ai(jb jbVar) {
        this.f314 = jbVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m4697() {
        JSONObject jSONObjectM4704;
        int i10;
        int i11 = f308 + 21;
        f309 = i11 % 128;
        if (i11 % 2 != 0) {
            jSONObjectM4704 = m4704();
            i10 = 109 << (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1));
        } else {
            jSONObjectM4704 = m4704();
            i10 = 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        }
        long jOptInt = jSONObjectM4704.optInt(m4700(null, i10, null, "\u0084\u0083").intern());
        f308 = (f309 + 119) % 128;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m4698() {
        int i10 = f309 + 95;
        f308 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f314.m6884();
        }
        this.f314.m6884();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private long m4699() {
        f308 = (f309 + 75) % 128;
        long jOptLong = m4704().optLong(m4700(null, View.MeasureSpec.getSize(0) + 127, null, "\u0082\u0081").intern());
        f309 = (f308 + 79) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m4701() {
        List<String> listAsList;
        int i10 = f309 + 113;
        f308 = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = ih.f2530;
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = Arrays.asList(ih.f2530);
        }
        f308 = (f309 + 51) % 128;
        return listAsList;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ai aiVar) {
        f309 = (f308 + 85) % 128;
        int iM4703 = m4703(aiVar);
        f308 = (f309 + 115) % 128;
        return iM4703;
    }

    public final boolean equals(Object obj) {
        int i10 = f309 + 75;
        f308 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj != null && ai.class == obj.getClass()) {
            return m4698().equals(((ai) obj).m4698());
        }
        f309 = (f308 + 55) % 128;
        return false;
    }

    public final int hashCode() {
        if (m4704() == null) {
            f308 = (f309 + 113) % 128;
            return 0;
        }
        f309 = (f308 + 111) % 128;
        int iHashCode = m4704().hashCode();
        int i10 = f309 + 73;
        f308 = i10 % 128;
        if (i10 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        f308 = (f309 + 45) % 128;
        String string = m4704().toString();
        int i10 = f308 + 79;
        f309 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized JSONObject m4704() {
        JSONObject jSONObjectM6885;
        f309 = (f308 + 91) % 128;
        jSONObjectM6885 = this.f314.m6885();
        int i10 = f308 + 81;
        f309 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jSONObjectM6885;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m4706() {
        JSONObject jSONObjectM4704;
        int iIndexOf;
        int i10 = f309 + 37;
        f308 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM4704 = m4704();
            iIndexOf = 113 << TextUtils.indexOf("", "", 0, 0);
        } else {
            jSONObjectM4704 = m4704();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 127;
        }
        return jSONObjectM4704.optString(m4700(null, iIndexOf, null, "\u0084\u0087\u0086\u0085").intern());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4708() {
        f308 = (f309 + 87) % 128;
        String strOptString = m4704().optString(m4700(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008a\u0089\u0088").intern(), null);
        int i10 = f308 + 15;
        f309 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final jb m4709() {
        int i10 = f308;
        jb jbVar = this.f314;
        f309 = (i10 + 17) % 128;
        return jbVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4700(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f313;
                int i11 = f312;
                if (f311) {
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
                if (f310) {
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
    private int m4703(ai aiVar) {
        f309 = (f308 + 91) % 128;
        long jM4699 = m4699();
        long jM46992 = aiVar.m4699();
        if (jM4699 < jM46992) {
            f309 = (f308 + 57) % 128;
            return -1;
        }
        if (jM4699 == jM46992) {
            return m4702(aiVar);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4705(int i10) {
        try {
            f308 = (f309 + 51) % 128;
            if (this.f314.m6885() != null) {
                int i11 = f308 + 19;
                f309 = i11 % 128;
                if (i11 % 2 != 0) {
                    jz.m7086(this.f314.m6885(), i10, m4701());
                    throw null;
                }
                jz.m7086(this.f314.m6885(), i10, m4701());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4707(String str) throws UnsupportedEncodingException {
        JSONObject jSONObjectM4704;
        String strM4700;
        int i10 = f309 + 29;
        f308 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                jSONObjectM4704 = m4704();
                strM4700 = m4700(null, 25768 - (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            } else {
                jSONObjectM4704 = m4704();
                strM4700 = m4700(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            }
            jSONObjectM4704.put(strM4700.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m4702(ai aiVar) {
        long jM4697 = m4697();
        long jM46972 = aiVar.m4697();
        if (jM4697 >= jM46972) {
            if (jM4697 != jM46972) {
                return 1;
            }
            f309 = (f308 + 19) % 128;
            return 0;
        }
        int i10 = f308 + 111;
        f309 = i10 % 128;
        if (i10 % 2 == 0) {
            return -1;
        }
        int i11 = 73 / 0;
        return -1;
    }
}
