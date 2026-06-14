package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f30553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f30554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30555c;

    AbstractDirectedNetworkConnections(Map map, Map map2, int i10) {
        this.f30553a = (Map) Preconditions.checkNotNull(map);
        this.f30554b = (Map) Preconditions.checkNotNull(map2);
        this.f30555c = Graphs.b(i10);
        Preconditions.checkState(i10 <= map.size() && i10 <= map2.size());
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z10) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        if (z10) {
            int i10 = this.f30555c + 1;
            this.f30555c = i10;
            Graphs.d(i10);
        }
        Preconditions.checkState(this.f30553a.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        Preconditions.checkState(this.f30554b.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e10) {
        N n10 = (N) this.f30554b.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return DesugarCollections.unmodifiableSet(this.f30553a.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractDirectedNetworkConnections.this.f30553a.containsKey(obj) || AbstractDirectedNetworkConnections.this.f30554b.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.f30553a.size(), AbstractDirectedNetworkConnections.this.f30554b.size() - AbstractDirectedNetworkConnections.this.f30555c);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return Iterators.unmodifiableIterator((AbstractDirectedNetworkConnections.this.f30555c == 0 ? Iterables.concat(AbstractDirectedNetworkConnections.this.f30553a.keySet(), AbstractDirectedNetworkConnections.this.f30554b.keySet()) : Sets.union(AbstractDirectedNetworkConnections.this.f30553a.keySet(), AbstractDirectedNetworkConnections.this.f30554b.keySet())).iterator());
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return DesugarCollections.unmodifiableSet(this.f30554b.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z10) {
        if (z10) {
            int i10 = this.f30555c - 1;
            this.f30555c = i10;
            Graphs.b(i10);
        }
        N n10 = (N) this.f30553a.remove(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N n10 = (N) this.f30554b.remove(e10);
        Objects.requireNonNull(n10);
        return n10;
    }
}
