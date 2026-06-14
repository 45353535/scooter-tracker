package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgxu {
    public static long zza(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (zzgxt.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(false);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
            default:
                throw new AssertionError();
        }
        return j12 + ((long) i10);
    }

    public static long zzb(long j10, long j11) {
        zzgxv.zza("a", j10);
        zzgxv.zza("b", j11);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
            j12 += j14;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long zzc(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = j10 ^ j11;
        long j13 = (j12 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j14 = j10 * j11;
            if (j10 == 0 || j14 / j10 == j11) {
                return j14;
            }
        }
        return j13;
    }
}
