package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.ironsource.C4240b4;
import j$.util.Map;
import j$.util.Objects;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V>, Map {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Comparator f29679j = Ordering.natural();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final ImmutableSortedMap f29680k = new ImmutableSortedMap(ImmutableSortedSet.u(Ordering.natural()), ImmutableList.of());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient RegularImmutableSortedSet f29681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ImmutableList f29682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient ImmutableSortedMap f29683i;

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private transient Object[] f29686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient Object[] f29687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Comparator f29688h;

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private void c(int i10) {
            Object[] objArr = this.f29686f;
            if (i10 > objArr.length) {
                int iA = ImmutableCollection.Builder.a(objArr.length, i10);
                this.f29686f = Arrays.copyOf(this.f29686f, iA);
                this.f29687g = Arrays.copyOf(this.f29687g, iA);
            }
        }

        Builder f(Builder builder) {
            c(this.f29578c + builder.f29578c);
            System.arraycopy(builder.f29686f, 0, this.f29686f, this.f29578c, builder.f29578c);
            System.arraycopy(builder.f29687g, 0, this.f29687g, this.f29578c, builder.f29578c);
            this.f29578c += builder.f29578c;
            return this;
        }

        private Builder(Comparator comparator, int i10) {
            this.f29688h = (Comparator) Preconditions.checkNotNull(comparator);
            this.f29686f = new Object[i10];
            this.f29687g = new Object[i10];
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public final ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> buildOrThrow() {
            int i10 = this.f29578c;
            if (i10 == 0) {
                return ImmutableSortedMap.s(this.f29688h);
            }
            if (i10 == 1) {
                Comparator comparator = this.f29688h;
                Object obj = this.f29686f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f29687g[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.A(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f29686f, i10);
            Arrays.sort(objArrCopyOf, this.f29688h);
            Object[] objArr = new Object[this.f29578c];
            for (int i11 = 0; i11 < this.f29578c; i11++) {
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    if (this.f29688h.compare(objArrCopyOf[i12], objArrCopyOf[i11]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i12] + " and " + objArrCopyOf[i11]);
                    }
                }
                Object obj3 = this.f29686f[i11];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f29688h);
                Object obj4 = this.f29687g[i11];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.k(objArrCopyOf), this.f29688h), ImmutableList.k(objArr));
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k10, V v10) {
            c(this.f29578c + 1);
            CollectPreconditions.a(k10, v10);
            Object[] objArr = this.f29686f;
            int i10 = this.f29578c;
            objArr[i10] = k10;
            this.f29687g[i10] = v10;
            this.f29578c = i10 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(java.util.Map<? extends K, ? extends V> map) {
            super.putAll((java.util.Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }
    }

    @J2ktIncompatible
    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Comparator f29689d;

        SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.f29689d = immutableSortedMap.comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Builder g(int i10) {
            return new Builder(this.f29689d);
        }
    }

    ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSortedMap A(Comparator comparator, Object obj, Object obj2) {
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.of(obj), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.of(obj2));
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <K, V> Builder<K, V> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        return r(map, (Ordering) f29679j);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f29679j;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.k()) {
                return immutableSortedMap;
            }
        }
        return t(comparator, true, sortedMap.entrySet());
    }

    public static /* synthetic */ int m(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <K, V> ImmutableSortedMap<K, V> of() {
        return f29680k;
    }

    @SafeVarargs
    @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
        return new Builder<>(comparator);
    }

    private static ImmutableSortedMap r(java.util.Map map, Comparator comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f29679j) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.k()) {
                return immutableSortedMap;
            }
        }
        return t(comparator, zEquals, map.entrySet());
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    static ImmutableSortedMap s(Comparator comparator) {
        return Ordering.natural().equals(comparator) ? of() : new ImmutableSortedMap(ImmutableSortedSet.u(comparator), ImmutableList.of());
    }

    private static ImmutableSortedMap t(Comparator comparator, boolean z10, Iterable iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.g(iterable, ImmutableMap.f29569f);
        return u(comparator, z10, entryArr, entryArr.length);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.U(comparator, function, function2);
    }

    private static ImmutableSortedMap u(final Comparator comparator, boolean z10, Map.Entry[] entryArr, int i10) {
        if (i10 == 0) {
            return s(comparator);
        }
        if (i10 == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return A(comparator, entry2.getKey(), entry2.getValue());
        }
        Object[] objArr = new Object[i10];
        Object[] objArr2 = new Object[i10];
        if (z10) {
            for (int i11 = 0; i11 < i10; i11++) {
                Map.Entry entry3 = entryArr[i11];
                Objects.requireNonNull(entry3);
                Map.Entry entry4 = entry3;
                Object key = entry4.getKey();
                Object value = entry4.getValue();
                CollectPreconditions.a(key, value);
                objArr[i11] = key;
                objArr2[i11] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i10, new Comparator() { // from class: com.google.common.collect.j2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ImmutableSortedMap.m(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                }
            });
            Map.Entry entry5 = entryArr[0];
            Objects.requireNonNull(entry5);
            Map.Entry entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            Object value2 = entry6.getValue();
            objArr2[0] = value2;
            CollectPreconditions.a(objArr[0], value2);
            int i12 = 1;
            while (i12 < i10) {
                Map.Entry entry7 = entryArr[i12 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr[i12];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                CollectPreconditions.a(key3, value3);
                objArr[i12] = key3;
                objArr2[i12] = value3;
                ImmutableMap.a(comparator.compare(key2, key3) != 0, C4240b4.i.W, entry8, entry10);
                i12++;
                key2 = key3;
            }
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.k(objArr), comparator), ImmutableList.k(objArr2));
    }

    private static ImmutableSortedMap v(Map.Entry... entryArr) {
        return u(Ordering.natural(), false, entryArr, entryArr.length);
    }

    private ImmutableSortedMap x(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 == i11 ? s(comparator()) : new ImmutableSortedMap(this.f29681g.D(i10, i11), this.f29682h.subList(i10, i11));
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k10) {
        return tailMap((Object) k10, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k10) {
        return (K) Maps.x(ceilingEntry(k10));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet d() {
        return isEmpty() ? ImmutableSet.of() : new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet
            ImmutableList o() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    @J2ktIncompatible
                    @GwtIncompatible
                    Object writeReplace() {
                        return super.writeReplace();
                    }

                    @Override // java.util.List
                    public Map.Entry<K, V> get(int i10) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.f29681g.asList().get(i10), ImmutableSortedMap.this.f29682h.get(i10));
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            ImmutableMap s() {
                return ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }
        };
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k10) {
        return headMap((Object) k10, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k10) {
        return (K) Maps.x(floorEntry(k10));
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet g() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        int iIndexOf = this.f29681g.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return (V) this.f29682h.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection h() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k10) {
        return tailMap((Object) k10, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k10) {
        return (K) Maps.x(higherEntry(k10));
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean k() {
        return this.f29681g.isPartialView() || this.f29682h.isPartialView();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k10) {
        return headMap((Object) k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k10) {
        return (K) Maps.x(lowerEntry(k10));
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f29682h.size();
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.f29681g = regularImmutableSortedSet;
        this.f29682h = immutableList;
        this.f29683i = immutableSortedMap;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj) {
        return A(Ordering.natural(), comparable, obj);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.V(comparator, function, function2, binaryOperator);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return (ImmutableSortedSet<K>) this.f29681g.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.f29683i;
        return immutableSortedMap == null ? isEmpty() ? s(Ordering.from(comparator()).reverse()) : new ImmutableSortedMap<>((RegularImmutableSortedSet) this.f29681g.descendingSet(), this.f29682h.reverse(), this) : immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.f29681g;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        return this.f29682h;
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return r(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k10) {
        return headMap((Object) k10, false);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.f29681g;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k10, K k11) {
        return subMap((Object) k10, true, (Object) k11, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k10) {
        return tailMap((Object) k10, true);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Ordering) f29679j);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3));
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k10, boolean z10) {
        return x(0, this.f29681g.E(Preconditions.checkNotNull(k10), z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(k11);
        Preconditions.checkArgument(comparator().compare(k10, k11) <= 0, "expected fromKey <= toKey but %s > %s", k10, k11);
        return headMap((Object) k11, z11).tailMap((Object) k10, z10);
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k10, boolean z10) {
        return x(this.f29681g.F(Preconditions.checkNotNull(k10), z10), size());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return t((Comparator) Preconditions.checkNotNull(comparator), false, iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5), ImmutableMap.i(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5), ImmutableMap.i(comparable6, obj6), ImmutableMap.i(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5), ImmutableMap.i(comparable6, obj6), ImmutableMap.i(comparable7, obj7), ImmutableMap.i(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5), ImmutableMap.i(comparable6, obj6), ImmutableMap.i(comparable7, obj7), ImmutableMap.i(comparable8, obj8), ImmutableMap.i(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return v(ImmutableMap.i(comparable, obj), ImmutableMap.i(comparable2, obj2), ImmutableMap.i(comparable3, obj3), ImmutableMap.i(comparable4, obj4), ImmutableMap.i(comparable5, obj5), ImmutableMap.i(comparable6, obj6), ImmutableMap.i(comparable7, obj7), ImmutableMap.i(comparable8, obj8), ImmutableMap.i(comparable9, obj9), ImmutableMap.i(comparable10, obj10));
    }

    @DoNotCall("Pass a key of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        throw new UnsupportedOperationException();
    }
}
