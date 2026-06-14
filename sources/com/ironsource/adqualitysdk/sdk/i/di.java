package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class di extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1747 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1748 = {'t', 226, 226, 208, 200, 204, 204, '!', 'R', 'g', 'n', 'h', 'e', 'h', 'j', 'a', 'f', 't', 'j', 'l', 'l', 'l', 143, 141, 152, 161, '|', 150, 143, 145, 137, 152, 149, 137, 'k', 156, 141, 146, 278, 285, 299, 300, 302, 302, 307, 299, 301, 301, 274, 282, 300, 300, 261, 274, 227, 276, 261, 275, 260, 233, 261, 278, 265, 276, 257, 156, 304, 283, 289, 311, 311, 309, 289, 290, 305, 'V', 165, 165, 156, 148, 164, 172, 166, 165, 172, 151, 143, 's', 163, 148, 162, 147, 'x', 159, 162, 134, 262, 262, 246, 245, 267, 243, 236, 257, 264, 258, 255, 258, 260, 245, 240, '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'l', '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', '[', 'l', 'f', 157, 311, 301, 301, 284, 278, 295, 276, 285, 308, 307, 300, 298, 297};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static long f1749 = 5147170450295727915L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1750;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1751;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String f1752;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1753;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1754;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1755;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1756;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1757;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1758;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1759;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1760;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1761;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1762;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m6212() {
        int i10 = (f1750 + 69) % 128;
        f1747 = i10;
        String str = this.f1752;
        int i11 = i10 + 101;
        f1750 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m6214(String str) {
        int i10 = f1750;
        int i11 = i10 + 25;
        f1747 = i11 % 128;
        int i12 = i11 % 2;
        this.f1751 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 77;
        f1747 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m6215() {
        int i10 = f1750;
        int i11 = i10 + 5;
        f1747 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1751;
        f1747 = (i10 + 27) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m6217() {
        int i10 = f1747;
        int i11 = i10 + 7;
        f1750 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1754;
        int i12 = i10 + 121;
        f1750 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m6220(String str) {
        int i10 = (f1750 + 93) % 128;
        f1747 = i10;
        this.f1755 = str;
        f1750 = (i10 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m6221() {
        int i10 = f1747;
        String str = this.f1755;
        int i11 = i10 + 91;
        f1750 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m6224(String str) {
        int i10 = f1750;
        this.f1753 = str;
        int i11 = i10 + 65;
        f1747 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6225() {
        int i10 = f1747 + 87;
        int i11 = i10 % 128;
        f1750 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1753;
        int i12 = i11 + 87;
        f1747 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6227() {
        int i10 = (f1747 + 53) % 128;
        f1750 = i10;
        String str = this.f1761;
        int i11 = i10 + 87;
        f1747 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6231(String str) {
        int i10 = f1747 + 1;
        int i11 = i10 % 128;
        f1750 = i11;
        int i12 = i10 % 2;
        this.f1760 = str;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 103;
        f1747 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6233(String str) {
        int i10 = f1747 + 105;
        f1750 = i10 % 128;
        int i11 = i10 % 2;
        this.f1762 = str;
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6235(String str) {
        int i10 = (f1750 + 113) % 128;
        f1747 = i10;
        this.f1758 = str;
        f1750 = (i10 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6238(String str) {
        int i10 = f1750 + 99;
        f1747 = i10 % 128;
        int i11 = i10 % 2;
        this.f1761 = str;
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m6213() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ih.f2538, this.f1758);
            jSONObject.putOpt(ih.f2537, this.f1761);
            jSONObject.putOpt(ih.f2543, this.f1762);
            jSONObject.putOpt(ih.f2542, this.f1759);
            jSONObject.putOpt(ih.f2541, this.f1755);
            jSONObject.putOpt(ih.f2536, this.f1754);
            jSONObject.putOpt(ih.f2535, this.f1756);
            jSONObject.putOpt(ih.f2534, this.f1753);
            jSONObject.putOpt(ih.f2529, this.f1757);
        } catch (JSONException unused) {
        }
        f1750 = (f1747 + 71) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m6216(String str) {
        int i10 = f1747 + 67;
        f1750 = i10 % 128;
        int i11 = i10 % 2;
        this.f1752 = str;
        if (i11 != 0) {
            int i12 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m6218(String str) {
        int i10 = f1750 + 31;
        f1747 = i10 % 128;
        int i11 = i10 % 2;
        this.f1756 = str;
        if (i11 == 0) {
            int i12 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6219() {
        int i10 = f1750 + 91;
        int i11 = i10 % 128;
        f1747 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1756;
        int i12 = i11 + 49;
        f1750 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 86 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m6222(String str) {
        int i10 = f1750;
        int i11 = i10 + 1;
        f1747 = i11 % 128;
        int i12 = i11 % 2;
        this.f1754 = str;
        if (i12 == 0) {
            int i13 = 46 / 0;
        }
        f1747 = (i10 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6223() {
        int i10 = f1747 + 83;
        int i11 = i10 % 128;
        f1750 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1757;
        f1747 = (i11 + 5) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m6226(String str) {
        int i10 = f1750;
        this.f1757 = str;
        int i11 = i10 + 111;
        f1747 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6229(String str) {
        int i10 = f1747;
        this.f1759 = str;
        int i11 = i10 + 99;
        f1750 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 70 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6230() {
        int i10 = (f1747 + 39) % 128;
        f1750 = i10;
        String str = this.f1759;
        int i11 = i10 + 91;
        f1747 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m6232() {
        int i10 = f1747 + 1;
        f1750 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1762;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m6234() {
        int i10 = f1750 + 107;
        f1747 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1758;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m6236() {
        String str;
        int i10 = f1747;
        int i11 = i10 + 63;
        f1750 = i11 % 128;
        if (i11 % 2 != 0) {
            str = this.f1760;
            int i12 = 54 / 0;
        } else {
            str = this.f1760;
        }
        int i13 = i10 + 35;
        f1750 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6237(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1748, i10, cArr, 0, i11);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[PHI: r6
  0x0051: PHI (r6v5 char) = (r6v1 char), (r6v0 char) binds: [B:85:0x02e9, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5100(java.lang.String r21, java.util.List<java.lang.Object> r22, com.ironsource.adqualitysdk.sdk.i.ch r23) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.mo5100(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6228(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2308) {
            try {
                char[] cArrM6531 = h.m6531(f1749, cArr, i10);
                h.f2309 = 4;
                while (true) {
                    int i11 = h.f2309;
                    if (i11 < cArrM6531.length) {
                        h.f2307 = i11 - 4;
                        cArrM6531[h.f2309] = (char) (((long) (cArrM6531[r1] ^ cArrM6531[r1 % 4])) ^ (((long) h.f2307) * f1749));
                        h.f2309++;
                    } else {
                        str2 = new String(cArrM6531, 4, cArrM6531.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
