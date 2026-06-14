package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DoubleUtils {
    static double a(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i10 = iBitLength - 1;
        if (i10 < 63) {
            return bigInteger.longValue();
        }
        if (i10 > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i11 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i11).longValue();
        long j10 = jLongValue >> 1;
        long j11 = 4503599627370495L & j10;
        if ((jLongValue & 1) != 0 && ((j10 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i11)) {
            j11++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j11) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    static double b(double d10) {
        Preconditions.checkArgument(!Double.isNaN(d10));
        return Math.max(d10, 0.0d);
    }

    static long c(double d10) {
        Preconditions.checkArgument(d(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean d(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean e(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double f(double d10) {
        return -Math.nextUp(-d10);
    }

    static double g(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
