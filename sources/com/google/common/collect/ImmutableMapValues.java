package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableMap f29597c;

    @GwtIncompatible
    @J2ktIncompatible
    private static class SerializedForm<V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap f29602b;

        SerializedForm(ImmutableMap immutableMap) {
            this.f29602b = immutableMap;
        }

        Object readResolve() {
            return this.f29602b.values();
        }
    }

    ImmutableMapValues(ImmutableMap immutableMap) {
        this.f29597c = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> immutableListAsList = this.f29597c.entrySet().asList();
        return new ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ImmutableMapValues f29601e;

            {
                this.f29601e = this;
            }

            @Override // java.util.List
            public V get(int i10) {
                return (V) ((Map.Entry) immutableListAsList.get(i10)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return immutableListAsList.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f29597c.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(this.f29597c);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<V> iterator() {
        return new UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMapValues.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final UnmodifiableIterator f29598b;

            {
                this.f29598b = ImmutableMapValues.this.f29597c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29598b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return (V) ((Map.Entry) this.f29598b.next()).getValue();
            }
        };
    }
}
