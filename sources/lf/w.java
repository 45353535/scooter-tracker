package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Collection, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f94234b;

    private static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f94235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f94236c;

        public a(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f94235b = array;
        }

        public long a() {
            int i10 = this.f94236c;
            long[] jArr = this.f94235b;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f94236c));
            }
            this.f94236c = i10 + 1;
            return v.c(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94236c < this.f94235b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return v.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ w(long[] jArr) {
        this.f94234b = jArr;
    }

    public static final /* synthetic */ w a(long[] jArr) {
        return new w(jArr);
    }

    public static long[] e(int i10) {
        return f(new long[i10]);
    }

    public static long[] f(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean i(long[] jArr, long j10) {
        return ArraysKt.contains(jArr, j10);
    }

    public static boolean j(long[] jArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof v) || !ArraysKt.contains(jArr, ((v) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof w) && Intrinsics.areEqual(jArr, ((w) obj).t());
    }

    public static final long l(long[] jArr, int i10) {
        return v.c(jArr[i10]);
    }

    public static int n(long[] jArr) {
        return jArr.length;
    }

    public static int o(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean p(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator q(long[] jArr) {
        return new a(jArr);
    }

    public static final void r(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String s(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof v) {
            return g(((v) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return j(this.f94234b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f94234b, obj);
    }

    public boolean g(long j10) {
        return i(this.f94234b, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f94234b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f94234b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f94234b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f94234b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ long[] t() {
        return this.f94234b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.s.a(this);
    }

    public String toString() {
        return s(this.f94234b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.s.b(this, array);
    }
}
