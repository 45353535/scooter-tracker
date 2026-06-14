package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Ordering<T> implements Comparator<T> {

    @VisibleForTesting
    @J2ktIncompatible
    static class ArbitraryOrdering extends Ordering<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f30115b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConcurrentMap f30116c = Platform.j(new MapMaker()).makeMap();

        ArbitraryOrdering() {
        }

        private Integer g(Object obj) {
            Integer numValueOf = (Integer) this.f30116c.get(obj);
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.f30115b.getAndIncrement());
                Integer num = (Integer) this.f30116c.putIfAbsent(obj, numValueOf);
                if (num != null) {
                    return num;
                }
            }
            return numValueOf;
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int iH = h(obj);
            int iH2 = h(obj2);
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
            int iCompareTo = g(obj).compareTo(g(obj2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            throw new AssertionError();
        }

        int h(Object obj) {
            return System.identityHashCode(obj);
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    @J2ktIncompatible
    private static class ArbitraryOrderingHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Ordering f30117a = new ArbitraryOrdering();
    }

    static class IncomparableValueException extends ClassCastException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f30118b;

        IncomparableValueException(Object obj) {
            super("Cannot compare value: " + obj);
            this.f30118b = obj;
        }
    }

    protected Ordering() {
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.f29298b;
    }

    @J2ktIncompatible
    public static Ordering<Object> arbitrary() {
        return ArbitraryOrderingHolder.f30117a;
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @GwtCompatible(serializable = true)
    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.f30096d;
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.f30427b;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @ParametricNullness T t10) {
        return Collections.binarySearch(list, t10, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T t10, @ParametricNullness T t11);

    @GwtCompatible(serializable = true)
    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    Ordering d() {
        return onResultOf(Maps.v());
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i10) {
        return reverse().leastOf(iterable, i10);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i10) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= ((long) i10) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i10) {
                    array = Arrays.copyOf(array, i10);
                }
                return DesugarCollections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i10);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    @ParametricNullness
    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    @ParametricNullness
    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    @GwtCompatible(serializable = true)
    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] objArrF = Iterables.f(iterable);
        Arrays.sort(objArrF, this);
        return Lists.newArrayList(Arrays.asList(objArrF));
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(T t10, T... tArr) {
        return explicit(Lists.asList(t10, tArr));
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i10) {
        return reverse().leastOf(it, i10);
    }

    @GwtCompatible(serializable = true)
    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    @ParametricNullness
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    @ParametricNullness
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e10, @ParametricNullness E e11) {
        return compare(e10, e11) >= 0 ? e10 : e11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e10, @ParametricNullness E e11) {
        return compare(e10, e11) <= 0 ? e10 : e11;
    }

    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e10, @ParametricNullness E e11, @ParametricNullness E e12, E... eArr) {
        E e13 = (E) max(max(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) max(e13, e14);
        }
        return e13;
    }

    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e10, @ParametricNullness E e11, @ParametricNullness E e12, E... eArr) {
        E e13 = (E) min(min(e10, e11), e12);
        for (E e14 : eArr) {
            e13 = (E) min(e13, e14);
        }
        return e13;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i10) {
        Preconditions.checkNotNull(it);
        CollectPreconditions.b(i10, CampaignEx.JSON_KEY_AD_K);
        if (i10 == 0 || !it.hasNext()) {
            return Collections.EMPTY_LIST;
        }
        if (i10 >= 1073741823) {
            ArrayList arrayListNewArrayList = Lists.newArrayList(it);
            Collections.sort(arrayListNewArrayList, this);
            if (arrayListNewArrayList.size() > i10) {
                arrayListNewArrayList.subList(i10, arrayListNewArrayList.size()).clear();
            }
            arrayListNewArrayList.trimToSize();
            return DesugarCollections.unmodifiableList(arrayListNewArrayList);
        }
        TopKSelector topKSelectorLeast = TopKSelector.least(i10, this);
        topKSelectorLeast.offerAll(it);
        return topKSelectorLeast.topK();
    }
}
