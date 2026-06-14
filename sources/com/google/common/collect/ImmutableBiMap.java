package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Map;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V>, Map {

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.Builder
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Builder b(ImmutableMap.Builder builder) {
            super.b(builder);
            return this;
        }

        Builder(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i10 = this.f29578c;
            if (i10 == 0) {
                return ImmutableBiMap.of();
            }
            if (this.f29576a != null) {
                if (this.f29579d) {
                    this.f29577b = Arrays.copyOf(this.f29577b, i10 * 2);
                }
                ImmutableMap.Builder.e(this.f29577b, this.f29578c, this.f29576a);
            }
            this.f29579d = true;
            return new RegularImmutableBiMap(this.f29577b, this.f29578c);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k10, V v10) {
            super.put((Object) k10, (Object) v10);
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
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    @J2ktIncompatible
    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        SerializedForm(ImmutableBiMap immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Builder g(int i10) {
            return new Builder(i10);
        }
    }

    ImmutableBiMap() {
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i10) {
        CollectPreconditions.b(i10, "expectedSize");
        return new Builder<>(i10);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(java.util.Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.k()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return RegularImmutableBiMap.f30134l;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.G(function, function2);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V forcePut(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet h() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10) {
        CollectPreconditions.a(k10, v10);
        return new RegularImmutableBiMap(new Object[]{k10, v10}, 1);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        CollectPreconditions.a(k17, v17);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        CollectPreconditions.a(k10, v10);
        CollectPreconditions.a(k11, v11);
        CollectPreconditions.a(k12, v12);
        CollectPreconditions.a(k13, v13);
        CollectPreconditions.a(k14, v14);
        CollectPreconditions.a(k15, v15);
        CollectPreconditions.a(k16, v16);
        CollectPreconditions.a(k17, v17);
        CollectPreconditions.a(k18, v18);
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
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
        return new RegularImmutableBiMap(new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 10);
    }
}
