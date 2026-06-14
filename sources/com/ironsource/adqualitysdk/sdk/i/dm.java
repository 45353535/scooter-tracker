package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes10.dex */
public final class dm {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1799 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1800 = {2079880854, -917310781, -1740524842, -1533885123, -66225104, -1155740387, -1509317618, 489272800, -425835252, -547440015, 847524947, -191329785, -1539798976, -564369660, -2055889111, 1785479563, 198575438, -433954121};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1801;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1802;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1803;

    private dm(String str, int i10) {
        this.f1802 = str;
        this.f1803 = i10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static dm m6298(String str, int i10) {
        f1799 = (f1801 + 99) % 128;
        if (s.m7239().m7267()) {
            return new dm(str, i10);
        }
        f1799 = (f1801 + 43) % 128;
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1802);
        sb2.append(m6299(new int[]{-555983378, 170641764}, -((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb2.append(this.f1803);
        String string = sb2.toString();
        int i10 = f1801 + 33;
        f1799 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m6300() {
        int i10 = f1801 + 113;
        f1799 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1803;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6299(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1800.clone();
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
}
