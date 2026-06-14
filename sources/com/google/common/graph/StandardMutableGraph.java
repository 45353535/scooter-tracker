package com.google.common.graph;

import com.google.common.graph.GraphConstants;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableGraph<N> extends ForwardingGraph<N> implements MutableGraph<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableValueGraph f30643a;

    StandardMutableGraph(AbstractGraphBuilder abstractGraphBuilder) {
        this.f30643a = new StandardMutableValueGraph(abstractGraphBuilder);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean addNode(N n10) {
        return this.f30643a.addNode(n10);
    }

    @Override // com.google.common.graph.ForwardingGraph
    BaseGraph g() {
        return this.f30643a;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(N n10, N n11) {
        return this.f30643a.putEdgeValue(n10, n11, GraphConstants.Presence.EDGE_EXISTS) == null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(N n10, N n11) {
        return this.f30643a.removeEdge(n10, n11) != null;
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeNode(N n10) {
        return this.f30643a.removeNode(n10);
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean putEdge(EndpointPair<N> endpointPair) {
        f(endpointPair);
        return putEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableGraph
    public boolean removeEdge(EndpointPair<N> endpointPair) {
        f(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
