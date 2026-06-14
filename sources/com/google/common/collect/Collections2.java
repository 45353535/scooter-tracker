package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import j$.util.Objects;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Collections2 {

    static class FilteredCollection<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection f29338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Predicate f29339c;

        FilteredCollection(Collection collection, Predicate predicate) {
            this.f29338b = collection;
            this.f29339c = predicate;
        }

        FilteredCollection a(Predicate predicate) {
            return new FilteredCollection(this.f29338b, Predicates.and(this.f29339c, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness E e10) {
            Preconditions.checkArgument(this.f29339c.apply(e10));
            return this.f29338b.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.checkArgument(this.f29339c.apply(it.next()));
            }
            return this.f29338b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.removeIf(this.f29338b, this.f29339c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Collections2.f(this.f29338b, obj)) {
                return this.f29339c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Collections2.b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.any(this.f29338b, this.f29339c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.filter(this.f29338b.iterator(), this.f29339c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f29338b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f29338b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f29339c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f29338b.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f29339c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f29338b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f29339c.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    private static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableList f29340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Comparator f29341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f29342d;

        OrderedPermutationCollection(Iterable iterable, Comparator comparator) {
            ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, iterable);
            this.f29340b = immutableListSortedCopyOf;
            this.f29341c = comparator;
            this.f29342d = a(immutableListSortedCopyOf, comparator);
        }

        private static int a(List list, Comparator comparator) {
            int i10 = 1;
            int iSaturatedMultiply = 1;
            int i11 = 1;
            while (i10 < list.size()) {
                if (comparator.compare(list.get(i10 - 1), list.get(i10)) < 0) {
                    iSaturatedMultiply = IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i10, i11));
                    if (iSaturatedMultiply == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i11 = 0;
                }
                i10++;
                i11++;
            }
            return IntMath.saturatedMultiply(iSaturatedMultiply, IntMath.binomial(i10, i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.d(this.f29340b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new OrderedPermutationIterator(this.f29340b, this.f29341c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f29342d;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(" + this.f29340b + ")";
        }
    }

    private static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f29343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Comparator f29344e;

        OrderedPermutationIterator(List list, Comparator comparator) {
            this.f29343d = Lists.newArrayList(list);
            this.f29344e = comparator;
        }

        void c() {
            int iE = e();
            if (iE == -1) {
                this.f29343d = null;
                return;
            }
            Objects.requireNonNull(this.f29343d);
            Collections.swap(this.f29343d, iE, f(iE));
            Collections.reverse(this.f29343d.subList(iE + 1, this.f29343d.size()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List computeNext() {
            List list = this.f29343d;
            if (list == null) {
                return (List) a();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
            c();
            return immutableListCopyOf;
        }

        int e() {
            Objects.requireNonNull(this.f29343d);
            for (int size = this.f29343d.size() - 2; size >= 0; size--) {
                if (this.f29344e.compare(this.f29343d.get(size), this.f29343d.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        int f(int i10) {
            Objects.requireNonNull(this.f29343d);
            Object obj = this.f29343d.get(i10);
            for (int size = this.f29343d.size() - 1; size > i10; size--) {
                if (this.f29344e.compare(obj, this.f29343d.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    private static final class PermutationCollection<E> extends AbstractCollection<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableList f29345b;

        PermutationCollection(ImmutableList immutableList) {
            this.f29345b = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            return Collections2.d(this.f29345b, (List) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new PermutationIterator(this.f29345b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return IntMath.factorial(this.f29345b.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(" + this.f29345b + ")";
        }
    }

    private static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List f29346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int[] f29347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int[] f29348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29349g;

        PermutationIterator(List list) {
            this.f29346d = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.f29347e = iArr;
            int[] iArr2 = new int[size];
            this.f29348f = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.f29349g = Integer.MAX_VALUE;
        }

        void c() {
            int size = this.f29346d.size() - 1;
            this.f29349g = size;
            if (size == -1) {
                return;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f29347e;
                int i11 = this.f29349g;
                int i12 = iArr[i11];
                int i13 = this.f29348f[i11] + i12;
                if (i13 < 0) {
                    e();
                } else if (i13 != i11 + 1) {
                    Collections.swap(this.f29346d, (i11 - i12) + i10, (i11 - i13) + i10);
                    this.f29347e[this.f29349g] = i13;
                    return;
                } else {
                    if (i11 == 0) {
                        return;
                    }
                    i10++;
                    e();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List computeNext() {
            if (this.f29349g <= 0) {
                return (List) a();
            }
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f29346d);
            c();
            return immutableListCopyOf;
        }

        void e() {
            int[] iArr = this.f29348f;
            int i10 = this.f29349g;
            iArr[i10] = -iArr[i10];
            this.f29349g = i10 - 1;
        }
    }

    static class TransformedCollection<F, T> extends AbstractCollection<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection f29350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Function f29351c;

        TransformedCollection(Collection collection, Function function) {
            this.f29350b = (Collection) Preconditions.checkNotNull(collection);
            this.f29351c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f29350b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f29350b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.transform(this.f29350b.iterator(), this.f29351c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f29350b.size();
        }
    }

    static boolean b(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static ObjectCountHashMap c(Collection collection) {
        ObjectCountHashMap objectCountHashMap = new ObjectCountHashMap();
        for (Object obj : collection) {
            objectCountHashMap.put(obj, objectCountHashMap.get(obj) + 1);
        }
        return objectCountHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        ObjectCountHashMap objectCountHashMapC = c(list);
        ObjectCountHashMap objectCountHashMapC2 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (objectCountHashMapC.i(i10) != objectCountHashMapC2.get(objectCountHashMapC.g(i10))) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder e(int i10) {
        CollectPreconditions.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
    }

    static boolean f(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        return collection instanceof FilteredCollection ? ((FilteredCollection) collection).a(predicate) : new FilteredCollection((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    static boolean g(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static String h(Collection collection) {
        StringBuilder sbE = e(collection.size());
        sbE.append('[');
        boolean z10 = true;
        for (Object obj : collection) {
            if (!z10) {
                sbE.append(", ");
            }
            if (obj == collection) {
                sbE.append("(this Collection)");
            } else {
                sbE.append(obj);
            }
            z10 = false;
        }
        sbE.append(']');
        return sbE.toString();
    }

    public static <E extends Comparable<? super E>> Collection<List<E>> orderedPermutations(Iterable<E> iterable) {
        return orderedPermutations(iterable, Ordering.natural());
    }

    public static <E> Collection<List<E>> permutations(Collection<E> collection) {
        return new PermutationCollection(ImmutableList.copyOf((Collection) collection));
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new TransformedCollection(collection, function);
    }

    public static <E> Collection<List<E>> orderedPermutations(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new OrderedPermutationCollection(iterable, comparator);
    }
}
