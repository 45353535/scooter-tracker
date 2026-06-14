package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class DoubleMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f30974a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f30975b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30976a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f30976a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30976a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30976a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30976a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30976a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30976a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30976a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30976a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static double a(double d10) {
        Preconditions.checkArgument(DoubleUtils.d(d10));
        return d10;
    }

    static double b(double d10, RoundingMode roundingMode) {
        if (!DoubleUtils.d(d10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.f30976a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(isMathematicalInteger(d10));
                return d10;
            case 2:
                return (d10 >= 0.0d || isMathematicalInteger(d10)) ? d10 : ((long) d10) - 1;
            case 3:
                return (d10 <= 0.0d || isMathematicalInteger(d10)) ? d10 : ((long) d10) + 1;
            case 4:
                return d10;
            case 5:
                if (isMathematicalInteger(d10)) {
                    return d10;
                }
                return ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d10);
            case 7:
                double dRint = Math.rint(d10);
                return Math.abs(d10 - dRint) == 0.5d ? d10 + Math.copySign(0.5d, d10) : dRint;
            case 8:
                double dRint2 = Math.rint(d10);
                return Math.abs(d10 - dRint2) == 0.5d ? d10 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static double factorial(int i10) {
        MathPreconditions.e("n", i10);
        if (i10 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d10 = 1.0d;
        for (int i11 = (i10 & (-16)) + 1; i11 <= i10; i11++) {
            d10 *= (double) i11;
        }
        return d10 * f30975b[i10 >> 4];
    }

    public static int fuzzyCompare(double d10, double d11, double d12) {
        if (fuzzyEquals(d10, d11, d12)) {
            return 0;
        }
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d10), Double.isNaN(d11));
    }

    public static boolean fuzzyEquals(double d10, double d11, double d12) {
        MathPreconditions.d("tolerance", d12);
        if (Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d10) {
        if (DoubleUtils.d(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.c(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d10) {
        if (d10 > 0.0d && DoubleUtils.d(d10)) {
            long jC = DoubleUtils.c(d10);
            if ((jC & (jC - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double log2(double d10) {
        return Math.log(d10) / f30974a;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double dA = a(dArr[0]);
        long j10 = 1;
        for (int i10 = 1; i10 < dArr.length; i10++) {
            a(dArr[i10]);
            j10++;
            dA += (dArr[i10] - dA) / j10;
        }
        return dA;
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d10, RoundingMode roundingMode) {
        double dB = b(d10, roundingMode);
        if (((-9.223372036854776E18d) - dB < 1.0d) && (dB < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) dB);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.c(dB)).shiftLeft(Math.getExponent(dB) - 52);
        return dB < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d10, RoundingMode roundingMode) {
        double dB = b(d10, roundingMode);
        MathPreconditions.a((dB > -2.147483649E9d) & (dB < 2.147483648E9d), d10, roundingMode);
        return (int) dB;
    }

    @GwtIncompatible
    public static long roundToLong(double d10, RoundingMode roundingMode) {
        double dB = b(d10, roundingMode);
        MathPreconditions.a(((-9.223372036854776E18d) - dB < 1.0d) & (dB < 9.223372036854776E18d), d10, roundingMode);
        return (long) dB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @com.google.common.annotations.GwtIncompatible
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int log2(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.common.math.DoubleUtils.d(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.common.base.Preconditions.checkArgument(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = com.google.common.math.DoubleUtils.e(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = log2(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = com.google.common.math.DoubleMath.AnonymousClass1.f30976a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = com.google.common.math.DoubleUtils.g(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = isPowerOfTwo(r5)
        L4f:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L52:
            if (r0 >= 0) goto L55
            r1 = r2
        L55:
            boolean r5 = isPowerOfTwo(r5)
            goto L4f
        L5a:
            boolean r5 = isPowerOfTwo(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = isPowerOfTwo(r5)
            com.google.common.math.MathPreconditions.k(r5)
        L68:
            if (r1 == 0) goto L6b
            int r0 = r0 + r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.DoubleMath.log2(double, java.math.RoundingMode):int");
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += (long) i10;
        }
        return j10 / ((double) iArr.length);
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d10 = jArr[0];
        long j10 = 1;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            j10++;
            d10 += (jArr[i10] - d10) / j10;
        }
        return d10;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double dA = a(it.next().doubleValue());
        long j10 = 1;
        while (it.hasNext()) {
            j10++;
            dA += (a(it.next().doubleValue()) - dA) / j10;
        }
        return dA;
    }
}
