package com.google.common.primitives;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
public final class ImmutableDoubleArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableDoubleArray f31092e = new ImmutableDoubleArray(new double[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f31093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f31094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31095d;

    static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableDoubleArray f31096b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f31096b.equals(((AsList) obj).f31096b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f31096b.f31094c;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i11 = i10 + 1;
                    if (ImmutableDoubleArray.h(this.f31096b.f31093b[i10], ((Double) obj2).doubleValue())) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f31096b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f31096b.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.f31096b.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31096b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i10, int i11) {
            return this.f31096b.subArray(i10, i11).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f31096b.toString();
        }

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.f31096b = immutableDoubleArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i10) {
            return Double.valueOf(this.f31096b.get(i10));
        }
    }

    public static Builder builder(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new Builder(i10);
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        return dArr.length == 0 ? f31092e : new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(double d10, double d11) {
        return Double.doubleToLongBits(d10) == Double.doubleToLongBits(d11);
    }

    private boolean i() {
        return this.f31094c > 0 || this.f31095d < this.f31093b.length;
    }

    public static ImmutableDoubleArray of() {
        return f31092e;
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double d10) {
        return indexOf(d10) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (!h(get(i10), immutableDoubleArray.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i10) {
        Preconditions.checkElementIndex(i10, length());
        return this.f31093b[this.f31094c + i10];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f31094c; i10 < this.f31095d; i10++) {
            iHashCode = (iHashCode * 31) + Doubles.hashCode(this.f31093b[i10]);
        }
        return iHashCode;
    }

    public int indexOf(double d10) {
        for (int i10 = this.f31094c; i10 < this.f31095d; i10++) {
            if (h(this.f31093b[i10], d10)) {
                return i10 - this.f31094c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f31095d == this.f31094c;
    }

    public int lastIndexOf(double d10) {
        int i10 = this.f31095d;
        do {
            i10--;
            if (i10 < this.f31094c) {
                return -1;
            }
        } while (!h(this.f31093b[i10], d10));
        return i10 - this.f31094c;
    }

    public int length() {
        return this.f31095d - this.f31094c;
    }

    Object readResolve() {
        return isEmpty() ? f31092e : this;
    }

    public ImmutableDoubleArray subArray(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, length());
        if (i10 == i11) {
            return f31092e;
        }
        double[] dArr = this.f31093b;
        int i12 = this.f31094c;
        return new ImmutableDoubleArray(dArr, i10 + i12, i12 + i11);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.f31093b, this.f31094c, this.f31095d);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f31093b[this.f31094c]);
        int i10 = this.f31094c;
        while (true) {
            i10++;
            if (i10 >= this.f31095d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f31093b[i10]);
        }
    }

    public ImmutableDoubleArray trimmed() {
        return i() ? new ImmutableDoubleArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static ImmutableDoubleArray of(double d10) {
        return new ImmutableDoubleArray(new double[]{d10});
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double[] f31097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31098b = 0;

        Builder(int i10) {
            this.f31097a = new double[i10];
        }

        private void a(int i10) {
            int i11 = this.f31098b + i10;
            double[] dArr = this.f31097a;
            if (i11 > dArr.length) {
                this.f31097a = Arrays.copyOf(dArr, b(dArr.length, i11));
            }
        }

        private static int b(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        public Builder add(double d10) {
            a(1);
            double[] dArr = this.f31097a;
            int i10 = this.f31098b;
            dArr[i10] = d10;
            this.f31098b = i10 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(double[] dArr) {
            a(dArr.length);
            System.arraycopy(dArr, 0, this.f31097a, this.f31098b, dArr.length);
            this.f31098b += dArr.length;
            return this;
        }

        public ImmutableDoubleArray build() {
            if (this.f31098b == 0) {
                return ImmutableDoubleArray.f31092e;
            }
            return new ImmutableDoubleArray(this.f31097a, 0, this.f31098b);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Double>) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Double> collection) {
            a(collection.size());
            for (Double d10 : collection) {
                double[] dArr = this.f31097a;
                int i10 = this.f31098b;
                this.f31098b = i10 + 1;
                dArr[i10] = d10.doubleValue();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
            a(immutableDoubleArray.length());
            System.arraycopy(immutableDoubleArray.f31093b, immutableDoubleArray.f31094c, this.f31097a, this.f31098b, immutableDoubleArray.length());
            this.f31098b += immutableDoubleArray.length();
            return this;
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i10, int i11) {
        this.f31093b = dArr;
        this.f31094c = i10;
        this.f31095d = i11;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableDoubleArray of(double d10, double d11) {
        return new ImmutableDoubleArray(new double[]{d10, d11});
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? f31092e : new ImmutableDoubleArray(Doubles.toArray(collection));
    }

    public static ImmutableDoubleArray of(double d10, double d11, double d12) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12});
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Double>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableDoubleArray of(double d10, double d11, double d12, double d13) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13});
    }

    public static ImmutableDoubleArray of(double d10, double d11, double d12, double d13, double d14) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13, d14});
    }

    public static ImmutableDoubleArray of(double d10, double d11, double d12, double d13, double d14, double d15) {
        return new ImmutableDoubleArray(new double[]{d10, d11, d12, d13, d14, d15});
    }

    public static ImmutableDoubleArray of(double d10, double... dArr) {
        Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d10;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }
}
