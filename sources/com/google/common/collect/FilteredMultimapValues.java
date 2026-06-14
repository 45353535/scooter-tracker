package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FilteredMultimap f29485b;

    FilteredMultimapValues(FilteredMultimap filteredMultimap) {
        this.f29485b = (FilteredMultimap) Preconditions.checkNotNull(filteredMultimap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f29485b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f29485b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return Maps.R(this.f29485b.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        Predicate<? super Map.Entry<K, V>> predicateEntryPredicate = this.f29485b.entryPredicate();
        Iterator<Map.Entry<K, V>> it = this.f29485b.unfiltered().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (predicateEntryPredicate.apply(next) && Objects.equal(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return Iterables.removeIf(this.f29485b.unfiltered().entries(), Predicates.and(this.f29485b.entryPredicate(), Maps.T(Predicates.in(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return Iterables.removeIf(this.f29485b.unfiltered().entries(), Predicates.and(this.f29485b.entryPredicate(), Maps.T(Predicates.not(Predicates.in(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f29485b.size();
    }
}
