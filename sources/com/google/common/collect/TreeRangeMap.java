package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import j$.util.Objects;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final RangeMap f30359c = new RangeMap<Comparable<?>, Object>() { // from class: com.google.common.collect.TreeRangeMap.1
        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asDescendingMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<Comparable<?>>, Object> asMapOfRanges() {
            return Collections.EMPTY_MAP;
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        public Object get(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<Comparable<?>>, Object> getEntry(Comparable<?> comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<Comparable<?>> range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<Comparable<?>, ? extends Object> rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<Comparable<?>> range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range<Comparable<?>> range) {
            Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public Range<Comparable<?>> span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap<Comparable<?>, Object> subRangeMap(Range<Comparable<?>> range) {
            Preconditions.checkNotNull(range);
            return this;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NavigableMap f30360b = Maps.newTreeMap();

    private final class AsMapOfRanges extends Maps.IteratorBasedAbstractMap<Range<K>, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterable f30361b;

        AsMapOfRanges(Iterable iterable) {
            this.f30361b = iterable;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            return this.f30361b.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            RangeMapEntry rangeMapEntry = (RangeMapEntry) TreeRangeMap.this.f30360b.get(range.f30120b);
            if (rangeMapEntry == null || !rangeMapEntry.getKey().equals(range)) {
                return null;
            }
            return (V) rangeMapEntry.getValue();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return TreeRangeMap.this.f30360b.size();
        }
    }

    private static final class RangeMapEntry<K extends Comparable, V> extends AbstractMapEntry<Range<K>, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range f30363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f30364c;

        RangeMapEntry(Cut cut, Cut cut2, Object obj) {
            this(Range.b(cut, cut2), obj);
        }

        public boolean contains(K k10) {
            return this.f30363b.contains(k10);
        }

        Cut d() {
            return this.f30363b.f30120b;
        }

        Cut g() {
            return this.f30363b.f30121c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return (V) this.f30364c;
        }

        RangeMapEntry(Range range, Object obj) {
            this.f30363b = range;
            this.f30364c = obj;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public Range<K> getKey() {
            return this.f30363b;
        }
    }

    private class SubRangeMap implements RangeMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range f30365b;

        class SubRangeMapAsMap extends AbstractMap<Range<K>, V> {
            SubRangeMapAsMap() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(Predicate predicate) {
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                for (Map.Entry<Range<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayListNewArrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayListNewArrayList.iterator();
                while (it.hasNext()) {
                    TreeRangeMap.this.remove((Range) it.next());
                }
                return !arrayListNewArrayList.isEmpty();
            }

            Iterator b() {
                if (SubRangeMap.this.f30365b.isEmpty()) {
                    return Iterators.e();
                }
                final Iterator<V> it = TreeRangeMap.this.f30360b.tailMap((Cut) MoreObjects.firstNonNull((Cut) TreeRangeMap.this.f30360b.floorKey(SubRangeMap.this.f30365b.f30120b), SubRangeMap.this.f30365b.f30120b), true).values().iterator();
                return new AbstractIterator<Map.Entry<Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.3

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ SubRangeMapAsMap f30374e;

                    {
                        this.f30374e = this;
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.google.common.collect.AbstractIterator
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Map.Entry computeNext() {
                        while (it.hasNext()) {
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            if (rangeMapEntry.d().compareTo(SubRangeMap.this.f30365b.f30121c) >= 0) {
                                return (Map.Entry) a();
                            }
                            if (rangeMapEntry.g().compareTo(SubRangeMap.this.f30365b.f30120b) > 0) {
                                return Maps.immutableEntry(rangeMapEntry.getKey().intersection(SubRangeMap.this.f30365b), rangeMapEntry.getValue());
                            }
                        }
                        return (Map.Entry) a();
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                SubRangeMap.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new Maps.EntrySet<Range<K>, V>() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.2
                    @Override // com.google.common.collect.Maps.EntrySet
                    Map e() {
                        return SubRangeMapAsMap.this;
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean isEmpty() {
                        return !iterator().hasNext();
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<Map.Entry<Range<K>, V>> iterator() {
                        return SubRangeMapAsMap.this.b();
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.c(Predicates.not(Predicates.in(collection)));
                    }

                    @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return Iterators.size(iterator());
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
                RangeMapEntry rangeMapEntry;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (SubRangeMap.this.f30365b.encloses(range) && !range.isEmpty()) {
                            if (range.f30120b.compareTo(SubRangeMap.this.f30365b.f30120b) == 0) {
                                Map.Entry entryFloorEntry = TreeRangeMap.this.f30360b.floorEntry(range.f30120b);
                                rangeMapEntry = entryFloorEntry != null ? (RangeMapEntry) entryFloorEntry.getValue() : null;
                            } else {
                                rangeMapEntry = (RangeMapEntry) TreeRangeMap.this.f30360b.get(range.f30120b);
                            }
                            if (rangeMapEntry != null && rangeMapEntry.getKey().isConnected(SubRangeMap.this.f30365b) && rangeMapEntry.getKey().intersection(SubRangeMap.this.f30365b).equals(range)) {
                                return (V) rangeMapEntry.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new Maps.KeySet<Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.1
                    @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean remove(Object obj) {
                        return SubRangeMapAsMap.this.remove(obj) != null;
                    }

                    @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.c(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.v()));
                    }
                };
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
                V v10 = (V) get(obj);
                if (v10 == null) {
                    return null;
                }
                Objects.requireNonNull(obj);
                TreeRangeMap.this.remove((Range) obj);
                return v10;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new Maps.Values<Range<K>, V>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap.4
                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean removeAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.c(Predicates.compose(Predicates.in(collection), Maps.Q()));
                    }

                    @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                    public boolean retainAll(Collection<?> collection) {
                        return SubRangeMapAsMap.this.c(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.Q()));
                    }
                };
            }
        }

        SubRangeMap(Range range) {
            this.f30365b = range;
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asDescendingMapOfRanges() {
            return new TreeRangeMap<K, V>.SubRangeMap.SubRangeMapAsMap() { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1
                @Override // com.google.common.collect.TreeRangeMap.SubRangeMap.SubRangeMapAsMap
                Iterator b() {
                    if (SubRangeMap.this.f30365b.isEmpty()) {
                        return Iterators.e();
                    }
                    final Iterator<V> it = TreeRangeMap.this.f30360b.headMap(SubRangeMap.this.f30365b.f30121c, false).descendingMap().values().iterator();
                    return new AbstractIterator<Map.Entry<Range<K>, V>>(this) { // from class: com.google.common.collect.TreeRangeMap.SubRangeMap.1.1

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f30369e;

                        {
                            this.f30369e = this;
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public Map.Entry computeNext() {
                            if (!it.hasNext()) {
                                return (Map.Entry) a();
                            }
                            RangeMapEntry rangeMapEntry = (RangeMapEntry) it.next();
                            return rangeMapEntry.g().compareTo(SubRangeMap.this.f30365b.f30120b) <= 0 ? (Map.Entry) a() : Maps.immutableEntry(rangeMapEntry.getKey().intersection(SubRangeMap.this.f30365b), rangeMapEntry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asMapOfRanges() {
            return new SubRangeMapAsMap();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            TreeRangeMap.this.remove(this.f30365b);
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(Object obj) {
            if (obj instanceof RangeMap) {
                return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        public V get(K k10) {
            if (this.f30365b.contains(k10)) {
                return (V) TreeRangeMap.this.get(k10);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public Map.Entry<Range<K>, V> getEntry(K k10) {
            Map.Entry<Range<K>, V> entry;
            if (!this.f30365b.contains(k10) || (entry = TreeRangeMap.this.getEntry(k10)) == null) {
                return null;
            }
            return Maps.immutableEntry(entry.getKey().intersection(this.f30365b), entry.getValue());
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<K> range, V v10) {
            Preconditions.checkArgument(this.f30365b.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.f30365b);
            TreeRangeMap.this.put(range, v10);
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<K, ? extends V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> rangeSpan = rangeMap.span();
            Preconditions.checkArgument(this.f30365b.encloses(rangeSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", rangeSpan, this.f30365b);
            TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<K> range, V v10) {
            if (TreeRangeMap.this.f30360b.isEmpty() || !this.f30365b.encloses(range)) {
                put(range, v10);
            } else {
                put(TreeRangeMap.this.e(range, Preconditions.checkNotNull(v10)).intersection(this.f30365b), v10);
            }
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
        @Override // com.google.common.collect.RangeMap
        public void remove(Range<K> range) {
            if (range.isConnected(this.f30365b)) {
                TreeRangeMap.this.remove(range.intersection(this.f30365b));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public Range<K> span() {
            Cut cut;
            Map.Entry entryFloorEntry = TreeRangeMap.this.f30360b.floorEntry(this.f30365b.f30120b);
            if (entryFloorEntry == null || ((RangeMapEntry) entryFloorEntry.getValue()).g().compareTo(this.f30365b.f30120b) <= 0) {
                cut = (Cut) TreeRangeMap.this.f30360b.ceilingKey(this.f30365b.f30120b);
                if (cut == null || cut.compareTo(this.f30365b.f30121c) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                cut = this.f30365b.f30120b;
            }
            Map.Entry entryLowerEntry = TreeRangeMap.this.f30360b.lowerEntry(this.f30365b.f30121c);
            if (entryLowerEntry != null) {
                return Range.b(cut, ((RangeMapEntry) entryLowerEntry.getValue()).g().compareTo(this.f30365b.f30121c) >= 0 ? this.f30365b.f30121c : ((RangeMapEntry) entryLowerEntry.getValue()).g());
            }
            throw new NoSuchElementException();
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
        @Override // com.google.common.collect.RangeMap
        public RangeMap<K, V> subRangeMap(Range<K> range) {
            return !range.isConnected(this.f30365b) ? TreeRangeMap.this.f() : TreeRangeMap.this.subRangeMap(range.intersection(this.f30365b));
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    private TreeRangeMap() {
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
        return new TreeRangeMap<>();
    }

    private static Range d(Range range, Object obj, Map.Entry entry) {
        return (entry != null && ((RangeMapEntry) entry.getValue()).getKey().isConnected(range) && ((RangeMapEntry) entry.getValue()).getValue().equals(obj)) ? range.span(((RangeMapEntry) entry.getValue()).getKey()) : range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range e(Range range, Object obj) {
        return d(d(range, obj, this.f30360b.lowerEntry(range.f30120b)), obj, this.f30360b.floorEntry(range.f30121c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RangeMap f() {
        return f30359c;
    }

    private void g(Cut cut, Cut cut2, Object obj) {
        this.f30360b.put(cut, new RangeMapEntry(cut, cut2, obj));
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new AsMapOfRanges(this.f30360b.descendingMap().values());
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
        return new AsMapOfRanges(this.f30360b.values());
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.f30360b.clear();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    public V get(K k10) {
        Map.Entry<Range<K>, V> entry = getEntry(k10);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public Map.Entry<Range<K>, V> getEntry(K k10) {
        Map.Entry entryFloorEntry = this.f30360b.floorEntry(Cut.i(k10));
        if (entryFloorEntry == null || !((RangeMapEntry) entryFloorEntry.getValue()).contains(k10)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v10) {
        if (range.isEmpty()) {
            return;
        }
        Preconditions.checkNotNull(v10);
        remove(range);
        this.f30360b.put(range.f30120b, new RangeMapEntry(range, v10));
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, ? extends V> rangeMap) {
        for (Map.Entry<Range<K>, ? extends V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v10) {
        if (this.f30360b.isEmpty()) {
            put(range, v10);
        } else {
            put(e(range, Preconditions.checkNotNull(v10)), v10);
        }
    }

    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        Map.Entry entryLowerEntry = this.f30360b.lowerEntry(range.f30120b);
        if (entryLowerEntry != null) {
            RangeMapEntry rangeMapEntry = (RangeMapEntry) entryLowerEntry.getValue();
            if (rangeMapEntry.g().compareTo(range.f30120b) > 0) {
                if (rangeMapEntry.g().compareTo(range.f30121c) > 0) {
                    g(range.f30121c, rangeMapEntry.g(), ((RangeMapEntry) entryLowerEntry.getValue()).getValue());
                }
                g(rangeMapEntry.d(), range.f30120b, ((RangeMapEntry) entryLowerEntry.getValue()).getValue());
            }
        }
        Map.Entry entryLowerEntry2 = this.f30360b.lowerEntry(range.f30121c);
        if (entryLowerEntry2 != null) {
            RangeMapEntry rangeMapEntry2 = (RangeMapEntry) entryLowerEntry2.getValue();
            if (rangeMapEntry2.g().compareTo(range.f30121c) > 0) {
                g(range.f30121c, rangeMapEntry2.g(), ((RangeMapEntry) entryLowerEntry2.getValue()).getValue());
            }
        }
        this.f30360b.subMap(range.f30120b, range.f30121c).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        Map.Entry entryFirstEntry = this.f30360b.firstEntry();
        Map.Entry entryLastEntry = this.f30360b.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.b(((RangeMapEntry) entryFirstEntry.getValue()).getKey().f30120b, ((RangeMapEntry) entryLastEntry.getValue()).getKey().f30121c);
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
        return range.equals(Range.all()) ? this : new SubRangeMap(range);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return this.f30360b.values().toString();
    }
}
