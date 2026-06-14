package lf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Collection, yf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f94224b;

    private static final class a implements Iterator, yf.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f94225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f94226c;

        public a(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f94225b = array;
        }

        public byte a() {
            int i10 = this.f94226c;
            byte[] bArr = this.f94225b;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f94226c));
            }
            this.f94226c = i10 + 1;
            return r.c(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f94226c < this.f94225b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return r.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ s(byte[] bArr) {
        this.f94224b = bArr;
    }

    public static final /* synthetic */ s a(byte[] bArr) {
        return new s(bArr);
    }

    public static byte[] e(int i10) {
        return f(new byte[i10]);
    }

    public static byte[] f(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean i(byte[] bArr, byte b10) {
        return ArraysKt.contains(bArr, b10);
    }

    public static boolean j(byte[] bArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof r) || !ArraysKt.contains(bArr, ((r) obj).g())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof s) && Intrinsics.areEqual(bArr, ((s) obj).t());
    }

    public static final byte l(byte[] bArr, int i10) {
        return r.c(bArr[i10]);
    }

    public static int n(byte[] bArr) {
        return bArr.length;
    }

    public static int o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean p(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator q(byte[] bArr) {
        return new a(bArr);
    }

    public static final void r(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String s(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof r) {
            return g(((r) obj).g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return j(this.f94224b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f94224b, obj);
    }

    public boolean g(byte b10) {
        return i(this.f94224b, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f94224b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f94224b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f94224b);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f94224b);
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

    public final /* synthetic */ byte[] t() {
        return this.f94224b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.s.a(this);
    }

    public String toString() {
        return s(this.f94224b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return kotlin.jvm.internal.s.b(this, array);
    }
}
