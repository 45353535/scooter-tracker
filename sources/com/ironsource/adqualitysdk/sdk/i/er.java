package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class er extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2014 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2015 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2016 = {1166932487, -1624570980, 2028167702, -1820015429, -1802417976, -336997493, 1970603045, 777258662, -700893105, -359482004, 1859768531, 287352306, 50227391, -431504020, -2143571499, -201287529, 559890538, 157760912};

    public er(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6443() {
        int i10 = f2014 + 73;
        f2015 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m6460(new int[]{-1000377692, -802653641}, 4 % TextUtils.lastIndexOf("", (char) 23, 1)) : m6460(new int[]{-1000377692, -802653641}, TextUtils.lastIndexOf("", '0', 0) + 3)).intern();
        int i11 = f2014 + 77;
        f2015 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    final boolean mo6452(int i10) {
        int i11 = f2014;
        f2015 = (i11 + 41) % 128;
        if (i10 != 0) {
            return false;
        }
        f2015 = (i11 + 77) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6454(String str, String str2) {
        f2015 = (f2014 + 23) % 128;
        boolean zEquals = str.equals(str2);
        f2015 = (f2014 + 23) % 128;
        return zEquals;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6460(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2016.clone();
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

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    final boolean mo6453(Object obj, Object obj2) {
        int i10 = f2015;
        int i11 = i10 + 111;
        f2014 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (obj == obj2) {
            return true;
        }
        int i12 = i10 + 43;
        f2014 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
