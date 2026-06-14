package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Iterators {

    private static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final UnmodifiableListIterator f29754e = new ArrayItr(new Object[0], 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f29755d;

        ArrayItr(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.f29755d = objArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected Object get(int i10) {
            return this.f29755d[i10];
        }
    }

    private static class ConcatenatedIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f29756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f29757c = Iterators.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Iterator f29758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Deque f29759e;

        ConcatenatedIterator(Iterator it) {
            this.f29758d = (Iterator) Preconditions.checkNotNull(it);
        }

        private Iterator a() {
            while (true) {
                Iterator it = this.f29758d;
                if (it != null && it.hasNext()) {
                    return this.f29758d;
                }
                Deque deque = this.f29759e;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f29758d = (Iterator) this.f29759e.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.f29757c)).hasNext()) {
                Iterator itA = a();
                this.f29758d = itA;
                if (itA == null) {
                    return false;
                }
                Iterator it = (Iterator) itA.next();
                this.f29757c = it;
                if (it instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) it;
                    this.f29757c = concatenatedIterator.f29757c;
                    if (this.f29759e == null) {
                        this.f29759e = new ArrayDeque();
                    }
                    this.f29759e.addFirst(this.f29758d);
                    if (concatenatedIterator.f29759e != null) {
                        while (!concatenatedIterator.f29759e.isEmpty()) {
                            this.f29759e.addFirst((Iterator) concatenatedIterator.f29759e.removeLast());
                        }
                    }
                    this.f29758d = concatenatedIterator.f29758d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f29757c;
            this.f29756b = it;
            return (T) it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator it = this.f29756b;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f29756b = null;
        }
    }

    private enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MergingIterator<T> extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue f29761b;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f29761b = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.p2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return comparator.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f29761b.add(Iterators.peekingIterator(it));
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f29761b.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator peekingIterator = (PeekingIterator) this.f29761b.remove();
            T t10 = (T) peekingIterator.next();
            if (peekingIterator.hasNext()) {
                this.f29761b.add(peekingIterator);
            }
            return t10;
        }
    }

    private static class PeekingImpl<E> implements PeekingIterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f29762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f29764d;

        public PeekingImpl(Iterator<? extends E> it) {
            this.f29762b = (Iterator) Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29763c || this.f29762b.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.f29763c) {
                return (E) this.f29762b.next();
            }
            E e10 = (E) NullnessCasts.a(this.f29764d);
            this.f29763c = false;
            this.f29764d = null;
            return e10;
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.f29763c) {
                this.f29764d = this.f29762b.next();
                this.f29763c = true;
            }
            return (E) NullnessCasts.a(this.f29764d);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.f29763c, "Can't remove after you've peeked at next");
            this.f29762b.remove();
        }
    }

    private static final class SingletonIterator<T> extends UnmodifiableIterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f29766c;

        SingletonIterator(Object obj) {
            this.f29765b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f29766c;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (this.f29766c) {
                throw new NoSuchElementException();
            }
            this.f29766c = true;
            return (T) this.f29765b;
        }
    }

    static void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i10 + ") must not be negative");
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i10) {
        Preconditions.checkNotNull(it);
        int i11 = 0;
        Preconditions.checkArgument(i10 >= 0, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
        return indexOf(it, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) it.next();
            }
        };
    }

    static void b(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    static Iterator c(Iterator... itArr) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it);
        }
        return concat(d(itArr));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return concat(d(it, it2));
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t10 = (T) it.next();
                it.remove();
                return t10;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Iterator f29739b = Iterators.g();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29739b.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.f29739b.hasNext()) {
                    Iterator<T> it = iterable.iterator();
                    this.f29739b = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return (T) this.f29739b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f29739b.remove();
            }
        };
    }

    private static Iterator d(final Iterator... itArr) {
        return new UnmodifiableIterator<Iterator<?>>() { // from class: com.google.common.collect.Iterators.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f29741b = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29741b < itArr.length;
            }

            @Override // java.util.Iterator
            public Iterator<?> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator<?> it = itArr[this.f29741b];
                Objects.requireNonNull(it);
                Iterator<?> it2 = it;
                Iterator[] itArr2 = itArr;
                int i10 = this.f29741b;
                itArr2[i10] = null;
                this.f29741b = i10 + 1;
                return it2;
            }
        };
    }

    static UnmodifiableIterator e() {
        return f();
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static UnmodifiableListIterator f() {
        return ArrayItr.f29754e;
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            protected Object computeNext() {
                while (it.hasNext()) {
                    Object next = it.next();
                    if (predicate.apply(next)) {
                        return next;
                    }
                }
                return a();
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return h(tArr, 0);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i10 = 0;
        while (contains(it, obj)) {
            i10++;
        }
        return i10;
    }

    static Iterator g() {
        return EmptyModifiableIterator.INSTANCE;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it, int i10) {
        a(i10);
        int iAdvance = advance(it, i10);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i10 + ") must be less than the number of elements that remained (" + iAdvance + ")");
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it, @ParametricNullness T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    static UnmodifiableListIterator h(Object[] objArr, int i10) {
        if (objArr.length != 0) {
            return new ArrayItr(objArr, i10);
        }
        Preconditions.checkPositionIndex(i10, objArr.length);
        return f();
    }

    private static UnmodifiableIterator i(final Iterator it, final int i10, final boolean z10) {
        Preconditions.checkNotNull(it);
        Preconditions.checkArgument(i10 > 0);
        return new UnmodifiableIterator<List<Object>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public List<Object> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[i10];
                int i11 = 0;
                while (i11 < i10 && it.hasNext()) {
                    objArr[i11] = it.next();
                    i11++;
                }
                for (int i12 = i11; i12 < i10; i12++) {
                    objArr[i12] = null;
                }
                List<Object> listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(objArr));
                return (z10 || i11 == i10) ? listUnmodifiableList : listUnmodifiableList.subList(0, i11);
            }
        };
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static Object j(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it, final int i10) {
        Preconditions.checkNotNull(it);
        Preconditions.checkArgument(i10 >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f29749b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29749b < i10 && it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f29749b++;
                return (T) it.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i10) {
        return i(it, i10, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i10) {
        return i(it, i10, false);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z10 = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T t10) {
        return new SingletonIterator(t10);
    }

    public static int size(Iterator<?> it) {
        long j10 = 0;
        while (it.hasNext()) {
            it.next();
            j10++;
        }
        return Ints.saturatedCast(j10);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            Object a(Object obj) {
                return function.apply(obj);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it) {
        Preconditions.checkNotNull(it);
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it.next();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t10) {
        return it.hasNext() ? (T) getLast(it) : t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(d(it, it2, it3));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i10, @ParametricNullness T t10) {
        a(i10);
        advance(it, i10);
        return (T) getNext(it, t10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, T t10) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t10;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(d(it, it2, it3, it4));
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t10) {
        return it.hasNext() ? (T) getOnlyElement(it) : t10;
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return c((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new ConcatenatedIterator(it);
    }
}
