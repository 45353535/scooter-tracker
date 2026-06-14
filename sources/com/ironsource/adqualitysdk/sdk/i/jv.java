package com.ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class jv {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2931 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2932;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2933 = {' ', 'E', 'Y', 'O', 'V', 'U', '5', 'U', 'a', '_', 'a', '_', 'P', '@', ':', '5', 'Z', 'T', '8', 'O', IOUtils.DIR_SEPARATOR_WINDOWS, '@', '9', 'Y', 'T', 'F', IOUtils.DIR_SEPARATOR_WINDOWS, 'U', '_', 'd', 'Q', 'E', '>', '3', ']', 186, 179, 159, 152, 16, 5, '9', 'o', 'j', 'n', 'd', '^', 'n', 't', '[', 29, 'V', 'p', 'p', 'r', '[', '2'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m7039(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m7040(new int[]{0, 34, 1, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001", false).intern().getBytes(m7040(new int[]{34, 5, 102, 0}, "\u0001\u0001\u0000\u0001\u0001", false).intern()), mac.getAlgorithm()));
            String strM6756 = ie.m6756(mac.doFinal(str.replaceAll(m7040(new int[]{39, 1, 0, 1}, "\u0000", true).intern(), "").replaceAll(m7040(new int[]{40, 1, 0, 1}, "\u0000", false).intern(), "").getBytes(m7040(new int[]{34, 5, 102, 0}, "\u0001\u0001\u0000\u0001\u0001", false).intern())));
            int i10 = f2932 + 25;
            f2931 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM6756;
            }
            throw null;
        } catch (Exception e10) {
            String strIntern = m7040(new int[]{41, 9, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m7040(new int[]{50, 7, 0, 6}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001", true).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m7040(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2933, i10, cArr, 0, i11);
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
}
