package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient ImmutableListMultimap f29568i;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        Builder e(ImmutableMultimap.Builder builder) {
            super.a(builder);
            return this;
        }

        Builder(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
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
            super.putAll((Object) k10, (Object[]) vArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }
    }

    ImmutableListMultimap(ImmutableMap immutableMap, int i10) {
        super(immutableMap, i10);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i10) {
        CollectPreconditions.b(i10, "expectedKeys");
        return new Builder<>(i10);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.r()) {
                return immutableListMultimap;
            }
        }
        return u(multimap.asMap().entrySet(), null);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.D(function, function2);
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.f29447j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder2.add(object2);
            }
            builder.put(object, builder2.build());
            i11 += i13;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.f29617a.b(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.f29618b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ImmutableListMultimap t(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableList.Builder builder2 = (ImmutableList.Builder) entry.getValue();
            ImmutableList immutableListBuild = comparator == null ? builder2.build() : builder2.d(comparator);
            builder.put(key, immutableListBuild);
            size += immutableListBuild.size();
        }
        return new ImmutableListMultimap(builder.buildOrThrow(), size);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.M(function, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ImmutableListMultimap u(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf(collection2) : ImmutableList.sortedCopyOf(comparator, collection2);
            if (!immutableListCopyOf.isEmpty()) {
                builder.put(key, immutableListCopyOf);
                size += immutableListCopyOf.size();
            }
        }
        return new ImmutableListMultimap(builder.buildOrThrow(), size);
    }

    private ImmutableListMultimap v() {
        Builder builder = builder();
        UnmodifiableIterator<Map.Entry<K, V>> it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            builder.put(next.getValue(), next.getKey());
        }
        ImmutableListMultimap<K, V> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.f29568i = this;
        return immutableListMultimapBuild;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.j(this, objectOutputStream);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        return builder.build();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.f29568i;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapV = v();
        this.f29568i = immutableListMultimapV;
        return immutableListMultimapV;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableList<V> get(K k10) {
        ImmutableList<V> immutableList = (ImmutableList) this.f29603g.get(k10);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Builder builder = builder();
        builder.put((Object) k10, (Object) v10);
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        builder.put((Object) k14, (Object) v14);
        return builder.build();
    }
}
