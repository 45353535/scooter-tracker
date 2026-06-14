package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhhk {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzc = zzc(bArr, 0, 0);
        long jZzc2 = zzc(bArr, 3, 2) & 67108611;
        long jZzc3 = zzc(bArr, 6, 4) & 67092735;
        long jZzc4 = zzc(bArr, 9, 6) & 66076671;
        long jZzc5 = zzc(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = j14 + ((j19 >> 26) * 5);
                long j22 = j21 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j11 & 67108863) + (j21 >> 26);
                long j25 = j24 + (j23 >> 26);
                long j26 = (j25 >> 26) + j16;
                long j27 = j18 + (j26 >> 26);
                long j28 = (j20 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j16 & j29) | (j26 & 67108863 & j30);
                long j33 = (j18 & j29) | (j27 & 67108863 & j30);
                long j34 = (j20 & j29) | (j28 & j30);
                long jZzb = (((j29 & j22) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + zzb(bArr, 16);
                long jZzb2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + zzb(bArr, 20);
                long jZzb3 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + zzb(bArr, 24);
                long jZzb4 = (((j33 >> 18) | (j34 << 8)) & 4294967295L) + zzb(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzb & 4294967295L, 0);
                long j35 = jZzb2 + (jZzb >> 32);
                zzd(bArr4, j35 & 4294967295L, 4);
                long j36 = jZzb3 + (j35 >> 32);
                zzd(bArr4, j36 & 4294967295L, 8);
                zzd(bArr4, (jZzb4 + (j36 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j37 = jZzc5 * 5;
            long j38 = jZzc4 * 5;
            long j39 = jZzc3 * 5;
            long jZzc6 = j14 + zzc(bArr3, 0, 0);
            long jZzc7 = j11 + zzc(bArr3, 3, 2);
            long jZzc8 = j10 + zzc(bArr3, 6, 4);
            long jZzc9 = j12 + zzc(bArr3, 9, 6);
            long jZzc10 = j13 + (zzc(bArr3, 12, 8) | ((long) (bArr3[16] << Ascii.CAN)));
            long j40 = jZzc7 * jZzc;
            long j41 = jZzc7 * jZzc2;
            long j42 = jZzc7 * jZzc3;
            long j43 = jZzc9 * jZzc;
            long j44 = jZzc7 * jZzc4;
            long j45 = jZzc10 * jZzc;
            long j46 = (jZzc6 * jZzc) + (jZzc7 * j37) + (jZzc8 * j38) + (jZzc9 * j39) + (jZzc2 * 5 * jZzc10);
            long j47 = (jZzc6 * jZzc2) + j40 + (jZzc8 * j37) + (jZzc9 * j38) + (j39 * jZzc10) + (j46 >> 26);
            long j48 = (jZzc6 * jZzc3) + j41 + (jZzc8 * jZzc) + (jZzc9 * j37) + (j38 * jZzc10) + (j47 >> 26);
            long j49 = (jZzc6 * jZzc4) + j42 + (jZzc8 * jZzc2) + j43 + (jZzc10 * j37) + (j48 >> 26);
            long j50 = (jZzc6 * jZzc5) + j44 + (jZzc8 * jZzc3) + (jZzc9 * jZzc2) + j45 + (j49 >> 26);
            long j51 = (j46 & 67108863) + ((j50 >> 26) * 5);
            j11 = (j47 & 67108863) + (j51 >> 26);
            i11 += 16;
            j10 = j48 & 67108863;
            j12 = j49 & 67108863;
            j13 = j50 & 67108863;
            i10 = 17;
            j14 = j51 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16))) & 4294967295L;
    }

    private static long zzc(byte[] bArr, int i10, int i11) {
        return (zzb(bArr, i10) >> i11) & 67108863;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }
}
