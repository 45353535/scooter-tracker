package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class dk extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1777 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1778 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1780 = 1310500565;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1782 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1783 = 103;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1784 = 1435268900;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn f1785;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hn f1787;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1781 = {40, 93, 62, 83, 37, 82, 94, 41, Utf8.REPLACEMENT_BYTE, UnsignedBytes.MAX_POWER_OF_TWO, 48, 97, 2, 53, Ascii.FS, 47, 57, 1, 51, -29, 84, 10, 57, UnsignedBytes.MAX_POWER_OF_TWO, -126, 48, 122, 122, Ascii.CAN, UnsignedBytes.MAX_POWER_OF_TWO, Ascii.RS, -121, 126, 58, 106, 125, Ascii.FS, 41, 106, -127, 52, 92, Ascii.SUB, -119, -67, 74, -93, 80, -62, 79, 67, -66, -92, 85, -64, -63, -97, 4, -88, -89, 8, 3, -62, -85, -16, -72, Ascii.EM, Ascii.SYN, 118, -109, 89, 113, -124, -106, 91, UnsignedBytes.MAX_POWER_OF_TWO, 125, -113, -115, Utf8.REPLACEMENT_BYTE, -123, -123, 103, -113, 105, -106, -119, 69, -91, 101, -120, 84, 3, -9, 80, 86, -15, -4, 87, 2, 84, 3, -9, 80, 86, Ascii.EM, 73, 4, -123, 120, -124, -119, -93, 106, 125, -92, 119, -127, -119, 123, -85, 92, -110, 117, -15, -32, -28, -19, 3, -50, -23, 4, -33, -27, -19, -37, Ascii.VT, -68, -10, -27, 97, 78, 82, 93, 115, 60, 89, 114, 61, 105, 94, 88, 112, 65, 100, 81, 69, -72, -60, 73, 99, -86, -67, 100, -87, 77, 72, -66, 86, -91, 82, -63, -43, 4, 0, -39, -33, -6, -3, -32, -6, 2, -49, -35, 40, -46, 5, -90, 121, -123, -86, -92, -117, 126, -91, -117, -125, -76, -98, 93, -77, -126, -22, 55, 67, -18, -28, 77, 66, -29, 55, 58, -41, -26, 37, 62, Ascii.SI, Ascii.ETB, -11, 58, -67, -64, Ascii.VT, -57, 34, -77, -65, 38, 32, -50, -51, 47, -73, 17, -64, -79, 13, -19, 45, -66, -48, -47, -122, -76, -44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1779 = {72526405, 498935741, 1850971941, 1462439246, -2132092223, 1708160554, -395663865, 1925863166, 681729306, 1944994731, 1568739955, -1563559347, -1507877317, 2004252735, 1293346952, -1201631360, 458925985, 1781078698};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1790 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1789 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1788 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1791 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1792 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1786 = new JSONObject();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private JSONObject m6255() {
        JSONObject jSONObject = new JSONObject();
        try {
            hn hnVar = this.f1785;
            if (hnVar != null) {
                f1778 = (f1777 + 33) % 128;
                jSONObject.put(ih.f2552, hnVar.m6556());
            }
            hn hnVar2 = this.f1787;
            if (hnVar2 != null) {
                f1777 = (f1778 + 89) % 128;
                jSONObject.put(ih.f2546, hnVar2.m6556());
            }
            if (this.f1790.size() > 0) {
                jSONObject.put(ih.f2544, new JSONArray((Collection) this.f1790));
                f1777 = (f1778 + 87) % 128;
            }
            if (this.f1789.size() > 0) {
                jSONObject.put(ih.f2540, new JSONArray((Collection) this.f1789));
            }
            if (this.f1788.size() > 0) {
                jSONObject.put(ih.f2539, new JSONArray((Collection) this.f1788));
                f1778 = (f1777 + 19) % 128;
            }
            if (this.f1791.size() > 0) {
                jSONObject.put(ih.f2547, new JSONArray((Collection) this.f1791));
            }
            if (this.f1792.size() > 0) {
                jSONObject.put(ih.f2548, new JSONArray((Collection) this.f1792));
            }
            if (this.f1786.length() > 0) {
                int i10 = f1777 + 41;
                f1778 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.putOpt(ih.f2545, this.f1786.toString());
                    int i11 = 30 / 0;
                } else {
                    jSONObject.putOpt(ih.f2545, this.f1786.toString());
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String m6256() {
        int i10 = f1777 + 91;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1786.optString(ih.f2535);
            throw null;
        }
        String strOptString = this.f1786.optString(ih.f2535);
        f1777 = (f1778 + 23) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private String m6257() {
        f1778 = (f1777 + 87) % 128;
        String strOptString = this.f1786.optString(ih.f2547);
        f1777 = (f1778 + 47) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m6258() {
        int i10 = f1777 + 53;
        f1778 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1786;
        }
        int i11 = 38 / 0;
        return this.f1786;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m6259() {
        f1778 = (f1777 + 53) % 128;
        String strOptString = this.f1786.optString(ih.f2539);
        int i10 = f1778 + 33;
        f1777 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m6261(String str) {
        f1778 = (f1777 + 19) % 128;
        try {
            this.f1786.put(ih.f2535, str);
            int i10 = f1777 + 101;
            f1778 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn m6262() {
        int i10 = f1777;
        hn hnVar = this.f1785;
        f1778 = (i10 + 15) % 128;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6264() {
        String strOptString;
        int i10 = f1777 + 47;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            strOptString = this.f1786.optString(ih.f2548);
            int i11 = 42 / 0;
        } else {
            strOptString = this.f1786.optString(ih.f2548);
        }
        f1777 = (f1778 + 73) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m6266() {
        f1777 = (f1778 + 109) % 128;
        String strOptString = this.f1786.optString(ih.f2544);
        f1777 = (f1778 + 69) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hn m6268() {
        int i10 = f1778 + 1;
        int i11 = i10 % 128;
        f1777 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        hn hnVar = this.f1787;
        f1778 = (i11 + 81) % 128;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6270() {
        f1777 = (f1778 + 57) % 128;
        String strOptString = this.f1786.optString(ih.f2540);
        f1778 = (f1777 + 73) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m6273() {
        int i10 = f1777 + 45;
        f1778 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1791;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m6277() {
        int i10 = f1777;
        int i11 = i10 + 77;
        f1778 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1788;
        f1778 = (i10 + 15) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m6283() {
        int i10 = (f1777 + 33) % 128;
        f1778 = i10;
        List<String> list = this.f1792;
        f1777 = (i10 + 33) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m6288() {
        int i10 = f1777 + 117;
        f1778 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1790;
        }
        int i11 = 84 / 0;
        return this.f1790;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m6291() {
        int i10 = f1778;
        List<String> list = this.f1789;
        int i11 = i10 + 27;
        f1777 = i11 % 128;
        if (i11 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m6263(String str) {
        int i10 = f1777 + 113;
        f1778 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1786.put(ih.f2539, str);
                throw null;
            }
            this.f1786.put(ih.f2539, str);
            f1777 = (f1778 + 7) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m6265(String str) {
        f1778 = (f1777 + 27) % 128;
        try {
            this.f1786.put(ih.f2540, str);
            int i10 = f1778 + 17;
            f1777 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m6267(String str) {
        int i10 = f1777 + 89;
        f1778 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1786.put(ih.f2544, str);
                int i11 = 5 / 0;
            } else {
                this.f1786.put(ih.f2544, str);
            }
            f1778 = (f1777 + 33) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m6269(String str) {
        f1777 = (f1778 + 57) % 128;
        try {
            this.f1786.put(ih.f2548, str);
            int i10 = f1778 + 125;
            f1777 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 80 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m6271(String str) {
        f1777 = (f1778 + 59) % 128;
        try {
            this.f1786.put(ih.f2547, str);
            int i10 = f1777 + 15;
            f1778 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6276(List<String> list) {
        int i10 = f1778 + 29;
        f1777 = i10 % 128;
        if (i10 % 2 != 0) {
            m6281(list, this.f1789);
        } else {
            m6281(list, this.f1789);
            int i11 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6279(String str) {
        f1778 = (f1777 + 9) % 128;
        m6275(str, this.f1788);
        int i10 = f1777 + 101;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6285(String str) {
        f1777 = (f1778 + 47) % 128;
        m6275(str, this.f1792);
        int i10 = f1778 + 45;
        f1777 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6289(String str) {
        int i10 = f1778 + 67;
        f1777 = i10 % 128;
        if (i10 % 2 == 0) {
            m6275(str, this.f1789);
            throw null;
        }
        m6275(str, this.f1789);
        int i11 = f1777 + 3;
        f1778 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6292(String str) {
        f1777 = (f1778 + 61) % 128;
        m6275(str, this.f1790);
        int i10 = f1778 + 113;
        f1777 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6274(String str) {
        f1778 = (f1777 + 55) % 128;
        m6275(str, this.f1791);
        int i10 = f1777 + 9;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6280(List<String> list) {
        int i10 = f1777 + 121;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            m6281(list, this.f1791);
            int i11 = 25 / 0;
        } else {
            m6281(list, this.f1791);
        }
        f1778 = (f1777 + 89) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6286(List<String> list) {
        int i10 = f1778 + 27;
        f1777 = i10 % 128;
        if (i10 % 2 == 0) {
            m6281(list, this.f1792);
            int i11 = 43 / 0;
        } else {
            m6281(list, this.f1792);
        }
        f1778 = (f1777 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6290(List<String> list) {
        f1777 = (f1778 + 39) % 128;
        m6281(list, this.f1788);
        int i10 = f1777 + 61;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6293(List<String> list) {
        f1777 = (f1778 + 69) % 128;
        m6281(list, this.f1790);
        int i10 = f1777 + 103;
        f1778 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object m6260() {
        /*
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f1790
            int r0 = r0.size()
            if (r0 > 0) goto L33
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1778
            int r0 = r0 + 11
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1777 = r0
            java.util.List<java.lang.String> r0 = r1.f1789
            int r0 = r0.size()
            if (r0 > 0) goto L33
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1777
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1778 = r0
            java.util.List<java.lang.String> r0 = r1.f1792
            int r0 = r0.size()
            if (r0 <= 0) goto L29
            goto L33
        L29:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1777
            int r0 = r0 + 119
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1778 = r0
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.m6260():java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6275(String str, List<String> list) {
        if (list == null || !(!TextUtils.isEmpty(str)) || list.contains(str)) {
            return;
        }
        f1777 = (f1778 + 117) % 128;
        list.add(str);
        f1778 = (f1777 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6278(hn hnVar) {
        if (hnVar != null) {
            this.f1785 = hnVar;
            f1778 = (f1777 + 13) % 128;
        }
        f1778 = (f1777 + 53) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6284(hn hnVar) {
        int i10 = (f1777 + 9) % 128;
        f1778 = i10;
        if (hnVar != null) {
            f1777 = (i10 + 67) % 128;
            this.f1787 = hnVar;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6287(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1779.clone();
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
    private void m6282(JSONObject jSONObject) {
        int i10 = f1778 + 57;
        f1777 = i10 % 128;
        int i11 = i10 % 2;
        this.f1786 = jz.m7082(jSONObject);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m6281(List<String> list, List<String> list2) {
        if (list != null) {
            f1777 = (f1778 + 105) % 128;
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f1778 = (f1777 + 65) % 128;
                m6275(it.next(), list2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0135  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r26, java.util.List<java.lang.Object> r27, com.ironsource.adqualitysdk.sdk.i.ch r28) {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6272(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3017) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1783;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1781;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1784 + i10] + i13);
                    } else {
                        i14 = (short) (f1782[f1784 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f3018 = ((i10 + i14) - 2) + f1784 + i15;
                    o.f3019 = b10;
                    char c10 = (char) (i11 + f1780);
                    o.f3021 = c10;
                    sb2.append(c10);
                    o.f3020 = o.f3021;
                    o.f3022 = 1;
                    while (o.f3022 < i14) {
                        byte[] bArr2 = f1781;
                        if (bArr2 != null) {
                            int i16 = o.f3018;
                            o.f3018 = i16 - 1;
                            o.f3021 = (char) (o.f3020 + (((byte) (bArr2[i16] + s10)) ^ o.f3019));
                        } else {
                            short[] sArr = f1782;
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
}
