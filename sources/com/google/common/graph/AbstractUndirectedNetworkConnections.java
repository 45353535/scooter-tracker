package com.google.common.graph;

import com.google.common.base.Preconditions;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractUndirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f30567a;

    AbstractUndirectedNetworkConnections(Map map) {
        this.f30567a = (Map) Preconditions.checkNotNull(map);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z10) {
        if (z10) {
            return;
        }
        addOutEdge(e10, n10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        Preconditions.checkState(this.f30567a.put(e10, n10) == null);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e10) {
        N n10 = (N) this.f30567a.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return DesugarCollections.unmodifiableSet(this.f30567a.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return incidentEdges();
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> predecessors() {
        return adjacentNodes();
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z10) {
        if (z10) {
            return null;
        }
        return removeOutEdge(e10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N n10 = (N) this.f30567a.remove(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> successors() {
        return adjacentNodes();
    }
}
