package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f30237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Supplier f30238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Set f30239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Map f30240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient ColumnMap f30241h;

    private class CellIterator implements Iterator<Table.Cell<R, C, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator f30242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map.Entry f30243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Iterator f30244d;

        private CellIterator() {
            this.f30242b = StandardTable.this.f30237d.entrySet().iterator();
            this.f30244d = Iterators.g();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30242b.hasNext() || this.f30244d.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f30244d.remove();
            Map.Entry entry = this.f30243c;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f30242b.remove();
                this.f30243c = null;
            }
        }

        @Override // java.util.Iterator
        public Table.Cell<R, C, V> next() {
            if (!this.f30244d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f30242b.next();
                this.f30243c = entry;
                this.f30244d = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f30243c);
            Map.Entry entry2 = (Map.Entry) this.f30244d.next();
            return Tables.immutableCell(this.f30243c.getKey(), entry2.getKey(), entry2.getValue());
        }
    }

    private class Column extends Maps.ViewCachingAbstractMap<R, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Object f30246e;

        private class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            private EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                Column.this.b(Predicates.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.m(entry.getKey(), Column.this.f30246e, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                Column column = Column.this;
                return !StandardTable.this.containsColumn(column.f30246e);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new EntrySetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.s(entry.getKey(), Column.this.f30246e, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return Column.this.b(Predicates.not(Predicates.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<V> it = StandardTable.this.f30237d.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (((Map) it.next()).containsKey(Column.this.f30246e)) {
                        i10++;
                    }
                }
                return i10;
            }
        }

        private class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final Iterator f30249d;

            private EntrySetIterator() {
                this.f30249d = StandardTable.this.f30237d.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry computeNext() {
                while (this.f30249d.hasNext()) {
                    final Map.Entry entry = (Map.Entry) this.f30249d.next();
                    if (((Map) entry.getValue()).containsKey(Column.this.f30246e)) {
                        return new AbstractMapEntry<R, V>(this) { // from class: com.google.common.collect.StandardTable.Column.EntrySetIterator.1EntryImpl

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ EntrySetIterator f30252c;

                            {
                                this.f30252c = this;
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public R getKey() {
                                return (R) entry.getKey();
                            }

                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V getValue() {
                                return (V) ((Map) entry.getValue()).get(Column.this.f30246e);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                            public V setValue(V v10) {
                                return (V) NullnessCasts.a(((Map) entry.getValue()).put(Column.this.f30246e, Preconditions.checkNotNull(v10)));
                            }
                        };
                    }
                }
                return (Map.Entry) a();
            }
        }

        private class KeySet extends Maps.KeySet<R, V> {
            KeySet() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                Column column = Column.this;
                return StandardTable.this.contains(obj, column.f30246e);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                Column column = Column.this;
                return StandardTable.this.remove(obj, column.f30246e) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return Column.this.b(Maps.y(Predicates.not(Predicates.in(collection))));
            }
        }

        private class Values extends Maps.Values<R, V> {
            Values() {
                super(Column.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && Column.this.b(Maps.T(Predicates.equalTo(obj)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return Column.this.b(Maps.T(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return Column.this.b(Maps.T(Predicates.not(Predicates.in(collection))));
            }
        }

        Column(Object obj) {
            this.f30246e = Preconditions.checkNotNull(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection a() {
            return new Values();
        }

        boolean b(Predicate predicate) {
            Iterator it = StandardTable.this.f30237d.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Map map = (Map) entry.getValue();
                Object obj = map.get(this.f30246e);
                if (obj != null && predicate.apply(Maps.immutableEntry(entry.getKey(), obj))) {
                    map.remove(this.f30246e);
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.f30246e);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createEntrySet() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createKeySet() {
            return new KeySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) StandardTable.this.get(obj, this.f30246e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r10, V v10) {
            return (V) StandardTable.this.put(r10, this.f30246e, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) StandardTable.this.remove(obj, this.f30246e);
        }
    }

    private class ColumnKeyIterator extends AbstractIterator<C> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map f30255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Iterator f30256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Iterator f30257f;

        private ColumnKeyIterator() {
            this.f30255d = (Map) StandardTable.this.f30238e.get();
            this.f30256e = StandardTable.this.f30237d.values().iterator();
            this.f30257f = Iterators.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractIterator
        protected Object computeNext() {
            while (true) {
                if (this.f30257f.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f30257f.next();
                    if (!this.f30255d.containsKey(entry.getKey())) {
                        this.f30255d.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else {
                    if (!this.f30256e.hasNext()) {
                        return a();
                    }
                    this.f30257f = ((Map) this.f30256e.next()).entrySet().iterator();
                }
            }
        }
    }

    private class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        private ColumnKeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return StandardTable.this.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z10 = false;
            if (obj == null) {
                return false;
            }
            Iterator<V> it = StandardTable.this.f30237d.values().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().remove(obj)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<V> it = StandardTable.this.f30237d.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (Iterators.removeAll(map.keySet().iterator(), collection)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<V> it = StandardTable.this.f30237d.values().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().retainAll(collection)) {
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.size(iterator());
        }
    }

    private class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {

        private final class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            private ColumnMapEntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = ColumnMap.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.i(StandardTable.this.columnKeySet(), new Function<C, Map<R, V>>() { // from class: com.google.common.collect.StandardTable.ColumnMap.ColumnMapEntrySet.1
                    @Override // com.google.common.base.Function
                    public Map<R, V> apply(C c10) {
                        return StandardTable.this.column(c10);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.this.r(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Sets.e(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z10 = false;
                for (Object obj : Lists.newArrayList(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(Maps.immutableEntry(obj, StandardTable.this.column(obj)))) {
                        StandardTable.this.r(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.columnKeySet().size();
            }
        }

        private class ColumnMapValues extends Maps.Values<C, Map<R, V>> {
            ColumnMapValues() {
                super(ColumnMap.this);
            }

            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : ColumnMap.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.r(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z10 = false;
                for (Object obj : Lists.newArrayList(StandardTable.this.columnKeySet().iterator())) {
                    if (collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.r(obj);
                        z10 = true;
                    }
                }
                return z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z10 = false;
                for (Object obj : Lists.newArrayList(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.r(obj);
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        private ColumnMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection a() {
            return new ColumnMapValues();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new ColumnMapEntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
            return StandardTable.this.columnKeySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> get(Object obj) {
            if (!StandardTable.this.containsColumn(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.column(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<R, V> remove(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.r(obj);
            }
            return null;
        }
    }

    class Row extends Maps.IteratorBasedAbstractMap<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f30264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map f30265c;

        Row(Object obj) {
            this.f30264b = Preconditions.checkNotNull(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            d();
            Map map = this.f30265c;
            if (map == null) {
                return Iterators.g();
            }
            final Iterator it = map.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>(this) { // from class: com.google.common.collect.StandardTable.Row.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Row f30268c;

                {
                    this.f30268c = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    it.remove();
                    this.f30268c.c();
                }

                @Override // java.util.Iterator
                public Map.Entry<C, V> next() {
                    return this.f30268c.e((Map.Entry) it.next());
                }
            };
        }

        Map b() {
            return (Map) StandardTable.this.f30237d.get(this.f30264b);
        }

        void c() {
            d();
            Map map = this.f30265c;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.f30237d.remove(this.f30264b);
            this.f30265c = null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            d();
            Map map = this.f30265c;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            d();
            return (obj == null || (map = this.f30265c) == null || !Maps.F(map, obj)) ? false : true;
        }

        final void d() {
            Map map = this.f30265c;
            if (map == null || (map.isEmpty() && StandardTable.this.f30237d.containsKey(this.f30264b))) {
                this.f30265c = b();
            }
        }

        Map.Entry e(final Map.Entry entry) {
            return new ForwardingMapEntry<C, V>(this) { // from class: com.google.common.collect.StandardTable.Row.2

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Row f30270c;

                {
                    this.f30270c = this;
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public boolean equals(Object obj) {
                    return standardEquals(obj);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                /* JADX INFO: renamed from: g */
                public Map.Entry n() {
                    return entry;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public V setValue(V v10) {
                    return (V) super.setValue(Preconditions.checkNotNull(v10));
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map map;
            d();
            if (obj == null || (map = this.f30265c) == null) {
                return null;
            }
            return (V) Maps.G(map, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c10, V v10) {
            Preconditions.checkNotNull(c10);
            Preconditions.checkNotNull(v10);
            Map map = this.f30265c;
            return (map == null || map.isEmpty()) ? (V) StandardTable.this.put(this.f30264b, c10, v10) : (V) this.f30265c.put(c10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            d();
            Map map = this.f30265c;
            if (map == null) {
                return null;
            }
            V v10 = (V) Maps.H(map, obj);
            c();
            return v10;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            d();
            Map map = this.f30265c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {

        private final class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            private EntrySet() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.f(StandardTable.this.f30237d.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.i(StandardTable.this.f30237d.keySet(), new Function<R, Map<C, V>>() { // from class: com.google.common.collect.StandardTable.RowMap.EntrySet.1
                    @Override // com.google.common.base.Function
                    public Map<C, V> apply(R r10) {
                        return StandardTable.this.row(r10);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.f30237d.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.f30237d.size();
            }
        }

        RowMap() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> get(Object obj) {
            if (!StandardTable.this.containsRow(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.row(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return (Map) StandardTable.this.f30237d.remove(obj);
        }
    }

    private abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        private TableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.f30237d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.f30237d.isEmpty();
        }
    }

    StandardTable(Map map, Supplier supplier) {
        this.f30237d = map;
        this.f30238e = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map q(Object obj) {
        Map map = (Map) this.f30237d.get(obj);
        if (map != null) {
            return map;
        }
        Map map2 = (Map) this.f30238e.get();
        this.f30237d.put(obj, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Map r(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f30237d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object objRemove = ((Map) entry.getValue()).remove(obj);
            if (objRemove != null) {
                linkedHashMap.put(entry.getKey(), objRemove);
                if (((Map) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(Object obj, Object obj2, Object obj3) {
        if (!m(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
        this.f30237d.clear();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c10) {
        return new Column(c10);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<C> columnKeySet() {
        Set<C> set = this.f30239f;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet = new ColumnKeySet();
        this.f30239f = columnKeySet;
        return columnKeySet;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ColumnMap columnMap = this.f30241h;
        if (columnMap != null) {
            return columnMap;
        }
        ColumnMap columnMap2 = new ColumnMap();
        this.f30241h = columnMap2;
        return columnMap2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<V> it = this.f30237d.values().iterator();
        while (it.hasNext()) {
            if (Maps.F((Map) it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return obj != null && Maps.F(this.f30237d, obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator d() {
        return new CellIterator();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.f30237d.isEmpty();
    }

    Iterator n() {
        return new ColumnKeyIterator();
    }

    Map o() {
        return new RowMap();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r10, C c10, V v10) {
        Preconditions.checkNotNull(r10);
        Preconditions.checkNotNull(c10);
        Preconditions.checkNotNull(v10);
        return (V) q(r10).put(c10, v10);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.G(this.f30237d, obj)) == null) {
            return null;
        }
        V v10 = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.f30237d.remove(obj);
        }
        return v10;
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r10) {
        return new Row(r10);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.f30240g;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapO = o();
        this.f30240g = mapO;
        return mapO;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<V> it = this.f30237d.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((Map) it.next()).size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }
}
