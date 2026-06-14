package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class BigIntegerMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final BigInteger f30969a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f30970b = Math.log(10.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f30971c = Math.log(2.0d);

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30972a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f30972a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30972a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30972a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30972a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30972a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30972a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30972a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30972a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @GwtIncompatible
    private static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final BigIntegerToDoubleRounder f30973a = new BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigInteger bigInteger) {
            return DoubleUtils.a(bigInteger);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.math.ToDoubleRounder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigInteger e(double d10, RoundingMode roundingMode) {
            return DoubleMath.roundToBigInteger(d10, roundingMode);
        }
    }

    static boolean a(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    static BigInteger b(List list) {
        return c(list, 0, list.size());
    }

    public static BigInteger binomial(int i10, int i11) {
        int i12;
        MathPreconditions.e("n", i10);
        MathPreconditions.e(CampaignEx.JSON_KEY_AD_K, i11);
        int i13 = 1;
        Preconditions.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        int[] iArr = LongMath.f30995e;
        if (i11 < iArr.length && i10 <= iArr[i11]) {
            return BigInteger.valueOf(LongMath.binomial(i10, i11));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j10 = i10;
        int iLog2 = LongMath.log2(j10, RoundingMode.CEILING);
        long j11 = 1;
        while (true) {
            int i14 = iLog2;
            while (i13 < i11) {
                i12 = i10 - i13;
                i13++;
                i14 += iLog2;
                if (i14 >= 63) {
                    break;
                }
                j10 *= (long) i12;
                j11 *= (long) i13;
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j10)).divide(BigInteger.valueOf(j11));
            j10 = i12;
            j11 = i13;
        }
    }

    static BigInteger c(List list, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 == 0) {
            return BigInteger.ONE;
        }
        if (i12 == 1) {
            return (BigInteger) list.get(i10);
        }
        if (i12 == 2) {
            return ((BigInteger) list.get(i10)).multiply((BigInteger) list.get(i10 + 1));
        }
        if (i12 == 3) {
            return ((BigInteger) list.get(i10)).multiply((BigInteger) list.get(i10 + 1)).multiply((BigInteger) list.get(i10 + 2));
        }
        int i13 = (i11 + i10) >>> 1;
        return c(list, i10, i13).multiply(c(list, i13, i11));
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    private static BigInteger d(BigInteger bigInteger) {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    private static BigInteger e(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(bigInteger, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = d(bigInteger);
        } else {
            int i10 = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = d(bigInteger.shiftRight(i10)).shiftLeft(i10 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(bigInteger.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }

    public static BigInteger factorial(int i10) {
        MathPreconditions.e("n", i10);
        long[] jArr = LongMath.f30994d;
        if (i10 < jArr.length) {
            return BigInteger.valueOf(jArr[i10]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(i10, roundingMode) * i10, 64, roundingMode));
        int length = jArr.length;
        long j10 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i11 = 1;
        int iLog2 = LongMath.log2(j11, roundingMode2) + 1;
        long j12 = length;
        int iLog22 = LongMath.log2(j12, roundingMode2);
        int i12 = iLog22 + 1;
        int i13 = 1 << iLog22;
        while (j12 <= i10) {
            int i14 = i11;
            long j13 = j12;
            if ((((long) i13) & j13) != 0) {
                i13 <<= 1;
                i12++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j13);
            long j14 = j13 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i12 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j11));
                j11 = 1;
            }
            j11 *= j14;
            iLog2 = LongMath.log2(j11, RoundingMode.FLOOR) + i14;
            j12 = j13 + 1;
            i11 = i14;
        }
        if (j11 > 1) {
            arrayList.add(BigInteger.valueOf(j11));
        }
        return b(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i10;
        int iCompareTo;
        MathPreconditions.j("x", bigInteger);
        if (a(bigInteger)) {
            return LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int iLog2 = (int) ((((double) log2(bigInteger, RoundingMode.FLOOR)) * f30971c) / f30970b);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger2.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerPow);
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (true) {
                int i11 = iCompareTo3;
                i10 = iCompareTo2;
                iCompareTo2 = i11;
                if (iCompareTo2 > 0) {
                    break;
                }
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                iCompareTo3 = bigIntegerMultiply2.compareTo(bigInteger);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
            }
            iCompareTo = i10;
        }
        switch (AnonymousClass1.f30972a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(iCompareTo == 0);
                return iLog2;
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int log2(java.math.BigInteger r3, java.math.RoundingMode r4) {
        /*
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r3)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.lang.String r1 = "x"
            com.google.common.math.MathPreconditions.j(r1, r0)
            int r0 = r3.bitLength()
            int r1 = r0 + (-1)
            int[] r2 = com.google.common.math.BigIntegerMath.AnonymousClass1.f30972a
            int r4 = r4.ordinal()
            r4 = r2[r4]
            switch(r4) {
                case 1: goto L52;
                case 2: goto L51;
                case 3: goto L51;
                case 4: goto L49;
                case 5: goto L49;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }
        L1c:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L22:
            r4 = 256(0x100, float:3.59E-43)
            if (r1 >= r4) goto L36
            java.math.BigInteger r4 = com.google.common.math.BigIntegerMath.f30969a
            int r2 = 256 - r1
            java.math.BigInteger r4 = r4.shiftRight(r2)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L35
            goto L51
        L35:
            return r0
        L36:
            r4 = 2
            java.math.BigInteger r3 = r3.pow(r4)
            int r3 = r3.bitLength()
            int r3 = r3 + (-1)
            int r4 = r1 * 2
            int r4 = r4 + 1
            if (r3 >= r4) goto L48
            goto L51
        L48:
            return r0
        L49:
            boolean r3 = isPowerOfTwo(r3)
            if (r3 == 0) goto L50
            goto L51
        L50:
            return r0
        L51:
            return r1
        L52:
            boolean r3 = isPowerOfTwo(r3)
            com.google.common.math.MathPreconditions.k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.BigIntegerMath.log2(java.math.BigInteger, java.math.RoundingMode):int");
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return BigIntegerToDoubleRounder.f30973a.b(bigInteger, roundingMode);
    }

    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.g("x", bigInteger);
        if (a(bigInteger)) {
            return BigInteger.valueOf(LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigIntegerE = e(bigInteger);
        switch (AnonymousClass1.f30972a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(bigIntegerE.pow(2).equals(bigInteger));
                return bigIntegerE;
            case 2:
            case 3:
                return bigIntegerE;
            case 4:
            case 5:
                int iIntValue = bigIntegerE.intValue();
                return (iIntValue * iIntValue == bigInteger.intValue() && bigIntegerE.pow(2).equals(bigInteger)) ? bigIntegerE : bigIntegerE.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerE.pow(2).add(bigIntegerE).compareTo(bigInteger) >= 0 ? bigIntegerE : bigIntegerE.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }
}
