package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Multisets {

    static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        AbstractEntry() {
        }

        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (getCount() == entry.getCount() && Objects.equal(getElement(), entry.getElement())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    private static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Comparator f30076b = new DecreasingCount();

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        ElementSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return e().containsAll(collection);
        }

        abstract Multiset e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return e().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().entrySet().size();
        }
    }

    static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && e().count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        abstract Multiset e();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return e().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    private static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Multiset f30077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Predicate f30078e;

        FilteredMultiset(Multiset multiset, Predicate predicate) {
            super();
            this.f30077d = (Multiset) Preconditions.checkNotNull(multiset);
            this.f30078e = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e10, int i10) {
            Preconditions.checkArgument(this.f30078e.apply(e10), "Element %s does not match predicate %s", e10, this.f30078e);
            return this.f30077d.add(e10, i10);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int iCount = this.f30077d.count(obj);
            if (iCount <= 0 || !this.f30078e.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set createEntrySet() {
            return Sets.filter(this.f30077d.entrySet(), new Predicate<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.FilteredMultiset.1
                @Override // com.google.common.base.Predicate
                public boolean apply(Multiset.Entry<E> entry) {
                    return FilteredMultiset.this.f30078e.apply(entry.getElement());
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set g() {
            return Sets.filter(this.f30077d.elementSet(), this.f30078e);
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator j() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator k() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i10) {
            CollectPreconditions.b(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f30077d.remove(obj, i10);
            }
            return 0;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
            return Iterators.filter(this.f30077d.iterator(), this.f30078e);
        }
    }

    static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f30080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30081c;

        ImmutableEntry(Object obj, int i10) {
            this.f30080b = obj;
            this.f30081c = i10;
            CollectPreconditions.b(i10, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f30081c;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public final E getElement() {
            return (E) this.f30080b;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Multiset f30082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator f30083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Multiset.Entry f30084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f30085e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f30086f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f30087g;

        MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.f30082b = multiset;
            this.f30083c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30085e > 0 || this.f30083c.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f30085e == 0) {
                Multiset.Entry entry = (Multiset.Entry) this.f30083c.next();
                this.f30084d = entry;
                int count = entry.getCount();
                this.f30085e = count;
                this.f30086f = count;
            }
            this.f30085e--;
            this.f30087g = true;
            Multiset.Entry entry2 = this.f30084d;
            j$.util.Objects.requireNonNull(entry2);
            return (E) entry2.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.e(this.f30087g);
            if (this.f30086f == 1) {
                this.f30083c.remove();
            } else {
                Multiset multiset = this.f30082b;
                Multiset.Entry entry = this.f30084d;
                j$.util.Objects.requireNonNull(entry);
                multiset.remove(entry.getElement());
            }
            this.f30086f--;
            this.f30087g = false;
        }
    }

    static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Multiset f30088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        transient Set f30089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Set f30090d;

        UnmodifiableMultiset(Multiset multiset) {
            this.f30088b = multiset;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.f30089c;
            if (set != null) {
                return set;
            }
            Set<E> setO = o();
            this.f30089c = setO;
            return setO;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.f30090d;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f30088b.entrySet());
            this.f30090d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.f30088b.iterator());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
        public Multiset n() {
            return this.f30088b;
        }

        Set o() {
            return DesugarCollections.unmodifiableSet(this.f30088b.elementSet());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@ParametricNullness E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@ParametricNullness E e10, int i10, int i11) {
            throw new UnsupportedOperationException();
        }
    }

    private static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        int i() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.i(this);
        }
    }

    private static boolean a(Multiset multiset, AbstractMapBasedMultiset abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.l(multiset);
        return true;
    }

    private static boolean b(Multiset multiset, Multiset multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return a(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    static boolean c(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return b(multiset, d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        for (Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, DecreasingCount.f30076b);
        return ImmutableMultiset.m(Arrays.asList(entryArr));
    }

    static Multiset d(Iterable iterable) {
        return (Multiset) iterable;
    }

    public static <E> Multiset<E> difference(final Multiset<E> multiset, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int iCount = multiset.count(obj);
                if (iCount == 0) {
                    return 0;
                }
                return Math.max(0, iCount - multiset2.count(obj));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            int i() {
                return Iterators.size(k());
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator j() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<E>(this) { // from class: com.google.common.collect.Multisets.4.1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass4 f30073e;

                    {
                        this.f30073e = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            if (entry.getCount() > multiset2.count(element)) {
                                return element;
                            }
                        }
                        return a();
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator k() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.4.2

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass4 f30075e;

                    {
                        this.f30075e = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Multiset.Entry computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int count = entry.getCount() - multiset2.count(element);
                            if (count > 0) {
                                return Multisets.immutableEntry(element, count);
                            }
                        }
                        return (Multiset.Entry) a();
                    }
                };
            }
        };
    }

    static Iterator e(Iterator it) {
        return new TransformedIterator<Multiset.Entry<Object>, Object>(it) { // from class: com.google.common.collect.Multisets.5
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object a(Multiset.Entry entry) {
                return entry.getElement();
            }
        };
    }

    static boolean f(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
        if (!(multiset instanceof FilteredMultiset)) {
            return new FilteredMultiset(multiset, predicate);
        }
        FilteredMultiset filteredMultiset = (FilteredMultiset) multiset;
        return new FilteredMultiset(filteredMultiset.f30077d, Predicates.and(filteredMultiset.f30078e, predicate));
    }

    static int g(Iterable iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    static Iterator h(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static int i(Multiset multiset) {
        Iterator it = multiset.entrySet().iterator();
        long count = 0;
        while (it.hasNext()) {
            count += (long) ((Multiset.Entry) it.next()).getCount();
        }
        return Ints.saturatedCast(count);
    }

    public static <E> Multiset.Entry<E> immutableEntry(@ParametricNullness E e10, int i10) {
        return new ImmutableEntry(e10, i10);
    }

    public static <E> Multiset<E> intersection(final Multiset<E> multiset, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int iCount = multiset.count(obj);
                if (iCount == 0) {
                    return 0;
                }
                return Math.min(iCount, multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            Set g() {
                return Sets.intersection(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator j() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator k() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.2.1

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f30064e;

                    {
                        this.f30064e = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Multiset.Entry computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int iMin = Math.min(entry.getCount(), multiset2.count(element));
                            if (iMin > 0) {
                                return Multisets.immutableEntry(element, iMin);
                            }
                        }
                        return (Multiset.Entry) a();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean j(Multiset multiset, Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean k(Multiset multiset, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    private static boolean l(Multiset multiset, Multiset multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator it = multiset.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            int iCount = multiset2.count(entry.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < entry.getCount()) {
                multiset.setCount(entry.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }

    static int m(Multiset multiset, Object obj, int i10) {
        CollectPreconditions.b(i10, "count");
        int iCount = multiset.count(obj);
        int i11 = i10 - iCount;
        if (i11 > 0) {
            multiset.add(obj, i11);
            return iCount;
        }
        if (i11 < 0) {
            multiset.remove(obj, -i11);
        }
        return iCount;
    }

    static boolean n(Multiset multiset, Object obj, int i10, int i11) {
        CollectPreconditions.b(i10, "oldCount");
        CollectPreconditions.b(i11, "newCount");
        if (multiset.count(obj) != i10) {
            return false;
        }
        multiset.setCount(obj, i11);
        return true;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return removeOccurrences(multiset, (Multiset<?>) iterable);
        }
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multiset.remove(it.next());
        }
        return zRemove;
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        return l(multiset, multiset2);
    }

    public static <E> Multiset<E> sum(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                return multiset.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return multiset.count(obj) + multiset2.count(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset
            Set g() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator j() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator k() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                final Iterator<Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.3.1

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass3 f30069f;

                    {
                        this.f30069f = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Multiset.Entry computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, entry.getCount() + multiset2.count(element));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return (Multiset.Entry) a();
                    }
                };
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return IntMath.saturatedAdd(multiset.size(), multiset2.size());
            }
        };
    }

    @IgnoreJRERequirement
    public static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        return CollectCollectors.Y(function, toIntFunction, supplier);
    }

    public static <E> Multiset<E> union(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                return multiset.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return Math.max(multiset.count(obj), multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            Set g() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator j() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            Iterator k() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                final Iterator<Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.Multisets.1.1

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f30060f;

                    {
                        this.f30060f = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Multiset.Entry computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, Math.max(entry.getCount(), multiset2.count(element)));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return (Multiset.Entry) a();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new UnmodifiableMultiset((Multiset) Preconditions.checkNotNull(multiset));
    }

    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.checkNotNull(sortedMultiset));
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
        return (Multiset) Preconditions.checkNotNull(immutableMultiset);
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<?>> it = multiset.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Multiset.Entry<?> next = it.next();
            int iCount = multiset2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                multiset.remove(next.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }
}
