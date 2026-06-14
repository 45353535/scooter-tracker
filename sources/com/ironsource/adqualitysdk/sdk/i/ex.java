package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class ex extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2032 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2033 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2034 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2035 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2036 = -8796329455380329577L;

    public ex(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6465(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2697) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2699 = 0;
                while (true) {
                    int i11 = j.f2699;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2698 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2699;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f2036) ^ ((long) f2032)) ^ ((long) f2035));
                        j.f2699 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        char c10;
        int i10;
        int i11 = f2033 + 51;
        f2034 = i11 % 128;
        int i12 = i11 % 2;
        long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
        if (i12 != 0) {
            c10 = (char) (41827 >>> (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)));
            i10 = 978632675 >>> (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        } else {
            c10 = (char) ((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 41827);
            i10 = 978632675 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        }
        return m6465("墶", c10, "\u0b97᳀⣷藭", i10, "\ue272咿携羣").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo6456(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i10 = f2033;
            int i11 = i10 + 71;
            f2034 = i11 % 128;
            if (i11 % 2 != 0) {
                boolean z10 = number2 instanceof Double;
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f2034 = (i10 + 89) % 128;
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
                        int i12 = f2034 + 65;
                        f2033 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 64 / 0;
                        }
                        return numValueOf;
                    }
                }
                Long lValueOf = Long.valueOf(number.longValue() - number2.longValue());
                int i14 = f2033 + 95;
                f2034 = i14 % 128;
                if (i14 % 2 == 0) {
                    return lValueOf;
                }
                throw null;
            }
        }
        return Double.valueOf(number.doubleValue() - number2.doubleValue());
    }
}
