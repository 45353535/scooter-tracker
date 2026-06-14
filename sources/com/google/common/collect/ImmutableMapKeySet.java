package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableMap f29595d;

    @GwtIncompatible
    @J2ktIncompatible
    private static class KeySetSerializedForm<K> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap f29596b;

        KeySetSerializedForm(ImmutableMap immutableMap) {
            this.f29596b = immutableMap;
        }

        Object readResolve() {
            return this.f29596b.keySet();
        }
    }

    ImmutableMapKeySet(ImmutableMap immutableMap) {
        this.f29595d = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f29595d.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    Object get(int i10) {
        return this.f29595d.entrySet().asList().get(i10).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f29595d.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new KeySetSerializedForm(this.f29595d);
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<K> iterator() {
        return this.f29595d.l();
    }
}
