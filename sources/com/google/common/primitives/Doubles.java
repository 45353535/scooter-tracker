package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Doubles extends DoublesMethodsForWeb {
    public static final int BYTES = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Pattern f31081a = d();

    @GwtCompatible
    private static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double[] f31082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f31083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31084d;

        DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.e(this.f31082b, ((Double) obj).doubleValue(), this.f31083c, this.f31084d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f31082b[this.f31083c + i10] != doubleArrayAsList.f31082b[doubleArrayAsList.f31083c + i10]) {
                    return false;
                }
            }
            return true;
        }

        double[] g() {
            return Arrays.copyOfRange(this.f31082b, this.f31083c, this.f31084d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f31083c; i10 < this.f31084d; i10++) {
                iHashCode = (iHashCode * 31) + Doubles.hashCode(this.f31082b[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iE;
            if (!(obj instanceof Double) || (iE = Doubles.e(this.f31082b, ((Double) obj).doubleValue(), this.f31083c, this.f31084d)) < 0) {
                return -1;
            }
            return iE - this.f31083c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iF;
            if (!(obj instanceof Double) || (iF = Doubles.f(this.f31082b, ((Double) obj).doubleValue(), this.f31083c, this.f31084d)) < 0) {
                return -1;
            }
            return iF - this.f31083c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31084d - this.f31083c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.f31082b;
            int i12 = this.f31083c;
            return new DoubleArrayAsList(dArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 12);
            sb2.append('[');
            sb2.append(this.f31082b[this.f31083c]);
            int i10 = this.f31083c;
            while (true) {
                i10++;
                if (i10 >= this.f31084d) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f31082b[i10]);
            }
        }

        DoubleArrayAsList(double[] dArr, int i10, int i11) {
            this.f31082b = dArr;
            this.f31083c = i10;
            this.f31084d = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Double.valueOf(this.f31082b[this.f31083c + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i10, Double d10) {
            Preconditions.checkElementIndex(i10, size());
            double[] dArr = this.f31082b;
            int i11 = this.f31083c;
            double d11 = dArr[i11 + i10];
            dArr[i11 + i10] = ((Double) Preconditions.checkNotNull(d10)).doubleValue();
            return Double.valueOf(d11);
        }
    }

    private static final class DoubleConverter extends Converter<String, Double> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final Converter f31085d = new DoubleConverter();

        private DoubleConverter() {
        }

        private Object readResolve() {
            return f31085d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String d(Double d10) {
            return d10.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Double g(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    private enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = Double.compare(dArr[i10], dArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new DoubleArrayAsList(dArr);
    }

    private static int c(long j10) {
        int i10 = (int) j10;
        Preconditions.checkArgument(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    @InlineMe(replacement = "Double.compare(a, b)")
    public static int compare(double d10, double d11) {
        return Double.compare(d10, d11);
    }

    public static double[] concat(double[]... dArr) {
        long length = 0;
        for (double[] dArr2 : dArr) {
            length += (long) dArr2.length;
        }
        double[] dArr3 = new double[c(length)];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static double constrainToRange(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return Math.min(Math.max(d10, d11), d12);
        }
        throw new IllegalArgumentException(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(d11), Double.valueOf(d12)));
    }

    public static boolean contains(double[] dArr, double d10) {
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    private static Pattern d() {
        return Pattern.compile(("[+-]?(?:NaN|Infinity|" + ("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?") + "|" + ("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?") + ")").replace("#", "+"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(double[] dArr, double d10, int i10, int i11) {
        while (i10 < i11) {
            if (dArr[i10] == d10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static double[] ensureCapacity(double[] dArr, int i10, int i11) {
        Preconditions.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        Preconditions.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return dArr.length < i10 ? Arrays.copyOf(dArr, i10 + i11) : dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(double[] dArr, double d10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (dArr[i12] == d10) {
                return i12;
            }
        }
        return -1;
    }

    public static int hashCode(double d10) {
        return Double.valueOf(d10).hashCode();
    }

    public static int indexOf(double[] dArr, double d10) {
        return e(dArr, d10, 0, dArr.length);
    }

    public static boolean isFinite(double d10) {
        return Double.NEGATIVE_INFINITY < d10 && d10 < Double.POSITIVE_INFINITY;
    }

    public static String join(String str, double... dArr) {
        Preconditions.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i10 = 1; i10 < dArr.length; i10++) {
            sb2.append(str);
            sb2.append(dArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(double[] dArr, double d10) {
        return f(dArr, d10, 0, dArr.length);
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMax = Math.max(dMax, dArr[i10]);
        }
        return dMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMin = Math.min(dMin, dArr[i10]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void rotate(double[] dArr, int i10) {
        rotate(dArr, i10, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static Converter<String, Double> stringConverter() {
        return DoubleConverter.f31085d;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).g();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) Preconditions.checkNotNull(array[i10])).doubleValue();
        }
        return dArr;
    }

    @GwtIncompatible
    public static Double tryParse(String str) {
        if (!f31081a.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int indexOf(double[] r7, double[] r8) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Doubles.indexOf(double[], double[]):int");
    }

    public static void rotate(double[] dArr, int i10, int i11, int i12) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i11, i12, dArr.length);
        if (dArr.length <= 1) {
            return;
        }
        int i13 = i12 - i11;
        int i14 = (-i10) % i13;
        if (i14 < 0) {
            i14 += i13;
        }
        int i15 = i14 + i11;
        if (i15 == i11) {
            return;
        }
        reverse(dArr, i11, i15);
        reverse(dArr, i15, i12);
        reverse(dArr, i11, i12);
    }

    public static void reverse(double[] dArr, int i10, int i11) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i10, i11, dArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i12];
            dArr[i12] = d10;
            i10++;
        }
    }

    public static void sortDescending(double[] dArr, int i10, int i11) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i10, i11, dArr.length);
        Arrays.sort(dArr, i10, i11);
        reverse(dArr, i10, i11);
    }
}
