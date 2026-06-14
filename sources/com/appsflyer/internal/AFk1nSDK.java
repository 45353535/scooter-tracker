package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1nSDK {
    private static byte[] component2 = new byte[256];
    static final byte[] getMonetizationNetwork = new byte[256];
    static final int[] AFAdRevenueData = new int[256];
    static final int[] getRevenue = new int[256];
    static final int[] getCurrencyIso4217Code = new int[256];
    static final int[] getMediationNetwork = new int[256];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i10;
        byte b10 = 1;
        byte b11 = 1;
        do {
            b10 = (byte) (((b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 0 ? 27 : 0) ^ ((b10 << 1) ^ b10));
            byte b12 = (byte) (b11 ^ (b11 << 1));
            byte b13 = (byte) (b12 ^ (b12 << 2));
            byte b14 = (byte) (b13 ^ (b13 << 4));
            b11 = (byte) (b14 ^ ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) != 0 ? (byte) 9 : (byte) 0));
            bArr = component2;
            i10 = b10 & 255;
            int i11 = b11 & 255;
            bArr[i10] = (byte) (((((b11 ^ 99) ^ ((i11 << 1) | (i11 >> 7))) ^ ((i11 << 2) | (i11 >> 6))) ^ ((i11 << 3) | (i11 >> 5))) ^ ((i11 >> 4) | (i11 << 4)));
        } while (i10 != 1);
        bArr[0] = 99;
        for (int i12 = 0; i12 < 256; i12++) {
            int i13 = component2[i12] & 255;
            getMonetizationNetwork[i13] = (byte) i12;
            int i14 = i12 << 1;
            if (i14 >= 256) {
                i14 ^= 283;
            }
            int i15 = i14 << 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            int i16 = i15 << 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            int i17 = i16 ^ i12;
            int i18 = ((i14 ^ (i15 ^ i16)) << 24) | (i17 << 16) | ((i17 ^ i15) << 8) | (i17 ^ i14);
            AFAdRevenueData[i13] = i18;
            getRevenue[i13] = (i18 >>> 8) | (i18 << 24);
            getCurrencyIso4217Code[i13] = (i18 >>> 16) | (i18 << 16);
            getMediationNetwork[i13] = (i18 << 8) | (i18 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i19 = 1;
        for (int i20 = 1; i20 < 10; i20++) {
            i19 <<= 1;
            if (i19 >= 256) {
                i19 ^= 283;
            }
            areAllFieldsValid[i20] = i19 << 24;
        }
    }

    public static byte[][] getMediationNetwork(int i10) {
        byte[][] bArr = new byte[4][];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 >>> (i11 << 3);
            bArr[i11] = new byte[]{(byte) (i12 & 3), (byte) ((i12 >> 2) & 3), (byte) ((i12 >> 4) & 3), (byte) ((i12 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] getMonetizationNetwork(byte[] bArr, int i10) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i11 = 4;
        int i12 = (i10 + 1) * 4;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i13 + 3;
            int i16 = ((bArr[i13 + 1] & 255) << 16) | (bArr[i13] << Ascii.CAN) | ((bArr[i13 + 2] & 255) << 8);
            i13 += 4;
            iArr[i14] = i16 | (bArr[i15] & 255);
        }
        int i17 = 4;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i12) {
            int i20 = iArr[i17 - 1];
            if (i18 == 0) {
                byte[] bArr2 = component2;
                i20 = ((bArr2[i20 >>> 24] & 255) | (((bArr2[(i20 >>> 16) & 255] << Ascii.CAN) | ((bArr2[(i20 >>> 8) & 255] & 255) << 16)) | ((bArr2[i20 & 255] & 255) << 8))) ^ areAllFieldsValid[i19];
                i18 = 4;
                i19++;
            }
            iArr[i17] = i20 ^ iArr[i17 - 4];
            i17++;
            i18--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i12];
        int i21 = i10 * 4;
        iArr2[0] = iArr[i21];
        int i22 = 1;
        iArr2[1] = iArr[i21 + 1];
        iArr2[2] = iArr[i21 + 2];
        char c10 = 3;
        iArr2[3] = iArr[i21 + 3];
        int i23 = i21 - 4;
        while (i22 < i10) {
            int i24 = iArr[i23];
            int[] iArr3 = AFAdRevenueData;
            byte[] bArr3 = component2;
            int i25 = iArr3[bArr3[i24 >>> 24] & 255];
            int[] iArr4 = getRevenue;
            int i26 = i25 ^ iArr4[bArr3[(i24 >>> 16) & 255] & 255];
            int[] iArr5 = getCurrencyIso4217Code;
            int i27 = i26 ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255];
            int[] iArr6 = getMediationNetwork;
            iArr2[i11] = iArr6[bArr3[i24 & 255] & 255] ^ i27;
            int i28 = iArr[i23 + 1];
            char c11 = c10;
            int[] iArr7 = iArr2;
            iArr7[i11 + 1] = ((iArr4[bArr3[(i28 >>> 16) & 255] & 255] ^ iArr3[bArr3[i28 >>> 24] & 255]) ^ iArr5[bArr3[(i28 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i28 & 255] & 255];
            int i29 = iArr[i23 + 2];
            int i30 = i11 + 3;
            iArr7[i11 + 2] = iArr6[bArr3[i29 & 255] & 255] ^ ((iArr3[bArr3[i29 >>> 24] & 255] ^ iArr4[bArr3[(i29 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i29 >>> 8) & 255] & 255]);
            int i31 = iArr[i23 + 3];
            i11 += 4;
            iArr7[i30] = iArr6[bArr3[i31 & 255] & 255] ^ ((iArr3[bArr3[i31 >>> 24] & 255] ^ iArr4[bArr3[(i31 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i31 >>> 8) & 255] & 255]);
            i23 -= 4;
            i22++;
            c10 = c11;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i11] = iArr[i23];
        iArr8[i11 + 1] = iArr[i23 + 1];
        iArr8[i11 + 2] = iArr[i23 + 2];
        iArr8[i11 + 3] = iArr[i23 + 3];
        return iArr8;
    }
}
