package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Lists {

    /* JADX INFO: renamed from: com.google.common.collect.Lists$1, reason: invalid class name */
    class AnonymousClass1 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return this.f29828b.listIterator(i10);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Lists$2, reason: invalid class name */
    class AnonymousClass2 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i10) {
            return this.f29828b.listIterator(i10);
        }
    }

    private static class AbstractListWrapper<E> extends AbstractList<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f29828b;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, @ParametricNullness E e10) {
            this.f29828b.add(i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            return this.f29828b.addAll(i10, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f29828b.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i10) {
            return (E) this.f29828b.get(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i10) {
            return (E) this.f29828b.remove(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i10, @ParametricNullness E e10) {
            return (E) this.f29828b.set(i10, e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29828b.size();
        }
    }

    private static final class CharSequenceAsList extends AbstractList<Character> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f29829b;

        CharSequenceAsList(CharSequence charSequence) {
            this.f29829b = charSequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29829b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Character.valueOf(this.f29829b.charAt(i10));
        }
    }

    private static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f29831c;

        OnePlusArrayList(Object obj, Object[] objArr) {
            this.f29830b = obj;
            this.f29831c = (Object[]) Preconditions.checkNotNull(objArr);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return i10 == 0 ? (E) this.f29830b : (E) this.f29831c[i10 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.f29831c.length, 1);
        }
    }

    private static class Partition<T> extends AbstractList<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f29832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29833c;

        Partition(List list, int i10) {
            this.f29832b = list;
            this.f29833c = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f29832b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.f29832b.size(), this.f29833c, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            int i11 = this.f29833c;
            int i12 = i10 * i11;
            return this.f29832b.subList(i12, Math.min(i11 + i12, this.f29832b.size()));
        }
    }

    private static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    private static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        RandomAccessPartition(List list, int i10) {
            super(list, i10);
        }
    }

    private static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        RandomAccessReverseList(List list) {
            super(list);
        }
    }

    private static class ReverseList<T> extends AbstractList<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f29834b;

        ReverseList(List list) {
            this.f29834b = (List) Preconditions.checkNotNull(list);
        }

        private int f(int i10) {
            int size = size();
            Preconditions.checkElementIndex(i10, size);
            return (size - 1) - i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g(int i10) {
            int size = size();
            Preconditions.checkPositionIndex(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, @ParametricNullness T t10) {
            this.f29834b.add(g(i10), t10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f29834b.clear();
        }

        List e() {
            return this.f29834b;
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i10) {
            return (T) this.f29834b.get(f(i10));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            final ListIterator listIterator = this.f29834b.listIterator(g(i10));
            return new ListIterator<T>(this) { // from class: com.google.common.collect.Lists.ReverseList.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                boolean f29835b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ReverseList f29837d;

                {
                    this.f29837d = this;
                }

                @Override // java.util.ListIterator
                public void add(@ParametricNullness T t10) {
                    listIterator.add(t10);
                    listIterator.previous();
                    this.f29835b = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f29835b = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.f29837d.g(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                @ParametricNullness
                public T previous() {
                    if (!hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.f29835b = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.e(this.f29835b);
                    listIterator.remove();
                    this.f29835b = false;
                }

                @Override // java.util.ListIterator
                public void set(@ParametricNullness T t10) {
                    Preconditions.checkState(this.f29835b);
                    listIterator.set(t10);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i10) {
            return (T) this.f29834b.remove(f(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i10, @ParametricNullness T t10) {
            return (T) this.f29834b.set(f(i10), t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29834b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            return Lists.reverse(this.f29834b.subList(g(i11), g(i10)));
        }
    }

    private static final class StringAsImmutableList extends ImmutableList<Character> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f29838d;

        StringAsImmutableList(String str) {
            this.f29838d = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f29838d.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f29838d.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29838d.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.List
        public Character get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return Character.valueOf(this.f29838d.charAt(i10));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            return Lists.charactersOf(this.f29838d.substring(i10, i11));
        }
    }

    private static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f29839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Function f29840c;

        TransformingRandomAccessList(List list, Function function) {
            this.f29839b = (List) Preconditions.checkNotNull(list);
            this.f29840c = (Function) Preconditions.checkNotNull(function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i10) {
            return (T) this.f29840c.apply(this.f29839b.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f29839b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new TransformedListIterator<F, T>(this.f29839b.listIterator(i10)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                Object a(Object obj) {
                    return TransformingRandomAccessList.this.f29840c.apply(obj);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return (T) this.f29840c.apply(this.f29839b.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f29839b.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29839b.size();
        }
    }

    private static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f29842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Function f29843c;

        TransformingSequentialList(List list, Function function) {
            this.f29842b = (List) Preconditions.checkNotNull(list);
            this.f29843c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f29842b.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new TransformedListIterator<F, T>(this.f29842b.listIterator(i10)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                Object a(Object obj) {
                    return TransformingSequentialList.this.f29843c.apply(obj);
                }
            };
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f29842b.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29842b.size();
        }
    }

    private static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f29846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object[] f29847d;

        TwoPlusArrayList(Object obj, Object obj2, Object[] objArr) {
            this.f29845b = obj;
            this.f29846c = obj2;
            this.f29847d = (Object[]) Preconditions.checkNotNull(objArr);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i10) {
            if (i10 == 0) {
                return (E) this.f29845b;
            }
            if (i10 == 1) {
                return (E) this.f29846c;
            }
            Preconditions.checkElementIndex(i10, size());
            return (E) this.f29847d[i10 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.f29847d.length, 2);
        }
    }

    static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static <E> List<E> asList(@ParametricNullness E e10, E[] eArr) {
        return new OnePlusArrayList(e10, eArr);
    }

    static int b(int i10) {
        CollectPreconditions.b(i10, "arraySize");
        return Ints.saturatedCast(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    static boolean c(List list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equal(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.e(list);
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i10) {
        CollectPreconditions.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i10) {
        return new ArrayList<>(b(i10));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i10) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(i10 > 0);
        return list instanceof RandomAccess ? new RandomAccessPartition(list, i10) : new Partition(list, i10);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).reverse() : list instanceof ReverseList ? ((ReverseList) list).e() : list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    public static <E> List<E> asList(@ParametricNullness E e10, @ParametricNullness E e11, E[] eArr) {
        return new TwoPlusArrayList(e10, e11, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        Iterables.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        Iterators.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }
}
