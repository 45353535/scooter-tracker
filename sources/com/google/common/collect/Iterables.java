package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Iterables {

    private static final class UnmodifiableIterable<T> extends FluentIterable<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterable f29736c;

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.unmodifiableIterator(this.f29736c.iterator());
        }

        @Override // com.google.common.collect.FluentIterable
        public String toString() {
            return this.f29736c.toString();
        }

        private UnmodifiableIterable(Iterable iterable) {
            this.f29736c = iterable;
        }
    }

    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : Iterators.addAll(collection, ((Iterable) Preconditions.checkNotNull(iterable)).iterator());
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    private static Object b(List list) {
        return list.get(list.size() - 1);
    }

    static Object c(Iterable iterable, Predicate predicate) {
        Preconditions.checkNotNull(predicate);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return FluentIterable.concat(iterable, iterable2);
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.8
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = iterable;
                return iterable2 instanceof Queue ? new ConsumingQueueIterator((Queue) iterable2) : Iterators.consumingIterator(iterable2.iterator());
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return "Iterables.consumingIterable(...)";
            }
        };
    }

    public static boolean contains(Iterable<? extends Object> iterable, Object obj) {
        return iterable instanceof Collection ? Collections2.f((Collection) iterable, obj) : Iterators.contains(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.1
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.cycle(iterable);
            }

            @Override // com.google.common.collect.FluentIterable
            public String toString() {
                return iterable.toString() + " (cycled)";
            }
        };
    }

    private static boolean d(List list, Predicate predicate) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!predicate.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        e(list, predicate, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        e(list, predicate, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void e(List list, Predicate predicate, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        if ((iterable instanceof Collection) && (iterable2 instanceof Collection) && ((Collection) iterable).size() != ((Collection) iterable2).size()) {
            return false;
        }
        return Iterators.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    static Object[] f(Iterable iterable) {
        return a(iterable).toArray();
    }

    public static <T> Iterable<T> filter(final Iterable<T> iterable, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.4
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.filter(iterable.iterator(), predicate);
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
        return (T) Iterators.find(iterable.iterator(), predicate);
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        return iterable instanceof Multiset ? ((Multiset) iterable).count(obj) : iterable instanceof Set ? ((Set) iterable).contains(obj) ? 1 : 0 : Iterators.frequency(iterable.iterator(), obj);
    }

    static Object[] g(Iterable iterable, Object[] objArr) {
        return a(iterable).toArray(objArr);
    }

    @ParametricNullness
    public static <T> T get(Iterable<T> iterable, int i10) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) Iterators.get(iterable.iterator(), i10);
    }

    @ParametricNullness
    public static <T> T getFirst(Iterable<? extends T> iterable, @ParametricNullness T t10) {
        return (T) Iterators.getNext(iterable.iterator(), t10);
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) Iterators.getLast(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) b(list);
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return (T) Iterators.getOnlyElement(iterable.iterator());
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int i10) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i10 >= 0, "limit is negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.7
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.limit(iterable.iterator(), i10);
            }
        };
    }

    public static <T> Iterable<T> mergeSorted(final Iterable<? extends Iterable<? extends T>> iterable, final Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterables");
        Preconditions.checkNotNull(comparator, "comparator");
        return new UnmodifiableIterable(new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.9
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.mergeSorted(Iterables.transform(iterable, new f2()), comparator);
            }
        });
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int i10) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i10 > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.3
            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.paddedPartition(iterable.iterator(), i10);
            }
        };
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int i10) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i10 > 0);
        return new FluentIterable<List<T>>() { // from class: com.google.common.collect.Iterables.2
            @Override // java.lang.Iterable
            public Iterator<List<T>> iterator() {
                return Iterators.partition(iterable.iterator(), i10);
            }
        };
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) Preconditions.checkNotNull(collection)) : Iterators.removeAll(iterable.iterator(), collection);
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? d((List) iterable, (Predicate) Preconditions.checkNotNull(predicate)) : Iterators.removeIf(iterable.iterator(), predicate);
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) Preconditions.checkNotNull(collection)) : Iterators.retainAll(iterable.iterator(), collection);
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : Iterators.size(iterable.iterator());
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int i10) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i10 >= 0, "number to skip cannot be negative");
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.6
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                Iterable iterable2 = iterable;
                if (iterable2 instanceof List) {
                    List list = (List) iterable2;
                    return list.subList(Math.min(list.size(), i10), list.size()).iterator();
                }
                final Iterator<T> it = iterable2.iterator();
                Iterators.advance(it, i10);
                return new Iterator<T>(this) { // from class: com.google.common.collect.Iterables.6.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    boolean f29728b = true;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass6 f29730d;

                    {
                        this.f29730d = this;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    @ParametricNullness
                    public T next() {
                        T t10 = (T) it.next();
                        this.f29728b = false;
                        return t10;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        CollectPreconditions.e(!this.f29728b);
                        it.remove();
                    }
                };
            }
        };
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        return (T[]) g(iterable, ObjectArrays.newArray(cls, 0));
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable<T>() { // from class: com.google.common.collect.Iterables.5
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.transform(iterable.iterator(), function);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Iterable<T> unmodifiableIterable(Iterable<? extends T> iterable) {
        Preconditions.checkNotNull(iterable);
        return ((iterable instanceof UnmodifiableIterable) || (iterable instanceof ImmutableCollection)) ? iterable : new UnmodifiableIterable(iterable);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return FluentIterable.concat(iterable, iterable2, iterable3);
    }

    public static <T> T find(Iterable<? extends T> iterable, Predicate<? super T> predicate, T t10) {
        return (T) Iterators.find(iterable.iterator(), predicate, t10);
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterable<? extends T> iterable, @ParametricNullness T t10) {
        return (T) Iterators.getOnlyElement(iterable.iterator(), t10);
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return FluentIterable.concat(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @SafeVarargs
    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return FluentIterable.concat(iterableArr);
    }

    @GwtIncompatible
    public static <T> Iterable<T> filter(Iterable<?> iterable, Class<T> cls) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(cls);
        return filter(iterable, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <E> Iterable<E> unmodifiableIterable(ImmutableCollection<E> immutableCollection) {
        return (Iterable) Preconditions.checkNotNull(immutableCollection);
    }

    public static <T> Iterable<T> concat(Iterable<? extends Iterable<? extends T>> iterable) {
        return FluentIterable.concat(iterable);
    }

    @ParametricNullness
    public static <T> T get(Iterable<? extends T> iterable, int i10, @ParametricNullness T t10) {
        Preconditions.checkNotNull(iterable);
        Iterators.a(i10);
        if (iterable instanceof List) {
            List listA = Lists.a(iterable);
            return i10 < listA.size() ? (T) listA.get(i10) : t10;
        }
        Iterator<? extends T> it = iterable.iterator();
        Iterators.advance(it, i10);
        return (T) Iterators.getNext(it, t10);
    }

    @ParametricNullness
    public static <T> T getLast(Iterable<? extends T> iterable, @ParametricNullness T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) b(Lists.a(iterable));
            }
        }
        return (T) Iterators.getLast(iterable.iterator(), t10);
    }
}
