package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class fn extends fr {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2088 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2089 = {'@', 135, 140, 143, 140, 137, 143, 139, 'n'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2090 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6478(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2089, i10, cArr, 0, i11);
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

    public final String toString() {
        int i10 = f2088 + 85;
        f2090 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6478(new int[]{0, 9, 30, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", false) : m6478(new int[]{0, 9, 30, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", false)).intern();
        int i11 = f2088 + 107;
        f2090 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6475(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        drVar.m6375();
        int i10 = f2090 + 119;
        f2088 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
        return drVar;
    }
}
