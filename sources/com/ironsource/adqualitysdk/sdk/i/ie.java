package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class ie {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2478 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2479;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2480;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2481;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2482;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2483;

    static {
        m6753();
        f2481 = (f2478 + 1) % 128;
        f2480 = true;
        f2483 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2482 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -9, -9, -9, -9, -9, -9, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private ie() {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m6751(byte[] r5, int r6, int r7, byte[] r8, int r9, byte[] r10) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ie.f2481
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2478 = r1
            r2 = 2
            int r0 = r0 % r2
            r3 = 0
            if (r0 != 0) goto L13
            r0 = 75
            int r0 = r0 / r3
            if (r7 <= 0) goto L1c
            goto L15
        L13:
            if (r7 <= 0) goto L1c
        L15:
            r0 = r5[r6]
            int r0 = r0 << 24
            int r0 = r0 >>> 8
            goto L1d
        L1c:
            r0 = r3
        L1d:
            r4 = 1
            if (r7 <= r4) goto L2f
            int r1 = r1 + 23
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2481 = r1
            int r1 = r6 + 1
            r1 = r5[r1]
            int r1 = r1 << 24
            int r1 = r1 >>> 16
            goto L30
        L2f:
            r1 = r3
        L30:
            r0 = r0 | r1
            if (r7 <= r2) goto L42
            int r1 = com.ironsource.adqualitysdk.sdk.i.ie.f2481
            int r1 = r1 + 51
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2478 = r1
            int r6 = r6 + r2
            r5 = r5[r6]
            int r5 = r5 << 24
            int r3 = r5 >>> 24
        L42:
            r5 = r0 | r3
            r6 = 61
            r0 = 3
            if (r7 == r4) goto L8e
            if (r7 == r2) goto L70
            if (r7 == r0) goto L4e
            return r8
        L4e:
            int r6 = r5 >>> 18
            r6 = r10[r6]
            r8[r9] = r6
            int r6 = r9 + 1
            int r7 = r5 >>> 12
            r7 = r7 & 63
            r7 = r10[r7]
            r8[r6] = r7
            int r6 = r9 + 2
            int r7 = r5 >>> 6
            r7 = r7 & 63
            r7 = r10[r7]
            r8[r6] = r7
            int r9 = r9 + r0
            r5 = r5 & 63
            r5 = r10[r5]
            r8[r9] = r5
            return r8
        L70:
            int r7 = r5 >>> 18
            r7 = r10[r7]
            r8[r9] = r7
            int r7 = r9 + 1
            int r1 = r5 >>> 12
            r1 = r1 & 63
            r1 = r10[r1]
            r8[r7] = r1
            int r7 = r9 + 2
            int r5 = r5 >>> 6
            r5 = r5 & 63
            r5 = r10[r5]
            r8[r7] = r5
            int r9 = r9 + r0
            r8[r9] = r6
            return r8
        L8e:
            int r7 = r5 >>> 18
            r7 = r10[r7]
            r8[r9] = r7
            int r7 = r9 + 1
            int r5 = r5 >>> 12
            r5 = r5 & 63
            r5 = r10[r5]
            r8[r7] = r5
            int r5 = r9 + 2
            r8[r5] = r6
            int r9 = r9 + r0
            r8[r9] = r6
            int r5 = com.ironsource.adqualitysdk.sdk.i.ie.f2481
            int r5 = r5 + 107
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2478 = r5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6751(byte[], int, int, byte[], int, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m6752(byte[] bArr, int i10) throws ic {
        f2481 = (f2478 + 21) % 128;
        byte[] bArrM6750 = m6750(bArr, 0, i10, f2482);
        f2481 = (f2478 + 101) % 128;
        return bArrM6750;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    static void m6753() {
        f2479 = new char[]{16, 'J', 'l', 'l', 'l', 'f', 'j', 'G', 'B', 'l', 'v', 'm', 'A', 'J', 'j', '@', '#', '2', '2', '#', 'B', 'l', 'v', 'm', 'A', 'C', 'j', 'k', 'f', 'd', 'b', 'h', 'H', 'B', 'f', 'j', 'f', 'k', 'r', 'k', '2', 'B', '#', '2', '2', '#', 'C', 'c', 'f', 'o', 'l', 'h', 'r', 'L', 'I', 'n', 'h', 'j', 'g', 'f', 'o', 'I', 'B', 'i', 'i', 'B', 'G', 'j', 'C', 'B', 'i', 'h', 'i', 'i', 'd', 'd', 'B', 'K', 'k', 'f', 'p', 'm', 'B', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J', 'H', 'h', 'b', 'd', 'f', 'k', 'j', 'C', 'A', 'm', 'v', 144, 288, 288, 254, 263, 295, 290, 300, 297, 254, 256, 288, 294, 261, 256, 295, 302, 295, 290, 294, 290, 254, 262, 303, 293, 289, 294, 294, 295, 294, 255, 253, 297, 306, 296, 289, 293, 292, 293, 'N', 146, 172, 211, 215, 218, 220, 178, 169, 205, 204, 209, 209, 202, 211, 212, 211, 177, 168, 210, 178, 153, 185, 202, 170, 153, 185, 210, 212, 181, 26, 'A', 20, 'J', 'f', 'g', 'k', 'f', 'd', 'd', 'F', '9', 'n', 'k', 'j', 'i', 'h', 'B', 'J', 's', 'i', 'e', 'j', 'j', 'k', 'j', 'C', 'A', 'e', 'd', 'i', 'i', 'b', 'k', 'l', 'k', 'I', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J'};
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m6755(byte[] r12, int r13, int r14, byte[] r15) {
        /*
            int r13 = r14 + 2
            int r13 = r13 / 3
            int r13 = r13 << 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r13 / r0
            int r13 = r13 + r1
            byte[] r4 = new byte[r13]
            int r1 = r14 + (-2)
            r2 = 0
            r3 = r2
            r5 = r3
            r7 = r5
        L14:
            r8 = 10
            if (r2 >= r1) goto L69
            r6 = r12[r2]
            int r6 = r6 << 24
            int r6 = r6 >>> 8
            int r9 = r2 + 1
            r9 = r12[r9]
            int r9 = r9 << 24
            int r9 = r9 >>> 16
            r6 = r6 | r9
            int r9 = r2 + 2
            r9 = r12[r9]
            int r9 = r9 << 24
            int r9 = r9 >>> 24
            r6 = r6 | r9
            int r9 = r6 >>> 18
            r9 = r15[r9]
            r4[r5] = r9
            int r9 = r5 + 1
            int r10 = r6 >>> 12
            r10 = r10 & 63
            r10 = r15[r10]
            r4[r9] = r10
            int r10 = r5 + 2
            int r11 = r6 >>> 6
            r11 = r11 & 63
            r11 = r15[r11]
            r4[r10] = r11
            int r10 = r5 + 3
            r6 = r6 & 63
            r6 = r15[r6]
            r4[r10] = r6
            int r7 = r7 + 4
            if (r7 != r0) goto L64
            int r5 = r5 + 4
            r4[r5] = r8
            int r5 = com.ironsource.adqualitysdk.sdk.i.ie.f2481
            int r5 = r5 + 1
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2478 = r5
            r7 = r3
            r5 = r9
        L64:
            int r2 = r2 + 3
            int r5 = r5 + 4
            goto L14
        L69:
            if (r2 >= r14) goto L96
            int r1 = com.ironsource.adqualitysdk.sdk.i.ie.f2478
            int r1 = r1 + 113
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2481 = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L83
            int r3 = r14 * r2
            r1 = r12
            r6 = r15
            m6751(r1, r2, r3, r4, r5, r6)
            int r7 = r7 + 8
            if (r7 != r0) goto L94
            goto L8e
        L83:
            r1 = r12
            r6 = r15
            int r3 = r14 - r2
            m6751(r1, r2, r3, r4, r5, r6)
            int r7 = r7 + 4
            if (r7 != r0) goto L94
        L8e:
            int r12 = r5 + 4
            r4[r12] = r8
            int r5 = r5 + 1
        L94:
            int r5 = r5 + 4
        L96:
            boolean r12 = com.ironsource.adqualitysdk.sdk.i.ie.f2480
            if (r12 != 0) goto La3
            if (r5 != r13) goto L9d
            return r4
        L9d:
            java.lang.AssertionError r12 = new java.lang.AssertionError
            r12.<init>()
            throw r12
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6755(byte[], int, int, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6756(byte[] bArr) {
        int i10 = f2481 + 119;
        f2478 = i10 % 128;
        if (i10 % 2 == 0) {
            m6757(bArr, bArr.length, f2483);
            throw null;
        }
        String strM6757 = m6757(bArr, bArr.length, f2483);
        f2478 = (f2481 + 117) % 128;
        return strM6757;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6757(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM6755 = m6755(bArr, 0, i10, bArr2);
        String str = new String(bArrM6755, 0, bArrM6755.length);
        f2478 = (f2481 + 81) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m6759(String str) throws ic {
        byte[] bArrM6752;
        int i10 = f2478 + 91;
        f2481 = i10 % 128;
        if (i10 % 2 != 0) {
            byte[] bytes = str.getBytes();
            bArrM6752 = m6752(bytes, bytes.length);
            int i11 = 47 / 0;
        } else {
            byte[] bytes2 = str.getBytes();
            bArrM6752 = m6752(bytes2, bytes2.length);
        }
        int i12 = f2481 + 17;
        f2478 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 54 / 0;
        }
        return bArrM6752;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6758(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2479, i10, cArr, 0, i11);
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
    private static int m6754(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        int i11 = (f2481 + 31) % 128;
        f2478 = i11;
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 == 61) {
            int i12 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b10] << Ascii.CAN) >>> 18);
            bArr2[i10] = (byte) (i12 >>> 16);
            bArr2[i10 + 1] = (byte) (i12 >>> 8);
            int i13 = i11 + 63;
            f2481 = i13 % 128;
            if (i13 % 2 == 0) {
                return 2;
            }
            throw null;
        }
        int i14 = ((bArr3[bArr[1]] << Ascii.CAN) >>> 12) | ((bArr3[bArr[0]] << Ascii.CAN) >>> 6) | ((bArr3[b10] << Ascii.CAN) >>> 18) | ((bArr3[b11] << Ascii.CAN) >>> 24);
        bArr2[i10] = (byte) (i14 >> 16);
        bArr2[i10 + 1] = (byte) (i14 >> 8);
        bArr2[i10 + 2] = (byte) i14;
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m6750(byte[] r17, int r18, int r19, byte[] r20) throws com.ironsource.adqualitysdk.sdk.i.ic {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6750(byte[], int, int, byte[]):byte[]");
    }
}
