package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {

    private static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30015b;

        ArrayListSupplier(int i10) {
            this.f30015b = CollectPreconditions.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public List<V> get() {
            return new ArrayList(this.f30015b);
        }
    }

    private static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f30016b;

        EnumSetSupplier(Class cls) {
            this.f30016b = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return EnumSet.noneOf(this.f30016b);
        }
    }

    private static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30017b;

        HashSetSupplier(int i10) {
            this.f30017b = CollectPreconditions.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return Platform.e(this.f30017b);
        }
    }

    private static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30018b;

        LinkedHashSetSupplier(int i10) {
            this.f30018b = CollectPreconditions.b(i10, "expectedValuesPerKey");
        }

        @Override // com.google.common.base.Supplier
        public Set<V> get() {
            return Platform.g(this.f30018b);
        }
    }

    private enum LinkedListSupplier implements Supplier<List<?>> {
        INSTANCE;

        public static <V> Supplier<List<V>> instance() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Supplier
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static abstract class MultimapBuilderWithKeys<K0> {
        MultimapBuilderWithKeys() {
        }

        abstract Map a();

        public ListMultimapBuilder<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> SetMultimapBuilder<K0, V0> enumSetValues(final Class<V0> cls) {
            Preconditions.checkNotNull(cls, "valueClass");
            return new SetMultimapBuilder<K0, V0>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MultimapBuilderWithKeys f30030b;

                {
                    this.f30030b = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.f30030b.a(), new EnumSetSupplier(cls));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public ListMultimapBuilder<K0, Object> linkedListValues() {
            return new ListMultimapBuilder<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.2
                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.newListMultimap(MultimapBuilderWithKeys.this.a(), LinkedListSupplier.instance());
                }
            };
        }

        public SortedSetMultimapBuilder<K0, Comparable> treeSetValues() {
            return treeSetValues(Ordering.natural());
        }

        public ListMultimapBuilder<K0, Object> arrayListValues(final int i10) {
            CollectPreconditions.b(i10, "expectedValuesPerKey");
            return new ListMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MultimapBuilderWithKeys f30021b;

                {
                    this.f30021b = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.ListMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> ListMultimap<K, V> build() {
                    return Multimaps.newListMultimap(this.f30021b.a(), new ArrayListSupplier(i10));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> hashSetValues(final int i10) {
            CollectPreconditions.b(i10, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MultimapBuilderWithKeys f30024b;

                {
                    this.f30024b = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.f30024b.a(), new HashSetSupplier(i10));
                }
            };
        }

        public SetMultimapBuilder<K0, Object> linkedHashSetValues(final int i10) {
            CollectPreconditions.b(i10, "expectedValuesPerKey");
            return new SetMultimapBuilder<K0, Object>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MultimapBuilderWithKeys f30026b;

                {
                    this.f30026b = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V> SetMultimap<K, V> build() {
                    return Multimaps.newSetMultimap(this.f30026b.a(), new LinkedHashSetSupplier(i10));
                }
            };
        }

        public <V0> SortedSetMultimapBuilder<K0, V0> treeSetValues(final Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new SortedSetMultimapBuilder<K0, V0>(this) { // from class: com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys.5

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MultimapBuilderWithKeys f30028b;

                {
                    this.f30028b = this;
                }

                @Override // com.google.common.collect.MultimapBuilder.SortedSetMultimapBuilder, com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
                public <K extends K0, V extends V0> SortedSetMultimap<K, V> build() {
                    return Multimaps.newSortedSetMultimap(this.f30028b.a(), new TreeSetSupplier(comparator));
                }
            };
        }
    }

    private static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparator f30031b;

        TreeSetSupplier(Comparator comparator) {
            this.f30031b = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.base.Supplier
        public SortedSet<V> get() {
            return new TreeSet(this.f30031b);
        }
    }

    public static <K0 extends Enum<K0>> MultimapBuilderWithKeys<K0> enumKeys(final Class<K0> cls) {
        Preconditions.checkNotNull(cls);
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.4
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map a() {
                return new EnumMap(cls);
            }
        };
    }

    public static MultimapBuilderWithKeys<Object> hashKeys() {
        return hashKeys(8);
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static MultimapBuilderWithKeys<Comparable> treeKeys() {
        return treeKeys(Ordering.natural());
    }

    public abstract <K extends K0, V extends V0> Multimap<K, V> build();

    public <K extends K0, V extends V0> Multimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
        Multimap<K, V> multimapBuild = build();
        multimapBuild.putAll(multimap);
        return multimapBuild;
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        ListMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> ListMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> ListMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (ListMultimap) super.build((Multimap) multimap);
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        SetMultimapBuilder() {
            super();
        }

        @Override // com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SetMultimap) super.build((Multimap) multimap);
        }
    }

    private MultimapBuilder() {
    }

    public static MultimapBuilderWithKeys<Object> hashKeys(final int i10) {
        CollectPreconditions.b(i10, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.1
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map a() {
                return Platform.d(i10);
            }
        };
    }

    public static MultimapBuilderWithKeys<Object> linkedHashKeys(final int i10) {
        CollectPreconditions.b(i10, "expectedKeys");
        return new MultimapBuilderWithKeys<Object>() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map a() {
                return Platform.f(i10);
            }
        };
    }

    public static <K0> MultimapBuilderWithKeys<K0> treeKeys(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new MultimapBuilderWithKeys<K0>() { // from class: com.google.common.collect.MultimapBuilder.3
            @Override // com.google.common.collect.MultimapBuilder.MultimapBuilderWithKeys
            Map a() {
                return new TreeMap(comparator);
            }
        };
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        SortedSetMultimapBuilder() {
        }

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public abstract <K extends K0, V extends V0> SortedSetMultimap<K, V> build();

        @Override // com.google.common.collect.MultimapBuilder.SetMultimapBuilder, com.google.common.collect.MultimapBuilder
        public <K extends K0, V extends V0> SortedSetMultimap<K, V> build(Multimap<? extends K, ? extends V> multimap) {
            return (SortedSetMultimap) super.build((Multimap) multimap);
        }
    }
}
