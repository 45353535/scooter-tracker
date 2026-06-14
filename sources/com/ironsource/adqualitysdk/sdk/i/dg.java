package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class dg extends cz implements cl {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1712 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1713 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1719 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hl f1721;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1722;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1723;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1724;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1718 = {'g', 'e', 't', 'A', 'd', 'v', 'r', 'i', 's', 'I', 'T', 'y', 'p', 'D', 'U', 'l', 'F', 'n', 'a', 'S', 'o', 'u', 'c', 'J', 'h'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1715 = 13929;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1716 = 61044;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1714 = 12544;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f1717 = 50637;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final JSONObject f1725 = new JSONObject();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1720 = new ArrayList();

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m6174() {
        boolean z10 = true;
        if (TextUtils.isEmpty(this.f1723)) {
            f1713 = (f1712 + 39) % 128;
            if (TextUtils.isEmpty(this.f1722) && TextUtils.isEmpty(this.f1724)) {
                int i10 = f1712 + 65;
                f1713 = i10 % 128;
                if (i10 % 2 == 0) {
                    this.f1720.size();
                    throw null;
                }
                if (this.f1720.size() <= 0) {
                    z10 = false;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i11 = f1712 + 105;
        f1713 = i11 % 128;
        if (i11 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m6175() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f1723;
            if (str != null && this.f1721 != null) {
                int i10 = f1713 + 45;
                f1712 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.putOpt(ih.f2554, str);
                    jSONObject.putOpt(ih.f2556, Integer.valueOf(this.f1721.m6551()));
                    throw null;
                }
                jSONObject.putOpt(ih.f2554, str);
                jSONObject.putOpt(ih.f2556, Integer.valueOf(this.f1721.m6551()));
            }
            jSONObject.putOpt(ih.f2549, this.f1722);
            jSONObject.putOpt(ih.f2553, this.f1724);
            if (this.f1720.size() > 0) {
                jSONObject.putOpt(ih.f2544, new JSONArray((Collection) this.f1720));
                f1713 = (f1712 + 85) % 128;
            }
            if (this.f1725.length() > 0) {
                f1713 = (f1712 + 115) % 128;
                jSONObject.putOpt(ih.f2557, this.f1725.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m6176() {
        f1712 = (f1713 + 19) % 128;
        String strOptString = this.f1725.optString(ih.f2549);
        f1712 = (f1713 + 39) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m6179(String str) {
        f1712 = (f1713 + 87) % 128;
        try {
            this.f1725.put(ih.f2544, str);
            int i10 = f1712 + 25;
            f1713 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 7 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m6181(String str) {
        f1712 = (f1713 + 109) % 128;
        try {
            this.f1725.put(ih.f2553, str);
            f1712 = (f1713 + 117) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6182() {
        int i10 = f1712 + 75;
        f1713 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1725.optString(ih.f2554);
        }
        int i11 = 73 / 0;
        return this.f1725.optString(ih.f2554);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Object m6183() {
        f1713 = (f1712 + 3) % 128;
        String strOptString = this.f1725.optString(ih.f2553);
        f1712 = (f1713 + 35) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6185(String str) {
        int i10 = f1713;
        this.f1724 = str;
        f1712 = (i10 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6187(String str) {
        int i10 = f1712 + 73;
        int i11 = i10 % 128;
        f1713 = i11;
        int i12 = i10 % 2;
        this.f1723 = str;
        if (i12 == 0) {
            throw null;
        }
        f1712 = (i11 + 107) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6188() {
        int i10 = f1712;
        String str = this.f1723;
        int i11 = i10 + 45;
        f1713 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6194(String str) {
        int i10 = f1713;
        int i11 = i10 + 45;
        f1712 = i11 % 128;
        int i12 = i11 % 2;
        this.f1722 = str;
        if (i12 != 0) {
            throw null;
        }
        f1712 = (i10 + 41) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hl m6195() {
        int i10 = (f1713 + 21) % 128;
        f1712 = i10;
        hl hlVar = this.f1721;
        f1713 = (i10 + 29) % 128;
        return hlVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m6177(String str) {
        f1713 = (f1712 + 23) % 128;
        try {
            this.f1725.put(ih.f2549, str);
            int i10 = f1712 + 41;
            f1713 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m6184() {
        int i10 = f1713;
        int i11 = i10 + 63;
        f1712 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1720;
        f1712 = (i10 + 67) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6186() {
        String str;
        int i10 = f1713 + 23;
        int i11 = i10 % 128;
        f1712 = i11;
        if (i10 % 2 != 0) {
            str = this.f1722;
            int i12 = 19 / 0;
        } else {
            str = this.f1722;
        }
        f1713 = (i11 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6189(hl hlVar) {
        int i10 = f1713;
        this.f1721 = hlVar;
        int i11 = i10 + 5;
        f1712 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m6192() {
        int i10 = f1712;
        int i11 = i10 + 61;
        f1713 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1724;
        int i12 = i10 + 27;
        f1713 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6197(String str) {
        f1712 = (f1713 + 41) % 128;
        try {
            this.f1725.put(ih.f2554, str);
            f1713 = (f1712 + 15) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6190(String str) {
        f1713 = (f1712 + 23) % 128;
        if (TextUtils.isEmpty(str) || this.f1720.contains(str)) {
            return;
        }
        int i10 = f1713 + 11;
        f1712 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1720.add(str);
        } else {
            this.f1720.add(str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6193(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2153) {
            try {
                char[] cArr2 = f1718;
                char c10 = f1719;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f1  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r22, java.util.List<java.lang.Object> r23, com.ironsource.adqualitysdk.sdk.i.ch r24) {
        /*
            Method dump skipped, instruction units count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject m6178() {
        JSONObject jSONObject;
        int i10 = f1713 + 113;
        int i11 = i10 % 128;
        f1712 = i11;
        if (i10 % 2 != 0) {
            jSONObject = this.f1725;
            int i12 = 69 / 0;
        } else {
            jSONObject = this.f1725;
        }
        f1713 = (i11 + 61) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m6180() {
        f1713 = (f1712 + 1) % 128;
        String strOptString = this.f1725.optString(ih.f2544);
        int i10 = f1712 + 71;
        f1713 = i10 % 128;
        if (i10 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6196(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1715)) ^ ((c11 >>> 5) + f1714)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1716) ^ ((c12 + i12) ^ ((c12 << 4) + f1717))));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6191(List<String> list) {
        int i10 = f1712 + 41;
        f1713 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f1712 = (f1713 + 123) % 128;
                m6190(it.next());
            }
            int i11 = f1712 + 63;
            f1713 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        list.iterator();
        throw null;
    }
}
