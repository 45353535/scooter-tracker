package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Moloco;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class go extends gl {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2233 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2234 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2235 = {'y', 241, 245, 244, 237, 242, 215, 196, 229, 244, 244, 240, 240, 240, 240, 245, 212, 212, 245, 244, 244, 240, 240, 213, 215, 242, 238, 211, 214, 249, 242, '7', 'm', 'm', 'n', 'n', 'i'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6513(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2235, i10, cArr, 0, i11);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6486() {
        bs bsVar = new bs(mo6489());
        f2234 = (f2233 + 89) % 128;
        return bsVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6487() {
        f2234 = (f2233 + 35) % 128;
        String strIntern = m6513(new int[]{0, 31, 135, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern();
        int i10 = f2233 + 77;
        f2234 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6488() {
        int i10 = f2233 + 59;
        f2234 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 97 / 0;
        }
        return Moloco.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6489() {
        int i10 = f2234 + 119;
        f2233 = i10 % 128;
        return (i10 % 2 != 0 ? m6513(new int[]{31, 6, 0, 4}, "\u0001\u0001\u0001\u0000\u0000\u0000", false) : m6513(new int[]{31, 6, 0, 4}, "\u0001\u0001\u0001\u0000\u0000\u0000", true)).intern();
    }
}
