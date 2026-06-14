package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Multimap f29479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Predicate f29480h;

    static class AddRejectingList<K, V> extends ForwardingList<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29481b;

        AddRejectingList(Object obj) {
            this.f29481b = obj;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness V v10) {
            add(0, v10);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection
        public List n() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i10, @ParametricNullness V v10) {
            Preconditions.checkPositionIndex(i10, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f29481b);
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        @CanIgnoreReturnValue
        public boolean addAll(int i10, Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i10, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f29481b);
        }
    }

    static class AddRejectingSet<K, V> extends ForwardingSet<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29482b;

        AddRejectingSet(Object obj) {
            this.f29482b = obj;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness V v10) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f29482b);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f29482b);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            return Collections.EMPTY_SET;
        }
    }

    class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        Entries() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Collection n() {
            return Collections2.filter(FilteredKeyMultimap.this.f29479g.entries(), FilteredKeyMultimap.this.entryPredicate());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (FilteredKeyMultimap.this.f29479g.containsKey(entry.getKey()) && FilteredKeyMultimap.this.f29480h.apply(entry.getKey())) {
                return FilteredKeyMultimap.this.f29479g.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    FilteredKeyMultimap(Multimap multimap, Predicate predicate) {
        this.f29479g = (Multimap) Preconditions.checkNotNull(multimap);
        this.f29480h = (Predicate) Preconditions.checkNotNull(predicate);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        if (this.f29479g.containsKey(obj)) {
            return this.f29480h.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map d() {
        return Maps.filterKeys(this.f29479g.asMap(), this.f29480h);
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Predicate<? super Map.Entry<K, V>> entryPredicate() {
        return Maps.y(this.f29480h);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection g() {
        return new Entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k10) {
        return this.f29480h.apply(k10) ? this.f29479g.get(k10) : this.f29479g instanceof SetMultimap ? new AddRejectingSet(k10) : new AddRejectingList(k10);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set h() {
        return Sets.filter(this.f29479g.keySet(), this.f29480h);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset i() {
        return Multisets.filter(this.f29479g.keys(), this.f29480h);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection j() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator k() {
        throw new AssertionError("should never be called");
    }

    Collection m() {
        return this.f29479g instanceof SetMultimap ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        return containsKey(obj) ? this.f29479g.removeAll(obj) : m();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public Multimap<K, V> unfiltered() {
        return this.f29479g;
    }
}
