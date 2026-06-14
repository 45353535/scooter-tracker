package com.google.common.math;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class IntMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f30977a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f30978b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f30979c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f30980d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int[] f30981e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30982a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f30982a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30982a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30982a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30982a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30982a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30982a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30982a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30982a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static int a(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    private static int b(int i10) {
        byte b10 = f30977a[Integer.numberOfLeadingZeros(i10)];
        return b10 - a(i10, f30978b[b10]);
    }

    public static int binomial(int i10, int i11) {
        MathPreconditions.e("n", i10);
        MathPreconditions.e(CampaignEx.JSON_KEY_AD_K, i11);
        int i12 = 0;
        Preconditions.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        int[] iArr = f30981e;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Integer.MAX_VALUE;
        }
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return i10;
        }
        long j10 = 1;
        while (i12 < i11) {
            long j11 = j10 * ((long) (i10 - i12));
            i12++;
            j10 = j11 / ((long) i12);
        }
        return (int) j10;
    }

    private static int c(int i10) {
        return (int) Math.sqrt(i10);
    }

    public static int ceilingPowerOfTwo(int i10) {
        MathPreconditions.h("x", i10);
        if (i10 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i10 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + i10 + ") not representable as an int");
    }

    public static int checkedAdd(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        MathPreconditions.b(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    public static int checkedMultiply(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        int i12 = (int) j10;
        MathPreconditions.b(j10 == ((long) i12), "checkedMultiply", i10, i11);
        return i12;
    }

    public static int checkedPow(int i10, int i11) {
        MathPreconditions.e("exponent", i11);
        if (i10 == -2) {
            MathPreconditions.b(i11 < 32, "checkedPow", i10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            MathPreconditions.b(i11 < 31, "checkedPow", i10, i11);
            return 1 << i11;
        }
        int iCheckedMultiply = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return checkedMultiply(iCheckedMultiply, i10);
            }
            if ((i11 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i10);
            }
            i11 >>= 1;
            if (i11 > 0) {
                MathPreconditions.b((-46340 <= i10) & (i10 <= 46340), "checkedPow", i10, i11);
                i10 *= i10;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int i10, int i11) {
        long j10 = ((long) i10) - ((long) i11);
        int i12 = (int) j10;
        MathPreconditions.b(j10 == ((long) i12), "checkedSubtract", i10, i11);
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i10, int i11, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (AnonymousClass1.f30982a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(i13 == 0);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                return i12 + i14;
            case 4:
                return i12 + i14;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                return i12 + i14;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i12 & 1) != 0))) {
                            return i12;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i12;
                }
                return i12 + i14;
            default:
                throw new AssertionError();
        }
    }

    public static int factorial(int i10) {
        MathPreconditions.e("n", i10);
        int[] iArr = f30980d;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i10) {
        MathPreconditions.h("x", i10);
        return Integer.highestOneBit(i10);
    }

    public static int gcd(int i10, int i11) {
        MathPreconditions.e("a", i10);
        MathPreconditions.e("b", i11);
        if (i10 == 0) {
            return i11;
        }
        if (i11 == 0) {
            return i10;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
        int iNumberOfTrailingZeros2 = i10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i11);
        int i12 = i11 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i12) {
            int i13 = iNumberOfTrailingZeros2 - i12;
            int i14 = (i13 >> 31) & i13;
            int i15 = (i13 - i14) - i14;
            i12 += i14;
            iNumberOfTrailingZeros2 = i15 >> Integer.numberOfTrailingZeros(i15);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(int i10) {
        return LongMath.isPrime(i10);
    }

    @GwtIncompatible
    public static int log10(int i10, RoundingMode roundingMode) {
        int iA;
        MathPreconditions.h("x", i10);
        int iB = b(i10);
        int i11 = f30978b[iB];
        switch (AnonymousClass1.f30982a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(i10 == i11);
                return iB;
            case 2:
            case 3:
                return iB;
            case 4:
            case 5:
                iA = a(i11, i10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a(f30979c[iB], i10);
                break;
            default:
                throw new AssertionError();
        }
        return iB + iA;
    }

    public static int log2(int i10, RoundingMode roundingMode) {
        MathPreconditions.h("x", i10);
        switch (AnonymousClass1.f30982a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(isPowerOfTwo(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + a((-1257966797) >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int mean(int i10, int i11) {
        return (i10 & i11) + ((i10 ^ i11) >> 1);
    }

    public static int mod(int i10, int i11) {
        if (i11 > 0) {
            int i12 = i10 % i11;
            return i12 >= 0 ? i12 : i12 + i11;
        }
        throw new ArithmeticException("Modulus " + i11 + " must be > 0");
    }

    @GwtIncompatible
    public static int pow(int i10, int i11) {
        MathPreconditions.e("exponent", i11);
        if (i10 == -2) {
            if (i11 < 32) {
                return (i11 & 1) == 0 ? 1 << i11 : -(1 << i11);
            }
            return 0;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            if (i11 < 32) {
                return 1 << i11;
            }
            return 0;
        }
        int i12 = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return i10 * i12;
            }
            i12 *= (i11 & 1) == 0 ? 1 : i10;
            i10 *= i10;
            i11 >>= 1;
        }
        return i12;
    }

    public static int saturatedAdd(int i10, int i11) {
        return Ints.saturatedCast(((long) i10) + ((long) i11));
    }

    public static int saturatedMultiply(int i10, int i11) {
        return Ints.saturatedCast(((long) i10) * ((long) i11));
    }

    public static int saturatedPow(int i10, int i11) {
        MathPreconditions.e("exponent", i11);
        if (i10 == -2) {
            return i11 >= 32 ? (i11 & 1) + Integer.MAX_VALUE : (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i10 == -1) {
            return (i11 & 1) == 0 ? 1 : -1;
        }
        if (i10 == 0) {
            return i11 == 0 ? 1 : 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            if (i11 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i11;
        }
        int i12 = ((i10 >>> 31) & i11 & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (i11 != 0) {
            if (i11 == 1) {
                return saturatedMultiply(iSaturatedMultiply, i10);
            }
            if ((i11 & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i10);
            }
            i11 >>= 1;
            if (i11 > 0) {
                if ((-46340 > i10) || (i10 > 46340)) {
                    return i12;
                }
                i10 *= i10;
            }
        }
        return iSaturatedMultiply;
    }

    public static int saturatedSubtract(int i10, int i11) {
        return Ints.saturatedCast(((long) i10) - ((long) i11));
    }

    @GwtIncompatible
    public static int sqrt(int i10, RoundingMode roundingMode) {
        int iA;
        MathPreconditions.e("x", i10);
        int iC = c(i10);
        switch (AnonymousClass1.f30982a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(iC * iC == i10);
                return iC;
            case 2:
            case 3:
                return iC;
            case 4:
            case 5:
                iA = a(iC * iC, i10);
                break;
            case 6:
            case 7:
            case 8:
                iA = a((iC * iC) + iC, i10);
                break;
            default:
                throw new AssertionError();
        }
        return iC + iA;
    }
}
