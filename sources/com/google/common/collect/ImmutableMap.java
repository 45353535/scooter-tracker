package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.ironsource.C4240b4;
import j$.util.Map;
import j$.util.Objects;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Map.Entry[] f29569f = new Map.Entry[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient ImmutableSet f29570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ImmutableSet f29571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient ImmutableCollection f29572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient ImmutableSetMultimap f29573e;

    @DoNotMock
    public static class Builder<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f29576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f29577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f29579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        DuplicateKey f29580e;

        static final class DuplicateKey {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f29581a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f29582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f29583c;

            DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.f29581a = obj;
                this.f29582b = obj2;
                this.f29583c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f29581a + C4240b4.j.f42668b + this.f29582b + " and " + this.f29581a + C4240b4.j.f42668b + this.f29583c);
            }
        }

        public Builder() {
            this(4);
        }

        private ImmutableMap a(boolean z10) {
            Object[] objArrD;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z10 && (duplicateKey2 = this.f29580e) != null) {
                throw duplicateKey2.a();
            }
            int length = this.f29578c;
            if (this.f29576a == null) {
                objArrD = this.f29577b;
            } else {
                if (this.f29579d) {
                    this.f29577b = Arrays.copyOf(this.f29577b, length * 2);
                }
                objArrD = this.f29577b;
                if (!z10) {
                    objArrD = d(objArrD, this.f29578c);
                    if (objArrD.length < this.f29577b.length) {
                        length = objArrD.length >>> 1;
                    }
                }
                e(objArrD, length, this.f29576a);
            }
            this.f29579d = true;
            RegularImmutableMap regularImmutableMapN = RegularImmutableMap.n(length, objArrD, this);
            if (!z10 || (duplicateKey = this.f29580e) == null) {
                return regularImmutableMapN;
            }
            throw duplicateKey.a();
        }

        private void c(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f29577b;
            if (i11 > objArr.length) {
                this.f29577b = Arrays.copyOf(objArr, ImmutableCollection.Builder.a(objArr.length, i11));
                this.f29579d = false;
            }
        }

        private Object[] d(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void e(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, Ordering.from(comparator).onResultOf(Maps.Q()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        Builder b(Builder builder) {
            Preconditions.checkNotNull(builder);
            c(this.f29578c + builder.f29578c);
            System.arraycopy(builder.f29577b, 0, this.f29577b, this.f29578c * 2, builder.f29578c * 2);
            this.f29578c += builder.f29578c;
            return this;
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return a(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return a(true);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.f29576a == null, "valueComparator was already set");
            this.f29576a = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k10, V v10) {
            c(this.f29578c + 1);
            CollectPreconditions.a(k10, v10);
            Object[] objArr = this.f29577b;
            int i10 = this.f29578c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f29578c = i10 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        Builder(int i10) {
            this.f29577b = new Object[i10 * 2];
            this.f29578c = 0;
            this.f29579d = false;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f29578c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }
    }

    static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet d() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                ImmutableMap s() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.m();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet g() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableCollection h() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        abstract UnmodifiableIterator m();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet g() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean j() {
            return ImmutableMap.this.j();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean k() {
            return ImmutableMap.this.k();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator m() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MapViewOfValuesAsSingletonSets f29587c;

                {
                    this.f29587c = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f29589c;

                        {
                            this.f29589c = this;
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }
    }

    @J2ktIncompatible
    static class SerializedForm<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f29591c;

        SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f29590b = objArr;
            this.f29591c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object d() {
            Object[] objArr = (Object[]) this.f29590b;
            Object[] objArr2 = (Object[]) this.f29591c;
            Builder builderG = g(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                builderG.put(objArr[i10], objArr2[i10]);
            }
            return builderG.buildOrThrow();
        }

        Builder g(int i10) {
            return new Builder(i10);
        }

        final Object readResolve() {
            Object obj = this.f29590b;
            if (!(obj instanceof ImmutableSet)) {
                return d();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.f29591c;
            Builder builderG = g(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                builderG.put(it.next(), it2.next());
            }
            return builderG.buildOrThrow();
        }
    }

    ImmutableMap() {
    }

    static void a(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw b(str, obj, obj2);
        }
    }

    static IllegalArgumentException b(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i10) {
        CollectPreconditions.b(i10, "expectedSize");
        return new Builder<>(i10);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.k()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    static Map.Entry i(Object obj, Object obj2) {
        CollectPreconditions.a(obj, obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return RegularImmutableMap.f30143j;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.N(function, function2);
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f29573e;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
        this.f29573e = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract ImmutableSet d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.p(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    abstract ImmutableSet g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract ImmutableCollection h();

    @Override // java.util.Map
    public int hashCode() {
        return Sets.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    boolean j() {
        return false;
    }

    abstract boolean k();

    UnmodifiableIterator l() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImmutableMap f29575c;

            {
                this.f29575c = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return Maps.I(this);
    }

    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10) {
        CollectPreconditions.a(k10, v10);
        return RegularImmutableMap.m(1, new Object[]{k10, v10});
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.O(function, function2, binaryOperator);
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f29570b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetD = d();
        this.f29570b = immutableSetD;
        return immutableSetD;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f29571c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetG = g();
        this.f29571c = immutableSetG;
        return immutableSetG;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f29572d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionH = h();
        this.f29572d = immutableCollectionH;
        return immutableCollectionH;
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        return RegularImmutableMap.m(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        return RegularImmutableMap.m(3, new Object[]{k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        return RegularImmutableMap.m(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        return RegularImmutableMap.m(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        return RegularImmutableMap.m(6, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        return RegularImmutableMap.m(7, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        CollectPreconditions.a(k17, v17);
        return RegularImmutableMap.m(8, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        CollectPreconditions.a(k17, v17);
        CollectPreconditions.a(k18, v18);
        return RegularImmutableMap.m(9, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> ImmutableMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        CollectPreconditions.a(k17, v17);
        CollectPreconditions.a(k18, v18);
        CollectPreconditions.a(k19, v19);
        return RegularImmutableMap.m(10, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }
}
