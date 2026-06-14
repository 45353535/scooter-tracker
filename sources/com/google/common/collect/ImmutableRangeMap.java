package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SortedLists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ImmutableRangeMap f29633d = new ImmutableRangeMap(ImmutableList.of(), ImmutableList.of());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList f29634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ImmutableList f29635c;

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29643a = Lists.newArrayList();

        Builder a(Builder builder) {
            this.f29643a.addAll(builder.f29643a);
            return this;
        }

        public ImmutableRangeMap<K, V> build() {
            Collections.sort(this.f29643a, Range.g().d());
            ImmutableList.Builder builder = new ImmutableList.Builder(this.f29643a.size());
            ImmutableList.Builder builder2 = new ImmutableList.Builder(this.f29643a.size());
            for (int i10 = 0; i10 < this.f29643a.size(); i10++) {
                Range range = (Range) ((Map.Entry) this.f29643a.get(i10)).getKey();
                if (i10 > 0) {
                    Range range2 = (Range) ((Map.Entry) this.f29643a.get(i10 - 1)).getKey();
                    if (range.isConnected(range2) && !range.intersection(range2).isEmpty()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + range2 + " overlaps with entry " + range);
                    }
                }
                builder.add(range);
                builder2.add(((Map.Entry) this.f29643a.get(i10)).getValue());
            }
            return new ImmutableRangeMap<>(builder.build(), builder2.build());
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Range<K> range, V v10) {
            Preconditions.checkNotNull(range);
            Preconditions.checkNotNull(v10);
            Preconditions.checkArgument(!range.isEmpty(), "Range must not be empty, but was %s", range);
            this.f29643a.add(Maps.immutableEntry(range, v10));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(RangeMap<K, ? extends V> rangeMap) {
            for (Map.Entry entry : rangeMap.asMapOfRanges().entrySet()) {
                put((Range) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    private static class SerializedForm<K extends Comparable<?>, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap f29644b;

        SerializedForm(ImmutableMap immutableMap) {
            this.f29644b = immutableMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object d() {
            Builder builder = new Builder();
            UnmodifiableIterator it = this.f29644b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                builder.put((Range) entry.getKey(), entry.getValue());
            }
            return builder.build();
        }

        Object readResolve() {
            return this.f29644b.isEmpty() ? ImmutableRangeMap.of() : d();
        }
    }

    ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.f29634b = immutableList;
        this.f29635c = immutableList2;
    }

    public static <K extends Comparable<?>, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> copyOf(RangeMap<K, ? extends V> rangeMap) {
        if (rangeMap instanceof ImmutableRangeMap) {
            return (ImmutableRangeMap) rangeMap;
        }
        Map<Range<K>, ? extends V> mapAsMapOfRanges = rangeMap.asMapOfRanges();
        ImmutableList.Builder builder = new ImmutableList.Builder(mapAsMapOfRanges.size());
        ImmutableList.Builder builder2 = new ImmutableList.Builder(mapAsMapOfRanges.size());
        for (Map.Entry entry : mapAsMapOfRanges.entrySet()) {
            builder.add((Range) entry.getKey());
            builder2.add(entry.getValue());
        }
        return new ImmutableRangeMap<>(builder.build(), builder2.build());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of() {
        return f29633d;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(Function<? super T, Range<K>> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.Q(function, function2);
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public V get(K k10) {
        int iBinarySearch = SortedLists.binarySearch(this.f29634b, new i2(), Cut.i(k10), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1 && ((Range) this.f29634b.get(iBinarySearch)).contains(k10)) {
            return (V) this.f29635c.get(iBinarySearch);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k10) {
        int iBinarySearch = SortedLists.binarySearch(this.f29634b, new i2(), Cut.i(k10), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch == -1) {
            return null;
        }
        Range range = (Range) this.f29634b.get(iBinarySearch);
        if (range.contains(k10)) {
            return Maps.immutableEntry(range, this.f29635c.get(iBinarySearch));
        }
        return null;
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void put(Range<K> range, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(RangeMap<K, ? extends V> rangeMap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putCoalescing(Range<K> range, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove(Range<K> range) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        if (this.f29634b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.b(((Range) this.f29634b.get(0)).f30120b, ((Range) this.f29634b.get(r1.size() - 1)).f30121c);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return asMapOfRanges().toString();
    }

    Object writeReplace() {
        return new SerializedForm(asMapOfRanges());
    }

    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> of(Range<K> range, V v10) {
        return new ImmutableRangeMap<>(ImmutableList.of(range), ImmutableList.of(v10));
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asDescendingMapOfRanges() {
        return this.f29634b.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f29634b.reverse(), Range.g().reverse()), this.f29635c.reverse());
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableMap<Range<K>, V> asMapOfRanges() {
        return this.f29634b.isEmpty() ? ImmutableMap.of() : new ImmutableSortedMap(new RegularImmutableSortedSet(this.f29634b, Range.g()), this.f29635c);
    }

    @Override // com.google.common.collect.RangeMap
    public ImmutableRangeMap<K, V> subRangeMap(final Range<K> range) {
        if (((Range) Preconditions.checkNotNull(range)).isEmpty()) {
            return of();
        }
        if (this.f29634b.isEmpty() || range.encloses(span())) {
            return this;
        }
        ImmutableList immutableList = this.f29634b;
        h2 h2Var = new h2();
        Cut cut = range.f30120b;
        SortedLists.KeyPresentBehavior keyPresentBehavior = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        SortedLists.KeyAbsentBehavior keyAbsentBehavior = SortedLists.KeyAbsentBehavior.NEXT_HIGHER;
        final int iBinarySearch = SortedLists.binarySearch(immutableList, h2Var, cut, keyPresentBehavior, keyAbsentBehavior);
        int iBinarySearch2 = SortedLists.binarySearch(this.f29634b, new i2(), range.f30121c, SortedLists.KeyPresentBehavior.ANY_PRESENT, keyAbsentBehavior);
        if (iBinarySearch >= iBinarySearch2) {
            return of();
        }
        final int i10 = iBinarySearch2 - iBinarySearch;
        return (ImmutableRangeMap<K, V>) new ImmutableRangeMap<K, V>(this, new ImmutableList<Range<K>>(this) { // from class: com.google.common.collect.ImmutableRangeMap.1

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ImmutableRangeMap f29639g;

            {
                this.f29639g = this;
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return i10;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<K> get(int i11) {
                Preconditions.checkElementIndex(i11, i10);
                return (i11 == 0 || i11 == i10 + (-1)) ? ((Range) this.f29639g.f29634b.get(i11 + iBinarySearch)).intersection(range) : (Range) this.f29639g.f29634b.get(i11 + iBinarySearch);
            }
        }, this.f29635c.subList(iBinarySearch, iBinarySearch2)) { // from class: com.google.common.collect.ImmutableRangeMap.2

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ImmutableRangeMap f29642g;

            {
                this.f29642g = this;
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ Map asDescendingMapOfRanges() {
                return super.asDescendingMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public /* bridge */ /* synthetic */ Map asMapOfRanges() {
                return super.asMapOfRanges();
            }

            @Override // com.google.common.collect.ImmutableRangeMap
            @J2ktIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.ImmutableRangeMap, com.google.common.collect.RangeMap
            public ImmutableRangeMap<K, V> subRangeMap(Range<K> range2) {
                return range.isConnected(range2) ? this.subRangeMap((Range) range2.intersection(range)) : ImmutableRangeMap.of();
            }
        };
    }
}
