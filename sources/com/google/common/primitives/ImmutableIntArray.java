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
public final class ImmutableIntArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableIntArray f31099e = new ImmutableIntArray(new int[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f31100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f31101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31102d;

    static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableIntArray f31103b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f31103b.equals(((AsList) obj).f31103b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f31103b.f31101c;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i11 = i10 + 1;
                    if (this.f31103b.f31100b[i10] == ((Integer) obj2).intValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f31103b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f31103b.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return this.f31103b.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31103b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            return this.f31103b.subArray(i10, i11).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f31103b.toString();
        }

        private AsList(ImmutableIntArray immutableIntArray) {
            this.f31103b = immutableIntArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i10) {
            return Integer.valueOf(this.f31103b.get(i10));
        }
    }

    public static Builder builder(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new Builder(i10);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? f31099e : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean g() {
        return this.f31101c > 0 || this.f31102d < this.f31100b.length;
    }

    public static ImmutableIntArray of() {
        return f31099e;
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i10) {
        return indexOf(i10) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (get(i10) != immutableIntArray.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i10) {
        Preconditions.checkElementIndex(i10, length());
        return this.f31100b[this.f31101c + i10];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f31101c; i10 < this.f31102d; i10++) {
            iHashCode = (iHashCode * 31) + Ints.hashCode(this.f31100b[i10]);
        }
        return iHashCode;
    }

    public int indexOf(int i10) {
        for (int i11 = this.f31101c; i11 < this.f31102d; i11++) {
            if (this.f31100b[i11] == i10) {
                return i11 - this.f31101c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f31102d == this.f31101c;
    }

    public int lastIndexOf(int i10) {
        int i11;
        int i12 = this.f31102d;
        do {
            i12--;
            i11 = this.f31101c;
            if (i12 < i11) {
                return -1;
            }
        } while (this.f31100b[i12] != i10);
        return i12 - i11;
    }

    public int length() {
        return this.f31102d - this.f31101c;
    }

    Object readResolve() {
        return isEmpty() ? f31099e : this;
    }

    public ImmutableIntArray subArray(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, length());
        if (i10 == i11) {
            return f31099e;
        }
        int[] iArr = this.f31100b;
        int i12 = this.f31101c;
        return new ImmutableIntArray(iArr, i10 + i12, i12 + i11);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.f31100b, this.f31101c, this.f31102d);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f31100b[this.f31101c]);
        int i10 = this.f31101c;
        while (true) {
            i10++;
            if (i10 >= this.f31102d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f31100b[i10]);
        }
    }

    public ImmutableIntArray trimmed() {
        return g() ? new ImmutableIntArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f31099e : new ImmutableIntArray(Ints.toArray(collection));
    }

    public static ImmutableIntArray of(int i10) {
        return new ImmutableIntArray(new int[]{i10});
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f31104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31105b = 0;

        Builder(int i10) {
            this.f31104a = new int[i10];
        }

        private void a(int i10) {
            int i11 = this.f31105b + i10;
            int[] iArr = this.f31104a;
            if (i11 > iArr.length) {
                this.f31104a = Arrays.copyOf(iArr, b(iArr.length, i11));
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
        public Builder add(int i10) {
            a(1);
            int[] iArr = this.f31104a;
            int i11 = this.f31105b;
            iArr[i11] = i10;
            this.f31105b = i11 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(int[] iArr) {
            a(iArr.length);
            System.arraycopy(iArr, 0, this.f31104a, this.f31105b, iArr.length);
            this.f31105b += iArr.length;
            return this;
        }

        public ImmutableIntArray build() {
            if (this.f31105b == 0) {
                return ImmutableIntArray.f31099e;
            }
            return new ImmutableIntArray(this.f31104a, 0, this.f31105b);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Integer>) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Integer> collection) {
            a(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.f31104a;
                int i10 = this.f31105b;
                this.f31105b = i10 + 1;
                iArr[i10] = num.intValue();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableIntArray immutableIntArray) {
            a(immutableIntArray.length());
            System.arraycopy(immutableIntArray.f31100b, immutableIntArray.f31101c, this.f31104a, this.f31105b, immutableIntArray.length());
            this.f31105b += immutableIntArray.length();
            return this;
        }
    }

    private ImmutableIntArray(int[] iArr, int i10, int i11) {
        this.f31100b = iArr;
        this.f31101c = i10;
        this.f31102d = i11;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableIntArray of(int i10, int i11) {
        return new ImmutableIntArray(new int[]{i10, i11});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12) {
        return new ImmutableIntArray(new int[]{i10, i11, i12});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13, int i14) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14});
    }

    public static ImmutableIntArray of(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new ImmutableIntArray(new int[]{i10, i11, i12, i13, i14, i15});
    }

    public static ImmutableIntArray of(int i10, int... iArr) {
        Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i10;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }
}
