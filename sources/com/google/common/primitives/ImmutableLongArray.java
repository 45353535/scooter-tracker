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
public final class ImmutableLongArray implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableLongArray f31106e = new ImmutableLongArray(new long[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f31107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f31108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31109d;

    static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableLongArray f31110b;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.f31110b.equals(((AsList) obj).f31110b);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i10 = this.f31110b.f31108c;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i11 = i10 + 1;
                    if (this.f31110b.f31107b[i10] == ((Long) obj2).longValue()) {
                        i10 = i11;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.f31110b.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f31110b.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return this.f31110b.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31110b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i10, int i11) {
            return this.f31110b.subArray(i10, i11).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.f31110b.toString();
        }

        private AsList(ImmutableLongArray immutableLongArray) {
            this.f31110b = immutableLongArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i10) {
            return Long.valueOf(this.f31110b.get(i10));
        }
    }

    public static Builder builder(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new Builder(i10);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        return jArr.length == 0 ? f31106e : new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean g() {
        return this.f31108c > 0 || this.f31109d < this.f31107b.length;
    }

    public static ImmutableLongArray of() {
        return f31106e;
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j10) {
        return indexOf(j10) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (get(i10) != immutableLongArray.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i10) {
        Preconditions.checkElementIndex(i10, length());
        return this.f31107b[this.f31108c + i10];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f31108c; i10 < this.f31109d; i10++) {
            iHashCode = (iHashCode * 31) + Longs.hashCode(this.f31107b[i10]);
        }
        return iHashCode;
    }

    public int indexOf(long j10) {
        for (int i10 = this.f31108c; i10 < this.f31109d; i10++) {
            if (this.f31107b[i10] == j10) {
                return i10 - this.f31108c;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f31109d == this.f31108c;
    }

    public int lastIndexOf(long j10) {
        int i10;
        int i11 = this.f31109d;
        do {
            i11--;
            i10 = this.f31108c;
            if (i11 < i10) {
                return -1;
            }
        } while (this.f31107b[i11] != j10);
        return i11 - i10;
    }

    public int length() {
        return this.f31109d - this.f31108c;
    }

    Object readResolve() {
        return isEmpty() ? f31106e : this;
    }

    public ImmutableLongArray subArray(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, length());
        if (i10 == i11) {
            return f31106e;
        }
        long[] jArr = this.f31107b;
        int i12 = this.f31108c;
        return new ImmutableLongArray(jArr, i10 + i12, i12 + i11);
    }

    public long[] toArray() {
        return Arrays.copyOfRange(this.f31107b, this.f31108c, this.f31109d);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append('[');
        sb2.append(this.f31107b[this.f31108c]);
        int i10 = this.f31108c;
        while (true) {
            i10++;
            if (i10 >= this.f31109d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f31107b[i10]);
        }
    }

    public ImmutableLongArray trimmed() {
        return g() ? new ImmutableLongArray(toArray()) : this;
    }

    Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static ImmutableLongArray of(long j10) {
        return new ImmutableLongArray(new long[]{j10});
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long[] f31111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f31112b = 0;

        Builder(int i10) {
            this.f31111a = new long[i10];
        }

        private void a(int i10) {
            int i11 = this.f31112b + i10;
            long[] jArr = this.f31111a;
            if (i11 > jArr.length) {
                this.f31111a = Arrays.copyOf(jArr, b(jArr.length, i11));
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
        public Builder add(long j10) {
            a(1);
            long[] jArr = this.f31111a;
            int i10 = this.f31112b;
            jArr[i10] = j10;
            this.f31112b = i10 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(long[] jArr) {
            a(jArr.length);
            System.arraycopy(jArr, 0, this.f31111a, this.f31112b, jArr.length);
            this.f31112b += jArr.length;
            return this;
        }

        public ImmutableLongArray build() {
            if (this.f31112b == 0) {
                return ImmutableLongArray.f31106e;
            }
            return new ImmutableLongArray(this.f31111a, 0, this.f31112b);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Long>) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Long> collection) {
            a(collection.size());
            for (Long l10 : collection) {
                long[] jArr = this.f31111a;
                int i10 = this.f31112b;
                this.f31112b = i10 + 1;
                jArr[i10] = l10.longValue();
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableLongArray immutableLongArray) {
            a(immutableLongArray.length());
            System.arraycopy(immutableLongArray.f31107b, immutableLongArray.f31108c, this.f31111a, this.f31112b, immutableLongArray.length());
            this.f31112b += immutableLongArray.length();
            return this;
        }
    }

    private ImmutableLongArray(long[] jArr, int i10, int i11) {
        this.f31107b = jArr;
        this.f31108c = i10;
        this.f31109d = i11;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableLongArray of(long j10, long j11) {
        return new ImmutableLongArray(new long[]{j10, j11});
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? f31106e : new ImmutableLongArray(Longs.toArray(collection));
    }

    public static ImmutableLongArray of(long j10, long j11, long j12) {
        return new ImmutableLongArray(new long[]{j10, j11, j12});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableLongArray of(long j10, long j11, long j12, long j13) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13});
    }

    public static ImmutableLongArray of(long j10, long j11, long j12, long j13, long j14) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13, j14});
    }

    public static ImmutableLongArray of(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new ImmutableLongArray(new long[]{j10, j11, j12, j13, j14, j15});
    }

    public static ImmutableLongArray of(long j10, long... jArr) {
        Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j10;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}
