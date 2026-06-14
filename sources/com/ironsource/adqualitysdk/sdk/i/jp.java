package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class jp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2881 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2882 = {'$', '^', '^', '`', 'n', 'g', '_', IOUtils.DIR_SEPARATOR_WINDOWS, 'c', '^', 'd', 'p', 'q', 'k', 'd', 'g', 'l', 17, IOUtils.DIR_SEPARATOR_UNIX, 'Z', 'p', 'i', 'a', '^', 'e', 'p', 'M', 'I', 's', 'L', 'K', 'p', 'G', 'E', 'l', 'm', 'p', 'm', 'f', 'i', 'n', 'm', 'F', 'K', 'r', 'r', 't', ']', 'Y', 178, 166, 158, 156, 156, 171, 173, 158, 160, 175, 174, 160, 153, 156, 161, 160, 167, 176, 'S', 166, 154, 148, 153, 152, 153, 153, 161, 159, 153, 163, 168, ';', 'w', 'l', 'j', 'r', 'o', 'e', 'l', 'p', 'j', 't', 'y', 'w', 239, 227, 221, 226, 226, 221, 216, 223, 229, 228, 236, 232, 226, 236, 241, 'v', 259, 282, 280, 280, 241, 236, 275, 239, 235, 270, 276, 263, 262, 267, 265, 260, 259, 276, 271, 268, 275, 255, 213};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static dp f2883;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2884;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2885;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f2886;

    public jp(String str, boolean z10) {
        this.f2885 = str;
        this.f2886 = z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m6994(jp jpVar) {
        f2881 = (f2884 + 45) % 128;
        String strM6993 = jpVar.m6993();
        f2884 = (f2881 + 33) % 128;
        return strM6993;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6995(dp dpVar) {
        int i10 = f2881;
        f2883 = dpVar;
        f2884 = (i10 + 77) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6996(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2882, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m6997() {
        String strReplace;
        String strIntern;
        String strM6319;
        String strM6322 = f2883.m6322();
        try {
            String strReplace2 = strM6322.replace(m6996(new int[]{48, 19, 85, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", true).intern(), m6998()).replace(m6996(new int[]{67, 13, 75, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), f2883.m6320());
            if (this.f2886) {
                int i10 = f2884 + 97;
                f2881 = i10 % 128;
                if (i10 % 2 == 0) {
                    strIntern = m6996(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", true).intern();
                    strM6319 = f2883.m6319();
                } else {
                    strIntern = m6996(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern();
                    strM6319 = f2883.m6319();
                }
                strReplace = strReplace2.replace(strIntern, strM6319);
            } else {
                strReplace = strReplace2.replace(m6996(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern(), "");
            }
            strM6322 = strReplace.replace(m6996(new int[]{92, 16, 148, 0}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), this.f2885);
            f2884 = (f2881 + 57) % 128;
        } catch (Throwable th2) {
            String strIntern2 = m6996(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6996(new int[]{108, 24, 168, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m7098(strIntern2, sb2.toString());
        }
        f2884 = (f2881 + 61) % 128;
        return strM6322;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6998() {
        int i10 = f2881 + 45;
        f2884 = i10 % 128;
        if (i10 % 2 == 0) {
            return ar.m4771().mo4785().m4769();
        }
        int i11 = 59 / 0;
        return ar.m4771().mo4785().m4769();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6999(final WebView webView) {
        try {
            t.m7279(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4564() {
                    final String strM6994 = jp.m6994(jp.this);
                    t.m7288(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4564() {
                            ki.m7190(webView, strM6994);
                        }
                    });
                }
            });
            int i10 = f2884 + 95;
            f2881 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            String strIntern = m6996(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6996(new int[]{17, 31, 2, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m7098(strIntern, sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6993() {
        String strM6756;
        int i10 = f2881 + 33;
        f2884 = i10 % 128;
        if (i10 % 2 != 0) {
            strM6756 = ie.m6756(m6997().getBytes());
            int i11 = 39 / 0;
        } else {
            strM6756 = ie.m6756(m6997().getBytes());
        }
        int i12 = f2884 + 49;
        f2881 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM6756;
        }
        throw null;
    }
}
