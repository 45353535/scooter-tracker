package j$.util;

import j$.util.stream.C5675b2;
import j$.util.stream.EnumC5671a3;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends C5797u {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C5661m, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        AbstractC5650b.q(this.f84955a, new j$.time.format.r(1, consumer));
    }

    @Override // j$.util.C5661m, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return new C5665q(AbstractC5650b.t(this.f84955a));
    }

    @Override // j$.util.C5661m, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new C5675b2(spliterator, EnumC5671a3.m(spliterator), false);
    }

    @Override // j$.util.C5661m, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new C5675b2(spliterator, EnumC5671a3.m(spliterator), true);
    }

    @Override // j$.util.C5661m, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5660l(this);
    }

    @Override // j$.util.C5661m, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f84955a.toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new C5664p((Map.Entry) array[i10]);
        }
        return array;
    }

    @Override // j$.util.C5661m, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f84955a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i10 = 0; i10 < array.length; i10++) {
            array[i10] = new C5664p((Map.Entry) array[i10]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }

    @Override // j$.util.C5661m, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f84955a.contains(new C5664p((Map.Entry) obj));
    }

    @Override // j$.util.C5661m, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C5797u, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f84955a.size()) {
            return false;
        }
        return containsAll(set);
    }
}
