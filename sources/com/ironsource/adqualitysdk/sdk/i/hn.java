package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: loaded from: classes10.dex */
public enum hn {
    f2381(-1),
    f2385(0),
    f2384(1),
    f2382(2),
    f2383(3),
    f2379(4),
    f2377(5),
    f2380(6);


    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2374 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f2375 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int[] f2376;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final int f2386;

    static {
        m6554();
        int i10 = f2375 + 33;
        f2374 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    hn(int i10) {
        this.f2386 = i10;
    }

    public static hn valueOf(String str) {
        int i10 = f2374 + 27;
        f2375 = i10 % 128;
        if (i10 % 2 == 0) {
            Enum.valueOf(hn.class, str);
            throw null;
        }
        hn hnVar = (hn) Enum.valueOf(hn.class, str);
        int i11 = f2374 + 19;
        f2375 = i11 % 128;
        if (i11 % 2 != 0) {
            return hnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static hn[] valuesCustom() {
        f2374 = (f2375 + 19) % 128;
        hn[] hnVarArr = (hn[]) values().clone();
        int i10 = f2374 + 75;
        f2375 = i10 % 128;
        if (i10 % 2 != 0) {
            return hnVarArr;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    static void m6554() {
        f2376 = new int[]{-598830901, 1989314260, -1901562280, 467925058, -723660769, 296365004, -2092547361, -1483207319, 532367964, -1998172150, -134091479, -1794188114, -2132346635, 1022009424, -1087064520, -177743133, -2045544004, -2038714072};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static hn m6555(int i10) {
        switch (i10) {
            case -1:
                return f2381;
            case 0:
                return f2385;
            case 1:
                return f2384;
            case 2:
                return f2382;
            case 3:
                hn hnVar = f2383;
                f2375 = (f2374 + 91) % 128;
                return hnVar;
            case 4:
                hn hnVar2 = f2379;
                int i11 = f2374 + 37;
                f2375 = i11 % 128;
                if (i11 % 2 != 0) {
                    return hnVar2;
                }
                throw null;
            case 5:
                return f2377;
            case 6:
                return f2380;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m6556() {
        int i10 = f2374 + 97;
        f2375 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2386;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6553(int[] iArr, int i10) {
        String str;
        synchronized (e.f1936) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2376.clone();
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
