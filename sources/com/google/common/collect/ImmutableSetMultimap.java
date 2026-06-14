package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient ImmutableSet f29674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient ImmutableSetMultimap f29675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient ImmutableSet f29676k;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        int c(int i10, Iterable iterable) {
            return iterable instanceof Set ? Math.max(i10, ((Set) iterable).size()) : i10;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        ImmutableCollection.Builder d(int i10) {
            Comparator comparator = this.f29614c;
            return comparator == null ? ImmutableSet.builderWithExpectedSize(i10) : new ImmutableSortedSet.Builder(comparator, i10);
        }

        Builder e(ImmutableMultimap.Builder builder) {
            super.a(builder);
            return this;
        }

        Builder(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableSetMultimap<K, V> build() {
            Map map = this.f29612a;
            if (map == null) {
                return ImmutableSetMultimap.of();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator comparator = this.f29613b;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).d().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableSetMultimap.v(collectionEntrySet, this.f29614c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> expectedValuesPerKey(int i10) {
            super.expectedValuesPerKey(i10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k10, V v10) {
            super.put((Object) k10, (Object) v10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k10, Iterable<? extends V> iterable) {
            super.putAll((Object) k10, (Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k10, V... vArr) {
            return putAll((Object) k10, (Iterable) Arrays.asList(vArr));
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((Object) entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }
    }

    private static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableSetMultimap f29677d;

        EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.f29677d = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f29677d.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f29677d.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f29677d.k();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static final class SetFieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Serialization.FieldSetter f29678a = Serialization.a(ImmutableSetMultimap.class, "emptySet");
    }

    ImmutableSetMultimap(ImmutableMap immutableMap, int i10, Comparator comparator) {
        super(immutableMap, i10);
        this.f29674i = u(comparator);
    }

    private ImmutableSetMultimap A() {
        Builder builder = builder();
        UnmodifiableIterator<Map.Entry<K, V>> it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            builder.put(next.getValue(), next.getKey());
        }
        ImmutableSetMultimap<K, V> immutableSetMultimapBuild = builder.build();
        immutableSetMultimapBuild.f29675j = this;
        return immutableSetMultimapBuild;
    }

    private static ImmutableSet B(Comparator comparator, Collection collection) {
        return comparator == null ? ImmutableSet.copyOf(collection) : ImmutableSortedSet.copyOf(comparator, collection);
    }

    private static ImmutableSet.Builder C(Comparator comparator) {
        return comparator == null ? new ImmutableSet.Builder() : new ImmutableSortedSet.Builder(comparator);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i10) {
        CollectPreconditions.b(i10, "expectedKeys");
        return new Builder<>(i10);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        return t(multimap, null);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.E(function, function2);
    }

    public static <K, V> ImmutableSetMultimap<K, V> of() {
        return EmptyImmutableSetMultimap.f29448l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Invalid key count " + i10);
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i13);
            }
            ImmutableSet.Builder builderC = C(comparator);
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builderC.add(object2);
            }
            ImmutableSet immutableSetBuild = builderC.build();
            if (immutableSetBuild.size() != i13) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            builder.put(object, immutableSetBuild);
            i11 += i13;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f29617a.b(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.f29618b.a(this, i11);
            SetFieldSettersHolder.f29678a.b(this, u(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private static ImmutableSetMultimap t(Multimap multimap, Comparator comparator) {
        Preconditions.checkNotNull(multimap);
        if (multimap.isEmpty() && comparator == null) {
            return of();
        }
        if (multimap instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap immutableSetMultimap = (ImmutableSetMultimap) multimap;
            if (!immutableSetMultimap.r()) {
                return immutableSetMultimap;
            }
        }
        return x(multimap.asMap().entrySet(), comparator);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.T(function, function2);
    }

    private static ImmutableSet u(Comparator comparator) {
        return comparator == null ? ImmutableSet.of() : ImmutableSortedSet.u(comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ImmutableSetMultimap v(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableSet immutableSetB = B(comparator, ((ImmutableSet.Builder) entry.getValue()).build());
            if (!immutableSetB.isEmpty()) {
                builder.put(key, immutableSetB);
                size += immutableSetB.size();
            }
        }
        return new ImmutableSetMultimap(builder.buildOrThrow(), size, comparator);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        Serialization.j(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ImmutableSetMultimap x(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableSet immutableSetB = B(comparator, (Collection) entry.getValue());
            if (!immutableSetB.isEmpty()) {
                builder.put(key, immutableSetB);
                size += immutableSetB.size();
            }
        }
        return new ImmutableSetMultimap(builder.buildOrThrow(), size, comparator);
    }

    Comparator valueComparator() {
        ImmutableSet immutableSet = this.f29674i;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        return builder.build();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.f29675j;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapA = A();
        this.f29675j = immutableSetMultimapA;
        return immutableSetMultimapA;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f29676k;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.f29676k = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableSet<V> get(K k10) {
        return (ImmutableSet) MoreObjects.firstNonNull((ImmutableSet) this.f29603g.get(k10), this.f29674i);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        builder.put((Object) k14, (Object) v14);
        return builder.build();
    }
}
