package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Collection, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short[] f94240b;

    private static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final short[] f94241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f94242c;

        public a(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f94241b = array;
        }

        public short a() {
            int i10 = this.f94242c;
            short[] sArr = this.f94241b;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f94242c));
            }
            this.f94242c = i10 + 1;
            return y.c(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94242c < this.f94241b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(short[] sArr) {
        this.f94240b = sArr;
    }

    public static final /* synthetic */ z a(short[] sArr) {
        return new z(sArr);
    }

    public static short[] e(int i10) {
        return f(new short[i10]);
    }

    public static short[] f(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean i(short[] sArr, short s10) {
        return ArraysKt.contains(sArr, s10);
    }

    public static boolean j(short[] sArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !ArraysKt.contains(sArr, ((y) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof z) && Intrinsics.areEqual(sArr, ((z) obj).t());
    }

    public static final short l(short[] sArr, int i10) {
        return y.c(sArr[i10]);
    }

    public static int n(short[] sArr) {
        return sArr.length;
    }

    public static int o(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean p(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator q(short[] sArr) {
        return new a(sArr);
    }

    public static final void r(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String s(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (obj instanceof y) {
            return g(((y) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return j(this.f94240b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f94240b, obj);
    }

    public boolean g(short s10) {
        return i(this.f94240b, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f94240b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f94240b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f94240b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f94240b);
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

    public final /* synthetic */ short[] t() {
        return this.f94240b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.s.a(this);
    }

    public String toString() {
        return s(this.f94240b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.s.b(this, array);
    }
}
