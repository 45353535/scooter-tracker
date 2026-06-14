package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes10.dex */
public enum hl {
    f2369(-1),
    f2368(0),
    f2371(1),
    f2370(2),
    f2372(3),
    f2367(4),
    f2364(5),
    f2366(6),
    f2365(7);


    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f2360 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int[] f2362;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2363;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final int f2373;

    static {
        m6549();
        f2363 = (f2360 + 125) % 128;
    }

    hl(int i10) {
        this.f2373 = i10;
    }

    public static hl valueOf(String str) {
        int i10 = f2363 + 111;
        f2360 = i10 % 128;
        int i11 = i10 % 2;
        hl hlVar = (hl) Enum.valueOf(hl.class, str);
        if (i11 == 0) {
            int i12 = 48 / 0;
        }
        f2363 = (f2360 + 87) % 128;
        return hlVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hl[] valuesCustom() {
        f2363 = (f2360 + 15) % 128;
        hl[] hlVarArr = (hl[]) values().clone();
        int i10 = f2363 + 41;
        f2360 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 83 / 0;
        }
        return hlVarArr;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    static void m6549() {
        f2362 = new int[]{67978153, 1678506698, 1602214626, -387060140, -1144243397, 891040089, 1050767598, -1522593851, 764895373, 248285869, 1933620196, -394887603, 997376652, 1439982257, -26799701, 1103817601, -1984906157, -1649952337};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6550(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2362.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m6551() {
        int i10 = f2363 + 53;
        int i11 = i10 % 128;
        f2360 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = this.f2373;
        f2363 = (i11 + 59) % 128;
        return i12;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hl m6548(int i10) {
        int i11 = (f2363 + 97) % 128;
        f2360 = i11;
        switch (i10) {
            case -1:
                return f2369;
            case 0:
                return f2368;
            case 1:
                return f2371;
            case 2:
                return f2370;
            case 3:
                hl hlVar = f2372;
                int i12 = i11 + 121;
                f2363 = i12 % 128;
                if (i12 % 2 == 0) {
                    return hlVar;
                }
                throw null;
            case 4:
                return f2367;
            case 5:
                return f2364;
            case 6:
                return f2366;
            case 7:
                return f2365;
            default:
                return null;
        }
    }
}
