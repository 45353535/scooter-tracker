package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Collection, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f94229b;

    private static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f94230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f94231c;

        public a(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f94230b = array;
        }

        public int a() {
            int i10 = this.f94231c;
            int[] iArr = this.f94230b;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f94231c));
            }
            this.f94231c = i10 + 1;
            return t.c(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94231c < this.f94230b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return t.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ u(int[] iArr) {
        this.f94229b = iArr;
    }

    public static final /* synthetic */ u a(int[] iArr) {
        return new u(iArr);
    }

    public static int[] e(int i10) {
        return f(new int[i10]);
    }

    public static int[] f(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean i(int[] iArr, int i10) {
        return ArraysKt.contains(iArr, i10);
    }

    public static boolean j(int[] iArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof t) || !ArraysKt.contains(iArr, ((t) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(iArr, ((u) obj).t());
    }

    public static final int l(int[] iArr, int i10) {
        return t.c(iArr[i10]);
    }

    public static int n(int[] iArr) {
        return iArr.length;
    }

    public static int o(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean p(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator q(int[] iArr) {
        return new a(iArr);
    }

    public static final void r(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String s(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof t) {
            return g(((t) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return j(this.f94229b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f94229b, obj);
    }

    public boolean g(int i10) {
        return i(this.f94229b, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f94229b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f94229b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f94229b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f94229b);
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

    public final /* synthetic */ int[] t() {
        return this.f94229b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.s.a(this);
    }

    public String toString() {
        return s(this.f94229b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.s.b(this, array);
    }
}
