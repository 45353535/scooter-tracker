package com.google.common.math;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ts.TsExtractor;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f30991a = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, 13, 13, 13, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.VT, Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long[] f30992b = {1, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long[] f30993c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long[] f30994d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f30995e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f30996f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, MBSupportMuteAdType.INTERSTITIAL_VIDEO, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 169, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long[][] f30997g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30998a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f30998a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30998a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30998a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30998a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30998a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30998a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30998a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30998a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            long g(long j10, long j11, long j12) {
                return (j10 * j11) % j12;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long i(long j10, long j11) {
                return (j10 * j10) % j11;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long l(long j10, long j11, long j12) {
                long j13 = j10 + j11;
                return j10 >= j12 - j11 ? j13 - j12 : j13;
            }

            private long m(long j10, long j11) {
                int i10 = 32;
                do {
                    int iMin = Math.min(i10, Long.numberOfLeadingZeros(j10));
                    j10 = UnsignedLongs.remainder(j10 << iMin, j11);
                    i10 -= iMin;
                } while (i10 > 0);
                return j10;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long g(long j10, long j11, long j12) {
                long j13 = j10 >>> 32;
                long j14 = j11 >>> 32;
                long j15 = j10 & 4294967295L;
                long j16 = j11 & 4294967295L;
                long jM = m(j13 * j14, j12) + (j13 * j16);
                if (jM < 0) {
                    jM = UnsignedLongs.remainder(jM, j12);
                }
                Long.signum(j15);
                return l(m(jM + (j14 * j15), j12), UnsignedLongs.remainder(j15 * j16, j12), j12);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long i(long j10, long j11) {
                long j12 = j10 >>> 32;
                long j13 = j10 & 4294967295L;
                long jM = m(j12 * j12, j11);
                long jRemainder = j12 * j13 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j11);
                }
                return l(m(jM + jRemainder, j11), UnsignedLongs.remainder(j13 * j13, j11), j11);
            }
        };

        private long h(long j10, long j11, long j12) {
            long jI = j10;
            long jG = 1;
            while (j11 != 0) {
                long j13 = j12;
                if ((j11 & 1) != 0) {
                    jG = g(jG, jI, j13);
                }
                jI = i(jI, j13);
                j11 >>= 1;
                j12 = j13;
            }
            return jG;
        }

        static boolean j(long j10, long j11) {
            return (j11 <= 3037000499L ? SMALL : LARGE).k(j10, j11);
        }

        private boolean k(long j10, long j11) {
            long j12 = j11 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros;
            long j14 = j10 % j11;
            if (j14 == 0) {
                return true;
            }
            long jH = h(j14, j13, j11);
            if (jH == 1) {
                return true;
            }
            int i10 = 0;
            while (jH != j12) {
                i10++;
                if (i10 == iNumberOfTrailingZeros) {
                    return false;
                }
                jH = i(jH, j11);
            }
            return true;
        }

        abstract long g(long j10, long j11, long j12);

        abstract long i(long j10, long j11);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static boolean a(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    static int b(long j10, long j11) {
        return (int) ((~(~(j10 - j11))) >>> 63);
    }

    public static long binomial(int i10, int i11) {
        MathPreconditions.e("n", i10);
        MathPreconditions.e(CampaignEx.JSON_KEY_AD_K, i11);
        Preconditions.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        long jD = 1;
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == 1) {
            return i10;
        }
        long[] jArr = f30994d;
        if (i10 < jArr.length) {
            return jArr[i10] / (jArr[i11] * jArr[i10 - i11]);
        }
        int[] iArr = f30995e;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f30996f;
        if (i11 < iArr2.length && i10 <= iArr2[i11]) {
            int i12 = i10 - 1;
            long j10 = i10;
            for (int i13 = 2; i13 <= i11; i13++) {
                j10 = (j10 * ((long) i12)) / ((long) i13);
                i12--;
            }
            return j10;
        }
        long j11 = i10;
        int iLog2 = log2(j11, RoundingMode.CEILING);
        int i14 = i10 - 1;
        int i15 = iLog2;
        int i16 = 2;
        long j12 = j11;
        long j13 = 1;
        while (i16 <= i11) {
            i15 += iLog2;
            if (i15 < 63) {
                j12 *= (long) i14;
                j13 *= (long) i16;
            } else {
                jD = d(jD, j12, j13);
                j12 = i14;
                j13 = i16;
                i15 = iLog2;
            }
            i16++;
            i14--;
        }
        return d(jD, j12, j13);
    }

    static int c(long j10) {
        byte b10 = f30991a[Long.numberOfLeadingZeros(j10)];
        return b10 - b(j10, f30992b[b10]);
    }

    public static long ceilingPowerOfTwo(long j10) {
        MathPreconditions.i("x", j10);
        if (j10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j10 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j10 + ") is not representable as a long");
    }

    public static long checkedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        MathPreconditions.c(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long checkedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        MathPreconditions.c(iNumberOfLeadingZeros >= 64, "checkedMultiply", j10, j11);
        MathPreconditions.c((j10 >= 0) | (j11 != Long.MIN_VALUE), "checkedMultiply", j10, j11);
        long j12 = j10 * j11;
        MathPreconditions.c(j10 == 0 || j12 / j10 == j11, "checkedMultiply", j10, j11);
        return j12;
    }

    @GwtIncompatible
    public static long checkedPow(long j10, int i10) {
        int i11 = i10;
        MathPreconditions.e("exponent", i11);
        long jCheckedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = j10;
            while (i11 != 0) {
                if (i11 == 1) {
                    return checkedMultiply(jCheckedMultiply, j11);
                }
                if ((i11 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j11);
                }
                i11 >>= 1;
                if (i11 > 0) {
                    MathPreconditions.c(-3037000499L <= j11 && j11 <= 3037000499L, "checkedPow", j11, i11);
                    j11 *= j11;
                }
            }
            return jCheckedMultiply;
        }
        int i12 = (int) j10;
        if (i12 == -2) {
            MathPreconditions.c(i11 < 64, "checkedPow", j10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.c(i11 < 63, "checkedPow", j10, i11);
        return 1 << i11;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        MathPreconditions.c(((j10 ^ j11) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, j11);
        return j12;
    }

    static long d(long j10, long j11, long j12) {
        if (j10 == 1) {
            return j11 / j12;
        }
        long jGcd = gcd(j10, j12);
        return (j10 / jGcd) * (j11 / (j12 / jGcd));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j10, long j11, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (AnonymousClass1.f30998a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 4:
                return j12 + ((long) i10);
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
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
                return j12 + ((long) i10);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long factorial(int i10) {
        MathPreconditions.e("n", i10);
        long[] jArr = f30994d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j10) {
        MathPreconditions.i("x", j10);
        return 1 << (63 - Long.numberOfLeadingZeros(j10));
    }

    public static long gcd(long j10, long j11) {
        MathPreconditions.f("a", j10);
        MathPreconditions.f("b", j11);
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
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j10) {
        return (j10 > 0) & ((j10 & (j10 - 1)) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(long j10) {
        if (j10 < 2) {
            MathPreconditions.f("n", j10);
            return false;
        }
        if (j10 < 66) {
            return ((722865708377213483 >> (((int) j10) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j10 % 30))) & (-545925251)) != 0 || j10 % 7 == 0 || j10 % 11 == 0 || j10 % 13 == 0) {
            return false;
        }
        if (j10 < 289) {
            return true;
        }
        for (long[] jArr : f30997g) {
            if (j10 <= jArr[0]) {
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    if (!MillerRabinTester.j(jArr[i10], j10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @GwtIncompatible
    public static int log10(long j10, RoundingMode roundingMode) {
        int iB;
        MathPreconditions.i("x", j10);
        int iC = c(j10);
        long j11 = f30992b[iC];
        switch (AnonymousClass1.f30998a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(j10 == j11);
                return iC;
            case 2:
            case 3:
                return iC;
            case 4:
            case 5:
                iB = b(j11, j10);
                break;
            case 6:
            case 7:
            case 8:
                iB = b(f30993c[iC], j10);
                break;
            default:
                throw new AssertionError();
        }
        return iC + iB;
    }

    public static int log2(long j10, RoundingMode roundingMode) {
        MathPreconditions.i("x", j10);
        switch (AnonymousClass1.f30998a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(isPowerOfTwo(j10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                return (63 - iNumberOfLeadingZeros) + b((-5402926248376769404) >>> iNumberOfLeadingZeros, j10);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j10);
    }

    public static long mean(long j10, long j11) {
        return (j10 & j11) + ((j10 ^ j11) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j10, int i10) {
        return (int) mod(j10, i10);
    }

    @GwtIncompatible
    public static long pow(long j10, int i10) {
        MathPreconditions.e("exponent", i10);
        if (-2 > j10 || j10 > 2) {
            long j11 = 1;
            while (i10 != 0) {
                if (i10 == 1) {
                    return j11 * j10;
                }
                j11 *= (i10 & 1) == 0 ? 1L : j10;
                j10 *= j10;
                i10 >>= 1;
            }
            return j11;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            if (i10 < 64) {
                return (i10 & 1) == 0 ? 1 << i10 : -(1 << i10);
            }
            return 0L;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 < 64) {
            return 1 << i10;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j10, RoundingMode roundingMode) {
        long j11;
        double dNextUp;
        long jCeil;
        double d10 = j10;
        long j12 = (long) d10;
        int iCompare = j12 == Long.MAX_VALUE ? -1 : Long.compare(j10, j12);
        int[] iArr = AnonymousClass1.f30998a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(iCompare == 0);
                return d10;
            case 2:
                if (j10 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.f(d10);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.f(d10);
                }
                return d10;
            case 4:
                if (j10 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d10);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.f(d10);
                }
                return d10;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d10);
                    j11 = Long.MAX_VALUE;
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    j11 = Long.MAX_VALUE;
                    double dF = DoubleUtils.f(d10);
                    long jFloor = (long) Math.floor(dF);
                    dNextUp = d10;
                    d10 = dF;
                    jCeil = j12;
                    j12 = jFloor;
                }
                long j13 = j10 - j12;
                long j14 = jCeil - j10;
                if (jCeil == j11) {
                    j14++;
                }
                int iCompare2 = Long.compare(j13, j14);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i10 = iArr[roundingMode.ordinal()];
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((DoubleUtils.c(d10) & 1) == 0) {
                                }
                            } else if (j10 >= 0) {
                            }
                        } else if (j10 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d10;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    public static long saturatedPow(long j10, int i10) {
        MathPreconditions.e("exponent", i10);
        long jSaturatedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = ((j10 >>> 63) & ((long) (i10 & 1))) + Long.MAX_VALUE;
            while (i10 != 0) {
                if (i10 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j10);
                }
                if ((i10 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    if ((-3037000499L > j10) || (j10 > 3037000499L)) {
                        return j11;
                    }
                    j10 *= j10;
                }
            }
            return jSaturatedMultiply;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            return i10 >= 64 ? ((long) (i10 & 1)) + Long.MAX_VALUE : (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i10;
    }

    public static long saturatedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) >= 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j10, RoundingMode roundingMode) {
        MathPreconditions.f("x", j10);
        if (a(j10)) {
            return IntMath.sqrt((int) j10, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (AnonymousClass1.f30998a[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.k(j11 == j10);
                return jSqrt;
            case 2:
            case 3:
                return j10 < j11 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j10 > j11 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j12 = jSqrt - ((long) (j10 < j11 ? 1 : 0));
                return j12 + ((long) b((j12 * j12) + j12, j10));
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j10, long j11) {
        if (j11 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
