package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Quantiles {

    public static final class Scale {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31006a;

        public ScaleAndIndex index(int i10) {
            return new ScaleAndIndex(this.f31006a, i10);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.f31006a, (int[]) iArr.clone());
        }

        private Scale(int i10) {
            Preconditions.checkArgument(i10 > 0, "Quantile scale must be positive");
            this.f31006a = i10;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.f31006a, Ints.toArray(collection));
        }
    }

    public static final class ScaleAndIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f31008b;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.j(dArr)) {
                return Double.NaN;
            }
            long length = ((long) this.f31008b) * ((long) (dArr.length - 1));
            int iDivide = (int) LongMath.divide(length, this.f31007a, RoundingMode.DOWN);
            int i10 = (int) (length - (((long) iDivide) * ((long) this.f31007a)));
            Quantiles.q(iDivide, dArr, 0, dArr.length - 1);
            if (i10 == 0) {
                return dArr[iDivide];
            }
            int i11 = iDivide + 1;
            Quantiles.q(i11, dArr, i11, dArr.length - 1);
            return Quantiles.k(dArr[iDivide], dArr[i11], i10, this.f31007a);
        }

        private ScaleAndIndex(int i10, int i11) {
            Quantiles.h(i11, i10);
            this.f31007a = i10;
            this.f31008b = i11;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.m(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.l(iArr));
        }
    }

    public static final class ScaleAndIndexes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f31010b;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            int i10 = 0;
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.j(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.f31010b;
                int length = iArr.length;
                while (i10 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i10]), Double.valueOf(Double.NaN));
                    i10++;
                }
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.f31010b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr6 = this.f31010b;
                if (i11 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i11]) * ((long) (dArr.length - 1));
                int iDivide = (int) LongMath.divide(length2, this.f31009a, RoundingMode.DOWN);
                int i13 = (int) (length2 - (((long) iDivide) * ((long) this.f31009a)));
                iArr3[i11] = iDivide;
                iArr4[i11] = i13;
                iArr5[i12] = iDivide;
                int i14 = i12 + 1;
                if (i13 != 0) {
                    iArr5[i14] = iDivide + 1;
                    i12 += 2;
                } else {
                    i12 = i14;
                }
                i11++;
            }
            Arrays.sort(iArr5, 0, i12);
            Quantiles.p(iArr5, 0, i12 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.f31010b;
                if (i10 >= iArr7.length) {
                    return DesugarCollections.unmodifiableMap(linkedHashMap2);
                }
                int i15 = iArr3[i10];
                int i16 = iArr4[i10];
                if (i16 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i10]), Double.valueOf(dArr[i15]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i10]), Double.valueOf(Quantiles.k(dArr[i15], dArr[i15 + 1], i16, this.f31009a)));
                }
                i10++;
            }
        }

        private ScaleAndIndexes(int i10, int[] iArr) {
            for (int i11 : iArr) {
                Quantiles.h(i11, i10);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.f31009a = i10;
            this.f31010b = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.m(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.l(iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + i11);
        }
    }

    private static int i(int[] iArr, int i10, int i11, int i12, int i13) {
        if (i10 == i11) {
            return i10;
        }
        int i14 = i12 + i13;
        int i15 = i14 >>> 1;
        while (i11 > i10 + 1) {
            int i16 = (i10 + i11) >>> 1;
            int i17 = iArr[i16];
            if (i17 > i15) {
                i11 = i16;
            } else {
                if (i17 >= i15) {
                    return i16;
                }
                i10 = i16;
            }
        }
        return (i14 - iArr[i10]) - iArr[i11] > 0 ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(double... dArr) {
        for (double d10 : dArr) {
            if (Double.isNaN(d10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double k(double d10, double d11, double d12, double d13) {
        if (d10 == Double.NEGATIVE_INFINITY) {
            return d11 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d11 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d10 + (((d11 - d10) * d12) / d13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = iArr[i10];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = jArr[i10];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void n(double[] dArr, int i10, int i11) {
        int i12 = (i10 + i11) >>> 1;
        double d10 = dArr[i11];
        double d11 = dArr[i12];
        boolean z10 = d10 < d11;
        double d12 = dArr[i10];
        boolean z11 = d11 < d12;
        boolean z12 = d10 < d12;
        if (z10 == z11) {
            r(dArr, i12, i10);
        } else if (z10 != z12) {
            r(dArr, i10, i11);
        }
    }

    private static int o(double[] dArr, int i10, int i11) {
        n(dArr, i10, i11);
        double d10 = dArr[i10];
        int i12 = i11;
        while (i11 > i10) {
            if (dArr[i11] > d10) {
                r(dArr, i12, i11);
                i12--;
            }
            i11--;
        }
        r(dArr, i10, i12);
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(int[] iArr, int i10, int i11, double[] dArr, int i12, int i13) {
        int i14 = i(iArr, i10, i11, i12, i13);
        int i15 = iArr[i14];
        q(i15, dArr, i12, i13);
        int i16 = i14 - 1;
        while (i16 >= i10 && iArr[i16] == i15) {
            i16--;
        }
        if (i16 >= i10) {
            p(iArr, i10, i16, dArr, i12, i15 - 1);
        }
        int i17 = i14 + 1;
        while (i17 <= i11 && iArr[i17] == i15) {
            i17++;
        }
        if (i17 <= i11) {
            p(iArr, i17, i11, dArr, i15 + 1, i13);
        }
    }

    public static Scale percentiles() {
        return scale(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(int i10, double[] dArr, int i11, int i12) {
        if (i10 != i11) {
            while (i12 > i11) {
                int iO = o(dArr, i11, i12);
                if (iO >= i10) {
                    i12 = iO - 1;
                }
                if (iO <= i10) {
                    i11 = iO + 1;
                }
            }
            return;
        }
        int i13 = i11;
        for (int i14 = i11 + 1; i14 <= i12; i14++) {
            if (dArr[i13] > dArr[i14]) {
                i13 = i14;
            }
        }
        if (i13 != i11) {
            r(dArr, i13, i11);
        }
    }

    public static Scale quartiles() {
        return scale(4);
    }

    private static void r(double[] dArr, int i10, int i11) {
        double d10 = dArr[i10];
        dArr[i10] = dArr[i11];
        dArr[i11] = d10;
    }

    public static Scale scale(int i10) {
        return new Scale(i10);
    }
}
