package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class FluentIterable<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Optional f29486b;

    private static class FromIterableFunction<E> implements Function<Iterable<E>, FluentIterable<E>> {
        @Override // com.google.common.base.Function
        public FluentIterable<E> apply(Iterable<E> iterable) {
            return FluentIterable.from(iterable);
        }
    }

    protected FluentIterable() {
        this.f29486b = Optional.absent();
    }

    private static FluentIterable a(final Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            Preconditions.checkNotNull(iterable);
        }
        return new FluentIterable<Object>() { // from class: com.google.common.collect.FluentIterable.3
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return Iterators.concat(new AbstractIndexedListIterator<Iterator<Object>>(iterableArr.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Iterator<Object> get(int i10) {
                        return iterableArr[i10].iterator();
                    }
                });
            }
        };
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a(iterable, iterable2);
    }

    private Iterable e() {
        return (Iterable) this.f29486b.or(this);
    }

    public static <E> FluentIterable<E> from(final Iterable<E> iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<E>(iterable) { // from class: com.google.common.collect.FluentIterable.1
            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static <E> FluentIterable<E> of() {
        return from(Collections.EMPTY_LIST);
    }

    public final boolean allMatch(Predicate<? super E> predicate) {
        return Iterables.all(e(), predicate);
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Iterables.any(e(), predicate);
    }

    public final FluentIterable<E> append(Iterable<? extends E> iterable) {
        return concat(e(), iterable);
    }

    public final boolean contains(Object obj) {
        return Iterables.contains(e(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public final <C extends Collection<? super E>> C copyInto(C c10) {
        Preconditions.checkNotNull(c10);
        Iterable iterableE = e();
        if (iterableE instanceof Collection) {
            c10.addAll((Collection) iterableE);
            return c10;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public final FluentIterable<E> cycle() {
        return from(Iterables.cycle(e()));
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Iterables.filter(e(), predicate));
    }

    public final Optional<E> first() {
        Iterator it = e().iterator();
        return it.hasNext() ? Optional.of(it.next()) : Optional.absent();
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Iterables.tryFind(e(), predicate);
    }

    @ParametricNullness
    public final E get(int i10) {
        return (E) Iterables.get(e(), i10);
    }

    public final <K> ImmutableListMultimap<K, E> index(Function<? super E, K> function) {
        return Multimaps.index(e(), function);
    }

    public final boolean isEmpty() {
        return !e().iterator().hasNext();
    }

    public final String join(Joiner joiner) {
        return joiner.join(this);
    }

    public final Optional<E> last() {
        Object next;
        Iterable iterableE = e();
        if (iterableE instanceof List) {
            List list = (List) iterableE;
            return list.isEmpty() ? Optional.absent() : Optional.of(list.get(list.size() - 1));
        }
        Iterator it = iterableE.iterator();
        if (!it.hasNext()) {
            return Optional.absent();
        }
        if (iterableE instanceof SortedSet) {
            return Optional.of(((SortedSet) iterableE).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return Optional.of(next);
    }

    public final FluentIterable<E> limit(int i10) {
        return from(Iterables.limit(e(), i10));
    }

    public final int size() {
        return Iterables.size(e());
    }

    public final FluentIterable<E> skip(int i10) {
        return from(Iterables.skip(e(), i10));
    }

    @GwtIncompatible
    public final E[] toArray(Class<E> cls) {
        return (E[]) Iterables.toArray(e(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(e());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
        return Maps.toMap(e(), function);
    }

    public final ImmutableMultiset<E> toMultiset() {
        return ImmutableMultiset.copyOf(e());
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(e());
    }

    public final ImmutableList<E> toSortedList(Comparator<? super E> comparator) {
        return Ordering.from(comparator).immutableSortedCopy(e());
    }

    public final ImmutableSortedSet<E> toSortedSet(Comparator<? super E> comparator) {
        return ImmutableSortedSet.copyOf(comparator, e());
    }

    public String toString() {
        return Iterables.toString(e());
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Iterables.transform(e(), function));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        return concat(transform(function));
    }

    public final <K> ImmutableMap<K, E> uniqueIndex(Function<? super E, K> function) {
        return Maps.uniqueIndex(e(), function);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return a(iterable, iterable2, iterable3);
    }

    public static <E> FluentIterable<E> of(@ParametricNullness E e10, E... eArr) {
        return from(Lists.asList(e10, eArr));
    }

    public final FluentIterable<E> append(E... eArr) {
        return concat(e(), Arrays.asList(eArr));
    }

    @GwtIncompatible
    public final <T> FluentIterable<T> filter(Class<T> cls) {
        return from(Iterables.filter((Iterable<?>) e(), cls));
    }

    FluentIterable(Iterable iterable) {
        this.f29486b = Optional.of(iterable);
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return a(iterable, iterable2, iterable3, iterable4);
    }

    @SafeVarargs
    public static <T> FluentIterable<T> concat(Iterable<? extends T>... iterableArr) {
        return a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <E> FluentIterable<E> from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <T> FluentIterable<T> concat(final Iterable<? extends Iterable<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable<T>() { // from class: com.google.common.collect.FluentIterable.2
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return Iterators.concat(Iterators.transform(iterable.iterator(), new f2()));
            }
        };
    }

    @InlineMe(replacement = "checkNotNull(iterable)", staticImports = {"com.google.common.base.Preconditions.checkNotNull"})
    @Deprecated
    public static <E> FluentIterable<E> from(FluentIterable<E> fluentIterable) {
        return (FluentIterable) Preconditions.checkNotNull(fluentIterable);
    }
}
